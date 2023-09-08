package qj3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj3.e */
public class C47863e implements AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public final /* synthetic */ BaseSortView f128464d;

    public C47863e(BaseSortView baseSortView) {
        this.f128464d = baseSortView;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/sortview/BaseSortView$4", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f128464d.f121303j;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/base/sortview/BaseSortView$4", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f128464d.f121303j;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }
}
