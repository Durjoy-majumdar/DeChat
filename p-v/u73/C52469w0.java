package u73;

import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import nc0.C76850a;
import te3.C50200l03;
import te3.C50335m03;

/* renamed from: u73.w0 */
public class C52469w0 {

    /* renamed from: a */
    public static C50335m03 f146609a;

    /* renamed from: u73.w0$a */
    public class C52470a implements Comparator<C50200l03> {
        public int compare(Object obj, Object obj2) {
            double d = ((C50200l03) obj).f137122e;
            double d2 = ((C50200l03) obj2).f137122e;
            if (d > d2) {
                return 1;
            }
            return d < d2 ? -1 : 0;
        }
    }

    /* renamed from: a */
    public static void m58723a(String str) {
        String str2 = str;
        C50200l03 l032 = null;
        if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)) && C45628s0.m50738C(str)) {
            if (f146609a == null) {
                m58725c();
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (i < f146609a.f137742d.size()) {
                C50200l03 l033 = f146609a.f137742d.get(i);
                long j = (currentTimeMillis - l033.f137123f) / 86400000;
                int i2 = i;
                double pow = l033.f137122e * Math.pow(0.98d, (double) j);
                l033.f137122e = pow;
                l033.f137123f += j * 86400000;
                Log.m105919d("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "after update: %.2f %d %s", Double.valueOf(pow), Long.valueOf(l033.f137123f), l033.f137121d);
                if (l033.f137121d.equals(str2)) {
                    l032 = l033;
                }
                i = i2 + 1;
            }
            String str3 = "MicroMsg.WebSearch.WebSearchMostSearchBizLogic";
            if (l032 == null) {
                C50200l03 l034 = new C50200l03();
                l034.f137122e = 1.0d;
                l034.f137123f = currentTimeMillis;
                l034.f137121d = str2;
                f146609a.f137742d.add(l034);
                Log.m105925i(str3, "add new use %s", str2);
            } else {
                double d = l032.f137122e + 1.0d;
                l032.f137122e = d;
                Log.m105925i(str3, "update use %s %.2f", str2, Double.valueOf(d));
            }
            Collections.sort(f146609a.f137742d, new C52470a());
            for (int size = f146609a.f137742d.size() - 1; size < f146609a.f137742d.size() && f146609a.f137742d.size() > 8; size++) {
                if (f146609a.f137742d.get(size).f137122e < 0.5d) {
                    f146609a.f137742d.remove(size);
                }
            }
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("fts_recent_biz_sp", 0);
            try {
                String b = m58724b();
                String encodeToString = Base64.encodeToString(f146609a.toByteArray(), 0);
                sharedPreferences.edit().putString(b, encodeToString).commit();
                Log.m105925i(str3, "useBiz pbListString %s", encodeToString);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m58724b() {
        return "key_pb_most_search_biz_list" + C75592q0.m90789s();
    }

    /* renamed from: c */
    public static C50335m03 m58725c() {
        if (f146609a == null) {
            String b = m58724b();
            f146609a = new C50335m03();
            try {
                String string = MMApplicationContext.getContext().getSharedPreferences("fts_recent_biz_sp", 0).getString(b, "");
                if (!Util.isNullOrNil(string)) {
                    f146609a.parseFrom(Base64.decode(string.getBytes(), 0));
                }
            } catch (Exception unused) {
            }
        }
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            f146609a.f137742d.clear();
        }
        return f146609a;
    }
}
