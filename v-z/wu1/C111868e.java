package wu1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoIPReportAgent$startPssCollector$1", mo125469f = "FlutterVoIPReportAgent.kt", mo125470l = {135, 136}, mo125471m = "invokeSuspend")
/* renamed from: wu1.e */
public final class C111868e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f334925d;

    /* renamed from: e */
    public long f334926e;

    /* renamed from: f */
    public int f334927f;

    /* renamed from: g */
    public /* synthetic */ Object f334928g;

    public C111868e(C15601d<? super C111868e> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C111868e eVar = new C111868e(dVar);
        eVar.f334928g = obj;
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111868e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f334927f
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            long r5 = r13.f334926e
            java.lang.Object r1 = r13.f334925d
            wu1.b$a r1 = (wu1.C111864b.C111865a) r1
            java.lang.Object r7 = r13.f334928g
            a14.n0 r7 = (a14.C0000n0) r7
            kotlin.ResultKt.throwOnFailure(r14)
            r8 = r5
            r5 = r13
            goto L_0x006e
        L_0x001d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0025:
            java.lang.Object r1 = r13.f334928g
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r1
            r1 = r13
            goto L_0x004d
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f334928g
            a14.n0 r14 = (a14.C0000n0) r14
            r1 = r13
        L_0x0037:
            boolean r5 = a14.C53930o0.m60560g(r14)
            if (r5 == 0) goto L_0x0081
            r5 = 10000(0x2710, double:4.9407E-320)
            r1.f334928g = r14
            r1.f334925d = r2
            r1.f334927f = r4
            java.lang.Object r5 = a14.C53965x0.m60607b(r5, r1)
            if (r5 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r7 = r14
        L_0x004d:
            wu1.b$a r14 = wu1.C111864b.f334912e
            long r5 = r14.f334916d
            wu1.b r8 = wu1.C111864b.f334908a
            r1.f334928g = r7
            r1.f334925d = r14
            r1.f334926e = r5
            r1.f334927f = r3
            a14.h0 r8 = a14.C53872d1.f151119c
            wu1.c r9 = new wu1.c
            r9.<init>(r2)
            java.lang.Object r8 = a14.C53895h.m60469g(r8, r9, r1)
            if (r8 != r0) goto L_0x0069
            return r0
        L_0x0069:
            r12 = r1
            r1 = r14
            r14 = r8
            r8 = r5
            r5 = r12
        L_0x006e:
            java.lang.Number r14 = (java.lang.Number) r14
            long r10 = r14.longValue()
            long r8 = r8 + r10
            r1.f334916d = r8
            wu1.b$a r14 = wu1.C111864b.f334912e
            int r1 = r14.f334917e
            int r1 = r1 + r4
            r14.f334917e = r1
            r1 = r5
            r14 = r7
            goto L_0x0037
        L_0x0081:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111868e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
