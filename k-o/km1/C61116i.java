package km1;

/* renamed from: km1.i */
public final class C61116i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173990d;

    public C61116i(C61117j jVar) {
        this.f173990d = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r3 > 1.0f) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            km1.j r0 = r12.f173990d
            android.animation.AnimatorSet r1 = r0.f173995e
            if (r1 == 0) goto L_0x0009
            r1.pause()
        L_0x0009:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f174004n
            long r1 = r1 - r3
            float r1 = (float) r1
            android.animation.ValueAnimator r2 = r0.f173999i
            if (r2 == 0) goto L_0x001a
            long r2 = r2.getDuration()
            goto L_0x001c
        L_0x001a:
            long r2 = r0.f174002l
        L_0x001c:
            float r2 = (float) r2
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 != 0) goto L_0x003c
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0031
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            float r3 = r1 * r7
            float r3 = r3 / r2
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
        L_0x003c:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x003e:
            float r6 = r0.f174001k
            float r6 = r6 - r7
            float r6 = r6 * r3
            float r6 = r6 + r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "createReverseAnimationSet reverseRatio:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = " reverseScaleRatio:"
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = " ["
            r8.append(r3)
            r8.append(r1)
            r1 = 47
            r8.append(r1)
            r8.append(r2)
            r1 = 93
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.String r3 = "FinderLiveCardPreViewAnimationHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = r0.f173997g
            gy3.C87412m.m108591d(r1)
            r3 = 2
            float[] r8 = new float[r3]
            r8[r4] = r6
            r8[r5] = r7
            java.lang.String r9 = "scaleX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r9, r8)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r8 = r0.f173997g
            gy3.C87412m.m108591d(r8)
            float[] r9 = new float[r3]
            r9[r4] = r6
            r9[r5] = r7
            java.lang.String r7 = "scaleY"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r8, r7, r9)
            int r8 = r0.f174000j
            android.content.Context r9 = r0.f173991a
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131101687(0x7f0607f7, float:1.781579E38)
            int r9 = r9.getColor(r10)
            android.animation.ArgbEvaluator r10 = new android.animation.ArgbEvaluator
            r10.<init>()
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r11[r5] = r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofObject(r10, r11)
            if (r8 == 0) goto L_0x00ca
            km1.f r9 = new km1.f
            r9.<init>(r0)
            r8.addUpdateListener(r9)
        L_0x00ca:
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            float r2 = r2 * r6
            long r10 = (long) r2
            r9.setDuration(r10)
            r2 = 3
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r4] = r8
            r2[r5] = r1
            r2[r3] = r7
            r9.playTogether(r2)
            km1.g r1 = new km1.g
            r1.<init>(r0)
            r9.addListener(r1)
            r0.f173995e = r9
            r9.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.C61116i.run():void");
    }
}
