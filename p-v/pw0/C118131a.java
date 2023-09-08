package pw0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C18696o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: pw0.a */
public class C118131a {

    /* renamed from: a */
    public final C118133b f353143a;

    /* renamed from: b */
    public final BroadcastReceiver f353144b;

    /* renamed from: pw0.a$a */
    public class C118132a extends BroadcastReceiver {
        public C118132a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.m105920e("McroMsg.exdevice.BluetoohtStateMonitor", "null == intent");
            } else if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                Log.m105924i("McroMsg.exdevice.BluetoohtStateMonitor", "onReceive, action = " + intent.getAction());
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                if (10 == intExtra || 12 == intExtra) {
                    C18696o oVar = (C18696o) C118131a.this.f353143a;
                    oVar.getClass();
                    Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "OnBluetoothStateChange, state = %d", Integer.valueOf(intExtra));
                    int beginBroadcast = oVar.f52300n.beginBroadcast();
                    while (true) {
                        beginBroadcast--;
                        if (beginBroadcast >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("key_state", intExtra);
                            try {
                                oVar.f52300n.getBroadcastItem(beginBroadcast).mo64192Wv(0, bundle);
                            } catch (RemoteException e) {
                                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.getBroadcastItem(%d).onExdeviceInvoke failed!!!", Integer.valueOf(beginBroadcast));
                                Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
                            }
                        } else {
                            oVar.f52300n.finishBroadcast();
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: pw0.a$b */
    public interface C118133b {
    }

    public C118131a(C118133b bVar) {
        C118132a aVar = new C118132a();
        this.f353144b = aVar;
        Log.m105924i("McroMsg.exdevice.BluetoohtStateMonitor", "register BluetoothState receiver");
        this.f353143a = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        MMApplicationContext.getContext().registerReceiver(aVar, intentFilter);
    }
}
