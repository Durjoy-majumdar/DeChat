package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44125o1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.ah4;
import xx0.C53458b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI */
public class TmplWebViewToolUI extends WebViewUI {

    /* renamed from: O2 */
    public static final /* synthetic */ int f109616O2 = 0;

    /* renamed from: I2 */
    public final String f109617I2 = "MicroMsg.TmplWebViewToolUI";

    /* renamed from: J2 */
    public final long f109618J2 = 800;

    /* renamed from: K2 */
    public final C13601g f109619K2 = C36568h.m40985a(new C40776c(this));

    /* renamed from: L2 */
    public final C13601g f109620L2 = C36568h.m40985a(new C40774a(this));

    /* renamed from: M2 */
    public MpWebViewController f109621M2;

    /* renamed from: N2 */
    public final C40777d f109622N2 = new C40777d(this);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$a */
    public static final class C40774a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ TmplWebViewToolUI f109623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40774a(TmplWebViewToolUI tmplWebViewToolUI) {
            super(0);
            this.f109623d = tmplWebViewToolUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f109623d.getIntent().getBooleanExtra(C74928u.C45093i.f122321m, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$b */
    public static final class C40775b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ TmplWebViewToolUI f109624d;

        public C40775b(TmplWebViewToolUI tmplWebViewToolUI) {
            this.f109624d = tmplWebViewToolUI;
        }

        public final boolean onLongClick(View view) {
            C13598b0 b0Var;
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            TmplWebViewToolUI tmplWebViewToolUI = this.f109624d;
            int i = TmplWebViewToolUI.f109616O2;
            tmplWebViewToolUI.getClass();
            C77398g gVar = new C77398g(tmplWebViewToolUI);
            gVar.setTitle((CharSequence) "Debug Info");
            MpWebViewController mpWebViewController = tmplWebViewToolUI.f109621M2;
            if (mpWebViewController != null) {
                if (mpWebViewController.f109583H1.f109554l0 || tmplWebViewToolUI.mo63699I9()) {
                    str = "isFastLoad = false\n";
                } else {
                    str = "isFastLoad = true\n" + "isUseCachedData = " + mpWebViewController.f109588M1 + 10;
                }
                b0Var = C13598b0.f38549a;
            } else {
                str = "";
                b0Var = null;
            }
            if (b0Var == null) {
                str = str + "isFastLoad = false\n";
            }
            gVar.mo107533r((str + "Pkg Info：\n") + C53458b.f150358a.mo74092h());
            TextView textView = gVar.f225697n;
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = gVar.f225695i;
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            gVar.mo107542x(tmplWebViewToolUI.getString(C0966R.string.fmz), true, (DialogInterface.OnClickListener) null);
            gVar.show();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$c */
    public static final class C40776c extends C87413o implements C32224a<ah4> {

        /* renamed from: d */
        public final /* synthetic */ TmplWebViewToolUI f109625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40776c(TmplWebViewToolUI tmplWebViewToolUI) {
            super(0);
            this.f109625d = tmplWebViewToolUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[Catch:{ Exception -> 0x0045 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[Catch:{ Exception -> 0x0045 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI r2 = r6.f109625d     // Catch:{ Exception -> 0x0045 }
                android.content.Intent r2 = r2.getIntent()     // Catch:{ Exception -> 0x0045 }
                java.lang.String r3 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122310b     // Catch:{ Exception -> 0x0045 }
                java.lang.String r4 = "KTmplParams"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0045 }
                byte[] r2 = r2.getByteArrayExtra(r3)     // Catch:{ Exception -> 0x0045 }
                if (r2 == 0) goto L_0x0037
                int r3 = r2.length     // Catch:{ Exception -> 0x0045 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                r3 = r3 ^ r1
                if (r3 == 0) goto L_0x0037
                java.lang.Class<te3.ah4> r3 = te3.ah4.class
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x002d }
                r4 = r3
                pe3.a r4 = (pe3.C47465a) r4     // Catch:{ Exception -> 0x002d }
                r4.parseFrom(r2)     // Catch:{ Exception -> 0x002d }
                pe3.a r3 = (pe3.C47465a) r3     // Catch:{ Exception -> 0x002d }
                goto L_0x0038
            L_0x002d:
                r2 = move-exception
                java.lang.String r3 = "Intent.decodeProtoBuffer"
                java.lang.String r4 = "decode ProtoBuffer"
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0045 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r5)     // Catch:{ Exception -> 0x0045 }
            L_0x0037:
                r3 = 0
            L_0x0038:
                te3.ah4 r3 = (te3.ah4) r3     // Catch:{ Exception -> 0x0045 }
                if (r3 == 0) goto L_0x003d
                goto L_0x00a0
            L_0x003d:
                android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ Exception -> 0x0045 }
                java.lang.String r3 = "TmplParams"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0045 }
                throw r2     // Catch:{ Exception -> 0x0045 }
            L_0x0045:
                r2 = move-exception
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI r3 = r6.f109625d
                java.lang.String r3 = r3.f109617I2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "tmplParam is null, "
                r4.append(r5)
                java.lang.String r2 = r2.getMessage()
                r4.append(r2)
                r2 = 32
                r4.append(r2)
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI r2 = r6.f109625d
                android.content.Intent r2 = r2.getIntent()
                java.lang.String r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r2)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                r2 = 150(0x96, float:2.1E-43)
                g93.C32355a.m39691c(r2)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 17260(0x436c, float:2.4186E-41)
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r0] = r4
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI r0 = r6.f109625d
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r0)
                r5[r1] = r0
                r2.mo160131h(r3, r5)
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI r0 = r6.f109625d
                r0.finish()
                te3.ah4 r3 = new te3.ah4
                r3.<init>()
            L_0x00a0:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.TmplWebViewToolUI.C40776c.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$d */
    public static final class C40777d extends C43558z {

