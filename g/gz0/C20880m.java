package gz0;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gz0.C20872j;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gz0.m */
public class C20880m extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C20872j.C20874b f59010a;

    public C20880m(C20872j.C20874b bVar) {
        this.f59010a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "Receive intent failed");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            Log.m105919d("MicroMsg.CardLbsOrBluetooth", "state:%d", Integer.valueOf(state));
            if (state == 12) {
                C20872j.C20874b bVar = this.f59010a;
                bVar.f58995c = true;
                MMHandlerThread.postToMainThreadDelayed(bVar.f58999g, bVar.f58998f);
            } else if (state == 10) {
                MMHandlerThread.removeRunnable(this.f59010a.f58999g);
                C20872j.C20874b bVar2 = this.f59010a;
                bVar2.f58995c = false;
                ((ConcurrentHashMap) bVar2.f58996d).clear();
            }
        }
    }
}
