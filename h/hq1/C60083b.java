package hq1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: hq1.b */
public final class C60083b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60070a f171446d;

    public C60083b(C60070a aVar) {
        this.f171446d = aVar;
    }

    public final void run() {
        Log.m105924i(this.f171446d.f171426e, "showFeedBackFrameOne");
        ViewGroup viewGroup = this.f171446d.f171427f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        View view = this.f171446d.f171428g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f171446d.f171429h;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup viewGroup2 = this.f171446d.f171427f;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_5);
        }
    }
}
