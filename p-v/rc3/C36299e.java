package rc3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.CommonProcessService;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import oa1.C117731d;
import sc3.C36662a;
import sc3.C36663b;
import sc3.C36664c;

@C86522b(onProcess = {C80625v0.MATCH_SUPPORT})
/* renamed from: rc3.e */
public class C36299e extends C86301e {

    /* renamed from: d */
    public Handler f96643d;

    /* renamed from: e */
    public final List<C36662a> f96644e = new ArrayList();

    /* renamed from: f */
    public final Runnable f96645f = new C36300a();

    /* renamed from: rc3.e$a */
    public class C36300a implements Runnable {
        public C36300a() {
        }

        public void run() {
            boolean z;
            CommonProcessService commonProcessService;
            int e = C117731d.m166007c().mo182443e("clicfg_support_auto_release", 1, true, true);
            Log.m105924i("MicroMsg.ProcessReclaimSwitch", "isSupportProcessReclaimDisabled:" + e);
            if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG && e == 0) {
                Log.m105924i("PluginSupportProcess", "Support process reclaim disabled");
                return;
            }
            List<C36662a> list = C36299e.this.f96644e;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C36662a aVar = (C36662a) it.next();
                    if (aVar != null && aVar.isBusy()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            Log.m105924i("PluginSupportProcess", "needKill:" + z);
            if (z) {
                boolean isBackground = ProcessDeepBackgroundOwner.INSTANCE.isBackground();
                Log.m105924i("PluginSupportProcess", "isProcessBackground:" + isBackground);
                if (isBackground) {
                    C36299e.this.getClass();
                    WeakReference<CommonProcessService> weakReference = CommonProcessService.f347998h;
                    if (!(weakReference == null || (commonProcessService = weakReference.get()) == null)) {
                        commonProcessService.stopSelf();
                        Log.m105925i("PluginSupportProcess", "Stop service %s", commonProcessService);
                    }
                    int myPid = Process.myPid();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                }
            }
            C36299e eVar = C36299e.this;
            eVar.f96643d.postDelayed(eVar.f96645f, 15000);
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        ((ArrayList) this.f96644e).add(new C36664c());
        ((ArrayList) this.f96644e).add(new C36663b());
        Handler handler = new Handler(Looper.getMainLooper());
        this.f96643d = handler;
        handler.postDelayed(this.f96645f, 15000);
    }
}
