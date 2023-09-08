package xo1;

import ak1.C0047e0;
import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import te3.C64662qp2;
import zo1.C66925j0;

/* renamed from: xo1.i */
public final class C66393i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66396l f191126d;

    /* renamed from: e */
    public final /* synthetic */ C64662qp2 f191127e;

    public C66393i(C66396l lVar, C64662qp2 qp22) {
        this.f191126d = lVar;
        this.f191127e = qp22;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$WonderfulFragmentListAdapter$WonderfulFragmentHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f191126d.mo90493m3();
        C66925j0 j0Var = (C66925j0) this.f191126d.mo9307d3(C66925j0.class);
        if (j0Var != null) {
            j0Var.mo90917c1((double) this.f191127e.f185060d, false);
        }
        String jSONObject = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
        C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…CommonParams().toString()");
        ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_wonderful_list_click", jSONObject);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$WonderfulFragmentListAdapter$WonderfulFragmentHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
