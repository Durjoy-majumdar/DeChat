package nk2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: nk2.g */
public final class C21653g implements ServiceConnection {

    /* renamed from: d */
    public final C21654a f61280d;

    /* renamed from: e */
    public boolean f61281e;

    /* renamed from: nk2.g$a */
    public interface C21654a {
        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);
    }

    public C21653g(C21654a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f61280d = aVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceConnected");
        this.f61281e = true;
        this.f61280d.onServiceConnected(componentName, iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceDisconnected");
        this.f61281e = false;
        this.f61280d.onServiceDisconnected(componentName);
    }
}
