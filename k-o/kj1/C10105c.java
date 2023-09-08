package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import lj1.C10535c;
import lj1.C10536d;
import ok1.C62042e;
import org.json.JSONObject;

/* renamed from: kj1.c */
public final class C10105c extends C10535c {

    /* renamed from: h */
    public final String f30911h;

    /* renamed from: kj1.c$a */
    public static final class C10106a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f30912d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f30913e;

        /* renamed from: f */
        public final /* synthetic */ C10105c f30914f;

        public C10106a(C10125e1 e1Var, C4191v0 v0Var, C10105c cVar) {
            this.f30912d = e1Var;
            this.f30913e = v0Var;
            this.f30914f = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentManagerOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62042e eVar = C62042e.f176370a;
            C10125e1 e1Var = this.f30912d;
            eVar.mo87009H0(e1Var.f30985d, e1Var.f30982b);
            this.f30913e.mo5072g();
            C10536d.m10457e(this.f30914f, false, 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentManagerOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10105c(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30911h = mo10805j() ? "anchorlive.more.commentmanage.assistant" : "startlive.more.commentmanage.assistant";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30911h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "moreCommentSettingBottomSheet");
        View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.lkh);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C10106a(e1Var, v0Var, this));
        }
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMENT, String.valueOf(5), (String) null, 4, (Object) null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 5);
        jSONObject.put("type", 0);
        jSONObject.put("sub_element", 3);
        jSONObject.put("sub_type", 4);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.j5h);
    }
}
