package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p1014o4.C100279o;
import p1014o4.C117693m;
import p1206p4.C117979k;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f338422a = C117693m.m165967e("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C117693m.m165966c().mo182389a(f338422a, "Requesting diagnostics", new Throwable[0]);
            try {
                C117979k.m166386b(context).mo182397a((C100279o) new C100279o.C100280a(DiagnosticsWorker.class).mo139543a());
            } catch (IllegalStateException e) {
                C117693m.m165966c().mo182390b(f338422a, "WorkManager is not initialized", e);
            }
        }
    }
}
