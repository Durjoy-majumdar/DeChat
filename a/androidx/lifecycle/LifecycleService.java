package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C39623j;

public class LifecycleService extends Service implements C0125s {

    /* renamed from: d */
    public final C112983h0 f338195d = new C112983h0(this);

    public C39623j getLifecycle() {
        return this.f338195d.f338209a;
    }

    public IBinder onBind(Intent intent) {
        this.f338195d.mo165347a(C39623j.C39625b.ON_START);
        return null;
    }

    public void onCreate() {
        this.f338195d.mo165347a(C39623j.C39625b.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C112983h0 h0Var = this.f338195d;
        h0Var.mo165347a(C39623j.C39625b.ON_STOP);
        h0Var.mo165347a(C39623j.C39625b.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f338195d.mo165347a(C39623j.C39625b.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
