package kh0;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import kh0.C88151c;
import lh0.C34262g;

/* renamed from: kh0.b */
public class C88149b {

    /* renamed from: a */
    public HashMap<String, Long> f254926a;

    /* renamed from: b */
    public C88151c.C88152a f254927b;

    /* renamed from: kh0.b$a */
    public class C88150a implements C88151c.C88152a {
        public C88150a() {
        }
    }

    public C88149b() {
        this.f254926a = null;
        this.f254927b = new C88150a();
        this.f254926a = new HashMap<>();
    }

    /* renamed from: a */
    public String mo122558a(String str) {
        C34262g vx02 = C34262g.vx0();
        vx02.getClass();
        if (Util.isNullOrNil(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        vx02.requireAccountInitialized();
        sb.append(vx02.f92373n);
        sb.append(str.hashCode());
        sb.append(".file");
        return sb.toString();
    }
}
