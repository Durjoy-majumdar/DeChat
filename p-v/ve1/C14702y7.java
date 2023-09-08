package ve1;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0736h0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.y7 */
public final class C14702y7 extends C60896i<C0736h0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359781ap0;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0736h0 h0Var = (C0736h0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(h0Var, "item");
        View D = oVar.mo85812D(C0966R.C0970id.j6y);
        if (D != null) {
            D.setBackground(oVar.f173499A.getResources().getDrawable(C0966R.color.BW_0));
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.j5r);
        if (textView != null) {
            textView.setTextSize(1, 15.0f);
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.j5r);
        if (textView2 != null) {
            textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        }
        TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.j5r);
        if (textView3 != null) {
            Resources resources = oVar.f173499A.getResources();
            textView3.setText(resources.getString(C0966R.string.enb, new Object[]{'\"' + h0Var.f1758d + '\"'}));
        }
        TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.j5r);
        if (textView4 != null) {
            textView4.setTag(C0966R.C0970id.e6t, h0Var.f1758d);
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.j5q);
        if (weImageView != null) {
            weImageView.setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
