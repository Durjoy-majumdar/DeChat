package rj2;

import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: rj2.b */
public final class C63449b {

    /* renamed from: a */
    public static final C63449b f179967a = new C63449b();

    /* renamed from: b */
    public static final Map<Long, C66132f> f179968b = Collections.synchronizedMap(new HashMap());

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.feed.RingtoneDetailCacheLogic", mo125469f = "RingtoneDetailCacheLogic.kt", mo125470l = {48}, mo125471m = "loadFinderResource")
    /* renamed from: rj2.b$a */
    public static final class C63450a extends C66704d {

        /* renamed from: d */
        public Object f179969d;

        /* renamed from: e */
        public Object f179970e;

        /* renamed from: f */
        public Object f179971f;

        /* renamed from: g */
        public /* synthetic */ Object f179972g;

        /* renamed from: h */
        public final /* synthetic */ C63449b f179973h;

        /* renamed from: i */
        public int f179974i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63450a(C63449b bVar, C15601d<? super C63450a> dVar) {
            super(dVar);
            this.f179973h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f179972g = obj;
            this.f179974i |= Integer.MIN_VALUE;
            return this.f179973h.mo88315b((C66132f) null, this);
        }
    }

    /* renamed from: a */
    public static final C66132f m74791a(long j) {
        C66132f fVar;
        Map<Long, C66132f> map = f179968b;
        C87412m.m108593f(map, "cacheRingtoneItem");
        synchronized (map) {
            fVar = map.get(Long.valueOf(j));
        }
        return fVar;
    }

    /* renamed from: c */
    public static final void m74792c(long j, C66132f fVar) {
        C87412m.m108594g(fVar, "info");
        Map<Long, C66132f> map = f179968b;
        C87412m.m108593f(map, "cacheRingtoneItem");
        synchronized (map) {
            C87412m.m108593f(map, "cacheRingtoneItem");
            map.put(Long.valueOf(j), fVar);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00db A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo88315b(wj2.C66132f r22, wx3.C15601d<? super wj2.C66132f> r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof rj2.C63449b.C63450a
            if (r2 == 0) goto L_0x0019
            r2 = r1
            rj2.b$a r2 = (rj2.C63449b.C63450a) r2
            int r3 = r2.f179974i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f179974i = r3
            r3 = r21
            goto L_0x0020
        L_0x0019:
            rj2.b$a r2 = new rj2.b$a
            r3 = r21
            r2.<init>(r3, r1)
        L_0x0020:
            java.lang.Object r1 = r2.f179972g
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r2.f179974i
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0048
            if (r5 != r6) goto L_0x0040
            java.lang.Object r0 = r2.f179971f
            ve3.f r0 = (ve3.C65680f) r0
            java.lang.Object r4 = r2.f179970e
            ve3.n0 r4 = (ve3.C65685n0) r4
            java.lang.Object r2 = r2.f179969d
            wj2.f r2 = (wj2.C66132f) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r5 = r0
            r0 = r2
            r16 = r4
            goto L_0x0070
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r1)
            ve3.n0 r1 = r0.f190083f
            if (r1 != 0) goto L_0x0050
            return r7
        L_0x0050:
            ve3.g r5 = r1.f189022f
            if (r5 != 0) goto L_0x0055
            return r7
        L_0x0055:
            ve3.f r5 = r5.f188994d
            if (r5 != 0) goto L_0x005a
            return r7
        L_0x005a:
            long r8 = r5.f188983d
            java.lang.String r10 = r5.f188984e
            r2.f179969d = r0
            r2.f179970e = r1
            r2.f179971f = r5
            r2.f179974i = r6
            java.lang.Object r2 = yj2.C66655a.m78639a(r8, r10, r2)
            if (r2 != r4) goto L_0x006d
            return r4
        L_0x006d:
            r16 = r1
            r1 = r2
        L_0x0070:
            yj2.a$a r1 = (yj2.C66655a.C66656a) r1
            if (r1 == 0) goto L_0x00db
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f191655a
            if (r2 != 0) goto L_0x0079
            return r7
        L_0x0079:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x00db
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x00db
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 == 0) goto L_0x00db
            wj2.h$a r8 = wj2.C66135h.f190107E
            r9 = 0
            int r2 = r2.videoDuration
            long r6 = (long) r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r2
            long r11 = r11 * r6
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r1.f191655a
            long r14 = r5.f188983d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f191655a
            r2.append(r1)
            r1 = 95
            r2.append(r1)
            java.lang.String r1 = r5.f188984e
            r2.append(r1)
            java.lang.String r17 = r2.toString()
            r18 = 0
            r19 = 64
            r20 = 0
            wj2.f r1 = wj2.C66135h.C66136a.m77956c(r8, r9, r11, r13, r14, r16, r17, r18, r19, r20)
            java.lang.String r2 = r0.f190088k
            if (r2 == 0) goto L_0x00c1
            r1.f190088k = r2
        L_0x00c1:
            java.lang.String r2 = r0.f190085h
            if (r2 == 0) goto L_0x00c7
            r1.f190085h = r2
        L_0x00c7:
            java.lang.String r2 = r0.f190087j
            if (r2 == 0) goto L_0x00cd
            r1.f190087j = r2
        L_0x00cd:
            ve3.n0 r2 = r0.f190083f
            r1.f190083f = r2
            ve3.a1 r0 = r0.f190095r
            r1.f190095r = r0
            long r4 = r5.f188983d
            m74792c(r4, r1)
            return r1
        L_0x00db:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rj2.C63449b.mo88315b(wj2.f, wx3.d):java.lang.Object");
    }
}
