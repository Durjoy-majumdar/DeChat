package com.tencent.p014mm.sdcard_migrate;

/* renamed from: com.tencent.mm.sdcard_migrate.i */
public class C115964i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f347895d;

    /* renamed from: e */
    public final /* synthetic */ MigrateResultCallback f347896e;

    public C115964i(MigrateResultCallback migrateResultCallback, int i) {
        this.f347896e = migrateResultCallback;
        this.f347895d = i;
    }

    public void run() {
        this.f347896e.mo176469c(this.f347895d);
    }
}
