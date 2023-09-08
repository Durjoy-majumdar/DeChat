package yb2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yb2.f */
public final class C15956f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f42852d;

    public C15956f(View view) {
        this.f42852d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42852d.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
