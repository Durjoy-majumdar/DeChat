package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.model.C43718i1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44262h0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44339m0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.wepkg.event.C44477b;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import d93.C45310h;
import di3.C86312j;
import java.util.HashMap;
import k00.C46630b;
import k00.C9550c;
import kb3.C46677m;
import t83.C48583f1;
import t83.C48590l;
import u10.C52415a;
import w93.C53088a;
import w93.C53091f;
import w93.C53094h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a */
public class C44019a {

    /* renamed from: a */
    public Context f119259a;

    /* renamed from: b */
    public GameWebViewUI f119260b;

    /* renamed from: c */
    public MMWebView f119261c;

    /* renamed from: d */
    public ViewGroup f119262d;

    /* renamed from: e */
    public C53094h f119263e;

    /* renamed from: f */
    public C43791l f119264f;

    /* renamed from: g */
    public C48590l f119265g;

    /* renamed from: h */
    public C9550c f119266h;

    /* renamed from: i */
    public C44029f f119267i;

    /* renamed from: j */
    public String f119268j;

    /* renamed from: k */
    public GameWebPerformanceInfo f119269k;

    /* renamed from: l */
    public C53091f f119270l;

    /* renamed from: m */
    public long f119271m;

    /* renamed from: n */
    public boolean f119272n;

    /* renamed from: o */
    public C44030b f119273o = new C44020a();

    /* renamed from: p */
    public C44339m0 f119274p = new C44023d();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$a */
    public class C44020a extends C44030b {
        public C44020a() {
        }

