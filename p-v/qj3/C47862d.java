package qj3;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;

/* renamed from: qj3.d */
public class C47862d implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseSortView f128463d;

    public C47862d(BaseSortView baseSortView) {
        this.f128463d = baseSortView;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = this.f128463d.f121302i;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(adapterView, view, i, j);
        }
        return false;
    }
}
