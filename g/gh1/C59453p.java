package gh1;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gh1.p */
public class C59453p {

    /* renamed from: a */
    public final View f169882a;

    /* renamed from: b */
    public final C59462y f169883b;

    /* renamed from: c */
    public boolean f169884c;

    /* renamed from: d */
    public int f169885d;

    public C59453p(View view, C59462y yVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(yVar, "checkVisibleCallback");
        this.f169882a = view;
        this.f169883b = yVar;
        this.f169885d = view.getVisibility();
    }

    /* renamed from: a */
    public final void mo84558a() {
        if (this.f169884c) {
            View view = this.f169882a;
            int i = this.f169885d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f169884c = false;
        }
    }

    /* renamed from: b */
    public final void mo84559b(int i) {
        View view = this.f169882a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f169884c = true;
    }

    /* renamed from: c */
    public final void mo84560c(int i) {
        this.f169885d = i;
        if (!this.f169883b.mo9315m()) {
            View view = this.f169882a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!this.f169884c) {
            View view3 = this.f169882a;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
