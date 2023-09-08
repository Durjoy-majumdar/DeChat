package kj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9028j4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import lj1.C10535c;
import lj1.C10536d;
import org.json.JSONObject;

/* renamed from: kj1.g */
public final class C10149g extends C10535c {

    /* renamed from: h */
    public final String f31077h;

    /* renamed from: kj1.g$a */
    public static final class C10150a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10149g f31078d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31079e;

        /* renamed from: f */
        public final /* synthetic */ C4191v0 f31080f;

        public C10150a(C10149g gVar, C10125e1 e1Var, C4191v0 v0Var) {
            this.f31078d = gVar;
            this.f31079e = e1Var;
            this.f31080f = v0Var;
        }

        public final void onClick(View view) {
            C9028j4 j4Var;
            C54067f0.C0064m mVar = C54067f0.C0064m.QUICK_REPLY_BUTTON;
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f31078d.mo10805j()) {
                this.f31079e.mo10539g(C58124b.C58125b.FINDER_LIVE_SET_FAST_COMMENT, (Bundle) null);
                this.f31080f.mo5072g();
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_COMMENT, String.valueOf(6), (String) null, 4, (Object) null);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("element", 5);
                jSONObject.put("type", 0);
                jSONObject.put("sub_element", 4);
                jSONObject.put("sub_type", 5);
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject.toString(), (String) null, 4, (Object) null);
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c4, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
                C10125e1 e1Var = this.f31079e;
                C10125e1.C10132d dVar = e1Var.f30989h;
                if ((dVar != null ? dVar.f31038d : null) == null && dVar != null) {
                    C45795b bVar = e1Var.f30982b;
                    dVar.f31038d = bVar != null ? new C9028j4(e1Var.f30985d, bVar) : null;
                }
                C10125e1.C10132d dVar2 = this.f31079e.f30989h;
                if (!(dVar2 == null || (j4Var = dVar2.f31038d) == null)) {
                    j4Var.mo9846d();
                }
            }
            C10536d.m10457e(this.f31078d, false, 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10149g(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31077h = mo10805j() ? "anchorlive.more.commentmanage.quickreply" : "startlive.more.commentmanage.quickreply";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31077h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86185q.mo60266n().intValue() == 1;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "moreCommentSettingBottomSheet");
        View view = v0Var.f18463f;
        View findViewById = view.findViewById(C0966R.C0970id.bn6);
        View findViewById2 = view.findViewById(C0966R.C0970id.lyy);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.QUICK_REPLY_BUTTON, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
        findViewById2.setOnClickListener(new C10150a(this, e1Var, v0Var));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.mlw);
    }
}
