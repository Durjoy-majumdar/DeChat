package il1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.util.Iterator;
import sk1.C63953g;
import sx3.C64197v;

/* renamed from: il1.b0 */
public final class C60345b0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f172004d;

    public C60345b0(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
        this.f172004d = finderLiveAnchorGameTogetherWidget;
    }

    public void onChanged(Object obj) {
        WxRecyclerAdapter<C63953g> wxRecyclerAdapter;
        String str = (String) obj;
        FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = this.f172004d;
        int i = 0;
        Iterator<C63953g> it = finderLiveAnchorGameTogetherWidget.f160044i.iterator();
        while (it.hasNext()) {
            C63953g next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (next.f181279d == 2 && (wxRecyclerAdapter = finderLiveAnchorGameTogetherWidget.f160043h) != null) {
                    wxRecyclerAdapter.notifyItemChanged(i, str);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
