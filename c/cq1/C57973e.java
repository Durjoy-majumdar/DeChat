package cq1;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99672i;

/* renamed from: cq1.e */
public final class C57973e extends C60896i<C57974g> {
    public C57973e(Boolean bool) {
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359709af1;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C57974g gVar = (C57974g) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        Context context = oVar.f44854d.getContext();
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.de6);
        textView.setTextColor(context.getResources().getColor(C0966R.color.FG_2));
        C99667f fVar = new C99667f();
        Resources resources = context.getResources();
        Object[] objArr = new Object[1];
        C99672i iVar = gVar.f165888h;
        String str = iVar != null ? iVar.f292120a : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        fVar.f292088a = resources.getString(C0966R.string.d17, objArr);
        fVar.f292089b = gVar.f165888h;
        fVar.f292090c = false;
        fVar.f292091d = false;
        fVar.f292095h = textView.getPaint();
        textView.setText(C99254i.m129308e(fVar).f292107a);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
