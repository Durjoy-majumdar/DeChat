package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KindaWebService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ex0.C45700h;
import f40.C86709a0;
import java.util.ArrayList;

public class KindaWebServiceImpl implements KindaWebService {
    private static final String TAG = "MicroMsg.KindaWebServiceImpl";

    public void preLoad(String str) {
        Log.m105924i(TAG, "preload Url:" + str);
        if (str.length() != 0) {
            C45700h.C45702b bVar = new C45700h.C45702b();
            bVar.f123504a = str;
            bVar.f123506c = WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            ((C45700h) C86709a0.m107533q(C45700h.class)).mo71031UP(arrayList);
        }
    }
}
