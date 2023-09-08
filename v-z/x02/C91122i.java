package x02;

import a12.C79455h;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Process;
import android.view.Display;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.modelmulti.C81003a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import iv3.C87821a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p182kk.C61104a;

/* renamed from: x02.i */
public class C91122i implements C81003a.C81005b {

    /* renamed from: a */
    public final /* synthetic */ C91118g f261322a;

    public C91122i(C91118g gVar) {
        this.f261322a = gVar;
    }

    /* renamed from: a */
    public void mo112882a(boolean z) {
        boolean z2;
        VoipEvent voipEvent = new VoipEvent();
        voipEvent.f194019d.f194022b = 2;
        voipEvent.publish();
        boolean z3 = voipEvent.f194020e.f194028b;
        boolean D = C61104a.m71644D();
        C91118g gVar = this.f261322a;
        Context context = MMApplicationContext.getContext();
        gVar.getClass();
        try {
            Display[] displays = ((DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays();
            int length = displays.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (displays[i].getState() == 2) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Tinker.HotPatchApplyService", th, "Fail to fetch status of displays.", new Object[0]);
        }
        if (!z && !z2 && !z3 && !D) {
            Log.m105924i("Tinker.HotPatchApplyService", "app is background now, i can kill quietly");
            ShareTinkerInternals.killAllOtherProcess(MMApplicationContext.getContext());
            try {
                if (C79455h.f232995a) {
                    C87821a.m109275c(C80589e.f235760a.getApplication()).mo122277a();
                    int myPid = Process.myPid();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/plugin/hp/model/HotpatchIPXXApplyService$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                }
                throw new RuntimeException("cleanPatch but tinker is not installed");
            } catch (Throwable th4) {
                Log.printErrStackTrace("Tinker.HotPatchApplyService", th4, "Fail to call tinker.cleanPatch.", new Object[0]);
                Log.appenderFlushSync();
            }
        } else {
            return;
        }
        z2 = false;
        if (!z) {
        }
    }
}
