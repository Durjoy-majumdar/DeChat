package mf1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: mf1.m */
public final class C10841m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f32377d;

    /* renamed from: e */
    public final /* synthetic */ View f32378e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10841m(View view, View view2) {
        super(0);
        this.f32377d = view;
        this.f32378e = view2;
    }

    public Object invoke() {
        View view = this.f32377d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f32377d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view4 = this.f32378e;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$animateExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
