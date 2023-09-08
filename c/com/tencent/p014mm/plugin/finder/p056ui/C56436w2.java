package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import me3.C109612c;
import z20.C112579f;

/* renamed from: com.tencent.mm.plugin.finder.ui.w2 */
public final class C56436w2 implements C109612c.C109620e {

    /* renamed from: a */
    public final /* synthetic */ FinderSelectCoverUI f161302a;

    public C56436w2(FinderSelectCoverUI finderSelectCoverUI) {
        this.f161302a = finderSelectCoverUI;
    }

    /* renamed from: a */
    public boolean mo79171a(C112579f fVar) {
        return false;
    }

    /* renamed from: b */
    public void mo79172b() {
        View view = this.f161302a.f161122w;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f161302a.f161120u;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("cropOperationLayout");
            throw null;
        }
        C87412m.m108603p("footerView");
        throw null;
    }

    /* renamed from: c */
    public void mo79173c(Boolean bool) {
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            View view = this.f161302a.f161122w;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f161302a.f161120u;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(4);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("cropOperationLayout");
                throw null;
            }
            C87412m.m108603p("footerView");
            throw null;
        }
    }
}
