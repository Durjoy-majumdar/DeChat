package bj2;

import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: bj2.i */
public final class C54467i extends C60896i<C54471p> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cob;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C54471p pVar = (C54471p) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(pVar, "item");
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm)).setText(pVar.f152734d.mo90394l2());
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.c2h)).setText(pVar.f152734d.mo90395m2());
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.kky)).setText(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, pVar.f152734d.getTimestamp() / ((long) 1000)));
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.l0j);
        if (textView != null) {
            textView.setOnClickListener(new C54465g(pVar));
        }
        ((Button) oVar.f44854d.findViewById(C0966R.C0970id.c1_)).setOnClickListener(new C54466h(pVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
