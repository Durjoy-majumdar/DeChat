package com.tencent.p014mm.plugin.game.commlib.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.g */
public class C41874g {
    /* renamed from: a */
    public static void m45397a(Context context, String str, int i, boolean z, int i2, float f, String str2) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("KHalfScreenHeight", i2);
        intent.putExtra("KHalfScreenHeightPercent", f);
        if (!Util.isNullOrNil(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (i > 0) {
            C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: b */
    public static void m45398b(Context context, String str, int i, boolean z, String str2) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        if (!Util.isNullOrNil(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (i > 0) {
            C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
