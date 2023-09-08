package kj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI39;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;
import lj1.C10535c;
import lj1.C10536d;
import org.json.JSONObject;

/* renamed from: kj1.a0 */
public final class C10097a0 extends C10535c {

    /* renamed from: h */
    public final String f30896h;

    /* renamed from: kj1.a0$a */
    public static final class C10098a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f30897d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f30898e;

        /* renamed from: f */
        public final /* synthetic */ C10097a0 f30899f;

        public C10098a(C10125e1 e1Var, C4191v0 v0Var, C10097a0 a0Var) {
            this.f30897d = e1Var;
            this.f30898e = v0Var;
            this.f30899f = a0Var;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f30897d.f30985d, OccupyFinderUI39.class);
            MMActivity mMActivity = this.f30897d.f30985d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f30898e.mo5072g();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0 f0Var = C54108o.f151869h;
            ((C54108o) c).Rx0("live_sensitive_word_button", "view_clk", (Map<String, ? extends Object>) null);
            C10536d.m10457e(this.f30899f, false, 1, (Object) null);
            if (this.f30899f.mo10805j()) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_COMMENT, String.valueOf(4), (String) null, 4, (Object) null);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("element", 5);
                jSONObject.put("type", 0);
                jSONObject.put("sub_element", 2);
                jSONObject.put("sub_type", 3);
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject.toString(), (String) null, 4, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10097a0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30896h = mo10805j() ? "anchorlive.more.commentmanage.sensitivity" : "startlive.more.commentmanage.sensitivity";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30896h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "moreCommentSettingBottomSheet");
        View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.mcl);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C10098a(e1Var, v0Var, this));
        }
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54067f0 f0Var = C54108o.f151869h;
        ((C54108o) c).Rx0("live_sensitive_word_button", "view_exp", (Map<String, ? extends Object>) null);
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.ooc);
    }
}
