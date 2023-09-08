package gr2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import j20.C117292a;
import java.util.LinkedList;
import java.util.Random;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: gr2.f */
public class C98191f {

    /* renamed from: A */
    public float f287886A = 0.8f;

    /* renamed from: B */
    public C98185c f287887B;

    /* renamed from: C */
    public Point f287888C;

    /* renamed from: a */
    public Context f287889a;

    /* renamed from: b */
    public LinkedList<View> f287890b = new LinkedList<>();

    /* renamed from: c */
    public LinkedList<View> f287891c = new LinkedList<>();

    /* renamed from: d */
    public Random f287892d = new Random();

    /* renamed from: e */
    public FrameLayout f287893e;

    /* renamed from: f */
    public int f287894f;

    /* renamed from: g */
    public int f287895g;

    /* renamed from: h */
    public long f287896h = 0;

    /* renamed from: i */
    public float f287897i;

    /* renamed from: j */
    public float f287898j;

    /* renamed from: k */
    public int f287899k = 0;

    /* renamed from: l */
    public int f287900l = v2helper.VOIP_ENC_HEIGHT_LV1;

    /* renamed from: m */
    public int f287901m;

    /* renamed from: n */
    public int f287902n;

    /* renamed from: o */
    public long f287903o;

    /* renamed from: p */
    public BitmapDrawable f287904p;

    /* renamed from: q */
    public float f287905q;

    /* renamed from: r */
    public float f287906r;

    /* renamed from: s */
    public float f287907s;

    /* renamed from: t */
    public long f287908t;

    /* renamed from: u */
    public long f287909u;

    /* renamed from: v */
    public long f287910v;

    /* renamed from: w */
    public float f287911w;

    /* renamed from: x */
    public float f287912x;

    /* renamed from: y */
    public Interpolator[] f287913y;

    /* renamed from: z */
    public long f287914z;

    public C98191f(Context context, FrameLayout frameLayout) {
        this.f287889a = context;
        this.f287893e = frameLayout;
    }

