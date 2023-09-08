package eb0;

import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: eb0.d2 */
public final class C45608d2 {
    /* renamed from: a */
    public static C45607c2 m50666a(String str) {
        return new C45607c2("@black.android", (String) null, str, (String) null, true, true);
    }

    /* renamed from: b */
    public static C45607c2 m50667b(String str, String str2) {
        C44665r4 jo;
        String str3;
        C45607c2 c2Var = null;
        if (!(str == null || str.length() <= 0 || (jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo(str)) == null)) {
            boolean z = true;
            if (jo.f121098e != 1) {
                z = false;
            }
            if (z) {
                String str4 = jo.f121095b;
                String str5 = jo.f121096c.f121099a;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = "" + str5.replace("@", "");
                if (str2 != null) {
                    str3 = str6 + str2;
                } else {
                    str3 = str6;
                }
                String str7 = jo.f121096c.f121099a;
                c2Var = new C45607c2("@domain.android", str4, str3, str7 != null ? str7 : "", jo.mo69814c(), true);
            }
        }
        return c2Var;
    }

    /* renamed from: c */
    public static C45607c2 m50668c(String str) {
        C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
        if (jo == null) {
            return null;
        }
        return new C45607c2("@t.qq.com", (String) null, str, (String) null, jo.mo69814c(), (jo.f121097d & 2) != 0);
    }
}
