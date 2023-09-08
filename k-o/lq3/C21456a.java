package lq3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import mq3.C21524b;
import oq3.C21803b;
import rq3.C22243b;
import sq3.C22386a;

/* renamed from: lq3.a */
public final class C21456a implements Runnable {

    /* renamed from: d */
    public int f60746d;

    /* renamed from: e */
    public final /* synthetic */ WxRefreshLayout f60747e;

    /* renamed from: f */
    public final /* synthetic */ int f60748f;

    /* renamed from: g */
    public final /* synthetic */ boolean f60749g;

    /* renamed from: h */
    public final /* synthetic */ boolean f60750h;

    /* renamed from: lq3.a$a */
    public static final class C21457a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRefreshLayout f60751d;

        /* renamed from: e */
        public final /* synthetic */ int f60752e;

        /* renamed from: f */
        public final /* synthetic */ boolean f60753f;

        /* renamed from: lq3.a$a$a */
        public static final class C21458a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ WxRefreshLayout f60754d;

            /* renamed from: e */
            public final /* synthetic */ boolean f60755e;

            public C21458a(WxRefreshLayout wxRefreshLayout, boolean z) {
                this.f60754d = wxRefreshLayout;
                this.f60755e = z;
            }

            public void onAnimationEnd(Animator animator) {
                boolean z = false;
                if (!(animator != null && animator.getDuration() == 0)) {
                    WxRefreshLayout wxRefreshLayout = this.f60754d;
                    C21524b bVar = wxRefreshLayout.f56671o;
                    if (bVar != null) {
                        bVar.f60963f = false;
                        if (this.f60755e) {
                            wxRefreshLayout.mo26642z(true);
                        }
                        C22386a aVar = this.f60754d.f56667h;
                        if (aVar.f63470b == C22243b.LoadFinish) {
                            z = true;
                        }
                        if (z) {
                            aVar.mo35531c(C22243b.None);
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("cValues");
                    throw null;
                }
            }
        }

        public C21457a(WxRefreshLayout wxRefreshLayout, int i, boolean z) {
            this.f60751d = wxRefreshLayout;
            this.f60752e = i;
            this.f60753f = z;
        }

        public final void run() {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
            ValueAnimator valueAnimator;
            if (!this.f60751d.getCommonConfig().f126548j || this.f60752e >= 0) {
                animatorUpdateListener = null;
            } else {
                C21803b contentPlugin = this.f60751d.getContentPlugin();
                if (contentPlugin != null) {
                    C21524b bVar = this.f60751d.f56671o;
                    if (bVar != null) {
                        animatorUpdateListener = contentPlugin.mo34214b(bVar.f60959b);
                    } else {
                        C87412m.m108603p("cValues");
                        throw null;
                    }
                } else {
                    animatorUpdateListener = null;
                }
                if (animatorUpdateListener != null) {
                    animatorUpdateListener.onAnimationUpdate(ValueAnimator.ofInt(new int[]{0, 0}));
                }
            }
            C21458a aVar = new C21458a(this.f60751d, this.f60753f);
            WxRefreshLayout wxRefreshLayout = this.f60751d;
            C21524b bVar2 = wxRefreshLayout.f56671o;
            if (bVar2 != null) {
                int i = bVar2.f60959b;
                if (i > 0) {
                    valueAnimator = wxRefreshLayout.mo26571c(0);
                } else {
                    if (animatorUpdateListener == null) {
                        if (bVar2 == null) {
                            C87412m.m108603p("cValues");
                            throw null;
                        } else if (i != 0) {
                            if (!this.f60753f || !wxRefreshLayout.getCommonConfig().f126546h) {
                                valueAnimator = this.f60751d.mo26571c(0);
                            } else {
                                WxRefreshLayout wxRefreshLayout2 = this.f60751d;
                                C21524b bVar3 = wxRefreshLayout2.f56671o;
                                if (bVar3 == null) {
                                    C87412m.m108603p("cValues");
                                    throw null;
                                } else if (bVar3.f60959b >= (-wxRefreshLayout2.getFooterConfig().f174983a)) {
                                    this.f60751d.f56667h.mo35531c(C22243b.None);
                                    valueAnimator = null;
                                } else {
                                    WxRefreshLayout wxRefreshLayout3 = this.f60751d;
                                    valueAnimator = wxRefreshLayout3.mo26571c(-wxRefreshLayout3.getFooterConfig().f174983a);
                                }
                            }
                        }
                    }
                    wxRefreshLayout.f56657A.mo35535b();
                    this.f60751d.mo26622s(0, false);
                    this.f60751d.f56667h.mo35533e(C22243b.None);
                    valueAnimator = null;
                }
                if (valueAnimator != null) {
                    valueAnimator.addListener(aVar);
                } else {
                    aVar.onAnimationEnd((Animator) null);
                }
            } else {
                C87412m.m108603p("cValues");
                throw null;
            }
        }
    }

