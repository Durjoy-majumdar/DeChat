package p92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.C105922o;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d92.C107028a;
import f92.C107526d;
import gy3.C87412m;
import k92.C108975c;

/* renamed from: p92.i */
public final class C110208i implements C108975c {

    /* renamed from: d */
    public C110204d f329695d;

    /* renamed from: e */
    public C107028a f329696e;

    /* renamed from: p92.i$a */
    public static final class C110209a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110208i f329697d;

        /* renamed from: e */
        public final /* synthetic */ boolean f329698e;

        /* renamed from: f */
        public final /* synthetic */ boolean f329699f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorListenerAdapter f329700g;

        public C110209a(C110208i iVar, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f329697d = iVar;
            this.f329698e = z;
            this.f329699f = z2;
            this.f329700g = animatorListenerAdapter;
        }

        public final void run() {
            C110204d dVar = this.f329697d.f329695d;
            if (!(dVar != null)) {
                AnimatorListenerAdapter animatorListenerAdapter = this.f329700g;
                if (animatorListenerAdapter != null) {
                    animatorListenerAdapter.onAnimationCancel((Animator) null);
                }
            } else if (dVar != null) {
                boolean z = this.f329698e;
                boolean z2 = this.f329699f;
                AnimatorListenerAdapter animatorListenerAdapter2 = this.f329700g;
                if (dVar.f329685a != null) {
                    Log.m105924i("MicroMsg.FloatBallContainer", "hide MultiTaskFloatBallView, transAnim:" + z + ", alphaAnim:" + z2);
                    MultiTaskFloatBallView multiTaskFloatBallView = dVar.f329685a;
                    if (multiTaskFloatBallView != null) {
                        multiTaskFloatBallView.mo151062e(z, z2, animatorListenerAdapter2);
                    }
                } else if (animatorListenerAdapter2 != null) {
                    animatorListenerAdapter2.onAnimationCancel((Animator) null);
                }
            }
        }
    }

    /* renamed from: p92.i$b */
    public static final class C110210b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110208i f329701d;

        /* renamed from: e */
        public final /* synthetic */ MultiTaskInfo f329702e;

        /* renamed from: f */
        public final /* synthetic */ AnimatorListenerAdapter f329703f;

        public C110210b(C110208i iVar, MultiTaskInfo multiTaskInfo, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f329701d = iVar;
            this.f329702e = multiTaskInfo;
            this.f329703f = animatorListenerAdapter;
        }

        public final void run() {
            this.f329701d.mo161614e(this.f329702e, this.f329703f);
        }
    }

    /* renamed from: a */
    public boolean mo160093a() {
        MultiTaskFloatBallView multiTaskFloatBallView;
        C107526d dVar;
        C110204d dVar2 = this.f329695d;
        if (dVar2 == null || (multiTaskFloatBallView = dVar2.f329685a) == null || (dVar = multiTaskFloatBallView.f315141f) == null) {
            return false;
        }
        Animator animator = dVar.f321710b;
        if (!(animator != null ? animator.isRunning() : false)) {
            Animator animator2 = dVar.f321711c;
            return animator2 != null ? animator2.isRunning() : false;
        }
    }

    /* renamed from: b */
    public void mo151060b(MultiTaskInfo multiTaskInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105918d("MicroMsg.MultiTaskUIManager", "onFloatBallInfoChanged");
        if (C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            mo161614e(multiTaskInfo, animatorListenerAdapter);
        } else {
            MMHandlerThread.postToMainThread(new C110210b(this, multiTaskInfo, animatorListenerAdapter));
        }
    }

    /* renamed from: c */
    public void mo160094c(boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        MMHandlerThread.postToMainThread(new C110209a(this, z, z2, animatorListenerAdapter));
    }

    /* renamed from: d */
    public final void mo161613d() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C110204d dVar = new C110204d(context);
        this.f329695d = dVar;
        C107028a aVar = this.f329696e;
        ViewGroup b = aVar != null ? aVar.mo67905b() : null;
        MultiTaskFloatBallView multiTaskFloatBallView = dVar.f329685a;
        if (multiTaskFloatBallView != null) {
            multiTaskFloatBallView.setVisibility(8);
        }
        dVar.f329686b = b;
        if (b != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = 0 - C105922o.f315112b;
            int i = C105922o.f315121k;
            int i2 = C105922o.f315113c;
            marginLayoutParams.topMargin = i - i2;
            Log.m105924i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success, topMargin:" + marginLayoutParams.topMargin);
            int i3 = marginLayoutParams.topMargin;
            if (i3 > 0) {
                marginLayoutParams.topMargin = i3 - i2;
            }
            MultiTaskFloatBallView multiTaskFloatBallView2 = dVar.f329685a;
            if (multiTaskFloatBallView2 != null) {
                multiTaskFloatBallView2.setLayoutParams(marginLayoutParams);
            }
            try {
                b.addView(dVar.f329685a, b.getChildCount());
                Log.m105924i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallContainer", e, "attachFloatBallViewToWindow fail", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
        }
    }

    /* renamed from: e */
    public final void mo161614e(MultiTaskInfo multiTaskInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        if (multiTaskInfo != null) {
            try {
                if (!(this.f329695d != null)) {
                    Log.m105924i("MicroMsg.MultiTaskUIManager", "float ball did not create");
                    mo161613d();
                    mo161615f(multiTaskInfo, animatorListenerAdapter);
                    return;
                }
                Log.m105924i("MicroMsg.MultiTaskUIManager", "float ball already created");
                mo161615f(multiTaskInfo, animatorListenerAdapter);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MultiTaskUIManager", "doOnFloatBallInfoChanged exp:%s", e);
                if (animatorListenerAdapter != null) {
                    animatorListenerAdapter.onAnimationCancel((Animator) null);
                }
            }
        } else {
            Log.m105924i("MicroMsg.MultiTaskUIManager", "empty ball info list");
            MMHandlerThread.postToMainThread(new C110207h(this));
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel((Animator) null);
            }
        }
    }

    /* renamed from: f */
    public final void mo161615f(MultiTaskInfo multiTaskInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        C110204d dVar = this.f329695d;
        boolean z = true;
        if ((dVar != null) && dVar != null) {
            if (multiTaskInfo != null) {
                Object[] objArr = new Object[1];
                MultiTaskFloatBallView multiTaskFloatBallView = dVar.f329685a;
                objArr[0] = multiTaskFloatBallView != null ? Boolean.valueOf(multiTaskFloatBallView.f315153u) : null;
                Log.m105925i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", objArr);
                MultiTaskFloatBallView multiTaskFloatBallView2 = dVar.f329685a;
                if (multiTaskFloatBallView2 != null && !multiTaskFloatBallView2.f315153u) {
                    multiTaskFloatBallView2.getVisibility();
                    Log.m105924i("MicroMsg.FloatBallView", "show without animation");
                    multiTaskFloatBallView2.setVisibility(0);
                }
            } else {
                MultiTaskFloatBallView multiTaskFloatBallView3 = dVar.f329685a;
                if (multiTaskFloatBallView3 == null || multiTaskFloatBallView3.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                    MultiTaskFloatBallView multiTaskFloatBallView4 = dVar.f329685a;
                    if (multiTaskFloatBallView4 != null) {
                        multiTaskFloatBallView4.mo151062e(false, false, animatorListenerAdapter);
                    }
                }
            }
            MultiTaskFloatBallView multiTaskFloatBallView5 = dVar.f329685a;
            if (multiTaskFloatBallView5 != null) {
                multiTaskFloatBallView5.mo151060b(multiTaskInfo, animatorListenerAdapter);
            }
        }
    }
}
