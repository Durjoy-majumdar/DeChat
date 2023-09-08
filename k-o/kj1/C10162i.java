package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cl1.C0668l;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9093q1;
import il1.C9106s1;
import il1.C9111t1;
import il1.C9122u1;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import org.json.JSONObject;
import qo3.C101218e0;
import sg1.C13677a;
import te3.C64337e61;
import te3.C64390ga1;

/* renamed from: kj1.i */
public final class C10162i extends C10538e {

    /* renamed from: h */
    public final int f31099h;

    /* renamed from: i */
    public final String f31100i = "anchorlive.more.extendtrylivetime";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10162i(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31099h = e1Var.f30964K;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31100i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C0668l.m589e3((C0668l) this.f31809a.mo10534b(C0668l.class), (C64337e61) null, 1, (Object) null);
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        mo10811u(e0Var.mo107135b(this.f31099h, C0966R.string.n7i, C0966R.raw.icons_outlined_time));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 2);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31099h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C9093q1 q1Var;
        int i;
        C10125e1 e1Var2 = e1Var;
        C87412m.m108594g(e1Var2, "<this>");
        C10125e1.C10127b bVar = e1Var2.f30988g;
        if (bVar != null) {
            C9093q1 q1Var2 = bVar.f31018k;
            if (q1Var2 == null) {
                q1Var2 = new C9093q1(e1Var2.f30985d, e1Var2.f30982b);
            }
            bVar.f31018k = q1Var2;
        }
        C10125e1.C10127b bVar2 = e1Var2.f30988g;
        if (!(bVar2 == null || (q1Var = bVar2.f31018k) == null)) {
            Class cls = C0668l.class;
            C101218e0 e0Var = new C101218e0(q1Var.f28669a, 1, 2);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = "";
            String string = q1Var.f28669a.getResources().getString(C0966R.string.n7i);
            C87412m.m108593f(string, "context.resources.getStr…increase_free_duration_1)");
            C64390ga1 ga12 = ((C0668l) q1Var.f28670b.mo71262a(cls)).f1577j;
            int i2 = 0;
            if ((ga12 != null ? ga12.f183298g : 0) > 0) {
                string = q1Var.f28669a.getResources().getString(C0966R.string.n7k);
                C87412m.m108593f(string, "context.resources.getStr…increase_free_duration_2)");
                T string2 = q1Var.f28669a.getResources().getString(C0966R.string.n7s);
                C87412m.m108593f(string2, "context.resources.getStr…_time_picker_head_tips_2)");
                f0Var.f27484d = string2;
                i = 2;
            } else {
                T string3 = q1Var.f28669a.getResources().getString(C0966R.string.n7r);
                C87412m.m108593f(string3, "context.resources.getStr…_time_picker_head_tips_1)");
                f0Var.f27484d = string3;
                i = 1;
            }
            e0Var.mo140671q(string);
            e0Var.mo140667n(q1Var.f28669a.getResources().getString(C0966R.string.f7926wf), q1Var.f28669a.getResources().getString(C0966R.string.a18));
            e0Var.mo140675u(q1Var.f28669a.getResources().getColor(C0966R.color.a7f));
            C9106s1 s1Var = new C9106s1(e0Var);
            C9111t1 t1Var = new C9111t1(q1Var, e0Var);
            e0Var.f296373D = s1Var;
            e0Var.f296374E = t1Var;
            C0668l lVar = (C0668l) q1Var.f28670b.mo71262a(cls);
            C64390ga1 ga13 = lVar.f1577j;
            if (ga13 != null) {
                i2 = ga13.f183298g;
            }
            int c3 = lVar.mo629c3(i2 > 0 ? 2 : 1);
            e0Var.mo140662i(C0966R.C0971layout.bzj);
            View view = e0Var.f296384g;
            view.findViewById(C0966R.C0970id.n8r).setBackgroundResource(C0966R.C0969drawable.cmx);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.n8q);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.n8t);
            C9122u1 u1Var = r2;
            C9122u1 u1Var2 = new C9122u1(q1Var, c3, f0Var, textView2, view, i);
            view.setOnClickListener(u1Var);
            if (i == 2) {
                textView.setText(view.getContext().getResources().getString(C0966R.string.n7l));
                C13677a aVar = C13677a.f38723a;
                Context context = view.getContext();
                C87412m.m108593f(context, "context");
                textView2.setText(aVar.mo13061a(context, c3, 2));
            } else {
                textView.setText(view.getContext().getResources().getString(C0966R.string.n7j));
                C13677a aVar2 = C13677a.f38723a;
                Context context2 = view.getContext();
                C87412m.m108593f(context2, "context");
                textView2.setText(aVar2.mo13061a(context2, c3, 1));
            }
            e0Var.mo140655A();
            q1Var.mo9902a().f138632d = i;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 2);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
