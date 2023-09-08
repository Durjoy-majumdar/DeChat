package lo1;

import android.content.Context;
import android.view.View;
import dp1.C7435f2;
import fe1.C58969q;
import gy3.C87412m;
import jq3.C60905o;
import lo1.C10587b;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: lo1.f */
public final class C10592f extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C60905o f31946a;

    /* renamed from: b */
    public final /* synthetic */ C10586a f31947b;

    public C10592f(C60905o oVar, C10586a aVar) {
        this.f31946a = oVar;
        this.f31947b = aVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f31946a.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C10587b.C10588a aVar2 = C10587b.f31940e;
            Context context2 = this.f31946a.f173499A;
            C87412m.m108593f(context2, "holder.context");
            JSONObject a = aVar2.mo10850a(context2, this.f31947b.f31939d.f34827a);
            C58969q qVar = this.f31947b.f31939d.f34835i;
            a.put("finderusername", qVar != null ? qVar.getUsername() : "");
            C7435f2.f25626a.mo8577a(q3, "menu", 0, a);
        }
    }
}
