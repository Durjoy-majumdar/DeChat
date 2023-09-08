package np0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import f40.C86709a0;
import java.util.Map;

/* renamed from: np0.s */
public class C11246s implements C7241k.C7243b {
    /* renamed from: M4 */
    public String mo8416M4(Map<String, String> map, String str, Bundle bundle) {
        if (!C86709a0.m107522a()) {
            return "";
        }
        if (map == null || map.isEmpty()) {
            Log.m105928w("MicroMsg.WxaSysTemplateMsgDigestHandler", "values map is null or nil");
            return "";
        }
        return Util.nullAsNil(map.get(str + ".title"));
    }
}
