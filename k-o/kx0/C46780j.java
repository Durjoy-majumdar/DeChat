package kx0;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kx0.C46768h;
import nj3.C76879j;
import qo3.C89779i0;
import rx3.C36570n;

/* renamed from: kx0.j */
public final class C46780j<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C46754a f125896d;

    /* renamed from: e */
    public final /* synthetic */ C46768h f125897e;

    /* renamed from: f */
    public final /* synthetic */ BizPCRecentReadUI f125898f;

    public C46780j(C46754a aVar, C46768h hVar, BizPCRecentReadUI bizPCRecentReadUI) {
        this.f125896d = aVar;
        this.f125897e = hVar;
        this.f125898f = bizPCRecentReadUI;
    }

    public void onChanged(Object obj) {
        C46768h.C46769a aVar = (C46768h.C46769a) obj;
        View view = this.f125896d.f125846f;
        ProgressBar progressBar = view != null ? (ProgressBar) view.findViewById(C0966R.C0970id.nrz) : null;
        View view2 = this.f125896d.f125846f;
        View findViewById = view2 != null ? view2.findViewById(C0966R.C0970id.nry) : null;
        C46768h hVar = this.f125897e;
        if (C87412m.m108589b(aVar, C46768h.C46769a.C46772c.f125881a)) {
            C89779i0 i0Var = hVar.f125875d;
            if (!(i0Var != null && i0Var.isShowing())) {
                C89779i0 Q = C76879j.m92723Q(hVar.getActivity(), "", hVar.getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
                hVar.f125875d = Q;
                if (Q != null) {
                    Q.show();
                }
            }
        } else {
            C89779i0 i0Var2 = hVar.f125875d;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            hVar.f125875d = null;
        }
        TextView textView = (TextView) ((C36570n) this.f125897e.f125877f).getValue();
        C87412m.m108593f(textView, "emptyWordTv");
        int i = C87412m.m108589b(aVar, C46768h.C46769a.C46773d.f125882a) ? 0 : 8;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(textView, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(textView, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = (View) ((C36570n) this.f125897e.f125878g).getValue();
        C87412m.m108593f(view3, "hasClosedContainer");
        C46768h.C46769a.C46770a aVar3 = C46768h.C46769a.C46770a.f125879a;
        int i2 = C87412m.m108589b(aVar, aVar3) ? 0 : 8;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = true;
        this.f125898f.showOptionMenu(!C87412m.m108589b(aVar, aVar3));
        if (aVar instanceof C46768h.C46769a.C46771b) {
            WxRecyclerView recyclerView = this.f125896d.getRecyclerView();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C46754a aVar6 = this.f125896d;
            View view4 = aVar6.f125846f;
            if (view4 != null) {
                C46768h.C46769a.C46771b bVar = (C46768h.C46769a.C46771b) aVar;
                if (bVar.f125880a == C46768h.C46774b.None) {
                    aVar6.mo72004c3().mo85801h6((long) view4.hashCode(), false);
                    return;
                }
                aVar6.mo72004c3().mo85792R5(view4, -2, false);
                if (progressBar != null) {
                    int i3 = bVar.f125880a == C46768h.C46774b.Loading ? 0 : 8;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(Integer.valueOf(i3));
                    ProgressBar progressBar2 = progressBar;
                    C117292a.m165358d(progressBar2, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    progressBar.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(progressBar2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById != null) {
                    if (bVar.f125880a != C46768h.C46774b.End) {
                        z = false;
                    }
                    int i4 = z ? 0 : 8;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(Integer.valueOf(i4));
                    View view5 = findViewById;
                    C117292a.m165358d(view5, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        C46754a aVar9 = this.f125896d;
        View view6 = aVar9.f125846f;
        if (view6 != null) {
            aVar9.mo72004c3().mo85801h6((long) view6.hashCode(), false);
        }
        WxRecyclerView recyclerView2 = this.f125896d.getRecyclerView();
        C9556a aVar10 = new C9556a();
        aVar10.mo10233c(8);
        C117292a.m165358d(recyclerView2, aVar10.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView2.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
