package com.wenzhan.zwz.time.port.adapter.http;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.wenzhan.zwz.time.dto.ResultModel;
import com.wenzhan.zwz.time.dto.WxAuthResult;
import com.wenzhan.zwz.time.port.adapter.redis.RedisCache;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by zhengwenzhan on 2019-08-20
 */
@Controller
public class LoginController {

    @Resource
    private RedisCache redisCache;

    private OkHttpClient okHttpClient = new OkHttpClient();

    private Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResultModel<String> login(@RequestParam String code) throws IOException {
        ResultModel<String> rm = new ResultModel<>();

        Response response = okHttpClient.newCall(buildRequest(code)).execute();

        String result = response.body().string();

        WxAuthResult wxAuthResult = gson.fromJson(result, WxAuthResult.class);

        String md5SessionKey = DigestUtils.md5DigestAsHex(wxAuthResult.getSessionKey().getBytes()).toLowerCase();

        redisCache.set(md5SessionKey, wxAuthResult.getSessionKey() + "_" + wxAuthResult.getOpenid());

        rm.success(md5SessionKey);
        return rm;
    }

    private Request buildRequest(String code) {
        String appId = "wx46b12081ed1beabf";
        String appSecret = "f573f8405ae9985e4beddbdefaec25fd";

        Request request = new Request.Builder().url("https://api.weixin.qq.com/sns/jscode2session?appid=" + appId +
                "&secret=" + appSecret + "&js_code=" + code + "&grant_type=" + "authorization_code").build();

        return request;

    }
}
