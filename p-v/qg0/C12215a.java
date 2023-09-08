package qg0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: qg0.a */
public class C12215a {

    /* renamed from: qg0.a$a */
    public enum C12216a {
        TwoPasswordsNotMatch,
        BeyondMaximumLength,
        NotReachMinimumLength,
        DisallowShortNumericPassword
    }

    /* renamed from: a */
    public static boolean m11776a(Context context, String str) {
        if (str.length() > 16) {
            m11779d(context, C12216a.BeyondMaximumLength);
            return false;
        } else if (Util.isChinese(str)) {
            C76879j.m92738i(context, C0966R.string.hwn, C0966R.string.hxn);
            return false;
        } else if (Util.isValidPassword(str)) {
            return true;
        } else {
            if (str.length() < 8 || str.length() >= 16) {
                m11779d(context, C12216a.NotReachMinimumLength);
            } else {
                m11779d(context, C12216a.DisallowShortNumericPassword);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static void m11777b(Context context, String str, int i, boolean z, int i2) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("KHalfScreenHeight", i2);
        intent.putExtra("KHalfScreenHeightPercent", -1.0f);
        if (i > 0) {
            C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: c */
    public static void m11778c(Context context, String str, int i, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        if (i > 0) {
            C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: d */
    public static void m11779d(Context context, C12216a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92738i(context, C0966R.string.hxl, C0966R.string.hxn);
        } else if (ordinal == 1) {
            C76879j.m92738i(context, C0966R.string.hxm, C0966R.string.hxn);
        } else if (ordinal == 2) {
            C76879j.m92738i(context, C0966R.string.k_1, C0966R.string.f7964xo);
        } else if (ordinal == 3) {
            C76879j.m92738i(context, C0966R.string.k9y, C0966R.string.f7964xo);
        }
    }
}
