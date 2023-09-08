package vl2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: vl2.v */
public final class C22772v {

    /* renamed from: a */
    public View f65497a;

    /* renamed from: b */
    public long f65498b;

    /* renamed from: c */
    public C22773a f65499c;

    /* renamed from: d */
    public C34379c<?> f65500d;

    /* renamed from: e */
    public boolean f65501e;

    /* renamed from: vl2.v$a */
    public interface C22773a {
        /* renamed from: a */
        void mo35766a(boolean z);

        /* renamed from: b */
        void mo35767b(boolean z);

        /* renamed from: c */
        void mo35768c();

        /* renamed from: d */
        void mo35769d(boolean z);
    }

    /* renamed from: vl2.v$b */
    public static final class C22774b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f65502d;

        /* renamed from: e */
        public final /* synthetic */ C22772v f65503e;

        public C22774b(boolean z, C22772v vVar) {
            this.f65502d = z;
            this.f65503e = vVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Log.m105919d("MicroMsg.ScanViewAnimationTask", "alvinluo onShowAnimationEnd show: %b", Boolean.valueOf(this.f65502d));
            C22773a aVar = this.f65503e.f65499c;
            if (aVar != null) {
                aVar.mo35767b(this.f65502d);
            }
            if (this.f65502d) {
                this.f65503e.mo35870d();
                return;
            }
            C22773a aVar2 = this.f65503e.f65499c;
            if (aVar2 != null) {
                aVar2.mo35768c();
            }
        }
    }

    /* renamed from: vl2.v$c */
    public static final class C22775c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C22772v f65504d;

        public C22775c(C22772v vVar) {
            this.f65504d = vVar;
        }

        public final void run() {
            C22772v vVar = this.f65504d;
            if (!vVar.f65501e) {
                vVar.mo35869c(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo35867a() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        Log.m105918d("MicroMsg.ScanViewAnimationTask", "alvinluo cancelTaskTimer");
        this.f65501e = true;
        C34379c<?> cVar = this.f65500d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        View view = this.f65497a;
        if (view != null && (animate = view.animate()) != null && (listener = animate.setListener((Animator.AnimatorListener) null)) != null && (updateListener = listener.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null)) != null) {
            updateListener.cancel();
        }
    }

    /* renamed from: b */
    public final void mo35868b(boolean z) {
        Log.m105919d("MicroMsg.ScanViewAnimationTask", "alvinluo startAnimationTask view: %s, withShowAnimation: %b", this.f65497a, Boolean.valueOf(z));
        C22773a aVar = this.f65499c;
        if (aVar != null) {
            aVar.mo35766a(z);
        }
        if (z) {
            mo35869c(true);
            return;
        }
        View view = this.f65497a;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(1.0f));
            View view3 = view;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startAnimationTask", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        mo35870d();
    }

    /* renamed from: c */
    public final void mo35869c(boolean z) {
        Log.m105927v("MicroMsg.ScanViewAnimationTask", "alvinluo startShowAnimation show: %b", Boolean.valueOf(z));
        View view = this.f65497a;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/util/ScanViewShowAnimationTask", "startShowAnimation", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C22773a aVar2 = this.f65499c;
        if (aVar2 != null) {
            aVar2.mo35769d(z);
        }
        View view3 = this.f65497a;
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        C111557w.m152065a(view3, f2, f, 200, new C22774b(z, this));
    }

    /* renamed from: d */
    public final void mo35870d() {
        Log.m105918d("MicroMsg.ScanViewAnimationTask", "alvinluo startTaskTimer");
        Log.m105918d("MicroMsg.ScanViewAnimationTask", "alvinluo cancelTaskTimer");
        this.f65501e = true;
        C34379c<?> cVar = this.f65500d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        C22775c cVar2 = new C22775c(this);
        long j = this.f65498b;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f65500d = jVar.mo183892w(cVar2, j, false);
        this.f65501e = false;
    }
}
