package vk2;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.C103422m;
import bx0.C39846d;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;
import cx0.C45215d;
import cx0.C45218e;
import e00.C45520t;
import gy3.C87412m;
import te3.C52267zi;

/* renamed from: vk2.x */
public final class C52958x extends C103422m implements C39846d, C52948j {

    /* renamed from: A */
    public boolean f147801A = true;

    /* renamed from: B */
    public boolean f147802B = true;

    /* renamed from: C */
    public boolean f147803C;

    /* renamed from: D */
    public boolean f147804D;

    /* renamed from: E */
    public boolean f147805E;

    /* renamed from: F */
    public boolean f147806F;

    /* renamed from: f */
    public C52267zi f147807f;

    /* renamed from: g */
    public Context f147808g;

    /* renamed from: h */
    public C45520t f147809h;

    /* renamed from: i */
    public C52957w f147810i = new C52957w(this);

    /* renamed from: j */
    public C52956v f147811j = new C52956v(this);

    /* renamed from: n */
    public C52955u f147812n = new C52955u(this);

    /* renamed from: o */
    public BoxWebView f147813o;

    /* renamed from: p */
    public C52947e0 f147814p;

    /* renamed from: q */
    public C14885f0 f147815q;

    /* renamed from: r */
    public C52959y f147816r;

    /* renamed from: s */
    public BaseBoxDialogView f147817s;

    /* renamed from: t */
    public boolean f147818t;

    /* renamed from: u */
    public int f147819u;

    /* renamed from: v */
    public boolean f147820v = true;

    /* renamed from: w */
    public boolean f147821w;

    /* renamed from: x */
    public int f147822x;

    /* renamed from: y */
    public float f147823y;

