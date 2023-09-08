package cn3;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74500h3;
import com.tencent.p014mm.p136ui.contact.C74504i3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import uo3.C78253a;

/* renamed from: cn3.m */
public final class C67434m implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C67435n f193377d;

    public C67434m(C67435n nVar) {
        this.f193377d = nVar;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C67435n nVar;
        ArrayList<C74500h3> arrayList;
        C74500h3 h3Var;
        C74504i3 i3Var;
        String str;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("MicroMsg.RecentForwardListViewUIC", "onItemLongClick() called with: adapter = " + eVar + ", view = " + view + ", position = " + i + ", holder = " + oVar);
        RecyclerView C = oVar.mo85811C();
        if (!(C == null || (arrayList = nVar.f193378d) == null || (h3Var = arrayList.get(i)) == null || (i3Var = h3Var.f219053d) == null || (str = i3Var.f219061a) == null)) {
            C78253a aVar = (nVar = this.f193377d).f193379e;
            if (aVar != null) {
                aVar.mo108266a();
            }
            RecyclerView.LayoutManager layoutManager = C.getLayoutManager();
            View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
            if (findViewByPosition != null) {
                C78253a aVar2 = new C78253a(findViewByPosition.getContext());
                aVar2.f229225A = true;
                aVar2.f229227C = new C67437o(nVar);
                nVar.f193379e = aVar2;
                int[] iArr = {0, 0};
                findViewByPosition.getLocationInWindow(iArr);
                C67438p pVar = new C67438p(str, nVar, C);
                C78253a aVar3 = nVar.f193379e;
                if (aVar3 != null) {
                    int width = (int) (((float) iArr[0]) + (((float) findViewByPosition.getWidth()) / 2.0f));
                    int i2 = iArr[1];
                    aVar3.f229251t = pVar;
                    aVar3.f229240f = findViewByPosition;
                    if (!(findViewByPosition instanceof TextView) && (width == 0 || i2 == 0)) {
                        aVar3.mo108277l();
                    }
                    aVar3.f229254w.clear();
                    aVar3.f229254w.mo107125a(0, C0966R.string.ij4);
                    if (width == 0 && i2 == 0) {
                        aVar3.mo70679m();
                    } else {
                        aVar3.mo71743n(width, i2);
                    }
                }
            }
        }
        return true;
    }
}
