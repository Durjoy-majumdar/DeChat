package a10;

import android.content.Context;
import fy3.C32226l;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: a10.a */
public final class C112709a {

    /* renamed from: a */
    public Context f337442a;

    /* renamed from: b */
    public String f337443b = "";

    /* renamed from: c */
    public String[] f337444c = new String[0];

    /* renamed from: d */
    public C32226l<? super C112712b, C13598b0> f337445d;

    @C91590f(mo125468c = "com.tencent.mm.flutter.base.CachedFlutterEngineGroup$Builder", mo125469f = "CachedFlutterEngineGroup.kt", mo125470l = {78}, mo125471m = "build")
    /* renamed from: a10.a$a */
    public static final class C112710a extends C66704d {

        /* renamed from: d */
        public Object f337446d;

        /* renamed from: e */
        public /* synthetic */ Object f337447e;

        /* renamed from: f */
        public final /* synthetic */ C112709a f337448f;

        /* renamed from: g */
        public int f337449g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112710a(C112709a aVar, C15601d<? super C112710a> dVar) {
            super(dVar);
            this.f337448f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f337447e = obj;
            this.f337449g |= Integer.MIN_VALUE;
            return this.f337448f.mo164445a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164445a(wx3.C15601d<? super a10.C112713c> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a10.C112709a.C112710a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            a10.a$a r0 = (a10.C112709a.C112710a) r0
            int r1 = r0.f337449g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337449g = r1
            goto L_0x0018
        L_0x0013:
            a10.a$a r0 = new a10.a$a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f337447e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f337449g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f337446d
            a10.c r0 = (a10.C112713c) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0097
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r10)
            a10.f r10 = a10.C112717f.f337490a
            r10.mo164460f()
            io.flutter.embedding.engine.MMFlutterEngineGroup r2 = new io.flutter.embedding.engine.MMFlutterEngineGroup
            android.content.Context r4 = r9.f337442a
            gy3.C87412m.m108591d(r4)
            java.lang.String[] r5 = r9.f337444c
            r2.<init>(r4, r5, r3)
            a10.c r4 = new a10.c
            r4.<init>(r2, r3)
            fy3.l<? super a10.b, rx3.b0> r2 = r9.f337445d
            r4.f337477k = r2
            java.lang.String r2 = r9.f337443b
            int r2 = r2.length()
            r5 = 0
            if (r2 <= 0) goto L_0x005b
            r2 = 1
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = "root"
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0067
            r5 = 1
        L_0x0067:
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = r9.f337443b
            r0.f337446d = r4
            r0.f337449g = r3
            java.lang.String r6 = "plugin"
            gy3.C87412m.m108594g(r5, r6)
            a10.z r6 = new a10.z
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r8 = "home"
            r6.<init>(r5, r8, r2, r7)
            r10.mo164459e(r6)
            r6.f337548f = r3
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            a10.e r2 = new a10.e
            r5 = 0
            r2.<init>(r6, r4, r3, r5)
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r0 = r4
        L_0x0097:
            r4 = r0
        L_0x0098:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.C112709a.mo164445a(wx3.d):java.lang.Object");
    }
}
