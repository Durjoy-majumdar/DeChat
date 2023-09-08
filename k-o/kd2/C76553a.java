package kd2;

import b63.C67188h0;
import com.tencent.p014mm.plugin.offline.C69952f;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import gy3.C87412m;
import kd2.C76555c;

/* renamed from: kd2.a */
public final class C76553a implements C76555c.C76556a {
    /* renamed from: a */
    public void mo106799a(String str) {
        C87412m.m108594g(str, "bindSerial");
        C76559f.m92123s(str);
        C69963m.wx0().vx0().f201767b = str;
    }

    /* renamed from: b */
    public void mo106800b() {
        Bankcard c = C67188h0.m79468c(true);
        if (c != null) {
            C76559f.m92123s(c.field_bindSerial);
            C69963m.wx0().vx0().f201767b = c.field_bindSerial;
        }
    }

    /* renamed from: c */
    public String mo106801c() {
        Bankcard c = C67188h0.m79468c(false);
        if (c == null) {
            return "";
        }
        C69952f vx02 = C69963m.wx0().vx0();
        String str = c.field_bindSerial;
        vx02.f201767b = str;
        return str;
    }

    /* renamed from: d */
    public Bankcard mo106802d(boolean z) {
        Bankcard c = C67188h0.m79468c(false);
        if (c != null) {
            C69963m.wx0().vx0().f201767b = c.field_bindSerial;
        }
        return c;
    }

    public void reload() {
    }
}
