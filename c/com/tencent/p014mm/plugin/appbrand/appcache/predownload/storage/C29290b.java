package com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage;

import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.b */
public final class C29290b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<String> f79990d;

    /* renamed from: e */
    public final /* synthetic */ WxaSyncCmdPersistentStorage f79991e;

    public C29290b(List<String> list, WxaSyncCmdPersistentStorage wxaSyncCmdPersistentStorage) {
        this.f79990d = list;
        this.f79991e = wxaSyncCmdPersistentStorage;
    }

    public final void run() {
        List<String> list = this.f79990d;
        WxaSyncCmdPersistentStorage wxaSyncCmdPersistentStorage = this.f79991e;
        for (String str : list) {
            if (!(str == null || str.length() == 0)) {
                wxaSyncCmdPersistentStorage.mo56571d(str);
            }
        }
    }
}
