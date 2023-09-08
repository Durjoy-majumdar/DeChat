package rj2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.feed.RingtonePlayerFlow$checkResourceAvailable$2", mo125469f = "RingtonePlayerFlow.kt", mo125470l = {89, 91, 107, 117, 129}, mo125471m = "invokeSuspend")
/* renamed from: rj2.d */
public final class C63459d extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

    /* renamed from: d */
    public Object f179998d;

    /* renamed from: e */
    public Object f179999e;

    /* renamed from: f */
    public Object f180000f;

    /* renamed from: g */
    public int f180001g;

    /* renamed from: h */
    public long f180002h;

    /* renamed from: i */
    public int f180003i;

    /* renamed from: j */
    public final /* synthetic */ C63451c f180004j;

    /* renamed from: n */
    public final /* synthetic */ C66132f f180005n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63459d(C63451c cVar, C66132f fVar, C15601d<? super C63459d> dVar) {
        super(2, dVar);
        this.f180004j = cVar;
        this.f180005n = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63459d(this.f180004j, this.f180005n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63459d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024c, code lost:
        r4 = r4.f147573d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f180003i
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            java.lang.String r8 = "MicroMsg.RingtonePlayerFlow"
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x006e
            if (r2 == r9) goto L_0x0060
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x002d
            if (r2 != r3) goto L_0x0025
            java.lang.Object r1 = r0.f179998d
            wj2.f r1 = (wj2.C66132f) r1
            kotlin.ResultKt.throwOnFailure(r16)
            r3 = r16
            goto L_0x02a3
        L_0x0025:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002d:
            java.lang.Object r2 = r0.f179999e
            wj2.f r2 = (wj2.C66132f) r2
            java.lang.Object r4 = r0.f179998d
            wj2.f r4 = (wj2.C66132f) r4
            kotlin.ResultKt.throwOnFailure(r16)
            r5 = r4
            r4 = r16
            goto L_0x0248
        L_0x003d:
            long r5 = r0.f180002h
            java.lang.Object r2 = r0.f179998d
            wj2.f r2 = (wj2.C66132f) r2
            kotlin.ResultKt.throwOnFailure(r16)
            r11 = r5
            r5 = r16
            goto L_0x01c0
        L_0x004b:
            int r1 = r0.f180001g
            java.lang.Object r2 = r0.f180000f
            wj2.f r2 = (wj2.C66132f) r2
            java.lang.Object r3 = r0.f179999e
            ve3.f0 r3 = (ve3.C65681f0) r3
            java.lang.Object r4 = r0.f179998d
            wj2.f r4 = (wj2.C66132f) r4
            kotlin.ResultKt.throwOnFailure(r16)
            r5 = r16
            goto L_0x014d
        L_0x0060:
            int r2 = r0.f180001g
            java.lang.Object r3 = r0.f179998d
            wj2.f r3 = (wj2.C66132f) r3
            kotlin.ResultKt.throwOnFailure(r16)
            r4 = r3
            r3 = r16
            goto L_0x0101
        L_0x006e:
            kotlin.ResultKt.throwOnFailure(r16)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "checkResourceAvailable, ringWithVibrate:"
            r2.append(r11)
            rj2.c r11 = r0.f180004j
            boolean r11 = r11.f179985q
            r2.append(r11)
            java.lang.String r11 = ", finderObjectId: "
            r2.append(r11)
            wj2.f r11 = r0.f180005n
            if (r11 == 0) goto L_0x0093
            long r11 = r11.f190092o
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            goto L_0x0094
        L_0x0093:
            r13 = r10
        L_0x0094:
            r2.append(r13)
            java.lang.String r11 = ", musicSid:"
            r2.append(r11)
            wj2.f r11 = r0.f180005n
            if (r11 == 0) goto L_0x00a8
            int r11 = r11.f190094q
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            goto L_0x00a9
        L_0x00a8:
            r12 = r10
        L_0x00a9:
            r2.append(r12)
            java.lang.String r11 = ", info:"
            r2.append(r11)
            wj2.f r11 = r0.f180005n
            if (r11 == 0) goto L_0x00b8
            d03.a r11 = r11.f190078a
            goto L_0x00b9
        L_0x00b8:
            r11 = r10
        L_0x00b9:
            r2.append(r11)
            java.lang.String r11 = ", vibrateInfo:"
            r2.append(r11)
            wj2.f r11 = r0.f180005n
            if (r11 == 0) goto L_0x00d3
            ve3.a1 r11 = r11.f190095r
            if (r11 == 0) goto L_0x00d3
            int r11 = r11.hashCode()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            goto L_0x00d4
        L_0x00d3:
            r12 = r10
        L_0x00d4:
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            wj2.f r2 = r0.f180005n
            if (r2 != 0) goto L_0x00e3
            return r10
        L_0x00e3:
            d03.a r11 = r2.f190078a
            if (r11 != 0) goto L_0x0264
            int r11 = r2.f190094q
            if (r11 == 0) goto L_0x019d
            r0.f179998d = r2
            r0.f180001g = r11
            r0.f180003i = r9
            a14.h0 r3 = a14.C53872d1.f151119c
            nj2.f r4 = new nj2.f
            r4.<init>(r11, r10)
            java.lang.Object r3 = a14.C53895h.m60469g(r3, r4, r15)
            if (r3 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            r4 = r2
            r2 = r11
        L_0x0101:
            ve3.a0 r3 = (ve3.C52823a0) r3
            if (r3 == 0) goto L_0x010c
            ve3.n0 r3 = r3.f147573d
            if (r3 == 0) goto L_0x010c
            ve3.f0 r3 = r3.f189021e
            goto L_0x010d
        L_0x010c:
            r3 = r10
        L_0x010d:
            rj2.c r5 = r0.f180004j
            boolean r5 = r5.f179985q
            if (r5 == 0) goto L_0x015c
            r0.f179998d = r4
            r0.f179999e = r3
            r0.f180000f = r4
            r0.f180001g = r2
            r0.f180003i = r6
            boolean r5 = r4.mo90179j()
            if (r5 == 0) goto L_0x0133
            long r5 = r4.f190092o
            java.lang.String r11 = r4.f190093p
            a14.h0 r12 = a14.C53872d1.f151119c
            nj2.e r13 = new nj2.e
            r13.<init>(r5, r11, r10)
            java.lang.Object r5 = a14.C53895h.m60469g(r12, r13, r15)
            goto L_0x0148
        L_0x0133:
            boolean r5 = r4.mo90180k()
            if (r5 == 0) goto L_0x0147
            int r5 = r4.f190094q
            a14.h0 r6 = a14.C53872d1.f151119c
            nj2.f r11 = new nj2.f
            r11.<init>(r5, r10)
            java.lang.Object r5 = a14.C53895h.m60469g(r6, r11, r15)
            goto L_0x0148
        L_0x0147:
            r5 = r10
        L_0x0148:
            if (r5 != r1) goto L_0x014b
            return r1
        L_0x014b:
            r1 = r2
            r2 = r4
        L_0x014d:
            ve3.a0 r5 = (ve3.C52823a0) r5
            if (r5 == 0) goto L_0x0158
            ve3.n0 r5 = r5.f147573d
            if (r5 == 0) goto L_0x0158
            ve3.a1 r5 = r5.f189026j
            goto L_0x0159
        L_0x0158:
            r5 = r10
        L_0x0159:
            r2.f190095r = r5
            r2 = r1
        L_0x015c:
            if (r3 == 0) goto L_0x0197
            java.lang.String r1 = r3.f188989h
            if (r1 == 0) goto L_0x016a
            boolean r1 = z04.C112551y.m153811k(r1)
            r1 = r1 ^ r9
            if (r1 != r9) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r9 = 0
        L_0x016b:
            if (r9 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "music_ringtone_"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            nj2.o r1 = nj2.C61767o.f175575a
            java.lang.String r10 = r1.mo86687d(r2, r9)
            d03.a r1 = new d03.a
            java.lang.String r11 = r3.f188989h
            r12 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r4.f190078a = r1
            r4.mo90182m(r7)
            return r4
        L_0x0197:
            java.lang.String r1 = "checkResourceAvailable, get music detail fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            return r10
        L_0x019d:
            long r11 = r2.f190092o
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x025e
            java.lang.String r6 = r2.f190093p
            java.lang.String r11 = ""
            boolean r6 = gy3.C87412m.m108589b(r6, r11)
            if (r6 != 0) goto L_0x025e
            long r11 = r2.f190092o
            java.lang.String r6 = r2.f190093p
            r0.f179998d = r2
            r0.f180002h = r11
            r0.f180003i = r5
            java.lang.Object r5 = yj2.C66655a.m78639a(r11, r6, r15)
            if (r5 != r1) goto L_0x01c0
            return r1
        L_0x01c0:
            yj2.a$a r5 = (yj2.C66655a.C66656a) r5
            if (r5 == 0) goto L_0x01d7
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r5.f191655a
            if (r6 == 0) goto L_0x01d7
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x01d7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x01d7
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            com.tencent.mm.protocal.protobuf.FinderMedia r6 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r6
            goto L_0x01d8
        L_0x01d7:
            r6 = r10
        L_0x01d8:
            if (r5 == 0) goto L_0x0258
            boolean r5 = r5.f191656b
            if (r5 != 0) goto L_0x0258
            if (r6 == 0) goto L_0x0258
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            d03.a r5 = r5.mo76884uQ(r6, r11, r7)
            if (r5 != 0) goto L_0x01ef
            return r10
        L_0x01ef:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.f165948t
            r6.append(r7)
            java.lang.String r7 = ".ring"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.f165948t = r6
            java.lang.String r6 = "A0"
            r5.f165946r = r6
            r2.mo90182m(r9)
            r2.f190078a = r5
            rj2.c r5 = r0.f180004j
            boolean r5 = r5.f179985q
            if (r5 == 0) goto L_0x0264
            r0.f179998d = r2
            r0.f179999e = r2
            r0.f180003i = r4
            boolean r4 = r2.mo90179j()
            if (r4 == 0) goto L_0x022f
            long r4 = r2.f190092o
            java.lang.String r6 = r2.f190093p
            a14.h0 r7 = a14.C53872d1.f151119c
            nj2.e r8 = new nj2.e
            r8.<init>(r4, r6, r10)
            java.lang.Object r4 = a14.C53895h.m60469g(r7, r8, r15)
            goto L_0x0244
        L_0x022f:
            boolean r4 = r2.mo90180k()
            if (r4 == 0) goto L_0x0243
            int r4 = r2.f190094q
            a14.h0 r5 = a14.C53872d1.f151119c
            nj2.f r6 = new nj2.f
            r6.<init>(r4, r10)
            java.lang.Object r4 = a14.C53895h.m60469g(r5, r6, r15)
            goto L_0x0244
        L_0x0243:
            r4 = r10
        L_0x0244:
            if (r4 != r1) goto L_0x0247
            return r1
        L_0x0247:
            r5 = r2
        L_0x0248:
            ve3.a0 r4 = (ve3.C52823a0) r4
            if (r4 == 0) goto L_0x0253
            ve3.n0 r4 = r4.f147573d
            if (r4 == 0) goto L_0x0253
            ve3.a1 r4 = r4.f189026j
            goto L_0x0254
        L_0x0253:
            r4 = r10
        L_0x0254:
            r2.f190095r = r4
            r2 = r5
            goto L_0x0264
        L_0x0258:
            java.lang.String r1 = "checkResourceAvailable, get finder detail fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            return r10
        L_0x025e:
            java.lang.String r1 = "checkResourceAvailable, unreachable code"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            return r10
        L_0x0264:
            rj2.c r4 = r0.f180004j
            boolean r4 = r4.f179985q
            if (r4 == 0) goto L_0x02b1
            ve3.a1 r4 = r2.f190095r
            if (r4 != 0) goto L_0x02b1
            r0.f179998d = r2
            r0.f179999e = r10
            r0.f180003i = r3
            boolean r3 = r2.mo90179j()
            if (r3 == 0) goto L_0x028a
            long r3 = r2.f190092o
            java.lang.String r5 = r2.f190093p
            a14.h0 r6 = a14.C53872d1.f151119c
            nj2.e r7 = new nj2.e
            r7.<init>(r3, r5, r10)
            java.lang.Object r3 = a14.C53895h.m60469g(r6, r7, r15)
            goto L_0x029f
        L_0x028a:
            boolean r3 = r2.mo90180k()
            if (r3 == 0) goto L_0x029e
            int r3 = r2.f190094q
            a14.h0 r4 = a14.C53872d1.f151119c
            nj2.f r5 = new nj2.f
            r5.<init>(r3, r10)
            java.lang.Object r3 = a14.C53895h.m60469g(r4, r5, r15)
            goto L_0x029f
        L_0x029e:
            r3 = r10
        L_0x029f:
            if (r3 != r1) goto L_0x02a2
            return r1
        L_0x02a2:
            r1 = r2
        L_0x02a3:
            ve3.a0 r3 = (ve3.C52823a0) r3
            if (r3 == 0) goto L_0x02b0
            ve3.n0 r2 = r3.f147573d
            if (r2 == 0) goto L_0x02ad
            ve3.a1 r10 = r2.f189026j
        L_0x02ad:
            r1.f190095r = r10
            return r1
        L_0x02b0:
            r2 = r1
        L_0x02b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rj2.C63459d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
