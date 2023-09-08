package et0;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: et0.e */
public class C75663e implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f222256d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f222257e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f222258f;

    /* renamed from: g */
    public final /* synthetic */ C75661d f222259g;

    public C75663e(C75661d dVar, RecyclerView recyclerView, RecyclerView.C16631z zVar, Runnable runnable) {
        this.f222259g = dVar;
        this.f222256d = recyclerView;
        this.f222257e = zVar;
        this.f222258f = runnable;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C75661d dVar = this.f222259g;
        dVar.f222246a.removeView(dVar.f222247b);
        View view = this.f222259g.f222247b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ImageView a = ((AppBrandDesktopDragView.C68670b) this.f222259g.f222249d).mo94404a();
        if (a != null) {
            if (((AppBrandDesktopDragView.C68670b) this.f222259g.f222249d).mo94405b(this.f222256d) && ((AppBrandDesktopDragView.C68670b) this.f222259g.f222249d).mo94406c() > 8) {
                C75661d dVar2 = this.f222259g;
                C75664f fVar = dVar2.f222251f;
                View view2 = dVar2.f222247b;
                ((AppBrandDesktopDragView.C68669a) fVar).getClass();
                a.setImageDrawable(((ImageView) view2.findViewById(C0966R.C0970id.f15)).getDrawable());
            }
        }
        RecyclerView.C16631z zVar = this.f222257e;
        if (zVar != null) {
            View view3 = zVar.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f222258f.run();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
