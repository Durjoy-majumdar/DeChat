package lo1;

import android.content.Context;
import android.view.View;
import dp1.C7435f2;
import fe1.C58969q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import lo1.C10587b;
import org.json.JSONObject;
import pf1.C62262d0;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: lo1.e */
public final class C10591e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f31944d;

    /* renamed from: e */
    public final /* synthetic */ C10586a f31945e;

    public C10591e(C60905o oVar, C10586a aVar) {
        this.f31944d = oVar;
        this.f31945e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/servicemenu/ProfileMenuConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62262d0 d0Var = C62262d0.f176978a;
        Context context = this.f31944d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C62262d0.m73168c(d0Var, context, this.f31945e.f31939d, 0, (C60905o) null, 12, (Object) null);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context2 = this.f31944d.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C13442s8 f = aVar.mo12873f(context2);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        C10587b.C10588a aVar2 = C10587b.f31940e;
        Context context3 = this.f31944d.f173499A;
        C87412m.m108593f(context3, "holder.context");
        JSONObject a = aVar2.mo10850a(context3, this.f31945e.f31939d.f34827a);
        C58969q qVar = this.f31945e.f31939d.f34835i;
        a.put("finderusername", qVar != null ? qVar.getUsername() : "");
        C7435f2.f25626a.mo8577a(q3, "menu", 1, a);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/servicemenu/ProfileMenuConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
