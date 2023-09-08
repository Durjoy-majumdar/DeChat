package tj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandMixExportLogicService;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: tj0.b */
public class C90504b extends C82926s {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "onStartReportCanvasData";

    /* renamed from: i */
    public static MMToClientEvent.C81947d f260113i;

    /* renamed from: tj0.b$a */
    public class C90505a implements MMToClientEvent.C81947d {

        /* renamed from: a */
        public final /* synthetic */ String f260114a;

        /* renamed from: b */
        public final /* synthetic */ C81925i2 f260115b;

        public C90505a(String str, C81925i2 i2Var) {
            this.f260114a = str;
            this.f260115b = i2Var;
        }

        /* renamed from: a */
        public void mo22085a(Object obj) {
            if ((obj instanceof AppBrandMixExportLogicService.AppBrandOnStartReportCanvasDataEvent) && this.f260114a.equals(((AppBrandMixExportLogicService.AppBrandOnStartReportCanvasDataEvent) obj).f238429d)) {
                MMToClientEvent.m100657u(this.f260114a, this);
                new C90504b().mo124672s(this.f260115b, C90506b.BeforeIdentifyQRCode, 0);
            }
        }
    }

    /* renamed from: tj0.b$b */
    public enum C90506b {
        BeforeIdentifyQRCode(11),
        BeforeJumpToProfile(12),
        BeforeBack(15),
        AfterWebViewLoad(18);
        

        /* renamed from: d */
        public final int f260121d;

        /* access modifiers changed from: public */
        C90506b(int i) {
            this.f260121d = i;
        }
    }

    /* renamed from: t */
    public static void m113326t(C81925i2 i2Var, String str) {
        Log.m105925i("MicroMsg.OnStartReportCanvasDataEvent", "startListeningOperationEvent, appId:%s", str);
        if (f260113i == null) {
            f260113i = new C90505a(str, i2Var);
        }
        MMToClientEvent.m100655q(str, f260113i);
    }

    /* renamed from: s */
    public void mo124672s(C81925i2 i2Var, C90506b bVar, int i) {
        Log.m105925i("MicroMsg.OnStartReportCanvasDataEvent", "hy: trigger event %d", Integer.valueOf(bVar.f260121d));
        mo115194p(i2Var);
        HashMap hashMap = new HashMap(1);
        hashMap.put("event", Integer.valueOf(bVar.f260121d));
        hashMap.put("viewId", Integer.valueOf(i));
        mo115165o(hashMap);
        mo115158h();
    }
}
