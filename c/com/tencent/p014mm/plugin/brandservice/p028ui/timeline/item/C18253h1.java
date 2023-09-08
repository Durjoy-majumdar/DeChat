package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kw0.C46746a;
import p243tn.C14050a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C77630j;
import te3.ne4;
import te3.oe4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1 */
public final class C18253h1 extends C18366u2 {

    /* renamed from: A */
    public final C13601g f50481A = C36568h.m40985a(new C18267h(this));

    /* renamed from: B */
    public final C13601g f50482B = C36568h.m40985a(new C18268i(this));

    /* renamed from: C */
    public final C13601g f50483C = C36568h.m40985a(new C18270k(this));

    /* renamed from: D */
    public final C13601g f50484D = C36568h.m40985a(new C18269j(this));

    /* renamed from: E */
    public final C13601g f50485E = C36568h.m40985a(new C18271l(this));

    /* renamed from: F */
    public final C13601g f50486F = C36568h.m40985a(new C18272m(this));

    /* renamed from: G */
    public final C13601g f50487G = C36568h.m40985a(new C18275p(this));

    /* renamed from: H */
    public final C13601g f50488H = C36568h.m40985a(new C18273n(this));

    /* renamed from: I */
    public final C13601g f50489I = C36568h.m40985a(new C18274o(this));

    /* renamed from: J */
    public final C13601g f50490J = C36568h.m40985a(new C18276q(this));

    /* renamed from: K */
    public final C13601g f50491K = C36568h.m40985a(new C18278s(this));

    /* renamed from: L */
    public final C13601g f50492L = C36568h.m40985a(new C18277r(this));

    /* renamed from: d */
    public final View f50493d;

    /* renamed from: e */
    public final C18508z2 f50494e;

    /* renamed from: f */
    public final Context f50495f;

    /* renamed from: g */
    public final String f50496g = "MicroMsg.BizTLRecCardMissedSubscription";

    /* renamed from: h */
    public final int f50497h = 1;

    /* renamed from: i */
    public final C13601g f50498i = C36568h.m40985a(new C18258c(this));

    /* renamed from: j */
    public final C13601g f50499j = C36568h.m40985a(new C18264f(this));

    /* renamed from: k */
    public final C13601g f50500k = C36568h.m40985a(new C18256b(this));

    /* renamed from: l */
    public final C13601g f50501l = C36568h.m40985a(new C18254a(this));

    /* renamed from: m */
    public final C13601g f50502m = C36568h.m40985a(new C18279t(this));

    /* renamed from: n */
    public final C13601g f50503n = C36568h.m40985a(new C18265f0(this));

    /* renamed from: o */
    public final C13601g f50504o = C36568h.m40985a(new C18280u(this));

    /* renamed from: p */
    public final C13601g f50505p = C36568h.m40985a(new C18281v(this));

    /* renamed from: q */
    public final C13601g f50506q = C36568h.m40985a(new C18283x(this));

    /* renamed from: r */
    public final C13601g f50507r = C36568h.m40985a(new C18282w(this));

    /* renamed from: s */
    public final C13601g f50508s = C36568h.m40985a(new C18284y(this));

    /* renamed from: t */
    public final C13601g f50509t = C36568h.m40985a(new C18285z(this));

    /* renamed from: u */
    public final C13601g f50510u = C36568h.m40985a(new C18255a0(this));

    /* renamed from: v */
    public final C13601g f50511v = C36568h.m40985a(new C18261d0(this));

    /* renamed from: w */
    public final C13601g f50512w = C36568h.m40985a(new C18259c0(this));

    /* renamed from: x */
    public final C13601g f50513x = C36568h.m40985a(new C18257b0(this));

    /* renamed from: y */
    public final C13601g f50514y = C36568h.m40985a(new C18263e0(this));

    /* renamed from: z */
    public final C13601g f50515z = C36568h.m40985a(new C18266g(this));

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$a */
    public static final class C18254a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18254a(C18253h1 h1Var) {
            super(0);
            this.f50516d = h1Var;
        }

