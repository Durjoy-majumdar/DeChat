package qj1;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import il1.C60532u8;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: qj1.eg */
public final class C62766eg extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62741dg f178174d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62766eg(C62741dg dgVar) {
        super(0);
        this.f178174d = dgVar;
    }

    public Object invoke() {
        View view;
        C60532u8 u8Var = this.f178174d.f178124s;
        u8Var.getClass();
        if (C62042e.f176370a.mo87106p0().getBoolean("LINK_RED_DOT_ENABLE_KEY", true) && (view = u8Var.f172543n) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onAcceptLinkMicSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onAcceptLinkMicSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
