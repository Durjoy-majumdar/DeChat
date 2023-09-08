package gv1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import ev1.C58838a;
import ft1.C59319a;
import gy3.C87412m;
import java.io.PrintWriter;
import java.io.StringWriter;
import jq3.C60898l;
import jq3.C60905o;
import o40.C11348f;
import sx3.C110818d0;
import zt3.C119157j;

/* renamed from: gv1.h */
public final class C59735h implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C58838a> f170626d;

    /* renamed from: e */
    public final /* synthetic */ C59712c f170627e;

    public C59735h(WxRecyclerAdapter<C58838a> wxRecyclerAdapter, C59712c cVar) {
        this.f170626d = wxRecyclerAdapter;
        this.f170627e = cVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        try {
            int N0 = this.f170626d.mo85797d6().mo17029N0(view);
            if (N0 >= 0) {
                C58838a aVar = (C58838a) C110818d0.m150917O(this.f170627e.f170589q, N0);
                if (aVar != null) {
                    if (N0 != 0 || this.f170627e.f170589q.size() <= 1) {
                        this.f170627e.f170589q.remove(N0);
                        aVar.mo84044q();
                        if (this.f170627e.mo84695m()) {
                            C59712c cVar = this.f170627e;
                            cVar.getClass();
                            ((C119157j) C119157j.f356862d).mo183895z(new C59711b(cVar));
                        } else {
                            RecyclerView.C16613e adapter = this.f170626d.mo85797d6().getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemRemoved(N0);
                            }
                            RecyclerView.C16613e adapter2 = this.f170626d.mo85797d6().getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyItemRangeChanged(N0, this.f170627e.f170589q.size() - N0);
                            }
                        }
                    } else {
                        this.f170627e.mo84699p(N0 + 1);
                    }
                    aVar.mo84043p(oVar, view, i);
                }
            }
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            C11348f.C11349a.m11178b(C59319a.f169618b, "finderForceNotifyCrash", false, (C11348f.C11352b) null, false, false, new C32556g(stringWriter), 28, (Object) null);
        }
    }
}
