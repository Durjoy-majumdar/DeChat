package qj1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.z */
public final class C63150z implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C63064w f179191d;

    public C63150z(C63064w wVar) {
        this.f179191d = wVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f179191d.f178973w = null;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("FinderLiveAdVideoTimerPlugin", "startAnimateProgress onAnimationEnd:" + this.f179191d.f178970t.getProgress());
        C63064w wVar = this.f179191d;
        wVar.getClass();
        Log.m105924i("FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress");
        View view = wVar.f178969s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (wVar.f178968r.getVisibility() == 8) {
            wVar.mo10792g(8);
        }
        this.f179191d.f178973w = null;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
