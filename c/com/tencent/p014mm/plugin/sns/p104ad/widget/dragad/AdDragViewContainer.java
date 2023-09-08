package com.tencent.p014mm.plugin.sns.p104ad.widget.dragad;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bp3.C79758p;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import lf3.C99415c;
import sq2.C13774c;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer */
public class AdDragViewContainer extends FrameLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f274369w = 0;

    /* renamed from: d */
    public Context f274370d;

    /* renamed from: e */
    public Rect f274371e = new Rect();

    /* renamed from: f */
    public Rect f274372f = new Rect();

    /* renamed from: g */
    public Rect f274373g = new Rect();

    /* renamed from: h */
    public Rect f274374h = new Rect();

    /* renamed from: i */
    public Rect f274375i = new Rect();

    /* renamed from: j */
    public ImageView f274376j;

    /* renamed from: n */
    public boolean f274377n = false;

    /* renamed from: o */
    public boolean f274378o = false;

    /* renamed from: p */
    public boolean f274379p = false;

    /* renamed from: q */
    public int f274380q;

    /* renamed from: r */
    public int f274381r;

    /* renamed from: s */
    public C94757c f274382s = new C94756b(this);

    /* renamed from: t */
    public Paint f274383t;

    /* renamed from: u */
    public boolean f274384u = false;

    /* renamed from: v */
    public int f274385v = Color.parseColor("#33000000");

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$a */
    public class C94755a extends C13774c {
        public C94755a() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$6");
            AdDragViewContainer.m120005a(AdDragViewContainer.this).setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$b */
    public class C94756b implements C94757c {
        public C94756b(AdDragViewContainer adDragViewContainer) {
        }

        /* renamed from: a */
        public void mo130525a() {
            SnsMethodCalculate.markStartTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
            Log.m105924i("AdDragViewContainer", "onDragStart");
            SnsMethodCalculate.markEndTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        }

        /* renamed from: b */
        public void mo130526b() {
            SnsMethodCalculate.markStartTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
            Log.m105924i("AdDragViewContainer", "onDragHit");
            SnsMethodCalculate.markEndTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        }

        /* renamed from: c */
        public void mo130527c() {
            SnsMethodCalculate.markStartTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
            Log.m105924i("AdDragViewContainer", "onDragSucc");
            SnsMethodCalculate.markEndTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        }

        /* renamed from: d */
        public void mo130528d() {
            SnsMethodCalculate.markStartTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
            Log.m105924i("AdDragViewContainer", "onDragCancel");
            SnsMethodCalculate.markEndTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$c */
    public interface C94757c {
        /* renamed from: a */
        void mo130525a();

        /* renamed from: b */
        void mo130526b();

        /* renamed from: c */
        void mo130527c();

        /* renamed from: d */
        void mo130528d();
    }

    public AdDragViewContainer(Context context) {
        super(context);
        mo130518c(context);
    }

    /* renamed from: a */
    public static /* synthetic */ ImageView m120005a(AdDragViewContainer adDragViewContainer) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        ImageView imageView = adDragViewContainer.f274376j;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        return imageView;
    }

    /* renamed from: b */
    public void mo130517b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f274376j.getVisibility() == 0) {
            Log.m105924i("AdDragViewContainer", "hideDragView, anim=" + z);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f274376j, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(200);
                ofFloat.addListener(new C94755a());
                ofFloat.start();
            } else {
                this.f274376j.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* renamed from: c */
    public void mo130518c(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f274370d = context;
        Log.m105924i("AdDragViewContainer", "init, new dragView");
        ImageView imageView = new ImageView(this.f274370d);
        this.f274376j = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f274376j.setVisibility(8);
        addView(this.f274376j, new FrameLayout.LayoutParams(0, 0));
        SnsMethodCalculate.markStartTimeMs("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        try {
            if (C102260r.m134844M() && C79758p.f233760a.mo109883f(new C99415c()) == 1) {
                this.f274384u = true;
            }
        } catch (Throwable th) {
            Log.m105920e("AdDragViewContainer", "initTestSwitch, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* renamed from: d */
    public final void mo130519d() {
        SnsMethodCalculate.markStartTimeMs("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        Log.m105924i("AdDragViewContainer", "resetDragState");
        this.f274378o = false;
        this.f274379p = false;
        this.f274375i.set(this.f274374h);
        this.f274376j.setScaleX(1.0f);
        this.f274376j.setScaleY(1.0f);
        this.f274376j.setX((float) this.f274371e.left);
        this.f274376j.setY((float) this.f274371e.top);
        SnsMethodCalculate.markEndTimeMs("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void dispatchDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        super.dispatchDraw(canvas);
        if (this.f274384u) {
            canvas.drawColor(this.f274385v);
            if (this.f274383t == null) {
                Paint paint = new Paint();
                this.f274383t = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.f274383t.setStrokeWidth(3.0f);
            }
            if (this.f274371e != null) {
                this.f274383t.setColor(-16776961);
                canvas.drawRect(this.f274371e, this.f274383t);
            }
            if (this.f274372f != null) {
                this.f274383t.setColor(-16776961);
                canvas.drawRect(this.f274372f, this.f274383t);
            }
            if (this.f274375i != null) {
                this.f274383t.setColor(-256);
                canvas.drawRect(this.f274375i, this.f274383t);
            }
            if (this.f274373g != null) {
                if (this.f274379p) {
                    this.f274383t.setColor(-65536);
                } else {
                    this.f274383t.setColor(-256);
                }
                canvas.drawRect(this.f274373g, this.f274383t);
            }
        }
        SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r5 != 3) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "onTouchEvent"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            float r3 = r20.getX()
            int r3 = (int) r3
            float r4 = r20.getY()
            int r4 = (int) r4
            boolean r5 = r0.f274377n
            if (r5 != 0) goto L_0x0020
            boolean r3 = super.onTouchEvent(r20)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0020:
            int r5 = r20.getAction()
            java.lang.String r6 = "onTouchEvent, action="
            java.lang.String r8 = "AdDragViewContainer"
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x020d
            r11 = 2
            if (r5 == r10) goto L_0x00da
            if (r5 == r11) goto L_0x003a
            r3 = 3
            if (r5 == r3) goto L_0x00da
        L_0x0035:
            r17 = r1
            r10 = r5
            goto L_0x023a
        L_0x003a:
            boolean r7 = r0.f274378o
            if (r7 == 0) goto L_0x0035
            r0.requestDisallowInterceptTouchEvent(r10)
            int r7 = r0.f274380q
            int r3 = r3 - r7
            int r7 = r0.f274381r
            int r4 = r4 - r7
            android.graphics.Rect r7 = r0.f274371e
            int r7 = r7.left
            int r11 = -r7
            if (r3 >= r11) goto L_0x004f
            int r3 = -r7
        L_0x004f:
            int r7 = r19.getWidth()
            android.graphics.Rect r11 = r0.f274371e
            int r11 = r11.right
            int r7 = r7 - r11
            if (r3 <= r7) goto L_0x0063
            int r3 = r19.getWidth()
            android.graphics.Rect r7 = r0.f274371e
            int r7 = r7.right
            int r3 = r3 - r7
        L_0x0063:
            android.graphics.Rect r7 = r0.f274371e
            int r7 = r7.top
            int r11 = -r7
            if (r4 >= r11) goto L_0x006b
            int r4 = -r7
        L_0x006b:
            int r7 = r19.getHeight()
            android.graphics.Rect r11 = r0.f274371e
            int r11 = r11.bottom
            int r7 = r7 - r11
            if (r4 <= r7) goto L_0x007f
            int r4 = r19.getHeight()
            android.graphics.Rect r7 = r0.f274371e
            int r7 = r7.bottom
            int r4 = r4 - r7
        L_0x007f:
            android.graphics.Rect r7 = r0.f274371e
            int r11 = r7.left
            int r11 = r11 + r3
            int r7 = r7.top
            int r7 = r7 + r4
            android.widget.ImageView r12 = r0.f274376j
            float r11 = (float) r11
            r12.setX(r11)
            android.widget.ImageView r11 = r0.f274376j
            float r7 = (float) r7
            r11.setY(r7)
            android.graphics.Rect r7 = r0.f274374h
            android.graphics.Rect r11 = r0.f274375i
            java.lang.String r12 = "transRect"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r2)
            if (r7 == 0) goto L_0x00ba
            if (r11 != 0) goto L_0x00a2
            goto L_0x00ba
        L_0x00a2:
            int r13 = r7.left
            int r13 = r13 + r3
            r11.left = r13
            int r13 = r7.top
            int r13 = r13 + r4
            r11.top = r13
            int r13 = r7.right
            int r13 = r13 + r3
            r11.right = r13
            int r3 = r7.bottom
            int r3 = r3 + r4
            r11.bottom = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
            goto L_0x00bd
        L_0x00ba:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
        L_0x00bd:
            android.graphics.Rect r3 = r0.f274375i
            android.graphics.Rect r4 = r0.f274373g
            boolean r3 = android.graphics.Rect.intersects(r3, r4)
            if (r3 == 0) goto L_0x00d6
            boolean r3 = r0.f274379p
            if (r3 != 0) goto L_0x00d2
            com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$c r3 = r0.f274382s
            if (r3 == 0) goto L_0x00d2
            r3.mo130526b()
        L_0x00d2:
            r0.f274379p = r10
            goto L_0x0035
        L_0x00d6:
            r0.f274379p = r9
            goto L_0x0035
        L_0x00da:
            boolean r3 = r0.f274378o
            if (r3 == 0) goto L_0x01fd
            boolean r3 = r0.f274379p
            if (r3 == 0) goto L_0x019e
            java.lang.String r3 = "move2Target"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            android.widget.ImageView r4 = r0.f274376j
            float r4 = r4.getX()
            int r4 = (int) r4
            android.widget.ImageView r14 = r0.f274376j
            float r14 = r14.getY()
            int r14 = (int) r14
            android.graphics.Rect r15 = r0.f274371e
            int r7 = r15.right
            int r12 = r15.left
            int r7 = r7 - r12
            int r12 = r15.bottom
            int r13 = r15.top
            int r12 = r12 - r13
            android.graphics.Rect r13 = r0.f274372f
            int r15 = r13.right
            int r10 = r13.left
            int r15 = r15 - r10
            int r9 = r13.bottom
            int r13 = r13.top
            int r9 = r9 - r13
            int r17 = r15 - r7
            int r17 = r17 / 2
            int r18 = r9 - r12
            int r18 = r18 / 2
            int r10 = r10 + r17
            int r13 = r13 + r18
            r17 = r1
            int[] r1 = new int[r11]
            r16 = 0
            r1[r16] = r4
            r4 = 1
            r1[r4] = r10
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r10 = r5
            r4 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r4)
            yq2.d r4 = new yq2.d
            r4.<init>(r0)
            r1.addUpdateListener(r4)
            com.tencent.mm.plugin.sns.ad.widget.dragad.a r4 = new com.tencent.mm.plugin.sns.ad.widget.dragad.a
            r4.<init>(r0)
            r1.addListener(r4)
            int[] r4 = new int[r11]
            r4[r16] = r14
            r5 = 1
            r4[r5] = r13
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
            r13 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r13)
            yq2.e r5 = new yq2.e
            r5.<init>(r0)
            r4.addUpdateListener(r5)
            float r5 = (float) r15
            r13 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r13
            float r7 = (float) r7
            float r5 = r5 / r7
            float r7 = (float) r9
            float r7 = r7 * r13
            float r9 = (float) r12
            float r7 = r7 / r9
            android.widget.ImageView r9 = r0.f274376j
            float[] r12 = new float[r11]
            r14 = 0
            r12[r14] = r13
            r15 = 1
            r12[r15] = r5
            java.lang.String r5 = "scaleX"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r9, r5, r12)
            android.widget.ImageView r9 = r0.f274376j
            float[] r11 = new float[r11]
            r11[r14] = r13
            r11[r15] = r7
            java.lang.String r7 = "scaleY"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r7, r11)
            r11 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r11)
            r7.setDuration(r11)
            r1.start()
            r4.start()
            r5.start()
            r7.start()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0200
        L_0x019e:
            r17 = r1
            r10 = r5
            java.lang.String r1 = "move2Src"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            android.widget.ImageView r3 = r0.f274376j
            float r3 = r3.getX()
            int r3 = (int) r3
            android.widget.ImageView r4 = r0.f274376j
            float r4 = r4.getY()
            int r4 = (int) r4
            android.graphics.Rect r5 = r0.f274371e
            int r7 = r5.left
            int r5 = r5.top
            int[] r9 = new int[r11]
            r12 = 0
            r9[r12] = r3
            r3 = 1
            r9[r3] = r7
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r9)
            r13 = 300(0x12c, double:1.48E-321)
            r7.setDuration(r13)
            yq2.b r9 = new yq2.b
            r9.<init>(r0)
            r7.addUpdateListener(r9)
            int[] r9 = new int[r11]
            r9[r12] = r4
            r9[r3] = r5
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofInt(r9)
            r3.setDuration(r13)
            yq2.c r4 = new yq2.c
            r4.<init>(r0)
            r3.addUpdateListener(r4)
            r7.start()
            r3.start()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$c r1 = r0.f274382s
            if (r1 == 0) goto L_0x0200
            r1.mo130528d()
            goto L_0x0200
        L_0x01fd:
            r17 = r1
            r10 = r5
        L_0x0200:
            r1 = 0
            r0.f274378o = r1
            r0.f274379p = r1
            android.graphics.Rect r1 = r0.f274375i
            android.graphics.Rect r3 = r0.f274374h
            r1.set(r3)
            goto L_0x023a
        L_0x020d:
            r17 = r1
            r10 = r5
            r1 = 0
            r0.f274378o = r1
            r0.f274379p = r1
            android.widget.ImageView r1 = r0.f274376j
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r5)
            android.widget.ImageView r1 = r0.f274376j
            r1.setScaleY(r5)
            r0.f274380q = r3
            r0.f274381r = r4
            android.graphics.Rect r1 = r0.f274371e
            boolean r1 = r1.contains(r3, r4)
            if (r1 == 0) goto L_0x025f
            r1 = 1
            r0.f274378o = r1
            r0.requestDisallowInterceptTouchEvent(r1)
            com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$c r1 = r0.f274382s
            if (r1 == 0) goto L_0x023a
            r1.mo130525a()
        L_0x023a:
            boolean r1 = r0.f274384u
            if (r1 == 0) goto L_0x0241
            r19.invalidate()
        L_0x0241:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r10)
            java.lang.String r3 = ", ret=true"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r1 = 1
            return r1
        L_0x025f:
            r1 = r17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r10)
            java.lang.String r4 = ", ret=false"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDragEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f274377n != z) {
            this.f274377n = z;
            Log.m105924i("AdDragViewContainer", "setDragEnabled, enabled=" + z);
            if (!z && this.f274378o && this.f274382s != null) {
                this.f274378o = false;
                this.f274379p = false;
                this.f274375i.set(this.f274374h);
                this.f274382s.mo130528d();
            }
        }
        SnsMethodCalculate.markEndTimeMs("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void setDragEventCallback(C94757c cVar) {
        SnsMethodCalculate.markStartTimeMs("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f274382s = cVar;
        SnsMethodCalculate.markEndTimeMs("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void setDragViewImg(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        Log.m105924i("AdDragViewContainer", "setDragViewImg");
        this.f274376j.setImageBitmap(bitmap);
        SnsMethodCalculate.markEndTimeMs("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public AdDragViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130518c(context);
    }

    public AdDragViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130518c(context);
    }
}