        /* renamed from: b */
        public final /* synthetic */ TmplWebViewToolUI f109626b;

        public C40777d(TmplWebViewToolUI tmplWebViewToolUI) {
            this.f109626b = tmplWebViewToolUI;
        }

        /* renamed from: j */
        public void mo63706j() {
            TmplWebViewToolUI tmplWebViewToolUI = this.f109626b;
            int i = TmplWebViewToolUI.f109616O2;
            C44125o1 o1Var = tmplWebViewToolUI.f118531h2;
            MpWebViewController mpWebViewController = tmplWebViewToolUI.f109621M2;
            o1Var.mo68761f(mpWebViewController != null ? mpWebViewController.getCurrentUrl() : null);
        }
    }

    /* renamed from: H9 */
    public boolean mo63698H9() {
        return false;
    }

    /* renamed from: I9 */
    public final boolean mo63699I9() {
        return ((Boolean) ((C36570n) this.f109620L2).getValue()).booleanValue();
    }

    /* renamed from: L7 */
    public MMWebView mo63700L7() {
        if (this.f118515c1) {
            return super.mo63700L7();
        }
        MpWebViewController mpWebViewController = this.f109621M2;
        if (mpWebViewController == null) {
            return super.mo63700L7();
        }
        C87412m.m108591d(mpWebViewController);
        return mpWebViewController.f117553a;
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        MpWebViewController mpWebViewController = this.f109621M2;
        return mpWebViewController != null ? mpWebViewController : super.mo63701M7();
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v24, types: [com.tencent.mm.plugin.webview.core.y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63703Y8() {
        /*
            r10 = this;
            java.lang.Class<ay0.k> r0 = ay0.C39656k.class
            ea3.v r1 = r10.f118486R1
            r2 = 1
            if (r1 != 0) goto L_0x0008
            goto L_0x000a
        L_0x0008:
            r1.f123367j = r2
        L_0x000a:
            boolean r1 = r10.mo63699I9()
            if (r1 != 0) goto L_0x00f0
            boolean r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.m48034d()
            r3 = 0
            if (r1 == 0) goto L_0x0037
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r4 = "float_ball_key"
            java.lang.String r1 = r1.getStringExtra(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0037
            com.tencent.mm.plugin.webview.ui.tools.floatball.d r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.f118783a
            gy3.C87412m.m108591d(r1)
            com.tencent.mm.plugin.webview.core.y r1 = r4.mo68421c(r1)
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController
            if (r4 == 0) goto L_0x0037
            r3 = r1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r3 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController) r3
        L_0x0037:
            if (r3 == 0) goto L_0x003f
            r10.f109621M2 = r3
            r10.f118515c1 = r2
            goto L_0x00f0
        L_0x003f:
            androidx.appcompat.app.AppCompatActivity r5 = r10.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108593f(r5, r1)
            rx3.g r1 = r10.f109619K2
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            te3.ah4 r1 = (te3.ah4) r1
            android.content.Intent r7 = r10.getIntent()
            ay0.k r2 = ay0.C39656k.f106417a
            monitor-enter(r0)
            java.lang.String r2 = "tmplParams"
            gy3.C87412m.m108594g(r1, r2)     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "intent"
            gy3.C87412m.m108594g(r7, r2)     // Catch:{ all -> 0x00ed }
            long r8 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r3.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "[obtainPreloadWebview]tmplParams:"
            r3.append(r4)     // Catch:{ all -> 0x00ed }
            int r4 = r1.f130536d     // Catch:{ all -> 0x00ed }
            r3.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r3)     // Catch:{ all -> 0x00ed }
            ay0.k r2 = ay0.C39656k.f106417a     // Catch:{ all -> 0x00ed }
            int r6 = r1.f130536d     // Catch:{ all -> 0x00ed }
            r4 = r2
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r1 = r4.mo62220c(r5, r6, r7, r8)     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x00ea
            androidx.appcompat.app.AppCompatActivity r1 = r10.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r1, r3)
            rx3.g r3 = r10.f109619K2
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            te3.ah4 r3 = (te3.ah4) r3
            monitor-enter(r0)
            java.lang.String r4 = "tmplParams"
            gy3.C87412m.m108594g(r3, r4)     // Catch:{ all -> 0x00e7 }
            long r4 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
            r7.<init>()     // Catch:{ all -> 0x00e7 }
            java.lang.String r8 = "[obtainTmplWebView]tmplParams:"
            r7.append(r8)     // Catch:{ all -> 0x00e7 }
            int r8 = r3.f130536d     // Catch:{ all -> 0x00e7 }
            r7.append(r8)     // Catch:{ all -> 0x00e7 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00e7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r6, r7)     // Catch:{ all -> 0x00e7 }
            android.content.MutableContextWrapper r6 = new android.content.MutableContextWrapper     // Catch:{ all -> 0x00e7 }
            r6.<init>(r1)     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r1 = r2.mo62219b(r3, r6)     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x00e5
            com.tencent.mm.ui.widget.MMWebView r2 = r1.f117553a     // Catch:{ all -> 0x00e7 }
            wc3.h0 r3 = r2.getPerformanceHelper()     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = "onCreateStart"
            r3.mo73829a(r6, r4)     // Catch:{ all -> 0x00e7 }
            wc3.h0 r2 = r2.getPerformanceHelper()     // Catch:{ all -> 0x00e7 }
            java.lang.String r3 = "onCreateEnd"
            long r4 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()     // Catch:{ all -> 0x00e7 }
            r2.mo73829a(r3, r4)     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r0)
            goto L_0x00ea
        L_0x00e7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ea:
            r10.f109621M2 = r1
            goto L_0x00f0
        L_0x00ed:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f0:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r10.f109621M2
            if (r0 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            ea3.v r1 = r10.f118486R1
            r0.f117569i = r1
        L_0x00f9:
            java.lang.String r0 = r10.f109617I2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onResetAfterCreate isForceUrl="
            r1.append(r2)
            boolean r2 = r10.mo63699I9()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            super.mo63703Y8()
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r10.f109621M2
            if (r0 == 0) goto L_0x0154
            java.lang.String r1 = r10.f109617I2
            java.lang.String r2 = "Abe-Debug createWebViewController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r1 = r10.f118515c1
            if (r1 != 0) goto L_0x012f
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 r1 = r10.f118578x2
            java.lang.String r2 = "defaultWebViewInterceptor"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo67679J(r1)
        L_0x012f:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$d r1 = r10.f109622N2
            r0.mo67741p(r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r10.f109621M2
            gy3.C87412m.m108591d(r0)
            com.tencent.mm.plugin.webview.core.c0 r0 = r0.f117542P
            long r1 = r10.f109618J2
            com.tencent.mm.plugin.webview.core.BaseWebViewController$g0 r0 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController.C43485g0) r0
            com.tencent.mm.plugin.webview.core.BaseWebViewController r3 = r0.f117614a
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r3.mo67712d0()
            com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r0.f117614a
            rx3.g r0 = r0.f117541O
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r3.postDelayed(r0, r1)
        L_0x0154:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$b r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI$b
            r0.<init>(r10)
            r10.f118549o2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.TmplWebViewToolUI.mo63703Y8():void");
    }

    public void onDestroy() {
        MpWebViewController mpWebViewController = this.f109621M2;
        if (mpWebViewController != null) {
            mpWebViewController.mo67756y(this.f109622N2);
        }
        super.onDestroy();
    }

    /* renamed from: r9 */
    public boolean mo63704r9() {
        return !mo63699I9();
    }
}
