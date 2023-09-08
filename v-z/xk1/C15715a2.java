package xk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import kj1.C10100a2;
import kj1.C10102b0;
import kj1.C10104b2;
import kj1.C10125e1;
import kj1.C10139f;
import kj1.C10156h;
import kj1.C10213r;
import kj1.C10219s;
import kj1.C10222s0;
import kj1.C10231t;
import kj1.C10235u;
import kj1.C10251w;
import kj1.C10274y1;
import kj1.C10280z1;
import lj1.C10536d;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C36570n;

/* renamed from: xk1.a2 */
public final class C15715a2 extends UIComponent implements View.OnClickListener {

    /* renamed from: d */
    public View f42402d;

    /* renamed from: e */
    public View f42403e;

    /* renamed from: f */
    public View f42404f;

    /* renamed from: g */
    public C58124b f42405g;

    /* renamed from: h */
    public C45795b f42406h;

    /* renamed from: i */
    public C10125e1 f42407i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15715a2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo14435c3(int i, View view, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "liveData");
        this.f42404f = view;
        this.f42405g = bVar;
        this.f42406h = bVar2;
        View findViewById = view.findViewById(C0966R.C0970id.dwi);
        this.f42402d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View view2 = this.f42402d;
        this.f42403e = view2 != null ? view2.findViewById(C0966R.C0970id.iis) : null;
        C62042e.f176370a.mo87091k(this.f42406h);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C10125e1 e1Var = new C10125e1(this, (MMActivity) activity, i, getMainScope(), bVar, bVar2);
        this.f42407i = e1Var;
        C10104b2 b2Var = new C10104b2(e1Var, this.f42403e);
        C10125e1.C10132d dVar = e1Var.f30989h;
        if (dVar != null) {
            C10125e1 e1Var2 = dVar.f31044j;
            e1Var2.f30990i = b2Var;
            C10231t tVar = new C10231t(e1Var2, 1);
            ((ArrayList) dVar.f31040f).add(tVar);
            C10536d dVar2 = dVar.f31044j.f30990i;
            if (dVar2 != null) {
                dVar2.mo10799a(tVar);
            }
            dVar.mo10554a(new C10139f(dVar.f31044j, 1));
            dVar.mo10554a(new C10102b0(dVar.f31044j, 1));
            dVar.mo10554a(new C10251w(dVar.f31044j, 1));
            dVar.mo10554a(new C10235u(dVar.f31044j, 1));
            dVar.mo10554a(new C10213r(dVar.f31044j, 1));
            dVar.mo10554a(new C10219s(dVar.f31044j, 1));
            dVar.mo10554a(new C10156h(dVar.f31044j, 1));
            b2Var.mo10800b();
            b2Var.mo10806l();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "1");
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c, 31, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public void onClick(View view) {
        C10125e1.C10132d dVar;
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostMoreActionUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dwi) {
            C10125e1 e1Var = this.f42407i;
            if (!(e1Var == null || (dVar = e1Var.f30989h) == null)) {
                if (dVar.f31039e == null) {
                    C10125e1 e1Var2 = dVar.f31044j;
                    dVar.f31039e = new C10222s0(e1Var2.f30985d, e1Var2.f30987f);
                }
                C10222s0 s0Var = dVar.f31039e;
                if (s0Var != null) {
                    s0Var.f31223m.setVisibility(8);
                    s0Var.f31218h.setVisibility(8);
                }
                C10222s0 s0Var2 = dVar.f31039e;
                if (s0Var2 != null) {
                    int color = dVar.f31044j.f30985d.getResources().getColor(C0966R.color.Link_100);
                    TextView textView = ((C4191v0) ((C36570n) s0Var2.f31213c).getValue()).f18475u;
                    if (textView != null) {
                        textView.setTextColor(color);
                    }
                }
                C10222s0 s0Var3 = dVar.f31039e;
                if (s0Var3 != null) {
                    s0Var3.f31226p = new C10274y1(dVar);
                }
                if (s0Var3 != null) {
                    s0Var3.f31227q = new C10280z1(dVar);
                }
                if (s0Var3 != null) {
                    s0Var3.f31221k.f31230e = dVar.f31042h;
                }
                if (s0Var3 != null) {
                    s0Var3.f31222l.f31230e = dVar.f31043i;
                }
                if (s0Var3 != null) {
                    ((C4191v0) ((C36570n) s0Var3.f31213c).getValue()).f18472r = new C10100a2(dVar.f31044j, dVar);
                }
                C10222s0 s0Var4 = dVar.f31039e;
                if (s0Var4 != null) {
                    s0Var4.mo10569c();
                }
            }
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.MORE, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "2");
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c2, 31, jSONObject.toString(), (String) null, 4, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostMoreActionUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
