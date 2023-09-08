package kj1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kj1.C10125e1;
import lj1.C10535c;
import lj1.C10536d;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import sx3.C64197v;

/* renamed from: kj1.h0 */
public final class C10157h0 extends C10538e {

    /* renamed from: h */
    public final int f31092h;

    /* renamed from: i */
    public final String f31093i = "assistant.more.morefunction";

    /* renamed from: j */
    public List<C10536d> f31094j;

    /* renamed from: kj1.h0$a */
    public static final class C10158a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f31095d;

        public C10158a(C4191v0 v0Var) {
            this.f31095d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AssistantMoreFunctionOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f31095d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantMoreFunctionOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kj1.h0$b */
    public static final class C10159b implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C10157h0 f31096a;

        public C10159b(C10157h0 h0Var) {
            this.f31096a = h0Var;
        }

        public final void onDismiss() {
            this.f31096a.mo10802d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10157h0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31092h = e1Var.f30966M;
        this.f31094j = C64197v.m75539h(new C10163i0(e1Var, i), new C10140f0(e1Var, i), new C10117d0(e1Var, i));
        if (C62042e.f176370a.mo87088j()) {
            C10538e.m10469r(this, 24076, 0, (String) null, 6, (Object) null);
        }
    }

    /* renamed from: f */
    public List<C10536d> mo10557f() {
        return this.f31094j;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31093i;
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
        Log.m105924i("FinderLiveUtil", "hasClickAnchorMoreFunctionRedDot");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_FUNCTION_BOOLEAN_SYNC, Boolean.TRUE);
        int i = this.f31092h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9c);
        C87412m.m108593f(string, "getContext().resources.g…ore_action_more_function)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_more2, e1Var.f30985d.getResources().getColor(C0966R.color.FG_0));
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31092h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C87412m.m108594g(e1Var, "<this>");
        int i = e1Var.f30985d.getResources().getDisplayMetrics().heightPixels;
        int i2 = (int) (((double) i) * 0.6d);
        C4191v0 v0Var = new C4191v0(e1Var.f30985d);
        View inflate = LayoutInflater.from(e1Var.f30985d).inflate(C0966R.C0971layout.bzi, (ViewGroup) null);
        String str = e1Var.f30980a;
        Log.m105924i(str, "showAssistantMoreFunctionSettingPanel peekHeight:" + i2);
        if (e1Var.f30987f) {
            v0Var.mo5071f(inflate, new FrameLayout.LayoutParams(i, i));
        } else {
            if (i2 <= 0) {
                i2 = -2;
            }
            v0Var.mo5071f(inflate, new FrameLayout.LayoutParams(-1, i2));
        }
        v0Var.f18463f.findViewById(C0966R.C0970id.o1s).setOnClickListener(new C10158a(v0Var));
        v0Var.mo5067b(true);
        v0Var.mo5066a();
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (!(bVar == null || (aVar = bVar.f31008a) == null)) {
            aVar.mo10547g();
        }
        for (C10536d dVar : this.f31094j) {
            C10535c cVar = dVar instanceof C10535c ? (C10535c) dVar : null;
            if (cVar != null) {
                cVar.mo10798m(v0Var);
            }
        }
        v0Var.f18472r = new C10159b(this);
        v0Var.mo5073h();
    }
}
