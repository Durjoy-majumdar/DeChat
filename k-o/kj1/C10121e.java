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

/* renamed from: kj1.e */
public final class C10121e extends C10535c {

    /* renamed from: h */
    public final String f30946h = "anchorlive.more.edittitle";

    /* renamed from: kj1.e$a */
    public static final class C10122a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f30947d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f30948e;

        /* renamed from: f */
        public final /* synthetic */ C10121e f30949f;

        public C10122a(C10125e1 e1Var, C4191v0 v0Var, C10121e eVar) {
            this.f30947d = e1Var;
            this.f30948e = v0Var;
            this.f30949f = eVar;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f30947d.mo10539g(C58124b.C58125b.FINDER_LIVE_SHOW_DESC_EDIT, (Bundle) null);
            this.f30948e.mo5072g();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.LIVE_DESC;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 2);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.ANNOUNCEMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C10536d.m10457e(this.f30949f, false, 1, (Object) null);
            if (this.f30949f.mo10805j()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("element", 6);
                jSONObject2.put("type", 0);
                jSONObject2.put("sub_element", 2);
                jSONObject2.put("sub_type", 4);
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c3, C0073g0.LIVING_MENU, jSONObject2.toString(), (String) null, 4, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption$addItem$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10121e(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30946h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return mo10805j();
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C10125e1 e1Var2 = e1Var;
        C4191v0 v0Var2 = v0Var;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var2, "<this>");
        C87412m.m108594g(v0Var2, "bottomSheet");
        View view = v0Var2.f18463f;
        if (mo10805j()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.LIVE_DESC;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            C13598b0 b0Var = C13598b0.f38549a;
            String jSONObject2 = jSONObject.toString();
            String str = "type";
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject2, (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.ANNOUNCEMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
            View findViewById = view.findViewById(C0966R.C0970id.bme);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = view.findViewById(C0966R.C0970id.lxa);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new C10122a(e1Var2, v0Var2, this));
            }
            if (mo10805j()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("element", 6);
                jSONObject3.put(str, 0);
                jSONObject3.put("sub_element", 2);
                jSONObject3.put("sub_type", 1);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVING_MENU, jSONObject3.toString(), (String) null, 4, (Object) null);
                return;
            }
            return;
        }
        View findViewById3 = view.findViewById(C0966R.C0970id.bme);
        if (findViewById3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById4 = view.findViewById(C0966R.C0970id.lxa);
        if (findViewById4 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.maa);
    }
}
