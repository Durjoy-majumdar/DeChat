package zk1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zk1.s */
public final class C16280s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43573d;

    public C16280s(C16229h hVar) {
        this.f43573d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h hVar = this.f43573d;
        hVar.getClass();
        Intent intent = new Intent(hVar.getActivity(), FinderLivePostSelectContactUI.class);
        intent.putExtra("KEY_PARAMS_WHITE_LIST", hVar.f43465G.toByteArray());
        hVar.getActivity().startActivityForResult(intent, 3);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
