package ck2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveFlowUIC$loadMore$1", mo125469f = "RingtoneExclusiveFlowUIC.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
/* renamed from: ck2.g */
public final class C54894g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153867d;

    /* renamed from: e */
    public final /* synthetic */ C54897h f153868e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54894g(C54897h hVar, C15601d<? super C54894g> dVar) {
        super(2, dVar);
        this.f153868e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54894g(this.f153868e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54894g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        r5 = (r5 = r5.mo96097Ni()).get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r15
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f153867d
            r9 = 0
            r10 = 0
            r2 = 1
            r11 = -1
            java.lang.String r13 = "MicroMsg.RingtoneExclusiveDataUIC"
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r16)     // Catch:{ d -> 0x0016 }
            r1 = r16
            goto L_0x0051
        L_0x0016:
            r0 = move-exception
            goto L_0x0119
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r16)
            ck2.h r1 = r8.f153868e
            boolean r3 = r1.f153873e
            if (r3 != 0) goto L_0x0036
            qj2.a r0 = r1.f153875g
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList<java.lang.String> r1 = r1.f153874f
            r0.mo88106c3(r1)
        L_0x0033:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0036:
            vj2.d r3 = new vj2.d     // Catch:{ d -> 0x0016 }
            long r4 = r1.f153872d     // Catch:{ d -> 0x0016 }
            r3.<init>(r4)     // Catch:{ d -> 0x0016 }
            r4 = 0
            r6 = 0
            r7 = 3
            r14 = 0
            r8.f153867d = r2     // Catch:{ d -> 0x0016 }
            r1 = r3
            r2 = r4
            r4 = r6
            r5 = r15
            r6 = r7
            r7 = r14
            java.lang.Object r1 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0016 }
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            ve3.k r1 = (ve3.C52837k) r1     // Catch:{ d -> 0x0016 }
            ck2.h r0 = r8.f153868e
            r0.f153872d = r11
            boolean r2 = r1.f147595d
            r0.f153873e = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<ve3.i> r1 = r1.f147596e
            java.lang.String r2 = "resp.Infos"
            gy3.C87412m.m108593f(r1, r2)
            ck2.h r2 = r8.f153868e
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r1.next()
            ve3.i r3 = (ve3.C52833i) r3
            long r4 = r2.f153872d
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0086
            long r6 = r3.f147591g
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x008a
        L_0x0086:
            long r4 = r3.f147591g
            r2.f153872d = r4
        L_0x008a:
            java.lang.String r4 = r3.f147588d
            if (r4 != 0) goto L_0x008f
            goto L_0x006e
        L_0x008f:
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            if (r5 == 0) goto L_0x00aa
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            if (r5 == 0) goto L_0x00aa
            com.tencent.mm.storage.z1 r5 = r5.get(r4)
            if (r5 == 0) goto L_0x00aa
            boolean r5 = r5.mo62927s3()
            goto L_0x00ab
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            if (r5 == 0) goto L_0x00d8
            java.util.ArrayList<java.lang.String> r5 = r2.f153874f
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x00d8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ringtone username is "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            java.util.ArrayList<java.lang.String> r5 = r2.f153874f
            r5.add(r4)
            pj2.a r4 = new pj2.a
            r4.<init>(r3)
            r0.add(r4)
            goto L_0x006e
        L_0x00d8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " is not you friend"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r3)
            goto L_0x006e
        L_0x00ed:
            ck2.h r1 = r8.f153868e
            qj2.a r1 = r1.f153875g
            if (r1 == 0) goto L_0x0104
            a14.n0 r2 = r1.f179273e
            qj2.b r5 = new qj2.b
            r5.<init>(r1, r0, r9)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            r1.f179277i = r0
        L_0x0104:
            ck2.h r0 = r8.f153868e
            boolean r1 = r0.f153873e
            if (r1 != 0) goto L_0x0116
            qj2.a r1 = r0.f153875g
            if (r1 == 0) goto L_0x0113
            java.util.ArrayList<java.lang.String> r0 = r0.f153874f
            r1.mo88106c3(r0)
        L_0x0113:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0116:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0119:
            ck2.h r1 = r8.f153868e
            r1.f153873e = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GetAllFriendRingBackCgi failed: "
            r1.append(r2)
            java.lang.String r0 = r0.f35059g
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            ck2.h r0 = r8.f153868e
            long r1 = r0.f153872d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0150
            qj2.a r0 = r0.f153875g
            if (r0 == 0) goto L_0x0150
            a14.n0 r1 = r0.f179273e
            qj2.e r4 = new qj2.e
            r4.<init>(r0, r9)
            r3 = 0
            r5 = 3
            r6 = 0
            r2 = 0
            a14.z1 r1 = a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
            r0.f179277i = r1
        L_0x0150:
            ck2.h r0 = r8.f153868e
            qj2.a r1 = r0.f153875g
            if (r1 == 0) goto L_0x015b
            java.util.ArrayList<java.lang.String> r0 = r0.f153874f
            r1.mo88106c3(r0)
        L_0x015b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.C54894g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
