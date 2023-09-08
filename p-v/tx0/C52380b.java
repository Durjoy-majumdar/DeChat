package tx0;

import android.content.Context;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import iy0.C46353a;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import sx3.C26236u;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import z04.C119027c;

/* renamed from: tx0.b */
public final class C52380b<T extends C53095a> extends C43620m2<T> {
    /* renamed from: b */
    public String mo5382b() {
        return "savePageData";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<T>.a aVar) {
        C53096b<T>.a aVar2 = aVar;
        if (aVar2 != null) {
            Log.m105918d("MicroMsg.GamePrefetchJsApiSavePageData", "[game-web-prefetch] savePageData invokeInOwn");
            JSONObject jSONObject = aVar2.f148190b.f129368c;
            String optString = jSONObject.optString("pageUrl");
            C87412m.m108593f(optString, "url");
            if (optString.length() == 0) {
                aVar2.mo73778c("pageUrl is empty", (JSONObject) null);
                return;
            }
            if (C40714i.m43961j(optString).length() == 0) {
                aVar2.mo73778c("host invalid", (JSONObject) null);
                return;
            }
            String optString2 = jSONObject.optString("content");
            C87412m.m108593f(optString2, "content");
            if (optString2.length() == 0) {
                aVar2.mo73778c("content is empty", (JSONObject) null);
                return;
            }
            String i = C40714i.m43960i(optString, false);
            C48558d.C48560b bVar = C48558d.f129896H;
            C48556b bVar2 = C48558d.f129901M;
            C40717k0.f109363a.getClass();
            C46353a aVar3 = r4;
            C46353a aVar4 = new C46353a(optString, i, bVar2, C40717k0.f109365c, (String) null, (String) null, (Boolean) null, (C48555a) null, false, (String) null, (String) null, 2032, (C8480h) null);
            C46353a aVar5 = aVar3;
            C48556b bVar3 = aVar5.f124921c;
            C87412m.m108591d(bVar3);
            String i2 = C86013q1.m106448i(bVar3.mo73172B(aVar5.mo71762d()).mo119976n(), true);
            String str = optString2;
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            int T = C86013q1.m106438T(i2, bytes, 0, bytes.length);
            Log.m105924i("MicroMsg.GamePrefetchJsApiSavePageData", "[game-web-prefetch] savePageData content: " + str.length() + ", targetPath: " + i2 + ", webId: " + aVar5.f124920b + ", bizId: " + aVar5.mo71762d() + ", url: " + optString + ", ret: " + T);
            if (T != 0) {
                aVar2.mo73778c("save page data error", (JSONObject) null);
                return;
            }
            String optString3 = jSONObject.optString("headers");
            C87412m.m108593f(optString3, "headers");
            if (optString3.length() > 0) {
                Log.m105926v("MicroMsg.GamePrefetchJsApiSavePageData", "[game-web-prefetch] savePageData saveHeaders: " + optString3);
                JSONObject jSONObject2 = new JSONObject(optString3);
                Integer valueOf = Integer.valueOf(jSONObject2.optInt("x-wx-max-cache", -1));
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    aVar5.mo71770l().put("x-wx-max-cache", C26236u.m33719b(String.valueOf(valueOf.intValue())));
                }
                Integer valueOf2 = Integer.valueOf(jSONObject2.optInt("max-age", -1));
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    aVar5.mo71770l().put("max-age", C26236u.m33719b(String.valueOf(valueOf2.intValue())));
                }
                if (jSONObject2.has("status")) {
                    aVar5.mo71770l().put("status", C26236u.m33719b(String.valueOf(jSONObject2.optInt("status", -1))));
                } else {
                    aVar5.mo71770l().put("status", C26236u.m33719b("200"));
                }
                aVar5.mo71784z(C40717k0.C40719b.HTML, C40714i.m43961j(optString));
            }
            aVar.mo73776a();
        }
    }
}
