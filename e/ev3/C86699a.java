package ev3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: ev3.a */
public class C86699a implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ C86700b f251709d;

    public C86699a(C86700b bVar) {
        this.f251709d = bVar;
    }

    public void onBindingDied(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnection serviceConnection;
        C86700b bVar = this.f251709d;
        Context context = bVar.f251710a;
        if (context != null && (serviceConnection = bVar.f251711b) != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
