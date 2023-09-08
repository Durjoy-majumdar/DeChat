package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import android.widget.TextView;
import cl1.C0702z0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import d14.C58052j1;
import di3.C7335d;
import di3.C86312j;
import er1.C7919x;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import lj1.C10535c;
import lj1.C10536d;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import org.json.JSONObject;
import sx3.C64197v;

/* renamed from: kj1.l2 */
public final class C10187l2 extends C10538e {

    /* renamed from: h */
    public final int f31153h;

    /* renamed from: i */
    public final String f31154i = "audience.more.morefunction";

    /* renamed from: j */
    public List<C10536d> f31155j;

    /* renamed from: kj1.l2$a */
    public static final class C10188a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f31156d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31157e;

        public C10188a(C4191v0 v0Var, C10125e1 e1Var) {
            this.f31156d = v0Var;
            this.f31157e = e1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f31156d.mo5072g();
            C10125e1.C10127b bVar = this.f31157e.f30988g;
            if (bVar != null) {
                bVar.f31016i = null;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/VisitorMoreSettingOption$showMoreSettingPanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10187l2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31153h = e1Var.f30959F;
        this.f31155j = C64197v.m75539h(new C10195m2(e1Var, i), new C10182k2(e1Var, i), new C10145f2(e1Var, i), new C10138e2(e1Var, i));
    }

    /* renamed from: f */
    public List<C10536d> mo10557f() {
        return this.f31155j;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31154i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        C62042e eVar = C62042e.f176370a;
        eVar.getClass();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_HAS_SHOW_MORE_SETTING_BOOLEAN_SYNC;
        boolean g = i.mo119686g(aVar, false);
        StringBuilder sb = new StringBuilder();
        sb.append("canShowVisitorMoreSettingRedDot:");
        sb.append(!g);
        Log.m105924i("FinderLiveUtil", sb.toString());
        eVar.getClass();
        Log.m105924i("FinderLiveUtil", "hasClickVisitorMoreSettingRedDot");
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
        int i2 = this.f31153h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.n9d);
        C87412m.m108593f(string, "getContext().resources.g…more_action_more_setting)");
        mo10808n(e0Var, i2, string, C0966R.raw.icons_outlined_more2, e1Var.f30985d.getResources().getColor(C0966R.color.FG_0));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 4);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31153h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C87412m.m108594g(e1Var, "<this>");
        mo10560v(false);
    }

    /* renamed from: v */
    public final void mo10560v(boolean z) {
        T t;
        C4191v0 v0Var;
        C4191v0 v0Var2;
        View view;
        C4191v0 v0Var3;
        C4191v0 v0Var4;
        C10125e1 e1Var = this.f31809a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 4);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (bVar != null) {
            bVar.f31016i = new C4191v0(e1Var.f30985d);
        }
        C10125e1.C10127b bVar2 = e1Var.f30988g;
        if (!(bVar2 == null || (v0Var4 = bVar2.f31016i) == null)) {
            v0Var4.mo5070e(C0966R.C0971layout.d69);
            View view2 = v0Var4.f18463f;
            view2.findViewById(C0966R.C0970id.o1s).setOnClickListener(new C10188a(v0Var4, e1Var));
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.kpm);
            if (textView != null) {
                C7919x.m8091a(textView);
            }
            v0Var4.mo5067b(true);
            v0Var4.mo5066a();
        }
        C10125e1.C10127b bVar3 = e1Var.f30988g;
        C10145f2 f2Var = null;
        if (!(bVar3 == null || (v0Var3 = bVar3.f31016i) == null)) {
            for (C10536d dVar : this.f31155j) {
                C10535c cVar = dVar instanceof C10535c ? (C10535c) dVar : null;
                if (cVar != null) {
                    cVar.mo10798m(v0Var3);
                }
            }
        }
        Iterator<T> it = this.f31155j.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C10536d) t) instanceof C10145f2) {
                break;
            }
        }
        if (t instanceof C10145f2) {
            f2Var = (C10145f2) t;
        }
        if (f2Var != null) {
            f2Var.f31069i = z;
        }
        C10125e1.C10127b bVar4 = e1Var.f30988g;
        if (!(bVar4 == null || (v0Var2 = bVar4.f31016i) == null || (view = v0Var2.f18463f) == null)) {
            Class cls = C0702z0.class;
            View findViewById = view.findViewById(C0966R.C0970id.f357826kj2);
            View findViewById2 = view.findViewById(C0966R.C0970id.f357827kj3);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view.findViewById(C0966R.C0970id.ooz);
            if (((C0702z0) e1Var.mo10534b(cls)).mo670d3()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c((Object) null);
                View view4 = findViewById2;
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMSwitchBtn.setCheck(((Boolean) ((C58052j1) ((C0702z0) e1Var.mo10534b(cls)).f1688y).getValue()).booleanValue());
                C10119d1.f30943a.mo10530a(4, 0, 4, 1);
                mMSwitchBtn.setSwitchListener(new C10180k0(e1Var));
            } else {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view5 = findViewById2;
                View view6 = findViewById;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view7 = view5;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C10125e1.C10127b bVar5 = e1Var.f30988g;
        if (bVar5 != null && (v0Var = bVar5.f31016i) != null) {
            v0Var.mo5073h();
        }
    }
}
