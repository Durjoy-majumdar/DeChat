package a14;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: a14.x0 */
public final class C53965x0 {

    @C91590f(mo125468c = "kotlinx.coroutines.DelayKt", mo125469f = "Delay.kt", mo125470l = {148}, mo125471m = "awaitCancellation")
    /* renamed from: a14.x0$a */
    public static final class C53966a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f151207d;

        /* renamed from: e */
        public int f151208e;

        public C53966a(C15601d<? super C53966a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f151207d = obj;
            this.f151208e |= Integer.MIN_VALUE;
            C53965x0.m60606a(this);
            return C15911a.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m60606a(wx3.C15601d<?> r4) {
        /*
            boolean r0 = r4 instanceof a14.C53965x0.C53966a
            if (r0 == 0) goto L_0x0013
            r0 = r4
            a14.x0$a r0 = (a14.C53965x0.C53966a) r0
            int r1 = r0.f151208e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f151208e = r1
            goto L_0x0018
        L_0x0013:
            a14.x0$a r0 = new a14.x0$a
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.f151207d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f151208e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0047
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r4)
            r0.f151208e = r3
            a14.m r4 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r4.<init>(r0, r3)
            r4.mo74609p()
            java.lang.Object r4 = r4.mo74608o()
            if (r4 != r1) goto L_0x0047
            return r1
        L_0x0047:
            rx3.d r4 = new rx3.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53965x0.m60606a(wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m60607b(long j, C15601d<? super C13598b0> dVar) {
        if (j <= 0) {
            return C13598b0.f38549a;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        if (j < MAlarmHandler.NEXT_FIRE_INTERVAL) {
            C66212f.C66215b bVar = mVar.f151173h.get(C66210e.C66211a.f190251d);
            C53960w0 w0Var = bVar instanceof C53960w0 ? (C53960w0) bVar : null;
            if (w0Var == null) {
                w0Var = C53949t0.f151198a;
            }
            w0Var.mo74578I(j, mVar);
        }
        Object o = mVar.mo74608o();
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
