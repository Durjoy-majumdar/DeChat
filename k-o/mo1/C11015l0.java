package mo1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import fe1.C58969q;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import lo1.C10587b;
import org.json.JSONObject;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: mo1.l0 */
public final class C11015l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32737d;

    /* renamed from: e */
    public final /* synthetic */ C11920q f32738e;

    public C11015l0(FinderProfileHeaderUIC finderProfileHeaderUIC, C11920q qVar) {
        this.f32737d = finderProfileHeaderUIC;
        this.f32738e = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62262d0.m73168c(C62262d0.f176978a, this.f32737d.getContext(), this.f32738e, 0, (C60905o) null, 12, (Object) null);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32737d.getContext());
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject a = C10587b.f31940e.mo10850a(this.f32737d.getContext(), this.f32738e.f34827a);
        C58969q qVar = this.f32738e.f34835i;
        a.put("finderusername", qVar != null ? qVar.getUsername() : "");
        C7435f2.f25626a.mo8577a(q3, "menu", 1, a);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
