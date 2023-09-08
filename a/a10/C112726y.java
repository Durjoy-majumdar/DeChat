package a10;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import androidx.lifecycle.C39623j;
import b10.C104004c;
import b10.c$$a;
import com.tencent.p014mm.flutter.p837ui.FlutterPageStyle;
import com.tencent.pigeon.FlutterNavigatorPigeon;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: a10.y */
public final class C112726y {

    /* renamed from: a */
    public final C112713c f337504a;

    /* renamed from: b */
    public final String f337505b;

    /* renamed from: c */
    public String f337506c = "";

    /* renamed from: d */
    public FlutterEngine f337507d;

    /* renamed from: e */
    public boolean f337508e;

    /* renamed from: f */
    public boolean f337509f = true;

    /* renamed from: g */
    public long f337510g;

    /* renamed from: h */
    public String f337511h = "";

    /* renamed from: i */
    public C103289o f337512i;

    /* renamed from: j */
    public HashSet<Object> f337513j = new HashSet<>();

    /* renamed from: k */
    public C112727a f337514k;

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance$destroy$3", mo125469f = "MMFlutterInstance.kt", mo125470l = {237}, mo125471m = "invokeSuspend")
    /* renamed from: a10.y$d */
    public static final class C103293d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f304563d;

        /* renamed from: e */
        public final /* synthetic */ String f304564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103293d(String str, C15601d<? super C103293d> dVar) {
            super(2, dVar);
            this.f304564e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C103293d(this.f304564e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C103293d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f304563d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103290p a = C103290p.f304558c.mo143067a(this.f304564e);
                if (a == null) {
                    return null;
                }
                this.f304563d = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                Log.m165288i("MicroMsg.HybridNavPageStateChannel", C87412m.m108600m("onPageDetached ", a.f304561b));
                a.f304560a.send("HybridNavPageState.Detached", new C27728q(mVar));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C13598b0) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance$showAsView$2", mo125469f = "MMFlutterInstance.kt", mo125470l = {279}, mo125471m = "invokeSuspend")
    /* renamed from: a10.y$g */
    public static final class C103294g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f304565d;

        /* renamed from: e */
        public Object f304566e;

        /* renamed from: f */
        public Object f304567f;

        /* renamed from: g */
        public int f304568g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<Point> f304569h;

        /* renamed from: i */
        public final /* synthetic */ ViewGroup f304570i;

        /* renamed from: j */
        public final /* synthetic */ C112726y f304571j;

        /* renamed from: a10.y$g$a */
        public static final class C103295a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ViewGroup f304572d;

            /* renamed from: e */
            public final /* synthetic */ C112726y f304573e;

            /* renamed from: f */
            public final /* synthetic */ C53916l<Point> f304574f;

            public C103295a(ViewGroup viewGroup, C112726y yVar, C53916l<? super Point> lVar) {
                this.f304572d = viewGroup;
                this.f304573e = yVar;
                this.f304574f = lVar;
            }

            public final void run() {
                int width = this.f304572d.getWidth();
                int height = this.f304572d.getHeight();
                String f = this.f304573e.mo164470f();
                Log.m165288i(f, "container size:[" + width + ", " + height + ']');
                C53916l<Point> lVar = this.f304574f;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new Point(width, height)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103294g(C8479f0<Point> f0Var, ViewGroup viewGroup, C112726y yVar, C15601d<? super C103294g> dVar) {
            super(2, dVar);
            this.f304569h = f0Var;
            this.f304570i = viewGroup;
            this.f304571j = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C103294g(this.f304569h, this.f304570i, this.f304571j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C103294g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(T t) {
            C8479f0<Point> f0Var;
            T t2 = C15911a.COROUTINE_SUSPENDED;
            int i = this.f304568g;
            if (i == 0) {
                ResultKt.throwOnFailure(t);
                C8479f0<Point> f0Var2 = this.f304569h;
                ViewGroup viewGroup = this.f304570i;
                C112726y yVar = this.f304571j;
                this.f304565d = viewGroup;
                this.f304566e = yVar;
                this.f304567f = f0Var2;
                this.f304568g = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                viewGroup.post(new C103295a(viewGroup, yVar, mVar));
                T o = mVar.mo74608o();
                if (o == t2) {
                    return t2;
                }
                f0Var = f0Var2;
                t = o;
            } else if (i == 1) {
                f0Var = (C8479f0) this.f304567f;
                C112726y yVar2 = (C112726y) this.f304566e;
                ViewGroup viewGroup2 = (ViewGroup) this.f304565d;
                ResultKt.throwOnFailure(t);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var.f27484d = t;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a10.y$a */
    public interface C112727a {
        /* renamed from: B2 */
        void mo164446B2(C112727a aVar);
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance", mo125469f = "MMFlutterInstance.kt", mo125470l = {44}, mo125471m = "createEngine")
    /* renamed from: a10.y$b */
    public static final class C112728b extends C66704d {

        /* renamed from: d */
        public Object f337515d;

        /* renamed from: e */
        public Object f337516e;

        /* renamed from: f */
        public /* synthetic */ Object f337517f;

        /* renamed from: g */
        public final /* synthetic */ C112726y f337518g;

        /* renamed from: h */
        public int f337519h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112728b(C112726y yVar, C15601d<? super C112728b> dVar) {
            super(dVar);
            this.f337518g = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337517f = obj;
            this.f337519h |= Integer.MIN_VALUE;
            return this.f337518g.mo164467c((String) null, (Map<String, Object>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance", mo125469f = "MMFlutterInstance.kt", mo125470l = {236}, mo125471m = "destroy")
    /* renamed from: a10.y$c */
    public static final class C112729c extends C66704d {

        /* renamed from: d */
        public Object f337520d;

        /* renamed from: e */
        public Object f337521e;

        /* renamed from: f */
        public Object f337522f;

        /* renamed from: g */
        public Object f337523g;

        /* renamed from: h */
        public Object f337524h;

        /* renamed from: i */
        public long f337525i;

        /* renamed from: j */
        public /* synthetic */ Object f337526j;

        /* renamed from: n */
        public final /* synthetic */ C112726y f337527n;

        /* renamed from: o */
        public int f337528o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112729c(C112726y yVar, C15601d<? super C112729c> dVar) {
            super(dVar);
            this.f337527n = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337526j = obj;
            this.f337528o |= Integer.MIN_VALUE;
            return this.f337527n.mo164468d(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance", mo125469f = "MMFlutterInstance.kt", mo125470l = {123}, mo125471m = "showAsActivity")
    /* renamed from: a10.y$e */
    public static final class C112730e extends C66704d {

        /* renamed from: d */
        public Object f337529d;

        /* renamed from: e */
        public Object f337530e;

        /* renamed from: f */
        public Object f337531f;

        /* renamed from: g */
        public /* synthetic */ Object f337532g;

        /* renamed from: h */
        public final /* synthetic */ C112726y f337533h;

        /* renamed from: i */
        public int f337534i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112730e(C112726y yVar, C15601d<? super C112730e> dVar) {
            super(dVar);
            this.f337533h = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337532g = obj;
            this.f337534i |= Integer.MIN_VALUE;
            return this.f337533h.mo164473j((Context) null, (FlutterPageStyle) null, (Class<? extends Activity>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.MMFlutterInstance", mo125469f = "MMFlutterInstance.kt", mo125470l = {143, 159}, mo125471m = "showAsView")
    /* renamed from: a10.y$f */
    public static final class C112731f extends C66704d {

        /* renamed from: d */
        public Object f337535d;

        /* renamed from: e */
        public Object f337536e;

        /* renamed from: f */
        public Object f337537f;

        /* renamed from: g */
        public Object f337538g;

        /* renamed from: h */
        public Object f337539h;

        /* renamed from: i */
        public /* synthetic */ Object f337540i;

        /* renamed from: j */
        public final /* synthetic */ C112726y f337541j;

        /* renamed from: n */
        public int f337542n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112731f(C112726y yVar, C15601d<? super C112731f> dVar) {
            super(dVar);
            this.f337541j = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337540i = obj;
            this.f337542n |= Integer.MIN_VALUE;
            return this.f337541j.mo164474k((ViewGroup) null, (C39623j) null, (FlutterPageStyle) null, this);
        }
    }

    public C112726y(C112713c cVar, String str) {
        C87412m.m108594g(cVar, "engineGroup");
        C87412m.m108594g(str, "plugin");
        this.f337504a = cVar;
        this.f337505b = str;
    }

    /* renamed from: i */
    public static Object m154145i(C112726y yVar, Context context, FlutterPageStyle flutterPageStyle, Class cls, C15601d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cls = null;
        }
        Object j = yVar.mo164473j(context, flutterPageStyle, cls, dVar);
        return j == C15911a.COROUTINE_SUSPENDED ? j : C13598b0.f38549a;
    }

    /* renamed from: a */
    public final void mo164465a(List<? extends FlutterPlugin> list) {
        PluginRegistry plugins;
        C87412m.m108594g(list, "plugins");
        FlutterEngine flutterEngine = this.f337507d;
        if (flutterEngine != null && (plugins = flutterEngine.getPlugins()) != null) {
            plugins.add((Set<FlutterPlugin>) C110818d0.m150904D0(list));
        }
    }

    /* renamed from: b */
    public final void mo164466b(Object obj) {
        C87412m.m108594g(obj, "host");
        Log.m165288i(mo164470f(), C87412m.m108600m("attach to host ", obj));
        this.f337513j.add(obj);
        if (obj instanceof C112727a) {
            C112727a aVar = this.f337514k;
            if (aVar != null) {
                aVar.mo164446B2((C112727a) obj);
            }
            this.f337514k = (C112727a) obj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164467c(java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof a10.C112726y.C112728b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            a10.y$b r0 = (a10.C112726y.C112728b) r0
            int r1 = r0.f337519h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337519h = r1
            goto L_0x0018
        L_0x0013:
            a10.y$b r0 = new a10.y$b
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f337517f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f337519h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r8 = r0.f337516e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f337515d
            a10.y r9 = (a10.C112726y) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007f
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r7.f337505b
            java.lang.String r2 = "plugin"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "routeName"
            gy3.C87412m.m108594g(r8, r2)
            a10.z r2 = new a10.z
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "home"
            r2.<init>(r10, r6, r8, r5)
            a10.f r10 = a10.C112717f.f337490a
            r10.mo164459e(r2)
            if (r9 == 0) goto L_0x0061
            java.util.HashMap<java.lang.String, java.lang.Object> r10 = r2.f337546d
            if (r10 == 0) goto L_0x0061
            r10.putAll(r9)
        L_0x0061:
            r2.f337548f = r3
            a10.c r9 = r7.f337504a
            r0.f337515d = r7
            r0.f337516e = r8
            r0.f337519h = r3
            r9.getClass()
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            a10.e r5 = new a10.e
            r5.<init>(r2, r9, r3, r4)
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r5, r0)
            if (r10 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r9 = r7
        L_0x007f:
            a10.w r10 = (a10.C112725w) r10
            java.lang.String r0 = r10.f337500a
            r9.f337506c = r0
            io.flutter.embedding.engine.FlutterEngine r0 = r10.f337501b
            r9.f337507d = r0
            long r1 = r10.f337503d
            long r5 = r10.f337502c
            long r1 = r1 - r5
            r9.f337510g = r1
            r9.f337511h = r8
            if (r0 != 0) goto L_0x0095
            goto L_0x0099
        L_0x0095:
            io.flutter.embedding.engine.renderer.FlutterRenderer r4 = r0.getRenderer()
        L_0x0099:
            if (r4 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            boolean r8 = r9.f337508e
            r4.setCheckSurfaceOnStopOrPause(r8)
        L_0x00a1:
            b10.c r8 = new b10.c
            r8.<init>()
            java.util.List r8 = sx3.C26236u.m33719b(r8)
            r9.mo164465a(r8)
            java.util.HashMap<java.lang.String, a10.y> r8 = a10.C103292x.f304562a
            java.lang.String r8 = r9.f337506c
            java.lang.String r10 = "key"
            gy3.C87412m.m108594g(r8, r10)
            java.util.HashMap<java.lang.String, a10.y> r10 = a10.C103292x.f304562a
            r10.put(r8, r9)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112726y.mo164467c(java.lang.String, java.util.Map, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164468d(wx3.C15601d<? super rx3.C13598b0> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof a10.C112726y.C112729c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            a10.y$c r0 = (a10.C112726y.C112729c) r0
            int r1 = r0.f337528o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337528o = r1
            goto L_0x0018
        L_0x0013:
            a10.y$c r0 = new a10.y$c
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f337526j
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f337528o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 != r4) goto L_0x003f
            long r1 = r0.f337525i
            java.lang.Object r5 = r0.f337524h
            io.flutter.embedding.engine.FlutterEngine r5 = (p172io.flutter.embedding.engine.FlutterEngine) r5
            java.lang.Object r6 = r0.f337523g
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f337522f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f337521e
            a10.b r8 = (a10.C112712b) r8
            java.lang.Object r0 = r0.f337520d
            a10.y r0 = (a10.C112726y) r0
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ z2 -> 0x0153 }
            goto L_0x0159
        L_0x003f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r14)
            io.flutter.embedding.engine.FlutterEngine r14 = r13.f337507d
            if (r14 != 0) goto L_0x0051
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x0051:
            java.lang.String r14 = r13.f337506c
            int r14 = r14.length()
            if (r14 != 0) goto L_0x005b
            r14 = 1
            goto L_0x005c
        L_0x005b:
            r14 = 0
        L_0x005c:
            if (r14 == 0) goto L_0x0061
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x0061:
            boolean r14 = r13.f337509f
            if (r14 != 0) goto L_0x0068
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x0068:
            a10.b r8 = new a10.b
            r8.<init>()
            java.lang.String r14 = r13.f337506c
            java.lang.String r2 = "<set-?>"
            gy3.C87412m.m108594g(r14, r2)
            r8.f337456a = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = r13.f337505b
            r14.append(r5)
            r5 = 47
            r14.append(r5)
            java.lang.String r5 = r13.f337511h
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            gy3.C87412m.m108594g(r14, r2)
            r8.f337462g = r14
            long r5 = r13.f337510g
            r8.f337457b = r5
            r8.f337458c = r3
            long r5 = java.lang.System.currentTimeMillis()
            a10.c r14 = r13.f337504a
            long r9 = r14.f337475i
            long r5 = r5 - r9
            r8.f337459d = r5
            io.flutter.embedding.engine.MMFlutterEngineGroup r14 = r14.f337467a
            java.util.List r14 = r14.getActiveEngines()
            int r14 = r14.size()
            long r5 = (long) r14
            r8.f337461f = r5
            a10.c r14 = r13.f337504a
            io.flutter.embedding.engine.MMFlutterEngineGroup r2 = r14.f337467a
            java.util.List r2 = r2.getActiveEngines()
            int r2 = r2.size()
            io.flutter.embedding.engine.MMFlutterEngineGroup r14 = r14.f337467a
            int r14 = r14.getDestroyEngineCount()
            int r2 = r2 + r14
            long r5 = (long) r2
            r8.f337460e = r5
            a10.o r14 = r13.f337512i
            if (r14 != 0) goto L_0x00cc
            goto L_0x00ea
        L_0x00cc:
            long r5 = r14.f304554a
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
            long r9 = r14.f304555b
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dd
            long r9 = r9 - r5
            r8.f337463h = r9
        L_0x00dd:
            long r9 = r14.f304557d
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e6
            long r9 = r9 - r5
            r8.f337465j = r9
        L_0x00e6:
            boolean r14 = r14.f304556c
            r8.f337464i = r14
        L_0x00ea:
            r13.f337509f = r3
            java.util.HashMap<java.lang.String, a10.y> r14 = a10.C103292x.f304562a
            java.lang.String r14 = r13.f337506c
            java.lang.String r2 = "key"
            gy3.C87412m.m108594g(r14, r2)
            r2 = 0
            java.util.HashMap<java.lang.String, a10.y> r5 = a10.C103292x.f304562a
            r5.remove(r14)
            io.flutter.embedding.engine.FlutterEngineCache r14 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            java.lang.String r5 = r13.f337506c
            r14.remove(r5)
            java.lang.String r7 = r13.mo164470f()
            java.lang.String r6 = r13.f337506c
            io.flutter.embedding.engine.FlutterEngine r5 = r13.f337507d
            java.lang.String r14 = ""
            r13.f337506c = r14
            r13.f337507d = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r9 = "clear: engineId="
            r14.append(r9)
            r14.append(r6)
            java.lang.String r9 = ", engine="
            r14.append(r9)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            p172io.flutter.Log.m165288i(r7, r14)
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            a10.y$d r14 = new a10.y$d     // Catch:{ z2 -> 0x0151 }
            r14.<init>(r6, r2)     // Catch:{ z2 -> 0x0151 }
            r0.f337520d = r13     // Catch:{ z2 -> 0x0151 }
            r0.f337521e = r8     // Catch:{ z2 -> 0x0151 }
            r0.f337522f = r7     // Catch:{ z2 -> 0x0151 }
            r0.f337523g = r6     // Catch:{ z2 -> 0x0151 }
            r0.f337524h = r5     // Catch:{ z2 -> 0x0151 }
            r0.f337525i = r9     // Catch:{ z2 -> 0x0151 }
            r0.f337528o = r4     // Catch:{ z2 -> 0x0151 }
            java.lang.Object r14 = a14.C53860b3.m60374b(r11, r14, r0)     // Catch:{ z2 -> 0x0151 }
            if (r14 != r1) goto L_0x014e
            return r1
        L_0x014e:
            r0 = r13
            r1 = r9
            goto L_0x0159
        L_0x0151:
            r0 = r13
            r1 = r9
        L_0x0153:
            java.lang.String r14 = "detach timeout"
            p172io.flutter.Log.m165288i(r7, r14)
            r3 = 1
        L_0x0159:
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "detach cost:"
            r14.append(r1)
            r14.append(r9)
            java.lang.String r1 = ", timeOut:"
            r14.append(r1)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            p172io.flutter.Log.m165288i(r7, r14)
            if (r5 != 0) goto L_0x017d
            goto L_0x0180
        L_0x017d:
            r5.destroy()
        L_0x0180:
            a10.p$a r14 = a10.C103290p.f304558c
            java.lang.String r14 = "engineId"
            gy3.C87412m.m108594g(r6, r14)
            java.util.HashMap<java.lang.String, a10.p> r14 = a10.C103290p.f304559d
            r14.remove(r6)
            r8.f337466k = r9
            a10.c r14 = r0.f337504a
            fy3.l<? super a10.b, rx3.b0> r14 = r14.f337477k
            if (r14 != 0) goto L_0x0195
            goto L_0x0198
        L_0x0195:
            r14.invoke(r8)
        L_0x0198:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112726y.mo164468d(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo164469e(Object obj, C15601d<? super C13598b0> dVar) {
        if (obj == null || this.f337513j.contains(obj)) {
            Log.m165288i(mo164470f(), C87412m.m108600m("detach from host ", obj));
        } else {
            Log.m165292w(mo164470f(), C87412m.m108600m("detach from an unknown host ", obj));
        }
        this.f337513j.remove(obj);
        if (C87412m.m108589b(this.f337514k, obj)) {
            this.f337514k = null;
        }
        if (this.f337513j.isEmpty()) {
            Object d = mo164468d(dVar);
            return d == C15911a.COROUTINE_SUSPENDED ? d : C13598b0.f38549a;
        }
        String f = mo164470f();
        Log.m165288i(f, "attached hosts: [" + C110818d0.m150921S(this.f337513j, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null) + ']');
        return C13598b0.f38549a;
    }

    /* renamed from: f */
    public final String mo164470f() {
        return C87412m.m108600m("MMFlutterInstance#", this.f337506c);
    }

    /* renamed from: g */
    public final Object mo164471g(String str, Map<String, Object> map, C15601d<? super C13598b0> dVar) {
        HashMap<String, Object> hashMap;
        if (!this.f337509f) {
            return C13598b0.f38549a;
        }
        if (this.f337507d == null) {
            Object c = mo164467c(str, map, dVar);
            return c == C15911a.COROUTINE_SUSPENDED ? c : C13598b0.f38549a;
        }
        String str2 = this.f337505b;
        C87412m.m108594g(str2, "plugin");
        C87412m.m108594g(str, "routeName");
        C112732z zVar = new C112732z(str2, "home", str, new HashMap());
        C112717f.f337490a.mo164459e(zVar);
        if (!(map == null || (hashMap = zVar.f337546d) == null)) {
            hashMap.putAll(map);
        }
        zVar.f337548f = true;
        FlutterEngine flutterEngine = this.f337507d;
        C87412m.m108591d(flutterEngine);
        FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(C104004c.class);
        if (flutterPlugin != null) {
            String a = zVar.mo164475a();
            C87412m.m108593f(a, "mmRoute.toJsonString()");
            FlutterNavigatorPigeon.FlutterNavigatorCallback flutterNavigatorCallback = ((C104004c) flutterPlugin).f307616e;
            if (flutterNavigatorCallback != null) {
                flutterNavigatorCallback.onNewRoute(a, new c$$a());
            }
            return C13598b0.f38549a;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.tencent.mm.flutter.base.navigator.FlutterNavigatorPlugin");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.getPlugins();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164472h(b10.C104005d r4) {
        /*
            r3 = this;
            java.lang.Class<b10.c> r0 = b10.C104004c.class
            io.flutter.embedding.engine.FlutterEngine r1 = r3.f337507d
            r2 = 0
            if (r1 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            io.flutter.embedding.engine.plugins.PluginRegistry r1 = r1.getPlugins()
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            r0 = r2
            goto L_0x0014
        L_0x0010:
            io.flutter.embedding.engine.plugins.FlutterPlugin r0 = r1.get(r0)
        L_0x0014:
            boolean r1 = r0 instanceof p172io.flutter.embedding.engine.plugins.FlutterPlugin
            if (r1 == 0) goto L_0x0019
            r2 = r0
        L_0x0019:
            b10.c r2 = (b10.C104004c) r2
            if (r2 != 0) goto L_0x0029
            b10.c r2 = new b10.c
            r2.<init>()
            java.util.List r0 = sx3.C26236u.m33719b(r2)
            r3.mo164465a(r0)
        L_0x0029:
            r2.f307618g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112726y.mo164472h(b10.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164473j(android.content.Context r12, com.tencent.p014mm.flutter.p837ui.FlutterPageStyle r13, java.lang.Class<? extends android.app.Activity> r14, wx3.C15601d<? super rx3.C13598b0> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a10.C112726y.C112730e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            a10.y$e r0 = (a10.C112726y.C112730e) r0
            int r1 = r0.f337534i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337534i = r1
            goto L_0x0018
        L_0x0013:
            a10.y$e r0 = new a10.y$e
            r0.<init>(r11, r15)
        L_0x0018:
            r7 = r0
            java.lang.Object r15 = r7.f337532g
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f337534i
            r2 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            java.lang.Object r12 = r7.f337531f
            android.content.Intent r12 = (android.content.Intent) r12
            java.lang.Object r13 = r7.f337530e
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r7.f337529d
            a10.y r14 = (a10.C112726y) r14
            kotlin.ResultKt.throwOnFailure(r15)
            r10 = r12
            r12 = r13
            goto L_0x00b1
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r15)
            boolean r15 = r11.f337509f
            if (r15 != 0) goto L_0x0049
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x0049:
            com.tencent.mm.flutter.ui.FlutterPageInfo r15 = new com.tencent.mm.flutter.ui.FlutterPageInfo
            java.lang.String r1 = r11.f337506c
            a10.c r3 = r11.f337504a
            java.lang.String r3 = r3.f337470d
            java.lang.String r4 = r11.f337505b
            java.lang.String r5 = ""
            r15.<init>(r1, r3, r4, r5)
            if (r14 != 0) goto L_0x0060
            a10.f r14 = a10.C112717f.f337490a
            java.lang.Class r14 = r14.mo164455a()
        L_0x0060:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r12, r14)
            java.lang.String r14 = "page_info"
            r10.putExtra(r14, r15)
            java.lang.String r14 = "page_style"
            r10.putExtra(r14, r13)
            boolean r13 = r13.f310676o
            if (r13 == 0) goto L_0x00b0
            java.util.HashMap<java.lang.String, a10.n> r13 = a10.C103284n.f304540d
            java.lang.String r13 = r11.f337506c
            java.lang.String r14 = "engineId"
            gy3.C87412m.m108594g(r13, r14)
            java.util.HashMap<java.lang.String, a10.n> r15 = a10.C103284n.f304540d
            java.lang.Object r13 = r15.get(r13)
            a10.n r13 = (a10.C103284n) r13
            if (r13 != 0) goto L_0x00b0
            a10.n r1 = new a10.n
            java.lang.String r13 = r11.f337506c
            r1.<init>(r13)
            java.lang.String r13 = r11.f337506c
            gy3.C87412m.m108594g(r13, r14)
            r15.put(r13, r1)
            a10.o r13 = r1.f304543c
            r11.f337512i = r13
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            r7.f337529d = r11
            r7.f337530e = r12
            r7.f337531f = r10
            r7.f337534i = r2
            r2 = r12
            java.lang.Object r13 = a10.C103284n.m136803b(r1, r2, r3, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L_0x00b0
            return r0
        L_0x00b0:
            r14 = r11
        L_0x00b1:
            boolean r13 = r12 instanceof android.app.Activity
            if (r13 != 0) goto L_0x00ba
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r10.addFlags(r13)
        L_0x00ba:
            java.lang.String r13 = r14.mo164470f()
            java.lang.String r14 = "startActivity"
            p172io.flutter.Log.m165288i(r13, r14)
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r10)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r4 = "showAsActivity"
            java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r14 = 0
            java.lang.Object r13 = r13.mo10231a(r14)
            android.content.Intent r13 = (android.content.Intent) r13
            r12.startActivity(r13)
            java.lang.String r2 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r3 = "showAsActivity"
            java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112726y.mo164473j(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164474k(android.view.ViewGroup r20, androidx.lifecycle.C39623j r21, com.tencent.p014mm.flutter.p837ui.FlutterPageStyle r22, wx3.C15601d<? super a10.C112711a0> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof a10.C112726y.C112731f
            if (r4 == 0) goto L_0x001b
            r4 = r3
            a10.y$f r4 = (a10.C112726y.C112731f) r4
            int r5 = r4.f337542n
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f337542n = r5
            goto L_0x0020
        L_0x001b:
            a10.y$f r4 = new a10.y$f
            r4.<init>(r0, r3)
        L_0x0020:
            r11 = r4
            java.lang.Object r3 = r11.f337540i
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r11.f337542n
            r6 = 0
            r7 = 2
            r8 = 1
            java.lang.String r9 = "engineId"
            if (r5 == 0) goto L_0x0072
            if (r5 == r8) goto L_0x0051
            if (r5 != r7) goto L_0x0049
            java.lang.Object r1 = r11.f337538g
            com.tencent.mm.flutter.ui.FlutterPageStyle r1 = (com.tencent.p014mm.flutter.p837ui.FlutterPageStyle) r1
            java.lang.Object r2 = r11.f337537f
            androidx.lifecycle.j r2 = (androidx.lifecycle.C39623j) r2
            java.lang.Object r4 = r11.f337536e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r11.f337535d
            a10.y r5 = (a10.C112726y) r5
            kotlin.ResultKt.throwOnFailure(r3)
            r3 = r1
            r1 = r4
            goto L_0x0116
        L_0x0049:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0051:
            java.lang.Object r1 = r11.f337539h
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r11.f337538g
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = (com.tencent.p014mm.flutter.p837ui.FlutterPageStyle) r2
            java.lang.Object r5 = r11.f337537f
            androidx.lifecycle.j r5 = (androidx.lifecycle.C39623j) r5
            java.lang.Object r8 = r11.f337536e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r10 = r11.f337535d
            a10.y r10 = (a10.C112726y) r10
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ z2 -> 0x006f }
            r3 = r2
            r2 = r5
            r14 = r10
            r5 = r1
            r1 = r8
            goto L_0x00cd
        L_0x006f:
            r3 = r1
            r1 = r8
            goto L_0x00bd
        L_0x0072:
            kotlin.ResultKt.throwOnFailure(r3)
            boolean r3 = r2.f310676o
            if (r3 == 0) goto L_0x0120
            java.util.HashMap<java.lang.String, a10.n> r3 = a10.C103284n.f304540d
            java.lang.String r3 = r0.f337506c
            gy3.C87412m.m108594g(r3, r9)
            java.util.HashMap<java.lang.String, a10.n> r5 = a10.C103284n.f304540d
            java.lang.Object r3 = r5.get(r3)
            a10.n r3 = (a10.C103284n) r3
            if (r3 != 0) goto L_0x0120
            java.lang.String r3 = r19.mo164470f()
            java.lang.String r5 = "showAsView"
            p172io.flutter.Log.m165288i(r3, r5)
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            r12 = 20
            a10.y$g r5 = new a10.y$g     // Catch:{ z2 -> 0x00b9 }
            r5.<init>(r3, r1, r0, r6)     // Catch:{ z2 -> 0x00b9 }
            r11.f337535d = r0     // Catch:{ z2 -> 0x00b9 }
            r11.f337536e = r1     // Catch:{ z2 -> 0x00b9 }
            r10 = r21
            r11.f337537f = r10     // Catch:{ z2 -> 0x00bb }
            r11.f337538g = r2     // Catch:{ z2 -> 0x00bb }
            r11.f337539h = r3     // Catch:{ z2 -> 0x00bb }
            r11.f337542n = r8     // Catch:{ z2 -> 0x00bb }
            java.lang.Object r5 = a14.C53860b3.m60374b(r12, r5, r11)     // Catch:{ z2 -> 0x00bb }
            if (r5 != r4) goto L_0x00b4
            return r4
        L_0x00b4:
            r14 = r0
            r5 = r3
            r3 = r2
            r2 = r10
            goto L_0x00cd
        L_0x00b9:
            r10 = r21
        L_0x00bb:
            r5 = r10
            r10 = r0
        L_0x00bd:
            java.lang.String r8 = r10.mo164470f()
            java.lang.String r12 = "get container size timeout"
            p172io.flutter.Log.m165288i(r8, r12)
            r14 = r10
            r18 = r3
            r3 = r2
            r2 = r5
            r5 = r18
        L_0x00cd:
            a10.n r8 = new a10.n
            java.lang.String r10 = r14.f337506c
            r8.<init>(r10)
            java.util.HashMap<java.lang.String, a10.n> r10 = a10.C103284n.f304540d
            java.lang.String r10 = r14.f337506c
            gy3.C87412m.m108594g(r10, r9)
            java.util.HashMap<java.lang.String, a10.n> r9 = a10.C103284n.f304540d
            r9.put(r10, r8)
            a10.o r9 = r8.f304543c
            r14.f337512i = r9
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "container.context"
            gy3.C87412m.m108593f(r9, r10)
            r12 = 0
            T r5 = r5.f27484d
            r10 = r5
            android.graphics.Point r10 = (android.graphics.Point) r10
            r15 = 0
            r16 = 2
            r17 = 0
            r11.f337535d = r14
            r11.f337536e = r1
            r11.f337537f = r2
            r11.f337538g = r3
            r11.f337539h = r6
            r11.f337542n = r7
            r5 = r8
            r6 = r9
            r7 = r12
            r9 = r10
            r10 = r15
            r12 = r16
            r13 = r17
            java.lang.Object r5 = a10.C103284n.m136803b(r5, r6, r7, r9, r10, r11, r12, r13)
            if (r5 != r4) goto L_0x0115
            return r4
        L_0x0115:
            r5 = r14
        L_0x0116:
            java.lang.String r4 = r5.mo164470f()
            java.lang.String r6 = "showAsView prepareSnapshot finished"
            p172io.flutter.Log.m165288i(r4, r6)
            goto L_0x0125
        L_0x0120:
            r10 = r21
            r5 = r0
            r3 = r2
            r2 = r10
        L_0x0125:
            a10.a0 r4 = new a10.a0
            r4.<init>(r5, r1, r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112726y.mo164474k(android.view.ViewGroup, androidx.lifecycle.j, com.tencent.mm.flutter.ui.FlutterPageStyle, wx3.d):java.lang.Object");
    }
}
