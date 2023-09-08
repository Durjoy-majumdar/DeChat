package ow0;

import android.bluetooth.BluetoothSocket;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;
import java.io.IOException;
import java.io.InputStream;
import lu3.C88656g;

/* renamed from: ow0.d */
public final class C21902d implements C88656g {

    /* renamed from: d */
    public final BluetoothSocket f61943d;

    /* renamed from: e */
    public InputStream f61944e = null;

    /* renamed from: f */
    public C21899b f61945f;

    /* renamed from: g */
    public C21894a f61946g;

    /* renamed from: h */
    public volatile boolean f61947h = false;

    public C21902d(C21899b bVar, C21894a aVar, BluetoothSocket bluetoothSocket) {
        this.f61943d = bluetoothSocket;
        this.f61945f = bVar;
        this.f61946g = aVar;
        try {
            this.f61944e = bluetoothSocket.getInputStream();
        } catch (IOException e) {
            this.f61944e = null;
            Log.m105921e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! (%s)", e.toString());
        }
    }

    /* renamed from: a */
    public void mo34941a() {
        Log.m105924i("MicroMsg.exdevice.RecvThread", "------cancel------");
        if (this.f61947h) {
            Log.m105928w("MicroMsg.exdevice.RecvThread", "Cancel is done aready, just leave");
            return;
        }
        this.f61947h = true;
        try {
            this.f61943d.close();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.RecvThread", "close() of connect socket failed", e);
        }
    }

    public String getKey() {
        return "BluetoothChatSession_recv";
    }

    public void run() {
        Log.m105924i("MicroMsg.exdevice.RecvThread", "BEGIN RecvThread");
        if (this.f61944e == null) {
            Log.m105920e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! Just Leave");
            return;
        }
        byte[] bArr = new byte[2048];
        while (!this.f61947h) {
            try {
                int read = this.f61944e.read(bArr);
                if (read > 0) {
                    Log.m105925i("MicroMsg.exdevice.RecvThread", "------On data receivce------data length = %d", Integer.valueOf(read));
                    Log.m105919d("MicroMsg.exdevice.RecvThread", "data dump = %s", C45288e.m50131b(bArr, read));
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    C21894a aVar = this.f61946g;
                    if (aVar != null) {
                        aVar.f61916a.mo34932e(this.f61945f.f61930b, bArr2);
                    }
                }
            } catch (IOException e) {
                Log.m105921e("MicroMsg.exdevice.RecvThread", "mInStream.read Failed!!! (%s)", e.toString());
                try {
                    this.f61943d.close();
                    return;
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.exdevice.RecvThread", "Close socket failed!!! (%s)", e2.toString());
                    return;
                }
            }
        }
        Log.m105928w("MicroMsg.exdevice.RecvThread", "Cancel is called while receiving data, just leave");
    }
}
