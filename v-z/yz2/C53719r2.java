package yz2;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusRecentStatusView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import lz2.C34452l;
import uo3.C78253a;

/* renamed from: yz2.r2 */
public final class C53719r2 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusRecentStatusView f150828d;

    public C53719r2(TextStatusRecentStatusView textStatusRecentStatusView) {
        this.f150828d = textStatusRecentStatusView;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("MicroMsg.TextStatus.TextStatusRecentUseView", "onItemLongClick() called with: adapter = " + eVar + ", view = " + view + ", position = " + i + ", holder = " + oVar);
        TextStatusRecentStatusView textStatusRecentStatusView = this.f150828d;
        RecyclerView recyclerView = textStatusRecentStatusView.f117007f;
        if (recyclerView != null) {
            C34452l lVar = textStatusRecentStatusView.f117008g.get(i);
            C87412m.m108593f(lVar, "mDataList[position]");
            C34452l lVar2 = lVar;
            C78253a aVar = textStatusRecentStatusView.f117011j;
            if (aVar != null) {
                aVar.mo108266a();
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
            if (findViewByPosition != null) {
                C78253a aVar2 = new C78253a(findViewByPosition.getContext());
                aVar2.f229225A = true;
                aVar2.f229227C = new C53720s2(textStatusRecentStatusView);
                textStatusRecentStatusView.f117011j = aVar2;
                int[] iArr = {0, 0};
                findViewByPosition.getLocationInWindow(iArr);
                C53721t2 t2Var = new C53721t2(lVar2, textStatusRecentStatusView, i, recyclerView);
                C78253a aVar3 = textStatusRecentStatusView.f117011j;
                if (aVar3 != null) {
                    int width = (int) (((float) iArr[0]) + (((float) findViewByPosition.getWidth()) / 2.0f));
                    int i2 = iArr[1];
                    aVar3.f229251t = t2Var;
                    aVar3.f229240f = findViewByPosition;
                    if (!(findViewByPosition instanceof TextView) && (width == 0 || i2 == 0)) {
                        aVar3.mo108277l();
                    }
                    aVar3.f229254w.clear();
                    aVar3.f229254w.mo107125a(0, C0966R.string.n5v);
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
