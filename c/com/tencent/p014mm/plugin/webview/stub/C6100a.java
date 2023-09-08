package com.tencent.p014mm.plugin.webview.stub;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9512b;

/* renamed from: com.tencent.mm.plugin.webview.stub.a */
public class C6100a {
    /* renamed from: a */
    public static final boolean m5974a(Context context) {
        try {
            PackageInfo a = C9512b.m9207a(context, "com.tencent.mobileqq");
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(a != null);
            Log.m105919d("MicroMsg.ConstantsWebViewStub", "isQQSupportShare(%s).", objArr);
            return a != null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", e.getMessage());
        }
    }
}
