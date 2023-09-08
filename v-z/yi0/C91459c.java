package yi0;

import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import java.util.Iterator;
import yi0.C91456b;

/* renamed from: yi0.c */
public final /* synthetic */ class C91459c implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
    public C91459c(C91456b bVar) {
    }

    public final void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
        C91456b bVar = C91456b.f262190a;
        Iterator<C91456b.C91457a> it = C91456b.f262191b.iterator();
        while (it.hasNext()) {
            it.next().mo116912a();
        }
        bVar.mo125390a(C91456b.f262192c);
    }
}
