package hs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: hs1.g */
public final class C8742g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f28021d;

    /* renamed from: e */
    public final /* synthetic */ NoticeGetCouponView f28022e;

    public C8742g(C32224a<C13598b0> aVar, NoticeGetCouponView noticeGetCouponView) {
        this.f28021d = aVar;
        this.f28022e = noticeGetCouponView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/NoticeGetCouponView$renderInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f28021d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f28022e.f18308g.setOnClickListener((View.OnClickListener) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/NoticeGetCouponView$renderInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
