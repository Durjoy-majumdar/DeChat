package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lj1.C10535c;
import lj1.C10536d;

/* renamed from: kj1.e0 */
public final class C10123e0 extends C10535c {

    /* renamed from: h */
    public final String f30950h = "assistant.more.commentmanage.quickreply";

    /* renamed from: kj1.e0$a */
    public static final class C10124a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10123e0 f30951d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f30952e;

        /* renamed from: f */
        public final /* synthetic */ C4191v0 f30953f;

        public C10124a(C10123e0 e0Var, C10125e1 e1Var, C4191v0 v0Var) {
            this.f30951d = e0Var;
            this.f30952e = e1Var;
            this.f30953f = v0Var;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10536d.m10457e(this.f30951d, false, 1, (Object) null);
            this.f30952e.mo10539g(C58124b.C58125b.FINDER_LIVE_SET_FAST_COMMENT, (Bundle) null);
            this.f30953f.mo5072g();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.QUICK_REPLY_BUTTON, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10123e0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30950h;
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
        View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.lyy);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.QUICK_REPLY_BUTTON, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
        if (findViewById != null) {
            findViewById.setOnClickListener(new C10124a(this, e1Var, v0Var));
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.maa);
    }
}
