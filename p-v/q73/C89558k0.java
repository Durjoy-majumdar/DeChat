package q73;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kj2.C117407d;
import o40.C61926c;
import p430d.C26973c;
import r73.C89894f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import s73.C48255c;

/* renamed from: q73.k0 */
public final class C89558k0 {

    /* renamed from: a */
    public final C89538a f257722a;

    /* renamed from: b */
    public final String f257723b = "MicroMsg.WebCanvasViewContext";

    /* renamed from: c */
    public final int f257724c;

    /* renamed from: d */
    public final int f257725d;

    /* renamed from: e */
    public MagicBrushView f257726e;

    /* renamed from: q73.k0$d */
    public static final class C27654d implements MagicBrushView.C80321c {

        /* renamed from: a */
        public int f76579a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f76580b;

        /* renamed from: c */
        public final /* synthetic */ C89558k0 f76581c;

        /* renamed from: d */
        public final /* synthetic */ String f76582d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f76583e;

        /* renamed from: q73.k0$d$a */
        public static final class C27655a<T> implements ValueCallback {

            /* renamed from: a */
            public final /* synthetic */ C89558k0 f76584a;

            /* renamed from: b */
            public final /* synthetic */ String f76585b;

            /* renamed from: c */
            public final /* synthetic */ long f76586c;

            public C27655a(C89558k0 k0Var, String str, long j) {
                this.f76584a = k0Var;
                this.f76585b = str;
                this.f76586c = j;
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                String str2 = this.f76584a.f257723b;
                Log.m105918d(str2, "magicBrushView refresh:" + this.f76585b + ", dur:" + (MMSlotKt.now() - this.f76586c) + LocaleUtil.MALAY);
                this.f76584a.f257722a.mo123850m();
            }
        }

        public C27654d(C8477a0 a0Var, C89558k0 k0Var, String str, C8477a0 a0Var2) {
            this.f76580b = a0Var;
            this.f76581c = k0Var;
            this.f76582d = str;
            this.f76583e = a0Var2;
        }

        /* renamed from: b */
        public void mo55504b(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
            C89547f.m111945Y1(this.f76581c.f257722a.mo123839f(), this.f76581c.f257722a.f257660d, 0, 2, (Object) null);
            if (this.f76579a != i) {
                String str = this.f76581c.f257723b;
                Log.m105924i(str, "magicBrushView onSurfaceSizeChanged:" + this.f76582d + " width=" + i + ", height= " + i2);
                C117407d.INSTANCE.mo182089r(1454, 114, 1);
            }
        }

