package nk0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import qk0.C89684a;

/* renamed from: nk0.c */
public class C89000c implements C21634h {

    /* renamed from: a */
    public volatile Queue<C89684a> f256588a;

    /* renamed from: b */
    public volatile C89684a f256589b;

    /* renamed from: c */
    public volatile List<C89684a> f256590c;

    /* renamed from: d */
    public final Handler f256591d = new Handler(Looper.getMainLooper());

    /* renamed from: nk0.c$a */
    public class C89001a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89684a f256592d;

        public C89001a(C89000c cVar, C89684a aVar) {
            this.f256592d = aVar;
        }

        public void run() {
            this.f256592d.mo124009k();
        }
    }

    /* renamed from: a */
    public void mo33877a(BluetoothGatt bluetoothGatt, int i, int i2) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33877a(bluetoothGatt, i, i2);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33877a(bluetoothGatt, i, i2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo33878b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z = ((C89684a) it.next()).f257944l;
            }
        }
    }

    /* renamed from: c */
    public void mo33879c(BluetoothGatt bluetoothGatt, int i) {
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z = ((C89684a) it.next()).f257944l;
            }
        }
    }

    /* renamed from: d */
    public void mo33880d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33880d(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33880d(bluetoothGatt, bluetoothGattCharacteristic, i);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo33881e(BluetoothGatt bluetoothGatt, int i, int i2) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33881e(bluetoothGatt, i, i2);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33886j(bluetoothGatt, i2);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo33882f(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z = ((C89684a) it.next()).f257944l;
            }
        }
    }

    /* renamed from: g */
    public void mo33883g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33883g(bluetoothGatt, bluetoothGattDescriptor, i);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33883g(bluetoothGatt, bluetoothGattDescriptor, i);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo33884h(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33884h(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33886j(bluetoothGatt, i);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo33885i(BluetoothGatt bluetoothGatt, int i, int i2) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33885i(bluetoothGatt, i, i2);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33885i(bluetoothGatt, i, i2);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo33886j(BluetoothGatt bluetoothGatt, int i) {
        C89684a aVar = this.f256589b;
        if (aVar != null) {
            aVar.mo33886j(bluetoothGatt, i);
        }
        List<C89684a> list = this.f256590c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C89684a aVar2 = (C89684a) it.next();
                if (!aVar2.f257944l) {
                    aVar2.mo33886j(bluetoothGatt, i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo123371k() {
        /*
            r5 = this;
            monitor-enter(r5)
            qk0.a r0 = r5.f256589b     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.f257944l     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            java.util.Queue<qk0.a> r0 = r5.f256588a     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x0043 }
            int r1 = r0.size()     // Catch:{ all -> 0x0043 }
            if (r1 <= 0) goto L_0x0041
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0043 }
            qk0.a r0 = (qk0.C89684a) r0     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "MicroMsg.Ble.BleConnectDispatcher"
            java.lang.String r1 = "curSerialAction is null, err"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0043 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)     // Catch:{ all -> 0x0043 }
            monitor-exit(r5)
            return
        L_0x002b:
            r5.f256589b = r0     // Catch:{ all -> 0x0043 }
            boolean r1 = r0.f257939g     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x003e
            android.os.Handler r1 = r5.f256591d     // Catch:{ all -> 0x0043 }
            nk0.c$a r2 = new nk0.c$a     // Catch:{ all -> 0x0043 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0043 }
            long r3 = r0.f257942j     // Catch:{ all -> 0x0043 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x003e:
            r0.mo124009k()     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r5)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nk0.C89000c.mo123371k():void");
    }
}
