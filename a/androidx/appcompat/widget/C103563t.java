package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.t */
public class C103563t implements AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public final /* synthetic */ ListPopupWindow f305849d;

    public C103563t(ListPopupWindow listPopupWindow) {
        this.f305849d = listPopupWindow;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C103557q qVar;
        if (i != -1 && (qVar = this.f305849d.f305517f) != null) {
            qVar.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
