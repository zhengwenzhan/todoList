package com.wenzhan.zwz.time.port.adapter.redis;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * Created by zhengwenzhan on 2019-08-20
 */
@Component
public class RedisCache implements InitializingBean {
    private Jedis jedis;

    @Override
    public void afterPropertiesSet() {
        jedis = new Jedis("localhost");
    }

    public void set(String key, String value) {
        jedis.set(key, value);
    }

    public String get(String key) {
        return jedis.get(key);
    }
}
