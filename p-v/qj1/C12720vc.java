package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import di3.C7335d;
import di3.C86312j;
import er1.C7802g1;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import org.json.JSONObject;
import p565ir.C60606n;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C51559uk1;
import zc1.C66785b;

/* renamed from: qj1.vc */
public final class C12720vc extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C49098d51 f36442d;

    /* renamed from: e */
    public final /* synthetic */ C51559uk1 f36443e;

    /* renamed from: f */
    public final /* synthetic */ C12572oc f36444f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<NoticeGetCouponView> f36445g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12720vc(C49098d51 d512, C51559uk1 uk12, C12572oc ocVar, C8479f0<NoticeGetCouponView> f0Var) {
        super(0);
        this.f36442d = d512;
        this.f36443e = uk12;
        this.f36444f = ocVar;
        this.f36445g = f0Var;
    }

    public Object invoke() {
        C51559uk1 a;
        String str;
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        String str2 = this.f36442d.f132122h;
        String str3 = this.f36443e.f142894e;
        wVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("commerceAction", 1014);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("noticeid", str2);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("coupon_id", str3);
        C54116w.Ex0(wVar, C54067f0.C54076o0.Commerce, String.valueOf(jSONObject), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C49098d51 d512 = this.f36444f.f36081r;
        if (!(d512 == null || (a = C7802g1.m7949a(d512)) == null || (str = a.f142894e) == null)) {
            C12572oc ocVar = this.f36444f;
            C49098d51 d513 = this.f36442d;
            C8479f0<NoticeGetCouponView> f0Var = this.f36445g;
            String str4 = d513.f132122h;
            String str5 = str4 == null ? "" : str4;
            C12700uc ucVar = new C12700uc(ocVar, f0Var);
            ocVar.getClass();
            Class cls = C55001u.class;
            C66785b bVar = C66785b.f191882e;
            boolean z = bVar.mo90673n0().f131584h == 3;
            C7335d c = C86312j.m106911c(C60606n.class);
            C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
            C60606n nVar = (C60606n) c;
            long j = ((C55001u) ocVar.f36071e.mo71262a(cls)).f154420q.f182392d;
            long j2 = ((C55001u) ocVar.f36071e.mo71262a(cls)).f154416j;
            String str6 = ((C54991o) ocVar.f36071e.mo71262a(C54991o.class)).f154345o;
            String O5 = z ? bVar.mo90662O5() : null;
            C89349b a2 = C89349b.m111674a(((C55001u) ocVar.f36071e.mo71262a(cls)).f154417n);
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            C13598b0 b0Var = C13598b0.f38549a;
            C60606n.C60607a.m70860d(nVar, j, j2, str6, O5, a2, linkedList, str5, ocVar.f36070d, false, ucVar, 256, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
