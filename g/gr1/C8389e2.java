package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gr1.e2 */
public final class C8389e2 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f27380d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8389e2(FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f27380d = finderVideoLayout;
    }

    public Object invoke() {
        View findViewById = this.f27380d.findViewById(C0966R.C0970id.l5y);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$videoTypeIv$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$videoTypeIv$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return findViewById;
    }
}
