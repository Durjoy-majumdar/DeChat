package sk1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import sx3.C110818d0;
import te3.C48899bs1;
import te3.C51560uk2;
import te3.C51613uy0;

/* renamed from: sk1.h */
public final class C48415h extends C60896i<C63953g> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d1l;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C48899bs1 bs12;
        LinkedList<C51560uk2> linkedList;
        T t;
        boolean z2;
        C63953g gVar = (C63953g) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.nqh);
        String str = null;
        Object N = list != null ? C110818d0.m150916N(list) : null;
        if (N instanceof String) {
            CharSequence charSequence = (CharSequence) N;
            if (!(charSequence.length() == 0)) {
                textView.setText(charSequence);
                textView.setAlpha(1.0f);
            }
        }
        C51613uy0 uy02 = gVar.f181282g;
        if (!(uy02 == null || (bs12 = uy02.f143180d) == null || (linkedList = bs12.f131284d) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C51560uk2) t).f142914e == gVar.f181282g.f143181e) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C51560uk2 uk22 = (C51560uk2) t;
            if (uk22 != null) {
                str = uk22.f142913d;
            }
        }
        textView.setText(str);
        textView.setAlpha(1.0f);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