    /* renamed from: z */
    public boolean f147824z = true;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52958x(android.content.Context r19, te3.C52267zi r20, com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView r21, vk2.C52959y r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "homeContext"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 2131886335(0x7f1200ff, float:1.9407246E38)
            r1.<init>(r0, r3)
            vk2.w r3 = new vk2.w
            r3.<init>(r1)
            r1.f147810i = r3
            vk2.v r3 = new vk2.v
            r3.<init>(r1)
            r1.f147811j = r3
            vk2.u r3 = new vk2.u
            r3.<init>(r1)
            r1.f147812n = r3
            r3 = 1
            r1.f147820v = r3
            r1.f147824z = r3
            r1.f147801A = r3
            r1.f147802B = r3
            r4 = r21
            r1.f147817s = r4
            r4 = r22
            r1.f147816r = r4
            java.lang.Class<e00.m0> r4 = e00.C7574m0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            e00.m0 r4 = (e00.C7574m0) r4
            t83.j1 r5 = t83.C13856j1.f39003b
            r4.mo8345PO(r5)
            r1.f147808g = r0
            r1.f147807f = r2
            vk2.f0 r0 = new vk2.f0
            r0.<init>(r1)
            r1.f147815q = r0
            vk2.y r0 = r1.f147816r
            if (r0 == 0) goto L_0x005b
            r0.mo73705d()
        L_0x005b:
            android.content.Context r0 = r1.f147808g
            r2 = 0
            if (r0 == 0) goto L_0x0283
            vk2.p r4 = new vk2.p
            r4.<init>(r1)
            java.lang.Object r6 = vk2.C37745o.f99970f
            monitor-enter(r6)
            com.tencent.mm.plugin.box.webview.BoxWebView r7 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0280 }
            if (r7 == 0) goto L_0x0081
            com.tencent.mm.plugin.box.webview.BoxWebView r7 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0280 }
            gy3.C87412m.m108591d(r7)     // Catch:{ all -> 0x0280 }
            boolean r7 = r7.f122358h     // Catch:{ all -> 0x0280 }
            if (r7 != 0) goto L_0x0081
            java.lang.String r7 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r8 = "alvinluo fetchBoxWebView use preload webView"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r8)     // Catch:{ all -> 0x0280 }
            com.tencent.mm.plugin.box.webview.BoxWebView r7 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0280 }
            vk2.C37745o.f99966b = r2     // Catch:{ all -> 0x0280 }
            goto L_0x0082
        L_0x0081:
            r7 = r2
        L_0x0082:
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0280 }
            monitor-exit(r6)
            r6 = 0
            if (r7 != 0) goto L_0x008f
            com.tencent.mm.plugin.box.webview.BoxWebView r7 = new com.tencent.mm.plugin.box.webview.BoxWebView
            r7.<init>(r0)
            r0 = 0
            goto L_0x0093
        L_0x008f:
            r7.mo70470f(r0)
            r0 = 1
        L_0x0093:
            boolean r8 = vk2.C37745o.f99967c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r9 = vk2.C37745o.f99969e
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.invoke(r8, r9, r0)
            boolean r0 = vk2.C37745o.f99968d
            if (r0 == 0) goto L_0x00af
            r8 = 1500(0x5dc, double:7.41E-321)
            vk2.C37745o.m41503a(r3, r8)
        L_0x00af:
            r1.f147813o = r7
            r1.f147805E = r6
            java.lang.Class<e00.i0> r0 = e00.C45513i0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            e00.i0 r0 = (e00.C45513i0) r0
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = r1.f147813o
            gy3.C87412m.m108591d(r4)
            e00.t$b r15 = new e00.t$b
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r16 = 105(0x69, float:1.47E-43)
            r17 = 0
            r7 = r15
            r6 = r15
            r15 = r16
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            e00.t r0 = r0.mo70780Q3(r4, r6, r5)
            r1.f147809h = r0
            if (r0 == 0) goto L_0x00e3
            vk2.w r4 = r1.f147810i
            r0.mo67741p(r4)
        L_0x00e3:
            e00.t r0 = r1.f147809h
            if (r0 == 0) goto L_0x00ec
            vk2.v r4 = r1.f147811j
            r0.mo67671F(r4)
        L_0x00ec:
            e00.t r0 = r1.f147809h
            if (r0 == 0) goto L_0x00f3
            r0.init()
        L_0x00f3:
            vk2.y r0 = r1.f147816r
            if (r0 == 0) goto L_0x00fa
            r0.mo73706e()
        L_0x00fa:
            java.lang.String r0 = "MicroMsg.ScanBoxDialog"
            java.lang.String r4 = "alvinluo initWebView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            vk2.e0 r4 = new vk2.e0
            r4.<init>(r1)
            r1.f147814p = r4
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = r1.f147813o
            if (r4 == 0) goto L_0x010f
            r4.mo63455c0(r2, r2)
        L_0x010f:
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = r1.f147813o
            if (r4 == 0) goto L_0x0136
            r4.setWebChromeClient(r2)
            r4.setWebViewClient(r2)
            r4.setVerticalScrollBarEnabled(r3)
            r5 = 0
            r4.setHorizontalScrollBarEnabled(r5)
            android.content.Context r6 = r4.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131099654(0x7f060006, float:1.7811667E38)
            int r6 = r6.getColor(r7)
            r4.setBackgroundColor(r6)
            r4.mo70469W()
            goto L_0x0137
        L_0x0136:
            r5 = 0
        L_0x0137:
            android.content.Context r4 = r18.getContext()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r6, r5)
            android.content.Context r5 = r18.getContext()
            kg3.C76577a.m92172w(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "current_text_size_scale_key"
            float r4 = r4.getFloat(r6, r5)
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92170u(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0171
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x0166
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x0166:
            if (r2 != 0) goto L_0x016a
            goto L_0x0253
        L_0x016a:
            r5 = 148(0x94, float:2.07E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x0171:
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92169t(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0190
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x0185
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x0185:
            if (r2 != 0) goto L_0x0189
            goto L_0x0253
        L_0x0189:
            r5 = 140(0x8c, float:1.96E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x0190:
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92168s(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x01af
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x01a4
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x01a4:
            if (r2 != 0) goto L_0x01a8
            goto L_0x0253
        L_0x01a8:
            r5 = 132(0x84, float:1.85E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x01af:
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92167r(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x01ce
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x01c3
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x01c3:
            if (r2 != 0) goto L_0x01c7
            goto L_0x0253
        L_0x01c7:
            r5 = 124(0x7c, float:1.74E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x01ce:
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92174y(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x01ed
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x01e2
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x01e2:
            if (r2 != 0) goto L_0x01e6
            goto L_0x0253
        L_0x01e6:
            r5 = 116(0x74, float:1.63E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x01ed:
            android.content.Context r6 = r18.getContext()
            float r6 = kg3.C76577a.m92171v(r6)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x020a
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x0201
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x0201:
            if (r2 != 0) goto L_0x0204
            goto L_0x0253
        L_0x0204:
            r5 = 108(0x6c, float:1.51E-43)
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x020a:
            android.content.Context r6 = r18.getContext()
            kg3.C76577a.m92172w(r6)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0226
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x021d
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x021d:
            if (r2 != 0) goto L_0x0220
            goto L_0x0253
        L_0x0220:
            r5 = 100
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x0226:
            android.content.Context r5 = r18.getContext()
            float r5 = kg3.C76577a.m92173x(r5)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0243
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x023a
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x023a:
            if (r2 != 0) goto L_0x023d
            goto L_0x0253
        L_0x023d:
            r5 = 92
            r2.setTextZoom(r5)
            goto L_0x0253
        L_0x0243:
            com.tencent.mm.plugin.box.webview.BoxWebView r5 = r1.f147813o
            if (r5 == 0) goto L_0x024b
            com.tencent.xweb.WebSettings r2 = r5.getSettings()
        L_0x024b:
            if (r2 != 0) goto L_0x024e
            goto L_0x0253
        L_0x024e:
            r5 = 80
            r2.setTextZoom(r5)
        L_0x0253:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "initFontSize, fontSize = %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            com.tencent.mm.plugin.box.webview.BoxWebView r0 = r1.f147813o
            if (r0 == 0) goto L_0x026c
            vk2.f0 r2 = r1.f147815q
            java.lang.String r3 = "boxJSApi"
            r0.addJavascriptInterface(r2, r3)
        L_0x026c:
            zt3.t r0 = zt3.C119157j.f356862d
            vk2.t r2 = new vk2.t
            r2.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r2)
            vk2.y r0 = r1.f147816r
            if (r0 == 0) goto L_0x027f
            r0.mo73704c()
        L_0x027f:
            return
        L_0x0280:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0283:
            java.lang.String r0 = "mContext"
            gy3.C87412m.m108603p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.C52958x.<init>(android.content.Context, te3.zi, com.tencent.mm.plugin.scanner.box.BaseBoxDialogView, vk2.y):void");
    }

    /* renamed from: E */
    public boolean mo73697E() {
        return isShowing() || this.f147806F;
    }

    /* renamed from: F */
    public final void mo73698F() {
        try {
            if (getContext() instanceof Activity) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isFinishing()) {
                    Log.m105928w("MicroMsg.ScanBoxDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanBoxDialog", e, "realShowDialog exception", new Object[0]);
        }
    }

    public void dismiss() {
        BaseBoxDialogView baseBoxDialogView;
        Log.m105925i("MicroMsg.ScanBoxDialog", "alvinluo dismissDialog isShowing: %s", Boolean.valueOf(isShowing()));
        this.f147806F = false;
        if (isShowing() && (baseBoxDialogView = this.f147817s) != null && !baseBoxDialogView.f315748U) {
            baseBoxDialogView.mo151551c(5);
        }
    }

    /* renamed from: h */
    public void mo73692h(int i) {
        Log.m105919d("MicroMsg.ScanBoxDialog", "alvinluo dismissDialog isShowing: %b, isAttachedToWindow: %b, exitType: %s", Boolean.valueOf(isShowing()), Boolean.valueOf(this.f147818t), Integer.valueOf(i));
        this.f147819u = i;
        this.f147806F = false;
        if (isShowing() && this.f147818t) {
            super.dismiss();
        }
    }

    /* renamed from: k0 */
    public Context mo62488k0() {
        Context context = this.f147808g;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    /* renamed from: l0 */
    public BoxWebView mo62489l0() {
        return this.f147813o;
    }

    /* renamed from: m0 */
    public C45218e mo62490m0() {
        return this.f147814p;
    }

    /* renamed from: n0 */
    public void mo62491n0() {
    }

    /* renamed from: o0 */
    public C45215d mo62492o0() {
        return this.f147815q;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105927v("MicroMsg.ScanBoxDialog", "alvinluo onAttachedToWindow %b", Boolean.valueOf(this.f147818t));
        this.f147818t = true;
    }

    public void onBackPressed() {
        boolean z;
        if (isShowing()) {
            BaseBoxDialogView baseBoxDialogView = this.f147817s;
            if (baseBoxDialogView != null) {
                if (!baseBoxDialogView.f315748U) {
                    baseBoxDialogView.mo151551c(5);
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                super.onBackPressed();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r2 = (r2 = r2.getResources()).getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            java.lang.String r6 = "MicroMsg.ScanBoxDialog"
            java.lang.String r0 = "alvinluo onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            boolean r6 = r5.f147820v
            if (r6 == 0) goto L_0x001b
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x0026
            r0 = 100729856(0x6010400, float:2.4265142E-35)
            r6.addFlags(r0)
            goto L_0x0026
        L_0x001b:
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x0026
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r0)
        L_0x0026:
            r6 = 1
            r5.mo143460C(r6)
            android.view.Window r0 = r5.getWindow()
            r1 = -1
            if (r0 == 0) goto L_0x0034
            r0.setLayout(r1, r1)
        L_0x0034:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x003e
            r2 = 0
            r0.setDimAmount(r2)
        L_0x003e:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x004a
            r2 = 2131886336(0x7f120100, float:1.9407248E38)
            r0.setWindowAnimations(r2)
        L_0x004a:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x007a
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x007a
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x006b
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x006b
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r2 == 0) goto L_0x006b
            int r2 = r2.widthPixels
            goto L_0x0073
        L_0x006b:
            android.content.Context r2 = r0.getContext()
            int r2 = kg3.C76577a.m92145A(r2)
        L_0x0073:
            r0.setMinimumWidth(r2)
            r2 = 0
            r0.setPadding(r2, r2, r2, r2)
        L_0x007a:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x008e
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            if (r0 == 0) goto L_0x008e
            r0.width = r1
            r0.height = r1
            r2 = 80
            r0.gravity = r2
        L_0x008e:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00bb
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = r5.f147813o
            gy3.C87412m.m108591d(r2)
            r0.f315769r = r2
            vk2.c r3 = new vk2.c
            r3.<init>(r0)
            java.util.LinkedList<com.tencent.mm.ui.widget.MMWebView$e> r2 = r2.f122362o
            r2.add(r3)
            com.tencent.mm.plugin.scanner.box.BoxWebViewContainer r2 = r0.f315765o
            if (r2 == 0) goto L_0x00b3
            com.tencent.mm.ui.widget.MMWebView r0 = r0.f315769r
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r3.<init>(r1, r4)
            r2.addView(r0, r3)
            goto L_0x00bb
        L_0x00b3:
            java.lang.String r6 = "webViewContainer"
            gy3.C87412m.m108603p(r6)
            r6 = 0
            throw r6
        L_0x00bb:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00c1
            r0.f315762i = r5
        L_0x00c1:
            if (r0 == 0) goto L_0x00c8
            boolean r2 = r5.f147821w
            r0.setIsFixDialogHeight(r2)
        L_0x00c8:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00d1
            int r2 = r5.f147822x
            r0.setFixDialogHeight(r2)
        L_0x00d1:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00da
            float r2 = r5.f147823y
            r0.setFixDialogHeightRate(r2)
        L_0x00da:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00e3
            boolean r2 = r5.f147801A
            r0.setEnableDialogScroll(r2)
        L_0x00e3:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00ec
            boolean r2 = r5.f147824z
            r0.setEnableWebViewScroll(r2)
        L_0x00ec:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00f5
            boolean r2 = r5.f147802B
            r0.setCanceledOnTouchOutside(r2)
        L_0x00f5:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            if (r0 == 0) goto L_0x00fe
            boolean r2 = r5.f147803C
            r0.setEnableScrollRightClose(r2)
        L_0x00fe:
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r5.f147817s
            gy3.C87412m.m108591d(r0)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r1)
            r5.setContentView(r0, r2)
            vk2.q r0 = new vk2.q
            r0.<init>(r5)
            r5.setOnShowListener(r0)
            vk2.r r0 = new vk2.r
            r0.<init>(r5)
            r5.setOnDismissListener(r0)
            vk2.s r0 = new vk2.s
            r0.<init>(r5)
            r5.setOnCancelListener(r0)
            r5.setCancelable(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.C52958x.onCreate(android.os.Bundle):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105927v("MicroMsg.ScanBoxDialog", "alvinluo onDetachedFromWindow %b", Boolean.valueOf(this.f147818t));
        this.f147818t = false;
    }

    public void show() {
        Log.m105925i("MicroMsg.ScanBoxDialog", "alvinluo showDialog showAfterWebViewReady: %b, webViewReady: %b", Boolean.valueOf(this.f147804D), Boolean.valueOf(this.f147805E));
        if (!this.f147804D) {
            mo73698F();
        } else if (!this.f147805E) {
            this.f147806F = true;
        } else {
            mo73698F();
        }
    }
}
