package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Locale;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.appbrand.p2 */
public enum C83727p2 {
    ;
    

    /* renamed from: d */
    public static final String f244372d = null;

    /* renamed from: e */
    public static final String f244373e = null;

    /* renamed from: f */
    public static final String f244374f = null;

    /* renamed from: g */
    public static final String f244375g = null;

    /* access modifiers changed from: public */
    static {
        f244372d = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/wxawap/wapreportwxadevlog?action=complain_feedback&appid=%s&embeddedappid=%s&hostappid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d&screenshot_localId=%s&sessionid=%s&business_appid=%s&msgid=%s&public_lib_version=%s&public_lib_version_str=%s#wechat_redirect";
        f244373e = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect";
        f244374f = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/waverifyinfo?action=get&appid=%s#wechat_redirect";
        f244375g = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect";
    }

    /* renamed from: a */
    public static String m102771a(String str, String str2) {
        URI uri = new URI(str);
        String query = uri.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    /* renamed from: b */
    public static String m102772b(WxaExposedParams wxaExposedParams) {
        if (wxaExposedParams == null || Util.isNullOrNil(wxaExposedParams.f239539d)) {
            Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl fail, null or nil appId");
            return "";
        }
        try {
            return String.format(f244372d, new Object[]{wxaExposedParams.f239539d, wxaExposedParams.f239540e, wxaExposedParams.f239541f, C117627q.m165909b(Util.nullAsNil(wxaExposedParams.f239549q), "UTF-8"), Integer.valueOf(wxaExposedParams.f239548p), Integer.valueOf(Util.nullAsInt(Integer.valueOf(wxaExposedParams.f239545j), -1)), Integer.valueOf(Util.nullAsInt(Integer.valueOf(wxaExposedParams.f239546n), -1)), C117627q.m165909b(Util.nullAsNil(wxaExposedParams.f239551s), "UTF-8"), Util.nullAsNil(wxaExposedParams.f239552t), C117627q.m165909b(Util.nullAsNil(wxaExposedParams.f239553u), "UTF-8"), C117627q.m165909b(Util.nullAsNil(wxaExposedParams.f239554v), "UTF-8"), Util.nullAsNil(wxaExposedParams.f239555w), C117627q.m165909b(Util.nullAsNil(wxaExposedParams.f239556x), "UTF-8")});
        } catch (UnsupportedEncodingException unused) {
            Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl encode fail, invalid arguments");
            return "";
        }
    }

    /* renamed from: c */
    public static String m102773c(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
            return "";
        }
        return String.format(Locale.US, f244375g, new Object[]{str, 3});
    }
}
