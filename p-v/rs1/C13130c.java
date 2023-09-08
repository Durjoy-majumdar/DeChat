package rs1;

import android.animation.Animator;
import android.view.View;
import de1.C7290r;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.c */
public final class C13130c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f37364d;

    /* renamed from: e */
    public final /* synthetic */ C13117b f37365e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37366f;

    /* renamed from: rs1.c$a */
    public static final class C13131a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f37367d;

        /* renamed from: e */
        public final /* synthetic */ C13117b f37368e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f37369f;

        public C13131a(View view, C13117b bVar, C60905o oVar) {
            this.f37367d = view;
            this.f37368e = bVar;
            this.f37369f = oVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f37367d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$showRingtoneInfo$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$showRingtoneInfo$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f37368e.mo12755f3(this.f37369f);
        }
    }

    public C13130c(View view, C13117b bVar, C60905o oVar) {
        this.f37364d = view;
        this.f37365e = bVar;
        this.f37366f = oVar;
    }

    public final void run() {
        this.f37364d.animate().alpha(1.0f).setDuration(250).setListener(new C13131a(this.f37364d, this.f37365e, this.f37366f)).start();
    }
}
