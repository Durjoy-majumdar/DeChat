package kf1;

import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39994x1;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C87412m;
import je1.C46529p4;
import jq3.C60905o;
import nj3.C11184p0;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49982je3;
import te3.C50951qe3;
import te3.z74;
import z04.C112551y;

/* renamed from: kf1.a7 */
public final class C46695a7 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C46697b7 f125710d;

    /* renamed from: e */
    public final /* synthetic */ C39994x1 f125711e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f125712f;

    /* renamed from: g */
    public final /* synthetic */ int f125713g;

    public C46695a7(C46697b7 b7Var, C39994x1 x1Var, RecyclerView.C16613e<C60905o> eVar, int i) {
        this.f125710d = b7Var;
        this.f125711e = x1Var;
        this.f125712f = eVar;
        this.f125713g = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C50951qe3 qe32;
        C49982je3 je32;
        if (menuItem.getItemId() == 10002) {
            C46697b7 b7Var = this.f125710d;
            C39994x1 x1Var = this.f125711e;
            b7Var.getClass();
            String str = x1Var.f107216d.f141491e;
            if (!(str == null || str.length() == 0)) {
                C46704t6 t6Var = b7Var.f125716e;
                t6Var.getClass();
                C87412m.m108594g(str, "poiId");
                C86709a0.m107524d().mo123460f(new C46529p4(t6Var.f125728d, str));
            }
            z74 z74 = x1Var.f107216d.f141490d;
            if (!(z74 == null || (qe32 = z74.f145743d) == null || (je32 = qe32.f140264d) == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("poi_name", je32.f136053e);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(b7Var.f125715d);
                y0Var.Cx0(1, "profile_poiMngmt_del", n, f != null ? f.mo12861q3() : null);
            }
            if (this.f125710d.f125716e.f125732h.remove(this.f125711e)) {
                this.f125712f.notifyItemRemoved(this.f125713g);
            }
        }
    }
}
