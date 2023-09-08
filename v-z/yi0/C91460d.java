package yi0;

import com.tencent.p014mm.sdk.crash.ICrashReporter;
import java.util.Iterator;
import yi0.C91456b;

/* renamed from: yi0.d */
public final /* synthetic */ class C91460d implements ICrashReporter.ICrashReportListener {
    public C91460d(C91456b bVar) {
    }

    public final void onCrashDumped(String str) {
        C91456b bVar = C91456b.f262190a;
        Iterator<C91456b.C91457a> it = C91456b.f262191b.iterator();
        while (it.hasNext()) {
            it.next().mo116912a();
        }
        bVar.mo125390a(C91456b.f262193d);
    }
}
