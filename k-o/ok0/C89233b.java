package ok0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Build;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86917b;
import nk0.C21633a;
import nk0.C89007g;
import qk0.C89684a;
import qk0.C89691f;
import qk0.C89694i;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: ok0.b */
public class C89233b extends C89684a {

    /* renamed from: n */
    public String f257106n;

    /* renamed from: o */
    public boolean f257107o;

    /* renamed from: p */
    public String f257108p = "LE";

    /* renamed from: q */
    public long f257109q = 0;

    /* renamed from: r */
    public String f257110r = null;

    /* renamed from: s */
    public boolean f257111s = true;

    /* renamed from: ok0.b$a */
    public class C89234a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BluetoothGatt f257112d;

        /* renamed from: e */
        public final /* synthetic */ int f257113e;

        public C89234a(BluetoothGatt bluetoothGatt, int i) {
            this.f257112d = bluetoothGatt;
            this.f257113e = i;
        }

        public void run() {
            Integer num;
            String str = C89233b.this.f257110r;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1924829944:
                        if (str.equals("balanced")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1837176303:
                        if (str.equals("lowPower")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3202466:
                        if (str.equals("high")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        num = 0;
                        break;
                    case 1:
                        num = 2;
                        break;
                    case 2:
                        num = 1;
                        break;
                }
            }
            num = null;
            if (num != null) {
                Log.m105925i("MicroMsg.Ble.ConnectAction", "Attempting to requestConnectionPriority, " + num, new Object[0]);
                if (!this.f257112d.requestConnectionPriority(num.intValue())) {
                    Log.m105929w("MicroMsg.Ble.ConnectAction", "requestConnectionPriority fail", new Object[0]);
                }
            }
            C89233b bVar = C89233b.this;
            if (bVar.f257111s) {
                Log.m105925i("MicroMsg.Ble.ConnectAction", "Attempting to start service discovery", new Object[0]);
                this.f257112d.discoverServices();
                return;
            }
            int i = this.f257113e;
            if (i == 0) {
                bVar.mo124011p(C89696k.f257968e);
            } else {
                bVar.mo124011p(C89233b.m111517q(bVar, i));
            }
            C89233b.this.mo124010m();
            C89007g gVar = C89233b.this.f257933a;
            BluetoothGatt bluetoothGatt = this.f257112d;
            int i2 = this.f257113e;
            gVar.getClass();
            if (bluetoothGatt != null && i2 == 0) {
                String address = bluetoothGatt.getDevice().getAddress();
                C89694i iVar = gVar.f256608h;
                if (iVar == null) {
                    Log.m105929w(gVar.f256601a, "notifyConnectionStateChange, onBleConnectionStateChange is null", new Object[0]);
                } else {
                    iVar.mo114612a(address, true);
                }
            }
        }
    }

    /* renamed from: ok0.b$b */
    public class C89235b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f257115d;

