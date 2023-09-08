package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.WebViewTransHelper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import h81.C59774i;
import i83.C33245r;
import i83.C46195q;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import l31.C61212e;
import p629ny.C76979h;
import q20.C89449a;
import q31.C118148a;
import t83.C13851h1;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper */
public class WebViewUIStyleHelper {

    /* renamed from: r */
    public static Map<String, Bundle> f118663r = new HashMap();

    /* renamed from: a */
    public boolean f118664a = false;

    /* renamed from: b */
    public boolean f118665b = false;

    /* renamed from: c */
    public MMWebView f118666c;

    /* renamed from: d */
    public WebViewUI f118667d;

    /* renamed from: e */
    public C44196s0 f118668e;

    /* renamed from: f */
    public WebViewTransHelper f118669f;

    /* renamed from: g */
    public String f118670g;

    /* renamed from: h */
    public MMHandler f118671h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public IListener f118672i = null;

    /* renamed from: j */
    public C45695b f118673j = null;

    /* renamed from: k */
    public View f118674k = null;

    /* renamed from: l */
    public View f118675l = null;

    /* renamed from: m */
    public boolean f118676m = true;

    /* renamed from: n */
    public View f118677n = null;

    /* renamed from: o */
    public boolean f118678o = false;

    /* renamed from: p */
    public long f118679p = SystemClock.elapsedRealtime();

    /* renamed from: q */
    public int f118680q = -1;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl */
    public static class BizFinderLineStatusChangedEventListenerImpl extends IListener<BizFinderLineStatusChangedEvent> {

        /* renamed from: d */
        public WeakReference<WebViewUIStyleHelper> f118681d;

        public BizFinderLineStatusChangedEventListenerImpl(WebViewUIStyleHelper webViewUIStyleHelper) {
            super(C40008f.f107254d);
            this.f118681d = new WeakReference<>(webViewUIStyleHelper);
            this.__eventId = -1230141771;
        }