        /* renamed from: b */
        public void mo65810b(Bundle bundle) {
            try {
                C43791l lVar = C44019a.this.f119264f;
                if (lVar != null && bundle != null) {
                    lVar.mo68114V5(96, bundle);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$b */
    public class C44021b extends C44477b {
        public C44021b() {
        }

        /* renamed from: c */
        public void mo65877c() {
            Log.m105925i("MicroMsg.GameFloatWebView", "float page, reload url:%s from net", C44019a.this.f119268j);
            MMWebView mMWebView = C44019a.this.f119261c;
            if (mMWebView != null && mMWebView.getParent() != null) {
                C44019a aVar = C44019a.this;
                if (aVar.f119267i != null && !Util.isNullOrNil(aVar.f119268j)) {
                    C44019a.this.f119261c.stopLoading();
                    C44019a aVar2 = C44019a.this;
                    aVar2.f119261c.loadUrl(aVar2.f119267i.f120093w);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$c */
    public class C44022c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f119277d;

        public C44022c(String str) {
            this.f119277d = str;
        }

        public void run() {
            C44019a.this.f119261c.setVisibility(8);
            C44019a.this.f119267i.mo68637g0(this.f119277d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$d */
    public class C44023d extends C44339m0 {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$d$a */
        public class C44024a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f119280d;

            /* renamed from: e */
            public final /* synthetic */ int f119281e;

            /* renamed from: f */
            public final /* synthetic */ int f119282f;

            public C44024a(String str, int i, int i2) {
                this.f119280d = str;
                this.f119281e = i;
                this.f119282f = i2;
            }

            public void run() {
                GameWebViewUI gameWebViewUI = C44019a.this.f119260b;
                String str = this.f119280d;
                int i = this.f119281e;
                int i2 = this.f119282f;
                gameWebViewUI.getClass();
                gameWebViewUI.mo68322y9((String) null, str, i, i2, new HashMap());
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$d$b */
        public class C44025b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f119284d;

            public C44025b(Bundle bundle) {
                this.f119284d = bundle;
            }

            public void run() {
                this.f119284d.putInt("height", C44019a.this.f119260b.mo68320x9());
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$d$c */
        public class C44026c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f119286d;

            /* renamed from: e */
            public final /* synthetic */ int f119287e;

            public C44026c(String str, int i) {
                this.f119286d = str;
                this.f119287e = i;
            }

            public void run() {
                String str = this.f119286d;
                if (str != null) {
                    C44019a.this.f119260b.setMMTitle(str);
                }
                C44019a.this.f119260b.setMMTitleColor(this.f119287e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$d$d */
        public class C44027d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f119289d;

            public C44027d(Bundle bundle) {
                this.f119289d = bundle;
            }

            public void run() {
                C44019a.this.f119260b.mo68315v8(this.f119289d);
            }
        }

        public C44023d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0443, code lost:
            if (r0.f119264f.mo68095Gm(r2) != false) goto L_0x0464;
         */
        /* renamed from: V5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.Bundle mo7031V5(int r21, android.os.Bundle r22) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                r2 = r22
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "game float invokeAsResult, actionCode = "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.GameFloatWebView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r5 = 18
                r6 = 7
                java.lang.String r7 = "KPublisherId"
                r8 = 0
                r9 = 1
                if (r0 == r5) goto L_0x0411
                r5 = 37
                if (r0 == r5) goto L_0x03f2
                r5 = 43
                if (r0 == r5) goto L_0x03c5
                r5 = 79
                if (r0 == r5) goto L_0x03b7
                r5 = 84
                r10 = 0
                if (r0 == r5) goto L_0x0391
                r5 = 87
                if (r0 == r5) goto L_0x0309
                r5 = 95
                if (r0 == r5) goto L_0x02f9
                r5 = 99
                if (r0 == r5) goto L_0x02df
                r5 = 101(0x65, float:1.42E-43)
                if (r0 == r5) goto L_0x02a8
                r5 = 6001(0x1771, float:8.409E-42)
                if (r0 == r5) goto L_0x0277
                r5 = 53
                if (r0 == r5) goto L_0x0269
                r5 = 54
                if (r0 == r5) goto L_0x0258
                r5 = 252(0xfc, float:3.53E-43)
                if (r0 == r5) goto L_0x0248
                r5 = 253(0xfd, float:3.55E-43)
                if (r0 == r5) goto L_0x023c
                java.lang.String r5 = "webview_video_proxy_play_data_id"
                r7 = 2
                switch(r0) {
                    case 5001: goto L_0x019d;
                    case 5002: goto L_0x012b;
                    case 5003: goto L_0x010e;
                    case 5004: goto L_0x00fe;
                    case 5005: goto L_0x00ee;
                    case 5006: goto L_0x00da;
                    case 5007: goto L_0x00ac;
                    default: goto L_0x0066;
                }
            L_0x0066:
                switch(r0) {
                    case 90001: goto L_0x0084;
                    case 90002: goto L_0x0070;
                    default: goto L_0x0069;
                }
            L_0x0069:
                java.lang.String r0 = "undefine action code!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x0476
            L_0x0070:
                java.lang.String r0 = "traceid"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r4 = "username"
                java.lang.String r2 = r2.getString(r4)
                com.tencent.mm.plugin.webview.ui.tools.p1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1.f119545i
                r4.mo68775f(r0, r2)
                goto L_0x0476
            L_0x0084:
                com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()
                java.lang.String r0 = r0.getCookie(r10)
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r8] = r10
                r2[r9] = r0
                java.lang.String r5 = "url = %s, cookie = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
                java.lang.String r2 = "cookie"
                r3.putString(r2, r0)
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = r0.f119260b
                float r0 = kg3.C76577a.m92156g(r0)
                java.lang.String r2 = "density"
                r3.putFloat(r2, r0)
                goto L_0x0476
            L_0x00ac:
                int r0 = r2.getInt(r5)
                java.lang.String r5 = "webview_video_proxy_preload_duration"
                int r2 = r2.getInt(r5)
                java.lang.Object[] r5 = new java.lang.Object[r7]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r5[r8] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                r5[r9] = r6
                java.lang.String r6 = "playid = %d, duration = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                com.tencent.qqvideo.proxy.api.IPlayManager r4 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                int r0 = r4.preLoad(r0, r2)
                java.lang.String r2 = "webview_video_proxy_pre_load_result"
                r3.putInt(r2, r0)
                goto L_0x0476
            L_0x00da:
                int r0 = r2.getInt(r5)
                java.lang.String r4 = "webview_video_proxy_play_remain_time"
                int r2 = r2.getInt(r4)
                com.tencent.qqvideo.proxy.api.IPlayManager r4 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                r4.setRemainTime(r0, r2)
                goto L_0x0476
            L_0x00ee:
                java.lang.String r0 = "webview_video_proxy_net_state"
                int r0 = r2.getInt(r0)
                com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                r2.setNetWorkState(r0)
                goto L_0x0476
            L_0x00fe:
                java.lang.String r0 = "webview_video_proxy_play_state"
                int r0 = r2.getInt(r0)
                com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                r2.setPlayerState(r0)
                goto L_0x0476
            L_0x010e:
                int r0 = r2.getInt(r5)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r2[r8] = r5
                java.lang.String r5 = "webview proxy stop play, play id = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
                if (r0 <= 0) goto L_0x0476
                com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                r2.stopPlay(r0)
                goto L_0x0476
            L_0x012b:
                java.lang.String r0 = "webview_video_proxy_cdn_urls"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r10 = "webview_video_proxy_fileId"
                java.lang.String r17 = r2.getString(r10)
                java.lang.String r10 = "webview_video_proxy_file_size"
                int r14 = r2.getInt(r10)
                java.lang.String r10 = "webview_video_proxy_file_duration"
                int r18 = r2.getInt(r10)
                java.lang.String r10 = "webview_video_proxy_file_type"
                int r2 = r2.getInt(r10)
                com.tencent.qqvideo.proxy.api.IPlayManager r10 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                long r12 = (long) r14
                r11 = r0
                r15 = r12
                r12 = r2
                r13 = r17
                r19 = r14
                r14 = r15
                r16 = r18
                int r10 = r10.startPlay(r11, r12, r13, r14, r16)
                com.tencent.qqvideo.proxy.api.IPlayManager r11 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                java.lang.String r11 = r11.buildPlayURLMp4(r10)
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r8] = r0
                r6[r9] = r17
                java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
                r6[r7] = r0
                r0 = 3
                java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
                r6[r0] = r7
                r0 = 4
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r6[r0] = r2
                r0 = 5
                java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                r6[r0] = r2
                r0 = 6
                r6[r0] = r11
                java.lang.String r0 = "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d, playDataId = %d, localUrl = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r6)
                r3.putInt(r5, r10)
                java.lang.String r0 = "webview_video_proxy_local_url"
                r3.putString(r0, r11)
                goto L_0x0476
            L_0x019d:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f119264f
                boolean r0 = r0.isSDCardAvailable()
                if (r0 == 0) goto L_0x0223
                long r5 = com.tencent.p014mm.sdk.platformtools.SdcardUtil.getAvailableExternalMemorySize2()
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r0[r8] = r2
                java.lang.String r2 = "availableSize = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
                r11 = 524288000(0x1f400000, double:2.590326893E-315)
                int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x01d1
                java.lang.String r0 = "available size not enough"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                com.tencent.mm.plugin.webview.ui.tools.game.a r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                android.content.Context r2 = r2.f119259a
                int r0 = r0.init(r2, r10)
                goto L_0x0234
            L_0x01d1:
                com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
                java.lang.String r2 = i83.C46175a.f124472b
                r0.<init>((java.lang.String) r2)
                boolean r2 = r0.mo119967g()
                if (r2 != 0) goto L_0x01f6
                boolean r2 = r0.mo119987x()
                java.lang.Object[] r5 = new java.lang.Object[r7]
                java.lang.String r6 = r0.mo119971i()
                r5[r8] = r6
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                r5[r9] = r6
                java.lang.String r6 = "create proxy cache path : %s, %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                r9 = r2
            L_0x01f6:
                if (r9 == 0) goto L_0x0216
                com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                com.tencent.mm.plugin.webview.ui.tools.game.a r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                android.content.Context r4 = r4.f119259a
                java.lang.String r0 = r0.mo119971i()
                java.lang.String r0 = p823sg.C48380r.m53726a(r0, r8)
                int r0 = r2.init(r4, r0)
                com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                r4 = 200(0xc8, double:9.9E-322)
                r2.setMaxStorageSize(r4)
                goto L_0x0234
            L_0x0216:
                com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                com.tencent.mm.plugin.webview.ui.tools.game.a r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                android.content.Context r2 = r2.f119259a
                int r0 = r0.init(r2, r10)
                goto L_0x0234
            L_0x0223:
                java.lang.String r0 = "sdcard not available"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
                com.tencent.mm.plugin.webview.ui.tools.game.a r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                android.content.Context r2 = r2.f119259a
                int r0 = r0.init(r2, r10)
            L_0x0234:
                java.lang.String r2 = "webview_video_proxy_init"
                r3.putInt(r2, r0)
                goto L_0x0476
            L_0x023c:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                w93.f r0 = r0.f119270l
                long r4 = java.lang.System.currentTimeMillis()
                r0.f148173i = r4
                goto L_0x0476
            L_0x0248:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.game.report.api.GameWebPerformanceInfo r2 = r0.f119269k
                r2.f108362o = r9
                w93.f r0 = r0.f119270l
                long r4 = java.lang.System.currentTimeMillis()
                r0.f148172h = r4
                goto L_0x0476
            L_0x0258:
                java.lang.String r0 = "add_shortcut_status"
                boolean r0 = r2.getBoolean(r0)
                com.tencent.mm.plugin.webview.ui.tools.game.a r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                t83.l r2 = r2.f119265g
                if (r2 == 0) goto L_0x0476
                r2.mo73205B(r0)
                goto L_0x0476
            L_0x0269:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = r0.f119260b
                com.tencent.mm.plugin.webview.ui.tools.game.a$d$d r4 = new com.tencent.mm.plugin.webview.ui.tools.game.a$d$d
                r4.<init>(r2)
                r0.runOnUiThread(r4)
                goto L_0x0476
            L_0x0277:
                java.lang.String r0 = "clear_webview_cache_clear_cookie"
                boolean r0 = r2.getBoolean(r0, r8)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                r2[r8] = r5
                java.lang.String r5 = "includeCookie = %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r4 = "tools_process_action_code_key"
                java.lang.String r5 = "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"
                r2.putExtra(r4, r5)
                java.lang.String r4 = "tools_clean_webview_cache_ignore_cookie"
                r2.putExtra(r4, r0)
                java.lang.Class<s00.f> r0 = s00.C90110f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                s00.f r0 = (s00.C90110f) r0
                r0.bg0(r2)
                goto L_0x0476
            L_0x02a8:
                java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r2.setClassLoader(r0)
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                android.content.Context r0 = r0.f119259a
                java.lang.String r4 = "open_ui_with_webview_ui_plugin_name"
                java.lang.String r4 = r2.getString(r4)
                java.lang.String r5 = "open_ui_with_webview_ui_plugin_entry"
                java.lang.String r5 = r2.getString(r5)
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                java.lang.String r8 = "open_ui_with_webview_ui_extras"
                android.os.Bundle r2 = r2.getBundle(r8)
                android.content.Intent r2 = r6.putExtras(r2)
                com.tencent.mm.plugin.webview.ui.tools.game.a r6 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                w93.h r6 = r6.f119263e
                java.lang.String r6 = w93.C53094h.f148185a
                android.content.Intent r2 = r2.putExtra(r7, r6)
                ke3.C88144b.m109791i(r0, r4, r5, r2, r10)
                goto L_0x0476
            L_0x02df:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                w93.h r0 = r0.f119263e
                int r0 = w93.C53094h.f148187c
                java.lang.String r2 = "geta8key_scene"
                r3.putInt(r2, r0)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2[r8] = r0
                java.lang.String r0 = "Key value: getA8KeyScene(%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
                goto L_0x0476
            L_0x02f9:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.b r0 = r0.f119273o
                com.tencent.mm.plugin.webview.ui.tools.game.b$a r0 = r0.f119298f
                r0.mo68641d(r2)
                java.lang.String r0 = "set game float page time data"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x0476
            L_0x0309:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.a$f r0 = r0.f119267i
                boolean r2 = r0.f120092v
                java.lang.String r5 = r0.f120093w
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f120094x
                if (r2 == 0) goto L_0x031e
                java.lang.String r0 = "result"
                java.lang.String r2 = "not_return"
                r3.putString(r0, r2)
                goto L_0x0476
            L_0x031e:
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                java.lang.String r6 = "full_url"
                r3.putString(r6, r2)
                java.lang.String r2 = "set_cookie"
                if (r0 == 0) goto L_0x038c
                int r6 = r0.size()
                if (r6 == 0) goto L_0x038c
                r3.putInt(r2, r9)
                java.util.Set r2 = r0.keySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x033c:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x036e
                java.lang.Object r6 = r2.next()
                java.lang.String r6 = (java.lang.String) r6
                com.tencent.xweb.CookieManager r7 = com.tencent.xweb.CookieManager.getInstance()
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r6)
                java.lang.String r12 = "="
                r11.append(r12)
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                r11.append(r6)
                java.lang.String r6 = r11.toString()
                r7.setCookie(r10, r6)
                goto L_0x033c
            L_0x036e:
                com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()
                r0.flush()
                java.lang.Object[] r0 = new java.lang.Object[r9]
                com.tencent.xweb.CookieManager r2 = com.tencent.xweb.CookieManager.getInstance()
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                java.lang.String r2 = r2.getCookie(r5)
                r0[r8] = r2
                java.lang.String r2 = "cookies:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
                goto L_0x0476
            L_0x038c:
                r3.putInt(r2, r8)
                goto L_0x0476
            L_0x0391:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = r0.f119260b
                java.lang.CharSequence r0 = r0.getMMTitle()
                java.lang.String r2 = "webview_current_url"
                r3.putString(r2, r10)
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x03a8
                java.lang.String r0 = r0.toString()
                goto L_0x03a9
            L_0x03a8:
                r0 = r2
            L_0x03a9:
                java.lang.String r4 = "webview_current_title"
                r3.putString(r4, r0)
                java.lang.String r0 = "webview_current_desc"
                r3.putString(r0, r2)
                goto L_0x0476
            L_0x03b7:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = r0.f119260b
                com.tencent.mm.plugin.webview.ui.tools.game.a$d$b r2 = new com.tencent.mm.plugin.webview.ui.tools.game.a$d$b
                r2.<init>(r3)
                r0.runOnUiThread(r2)
                goto L_0x0476
            L_0x03c5:
                java.lang.String r0 = "set_page_title_text"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r4 = "set_page_title_color"
                java.lang.String r2 = r2.getString(r4)
                com.tencent.mm.plugin.webview.ui.tools.game.a r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r4 = r4.f119260b
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131099992(0x7f060158, float:1.7812353E38)
                int r4 = r4.getColor(r5)
                int r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r2, r4)
                com.tencent.mm.plugin.webview.ui.tools.game.a r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r4 = r4.f119260b
                com.tencent.mm.plugin.webview.ui.tools.game.a$d$c r5 = new com.tencent.mm.plugin.webview.ui.tools.game.a$d$c
                r5.<init>(r0, r2)
                r4.runOnUiThread(r5)
                goto L_0x0476
            L_0x03f2:
                java.lang.String r0 = "show_kb_placeholder"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r4 = "show_kb_max_length"
                int r4 = r2.getInt(r4)
                java.lang.String r5 = "show_kb_show_remind_word_count"
                int r2 = r2.getInt(r5)
                com.tencent.mm.plugin.webview.ui.tools.game.a r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r5 = r5.f119260b
                com.tencent.mm.plugin.webview.ui.tools.game.a$d$a r6 = new com.tencent.mm.plugin.webview.ui.tools.game.a$d$a
                r6.<init>(r0, r4, r2)
                r5.runOnUiThread(r6)
                goto L_0x0476
            L_0x0411:
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                w93.h r0 = r0.f119263e
                java.lang.String r0 = w93.C53094h.f148185a
                r3.putString(r7, r0)
                com.tencent.mm.plugin.webview.ui.tools.game.a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.this
                w93.h r2 = r0.f119263e
                java.lang.String r2 = w93.C53094h.f148186b
                int r5 = w93.C53094h.f148187c
                r0.getClass()
                if (r5 != 0) goto L_0x0463
                if (r2 == 0) goto L_0x0461
                int r5 = r2.length()
                if (r5 <= 0) goto L_0x0461
                com.tencent.mm.plugin.webview.stub.l r5 = r0.f119264f
                if (r5 != 0) goto L_0x0434
                goto L_0x045f
            L_0x0434:
                boolean r5 = r5.gg0(r2)     // Catch:{ Exception -> 0x0446 }
                if (r5 == 0) goto L_0x043d
                r6 = 8
                goto L_0x0464
            L_0x043d:
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f119264f     // Catch:{ Exception -> 0x0446 }
                boolean r0 = r0.mo68095Gm(r2)     // Catch:{ Exception -> 0x0446 }
                if (r0 == 0) goto L_0x045f
                goto L_0x0464
            L_0x0446:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "getScene fail, ex = "
                r2.append(r5)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            L_0x045f:
                r6 = 1
                goto L_0x0464
            L_0x0461:
                r6 = 0
                goto L_0x0464
            L_0x0463:
                r6 = r5
            L_0x0464:
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r0[r8] = r2
                java.lang.String r2 = "KGetA8KeyScene = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
                java.lang.String r0 = "getA8KeyScene"
                r3.putInt(r0, r6)
            L_0x0476:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a.C44023d.mo7031V5(int, android.os.Bundle):android.os.Bundle");
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            Log.m105924i("MicroMsg.GameFloatWebView", "closeWindow");
            try {
                C44019a aVar = C44019a.this;
                aVar.f119262d.removeView(aVar.f119261c);
                C44019a.this.mo68617b();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$e */
    public class C44028e extends C44262h0 {
        public C44028e(MMWebViewWithJsApi mMWebViewWithJsApi) {
            super(mMWebViewWithJsApi);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C9550c cVar = C44019a.this.f119266h;
            if (cVar != null) {
                ((C46677m) cVar).mo71928g(consoleMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    public C44019a(GameWebViewUI gameWebViewUI, ViewGroup viewGroup, String str) {
        GameWebPerformanceInfo a = GameWebPerformanceInfo.m43445a(str);
        this.f119269k = a;
        a.f108354d = str;
        a.f108355e = (gameWebViewUI.hashCode() & Integer.MAX_VALUE) + "_" + (str.hashCode() & Integer.MAX_VALUE);
        long currentTimeMillis = System.currentTimeMillis();
        this.f119269k.f108365r = gameWebViewUI.getIntent().getLongExtra("start_time", currentTimeMillis);
        this.f119269k.f108367t = gameWebViewUI.getIntent().getLongExtra("start_activity_time", currentTimeMillis);
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f119269k;
        gameWebPerformanceInfo.f108372y = currentTimeMillis;
        gameWebPerformanceInfo.f108339A = currentTimeMillis;
        C53091f a2 = C53091f.m59446a(str);
        this.f119270l = a2;
        a2.f148166b = System.currentTimeMillis();
        this.f119259a = gameWebViewUI;
        this.f119260b = gameWebViewUI;
        this.f119262d = viewGroup;
        MMWebViewWithJsApi mMWebViewWithJsApi = new MMWebViewWithJsApi(gameWebViewUI, (AttributeSet) null);
        mMWebViewWithJsApi.setBackgroundResource(17170445);
        mMWebViewWithJsApi.setBackgroundColor(0);
        mMWebViewWithJsApi.setVisibility(4);
        C44029f fVar = new C44029f(mMWebViewWithJsApi);
        this.f119267i = fVar;
        mMWebViewWithJsApi.setWebViewClient(fVar);
        mMWebViewWithJsApi.setWebChromeClient(new C44028e(mMWebViewWithJsApi));
        Log.m105925i("MicroMsg.GameFloatWebView", "createFloatWebView, webview: %d, floatWebViewClient: %d", Integer.valueOf(mMWebViewWithJsApi.hashCode()), Integer.valueOf(this.f119267i.hashCode()));
        mMWebViewWithJsApi.getSettings().setJavaScriptEnabled(true);
        mMWebViewWithJsApi.getSettings().setDomStorageEnabled(true);
        mMWebViewWithJsApi.getSettings().setBuiltInZoomControls(false);
        mMWebViewWithJsApi.getSettings().setUseWideViewPort(true);
        mMWebViewWithJsApi.getSettings().setLoadWithOverviewMode(true);
        mMWebViewWithJsApi.getSettings().setSavePassword(false);
        mMWebViewWithJsApi.getSettings().setSaveFormData(false);
        mMWebViewWithJsApi.getSettings().setGeolocationEnabled(true);
        mMWebViewWithJsApi.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mMWebViewWithJsApi.getSettings().setMixedContentMode(0);
        mMWebViewWithJsApi.getSettings().setAppCacheMaxSize(10485760);
        mMWebViewWithJsApi.getSettings().setAppCachePath(this.f119259a.getDir("webviewcache", 0).getAbsolutePath());
        mMWebViewWithJsApi.getSettings().setAppCacheEnabled(true);
        mMWebViewWithJsApi.getSettings().setDatabaseEnabled(true);
        WebSettings settings = mMWebViewWithJsApi.getSettings();
        settings.setDatabasePath(C112760b.m154216X() + "databases/");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(mMWebViewWithJsApi, true);
        this.f119261c = mMWebViewWithJsApi;
        this.f119263e = new C53094h(gameWebViewUI.getIntent());
        C9550c Pl0 = ((C46630b) C86312j.m106911c(C46630b.class)).Pl0();
        this.f119266h = Pl0;
        ((C46677m) Pl0).f125659l = new C44021b();
        this.f119269k.f108340B = System.currentTimeMillis();
        this.f119270l.f148167c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo68616a(String str) {
        this.f119268j = str;
        ((C46677m) this.f119266h).mo71927f(str, false, false);
        MMWebView mMWebView = this.f119261c;
        if (mMWebView != null && mMWebView.getParent() == null) {
            this.f119262d.addView(this.f119261c, new ViewGroup.LayoutParams(-1, -1));
        }
        MMWebView mMWebView2 = this.f119261c;
        if (mMWebView2 != null && this.f119267i != null) {
            mMWebView2.post(new C44022c(str));
        }
    }

    /* renamed from: b */
    public void mo68617b() {
        if (!this.f119272n) {
            Log.m105924i("MicroMsg.GameFloatWebView", "onDestroy");
            this.f119272n = true;
            this.f119273o.f119298f.mo68638a();
            ((C46677m) this.f119266h).mo71929h(true);
            MMWebView mMWebView = this.f119261c;
            if (mMWebView != null) {
                mMWebView.setWebViewClient((WebViewClient) null);
                this.f119261c.setWebChromeClient((WebChromeClient) null);
            }
            this.f119269k.f108347I += System.currentTimeMillis() - this.f119271m;
            this.f119269k.f108348J = System.currentTimeMillis();
            C52415a.m58668a().mo62983e(this.f119269k);
            GameWebPerformanceInfo gameWebPerformanceInfo = (GameWebPerformanceInfo) ((HashMap) GameWebPerformanceInfo.f108338Q).remove(this.f119268j);
            C53091f remove = C53091f.f148164t.remove(this.f119268j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.a$f */
    public class C44029f extends C53088a {
        public C44029f(MMWebView mMWebView) {
            super(mMWebView);
        }

        /* renamed from: L */
        public String mo68623L() {
            C53094h hVar = C44019a.this.f119263e;
            return C53094h.f148185a;
        }

        /* renamed from: M */
        public C44339m0 mo68624M() {
            return C44019a.this.f119274p;
        }

        /* renamed from: Q */
        public boolean mo68625Q(String str) {
            return ((C46677m) C44019a.this.f119266h).mo71926e(str);
        }

        /* renamed from: R */
        public void mo68626R() {
            C44019a.this.f119269k.f108342D = System.currentTimeMillis();
            try {
                this.f120074d.Cb0(this.f120085o, true, (Bundle) null);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.GameFloatWebViewClient", "postBinded, jumpToActivity, ex = " + e.getMessage());
            }
            if (!mo69046O(this.f120085o)) {
                Uri parse = Uri.parse(this.f120085o);
                if (parse.getScheme() == null) {
                    String str = this.f120085o + HttpWrapperBase.PROTOCAL_HTTP;
                    this.f120085o = str;
                    parse = Uri.parse(str);
                }
                if (parse.getScheme().startsWith("http")) {
                    Log.m105924i("MicroMsg.GameFloatWebViewClient", "uri scheme not startwith http, scheme = " + parse.getScheme());
                    this.f120083m = new C44307k0.C44333g(this.f120091u ? "" : this.f120085o);
                    this.f120091u = false;
                    if (!this.f120079i && !this.f120075e.mo70862e(this.f120085o)) {
                        if (mo68625Q(this.f120085o)) {
                            mo68627T(this.f120085o);
                            this.f120086p = this.f120085o;
                        }
                        mo68636e0(this.f120085o, false);
                    } else if (!C43718i1.m47559a(this.f120085o)) {
                        Log.m105922f("MicroMsg.GameFloatWebViewClient", "loadInitialUrl, canLoadUrl fail, url = " + this.f120085o);
                        mo68634a0(this.f120085o);
                    } else if (mo68625Q(this.f120085o)) {
                        mo68627T(this.f120085o);
                    } else {
                        this.f120072b.loadUrl(this.f120085o);
                    }
                } else if (!C43718i1.m47559a(this.f120085o)) {
                    mo68634a0(this.f120085o);
                } else {
                    this.f120072b.loadUrl(this.f120085o);
                }
            }
        }

        /* renamed from: T */
        public void mo68627T(String str) {
            WepkgVersion wepkgVersion = ((C46677m) C44019a.this.f119266h).f125653f;
            if (wepkgVersion == null || !wepkgVersion.f120655h) {
                this.f120072b.loadUrl(str);
            } else {
                super.mo68627T(str);
            }
        }

        /* renamed from: U */
        public void mo68628U() {
            this.f120072b.removeJavascriptInterface("MicroMsg");
            this.f120072b.removeJavascriptInterface("JsApi");
            try {
                this.f120072b.setWebChromeClient((WebChromeClient) null);
                this.f120072b.setWebViewClient((WebViewClient) null);
                this.f120072b.setOnTouchListener((View.OnTouchListener) null);
                this.f120072b.setOnLongClickListener((View.OnLongClickListener) null);
                this.f120072b.setVisibility(8);
                this.f120072b.removeAllViews();
                this.f120072b.clearView();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GameFloatWebView", "onDestroy, set web infos to null,  ex = %s", e.getMessage());
            }
            try {
                this.f120072b.destroy();
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.GameFloatWebView", "onDestroy, viewWV destroy, ex = %s", e2.getMessage());
            }
        }

        /* renamed from: V */
        public void mo68629V(WebView webView, String str) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105925i("MicroMsg.GameFloatWebView", "onPageFinished opt, url = %s, now = %d", str, Long.valueOf(currentTimeMillis));
            C44019a aVar = C44019a.this;
            GameWebPerformanceInfo gameWebPerformanceInfo = aVar.f119269k;
            if (gameWebPerformanceInfo.f108344F == 0) {
                gameWebPerformanceInfo.f108344F = currentTimeMillis;
            }
            C53091f fVar = aVar.f119270l;
            if (fVar.f148169e == 0) {
                fVar.f148169e = currentTimeMillis;
            }
            if (gameWebPerformanceInfo.f108373z == 0) {
                gameWebPerformanceInfo.f108373z = currentTimeMillis;
                aVar.f119271m = currentTimeMillis;
            }
            this.f120072b.setVisibility(0);
            ((C46677m) C44019a.this.f119266h).mo71930i(webView, str);
            C44019a.this.f119273o.f119298f.mo68639b();
        }

        /* renamed from: W */
        public void mo68630W(WebView webView, String str, Bitmap bitmap) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105925i("MicroMsg.GameFloatWebView", "onPageStarted opt, url = %s, now = %d", str, Long.valueOf(currentTimeMillis));
            C44019a aVar = C44019a.this;
            GameWebPerformanceInfo gameWebPerformanceInfo = aVar.f119269k;
            if (gameWebPerformanceInfo.f108343E == 0) {
                gameWebPerformanceInfo.f108343E = currentTimeMillis;
            }
            C53091f fVar = aVar.f119270l;
            if (fVar.f148168d == 0) {
                fVar.f148168d = currentTimeMillis;
            }
            C44030b bVar = C44030b.this;
            bVar.f119297e = null;
            bVar.f119294b = 0;
            bVar.f119295c = 0;
            bVar.f119296d = 0;
            ((C46677m) aVar.f119266h).mo71931j(webView, str);
        }

        /* renamed from: X */
        public void mo68631X(C48590l lVar) {
            Log.m105924i("MicroMsg.GameFloatWebView", "jsapi ready");
            C44019a.this.f119265g = lVar;
        }

        /* renamed from: Y */
        public void mo68632Y(C48583f1 f1Var) {
            Log.m105924i("MicroMsg.GameFloatWebView", "jsloader ready");
            C44019a.this.getClass();
        }

        /* renamed from: Z */
        public void mo68633Z(C43791l lVar, C45310h hVar) {
            C44019a.this.f119264f = lVar;
        }

        /* renamed from: a0 */
        public void mo68634a0(String str) {
            try {
                Log.m105925i("MicroMsg.GameFloatWebView", "onURLFilteredOut url:%s", str);
                C44019a.this.f119262d.removeView(this.f120072b);
            } catch (Exception unused) {
            }
        }

        /* renamed from: c0 */
        public boolean mo68635c0(Bundle bundle) {
            long currentTimeMillis = System.currentTimeMillis();
            C44019a aVar = C44019a.this;
            GameWebPerformanceInfo gameWebPerformanceInfo = aVar.f119269k;
            if (gameWebPerformanceInfo.f108346H == 0) {
                gameWebPerformanceInfo.f108346H = currentTimeMillis;
            }
            C53091f fVar = aVar.f119270l;
            if (fVar.f148171g == 0) {
                fVar.f148171g = currentTimeMillis;
            }
            return super.mo68635c0(bundle);
        }

        /* renamed from: e0 */
        public void mo68636e0(String str, boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            C44019a aVar = C44019a.this;
            GameWebPerformanceInfo gameWebPerformanceInfo = aVar.f119269k;
            if (gameWebPerformanceInfo.f108345G == 0) {
                gameWebPerformanceInfo.f108345G = currentTimeMillis;
            }
            C53091f fVar = aVar.f119270l;
            if (fVar.f148170f == 0) {
                fVar.f148170f = currentTimeMillis;
            }
            mo69050f0(str, z, 0);
        }

        /* renamed from: g0 */
        public boolean mo68637g0(String str) {
            return super.mo68637g0(str);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse k = ((C46677m) C44019a.this.f119266h).mo71932k(webView, str, (WebResourceRequest) null);
            if (k != null) {
                return k;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            WebResourceResponse k = ((C46677m) C44019a.this.f119266h).mo71932k(webView, webResourceRequest.getUrl().toString(), webResourceRequest);
            if (k != null) {
                return k;
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            WebResourceResponse k = ((C46677m) C44019a.this.f119266h).mo71932k(webView, webResourceRequest.getUrl().toString(), webResourceRequest);
            if (k != null) {
                return k;
            }
            return super.shouldInterceptRequest(webView, webResourceRequest, bundle);
        }
    }
}
