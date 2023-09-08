package eq0;

import c30.C104289g;
import c30.C79923f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import cq0.C86089b;
import cq0.C86091c;

/* renamed from: eq0.i */
public class C86641i extends C86089b {
    /* renamed from: a */
    public int mo120512a() {
        return 4;
    }

    /* renamed from: b */
    public void mo120513b(C104289g gVar, C86091c cVar) {
        try {
            int i = gVar.getInt(FirebaseAnalytics.C113379b.LEVEL);
            String optString = gVar.optString(StateEvent.Name.MESSAGE);
            if (i == 2) {
                Log.m105924i("MicroMsg.NodeJs", optString);
            } else if (i == 3) {
                Log.m105928w("MicroMsg.NodeJs", optString);
            } else if (i != 4) {
                Log.m105918d("MicroMsg.NodeJs", optString);
            } else {
                Log.m105920e("MicroMsg.NodeJs", optString);
            }
        } catch (C79923f e) {
            Log.m105921e("MicroMsg.NodeToXLog", "execute exception : %s", e);
            cVar.mo120515b(2);
        }
    }
}
