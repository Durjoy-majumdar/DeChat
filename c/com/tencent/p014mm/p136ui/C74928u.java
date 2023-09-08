package com.tencent.p014mm.p136ui;

import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;

/* renamed from: com.tencent.mm.ui.u */
public final class C74928u {

    /* renamed from: a */
    public static final String f220308a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "");

    /* renamed from: com.tencent.mm.ui.u$c */
    public interface C30866c {
    }

    /* renamed from: com.tencent.mm.ui.u$e */
    public static final class C30867e {

        /* renamed from: a */
        public static final String f82897a = (C112760b.m154195C() + "switchAccountBg");
    }

    /* renamed from: com.tencent.mm.ui.u$f */
    public static final class C30868f {
    }

    /* renamed from: com.tencent.mm.ui.u$h */
    public static final class C30869h {

        /* renamed from: a */
        public static final String f82898a = (HttpWrapperBase.PROTOCAL_HTTPS + MMApplicationContext.getContext().getString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008");
    }

    /* renamed from: com.tencent.mm.ui.u$d */
    public static final class C45092d {

        /* renamed from: a */
        public static final String f122306a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect");

        /* renamed from: b */
        public static final String f122307b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/infringement?url=%s#wechat_redirect");

        /* renamed from: c */
        public static final String f122308c = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=60");
    }

    /* renamed from: com.tencent.mm.ui.u$i */
    public static final class C45093i {

        /* renamed from: a */
        public static final String f122309a = (HttpWrapperBase.PROTOCAL_HTTPS + MMApplicationContext.getContext().getString(C0966R.string.fmi) + "/update/");

        /* renamed from: b */
        public static String f122310b = "k_tmpl_params";

        /* renamed from: c */
        public static String f122311c = "k_tmpl_next_webview";

        /* renamed from: d */
        public static String f122312d = "k_tmpl_start_load_page";

        /* renamed from: e */
        public static String f122313e = "k_tmpl_data_key";

        /* renamed from: f */
        public static String f122314f = "k_tmpl_session_id";

        /* renamed from: g */
        public static String f122315g = "k_tmpl_sub_scene";

        /* renamed from: h */
        public static String f122316h = "k_tmpl_is_webview_prc_created";

        /* renamed from: i */
        public static String f122317i = "k_tmpl_orig_prc_pid";

        /* renamed from: j */
        public static String f122318j = "k_tmpl_item_show_type";

        /* renamed from: k */
        public static String f122319k = "k_tmpl_open_type";

        /* renamed from: l */
        public static String f122320l = "k_tmpl_session";

        /* renamed from: m */
        public static String f122321m = "k_tmpl_force_url";

        /* renamed from: n */
        public static String f122322n = "k_serach_log_id";

        /* renamed from: o */
        public static String f122323o = "k_serach_log_args";

        /* renamed from: p */
        public static String f122324p = "k_scan_from_biz_username";

        /* renamed from: q */
        public static String f122325q = "ad_ux_info_for_jsapi_pay";

        /* renamed from: r */
        public static String f122326r = "no_support_dark_mode";

        /* renamed from: s */
        public static String f122327s = "key_allow_jump_inner_jump_without_perm";
    }

    /* renamed from: com.tencent.mm.ui.u$a */
    public static final class C57854a {
        /* renamed from: a */
        public static String m66842a(int i, long j) {
            return String.format("album_share_element_%s_%s", new Object[]{Long.valueOf(j), Integer.valueOf(i)});
        }
    }

    /* renamed from: com.tencent.mm.ui.u$b */
    public static final class C74929b {

        /* renamed from: a */
        public static final String f220309a = C45093i.f122315g;
    }

    /* renamed from: com.tencent.mm.ui.u$g */
    public interface C74930g {

        /* renamed from: a */
        public static final String f220310a = MMApplicationContext.getPackageName();

        static {
            MMApplicationContext.getPackageName();
        }
    }

    /* renamed from: a */
    public static String m89762a(String str) {
        return str + "_" + System.currentTimeMillis();
    }
}
