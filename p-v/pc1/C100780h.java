package pc1;

import android.view.View;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: pc1.h */
public class C100780h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f295246d;

    /* renamed from: e */
    public final /* synthetic */ FavVideoView f295247e;

    public C100780h(FavVideoView favVideoView, boolean z) {
        this.f295247e = favVideoView;
        this.f295246d = z;
    }

    public void run() {
        Log.m105925i(this.f295247e.f270528d, "VideoPlay: switch video model isVideoPlay %b ", Boolean.valueOf(this.f295246d));
        View view = (View) this.f295247e.f270531g;
        if (this.f295246d) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f295247e.f270530f.setVisibility(8);
            FavVideoView favVideoView = this.f295247e;
            favVideoView.f270536o.setVideoTotalTime(favVideoView.f270531g.getDuration() / 1000);
            return;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view4 = view;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f295247e.f270530f.setVisibility(0);
    }
}
