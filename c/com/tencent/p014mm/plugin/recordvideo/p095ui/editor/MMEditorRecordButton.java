package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton */
public class MMEditorRecordButton extends FrameLayout {

    /* renamed from: D */
    public static final int f315625D = ViewConfiguration.getTapTimeout();

    /* renamed from: E */
    public static final float f315626E = (((float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3713c6)) / ((float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3761db)));

    /* renamed from: A */
    public MMHandler f315627A = new MMHandler(Looper.getMainLooper());

    /* renamed from: B */
    public Runnable f315628B = new C106039b();

    /* renamed from: C */
    public Runnable f315629C = new C106040c();

    /* renamed from: d */
    public long f315630d = -1;

    /* renamed from: e */
    public View f315631e;

    /* renamed from: f */
    public View f315632f;

    /* renamed from: g */
    public ImageView f315633g;

    /* renamed from: h */
    public boolean f315634h = false;

    /* renamed from: i */
    public boolean f315635i = false;

    /* renamed from: j */
    public boolean f315636j = false;

    /* renamed from: n */
    public ViewPropertyAnimator f315637n;

    /* renamed from: o */
    public ValueAnimator f315638o;

    /* renamed from: p */
    public ViewPropertyAnimator f315639p;

    /* renamed from: q */
    public boolean f315640q = false;

    /* renamed from: r */
    public int f315641r;

    /* renamed from: s */
    public int f315642s;

    /* renamed from: t */
    public Drawable f315643t;

    /* renamed from: u */
    public Drawable f315644u;

    /* renamed from: v */
    public Drawable f315645v;

    /* renamed from: w */
    public float f315646w = -1.0f;

    /* renamed from: x */
    public boolean f315647x = true;

    /* renamed from: y */
    public boolean f315648y = false;

    /* renamed from: z */
    public boolean f315649z = false;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$a */
    public class C106038a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f315650d;

        public C106038a(int i) {
            this.f315650d = i;
        }

