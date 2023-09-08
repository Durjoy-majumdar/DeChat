package d24;

import java.io.IOException;

/* renamed from: d24.w */
public enum C116554w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: d */
    public final String f349574d;

    /* access modifiers changed from: public */
    C116554w(String str) {
        this.f349574d = str;
    }

    /* renamed from: a */
    public static C116554w m164395a(String str) {
        C116554w wVar = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return wVar;
        }
        C116554w wVar2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return wVar2;
        }
        C116554w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return wVar3;
        }
        C116554w wVar4 = HTTP_2;
        if (str.equals("h2")) {
            return wVar4;
        }
        C116554w wVar5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return wVar5;
        }
        C116554w wVar6 = QUIC;
        if (str.equals("quic")) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f349574d;
    }
}
