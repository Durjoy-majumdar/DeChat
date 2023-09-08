package fj2;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: fj2.b */
public final class C59105b extends C60896i<C59106c> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bsv;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C59106c cVar2 = (C59106c) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "dataItem");
        if (cVar2.f169068e == 0) {
            str = "[置顶] " + cVar2.f169069f.f184381e;
        } else {
            str = cVar2.f169069f.f184381e;
        }
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm)).setText(str);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.l3h);
        if (cVar2.f169069f.f184382f == 3) {
            textView.setText(cVar2.f169070g);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
