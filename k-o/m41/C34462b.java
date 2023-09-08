package m41;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import m41.C34464d;

/* renamed from: m41.b */
public class C34462b extends C34464d.C34466b {

    /* renamed from: a */
    public int f92769a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object[] f92770b;

    public C34462b(Object[] objArr) {
        this.f92770b = objArr;
    }

    /* renamed from: a */
    public boolean mo59598a(Map map) {
        if (map == null) {
            return false;
        }
        for (Object next : map.values()) {
            String str = null;
            try {
                if (next instanceof String) {
                    str = (String) next;
                } else if (next instanceof Number) {
                    str = String.valueOf(next);
                }
                if (str != null && str.length() > this.f92769a) {
                    this.f92769a = str.length();
                    this.f92770b[0] = next;
                }
            } catch (Exception e) {
                Log.m105920e("ParamsUtils", "[getMaxLengthParam] throw Exception : " + e.getMessage());
            }
        }
        return false;
    }
}
