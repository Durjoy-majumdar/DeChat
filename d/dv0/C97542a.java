package dv0;

import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dv0.a */
public class C97542a {

    /* renamed from: a */
    public Map<String, String> f286248a = null;

    /* renamed from: b */
    public boolean f286249b = true;

    public C97542a(String str) {
        Map<String, String> decode = SemiXml.decode(str);
        this.f286248a = decode;
        if (decode == null) {
            this.f286249b = false;
            this.f286248a = new HashMap();
        }
    }

    /* renamed from: a */
    public final int mo136812a(String str) {
        if (!this.f286248a.containsKey(str)) {
            return 0;
        }
        return Util.getInt(this.f286248a.get(str), 0);
    }
}
