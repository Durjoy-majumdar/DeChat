package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.x */
public class C40571x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108970d;

    /* renamed from: e */
    public final /* synthetic */ String f108971e;

    public C40571x(String str, String str2) {
        this.f108970d = str;
        this.f108971e = str2;
    }

    public void run() {
        String str = this.f108970d;
        String str2 = this.f108971e;
        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback url:%s, localPath:%s", str, str2);
        List list = (List) ((HashMap) C84795y.f247224b).get(str);
        if (list == null || list.size() == 0) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback callbacks nil");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((C84795y.C40572a) list.get(i)).mo1966a(str2);
        }
        ((HashMap) C84795y.f247224b).remove(str);
    }
}
