package ow0;

import android.bluetooth.BluetoothSocket;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import junit.framework.Assert;
import lu3.C88656g;

/* renamed from: ow0.e */
public final class C21903e implements C88656g {

    /* renamed from: d */
    public volatile Runnable f61948d = null;

    /* renamed from: e */
    public OutputStream f61949e = null;

    /* renamed from: f */
    public final LinkedList<byte[]> f61950f = new LinkedList<>();

    /* renamed from: g */
    public final LinkedList<byte[]> f61951g = new LinkedList<>();

    /* renamed from: h */
    public C21899b f61952h = null;

    /* renamed from: i */
    public C21894a f61953i = null;

    /* renamed from: j */
    public volatile boolean f61954j = false;

    public C21903e(C21899b bVar, C21894a aVar, BluetoothSocket bluetoothSocket) {
        this.f61952h = bVar;
        this.f61953i = aVar;
        try {
            OutputStream outputStream = bluetoothSocket.getOutputStream();
            this.f61948d = this;
            this.f61949e = outputStream;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.SendThread", "temp sockets not created", e);
            this.f61949e = null;
            if (this.f61953i != null) {
                this.f61953i.f61916a.mo34931d(this.f61952h.f61930b, 11, "Can not get write stream");
            }
        }
    }

    public String getKey() {
        return "BluetoothChatSession_send";
    }

    public void run() {
        Log.m105924i("MicroMsg.exdevice.SendThread", "BEGIN SendThread");
        if (this.f61949e != null) {
            while (!this.f61954j) {
                if (this.f61948d == null) {
                    Log.m105928w("MicroMsg.exdevice.SendThread", "Send thread has been close. just leave");
                    return;
                } else if (!this.f61951g.isEmpty()) {
                    try {
                        this.f61949e.write(this.f61951g.pop());
                        C21894a aVar = this.f61953i;
                        if (aVar != null) {
                            aVar.f61916a.mo34933f(this.f61952h.mo34938c(), true);
                        }
                    } catch (IOException unused) {
                        C21894a aVar2 = this.f61953i;
                        if (aVar2 != null) {
                            aVar2.f61916a.mo34933f(this.f61952h.mo34938c(), false);
                        }
                    }
                } else if (!this.f61950f.isEmpty()) {
                    synchronized (this.f61950f) {
                        Assert.assertTrue(this.f61951g.addAll(this.f61950f));
                        this.f61950f.clear();
                    }
                } else {
                    synchronized (this) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Log.printErrStackTrace("MicroMsg.exdevice.SendThread", e, "", new Object[0]);
                            Log.m105928w("MicroMsg.exdevice.SendThread", "BluetoothChatThread_SendRunnable InterruptedException...");
                        }
                    }
                }
            }
        }
    }
}
