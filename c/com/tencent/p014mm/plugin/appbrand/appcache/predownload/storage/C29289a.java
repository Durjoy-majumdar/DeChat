package com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.a */
public final class C29289a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaSyncCmdPersistentStorage f79988d;

    /* renamed from: e */
    public final /* synthetic */ String f79989e;

    public C29289a(WxaSyncCmdPersistentStorage wxaSyncCmdPersistentStorage, String str) {
        this.f79988d = wxaSyncCmdPersistentStorage;
        this.f79989e = str;
    }

    public final void run() {
        this.f79988d.mo56571d(this.f79989e);
    }
}
