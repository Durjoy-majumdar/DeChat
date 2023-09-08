package qj1;

import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87413o;
import nk1.C61788m;
import rx3.C13598b0;

/* renamed from: qj1.z7 */
public final class C63158z7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63006u7 f179205d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f179206e;

    /* renamed from: f */
    public final /* synthetic */ C61788m.C11208b f179207f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63158z7(C63006u7 u7Var, ViewGroup viewGroup, C61788m.C11208b bVar) {
        super(0);
        this.f179205d = u7Var;
        this.f179206e = viewGroup;
        this.f179207f = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "relaunchBulletInAnimation, BulletShowingInfo="
            r0.append(r1)
            qj1.u7 r1 = r13.f179205d
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r1 = r1.f178780A
            android.view.ViewGroup r2 = r13.f179206e
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            java.lang.String r1 = ", giftShowInfo="
            r0.append(r1)
            nk1.m$b r1 = r13.f179207f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            qj1.u7 r0 = r13.f179205d
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r0 = r0.f178780A
            android.view.ViewGroup r2 = r13.f179206e
            java.lang.Object r0 = r0.get(r2)
            qj1.u7$c r0 = (qj1.C63006u7.C63008c) r0
            if (r0 == 0) goto L_0x01fc
            android.view.ViewGroup r2 = r13.f179206e
            nk1.m$b r3 = r13.f179207f
            qj1.u7 r4 = r13.f179205d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bulletInfoMap "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " giftShowInfo:"
            r5.append(r6)
            int r6 = r3.f33045i
            r5.append(r6)
            java.lang.String r6 = " reward:"
            r5.append(r6)
            int r6 = r3.f33046j
            r5.append(r6)
            java.lang.String r6 = " comboSumCount:"
            r5.append(r6)
            int r6 = r0.f178813h
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r6 = r3.f33045i
            int r7 = r0.f178813h
            if (r6 <= r7) goto L_0x0078
            int r6 = r3.f33045i
            r0.f178813h = r6
            goto L_0x007f
        L_0x0078:
            int r6 = r0.f178813h
            int r7 = r3.f33046j
            int r6 = r6 + r7
            r0.f178813h = r6
        L_0x007f:
            int r6 = r0.f178813h
            boolean r7 = r3.f33049p
            r0.mo87964c(r6, r7, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "loginfo "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " result "
            r6.append(r5)
            int r5 = r0.f178813h
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f178810e
            boolean r5 = r5.get()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x0176
            long r8 = r0.f178820o
            r10 = 0
            r5 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00e5
            long r8 = r0.f178821p
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00e5
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r4.f178788I
            r8.removeCallbacksAndMessages(r2)
            r4.f178789J = r7
            r4.mo87957s1(r3, r5)
            long r8 = eb0.C31543z5.m39453c()
            r0.f178821p = r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "relaunchBulletInAnimation: restart precious gift, startShowingTime = "
            r5.append(r8)
            long r8 = r0.f178821p
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            goto L_0x016b
        L_0x00e5:
            r4.getClass()
            te3.ju0 r8 = r3.f33043g
            if (r8 == 0) goto L_0x00ef
            java.lang.String r8 = r8.f136329d
            goto L_0x00f0
        L_0x00ef:
            r8 = r6
        L_0x00f0:
            te3.v11 r9 = r3.f33053t
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "appendFullScreenPreciousGift giftId:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = " targetUsername:"
            r10.append(r11)
            java.lang.String r11 = r3.f33051r
            r10.append(r11)
            java.lang.String r11 = " curPkUser:"
            r10.append(r11)
            java.lang.Class<cl1.d0> r11 = cl1.C54963d0.class
            androidx.lifecycle.i0 r11 = r4.mo87696x0(r11)
            cl1.d0 r11 = (cl1.C54963d0) r11
            al1.j r11 = r11.f154073p
            if (r11 == 0) goto L_0x011d
            java.lang.String r11 = r11.f151999c
            goto L_0x011e
        L_0x011d:
            r11 = r6
        L_0x011e:
            r10.append(r11)
            java.lang.String r11 = " randomItem:"
            r10.append(r11)
            if (r9 == 0) goto L_0x0135
            java.util.LinkedList<te3.w11> r11 = r9.f143244e
            if (r11 == 0) goto L_0x0135
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0136
        L_0x0135:
            r11 = r6
        L_0x0136:
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r9 == 0) goto L_0x0153
            java.util.LinkedList<te3.w11> r10 = r9.f143244e
            if (r10 == 0) goto L_0x0153
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r5
            if (r10 != r5) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r5 = 0
        L_0x0154:
            if (r5 == 0) goto L_0x016b
            java.lang.String r5 = "PARAM_LIVE_GIFT_INFO"
            r1.putString(r5, r8)
            byte[] r5 = r9.toByteArray()
            java.lang.String r8 = "PARAM_LIVE_GIFT_RANDOM_ITEM"
            r1.putByteArray(r8, r5)
            d60.b r5 = r4.f178793p
            d60.b$b r8 = d60.C58124b.C58125b.LIVE_EVENT_APPEND_FULL_SCREEN_GIFT
            r5.statusChange(r8, r1)
        L_0x016b:
            java.lang.String r1 = r3.f33050q
            if (r1 != 0) goto L_0x0171
            java.lang.String r1 = ""
        L_0x0171:
            int r5 = r3.f33046j
            r4.mo87960w1(r1, r0, r5, r3)
        L_0x0176:
            boolean r1 = r0.f178831z
            if (r1 == 0) goto L_0x017c
            goto L_0x01fc
        L_0x017c:
            java.util.Map<android.view.ViewGroup, android.animation.ObjectAnimator> r1 = r4.f178782C
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
            if (r1 == 0) goto L_0x0191
            boolean r3 = r1.isRunning()
            if (r3 == 0) goto L_0x0191
            r1.cancel()
        L_0x0191:
            boolean r1 = r0.f178809d
            if (r1 == 0) goto L_0x01a4
            java.util.Map<android.view.ViewGroup, android.animation.ObjectAnimator> r1 = r4.f178781B
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
            if (r1 == 0) goto L_0x01a4
            r1.start()
        L_0x01a4:
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r1)
            r2.setVisibility(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f178810e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x01c7
            java.util.Map<android.view.ViewGroup, android.animation.ObjectAnimator> r0 = r4.f178781B
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            android.animation.ObjectAnimator r0 = (android.animation.ObjectAnimator) r0
            if (r0 != 0) goto L_0x01c1
            goto L_0x01fc
        L_0x01c1:
            r1 = 550(0x226, double:2.717E-321)
            r0.setCurrentPlayTime(r1)
            goto L_0x01fc
        L_0x01c7:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r4.f178787H
            boolean r0 = r0.stopped()
            if (r0 == 0) goto L_0x01fc
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r0 = r4.f178780A
            java.util.Set r0 = r0.entrySet()
            y04.h r0 = sx3.C110818d0.m150897A(r0)
            sx3.d0$a r0 = (sx3.C110818d0.C64182a) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f7
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            boolean r3 = gy3.C87412m.m108589b(r3, r2)
            if (r3 == 0) goto L_0x01df
            r6 = r1
        L_0x01f7:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r4.mo87943d1(r6)
        L_0x01fc:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63158z7.invoke():java.lang.Object");
    }
}
