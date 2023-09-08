package com.tencent.wechat.p326mm.biz;

/* renamed from: com.tencent.wechat.mm.biz.BizDataMigrate */
public class BizDataMigrate {
    private static BizDataMigrate instance = new BizDataMigrate();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    /* renamed from: com.tencent.wechat.mm.biz.BizDataMigrate$Callback */
    public interface Callback {
        void onDataMigrationEvent();
    }

    private BizDataMigrate() {
        jniCreateBizDataMigrate();
    }

    public static BizDataMigrate getInstance() {
        return instance;
    }

    private native void jniCreateBizDataMigrate();

    private native void jniSetCallback(Object obj);

    private native void jnidoDataMigration();

    public void doDataMigration() {
        jnidoDataMigration();
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
