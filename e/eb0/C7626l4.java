package eb0;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.model.RelatedWordDataStore$getQueryIsToIntercept$2", mo125469f = "RelatedWordDataStore.kt", mo125470l = {22}, mo125471m = "invokeSuspend")
/* renamed from: eb0.l4 */
public final class C7626l4 extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f25914d;

    /* renamed from: e */
    public final /* synthetic */ String f25915e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7626l4(String str, C15601d<? super C7626l4> dVar) {
        super(2, dVar);
        this.f25915e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C7626l4(this.f25915e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C7626l4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r12.f25914d
            r2 = 0
            java.lang.String r3 = "MicroMsg.RelatedWordDataStore"
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r4) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ d -> 0x0010 }
            goto L_0x0066
        L_0x0010:
            r13 = move-exception
            goto L_0x0085
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r13)
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r1 = 274436(0x43004, float:3.84567E-40)
            r5 = 0
            java.lang.Object r13 = r13.mo119684e(r1, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "getQueryIsToIntercept >> region: "
            r1.append(r5)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.String r1 = "CN"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x0050
            java.lang.String r13 = "no CN to intercept"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            goto L_0x009f
        L_0x0050:
            eb0.u3 r5 = new eb0.u3     // Catch:{ d -> 0x0010 }
            java.lang.String r13 = r12.f25915e     // Catch:{ d -> 0x0010 }
            r5.<init>(r13, r1)     // Catch:{ d -> 0x0010 }
            r6 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            r12.f25914d = r4     // Catch:{ d -> 0x0010 }
            r9 = r12
            java.lang.Object r13 = q40.C89456b.m111831a(r5, r6, r8, r9, r10, r11)     // Catch:{ d -> 0x0010 }
            if (r13 != r0) goto L_0x0066
            return r0
        L_0x0066:
            te3.ku2 r13 = (te3.C50181ku2) r13     // Catch:{ d -> 0x0010 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ d -> 0x0010 }
            r0.<init>()     // Catch:{ d -> 0x0010 }
            java.lang.String r1 = "response: "
            r0.append(r1)     // Catch:{ d -> 0x0010 }
            int r1 = r13.f137048e     // Catch:{ d -> 0x0010 }
            r0.append(r1)     // Catch:{ d -> 0x0010 }
            java.lang.String r0 = r0.toString()     // Catch:{ d -> 0x0010 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ d -> 0x0010 }
            int r13 = r13.f137048e     // Catch:{ d -> 0x0010 }
            if (r13 <= 0) goto L_0x0083
            goto L_0x009b
        L_0x0083:
            r13 = 0
            goto L_0x009c
        L_0x0085:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getQueryIsToIntercept >> exception， "
            r0.append(r1)
            java.lang.String r13 = r13.f35059g
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
        L_0x009b:
            r13 = 1
        L_0x009c:
            if (r13 == 0) goto L_0x009f
            r2 = 1
        L_0x009f:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C7626l4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
