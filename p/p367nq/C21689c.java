package p367nq;

import di3.C86301e;
import ei3.C86522b;
import f91.C116850b;
import gy3.C87412m;
import p217oq.C11719g;
import p217oq.C62120e;
import t91.C22459d;
import z04.C119027c;
import z91.C23462b;

@C86522b
/* renamed from: nq.c */
public final class C21689c extends C86301e implements C62120e, C11719g {
    /* renamed from: K5 */
    public int mo11558K5() {
        byte[] a = C116850b.m164831a("hell_live_state_mkv_key");
        if (a == null) {
            return 0;
        }
        if (a.length == 0) {
            return 0;
        }
        try {
            return Integer.parseInt(new String(a, C119027c.f356488a));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int Oc0() {
        C22459d.C22460a aVar = C22459d.f63616a;
        String e = C23462b.m28021f().mo36921e();
        if (C87412m.m108589b("999", e) || C87412m.m108589b("101", e) || C87412m.m108589b("102", e)) {
            return aVar.mo35603a(e);
        }
        return 0;
    }

    /* renamed from: SC */
    public int mo33957SC(String str) {
        return C22459d.f63616a.mo35603a(str);
    }

    public void dv0(int i) {
        byte[] bytes = String.valueOf(i).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        C116850b.m164834d("hell_live_state_mkv_key", bytes);
    }

    public boolean tu0(String str) {
        return C87412m.m108589b("999", str) || C87412m.m108589b("101", str) || C87412m.m108589b("102", str);
    }
}
