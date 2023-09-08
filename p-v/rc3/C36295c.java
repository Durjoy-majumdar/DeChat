package rc3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.CommonProcessService;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import l71.C117461a;
import p757xv.C38853w;

@C86522b(onProcess = {C80625v0.MATCH_EXDEVICE})
/* renamed from: rc3.c */
public class C36295c extends C86301e {

    /* renamed from: d */
    public Handler f96636d;

    /* renamed from: e */
    public final Runnable f96637e = new C36296a();

    /* renamed from: rc3.c$a */
    public class C36296a implements Runnable {
        public C36296a() {
        }

        public void run() {
            boolean z;
            CommonProcessService commonProcessService;
            if (!C38853w.m41954b()) {
                C36295c.this.getClass();
                if (!C117461a.f351535a) {
                    Log.m105924i("MicroMsg.PluginExDeviceProcess", "ExDeviceProcessBusyMonitor.isBusy(): false");
                    z = true;
                } else {
                    z = false;
                }
                Log.m105925i("MicroMsg.PluginExDeviceProcess", "needKill: %s, workingFlag: %s", Boolean.valueOf(z), Integer.valueOf(C117461a.f351536b));
                if (z) {
                    C36295c.this.getClass();
                    WeakReference<CommonProcessService> weakReference = CommonProcessService.f347998h;
                    if (!(weakReference == null || (commonProcessService = weakReference.get()) == null)) {
                        commonProcessService.stopSelf();
                        Log.m105925i("MicroMsg.PluginExDeviceProcess", "Stop service %s", commonProcessService);
                    }
                    int myPid = Process.myPid();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                }
                C36295c cVar = C36295c.this;
                cVar.f96636d.postDelayed(cVar.f96637e, 20000);
            }
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f96636d = handler;
        handler.postDelayed(this.f96637e, 20000);
    }
}
