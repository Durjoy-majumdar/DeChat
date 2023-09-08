package hs1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C58739j4;
import gy3.C87412m;
import m53.C10762h;
import te3.C50943qc2;

/* renamed from: hs1.r */
public final class C8753r implements C10762h<C50943qc2> {

    /* renamed from: a */
    public final /* synthetic */ C8756u f28036a;

    public C8753r(C8756u uVar) {
        this.f28036a = uVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
    }

    public void onSuccess(Object obj) {
        TextView textView;
        C50943qc2 qc22 = (C50943qc2) obj;
        C87412m.m108594g(qc22, "data");
        View root = this.f28036a.getRoot();
        if (root != null && (textView = (TextView) root.findViewById(C0966R.C0970id.ngr)) != null) {
            C58739j4.f168176a.mo83703c0(textView, true);
            textView.setText(String.valueOf(qc22.f140241d));
        }
    }
}
