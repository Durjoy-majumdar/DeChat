package el1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import cp1.C7120d;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: el1.g */
public final class C7746g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26242d;

    public C7746g(C7741d dVar) {
        this.f26242d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7741d dVar = this.f26242d;
        dVar.getClass();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_CHARGE_ANCHOR_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) f).booleanValue()) {
            dVar.mo8863e3();
        } else {
            C7120d dVar2 = new C7120d(dVar.getContext(), true, false, 0);
            String string = dVar2.getContext().getResources().getString(C0966R.string.diz);
            C87412m.m108593f(string, "context.resources.getStr…ive_charge_license_desc2)");
            String string2 = dVar2.getContext().getResources().getString(C0966R.string.dix);
            C87412m.m108593f(string2, "context.resources.getStr…_charge_license_content2)");
            dVar2.mo8273b(false, string, string2, new C7751l(dVar));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
