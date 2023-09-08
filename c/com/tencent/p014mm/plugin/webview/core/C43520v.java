package com.tencent.p014mm.plugin.webview.core;

import android.content.Context;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import ex0.C45700h;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import p248ug.C14184u0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import um0.C22655d;
import yc3.C38992a;

/* renamed from: com.tencent.mm.plugin.webview.core.v */
public final class C43520v implements C38992a {

    /* renamed from: a */
    public static final C43521b f117665a = new C43521b((C8480h) null);

    /* renamed from: b */
    public static final C13601g<Boolean> f117666b = C36568h.m40985a(C5855a.f22040d);

    /* renamed from: com.tencent.mm.plugin.webview.core.v$a */
    public static final class C5855a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C5855a f22040d = new C5855a();

        public C5855a() {
            super(0);
        }

        public Object invoke() {
            C43521b bVar = C43520v.f117665a;
            if (!C14184u0.m13519a()) {
                return Boolean.FALSE;
            }
            boolean z = true;
            if (C5857x.m5577a().getInt("disablewxjscodecache", -1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.v$b */
    public static final class C43521b {
        public C43521b(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo67810a() {
            return BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || (Log.getLogLevel() == 0 && WeChatEnvironment.hasDebugger());
        }

        /* renamed from: b */
        public final boolean mo67811b() {
            if (mo67810a()) {
                return true;
            }
            return C5857x.m5577a().getBoolean("webview_use_a8key_lite_header", false);
        }
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C43521b bVar = f117665a;
        if (!bVar.mo67810a()) {
            return false;
        }
        String str2 = null;
        Iterator a = strArr != null ? C32617c.m39769a(strArr) : null;
        if (a != null) {
            str2 = (String) ((C32616b) a).next();
        }
        if (!C87412m.m108589b(str2, "//webview")) {
            return false;
        }
        String lowerCase = ((String) ((C32616b) a).next()).toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        switch (lowerCase.hashCode()) {
            case -2001485438:
                if (!lowerCase.equals("debugmanifest") || strArr.length <= 2) {
                    return false;
                }
                if (C87412m.m108589b(strArr[2], "null")) {
                    C5857x.m5577a().remove("DebugManifest").apply();
                } else {
                    C5857x.m5577a().putString("DebugManifest", strArr[2]).apply();
                }
                return true;
            case -1938441725:
                if (!lowerCase.equals("opensnapoauth") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("openSnapOauth", Util.getInt(strArr[2], -1));
                return true;
            case -1825077803:
                if (!lowerCase.equals("debugpatch") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("debugPatchEnable", Util.getInt(strArr[2], -1));
                return true;
            case -1820984396:
                if (!lowerCase.equals("debugtoast") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("showDebugToast", Util.getInt(strArr[2], -1));
                return true;
            case -1379409117:
                if (!lowerCase.equals("disablewxjscodecache") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("disablewxjscodecache", Util.getInt(strArr[2], -1));
                return true;
            case -1354815177:
                if (!lowerCase.equals("commit") || strArr.length <= 2) {
                    return false;
                }
                String str3 = strArr[2];
                if (C87412m.m108589b(str3, APMidasPayAPI.ENV_TEST)) {
                    C5857x.m5577a().putBoolean("webview_page_commit_mock", true);
                    if (bVar.mo67810a()) {
                        C61926c.m72668M(new C5856w("commit mock enable"));
                        Log.m105924i("WebViewCommand", "commit mock enable");
                    }
                } else if (!C87412m.m108589b(str3, "reset")) {
                    return false;
                } else {
                    C5857x.m5577a().putBoolean("webview_page_commit_mock", false);
                    if (bVar.mo67810a()) {
                        C61926c.m72668M(new C5856w("commit mock reset"));
                        Log.m105924i("WebViewCommand", "commit mock reset");
                    }
                }
                return true;
            case -1269849018:
                if (!lowerCase.equals("clearwuid")) {
                    return false;
                }
                C30584q qVar = C30584q.f82375a;
                ((MultiProcessMMKV) ((C36570n) C30584q.f82378d).getValue()).removeValueForKey("AdWUID");
                return true;
            case -1102227849:
                if (!lowerCase.equals("debugcookie") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("debugCookie", Util.getInt(strArr[2], -1));
                return true;
            case -851227842:
                if (!lowerCase.equals("debugtransfer") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("debugTransfer", Util.getInt(strArr[2], -1));
                return true;
            case -630973766:
                if (!lowerCase.equals("opensdkopenfacedetect")) {
                    return false;
                }
                C5857x.m5577a().encode("OpenSdkOpenFaceDetect", Util.getInt(strArr[2], 1));
                C5857x.m5577a().apply();
                return true;
            case -318798133:
                if (!lowerCase.equals("preauth") || strArr.length <= 2) {
                    return false;
                }
                String str4 = strArr[2];
                C45700h.C45702b bVar2 = new C45700h.C45702b();
                bVar2.f123504a = str4;
                bVar2.f123506c = C22655d.CTRL_INDEX;
                bVar2.f123513j = 10001;
                CronetLogic.setUserCertVerify(true);
                C5857x.m5577a().putBoolean("webview_use_a8key_lite_header", true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar2);
                ((C45700h) C86709a0.m107533q(C45700h.class)).mo71031UP(arrayList);
                return true;
            case 1541692090:
                if (!lowerCase.equals("debugip") || strArr.length <= 2) {
                    return false;
                }
                if (C87412m.m108589b(strArr[2], "null")) {
                    C5857x.m5577a().remove("DebugLocalIP").apply();
                } else {
                    C5857x.m5577a().putString("DebugLocalIP", strArr[2]).apply();
                }
                return true;
            case 1836011748:
                if (!lowerCase.equals("forcesharecard") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("forcesharecard", Util.getInt(strArr[2], -1));
                return true;
            case 2045106293:
                if (!lowerCase.equals("prefetchpkg") || strArr.length <= 2) {
                    return false;
                }
                C5857x.m5577a().putInt("prefetchUsePkg", Util.getInt(strArr[2], -1));
                return true;
            case 2111305731:
                if (!lowerCase.equals("debugpatchinfo") || strArr.length <= 2) {
                    return false;
                }
                if (C87412m.m108589b(strArr[2], "null")) {
                    C5857x.m5577a().putString("debugPatchInfo", "");
                } else {
                    C5857x.m5577a().putString("debugPatchInfo", strArr[2]);
                }
                return true;
            default:
                return false;
        }
    }
}
