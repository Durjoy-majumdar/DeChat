package sp3;

import android.os.Looper;
import android.os.Process;
import com.tencent.tav.decoder.logger.ILog;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import yp3.C112478a;

/* renamed from: sp3.e */
public final class C110802e implements ILog {
    /* renamed from: d */
    public void mo55635d(String str, String str2) {
        C112478a.m153623a("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2), new Object[0]);
    }

    /* renamed from: e */
    public void mo55636e(String str, String str2) {
        C112478a.m153624b("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2), new Object[0]);
    }

    /* renamed from: i */
    public void mo55638i(String str, String str2) {
        C112478a.m153625c("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2), new Object[0]);
    }

    /* renamed from: v */
    public void mo55639v(String str, String str2) {
        String str3 = "MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str;
        String valueOf = String.valueOf(str2);
        C112478a.C112479a aVar = C112478a.f336787a;
        if (aVar != null && aVar.getLogLevel() <= 0) {
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logV(str3, "", "", myTid, myPid, id, thread.getId(), valueOf);
        }
    }

    /* renamed from: w */
    public void mo55640w(String str, String str2) {
        C112478a.m153628f("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2), new Object[0]);
    }

    /* renamed from: e */
    public void mo55637e(String str, String str2, Throwable th) {
        C112478a.m153626d("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, th, String.valueOf(str2), new Object[0]);
    }
}
