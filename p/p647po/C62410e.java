package p647po;

import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.nio.charset.Charset;
import n20.C100033c;
import n20.C100035h;
import n20.C100038k;
import n20.C61604f;
import n20.C61605g;
import n20.C61609o;
import o01.C100268a;
import p663qo.C63286j;
import p823sg.C90193h;
import sx3.C64197v;
import wb0.C65945a;

@C86522b
/* renamed from: po.e */
public final class C62410e extends C86301e implements C63286j {
    /* renamed from: Kl */
    public C61604f mo87460Kl() {
        return new C61604f(C64197v.m75539h(C100035h.class, C100038k.class, C100268a.class, C100033c.class, C61609o.class));
    }

    public String s10(C61605g gVar, C65945a aVar) {
        C87412m.m108594g(gVar, "options");
        C87412m.m108594g(aVar, "cdnParams");
        String str = gVar.f175193b + '_' + gVar.f175192a + '_' + 0.0f + '_' + gVar.f175194c + '_' + aVar.f189597a + '_' + aVar.f189598b + '_' + aVar.f189600d + '_' + aVar.f189599c;
        try {
            Charset forName = Charset.forName("utf8");
            C87412m.m108593f(forName, "forName(\"utf8\")");
            byte[] bytes = str.getBytes(forName);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String f = C90193h.m112878f(bytes);
            C87412m.m108593f(f, "{\n            MD5.getMes…rName(\"utf8\")))\n        }");
            return f;
        } catch (Exception unused) {
            Charset defaultCharset = Charset.defaultCharset();
            C87412m.m108593f(defaultCharset, "defaultCharset()");
            byte[] bytes2 = str.getBytes(defaultCharset);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            String f2 = C90193h.m112878f(bytes2);
            C87412m.m108593f(f2, "{\n            MD5.getMes…aultCharset()))\n        }");
            return f2;
        }
    }
}
