package com.tencent.p014mm.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.h */
public final class C57909h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f165708d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f165709e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57909h(RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f165708d = refreshLoadMoreLayout;
        this.f165709e = cVar;
    }

    public Object invoke() {
        View findViewById;
        TextView textView;
        RefreshLoadMoreLayout.C57879a actionCallback = this.f165708d.getActionCallback();
        if (actionCallback != null) {
            actionCallback.mo2562c(this.f165709e);
        }
        View view = this.f165708d.f165626x;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore2$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore2$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f165708d.f165626x;
        if (!(view2 == null || (textView = (TextView) view2.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setText(C0966R.string.f360085a04);
        }
        View view3 = this.f165708d.f165626x;
        if (!(view3 == null || (findViewById = view3.findViewById(C0966R.C0970id.g2s)) == null)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore2$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore2$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
