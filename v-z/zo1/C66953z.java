package zo1;

import ak1.C0047e0;
import android.view.View;
import android.view.ViewGroup;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import cp1.C57952m;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import org.json.JSONObject;

/* renamed from: zo1.z */
public final class C66953z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66913a0 f192354d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f192355e;

    public C66953z(C66913a0 a0Var, ViewGroup viewGroup) {
        this.f192354d = a0Var;
        this.f192355e = viewGroup;
    }

    public final void onClick(View view) {
        C57952m mVar;
        Class cls = C54519d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$initOptions$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66913a0 a0Var = this.f192354d;
        Object tag = view.getTag();
        Float f = tag instanceof Float ? (Float) tag : null;
        float floatValue = f != null ? f.floatValue() : 1.0f;
        ((C54519d) a0Var.business(cls)).f152840B = floatValue;
        C66925j0 j0Var = (C66925j0) a0Var.mo9307d3(C66925j0.class);
        if (!(j0Var == null || (mVar = j0Var.f192301r) == null)) {
            mVar.f165852a.setPlaySpeed(floatValue);
        }
        a0Var.mo90908n3();
        JSONObject b = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null);
        b.put("select_type", Float.valueOf(((C54519d) this.f192354d.business(cls)).f152840B));
        String jSONObject = b.toString();
        C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…tCurSpeed()) }.toString()");
        ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_speed_select", jSONObject);
        C66913a0.m79045m3(this.f192354d);
        C76912y0.m92773l(this.f192355e.getContext(), this.f192355e.getContext().getResources().getString(C0966R.string.nb9));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$initOptions$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
