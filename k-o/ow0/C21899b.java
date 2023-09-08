package ow0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;

/* renamed from: ow0.b */
public class C21899b {

    /* renamed from: a */
    public long f61929a;

    /* renamed from: b */
    public long f61930b;

    /* renamed from: c */
    public C21900c f61931c = null;

    /* renamed from: d */
    public C21902d f61932d = null;

    /* renamed from: e */
    public C21903e f61933e = null;

    /* renamed from: f */
    public BluetoothDevice f61934f;

    public C21899b(long j) {
        this.f61929a = j;
        this.f61930b = j;
        this.f61934f = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(C45288e.m50135f(j));
    }

    /* renamed from: a */
    public boolean mo34936a(C21894a aVar, boolean z) {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatSession", "connect");
        if (this.f61934f == null) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatSession", "Can not found remote device(" + C45288e.m50135f(this.f61929a) + ")");
            if (aVar != null) {
                aVar.f61916a.mo34931d(this.f61930b, 7, "Device not found");
            }
            return false;
        }
        C21900c cVar = this.f61931c;
        if (cVar != null) {
            cVar.mo34940a();
            this.f61931c = null;
        }
        C21900c cVar2 = new C21900c(this, aVar, this.f61934f, z);
        this.f61931c = cVar2;
        Log.m105924i("MicroMsg.exdevice.ConnectThread", "------connect------");
        MMHandler mMHandler = cVar2.f61941g;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(0))) {
            Log.m105921e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", 0);
            if (aVar != null) {
                aVar.f61916a.mo34928a(this.f61930b, false);
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo34937b() {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
        C21900c cVar = this.f61931c;
        if (cVar != null) {
            cVar.mo34940a();
            this.f61931c = null;
        }
        C21902d dVar = this.f61932d;
        if (dVar != null) {
            dVar.mo34941a();
            this.f61932d = null;
        }
        C21903e eVar = this.f61933e;
        if (eVar != null) {
            eVar.f61948d = null;
            eVar.f61954j = true;
            synchronized (eVar) {
                eVar.notify();
            }
            eVar.f61951g.clear();
            eVar.f61950f.clear();
            this.f61933e = null;
        }
    }

    /* renamed from: c */
    public long mo34938c() {
        return this.f61930b;
    }

    /* renamed from: d */
    public boolean mo34939d(byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatSession", "write");
        C21903e eVar = this.f61933e;
        if (eVar == null) {
            return false;
        }
        eVar.getClass();
        Log.m105925i("MicroMsg.exdevice.SendThread", "------write------buffer length = %d", Integer.valueOf(bArr.length));
        if (eVar.f61948d == null) {
            Log.m105920e("MicroMsg.exdevice.SendThread", "Send thread has been close. Send data abort");
            return false;
        }
        synchronized (eVar) {
            eVar.f61950f.add(bArr);
            eVar.notify();
        }
        return true;
    }
}
