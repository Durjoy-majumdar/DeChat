package av1;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import di3.C86312j;
import dv1.C31305p;
import dv1.C58435m;
import ei3.C86522b;
import ev1.C31726h;
import fv1.C32183a;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C36570n;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: av1.b */
public class C28143b extends C86301e {
    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        ((MMHandler) ((C36570n) ((C58435m) C86312j.m106911c(C58435m.class)).f167405h).getValue()).post(C31305p.f83819d);
        C32183a aVar = C32183a.f85554d;
        aVar.getClass();
        Log.m105924i("MicroMsg.ForceNotifyStorage", "deleteGameLife()");
        if (C32183a.f85555e.delete("ForceNotifyData", "UserName like ? ", new String[]{"%@gamelifesess"}) >= 0) {
            ConcurrentHashMap<String, C31726h> concurrentHashMap = C32183a.f85556f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                String str = ((C31726h) next.getValue()).field_UserName;
                C87412m.m108593f(str, "it.value.field_UserName");
                if (C112551y.m153808h(str, "@gamelifesess", false, 2, (Object) null)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                C32183a.f85556f.remove(((C31726h) value.getValue()).field_ForcePushId);
            }
            aVar.doNotify();
        }
    }

    public void onAccountReleased(Context context) {
        ((C58435m) C86312j.m106911c(C58435m.class)).getClass();
    }
}
