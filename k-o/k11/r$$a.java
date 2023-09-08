package k11;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class r$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99084r f223906d;

    /* renamed from: e */
    public final /* synthetic */ r$$b f223907e;

    /* renamed from: f */
    public final /* synthetic */ int f223908f;

    public /* synthetic */ r$$a(C99084r rVar, r$$b r__b, int i) {
        this.f223906d = rVar;
        this.f223907e = r__b;
        this.f223908f = i;
    }

    public final void onClick(View view) {
        C99084r rVar = this.f223906d;
        r$$b r__b = this.f223907e;
        int i = this.f223908f;
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(r__b);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", rVar, array);
        AdapterView.OnItemClickListener onItemClickListener = rVar.f290443g;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick((AdapterView) null, r__b.f290449e, i, -1);
        }
        C117292a.m165361g(rVar, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
