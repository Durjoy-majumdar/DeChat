package eq0;

import c30.C104289g;
import cq0.C86091c;
import cq0.C86092d;
import java.util.HashMap;
import sp0.C90309m;

/* renamed from: eq0.f */
public class C86636f extends C86092d {
    /* renamed from: a */
    public int mo120512a() {
        return 6;
    }

    /* renamed from: b */
    public String mo120517b(C104289g gVar, C86091c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("isLANIp", Boolean.valueOf(C90309m.m113085t(C90309m.m113091z(gVar.optString("url")).get("host")) == 2));
        return cVar.mo120516c(hashMap);
    }
}
