package p187ku;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.util.Map;

/* renamed from: ku.j */
public class C10413j implements C7241k.C7243b {
    /* renamed from: M4 */
    public String mo8416M4(Map<String, String> map, String str, Bundle bundle) {
        if (map == null) {
            return null;
        }
        return Util.nullAsNil(map.get(str + ".title"));
    }
}
