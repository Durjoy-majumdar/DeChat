package b00;

import c00.C39881j;
import c00.C39882k;
import c00.C39883l;
import c00.C39885s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import java.util.Map;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import p156gj.C87200o;
import pe3.C89349b;
import qe3.C89625d;
import te3.C50481n2;
import te3.C50624o2;
import te3.C51125rl2;
import te3.C51263sl2;
import te3.C51593us3;
import te3.k54;
import te3.y25;
import u73.C101968a0;
import u73.C101988w;
import u73.C101990z;
import u73.C52464j0;
import u73.C78137s0;

@C86522b
/* renamed from: b00.s */
public class C39687s extends C86301e implements C39885s {

    /* renamed from: d */
    public Map<String, String> f106468d = new HashMap();

    /* renamed from: b00.s$a */
    public class C28208a implements l0$$e {
        public C28208a(C39687s sVar) {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105919d("WebSearchService", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (!(i == 0 && i2 == 0)) {
                C115669n.INSTANCE.idkeyStat(457, 1, 1, false);
            }
            return 0;
        }
    }

    /* renamed from: Hr */
    public C39883l mo62256Hr(C51593us3 us32) {
        return new C52464j0(us32);
    }

    /* renamed from: Ik */
    public void mo62257Ik(int i, String str) {
        C51263sl2 sl22 = new C51263sl2();
        sl22.f141588d = i;
        sl22.f141590f = (int) (System.currentTimeMillis() / 1000);
        sl22.f141591g = 1;
        sl22.f141589e = new C89349b(str.getBytes());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50481n2();
        bVar.f127067b = new C50624o2();
        bVar.f127068c = "/cgi-bin/mmux-bin/adlog";
        bVar.f127069d = 1802;
        C47350c a = bVar.mo72403a();
        C50481n2 n2Var = (C50481n2) a.f127055a.f127080a;
        C51125rl2 rl22 = new C51125rl2();
        rl22.f141006d = C89625d.f257837c;
        rl22.f141007e = C89625d.f257836b;
        rl22.f141008f = C89625d.f257839e;
        rl22.f141009g = C87200o.f252873f;
        rl22.f141010h = LocaleUtil.getApplicationLanguage();
        rl22.f141011i = (int) (System.currentTimeMillis() / 1000);
        n2Var.f138335d = rl22;
        n2Var.f138336e.add(sl22);
        C89144l0.m111429e(a, new C28208a(this), false);
    }

    public String Nn0(String str) {
        return (String) ((HashMap) this.f106468d).get(str);
    }

    /* renamed from: VI */
    public boolean mo62259VI(C117747y yVar) {
        return yVar instanceof C101988w;
    }

    /* renamed from: W9 */
    public k54 mo62260W9(C117747y yVar) {
        return ((C101990z) yVar).f300314o;
    }

    public C39882k j40(String str, int i, String str2, String str3, int i2, String str4, int i3, String str5, String str6) {
        return new C101990z(str, i, str2, str3, i2, str4, i3, str5, str6);
    }

    public C39881j l10(C101968a0 a0Var) {
        return new C101988w(a0Var);
    }

    /* renamed from: p4 */
    public JSONObject mo62263p4(String str) {
        return C78137s0.m94340d("discoverRecommendEntry");
    }

    public boolean r30(C117747y yVar) {
        return yVar instanceof C101990z;
    }

    public void ra0(int i) {
    }

    public String y70() {
        return C43471q.m46978b(3);
    }

    /* renamed from: yl */
    public y25 mo62267yl(C117747y yVar) {
        return ((C101988w) yVar).f300304g;
    }
}
