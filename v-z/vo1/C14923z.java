package vo1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPresenter;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vo1.z */
public final class C14923z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ IResponse<C0740i2> f40950d;

    /* renamed from: e */
    public final /* synthetic */ String f40951e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveReplayPresenter f40952f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14923z(IResponse<C0740i2> iResponse, String str, FinderLiveReplayPresenter finderLiveReplayPresenter) {
        super(0);
        this.f40950d = iResponse;
        this.f40951e = str;
        this.f40952f = finderLiveReplayPresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[LOOP:1: B:9:0x0040->B:20:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0065 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse<cm1.i2> r1 = r0.f40950d
            vo1.a0$b r2 = vo1.C65770a0.f189184r
            vo1.a0 r2 = r2.mo89819a()
            yo1.c r2 = r2.f189188b
            java.lang.String r3 = r0.f40951e
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter r4 = r0.f40952f
            java.lang.String r5 = "FinderLiveReplayPresenter"
            if (r1 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x015c
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.List r8 = r1.getIncrementList()
            if (r8 == 0) goto L_0x00e0
            java.lang.Class<cm1.u0> r9 = cm1.C0782u0.class
            java.util.List r8 = sx3.C13798c0.m13102z(r8, r9)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x002d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e0
            java.lang.Object r9 = r8.next()
            cm1.u0 r9 = (cm1.C0782u0) r9
            java.util.ArrayList<al1.h> r10 = r2.f43188c
            java.util.Iterator r10 = r10.iterator()
            r12 = 0
        L_0x0040:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x006c
            java.lang.Object r13 = r10.next()
            al1.h r13 = (al1.C54127h) r13
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r9.f1833d
            te3.c21 r6 = r6.liveInfo
            if (r6 == 0) goto L_0x0060
            long r14 = r6.f182392d
            com.tencent.mm.live.api.LiveConfig r6 = r13.f151977d
            r16 = r12
            long r11 = r6.f157064e
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            r6 = 1
            goto L_0x0063
        L_0x0060:
            r16 = r12
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 == 0) goto L_0x0069
            r12 = r16
            r6 = -1
            goto L_0x006e
        L_0x0069:
            int r12 = r16 + 1
            goto L_0x0040
        L_0x006c:
            r6 = -1
            r12 = -1
        L_0x006e:
            if (r12 == r6) goto L_0x0072
            r11 = 1
            goto L_0x0073
        L_0x0072:
            r11 = 0
        L_0x0073:
            if (r11 == 0) goto L_0x0092
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "repeat feed:"
            r10.append(r11)
            sk1.a r11 = sk1.C63947a.f181274a
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f1833d
            java.lang.String r6 = r11.mo88735u(r9, r6)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x002d
        L_0x0092:
            boolean r6 = r9.mo727d()
            if (r6 == 0) goto L_0x00c1
            al1.h r6 = new al1.h
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r9.f1833d
            r6.<init>((com.tencent.p014mm.protocal.protobuf.FinderObject) r10)
            r7.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "#replay_data#valid feed:"
            r6.append(r10)
            sk1.a r10 = sk1.C63947a.f181274a
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f1833d
            r11 = -1
            java.lang.String r9 = r10.mo88735u(r9, r11)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x002d
        L_0x00c1:
            r11 = -1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "disable play feed:"
            r6.append(r10)
            sk1.a r10 = sk1.C63947a.f181274a
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f1833d
            java.lang.String r9 = r10.mo88735u(r9, r11)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x002d
        L_0x00e0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = " oriDataSize:"
            r6.append(r3)
            java.util.ArrayList<al1.h> r3 = r2.f43188c
            int r3 = r3.size()
            r6.append(r3)
            java.lang.String r3 = ", incrementList:"
            r6.append(r3)
            java.util.List r3 = r1.getIncrementList()
            if (r3 == 0) goto L_0x010a
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x010b
        L_0x010a:
            r3 = 0
        L_0x010b:
            r6.append(r3)
            java.lang.String r3 = ",filter size:"
            r6.append(r3)
            int r3 = r7.size()
            r6.append(r3)
            java.lang.String r3 = ", hasMore:"
            r6.append(r3)
            boolean r3 = r1.getHasMore()
            r6.append(r3)
            java.lang.String r3 = ",lastBuffer:"
            r6.append(r3)
            pe3.b r3 = r1.getLastBuffer()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            te3.fj1 r3 = r2.f43186a
            boolean r6 = r1.getHasMore()
            r3.f133535g = r6
            te3.fj1 r3 = r2.f43186a
            pe3.b r1 = r1.getLastBuffer()
            r3.f133534f = r1
            java.util.ArrayList<al1.h> r1 = r2.f43188c
            r1.addAll(r7)
            vo1.k r1 = r4.f16397g
            if (r1 == 0) goto L_0x015c
            int r2 = r7.size()
            r1.mo13971o0(r2)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x015d
        L_0x015c:
            r6 = 0
        L_0x015d:
            if (r6 != 0) goto L_0x017b
            java.lang.String r1 = r0.f40951e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateFinderLiveDataList:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " resp is null!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
        L_0x017b:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C14923z.invoke():java.lang.Object");
    }
}
