package c92;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.security.MessageDigest;
import k20.C9556a;
import ke3.C88144b;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import p763ym.C79138l;

/* renamed from: c92.d */
public class C39929d {

    /* renamed from: a */
    public static final String f107065a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fly) + "/mobile/wx-entry.html#/?scene=");

    /* renamed from: b */
    public static final String f107066b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmr) + "/nl/meeting_intro_wxwork?scene=");

    /* renamed from: a */
    public static boolean m42703a(String str, String str2) {
        boolean z;
        String str3;
        try {
            PackageInfo packageInfo = MMApplicationContext.getContext().getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                byte[] byteArray = packageInfo.signatures[0].toByteArray();
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                byte[] digest = instance.digest();
                if (digest == null) {
                    str3 = null;
                } else {
                    StringBuffer stringBuffer = new StringBuffer(digest.length);
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & ExifInterface.MARKER);
                        if (hexString.length() < 2) {
                            stringBuffer.append(0);
                        }
                        stringBuffer.append(hexString.toLowerCase());
                    }
                    str3 = stringBuffer.toString();
                }
                if (Util.isEqual(str3, str2.toUpperCase()) || Util.isEqual(str3, str2.toLowerCase())) {
                    z = true;
                    Log.m105925i("MicroMsg.MeetingLinkHelper", "checkPackageInstalled result:%s", Boolean.valueOf(z));
                    return z;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "checkPackageInstalled Exception: %s", e.getMessage());
        }
        z = false;
        Log.m105925i("MicroMsg.MeetingLinkHelper", "checkPackageInstalled result:%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: b */
    public static String m42704b() {
        String g = m42709g();
        if (Util.isNullOrNil(g)) {
            return null;
        }
        try {
            return new C104289g(g).optString("banner_content");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getConfigBannerContentWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static String m42705c() {
        String g = m42709g();
        if (Util.isNullOrNil(g)) {
            return null;
        }
        try {
            return new C104289g(g).optString("banner_title");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getConfigBannerTitleWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static String m42706d() {
        String g = m42709g();
        if (Util.isNullOrNil(g)) {
            return null;
        }
        try {
            return new C104289g(g).optString("dialog");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getConfigDialogContentWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public static String m42707e() {
        String g = m42709g();
        if (Util.isNullOrNil(g)) {
            return null;
        }
        try {
            return new C104289g(g).optString("dialog_goto");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getConfigDialogGotoWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    public static C104289g m42708f() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_multitalk_ad_extraconfig1, "");
        if (Util.isNullOrNil(Y60)) {
            return null;
        }
        try {
            return new C104289g(Y60);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getConfigExtraInfoJsonObject error", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public static String m42709g() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_multitalk_ad_wording1, "");
        if (Util.isNullOrNil(Y60)) {
            return null;
        }
        try {
            C104289g gVar = new C104289g(Y60);
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            Log.m105925i("MicroMsg.MeetingLinkHelper", "getLocalConfigWording, langCode:%s", applicationLanguage);
            return gVar.optString(applicationLanguage);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e, "getLocalConfigWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public static String m42710h() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_multitalk_ad_url1, "");
        return Util.isNullOrNil(Y60) ? m42714l() ? f107065a : m42716n() ? f107066b : Y60 : Y60;
    }

    /* renamed from: i */
    public static int m42711i() {
        if (m42714l()) {
            return 1;
        }
        if (m42716n()) {
            return 2;
        }
        return m42715m() ? 3 : 0;
    }

    /* renamed from: j */
    public static void m42712j(Context context, String str) {
        boolean z;
        Context context2 = context;
        String str2 = str;
        Log.m105925i("MicroMsg.MeetingLinkHelper", "handleMeetingLinkClick, isAllowedToShowMeetingLink:%s, isAllowedToShowWorkWeChat:%s", Boolean.valueOf(m42714l()), Boolean.valueOf(m42716n()));
        if (m42713k()) {
            String str3 = null;
            if (m42714l()) {
                z = m42703a("com.tencent.wemeet.app", "EF1B5A11844923BB7515E6F6AFCBC45F");
                Log.m105925i("MicroMsg.MeetingLinkHelper", "check meetting install result::%s", Boolean.valueOf(z));
            } else if (m42716n()) {
                z = m42703a("com.tencent.wework", "011a40266c8c75d181ddd8e4ddc50075");
                Log.m105925i("MicroMsg.MeetingLinkHelper", "check wework install result:%s", Boolean.valueOf(z));
            } else {
                if (m42715m()) {
                    C104289g f = m42708f();
                    String optString = f != null ? f.optString("package_name") : null;
                    C104289g f2 = m42708f();
                    String optString2 = f2 != null ? f2.optString("md5") : null;
                    Log.m105925i("MicroMsg.MeetingLinkHelper", "other app, packageName:%s, md5:%s", optString, optString2);
                    if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
                        z = m42703a(optString, optString2);
                        Log.m105925i("MicroMsg.MeetingLinkHelper", "check wework install result:%s", Boolean.valueOf(z));
                    }
                }
                z = false;
            }
            int i = m42711i();
            if (!z) {
                Object obj = "list";
                int i2 = i;
                C39930e.m42720c(i, 0, 0, 0, str2.equals("list") ? 2 : 1, 0, 0, 0, 0, m42710h(), 0);
                Log.m105924i("MicroMsg.MeetingLinkHelper", "not installed, jump download url, ");
                String str4 = m42710h() + str2;
                Log.m105925i("MicroMsg.MeetingLinkHelper", "not installed, jump download url:%s", str4);
                if (m42716n()) {
                    C10770c cVar = new C10770c(context2);
                    cVar.f32244b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
                    ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str4);
                try {
                    C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                } catch (Exception unused) {
                    C39930e.m42720c(i2, 0, 0, 0, 0, str2.equals(obj) ? 2 : 1, 0, 0, 0, m42710h(), 0);
                }
            } else {
                Object obj2 = "list";
                int i3 = i;
                Log.m105924i("MicroMsg.MeetingLinkHelper", "already installed, jump app");
                if (m42714l()) {
                    if (m42717o(context2, "com.tencent.wemeet.app", "wemeet://launch?referer=wechat&from=" + str2, str2.equals(obj2))) {
                        C39930e.m42718a(i3, str2.equals(obj2));
                    } else {
                        C39930e.m42719b(i3, str2.equals(obj2));
                    }
                } else if (m42716n()) {
                    if (m42717o(context2, "com.tencent.wework", "wxwork://jump?target=jump_to_third_app&businessid=10085&src=wx&scene=" + str2, str2.equals(obj2))) {
                        C39930e.m42718a(i3, str2.equals(obj2));
                    } else {
                        C39930e.m42719b(i3, str2.equals(obj2));
                    }
                } else if (m42715m()) {
                    C104289g f3 = m42708f();
                    String optString3 = f3 != null ? f3.optString("package_name") : null;
                    C104289g f4 = m42708f();
                    if (f4 != null) {
                        str3 = f4.optString("schema");
                    }
                    if (!Util.isNullOrNil(optString3) && !Util.isNullOrNil(str3)) {
                        if (m42717o(context2, optString3, str3 + str2, str2.equals(obj2))) {
                            C39930e.m42718a(i3, str2.equals(obj2));
                        } else {
                            C39930e.m42719b(i3, str2.equals(obj2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static boolean m42713k() {
        return m42714l() || m42716n() || m42715m();
    }

    /* renamed from: l */
    public static boolean m42714l() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_ad_type1, 0) == 1;
    }

    /* renamed from: m */
    public static boolean m42715m() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_ad_type1, 0) == 3;
    }

    /* renamed from: n */
    public static boolean m42716n() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_ad_type1, 0) == 2;
    }

    /* renamed from: o */
    public static boolean m42717o(Context context, String str, String str2, boolean z) {
        String str3;
        Log.m105925i("MicroMsg.MeetingLinkHelper", "jumpApp, packageName:%s, schema:%s", str, str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str2));
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (context instanceof Activity) {
            if (z) {
                try {
                    C79138l lVar = (C79138l) C86312j.m106911c(C79138l.class);
                    PackageManager packageManager = context.getPackageManager();
                    try {
                        str3 = packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                        str3 = null;
                    }
                    return lVar.mo74000Sy(context, intent, str3);
                } catch (Exception unused2) {
                    return false;
                }
            } else {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/utils/MeetingLinkHelper", "jumpApp", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/multitalk/utils/MeetingLinkHelper", "jumpApp", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2492eg, -1);
            }
        }
        return true;
    }
}