        public C89235b(int i) {
            this.f257115d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.Ble.ConnectAction", "close", new Object[0]);
            C89233b.this.f257933a.mo123376k(false);
            C89233b bVar = C89233b.this;
            bVar.mo124011p(C89233b.m111517q(bVar, this.f257115d));
            C89233b.this.mo124010m();
        }
    }

    public C89233b(String str) {
        this.f257106n = str;
    }

    /* renamed from: q */
    public static C89696k m111517q(C89233b bVar, int i) {
        bVar.getClass();
        return new C89696k(10003, "fail:connection fail" + " " + "status:" + i, C86917b.f252269G, (Object) null);
    }

    /* renamed from: i */
    public void mo33885i(BluetoothGatt bluetoothGatt, int i, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.toString() : "";
        objArr[1] = C89691f.m112154a(i);
        objArr[2] = i2 == 2 ? "CONNECTED" : "DISCONNECTED";
        Log.m105925i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange]gatt:%s gattStatus:%s, newState:%s", objArr);
        this.f257933a.f256605e = bluetoothGatt;
        if (i2 == 2) {
            if (bluetoothGatt == null) {
                Log.m105929w("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] gatt is null", new Object[0]);
                return;
            }
            Log.m105925i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] discoverServicesDelayMills: " + this.f257109q, new Object[0]);
            this.f257936d.postDelayed(new C89234a(bluetoothGatt, i), this.f257109q);
        } else if (i2 == 0) {
            this.f257936d.post(new C89235b(i));
        }
    }

    /* renamed from: j */
    public void mo33886j(BluetoothGatt bluetoothGatt, int i) {
        String a = C89691f.m112154a(i);
        Log.m105925i("MicroMsg.Ble.ConnectAction", "[onServicesDiscovered] status:%s", a);
        this.f257933a.f256605e = bluetoothGatt;
        if (i == 0) {
            mo124011p(C89696k.f257968e);
        } else {
            mo124011p(new C89696k(10008, "fail:not found service, " + ("status: " + a), C86917b.f252281d, (Object) null));
        }
        mo124010m();
        C89007g gVar = this.f257933a;
        gVar.getClass();
        if (bluetoothGatt != null && i == 0) {
            String address = bluetoothGatt.getDevice().getAddress();
            C89694i iVar = gVar.f256608h;
            if (iVar == null) {
                Log.m105929w(gVar.f256601a, "notifyConnectionStateChange, onBleConnectionStateChange is null", new Object[0]);
            } else {
                iVar.mo114612a(address, true);
            }
        }
    }

    /* renamed from: l */
    public void mo123562l() {
        BluetoothGatt bluetoothGatt;
        BluetoothAdapter d = C90216b.m112935d();
        boolean z = false;
        if (d == null) {
            Log.m105921e("MicroMsg.Ble.ConnectAction", "action:%s, bluetoothAdapter is null", this);
            mo124011p(C89696k.f257972i);
            mo124010m();
            return;
        }
        String str = this.f257106n;
        if (str == null || !BluetoothAdapter.checkBluetoothAddress(str)) {
            Log.m105929w("MicroMsg.Ble.ConnectAction", "action:%s, unspecified deviceId", this);
            mo124011p(C89696k.f257984u);
            mo124010m();
        } else if (!C90216b.m112933b()) {
            Log.m105921e("MicroMsg.Ble.ConnectAction", "bluetooth is not enable.", new Object[0]);
            mo124011p(C89696k.f257972i);
            mo124010m();
        } else if (this.f257933a.f256605e != null) {
            Log.m105929w("MicroMsg.Ble.ConnectAction", "already connect, please close", new Object[0]);
            mo124011p(C89696k.f257983t);
            mo124010m();
        } else {
            BluetoothDevice remoteDevice = d.getRemoteDevice(this.f257106n);
            if (remoteDevice != null) {
                Log.m105925i("MicroMsg.Ble.ConnectAction", "autoConnect:%b transport:%s", Boolean.valueOf(this.f257107o), this.f257108p);
                if (Build.VERSION.SDK_INT >= 23) {
                    String upperCase = this.f257108p.toUpperCase();
                    upperCase.getClass();
                    char c = 65535;
                    switch (upperCase.hashCode()) {
                        case 2425:
                            if (upperCase.equals("LE")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2020783:
                            if (upperCase.equals("AUTO")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 63463747:
                            if (upperCase.equals("BREDR")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            bluetoothGatt = remoteDevice.connectGatt(this.f257933a.f256602b, this.f257107o, new C21633a(this.f257933a), 2);
                            break;
                        case 1:
                            bluetoothGatt = remoteDevice.connectGatt(this.f257933a.f256602b, this.f257107o, new C21633a(this.f257933a), 0);
                            break;
                        case 2:
                            bluetoothGatt = remoteDevice.connectGatt(this.f257933a.f256602b, this.f257107o, new C21633a(this.f257933a), 1);
                            break;
                        default:
                            bluetoothGatt = remoteDevice.connectGatt(this.f257933a.f256602b, this.f257107o, new C21633a(this.f257933a), 2);
                            break;
                    }
                } else {
                    bluetoothGatt = remoteDevice.connectGatt(this.f257933a.f256602b, this.f257107o, new C21633a(this.f257933a));
                }
                if (bluetoothGatt != null) {
                    Log.m105925i("MicroMsg.Ble.ConnectAction", "mBluetoothGatt:%s", bluetoothGatt);
                    Object[] objArr = new Object[2];
                    objArr[0] = this.f257106n;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.Ble.ConnectAction", "create a new connection deviceId=%s mainthread:%b", objArr);
                    this.f257933a.f256605e = bluetoothGatt;
                    return;
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = this.f257106n;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    z = true;
                }
                objArr2[1] = Boolean.valueOf(z);
                Log.m105921e("MicroMsg.Ble.ConnectAction", "Get Gatt fail!, deviceId=%s mainthread:%b", objArr2);
                mo124011p(C89696k.m112157a("gatt is null"));
                mo124010m();
                return;
            }
            Log.m105921e("MicroMsg.Ble.ConnectAction", "Device not found, deviceId=%s", this.f257106n);
            mo124011p(C89696k.f257970g);
            mo124010m();
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "ConnectAction";
    }

    /* renamed from: o */
    public void mo123564o(C89696k kVar) {
        if (kVar.f257988a == 10012) {
            this.f257933a.mo123376k(false);
        }
    }

    public String toString() {
        return "ConnectAction#" + this.f257945m + "{deviceId='" + this.f257106n + '\'' + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
