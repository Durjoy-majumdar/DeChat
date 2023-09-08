package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import er1.C7919x;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import lj1.C10535c;
import lj1.C10536d;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import org.json.JSONObject;
import sx3.C64197v;

/* renamed from: kj1.r */
public final class C10213r extends C10538e {

    /* renamed from: h */
    public final int f31195h;

    /* renamed from: i */
    public final String f31196i;

    /* renamed from: j */
    public List<C10536d> f31197j;

    /* renamed from: kj1.r$a */
    public static final class C10214a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f31198d;

        public C10214a(C4191v0 v0Var) {
            this.f31198d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreCommentSettingOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f31198d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreCommentSettingOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kj1.r$b */
    public static final class C10215b implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C10213r f31199a;

        public C10215b(C10213r rVar) {
            this.f31199a = rVar;
        }

        public final void onDismiss() {
            this.f31199a.mo10802d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10213r(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31195h = e1Var.f30960G;
        this.f31196i = mo10805j() ? "anchorlive.more.commentmanage" : "startlive.more.commentmanage";
        this.f31197j = C64197v.m75539h(new C10113d(e1Var, i), new C10097a0(e1Var, i), new C10105c(e1Var, i), new C10149g(e1Var, i));
        if (C62042e.f176370a.mo87085i()) {
            C10538e.m10469r(this, 24005, 0, "live_more_comment_management", 2, (Object) null);
        }
    }

    /* renamed from: f */
    public List<C10536d> mo10557f() {
        return this.f31197j;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31196i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        C62042e.f176370a.getClass();
        Log.m105924i("FinderLiveUtil", "hasClickAnchorMoreCommentSettingRedDot");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, Boolean.TRUE);
        int i = this.f31195h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.n95);
        C87412m.m108593f(string, "getContext().resources.g…hor_comment_more_setting)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_live_chats, e1Var.f30985d.getResources().getColor(C0966R.color.FG_0));
        if (!mo10805j()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 5);
            jSONObject.put("type", 1);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 37, jSONObject.toString(), (String) null, 4, (Object) null);
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31195h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        int i = (int) (((double) e1Var.f30985d.getResources().getDisplayMetrics().heightPixels) * 0.6d);
        C4191v0 v0Var = new C4191v0(e1Var.f30985d);
        View inflate = LayoutInflater.from(e1Var.f30985d).inflate(C0966R.C0971layout.bgy, (ViewGroup) null);
        String str = e1Var.f30980a;
        Log.m105924i(str, "showAnchorMoreCommentSettingPanel peekHeight:" + i);
        if (e1Var.f30987f || i <= 0) {
            i = -1;
        }
        v0Var.mo5071f(inflate, new FrameLayout.LayoutParams(-1, i));
        View view = v0Var.f18463f;
        view.findViewById(C0966R.C0970id.o1s).setOnClickListener(new C10214a(v0Var));
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kpm);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
        v0Var.mo5067b(true);
        v0Var.mo5066a();
        for (C10536d dVar : this.f31197j) {
            C10535c cVar = dVar instanceof C10535c ? (C10535c) dVar : null;
            if (cVar != null) {
                cVar.mo10798m(v0Var);
            }
        }
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMENT, String.valueOf(3), (String) null, 4, (Object) null);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 5);
            jSONObject.put("type", 2);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c2, 37, jSONObject.toString(), (String) null, 4, (Object) null);
        }
        v0Var.f18472r = new C10215b(this);
        v0Var.mo5073h();
    }
}
