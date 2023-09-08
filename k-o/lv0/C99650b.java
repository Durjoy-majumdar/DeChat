package lv0;

import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lv0.b */
public class C99650b {

    /* renamed from: a */
    public Map<String, String> f292062a = null;

    /* renamed from: b */
    public boolean f292063b = true;

    public C99650b(String str) {
        Map<String, String> decode = SemiXml.decode(str);
        this.f292062a = decode;
        if (decode == null) {
            this.f292063b = false;
            this.f292062a = new HashMap();
        }
    }

    /* renamed from: a */
    public final int mo139028a(String str) {
        if (!this.f292062a.containsKey(str)) {
            return 0;
        }
        return Util.getInt(this.f292062a.get(str), 0);
    }
}
