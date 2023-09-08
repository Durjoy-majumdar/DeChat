package p187ku;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.util.Map;

/* renamed from: ku.n */
public class C10415n implements C7241k.C7243b {
    /* renamed from: M4 */
    public String mo8416M4(Map<String, String> map, String str, Bundle bundle) {
        if (map == null) {
            return null;
        }
        Log.m105919d("HandleNewLinkHistoryDigestListener", "mHandleNewLinkHistoryDigestListener %s", Util.nullAsNil(map.get(str + ".title")));
        return Util.nullAsNil(map.get(str + ".title"));
    }
}