        /* renamed from: e */
        public void mo55505e(Object obj, boolean z) {
            C87412m.m108594g(obj, "surface");
            String str = this.f76581c.f257723b;
            Log.m105918d(str, "onSurfaceDestroyed:" + this.f76582d);
            this.f76583e.f27482d = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
            if (r8 == false) goto L_0x0114;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo55506f(java.lang.Object r7, int r8, int r9, boolean r10, boolean r11) {
            /*
                r6 = this;
                java.lang.String r9 = "surface"
                gy3.C87412m.m108594g(r7, r9)
                gy3.a0 r7 = r6.f76580b
                r9 = 1
                r7.f27482d = r9
                r6.f76579a = r8
                q73.k0 r7 = r6.f76581c
                q73.a r8 = r7.f257722a
                q73.a$g r8 = r8.f257670q
                if (r8 == 0) goto L_0x0017
                long r10 = r8.f95587b
                goto L_0x0019
            L_0x0017:
                r10 = -1
            L_0x0019:
                java.lang.String r7 = r7.f257723b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "magicBrushView onSurfaceAvailable:"
                r8.append(r0)
                java.lang.String r0 = r6.f76582d
                r8.append(r0)
                java.lang.String r0 = ", dur:"
                r8.append(r0)
                long r0 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()
                long r0 = r0 - r10
                r8.append(r0)
                java.lang.String r0 = "ms"
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
                q73.k0 r7 = r6.f76581c
                q73.a r7 = r7.f257722a
                boolean r8 = r7.f257661e
                r0 = 0
                if (r8 == 0) goto L_0x0114
                q73.a$f r8 = r7.f257671r
                if (r8 == 0) goto L_0x0105
                q73.a$e r1 = r7.f257673t
                if (r1 == 0) goto L_0x00fd
                boolean r2 = r1.f95584d
                r73.f$c r3 = r73.C89894f.f258347d
                boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 != r3) goto L_0x0084
                float r2 = r1.f95583c
                float r3 = r7.getFontSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L_0x006a
                r2 = 1
                goto L_0x006b
            L_0x006a:
                r2 = 0
            L_0x006b:
                if (r2 == 0) goto L_0x0084
                int r2 = r1.f95585e
                int r3 = r7.mo123836b()
                if (r2 != r3) goto L_0x0084
                int r2 = r1.f95581a
                int r3 = r8.f257676c
                if (r2 != r3) goto L_0x0084
                int r2 = r1.f95582b
                int r3 = r8.f257675b
                if (r2 == r3) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r2 = 0
                goto L_0x0085
            L_0x0084:
                r2 = 1
            L_0x0085:
                if (r2 == 0) goto L_0x00f8
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "lastDrawChanged: ["
                r3.append(r4)
                int r4 = r1.f95581a
                r3.append(r4)
                java.lang.String r4 = ", "
                r3.append(r4)
                int r5 = r1.f95582b
                r3.append(r5)
                r3.append(r4)
                float r5 = r1.f95583c
                r3.append(r5)
                r3.append(r4)
                boolean r5 = r1.f95584d
                r3.append(r5)
                r3.append(r4)
                int r1 = r1.f95585e
                r3.append(r1)
                java.lang.String r1 = "] to ["
                r3.append(r1)
                int r1 = r8.f257676c
                r3.append(r1)
                r3.append(r4)
                int r8 = r8.f257675b
                r3.append(r8)
                r3.append(r4)
                float r8 = r7.getFontSize()
                r3.append(r8)
                r3.append(r4)
                boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                r3.append(r8)
                r8 = 32
                r3.append(r8)
                int r8 = r7.mo123836b()
                r3.append(r8)
                r8 = 93
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r1 = "MicroMsg.WebCanvasContext"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            L_0x00f8:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
                goto L_0x00fe
            L_0x00fd:
                r8 = 0
            L_0x00fe:
                if (r8 == 0) goto L_0x0105
                boolean r8 = r8.booleanValue()
                goto L_0x0106
            L_0x0105:
                r8 = 1
            L_0x0106:
                if (r8 == 0) goto L_0x0111
                q73.f r1 = r7.mo123839f()
                java.lang.String r7 = r7.f257660d
                r1.mo123866X1(r7, r10)
            L_0x0111:
                if (r8 == 0) goto L_0x0114
                goto L_0x0115
            L_0x0114:
                r9 = 0
            L_0x0115:
                if (r9 == 0) goto L_0x0139
                q73.k0 r7 = r6.f76581c
                java.lang.String r7 = r7.f257723b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "checkDrawChanged:"
                r8.append(r9)
                java.lang.String r9 = r6.f76582d
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                q73.k0 r7 = r6.f76581c
                q73.a r7 = r7.f257722a
                r7.mo123850m()
                goto L_0x014f
            L_0x0139:
                q73.k0 r7 = r6.f76581c
                q73.w r7 = r7.mo123873c()
                q73.k0 r8 = r6.f76581c
                q73.a r9 = r8.f257722a
                java.lang.String r9 = r9.f257660d
                q73.k0$d$a r0 = new q73.k0$d$a
                java.lang.String r1 = r6.f76582d
                r0.<init>(r8, r1, r10)
                r7.mo123886U1(r10, r9, r0)
            L_0x014f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C89558k0.C27654d.mo55506f(java.lang.Object, int, int, boolean, boolean):void");
        }
    }

    /* renamed from: q73.k0$a */
    public static final class C89559a implements C80301a.C80302a {

        /* renamed from: d */
        public final /* synthetic */ C89558k0 f257727d;

        public C89559a(C89558k0 k0Var) {
            this.f257727d = k0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo111581b(int r11) {
            /*
                r10 = this;
                q73.k0 r11 = r10.f257727d
                java.lang.String r11 = r11.f257723b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "first frame! "
                r0.append(r1)
                q73.k0 r1 = r10.f257727d
                q73.a r1 = r1.f257722a
                java.lang.String r1 = r1.f257660d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                d.c r11 = p430d.C26973c.f74981a
                q73.k0 r0 = r10.f257727d
                q73.a r0 = r0.f257722a
                java.lang.String r0 = r0.f257660d
                monitor-enter(r11)
                java.lang.String r1 = "canvasId"
                gy3.C87412m.m108594g(r0, r1)     // Catch:{ all -> 0x008d }
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008d }
                java.util.HashMap<java.lang.String, d.c$a> r3 = p430d.C26973c.f74982b     // Catch:{ all -> 0x008d }
                java.lang.Object r4 = r3.get(r0)     // Catch:{ all -> 0x008d }
                d.c$a r4 = (p430d.C26973c.C26974a) r4     // Catch:{ all -> 0x008d }
                if (r4 == 0) goto L_0x008b
                long r5 = r4.f74985c     // Catch:{ all -> 0x008d }
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 > 0) goto L_0x004b
                java.lang.String r0 = "MicroMsg.WebCanvasRenderTimeReport"
                java.lang.String r1 = "no render start time!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x008d }
                monitor-exit(r11)
                goto L_0x008c
            L_0x004b:
                java.lang.String r5 = "MicroMsg.WebCanvasRenderTimeReport"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r6.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r7 = "reportRenderFinish "
                r6.append(r7)     // Catch:{ all -> 0x008d }
                r6.append(r0)     // Catch:{ all -> 0x008d }
                r7 = 32
                r6.append(r7)     // Catch:{ all -> 0x008d }
                r6.append(r1)     // Catch:{ all -> 0x008d }
                r6.append(r7)     // Catch:{ all -> 0x008d }
                long r7 = r4.f74985c     // Catch:{ all -> 0x008d }
                long r7 = r1 - r7
                r6.append(r7)     // Catch:{ all -> 0x008d }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008d }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x008d }
                java.lang.Class<com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor> r5 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.class
                di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x008d }
                com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r5 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r5     // Catch:{ all -> 0x008d }
                java.lang.String r6 = "BizWebCanvasRenderCost"
                long r7 = r4.f74985c     // Catch:{ all -> 0x008d }
                long r1 = r1 - r7
                int r2 = (int) r1     // Catch:{ all -> 0x008d }
                r5.Ov0(r6, r2, r0)     // Catch:{ all -> 0x008d }
                java.lang.Object r0 = r3.remove(r0)     // Catch:{ all -> 0x008d }
                d.c$a r0 = (p430d.C26973c.C26974a) r0     // Catch:{ all -> 0x008d }
            L_0x008b:
                monitor-exit(r11)
            L_0x008c:
                return
            L_0x008d:
                r0 = move-exception
                monitor-exit(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C89558k0.C89559a.mo111581b(int):void");
        }
    }

    /* renamed from: q73.k0$b */
    public static final class C89560b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C89558k0 f257728d;

        public C89560b(C89558k0 k0Var) {
            this.f257728d = k0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webcanvas/WebCanvasViewContext$elementId$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C89547f f = this.f257728d.f257722a.mo123839f();
            String str = this.f257728d.f257722a.f257660d;
            C87412m.m108593f(motionEvent, "event");
            f.mo118091Z1(str, motionEvent);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webcanvas/WebCanvasViewContext$elementId$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: q73.k0$c */
    public static final class C89561c implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f257729b;

        /* renamed from: c */
        public final /* synthetic */ C89558k0 f257730c;

        /* renamed from: d */
        public final /* synthetic */ String f257731d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f257732e;

        /* renamed from: f */
        public final /* synthetic */ MagicBrushView f257733f;

        /* renamed from: q73.k0$c$b */
        public static final class C27652b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: d */
            public final /* synthetic */ MagicBrushView f76570d;

            /* renamed from: e */
            public final /* synthetic */ C89558k0 f76571e;

            /* renamed from: f */
            public final /* synthetic */ String f76572f;

            /* renamed from: g */
            public final /* synthetic */ C8477a0 f76573g;

            /* renamed from: h */
            public final /* synthetic */ C8477a0 f76574h;

            /* renamed from: q73.k0$c$b$a */
            public static final class C27653a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: B */
                public final /* synthetic */ C8477a0 f76575B;

                /* renamed from: C */
                public final /* synthetic */ C8477a0 f76576C;

                /* renamed from: D */
                public final /* synthetic */ C89558k0 f76577D;

                /* renamed from: E */
                public final /* synthetic */ String f76578E;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C27653a(C8477a0 a0Var, C8477a0 a0Var2, C89558k0 k0Var, String str) {
                    super(0);
                    this.f76575B = a0Var;
                    this.f76576C = a0Var2;
                    this.f76577D = k0Var;
                    this.f76578E = str;
                }

                public Object invoke() {
                    if (!this.f76575B.f27482d && !this.f76576C.f27482d) {
                        C117407d.INSTANCE.mo182089r(1454, 112, 1);
                        String str = this.f76577D.f257723b;
                        Log.m105924i(str, "onAttachedToWindow:" + this.f76578E + " has not surfaceAvailable");
                    }
                    return C13598b0.f38549a;
                }
            }

            public C27652b(MagicBrushView magicBrushView, C89558k0 k0Var, String str, C8477a0 a0Var, C8477a0 a0Var2) {
                this.f76570d = magicBrushView;
                this.f76571e = k0Var;
                this.f76572f = str;
                this.f76573g = a0Var;
                this.f76574h = a0Var2;
            }

            public void onGlobalLayout() {
                this.f76570d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                String str = this.f76571e.f257723b;
                Log.m105918d(str, "onAttachedToWindow:" + this.f76572f + " height= " + this.f76570d.getHeight());
                if (!this.f76573g.f27482d && !this.f76574h.f27482d) {
                    C117407d.INSTANCE.mo182089r(1454, 111, 1);
                    C61926c.m72666K(1000, new C27653a(this.f76573g, this.f76574h, this.f76571e, this.f76572f));
                }
                if (this.f76570d.getHeight() == 0) {
                    String str2 = this.f76571e.f257723b;
                    Log.m105924i(str2, "reflow:" + this.f76572f + " when height == 0");
                    C89567w c = this.f76571e.mo123873c();
                    String str3 = this.f76571e.f257722a.f257660d;
                    c.getClass();
                    C87412m.m108594g(str3, "canvasId");
                    C89547f.m111945Y1(c.f257752B, str3, 0, 2, (Object) null);
                    C117407d.INSTANCE.mo182089r(1454, 113, 1);
                }
            }
        }

        public C89561c(C89558k0 k0Var, MagicBrushView magicBrushView, String str, C8477a0 a0Var, C8477a0 a0Var2) {
            this.f257730c = k0Var;
            this.f257733f = magicBrushView;
            this.f257731d = str;
            this.f257729b = a0Var;
            this.f257732e = a0Var2;
        }

        public void onViewAttachedToWindow(View view) {
            C13601g<Boolean> gVar = C89538a.f257656u;
            if (((Boolean) ((C36570n) C89538a.f257658w).getValue()).booleanValue()) {
                int i = C89538a.f257659x;
                C89538a.f257659x = i + 1;
                if (i == 0) {
                    C89567w c = this.f257730c.mo123873c();
                    if (!c.f257763M) {
                        c.f257763M = true;
                        C61926c.m72668M(new C89543a0(c));
                    }
                }
            }
            C89547f f = this.f257730c.f257722a.mo123839f();
            String str = this.f257730c.f257722a.f257660d;
            C87412m.m108594g(str, "canvasId");
            String str2 = f.f257695B;
            Log.m105924i(str2, "attach #" + str);
            C89547f.m111944P1(f, "attach", str, (ValueCallback) null, 4, (Object) null);
            MagicSclBrandReporter.f237836a.mo112791b(str, false);
            C89567w c2 = this.f257730c.mo123873c();
            String str3 = this.f257730c.f257722a.f257660d;
            c2.getClass();
            C87412m.m108594g(str3, "canvasId");
            C89567w.m111980P1(c2, "resume", str3, (ValueCallback) null, 4, (Object) null);
            this.f257730c.f257722a.mo123849k();
            this.f257733f.getViewTreeObserver().addOnGlobalLayoutListener(new C27652b(this.f257733f, this.f257730c, this.f257731d, this.f257729b, this.f257732e));
        }

        public void onViewDetachedFromWindow(View view) {
            this.f257730c.f257722a.mo123850m();
            C89547f f = this.f257730c.f257722a.mo123839f();
            String str = this.f257730c.f257722a.f257660d;
            C87412m.m108594g(str, "canvasId");
            C89547f.m111944P1(f, "detach", str, (ValueCallback) null, 4, (Object) null);
            C89567w.m111982T1(this.f257730c.mo123873c(), this.f257730c.f257722a.f257660d, (ValueCallback) null, 2, (Object) null);
            this.f257732e.f27482d = true;
            C13601g<Boolean> gVar = C89538a.f257656u;
            if (((Boolean) ((C36570n) C89538a.f257658w).getValue()).booleanValue()) {
                int i = C89538a.f257659x - 1;
                C89538a.f257659x = i;
                if (i == 0) {
                    C89567w c = this.f257730c.mo123873c();
                    if (c.f257763M) {
                        c.f257763M = false;
                        C61926c.m72668M(new C89578z(c));
                    }
                }
            }
        }
    }

    public C89558k0(C89538a aVar, Context context) {
        C87412m.m108594g(aVar, "canvasContext");
        C87412m.m108594g(context, "context");
        this.f257722a = aVar;
        C40480g X = aVar.mo123848j().mo115378X();
        new C89894f(aVar).mo72687a(X);
        int i = ((C83161f) X).f242978h;
        this.f257724c = i;
        MagicBrushView magicBrushView = new MagicBrushView(context, MagicBrushView.C80327h.TextureView);
        String str = '#' + aVar.f257660d + XVFSFile.PATH_SEPARATOR_CHAR + i + '@' + magicBrushView.getVirtualElementId();
        this.f257726e = magicBrushView;
        C89567w c = mo123873c();
        if (!c.f257763M) {
            c.f257763M = true;
            C61926c.m72668M(new C89543a0(c));
        }
        magicBrushView.setMagicBrush(c.f257761K);
        Log.m105924i("MicroMsg.WebCanvasViewContext", "createCanvasView:" + str);
        magicBrushView.setOpaque(false);
        magicBrushView.setClipChildren(false);
        magicBrushView.setClipToPadding(false);
        magicBrushView.setEnableTouchEvent(false);
        C26973c cVar = C26973c.f74981a;
        String str2 = aVar.f257660d;
        C87412m.m108594g(str2, "canvasId");
        long currentTimeMillis = System.currentTimeMillis();
        C26973c.C26974a aVar2 = C26973c.f74982b.get(str2);
        if (aVar2 != null) {
            Log.m105924i("MicroMsg.WebCanvasRenderTimeReport", "markRenderStartTime " + str2 + ' ' + currentTimeMillis);
            aVar2.f74985c = currentTimeMillis;
        }
        magicBrushView.getMagicBrush().f235095k.mo125229a(new C89559a(this));
        magicBrushView.setOnTouchListener(new C89560b(this));
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        magicBrushView.addOnAttachStateChangeListener(new C89561c(this, magicBrushView, str, a0Var, a0Var2));
        magicBrushView.f235131h.mo125229a(new C27654d(a0Var, this, str, a0Var2));
        mo123873c().f257764N.add(aVar.f257660d);
        this.f257725d = magicBrushView.getVirtualElementId();
    }

    /* renamed from: a */
    public final void mo123871a() {
        C89567w c = mo123873c();
        C40480g F0 = mo123873c().mo115375F0(this.f257724c);
        C87412m.m108593f(F0, "renderJsEngine.getJsContext(contextId)");
        C48255c.m53593z1(c, F0, "CanvasRender#" + this.f257722a.f257660d, (String) null, (C32226l) null, (C48255c.C36631a) null, 28, (Object) null);
    }

    /* renamed from: b */
    public final MagicBrushView mo123872b() {
        MagicBrushView magicBrushView = this.f257726e;
        return magicBrushView == null ? this.f257722a.mo123848j().f257761K.f235096l.find(this.f257725d) : magicBrushView;
    }

    /* renamed from: c */
    public final C89567w mo123873c() {
        return this.f257722a.mo123848j();
    }
}
