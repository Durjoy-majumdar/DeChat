package u73;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C86493v0;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kr0.C10403n0;
import lg3.C88494d;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p680ru.C101464l;
import p702ts.C78085c;
import pe3.C89349b;
import te3.C48884bn2;
import te3.C49768hy;
import te3.C50670oe3;
import te3.C64342ej;
import te3.d75;
import te3.t25;
import te3.ve4;
import te3.x25;
import te3.y25;
import te3.z64;
import te3.zo4;

/* renamed from: u73.f0 */
public class C101974f0 extends C101967a implements C1311n {

    /* renamed from: i */
    public C11385n f300253i;

    /* renamed from: j */
    public C47350c f300254j;

    /* renamed from: n */
    public int f300255n;

    /* renamed from: o */
    public int f300256o;

    /* renamed from: p */
    public y25 f300257p;

    /* renamed from: q */
    public x25 f300258q;

    /* renamed from: r */
    public C101968a0 f300259r;

    /* renamed from: s */
    public long f300260s = 0;

    public C101974f0(C101968a0 a0Var) {
        String str;
        float f;
        String str2;
        C86493v0.C86495c e;
        C101968a0 a0Var2 = a0Var;
        long j = 0;
        this.f300259r = a0Var2;
        String str3 = a0Var2.f300187b;
        this.f300175e = str3;
        this.f300177g = a0Var2.f300210y;
        this.f300176f = a0Var2.f300188c;
        this.f300174d = a0Var2.f300202q;
        this.f300255n = a0Var2.f300186a;
        this.f300178h = a0Var2.f300211z;
        if (!Util.isNullOrNil(str3)) {
            Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "Constructors: keyword=%s", a0Var2.f300187b);
            int i = a0Var2.f300191f;
            this.f300256o = i;
            C47350c.C47352b bVar = new C47350c.C47352b();
            if (a0Var2.f300204s == 1) {
                bVar.f127069d = 2676;
                str = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsearch";
            } else if (a0Var2.f300179A == 1) {
                bVar.f127069d = 1011;
                str = "/cgi-bin/mmsearch-bin/chatsearch";
            } else if (a0Var2.f300182D) {
                bVar.f127069d = 4858;
                str = "/cgi-bin/mmsearch-bin/mmtagsearch";
            } else if (i == 123 || i == 125 || (1000 <= i && i <= 1500)) {
                bVar.f127069d = 11451;
                str = "/cgi-bin/mmsearch-bin/mmwebfindersearch";
            } else {
                bVar.f127069d = 719;
                str = "/cgi-bin/micromsg-bin/mmwebsearch";
            }
            bVar.f127068c = str;
            Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "NetSceneWebSearch cgi is:%s", str);
            bVar.f127066a = new x25();
            bVar.f127067b = new y25();
            C47350c a = bVar.mo72403a();
            this.f300254j = a;
            x25 x25 = (x25) a.f127055a.f127080a;
            this.f300258q = x25;
            x25.f299826e = a0Var2.f300187b;
            x25.f299825d = a0Var2.f300186a;
            x25.f299828g = (long) a0Var2.f300189d;
            x25.f299830i = C101987v0.m134273g();
            x25 x252 = this.f300258q;
            x252.f299827f = a0Var2.f300188c;
            x252.f299829h = C43471q.m46977a(0);
            x25 x253 = this.f300258q;
            x253.f299831j = a0Var2.f300190e;
            x253.f299832n = a0Var2.f300191f;
            x253.f299833o = a0Var2.f300192g;
            x253.f299834p = a0Var2.f300193h;
            x253.f299835q = a0Var2.f300194i;
            x253.f299837s = a0Var2.f300196k;
            x253.f299836r = a0Var2.f300195j;
            x253.f299838t = a0Var2.f300197l;
            LinkedList<C49768hy> linkedList = a0Var2.f300200o;
            x253.f299841w = linkedList;
            ve4 ve4 = null;
            if (!Util.isNullOrNil((List) linkedList)) {
                Iterator<C49768hy> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    C49768hy next = it.next();
                    if (next != null && "parentSearchID".equals(next.f134951d)) {
                        str2 = next.f134953f;
                        break;
                    }
                }
                Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "parentSearchID=%s", str2);
                if (!Util.isNullOrNil(str2) && (e = C86493v0.m107224d().mo120948e(str2)) != null) {
                    String f2 = e.mo120959f("extQueryInfo", "");
                    if (!Util.isNullOrNil(f2)) {
                        C49768hy hyVar = new C49768hy();
                        hyVar.f134951d = "extQueryInfo";
                        hyVar.f134953f = f2;
                        linkedList.add(hyVar);
                    }
                }
            }
            x25 x254 = this.f300258q;
            x254.f299840v = a0Var2.f300199n;
            x254.f299842x = a0Var2.f300201p;
            x254.f299843y = a0Var2.f300203r;
            x254.f299817A = a0Var2.f300207v;
            x254.f299822F = C85875k4.m106211z() ? 1 : 0;
            this.f300258q.f299823G = C101987v0.m134272f();
            x25 x255 = this.f300258q;
            int i2 = this.f300256o;
            if (i2 == 79 || i2 == 80) {
                ve4 ve42 = new ve4();
                ve42.f185878f = 1;
                String str4 = a0Var2.f300184F;
                if (!TextUtils.isEmpty(str4)) {
                    String[] split = str4.split("#");
                    int i3 = this.f300256o;
                    if (i3 == 79) {
                        if (split.length >= 2) {
                            ve42.f185876d = split[0];
                            ve42.f185880h = split[1];
                        }
                    } else if (i3 == 80 && split.length >= 3) {
                        ve42.f185876d = split[0];
                        ve42.f185880h = split[1];
                        ve42.f185877e = split[2];
                    }
                    ve42.f185879g = a0Var2.f300185G;
                    ve4 = ve42;
                }
            }
            x255.f299824H = ve4;
            if (a0Var2.f300206u == null) {
                a0Var2.f300206u = new t25();
            }
            t25 t25 = a0Var2.f300206u;
            if (t25.f185478e == null) {
                t25.f185478e = new C64342ej();
            }
            C64342ej ejVar = a0Var2.f300206u.f185478e;
            int i4 = MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels;
            ejVar.f182982q = XWalkEnvironment.getUsingCustomContext() ? Math.round(((float) i4) / C76577a.m92156g(MMApplicationContext.getContext())) : Math.round(((float) i4) / C88494d.m110349f());
            Log.m105927v("MicroMsg.WebSearch.NetSceneWebSearch", "width px %d, dp %d, density %f", Integer.valueOf(MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels), Integer.valueOf(a0Var2.f300206u.f185478e.f182982q), Float.valueOf(MMApplicationContext.getContext().getResources().getDisplayMetrics().density));
            float f3 = 0.0f;
            if (this.f300258q.f299830i != null) {
                a0Var2.f300206u.f185478e.f182980o = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126413g() ^ true ? 1 : 0;
                C48884bn2 bn22 = this.f300258q.f299830i;
                f3 = bn22.f131219d;
                f = bn22.f131220e;
            } else {
                a0Var2.f300206u.f185478e.f182980o = 1;
                f = 0.0f;
            }
            Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "websearch location: longitude[%f], latitude[%f], isUsingCached[%d]", Float.valueOf(f3), Float.valueOf(f), Integer.valueOf(a0Var2.f300206u.f185478e.f182980o));
            if (!TextUtils.isEmpty(a0Var2.f300209x)) {
                try {
                    JSONObject jSONObject = new JSONObject(URLDecoder.decode(a0Var2.f300209x));
                    C50670oe3 oe32 = new C50670oe3();
                    oe32.f139120f = jSONObject.optString("city");
                    oe32.f139119e = jSONObject.optString("country");
                    oe32.f139122h = (float) jSONObject.optDouble("latitude");
                    oe32.f139123i = (float) jSONObject.optDouble("longitude");
                    oe32.f139118d = jSONObject.optString("poiId");
                    oe32.f139121g = jSONObject.optString("poiName");
                    String optString = jSONObject.optString("snsId");
                    if (!TextUtils.isEmpty(optString)) {
                        j = new BigInteger(optString).longValue();
                        Log.m105925i("MicroMsg.WebSearch.WebSearchApiLogic", "seq %s to snsId %d ", optString, Long.valueOf(j));
                    }
                    oe32.f139125n = j;
                    if (!TextUtils.isEmpty(oe32.f139118d)) {
                        this.f300258q.f299821E = oe32;
                    }
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneWebSearch", e2, "", new Object[0]);
                }
            }
            t25 t252 = a0Var2.f300206u;
            if (t252 != null) {
                try {
                    t252.f185479f = ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10716WC();
                    this.f300258q.f299818B = new C89349b(a0Var2.f300206u.toByteArray());
                    C64342ej ejVar2 = a0Var2.f300206u.f185478e;
                    Log.m105927v("MicroMsg.WebSearch.NetSceneWebSearch", "ctrl_type %d, appid %s, ext %s", Long.valueOf(a0Var2.f300206u.f185477d), ejVar2.f182972d, ejVar2.f182975g);
                } catch (Exception unused) {
                }
            }
            d75 d75 = a0Var2.f300205t;
            if (d75 != null) {
                try {
                    this.f300258q.f299844z = new C89349b(d75.toByteArray());
                } catch (Exception unused2) {
                }
            }
            Object[] objArr = new Object[7];
            objArr[0] = Boolean.valueOf(this.f300258q.f299830i != null);
            objArr[1] = Integer.valueOf(a0Var2.f300190e.size());
            objArr[2] = Integer.valueOf(a0Var2.f300191f);
            objArr[3] = Integer.valueOf(a0Var2.f300189d);
            objArr[4] = Integer.valueOf(this.f300255n);
            objArr[5] = Integer.valueOf(a0Var2.f300193h);
            objArr[6] = Integer.valueOf(a0Var2.f300202q);
            Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "contains location = %b | matchUserSize=%d | scene=%d | businessType=%d | isHomePage=%b | sceneActionType=%d | webViewId=%d", objArr);
            if (this.f300258q.f299830i != null) {
                C48884bn2 bn23 = this.f300258q.f299830i;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2005, bn23.f131219d, bn23.f131220e, bn23.f131221f);
            }
            C14136q0.m13474f(4, a0Var2.f300191f, a0Var2.f300207v, a0Var2.f300208w, a0Var2.f300192g, a0Var2.f300188c, a0Var2.f300186a == 1, a0Var2.f300210y, true, a0Var2.f300187b, "", a0Var2.f300189d);
            return;
        }
        Log.m105920e("MicroMsg.WebSearch.NetSceneWebSearch", "keyword is unavailable");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300260s = C31543z5.m39453c();
        C22613h1.m26482h(this.f300256o, 2, 0, 0, "");
        this.f300253i = nVar;
        return dispatch(gVar, this.f300254j, this);
    }

    public int getType() {
        C101968a0 a0Var = this.f300259r;
        if (a0Var.f300179A == 1) {
            return 1011;
        }
        return a0Var.f300182D ? 4858 : 719;
    }

    /* renamed from: j1 */
    public String mo73412j1() {
        y25 y25 = this.f300257p;
        return y25 != null ? y25.f145094f : "";
    }

    /* renamed from: k1 */
    public int mo73413k1() {
        y25 y25 = this.f300257p;
        if (y25 != null) {
            return y25.f145092d;
        }
        return 0;
    }

    /* renamed from: l1 */
    public void mo141489l1(LinkedList<zo4> linkedList) {
        this.f300258q.f299831j = linkedList;
        z64 z64 = new z64();
        z64.f145727d = linkedList.size();
        this.f300258q.f299819C = z64;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.WebSearch.NetSceneWebSearch", "onGYNetEnd netId %d | errType %d | errCode %d | errMsg %s useTime: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Long.valueOf(C31543z5.m39451a() - this.f300260s));
        boolean z = i4 == 0 && i5 == 0;
        if (i4 == 0 && i5 == 0) {
            y25 y25 = (y25) this.f300254j.f127056b.f127083a;
            this.f300257p = y25;
            if (y25 != null) {
                C101968a0 a0Var = this.f300259r;
                C14136q0.m13474f(7, a0Var.f300191f, a0Var.f300207v, a0Var.f300208w, a0Var.f300192g, a0Var.f300188c, a0Var.f300186a == 1, a0Var.f300210y, z, a0Var.f300187b, "", a0Var.f300189d);
                Log.m105927v("MicroMsg.WebSearch.NetSceneWebSearch", "return data\n%s", this.f300257p.f145094f);
            }
            this.f300253i.onSceneEnd(i4, i5, str2, this);
            C22613h1.m26482h(this.f300256o, 3, i4, i5, "");
            return;
        }
        this.f300253i.onSceneEnd(i4, i5, str2, this);
        C101968a0 a0Var2 = this.f300259r;
        C14136q0.m13474f(7, a0Var2.f300191f, a0Var2.f300207v, a0Var2.f300208w, a0Var2.f300192g, a0Var2.f300188c, a0Var2.f300186a == 1, a0Var2.f300210y, z, a0Var2.f300187b, "", a0Var2.f300189d);
        C22613h1.m26482h(this.f300256o, 3, i4, i5, "");
    }
}
