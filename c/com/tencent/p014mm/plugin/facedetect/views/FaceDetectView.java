package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.C115426w;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import fj3.C75769d;
import gb1.C116929b;
import hb1.C117074a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kb1.C117403c;
import kb1.C117404d;
import kb1.C117405f;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectView */
public class FaceDetectView extends RelativeLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f346021w = 0;

    /* renamed from: d */
    public FaceDetectCameraView f346022d;

    /* renamed from: e */
    public FaceDetectDecorView f346023e;

    /* renamed from: f */
    public TextView f346024f;

    /* renamed from: g */
    public ViewGroup f346025g;

    /* renamed from: h */
    public ViewGroup f346026h;

    /* renamed from: i */
    public C117405f f346027i;

    /* renamed from: j */
    public C116929b f346028j;

    /* renamed from: n */
    public String f346029n;

    /* renamed from: o */
    public volatile boolean f346030o;

    /* renamed from: p */
    public boolean f346031p;

    /* renamed from: q */
    public boolean f346032q;

    /* renamed from: r */
    public long f346033r;

    /* renamed from: s */
    public long f346034s;

    /* renamed from: t */
    public long f346035t;

    /* renamed from: u */
    public Animation f346036u;

    /* renamed from: v */
    public View f346037v;

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectView$a */
    public class C105237a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f312654d;

        /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectView$a$a */
        public class C105238a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f312656d;

            public C105238a(Bitmap bitmap) {
                this.f312656d = bitmap;
            }

            public void run() {
                View view = FaceDetectView.this.f346037v;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                FaceDetectView.this.f346037v.setBackgroundDrawable(new BitmapDrawable(this.f312656d));
            }
        }

        public C105237a(String str) {
            this.f312654d = str;
        }

        public void run() {
            MMHandlerThread.postToMainThread(new C105238a(C85191v.m105072k(this.f312654d)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectView$b */
    public class C115437b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C115426w f346038d;

        public C115437b(C115426w wVar) {
            this.f346038d = wVar;
        }

        public void run() {
            int i;
            FaceProNative.FaceResult l;
            FaceDetectView.this.f346022d.mo149604F();
            if (this.f346038d != null) {
                synchronized (FaceDetectView.this.f346022d) {
                    C105227i.f312610f.removeCallbacksAndMessages((Object) null);
                    C105227i iVar = C105227i.INSTANCE;
                    FaceProNative faceProNative = iVar.f312612d.f345985i.f345972a;
                    if (faceProNative == null) {
                        Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
                        i = -3;
                    } else {
                        i = faceProNative.engineReleaseCurrMotion();
                    }
                    l = iVar.f312612d.mo175314l();
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(i);
                    objArr[1] = Integer.valueOf(l != null ? l.result : -10000);
                    Log.m105925i("MicroMsg.FaceDetectCameraView", "hy: motionResult: %d, finalResult: %d", objArr);
                }
                ((C117074a) this.f346038d).mo181031a(l);
            }
        }
    }

    public FaceDetectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m162270a(FaceDetectView faceDetectView, C116929b.C116930a aVar) {
        faceDetectView.getClass();
        if (aVar == null) {
            Log.m105920e("MicroMsg.FaceDetectView", "hy: motion eat but no data");
            return;
        }
        boolean z = false;
        int i = aVar.f350377a;
        if (i > 0) {
            C117405f fVar = faceDetectView.f346027i;
            if (fVar != null) {
                FaceDetectUI faceDetectUI = (FaceDetectUI) fVar;
                if (i == 1) {
                    faceDetectUI.f346002r.mo175344a((Animation.AnimationListener) null);
                }
            }
            z = true;
        }
        if (!z) {
            String str = aVar.f350379c;
            if (str == null) {
                str = faceDetectView.getContext().getString(C0966R.string.ci8);
            }
            faceDetectView.mo175331f(str);
            C117405f fVar2 = faceDetectView.f346027i;
            if (fVar2 != null) {
                int i2 = aVar.f350378b;
                String str2 = aVar.f350379c;
                if (str2 == null) {
                    str2 = faceDetectView.getContext().getString(C0966R.string.ci8);
                }
                ((FaceDetectUI) fVar2).mo175317J7(i2, str2);
            }
        }
    }

    /* renamed from: b */
    public static void m162271b(FaceDetectView faceDetectView) {
        C116929b bVar = faceDetectView.f346028j;
        if (bVar != null && bVar.mo180907d()) {
            Log.m105924i("MicroMsg.FaceDetectView", "hy: meet require");
            faceDetectView.f346022d.mo149604F();
            faceDetectView.f346031p = true;
            long ticksToNow = Util.ticksToNow(faceDetectView.f346034s);
            Log.m105925i("MicroMsg.FaceDetectView", "hy: current motion used time: %d", Long.valueOf(ticksToNow));
            long j = faceDetectView.f346033r;
            if (ticksToNow < j - 5) {
                MMHandlerThread.postToMainThreadDelayed(new C117404d(faceDetectView), j - ticksToNow);
            } else if (faceDetectView.f346027i != null && !faceDetectView.f346030o) {
                ((FaceDetectUI) faceDetectView.f346027i).mo175317J7(0, "");
            }
        }
    }

    /* renamed from: c */
    public static boolean m162272c(FaceDetectView faceDetectView) {
        faceDetectView.getClass();
        long currentTicks = Util.currentTicks();
        long j = currentTicks - faceDetectView.f346035t;
        Log.m105919d("MicroMsg.FaceDetectView", "hy: tick between: %d, threshold: %d", Long.valueOf(j), 1500);
        if (j <= 1500) {
            return false;
        }
        faceDetectView.f346035t = currentTicks;
        return true;
    }

    /* renamed from: d */
    public final void mo175329d() {
        this.f346024f.setText("");
        this.f346024f.setVisibility(4);
    }

    /* renamed from: e */
    public void mo175330e(boolean z, String str) {
        if (z) {
            ThreadPool.post(new C105237a(str), "face_detect_set_backgroud");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(500);
        alphaAnimation.setFillAfter(true);
        this.f346037v.startAnimation(alphaAnimation);
    }

    /* renamed from: f */
    public final void mo175331f(String str) {
        if (Util.nullAsNil(str).equals(this.f346024f.getText().toString())) {
            Log.m105926v("MicroMsg.FaceDetectView", "hy: same error. ignore");
            return;
        }
        this.f346024f.setText(str);
        this.f346024f.setVisibility(0);
        this.f346024f.setAnimation(this.f346036u);
    }

    /* renamed from: g */
    public void mo175332g(boolean z, C115426w wVar) {
        C116929b bVar = this.f346028j;
        if (bVar != null) {
            bVar.mo180912i();
        }
        if (!this.f346030o) {
            this.f346030o = true;
            if (!z) {
                FaceDetectCameraView faceDetectCameraView = this.f346022d;
                if (faceDetectCameraView != null) {
                    faceDetectCameraView.mo149604F();
                    C105227i.INSTANCE.f312612d.f345985i.mo175307a();
                }
            } else if (this.f346022d != null) {
                C105227i.f312610f.postToWorker(new C115437b(wVar));
            }
            Log.m105924i("MicroMsg.FaceDetectView", "hy: stopped capture face");
            mo175329d();
            return;
        }
        Log.m105928w("MicroMsg.FaceDetectView", "hy: already end");
    }

    public int getCameraBestHeight() {
        return this.f346022d.getEncodeVideoBestSize().y;
    }

    public int getCameraBestWidth() {
        return this.f346022d.getEncodeVideoBestSize().x;
    }

    public int getCameraPreivewWidth() {
        return this.f346022d.getPreviewWidth();
    }

    public int getCameraPreviewHeight() {
        return this.f346022d.getPreviewHeight();
    }

    public int getCameraRotation() {
        return this.f346022d.getCameraRotation();
    }

    public C116929b.C116931b getCurrentMotionCancelInfo() {
        C116929b bVar = this.f346028j;
        return bVar != null ? bVar.mo180908e() : new C116929b.C116931b(90004, "user cancelled in processing");
    }

    public Bitmap getPreviewBm() {
        return this.f346022d.getPreviewBm();
    }

    public void setBusinessTip(String str) {
        this.f346029n = str;
    }

    public void setCallback(C117405f fVar) {
        this.f346027i = fVar;
    }

    public void setErrTextView(TextView textView) {
        this.f346024f = textView;
    }

    public FaceDetectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Animation animation = null;
        this.f346022d = null;
        this.f346023e = null;
        this.f346024f = null;
        this.f346025g = null;
        this.f346026h = null;
        this.f346027i = null;
        this.f346030o = false;
        this.f346031p = false;
        MMApplicationContext.getContext().getString(C0966R.string.jl4);
        this.f346032q = true;
        this.f346033r = -1;
        this.f346034s = -1;
        this.f346035t = -1;
        this.f346037v = null;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c5e, (ViewGroup) null, false);
        addView(inflate);
        this.f346022d = (FaceDetectCameraView) inflate.findViewById(C0966R.C0970id.apr);
        this.f346023e = (FaceDetectDecorView) inflate.findViewById(C0966R.C0970id.evs);
        this.f346037v = inflate.findViewById(C0966R.C0970id.eor);
        this.f346022d.setCallback(new C117403c(this));
        Context context2 = getContext();
        if (context2 == null) {
            Log.m105920e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
        } else {
            animation = AnimationUtils.loadAnimation(context2, C0966R.C0968anim.f2340a5);
            animation.setInterpolator(new C75769d());
        }
        this.f346036u = animation;
    }
}
