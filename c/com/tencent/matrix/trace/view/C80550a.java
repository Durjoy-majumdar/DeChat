package com.tencent.matrix.trace.view;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.matrix.trace.view.FloatFrameView;
import com.tencent.p014mm.C0966R;
import java.util.Arrays;
import p1041tf.C90452c;
import p221qf.C89643f;
import p723vf.C118672d;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: com.tencent.matrix.trace.view.a */
public class C80550a implements C89643f {

    /* renamed from: o */
    public static final Handler f235617o = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    public static C80550a f235618p;

    /* renamed from: q */
    public static final Object f235619q = new Object();

    /* renamed from: r */
    public static final int f235620r = Build.VERSION.SDK_INT;

    /* renamed from: a */
    public WindowManager f235621a;

    /* renamed from: b */
    public WindowManager.LayoutParams f235622b;

    /* renamed from: c */
    public boolean f235623c;

    /* renamed from: d */
    public final FloatFrameView f235624d;

    /* renamed from: e */
    public View.OnClickListener f235625e;

    /* renamed from: f */
    public final DisplayMetrics f235626f;

    /* renamed from: g */
    public boolean f235627g = true;

    /* renamed from: h */
    public final int f235628h;

    /* renamed from: i */
    public final int f235629i;

    /* renamed from: j */
    public final int f235630j;

    /* renamed from: k */
    public final int f235631k;

    /* renamed from: l */
    public final int f235632l;

    /* renamed from: m */
    public int f235633m;

    /* renamed from: n */
    public C80407h f235634n = new C80551a();

    /* renamed from: com.tencent.matrix.trace.view.a$a */
    public class C80551a implements C80407h {
        public C80551a() {
        }

        public void off() {
            C80550a.m98157e(C80550a.this, false);
        }

        /* renamed from: on */
        public void mo60742on() {
            C80550a.m98157e(C80550a.this, true);
        }
    }

    /* renamed from: com.tencent.matrix.trace.view.a$b */
    public class C80552b implements View.OnAttachStateChangeListener {
        public C80552b() {
        }

        public void onViewAttachedToWindow(View view) {
            C88146a aVar;
            C118672d.m167353c("Matrix.FrameDecorator", "onViewAttachedToWindow", new Object[0]);
            if (C91441c.m114729c() && (aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class)) != null) {
                aVar.f254918n.mo124268n(C80550a.this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C88146a aVar;
            C118672d.m167353c("Matrix.FrameDecorator", "onViewDetachedFromWindow", new Object[0]);
            if (C91441c.m114729c() && (aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class)) != null) {
                aVar.f254918n.mo124269o(C80550a.this);
            }
        }
    }

    /* renamed from: com.tencent.matrix.trace.view.a$c */
    public class C80553c implements View.OnTouchListener {

        /* renamed from: d */
        public float f235637d = 0.0f;

        /* renamed from: e */
        public float f235638e = 0.0f;

        /* renamed from: f */
        public int f235639f = 0;

        /* renamed from: g */
        public int f235640g = 0;

        /* renamed from: h */
        public final /* synthetic */ FloatFrameView f235641h;

        /* renamed from: com.tencent.matrix.trace.view.a$c$a */
        public class C80554a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ View f235643d;

            public C80554a(View view) {
                this.f235643d = view;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C80550a aVar = C80550a.this;
                if (aVar.f235623c) {
                    aVar.f235622b.x = ((Integer) valueAnimator.getAnimatedValue("trans")).intValue();
                    C80550a aVar2 = C80550a.this;
                    aVar2.f235621a.updateViewLayout(this.f235643d, aVar2.f235622b);
                }
            }
        }

