package w02;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: w02.d */
public class C90881d implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ C90882e f260861d;

    public C90881d(C90882e eVar) {
        this.f260861d = eVar;
    }

    public void onBindingDied(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnection serviceConnection;
        C90882e eVar = this.f260861d;
        Context context = eVar.f260862a;
        if (context != null && (serviceConnection = eVar.f260863b) != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
