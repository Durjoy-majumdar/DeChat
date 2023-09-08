package cn3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.contact.C57827q0;
import com.tencent.p014mm.p136ui.contact.C74500h3;
import com.tencent.p014mm.p136ui.mvvm.uic.conversation.recent.RecentForwardListViewUIC$initView$1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p278yh.C79114k;
import xm3.C78917n;

/* renamed from: cn3.q */
public class C67439q extends C78917n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67439q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public ArrayList<View> mo91612i3() {
        ArrayList<View> i3 = super.mo91612i3();
        C39818r rVar = C39818r.f106831a;
        C67435n nVar = (C67435n) rVar.mo62443b(getContext()).mo75002a(C67435n.class);
        nVar.getClass();
        LinearLayout linearLayout = null;
        if (!Util.isNullOrNil((List) C57827q0.m66830c())) {
            if (nVar.f193381g == null) {
                nVar.f193381g = new C79114k(LayoutInflater.from(nVar.getActivity()).inflate(C0966R.C0971layout.f7203ws, (ViewGroup) null));
                nVar.mo91618g3();
                if (!nVar.f193378d.isEmpty()) {
                    WxRecyclerAdapter<C74500h3> wxRecyclerAdapter = new WxRecyclerAdapter<>(new RecentForwardListViewUIC$initView$1(), nVar.f193378d, false);
                    nVar.f193380f = wxRecyclerAdapter;
                    wxRecyclerAdapter.f173488o = new C67433l(nVar);
                    wxRecyclerAdapter.f173487n = new C67434m(nVar);
                    C79114k kVar = nVar.f193381g;
                    if (kVar != null) {
                        if (kVar.f232299c == null) {
                            kVar.f232299c = (RecyclerView) kVar.f232297a.findViewById(C0966R.C0970id.ife);
                        }
                        RecyclerView recyclerView = kVar.f232299c;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(nVar.getContext(), 0, false));
                            recyclerView.setHasFixedSize(true);
                            recyclerView.setAdapter(nVar.f193380f);
                        }
                    }
                    C79114k kVar2 = nVar.f193381g;
                    if (kVar2 != null) {
                        if (kVar2.f232300d == null) {
                            kVar2.f232300d = (TextView) kVar2.f232297a.findViewById(C0966R.C0970id.eve);
                        }
                        TextView textView = kVar2.f232300d;
                        if (textView != null) {
                            C85875k4.m106191k0(textView.getPaint());
                        }
                    }
                }
            }
            C79114k kVar3 = nVar.f193381g;
            if (kVar3 != null) {
                if (kVar3.f232298b == null) {
                    kVar3.f232298b = (LinearLayout) kVar3.f232297a.findViewById(C0966R.C0970id.iwl);
                }
                linearLayout = kVar3.f232298b;
            }
        }
        if (linearLayout != null) {
            i3.add(linearLayout);
        }
        View g3 = ((C67413d) rVar.mo62443b(getContext()).mo75002a(C67413d.class)).mo91613g3();
        if (g3 != null) {
            i3.add(g3);
        }
        return i3;
    }
}