        public boolean callback(IEvent iEvent) {
            BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
            WeakReference<WebViewUIStyleHelper> weakReference = this.f118681d;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            Log.m105924i("MicroMsg.WebViewUIStyleHelper", "callback");
            this.f118681d.get().mo68381m();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$a */
    public class C43825a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ String f118682a;

        public C43825a(WebViewUIStyleHelper webViewUIStyleHelper, String str) {
            this.f118682a = str;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            Class cls = C59774i.class;
            HashMap hashMap = new HashMap();
            hashMap.put("live_enter_status", 1);
            hashMap.put("finder_context_id", ((C59774i) C86312j.m106911c(cls)).mo84747E());
            hashMap.put("share_username", "");
            hashMap.put("finder_tab_context_id", ((C59774i) C86312j.m106911c(cls)).mo84749S0());
            hashMap.put("session_buffer", "");
            hashMap.put("finder_feed_export_id", this.f118682a);
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$b */
    public class C43826b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f118683d;

        /* renamed from: e */
        public final /* synthetic */ String f118684e;

        /* renamed from: f */
        public final /* synthetic */ int f118685f;

        /* renamed from: g */
        public final /* synthetic */ String f118686g;

        /* renamed from: h */
        public final /* synthetic */ boolean f118687h;

        /* renamed from: i */
        public final /* synthetic */ String f118688i;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$b$a */
        public class C43827a implements Runnable {
            public C43827a() {
            }

            public void run() {
                if (C43826b.this.f118683d) {
                    int gg02 = ((C45696d) C86709a0.m107533q(C45696d.class)).gg0(C43826b.this.f118684e);
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[8];
                    int i = 2;
                    objArr[0] = 2;
                    C43826b bVar = C43826b.this;
                    objArr[1] = bVar.f118684e;
                    objArr[2] = Integer.valueOf(WebViewUIStyleHelper.this.f118680q);
                    objArr[3] = Integer.valueOf(C43826b.this.f118685f);
                    objArr[4] = C43826b.this.f118686g;
                    objArr[5] = Integer.valueOf(gg02);
                    if (C43826b.this.f118687h) {
                        i = 3;
                    }
                    objArr[6] = Integer.valueOf(i);
                    C43826b bVar2 = C43826b.this;
                    objArr[7] = WebViewUIStyleHelper.this.mo68372d(bVar2.f118688i);
                    nVar.mo160131h(23044, objArr);
                }
                C43826b bVar3 = C43826b.this;
                if (!bVar3.f118683d || bVar3.f118687h) {
                    WebViewUI webViewUI = WebViewUIStyleHelper.this.f118667d;
                    if (webViewUI != null) {
                        webViewUI.f118465H1.mo68577K("Contact_Scene", 154);
                        C43826b bVar4 = C43826b.this;
                        WebViewUIStyleHelper.this.f118667d.mo68316v9(bVar4.f118684e);
                        C48590l lVar = WebViewUIStyleHelper.this.f118667d.f118508Z;
                        if (lVar != null && lVar.f130003h) {
                            String c = C13851h1.C13852a.m13143c("topbar:click", (Map<String, Object>) null, lVar.f130011p, lVar.f130012q);
                            MMWebView mMWebView = lVar.f129996a;
                            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                        }
                        WebViewUIStyleHelper.this.f118671h.removeCallbacksAndMessages((Object) null);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("userName", C43826b.this.f118684e);
                bundle.putString("exportId", C43826b.this.f118686g);
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle, C43829d.class, (C1256g) null);
            }
        }

        public C43826b(boolean z, String str, int i, String str2, boolean z2, String str3) {
            this.f118683d = z;
            this.f118684e = str;
            this.f118685f = i;
            this.f118686g = str2;
            this.f118687h = z2;
            this.f118688i = str3;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WebViewUI webViewUI = WebViewUIStyleHelper.this.f118667d;
            if (webViewUI == null || webViewUI.f118465H1 == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            WebViewUIStyleHelper webViewUIStyleHelper = WebViewUIStyleHelper.this;
            if (elapsedRealtime - webViewUIStyleHelper.f118679p < 175) {
                webViewUIStyleHelper.f118671h.removeCallbacksAndMessages((Object) null);
                WebViewUIStyleHelper.this.f118667d.mo68255R7();
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            webViewUIStyleHelper.f118679p = SystemClock.elapsedRealtime();
            WebViewUIStyleHelper.this.f118671h.postDelayed(new C43827a(), 175);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$c */
    public static class C43828c {

        /* renamed from: a */
        public String f118691a;

        /* renamed from: b */
        public String f118692b;

        /* renamed from: c */
        public String f118693c;

        /* renamed from: d */
        public String f118694d;

        /* renamed from: e */
        public String f118695e;

        /* renamed from: f */
        public boolean f118696f;

        /* renamed from: g */
        public int f118697g;

        /* renamed from: h */
        public boolean f118698h;

        /* renamed from: i */
        public String f118699i;
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$d */
    public static final class C43829d implements C80883e<Bundle, Object> {
        private C43829d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            Class cls = C45696d.class;
            if (bundle != null) {
                String string = bundle.getString("userName");
                ((C45696d) C86709a0.m107533q(cls)).mo70995gj(MMApplicationContext.getContext(), string, bundle.getString("exportId"), 9, ((C45696d) C86709a0.m107533q(cls)).gg0(string));
                return;
            }
            Log.m105920e("MicroMsg.WebViewUIStyleHelper", "InvokeTask, mm received invalid data");
        }
    }

    public WebViewUIStyleHelper(WebViewUI webViewUI) {
        this.f118667d = webViewUI;
        this.f118668e = new C44196s0(webViewUI);
        if (this.f118672i == null && mo68378j()) {
            BizFinderLineStatusChangedEventListenerImpl bizFinderLineStatusChangedEventListenerImpl = new BizFinderLineStatusChangedEventListenerImpl(this);
            this.f118672i = bizFinderLineStatusChangedEventListenerImpl;
            bizFinderLineStatusChangedEventListenerImpl.alive();
        }
    }

    /* renamed from: n */
    public static void m47969n(View view, MMActivityController mMActivityController) {
        View j = mMActivityController.f348065F.mo91099j();
        if (j instanceof LinearLayout) {
            ((LinearLayout) j).addView(view);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.weight = 1.0f;
            view.setLayoutParams(layoutParams);
        } else if (j instanceof RelativeLayout) {
            ((RelativeLayout) j).addView(view);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[Catch:{ Exception -> 0x00ce }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68369a(java.lang.String r9, org.json.JSONObject r10, com.tencent.p014mm.protocal.JsapiPermissionWrapper r11) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r9
            java.lang.String r3 = "MicroMsg.WebViewUIStyleHelper"
            java.lang.String r4 = "configWebPrefetchUIStyle funcName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r8.f118667d
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.s2 r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6560s2.f23763d
            r1.getClass()
            java.lang.String r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6560s2.f23766g
            boolean r1 = r9.equals(r1)
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.WebPrefetcherUIStyleHelper"
            if (r1 == 0) goto L_0x00e9
            int r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6560s2.f23765f
            boolean r1 = r11.mo69447f(r1)
            if (r1 == 0) goto L_0x00e9
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = r8.f118667d
            com.tencent.mm.plugin.webview.ui.tools.t0 r9 = r9.f118478O1
            boolean r9 = r9.f23850c
            if (r9 == 0) goto L_0x0034
            return
        L_0x0034:
            r8.f118665b = r0
            r8.f118664a = r0
            com.tencent.mm.plugin.webview.ui.tools.s0 r9 = r8.f118668e
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r11 = r9.f119731a
            if (r11 != 0) goto L_0x0040
            goto L_0x0163
        L_0x0040:
            if (r10 != 0) goto L_0x0044
            goto L_0x0163
        L_0x0044:
            java.lang.String r11 = "setNavigationBarColor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            java.lang.String r11 = "actionCode"
            java.lang.String r11 = r10.optString(r11, r3)
            java.lang.String r1 = "1"
            boolean r11 = gy3.C87412m.m108589b(r1, r11)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r5 = "set_navigation_bar_color_reset"
            if (r11 == 0) goto L_0x0063
            r1.putBoolean(r5, r0)
            goto L_0x00e0
        L_0x0063:
            r11 = -1
            java.lang.String r6 = "wxcolor"
            java.lang.String r6 = r10.optString(r6, r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.m49071d(r6)     // Catch:{ Exception -> 0x0083 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0083 }
            if (r7 == 0) goto L_0x007b
            java.lang.String r6 = "color"
            java.lang.String r6 = r10.optString(r6, r3)     // Catch:{ Exception -> 0x0083 }
        L_0x007b:
            int r11 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x0083 }
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = r11 | r5
            goto L_0x008c
        L_0x0083:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r3, r7)
            r1.putBoolean(r5, r0)
        L_0x008c:
            r5 = 255(0xff, float:3.57E-43)
            java.lang.String r6 = "alpha"
            java.lang.String r6 = r10.optString(r6, r3)     // Catch:{ Exception -> 0x00ce }
            if (r6 == 0) goto L_0x009f
            boolean r7 = z04.C112551y.m153811k(r6)     // Catch:{ Exception -> 0x00ce }
            if (r7 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7 = 0
            goto L_0x00a0
        L_0x009f:
            r7 = 1
        L_0x00a0:
            if (r7 != 0) goto L_0x00d6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r6, r7)     // Catch:{ Exception -> 0x00ce }
            float r7 = (float) r5     // Catch:{ Exception -> 0x00ce }
            float r6 = r6 * r7
            int r6 = (int) r6     // Catch:{ Exception -> 0x00ce }
            if (r6 < 0) goto L_0x00b2
            if (r6 <= r5) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r5 = r6
        L_0x00b2:
            java.lang.String r6 = "titleAlphaAdjustment"
            java.lang.String r10 = r10.optString(r6, r3)     // Catch:{ Exception -> 0x00ce }
            if (r10 == 0) goto L_0x00c2
            boolean r3 = z04.C112551y.m153811k(r10)     // Catch:{ Exception -> 0x00ce }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "set_navigation_bar_color_titleAlphaAdjustment"
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r10, r2)     // Catch:{ Exception -> 0x00ce }
            r1.putBoolean(r0, r10)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d6
        L_0x00ce:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
        L_0x00d6:
            java.lang.String r10 = "set_navigation_bar_color_color"
            r1.putInt(r10, r11)
            java.lang.String r10 = "set_navigation_bar_color_alpha"
            r1.putInt(r10, r5)
        L_0x00e0:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = r9.f119731a
            if (r9 == 0) goto L_0x0163
            r9.mo68315v8(r1)
            goto L_0x0163
        L_0x00e9:
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.o2 r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6535o2.f23696d
            r1.getClass()
            java.lang.String r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6535o2.f23698f
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0163
            int r9 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6535o2.f23697e
            boolean r9 = r11.mo69447f(r9)
            if (r9 == 0) goto L_0x0163
            com.tencent.mm.plugin.webview.ui.tools.s0 r9 = r8.f118668e
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r11 = r9.f119731a
            if (r11 != 0) goto L_0x0105
            goto L_0x0163
        L_0x0105:
            if (r10 != 0) goto L_0x0108
            goto L_0x0163
        L_0x0108:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r2] = r10
            java.lang.String r1 = "setBounceBackground data: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r11)
            java.lang.String r11 = "wxbackgroundColor"
            java.lang.String r11 = r10.optString(r11, r3)
            java.lang.String r11 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.m49071d(r11)
            if (r11 == 0) goto L_0x0127
            int r1 = r11.length()
            if (r1 != 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r1 = 0
            goto L_0x0128
        L_0x0127:
            r1 = 1
        L_0x0128:
            if (r1 == 0) goto L_0x0130
            java.lang.String r11 = "backgroundColor"
            java.lang.String r11 = r10.optString(r11, r3)
        L_0x0130:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r10 = r9.f119731a     // Catch:{ Exception -> 0x015b }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x015b }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x015b }
            r1 = 2131101817(0x7f060879, float:1.7816054E38)
            int r10 = r10.getColor(r1)     // Catch:{ Exception -> 0x015b }
            int r10 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r11, r10)     // Catch:{ Exception -> 0x015b }
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r11 = r9.f119731a     // Catch:{ Exception -> 0x015b }
            if (r11 == 0) goto L_0x014d
            com.tencent.mm.plugin.webview.ui.tools.o1 r11 = r11.f118531h2     // Catch:{ Exception -> 0x015b }
            r11.mo68762g(r10)     // Catch:{ Exception -> 0x015b }
        L_0x014d:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r11 = r9.f119731a     // Catch:{ Exception -> 0x015b }
            if (r11 == 0) goto L_0x0158
            com.tencent.mm.ui.widget.MMWebView r11 = r11.f118523f     // Catch:{ Exception -> 0x015b }
            if (r11 == 0) goto L_0x0158
            r11.setBackgroundColor(r10)     // Catch:{ Exception -> 0x015b }
        L_0x0158:
            r9.f119732b = r0     // Catch:{ Exception -> 0x015b }
            goto L_0x0163
        L_0x015b:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r11 = "setBounceBackground exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r9, r11, r10)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper.mo68369a(java.lang.String, org.json.JSONObject, com.tencent.mm.protocal.JsapiPermissionWrapper):void");
    }

    /* renamed from: b */
    public C43828c mo68370b(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Bundle bundle = (Bundle) ((HashMap) f118663r).get(mo68373e(str));
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("key_brand_name");
        String string2 = bundle.getString("key_brand_user_name");
        String string3 = bundle.getString("key_bag_icon");
        String string4 = bundle.getString("key_title");
        String string5 = bundle.getString("key_cover");
        boolean z = bundle.getBoolean("key_show_menu_onfo", false);
        int i = bundle.getInt("key_item_show_type", -1);
        boolean z2 = bundle.getBoolean("key_disable_menu_header", false);
        String string6 = bundle.getString("key_mp_vid", "");
        C43828c cVar = new C43828c();
        cVar.f118693c = string3;
        cVar.f118692b = string;
        cVar.f118691a = string2;
        cVar.f118696f = z;
        cVar.f118694d = string4;
        if (!Util.isNullOrNil(string5)) {
            string3 = string5;
        }
        cVar.f118695e = string3;
        cVar.f118697g = i;
        cVar.f118698h = z2;
        cVar.f118699i = string6;
        return cVar;
    }

    /* renamed from: c */
    public int mo68371c() {
        if (this.f118667d == null) {
            return 0;
        }
        return mo68377i() ? this.f118667d.getResources().getColor(C0966R.color.aks) : this.f118667d.getResources().getColor(C0966R.color.akm);
    }

    /* renamed from: d */
    public final String mo68372d(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            int i = Util.getInt(parse.getQueryParameter("idx"), 0);
            long j = Util.getLong(parse.getQueryParameter("mid"), 0);
            this.f118680q = Util.getInt(parse.getQueryParameter(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
            return j + "#" + i;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final String mo68373e(String str) {
        Class cls = C45696d.class;
        return (str == null || C86709a0.m107533q(cls) == null || !((C45696d) C86709a0.m107533q(cls)).mo70989eQ(str)) ? str : ((C45696d) C86709a0.m107533q(cls)).mo70950A9(str);
    }

    /* renamed from: f */
    public void mo68374f() {
        WebViewUI webViewUI = this.f118667d;
        if (webViewUI != null) {
            webViewUI.getController().mo177102w0(0);
            View view = this.f118674k;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C45695b bVar = this.f118673j;
            if (bVar != null) {
                bVar.stopCheck();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68375g() {
        /*
            r6 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f118667d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r1 = "MicroMsg.WebViewUIStyleHelper"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000b:
            r0 = 1
            goto L_0x0075
        L_0x000e:
            boolean r0 = r0.mo68245N7()
            if (r0 == 0) goto L_0x0015
            goto L_0x000b
        L_0x0015:
            boolean r0 = r6.f118665b
            if (r0 == 0) goto L_0x001a
            goto L_0x000b
        L_0x001a:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f118667d
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0074
            java.lang.String r4 = "disable_light_actionbar_style"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L_0x0030
            java.lang.String r0 = "checkDisableLightActionbarStyle, KDisableLightActionbarStyle is true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x000b
        L_0x0030:
            java.lang.String r4 = "status_bar_style"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = "black"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004a
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KStatusBarStyle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x000b
        L_0x004a:
            java.lang.String r4 = "customize_status_bar_color"
            int r4 = r0.getIntExtra(r4, r2)
            if (r4 == 0) goto L_0x0058
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KCustomizeStatusBarColor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x000b
        L_0x0058:
            java.lang.String r4 = "open_custom_style_url"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L_0x0066
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KOpenCustomStyleUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x000b
        L_0x0066:
            java.lang.String r4 = "show_full_screen"
            boolean r0 = r0.getBooleanExtra(r4, r2)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "checkDisableLightActionbarStyle, webview is fullscreen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x000b
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            r6.f118664a = r3
            goto L_0x007c
        L_0x007a:
            r6.f118664a = r2
        L_0x007c:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r6.f118667d
            r0[r2] = r4
            boolean r2 = r6.f118664a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r3] = r2
            java.lang.String r2 = "initNewWebViewUIStyleParams, webViewUI#%s, disableLightActionbarStyle:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper.mo68375g():void");
    }

    /* renamed from: h */
    public final boolean mo68376h(Bundle bundle) {
        Class cls = C45696d.class;
        if (bundle == null || !bundle.getBoolean("key_show_live_top_bar", true)) {
            return false;
        }
        String string = bundle.getString("key_url");
        if (Util.isNullOrNil(string) || C86709a0.m107533q(cls) == null || !((C45696d) C86709a0.m107533q(cls)).mo70989eQ(string) || !mo68378j()) {
            return false;
        }
        return ((C45696d) C86709a0.m107533q(cls)).mo71015wL(bundle.getString("key_brand_user_name"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c7, code lost:
        if (r2.matcher(r0).find() != false) goto L_0x00c9;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo68377i() {
        /*
            r8 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f118667d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r8.f118670g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f118667d
            java.lang.String r0 = r0.mo6901n0()
        L_0x0014:
            java.lang.Boolean r2 = ea3.C45606x.f123376d
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = ea3.C45606x.f123375c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0028
            java.lang.Boolean r0 = ea3.C45606x.f123376d
            boolean r0 = r0.booleanValue()
            goto L_0x00d4
        L_0x0028:
            ea3.C45606x.f123375c = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "^(http|https)://"
            r2.append(r3)
            r4 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r4)
            r2.append(r5)
            java.lang.String r5 = "/(s|mp/author|mp/appmsg/show)"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            r6 = 1
            if (r2 == 0) goto L_0x0058
            goto L_0x00c9
        L_0x0058:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "^(http|https)://(sh.|hk.|sz.)?"
            r2.append(r7)
            r7 = 2131831323(0x7f112a1b, float:1.9295668E38)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r7)
            r2.append(r7)
            java.lang.String r7 = "/connect/(confirm|oauth2/(authorize|explorer_authorize))"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            if (r2 == 0) goto L_0x0084
            goto L_0x00c9
        L_0x0084:
            java.util.regex.Pattern r2 = ea3.C45606x.f123374b
            if (r2 != 0) goto L_0x00bb
            oa1.d r2 = oa1.C117731d.m166007c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r4)
            r5.append(r3)
            java.lang.String r3 = "/mp/(readtemplate\\?t=scanlogin/index_tmpl|scanlogin\\?action=index|relatedarticle\\?action=page|aboutbiz|infringement|qa)"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "clicfg_webview_mp_host_list"
            java.lang.String r2 = r2.mo182444f(r4, r3, r6, r6)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r1] = r2
            java.lang.String r4 = "MicroMsg.WebViewUIUtil"
            java.lang.String r5 = "mpHosts=:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            ea3.C45606x.f123374b = r2
        L_0x00bb:
            java.util.regex.Pattern r2 = ea3.C45606x.f123374b
            if (r2 == 0) goto L_0x00ca
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            ea3.C45606x.f123376d = r0
            boolean r0 = r0.booleanValue()
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper.mo68377i():boolean");
    }

    /* renamed from: j */
    public boolean mo68378j() {
        Class cls = C45696d.class;
        return C86709a0.m107533q(cls) != null && ((C45696d) C86709a0.m107533q(cls)).ou0();
    }

    /* renamed from: k */
    public void mo68379k() {
        WebViewUI webViewUI = this.f118667d;
        boolean z = false;
        if (webViewUI != null) {
            C6595t0 t0Var = webViewUI.f118478O1;
            C6592p0 p0Var = t0Var.f23849b;
            if (!(p0Var.f23835a || p0Var.f23837c) && !t0Var.f23850c) {
                this.f118667d.setActionbarColor(mo68371c());
            }
        }
        WebViewUI webViewUI2 = this.f118667d;
        if (webViewUI2 != null) {
            View findViewById = webViewUI2.findViewById(C0966R.C0970id.lms);
            if (findViewById != null) {
                C6592p0 p0Var2 = this.f118667d.f118478O1.f23849b;
                if (p0Var2.f23835a || p0Var2.f23837c) {
                    z = true;
                }
                if (!z && !this.f118668e.f119732b) {
                    findViewById.setBackgroundColor(mo68371c());
                }
            }
            int color = this.f118667d.getResources().getColor(C0966R.color.akt);
            View findViewById2 = this.f118667d.findViewById(C0966R.C0970id.mx6);
            if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                ((TextView) findViewById2).setTextColor(color);
            }
        }
        mo68380l();
    }

    /* renamed from: l */
    public void mo68380l() {
        if (this.f118667d != null) {
            if (!mo68377i()) {
                this.f118667d.showActionbarLine();
                return;
            }
            MMWebView mMWebView = this.f118666c;
            if (mMWebView == null || mMWebView.getWebScrollY() <= 0) {
                this.f118667d.hideActionbarLine();
            } else {
                this.f118667d.showActionbarLine();
            }
        }
    }

    /* renamed from: m */
    public void mo68381m() {
        Bundle bundle = (Bundle) ((HashMap) f118663r).get(mo68373e(this.f118670g));
        if (bundle == null || this.f118667d == null) {
            mo68374f();
        } else if (bundle.getBoolean("key_current_info_show") || mo68376h(bundle)) {
            mo68382o();
        } else {
            mo68374f();
        }
    }

    /* renamed from: o */
    public void mo68382o() {
        WebViewUI webViewUI;
        String str;
        Class cls = C45696d.class;
        Class cls2 = C61212e.class;
        Bundle bundle = (Bundle) ((HashMap) f118663r).get(mo68373e(this.f118670g));
        if (bundle == null || (webViewUI = this.f118667d) == null) {
            Log.m105929w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", this.f118670g);
        } else if (webViewUI.f118517d) {
            Log.m105924i("MicroMsg.WebViewUIStyleHelper", "fixedTitle not show topbar");
        } else if (!this.f118676m) {
            Log.m105924i("MicroMsg.WebViewUIStyleHelper", "showTopBar canShowShowTopBarLayout false and not show");
        } else if (this.f118678o) {
            Log.m105924i("MicroMsg.WebViewUIStyleHelper", "trans help button shown, do not show topbar");
        } else {
            View view = this.f118677n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f118667d.getController().mo177102w0(8);
            if (this.f118674k == null) {
                View inflate = this.f118667d.getLayoutInflater().inflate(C0966R.C0971layout.ci_, (ViewGroup) null);
                this.f118674k = inflate;
                this.f118675l = inflate.findViewById(C0966R.C0970id.f359095it3);
                m47969n(this.f118674k, this.f118667d.getController());
            }
            TextView textView = (TextView) this.f118674k.findViewById(C0966R.C0970id.hg4);
            View findViewById = this.f118674k.findViewById(C0966R.C0970id.ln7);
            View findViewById2 = this.f118674k.findViewById(C0966R.C0970id.ln6);
            View findViewById3 = this.f118674k.findViewById(C0966R.C0970id.ln8);
            View findViewById4 = this.f118674k.findViewById(C0966R.C0970id.fzc);
            String string = bundle.getString("key_brand_name");
            String string2 = bundle.getString("key_brand_user_name");
            String q4 = C86709a0.m107533q(cls) != null ? ((C45696d) C86709a0.m107533q(cls)).mo71011q4(string2) : "";
            boolean z = !Util.isNullOrNil(q4) && mo68376h(bundle);
            boolean z2 = bundle.getBoolean("key_current_info_show");
            String str2 = q4;
            Class cls3 = cls;
            Log.m105925i("MicroMsg.WebViewUIStyleHelper", "showTopBar userName:%s, nickName:%s, isLiveNow:%b, show %b", string2, string, Boolean.valueOf(z), Boolean.valueOf(z2));
            if (Util.isNullOrNil(string) || Util.isNullOrNil(string2)) {
                Log.m105929w("MicroMsg.WebViewUIStyleHelper", "showTopBar invalid param, userName %s, nickName %s", string2, string);
                return;
            }
            this.f118667d.setMMTitle("");
            View view3 = this.f118674k;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i = z ? 0 : 8;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i));
            View view5 = findViewById4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i2 = z ? 8 : 4;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Integer.valueOf(i2));
            View view6 = findViewById3;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int b = C76577a.m92151b(this.f118667d, 4);
            int intExtra = this.f118667d.getIntent().getIntExtra(C74928u.C45093i.f122314f, 0);
            if (!z || z2) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f118667d, string, textView.getTextSize()));
                findViewById2.setBackgroundResource(C0966R.color.ahf);
                textView.setTextSize(1, 17.0f);
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                int i3 = b * 2;
                findViewById2.setPadding(i3, 0, i3, 0);
                int b2 = C76577a.m92151b(this.f118667d, 10);
                C46746a.f125826a.mo71979m(this.f118675l, b2, b2 * 2);
                ((C61212e) C86312j.m106911c(cls2)).mo86177qW(findViewById);
            } else {
                textView.setText(this.f118667d.getString(C0966R.string.aok));
                findViewById2.setBackgroundResource(C0966R.C0969drawable.b2r);
                textView.setTextSize(1, 13.0f);
                C85875k4.m106193l0(textView.getPaint());
                int i4 = b * 3;
                findViewById2.setPadding(i4, 0, i4, 0);
                int i5 = b * 2;
                C46746a.f125826a.mo71979m(this.f118675l, i5, i5 * 2);
            }
            String string3 = bundle.getString("key_url");
            if (z) {
                int gg02 = ((C45696d) C86709a0.m107533q(cls3)).gg0(string2);
                String d = mo68372d(string3);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[8];
                objArr[0] = 1;
                objArr[1] = string2;
                objArr[2] = Integer.valueOf(this.f118680q);
                objArr[3] = Integer.valueOf(intExtra);
                objArr[4] = str2;
                objArr[5] = Integer.valueOf(gg02);
                objArr[6] = Integer.valueOf(z2 ? 3 : 2);
                objArr[7] = d;
                nVar.mo160131h(23044, objArr);
            }
            if (!z || z2) {
                str = str2;
            } else {
                ((C61212e) C86312j.m106911c(cls2)).o30(findViewById, "living_label_webview_title");
                ((C61212e) C86312j.m106911c(cls2)).mo86175pO(findViewById, 40, 26236);
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("live_id", "");
                arrayMap.put("finder_username", "");
                arrayMap.put("feed_id", "");
                arrayMap.put("comment_scene", "");
                arrayMap.put("wx_username", string2);
                ((C61212e) C86312j.m106911c(cls2)).mo86149PM(findViewById, arrayMap);
                str = str2;
                ((C61212e) C86312j.m106911c(cls2)).E60(findViewById, new C43825a(this, str));
            }
            findViewById.setOnClickListener(new C43826b(z, string2, intExtra, str, z2, string3));
            C7007c1.m7256a(findViewById);
        }
    }

    /* renamed from: p */
    public final void mo68383p(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WebViewUIStyleHelper", "startCheck fail bizUserName is null");
            return;
        }
        if (this.f118673j == null) {
            this.f118673j = ((C45696d) C86709a0.m107533q(C45696d.class)).F60(9);
        }
        this.f118673j.mo69386a(str);
    }

    /* renamed from: q */
    public void mo68384q(C46195q qVar, C33245r rVar) {
        C46195q qVar2 = C46195q.SwitchToOrgImmediate;
        C33245r rVar2 = C33245r.Revert;
        C33245r rVar3 = C33245r.Trans;
        if (this.f118667d != null) {
            if (this.f118669f.f117506f) {
                Log.m105928w("MicroMsg.WebViewUIStyleHelper", "switchTransHelpEntry not show title and ignore");
                return;
            }
            C46195q qVar3 = C46195q.SwitchToHelpImmediate;
            C46195q qVar4 = qVar;
            C33245r rVar4 = rVar;
            if (qVar4 == qVar3 && rVar4 == rVar3) {
                Log.m105924i("MicroMsg.WebViewUIStyleHelper", "change trans help button Status and Action");
                qVar4 = qVar2;
                rVar4 = rVar2;
            }
            Log.m105925i("MicroMsg.WebViewUIStyleHelper", "trans help button Action: %s, Status: %s", qVar4.name(), rVar4.name());
            if (this.f118667d == null) {
                Log.m105929w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", this.f118670g);
            } else if (this.f118677n == null) {
                Log.m105924i("MicroMsg.WebViewUIStyleHelper", "init transHelpEntryLayout");
                View inflate = this.f118667d.getLayoutInflater().inflate(C0966R.C0971layout.cia, (ViewGroup) null);
                this.f118677n = inflate;
                m47969n(inflate, this.f118667d.getController());
                ((Button) this.f118677n.findViewById(C0966R.C0970id.ktg)).setOnClickListener(new C44046m2(this));
            }
            TextView textView = (TextView) this.f118677n.findViewById(C0966R.C0970id.jjv);
            WeImageView weImageView = (WeImageView) this.f118677n.findViewById(C0966R.C0970id.jju);
            if (rVar4 == rVar3) {
                textView.setText(C0966R.string.lgj);
                weImageView.setImageResource(C0966R.raw.icons_outlined_translate);
            } else if (rVar4 == rVar2) {
                textView.setText(C0966R.string.lgn);
                weImageView.setImageResource(C0966R.raw.icons_outlined_stoptranslate);
            }
            if (qVar4 != C46195q.None) {
                if (qVar4 == qVar3) {
                    this.f118678o = true;
                    if (mo68377i()) {
                        mo68374f();
                    }
                    this.f118667d.getController().mo177102w0(8);
                    View view = this.f118677n;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (qVar4 == qVar2) {
                    this.f118678o = false;
                    View view2 = this.f118677n;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f118667d.getController().mo177102w0(0);
                    if (mo68377i()) {
                        mo68381m();
                    }
                }
            }
        }
    }
}
