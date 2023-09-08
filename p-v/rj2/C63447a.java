package rj2;

import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import ve3.C65685n0;
import wj2.C66132f;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: rj2.a */
public final class C63447a {

    /* renamed from: a */
    public static final C63447a f179958a = new C63447a();

    /* renamed from: b */
    public static final Map<Long, C66132f> f179959b = Collections.synchronizedMap(new HashMap());

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.feed.ExclusiveRingtoneCacheLogic", mo125469f = "ExclusiveRingtoneCacheLogic.kt", mo125470l = {53}, mo125471m = "loadFinderResource")
    /* renamed from: rj2.a$a */
    public static final class C63448a extends C66704d {

        /* renamed from: d */
        public long f179960d;

        /* renamed from: e */
        public Object f179961e;

        /* renamed from: f */
        public Object f179962f;

        /* renamed from: g */
        public Object f179963g;

        /* renamed from: h */
        public /* synthetic */ Object f179964h;

        /* renamed from: i */
        public final /* synthetic */ C63447a f179965i;

        /* renamed from: j */
        public int f179966j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63448a(C63447a aVar, C15601d<? super C63448a> dVar) {
            super(dVar);
            this.f179965i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f179964h = obj;
            this.f179966j |= Integer.MIN_VALUE;
            return this.f179965i.mo88314c(0, (C66132f) null, this);
        }
    }

    /* renamed from: a */
    public static final C66132f m74787a(long j) {
        C66132f fVar;
        Map<Long, C66132f> map = f179959b;
        C87412m.m108593f(map, "cacheFriendRingtoneItem");
        synchronized (map) {
            fVar = map.get(Long.valueOf(j));
        }
        return fVar;
    }

    /* renamed from: d */
    public static final void m74788d(long j, C66132f fVar) {
        C87412m.m108594g(fVar, "info");
        Map<Long, C66132f> map = f179959b;
        C87412m.m108593f(map, "cacheFriendRingtoneItem");
        synchronized (map) {
            C87412m.m108593f(map, "cacheFriendRingtoneItem");
            map.put(Long.valueOf(j), fVar);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (fVar.mo90179j()) {
            C63449b.m74792c(fVar.f190092o, fVar);
        }
    }

    /* renamed from: b */
    public final Object mo88313b(long j, C66132f fVar, C15601d<? super C66132f> dVar) {
        if (fVar == null) {
            return fVar;
        }
        C65685n0 n0Var = fVar.f190083f;
        boolean z = true;
        if (!(n0Var != null && n0Var.f189020d == 2)) {
            if (n0Var == null || n0Var.f189020d != 1) {
                z = false;
            }
            if (z) {
                return fVar;
            }
            return null;
        } else if (fVar.f190081d != null) {
            return fVar;
        } else {
            Object c = f179958a.mo88314c(j, fVar, dVar);
            return c == C15911a.COROUTINE_SUSPENDED ? c : (C66132f) c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo88314c(long r27, wj2.C66132f r29, wx3.C15601d<? super wj2.C66132f> r30) {
        /*
            r26 = this;
            r0 = r29
            r1 = r30
            boolean r2 = r1 instanceof rj2.C63447a.C63448a
            if (r2 == 0) goto L_0x0019
            r2 = r1
            rj2.a$a r2 = (rj2.C63447a.C63448a) r2
            int r3 = r2.f179966j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f179966j = r3
            r3 = r26
            goto L_0x0020
        L_0x0019:
            rj2.a$a r2 = new rj2.a$a
            r3 = r26
            r2.<init>(r3, r1)
        L_0x0020:
            java.lang.Object r1 = r2.f179964h
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r2.f179966j
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x004b
            if (r5 != r6) goto L_0x0043
            long r4 = r2.f179960d
            java.lang.Object r0 = r2.f179963g
            ve3.f r0 = (ve3.C65680f) r0
            java.lang.Object r6 = r2.f179962f
            ve3.n0 r6 = (ve3.C65685n0) r6
            java.lang.Object r2 = r2.f179961e
            wj2.f r2 = (wj2.C66132f) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r11 = r4
            r21 = r6
            r5 = r0
            r0 = r2
            goto L_0x0077
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r1)
            ve3.n0 r1 = r0.f190083f
            if (r1 != 0) goto L_0x0053
            return r7
        L_0x0053:
            ve3.g r5 = r1.f189022f
            if (r5 != 0) goto L_0x0058
            return r7
        L_0x0058:
            ve3.f r5 = r5.f188994d
            if (r5 != 0) goto L_0x005d
            return r7
        L_0x005d:
            long r8 = r5.f188983d
            java.lang.String r10 = r5.f188984e
            r2.f179961e = r0
            r2.f179962f = r1
            r2.f179963g = r5
            r11 = r27
            r2.f179960d = r11
            r2.f179966j = r6
            java.lang.Object r2 = yj2.C66655a.m78639a(r8, r10, r2)
            if (r2 != r4) goto L_0x0074
            return r4
        L_0x0074:
            r21 = r1
            r1 = r2
        L_0x0077:
            yj2.a$a r1 = (yj2.C66655a.C66656a) r1
            if (r1 == 0) goto L_0x00f2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f191655a
            if (r2 != 0) goto L_0x0080
            return r7
        L_0x0080:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x00f2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x00f2
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 == 0) goto L_0x00f2
            wj2.h$a r13 = wj2.C66135h.f190107E
            r14 = 0
            int r2 = r2.videoDuration
            long r6 = (long) r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r2
            long r16 = r6 * r8
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f191655a
            long r6 = r5.f188983d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f191655a
            r4.append(r1)
            r1 = 95
            r4.append(r1)
            java.lang.String r1 = r5.f188984e
            r4.append(r1)
            java.lang.String r22 = r4.toString()
            r23 = 0
            r24 = 64
            r25 = 0
            r18 = r2
            r19 = r6
            wj2.f r1 = wj2.C66135h.C66136a.m77956c(r13, r14, r16, r18, r19, r21, r22, r23, r24, r25)
            java.lang.String r2 = r0.f190088k
            if (r2 == 0) goto L_0x00cc
            r1.f190088k = r2
        L_0x00cc:
            java.lang.String r2 = r0.f190085h
            if (r2 == 0) goto L_0x00d2
            r1.f190085h = r2
        L_0x00d2:
            java.lang.String r2 = r0.f190087j
            if (r2 == 0) goto L_0x00d8
            r1.f190087j = r2
        L_0x00d8:
            ve3.a1 r2 = r0.f190095r
            r1.f190095r = r2
            java.lang.String r2 = r0.f190085h
            r1.mo90181l(r2)
            java.lang.String r2 = r0.f190087j
            java.lang.String r4 = "<set-?>"
            gy3.C87412m.m108594g(r2, r4)
            r1.f190087j = r2
            ve3.n0 r0 = r0.f190083f
            r1.f190083f = r0
            m74788d(r11, r1)
            return r1
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rj2.C63447a.mo88314c(long, wj2.f, wx3.d):java.lang.Object");
    }
}