    /* renamed from: d */
    public static float m126865d(Context context, float f) {
        SnsMethodCalculate.markStartTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        try {
            float f2 = (context.getResources().getDisplayMetrics().xdpi / 160.0f) * f;
            SnsMethodCalculate.markEndTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f2;
        } catch (Throwable th) {
            Log.m105920e("ParticleGenerator", "dp2px, exp=" + th.toString());
            float f3 = f * 2.5f;
            SnsMethodCalculate.markEndTimeMs("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f3;
        }
    }

    /* renamed from: a */
    public void mo137490a(Point point) {
        int i;
        int i2;
        Point point2 = point;
        SnsMethodCalculate.markStartTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        Log.m105918d("ParticleGenerator", "addParticle: x=" + point2.x + ", y=" + point2.y);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f287904p == null && this.f287887B != null && currentTimeMillis - this.f287903o > 1000) {
            Log.m105924i("ParticleGenerator", "try getBitmap");
            Bitmap a = this.f287887B.mo137484a();
            if (a != null) {
                this.f287904p = new BitmapDrawable(this.f287889a.getResources(), a);
            }
            this.f287903o = currentTimeMillis;
        }
        if (this.f287904p == null) {
            Log.m105928w("ParticleGenerator", "addParticle, bmp==null");
            SnsMethodCalculate.markEndTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int i3 = this.f287895g;
        if (mo137493e() <= 6) {
            i3 = 0;
        }
        if (mo137493e() >= ((int) (((float) this.f287894f) * 0.8f))) {
            i3 = (int) (((float) this.f287895g) * 1.5f);
        }
        SnsMethodCalculate.markEndTimeMs("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        Log.m105918d("ParticleGenerator", "minTimmDiff=" + i3);
        if (currentTimeMillis - this.f287896h > ((long) i3)) {
            this.f287896h = currentTimeMillis;
            if (this.f287888C == null) {
                this.f287888C = new Point(point2.x, point2.y);
            }
            Point point3 = this.f287888C;
            SnsMethodCalculate.markStartTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            if (this.f287901m <= 0 || this.f287902n <= 0) {
                Log.m105920e("ParticleGenerator", "illegal size, w=" + this.f287901m + ", h=" + this.f287902n);
                SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            } else {
                SnsMethodCalculate.markStartTimeMs("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int sqrt = (int) Math.sqrt(Math.pow((double) (point2.x - point3.x), 2.0d) + Math.pow((double) (point2.y - point3.y), 2.0d));
                SnsMethodCalculate.markEndTimeMs("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int i4 = point2.x;
                int i5 = i4 - point3.x > 0 ? 1 : 0;
                mo137492c(i4, point2.y, i5);
                if (mo137493e() >= ((int) (((float) this.f287894f) * 0.8f))) {
                    Log.m105918d("ParticleGenerator", "too many anim, no extra insert");
                    SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                } else {
                    int i6 = (int) (((float) this.f287901m) * this.f287907s);
                    if (sqrt >= i6) {
                        float f = ((float) i6) * this.f287886A;
                        int i7 = f > 0.0f ? ((int) (((float) sqrt) / f)) - 1 : 0;
                        Log.m105924i("ParticleGenerator", "insert=" + i7);
                        if (i7 > 0) {
                            int i8 = i7 + 1;
                            int abs = Math.abs(point2.x - point3.x) / i8;
                            int abs2 = Math.abs(point2.y - point3.y) / i8;
                            for (int i9 = 0; i9 < i7; i9++) {
                                int i15 = point2.x;
                                int i16 = point3.x;
                                if (i15 < i16) {
                                    int i17 = i9 + 1;
                                    i2 = i15 + (abs * i17);
                                    int i18 = point2.y;
                                    int i19 = i17 * abs2;
                                    i = i18 < point3.y ? i18 + i19 : i18 - i19;
                                } else {
                                    int i25 = i9 + 1;
                                    int i26 = i16 + (abs * i25);
                                    int i27 = point3.y;
                                    int i28 = i25 * abs2;
                                    i = i27 < point2.y ? i27 + i28 : i27 - i28;
                                    i2 = i26;
                                }
                                mo137492c(i2, i, i5);
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                }
            }
            this.f287888C.set(point2.x, point2.y);
        }
        SnsMethodCalculate.markEndTimeMs("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    /* renamed from: b */
    public View mo137491b() {
        SnsMethodCalculate.markStartTimeMs("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        View view = new View(this.f287889a);
        view.setBackground(this.f287904p);
        this.f287893e.addView(view, new FrameLayout.LayoutParams(this.f287901m, this.f287902n));
        SnsMethodCalculate.markEndTimeMs("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0250  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137492c(int r25, int r26, int r27) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "ParticleGenerator"
            java.lang.String r3 = "doPostNewAnim"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "obtainParticleView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            int r0 = r24.mo137494f()     // Catch:{ all -> 0x0035 }
            if (r0 <= 0) goto L_0x0021
            java.util.LinkedList<android.view.View> r0 = r1.f287891c     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.removeLast()     // Catch:{ all -> 0x0035 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0035 }
            r7 = r0
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 != 0) goto L_0x002a
            android.view.View r0 = r24.mo137491b()     // Catch:{ all -> 0x0033 }
            r7 = r0
            goto L_0x002d
        L_0x002a:
            r1.mo137497i(r7)     // Catch:{ all -> 0x0033 }
        L_0x002d:
            java.util.LinkedList<android.view.View> r0 = r1.f287890b     // Catch:{ all -> 0x0033 }
            r0.addFirst(r7)     // Catch:{ all -> 0x0033 }
            goto L_0x004f
        L_0x0033:
            r0 = move-exception
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = 0
        L_0x0037:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getParticleView exp="
            r8.append(r9)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x004f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            java.lang.String r0 = ", cacheView.size="
            if (r7 == 0) goto L_0x0250
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            int r8 = r5.width
            r15 = 2
            int r8 = r8 / r15
            int r8 = r25 - r8
            float r8 = (float) r8
            r7.setX(r8)
            int r5 = r5.height
            int r5 = r5 / r15
            int r5 = r26 - r5
            float r5 = (float) r5
            r7.setY(r5)
            java.lang.String r5 = "doParticleAnim"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            int r9 = r8.width
            int r9 = r9 / r15
            int r9 = r25 - r9
            int r8 = r8.height
            int r8 = r8 / r15
            int r8 = r26 - r8
            java.util.Random r10 = r1.f287892d
            float r10 = r10.nextFloat()
            float r11 = r1.f287898j
            float r12 = r1.f287897i
            float r11 = r11 - r12
            float r10 = r10 * r11
            float r10 = r10 + r12
            r13 = 1
            r11 = r27
            if (r11 != r13) goto L_0x00a1
            r11 = 180(0xb4, float:2.52E-43)
            r1.f287899k = r11
            r11 = 280(0x118, float:3.92E-43)
            r1.f287900l = r11
            goto L_0x00a9
        L_0x00a1:
            r11 = 260(0x104, float:3.64E-43)
            r1.f287899k = r11
            r11 = 360(0x168, float:5.04E-43)
            r1.f287900l = r11
        L_0x00a9:
            int r11 = r1.f287900l
            int r12 = r1.f287899k
            if (r11 != r12) goto L_0x00b0
            goto L_0x00bb
        L_0x00b0:
            java.util.Random r6 = r1.f287892d
            int r11 = r11 - r12
            int r6 = r6.nextInt(r11)
            int r11 = r1.f287899k
            int r12 = r11 + r6
        L_0x00bb:
            double r11 = (double) r12
            double r11 = java.lang.Math.toRadians(r11)
            r6 = r14
            double r13 = (double) r10
            double r16 = java.lang.Math.cos(r11)
            r18 = r2
            r19 = r3
            double r2 = r13 * r16
            float r2 = (float) r2
            double r10 = java.lang.Math.sin(r11)
            double r13 = r13 * r10
            float r3 = (float) r13
            float r9 = (float) r9
            long r10 = r1.f287914z
            float r10 = (float) r10
            float r2 = r2 * r10
            float r2 = r2 + r9
            float r8 = (float) r8
            float r10 = r10 * r3
            float r10 = r10 + r8
            float[] r3 = new float[r15]
            r14 = 0
            r3[r14] = r9
            r13 = 1
            r3[r13] = r2
            java.lang.String r2 = "translationX"
            r9 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r3)
            long r11 = r1.f287914z
            r2.setDuration(r11)
            float[] r3 = new float[r15]
            r3[r14] = r8
            r3[r13] = r10
            java.lang.String r8 = "translationY"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r8, r3)
            long r8 = r1.f287914z
            r3.setDuration(r8)
            android.view.animation.Interpolator r8 = r1.mo137495g(r14)
            if (r8 == 0) goto L_0x0112
            r2.setInterpolator(r8)
            r3.setInterpolator(r8)
        L_0x0112:
            float r8 = r1.f287911w
            float r9 = r1.f287912x
            java.lang.String r12 = "random"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
            float r9 = r9 - r8
            java.util.Random r10 = r1.f287892d
            float r10 = r10.nextFloat()
            float r9 = r9 * r10
            float r16 = r9 + r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r8 = java.lang.Float.valueOf(r16)
            r11.mo10233c(r8)
            java.lang.Object[] r9 = r11.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator"
            java.lang.String r17 = "doParticleAnim"
            java.lang.String r20 = "(Landroid/view/View;III)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r8 = r7
            r25 = r6
            r6 = r11
            r11 = r17
            r17 = r0
            r0 = r12
            r12 = r20
            r20 = 1
            r13 = r21
            r21 = r5
            r5 = r25
            r25 = r3
            r3 = 0
            r14 = r22
            r15 = r23
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r7.setAlpha(r6)
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator"
            java.lang.String r10 = "doParticleAnim"
            java.lang.String r11 = "(Landroid/view/View;III)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            r6 = 2
            float[] r8 = new float[r6]
            r8[r3] = r16
            r9 = 0
            r8[r20] = r9
            java.lang.String r10 = "alpha"
            r11 = 0
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r11, r10, r8)
            long r10 = r1.f287910v
            r8.setDuration(r10)
            long r10 = r1.f287909u
            r8.setStartDelay(r10)
            android.view.animation.Interpolator r10 = r1.mo137495g(r3)
            if (r10 == 0) goto L_0x01a5
            r8.setInterpolator(r10)
        L_0x01a5:
            float r10 = r1.f287905q
            float r11 = r1.f287906r
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            float r11 = r11 - r10
            java.util.Random r12 = r1.f287892d
            float r12 = r12.nextFloat()
            float r11 = r11 * r12
            float r11 = r11 + r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r7.setScaleX(r11)
            r7.setScaleY(r11)
            float r0 = r1.f287907s
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x01fb
            float[] r9 = new float[r6]
            r9[r3] = r11
            r9[r20] = r0
            java.lang.String r0 = "scaleX"
            r10 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r0, r9)
            long r12 = r1.f287908t
            r0.setDuration(r12)
            float[] r6 = new float[r6]
            r6[r3] = r11
            float r9 = r1.f287907s
            r6[r20] = r9
            java.lang.String r9 = "scaleY"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r10, r9, r6)
            long r9 = r1.f287908t
            r6.setDuration(r9)
            android.view.animation.Interpolator r3 = r1.mo137495g(r3)
            if (r3 == 0) goto L_0x01f8
            r0.setInterpolator(r3)
            r6.setInterpolator(r3)
        L_0x01f8:
            r10 = r6
            r6 = r0
            goto L_0x01fd
        L_0x01fb:
            r10 = 0
            r6 = r10
        L_0x01fd:
            android.animation.AnimatorSet$Builder r0 = r5.play(r8)
            android.animation.AnimatorSet$Builder r0 = r0.with(r2)
            r2 = r25
            android.animation.AnimatorSet$Builder r0 = r0.with(r2)
            if (r6 == 0) goto L_0x0216
            if (r10 == 0) goto L_0x0216
            android.animation.AnimatorSet$Builder r0 = r0.with(r6)
            r0.with(r10)
        L_0x0216:
            gr2.e r0 = new gr2.e
            r0.<init>(r1, r7)
            r5.addListener(r0)
            r5.setTarget(r7)
            r5.start()
            r0 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "animCount="
            r0.append(r2)
            int r2 = r24.mo137493e()
            r0.append(r2)
            r2 = r17
            r0.append(r2)
            int r2 = r24.mo137494f()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            goto L_0x0277
        L_0x0250:
            r19 = r3
            r3 = r2
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "obtainParticleView==null, animCount="
            r0.append(r5)
            int r5 = r24.mo137493e()
            r0.append(r5)
            r0.append(r2)
            int r2 = r24.mo137494f()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x0277:
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr2.C98191f.mo137492c(int, int, int):void");
    }

    /* renamed from: e */
    public final int mo137493e() {
        SnsMethodCalculate.markStartTimeMs("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f287890b.size();
        SnsMethodCalculate.markEndTimeMs("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    /* renamed from: f */
    public final int mo137494f() {
        SnsMethodCalculate.markStartTimeMs("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f287891c.size();
        SnsMethodCalculate.markEndTimeMs("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    /* renamed from: g */
    public final Interpolator mo137495g(int i) {
        SnsMethodCalculate.markStartTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        Interpolator[] interpolatorArr = this.f287913y;
        if (interpolatorArr == null || i < 0 || i >= interpolatorArr.length) {
            SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return null;
        }
        Interpolator interpolator = interpolatorArr[i];
        SnsMethodCalculate.markEndTimeMs("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return interpolator;
    }

    /* renamed from: h */
    public void mo137496h() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        Log.m105924i("ParticleGenerator", "reset");
        this.f287888C = null;
        this.f287896h = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    /* renamed from: i */
    public final void mo137497i(View view) {
        SnsMethodCalculate.markStartTimeMs("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        SnsMethodCalculate.markEndTimeMs("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    /* renamed from: j */
    public void mo137498j(C98185c cVar) {
        SnsMethodCalculate.markStartTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.f287887B = cVar;
        this.f287904p = null;
        Bitmap a = cVar.mo137484a();
        if (a != null) {
            Log.m105924i("ParticleGenerator", "setAnimConfig, bmp!=null");
            this.f287904p = new BitmapDrawable(this.f287889a.getResources(), a);
        } else {
            Log.m105924i("ParticleGenerator", "setAnimConfig, bmp==null");
        }
        this.f287903o = System.currentTimeMillis();
        Interpolator[] interpolatorArr = new Interpolator[4];
        this.f287913y = interpolatorArr;
        interpolatorArr[0] = new LinearInterpolator();
        this.f287913y[1] = new AccelerateInterpolator();
        this.f287913y[2] = new DecelerateInterpolator();
        this.f287913y[3] = new AccelerateDecelerateInterpolator();
        SnsMethodCalculate.markStartTimeMs("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.f287897i = m126865d(this.f287889a, cVar.f287866n);
        this.f287898j = m126865d(this.f287889a, cVar.f287867o);
        this.f287901m = C76577a.m92151b(this.f287889a, cVar.f287855c);
        this.f287902n = C76577a.m92151b(this.f287889a, cVar.f287854b);
        this.f287894f = cVar.f287856d;
        int i = cVar.f287857e;
        if (i <= 0) {
            i = 30;
        }
        this.f287895g = 1000 / i;
        this.f287911w = cVar.f287862j;
        this.f287912x = cVar.f287863k;
        long j = (long) cVar.f287865m;
        this.f287909u = j;
        if (j < 0) {
            Log.m105920e("ParticleGenerator", "illegal fadeOutDelay:" + this.f287909u);
            this.f287909u = 300;
        }
        long j2 = (long) cVar.f287864l;
        this.f287910v = j2;
        if (j2 < 0) {
            Log.m105920e("ParticleGenerator", "illegal fadeOutDuration:" + this.f287910v);
            this.f287910v = 300;
        }
        this.f287905q = cVar.f287858f;
        this.f287906r = cVar.f287859g;
        this.f287907s = cVar.f287860h;
        long j3 = (long) cVar.f287861i;
        this.f287908t = j3;
        if (j3 < 0) {
            Log.m105920e("ParticleGenerator", "illegal scaleDuration:" + this.f287908t);
            this.f287908t = 300;
        }
        float f = cVar.f287868p;
        this.f287886A = f;
        if (f <= 0.0f) {
            this.f287886A = 0.8f;
        }
        this.f287914z = this.f287909u + this.f287910v + 50;
        SnsMethodCalculate.markEndTimeMs("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        SnsMethodCalculate.markEndTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }
}
