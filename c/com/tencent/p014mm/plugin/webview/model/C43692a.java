package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.plugin.webview.model.a */
public final class C43692a {

    /* renamed from: a */
    public static String f118068a = "";

    /* renamed from: b */
    public static Pattern f118069b;

    /* renamed from: com.tencent.mm.plugin.webview.model.a$a */
    public class C43693a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118070d;

        /* renamed from: e */
        public final /* synthetic */ MMWebView f118071e;

        /* renamed from: com.tencent.mm.plugin.webview.model.a$a$a */
        public class C43694a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f118072d;

            public C43694a(boolean z) {
                this.f118072d = z;
            }

            public void run() {
                if (this.f118072d) {
                    C43692a.m47523a(C43693a.this.f118071e, true);
                    Log.m105924i("MicroMsg.AutoPlayLogic", "enableAutoPlay (true)");
                    return;
                }
                C43692a.m47523a(C43693a.this.f118071e, false);
                Log.m105924i("MicroMsg.AutoPlayLogic", "enableAutoPlay (false)");
            }
        }

        public C43693a(String str, MMWebView mMWebView) {
            this.f118070d = str;
            this.f118071e = mMWebView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
            if (r1.matcher(r0).find() != false) goto L_0x008f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = r7.f118070d
                java.util.regex.Pattern r1 = com.tencent.p014mm.plugin.webview.model.C43692a.f118069b
                java.lang.String r2 = "MicroMsg.AutoPlayLogic"
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x0029
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_webview_auto_play_list_2
                java.lang.String r6 = "(^http(s)?://((mp|bc|game|pay|payapp|(.*)support)\\.weixin\\.qq|support\\.wechat)\\.com/(.*)|^http(s)?://(payapp|pay)\\.wechatpay\\.cn/(.*)|^http(s)?://([^?#&/]*.)?(weishi\\.com|weishi\\.qq\\.com|view\\.inews\\.qq\\.com)/(.*)|^webcompt://(.*))"
                java.lang.String r1 = r1.Y60(r5, r6)
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r5[r3] = r1
                java.lang.String r6 = "autoPlayHostsStr config:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
                com.tencent.p014mm.plugin.webview.model.C43692a.f118069b = r1
            L_0x0029:
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C43692a.f118068a
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x006a
                java.lang.StringBuffer r1 = new java.lang.StringBuffer
                r1.<init>()
                java.lang.String r5 = "file://"
                r1.append(r5)
                e83.b r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46983g(r3)
                java.lang.String r5 = r5.mo71077o()
                r1.append(r5)
                java.lang.String r5 = "/"
                r1.append(r5)
                e83.b r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46983g(r3)
                java.lang.String r5 = r5.mo71058f()
                r1.append(r5)
                java.lang.String r5 = "?"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.plugin.webview.model.C43692a.f118068a = r1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r5[r3] = r1
                java.lang.String r1 = "isEnableAutoPlay websearch_white_list:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r5)
            L_0x006a:
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C43692a.f118068a
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x007b
                java.lang.String r1 = com.tencent.p014mm.plugin.webview.model.C43692a.f118068a
                boolean r1 = r0.startsWith(r1)
                if (r1 == 0) goto L_0x007b
                goto L_0x008f
            L_0x007b:
                java.util.regex.Pattern r1 = com.tencent.p014mm.plugin.webview.model.C43692a.f118069b
                if (r1 != 0) goto L_0x0085
                java.lang.String r0 = "autoPlayHostsPattern is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x0090
            L_0x0085:
                java.util.regex.Matcher r0 = r1.matcher(r0)
                boolean r0 = r0.find()
                if (r0 == 0) goto L_0x0090
            L_0x008f:
                r3 = 1
            L_0x0090:
                com.tencent.mm.plugin.webview.model.a$a$a r0 = new com.tencent.mm.plugin.webview.model.a$a$a
                r0.<init>(r3)
                com.tencent.p014mm.ipcinvoker.C40319a0.m43495c(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C43692a.C43693a.run():void");
        }
    }

    /* renamed from: a */
    public static void m47523a(MMWebView mMWebView, boolean z) {
        mMWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        boolean z2 = !z;
        mMWebView.getSettings().setVideoPlaybackRequiresUserGesture(z2);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_audio_autoplay, 0);
        Log.m105925i("MicroMsg.AutoPlayLogic", "enableAutoPlay audioAutoPlayControl:%d, enable:%b", Integer.valueOf(Qe), Boolean.valueOf(z));
        if (Qe == 1) {
            mMWebView.getSettings().setAudioPlaybackRequiresUserGesture(z2);
        }
    }

    /* renamed from: b */
    public static void m47524b(MMWebView mMWebView) {
        if (mMWebView == null) {
            Log.m105920e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        String url = mMWebView.getUrl();
        Log.m105925i("MicroMsg.AutoPlayLogic", "currentUrl:%s", url);
        if (!Util.isNullOrNil(url)) {
            m47525c(mMWebView, url);
        }
    }

    /* renamed from: c */
    public static void m47525c(MMWebView mMWebView, String str) {
        if (mMWebView == null) {
            Log.m105920e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        Log.m105925i("MicroMsg.AutoPlayLogic", "currentUrl:%s", str);
        if (!Util.isNullOrNil(str) && !str.startsWith("webcompt://")) {
            C40319a0.m43494b(new C43693a(str, mMWebView));
        }
    }
}
