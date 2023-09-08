package qj3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj3.c */
public class C47861c implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseSortView f128462d;

    public C47861c(BaseSortView baseSortView) {
        this.f128462d = baseSortView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/sortview/BaseSortView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        AdapterView.OnItemClickListener onItemClickListener = this.f128462d.f121301h;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseSortView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
