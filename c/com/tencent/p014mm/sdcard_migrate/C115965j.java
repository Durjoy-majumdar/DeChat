package com.tencent.p014mm.sdcard_migrate;

/* renamed from: com.tencent.mm.sdcard_migrate.j */
public class C115965j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f347897d;

    /* renamed from: e */
    public final /* synthetic */ MigrateResultCallback f347898e;

    public C115965j(MigrateResultCallback migrateResultCallback, int i) {
        this.f347898e = migrateResultCallback;
        this.f347897d = i;
    }

    public void run() {
        this.f347898e.mo176471f(this.f347897d);
    }
}
