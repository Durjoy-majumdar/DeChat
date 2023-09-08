package eq1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import qo3.C77407n;

/* renamed from: eq1.h */
public final class C58673h implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C58666b f167970d;

    public C58673h(C58666b bVar) {
        this.f167970d = bVar;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return false;
        }
        C45082x0 x0Var = new C45082x0(this.f167970d.f167947a);
        C58666b bVar = this.f167970d;
        x0Var.mo70436b(view, new C58671f(bVar), new C58672g(baseFinderFeed, bVar), (C77407n.C47880p) null);
        return true;
    }
}
