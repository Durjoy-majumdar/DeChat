package qj1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.c8 */
public final class C62670c8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63006u7 f177955d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f177956e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62670c8(C63006u7 u7Var, FinderJumpInfo finderJumpInfo) {
        super(0);
        this.f177955d = u7Var;
        this.f177956e = finderJumpInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r4 = r4.f178808c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            qj1.u7 r3 = r0.f177955d
            java.util.Map<android.view.ViewGroup, qj1.u7$c> r4 = r3.f178780A
            android.widget.RelativeLayout r3 = r3.f178799v
            java.lang.Object r3 = r4.get(r3)
            r4 = r3
            qj1.u7$c r4 = (qj1.C63006u7.C63008c) r4
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0023
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f178808c
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            r7 = 0
            if (r4 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = r7
        L_0x0029:
            qj1.u7$c r3 = (qj1.C63006u7.C63008c) r3
            if (r3 == 0) goto L_0x01e1
            qj1.u7 r4 = r0.f177955d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r0.f177956e
            r4.mo10792g(r5)
            java.lang.Class<cl1.a0> r9 = cl1.C0653a0.class
            androidx.lifecycle.i0 r9 = r4.mo87696x0(r9)
            cl1.a0 r9 = (cl1.C0653a0) r9
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r9 = r9.f1542f
            r9.postValue(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r3.f178808c
            r7.getAndSet(r6)
            java.lang.String r7 = "Finder.FinderLiveGiftQueuePlugin"
            java.lang.String r9 = "[showGiftAllLiveNotify], "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            qj1.u7$d r7 = r3.f178817l
            android.widget.LinearLayout r7 = r7.f178848k
            r9 = 8
            if (r7 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r7.setVisibility(r9)
        L_0x0059:
            qj1.u7$d r7 = r3.f178817l
            android.view.View r7 = r7.f178847j
            if (r7 != 0) goto L_0x0060
            goto L_0x00a2
        L_0x0060:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r9)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r13 = "reset2NotifyBullet"
            java.lang.String r14 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r7
            r6 = r15
            r15 = r9
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7.setVisibility(r6)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2NotifyBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00a2:
            qj1.u7$f r6 = r3.f178818m
            android.view.View r6 = r6.f178853a
            if (r6 != 0) goto L_0x00a9
            goto L_0x00e9
        L_0x00a9:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r9)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2NotifyBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r6
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r11 = "reset2NotifyBullet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x00e9:
            qj1.u7$f r6 = r3.f178818m
            android.view.View r6 = r6.f178856d
            if (r6 != 0) goto L_0x00f0
            goto L_0x0130
        L_0x00f0:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r9)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r12 = "reset2NotifyBullet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r6
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r7.mo10231a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo"
            java.lang.String r11 = "reset2NotifyBullet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0130:
            cj1.d r5 = cj1.C54745d.f153453a
            java.lang.String r6 = r8.ext_info
            te3.dw0 r5 = r5.mo75642b(r6)
            pe3.b r6 = r8.ext_buff
            if (r6 == 0) goto L_0x018a
            te3.ju0 r7 = new te3.ju0
            r7.<init>()
            byte[] r6 = r6.mo123703f()
            r7.parseFrom(r6)
            qj1.u7$f r6 = r3.f178818m
            android.widget.TextView r6 = r6.f178855c
            if (r6 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            java.lang.String r9 = r7.f136333h
            r6.setText(r9)
        L_0x0154:
            te3.p11 r6 = r7.f136332g
            if (r6 == 0) goto L_0x018a
            qj1.u7$f r7 = r3.f178818m
            android.widget.ImageView r7 = r7.f178854b
            if (r7 == 0) goto L_0x018a
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r2)
            bl3.c r10 = r10.mo62447c(r1)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            java.lang.String r6 = r6.f139509f
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r6, r12)
            pl1.e0$a r6 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r2 = r9.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r6)
            r10.mo85957c(r11, r7, r1)
        L_0x018a:
            qj1.u7$f r1 = r3.f178818m
            android.view.View r1 = r1.f178853a
            if (r1 == 0) goto L_0x0198
            qj1.a8 r2 = new qj1.a8
            r2.<init>(r5, r8, r4)
            r1.setOnClickListener(r2)
        L_0x0198:
            wg1.r1 r1 = wg1.C15346r1.f41686a
            if (r5 == 0) goto L_0x01a0
            java.lang.String r2 = r5.f182876d
            if (r2 != 0) goto L_0x01a2
        L_0x01a0:
            java.lang.String r2 = ""
        L_0x01a2:
            r5 = 1
            r1.mo14181a(r5, r2)
            java.util.Map<android.view.ViewGroup, android.animation.ObjectAnimator> r1 = r4.f178781B
            android.widget.RelativeLayout r2 = r4.f178799v
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
            if (r1 == 0) goto L_0x01ca
            r5 = 5500(0x157c, double:2.7174E-320)
            r1.setDuration(r5)
            kl1.c r2 = new kl1.c
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 5000(0x1388, float:7.006E-42)
            qj1.b8 r7 = new qj1.b8
            r7.<init>(r4)
            r2.<init>(r5, r6, r7)
            r1.setEvaluator(r2)
        L_0x01ca:
            java.util.Map<android.view.ViewGroup, android.animation.ObjectAnimator> r1 = r4.f178781B
            android.widget.RelativeLayout r2 = r4.f178799v
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
            if (r1 == 0) goto L_0x01db
            r1.start()
        L_0x01db:
            long r1 = eb0.C31543z5.m39453c()
            r3.f178821p = r1
        L_0x01e1:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62670c8.invoke():java.lang.Object");
    }
}
