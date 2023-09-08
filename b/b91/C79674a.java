package b91;

import a91.C79474a;
import com.eclipsesource.mmv8.V8Array;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.util.FrequentLimiter;
import j81.C87906e;
import u24.C90599h;
import w81.C90900a;

/* renamed from: b91.a */
public class C79674a extends C79474a {
    /* renamed from: a */
    public Object mo109467a(V8Array v8Array) {
        MultiProcessMMKV f;
        if (v8Array != null && v8Array.length() >= 1) {
            String string = v8Array.getString(0);
            if (C90599h.m113511d(string)) {
                return null;
            }
            C87906e.m109407a("EdgeComputingJsApiBase", "[EdgeComputingJsApiDebugAlert] logic, msg : " + string);
            if (!C90599h.m113511d(string) && (f = C87906e.m109412f()) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String str = "mmkv_key_log_last_report_time" + C90900a.f260888b;
                if ((currentTimeMillis - f.getLong(str, 0) > FrequentLimiter.WEEK_MILLS || C87906e.m109415i()) && C90900a.m114028a()) {
                    C115669n.INSTANCE.mo160131h(20176, C90900a.f260888b, 12, 0, 0, string.replace(",", ";"));
                    f.putLong(str, currentTimeMillis);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public String mo109468b() {
        return "debug_alert";
    }

    public int getType() {
        return 1;
    }

    public void release() {
    }
}
