package zk1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zk1.t */
public final class C16281t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43574d;

    public C16281t(C16229h hVar) {
        this.f43574d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43574d.getActivity().finish();
        this.f43574d.getActivity().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
