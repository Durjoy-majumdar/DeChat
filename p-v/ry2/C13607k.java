package ry2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ry2.k */
public final class C13607k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f38560d;

    public C13607k(View view) {
        this.f38560d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38560d.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
