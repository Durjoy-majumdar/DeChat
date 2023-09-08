package qp1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import cj1.C54789l6;
import cj1.C54804r0;
import cl1.C54979h1;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C60169f4;
import ht1.C8777j5;
import java.util.List;
import np1.C61881v;
import org.json.JSONObject;
import p185kq.C10383h;
import sp1.C64100l0;
import t91.C64208c;
import te3.C64273c21;
import te3.v44;

/* renamed from: qp1.d */
public final class C63309d implements C64100l0.C64102b {

    /* renamed from: a */
    public final /* synthetic */ C63313h f179644a;

    public C63309d(C63313h hVar) {
        this.f179644a = hVar;
    }

    /* renamed from: a */
    public void mo88211a(List<Long> list, boolean z) {
        C87412m.m108594g(list, "allList");
        this.f179644a.f179651b.mo78778a(list, z);
        this.f179644a.f179650a.finish();
    }

    /* renamed from: b */
    public void mo88212b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C64273c21 c212;
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = this.f179644a.f179651b;
        Class cls = C54108o.class;
        C61881v vVar = C61881v.f175961a;
        v44 v44 = finderLiveShoppingManagerPresenter.f160924f;
        if (v44 == null || (str = v44.f185838d) == null) {
            str = "";
        }
        if (v44 == null || (str2 = v44.f185839e) == null) {
            str2 = "";
        }
        long j = v44 != null ? v44.f185840f : 0;
        long j2 = v44 != null ? v44.f185841g : 0;
        if (v44 == null || (str3 = v44.f185842h) == null) {
            str3 = "";
        }
        if (v44 == null || (str4 = v44.f185843i) == null) {
            str4 = "";
        }
        if (v44 == null || (str5 = v44.f185844j) == null) {
            str5 = "";
        }
        if (v44 == null || (str6 = v44.f185845n) == null) {
            str6 = "";
        }
        String obj = Util.getUuidRandom().toString();
        String str7 = "";
        C86299o oVar = new C86299o();
        oVar.f250930b = str;
        oVar.f250934f = vVar.mo86809a(str2, j);
        oVar.f250937i = new C54789l6();
        oVar.f250939k = 1176;
        oVar.f250940l = "post_live_add" + XVFSFile.PATH_SEPARATOR_CHAR + j2 + XVFSFile.PATH_SEPARATOR_CHAR + str3 + "::" + str4 + XVFSFile.PATH_SEPARATOR_CHAR + obj + XVFSFile.PATH_SEPARATOR_CHAR + str5 + XVFSFile.PATH_SEPARATOR_CHAR + str6;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        String str8 = oVar.f250940l;
        C87412m.m108593f(str8, "sceneNote");
        f0Var.getClass();
        f0Var.f151475s = str8;
        C64208c.C64209a aVar = C64208c.f181951a;
        C87412m.m108594g(obj, "<set-?>");
        C64208c.f181967q = obj;
        String str9 = oVar.f250930b;
        C87412m.m108593f(str9, "bundle.appId");
        ((C60169f4) C86312j.m106911c(C60169f4.class)).uv0(3, str9, obj, 1176, str4, "post_live_add", str5);
        vVar.mo86813e(oVar);
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            C54804r0.f153631a.mo75766h(finderLiveShoppingManagerPresenter.f160919a, bVar, oVar, true, new C63305a(finderLiveShoppingManagerPresenter));
        }
        Class cls2 = C54979h1.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 2);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        jSONObject.put("sessionid", f0Var.f151475s);
        String str10 = str7;
        jSONObject.put("shopwindowid", str10);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var.f151452d0 = true;
        C45795b bVar2 = C45795b.f123698n;
        jSONObject.put("appid", bVar2 != null ? ((C54979h1) bVar2.mo71262a(cls2)).f154151z : null);
        C45795b bVar3 = C45795b.f123698n;
        long j3 = (bVar3 == null || (c212 = ((C55001u) bVar3.mo71262a(C55001u.class)).f154420q) == null) ? -1 : c212.f182392d;
        if (j3 < 0) {
            jSONObject.put("liveid", str10);
        } else {
            jSONObject.put("liveid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j3));
        }
        jSONObject.put("clickid", C64208c.f181967q);
        C64208c.f181967q = str10;
        C45795b bVar4 = C45795b.f123698n;
        Object obj2 = str10;
        if (bVar4 != null) {
            C0740i2 i2Var = ((C54979h1) bVar4.mo71262a(cls2)).f154147v;
            obj2 = str10;
            if (i2Var != null) {
                obj2 = Long.valueOf(i2Var.getItemId());
            }
        }
        jSONObject.put("productid", obj2);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
