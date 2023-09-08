package eq0;

import bq0.C79762a;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import cq0.C86089b;
import cq0.C86091c;

/* renamed from: eq0.h */
public class C86639h extends C86089b {

    /* renamed from: a */
    public static C86640a f251601a;

    /* renamed from: eq0.h$a */
    public interface C86640a {
    }

    /* renamed from: a */
    public int mo120512a() {
        return 8;
    }

    /* renamed from: b */
    public void mo120513b(C104289g gVar, C86091c cVar) {
        if (f251601a == null) {
            Log.m105918d("MicroMsg.NodeReportKV", "sDelegate null");
            return;
        }
        try {
            int i = gVar.getInt("id");
            String optString = gVar.optString(TPReportParams.JSON_KEY_VAL);
            ((C79762a) f251601a).getClass();
            C115669n.INSTANCE.kvStat(i, optString);
        } catch (C79923f e) {
            Log.m105921e("MicroMsg.NodeReportKV", "execute exception : %s", e);
            cVar.mo120515b(2);
        }
    }
}