        public void run() {
            MMEditorRecordButton.super.setVisibility(this.f315650d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$b */
    public class C106039b implements Runnable {
        public C106039b() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", Boolean.valueOf(MMEditorRecordButton.this.f315634h), Boolean.valueOf(MMEditorRecordButton.this.f315635i));
            MMEditorRecordButton mMEditorRecordButton = MMEditorRecordButton.this;
            if (!mMEditorRecordButton.f315634h) {
                mMEditorRecordButton.f315635i = true;
                mMEditorRecordButton.getClass();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$c */
    public class C106040c implements Runnable {
        public C106040c() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", Boolean.valueOf(MMEditorRecordButton.this.f315640q));
            MMEditorRecordButton mMEditorRecordButton = MMEditorRecordButton.this;
            if (mMEditorRecordButton.f315640q) {
                mMEditorRecordButton.getClass();
                Log.m105918d("MicroMsg.MMSightRecordButton", "startTransition");
                mMEditorRecordButton.f315636j = true;
                ViewPropertyAnimator viewPropertyAnimator = mMEditorRecordButton.f315637n;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    mMEditorRecordButton.f315637n = null;
                }
                ViewPropertyAnimator animate = mMEditorRecordButton.f315632f.animate();
                float f = MMEditorRecordButton.f315626E;
                ViewPropertyAnimator scaleY = animate.scaleX(f).scaleY(f);
                mMEditorRecordButton.f315637n = scaleY;
                scaleY.setDuration(150).start();
                if (mMEditorRecordButton.f315642s != mMEditorRecordButton.f315641r) {
                    ValueAnimator valueAnimator = mMEditorRecordButton.f315638o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ObjectAnimator ofArgb = ObjectAnimator.ofArgb(mMEditorRecordButton.f315644u, "color", new int[]{mMEditorRecordButton.f315641r, mMEditorRecordButton.f315642s});
                    mMEditorRecordButton.f315638o = ofArgb;
                    ofArgb.setDuration(150);
                    mMEditorRecordButton.f315638o.start();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$d */
    public class C106041d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ long f315654d;

        public C106041d(long j) {
            this.f315654d = j;
        }

        public void onAnimationEnd(Animator animator) {
            MMEditorRecordButton mMEditorRecordButton = MMEditorRecordButton.this;
            if (mMEditorRecordButton.f315630d > 0 && this.f315654d <= 500 && !mMEditorRecordButton.f315635i) {
                Log.m105925i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", Boolean.valueOf(mMEditorRecordButton.f315634h), Boolean.valueOf(MMEditorRecordButton.this.f315635i));
                MMEditorRecordButton mMEditorRecordButton2 = MMEditorRecordButton.this;
                mMEditorRecordButton2.f315634h = true;
                if (!mMEditorRecordButton2.f315635i) {
                    mMEditorRecordButton2.getClass();
                }
            } else if (mMEditorRecordButton.f315635i) {
                mMEditorRecordButton.getClass();
            } else {
                Log.m105924i("MicroMsg.MMSightRecordButton", "error action up");
                MMEditorRecordButton.this.getClass();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$e */
    public interface C106042e {
        /* renamed from: a */
        void mo151491a();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$f */
    public interface C106043f {
        /* renamed from: a */
        void mo151492a();

        /* renamed from: b */
        void mo151493b();

        /* renamed from: c */
        void mo151494c();

        /* renamed from: d */
        void mo151495d();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$g */
    public interface C106044g {
        /* renamed from: a */
        void mo151496a(int i);

        /* renamed from: b */
        void mo151497b(int i);
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$h */
    public interface C106045h {
        /* renamed from: a */
        void mo151498a();
    }

    public MMEditorRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo151477b();
    }

    /* renamed from: b */
    public final void mo151477b() {
        Log.m105925i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, Integer.valueOf(f315625D));
        this.f315643t = getContext().getResources().getDrawable(C0966R.C0969drawable.agw);
        this.f315644u = getContext().getResources().getDrawable(C0966R.C0969drawable.agx);
        this.f315645v = C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_mike, getResources().getColor(C0966R.color.f2960ag));
        this.f315641r = Color.parseColor("#FFDDDDDD");
        this.f315642s = Color.parseColor("#4CFA9D3B");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bfu, this, true);
        this.f315633g = (ImageView) findViewById(C0966R.C0970id.f7b);
        this.f315631e = findViewById(C0966R.C0970id.f7_);
        this.f315632f = findViewById(C0966R.C0970id.hpy);
        MMEditorCircularProgressBar mMEditorCircularProgressBar = (MMEditorCircularProgressBar) findViewById(C0966R.C0970id.bd6);
        this.f315633g.setImageDrawable(this.f315645v);
        this.f315631e.setBackground(this.f315643t);
        this.f315632f.setBackground(this.f315644u);
        this.f315647x = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 != 3) goto L_0x017f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.f315647x
            java.lang.String r1 = "MicroMsg.MMSightRecordButton"
            r2 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r12 = "onTouchEvent, not enable, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return r2
        L_0x000e:
            int r0 = r12.getAction()
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0152
            r5 = 3
            r6 = 2
            if (r0 == r4) goto L_0x009b
            if (r0 == r6) goto L_0x0020
            if (r0 == r5) goto L_0x009b
            goto L_0x017f
        L_0x0020:
            float r0 = r12.getRawY()
            int[] r3 = new int[r6]
            r11.getLocationInWindow(r3)
            r3 = r3[r4]
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x017f
            float r3 = r11.f315646w
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x003f
            float r12 = r12.getRawY()
            r11.f315646w = r12
            goto L_0x017f
        L_0x003f:
            float r12 = r0 - r3
            float r12 = java.lang.Math.abs(r12)
            float r3 = r11.f315646w
            r7 = 1092616192(0x41200000, float:10.0)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0072
            int r8 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0072
            float r12 = r12 / r7
            int r12 = (int) r12
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r3[r2] = r6
            boolean r6 = r11.f315648y
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3[r4] = r6
            java.lang.String r6 = "onScroll Up, factor: %s, isFirstScrollUp: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r3)
            java.lang.Math.min(r12, r5)
            r11.f315646w = r0
            r11.f315648y = r2
            goto L_0x017f
        L_0x0072:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x017f
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x017f
            float r12 = r12 / r7
            int r12 = (int) r12
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r3[r2] = r6
            boolean r6 = r11.f315649z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3[r4] = r6
            java.lang.String r6 = "onScroll Down, factor: %s, isFirstScrollDown: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r3)
            java.lang.Math.min(r12, r5)
            r11.f315649z = r2
            r11.f315646w = r0
            goto L_0x017f
        L_0x009b:
            r11.f315640q = r2
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f315627A
            java.lang.Runnable r0 = r11.f315629C
            int r7 = f315625D
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.removeCallbacks(r0, r7)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f315627A
            java.lang.Runnable r0 = r11.f315628B
            r12.removeCallbacks(r0)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r11.f315630d
            long r7 = r7 - r9
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            boolean r0 = r11.f315635i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12[r2] = r0
            boolean r0 = r11.f315634h
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12[r4] = r0
            long r9 = r11.f315630d
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r12[r6] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r12[r5] = r0
            java.lang.String r0 = "onAction Up/Cancel, isDispatchLongPress: %s, isDispatchSimpleTap: %s, pressDownTime: %s, upTimeDiff: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r12)
            com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$d r12 = new com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton$d
            r12.<init>(r7)
            r11.f315636j = r4
            android.view.ViewPropertyAnimator r0 = r11.f315639p
            if (r0 == 0) goto L_0x00ef
            r0.cancel()
            r11.f315639p = r3
        L_0x00ef:
            android.view.View r0 = r11.f315631e
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            r11.f315639p = r0
            yh2.m r3 = new yh2.m
            r3.<init>(r11, r12)
            android.view.ViewPropertyAnimator r12 = r0.setListener(r3)
            r7 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r7)
            r12.start()
            android.view.View r12 = r11.f315632f
            android.view.ViewPropertyAnimator r12 = r12.animate()
            android.view.ViewPropertyAnimator r12 = r12.scaleX(r1)
            android.view.ViewPropertyAnimator r12 = r12.scaleY(r1)
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r7)
            r12.start()
            int r12 = r11.f315642s
            int r0 = r11.f315641r
            if (r12 == r0) goto L_0x017f
            android.animation.ValueAnimator r12 = r11.f315638o
            if (r12 == 0) goto L_0x0135
            r12.cancel()
        L_0x0135:
            android.graphics.drawable.Drawable r12 = r11.f315644u
            int[] r0 = new int[r6]
            int r1 = r11.f315642s
            r0[r2] = r1
            int r1 = r11.f315641r
            r0[r4] = r1
            java.lang.String r1 = "color"
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofArgb(r12, r1, r0)
            r11.f315638o = r12
            r12.setDuration(r7)
            android.animation.ValueAnimator r12 = r11.f315638o
            r12.start()
            goto L_0x017f
        L_0x0152:
            r11.f315640q = r4
            long r0 = java.lang.System.currentTimeMillis()
            r11.f315630d = r0
            r11.f315634h = r2
            r11.f315635i = r2
            float r12 = r12.getRawY()
            r11.f315646w = r12
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f315627A
            r12.removeCallbacksAndMessages(r3)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f315627A
            java.lang.Runnable r0 = r11.f315628B
            r1 = 550(0x226, double:2.717E-321)
            r12.postDelayed(r0, r1)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f315627A
            java.lang.Runnable r0 = r11.f315629C
            r1 = 250(0xfa, double:1.235E-321)
            r12.postDelayed(r0, r1)
            r11.f315649z = r4
            r11.f315648y = r4
        L_0x017f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.MMEditorRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setErrorPressCallback(C106042e eVar) {
    }

    public void setHighLightOuter(int i) {
        this.f315642s = i;
        Drawable drawable = this.f315644u;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
    }

    public void setInnerColor(int i) {
        Drawable drawable = this.f315643t;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
    }

    public void setLongPressCallback(C106043f fVar) {
    }

    public void setLongPressScrollCallback(C106044g gVar) {
    }

    public void setSimpleTapCallback(C106045h hVar) {
    }

    public void setTouchEnable(boolean z) {
        Log.m105925i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", Boolean.valueOf(z));
        this.f315647x = z;
    }

    public void setVisibility(int i) {
        Log.m105925i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", Boolean.valueOf(this.f315636j));
        if (this.f315636j) {
            postDelayed(new C106038a(i), 150);
        } else {
            super.setVisibility(i);
        }
    }

    public MMEditorRecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo151477b();
    }
}
