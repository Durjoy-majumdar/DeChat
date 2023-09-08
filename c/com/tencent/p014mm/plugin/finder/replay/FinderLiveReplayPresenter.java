package com.tencent.p014mm.plugin.finder.replay;

import android.app.Activity;
import android.content.Intent;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import gy3.C87412m;
import vo1.C14917k;
import vo1.C65800j;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter */
public final class FinderLiveReplayPresenter implements C65800j {

    /* renamed from: d */
    public final Activity f16394d;

    /* renamed from: e */
    public final Intent f16395e;

    /* renamed from: f */
    public BaseFeedLoader<C0740i2> f16396f;

    /* renamed from: g */
    public C14917k f16397g;

    /* renamed from: h */
    public final FinderLiveReplayPresenter$feedChangeListener$1 f16398h = new FinderLiveReplayPresenter$feedChangeListener$1(this, C40008f.f107254d);

    public FinderLiveReplayPresenter(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(intent, "intent");
        this.f16394d = activity;
        this.f16395e = intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<al1.C54127h> mo3867F() {
        /*
            r20 = this;
            r0 = r20
            android.content.Intent r1 = r0.f16395e
            java.lang.String r2 = "KEY_PARAMS_RESET_REPLAY"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            android.content.Intent r2 = r0.f16395e
            java.lang.String r4 = "KEY_PARAMS_KEY_VALUE"
            byte[] r2 = r2.getByteArrayExtra(r4)
            r4 = 0
            if (r2 == 0) goto L_0x00a3
            te3.fj1 r5 = new te3.fj1
            r5.<init>()
            r5.parseFrom(r2)
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r2 = r0.f16396f
            if (r2 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            pe3.b r6 = r5.f133534f
            r2.setLastBuffer(r6)
        L_0x0028:
            cj1.e r2 = cj1.C0531e.f1296a
            java.lang.String r2 = r5.f133532d
            java.lang.String r6 = "FinderLiveActivityDataTransaction"
            if (r2 == 0) goto L_0x0087
            java.util.HashMap<java.lang.String, java.util.List<byte[]>> r7 = cj1.C0531e.f1297b
            java.util.Map r7 = gy3.C24564k0.m30739c(r7)
            java.lang.Object r2 = r7.remove(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x006a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r5.f133533e
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r2, r9)
            r8.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0067
            java.lang.Object r9 = r2.next()
            byte[] r9 = (byte[]) r9
            com.tencent.mm.protocal.protobuf.FinderObject r10 = new com.tencent.mm.protocal.protobuf.FinderObject
            r10.<init>()
            r10.parseFrom(r9)
            r8.add(r10)
            goto L_0x004f
        L_0x0067:
            r7.addAll(r8)
        L_0x006a:
            r5.f133532d = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "after copyReplayFeedList objects size:"
            r2.append(r7)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r5.f133533e
            int r7 = r7.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            goto L_0x00a1
        L_0x0087:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "don't need to copyReplayFeedList,objects size:"
            r2.append(r7)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r5.f133533e
            int r7 = r7.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x00a1:
            r11 = r5
            goto L_0x00a4
        L_0x00a3:
            r11 = r4
        L_0x00a4:
            r5 = 0
            r2 = 1
            if (r11 != 0) goto L_0x00aa
            goto L_0x00ca
        L_0x00aa:
            int r7 = r11.f133536h
            if (r7 < 0) goto L_0x00b8
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r11.f133533e
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x00b8
            r8 = 1
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r8 == 0) goto L_0x00ca
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r11.f133533e
            java.lang.Object r7 = r8.get(r7)
            com.tencent.mm.protocal.protobuf.FinderObject r7 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r7
            te3.c21 r7 = r7.liveInfo
            if (r7 == 0) goto L_0x00ca
            long r7 = r7.f182392d
            goto L_0x00cb
        L_0x00ca:
            r7 = r5
        L_0x00cb:
            vo1.a0$b r13 = vo1.C65770a0.f189184r
            vo1.a0 r9 = r13.mo89819a()
            java.lang.Class<bp1.d> r10 = bp1.C54519d.class
            androidx.lifecycle.i0 r9 = r9.mo89804e(r10)
            bp1.d r9 = (bp1.C54519d) r9
            if (r9 == 0) goto L_0x00e0
            long r9 = r9.mo75371d3()
            goto L_0x00e1
        L_0x00e0:
            r9 = r5
        L_0x00e1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "init data:"
            r12.append(r14)
            if (r11 == 0) goto L_0x00f2
            int r14 = r11.hashCode()
            goto L_0x00f3
        L_0x00f2:
            r14 = 0
        L_0x00f3:
            r12.append(r14)
            java.lang.String r14 = ",targetLiveId:"
            r12.append(r14)
            r12.append(r7)
            java.lang.String r14 = ",serviceLiveId:"
            r12.append(r14)
            r12.append(r9)
            java.lang.String r14 = ",comeFromResetActivity:"
            r12.append(r14)
            r12.append(r1)
            java.lang.String r1 = "!!"
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            java.lang.String r12 = "FinderLiveReplayPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r1)
            if (r11 == 0) goto L_0x0124
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0124
            r1 = 1
            goto L_0x0125
        L_0x0124:
            r1 = 0
        L_0x0125:
            if (r1 == 0) goto L_0x0154
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x012d
            r1 = 1
            goto L_0x012e
        L_0x012d:
            r1 = 0
        L_0x012e:
            if (r1 == 0) goto L_0x0142
            vo1.a0 r14 = r13.mo89819a()
            android.content.Intent r1 = r0.f16395e
            r18 = 0
            r19 = 1
            r15 = r9
            r17 = r1
            r14.mo89806g(r15, r17, r18, r19)
            r1 = r12
            goto L_0x0174
        L_0x0142:
            vo1.a0 r7 = r13.mo89819a()
            android.content.Intent r1 = r0.f16395e
            gy3.C87412m.m108591d(r11)
            r5 = 0
            r8 = r9
            r10 = r1
            r1 = r12
            r12 = r5
            r7.mo89806g(r8, r10, r11, r12)
            goto L_0x0174
        L_0x0154:
            r1 = r12
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x016a
            vo1.a0 r14 = r13.mo89819a()
            android.content.Intent r5 = r0.f16395e
            r18 = 0
            r19 = 1
            r15 = r9
            r17 = r5
            r14.mo89806g(r15, r17, r18, r19)
            goto L_0x0174
        L_0x016a:
            java.lang.String r5 = "invalid replay data!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            android.app.Activity r5 = r0.f16394d
            r5.finish()
        L_0x0174:
            vo1.a0 r5 = r13.mo89819a()
            yo1.c r5 = r5.f189188b
            if (r5 == 0) goto L_0x0188
            java.util.ArrayList<al1.h> r5 = r5.f43188c
            if (r5 == 0) goto L_0x0188
            boolean r5 = r5.isEmpty()
            if (r5 != r2) goto L_0x0188
            r5 = 1
            goto L_0x0189
        L_0x0188:
            r5 = 0
        L_0x0189:
            if (r5 == 0) goto L_0x0196
            java.lang.String r2 = "replay_step2:loadData prepareData error,data is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            android.app.Activity r1 = r0.f16394d
            r1.finish()
            goto L_0x01f7
        L_0x0196:
            vo1.a0 r5 = r13.mo89819a()
            yo1.c r5 = r5.f189188b
            if (r5 == 0) goto L_0x01a1
            int r5 = r5.f43187b
            goto L_0x01a2
        L_0x01a1:
            r5 = 0
        L_0x01a2:
            vo1.a0 r6 = r13.mo89819a()
            yo1.c r6 = r6.f189188b
            if (r6 == 0) goto L_0x01ad
            te3.fj1 r6 = r6.f43186a
            goto L_0x01ae
        L_0x01ad:
            r6 = r4
        L_0x01ae:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "replay_step2:loadData finish,initPos:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ",hasMore:"
            r7.append(r5)
            if (r6 == 0) goto L_0x01c7
            int r5 = r6.f133535g
            if (r5 != 0) goto L_0x01c7
            r3 = 1
        L_0x01c7:
            r2 = r2 ^ r3
            r7.append(r2)
            java.lang.String r2 = ",lastBuffer:"
            r7.append(r2)
            if (r6 == 0) goto L_0x01d5
            pe3.b r2 = r6.f133534f
            goto L_0x01d6
        L_0x01d5:
            r2 = r4
        L_0x01d6:
            r7.append(r2)
            r2 = 44
            r7.append(r2)
            sk1.a r2 = sk1.C63947a.f181274a
            if (r6 == 0) goto L_0x01e4
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r6.f133533e
        L_0x01e4:
            java.lang.String r2 = r2.mo88717b(r4)
            r7.append(r2)
            r2 = 33
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x01f7:
            vo1.a0 r1 = r13.mo89819a()
            yo1.c r1 = r1.f189188b
            if (r1 == 0) goto L_0x0203
            java.util.ArrayList<al1.h> r1 = r1.f43188c
            if (r1 != 0) goto L_0x0208
        L_0x0203:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0208:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPresenter.mo3867F():java.util.ArrayList");
    }

    /* renamed from: o */
    public void mo3868o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f16396f;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        C16389w x0;
        BaseFeedLoader<C0740i2> baseFeedLoader;
        C14917k kVar = this.f16397g;
        if (!(kVar == null || (x0 = kVar.mo13972x0()) == null || (baseFeedLoader = this.f16396f) == null)) {
            baseFeedLoader.unregister(x0);
        }
        this.f16398h.dead();
    }
}
