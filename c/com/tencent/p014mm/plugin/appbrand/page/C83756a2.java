package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.page.a2 */
public class C83756a2 extends FrameLayout {

    /* renamed from: d */
    public View f244478d;

    /* renamed from: e */
    public FrameLayout f244479e;

    /* renamed from: f */
    public FrameLayout f244480f;

    /* renamed from: g */
    public int f244481g;

    /* renamed from: h */
    public boolean f244482h = true;

    /* renamed from: i */
    public boolean f244483i = false;

    /* renamed from: j */
    public boolean f244484j = false;

    /* renamed from: n */
    public boolean f244485n = false;

    /* renamed from: o */
    public boolean f244486o = false;

    /* renamed from: p */
    public int f244487p;

    /* renamed from: q */
    public int f244488q;

    /* renamed from: r */
    public int f244489r;

    /* renamed from: s */
    public boolean f244490s = false;

    /* renamed from: t */
    public ObjectAnimator f244491t = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a2$a */
    public class C83757a implements ValueAnimator.AnimatorUpdateListener {
        public C83757a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C83756a2.this.mo116086d((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public C83756a2(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f244481g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private int getMaxOverScrollDistance() {
        return getHeight();
    }

    /* renamed from: a */
    public boolean mo116083a() {
        return false;
    }

    /* renamed from: b */
    public void mo116084b() {
        mo116085c(0);
        if (this.f244484j) {
            mo116087e();
        }
        this.f244485n = false;
        this.f244484j = false;
        this.f244486o = false;
    }

    /* renamed from: c */
    public final void mo116085c(int i) {
        int translationY = (int) this.f244480f.getTranslationY();
        if (translationY != i) {
            Log.m105925i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", Integer.valueOf(translationY), Integer.valueOf(i));
            ObjectAnimator objectAnimator = this.f244491t;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f244480f, "translationY", new float[]{(float) translationY, (float) i});
            ofFloat.setDuration(Math.min((long) ((((float) Math.abs(translationY - i)) / ((float) getStayHeight())) * 250.0f), 250));
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.start();
            ofFloat.addUpdateListener(new C83757a());
            this.f244491t = ofFloat;
        }
    }

    /* renamed from: d */
    public void mo116086d(int i) {
    }

    /* renamed from: e */
    public void mo116087e() {
    }

    /* renamed from: f */
    public void mo116088f() {
    }

    public int getOpenHeight() {
        return this.f244478d.getHeight();
    }

    public int getPullDownBackgroundColor() {
        Drawable background = this.f244479e.getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return 0;
    }

    public int getStayHeight() {
        return this.f244478d.getHeight();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f244482h) {
            return this.f244486o;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f244485n = false;
            this.f244490s = false;
            return false;
        } else if (action == 2 && this.f244485n) {
            return true;
        } else {
            if (action != 0) {
                if (action == 2 && mo116083a()) {
                    if (!this.f244490s) {
                        this.f244487p = (int) motionEvent.getX();
                        this.f244488q = (int) motionEvent.getY();
                        this.f244489r = (int) motionEvent.getY();
                        this.f244485n = false;
                        this.f244490s = true;
                        return false;
                    }
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i = x - this.f244487p;
                    int i2 = y - this.f244488q;
                    if (Math.abs(i2) > this.f244481g && Math.abs(i2) > Math.abs(i) && i2 > 0) {
                        this.f244487p = x;
                        this.f244488q = y;
                        this.f244485n = true;
                        this.f244490s = false;
                        return true;
                    }
                }
            } else if (mo116083a()) {
                this.f244487p = (int) motionEvent.getX();
                this.f244488q = (int) motionEvent.getY();
                this.f244489r = (int) motionEvent.getY();
                this.f244485n = false;
                this.f244490s = true;
            }
            return this.f244485n || this.f244486o;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r0 != 3) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f244482h
            if (r0 == 0) goto L_0x000e
            boolean r6 = r5.f244486o
            if (r6 == 0) goto L_0x000b
            r5.mo116084b()
        L_0x000b:
            boolean r6 = r5.f244486o
            return r6
        L_0x000e:
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x001c
            int r0 = r6.getEdgeFlags()
            if (r0 == 0) goto L_0x001c
            return r1
        L_0x001c:
            int r0 = r6.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x00cd
            if (r0 == r2) goto L_0x0097
            r3 = 2
            if (r0 == r3) goto L_0x002d
            r6 = 3
            if (r0 == r6) goto L_0x0097
            goto L_0x00d8
        L_0x002d:
            boolean r0 = r5.f244485n
            if (r0 != 0) goto L_0x0035
            boolean r0 = r5.f244486o
            if (r0 == 0) goto L_0x00d8
        L_0x0035:
            boolean r0 = r5.f244490s
            if (r0 != 0) goto L_0x0051
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f244488q = r0
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f244487p = r0
            float r6 = r6.getY()
            int r6 = (int) r6
            r5.f244489r = r6
            r5.f244490s = r2
            return r2
        L_0x0051:
            float r6 = r6.getY()
            int r6 = (int) r6
            int r0 = r5.f244489r
            int r6 = r6 - r0
            int r0 = r6 >> 1
            int r4 = r5.getMaxOverScrollDistance()
            if (r0 <= r4) goto L_0x0062
            r0 = r4
        L_0x0062:
            boolean r4 = r5.f244484j
            if (r4 == 0) goto L_0x006b
            int r4 = r5.getStayHeight()
            int r0 = r0 + r4
        L_0x006b:
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3[r2] = r6
            java.lang.String r6 = "MicroMsg.AppBrandPullDownView"
            java.lang.String r1 = "real diff: %d, calc diff: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r3)
            int r6 = r5.getMaxOverScrollDistance()
            int r6 = java.lang.Math.min(r6, r0)
            android.widget.FrameLayout r1 = r5.f244480f
            float r6 = (float) r6
            r1.setTranslationY(r6)
            r5.mo116086d(r0)
            return r2
        L_0x0097:
            r5.f244490s = r1
            android.widget.FrameLayout r6 = r5.f244480f
            float r6 = r6.getTranslationY()
            int r0 = r5.getOpenHeight()
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c1
            boolean r6 = r5.f244483i
            if (r6 == 0) goto L_0x00c1
            int r6 = r5.getStayHeight()
            r5.mo116085c(r6)
            boolean r6 = r5.f244484j
            if (r6 != 0) goto L_0x00ba
            r5.mo116088f()
        L_0x00ba:
            r5.f244485n = r2
            r5.f244484j = r2
            r5.f244486o = r2
            return r2
        L_0x00c1:
            boolean r6 = r5.f244485n
            if (r6 != 0) goto L_0x00c9
            boolean r6 = r5.f244486o
            if (r6 == 0) goto L_0x00d8
        L_0x00c9:
            r5.mo116084b()
            return r2
        L_0x00cd:
            boolean r0 = r5.mo116083a()
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r5.f244486o
            if (r0 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            return r1
        L_0x00d9:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f244488q = r0
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f244487p = r0
            float r6 = r6.getY()
            int r6 = (int) r6
            r5.f244489r = r6
            r5.f244490s = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83756a2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setNeedStay(boolean z) {
        this.f244483i = z;
    }

    public void setPullDownBackgroundColor(int i) {
        this.f244479e.setBackgroundColor(i);
    }

    public void setPullDownEnabled(boolean z) {
        this.f244482h = !z;
    }
}
