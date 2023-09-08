package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.webview.core.e */
public class C5841e {

    /* renamed from: a */
    public static final String f22023a = (WeChatHosts.domainString(C0966R.string.fmo) + ";" + WeChatHosts.domainString(C0966R.string.fmc) + ";" + WeChatHosts.domainString(C0966R.string.fmq) + ";wx-credit-repay.tencent.com;chong.qq.com;qian.tenpay.com;" + WeChatHosts.domainString(C0966R.string.fm9) + ";" + WeChatHosts.domainString(C0966R.string.fm8) + ";wx.tenpay.com");

    /* renamed from: b */
    public static final Set<String> f22024b = new C5842a();

    /* renamed from: com.tencent.mm.plugin.webview.core.e$a */
    public class C5842a extends HashSet<String> {
        public C5842a() {
            add("application/msword");
            add("application/vnd.ms-powerpoint");
            add("application/vnd.ms-excel");
            add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
            add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
            add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            add("application/kswps");
            add("application/kset");
            add("application/ksdps");
            add("application/pdf");
            add("text/plain");
        }
    }
}