        public Object invoke() {
            return (ImageView) this.f50516d.mo22859i().findViewById(C0966R.C0970id.nip);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$a0 */
    public static final class C18255a0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18255a0(C18253h1 h1Var) {
            super(0);
            this.f50517d = h1Var;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f50517d.mo22861k()).inflate(C0966R.C0971layout.f359624d14, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$b */
    public static final class C18256b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18256b(C18253h1 h1Var) {
            super(0);
            this.f50518d = h1Var;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f50518d.mo22861k()).inflate(C0966R.C0971layout.d0z, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$b0 */
    public static final class C18257b0 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18257b0(C18253h1 h1Var) {
            super(0);
            this.f50519d = h1Var;
        }

        public Object invoke() {
            return (ImageView) this.f50519d.mo22869s().findViewById(C0966R.C0970id.f357521nj1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$c */
    public static final class C18258c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18258c(C18253h1 h1Var) {
            super(0);
            this.f50520d = h1Var;
        }

        public Object invoke() {
            View inflate = ((ViewStub) this.f50520d.f50493d.findViewById(C0966R.C0970id.nqz)).inflate();
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) inflate;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$c0 */
    public static final class C18259c0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18259c0(C18253h1 h1Var) {
            super(0);
            this.f50521d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50521d.mo22869s().findViewById(C0966R.C0970id.f357523nj3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$d */
    public static final class C18260d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50522d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f50523e;

        /* renamed from: f */
        public final /* synthetic */ ne4 f50524f;

        /* renamed from: g */
        public final /* synthetic */ oe4 f50525g;

        /* renamed from: h */
        public final /* synthetic */ int f50526h;

        public C18260d(C18253h1 h1Var, C19623o0 o0Var, ne4 ne4, oe4 oe4, int i) {
            this.f50522d = h1Var;
            this.f50523e = o0Var;
            this.f50524f = ne4;
            this.f50525g = oe4;
            this.f50526h = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00e4 A[SYNTHETIC, Splitter:B:14:0x00e4] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r21) {
            /*
                r20 = this;
                r6 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r21
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$loadCommon$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r20
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.brandservice.ui.timeline.item.h1 r0 = r6.f50522d
                com.tencent.mm.storage.o0 r1 = r6.f50523e
                te3.ne4 r2 = r6.f50524f
                te3.oe4 r3 = r6.f50525g
                int r4 = r6.f50526h
                java.lang.Class<ex0.d> r5 = ex0.C45696d.class
                if (r2 == 0) goto L_0x0115
                r0.getClass()
                te3.me4 r7 = r1.mo25773w2()
                if (r7 == 0) goto L_0x0115
                te3.me4 r7 = r1.mo25773w2()
                gy3.C87412m.m108591d(r7)
                te3.oe4 r7 = r7.f64240e
                if (r7 != 0) goto L_0x0044
                goto L_0x0115
            L_0x0044:
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 1149(0x47d, double:5.677E-321)
                r11 = 4
                r13 = 1
                r15 = 0
                r8.idkeyStat(r9, r11, r13, r15)
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.String r9 = r2.f64284g
                r10 = 0
                r8[r10] = r9
                java.lang.String r9 = "MicroMsg.BizTimeLineItem"
                java.lang.String r11 = "onClick jump to url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r8)
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                java.lang.String r11 = r2.f64284g
                r12 = 169(0xa9, float:2.37E-43)
                r13 = 10000(0x2710, float:1.4013E-41)
                long r14 = java.lang.System.currentTimeMillis()
                int r15 = (int) r14
                int r15 = r15 / 1000
                java.lang.String r11 = com.tencent.p014mm.message.C92721n.m116874b(r11, r12, r13, r15, r1)
                java.lang.String r12 = "rawUrl"
                r8.putExtra(r12, r11)
                r12 = 56
                java.lang.String r13 = "geta8key_scene"
                r8.putExtra(r13, r12)
                java.lang.String r12 = r3.f64334d
                java.lang.String r13 = "geta8key_username"
                r8.putExtra(r13, r12)
                java.lang.String r12 = r3.f64334d
                java.lang.String r13 = "srcUsername"
                r8.putExtra(r13, r12)
                java.lang.String r3 = r3.f64335e
                java.lang.String r12 = "srcDisplayname"
                r8.putExtra(r12, r3)
                java.lang.String r3 = "rec_card"
                java.lang.String r12 = "prePublishId"
                r8.putExtra(r12, r3)
                java.lang.String r12 = "KPublisherId"
                r8.putExtra(r12, r3)
                k40.a r3 = f40.C86709a0.m107533q(r5)
                ex0.d r3 = (ex0.C45696d) r3
                boolean r3 = r3.mo70957E5(r7)
                if (r3 == 0) goto L_0x00d3
                k40.a r3 = f40.C86709a0.m107533q(r5)
                r12 = r3
                ex0.d r12 = (ex0.C45696d) r12
                android.content.Context r13 = r0.f50495f
                int r15 = r2.f64288n
                r16 = 0
                r17 = 169(0xa9, float:2.37E-43)
                r18 = 10000(0x2710, float:1.4013E-41)
                r14 = r11
                r19 = r8
                boolean r2 = r12.Ms0(r13, r14, r15, r16, r17, r18, r19)
                if (r2 == 0) goto L_0x00d3
                java.lang.String r2 = "jump to TmplWebview"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                goto L_0x00de
            L_0x00d3:
                android.content.Context r2 = r0.f50495f
                r3 = 0
                java.lang.String r5 = "webview"
                java.lang.String r7 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r2, r5, r7, r8, r3)
            L_0x00de:
                te3.re4 r2 = r1.mo25774x2()
                if (r2 == 0) goto L_0x010f
                android.net.Uri r3 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x00fc }
                java.lang.String r5 = "idx"
                java.lang.String r5 = r3.getQueryParameter(r5)     // Catch:{ Exception -> 0x00fc }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r10)     // Catch:{ Exception -> 0x00fc }
                java.lang.String r5 = "mid"
                java.lang.String r3 = r3.getQueryParameter(r5)     // Catch:{ Exception -> 0x00fc }
                r7 = 0
                com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r7)     // Catch:{ Exception -> 0x00fc }
            L_0x00fc:
                qx0.a$a r3 = qx0.C22136a.C22137a.CLICK_REC
                qx0.C22136a.f62624g = r1
                int r5 = qx0.C22136a.f62622e
                qx0.C22136a.f62623f = r5
                qx0.C22136a.f62625h = r11
                qx0.C22136a.f62626i = r3
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r0.f50494e
                com.tencent.mm.plugin.brandservice.ui.timeline.m3 r3 = r3.f51443n
                r3.mo22976c(r1, r2)
            L_0x010f:
                com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50494e
                r0.mo23141f(r1, r4)
                goto L_0x011c
            L_0x0115:
                java.lang.String r0 = r0.f50496g
                java.lang.String r1 = "onAppMsgClick appMsg is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            L_0x011c:
                java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$loadCommon$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18253h1.C18260d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$d0 */
    public static final class C18261d0 extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18261d0(C18253h1 h1Var) {
            super(0);
            this.f50527d = h1Var;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f50527d.mo22869s().findViewById(C0966R.C0970id.nj5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$e */
    public static final class C18262e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50528d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f50529e;

        /* renamed from: f */
        public final /* synthetic */ ne4 f50530f;

        /* renamed from: g */
        public final /* synthetic */ int f50531g;

        public C18262e(C18253h1 h1Var, C19623o0 o0Var, ne4 ne4, oe4 oe4, int i) {
            this.f50528d = h1Var;
            this.f50529e = o0Var;
            this.f50530f = ne4;
            this.f50531g = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$loadCommon$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C18253h1 h1Var = this.f50528d;
            C87412m.m108593f(view, "view");
            C19623o0 o0Var = this.f50529e;
            ne4 ne4 = this.f50530f;
            int i = this.f50531g;
            h1Var.getClass();
            if (ne4 != null) {
                C77630j jVar = new C77630j();
                jVar.f226325d = ne4.f64282e;
                jVar.f226326e = ne4.f64284g;
                jVar.f226333o = ne4.f64288n;
                jVar.f226330i = ne4.f64285h;
                jVar.f226312D = ne4.f64286i;
                h1Var.f50494e.f51436d.f50233d.mo35421d(view, o0Var, jVar, i, true);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$loadCommon$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$e0 */
    public static final class C18263e0 extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18263e0(C18253h1 h1Var) {
            super(0);
            this.f50532d = h1Var;
        }

        public Object invoke() {
            return (ImageView) this.f50532d.mo22869s().findViewById(C0966R.C0970id.l5y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$f */
    public static final class C18264f extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18264f(C18253h1 h1Var) {
            super(0);
            this.f50533d = h1Var;
        }

        public Object invoke() {
            return this.f50533d.f50493d.getContext();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$f0 */
    public static final class C18265f0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18265f0(C18253h1 h1Var) {
            super(0);
            this.f50534d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50534d.mo22859i().findViewById(C0966R.C0970id.nis);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$g */
    public static final class C18266g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50535d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18266g(C18253h1 h1Var) {
            super(0);
            this.f50535d = h1Var;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f50535d.mo22861k()).inflate(C0966R.C0971layout.f359621d11, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$h */
    public static final class C18267h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18267h(C18253h1 h1Var) {
            super(0);
            this.f50536d = h1Var;
        }

        public Object invoke() {
            return (ImageView) this.f50536d.mo22862l().findViewById(C0966R.C0970id.niu);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$i */
    public static final class C18268i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18268i(C18253h1 h1Var) {
            super(0);
            this.f50537d = h1Var;
        }

        public Object invoke() {
            return this.f50537d.mo22862l().findViewById(C0966R.C0970id.nod);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$j */
    public static final class C18269j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18269j(C18253h1 h1Var) {
            super(0);
            this.f50538d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50538d.mo22863m().findViewById(C0966R.C0970id.nn9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$k */
    public static final class C18270k extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18270k(C18253h1 h1Var) {
            super(0);
            this.f50539d = h1Var;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f50539d.mo22863m().findViewById(C0966R.C0970id.gl8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$l */
    public static final class C18271l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50540d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18271l(C18253h1 h1Var) {
            super(0);
            this.f50540d = h1Var;
        }

        public Object invoke() {
            return this.f50540d.mo22862l().findViewById(C0966R.C0970id.nqv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$m */
    public static final class C18272m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18272m(C18253h1 h1Var) {
            super(0);
            this.f50541d = h1Var;
        }

        public Object invoke() {
            return this.f50541d.mo22864n().findViewById(C0966R.C0970id.noa);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$n */
    public static final class C18273n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18273n(C18253h1 h1Var) {
            super(0);
            this.f50542d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50542d.mo22865o().findViewById(C0966R.C0970id.nn9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$o */
    public static final class C18274o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18274o(C18253h1 h1Var) {
            super(0);
            this.f50543d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50543d.mo22865o().findViewById(C0966R.C0970id.hx8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$p */
    public static final class C18275p extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18275p(C18253h1 h1Var) {
            super(0);
            this.f50544d = h1Var;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f50544d.mo22865o().findViewById(C0966R.C0970id.nn7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$q */
    public static final class C18276q extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18276q(C18253h1 h1Var) {
            super(0);
            this.f50545d = h1Var;
        }

        public Object invoke() {
            return this.f50545d.mo22864n().findViewById(C0966R.C0970id.nob);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$r */
    public static final class C18277r extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18277r(C18253h1 h1Var) {
            super(0);
            this.f50546d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50546d.mo22866p().findViewById(C0966R.C0970id.hx8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$s */
    public static final class C18278s extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18278s(C18253h1 h1Var) {
            super(0);
            this.f50547d = h1Var;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f50547d.mo22866p().findViewById(C0966R.C0970id.nog);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$t */
    public static final class C18279t extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18279t(C18253h1 h1Var) {
            super(0);
            this.f50548d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50548d.mo22859i().findViewById(C0966R.C0970id.nir);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$u */
    public static final class C18280u extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18280u(C18253h1 h1Var) {
            super(0);
            this.f50549d = h1Var;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f50549d.mo22861k()).inflate(C0966R.C0971layout.f359623d13, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$v */
    public static final class C18281v extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18281v(C18253h1 h1Var) {
            super(0);
            this.f50550d = h1Var;
        }

        public Object invoke() {
            return (ImageView) this.f50550d.mo22868r().findViewById(C0966R.C0970id.niw);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$w */
    public static final class C18282w extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18282w(C18253h1 h1Var) {
            super(0);
            this.f50551d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50551d.mo22868r().findViewById(C0966R.C0970id.niy);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$x */
    public static final class C18283x extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18283x(C18253h1 h1Var) {
            super(0);
            this.f50552d = h1Var;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f50552d.mo22868r().findViewById(C0966R.C0970id.niz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$y */
    public static final class C18284y extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18284y(C18253h1 h1Var) {
            super(0);
            this.f50553d = h1Var;
        }

        public Object invoke() {
            return this.f50553d.mo22868r().findViewById(C0966R.C0970id.f357520nj0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h1$z */
    public static final class C18285z extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18253h1 f50554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18285z(C18253h1 h1Var) {
            super(0);
            this.f50554d = h1Var;
        }

        public Object invoke() {
            return (TextView) this.f50554d.mo22868r().findViewById(C0966R.C0970id.hx8);
        }
    }

    public C18253h1(View view, C18508z2 z2Var, Context context) {
        C87412m.m108594g(view, "viewParent");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50493d = view;
        this.f50494e = z2Var;
        this.f50495f = context;
    }

    /* renamed from: v */
    public static /* synthetic */ void m18844v(C18253h1 h1Var, View view, ImageView imageView, C19623o0 o0Var, oe4 oe4, ne4 ne4, int i, int i2, Object obj) {
        h1Var.mo22871u(view, imageView, o0Var, oe4, ne4, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22815a(com.tencent.p014mm.storage.C19623o0 r32, int r33, android.view.View r34, android.view.View r35) {
        /*
            r31 = this;
            r9 = r31
            r3 = r32
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "convertView"
            r1 = r34
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "parent"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            android.widget.LinearLayout r0 = r31.mo22860j()
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0.setVisibility(r10)
            r9.f50327a = r3
            te3.me4 r0 = r32.mo25773w2()
            r12 = 1
            if (r0 == 0) goto L_0x009a
            com.tencent.mm.storage.o0 r0 = r9.f50327a
            te3.re4 r0 = r0.mo25774x2()
            if (r0 == 0) goto L_0x009a
            com.tencent.mm.storage.o0 r0 = r9.f50327a
            te3.re4 r0 = r0.mo25774x2()
            te3.wx2 r0 = r0.f64532x
            if (r0 != 0) goto L_0x0040
            goto L_0x009a
        L_0x0040:
            com.tencent.mm.storage.o0 r0 = r9.f50327a
            te3.me4 r0 = r0.mo25773w2()
            te3.oe4 r0 = r0.f64240e
            com.tencent.mm.storage.o0 r1 = r9.f50327a
            te3.me4 r1 = r1.mo25773w2()
            java.util.LinkedList<te3.ne4> r1 = r1.f64242g
            if (r0 == 0) goto L_0x0092
            java.lang.String r2 = r0.f64334d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x005b
            goto L_0x0092
        L_0x005b:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = r9.f50496g
            java.lang.String r1 = "appMsg == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x00a1
        L_0x0069:
            com.tencent.mm.storage.o0 r1 = r9.f50327a
            te3.re4 r1 = r1.mo25774x2()
            te3.wx2 r1 = r1.f64532x
            int r1 = r1.f186234e
            if (r1 != r12) goto L_0x0090
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r0 = r0.f64334d
            com.tencent.mm.storage.z1 r0 = r1.get(r0)
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            r0 = 1
            goto L_0x00a2
        L_0x0092:
            java.lang.String r0 = r9.f50496g
            java.lang.String r1 = "bizInfo == null || Util.isNullOrNil(bizInfo.UserName)"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x00a1
        L_0x009a:
            java.lang.String r0 = r9.f50496g
            java.lang.String r1 = "info.tlRecCard == null || info.tlRecCardWrapper == null || info.tlRecCardWrapper.missedInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = r9.f50496g
            java.lang.String r1 = "check fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.storage.o0 r0 = r9.f50327a
            if (r0 != 0) goto L_0x00b0
            goto L_0x00bb
        L_0x00b0:
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r1 = r9.f50327a
            long r1 = r1.field_msgId
            r0.mo25785Lo(r1)
        L_0x00bb:
            return
        L_0x00bc:
            kw0.a r13 = kw0.C46746a.f125826a
            android.widget.LinearLayout r14 = r31.mo22860j()
            android.content.Context r0 = r31.mo22861k()
            r8 = 8
            int r0 = kg3.C76577a.m92151b(r0, r8)
            float r15 = (float) r0
            r16 = 0
            r17 = 0
            r18 = 12
            r19 = 0
            kw0.C46746a.m52038k(r13, r14, r15, r16, r17, r18, r19)
            android.widget.LinearLayout r0 = r31.mo22860j()
            r0.removeAllViews()
            te3.me4 r0 = r32.mo25773w2()
            if (r0 == 0) goto L_0x01f0
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x00f3
            goto L_0x01f0
        L_0x00f3:
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            java.lang.Object r0 = r0.getFirst()
            te3.ne4 r0 = (te3.ne4) r0
            te3.me4 r1 = r32.mo25773w2()
            te3.oe4 r1 = r1.f64240e
            android.widget.LinearLayout r2 = r31.mo22860j()
            android.view.View r4 = r31.mo22859i()
            r2.addView(r4)
            android.view.View r2 = r31.mo22859i()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.i1 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.i1
            r4.<init>(r9, r1)
            r2.setOnClickListener(r4)
            android.view.View r2 = r31.mo22859i()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.j1 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.j1
            r4.<init>(r9)
            r2.setOnLongClickListener(r4)
            android.view.View r2 = r31.mo22859i()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.k1 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.k1
            r4.<init>(r9)
            r2.setOnTouchListener(r4)
            android.view.View r2 = r31.mo22859i()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r4 = -1
            r2.width = r4
            r4 = -2
            r2.height = r4
            java.lang.Class<ln.i> r2 = p196ln.C76708i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.i r2 = (p196ln.C76708i) r2
            java.lang.String r4 = r1.f64334d
            android.graphics.Bitmap r2 = r2.N50(r4)
            r4 = 2
            if (r2 == 0) goto L_0x016b
            int r5 = r2.getWidth()
            int r5 = r5 / r4
            float r5 = (float) r5
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r10, r5)
            rx3.g r5 = r9.f50501l
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5.setImageBitmap(r2)
            goto L_0x0194
        L_0x016b:
            hc0.c$b r2 = new hc0.c$b
            r2.<init>()
            r5 = 2131231376(0x7f080290, float:1.8078831E38)
            r2.f59361q = r5
            r2.f59347c = r12
            java.lang.String r5 = "missedSubscription"
            r2.f59344B = r5
            r2.f59364t = r12
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r6 = r1.f64339i
            rx3.g r7 = r9.f50501l
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            hc0.c r2 = r2.mo32666a()
            r5.mo32519h(r6, r7, r2)
        L_0x0194:
            android.widget.TextView r2 = r31.mo22867q()
            java.lang.String r1 = r1.f64335e
            r2.setText(r1)
            fy0.i r1 = fy0.C8219i.f27144a
            android.widget.TextView r2 = r31.mo22867q()
            r1.mo9271b(r2)
            te3.re4 r1 = r32.mo25774x2()
            te3.wx2 r1 = r1.f64532x
            if (r1 == 0) goto L_0x01e9
            int r1 = r1.f186233d
            if (r1 != r12) goto L_0x01d1
            android.widget.TextView r1 = r31.mo22870t()
            r1.setVisibility(r10)
            android.widget.TextView r1 = r31.mo22870t()
            android.content.Context r2 = r31.mo22861k()
            int r0 = r0.f64293s
            long r4 = (long) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r0
            long r4 = r4 * r6
            java.lang.String r0 = fy0.C8218c.m8301a(r2, r4)
            r1.setText(r0)
            goto L_0x01f0
        L_0x01d1:
            if (r1 != r4) goto L_0x01e1
            android.widget.TextView r0 = r31.mo22870t()
            te3.me4 r1 = r32.mo25773w2()
            java.lang.String r1 = r1.f64239d
            r0.setText(r1)
            goto L_0x01f0
        L_0x01e1:
            android.widget.TextView r0 = r31.mo22870t()
            r0.setVisibility(r8)
            goto L_0x01f0
        L_0x01e9:
            android.widget.TextView r0 = r31.mo22870t()
            r0.setVisibility(r8)
        L_0x01f0:
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            int r1 = r0.size()
            r13 = 5
            java.lang.String r2 = "bizInfo"
            if (r1 != r12) goto L_0x0369
            java.lang.Object r0 = r0.getFirst()
            te3.ne4 r0 = (te3.ne4) r0
            int r0 = r0.f64297w
            int r1 = r9.f50497h
            java.lang.String r4 = "appMsg"
            if (r0 != r1) goto L_0x023e
            te3.me4 r0 = r32.mo25773w2()
            if (r0 == 0) goto L_0x06a5
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0221
            goto L_0x06a5
        L_0x0221:
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            java.lang.Object r0 = r0.getFirst()
            te3.ne4 r0 = (te3.ne4) r0
            te3.me4 r1 = r32.mo25773w2()
            te3.oe4 r1 = r1.f64240e
            gy3.C87412m.m108593f(r0, r4)
            gy3.C87412m.m108593f(r1, r2)
            r9.mo22872w(r0, r1, r10)
            goto L_0x06a5
        L_0x023e:
            te3.me4 r0 = r32.mo25773w2()
            if (r0 == 0) goto L_0x06a5
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0252
            goto L_0x06a5
        L_0x0252:
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            java.lang.Object r0 = r0.getFirst()
            r14 = r0
            te3.ne4 r14 = (te3.ne4) r14
            te3.me4 r0 = r32.mo25773w2()
            te3.oe4 r5 = r0.f64240e
            android.view.View r1 = r31.mo22868r()
            java.lang.String r0 = "singleContainer"
            gy3.C87412m.m108593f(r1, r0)
            rx3.g r0 = r9.f50505p
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r0 = "singleCoverIv"
            gy3.C87412m.m108593f(r6, r0)
            gy3.C87412m.m108593f(r5, r2)
            gy3.C87412m.m108593f(r14, r4)
            r7 = 0
            r15 = 32
            r16 = 0
            r0 = r31
            r2 = r6
            r3 = r32
            r4 = r5
            r5 = r14
            r6 = r7
            r7 = r15
            r15 = 8
            r8 = r16
            m18844v(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            rx3.g r0 = r9.f50506q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.MMNeat7extView r0 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r0
            java.lang.String r1 = "singleTitleTv"
            gy3.C87412m.m108593f(r0, r1)
            rx3.g r1 = r9.f50507r
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r9.mo22873x(r0, r1, r14, r10)
            int r0 = r14.f64288n
            if (r0 != r13) goto L_0x02bd
            goto L_0x02be
        L_0x02bd:
            r12 = 0
        L_0x02be:
            if (r12 == 0) goto L_0x031c
            rx3.g r0 = r9.f50508s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r12.mo10233c(r11)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r4 = "fillingSingle"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r3 = "fillingSingle"
            java.lang.String r4 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            rx3.g r0 = r9.f50509t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r14.f64292r
            java.lang.String r1 = com.tencent.p014mm.message.C92721n.m116876d(r1)
            r0.setText(r1)
            goto L_0x06a5
        L_0x031c:
            rx3.g r0 = r9.f50508s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11.mo10233c(r1)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r4 = "fillingSingle"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r3 = "fillingSingle"
            java.lang.String r4 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x0369:
            r15 = 8
            java.lang.Object r1 = r0.getFirst()
            r14 = r1
            te3.ne4 r14 = (te3.ne4) r14
            java.lang.Object r0 = r0.get(r12)
            r8 = r0
            te3.ne4 r8 = (te3.ne4) r8
            java.lang.String r0 = "topAppMsg"
            gy3.C87412m.m108593f(r14, r0)
            java.lang.String r0 = "secondAppMsg"
            gy3.C87412m.m108593f(r8, r0)
            te3.me4 r0 = r32.mo25773w2()
            if (r0 == 0) goto L_0x06a5
            te3.me4 r0 = r32.mo25773w2()
            java.util.LinkedList<te3.ne4> r0 = r0.f64242g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0399
            goto L_0x06a5
        L_0x0399:
            te3.me4 r0 = r32.mo25773w2()
            te3.oe4 r7 = r0.f64240e
            int r0 = r14.f64288n
            if (r0 != r13) goto L_0x03a5
            r0 = 1
            goto L_0x03a6
        L_0x03a5:
            r0 = 0
        L_0x03a6:
            java.lang.String r1 = "multiTopCoverIv"
            java.lang.String r4 = "multiTopContainer"
            if (r0 == 0) goto L_0x05d8
            gy3.C87412m.m108593f(r7, r2)
            android.view.View r2 = r31.mo22862l()
            gy3.C87412m.m108593f(r2, r4)
            rx3.g r0 = r9.f50481A
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            gy3.C87412m.m108593f(r4, r1)
            r6 = 0
            r13 = 32
            r16 = 0
            r0 = r31
            r1 = r2
            r2 = r4
            r3 = r32
            r4 = r7
            r5 = r14
            r20 = r7
            r7 = r13
            r13 = r8
            r8 = r16
            m18844v(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            android.view.View r0 = r31.mo22863m()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1.mo10233c(r2)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r24 = "loadMultiVideoTop"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r1 = r1.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r23 = "loadMultiVideoTop"
            java.lang.String r24 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            android.view.View r0 = r31.mo22864n()
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r11)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r4 = "loadMultiVideoTop"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r1 = r0
            r12 = r8
            r8 = r16
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r3 = "loadMultiVideoTop"
            java.lang.String r4 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r14.f64284g
            java.lang.String r0 = r9.mo22858h(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 0
            if (r0 == 0) goto L_0x0518
            android.view.View r2 = r31.mo22866p()
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r11)
            java.lang.Object[] r22 = r0.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r24 = "loadMultiVideoTop"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r2
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r4 = "loadMultiVideoTop"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r0 = r31.mo22865o()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2.mo10233c(r3)
            java.lang.Object[] r22 = r2.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r24 = "loadMultiVideoTop"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r23 = "loadMultiVideoTop"
            java.lang.String r24 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            rx3.g r0 = r9.f50491K
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.MMNeat7extView r0 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r0
            java.lang.String r2 = "multiTopVideoCoverNoFriendTitle"
            gy3.C87412m.m108593f(r0, r2)
            r2 = 1
            r9.mo22873x(r0, r1, r14, r2)
            rx3.g r0 = r9.f50492L
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r14.f64292r
            java.lang.String r1 = com.tencent.p014mm.message.C92721n.m116876d(r1)
            r0.setText(r1)
            goto L_0x05d3
        L_0x0518:
            android.view.View r2 = r31.mo22866p()
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r0.mo10233c(r3)
            java.lang.Object[] r22 = r0.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r24 = "loadMultiVideoTop"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r2
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r4 = "loadMultiVideoTop"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r0 = r31.mo22865o()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r22 = r2.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r24 = "loadMultiVideoTop"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r23 = "loadMultiVideoTop"
            java.lang.String r24 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            rx3.g r0 = r9.f50487G
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.MMNeat7extView r0 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r0
            java.lang.String r2 = "multiTopVideoCoverFriendTitle"
            gy3.C87412m.m108593f(r0, r2)
            r2 = 1
            r9.mo22873x(r0, r1, r14, r2)
            rx3.g r0 = r9.f50489I
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r14.f64292r
            java.lang.String r1 = com.tencent.p014mm.message.C92721n.m116876d(r1)
            r0.setText(r1)
            rx3.g r0 = r9.f50488H
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r14.f64284g
            java.lang.String r1 = r9.mo22858h(r1)
            r0.setText(r1)
        L_0x05d3:
            r12 = r20
            r2 = 1
            goto L_0x06a2
        L_0x05d8:
            r12 = r7
            r13 = r8
            gy3.C87412m.m108593f(r12, r2)
            android.view.View r0 = r31.mo22863m()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r19 = "loadMultiMpTop"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r18 = "loadMultiMpTop"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r0 = r31.mo22864n()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r2.mo10233c(r5)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r26 = "loadMultiMpTop"
            java.lang.String r27 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription"
            java.lang.String r25 = "loadMultiMpTop"
            java.lang.String r26 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardBizInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r2 = r31.mo22862l()
            gy3.C87412m.m108593f(r2, r4)
            rx3.g r0 = r9.f50481A
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            gy3.C87412m.m108593f(r4, r1)
            r6 = 0
            r7 = 32
            r8 = 0
            r0 = r31
            r1 = r2
            r2 = r4
            r3 = r32
            r4 = r12
            r5 = r14
            m18844v(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            rx3.g r0 = r9.f50483C
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.MMNeat7extView r0 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r0
            java.lang.String r1 = "multiTopMpCoverTitle"
            gy3.C87412m.m108593f(r0, r1)
            rx3.g r1 = r9.f50484D
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 1
            r9.mo22873x(r0, r1, r14, r2)
        L_0x06a2:
            r9.mo22872w(r13, r12, r2)
        L_0x06a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18253h1.mo22815a(com.tencent.mm.storage.o0, int, android.view.View, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r0 = r2.f129334h;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo22858h(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.d r0 = (ex0.C45696d) r0
            s90.d r2 = r0.pq0(r2)
            if (r2 == 0) goto L_0x0023
            s90.c r0 = r2.f129333g
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.f129329f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0023
            s90.c r2 = r2.f129333g
            java.lang.String r2 = r2.f129329f
            goto L_0x0038
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            s90.b r0 = r2.f129334h
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.f129325d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0036
            s90.b r2 = r2.f129334h
            java.lang.String r2 = r2.f129325d
            goto L_0x0038
        L_0x0036:
            java.lang.String r2 = ""
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18253h1.mo22858h(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public final View mo22859i() {
        return (View) ((C36570n) this.f50500k).getValue();
    }

    /* renamed from: j */
    public final LinearLayout mo22860j() {
        return (LinearLayout) ((C36570n) this.f50498i).getValue();
    }

    /* renamed from: k */
    public final Context mo22861k() {
        return (Context) ((C36570n) this.f50499j).getValue();
    }

    /* renamed from: l */
    public final View mo22862l() {
        return (View) ((C36570n) this.f50515z).getValue();
    }

    /* renamed from: m */
    public final View mo22863m() {
        return (View) ((C36570n) this.f50482B).getValue();
    }

    /* renamed from: n */
    public final View mo22864n() {
        return (View) ((C36570n) this.f50485E).getValue();
    }

    /* renamed from: o */
    public final View mo22865o() {
        return (View) ((C36570n) this.f50486F).getValue();
    }

    /* renamed from: p */
    public final View mo22866p() {
        return (View) ((C36570n) this.f50490J).getValue();
    }

    /* renamed from: q */
    public final TextView mo22867q() {
        return (TextView) ((C36570n) this.f50502m).getValue();
    }

    /* renamed from: r */
    public final View mo22868r() {
        return (View) ((C36570n) this.f50504o).getValue();
    }

    /* renamed from: s */
    public final View mo22869s() {
        return (View) ((C36570n) this.f50510u).getValue();
    }

    /* renamed from: t */
    public final TextView mo22870t() {
        return (TextView) ((C36570n) this.f50503n).getValue();
    }

    /* renamed from: u */
    public final void mo22871u(View view, ImageView imageView, C19623o0 o0Var, oe4 oe4, ne4 ne4, int i) {
        String str;
        C87412m.m108594g(view, "container");
        C87412m.m108594g(imageView, "coverIv");
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(oe4, "bizInfo");
        C87412m.m108594g(ne4, "appMsg");
        mo22860j().addView(view);
        C19623o0 o0Var2 = o0Var;
        ne4 ne42 = ne4;
        oe4 oe42 = oe4;
        int i2 = i;
        view.setOnClickListener(new C18260d(this, o0Var2, ne42, oe42, i2));
        view.setOnLongClickListener(new C18262e(this, o0Var2, ne42, oe42, i2));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        boolean z = false;
        if (!(ne4.f64297w == this.f50497h) || Util.isNullOrNil(ne4.f64286i)) {
            str = ne4.f64285h;
            C87412m.m108593f(str, "this.CoverImgUrl");
        } else {
            str = ne4.f64286i;
            C87412m.m108593f(str, "this.CoverImgUrl_1_1");
        }
        String b = C14050a.m13405b(str);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.color.f3237k_;
        bVar.f59350f = b;
        bVar.f59345a = true;
        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
        if (ne4.f64297w == 0) {
            if (ne4.f64288n == 5) {
                z = true;
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (z) {
                layoutParams2.height = C18508z2.f51414N;
            } else {
                layoutParams2.height = C18508z2.f51412L;
            }
        }
    }

    /* renamed from: w */
    public final void mo22872w(ne4 ne4, oe4 oe4, int i) {
        C87412m.m108594g(ne4, "appMsg");
        C87412m.m108594g(oe4, "bizInfo");
        View s = mo22869s();
        C87412m.m108593f(s, "smallContainer");
        ImageView imageView = (ImageView) ((C36570n) this.f50513x).getValue();
        C87412m.m108593f(imageView, "smallCoverIv");
        C19623o0 o0Var = this.f50327a;
        C87412m.m108593f(o0Var, "info");
        mo22871u(s, imageView, o0Var, oe4, ne4, i);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) ((C36570n) this.f50511v).getValue();
        C87412m.m108593f(mMNeat7extView, "smallTitleTv");
        int i2 = 0;
        mo22873x(mMNeat7extView, (TextView) ((C36570n) this.f50512w).getValue(), ne4, false);
        C46746a.m52038k(C46746a.f125826a, (ImageView) ((C36570n) this.f50513x).getValue(), (float) C76577a.m92151b(mo22861k(), 2), false, false, 12, (Object) null);
        boolean z = ne4.f64288n == 5;
        ImageView imageView2 = (ImageView) ((C36570n) this.f50514y).getValue();
        if (!z) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
    }

    /* renamed from: x */
    public final void mo22873x(MMNeat7extView mMNeat7extView, TextView textView, ne4 ne4, boolean z) {
        C87412m.m108594g(mMNeat7extView, "titleTv");
        C87412m.m108594g(ne4, "appMsg");
        mMNeat7extView.mo104279b(ne4.f64282e);
        mMNeat7extView.setSpacingAdd(C76577a.m92151b(mo22861k(), 2));
        if (z) {
            C8219i.f27144a.mo9272c(mMNeat7extView);
        }
        if (textView != null) {
            String h = mo22858h(ne4.f64284g);
            if (Util.isNullOrNil(h)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(h);
        }
    }
}
