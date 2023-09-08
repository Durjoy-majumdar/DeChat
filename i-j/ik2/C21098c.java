package ik2;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Build;
import android.os.Message;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.UUID;
import p385u2.C111105a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: ik2.c */
public final class C21098c {

    /* renamed from: e */
    public static final UUID f59656e = UUID.fromString("0000FEEA-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public final C21101b f59657a;

    /* renamed from: b */
    public C21099a f59658b;

    /* renamed from: c */
    public C21102c f59659c;

    /* renamed from: d */
    public C21103d f59660d;

    /* renamed from: ik2.c$a */
    public static final class C21099a {

        /* renamed from: a */
        public final C21098c f59661a;

        /* renamed from: b */
        public final BluetoothDevice f59662b;

        /* renamed from: c */
        public BluetoothSocket f59663c;

        /* renamed from: d */
        public final MMHandler f59664d = new C21100a("RtosBluetoothThreads_handlerThread", this);

        /* renamed from: ik2.c$a$a */
        public static final class C21100a extends MMHandler {

            /* renamed from: a */
            public WeakReference<C21099a> f59665a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21100a(String str, C21099a aVar) {
                super(str);
                C87412m.m108594g(str, "name");
                C87412m.m108594g(aVar, "context");
                this.f59665a = new WeakReference<>(aVar);
            }

            public void handleMessage(Message message) {
                C87412m.m108594g(message, "msg");
                C21099a aVar = this.f59665a.get();
                int i = message.what;
                if (i != 0) {
                    if (i == 1 && aVar != null) {
                        try {
                            Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "[disconnectImp] begin close socket");
                            BluetoothSocket bluetoothSocket = aVar.f59663c;
                            if (bluetoothSocket != null) {
                                bluetoothSocket.close();
                            }
                        } catch (IOException e) {
                            Log.m105921e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e.toString());
                        }
                    }
                } else if (aVar != null) {
                    Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "begin socket create");
                    if (Build.VERSION.SDK_INT < 31 || C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.BLUETOOTH_CONNECT") == 0) {
                        try {
                            aVar.f59663c = aVar.f59662b.createInsecureRfcommSocketToServiceRecord(C21098c.f59656e);
                            Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "begin socket connect()");
                            try {
                                aVar.f59661a.f59657a.mo24195k();
                                BluetoothSocket bluetoothSocket2 = aVar.f59663c;
                                if (bluetoothSocket2 != null) {
                                    bluetoothSocket2.connect();
                                }
                                aVar.f59661a.f59657a.mo24192i0();
                                C21098c cVar = aVar.f59661a;
                                BluetoothSocket bluetoothSocket3 = aVar.f59663c;
                                C21102c cVar2 = cVar.f59659c;
                                if (cVar2 != null) {
                                    Log.m105924i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
                                    if (cVar2.f59669g) {
                                        Log.m105928w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
                                    } else {
                                        cVar2.f59669g = true;
                                    }
                                }
                                cVar.f59659c = null;
                                C21103d dVar = cVar.f59660d;
                                if (dVar != null) {
                                    dVar.mo32869a();
                                }
                                cVar.f59660d = null;
                                C87412m.m108591d(bluetoothSocket3);
                                C21102c cVar3 = new C21102c(cVar, bluetoothSocket3);
                                cVar.f59659c = cVar3;
                                ((C119157j) C119157j.f356862d).mo183884o(cVar3);
                                C21103d dVar2 = new C21103d(cVar, bluetoothSocket3);
                                cVar.f59660d = dVar2;
                                ((C119157j) C119157j.f356862d).mo183884o(dVar2);
                            } catch (IOException e2) {
                                Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "socket connect failed (" + e2 + ')');
                                try {
                                    BluetoothSocket bluetoothSocket4 = aVar.f59663c;
                                    if (bluetoothSocket4 != null) {
                                        bluetoothSocket4.close();
                                    }
                                } catch (IOException e3) {
                                    Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket failed!!! (" + e3 + ')');
                                }
                                aVar.f59661a.f59657a.mo24183c();
                            } catch (SecurityException e4) {
                                Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "socket connect failed (" + e4 + ')');
                                try {
                                    BluetoothSocket bluetoothSocket5 = aVar.f59663c;
                                    if (bluetoothSocket5 != null) {
                                        bluetoothSocket5.close();
                                    }
                                } catch (IOException e5) {
                                    Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket failed!!! (" + e5 + ')');
                                }
                                aVar.f59661a.f59657a.mo24183c();
                            }
                        } catch (IOException e6) {
                            aVar.f59663c = null;
                            Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "createRfcommSocket Failed!!! (" + e6 + ')');
                            aVar.f59661a.f59657a.mo24181a("Can not createRfcommSocket");
                            aVar.f59661a.f59657a.mo24183c();
                        }
                    } else {
                        Log.m105920e("MicroMsg.Rtos.RtosBluetoothThreads", "don`t have bluetooth connect permission");
                    }
                }
            }
        }

        public C21099a(C21098c cVar, BluetoothDevice bluetoothDevice) {
            C87412m.m108594g(cVar, "mSession");
            C87412m.m108594g(bluetoothDevice, "mDevice");
            this.f59661a = cVar;
            this.f59662b = bluetoothDevice;
        }

        /* renamed from: a */
        public final void mo32867a() {
            Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "------disconnect------");
            MMHandler mMHandler = this.f59664d;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(1))) {
                Log.m105921e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 1);
            }
            this.f59664d.quitSafely();
        }
    }

    /* renamed from: ik2.c$b */
    public interface C21101b {
        /* renamed from: a */
        void mo24181a(String str);

        /* renamed from: c */
        void mo24183c();

        /* renamed from: e */
        void mo24187e(byte[] bArr);

        /* renamed from: h */
        void mo24190h(boolean z, int i);

        /* renamed from: i0 */
        void mo24192i0();

        /* renamed from: k */
        void mo24195k();
    }

    /* renamed from: ik2.c$c */
    public static final class C21102c implements Runnable {

        /* renamed from: d */
        public final C21098c f59666d;

        /* renamed from: e */
        public final BluetoothSocket f59667e;

        /* renamed from: f */
        public InputStream f59668f = null;

        /* renamed from: g */
        public boolean f59669g;

        public C21102c(C21098c cVar, BluetoothSocket bluetoothSocket) {
            C87412m.m108594g(cVar, "mSession");
            C87412m.m108594g(bluetoothSocket, "mSocket");
            this.f59666d = cVar;
            this.f59667e = bluetoothSocket;
            try {
                this.f59668f = bluetoothSocket.getInputStream();
            } catch (IOException e) {
                this.f59668f = null;
                Log.m105921e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! (%s)", e.toString());
                this.f59666d.f59657a.mo24181a("Can not get read stream");
            }
        }

        public void run() {
            Log.m105924i("MicroMsg.Rtos.RecvThread", "BEGIN RecvThread");
            if (this.f59668f == null) {
                Log.m105920e("MicroMsg.Rtos.RecvThread", "socket.getInputStream failed!!! Just Leave");
                return;
            }
            byte[] bArr = new byte[Task.EXTRAS_LIMIT_BYTES];
            while (!this.f59669g) {
                try {
                    InputStream inputStream = this.f59668f;
                    C87412m.m108591d(inputStream);
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        this.f59666d.f59657a.mo24187e(bArr2);
                    }
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.Rtos.RecvThread", "mInStream.read Failed!!! (%s)", e.toString());
                    this.f59666d.f59657a.mo24183c();
                    try {
                        this.f59667e.close();
                        return;
                    } catch (IOException e2) {
                        Log.m105921e("MicroMsg.Rtos.RecvThread", "Close socket failed!!! (%s)", e2.toString());
                        return;
                    }
                }
            }
            Log.m105928w("MicroMsg.Rtos.RecvThread", "Cancel is called while receiving data, just leave");
        }
    }

    /* renamed from: ik2.c$d */
    public static final class C21103d implements Runnable {

        /* renamed from: d */
        public final C21098c f59670d;

        /* renamed from: e */
        public OutputStream f59671e;

        /* renamed from: f */
        public boolean f59672f;

        /* renamed from: g */
        public volatile Runnable f59673g;

        /* renamed from: h */
        public final LinkedList<byte[]> f59674h = new LinkedList<>();

        /* renamed from: i */
        public final LinkedList<byte[]> f59675i = new LinkedList<>();

        /* renamed from: j */
        public final Object f59676j = new Object();

        public C21103d(C21098c cVar, BluetoothSocket bluetoothSocket) {
            C87412m.m108594g(cVar, "mSession");
            C87412m.m108594g(bluetoothSocket, "socket");
            this.f59670d = cVar;
            try {
                this.f59671e = bluetoothSocket.getOutputStream();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.Rtos.SendThread", "output sockets not created", e);
                this.f59671e = null;
                this.f59670d.f59657a.mo24181a("Can not get write stream");
            }
            this.f59673g = this;
        }

        /* renamed from: a */
        public final void mo32869a() {
            Log.m105924i("MicroMsg.Rtos.SendThread", "SendThread cancel");
            this.f59673g = null;
            this.f59672f = true;
            synchronized (this.f59676j) {
                Log.m105924i("MicroMsg.Rtos.SendThread", "mLock.notify");
                this.f59676j.notify();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            this.f59675i.clear();
            this.f59674h.clear();
        }

        public void run() {
            Log.m105924i("MicroMsg.Rtos.SendThread", "BEGIN SendThread");
            if (this.f59671e != null) {
                while (true) {
                    if (this.f59672f) {
                        break;
                    } else if (this.f59673g == null) {
                        Log.m105928w("MicroMsg.Rtos.SendThread", "Send thread has been close. just leave");
                        break;
                    } else if (!this.f59675i.isEmpty()) {
                        byte[] pop = this.f59675i.pop();
                        if (pop != null) {
                            if (!(pop.length == 0)) {
                                try {
                                    OutputStream outputStream = this.f59671e;
                                    C87412m.m108591d(outputStream);
                                    outputStream.write(pop);
                                    this.f59670d.f59657a.mo24190h(true, pop.length);
                                } catch (IOException unused) {
                                    this.f59670d.f59657a.mo24190h(false, pop.length);
                                }
                            }
                        }
                        this.f59670d.f59657a.mo24190h(false, 0);
                    } else if (!this.f59674h.isEmpty()) {
                        synchronized (this.f59676j) {
                            if (true ^ this.f59674h.isEmpty()) {
                                this.f59675i.addAll(this.f59674h);
                                this.f59674h.clear();
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    } else {
                        synchronized (this.f59676j) {
                            try {
                                this.f59676j.wait();
                            } catch (InterruptedException e) {
                                Log.printErrStackTrace("MicroMsg.Rtos.SendThread", e, "", new Object[0]);
                            }
                            C13598b0 b0Var2 = C13598b0.f38549a;
                        }
                    }
                }
                Log.m105924i("MicroMsg.Rtos.SendThread", "FINISH SendThread");
            }
        }
    }

    public C21098c(String str, C21101b bVar) {
        C87412m.m108594g(str, TPDownloadProxyEnum.USER_MAC);
        C87412m.m108594g(bVar, "mCallback");
        this.f59657a = bVar;
    }

    /* renamed from: a */
    public final void mo32866a() {
        Log.m105924i("MicroMsg.Rtos.RtosBluetoothSession", "disconnect");
        C21099a aVar = this.f59658b;
        if (aVar != null) {
            aVar.mo32867a();
        }
        this.f59658b = null;
        C21102c cVar = this.f59659c;
        if (cVar != null) {
            Log.m105924i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
            if (cVar.f59669g) {
                Log.m105928w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
            } else {
                cVar.f59669g = true;
            }
        }
        this.f59659c = null;
        C21103d dVar = this.f59660d;
        if (dVar != null) {
            dVar.mo32869a();
        }
        this.f59660d = null;
    }
}
