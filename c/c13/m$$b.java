package c13;

import android.os.Process;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public final /* synthetic */ class m$$b implements Runnable {
    public final void run() {
        if (AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$1", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$1", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
