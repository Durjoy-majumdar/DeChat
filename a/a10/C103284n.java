package a10;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Point;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: a10.n */
public final class C103284n {

    /* renamed from: d */
    public static final HashMap<String, C103284n> f304540d = new HashMap<>();

    /* renamed from: a */
    public final String f304541a;

    /* renamed from: b */
    public C103283k f304542b;

    /* renamed from: c */
    public final C103289o f304543c = new C103289o();

    /* renamed from: a10.n$a */
    public static final class C103285a {
        public C103285a(C8480h hVar) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.FlutterSnapshotHelper", mo125469f = "FlutterSnapshotHelper.kt", mo125470l = {55, 74}, mo125471m = "prepareSnapshot")
    /* renamed from: a10.n$b */
    public static final class C103286b extends C66704d {

        /* renamed from: d */
        public Object f304544d;

        /* renamed from: e */
        public /* synthetic */ Object f304545e;

        /* renamed from: f */
        public final /* synthetic */ C103284n f304546f;

        /* renamed from: g */
        public int f304547g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103286b(C103284n nVar, C15601d<? super C103286b> dVar) {
            super(dVar);
            this.f304546f = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f304545e = obj;
            this.f304547g |= Integer.MIN_VALUE;
            return this.f304546f.mo143066a((Context) null, 0, (Point) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.FlutterSnapshotHelper$prepareSnapshot$2", mo125469f = "FlutterSnapshotHelper.kt", mo125470l = {67}, mo125471m = "invokeSuspend")
    /* renamed from: a10.n$c */
    public static final class C103287c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f304548d;

        /* renamed from: e */
        public int f304549e;

        /* renamed from: f */
        public final /* synthetic */ C103284n f304550f;

        /* renamed from: g */
        public final /* synthetic */ Context f304551g;

        /* renamed from: h */
        public final /* synthetic */ Point f304552h;

        /* renamed from: a10.n$c$a */
        public static final class C103288a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C103284n f304553d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C103288a(C103284n nVar) {
                super(0);
                this.f304553d = nVar;
            }

            public Object invoke() {
                this.f304553d.f304543c.f304555b = System.currentTimeMillis();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103287c(C103284n nVar, Context context, Point point, C15601d<? super C103287c> dVar) {
            super(2, dVar);
            this.f304550f = nVar;
            this.f304551g = context;
            this.f304552h = point;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C103287c(this.f304550f, this.f304551g, this.f304552h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C103287c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:78:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0269  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f304549e
                r3 = 1
                if (r2 == 0) goto L_0x001c
                if (r2 != r3) goto L_0x0014
                java.lang.Object r1 = r0.f304548d
                a10.k r1 = (a10.C103283k) r1
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x02d7
            L_0x0014:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001c:
                kotlin.ResultKt.throwOnFailure(r21)
                a10.n r2 = r0.f304550f
                a10.o r2 = r2.f304543c
                long r4 = java.lang.System.currentTimeMillis()
                r2.f304554a = r4
                int r2 = android.os.Build.VERSION.SDK_INT
                r4 = 23
                if (r2 < r4) goto L_0x02ef
                io.flutter.embedding.engine.FlutterEngineCache r5 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
                a10.n r6 = r0.f304550f
                java.lang.String r6 = r6.f304541a
                io.flutter.embedding.engine.FlutterEngine r5 = r5.get(r6)
                if (r5 == 0) goto L_0x02e3
                a10.n r6 = r0.f304550f
                r6.getClass()
                java.lang.String r6 = "MicroMsg.FlutterSnapshotHelper"
                java.lang.String r7 = "prepareSnapshot"
                p172io.flutter.Log.m165288i(r6, r7)
                a10.k r6 = new a10.k
                android.content.Context r7 = r0.f304551g
                android.graphics.Point r8 = r0.f304552h
                r6.<init>(r7, r8, r3)
                a10.n$c$a r7 = new a10.n$c$a
                a10.n r8 = r0.f304550f
                r7.<init>(r8)
                r6.f304531e = r7
                android.content.Context r7 = r0.f304551g
                a10.n r8 = r0.f304550f
                java.lang.String r8 = r8.f304541a
                java.lang.String r9 = "context"
                gy3.C87412m.m108594g(r7, r9)
                java.lang.String r9 = "engineId"
                gy3.C87412m.m108594g(r8, r9)
                java.lang.String r9 = "MicroMsg.FlutterOffscreenSurface"
                java.lang.String r10 = "attach()"
                p172io.flutter.Log.m165288i(r9, r10)
                r6.f304529c = r5
                io.flutter.embedding.engine.renderer.FlutterRenderer r9 = r5.getRenderer()
                java.lang.String r10 = "engine.renderer"
                gy3.C87412m.m108593f(r9, r10)
                a10.k$$b r10 = a10.k$$b.LEFT
                a10.k$$b r11 = a10.k$$b.RIGHT
                a10.k$$b r12 = a10.k$$b.BOTH
                java.lang.String r13 = "window"
                java.lang.Object r14 = r7.getSystemService(r13)
                java.lang.String r15 = "null cannot be cast to non-null type android.view.WindowManager"
                if (r14 == 0) goto L_0x02dd
                android.view.WindowManager r14 = (android.view.WindowManager) r14
                boolean r14 = r7 instanceof android.app.Activity
                r16 = 0
                if (r14 == 0) goto L_0x00a1
                r14 = r7
                android.app.Activity r14 = (android.app.Activity) r14
                android.view.Window r14 = r14.getWindow()
                android.view.View r14 = r14.getDecorView()
                goto L_0x00b4
            L_0x00a1:
                a10.f r14 = a10.C112717f.f337490a
                android.app.Activity r14 = r14.mo164457c()
                if (r14 == 0) goto L_0x00b2
                android.view.Window r14 = r14.getWindow()
                android.view.View r14 = r14.getDecorView()
                goto L_0x00b4
            L_0x00b2:
                r14 = r16
            L_0x00b4:
                if (r14 != 0) goto L_0x00b7
                goto L_0x00bd
            L_0x00b7:
                e3.f0 r14 = p849e3.C107207u.m145164e(r14)
                if (r14 != 0) goto L_0x00c6
            L_0x00bd:
                r17 = r1
                r11 = r8
                r21 = r9
                r4 = r16
                goto L_0x0278
            L_0x00c6:
                io.flutter.embedding.engine.renderer.FlutterRenderer$ViewportMetrics r4 = new io.flutter.embedding.engine.renderer.FlutterRenderer$ViewportMetrics
                r4.<init>()
                int r3 = r6.f304532f
                r4.width = r3
                int r3 = r6.f304533g
                r4.height = r3
                android.content.res.Resources r3 = r7.getResources()
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                float r3 = r3.density
                r4.devicePixelRatio = r3
                android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r7)
                int r3 = r3.getScaledTouchSlop()
                r4.physicalTouchSlop = r3
                boolean r3 = r6.f304527a
                if (r3 == 0) goto L_0x0273
                r3 = 29
                if (r2 != r3) goto L_0x010f
                e3.f0$k r3 = r14.f320766a
                w2.b r3 = r3.mo157662j()
                r17 = r1
                java.lang.String r1 = "insets.systemGestureInsets"
                gy3.C87412m.m108593f(r3, r1)
                int r1 = r3.f334389b
                r4.systemGestureInsetTop = r1
                int r1 = r3.f334390c
                r4.systemGestureInsetRight = r1
                int r1 = r3.f334391d
                r4.systemGestureInsetBottom = r1
                int r1 = r3.f334388a
                r4.systemGestureInsetLeft = r1
                goto L_0x0111
            L_0x010f:
                r17 = r1
            L_0x0111:
                a10.f r1 = a10.C112717f.f337490a
                boolean r1 = r1.mo164458d(r7)
                r3 = 30
                if (r2 < r3) goto L_0x01cd
                if (r1 == 0) goto L_0x011f
                r0 = 2
                goto L_0x0120
            L_0x011f:
                r0 = 0
            L_0x0120:
                r1 = 1
                r0 = r0 | r1
                e3.f0$k r1 = r14.f320766a
                w2.b r0 = r1.mo157644g(r0)
                java.lang.String r1 = "insets.getInsets(mask)"
                gy3.C87412m.m108593f(r0, r1)
                int r1 = r0.f334389b
                r4.viewPaddingTop = r1
                int r1 = r0.f334390c
                r4.viewPaddingRight = r1
                int r1 = r0.f334391d
                r4.viewPaddingBottom = r1
                int r0 = r0.f334388a
                r4.viewPaddingLeft = r0
                r0 = 8
                e3.f0$k r1 = r14.f320766a
                w2.b r0 = r1.mo157644g(r0)
                java.lang.String r1 = "insets.getInsets(WindowInsetsCompat.Type.ime())"
                gy3.C87412m.m108593f(r0, r1)
                int r1 = r0.f334389b
                r4.viewInsetTop = r1
                int r1 = r0.f334390c
                r4.viewInsetRight = r1
                int r1 = r0.f334391d
                r4.viewInsetBottom = r1
                int r0 = r0.f334388a
                r4.viewInsetLeft = r0
                r0 = 16
                e3.f0$k r1 = r14.f320766a
                w2.b r0 = r1.mo157644g(r0)
                java.lang.String r1 = "insets.getInsets(WindowI…at.Type.systemGestures())"
                gy3.C87412m.m108593f(r0, r1)
                int r1 = r0.f334389b
                r4.systemGestureInsetTop = r1
                int r1 = r0.f334390c
                r4.systemGestureInsetRight = r1
                int r1 = r0.f334391d
                r4.systemGestureInsetBottom = r1
                int r0 = r0.f334388a
                r4.systemGestureInsetLeft = r0
                e3.f0$k r0 = r14.f320766a
                e3.c r0 = r0.mo157659f()
                if (r0 == 0) goto L_0x0275
                w2.b r1 = r0.mo157625e()
                int r2 = r4.viewPaddingTop
                int r3 = r1.f334389b
                int r2 = java.lang.Math.max(r2, r3)
                int r3 = r0.mo157624d()
                int r2 = java.lang.Math.max(r2, r3)
                r4.viewPaddingTop = r2
                int r2 = r4.viewPaddingRight
                int r3 = r1.f334390c
                int r2 = java.lang.Math.max(r2, r3)
                int r3 = r0.mo157623c()
                int r2 = java.lang.Math.max(r2, r3)
                r4.viewPaddingRight = r2
                int r2 = r4.viewPaddingBottom
                int r3 = r1.f334391d
                int r2 = java.lang.Math.max(r2, r3)
                int r3 = r0.mo157621a()
                int r2 = java.lang.Math.max(r2, r3)
                r4.viewPaddingBottom = r2
                int r2 = r4.viewPaddingLeft
                int r1 = r1.f334388a
                int r1 = java.lang.Math.max(r2, r1)
                int r0 = r0.mo157622b()
                int r0 = java.lang.Math.max(r1, r0)
                r4.viewPaddingLeft = r0
                goto L_0x0275
            L_0x01cd:
                a10.k$$b r3 = a10.k$$b.NONE
                if (r1 != 0) goto L_0x0209
                android.content.res.Resources r18 = r7.getResources()
                android.content.res.Configuration r0 = r18.getConfiguration()
                int r0 = r0.orientation
                java.lang.Object r13 = r7.getSystemService(r13)
                if (r13 == 0) goto L_0x0203
                android.view.WindowManager r13 = (android.view.WindowManager) r13
                android.view.Display r13 = r13.getDefaultDisplay()
                int r13 = r13.getRotation()
                r15 = 2
                if (r0 != r15) goto L_0x0209
                if (r13 == 0) goto L_0x0201
                r0 = 1
                if (r13 == r0) goto L_0x01ff
                if (r13 == r15) goto L_0x0201
                r0 = 3
                if (r13 == r0) goto L_0x01f9
                goto L_0x0209
            L_0x01f9:
                r0 = 23
                if (r2 < r0) goto L_0x01ff
                r3 = r10
                goto L_0x0209
            L_0x01ff:
                r3 = r11
                goto L_0x0209
            L_0x0201:
                r3 = r12
                goto L_0x0209
            L_0x0203:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r15)
                throw r0
            L_0x0209:
                int r0 = r14.mo157632d()
                r4.viewPaddingTop = r0
                if (r3 == r11) goto L_0x0219
                if (r3 != r12) goto L_0x0214
                goto L_0x0219
            L_0x0214:
                int r0 = r14.mo157631c()
                goto L_0x021a
            L_0x0219:
                r0 = 0
            L_0x021a:
                r4.viewPaddingRight = r0
                r18 = 4595653203753948938(0x3fc70a3d70a3d70a, double:0.18)
                if (r1 == 0) goto L_0x0241
                int r0 = r6.f304533g
                int r1 = r14.mo157629a()
                double r1 = (double) r1
                r11 = r8
                r21 = r9
                double r8 = (double) r0
                double r8 = r8 * r18
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x0236
                r0 = 0
                goto L_0x023a
            L_0x0236:
                int r0 = r14.mo157629a()
            L_0x023a:
                if (r0 != 0) goto L_0x0244
                int r0 = r14.mo157629a()
                goto L_0x0245
            L_0x0241:
                r11 = r8
                r21 = r9
            L_0x0244:
                r0 = 0
            L_0x0245:
                r4.viewPaddingBottom = r0
                if (r3 == r10) goto L_0x0251
                if (r3 != r12) goto L_0x024c
                goto L_0x0251
            L_0x024c:
                int r0 = r14.mo157630b()
                goto L_0x0252
            L_0x0251:
                r0 = 0
            L_0x0252:
                r4.viewPaddingLeft = r0
                r0 = 0
                r4.viewInsetTop = r0
                r4.viewInsetRight = r0
                int r0 = r6.f304533g
                int r1 = r14.mo157629a()
                double r1 = (double) r1
                double r8 = (double) r0
                double r8 = r8 * r18
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x0269
                r0 = 0
                goto L_0x026d
            L_0x0269:
                int r0 = r14.mo157629a()
            L_0x026d:
                r4.viewInsetBottom = r0
                r0 = 0
                r4.viewInsetLeft = r0
                goto L_0x0278
            L_0x0273:
                r17 = r1
            L_0x0275:
                r11 = r8
                r21 = r9
            L_0x0278:
                if (r4 != 0) goto L_0x027c
                r4 = 0
                goto L_0x02bb
            L_0x027c:
                io.flutter.plugin.localization.LocalizationPlugin r0 = r5.getLocalizationPlugin()
                android.content.res.Resources r1 = r7.getResources()
                android.content.res.Configuration r1 = r1.getConfiguration()
                r0.sendLocalesToFlutter(r1)
                r0 = r21
                r0.setViewportMetrics(r4)
                android.media.ImageReader r1 = r6.f304528b
                android.view.Surface r1 = r1.getSurface()
                r2 = 0
                r0.startRenderingToSurface(r1, r2)
                r0.resumeScheduleFrame()
                a10.p$a r0 = a10.C103290p.f304558c
                a10.p r0 = r0.mo143067a(r11)
                if (r0 != 0) goto L_0x02a6
                goto L_0x02ba
            L_0x02a6:
                java.lang.String r1 = r0.f304561b
                java.lang.String r2 = "requestPagePreload "
                java.lang.String r1 = gy3.C87412m.m108600m(r2, r1)
                java.lang.String r2 = "MicroMsg.HybridNavPageStateChannel"
                p172io.flutter.Log.m165288i(r2, r1)
                io.flutter.plugin.common.BasicMessageChannel<java.lang.String> r0 = r0.f304560a
                java.lang.String r1 = "HybridNavPageState.Preload"
                r0.send(r1)
            L_0x02ba:
                r4 = 1
            L_0x02bb:
                r0 = r20
                if (r4 == 0) goto L_0x02d8
                r0.f304548d = r6
                r1 = 1
                r0.f304549e = r1
                a14.w r1 = r6.f304530d
                a14.f2 r1 = (a14.C53884f2) r1
                java.lang.Object r1 = r1.mo74521O(r0)
                r2 = r17
                if (r1 != r2) goto L_0x02d1
                goto L_0x02d3
            L_0x02d1:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x02d3:
                if (r1 != r2) goto L_0x02d6
                return r2
            L_0x02d6:
                r1 = r6
            L_0x02d7:
                r6 = r1
            L_0x02d8:
                a10.n r1 = r0.f304550f
                r1.f304542b = r6
                goto L_0x02ef
            L_0x02dd:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r15)
                throw r1
            L_0x02e3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Required value was null."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x02ef:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a10.C103284n.C103287c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C103285a((C8480h) null);
    }

    public C103284n(String str) {
        this.f304541a = str;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m136803b(C103284n nVar, Context context, long j, Point point, boolean z, C15601d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            point = null;
        }
        return nVar.mo143066a(context, j2, point, (i & 8) != 0 ? true : z, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo143066a(android.content.Context r6, long r7, android.graphics.Point r9, boolean r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r5 = this;
            boolean r10 = r11 instanceof a10.C103284n.C103286b
            if (r10 == 0) goto L_0x0013
            r10 = r11
            a10.n$b r10 = (a10.C103284n.C103286b) r10
            int r0 = r10.f304547g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r10.f304547g = r0
            goto L_0x0018
        L_0x0013:
            a10.n$b r10 = new a10.n$b
            r10.<init>(r5, r11)
        L_0x0018:
            java.lang.Object r11 = r10.f304545e
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f304547g
            java.lang.String r2 = "MicroMsg.FlutterSnapshotHelper"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 == r4) goto L_0x0038
            if (r1 != r3) goto L_0x0030
            java.lang.Object r6 = r10.f304544d
            a10.n r6 = (a10.C103284n) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0097
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r10.f304544d
            a10.n r6 = (a10.C103284n) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ z2 -> 0x0040 }
            goto L_0x009f
        L_0x0040:
            goto L_0x006b
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r5.f304541a
            if (r11 == 0) goto L_0x0052
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r11 = 0
            goto L_0x0053
        L_0x0052:
            r11 = 1
        L_0x0053:
            if (r11 == 0) goto L_0x0058
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x0058:
            a10.n$c r11 = new a10.n$c     // Catch:{ z2 -> 0x0069 }
            r1 = 0
            r11.<init>(r5, r6, r9, r1)     // Catch:{ z2 -> 0x0069 }
            r10.f304544d = r5     // Catch:{ z2 -> 0x0069 }
            r10.f304547g = r4     // Catch:{ z2 -> 0x0069 }
            java.lang.Object r6 = a14.C53860b3.m60374b(r7, r11, r10)     // Catch:{ z2 -> 0x0069 }
            if (r6 != r0) goto L_0x009f
            return r0
        L_0x0069:
            r6 = r5
        L_0x006b:
            a10.o r7 = r6.f304543c
            r7.f304556c = r4
            java.lang.String r7 = r6.f304541a
            r10.f304544d = r6
            r10.f304547g = r3
            java.lang.String r8 = "prepareSnapshotTimeout:"
            java.lang.String r8 = gy3.C87412m.m108600m(r8, r7)
            p172io.flutter.Log.m165288i(r2, r8)
            a10.k r8 = r6.f304542b
            if (r8 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            android.media.ImageReader r8 = r8.f304528b
            r8.close()
        L_0x0088:
            java.lang.String r8 = "engineId"
            gy3.C87412m.m108594g(r7, r8)
            java.util.HashMap<java.lang.String, a10.n> r8 = f304540d
            r8.remove(r7)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            if (r7 != r0) goto L_0x0097
            return r0
        L_0x0097:
            r6.getClass()
            java.lang.String r6 = "snapshot timeout"
            p172io.flutter.Log.m165292w(r2, r6)
        L_0x009f:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C103284n.mo143066a(android.content.Context, long, android.graphics.Point, boolean, wx3.d):java.lang.Object");
    }
}
