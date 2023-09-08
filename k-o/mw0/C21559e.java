package mw0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import junit.framework.Assert;
import mu3.C109639a;

/* renamed from: mw0.e */
public final class C21559e {

    /* renamed from: a */
    public long f61044a;

    /* renamed from: b */
    public BluetoothDevice f61045b;

    /* renamed from: c */
    public Context f61046c;

    /* renamed from: d */
    public BluetoothGatt f61047d;

    /* renamed from: e */
    public C21546b f61048e;

    /* renamed from: f */
    public BluetoothGattCharacteristic f61049f;

    /* renamed from: g */
    public BluetoothGattCharacteristic f61050g;

    /* renamed from: h */
    public C21545a f61051h;

    /* renamed from: i */
    public MMHandler f61052i;

    /* renamed from: j */
    public Runnable f61053j;

    /* renamed from: k */
    public Runnable f61054k;

    /* renamed from: l */
    public Runnable f61055l;

    /* renamed from: m */
    public C21559e f61056m = this;

    /* renamed from: n */
    public final LinkedList<byte[]> f61057n = new LinkedList<>();

    /* renamed from: o */
    public volatile boolean f61058o = false;

    /* renamed from: p */
    public int f61059p;

    /* renamed from: q */
    public final BluetoothGattCallback f61060q = new C21560a();

