package qk0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import mk0.C88736a;
import nk0.C21634h;
import nk0.C89000c;
import nk0.C89007g;

/* renamed from: qk0.a */
public abstract class C89684a implements C21634h {

    /* renamed from: a */
    public C89007g f257933a;

    /* renamed from: b */
    public C89000c f257934b;

    /* renamed from: c */
    public C89687b f257935c;

    /* renamed from: d */
    public final Handler f257936d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final Runnable f257937e = new C89685a();

    /* renamed from: f */
    public boolean f257938f;

    /* renamed from: g */
    public boolean f257939g;

    /* renamed from: h */
    public boolean f257940h;

    /* renamed from: i */
    public long f257941i;

    /* renamed from: j */
    public long f257942j;

    /* renamed from: k */
    public C89696k f257943k;

    /* renamed from: l */
    public volatile boolean f257944l;

    /* renamed from: m */
    public int f257945m;

    /* renamed from: qk0.a$a */
    public class C89685a implements Runnable {
        public C89685a() {
        }

        public void run() {
            if (!C89684a.this.f257944l) {
                C89684a.this.mo124011p(C89696k.f257982s);
                C89684a.this.mo124010m();
            }
        }
    }

    /* renamed from: qk0.a$b */
    public class C89686b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89696k f257947d;

        public C89686b(C89696k kVar) {
            this.f257947d = kVar;
        }

        public void run() {
            C89684a.this.f257935c.mo114631a(this.f257947d);
        }
    }

    public C89684a() {
        C88736a.m110767a().getClass();
        this.f257938f = false;
        C88736a.m110767a().getClass();
        this.f257939g = true;
        C88736a.m110767a().getClass();
        this.f257940h = true;
        C88736a.m110767a().getClass();
        this.f257941i = 33000;
        C88736a.m110767a().getClass();
        this.f257942j = (long) 10;
        this.f257944l = false;
        this.f257945m = hashCode();
    }

    /* renamed from: a */
    public void mo33877a(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    /* renamed from: b */
    public void mo33878b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* renamed from: c */
    public void mo33879c(BluetoothGatt bluetoothGatt, int i) {
    }

    /* renamed from: d */
    public void mo33880d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    /* renamed from: e */
    public void mo33881e(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    /* renamed from: f */
    public void mo33882f(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
    }

    /* renamed from: g */
    public void mo33883g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
    }

    /* renamed from: h */
    public void mo33884h(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    /* renamed from: i */
    public void mo33885i(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    /* renamed from: j */
    public void mo33886j(BluetoothGatt bluetoothGatt, int i) {
    }

    /* renamed from: k */
    public void mo124009k() {
        Assert.assertNotNull(this.f257933a);
        Assert.assertNotNull(this.f257934b);
        Assert.assertNotNull(this.f257935c);
        this.f257936d.postDelayed(this.f257937e, this.f257941i);
        mo123562l();
    }

    /* renamed from: l */
    public abstract void mo123562l();

    /* renamed from: m */
    public void mo124010m() {
        this.f257936d.removeCallbacks(this.f257937e);
        this.f257944l = true;
        mo123564o(this.f257943k);
        C89000c cVar = this.f257934b;
        Object obj = this.f257943k;
        cVar.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = this;
        if (obj == null) {
            obj = "";
        }
        objArr[1] = obj;
        Log.m105925i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback action:%s result:%s", objArr);
        if (this.f257940h) {
            cVar.mo123371k();
            return;
        }
        List<C89684a> list = cVar.f256590c;
        if (list != null) {
            ((ArrayList) list).remove(this);
        } else {
            Log.m105925i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback, runActions is null", new Object[0]);
        }
    }

    /* renamed from: n */
    public abstract String mo123563n();

    /* renamed from: o */
    public void mo123564o(C89696k kVar) {
    }

    /* renamed from: p */
    public void mo124011p(C89696k kVar) {
        this.f257943k = kVar;
        if (this.f257939g) {
            this.f257936d.post(new C89686b(kVar));
        } else {
            this.f257935c.mo114631a(kVar);
        }
    }

    public String toString() {
        return "Action#" + this.f257945m + "{action='" + mo123563n() + '\'' + ", debug=" + this.f257938f + ", mainThread=" + this.f257939g + ", serial=" + this.f257940h + '}';
    }
}
