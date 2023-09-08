package fx3;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import gv3.C87400a;
import iv3.C87821a;
import java.io.File;
import jv3.C88034b;

/* renamed from: fx3.a */
public class C87116a extends C87400a {

    /* renamed from: fx3.a$a */
    public class C87117a implements MessageQueue.IdleHandler {
        public C87117a() {
        }

        public boolean queueIdle() {
            C88034b.m109603b(C87116a.this.f253289a).mo122484e();
            return false;
        }
    }

    public C87116a(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo109431b(File file, int i, long j) {
        super.mo109431b(file, i, j);
        Looper.getMainLooper();
        Looper.myQueue().addIdleHandler(new C87117a());
    }

    /* renamed from: c */
    public void mo109432c(File file, int i, boolean z) {
        String str;
        super.mo109432c(file, i, z);
        if (i == 1 && (str = C87821a.m109275c(this.f253289a).f254238k.f254252a) != null && "00000000000000000000000000000000".equals(str)) {
            ShareTinkerLog.m106533v("Tinker.ServerLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
            ShareTinkerInternals.killAllOtherProcess(this.f253289a);
        }
    }

    /* renamed from: e */
    public void mo109434e(String str, String str2, File file, String str3) {
        super.mo109434e(str, str2, file, str3);
    }

    /* renamed from: h */
    public void mo109437h(Throwable th, int i) {
        super.mo109437h(th, i);
    }
}
