package zk1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zk1.y */
public final class C16290y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43591d;

    public C16290y(C16229h hVar) {
        this.f43591d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43591d.mo14765g3().requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f43591d.getActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f43591d.mo14765g3(), 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
