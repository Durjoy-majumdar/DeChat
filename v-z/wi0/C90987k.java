package wi0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import s24.C90124b;
import s24.C90125c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lwi0/k;", "Lcom/tencent/mm/plugin/appbrand/jsapi/m;", "<init>", "()V", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: wi0.k */
public final class C90987k implements C1727m {

    /* renamed from: d */
    public final HashSet<String> f261058d = new HashSet<>();

    /* renamed from: e */
    public C81634a f261059e;

    /* renamed from: f */
    public C81298o0 f261060f;

    /* renamed from: a */
    public final void mo125061a(C81634a aVar, C81298o0 o0Var, String str) {
        InputStream g = o0Var.mo113504g(C90124b.m112766a(str, "plugin.json"));
        String str2 = null;
        String d = g == null ? null : C90125c.m112777d(g, StandardCharsets.UTF_8);
        InputStream g2 = o0Var.mo113504g(C90124b.m112766a(str, "plugin-darkmode.json"));
        if (g2 != null) {
            str2 = C90125c.m112777d(g2, StandardCharsets.UTF_8);
        }
        aVar.getClass();
        Map<String, C81634a.C81639e> emptyMap = Collections.emptyMap();
        int i = -1;
        try {
            if (!TextUtils.isEmpty(d)) {
                emptyMap = C81634a.m100134i(new JSONObject(d).optJSONObject("page"), aVar.f239602e);
            }
        } catch (Exception e) {
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(emptyMap == null ? -1 : emptyMap.size());
            objArr[2] = e;
            Log.m105921e("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), parse extPagesJson(%d) get exception:%s", objArr);
        }
        Map<String, C81634a.C81639e> emptyMap2 = Collections.emptyMap();
        try {
            if (!TextUtils.isEmpty(str2)) {
                emptyMap2 = C81634a.m100134i(new JSONObject(str2).optJSONObject("page"), aVar.f239603f);
            }
        } catch (Exception e2) {
            Object[] objArr2 = new Object[3];
            objArr2[0] = str;
            if (emptyMap2 != null) {
                i = emptyMap2.size();
            }
            objArr2[1] = Integer.valueOf(i);
            objArr2[2] = e2;
            Log.m105921e("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), parse extDarkModePagesJson(%d) get exception:%s", objArr2);
        }
        if (!emptyMap.isEmpty() || !emptyMap2.isEmpty()) {
            Log.m105925i("MicroMsg.AppBrandAppConfig", "addPageConfigs(%s), extPages.size:%d, extDarkModePages.size:%d", str, Integer.valueOf(emptyMap.size()), Integer.valueOf(emptyMap2.size()));
            synchronized (aVar.f239604g) {
                ((HashMap) aVar.f239605h).putAll(emptyMap);
                Map<String, C81634a.C81639e> map = aVar.f239606i;
                if (map != null) {
                    map.putAll(emptyMap2);
                }
            }
        }
    }
}
