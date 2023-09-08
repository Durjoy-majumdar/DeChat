package ck2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalDataUIC$requestSelfRingtoneRemote$1", mo125469f = "RingtoneGlobalDataUIC.kt", mo125470l = {38, 49, 52}, mo125471m = "invokeSuspend")
/* renamed from: ck2.u */
public final class C54928u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f153947d;

    /* renamed from: e */
    public Object f153948e;

    /* renamed from: f */
    public Object f153949f;

    /* renamed from: g */
    public int f153950g;

    /* renamed from: h */
    public final /* synthetic */ C54925s f153951h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54928u(C54925s sVar, C15601d<? super C54928u> dVar) {
        super(2, dVar);
        this.f153951h = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54928u(this.f153951h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54928u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: ve3.a1} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2, types: [wj2.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r7 = r24
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r7.f153950g
            r9 = 0
            java.lang.String r10 = "getUsernameFromUserInfo()"
            r11 = 3
            r12 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r13) goto L_0x0042
            if (r0 == r12) goto L_0x0029
            if (r0 != r11) goto L_0x0021
            java.lang.Object r0 = r7.f153949f
            wj2.f r0 = (wj2.C66132f) r0
            java.lang.Object r1 = r7.f153947d
            ck2.s r1 = (ck2.C54925s) r1
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x012c
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            java.lang.Object r0 = r7.f153949f
            wj2.f r0 = (wj2.C66132f) r0
            java.lang.Object r1 = r7.f153948e
            wj2.f r1 = (wj2.C66132f) r1
            java.lang.Object r2 = r7.f153947d
            ck2.s r2 = (ck2.C54925s) r2
            kotlin.ResultKt.throwOnFailure(r25)
            r9 = r0
            r0 = r25
            r23 = r2
            r2 = r1
            r1 = r23
            goto L_0x00fc
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r25)     // Catch:{ Exception -> 0x0063 }
            r0 = r25
            goto L_0x0060
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r25)
            vj2.k r0 = new vj2.k     // Catch:{ Exception -> 0x0063 }
            r0.<init>()     // Catch:{ Exception -> 0x0063 }
            r1 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r7.f153950g = r13     // Catch:{ Exception -> 0x0063 }
            r4 = r24
            java.lang.Object r0 = q40.C89456b.m111831a(r0, r1, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0063 }
            if (r0 != r8) goto L_0x0060
            return r8
        L_0x0060:
            ve3.w r0 = (ve3.C52859w) r0     // Catch:{ Exception -> 0x0063 }
            goto L_0x006b
        L_0x0063:
            java.lang.String r0 = "SimpleUIComponent"
            java.lang.String r1 = "GetSearchRingBackCgi failed in RingtoneSearchMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r0 = r9
        L_0x006b:
            if (r0 == 0) goto L_0x0141
            ck2.s r1 = r7.f153951h
            boolean r2 = r0.f147642e
            nj2.p r3 = nj2.C61768p.f175586a
            nj2.C61768p.m72487o()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = nj2.C61768p.f175590e
            java.lang.String r4 = "keyParamsMMKv"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r4 = "show_enable_caller_listen_my_ringback"
            r3.putBoolean(r4, r2)
            ve3.e r0 = r0.f147641d
            if (r0 == 0) goto L_0x0141
            wj2.h$a r14 = wj2.C66135h.f190107E
            ve3.n0 r2 = r0.f147579d
            if (r2 == 0) goto L_0x00ca
            int r3 = r2.f189020d
            if (r3 == r13) goto L_0x00b4
            if (r3 == r12) goto L_0x0098
            wj2.f r2 = r14.mo90187b()
            goto L_0x00c9
        L_0x0098:
            ve3.g r3 = r2.f189022f
            if (r3 != 0) goto L_0x009d
            goto L_0x00ca
        L_0x009d:
            wj2.f r2 = r14.mo90189e(r3, r2)
            int r3 = r0.f147581f
            long r3 = (long) r3
            r2.f190080c = r3
            int r3 = r0.f147580e
            long r3 = (long) r3
            r2.f190079b = r3
            ve3.n0 r3 = r0.f147579d
            if (r3 == 0) goto L_0x00b1
            ve3.a1 r9 = r3.f189026j
        L_0x00b1:
            r2.f190095r = r9
            goto L_0x00c9
        L_0x00b4:
            int r3 = r0.f147580e
            long r3 = (long) r3
            int r5 = r0.f147581f
            long r5 = (long) r5
            r20 = 0
            r21 = 8
            r22 = 0
            r15 = r3
            r17 = r5
            r19 = r2
            wj2.f r2 = wj2.C66135h.C66136a.m77957h(r14, r15, r17, r19, r20, r21, r22)
        L_0x00c9:
            r9 = r2
        L_0x00ca:
            if (r9 == 0) goto L_0x0141
            ve3.n0 r0 = r0.f147579d
            r9.f190083f = r0
            java.lang.String r14 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r14, r10)
            r16 = 0
            r18 = 4
            r19 = 0
            r15 = r9
            nj2.C61768p.m72486n(r14, r15, r16, r18, r19)
            rj2.a r0 = rj2.C63447a.f179958a
            java.lang.String r2 = eb0.C75592q0.m90789s()
            int r2 = r2.hashCode()
            long r2 = (long) r2
            r7.f153947d = r1
            r7.f153948e = r9
            r7.f153949f = r9
            r7.f153950g = r12
            java.lang.Object r0 = r0.mo88313b(r2, r9, r7)
            if (r0 != r8) goto L_0x00fb
            return r8
        L_0x00fb:
            r2 = r9
        L_0x00fc:
            wj2.f r0 = (wj2.C66132f) r0
            if (r0 != 0) goto L_0x0103
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0103:
            ve3.n0 r3 = r9.f190083f
            if (r3 == 0) goto L_0x010a
            boolean r3 = r3.f189024h
            goto L_0x010b
        L_0x010a:
            r3 = 0
        L_0x010b:
            r0.f190091n = r3
            java.lang.String r3 = eb0.C75592q0.m90789s()
            int r3 = r3.hashCode()
            long r3 = (long) r3
            rj2.C63447a.m74788d(r3, r0)
            nj2.p r3 = nj2.C61768p.f175586a
            r7.f153947d = r1
            r7.f153948e = r2
            r7.f153949f = r0
            r7.f153950g = r11
            java.lang.String r2 = ""
            java.lang.Object r2 = r3.mo86689a(r2, r0, r13, r7)
            if (r2 != r8) goto L_0x012c
            return r8
        L_0x012c:
            java.lang.String r11 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r11, r10)
            r13 = 0
            r15 = 4
            r16 = 0
            r12 = r0
            nj2.C61768p.m72486n(r11, r12, r13, r15, r16)
            androidx.lifecycle.z<wj2.f> r1 = r1.f153942d
            r1.postValue(r0)
        L_0x0141:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.C54928u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
