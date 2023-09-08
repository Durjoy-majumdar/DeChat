package gm3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.matrix.MatrixMemoryInfoUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: gm3.a */
public final class C87272a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MatrixMemoryInfoUI f252995d;

    /* renamed from: e */
    public final /* synthetic */ MatrixMemoryInfoUI.C85894a f252996e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87272a(MatrixMemoryInfoUI matrixMemoryInfoUI, MatrixMemoryInfoUI.C85894a aVar) {
        super(0);
        this.f252995d = matrixMemoryInfoUI;
        this.f252996e = aVar;
    }

    public Object invoke() {
        LayoutInflater layoutInflater = this.f252995d.getLayoutInflater();
        Object value = ((C36570n) this.f252995d.f250223o).getValue();
        C87412m.m108593f(value, "<get-detailContainer>(...)");
        boolean z = false;
        View inflate = layoutInflater.inflate(C0966R.C0971layout.cr8, (LinearLayout) value, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        MatrixMemoryInfoUI.C85894a aVar = this.f252996e;
        ((TextView) inflate.findViewById(C0966R.C0970id.m9l)).setText(aVar.f250224a);
        ((TextView) inflate.findViewById(C0966R.C0970id.m9n)).setText(aVar.f250225b);
        ((TextView) inflate.findViewById(C0966R.C0970id.m9k)).setText(aVar.f250226c);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.m87);
        if (aVar.f250227d <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText("destroyed Activity: " + aVar.f250227d);
        }
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.m9j);
        if (aVar.f250228e.length() == 0) {
            z = true;
        }
        if (z) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(aVar.f250228e);
        }
        Object value2 = ((C36570n) this.f252995d.f250223o).getValue();
        C87412m.m108593f(value2, "<get-detailContainer>(...)");
        ((LinearLayout) value2).addView(inflate, layoutParams);
        return C13598b0.f38549a;
    }
}
