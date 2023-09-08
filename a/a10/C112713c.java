package a10;

import fy3.C32226l;
import gy3.C87412m;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.MMFlutterEngineGroup;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: a10.c */
public final class C112713c {

    /* renamed from: a */
    public final MMFlutterEngineGroup f337467a;

    /* renamed from: b */
    public FlutterEngine f337468b;

    /* renamed from: c */
    public String f337469c;

    /* renamed from: d */
    public final String f337470d = String.valueOf(hashCode());

    /* renamed from: e */
    public boolean f337471e = true;

    /* renamed from: f */
    public C112720l f337472f;

    /* renamed from: g */
    public C103282i f337473g = new C103282i();

    /* renamed from: h */
    public C112719j f337474h = new C112719j();

    /* renamed from: i */
    public long f337475i;

    /* renamed from: j */
    public C32226l<? super C112725w, C13598b0> f337476j;

    /* renamed from: k */
    public C32226l<? super C112712b, C13598b0> f337477k;

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.EngineGroup", mo125469f = "CachedFlutterEngineGroup.kt", mo125470l = {203}, mo125471m = "destroy")
    /* renamed from: a10.c$a */
    public static final class C112714a extends C66704d {

        /* renamed from: d */
        public Object f337478d;

        /* renamed from: e */
        public Object f337479e;

        /* renamed from: f */
        public /* synthetic */ Object f337480f;

        /* renamed from: g */
        public final /* synthetic */ C112713c f337481g;

        /* renamed from: h */
        public int f337482h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112714a(C112713c cVar, C15601d<? super C112714a> dVar) {
            super(dVar);
            this.f337481g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337480f = obj;
            this.f337482h |= Integer.MIN_VALUE;
            return this.f337481g.mo164454a(this);
        }
    }

    public C112713c(MMFlutterEngineGroup mMFlutterEngineGroup, boolean z) {
        C87412m.m108594g(mMFlutterEngineGroup, "group");
        this.f337467a = mMFlutterEngineGroup;
        Log.m165288i("MicroMsg.CachedFlutterEngineGroup", C87412m.m108600m("init: ", this));
        this.f337475i = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164454a(wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a10.C112713c.C112714a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            a10.c$a r0 = (a10.C112713c.C112714a) r0
            int r1 = r0.f337482h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337482h = r1
            goto L_0x0018
        L_0x0013:
            a10.c$a r0 = new a10.c$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f337480f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f337482h
            r3 = 0
            java.lang.String r4 = "MicroMsg.CachedFlutterEngineGroup"
            r5 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r5) goto L_0x0032
            java.lang.Object r1 = r0.f337479e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f337478d
            a10.c r0 = (a10.C112713c) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008a
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "destroy: "
            java.lang.String r9 = gy3.C87412m.m108600m(r9, r8)
            p172io.flutter.Log.m165288i(r4, r9)
            r8.f337471e = r3
            java.lang.String r9 = r8.f337469c
            a10.i r2 = r8.f337473g
            r0.f337478d = r8
            r0.f337479e = r9
            r0.f337482h = r5
            r2.getClass()
            wx3.h r6 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r6.<init>(r0)
            io.flutter.plugin.common.BasicMessageChannel<java.lang.String> r0 = r2.f304526d
            if (r0 != 0) goto L_0x006d
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r6.resumeWith(r0)
        L_0x006d:
            io.flutter.plugin.common.BasicMessageChannel<java.lang.String> r0 = r2.f304526d
            if (r0 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            a10.h r2 = new a10.h
            r2.<init>(r6)
            java.lang.String r7 = "engine_exit"
            r0.send(r7, r2)
        L_0x007c:
            java.lang.Object r0 = r6.mo90314b()
            if (r0 != r1) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0085:
            if (r0 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r0 = r8
            r1 = r9
        L_0x008a:
            java.lang.String r9 = "destroy: after engine exit "
            java.lang.String r9 = gy3.C87412m.m108600m(r9, r0)
            p172io.flutter.Log.m165288i(r4, r9)
            if (r1 == 0) goto L_0x009b
            int r9 = r1.length()
            if (r9 != 0) goto L_0x009c
        L_0x009b:
            r3 = 1
        L_0x009c:
            if (r3 != 0) goto L_0x00d6
            java.lang.String r9 = "engineKey"
            gy3.C87412m.m108594g(r1, r9)
            io.flutter.embedding.engine.FlutterEngineCache r9 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            io.flutter.embedding.engine.FlutterEngine r9 = r9.get(r1)
            io.flutter.embedding.engine.FlutterEngineCache r2 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            r2.remove(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "clear: engineId="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", engine="
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.MMFlutterEngine"
            p172io.flutter.Log.m165288i(r2, r1)
            if (r9 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r9.destroy()
        L_0x00d6:
            r9 = 0
            r0.f337468b = r9
            r0.f337469c = r9
            r0.f337472f = r9
            n10.e$a r9 = n10.C117593e.f351816e
            java.lang.String r9 = r0.f337470d
            java.lang.String r0 = "engineGroupId"
            gy3.C87412m.m108594g(r9, r0)
            java.util.HashMap<java.lang.String, n10.e> r0 = n10.C117593e.f351817f
            r0.remove(r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112713c.mo164454a(wx3.d):java.lang.Object");
    }
}
