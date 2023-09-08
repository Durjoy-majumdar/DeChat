package i83;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43867e;
import com.tencent.p014mm.plugin.webview.webcompt.C44455u;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ex0.C45696d;
import f40.C86709a0;
import j40.C87829b;
import p711uo.C102059b;
import q73.C35796c0;
import q73.C35811r;
import q73.C35812s;
import zd2.C91667a;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: i83.g */
public class C46180g extends C86301e {

    /* renamed from: i83.g$a */
    public class C46181a implements WebView.PreInitCallback {
        public C46181a(C46180g gVar) {
        }

        public void onCoreInitFailed() {
            Log.m105924i("ToolsMinifiedBootStep", "onCoreInitFailed");
        }

        public void onCoreInitFinished() {
            Class cls = C45696d.class;
            Log.m105924i("ToolsMinifiedBootStep", "onCoreInitFinished");
            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(20)) {
                ((C45696d) C86709a0.m107533q(cls)).Md0();
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C35812s sVar = C35812s.f95615a;
        ((C119157j) C119157j.f356862d).mo183879j(C35811r.f95614d, 10000, "WebCanvasPackageDownManager");
        C35796c0.f95588a.mo60402c(false);
        C43861d dVar = C43861d.f118783a;
        C119179t tVar = C119157j.f356862d;
        C43867e eVar = C43867e.f118795d;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(eVar, 10000, false);
        C30650a.m39147b(new C44455u(), "//webcompt");
        C30650a.m39147b(new C43520v(), "//webview");
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C87829b a = C86709a0.m107531m().mo58407a();
        if (!a.mo71804b()) {
            a.mo71805c(":tools");
        }
        if (MMApplicationContext.isToolsProcess()) {
            XWebSdk.setFileDownloaderProxy(((C102059b) C86312j.m106911c(C102059b.class)).ob0());
            C46183h hVar = new C46183h(new C46181a(this));
            if (Looper.myLooper() == Looper.getMainLooper()) {
                hVar.run();
            } else {
                new Handler(Looper.getMainLooper()).post(hVar);
            }
            a.f124990c.registerActivityLifecycleCallbacks(C91667a.f262646a);
        }
    }
}
