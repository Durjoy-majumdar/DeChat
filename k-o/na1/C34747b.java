package na1;

import android.app.Activity;
import co3.C28633b;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.XMLInflateMonitorStruct;
import com.tencent.p014mm.plugin.expt.resource.MMResReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C36570n;
import xq3.C38806a;
import z04.C112551y;

/* renamed from: na1.b */
public final class C34747b implements C28633b {

    /* renamed from: b */
    public static final C34747b f93408b = new C34747b();

    /* renamed from: na1.b$a */
    public static final class C34748a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C38806a f93409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34748a(C38806a aVar) {
            super(0);
            this.f93409d = aVar;
        }

        public Object invoke() {
            C38806a aVar = this.f93409d;
            aVar.getClass();
            Log.m105918d("InflateXMLInfo", "printResult generateInfo:" + aVar + " \nsortInfo:" + aVar.mo61777c());
            C87412m.m108594g(this.f93409d, "result");
            MMResReporter mMResReporter = MMResReporter.f80989a;
            if (mMResReporter.mo56978c(C32735h.C32737c.clicfg_inflate_xml_sample_and)) {
                C38806a aVar2 = this.f93409d;
                String str = aVar2.f104641a;
                long j = aVar2.f104642b;
                int a = mMResReporter.mo56976a();
                C38806a.C38807a aVar3 = (C38806a.C38807a) ((C36570n) this.f93409d.f104644d).getValue();
                XMLInflateMonitorStruct xMLInflateMonitorStruct = new XMLInflateMonitorStruct();
                xMLInflateMonitorStruct.f79239d = xMLInflateMonitorStruct.mo86045b("ActName", str, true);
                xMLInflateMonitorStruct.f79240e = j;
                xMLInflateMonitorStruct.f79241f = (long) a;
                xMLInflateMonitorStruct.f79242g = aVar3.f104645a;
                xMLInflateMonitorStruct.f79243h = aVar3.f104646b;
                xMLInflateMonitorStruct.f79244i = aVar3.f104647c;
                xMLInflateMonitorStruct.f79245j = (long) aVar3.f104648d;
                xMLInflateMonitorStruct.f79246k = (long) aVar3.f104649e;
                xMLInflateMonitorStruct.f79247l = (long) aVar3.f104650f;
                float f = (float) 100;
                xMLInflateMonitorStruct.f79248m = (long) (aVar3.f104651g * f);
                xMLInflateMonitorStruct.f79249n = (long) (aVar3.f104652h * f);
                xMLInflateMonitorStruct.mo86054n();
                if (Log.getLogLevel() <= 1) {
                    String q = xMLInflateMonitorStruct.mo1006q();
                    C87412m.m108593f(q, "struct.toShowString()");
                    Log.m105919d("ActivityStartReportHelper", "report%s %s", 27564, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo56105a(C38806a aVar) {
        C87412m.m108594g(aVar, "result");
        C61926c.m72656A((String) null, new C34748a(aVar));
    }

    /* renamed from: b */
    public void mo56106b(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        try {
            MMHandlerThread.postToMainThread(new C34745a(activity, System.nanoTime(), 6));
        } catch (Throwable th) {
            Log.printErrStackTrace("ActivityStartReportHelper", th, "handleActivityOnCreate err", new Object[0]);
        }
    }
}