    /* renamed from: mw0.e$a */
    public class C21560a extends BluetoothGattCallback {
        public C21560a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Log.m105924i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceive------");
            MMHandler mMHandler = C21559e.this.f61052i;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(8, bluetoothGattCharacteristic.getValue()))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 8);
            }
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------onCharacteristicRead------ status = %d", Integer.valueOf(i));
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallback------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21559e.this.f61052i;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(7, i, 0))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 7);
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(C21559e.this.f61059p));
            MMHandler mMHandler = C21559e.this.f61052i;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(4, i2, 0))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 4);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWrite------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21559e.this.f61052i;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(6, i, 0, bluetoothGatt))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 6);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------onServicesDiscovered------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21559e.this.f61052i;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(5, i, 0, bluetoothGatt))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 5);
            }
        }
    }

    /* renamed from: mw0.e$b */
    public class C21561b implements Runnable {
        public C21561b() {
        }

        public void run() {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
            C21559e eVar = C21559e.this;
            C21546b bVar = eVar.f61048e;
            if (bVar != null) {
                bVar.f61004a.mo33774e(eVar.f61044a, false);
            }
            C21559e.this.mo33785e();
        }
    }

    /* renamed from: mw0.e$c */
    public class C21562c implements Runnable {
        public C21562c() {
        }

        public void run() {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESession", "Write descriptor timeout!!!");
            C21559e eVar = C21559e.this;
            if (3 == eVar.f61059p) {
                Log.m105928w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
                return;
            }
            eVar.f61052i.removeCallbacks(eVar.f61055l);
            C21559e eVar2 = C21559e.this;
            eVar2.f61059p = 2;
            C21546b bVar = eVar2.f61048e;
            if (bVar != null) {
                bVar.f61004a.mo33770a(eVar2.f61044a, false);
            }
        }
    }

    /* renamed from: mw0.e$d */
    public class C21563d implements Runnable {
        public C21563d() {
        }

        public void run() {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESession", "Connected timeout!!!");
            C21559e eVar = C21559e.this;
            if (3 == eVar.f61059p) {
                Log.m105928w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
                return;
            }
            eVar.f61052i.removeCallbacks(eVar.f61054k);
            C21559e eVar2 = C21559e.this;
            eVar2.f61059p = 2;
            C21546b bVar = eVar2.f61048e;
            if (bVar != null) {
                bVar.f61004a.mo33770a(eVar2.f61044a, false);
            }
        }
    }

    /* renamed from: mw0.e$e */
    public static class C21564e extends MMHandler {

        /* renamed from: a */
        public final WeakReference<C21559e> f61065a;

        public C21564e(C109639a aVar, C21559e eVar) {
            super(aVar);
            this.f61065a = new WeakReference<>(eVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x02ad  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                java.lang.ref.WeakReference<mw0.e> r0 = r13.f61065a
                java.lang.Object r0 = r0.get()
                mw0.e r0 = (mw0.C21559e) r0
                java.lang.String r1 = "MicroMsg.exdevice.BluetoothLESession"
                if (r0 != 0) goto L_0x0012
                java.lang.String r14 = "null == BluetoothLESession"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                return
            L_0x0012:
                int r2 = r14.what
                r3 = 5000(0x1388, double:2.4703E-320)
                java.lang.String r5 = "Connected is done, Just Leave"
                java.lang.String r6 = "Close or disconnect is Called, Just Leave"
                r7 = 2
                r8 = 3
                r9 = 1
                r10 = 0
                switch(r2) {
                    case 0: goto L_0x03c8;
                    case 1: goto L_0x038f;
                    case 2: goto L_0x035e;
                    case 3: goto L_0x0355;
                    case 4: goto L_0x02c8;
                    case 5: goto L_0x014a;
                    case 6: goto L_0x00e5;
                    case 7: goto L_0x0062;
                    case 8: goto L_0x0023;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x0435
            L_0x0023:
                java.lang.Object r14 = r14.obj
                byte[] r14 = (byte[]) r14
                java.lang.String r2 = "------onDataReceiveImp------"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r14)
                if (r2 == 0) goto L_0x0039
                java.lang.String r14 = "Receive data is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                goto L_0x0435
            L_0x0039:
                int r2 = r14.length
                java.lang.String r2 = d81.C45288e.m50131b(r14, r2)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                int r4 = r14.length
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                java.lang.String r4 = "data length = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
                java.lang.Object[] r3 = new java.lang.Object[r9]
                r3[r10] = r2
                java.lang.String r2 = "data dump = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r3)
                mw0.b r1 = r0.f61048e
                if (r1 == 0) goto L_0x0435
                mw0.b$d r1 = r1.f61004a
                long r2 = r0.f61044a
                r1.mo33773d(r2, r14)
                goto L_0x0435
            L_0x0062:
                int r14 = r14.arg1
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
                r2[r10] = r5
                java.lang.String r5 = "------onDataWriteCallbackImp------ status = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r2)
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f61052i
                java.lang.Runnable r5 = r0.f61053j
                r2.removeCallbacks(r5)
                if (r14 == 0) goto L_0x009f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "write data error: "
                r2.append(r3)
                r2.append(r14)
                java.lang.String r14 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x009a
                mw0.b$d r14 = r14.f61004a
                long r1 = r0.f61044a
                r14.mo33774e(r1, r10)
            L_0x009a:
                r0.mo33785e()
                goto L_0x0435
            L_0x009f:
                mw0.a r14 = r0.f61051h
                byte[] r14 = r14.mo33751a()
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.String r5 = d81.C45288e.m50130a(r14)
                r2[r10] = r5
                java.lang.String r5 = "Out data dump = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r5, r2)
                if (r14 != 0) goto L_0x00ca
                java.lang.String r14 = "write data complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x00c5
                mw0.b$d r14 = r14.f61004a
                long r1 = r0.f61044a
                r14.mo33774e(r1, r9)
            L_0x00c5:
                r0.mo33785e()
                goto L_0x0435
            L_0x00ca:
                java.lang.String r2 = "write next chunk..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                android.bluetooth.BluetoothGattCharacteristic r1 = r0.f61050g
                r1.setValue(r14)
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                android.bluetooth.BluetoothGattCharacteristic r1 = r0.f61050g
                r14.writeCharacteristic(r1)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61053j
                r14.postDelayed(r0, r3)
                goto L_0x0435
            L_0x00e5:
                java.lang.Object r2 = r14.obj
                android.bluetooth.BluetoothGatt r2 = (android.bluetooth.BluetoothGatt) r2
                int r14 = r14.arg1
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                r2[r10] = r3
                java.lang.String r3 = "------onDescriptorWriteImp------ status = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f61052i
                java.lang.Runnable r3 = r0.f61054k
                r2.removeCallbacks(r3)
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f61052i
                java.lang.Runnable r3 = r0.f61055l
                r2.removeCallbacks(r3)
                int r2 = r0.f61059p
                if (r8 != r2) goto L_0x010f
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
                goto L_0x0435
            L_0x010f:
                if (r9 != r2) goto L_0x0116
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
                goto L_0x0435
            L_0x0116:
                if (r14 == 0) goto L_0x012c
                java.lang.String r14 = "Write configure descriptor error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x012c:
                r0.f61059p = r9
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0139
                mw0.b$d r14 = r14.f61004a
                long r2 = r0.f61044a
                r14.mo33770a(r2, r9)
            L_0x0139:
                java.lang.Object[] r14 = new java.lang.Object[r9]
                int r0 = r0.f61059p
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r14[r10] = r0
                java.lang.String r0 = "------BLE connect successfully------ mConnectState = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r14)
                goto L_0x0435
            L_0x014a:
                java.lang.Object r2 = r14.obj
                android.bluetooth.BluetoothGatt r2 = (android.bluetooth.BluetoothGatt) r2
                int r14 = r14.arg1
                java.lang.Object[] r11 = new java.lang.Object[r9]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r11[r10] = r12
                java.lang.String r12 = "onServicesDiscoveredImp, status = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r11)
                int r11 = r0.f61059p
                if (r8 != r11) goto L_0x016e
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.removeCallbacks(r0)
                goto L_0x0435
            L_0x016e:
                if (r9 != r11) goto L_0x017c
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.removeCallbacks(r0)
                goto L_0x0435
            L_0x017c:
                if (r14 == 0) goto L_0x0199
                java.lang.String r14 = "Discover services error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0199:
                java.util.HashMap<java.lang.String, java.lang.String> r14 = mw0.C47108k.f126586a
                java.lang.String r14 = "0000fee7-0000-1000-8000-00805f9b34fb"
                java.util.UUID r14 = java.util.UUID.fromString(r14)
                android.bluetooth.BluetoothGattService r14 = r2.getService(r14)
                if (r14 != 0) goto L_0x01c2
                java.lang.String r14 = "Can't not find service(with UUID 0xfee7)"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x01c2:
                java.lang.String r2 = "0000fec8-0000-1000-8000-00805f9b34fb"
                java.util.UUID r2 = java.util.UUID.fromString(r2)
                android.bluetooth.BluetoothGattCharacteristic r2 = r14.getCharacteristic(r2)
                r0.f61049f = r2
                if (r2 != 0) goto L_0x01eb
                java.lang.String r14 = "Can't not find characteristic(with UUID 0xfec8)"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x01eb:
                java.lang.String r2 = "0000fec7-0000-1000-8000-00805f9b34fb"
                java.util.UUID r2 = java.util.UUID.fromString(r2)
                android.bluetooth.BluetoothGattCharacteristic r14 = r14.getCharacteristic(r2)
                r0.f61050g = r14
                if (r14 != 0) goto L_0x0214
                java.lang.String r14 = "Can't not find characteristic(with UUID 0xfec7)"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0214:
                android.bluetooth.BluetoothGattCharacteristic r14 = r0.f61049f
                int r14 = r14.getProperties()
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
                r2[r10] = r5
                java.lang.String r5 = "mRecvCharacteristic.getProperties = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r2)
                r14 = r14 & 32
                if (r14 != 0) goto L_0x0246
                java.lang.String r14 = "Read characteristic can not be indicated"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0246:
                java.lang.String r14 = "Set read characteristic indicator"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                mw0.e r14 = r0.f61056m
                android.bluetooth.BluetoothGattCharacteristic r2 = r0.f61049f
                android.bluetooth.BluetoothGatt r5 = r14.f61047d
                boolean r5 = r5.setCharacteristicNotification(r2, r9)
                if (r5 != 0) goto L_0x025d
                java.lang.String r14 = "Unable to set indicator for read characteristic"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                goto L_0x02a2
            L_0x025d:
                java.lang.String r5 = "00002902-0000-1000-8000-00805f9b34fb"
                java.util.UUID r5 = java.util.UUID.fromString(r5)
                android.bluetooth.BluetoothGattDescriptor r2 = r2.getDescriptor(r5)
                if (r2 != 0) goto L_0x026f
                java.lang.String r14 = "Can not get configure descriptor"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                goto L_0x02a2
            L_0x026f:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Configure descriptor permissions: "
                r5.append(r6)
                int r6 = r2.getPermissions()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                byte[] r5 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
                boolean r5 = r2.setValue(r5)
                if (r5 != 0) goto L_0x0295
                java.lang.String r14 = "Can not set configure descriptor value"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                goto L_0x02a2
            L_0x0295:
                android.bluetooth.BluetoothGatt r5 = r14.f61047d
                boolean r2 = r5.writeDescriptor(r2)
                if (r2 != 0) goto L_0x02a4
                java.lang.String r14 = "Can not write configure descriptor value"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            L_0x02a2:
                r9 = 0
                goto L_0x02ab
            L_0x02a4:
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r14.f61052i
                java.lang.Runnable r14 = r14.f61054k
                r2.postDelayed(r14, r3)
            L_0x02ab:
                if (r9 != 0) goto L_0x0435
                java.lang.String r14 = "mSelfSession.setCharacteristicNotification Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x02c8:
                int r14 = r14.arg1
                java.lang.Object[] r2 = new java.lang.Object[r9]
                if (r14 != r7) goto L_0x02d1
                java.lang.String r3 = "Connected"
                goto L_0x02d3
            L_0x02d1:
                java.lang.String r3 = "Disconnected"
            L_0x02d3:
                r2[r10] = r3
                java.lang.String r3 = "------onConnectionStateChangeImp------ aState = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
                if (r14 != r7) goto L_0x0338
                java.lang.Object[] r14 = new java.lang.Object[r9]
                int r2 = r0.f61059p
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r14[r10] = r2
                java.lang.String r2 = "PHY Connected is OK, mConnectState = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r14)
                int r14 = r0.f61059p
                if (r8 != r14) goto L_0x02fd
                java.lang.String r14 = "Close or disconnect is Called, Leave without discover Services"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.removeCallbacks(r0)
                goto L_0x0435
            L_0x02fd:
                if (r9 != r14) goto L_0x030d
                java.lang.String r14 = "Connected is done, Leave without discover Services"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.removeCallbacks(r0)
                goto L_0x0435
            L_0x030d:
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                boolean r14 = r14.discoverServices()
                if (r14 != 0) goto L_0x0330
                java.lang.String r14 = "discover Services start failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0330:
                java.lang.String r14 = "start discoverServices..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                goto L_0x0435
            L_0x0338:
                if (r14 != 0) goto L_0x0435
                java.lang.String r14 = "Disconnected from GATT server."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                r0.f61059p = r7
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0355:
                java.lang.Object r14 = r14.obj
                byte[] r14 = (byte[]) r14
                mw0.C21559e.m24450a(r0, r14)
                goto L_0x0435
            L_0x035e:
                java.lang.String r14 = "------closeImp------"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                int r14 = r0.f61059p
                if (r8 != r14) goto L_0x036e
                java.lang.String r14 = "Close aready, Just leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                goto L_0x0435
            L_0x036e:
                r0.f61058o = r10
                java.util.LinkedList<byte[]> r14 = r0.f61057n
                r14.clear()
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                if (r14 != 0) goto L_0x0380
                java.lang.String r14 = "close:BluetoothGatt not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                goto L_0x0435
            L_0x0380:
                r0.f61059p = r8
                r14.disconnect()
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                r14.close()
                r14 = 0
                r0.f61047d = r14
                goto L_0x0435
            L_0x038f:
                java.lang.String r14 = "------disconnectImp------"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                int r14 = r0.f61059p
                if (r8 != r14) goto L_0x039f
                java.lang.String r14 = "diconnect or close is called aready, just leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                goto L_0x0435
            L_0x039f:
                r0.f61058o = r10
                java.util.LinkedList<byte[]> r14 = r0.f61057n
                r14.clear()
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                if (r14 != 0) goto L_0x03b1
                java.lang.String r14 = "disconnect:BluetoothGatt not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                goto L_0x0435
            L_0x03b1:
                r0.f61059p = r8
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61055l
                r14.removeCallbacks(r1)
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r1 = r0.f61054k
                r14.removeCallbacks(r1)
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                r14.disconnect()
                goto L_0x0435
            L_0x03c8:
                java.lang.String r14 = "------connectImp------"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                int r14 = r0.f61059p
                if (r9 != r14) goto L_0x03d7
                java.lang.String r14 = "Remote device is connected !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                goto L_0x0435
            L_0x03d7:
                if (r14 != 0) goto L_0x03df
                java.lang.String r14 = "Remote device is connecting !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
                goto L_0x0435
            L_0x03df:
                r0.f61058o = r10
                java.util.LinkedList<byte[]> r14 = r0.f61057n
                r14.clear()
                android.bluetooth.BluetoothGatt r14 = r0.f61047d
                r2 = 10000(0x2710, double:4.9407E-320)
                if (r14 == 0) goto L_0x040d
                boolean r14 = r14.connect()
                if (r14 != 0) goto L_0x0403
                java.lang.String r14 = "mBluetoothGatt.connect() Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x0403:
                r0.f61059p = r10
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.postDelayed(r0, r2)
                goto L_0x0435
            L_0x040d:
                android.bluetooth.BluetoothDevice r14 = r0.f61045b
                android.content.Context r4 = r0.f61046c
                android.bluetooth.BluetoothGattCallback r5 = r0.f61060q
                android.bluetooth.BluetoothGatt r14 = r14.connectGatt(r4, r10, r5)
                r0.f61047d = r14
                if (r14 != 0) goto L_0x042c
                java.lang.String r14 = "mDevice.connectGatt Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
                mw0.b r14 = r0.f61048e
                if (r14 == 0) goto L_0x0435
                mw0.b$d r14 = r14.f61004a
                long r0 = r0.f61044a
                r14.mo33770a(r0, r10)
                goto L_0x0435
            L_0x042c:
                r0.f61059p = r10
                com.tencent.mm.sdk.platformtools.MMHandler r14 = r0.f61052i
                java.lang.Runnable r0 = r0.f61055l
                r14.postDelayed(r0, r2)
            L_0x0435:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mw0.C21559e.C21564e.handleMessage(android.os.Message):void");
        }
    }

    public C21559e(long j, Context context, C21546b bVar) {
        this.f61048e = bVar;
        this.f61046c = context;
        BluetoothAdapter adapter = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f61044a = j;
        this.f61059p = 3;
        this.f61045b = adapter.getRemoteDevice(C45288e.m50135f(j));
        this.f61049f = null;
        this.f61050g = null;
        this.f61051h = new C21545a(20);
        this.f61052i = new C21564e(C109639a.m148950a("BluetoothLESession_handlerThread"), this);
        this.f61053j = new C21561b();
        this.f61054k = new C21562c();
        this.f61055l = new C21563d();
    }

    /* renamed from: a */
    public static void m24450a(C21559e eVar, byte[] bArr) {
        eVar.getClass();
        boolean z = true;
        Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------writeDataAsync------ length = %d", Integer.valueOf(bArr.length));
        int i = eVar.f61059p;
        if (1 != i) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "Not ready for write data, connectstate = %d", Integer.valueOf(i));
            C21546b bVar = eVar.f61048e;
            if (bVar != null) {
                bVar.f61004a.mo33774e(eVar.f61044a, false);
                return;
            }
            return;
        }
        Assert.assertTrue((eVar.f61047d == null || eVar.f61050g == null) ? false : true);
        eVar.f61057n.add(bArr);
        if (!eVar.f61058o) {
            if (1 != eVar.f61057n.size()) {
                z = false;
            }
            Assert.assertTrue(z);
            eVar.mo33785e();
        }
    }

    /* renamed from: b */
    public void mo33782b() {
        Log.m105924i("MicroMsg.exdevice.BluetoothLESession", "------close------");
        MMHandler mMHandler = this.f61052i;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(2))) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 2);
        }
        this.f61052i.quitSafely();
    }

    /* renamed from: c */
    public boolean mo33783c() {
        Log.m105924i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
        MMHandler mMHandler = this.f61052i;
        return mMHandler.sendMessage(mMHandler.obtainMessage(0));
    }

    /* renamed from: d */
    public boolean mo33784d(byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.BluetoothLESession", "------writeData------length = %d", Integer.valueOf(bArr.length));
        Log.m105919d("MicroMsg.exdevice.BluetoothLESession", "writeData data dump = %s", C45288e.m50130a(bArr));
        MMHandler mMHandler = this.f61052i;
        return mMHandler.sendMessage(mMHandler.obtainMessage(3, bArr));
    }

    /* renamed from: e */
    public final void mo33785e() {
        if (this.f61057n.isEmpty()) {
            this.f61058o = false;
            return;
        }
        byte[] pop = this.f61057n.pop();
        C21545a aVar = this.f61051h;
        if (pop == null) {
            aVar.f61000a = null;
            aVar.f61002c = 0;
            aVar.f61001b = 0;
        } else {
            aVar.getClass();
            byte[] bArr = new byte[pop.length];
            aVar.f61000a = bArr;
            System.arraycopy(pop, 0, bArr, 0, pop.length);
            aVar.f61002c = pop.length;
            aVar.f61001b = 0;
        }
        byte[] a = this.f61051h.mo33751a();
        Log.m105919d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", C45288e.m50130a(a));
        this.f61050g.setValue(a);
        this.f61052i.postDelayed(this.f61053j, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        if (!this.f61047d.writeCharacteristic(this.f61050g)) {
            Log.m105920e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
        }
        this.f61058o = true;
    }
}
