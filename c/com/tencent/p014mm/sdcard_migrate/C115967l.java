package com.tencent.p014mm.sdcard_migrate;

/* renamed from: com.tencent.mm.sdcard_migrate.l */
public class C115967l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f347900d;

    /* renamed from: e */
    public final /* synthetic */ int f347901e;

    /* renamed from: f */
    public final /* synthetic */ MigrateResultCallback f347902f;

    public C115967l(MigrateResultCallback migrateResultCallback, int i, int i2) {
        this.f347902f = migrateResultCallback;
        this.f347900d = i;
        this.f347901e = i2;
    }

    public void run() {
        this.f347902f.mo176468a(this.f347900d, this.f347901e);
    }
}
