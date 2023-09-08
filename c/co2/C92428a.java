package co2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: co2.a */
public class C92428a {

    /* renamed from: a */
    public long f264476a;

    /* renamed from: b */
    public String f264477b;

    /* renamed from: c */
    public String f264478c;

    /* renamed from: d */
    public String f264479d;

    /* renamed from: e */
    public String f264480e;

    /* renamed from: f */
    public String f264481f;

    /* renamed from: g */
    public String f264482g;

    /* renamed from: h */
    public String f264483h;

    /* renamed from: i */
    public String f264484i;

    /* renamed from: j */
    public String f264485j;

    /* renamed from: k */
    public String f264486k;

    /* renamed from: l */
    public String f264487l;

    /* renamed from: m */
    public String f264488m;

    /* renamed from: n */
    public long f264489n;

    /* renamed from: o */
    public String f264490o;

    /* renamed from: p */
    public int f264491p;

    /* renamed from: q */
    public String f264492q;

    /* renamed from: r */
    public String f264493r;

    /* renamed from: a */
    public static C92428a m116256a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        if (map != null) {
            try {
                if (map.containsKey(str)) {
                    C92428a aVar = new C92428a();
                    aVar.f264476a = Util.safeParseLong(map.get(str + ".appointmentId"));
                    aVar.f264484i = Util.nullAsNil(map.get(str + ".btnTitleAfterAppointment"));
                    aVar.f264477b = Util.nullAsNil(map.get(str + ".nickname"));
                    aVar.f264478c = Util.nullAsNil(map.get(str + ".headImageUrl"));
                    aVar.f264479d = Util.nullAsNil(map.get(str + ".title"));
                    aVar.f264480e = Util.nullAsNil(map.get(str + ".content"));
                    aVar.f264481f = Util.nullAsNil(map.get(str + ".extraContent"));
                    aVar.f264482g = Util.nullAsNil(map.get(str + ".submitBtnTitle"));
                    aVar.f264483h = Util.nullAsNil(map.get(str + ".cancelBtnTitle"));
                    aVar.f264485j = Util.nullAsNil(map.get(str + ".submitSucToast"));
                    aVar.f264486k = Util.nullAsNil(map.get(str + ".submitFailedToast"));
                    aVar.f264487l = Util.nullAsNil(map.get(str + ".cancelSucToast"));
                    aVar.f264488m = Util.nullAsNil(map.get(str + ".cancelFailedToast"));
                    aVar.f264489n = Util.safeParseLong(map.get(str + ".expiredTime"));
                    aVar.f264490o = Util.nullAsNil(map.get(str + ".expiredBtnTitle"));
                    aVar.f264491p = Util.safeParseInt(map.get(str + ".requestPhoneNumber"));
                    aVar.f264492q = Util.nullAsNil(map.get(str + ".phoneNumberRequestName"));
                    aVar.f264493r = Util.nullAsNil(map.get(str + ".phoneNumberRequestIcon"));
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                    return aVar;
                }
            } catch (Throwable unused) {
                Log.m105920e("AdAppointmentInfo", "parse the update info failed!!");
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                return null;
            }
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        return null;
    }
}
