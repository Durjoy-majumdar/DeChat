package cn3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C57827q0;
import com.tencent.p014mm.p136ui.contact.C74500h3;
import com.tencent.p014mm.p136ui.contact.C74504i3;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p278yh.C79114k;
import rx3.C13598b0;
import sm3.C77735c;
import tm3.C78068v;
import tm3.C78069w;
import tm3.C78071z;
import uo3.C78253a;
import yb2.C15946a;

/* renamed from: cn3.n */
public final class C67435n extends C15946a {

    /* renamed from: d */
    public ArrayList<C74500h3> f193378d = new ArrayList<>();

    /* renamed from: e */
    public C78253a f193379e;

    /* renamed from: f */
    public WxRecyclerAdapter<C74500h3> f193380f;

    /* renamed from: g */
    public C79114k f193381g;

    /* renamed from: h */
    public final ArrayList<C77020b> f193382h = new ArrayList<>();

    /* renamed from: i */
    public boolean f193383i;

    /* renamed from: cn3.n$a */
    public static final class C67436a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67435n f193384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67436a(C67435n nVar) {
            super(1);
            this.f193384d = nVar;
        }

        public Object invoke(Object obj) {
            RecyclerView.C16613e adapter;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (this.f193384d.f193383i != wVar.mo108033b()) {
                this.f193384d.f193383i = wVar.mo108033b();
                C67435n nVar = this.f193384d;
                nVar.getClass();
                Iterator<C74500h3> it = nVar.f193378d.iterator();
                while (it.hasNext()) {
                    C74500h3 next = it.next();
                    next.f219053d.f219064d = wVar.mo108033b();
                    C74504i3 i3Var = next.f219053d;
                    i3Var.f219063c = wVar.f228826n.contains(i3Var.f219061a);
                }
                C79114k kVar = nVar.f193381g;
                if (kVar != null) {
                    if (kVar.f232299c == null) {
                        kVar.f232299c = (RecyclerView) kVar.f232297a.findViewById(C0966R.C0970id.ife);
                    }
                    RecyclerView recyclerView = kVar.f232299c;
                    if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                }
                Log.m105924i("MicroMsg.RecentForwardListViewUIC", "onCreate: isMultiSelect change : " + wVar.mo108033b());
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C67435n nVar2 = this.f193384d;
                String str = zVar.f228837a.f225007f;
                nVar2.getClass();
                C87412m.m108594g(str, "userName");
                ArrayList<C74500h3> arrayList = nVar2.f193378d;
                if (arrayList != null) {
                    Iterator<C74500h3> it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C74500h3 next2 = it4.next();
                        if (C87412m.m108589b(next2.f219053d.f219061a, str)) {
                            C74504i3 i3Var2 = next2.f219053d;
                            i3Var2.f219063c = !i3Var2.f219063c;
                        }
                    }
                }
                WxRecyclerAdapter<C74500h3> wxRecyclerAdapter = nVar2.f193380f;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            }
            C67435n nVar3 = this.f193384d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78068v)) {
                List<String> list = ((C78068v) action).f228818a;
                ArrayList<C74500h3> arrayList2 = nVar3.f193378d;
                if (arrayList2 != null) {
                    Iterator<C74500h3> it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        C74500h3 next3 = it5.next();
                        next3.f219053d.f219063c = false;
                        if (list != null) {
                            for (String b : list) {
                                if (C87412m.m108589b(next3.f219053d.f219061a, b)) {
                                    next3.f219053d.f219063c = true;
                                }
                            }
                        }
                    }
                }
                WxRecyclerAdapter<C74500h3> wxRecyclerAdapter2 = nVar3.f193380f;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyDataSetChanged();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67435n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo91618g3() {
        Class cls = C75700k0.class;
        this.f193378d.clear();
        for (String str : C57827q0.m66830c()) {
            C72996z1 W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(str);
            if (W2 == null) {
                Log.m105928w("MicroMsg.RecentForwardListViewUIC", "initDataList: contact == null");
                W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(str);
            }
            String pi = ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(W2);
            ArrayList<C74500h3> arrayList = this.f193378d;
            C87412m.m108593f(str, "userName");
            C87412m.m108593f(pi, "displayName");
            arrayList.add(new C74500h3(new C74504i3(str, pi, false, false, 12, (C8480h) null)));
            C77735c cVar = new C77735c(0, 0, (C99681n) null, (C99672i) null, 0, 0, 60, (C8480h) null);
            String username = W2.getUsername();
            C87412m.m108593f(username, "contact.username");
            this.f193382h.add(C77735c.f226536g.mo107872a(getActivity(), username + '-' + 40 + '-' + 0, W2, 40, cVar));
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C67436a(this));
        }
    }
}
