package oz2;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import su0.C13781a;

/* renamed from: oz2.c */
public final class C47411c extends C60896i<C35347a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cmk;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C35347a) cVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kvd);
        textView.setOnClickListener(new C77053b(oVar));
        int i3 = 0;
        if (C39674e.f106452d.mo62253n0(C13781a.m13082a()) != null) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105918d("MicroMsg.TextStatus.CardFeedBottomItemConvert", "onViewRecycled() called with: holder = " + oVar);
    }
}
