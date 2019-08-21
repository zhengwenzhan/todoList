package com.wenzhan.zwz.time.domain.model;

/**
 * Created by zhengwenzhan on 2019-08-13
 */
public enum ItemTypeEnum {

    IMPORTANT_URGENT("重要紧急"), IMPORTANT_NOT_URGENT("重要不紧急"),
    URGENT_NOT_IMPORTANT("紧急不重要"), NOT_URGENT_NOT_IMPORTANT("不紧急不重要");

    private String desc;

    ItemTypeEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
