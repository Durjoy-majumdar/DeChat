package rl1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0713b1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: rl1.v */
public final class C13080v extends C60896i<C0713b1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ahz;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0713b1 b1Var = (C0713b1) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(b1Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.g7z);
        if (textView != null) {
            String d = C72715f.m85111d(oVar.f173499A.getString(C0966R.string.du7), (long) b1Var.f1710d.f132087d);
            textView.setText(oVar.f173499A.getString(C0966R.string.du8, new Object[]{d}));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
