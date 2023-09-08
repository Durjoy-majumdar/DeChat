package com.tencent.p014mm.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.i */
public final class C57910i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f165710d;

    /* renamed from: e */
    public final /* synthetic */ int f165711e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57910i(RefreshLoadMoreLayout refreshLoadMoreLayout, int i) {
        super(0);
        this.f165710d = refreshLoadMoreLayout;
        this.f165711e = i;
    }

    public Object invoke() {
        View findViewById;
        View findViewById2;
        View refreshHeader = this.f165710d.getRefreshHeader();
        if (!(refreshHeader == null || (findViewById2 = refreshHeader.findViewById(C0966R.C0970id.ive)) == null)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View refreshHeader2 = this.f165710d.getRefreshHeader();
        if (!(refreshHeader2 == null || (findViewById = refreshHeader2.findViewById(C0966R.C0970id.iji)) == null)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View refreshHeader3 = this.f165710d.getRefreshHeader();
        if (refreshHeader3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(4);
            C117292a.m165358d(refreshHeader3, aVar3.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(refreshHeader3, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(-1);
        cVar.f24953h = this.f165711e;
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165710d;
        refreshLoadMoreLayout.f165615Q = false;
        RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.f24939f = false;
            stickTopLoadingLayout.mo8167b();
            RefreshLoadMoreLayout.C57879a aVar4 = stickTopLoadingLayout.f24940g;
            if (aVar4 != null) {
                aVar4.mo3681e(cVar);
            }
        }
        RefreshLoadMoreLayout.C57879a actionCallback = this.f165710d.getActionCallback();
        if (actionCallback != null) {
            actionCallback.mo3681e(cVar);
        }
        RefreshLoadMoreLayout.C57879a reportCallback = this.f165710d.getReportCallback();
        if (reportCallback != null) {
            reportCallback.mo3681e(cVar);
        }
        return C13598b0.f38549a;
    }
}
