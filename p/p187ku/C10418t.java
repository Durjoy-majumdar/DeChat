package p187ku;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.util.Map;

/* renamed from: ku.t */
public class C10418t implements C7241k.C7243b {
    /* renamed from: M4 */
    public String mo8416M4(Map<String, String> map, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        String nullAs = Util.nullAs(map.get(str + ".separator"), "、");
        int i = 0;
        while (true) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(".memberlist.member");
            sb4.append(i != 0 ? Integer.valueOf(i) : "");
            String sb5 = sb4.toString();
            if (map.get(sb5) == null) {
                return sb.toString();
            }
            if (i != 0) {
                sb.append(nullAs);
            }
            String str2 = map.get(sb5 + ".nickname");
            if (Util.isNullOrNil(str2)) {
                Log.m105928w("HandleProfileDigestListener", "hy: can not resolve username or nickname");
            } else {
                sb.append(str2);
            }
            i++;
        }
    }
}
