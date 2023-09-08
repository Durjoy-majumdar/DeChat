package aa2;

import androidx.recyclerview.widget.RecyclerView;
import ba2.C39748b;
import c02.C92331c;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import v92.C65558a;

/* renamed from: aa2.i */
public final class C112777i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112765c f337688d;

    /* renamed from: e */
    public final /* synthetic */ List<MultiTaskInfo> f337689e;

    /* renamed from: f */
    public final /* synthetic */ boolean f337690f;

    /* renamed from: g */
    public final /* synthetic */ boolean f337691g;

    /* renamed from: h */
    public final /* synthetic */ boolean f337692h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112777i(C112765c cVar, List<? extends MultiTaskInfo> list, boolean z, boolean z2, boolean z3) {
        super(0);
        this.f337688d = cVar;
        this.f337689e = list;
        this.f337690f = z;
        this.f337691g = z2;
        this.f337692h = z3;
    }

    public Object invoke() {
        WxRecyclerView wxRecyclerView;
        RecyclerView.C16623q recycledViewPool;
        this.f337688d.f337657h.clear();
        List<MultiTaskInfo> list = this.f337689e;
        if (list != null) {
            C112765c cVar = this.f337688d;
            for (MultiTaskInfo multiTaskInfo : list) {
                C39748b bVar = C39748b.f106642a;
                int i = multiTaskInfo.field_type;
                if (i == 2 || i == 22 || i == 4 || i == 1 || i == 5 || i == 3 || i == 8) {
                    cVar.f337657h.add(new C65558a(multiTaskInfo));
                }
            }
        }
        if (this.f337690f) {
            WxRecyclerView wxRecyclerView2 = this.f337688d.f337659j;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.removeAllViewsInLayout();
            }
            WxRecyclerView wxRecyclerView3 = this.f337688d.f337659j;
            if (!(wxRecyclerView3 == null || (recycledViewPool = wxRecyclerView3.getRecycledViewPool()) == null)) {
                recycledViewPool.mo17334a();
            }
            WxRecyclerAdapter<C65558a> wxRecyclerAdapter = this.f337688d.f337667u;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f165742u.clear();
            }
            Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "clear Pool and RemoveAllViews");
            if (this.f337689e != null) {
                ((C92331c) C86312j.m106911c(C92331c.class)).pi0(this.f337689e);
            }
        }
        WxRecyclerAdapter<C65558a> wxRecyclerAdapter2 = this.f337688d.f337667u;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        if (this.f337691g) {
            this.f337688d.mo164522m3();
            if (this.f337688d.f337657h.size() == 1) {
                C112765c cVar2 = this.f337688d;
                cVar2.mo164520K3(cVar2.f337657h.get(0).f188631d, true, true);
            } else {
                this.f337688d.mo164520K3((MultiTaskInfo) null, true, true);
            }
        }
        if (this.f337692h && (wxRecyclerView = this.f337688d.f337659j) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            WxRecyclerView wxRecyclerView4 = wxRecyclerView;
            C117292a.m165358d(wxRecyclerView4, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            wxRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView4, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
