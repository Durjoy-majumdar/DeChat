package pm1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import pm1.C62381d;
import rx3.C13598b0;

/* renamed from: pm1.n */
public final class C62397n extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62381d f177350d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62397n(C62381d dVar) {
        super(1);
        this.f177350d = dVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        String r = this.f177350d.mo87439r();
        Log.m105924i(r, "invokeAutoPlayCallback pos:" + intValue);
        C62381d dVar = this.f177350d;
        RecyclerView recyclerView = dVar.f177286b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
            View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(intValue);
            int i = 0;
            if (findViewByPosition != null) {
                if (dVar.f177288d && !dVar.f177305u) {
                    if (!dVar.mo87442u(intValue)) {
                        String r2 = dVar.mo87439r();
                        Log.m105928w(r2, "disableLiveMuteByPos return for pos:" + intValue);
                    } else {
                        String r3 = dVar.mo87439r();
                        Log.m105924i(r3, "disableLiveMuteByPos pos:" + intValue);
                        Iterator<C62381d.C62382a> it = dVar.f177303s.iterator();
                        while (it.hasNext()) {
                            C62381d.C62382a next = it.next();
                            if (next.f177311a == intValue) {
                                next.f177312b.setMute(false);
                            } else {
                                next.f177312b.setMute(true);
                            }
                        }
                    }
                    dVar.f177304t.clear();
                    FrameLayout frameLayout = (FrameLayout) findViewByPosition.findViewById(C0966R.C0970id.fwx);
                    dVar.f177304t.add(new C62381d.C35556b(intValue, frameLayout != null ? frameLayout.hashCode() : 0, false));
                }
                dVar.f177301q = true;
                dVar.mo87430i(intValue, findViewByPosition);
                dVar.mo87436o(intValue);
            }
            if (!dVar.mo87446y(intValue)) {
                int i2 = dVar.mo87444w(intValue) ? intValue + 1 : intValue - 1;
                String r4 = dVar.mo87439r();
                Log.m105924i(r4, "findSameLineOtherPos otherPos:" + i2 + ", headerCount = " + dVar.mo87438q());
                if (i2 < 0) {
                    String r5 = dVar.mo87439r();
                    Log.m105924i(r5, "findSameLineOtherPos fix otherPos:" + 0 + " pos:" + intValue + " otherPos:" + 0);
                } else if (dVar.mo87438q() + intValue >= dVar.f177287c.size()) {
                    i = dVar.mo87438q() + (dVar.f177287c.size() - 1);
                    String r6 = dVar.mo87439r();
                    Log.m105924i(r6, "findSameLineOtherPos fix otherPos:" + i + " pos:" + intValue + " otherPos:" + i);
                } else {
                    i = i2;
                }
                View findViewByPosition2 = finderStaggeredGridLayoutManager.findViewByPosition(i);
                if (findViewByPosition2 != null) {
                    dVar.f177301q = true;
                    dVar.mo87430i(i, findViewByPosition2);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
