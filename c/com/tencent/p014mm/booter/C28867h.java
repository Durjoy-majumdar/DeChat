package com.tencent.p014mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.booter.h */
public class C28867h implements C80823j {

    /* renamed from: com.tencent.mm.booter.h$a */
    public class C28868a implements Runnable {
        public C28868a(C28867h hVar) {
        }

        public void run() {
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/booter/MMProcessReceivers$SandBoxProcessReceiverImpl$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/booter/MMProcessReceivers$SandBoxProcessReceiverImpl$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    /* renamed from: a */
    public void mo56281a(Context context, Intent intent) {
        if (context != null && intent != null) {
            Log.m105924i("MicroMsg.SandBoxProcessReceiver", "onReceive");
            MMHandlerThread.postToMainThreadDelayed(new C28868a(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
