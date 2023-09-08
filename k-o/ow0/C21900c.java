package ow0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.io.IOException;
import java.lang.ref.WeakReference;
import mu3.C109639a;
import zt3.C119157j;

/* renamed from: ow0.c */
public final class C21900c {

    /* renamed from: a */
    public BluetoothSocket f61935a;

    /* renamed from: b */
    public final boolean f61936b;

    /* renamed from: c */
    public final C21899b f61937c;

    /* renamed from: d */
    public final C21894a f61938d;

    /* renamed from: e */
    public boolean f61939e = false;

    /* renamed from: f */
    public final BluetoothDevice f61940f;

    /* renamed from: g */
    public final MMHandler f61941g;

    /* renamed from: ow0.c$a */
    public static class C21901a extends MMHandler {

        /* renamed from: a */
        public WeakReference<C21900c> f61942a = null;

        public C21901a(C109639a aVar, C21900c cVar) {
            super(aVar);
            this.f61942a = new WeakReference<>(cVar);
        }

        public void handleMessage(Message message) {
            C21900c cVar = this.f61942a.get();
            if (cVar == null) {
                Log.m105920e("MicroMsg.exdevice.BluetoothChatThreads", "null == connectTread");
                return;
            }
            int i = message.what;
            if (i == 0) {
                Log.m105924i("MicroMsg.exdevice.ConnectThread", "------connectImp------");
                if (cVar.f61939e) {
                    Log.m105928w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready connect, just leave");
                    return;
                }
                try {
                    if (cVar.f61936b) {
                        cVar.f61935a = cVar.f61940f.createRfcommSocketToServiceRecord(C21894a.f61914i);
                    } else {
                        cVar.f61935a = cVar.f61940f.createInsecureRfcommSocketToServiceRecord(C21894a.f61915j);
                    }
                    try {
                        cVar.f61935a.connect();
                        cVar.f61939e = true;
                        C21899b bVar = cVar.f61937c;
                        C21894a aVar = cVar.f61938d;
                        BluetoothSocket bluetoothSocket = cVar.f61935a;
                        bVar.getClass();
                        Log.m105924i("MicroMsg.exdevice.BluetoothChatSession", "connected");
                        C21902d dVar = bVar.f61932d;
                        if (dVar != null) {
                            dVar.mo34941a();
                            bVar.f61932d = null;
                        }
                        C21903e eVar = bVar.f61933e;
                        if (eVar != null) {
                            eVar.f61948d = null;
                            eVar.f61954j = true;
                            synchronized (eVar) {
                                eVar.notify();
                            }
                            eVar.f61951g.clear();
                            eVar.f61950f.clear();
                            bVar.f61933e = null;
                        }
                        C21902d dVar2 = new C21902d(bVar, aVar, bluetoothSocket);
                        bVar.f61932d = dVar2;
                        ((C119157j) C119157j.f356862d).mo183884o(dVar2);
                        C21903e eVar2 = new C21903e(bVar, aVar, bluetoothSocket);
                        bVar.f61933e = eVar2;
                        ((C119157j) C119157j.f356862d).mo183884o(eVar2);
                        C21894a aVar2 = cVar.f61938d;
                        if (aVar2 != null) {
                            aVar2.f61916a.mo34928a(cVar.f61937c.f61930b, true);
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.exdevice.ConnectThread", "socket connect failed (%s)", e.toString());
                        try {
                            cVar.f61935a.close();
                        } catch (IOException e2) {
                            Log.m105921e("MicroMsg.exdevice.ConnectThread", "Close socket failed!!! (%s)", e2.toString());
                        }
                        C21894a aVar3 = cVar.f61938d;
                        if (aVar3 != null) {
                            aVar3.f61916a.mo34928a(cVar.f61937c.f61930b, false);
                        }
                    }
                } catch (IOException e3) {
                    cVar.f61935a = null;
                    Log.m105921e("MicroMsg.exdevice.ConnectThread", "createRfcommSocket Failed!!! (%s)", e3.toString());
                    C21894a aVar4 = cVar.f61938d;
                    if (aVar4 != null) {
                        aVar4.f61916a.mo34928a(cVar.f61937c.f61930b, false);
                    }
                }
            } else if (i == 1) {
                if (!cVar.f61939e) {
                    Log.m105928w("MicroMsg.exdevice.ConnectThread", "Remoto device is aready disconnect, just leave");
                    return;
                }
                try {
                    cVar.f61935a.close();
                } catch (IOException e4) {
                    Log.m105921e("MicroMsg.exdevice.ConnectThread", "socket close failed (%s)", e4.toString());
                }
            }
        }
    }

    public C21900c(C21899b bVar, C21894a aVar, BluetoothDevice bluetoothDevice, boolean z) {
        this.f61938d = aVar;
        this.f61937c = bVar;
        this.f61936b = z;
        this.f61940f = bluetoothDevice;
        this.f61941g = new C21901a(C109639a.m148950a("BluetoothChatThreads_handlerThread"), this);
    }

    /* renamed from: a */
    public void mo34940a() {
        Log.m105924i("MicroMsg.exdevice.ConnectThread", "------disconnect------");
        MMHandler mMHandler = this.f61941g;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(1))) {
            Log.m105921e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", 1);
        }
        this.f61941g.quitSafely();
    }
}
