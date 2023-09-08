package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import j72.C108607f;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton */
public class MMSightRecordButton extends FrameLayout {

    /* renamed from: N */
    public static final int f313772N = ViewConfiguration.getTapTimeout();

    /* renamed from: P */
    public static final float f313773P = (((float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.agd)) / ((float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.agc)));

    /* renamed from: A */
    public C105503j f313774A;

    /* renamed from: B */
    public C105501h f313775B;

    /* renamed from: C */
    public Drawable f313776C;

    /* renamed from: D */
    public Drawable f313777D;

    /* renamed from: E */
    public float f313778E = -1.0f;

    /* renamed from: F */
    public boolean f313779F = true;

    /* renamed from: G */
    public boolean f313780G = false;

    /* renamed from: H */
    public boolean f313781H = false;

    /* renamed from: I */
    public boolean f313782I = false;

    /* renamed from: J */
    public boolean f313783J = false;

    /* renamed from: K */
    public MMHandler f313784K = new MMHandler(Looper.getMainLooper());

    /* renamed from: L */
    public Runnable f313785L = new C105498e();

    /* renamed from: M */
    public Runnable f313786M = new C105499f();

    /* renamed from: d */
    public long f313787d = -1;

    /* renamed from: e */
    public View f313788e;

    /* renamed from: f */
    public View f313789f;

    /* renamed from: g */
    public View f313790g;

    /* renamed from: h */
    public MMSightCircularProgressBar f313791h;

    /* renamed from: i */
    public boolean f313792i = false;

    /* renamed from: j */
    public boolean f313793j = false;

    /* renamed from: n */
    public boolean f313794n = false;

    /* renamed from: o */
    public boolean f313795o = false;

    /* renamed from: p */
    public ViewPropertyAnimator f313796p;

    /* renamed from: q */
    public ViewPropertyAnimator f313797q;

    /* renamed from: r */
    public ValueAnimator f313798r;

    /* renamed from: s */
    public ValueAnimator f313799s;

    /* renamed from: t */
    public ViewPropertyAnimator f313800t;

    /* renamed from: u */
    public boolean f313801u = false;

    /* renamed from: v */
    public int f313802v;

    /* renamed from: w */
    public int f313803w = -1;

    /* renamed from: x */
    public int f313804x = -2130706433;

    /* renamed from: y */
    public C105504k f313805y;

    /* renamed from: z */
    public C105502i f313806z;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$a */
    public class C105493a implements MMSightCircularProgressBar.C105492a {

        /* renamed from: a */
        public final /* synthetic */ MMSightCircularProgressBar.C105492a f313807a;

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$a$a */
        public class C105494a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ boolean f313809d;

            public C105494a(boolean z) {
                this.f313809d = z;
            }

            public void onAnimationEnd(Animator animator) {
                Log.printInfoStack("MicroMsg.MMSightRecordButton", "call onProgressFinish", new Object[0]);
                C105493a aVar = C105493a.this;
                MMSightRecordButton.this.f313792i = false;
                MMSightCircularProgressBar.C105492a aVar2 = aVar.f313807a;
                if (aVar2 != null) {
                    aVar2.mo128042a(this.f313809d);
                }
            }
        }

        public C105493a(MMSightCircularProgressBar.C105492a aVar) {
            this.f313807a = aVar;
        }

        /* renamed from: a */
        public void mo128042a(boolean z) {
            Log.printInfoStack("MicroMsg.MMSightRecordButton", "outer, onProgressFinish", new Object[0]);
            MMSightRecordButton.this.mo150314c();
            MMSightRecordButton.this.mo150318g(new C105494a(z));
        }

