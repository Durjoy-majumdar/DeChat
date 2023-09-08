package ve1;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0758o0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderTimelineMoreFeedExposeStruct;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C8808v4;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import up1.C37521f;

/* renamed from: ve1.b4 */
public class C14468b4 extends C60896i<C0758o0> {

    /* renamed from: f */
    public static final SparseArray<Integer> f40108f = new SparseArray<>();

    /* renamed from: e */
    public final int f40109e;

    /* renamed from: ve1.b4$a */
    public static final class C14469a {
        public C14469a(C8480h hVar) {
        }
    }

    static {
        new C14469a((C8480h) null);
    }

    public C14468b4(int i) {
        this.f40109e = i;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6254u;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C0758o0 o0Var = (C0758o0) cVar;
        Class cls = C58417y0.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(o0Var, "item");
        f40108f.put(this.f40109e, Integer.valueOf(i));
        int i3 = o0Var.f1789g;
        if (i3 == 1) {
            oVar2.mo85817I(C0966R.C0970id.j8c, 8);
            oVar2.mo85817I(C0966R.C0970id.czd, 0);
            oVar2.mo85815G(C0966R.C0970id.czd, o0Var.f1788f);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            int dc = ((C58417y0) C86312j.m106911c(cls)).mo83328dc(this.f40109e);
            y0Var.getClass();
            FinderTimelineMoreFeedExposeStruct finderTimelineMoreFeedExposeStruct = new FinderTimelineMoreFeedExposeStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderTimelineMoreFeedExposeStruct.f9909d = finderTimelineMoreFeedExposeStruct.mo86045b("sessionid", Wb, true);
            finderTimelineMoreFeedExposeStruct.f9910e = (long) 2;
            finderTimelineMoreFeedExposeStruct.f9911f = (long) 1;
            finderTimelineMoreFeedExposeStruct.f9912g = (long) 0;
            finderTimelineMoreFeedExposeStruct.f9913h = (long) dc;
            finderTimelineMoreFeedExposeStruct.mo86054n();
            y0Var.Ec0(finderTimelineMoreFeedExposeStruct);
        } else if (i3 == 2) {
            View D = oVar2.mo85812D(C0966R.C0970id.j8c);
            View D2 = oVar2.mo85812D(C0966R.C0970id.czd);
            oVar2.mo85815G(C0966R.C0970id.czd, o0Var.f1788f);
            C58784w3.f168295a.getClass();
            if (!(D2 == null || D2.getVisibility() == 0)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderUtil", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/utils/FinderUtil", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            D.setOnClickListener(new C14481c4(this, oVar2));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ((TextView) oVar.mo85812D(C0966R.C0970id.cze)).setText(oVar.f173499A.getString(C0966R.string.esb, new Object[]{C37521f.f99374d.mo61159M(4, "")}));
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            ((TextView) oVar.mo85812D(C0966R.C0970id.cze)).setVisibility(8);
        } else {
            ((TextView) oVar.mo85812D(C0966R.C0970id.cze)).setVisibility(0);
        }
    }
}
