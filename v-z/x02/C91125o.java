package x02;

import android.content.Context;
import android.os.Process;
import com.tencent.p014mm.modelmulti.C81003a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import iv3.C87821a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: x02.o */
public class C91125o implements C81003a.C81005b {

    /* renamed from: a */
    public final /* synthetic */ Context f261343a;

    /* renamed from: b */
    public final /* synthetic */ C87821a f261344b;

    public C91125o(C91124n nVar, Context context, C87821a aVar) {
        this.f261343a = context;
        this.f261344b = aVar;
    }

    /* renamed from: a */
    public void mo112882a(boolean z) {
        if (!z) {
            Log.m105924i("Tinker.SyncResponseProcessor", "app is background now, i can kill quietly");
            ShareTinkerInternals.killAllOtherProcess(this.f261343a);
            try {
                this.f261344b.mo122277a();
            } catch (Throwable th) {
                Log.printErrStackTrace("Tinker.SyncResponseProcessor", th, "Fail to call tinker.cleanPatch.", new Object[0]);
                Log.appenderFlushSync();
            }
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/hp/model/SyncResponseProcessor$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/hp/model/SyncResponseProcessor$3", "onScreenStateChange", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