        /* renamed from: b */
        public void mo128043b(ArrayList<Float> arrayList) {
            MMSightCircularProgressBar.C105492a aVar = this.f313807a;
            if (aVar != null) {
                aVar.mo128043b(arrayList);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$b */
    public class C105495b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ AnimatorListenerAdapter f313811d;

        public C105495b(AnimatorListenerAdapter animatorListenerAdapter) {
            this.f313811d = animatorListenerAdapter;
        }

        public void onAnimationEnd(Animator animator) {
            MMSightRecordButton.this.f313795o = false;
            AnimatorListenerAdapter animatorListenerAdapter = this.f313811d;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            MMSightRecordButton.this.f313795o = true;
            AnimatorListenerAdapter animatorListenerAdapter = this.f313811d;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$c */
    public class C105496c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ AnimatorListenerAdapter f313813d;

        public C105496c(AnimatorListenerAdapter animatorListenerAdapter) {
            this.f313813d = animatorListenerAdapter;
        }

        public void onAnimationEnd(Animator animator) {
            MMSightRecordButton.this.f313795o = false;
            AnimatorListenerAdapter animatorListenerAdapter = this.f313813d;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            MMSightRecordButton.this.f313795o = true;
            AnimatorListenerAdapter animatorListenerAdapter = this.f313813d;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$d */
    public class C105497d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f313815d;

        public C105497d(int i) {
            this.f313815d = i;
        }

        public void run() {
            MMSightRecordButton.super.setVisibility(this.f313815d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$e */
    public class C105498e implements Runnable {
        public C105498e() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", Boolean.valueOf(MMSightRecordButton.this.f313793j), Boolean.valueOf(MMSightRecordButton.this.f313794n));
            MMSightRecordButton mMSightRecordButton = MMSightRecordButton.this;
            if (!mMSightRecordButton.f313793j) {
                mMSightRecordButton.f313794n = true;
                C105502i iVar = mMSightRecordButton.f313806z;
                if (iVar != null) {
                    iVar.mo128039a();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$f */
    public class C105499f implements Runnable {
        public C105499f() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", Boolean.valueOf(MMSightRecordButton.this.f313801u));
            MMSightRecordButton mMSightRecordButton = MMSightRecordButton.this;
            if (mMSightRecordButton.f313801u) {
                mMSightRecordButton.mo150322j((AnimatorListenerAdapter) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$g */
    public class C105500g extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ long f313819d;

        public C105500g(long j) {
            this.f313819d = j;
        }

        public void onAnimationEnd(Animator animator) {
            MMSightRecordButton mMSightRecordButton = MMSightRecordButton.this;
            if (mMSightRecordButton.f313787d > 0 && this.f313819d <= 500 && !mMSightRecordButton.f313794n) {
                Log.m105925i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", Boolean.valueOf(mMSightRecordButton.f313793j), Boolean.valueOf(MMSightRecordButton.this.f313794n));
                MMSightRecordButton mMSightRecordButton2 = MMSightRecordButton.this;
                mMSightRecordButton2.f313793j = true;
                if (!mMSightRecordButton2.f313794n) {
                    MMSightRecordButton.m141688a(mMSightRecordButton2);
                    C105504k kVar = MMSightRecordButton.this.f313805y;
                    if (kVar != null) {
                        kVar.mo128045a();
                    }
                }
            } else if (mMSightRecordButton.f313794n) {
                Log.m105925i("MicroMsg.MMSightRecordButton", "on Long Press finish ，isRecordIng:%b", Boolean.valueOf(mMSightRecordButton.f313792i));
                MMSightRecordButton mMSightRecordButton3 = MMSightRecordButton.this;
                if (mMSightRecordButton3.f313792i) {
                    mMSightRecordButton3.f313792i = false;
                }
                C105502i iVar = mMSightRecordButton3.f313806z;
                if (iVar != null) {
                    iVar.mo128041c();
                }
            } else {
                Log.m105924i("MicroMsg.MMSightRecordButton", "error action up");
                MMSightRecordButton mMSightRecordButton4 = MMSightRecordButton.this;
                if (mMSightRecordButton4.f313792i) {
                    MMSightRecordButton.m141688a(mMSightRecordButton4);
                }
                C105501h hVar = MMSightRecordButton.this.f313775B;
                if (hVar != null) {
                    C105582u0 u0Var = (C105582u0) hVar;
                    u0Var.getClass();
                    Log.m105925i("MicroMsg.TestCaptureUiEvent", "onErrorUp: %s", Util.getStack().toString());
                    C108607f fVar = u0Var.f314030a.f313871j;
                    if (fVar != null) {
                        fVar.cancel();
                        SightCaptureUI sightCaptureUI = u0Var.f314030a;
                        if (sightCaptureUI.f313860d == 0) {
                            SightCaptureUI.m141707H7(sightCaptureUI);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$h */
    public interface C105501h {
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$i */
    public interface C105502i {
        /* renamed from: a */
        void mo128039a();

        /* renamed from: b */
        void mo128040b();

        /* renamed from: c */
        void mo128041c();
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$j */
    public interface C105503j {
        /* renamed from: a */
        void mo128046a(int i);

        /* renamed from: b */
        void mo128047b(int i);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$k */
    public interface C105504k {
        /* renamed from: a */
        void mo128045a();
    }

    public MMSightRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150316e();
    }

    /* renamed from: a */
    public static void m141688a(MMSightRecordButton mMSightRecordButton) {
        if (!mMSightRecordButton.f313782I && !mMSightRecordButton.f313783J) {
            return;
        }
        if (!mMSightRecordButton.f313792i) {
            mMSightRecordButton.f313792i = true;
            mMSightRecordButton.mo150322j((AnimatorListenerAdapter) null);
            mMSightRecordButton.f313794n = true;
            C105502i iVar = mMSightRecordButton.f313806z;
            if (iVar != null) {
                iVar.mo128039a();
                return;
            }
            return;
        }
        mMSightRecordButton.f313792i = false;
        mMSightRecordButton.f313806z.mo128041c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r1 <= r2.get(r2.size() - 1).floatValue()) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r0.f313770y.size() == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0.f313770y.add(java.lang.Float.valueOf(r0.f313762q));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150314c() {
        /*
            r4 = this;
            boolean r0 = r4.f313782I
            if (r0 == 0) goto L_0x0052
            com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar r0 = r4.f313791h
            com.tencent.mm.plugin.mmsight.ui.d0 r1 = r0.f313768w
            if (r1 == 0) goto L_0x0014
            r2 = 0
            r1.f313916h = r2
            r2 = 0
            r1.f313913e = r2
            r1 = 0
            r0.f313768w = r1
        L_0x0014:
            float r1 = r0.f313762q
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            java.util.ArrayList<java.lang.Float> r1 = r0.f313770y
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x003b
            float r1 = r0.f313762q
            java.util.ArrayList<java.lang.Float> r2 = r0.f313770y
            int r3 = r2.size()
            int r3 = r3 + -1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0043
        L_0x003b:
            java.util.ArrayList<java.lang.Float> r1 = r0.f313770y
            int r1 = r1.size()
            if (r1 != 0) goto L_0x004e
        L_0x0043:
            java.util.ArrayList<java.lang.Float> r1 = r0.f313770y
            float r2 = r0.f313762q
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
        L_0x004e:
            r0.invalidate()
            goto L_0x005e
        L_0x0052:
            com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar r0 = r4.f313791h
            r0.mo150303a()
            com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar r0 = r4.f313791h
            r1 = 8
            r0.setVisibility(r1)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton.mo150314c():void");
    }

    /* renamed from: d */
    public void mo150315d() {
        Log.m105924i("MicroMsg.MMSightRecordButton", "hideProgressBar");
        View view = this.f313790g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public final void mo150316e() {
        Log.m105925i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, Integer.valueOf(f313772N));
        this.f313776C = getContext().getResources().getDrawable(C0966R.C0969drawable.f357283ah2);
        this.f313777D = getContext().getResources().getDrawable(C0966R.C0969drawable.f357284ah3);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bfz, this, true);
        this.f313788e = findViewById(C0966R.C0970id.f7_);
        this.f313789f = findViewById(C0966R.C0970id.hpy);
        this.f313790g = findViewById(C0966R.C0970id.i7m);
        this.f313791h = (MMSightCircularProgressBar) findViewById(C0966R.C0970id.bd6);
        this.f313788e.setBackgroundDrawable(this.f313776C);
        this.f313789f.setBackgroundDrawable(this.f313777D);
        this.f313779F = true;
    }

    /* renamed from: f */
    public void mo150317f() {
        setClipChildren(false);
        this.f313779F = true;
        this.f313788e.setScaleX(1.0f);
        this.f313788e.setScaleY(1.0f);
        this.f313789f.setScaleX(1.0f);
        this.f313789f.setScaleY(1.0f);
        View view = this.f313790g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo150314c();
        this.f313791h.mo150303a();
    }

    /* renamed from: g */
    public final void mo150318g(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f313795o = true;
        ViewPropertyAnimator viewPropertyAnimator = this.f313800t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f313800t = null;
        }
        ViewPropertyAnimator scaleY = this.f313788e.animate().scaleX(1.0f).scaleY(1.0f);
        this.f313800t = scaleY;
        scaleY.setListener(new C105496c(animatorListenerAdapter)).setDuration(150).start();
        this.f313789f.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start();
        ValueAnimator valueAnimator = this.f313799s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f313776C, "color", new int[]{this.f313804x, this.f313803w});
        this.f313799s = ofInt;
        ofInt.setDuration(150);
        ValueAnimator valueAnimator2 = this.f313799s;
        ArgbEvaluator argbEvaluator = C85290b.f248465a;
        valueAnimator2.setEvaluator(argbEvaluator);
        this.f313799s.start();
        if (this.f313802v != 0) {
            ValueAnimator valueAnimator3 = this.f313798r;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.f313777D, "color", new int[]{0, this.f313802v});
            this.f313798r = ofInt2;
            ofInt2.setDuration(150);
            this.f313798r.setEvaluator(argbEvaluator);
            this.f313798r.start();
        }
    }

    public List<Float> getSubProgress() {
        return this.f313791h.getSubProgress();
    }

    /* renamed from: h */
    public void mo150320h() {
        Log.m105924i("MicroMsg.MMSightRecordButton", "showLoading");
        View view = this.f313790g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public void mo150321i(int i, int i2, int i3, int i4, MMSightCircularProgressBar.C105492a aVar) {
        Log.printInfoStack("MicroMsg.MMSightRecordButton", "startProgress, initProgress: %s, maxProgress: %s, duration: %s, callback: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar);
        this.f313792i = true;
        this.f313791h.setInitProgress(i);
        this.f313791h.setMaxProgress(i2);
        this.f313791h.setDuration(i3);
        if (!this.f313782I) {
            this.f313791h.setVisibility(0);
        }
        this.f313791h.setCircularColor(i4);
        this.f313791h.setProgressCallback(new C105493a(aVar));
        MMSightCircularProgressBar mMSightCircularProgressBar = this.f313791h;
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "start, initProgress: %s, maxProgress: %s, duration: %s currentProgress:%s", Integer.valueOf(mMSightCircularProgressBar.f313763r), Integer.valueOf(mMSightCircularProgressBar.f313764s), Integer.valueOf(mMSightCircularProgressBar.f313765t), Float.valueOf(mMSightCircularProgressBar.f313762q));
        mMSightCircularProgressBar.f313766u = true;
        C105522d0 d0Var = mMSightCircularProgressBar.f313768w;
        if (d0Var != null) {
            d0Var.f313916h = false;
            d0Var.f313913e = 0;
            mMSightCircularProgressBar.f313768w = null;
        }
        C105522d0 d0Var2 = new C105522d0(mMSightCircularProgressBar.f313762q, (float) mMSightCircularProgressBar.f313764s, mMSightCircularProgressBar.f313765t);
        mMSightCircularProgressBar.f313768w = d0Var2;
        C105546n nVar = new C105546n(mMSightCircularProgressBar);
        Log.m105925i("MicroMsg.ProgressHandlerAnimator", "setAnimationCallback: %s", nVar);
        d0Var2.f313917i = nVar;
        C105522d0 d0Var3 = mMSightCircularProgressBar.f313768w;
        d0Var3.getClass();
        Log.m105924i("MicroMsg.ProgressHandlerAnimator", "Start");
        d0Var3.f313916h = true;
        d0Var3.f313913e = Util.currentTicks();
        d0Var3.f313909a.startTimer(20);
    }

    /* renamed from: j */
    public final void mo150322j(AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105918d("MicroMsg.MMSightRecordButton", "startTransition");
        this.f313795o = true;
        ViewPropertyAnimator viewPropertyAnimator = this.f313796p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f313796p = null;
        }
        ViewPropertyAnimator scaleY = this.f313788e.animate().scaleX(0.5f).scaleY(0.5f);
        this.f313796p = scaleY;
        scaleY.setListener(new C105495b(animatorListenerAdapter)).setDuration(150).start();
        ViewPropertyAnimator viewPropertyAnimator2 = this.f313797q;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            this.f313797q = null;
        }
        ViewPropertyAnimator animate = this.f313789f.animate();
        float f = f313773P;
        ViewPropertyAnimator scaleY2 = animate.scaleX(f).scaleY(f);
        this.f313797q = scaleY2;
        scaleY2.setDuration(150).start();
        if (this.f313802v != 0) {
            ValueAnimator valueAnimator = this.f313798r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f313777D, "color", new int[]{this.f313802v, 0});
            this.f313798r = ofInt;
            ofInt.setDuration(150);
            this.f313798r.setEvaluator(C85290b.f248465a);
            this.f313798r.start();
        }
        ValueAnimator valueAnimator2 = this.f313799s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.f313776C, "color", new int[]{this.f313803w, this.f313804x});
        this.f313799s = ofInt2;
        ofInt2.setDuration(150);
        this.f313799s.setEvaluator(C85290b.f248465a);
        this.f313799s.start();
    }

    /* renamed from: k */
    public void mo150323k() {
        if (this.f313792i && !this.f313801u) {
            MotionEvent obtain = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            onTouchEvent(obtain);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 != 3) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f313779F
            java.lang.String r1 = "MicroMsg.MMSightRecordButton"
            r2 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r11 = "onTouchEvent, not enable, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r2
        L_0x000d:
            int r0 = r11.getAction()
            r3 = 1
            if (r0 == 0) goto L_0x0118
            r4 = 3
            r5 = 2
            if (r0 == r3) goto L_0x00b9
            if (r0 == r5) goto L_0x001e
            if (r0 == r4) goto L_0x00b9
            goto L_0x0162
        L_0x001e:
            float r0 = r11.getRawY()
            int[] r6 = new int[r5]
            r10.getLocationInWindow(r6)
            r6 = r6[r3]
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0162
            boolean r6 = r10.f313794n
            if (r6 != 0) goto L_0x0036
            boolean r6 = r10.f313782I
            if (r6 != 0) goto L_0x0162
        L_0x0036:
            float r6 = r10.f313778E
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0045
            float r11 = r11.getRawY()
            r10.f313778E = r11
            goto L_0x0162
        L_0x0045:
            float r11 = r0 - r6
            float r11 = java.lang.Math.abs(r11)
            float r6 = r10.f313778E
            r7 = 1092616192(0x41200000, float:10.0)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0084
            int r8 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0084
            float r11 = r11 / r7
            int r11 = (int) r11
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5[r2] = r6
            boolean r6 = r10.f313780G
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "onScroll Up, factor: %s, isFirstScrollUp: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r5)
            int r11 = java.lang.Math.min(r11, r4)
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$j r1 = r10.f313774A
            if (r1 == 0) goto L_0x007e
            boolean r4 = r10.f313780G
            if (r4 == 0) goto L_0x007b
            r11 = 1
        L_0x007b:
            r1.mo128046a(r11)
        L_0x007e:
            r10.f313778E = r0
            r10.f313780G = r2
            goto L_0x0162
        L_0x0084:
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0162
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0162
            float r11 = r11 / r7
            int r11 = (int) r11
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5[r2] = r6
            boolean r6 = r10.f313781H
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "onScroll Down, factor: %s, isFirstScrollDown: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r5)
            int r11 = java.lang.Math.min(r11, r4)
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$j r1 = r10.f313774A
            if (r1 == 0) goto L_0x00b3
            boolean r4 = r10.f313781H
            if (r4 == 0) goto L_0x00b0
            r11 = 1
        L_0x00b0:
            r1.mo128047b(r11)
        L_0x00b3:
            r10.f313781H = r2
            r10.f313778E = r0
            goto L_0x0162
        L_0x00b9:
            r10.f313801u = r2
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f313784K
            java.lang.Runnable r0 = r10.f313786M
            int r6 = f313772N
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.removeCallbacks(r0, r6)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f313784K
            java.lang.Runnable r0 = r10.f313785L
            r11.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r11 = r10.f313796p
            if (r11 == 0) goto L_0x00df
            android.view.ViewPropertyAnimator r0 = r10.f313797q
            if (r0 == 0) goto L_0x00df
            r11.cancel()
            android.view.ViewPropertyAnimator r11 = r10.f313797q
            r11.cancel()
        L_0x00df:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f313787d
            long r6 = r6 - r8
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            boolean r0 = r10.f313794n
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11[r2] = r0
            boolean r0 = r10.f313793j
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11[r3] = r0
            long r8 = r10.f313787d
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r11[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r11[r4] = r0
            java.lang.String r0 = "onAction Up/Cancel, isDispatchLongPress: %s, isDispatchSimpleTap: %s, pressDownTime: %s, upTimeDiff: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)
            r10.mo150314c()
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$g r11 = new com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$g
            r11.<init>(r6)
            r10.mo150318g(r11)
            goto L_0x0162
        L_0x0118:
            boolean r0 = r10.f313792i
            if (r0 == 0) goto L_0x0125
            boolean r0 = r10.f313782I
            if (r0 != 0) goto L_0x0125
            boolean r0 = r10.f313783J
            if (r0 != 0) goto L_0x0125
            return r2
        L_0x0125:
            r10.f313801u = r3
            long r0 = java.lang.System.currentTimeMillis()
            r10.f313787d = r0
            r10.f313793j = r2
            r10.f313794n = r2
            float r11 = r11.getRawY()
            r10.f313778E = r11
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton$i r11 = r10.f313806z
            if (r11 == 0) goto L_0x0142
            boolean r0 = r10.f313792i
            if (r0 != 0) goto L_0x0142
            r11.mo128040b()
        L_0x0142:
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f313784K
            r0 = 0
            r11.removeCallbacksAndMessages(r0)
            boolean r11 = r10.f313792i
            if (r11 != 0) goto L_0x015e
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f313784K
            java.lang.Runnable r0 = r10.f313785L
            r1 = 550(0x226, double:2.717E-321)
            r11.postDelayed(r0, r1)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f313784K
            java.lang.Runnable r0 = r10.f313786M
            r1 = 250(0xfa, double:1.235E-321)
            r11.postDelayed(r0, r1)
        L_0x015e:
            r10.f313781H = r3
            r10.f313780G = r3
        L_0x0162:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setErrorPressCallback(C105501h hVar) {
        this.f313775B = hVar;
    }

    public void setHighLightOuter(int i) {
        this.f313802v = i;
        Drawable drawable = this.f313777D;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
    }

    public void setInnerColor(int i) {
        Drawable drawable = this.f313776C;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
    }

    public void setLongPressCallback(C105502i iVar) {
        this.f313806z = iVar;
    }

    public void setLongPressScrollCallback(C105503j jVar) {
        this.f313774A = jVar;
    }

    public void setSimpleTapCallback(C105504k kVar) {
        this.f313805y = kVar;
    }

    public void setTouchEnable(boolean z) {
        Log.m105925i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", Boolean.valueOf(z));
        this.f313779F = z;
    }

    public void setVisibility(int i) {
        Log.m105925i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", Boolean.valueOf(this.f313795o));
        if (this.f313795o) {
            postDelayed(new C105497d(i), 150);
        } else {
            super.setVisibility(i);
        }
    }

    public MMSightRecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo150316e();
    }
}
