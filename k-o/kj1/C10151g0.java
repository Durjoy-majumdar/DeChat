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

/* renamed from: kj1.g0 */
public final class C10151g0 extends C10538e {

    /* renamed from: h */
    public final int f31081h;

    /* renamed from: i */
    public final String f31082i = "assistant.more.commentmanage";

    /* renamed from: j */
    public List<C10536d> f31083j;

    /* renamed from: kj1.g0$a */
    public static final class C10152a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f31084d;

        public C10152a(C4191v0 v0Var) {
            this.f31084d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AssistantMoreCommentSettingOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f31084d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantMoreCommentSettingOption$onItemClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kj1.g0$b */
    public static final class C10153b implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C10151g0 f31085a;

        public C10153b(C10151g0 g0Var) {
            this.f31085a = g0Var;
        }

        public final void onDismiss() {
            this.f31085a.mo10802d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10151g0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31081h = e1Var.f30965L;
        this.f31083j = C64197v.m75539h(new C10107c0(e1Var, i), new C10123e0(e1Var, i));
        if (C62042e.f176370a.mo87085i()) {
            C10538e.m10469r(this, 24071, 0, (String) null, 6, (Object) null);
        }
    }

    /* renamed from: f */
    public List<C10536d> mo10557f() {
        return this.f31083j;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31082i;
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
        int i = this.f31081h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.n95);
        C87412m.m108593f(string, "getContext().resources.g…hor_comment_more_setting)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_live_chats, e1Var.f30985d.getResources().getColor(C0966R.color.FG_0));
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31081h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C87412m.m108594g(e1Var, "<this>");
        int i = e1Var.f30985d.getResources().getDisplayMetrics().heightPixels;
        int i2 = (int) (((double) i) * 0.6d);
        C4191v0 v0Var = new C4191v0(e1Var.f30985d);
        View inflate = LayoutInflater.from(e1Var.f30985d).inflate(C0966R.C0971layout.bzh, (ViewGroup) null);
        String str = e1Var.f30980a;
        Log.m105924i(str, "showAnchorMoreCommentSettingPanel peekHeight:" + i2);
        if (e1Var.f30987f) {
            v0Var.mo5071f(inflate, new FrameLayout.LayoutParams(i, i));
        } else {
            if (i2 <= 0) {
                i2 = -2;
            }
            v0Var.mo5071f(inflate, new FrameLayout.LayoutParams(-1, i2));
        }
        v0Var.f18463f.findViewById(C0966R.C0970id.o1s).setOnClickListener(new C10152a(v0Var));
        v0Var.mo5067b(true);
        v0Var.mo5066a();
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (!(bVar == null || (aVar = bVar.f31008a) == null)) {
            aVar.mo10547g();
        }
        for (C10536d dVar : this.f31083j) {
            C10535c cVar = dVar instanceof C10535c ? (C10535c) dVar : null;
            if (cVar != null) {
                cVar.mo10798m(v0Var);
            }
        }
        v0Var.f18472r = new C10153b(this);
        v0Var.mo5073h();
    }
}
