package p516f9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f9.q */
public final class C116838q extends BroadcastReceiver {

    /* renamed from: a */
    public C116837p f350212a;

    public C116838q(C116837p pVar) {
        this.f350212a = pVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C116837p pVar = this.f350212a;
        if (pVar != null && pVar.mo180832c()) {
            FirebaseInstanceId.m155206l();
            C116837p pVar2 = this.f350212a;
            synchronized (FirebaseInstanceId.class) {
                if (FirebaseInstanceId.f339217i == null) {
                    FirebaseInstanceId.f339217i = new ScheduledThreadPoolExecutor(1);
                }
                FirebaseInstanceId.f339217i.schedule(pVar2, 0, TimeUnit.SECONDS);
            }
            FirebaseApp firebaseApp = this.f350212a.f350210f.f339218a;
            firebaseApp.mo169379d();
            firebaseApp.f339194a.unregisterReceiver(this);
            this.f350212a = null;
        }
    }
}
