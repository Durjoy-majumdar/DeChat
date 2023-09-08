package eq0;

import bq0.C79763b;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import cq0.C86089b;
import cq0.C86091c;

/* renamed from: eq0.g */
public class C86637g extends C86089b {

    /* renamed from: a */
    public static C86638a f251600a;

    /* renamed from: eq0.g$a */
    public interface C86638a {
    }

    /* renamed from: a */
    public int mo120512a() {
        return 3;
    }

    /* renamed from: b */
    public void mo120513b(C104289g gVar, C86091c cVar) {
        if (f251600a == null) {
            Log.m105918d("MicroMsg.NodeReportIDKey", "sDelegate null");
            return;
        }
        try {
            int i = gVar.getInt("id");
            int i2 = gVar.getInt("key");
            int optInt = gVar.optInt(TPReportParams.JSON_KEY_VAL, 1);
            ((C79763b) f251600a).getClass();
            C115669n.INSTANCE.mo175913w((long) i, (long) i2, (long) optInt);
        } catch (C79923f e) {
            Log.m105921e("MicroMsg.NodeReportIDKey", "execute exception : %s", e);
            cVar.mo120515b(2);
        }
    }
}