        public C80553c(FloatFrameView floatFrameView) {
            this.f235641h = floatFrameView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            View.OnClickListener onClickListener;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f235637d = motionEvent.getX();
                this.f235638e = motionEvent.getY();
                WindowManager.LayoutParams layoutParams = C80550a.this.f235622b;
                this.f235639f = layoutParams.x;
                this.f235640g = layoutParams.y;
            } else if (action == 1) {
                int[] iArr = new int[2];
                C80550a aVar = C80550a.this;
                int i = aVar.f235622b.x;
                iArr[0] = i;
                int i2 = aVar.f235626f.widthPixels;
                iArr[1] = i > i2 / 2 ? i2 - this.f235641h.getWidth() : 0;
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("trans", iArr)});
                ofPropertyValuesHolder.addUpdateListener(new C80554a(view));
                ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                ofPropertyValuesHolder.setDuration(180).start();
                WindowManager.LayoutParams layoutParams2 = C80550a.this.f235622b;
                int i3 = layoutParams2.x;
                int i4 = layoutParams2.y;
                if (Math.abs(i3 - this.f235639f) <= 20 && Math.abs(i4 - this.f235640g) <= 20 && (onClickListener = C80550a.this.f235625e) != null) {
                    onClickListener.onClick(view);
                }
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                C80550a aVar2 = C80550a.this;
                WindowManager.LayoutParams layoutParams3 = aVar2.f235622b;
                layoutParams3.x = (int) (((float) layoutParams3.x) + ((x - this.f235637d) / 3.0f));
                layoutParams3.y = (int) (((float) layoutParams3.y) + ((y - this.f235638e) / 3.0f));
                if (view != null) {
                    aVar2.f235621a.updateViewLayout(view, layoutParams3);
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.trace.view.a$d */
    public class C80555d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f235645d;

        public C80555d(Context context) {
            this.f235645d = context;
        }

        public void run() {
            C80550a.f235618p = new C80550a(this.f235645d, new FloatFrameView(this.f235645d));
            Object obj = C80550a.f235619q;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    /* renamed from: com.tencent.matrix.trace.view.a$e */
    public class C80556e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ float f235646d;

        /* renamed from: e */
        public final /* synthetic */ String f235647e;

        /* renamed from: f */
        public final /* synthetic */ String f235648f;

        /* renamed from: g */
        public final /* synthetic */ String f235649g;

        /* renamed from: h */
        public final /* synthetic */ String f235650h;

        /* renamed from: i */
        public final /* synthetic */ String f235651i;

        /* renamed from: j */
        public final /* synthetic */ String f235652j;

        /* renamed from: n */
        public final /* synthetic */ String f235653n;

        /* renamed from: o */
        public final /* synthetic */ String f235654o;

        /* renamed from: p */
        public final /* synthetic */ String f235655p;

        /* renamed from: q */
        public final /* synthetic */ String f235656q;

        /* renamed from: r */
        public final /* synthetic */ int[] f235657r;

        /* renamed from: s */
        public final /* synthetic */ int[] f235658s;

        public C80556e(float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int[] iArr, int[] iArr2) {
            this.f235646d = f;
            this.f235647e = str;
            this.f235648f = str2;
            this.f235649g = str3;
            this.f235650h = str4;
            this.f235651i = str5;
            this.f235652j = str6;
            this.f235653n = str7;
            this.f235654o = str8;
            this.f235655p = str9;
            this.f235656q = str10;
            this.f235657r = iArr;
            this.f235658s = iArr2;
        }

        public void run() {
            C80550a aVar = C80550a.this;
            FloatFrameView.LineChartView lineChartView = aVar.f235624d.f235598e;
            int i = aVar.f235633m;
            lineChartView.getClass();
            FloatFrameView.LineChartView.C67647a aVar2 = new FloatFrameView.LineChartView.C67647a((int) this.f235646d, i);
            if (lineChartView.f193439h.size() >= 50) {
                lineChartView.f193439h.removeLast();
            }
            lineChartView.f193439h.addFirst(aVar2);
            lineChartView.invalidate();
            C80550a.this.f235624d.f235597d.setText(String.format("%.2f FPS", new Object[]{Float.valueOf(this.f235646d)}));
            C80550a aVar3 = C80550a.this;
            aVar3.f235624d.f235597d.setTextColor(aVar3.f235633m);
            C80550a.this.f235624d.f235600g.setText(this.f235647e);
            C80550a.this.f235624d.f235601h.setText(this.f235648f);
            C80550a.this.f235624d.f235602i.setText(this.f235649g);
            C80550a.this.f235624d.f235603j.setText(this.f235650h);
            C80550a.this.f235624d.f235604n.setText(this.f235651i);
            C80550a.this.f235624d.f235605o.setText(this.f235652j);
            C80550a.this.f235624d.f235606p.setText(this.f235653n);
            C80550a.this.f235624d.f235607q.setText(this.f235654o);
            if (C80550a.f235620r >= 31) {
                C80550a.this.f235624d.f235608r.setText(this.f235655p);
            } else {
                C80550a.this.f235624d.f235608r.setText("gpu: unusable");
            }
            C80550a.this.f235624d.f235609s.setText(this.f235656q);
            C80550a.this.f235624d.f235610t.setText(String.valueOf(this.f235657r[1]));
            C80550a.this.f235624d.f235611u.setText(String.valueOf(this.f235657r[2]));
            C80550a.this.f235624d.f235612v.setText(String.valueOf(this.f235657r[3]));
            C80550a.this.f235624d.f235613w.setText(String.valueOf(this.f235657r[4]));
            C80550a.this.f235624d.f235614x.setText(String.valueOf(this.f235658s[1]));
            C80550a.this.f235624d.f235615y.setText(String.valueOf(this.f235658s[2]));
            C80550a.this.f235624d.f235616z.setText(String.valueOf(this.f235658s[3]));
            C80550a.this.f235624d.f235596A.setText(String.valueOf(this.f235658s[4]));
        }
    }

    public C80550a(Context context, FloatFrameView floatFrameView) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f235626f = displayMetrics;
        this.f235624d = floatFrameView;
        int color = context.getResources().getColor(C0966R.color.a0z);
        this.f235628h = color;
        this.f235629i = context.getResources().getColor(C0966R.color.f356942a13);
        this.f235630j = context.getResources().getColor(C0966R.color.f356941a12);
        this.f235631k = context.getResources().getColor(C0966R.color.f356940a11);
        this.f235632l = context.getResources().getColor(C0966R.color.f356939a10);
        this.f235633m = color;
        ProcessUIResumedStateOwner.INSTANCE.observeForever(this.f235634n);
        floatFrameView.addOnAttachStateChangeListener(new C80552b());
        this.f235621a = (WindowManager) context.getApplicationContext().getSystemService("window");
        try {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            if (this.f235621a.getDefaultDisplay() != null) {
                this.f235621a.getDefaultDisplay().getMetrics(displayMetrics);
                this.f235621a.getDefaultDisplay().getMetrics(displayMetrics2);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f235622b = layoutParams;
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.flags = 40;
            layoutParams.gravity = 8388659;
            if (floatFrameView != null) {
                layoutParams.x = displayMetrics2.widthPixels - (floatFrameView.getLayoutParams().width * 2);
            }
            WindowManager.LayoutParams layoutParams2 = this.f235622b;
            layoutParams2.y = 0;
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            layoutParams2.format = -2;
        } catch (Exception unused) {
        }
        floatFrameView.setOnTouchListener(new C80553c(floatFrameView));
    }

    /* renamed from: e */
    public static void m98157e(C80550a aVar, boolean z) {
        Handler handler;
        aVar.getClass();
        C118672d.m167353c("Matrix.FrameDecorator", "[onForeground] isForeground:%s", Boolean.valueOf(z));
        if (aVar.f235627g && (handler = f235617o) != null) {
            handler.post(new C90452c(aVar, z));
        }
    }

    /* renamed from: f */
    public static C80550a m98158f(Context context) {
        if (f235618p == null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                f235618p = new C80550a(context, new FloatFrameView(context));
            } else {
                try {
                    Object obj = f235619q;
                    synchronized (obj) {
                        f235617o.post(new C80555d(context));
                        obj.wait();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        return f235618p;
    }

    /* renamed from: a */
    public void mo97648a(String str, long[] jArr, int[] iArr, int[] iArr2, float f, float f2, float f3) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        String format = String.format("unknown delay: %.1fms", new Object[]{Double.valueOf(((double) jArr[0]) / 1000000.0d)});
        String format2 = String.format("input handling: %.1fms", new Object[]{Double.valueOf(((double) jArr[1]) / 1000000.0d)});
        String format3 = String.format("animation: %.1fms", new Object[]{Double.valueOf(((double) jArr[2]) / 1000000.0d)});
        String format4 = String.format("layout measure: %.1fms", new Object[]{Double.valueOf(((double) jArr[3]) / 1000000.0d)});
        String format5 = String.format("draw: %.1fms", new Object[]{Double.valueOf(((double) jArr[4]) / 1000000.0d)});
        String format6 = String.format("sync: %.1fms", new Object[]{Double.valueOf(((double) jArr[5]) / 1000000.0d)});
        String format7 = String.format("command issue: %.1fms", new Object[]{Double.valueOf(((double) jArr[6]) / 1000000.0d)});
        String str2 = format;
        String format8 = String.format("swap buffers: %.1fms", new Object[]{Double.valueOf(((double) jArr[7]) / 1000000.0d)});
        String format9 = String.format("gpu: %.1fms", new Object[]{Double.valueOf(((double) jArr[9]) / 1000000.0d)});
        String str3 = format2;
        String format10 = String.format("total: %.1fms", new Object[]{Double.valueOf(((double) jArr[8]) / 1000000.0d)});
        if (f3 <= f2 - 42.0f) {
            this.f235633m = this.f235632l;
        } else if (f3 <= f2 - 24.0f) {
            this.f235633m = this.f235631k;
        } else if (f3 <= f2 - 9.0f) {
            this.f235633m = this.f235630j;
        } else if (f3 <= f2 - 3.0f) {
            this.f235633m = this.f235629i;
        } else {
            this.f235633m = this.f235628h;
        }
        int[] copyOf = Arrays.copyOf(iArr3, iArr3.length);
        int[] copyOf2 = Arrays.copyOf(iArr4, iArr4.length);
        String str4 = format3;
        String str5 = format4;
        String str6 = format5;
        String str7 = format6;
        String str8 = format7;
        Handler handler = f235617o;
        String str9 = format8;
        C80556e eVar = r0;
        String str10 = format9;
        Handler handler2 = handler;
        C80556e eVar2 = new C80556e(f3, str2, str3, str4, str5, str6, str7, str8, str9, str10, format10, copyOf2, copyOf);
        handler2.post(eVar);
    }

    /* renamed from: b */
    public boolean mo97649b() {
        return false;
    }

    /* renamed from: c */
    public int mo97650c() {
        return 0;
    }

    /* renamed from: d */
    public int mo97651d() {
        return 200;
    }

    public String getName() {
        return null;
    }
}
