package ak1;

import ak1.C54067f0;
import bp1.C54519d;
import cl1.C54991o;
import cl1.C55001u;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import o40.C61926c;
import org.json.JSONObject;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p565ir.C60606n;
import vo1.C65770a0;
import yo1.C16058c;
import zc1.C66785b;

/* renamed from: ak1.e0 */
public final class C0047e0 {

    /* renamed from: a */
    public static final C0047e0 f58a = new C0047e0();

    /* renamed from: b */
    public static JSONObject m34b(C0047e0 e0Var, JSONObject jSONObject, int i, Object obj) {
        int i2 = 1;
        String str = null;
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        e0Var.getClass();
        Class cls = C55001u.class;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C45795b bVar2 = bVar.mo89819a().f189189c;
        String p = C61926c.m72691p(bVar2 != null ? ((C55001u) bVar2.mo71262a(cls)).f154416j : 0);
        C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
        C45795b bVar3 = bVar.mo89819a().f189189c;
        boolean Sj0 = nVar.Sj0(bVar3 != null ? ((C55001u) bVar3.mo71262a(cls)).f154420q : null);
        C45795b bVar4 = bVar.mo89819a().f189189c;
        if (bVar4 != null) {
            str = ((C54991o) bVar4.mo71262a(C54991o.class)).f154345o;
        }
        boolean b = C87412m.m108589b(str, C66785b.f191882e.mo90662O5());
        jSONObject.put("object_id", p);
        jSONObject.put("user_type", b ? 1 : 2);
        if (!Sj0) {
            i2 = 2;
        }
        jSONObject.put("object_type", i2);
        f58a.mo54a(jSONObject);
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo54a(JSONObject jSONObject) {
        String str;
        String str2;
        Class cls = C54519d.class;
        C87412m.m108594g(jSONObject, "jObj");
        C65770a0.C65771b bVar = C65770a0.f189184r;
        C16058c cVar = bVar.mo89819a().f189188b;
        Integer num = null;
        String str3 = cVar != null ? cVar.f43190e : null;
        C16058c cVar2 = bVar.mo89819a().f189188b;
        if (cVar2 != null) {
            num = Integer.valueOf(cVar2.f43191f);
        }
        if (!(str3 == null || str3.length() == 0)) {
            jSONObject.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, str3);
        }
        if (num == null || num.intValue() != 0) {
            jSONObject.put("page_sub_type", num);
        }
        if (C87412m.m108589b(str3, "program_real")) {
            C54519d dVar = (C54519d) bVar.mo89819a().mo89804e(cls);
            String str4 = "";
            if (dVar == null || (str = dVar.f152862y) == null) {
                str = str4;
            }
            jSONObject.put("song_id", str);
            C54519d dVar2 = (C54519d) bVar.mo89819a().mo89804e(cls);
            if (!(dVar2 == null || (str2 = dVar2.f152863z) == null)) {
                str4 = str2;
            }
            jSONObject.put("song_name", str4);
        }
    }

    /* renamed from: c */
    public final void mo55c(boolean z, boolean z2, long j) {
        if (z2) {
            String str = z ? "watch_live_pay_click" : "watch_live_pay_two_click";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("object_id", C61926c.m72691p(j));
            f58a.mo54a(jSONObject);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "this.toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0(str, jSONObject2);
            return;
        }
        Class cls = C54116w.class;
        ((C54116w) C86312j.m106911c(cls)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, z ? 1 : 3, System.currentTimeMillis() - ((C54116w) C86312j.m106911c(cls)).f151950p);
    }
}