    public C21456a(WxRefreshLayout wxRefreshLayout, int i, boolean z, boolean z2) {
        this.f60747e = wxRefreshLayout;
        this.f60748f = i;
        this.f60749g = z;
        this.f60750h = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if ((r5 == rq3.C22243b.f63031n) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if (r4 != false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f60746d
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0093
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            sq3.a r4 = r1.f56667h
            rq3.b r5 = r4.f63470b
            rq3.b r6 = rq3.C22243b.None
            if (r5 != r6) goto L_0x0014
            r7 = 1
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            if (r7 == 0) goto L_0x0025
            rq3.b r7 = r4.f63471c
            rq3.b r8 = rq3.C22243b.Loading
            if (r7 != r8) goto L_0x001f
            r7 = 1
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r4.f63471c = r6
            goto L_0x0088
        L_0x0025:
            sq3.b r1 = r1.f56657A
            android.animation.ValueAnimator r7 = r1.f63477e
            if (r7 == 0) goto L_0x0059
            boolean r7 = r5.f63046f
            if (r7 != 0) goto L_0x0038
            rq3.b r7 = rq3.C22243b.LoadReleased
            if (r5 != r7) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            if (r7 == 0) goto L_0x0059
        L_0x0038:
            boolean r5 = r5.f63045e
            if (r5 == 0) goto L_0x0059
            r1.mo35535b()
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            android.animation.ValueAnimator r1 = r1.mo26571c(r3)
            if (r1 != 0) goto L_0x004f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            sq3.a r1 = r1.f56667h
            r1.mo35531c(r6)
            goto L_0x0088
        L_0x004f:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            sq3.a r1 = r1.f56667h
            rq3.b r3 = rq3.C22243b.PullUpCanceled
            r1.mo35531c(r3)
            goto L_0x0088
        L_0x0059:
            boolean r1 = r4.mo35529a()
            if (r1 == 0) goto L_0x0088
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            oq3.g r1 = r1.getFooterPlugin()
            if (r1 == 0) goto L_0x0088
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            oq3.b r1 = r1.getContentPlugin()
            if (r1 == 0) goto L_0x0088
            int r1 = r0.f60746d
            int r1 = r1 + r2
            r0.f60746d = r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f56679w
            int r2 = r0.f60748f
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            sq3.a r1 = r1.f56667h
            rq3.b r2 = rq3.C22243b.LoadFinish
            r1.mo35531c(r2)
            return
        L_0x0088:
            boolean r1 = r0.f60749g
            if (r1 == 0) goto L_0x01c0
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            r1.mo26642z(r2)
            goto L_0x01c0
        L_0x0093:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f60747e
            oq3.g r1 = r1.getFooterPlugin()
            if (r1 == 0) goto L_0x00a4
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f60747e
            boolean r5 = r0.f60750h
            int r1 = r1.mo34224b(r4, r5)
            goto L_0x00a5
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r4) goto L_0x01c0
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f60747e
            oq3.b r4 = r4.getContentPlugin()
            if (r4 == 0) goto L_0x00b7
            boolean r4 = r4.mo34222k()
            goto L_0x00b8
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            boolean r5 = r0.f60749g
            java.lang.String r6 = "cValues"
            r7 = 0
            if (r5 == 0) goto L_0x00da
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r0.f60747e
            mq3.a r5 = r5.getCommonConfig()
            boolean r5 = r5.f126546h
            if (r5 == 0) goto L_0x00da
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r0.f60747e
            mq3.b r5 = r5.f56671o
            if (r5 == 0) goto L_0x00d6
            int r5 = r5.f60959b
            if (r5 >= 0) goto L_0x00da
            if (r4 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00d6:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x00da:
            r2 = 0
        L_0x00db:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f60747e
            mq3.b r5 = r4.f56671o
            if (r5 == 0) goto L_0x01bc
            int r5 = r5.f60959b
            if (r2 == 0) goto L_0x00f1
            mq3.c r2 = r4.getFooterConfig()
            int r2 = r2.f174983a
            int r2 = -r2
            int r2 = java.lang.Math.max(r5, r2)
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            int r5 = r5 - r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f60747e
            mq3.b r4 = r2.f56671o
            if (r4 == 0) goto L_0x01b8
            boolean r4 = r4.f60971n
            if (r4 != 0) goto L_0x0101
            boolean r2 = r2.f56659C
            if (r2 == 0) goto L_0x0197
        L_0x0101:
            long r16 = java.lang.System.currentTimeMillis()
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f60747e
            mq3.b r4 = r2.f56671o
            if (r4 == 0) goto L_0x01b4
            boolean r8 = r4.f60971n
            if (r8 == 0) goto L_0x0167
            float r8 = r4.f60969l
            r4.f60967j = r8
            int r8 = r4.f60959b
            int r8 = r8 - r5
            r4.f60965h = r8
            r4.f60971n = r3
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126545g
            if (r2 == 0) goto L_0x0124
            r2 = r5
            goto L_0x0125
        L_0x0124:
            r2 = 0
        L_0x0125:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f60747e
            r12 = 0
            mq3.b r8 = r4.f56671o
            if (r8 == 0) goto L_0x0163
            float r13 = r8.f60968k
            float r9 = r8.f60969l
            float r2 = (float) r2
            float r9 = r9 + r2
            int r8 = r8.f60960c
            int r8 = r8 * 2
            float r8 = (float) r8
            float r14 = r9 + r8
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
            boolean unused = lq3.C21456a.super.dispatchTouchEvent(r8)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f60747e
            r12 = 2
            mq3.b r8 = r4.f56671o
            if (r8 == 0) goto L_0x015f
            float r13 = r8.f60968k
            float r8 = r8.f60969l
            float r14 = r8 + r2
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
            boolean unused = lq3.C21456a.super.dispatchTouchEvent(r2)
            goto L_0x0167
        L_0x015f:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0163:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0167:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f60747e
            boolean r4 = r2.f56659C
            if (r4 == 0) goto L_0x0197
            r2.f56658B = r3
            r12 = 1
            mq3.b r4 = r2.f56671o
            if (r4 == 0) goto L_0x0193
            float r13 = r4.f60968k
            float r14 = r4.f60969l
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
            boolean unused = lq3.C21456a.super.dispatchTouchEvent(r4)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f60747e
            r2.f56659C = r3
            mq3.b r2 = r2.f56671o
            if (r2 == 0) goto L_0x018f
            r2.f60965h = r3
            goto L_0x0197
        L_0x018f:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0193:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0197:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f60747e
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r2.f56679w
            lq3.a$a r8 = new lq3.a$a
            boolean r9 = r0.f60749g
            r8.<init>(r2, r5, r9)
            mq3.b r2 = r2.f56671o
            if (r2 == 0) goto L_0x01b0
            int r2 = r2.f60959b
            if (r2 >= 0) goto L_0x01ab
            r3 = r1
        L_0x01ab:
            long r1 = (long) r3
            r4.postDelayed(r8, r1)
            goto L_0x01c0
        L_0x01b0:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x01b4:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x01b8:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x01bc:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq3.C21456a.run():void");
    }
}
