package kj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lj1.C10535c;
import lj1.C10536d;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: kj1.d0 */
public final class C10117d0 extends C10535c {

    /* renamed from: h */
    public final String f30939h = "assistant.more.morefunction.edittitle";

    /* renamed from: kj1.d0$a */
    public static final class C10118a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10117d0 f30940d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f30941e;

        /* renamed from: f */
        public final /* synthetic */ C4191v0 f30942f;

        public C10118a(C10117d0 d0Var, C10125e1 e1Var, C4191v0 v0Var) {
            this.f30940d = d0Var;
            this.f30941e = e1Var;
            this.f30942f = v0Var;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10536d.m10457e(this.f30940d, false, 1, (Object) null);
            this.f30941e.mo10539g(C58124b.C58125b.FINDER_LIVE_SHOW_DESC_EDIT, (Bundle) null);
            this.f30942f.mo5072g();
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            ((C54116w) c).Hx0(1, (String) null);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.ANNOUNCEMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10117d0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30939h;
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
        View view = v0Var.f18463f;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C0073g0 g0Var = C0073g0.LIVE_DESC;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 1);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.ANNOUNCEMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
        View findViewById = view.findViewById(C0966R.C0970id.bme);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById2 = view.findViewById(C0966R.C0970id.lxa);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AssistantEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new C10118a(this, e1Var, v0Var));
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.maa);
    }
}
