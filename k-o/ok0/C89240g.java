package ok0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fl0.C86920e;
import gy3.C87412m;
import java.util.Set;
import qk0.C89684a;
import qk0.C89696k;
import rx3.C13598b0;
import sk0.C90216b;

/* renamed from: ok0.g */
public final class C89240g extends C89684a {

    /* renamed from: n */
    public final String f257126n;

    /* renamed from: o */
    public final byte[] f257127o;

    /* renamed from: p */
    public final boolean f257128p;

    /* renamed from: q */
    public final boolean f257129q;

    /* renamed from: r */
    public final String f257130r = ("MicroMsg.Ble.Action#" + hashCode());

    /* renamed from: s */
    public C89241a f257131s;

    /* renamed from: ok0.g$a */
    public final class C89241a extends BroadcastReceiver {

        /* renamed from: a */
        public final Context f257132a;

        /* renamed from: b */
        public final BluetoothDevice f257133b;

        /* renamed from: c */
        public final /* synthetic */ C89240g f257134c;

        public C89241a(C89240g gVar, Context context, BluetoothDevice bluetoothDevice) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(bluetoothDevice, TPReportKeys.Common.COMMON_DEVICE_NAME);
            this.f257134c = gVar;
            this.f257132a = context;
            this.f257133b = bluetoothDevice;
        }

        public void onReceive(Context context, Intent intent) {
            if (C87412m.m108589b(this.f257133b, intent != null ? intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null)) {
                String str = this.f257134c.f257130r;
                Log.m105925i(str, "onReceive, intent: " + intent, new Object[0]);
                if (C87412m.m108589b("android.bluetooth.device.action.PAIRING_REQUEST", intent.getAction())) {
                    if (!intent.hasExtra("android.bluetooth.device.extra.PAIRING_VARIANT")) {
                        Log.m105929w(this.f257134c.f257130r, "Cannot find EXTRA_PAIRING_VARIANT", new Object[0]);
                        return;
                    }
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
                    if (intExtra == 0) {
                        Log.m105925i(this.f257134c.f257130r, "PAIRING_VARIANT_PIN", new Object[0]);
                        C89240g gVar = this.f257134c;
                        if (gVar.f257127o == null) {
                            gVar.mo124011p(C89696k.f257985v);
                            this.f257134c.mo124010m();
                            return;
                        }
                        Log.m105925i(gVar.f257130r, "setPin", new Object[0]);
                        if (this.f257133b.setPin(this.f257134c.f257127o)) {
                            C89240g gVar2 = this.f257134c;
                            if (!gVar2.f257129q) {
                                gVar2.mo124011p(C89696k.f257968e);
                                this.f257134c.mo124010m();
                            }
                        }
                    } else if (intExtra == 2) {
                        Log.m105925i(this.f257134c.f257130r, "PAIRING_VARIANT_PASSKEY_CONFIRMATION", new Object[0]);
                    }
                } else if (!C87412m.m108589b("android.bluetooth.device.action.BOND_STATE_CHANGED", intent.getAction())) {
                } else {
                    if (!intent.hasExtra("android.bluetooth.device.extra.BOND_STATE")) {
                        Log.m105929w(this.f257134c.f257130r, "Cannot find EXTRA_BOND_STATE", new Object[0]);
                        return;
                    }
                    switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) {
                        case 10:
                            String str2 = this.f257134c.f257130r;
                            Log.m105925i(str2, "BOND_NONE, reason: " + intent.getIntExtra("android.bluetooth.device.extra.REASON", -1), new Object[0]);
                            this.f257134c.mo124011p(C89696k.m112157a((String) null));
                            this.f257134c.mo124010m();
                            return;
                        case 11:
                            Log.m105925i(this.f257134c.f257130r, "BOND_BONDING", new Object[0]);
                            return;
                        case 12:
                            Log.m105925i(this.f257134c.f257130r, "BOND_BONDED", new Object[0]);
                            this.f257134c.mo124011p(C89696k.f257968e);
                            this.f257134c.mo124010m();
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public C89240g(String str, byte[] bArr, long j, boolean z, boolean z2) {
        C87412m.m108594g(str, "deviceId");
        this.f257126n = str;
        this.f257127o = bArr;
        this.f257128p = z;
        this.f257129q = z2;
        this.f257941i = j;
    }

    /* renamed from: l */
    public void mo123562l() {
        if (!C90216b.m112933b()) {
            Log.m105929w(this.f257130r, "Bluetooth is not enable.", new Object[0]);
            mo124011p(C89696k.f257972i);
            mo124010m();
        } else if (!BluetoothAdapter.checkBluetoothAddress(this.f257126n)) {
            Log.m105929w(this.f257130r, "Invalid deviceId", new Object[0]);
            mo124011p(C89696k.f257984u);
            mo124010m();
        } else {
            BluetoothAdapter d = C90216b.m112935d();
            if (d == null) {
                Log.m105929w(this.f257130r, "Bluetooth is not enable.", new Object[0]);
                mo124011p(C89696k.f257972i);
                mo124010m();
                return;
            }
            BluetoothDevice remoteDevice = d.getRemoteDevice(this.f257126n);
            if (!this.f257128p) {
                Set<BluetoothDevice> bondedDevices = d.getBondedDevices();
                boolean z = true;
                if (bondedDevices == null || true != bondedDevices.contains(remoteDevice)) {
                    z = false;
                }
                if (z) {
                    Log.m105925i(this.f257130r, "already paired", new Object[0]);
                    mo124011p(C89696k.f257968e);
                    mo124010m();
                    return;
                }
            }
            Log.m105925i(this.f257130r, "createBond", new Object[0]);
            if (!remoteDevice.createBond()) {
                Log.m105929w(this.f257130r, "startPairing is false", new Object[0]);
                mo124011p(C89696k.m112158b("createBond fail"));
                mo124010m();
                return;
            }
            Context context = this.f257933a.f256602b;
            if (context == null) {
                Log.m105929w(this.f257130r, "context is null", new Object[0]);
                mo124011p(new C89696k(-1, "fail:internal error", C86920e.f252314d, (Object) null));
                mo124010m();
                return;
            }
            C89241a aVar = new C89241a(this, context, remoteDevice);
            this.f257131s = aVar;
            Log.m105925i(aVar.f257134c.f257130r, "pairReceiver.registerSelf", new Object[0]);
            Context context2 = aVar.f257132a;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            C13598b0 b0Var = C13598b0.f38549a;
            context2.registerReceiver(aVar, intentFilter);
        }
    }

    /* renamed from: n */
    public String mo123563n() {
        return "PairAction";
    }

    /* renamed from: o */
    public void mo123564o(C89696k kVar) {
        String str = this.f257130r;
        Log.m105925i(str, "onDone, result: " + kVar, new Object[0]);
        C89241a aVar = this.f257131s;
        if (aVar != null) {
            Log.m105925i(aVar.f257134c.f257130r, "pairReceiver.unregisterSelf", new Object[0]);
            aVar.f257132a.unregisterReceiver(aVar);
        }
        this.f257131s = null;
    }
}
