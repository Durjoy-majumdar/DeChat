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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;
import mu3.C109639a;
import nw0.C47302a;
import nw0.C89094c;

/* renamed from: mw0.h */
public final class C21572h {

    /* renamed from: u */
    public static int f61086u;

    /* renamed from: a */
    public long f61087a;

    /* renamed from: b */
    public BluetoothDevice f61088b;

    /* renamed from: c */
    public BluetoothAdapter f61089c;

    /* renamed from: d */
    public Context f61090d;

    /* renamed from: e */
    public BluetoothGatt f61091e;

    /* renamed from: f */
    public C21577e f61092f;

    /* renamed from: g */
    public C21545a f61093g;

    /* renamed from: h */
    public MMHandler f61094h;

    /* renamed from: i */
    public Runnable f61095i;

    /* renamed from: j */
    public Runnable f61096j;

    /* renamed from: k */
    public Runnable f61097k;

    /* renamed from: l */
    public C21572h f61098l = this;

    /* renamed from: m */
    public final LinkedList<byte[]> f61099m = new LinkedList<>();

    /* renamed from: n */
    public volatile boolean f61100n = false;

    /* renamed from: o */
    public volatile int f61101o;

    /* renamed from: p */
    public HashMap<String, HashMap<String, BluetoothGattCharacteristic>> f61102p = new HashMap<>();

    /* renamed from: q */
    public long f61103q = 0;

    /* renamed from: r */
    public ArrayList<BluetoothGattCharacteristic> f61104r = new ArrayList<>();

    /* renamed from: s */
    public boolean f61105s;

    /* renamed from: t */
    public final BluetoothGattCallback f61106t = new C21573a();

    /* renamed from: mw0.h$a */
    public class C21573a extends BluetoothGattCallback {
        public C21573a() {
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Log.m105924i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceive------");
            MMHandler mMHandler = C21572h.this.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(8, bluetoothGattCharacteristic))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
            }
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onCharacteristicRead------ status = %d", Integer.valueOf(i));
            if (i == 0) {
                MMHandler mMHandler = C21572h.this.f61094h;
                if (!mMHandler.sendMessage(mMHandler.obtainMessage(8, bluetoothGattCharacteristic))) {
                    Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
                }
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallback------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21572h.this.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(7, i, 0))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 7);
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(C21572h.this.f61101o));
            MMHandler mMHandler = C21572h.this.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(4, i2, 0))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 4);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWrite------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21572h.this.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(6, i, 0, bluetoothGatt))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 6);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onServicesDiscovered------ status = %d", Integer.valueOf(i));
            MMHandler mMHandler = C21572h.this.f61094h;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(5, i, 0, bluetoothGatt))) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 5);
            }
        }
    }

    /* renamed from: mw0.h$b */
    public class C21574b implements Runnable {
        public C21574b() {
        }

        public void run() {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "Write data timeout, mac=%s, name=%s", C45288e.m50135f(C21572h.this.f61087a), C21572h.this.f61088b.getName());
            C21572h hVar = C21572h.this;
            C21577e eVar = hVar.f61092f;
            if (eVar != null) {
                eVar.mo33799b(hVar.f61087a, false);
            }
            C21572h.this.mo33807g();
        }
    }

    /* renamed from: mw0.h$c */
    public class C21575c implements Runnable {
        public C21575c() {
        }

        public void run() {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected timeout!!!, mac=%s, name=%s", C45288e.m50135f(C21572h.this.f61087a), C21572h.this.f61088b.getName());
            if (3 == C21572h.this.f61101o) {
                Log.m105928w("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already disconnet or close, just leave");
            } else if (C21572h.this.f61101o == 1) {
                Log.m105924i("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already connected, just leave.");
            } else {
                C21572h.this.mo33804d();
            }
        }
    }

    /* renamed from: mw0.h$d */
    public class C21576d implements Runnable {
        public C21576d() {
        }

        public void run() {
            C21572h hVar = C21572h.this;
            if (hVar.f61105s) {
                C21577e eVar = hVar.f61092f;
                if (eVar != null) {
                    eVar.mo33798a(hVar.f61087a, false, hVar.f61103q);
                }
                Log.m105918d("MicroMsg.exdevice.BluetoothLESimpleSession", "close timeout!!! stop handle thread.");
                C21572h.this.mo33806f();
            }
        }
    }

    /* renamed from: mw0.h$e */
    public static abstract class C21577e {
        /* renamed from: a */
        public abstract void mo33798a(long j, boolean z, long j2);

        /* renamed from: b */
        public abstract void mo33799b(long j, boolean z);
    }

    /* renamed from: mw0.h$f */
    public static class C21578f extends MMHandler {

        /* renamed from: a */
        public final WeakReference<C21572h> f61111a;

        public C21578f(C109639a aVar, C21572h hVar) {
            super(aVar);
            this.f61111a = new WeakReference<>(hVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:176:0x0542  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x054a  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x05b4  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x05fb  */
        /* JADX WARNING: Removed duplicated region for block: B:267:0x0864 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x05c6 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7 A[LOOP:0: B:6:0x0027->B:32:0x00d7, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r23) {
            /*
                r22 = this;
                r1 = r22
                r0 = r23
                java.lang.ref.WeakReference<mw0.h> r2 = r1.f61111a
                java.lang.Object r2 = r2.get()
                mw0.h r2 = (mw0.C21572h) r2
                java.lang.String r3 = "MicroMsg.exdevice.BluetoothLESimpleSession"
                if (r2 != 0) goto L_0x0016
                java.lang.String r0 = "null == BluetoothLESession"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x0016:
                int r4 = r0.what
                java.lang.String r5 = "SendMessage Failed!!! MessageWhat = %d"
                r6 = 10000(0x2710, double:4.9407E-320)
                r8 = 9
                r11 = 1
                r12 = 3
                r13 = 0
                r14 = 2
                switch(r4) {
                    case 0: goto L_0x079e;
                    case 1: goto L_0x0749;
                    case 2: goto L_0x06d4;
                    case 3: goto L_0x06cb;
                    case 4: goto L_0x062c;
                    case 5: goto L_0x01ea;
                    case 6: goto L_0x01ae;
                    case 7: goto L_0x0119;
                    case 8: goto L_0x0110;
                    case 9: goto L_0x0027;
                    default: goto L_0x0025;
                }
            L_0x0025:
                goto L_0x0864
            L_0x0027:
                java.util.ArrayList<android.bluetooth.BluetoothGattCharacteristic> r0 = r2.f61104r
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x00f4
                java.util.ArrayList<android.bluetooth.BluetoothGattCharacteristic> r0 = r2.f61104r
                java.lang.Object r0 = r0.remove(r13)
                android.bluetooth.BluetoothGattCharacteristic r0 = (android.bluetooth.BluetoothGattCharacteristic) r0
                mw0.h r4 = r2.f61098l
                int r5 = r0.getProperties()
                r6 = r5 & 48
                if (r6 != 0) goto L_0x004b
                r4.getClass()
                java.lang.String r4 = "no indicate and notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
                goto L_0x00d0
            L_0x004b:
                android.bluetooth.BluetoothGatt r6 = r4.f61091e
                boolean r6 = r6.setCharacteristicNotification(r0, r11)
                if (r6 != 0) goto L_0x005a
                java.lang.String r4 = "Unable to set indicator for read characteristic"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
                goto L_0x00d0
            L_0x005a:
                java.util.HashMap<java.lang.String, java.lang.String> r6 = mw0.C47108k.f126586a
                java.lang.String r6 = "00002902-0000-1000-8000-00805f9b34fb"
                java.util.UUID r6 = java.util.UUID.fromString(r6)
                android.bluetooth.BluetoothGattDescriptor r6 = r0.getDescriptor(r6)
                if (r6 != 0) goto L_0x006e
                java.lang.String r4 = "Can not get configure descriptor"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
                goto L_0x00d0
            L_0x006e:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Configure descriptor permissions: "
                r7.append(r8)
                int r8 = r6.getPermissions()
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                byte[] r7 = new byte[r14]
                r7 = {0, 0} // fill-array
                r8 = r5 & 32
                if (r8 == 0) goto L_0x00a1
                byte r8 = r7[r13]
                byte[] r9 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
                byte r10 = r9[r13]
                r8 = r8 | r10
                byte r8 = (byte) r8
                r7[r13] = r8
                byte r8 = r7[r11]
                byte r9 = r9[r11]
                r8 = r8 | r9
                byte r8 = (byte) r8
                r7[r11] = r8
            L_0x00a1:
                r5 = r5 & 16
                if (r5 == 0) goto L_0x00b7
                byte r5 = r7[r13]
                byte[] r8 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                byte r9 = r8[r13]
                r5 = r5 | r9
                byte r5 = (byte) r5
                r7[r13] = r5
                byte r5 = r7[r11]
                byte r8 = r8[r11]
                r5 = r5 | r8
                byte r5 = (byte) r5
                r7[r11] = r5
            L_0x00b7:
                boolean r5 = r6.setValue(r7)
                if (r5 != 0) goto L_0x00c3
                java.lang.String r4 = "Can not set configure descriptor value"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
                goto L_0x00d0
            L_0x00c3:
                android.bluetooth.BluetoothGatt r4 = r4.f61091e
                boolean r4 = r4.writeDescriptor(r6)
                if (r4 != 0) goto L_0x00d2
                java.lang.String r4 = "Can not write configure descriptor value"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            L_0x00d0:
                r4 = 0
                goto L_0x00d3
            L_0x00d2:
                r4 = 1
            L_0x00d3:
                if (r4 == 0) goto L_0x00d7
                goto L_0x0864
            L_0x00d7:
                java.lang.Object[] r4 = new java.lang.Object[r14]
                java.util.UUID r5 = r0.getUuid()
                java.lang.String r5 = r5.toString()
                r4[r13] = r5
                int r0 = r0.getProperties()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r11] = r0
                java.lang.String r0 = "mSelfSession.setCharacteristicNotification Failed!!!. uuid = %s, properties = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
                goto L_0x0027
            L_0x00f4:
                java.lang.String r0 = "onConnected = true"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                r2.f61101o = r11
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r3 = r2.f61096j
                r0.removeCallbacks(r3)
                mw0.h$e r4 = r2.f61092f
                if (r4 == 0) goto L_0x0864
                long r5 = r2.f61087a
                r7 = 1
                long r8 = r2.f61103q
                r4.mo33798a(r5, r7, r8)
                goto L_0x0864
            L_0x0110:
                java.lang.Object r0 = r0.obj
                android.bluetooth.BluetoothGattCharacteristic r0 = (android.bluetooth.BluetoothGattCharacteristic) r0
                mw0.C21572h.m24463b(r2, r0)
                goto L_0x0864
            L_0x0119:
                int r0 = r0.arg1
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r4[r13] = r5
                long r5 = r2.f61087a
                java.lang.String r5 = d81.C45288e.m50135f(r5)
                r4[r11] = r5
                android.bluetooth.BluetoothDevice r5 = r2.f61088b
                java.lang.String r5 = r5.getName()
                r4[r14] = r5
                java.lang.String r5 = "------onDataWriteCallbackImp------ status = %d, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r2.f61094h
                java.lang.Runnable r5 = r2.f61095i
                r4.removeCallbacks(r5)
                if (r0 == 0) goto L_0x0164
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "write data error: "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                mw0.h$e r0 = r2.f61092f
                if (r0 == 0) goto L_0x015f
                long r3 = r2.f61087a
                r0.mo33799b(r3, r13)
            L_0x015f:
                r2.mo33807g()
                goto L_0x0864
            L_0x0164:
                mw0.a r0 = r2.f61093g
                byte[] r0 = r0.mo33751a()
                java.lang.Object[] r4 = new java.lang.Object[r11]
                java.lang.String r5 = d81.C45288e.m50130a(r0)
                r4[r13] = r5
                java.lang.String r5 = "Out data dump = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r4)
                if (r0 != 0) goto L_0x018d
                java.lang.String r0 = "write data complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                mw0.h$e r0 = r2.f61092f
                if (r0 == 0) goto L_0x0188
                long r3 = r2.f61087a
                r0.mo33799b(r3, r11)
            L_0x0188:
                r2.mo33807g()
                goto L_0x0864
            L_0x018d:
                java.lang.String r4 = "write next chunk..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                mw0.a r3 = r2.f61093g
                android.bluetooth.BluetoothGattCharacteristic r3 = r3.f61003d
                r3.setValue(r0)
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                mw0.a r3 = r2.f61093g
                android.bluetooth.BluetoothGattCharacteristic r3 = r3.f61003d
                r0.writeCharacteristic(r3)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61095i
                r3 = 5000(0x1388, double:2.4703E-320)
                r0.postDelayed(r2, r3)
                goto L_0x0864
            L_0x01ae:
                java.lang.Object r4 = r0.obj
                android.bluetooth.BluetoothGatt r4 = (android.bluetooth.BluetoothGatt) r4
                int r0 = r0.arg1
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r13] = r0
                long r6 = r2.f61087a
                java.lang.String r0 = d81.C45288e.m50135f(r6)
                r4[r11] = r0
                android.bluetooth.BluetoothDevice r0 = r2.f61088b
                java.lang.String r0 = r0.getName()
                r4[r14] = r0
                java.lang.String r0 = "------onDescriptorWriteImp------ status = %d, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                android.os.Message r2 = r0.obtainMessage(r8)
                boolean r0 = r0.sendMessage(r2)
                if (r0 != 0) goto L_0x0864
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                r0[r13] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r0)
                goto L_0x0864
            L_0x01ea:
                java.lang.Object r4 = r0.obj
                android.bluetooth.BluetoothGatt r4 = (android.bluetooth.BluetoothGatt) r4
                int r0 = r0.arg1
                java.lang.Object[] r6 = new java.lang.Object[r12]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                r6[r13] = r7
                long r8 = r2.f61087a
                java.lang.String r7 = d81.C45288e.m50135f(r8)
                r6[r11] = r7
                android.bluetooth.BluetoothDevice r7 = r2.f61088b
                java.lang.String r7 = r7.getName()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
                r6[r14] = r7
                java.lang.String r7 = "onServicesDiscoveredImp, status = %d, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
                com.tencent.mm.sdk.platformtools.MMHandler r6 = r2.f61094h
                java.lang.Runnable r7 = r2.f61096j
                r6.removeCallbacks(r7)
                int r6 = r2.f61101o
                if (r12 != r6) goto L_0x0224
                java.lang.String r0 = "Close or disconnect is Called, Just Leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                goto L_0x05dd
            L_0x0224:
                int r6 = r2.f61101o
                if (r11 != r6) goto L_0x022f
                java.lang.String r0 = "Connected is done, Just Leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                goto L_0x05f8
            L_0x022f:
                if (r0 == 0) goto L_0x023b
                java.lang.String r0 = "Discover services error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r2.mo33804d()
                goto L_0x05dd
            L_0x023b:
                java.util.List r0 = r4.getServices()
                r4 = 0
            L_0x0240:
                int r6 = r0.size()
                if (r4 >= r6) goto L_0x05cc
                java.lang.Object r6 = r0.get(r4)
                android.bluetooth.BluetoothGattService r6 = (android.bluetooth.BluetoothGattService) r6
                if (r6 != 0) goto L_0x0256
                java.lang.String r7 = "service is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
                goto L_0x0548
            L_0x0256:
                java.lang.String r7 = "nw0.c"
                long r17 = nw0.C89094c.m111363a(r6)
                r19 = 1
                long r19 = r17 & r19
                r15 = 0
                int r9 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
                if (r9 == 0) goto L_0x02ce
                java.util.HashMap<java.lang.String, java.lang.String> r9 = mw0.C47108k.f126586a
                java.lang.String r9 = "0000fea1-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x027b
                java.lang.String r9 = "no step measurement characteristic found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x027b:
                int r9 = r9.getProperties()
                java.lang.Object[] r10 = new java.lang.Object[r11]
                java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
                r10[r13] = r17
                java.lang.String r15 = "step measurement characteristic properties = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r15, r10)
                r10 = r9 & 48
                if (r10 == 0) goto L_0x02be
                r10 = r9 & 2
                if (r10 != 0) goto L_0x0296
                goto L_0x02be
            L_0x0296:
                java.lang.String r9 = "0000fea2-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 == 0) goto L_0x0502
                int r9 = r9.getProperties()
                r10 = r9 & 2
                if (r10 == 0) goto L_0x02ae
                r10 = r9 & 32
                if (r10 != 0) goto L_0x0502
            L_0x02ae:
                java.lang.Object[] r10 = new java.lang.Object[r11]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.String r9 = "step target characteristic has incorrect proterties(%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x02be:
                java.lang.Object[] r10 = new java.lang.Object[r11]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.String r9 = "step measurement characteristic has incorrect proterties(%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x02ce:
                r9 = 2
                long r9 = r17 & r9
                r21 = 32
                r15 = 0
                int r19 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r19 == 0) goto L_0x033c
                java.util.HashMap<java.lang.String, java.lang.String> r9 = mw0.C47108k.f126586a
                java.lang.String r9 = "00002a9e-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x02f0
                java.lang.String r9 = "weight scale feature characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x02f0:
                int r9 = r9.getProperties()
                r10 = r9 & 2
                if (r10 != 0) goto L_0x030a
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                r10[r11] = r8
                java.lang.String r9 = "weight scale feature characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x030a:
                java.lang.String r9 = "00002a9d-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x031e
                java.lang.String r9 = "weight measurement characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x031e:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 != 0) goto L_0x0502
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "weight measurement characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x033c:
                r9 = 4
                long r9 = r17 & r9
                r19 = 16
                r15 = 0
                int r20 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r20 == 0) goto L_0x03ca
                java.util.HashMap<java.lang.String, java.lang.String> r9 = mw0.C47108k.f126586a
                java.lang.String r9 = "00002a37-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x035d
                java.lang.String r9 = "heart rate measurement characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x035d:
                int r9 = r9.getProperties()
                r10 = r9 & 16
                if (r10 != 0) goto L_0x037a
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
                r10[r11] = r9
                java.lang.String r9 = "heart rate measurement characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x037a:
                java.lang.String r9 = "00002a38-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 == 0) goto L_0x039f
                int r9 = r9.getProperties()
                r10 = r9 & 2
                if (r10 != 0) goto L_0x039f
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                r10[r11] = r8
                java.lang.String r9 = "heart rate body sensor location characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x039f:
                java.lang.String r9 = "00002a39-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 == 0) goto L_0x0502
                int r9 = r9.getProperties()
                r10 = r9 & 8
                if (r10 != 0) goto L_0x0502
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                r9 = 8
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r11] = r9
                java.lang.String r9 = "heart rate control point characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x03ca:
                r9 = 8
                long r9 = r17 & r9
                r15 = 0
                int r20 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r20 == 0) goto L_0x045b
                java.util.HashMap<java.lang.String, java.lang.String> r9 = mw0.C47108k.f126586a
                java.lang.String r9 = "00002a35-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x03e9
                java.lang.String r9 = "blood pressure measurement characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x03e9:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 != 0) goto L_0x0406
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "blood pressure measurement characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x0406:
                java.lang.String r9 = "00002a49-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x0419
                java.lang.String r9 = "blood pressure feature characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x0419:
                int r9 = r9.getProperties()
                r10 = r9 & 2
                if (r10 != 0) goto L_0x0432
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                r10[r11] = r8
                java.lang.String r9 = "blood pressure feature characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x0432:
                java.lang.String r9 = "00002a36-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 == 0) goto L_0x0502
                int r9 = r9.getProperties()
                r10 = r9 & 16
                if (r10 != 0) goto L_0x0502
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
                r10[r11] = r9
                java.lang.String r9 = "blood pressure intermediate cuff pressure characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x045b:
                r9 = 16
                long r9 = r17 & r9
                r15 = 0
                int r17 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
                if (r17 == 0) goto L_0x053f
                java.util.HashMap<java.lang.String, java.lang.String> r9 = mw0.C47108k.f126586a
                java.lang.String r9 = "0000feb1-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x047a
                java.lang.String r9 = "light color characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x047a:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 == 0) goto L_0x052c
                r10 = r9 & 16
                if (r10 == 0) goto L_0x052c
                r10 = r9 & 2
                if (r10 == 0) goto L_0x052c
                r10 = r9 & 8
                if (r10 != 0) goto L_0x0490
                goto L_0x052c
            L_0x0490:
                java.lang.String r9 = "0000feb2-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x04a3
                java.lang.String r9 = "light work state characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x04a3:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 == 0) goto L_0x0518
                r10 = r9 & 2
                if (r10 == 0) goto L_0x0518
                r10 = r9 & 8
                if (r10 != 0) goto L_0x04b4
                goto L_0x0518
            L_0x04b4:
                java.lang.String r9 = "0000feb3-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x04c7
                java.lang.String r9 = "light state changed characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x04c7:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 != 0) goto L_0x04e3
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "light state changed characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x04e3:
                java.lang.String r9 = "0000feb4-0000-1000-8000-00805f9b34fb"
                java.util.UUID r9 = java.util.UUID.fromString(r9)
                android.bluetooth.BluetoothGattCharacteristic r9 = r6.getCharacteristic(r9)
                if (r9 != 0) goto L_0x04f5
                java.lang.String r9 = "control point characteristic not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                goto L_0x053f
            L_0x04f5:
                int r9 = r9.getProperties()
                r10 = r9 & 32
                if (r10 == 0) goto L_0x0504
                r10 = r9 & 8
                if (r10 != 0) goto L_0x0502
                goto L_0x0504
            L_0x0502:
                r7 = 1
                goto L_0x0540
            L_0x0504:
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "control point characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x0518:
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "light work state characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
                goto L_0x053f
            L_0x052c:
                java.lang.Object[] r10 = new java.lang.Object[r14]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r13] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
                r10[r11] = r9
                java.lang.String r9 = "light color characteristic has incorrect properties(%d). properties(%d) needed"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r10)
            L_0x053f:
                r7 = 0
            L_0x0540:
                if (r7 != 0) goto L_0x054a
                java.lang.String r7 = "parse service error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            L_0x0548:
                r7 = 0
                goto L_0x05b2
            L_0x054a:
                long r9 = r2.f61103q
                long r17 = nw0.C89094c.m111363a(r6)
                long r9 = r9 | r17
                r2.f61103q = r9
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                java.util.List r9 = r6.getCharacteristics()
                r10 = 0
            L_0x055e:
                int r15 = r9.size()
                if (r10 >= r15) goto L_0x05a4
                java.lang.Object r15 = r9.get(r10)
                android.bluetooth.BluetoothGattCharacteristic r15 = (android.bluetooth.BluetoothGattCharacteristic) r15
                java.util.UUID r16 = r15.getUuid()
                java.lang.String r16 = r16.toString()
                int r17 = r15.getProperties()
                int r18 = r15.getPermissions()
                java.lang.Object[] r14 = new java.lang.Object[r12]
                r14[r13] = r16
                java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
                r14[r11] = r17
                java.lang.Integer r17 = java.lang.Integer.valueOf(r18)
                r18 = 2
                r14[r18] = r17
                java.lang.String r12 = "found characteristic = %s, properties = %d, permission = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r12, r14)
                if (r16 != 0) goto L_0x0595
                java.lang.String r16 = "null"
            L_0x0595:
                r12 = r16
                r7.put(r12, r15)
                java.util.ArrayList<android.bluetooth.BluetoothGattCharacteristic> r12 = r2.f61104r
                r12.add(r15)
                int r10 = r10 + 1
                r12 = 3
                r14 = 2
                goto L_0x055e
            L_0x05a4:
                java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, android.bluetooth.BluetoothGattCharacteristic>> r9 = r2.f61102p
                java.util.UUID r10 = r6.getUuid()
                java.lang.String r10 = r10.toString()
                r9.put(r10, r7)
                r7 = 1
            L_0x05b2:
                if (r7 != 0) goto L_0x05c6
                java.lang.Object[] r7 = new java.lang.Object[r11]
                java.util.UUID r6 = r6.getUuid()
                java.lang.String r6 = r6.toString()
                r7[r13] = r6
                java.lang.String r6 = "parseService error. service uuid = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r7)
            L_0x05c6:
                int r4 = r4 + 1
                r12 = 3
                r14 = 2
                goto L_0x0240
            L_0x05cc:
                long r6 = r2.f61103q
                r8 = 0
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x05df
                java.lang.String r0 = "the device hasn't pass test"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r2.mo33804d()
            L_0x05dd:
                r0 = 0
                goto L_0x05f9
            L_0x05df:
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                r4 = 9
                android.os.Message r6 = r0.obtainMessage(r4)
                boolean r0 = r0.sendMessage(r6)
                if (r0 != 0) goto L_0x05f8
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r13] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r0)
            L_0x05f8:
                r0 = 1
            L_0x05f9:
                if (r0 != 0) goto L_0x0864
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r6 = r2.f61087a
                java.lang.String r4 = d81.C45288e.m50135f(r6)
                r0[r13] = r4
                android.bluetooth.BluetoothDevice r4 = r2.f61088b
                java.lang.String r4 = r4.getName()
                r0[r11] = r4
                java.lang.String r4 = "------disconnect------, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                android.os.Message r2 = r0.obtainMessage(r11)
                boolean r0 = r0.sendMessage(r2)
                if (r0 != 0) goto L_0x0864
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r0[r13] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r0)
                goto L_0x0864
            L_0x062c:
                int r0 = r0.arg1
                r4 = 3
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r4 = 2
                if (r0 != r4) goto L_0x0637
                java.lang.String r8 = "Connected"
                goto L_0x0639
            L_0x0637:
                java.lang.String r8 = "Disconnected"
            L_0x0639:
                r5[r13] = r8
                long r8 = r2.f61087a
                java.lang.String r8 = d81.C45288e.m50135f(r8)
                r5[r11] = r8
                android.bluetooth.BluetoothDevice r8 = r2.f61088b
                java.lang.String r8 = r8.getName()
                r5[r4] = r8
                java.lang.String r8 = "------onConnectionStateChangeImp------ aState = %s, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r5)
                if (r0 != r4) goto L_0x06b1
                java.lang.Object[] r0 = new java.lang.Object[r11]
                int r4 = r2.f61101o
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r13] = r4
                java.lang.String r4 = "PHY Connected is OK, mConnectState = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                int r0 = r2.f61101o
                r4 = 3
                if (r4 != r0) goto L_0x0674
                java.lang.String r0 = "Close or disconnect is Called, Leave without discover Services"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61096j
                r0.removeCallbacks(r2)
                goto L_0x0864
            L_0x0674:
                int r0 = r2.f61101o
                if (r11 != r0) goto L_0x0686
                java.lang.String r0 = "Connected is done, Leave without discover Services"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61096j
                r0.removeCallbacks(r2)
                goto L_0x0864
            L_0x0686:
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 == 0) goto L_0x06a7
                boolean r0 = r0.discoverServices()
                if (r0 != 0) goto L_0x0691
                goto L_0x06a7
            L_0x0691:
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r4 = r2.f61096j
                r0.removeCallbacks(r4)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61096j
                r0.postDelayed(r2, r6)
                java.lang.String r0 = "start discoverServices..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                goto L_0x0864
            L_0x06a7:
                java.lang.String r0 = "discover Services start failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r2.mo33804d()
                goto L_0x0864
            L_0x06b1:
                if (r0 != 0) goto L_0x0864
                java.lang.String r0 = "Disconnected from GATT server."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, android.bluetooth.BluetoothGattCharacteristic>> r0 = r2.f61102p
                r0.clear()
                java.util.ArrayList<android.bluetooth.BluetoothGattCharacteristic> r0 = r2.f61104r
                r0.clear()
                r3 = 0
                r2.f61103q = r3
                r2.mo33804d()
                goto L_0x0864
            L_0x06cb:
                java.lang.Object r0 = r0.obj
                byte[] r0 = (byte[]) r0
                mw0.C21572h.m24462a(r2, r0)
                goto L_0x0864
            L_0x06d4:
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r2.f61087a
                java.lang.String r4 = d81.C45288e.m50135f(r4)
                r0[r13] = r4
                android.bluetooth.BluetoothDevice r4 = r2.f61088b
                java.lang.String r4 = r4.getName()
                r0[r11] = r4
                java.lang.String r4 = "------closeImp------, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                int r0 = r2.f61101o
                r4 = 3
                if (r4 != r0) goto L_0x06fb
                java.lang.String r0 = "Close aready, Just leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                r2.mo33805e()
                goto L_0x0864
            L_0x06fb:
                r2.f61100n = r13
                java.util.LinkedList<byte[]> r0 = r2.f61099m
                r0.clear()
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 != 0) goto L_0x0710
                java.lang.String r0 = "close:BluetoothGatt not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                r2.mo33805e()
                goto L_0x0864
            L_0x0710:
                r4 = 3
                r2.f61101o = r4
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r4 = r2.f61096j
                r0.removeCallbacks(r4)
                r2.mo33805e()
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 == 0) goto L_0x0864
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r2.f61087a
                java.lang.String r4 = d81.C45288e.m50135f(r4)
                r0[r13] = r4
                android.bluetooth.BluetoothDevice r4 = r2.f61088b
                java.lang.String r4 = r4.getName()
                r0[r11] = r4
                java.lang.String r4 = "disconnect gatt, and wait gatt disconnected callback, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                r0.disconnect()
                r2.f61105s = r11
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61097k
                r0.postDelayed(r2, r6)
                goto L_0x0864
            L_0x0749:
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r2.f61087a
                java.lang.String r4 = d81.C45288e.m50135f(r4)
                r0[r13] = r4
                android.bluetooth.BluetoothDevice r4 = r2.f61088b
                java.lang.String r4 = r4.getName()
                r0[r11] = r4
                java.lang.String r4 = "------disconnectImp------, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                int r0 = r2.f61101o
                r4 = 3
                if (r4 != r0) goto L_0x076d
                java.lang.String r0 = "diconnect or close is called aready, just leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                goto L_0x0864
            L_0x076d:
                int r0 = r2.f61101o
                r4 = 2
                if (r4 != r0) goto L_0x0779
                java.lang.String r0 = "already disconnected, just leave"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                goto L_0x0864
            L_0x0779:
                r2.f61100n = r13
                java.util.LinkedList<byte[]> r0 = r2.f61099m
                r0.clear()
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 != 0) goto L_0x078b
                java.lang.String r0 = "disconnect:BluetoothGatt not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                goto L_0x0864
            L_0x078b:
                r3 = 3
                r2.f61101o = r3
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r3 = r2.f61096j
                r0.removeCallbacks(r3)
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 == 0) goto L_0x0864
                r0.disconnect()
                goto L_0x0864
            L_0x079e:
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r2.f61087a
                java.lang.String r4 = d81.C45288e.m50135f(r4)
                r0[r13] = r4
                android.bluetooth.BluetoothDevice r4 = r2.f61088b
                java.lang.String r4 = r4.getName()
                r0[r11] = r4
                java.lang.String r4 = "------connectImp------, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                int r0 = r2.f61101o
                if (r11 != r0) goto L_0x07d4
                java.lang.String r0 = "Remote device is connected !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                mw0.h$e r0 = r2.f61092f
                if (r0 == 0) goto L_0x0864
                java.lang.String r0 = "Remote device has connected, just callback."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                mw0.h$e r4 = r2.f61092f
                long r5 = r2.f61087a
                r7 = 1
                long r8 = r2.f61103q
                r4.mo33798a(r5, r7, r8)
                goto L_0x0864
            L_0x07d4:
                int r0 = r2.f61101o
                if (r0 != 0) goto L_0x07df
                java.lang.String r0 = "Remote device is connecting !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                goto L_0x0864
            L_0x07df:
                r2.f61100n = r13
                java.util.LinkedList<byte[]> r0 = r2.f61099m
                r0.clear()
                android.bluetooth.BluetoothGatt r0 = r2.f61091e
                if (r0 == 0) goto L_0x0803
                boolean r0 = r0.connect()
                if (r0 != 0) goto L_0x07f9
                java.lang.String r0 = "mBluetoothGatt.connect() Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r2.mo33805e()
                goto L_0x0864
            L_0x07f9:
                r2.f61101o = r13
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61096j
                r0.postDelayed(r2, r6)
                goto L_0x0864
            L_0x0803:
                android.bluetooth.BluetoothDevice r0 = r2.f61088b     // Catch:{ NullPointerException -> 0x0811 }
                android.content.Context r4 = r2.f61090d     // Catch:{ NullPointerException -> 0x0811 }
                android.bluetooth.BluetoothGattCallback r5 = r2.f61106t     // Catch:{ NullPointerException -> 0x0811 }
                android.bluetooth.BluetoothGatt r0 = r0.connectGatt(r4, r13, r5)     // Catch:{ NullPointerException -> 0x0811 }
                r2.f61091e = r0     // Catch:{ NullPointerException -> 0x0811 }
                r0 = 0
                goto L_0x081a
            L_0x0811:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r13]
                java.lang.String r5 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r4)
                r0 = 1
            L_0x081a:
                int r4 = mw0.C21572h.f61086u
                int r4 = r4 + r11
                mw0.C21572h.f61086u = r4
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r5 = r2.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r13] = r5
                int r5 = mw0.C21572h.f61086u
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r11] = r5
                long r8 = r2.f61087a
                java.lang.String r5 = d81.C45288e.m50135f(r8)
                r8 = 2
                r4[r8] = r5
                android.bluetooth.BluetoothDevice r5 = r2.f61088b
                java.lang.String r5 = r5.getName()
                r8 = 3
                r4[r8] = r5
                java.lang.String r5 = "------create resource------, objid=%d, resourceCount=%d, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
                android.bluetooth.BluetoothGatt r4 = r2.f61091e
                if (r4 == 0) goto L_0x085c
                if (r0 == 0) goto L_0x0852
                goto L_0x085c
            L_0x0852:
                r2.f61101o = r13
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r2.f61094h
                java.lang.Runnable r2 = r2.f61096j
                r0.postDelayed(r2, r6)
                goto L_0x0864
            L_0x085c:
                java.lang.String r0 = "mDevice.connectGatt Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r2.mo33805e()
            L_0x0864:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mw0.C21572h.C21578f.handleMessage(android.os.Message):void");
        }
    }

    public C21572h(long j, Context context, C21577e eVar) {
        this.f61092f = eVar;
        this.f61090d = context;
        this.f61089c = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f61087a = j;
        this.f61101o = 3;
        this.f61088b = this.f61089c.getRemoteDevice(C45288e.m50135f(j));
        this.f61093g = new C21545a(20);
        this.f61105s = false;
        this.f61094h = new C21578f(C109639a.m148950a("BluetoothLESimpleSession_handlerThread"), this);
        this.f61095i = new C21574b();
        this.f61096j = new C21575c();
        this.f61097k = new C21576d();
    }

    /* renamed from: a */
    public static void m24462a(C21572h hVar, byte[] bArr) {
        boolean z;
        hVar.getClass();
        boolean z2 = false;
        Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------writeDataAsync------parserobj length = %d, mac=%s, name=%s", Integer.valueOf(bArr.length), C45288e.m50135f(hVar.f61087a), hVar.f61088b.getName());
        if (1 != hVar.f61101o) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "Not ready for write data, connectstate = %d", Integer.valueOf(hVar.f61101o));
            C21577e eVar = hVar.f61092f;
            if (eVar != null) {
                eVar.mo33799b(hVar.f61087a, false);
                return;
            }
            return;
        }
        C47302a b = C47302a.m52606b(bArr);
        if (b == null) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "write data error, no match ProfileParser, connect state = %d", Integer.valueOf(hVar.f61101o));
            C21577e eVar2 = hVar.f61092f;
            if (eVar2 != null) {
                eVar2.mo33799b(hVar.f61087a, false);
                return;
            }
            return;
        }
        Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleSession", "rawData data dump = %s", C45288e.m50130a(b.mo33979a()));
        String str = b.f126958e;
        int i = b.f126959f;
        String b2 = C89094c.m111364b(b.f126957d);
        HashMap hashMap = hVar.f61102p.get(b2);
        if (hashMap == null) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found", b2);
            C21577e eVar3 = hVar.f61092f;
            if (eVar3 != null) {
                eVar3.mo33799b(hVar.f61087a, false);
                return;
            }
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) hashMap.get(str);
        if (bluetoothGattCharacteristic == null) {
            Object[] objArr = new Object[1];
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found", objArr);
            C21577e eVar4 = hVar.f61092f;
            if (eVar4 != null) {
                eVar4.mo33799b(hVar.f61087a, false);
            }
        } else if ((bluetoothGattCharacteristic.getProperties() | i) == 0) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "property not support. current = %d, provided = %d", Integer.valueOf(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(i));
            C21577e eVar5 = hVar.f61092f;
            if (eVar5 != null) {
                eVar5.mo33799b(hVar.f61087a, false);
            }
        } else if (i == 2) {
            if (!hVar.f61091e.readCharacteristic(bluetoothGattCharacteristic)) {
                Log.m105920e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.readCharacteristic Failed!!!");
                z = false;
            } else {
                z = true;
            }
            Object[] objArr2 = new Object[1];
            objArr2[0] = z ? "true" : "false";
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleSession", "readCharacteristic state: %s", objArr2);
            C21577e eVar6 = hVar.f61092f;
            if (eVar6 == null) {
                return;
            }
            if (z) {
                eVar6.mo33799b(hVar.f61087a, true);
            } else {
                eVar6.mo33799b(hVar.f61087a, false);
            }
        } else {
            Assert.assertTrue(hVar.f61091e != null);
            hVar.f61099m.add(bArr);
            if (!hVar.f61100n) {
                if (1 == hVar.f61099m.size()) {
                    z2 = true;
                }
                Assert.assertTrue(z2);
                hVar.mo33807g();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0796  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x079d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0857  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x094d  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0952  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0969  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0972  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0158  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24463b(mw0.C21572h r30, android.bluetooth.BluetoothGattCharacteristic r31) {
        /*
            r0 = r30
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            long r3 = r0.f61087a
            java.lang.String r3 = d81.C45288e.m50135f(r3)
            r4 = 0
            r2[r4] = r3
            android.bluetooth.BluetoothDevice r3 = r0.f61088b
            java.lang.String r3 = r3.getName()
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.exdevice.BluetoothLESimpleSession"
            java.lang.String r6 = "------onDataReceiveImp------, mac=%s, name=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            if (r31 != 0) goto L_0x0027
            java.lang.String r0 = "characteristic is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x09c5
        L_0x0027:
            byte[] r2 = r31.getValue()
            int r6 = r2.length
            java.lang.String r6 = d81.C45288e.m50131b(r2, r6)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r8 = r2.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            java.lang.String r8 = "data length = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r6
            java.lang.String r6 = "data dump = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r7)
            java.util.HashMap<java.lang.String, java.lang.Long> r6 = nw0.C89094c.f256752a
            java.lang.String r6 = "nw0.c"
            java.util.UUID r7 = r31.getUuid()
            java.lang.String r7 = r7.toString()
            android.bluetooth.BluetoothGattService r8 = r31.getService()
            r9 = 0
            if (r8 == 0) goto L_0x0060
            long r11 = nw0.C89094c.m111363a(r8)
            goto L_0x0067
        L_0x0060:
            java.lang.String r8 = "the characteristic has no parent service"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            r11 = r9
        L_0x0067:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r4] = r7
            java.lang.String r13 = d81.C45288e.m50130a(r2)
            r8[r5] = r13
            java.lang.String r13 = "recv data. uuid = %s, data = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r13, r8)
            r13 = 1
            long r13 = r13 & r11
            r8 = 3
            r15 = 4
            int r17 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x0160
            java.lang.String r13 = nw0.C47303f.f126961o
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x0090
            java.lang.String r13 = nw0.C47303f.f126962p
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0160
        L_0x0090:
            nw0.f r9 = new nw0.f
            r9.<init>()
            int r10 = r2.length
            if (r10 <= 0) goto L_0x0126
            byte r10 = r2[r4]
            r10 = r10 & r5
            if (r10 != 0) goto L_0x009f
            goto L_0x0126
        L_0x009f:
            java.lang.String r10 = nw0.C47303f.f126961o
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x00b9
            java.lang.String r10 = nw0.C47303f.f126962p
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x00b9
            java.lang.String r2 = nw0.C47303f.f126960n
            java.lang.String r7 = "uuid is not correct"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
            goto L_0x012e
        L_0x00b9:
            r9.f126958e = r7
            byte r7 = r2[r4]
            r10 = r7 & 2
            if (r10 == 0) goto L_0x00c4
            r16 = 7
            goto L_0x00c6
        L_0x00c4:
            r16 = 4
        L_0x00c6:
            r7 = r7 & r15
            if (r7 == 0) goto L_0x00cb
            int r16 = r16 + 3
        L_0x00cb:
            r7 = r16
            int r10 = r2.length
            if (r7 <= r10) goto L_0x00d8
            java.lang.String r2 = nw0.C47303f.f126960n
            java.lang.String r7 = "data len is not enough"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
            goto L_0x012e
        L_0x00d8:
            r9.f126963h = r4
            r7 = 0
            r10 = 1
        L_0x00dc:
            if (r7 >= r8) goto L_0x00ef
            int r11 = r9.f126963h
            byte r12 = r2[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r13 = r7 * 8
            int r12 = r12 << r13
            int r11 = r11 + r12
            r9.f126963h = r11
            int r10 = r10 + 1
            int r7 = r7 + 1
            goto L_0x00dc
        L_0x00ef:
            byte r7 = r2[r4]
            r7 = r7 & r1
            if (r7 == 0) goto L_0x010a
            r9.f126964i = r4
            r7 = 0
        L_0x00f7:
            if (r7 >= r8) goto L_0x010a
            int r11 = r9.f126964i
            byte r12 = r2[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r13 = r7 * 8
            int r12 = r12 << r13
            int r11 = r11 + r12
            r9.f126964i = r11
            int r10 = r10 + 1
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x010a:
            byte r7 = r2[r4]
            r7 = r7 & r15
            if (r7 == 0) goto L_0x0124
            r9.f126965j = r4
            r7 = 0
        L_0x0112:
            if (r7 >= r8) goto L_0x0124
            int r11 = r9.f126965j
            byte r12 = r2[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r13 = r7 * 8
            int r12 = r12 << r13
            int r11 = r11 + r12
            r9.f126965j = r11
            int r10 = r10 + r5
            int r7 = r7 + 1
            goto L_0x0112
        L_0x0124:
            r2 = 1
            goto L_0x012f
        L_0x0126:
            java.lang.String r2 = nw0.C47303f.f126960n
            java.lang.String r7 = "pase step data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
        L_0x012e:
            r2 = 0
        L_0x012f:
            if (r2 == 0) goto L_0x0158
            byte[] r2 = r9.mo72344c()
            java.lang.Object[] r7 = new java.lang.Object[r8]
            int r8 = r9.f126963h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            int r8 = r9.f126964i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            int r8 = r9.f126965j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r1] = r8
            java.lang.String r1 = "step info. stepCount=%d, stepDistance=%d, stepColarie=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r7)
            r8 = r2
            goto L_0x0582
        L_0x0158:
            java.lang.String r1 = "parse step data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x058c
        L_0x0160:
            r13 = 2
            long r13 = r13 & r11
            r1 = 8
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x03ac
            java.lang.String r13 = nw0.C21717g.f61480n
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x0179
            java.lang.String r13 = nw0.C21717g.f61481o
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x03ac
        L_0x0179:
            nw0.g r9 = new nw0.g
            r9.<init>()
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x0382
            int r10 = r2.length
            if (r10 > 0) goto L_0x0189
            goto L_0x0382
        L_0x0189:
            r9.f126958e = r7
            java.lang.String r10 = nw0.C21717g.f61481o
            boolean r7 = r7.equalsIgnoreCase(r10)
            if (r7 == 0) goto L_0x020e
            int r1 = r2.length
            if (r15 <= r1) goto L_0x01a9
            java.lang.String r1 = nw0.C21717g.f61479j
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r4] = r2
            java.lang.String r2 = "weight scale feature characteristic data is a 32bit value, but current value len is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r7)
            goto L_0x0389
        L_0x01a9:
            nw0.g$c r1 = new nw0.g$c
            r1.<init>()
            r9.f61482h = r1
            byte r7 = r2[r4]
            r10 = r7 & 1
            if (r10 == 0) goto L_0x01b8
            r10 = 1
            goto L_0x01b9
        L_0x01b8:
            r10 = 0
        L_0x01b9:
            r11 = r7 & 2
            if (r11 == 0) goto L_0x01bf
            r11 = 1
            goto L_0x01c0
        L_0x01bf:
            r11 = 0
        L_0x01c0:
            r12 = r7 & 4
            if (r12 == 0) goto L_0x01c6
            r12 = 1
            goto L_0x01c7
        L_0x01c6:
            r12 = 0
        L_0x01c7:
            r13 = r7 & 120(0x78, float:1.68E-43)
            int r13 = r13 >> r8
            byte r13 = (byte) r13
            r7 = r7 & 128(0x80, float:1.794E-43)
            r14 = 7
            int r7 = r7 >> r14
            byte r2 = r2[r5]
            r2 = r2 & r8
            int r2 = r2 << r5
            int r7 = r7 + r2
            byte r2 = (byte) r7
            r1.f61495a = r2
            java.lang.String r1 = nw0.C21717g.f61479j
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = "true"
            java.lang.String r14 = "false"
            if (r10 == 0) goto L_0x01e5
            r10 = r7
            goto L_0x01e6
        L_0x01e5:
            r10 = r14
        L_0x01e6:
            r2[r4] = r10
            if (r11 == 0) goto L_0x01ec
            r10 = r7
            goto L_0x01ed
        L_0x01ec:
            r10 = r14
        L_0x01ed:
            r2[r5] = r10
            if (r12 == 0) goto L_0x01f2
            goto L_0x01f3
        L_0x01f2:
            r7 = r14
        L_0x01f3:
            r10 = 2
            r2[r10] = r7
            java.lang.Byte r7 = java.lang.Byte.valueOf(r13)
            r2[r8] = r7
            nw0.g$c r7 = r9.f61482h
            byte r7 = r7.f61495a
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r2[r15] = r7
            java.lang.String r7 = "timestampSupported = %s, multipleUsersSupported = %s, BMISupported = %s, weightResolution = %d, heightResolution = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r7, r2)
            goto L_0x0380
        L_0x020e:
            java.lang.String r7 = r9.f126958e
            java.lang.String r10 = nw0.C21717g.f61480n
            boolean r7 = r7.equalsIgnoreCase(r10)
            if (r7 == 0) goto L_0x0380
            byte r7 = r2[r4]
            r10 = r7 & 2
            if (r10 == 0) goto L_0x0221
            r11 = 10
            goto L_0x0222
        L_0x0221:
            r11 = 3
        L_0x0222:
            r12 = r7 & 4
            if (r12 == 0) goto L_0x0228
            int r11 = r11 + 1
        L_0x0228:
            r13 = r7 & 8
            if (r13 == 0) goto L_0x022e
            int r11 = r11 + 4
        L_0x022e:
            int r14 = r2.length
            if (r11 <= r14) goto L_0x024a
            java.lang.String r1 = nw0.C21717g.f61479j
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r7[r5] = r2
            java.lang.String r2 = "data len is not enough for parse. current len = %d, needed len = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r7)
            goto L_0x0389
        L_0x024a:
            nw0.g$b r11 = new nw0.g$b
            r11.<init>()
            r9.f61483i = r11
            r7 = r7 & r5
            if (r7 == 0) goto L_0x0256
            r7 = 1
            goto L_0x0257
        L_0x0256:
            r7 = 0
        L_0x0257:
            r11.f61489a = r7
            byte r7 = r2[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r14 = 2
            byte r15 = r2[r14]
            r14 = r15 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r1
            int r7 = r7 + r14
            r11.f61490b = r7
            if (r10 == 0) goto L_0x0303
            nw0.g$a r7 = new nw0.g$a
            r7.<init>()
            r11.f61491c = r7
            java.lang.String r10 = nw0.C21717g.f61479j
            java.lang.Object[] r11 = new java.lang.Object[r8]
            int r14 = r2.length
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11[r4] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r11[r5] = r14
            r14 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r14 = 2
            r11[r14] = r15
            java.lang.String r14 = "data size = %d, offset = %d, lenght = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r14, r11)
            int r11 = r2.length
            r14 = 10
            if (r11 >= r14) goto L_0x0298
            java.lang.String r7 = "data input error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r7)
            goto L_0x0300
        L_0x0298:
            byte r11 = r2[r8]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r14 = 4
            byte r15 = r2[r14]
            r14 = r15 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r1
            int r11 = r11 + r14
            r14 = 5
            byte r15 = r2[r14]
            r14 = r15 & 255(0xff, float:3.57E-43)
            r7.f61484a = r14
            r14 = 6
            byte r15 = r2[r14]
            r14 = r15 & 255(0xff, float:3.57E-43)
            r7.f61485b = r14
            r14 = 7
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r7.f61486c = r14
            byte r14 = r2[r1]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r7.f61487d = r14
            r14 = 9
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r7.f61488e = r14
            r14 = 6
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15[r4] = r11
            int r11 = r7.f61484a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15[r5] = r11
            int r11 = r7.f61485b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 2
            r15[r14] = r11
            int r11 = r7.f61486c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15[r8] = r11
            int r11 = r7.f61487d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 4
            r15[r14] = r11
            int r7 = r7.f61488e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11 = 5
            r15[r11] = r7
            java.lang.String r7 = "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r7, r15)
        L_0x0300:
            r18 = 10
            goto L_0x0305
        L_0x0303:
            r18 = 3
        L_0x0305:
            if (r12 == 0) goto L_0x0311
            nw0.g$b r7 = r9.f61483i
            byte r10 = r2[r18]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r7.f61492d = r10
            int r18 = r18 + 1
        L_0x0311:
            if (r13 == 0) goto L_0x0335
            nw0.g$b r7 = r9.f61483i
            byte r10 = r2[r18]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r18 + 1
            byte r11 = r2[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r1
            int r10 = r10 + r11
            r7.f61493e = r10
            r10 = 2
            int r18 = r18 + 2
            byte r10 = r2[r18]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r18 = r18 + 1
            byte r2 = r2[r18]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r2 << 8
            int r10 = r10 + r1
            r7.f61494f = r10
        L_0x0335:
            java.lang.String r1 = nw0.C21717g.f61479j
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            nw0.g$b r7 = r9.f61483i
            boolean r10 = r7.f61489a
            if (r10 == 0) goto L_0x0343
            java.lang.String r10 = "lb&inch"
            goto L_0x0345
        L_0x0343:
            java.lang.String r10 = "kg&meter"
        L_0x0345:
            r2[r4] = r10
            int r7 = r7.f61490b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            nw0.g$b r7 = r9.f61483i
            nw0.g$a r10 = r7.f61491c
            if (r10 != 0) goto L_0x0358
            java.lang.String r10 = "null"
            goto L_0x035a
        L_0x0358:
            java.lang.String r10 = "object"
        L_0x035a:
            r11 = 2
            r2[r11] = r10
            int r7 = r7.f61492d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r8] = r7
            nw0.g$b r7 = r9.f61483i
            int r7 = r7.f61493e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 4
            r2[r8] = r7
            nw0.g$b r7 = r9.f61483i
            int r7 = r7.f61494f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 5
            r2[r8] = r7
            java.lang.String r7 = "WeightAndHeightUnit = %s, Weight = %d, TimeStamp = %s, UserId = %d, BMI = %d, Height = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r7, r2)
        L_0x0380:
            r1 = 1
            goto L_0x038a
        L_0x0382:
            java.lang.String r1 = nw0.C21717g.f61479j
            java.lang.String r2 = "characteristicUuid or data is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x0389:
            r1 = 0
        L_0x038a:
            if (r1 == 0) goto L_0x03a4
            byte[] r1 = r9.mo72344c()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            nw0.g$b r7 = r9.f61483i
            int r7 = r7.f61490b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r4] = r7
            java.lang.String r7 = "weight info. weight = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r2)
            goto L_0x0581
        L_0x03a4:
            java.lang.String r1 = "parse weight scale data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x058c
        L_0x03ac:
            r13 = 4
            long r13 = r13 & r11
            java.lang.String r15 = "flag="
            java.lang.String r1 = "characteristicUuid or data is null"
            r21 = 65280(0xff00, float:9.1477E-41)
            r8 = 16
            int r22 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r22 == 0) goto L_0x0590
            java.lang.String r13 = nw0.C21714d.f61458n
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x03d4
            java.lang.String r13 = nw0.C21714d.f61459o
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x03d4
            java.lang.String r13 = nw0.C21714d.f61460p
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0590
        L_0x03d4:
            nw0.d r9 = new nw0.d
            r9.<init>()
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x0575
            r9.f126958e = r7
            int r1 = r2.length
            java.lang.String r10 = nw0.C21714d.f61458n
            boolean r7 = r7.equalsIgnoreCase(r10)
            if (r7 == 0) goto L_0x0524
            int r7 = r2.length
            r10 = 2
            if (r7 >= r10) goto L_0x0406
            java.lang.String r2 = nw0.C21714d.f61457j
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Received data length is not right:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x057a
        L_0x0406:
            nw0.d$a r7 = new nw0.d$a
            r7.<init>(r9)
            r9.f61462i = r7
            byte r7 = r2[r4]
            java.lang.String r10 = nw0.C21714d.f61457j
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r15)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            r11 = r7 & 1
            if (r11 != r5) goto L_0x0445
            r11 = 3
            if (r1 < r11) goto L_0x0445
            java.lang.String r11 = "Value Format = uint16"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            r11 = 2
            byte r11 = r2[r11]
            r12 = 8
            int r11 = r11 << r12
            r11 = r11 & r21
            nw0.d$a r12 = r9.f61462i
            byte r13 = r2[r5]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 & r21
            int r13 = r13 + r11
            r12.f61463a = r13
            r17 = 3
            goto L_0x0457
        L_0x0445:
            r11 = 2
            if (r1 < r11) goto L_0x051d
            java.lang.String r11 = "Value Format = uint8"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            nw0.d$a r11 = r9.f61462i
            byte r12 = r2[r5]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r11.f61463a = r12
            r17 = 2
        L_0x0457:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Data received from HR "
            r11.append(r12)
            nw0.d$a r12 = r9.f61462i
            int r12 = r12.f61463a
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r11)
            r11 = r7 & 6
            r12 = 4
            if (r11 != r12) goto L_0x047f
            java.lang.String r11 = "Sensor Contact feature is supported, but contact is not detected"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            nw0.d$a r11 = r9.f61462i
            r11.getClass()
            goto L_0x0497
        L_0x047f:
            r12 = 6
            if (r11 != r12) goto L_0x048d
            java.lang.String r11 = "Sensor Contact feature is supported and contact is detected"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            nw0.d$a r11 = r9.f61462i
            r11.getClass()
            goto L_0x0497
        L_0x048d:
            java.lang.String r11 = "Sensor Contact feature is not supported in the current connection"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            nw0.d$a r11 = r9.f61462i
            r11.getClass()
        L_0x0497:
            r11 = r7 & 8
            java.lang.String r12 = " "
            r13 = 8
            if (r11 != r13) goto L_0x04dd
            int r11 = r17 + 2
            if (r1 < r11) goto L_0x04dd
            java.lang.String r14 = "Energy Expend Present"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r14)
            int r14 = r17 + 1
            byte r14 = r2[r14]
            int r14 = r14 << r13
            r13 = r14 & r21
            nw0.d$a r14 = r9.f61462i
            byte r15 = r2[r17]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = r13 & r21
            int r15 = r15 + r16
            r14.f61464b = r15
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "energyExp from HR energyExph "
            r14.append(r15)
            r14.append(r13)
            r14.append(r12)
            nw0.d$a r13 = r9.f61462i
            int r13 = r13.f61464b
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "H7ConnectThread"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r13)
            r17 = r11
        L_0x04dd:
            r7 = r7 & r8
            if (r7 != r8) goto L_0x0573
            int r7 = r17 + 2
            if (r1 < r7) goto L_0x0573
            java.lang.String r1 = "RR Interval Present"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
            int r1 = r17 + 1
            byte r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7 = 8
            int r1 = r1 << r7
            nw0.d$a r7 = r9.f61462i
            byte r2 = r2[r17]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r8 = r1 & r21
            int r2 = r2 + r8
            r7.f61465c = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "rrInterval from HR rrIntervalh"
            r2.append(r7)
            r2.append(r1)
            r2.append(r12)
            nw0.d$a r1 = r9.f61462i
            int r1 = r1.f61465c
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r1)
            goto L_0x0573
        L_0x051d:
            java.lang.String r1 = "receive data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
            goto L_0x057a
        L_0x0524:
            java.lang.String r1 = r9.f126958e
            java.lang.String r7 = nw0.C21714d.f61459o
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x0573
            byte r1 = r2[r4]
            switch(r1) {
                case 0: goto L_0x0556;
                case 1: goto L_0x0551;
                case 2: goto L_0x054c;
                case 3: goto L_0x0547;
                case 4: goto L_0x0542;
                case 5: goto L_0x053d;
                case 6: goto L_0x0538;
                default: goto L_0x0533;
            }
        L_0x0533:
            java.lang.String r1 = "Unknown"
            r9.f61461h = r1
            goto L_0x055a
        L_0x0538:
            java.lang.String r1 = "Foot"
            r9.f61461h = r1
            goto L_0x055a
        L_0x053d:
            java.lang.String r1 = "Ear Lobe"
            r9.f61461h = r1
            goto L_0x055a
        L_0x0542:
            java.lang.String r1 = "Hand"
            r9.f61461h = r1
            goto L_0x055a
        L_0x0547:
            java.lang.String r1 = "Finger"
            r9.f61461h = r1
            goto L_0x055a
        L_0x054c:
            java.lang.String r1 = "Wrist"
            r9.f61461h = r1
            goto L_0x055a
        L_0x0551:
            java.lang.String r1 = "Chest"
            r9.f61461h = r1
            goto L_0x055a
        L_0x0556:
            java.lang.String r1 = "Other"
            r9.f61461h = r1
        L_0x055a:
            java.lang.String r1 = nw0.C21714d.f61457j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "position="
            r2.append(r7)
            java.lang.String r7 = r9.f61461h
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
        L_0x0573:
            r1 = 1
            goto L_0x057b
        L_0x0575:
            java.lang.String r2 = nw0.C21714d.f61457j
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x057a:
            r1 = 0
        L_0x057b:
            if (r1 == 0) goto L_0x0586
            byte[] r1 = r9.mo72344c()
        L_0x0581:
            r8 = r1
        L_0x0582:
            r23 = r3
            goto L_0x0967
        L_0x0586:
            java.lang.String r1 = "parse heart rate data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
        L_0x058c:
            r23 = r3
            goto L_0x085f
        L_0x0590:
            r13 = 8
            long r13 = r13 & r11
            int r19 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r19 == 0) goto L_0x0862
            java.lang.String r13 = nw0.C21710b.f61438o
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x05af
            java.lang.String r13 = nw0.C21710b.f61439p
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x05af
            java.lang.String r13 = nw0.C21710b.f61440q
            boolean r13 = r7.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0862
        L_0x05af:
            nw0.b r9 = new nw0.b
            r9.<init>()
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x0845
            r9.f126958e = r7
            int r1 = r2.length
            java.lang.String r10 = nw0.C21710b.f61438o
            boolean r7 = r7.equalsIgnoreCase(r10)
            java.lang.String r10 = "UserId = "
            java.lang.String r11 = "UserId Present."
            java.lang.String r12 = "UserId not Present."
            java.lang.String r13 = "PulseRate ="
            java.lang.String r14 = "PulseRate Present."
            java.lang.String r8 = "PulseRate not Present."
            java.lang.String r5 = "TimeStamp Present."
            java.lang.String r4 = "TimeStamp not Present."
            java.lang.String r0 = "the value unit is kPa."
            r23 = r3
            java.lang.String r3 = "the value unit is mmHg."
            r24 = r6
            java.lang.String r6 = "data len is not right."
            r20 = r12
            java.lang.String r12 = "MeasurementStatus = "
            r25 = r12
            java.lang.String r12 = "MeasurementStatus Present."
            r26 = r12
            java.lang.String r12 = "MeasurementStatus not Present."
            if (r7 == 0) goto L_0x06fb
            r7 = 7
            if (r1 >= r7) goto L_0x05f7
            java.lang.String r0 = nw0.C21710b.f61437n
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            goto L_0x084e
        L_0x05f7:
            nw0.b$b r6 = new nw0.b$b
            r6.<init>(r9)
            r9.f61441h = r6
            r6 = 0
            byte r7 = r2[r6]
            java.lang.String r6 = nw0.C21710b.f61437n
            r27 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r12)
            r12 = r7 & 1
            if (r12 == 0) goto L_0x0624
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            nw0.b$b r0 = r9.f61441h
            r0.getClass()
            goto L_0x062c
        L_0x0624:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            nw0.b$b r0 = r9.f61441h
            r0.getClass()
        L_0x062c:
            nw0.b$b r0 = r9.f61441h
            r3 = 1
            nw0.C21710b.m24669d(r2, r3)
            r0.getClass()
            nw0.b$b r0 = r9.f61441h
            r3 = 3
            nw0.C21710b.m24669d(r2, r3)
            r0.getClass()
            nw0.b$b r0 = r9.f61441h
            r3 = 5
            nw0.C21710b.m24669d(r2, r3)
            r0.getClass()
            r0 = r7 & 2
            r3 = 14
            if (r0 == 0) goto L_0x065d
            if (r1 < r3) goto L_0x065d
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            nw0.b$b r0 = r9.f61441h
            nw0.b$c r0 = r0.f61451d
            r4 = 7
            r0.mo33980a(r2, r4, r4)
            r15 = 14
            goto L_0x0661
        L_0x065d:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            r15 = 7
        L_0x0661:
            r0 = r7 & 4
            if (r0 == 0) goto L_0x068d
            int r0 = r15 + 2
            if (r1 < r0) goto L_0x068d
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r14)
            nw0.b$b r1 = r9.f61441h
            double r3 = nw0.C21710b.m24669d(r2, r15)
            int r3 = (int) r3
            r1.f61448a = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            nw0.b$b r3 = r9.f61441h
            int r3 = r3.f61448a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            r15 = r0
            goto L_0x0690
        L_0x068d:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
        L_0x0690:
            r0 = r7 & 8
            if (r0 == 0) goto L_0x06b7
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r11)
            nw0.b$b r0 = r9.f61441h
            int r1 = r15 + 1
            byte r3 = r2[r15]
            r0.f61449b = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            nw0.b$b r3 = r9.f61441h
            int r3 = r3.f61449b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r15 = r1
            goto L_0x06bc
        L_0x06b7:
            r12 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r12)
        L_0x06bc:
            r0 = 16
            r0 = r0 & r7
            if (r0 == 0) goto L_0x06f4
            r7 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            int r0 = r15 + 1
            byte r0 = r2[r0]
            r1 = 8
            int r0 = r0 << r1
            r0 = r0 & r21
            nw0.b$b r1 = r9.f61441h
            byte r2 = r2[r15]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 & r21
            int r2 = r2 + r0
            r1.f61450c = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r25
            r0.append(r1)
            nw0.b$b r1 = r9.f61441h
            int r1 = r1.f61450c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x0843
        L_0x06f4:
            r0 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x0843
        L_0x06fb:
            r29 = r12
            r12 = r20
            r28 = r25
            java.lang.String r7 = r9.f126958e
            java.lang.String r12 = nw0.C21710b.f61439p
            boolean r7 = r7.equalsIgnoreCase(r12)
            if (r7 == 0) goto L_0x0802
            r7 = 3
            if (r1 >= r7) goto L_0x0715
            java.lang.String r0 = nw0.C21710b.f61437n
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            goto L_0x084e
        L_0x0715:
            nw0.b$a r6 = new nw0.b$a
            r6.<init>(r9)
            r9.f61442i = r6
            r6 = 0
            byte r7 = r2[r6]
            java.lang.String r6 = nw0.C21710b.f61437n
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r12)
            r12 = r7 & 1
            if (r12 == 0) goto L_0x0740
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            nw0.b$a r0 = r9.f61442i
            r0.getClass()
            goto L_0x0748
        L_0x0740:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            nw0.b$a r0 = r9.f61442i
            r0.getClass()
        L_0x0748:
            nw0.b$a r0 = r9.f61442i
            r3 = 1
            nw0.C21710b.m24669d(r2, r3)
            r0.getClass()
            r0 = r7 & 2
            if (r0 == 0) goto L_0x0766
            r0 = 10
            if (r1 < r0) goto L_0x0766
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            nw0.b$a r3 = r9.f61442i
            nw0.b$c r3 = r3.f61447d
            r4 = 7
            r5 = 3
            r3.mo33980a(r2, r5, r4)
            goto L_0x076a
        L_0x0766:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            r0 = 3
        L_0x076a:
            r3 = r7 & 4
            if (r3 == 0) goto L_0x0796
            int r3 = r0 + 2
            if (r1 < r3) goto L_0x0796
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r14)
            nw0.b$a r1 = r9.f61442i
            double r4 = nw0.C21710b.m24669d(r2, r0)
            int r0 = (int) r4
            r1.f61444a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            nw0.b$a r1 = r9.f61442i
            int r1 = r1.f61444a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r0 = r3
            goto L_0x0799
        L_0x0796:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
        L_0x0799:
            r1 = r7 & 8
            if (r1 == 0) goto L_0x07c0
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r11)
            nw0.b$a r1 = r9.f61442i
            int r3 = r0 + 1
            byte r0 = r2[r0]
            r1.f61445b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            nw0.b$a r1 = r9.f61442i
            int r1 = r1.f61445b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r0 = r3
            goto L_0x07c5
        L_0x07c0:
            r1 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
        L_0x07c5:
            r1 = 16
            r1 = r1 & r7
            if (r1 == 0) goto L_0x07fc
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            int r1 = r0 + 1
            byte r1 = r2[r1]
            r3 = 8
            int r1 = r1 << r3
            r1 = r1 & r21
            nw0.b$a r3 = r9.f61442i
            byte r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & r21
            int r0 = r0 + r1
            r3.f61446c = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r28
            r0.append(r1)
            nw0.b$a r1 = r9.f61442i
            int r1 = r1.f61446c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x0843
        L_0x07fc:
            r0 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            goto L_0x0843
        L_0x0802:
            java.lang.String r0 = r9.f126958e
            java.lang.String r3 = nw0.C21710b.f61440q
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0843
            java.lang.String r0 = nw0.C21710b.f61437n
            java.lang.String r3 = "Blood Pressure Feature Characteristic."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)
            r3 = 2
            if (r1 >= r3) goto L_0x081a
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            goto L_0x084e
        L_0x081a:
            r1 = 1
            byte r3 = r2[r1]
            r1 = 8
            int r1 = r3 << 8
            r1 = r1 & r21
            r3 = 0
            byte r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 & r21
            int r2 = r2 + r1
            r9.f61443j = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bloodPressureFeatureParameters="
            r1.append(r2)
            int r2 = r9.f61443j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x0843:
            r0 = 1
            goto L_0x084f
        L_0x0845:
            r23 = r3
            r24 = r6
            java.lang.String r0 = nw0.C21710b.f61437n
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x084e:
            r0 = 0
        L_0x084f:
            if (r0 == 0) goto L_0x0857
            byte[] r8 = r9.mo72344c()
            goto L_0x0967
        L_0x0857:
            java.lang.String r0 = "parse blood pressure data error"
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x085f:
            r0 = 0
            goto L_0x0966
        L_0x0862:
            r23 = r3
            r3 = r6
            r4 = 16
            long r4 = r4 & r11
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0959
            java.lang.String r0 = nw0.C21716e.f61467t
            boolean r4 = r7.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x088c
            java.lang.String r4 = nw0.C21716e.f61468u
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x088c
            java.lang.String r4 = nw0.C21716e.f61469v
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x088c
            java.lang.String r4 = nw0.C21716e.f61470w
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0959
        L_0x088c:
            nw0.e r4 = new nw0.e
            r4.<init>()
            int r5 = r7.length()
            if (r5 <= 0) goto L_0x0944
            r4.f126958e = r7
            boolean r0 = r7.equalsIgnoreCase(r0)
            java.lang.String r1 = "Data length incorrect"
            if (r0 == 0) goto L_0x08bc
            int r0 = r2.length
            r5 = 3
            if (r0 == r5) goto L_0x08ab
            java.lang.String r0 = nw0.C21716e.f61466s
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x090a
        L_0x08ab:
            r0 = 0
            byte r1 = r2[r0]
            r4.f61471h = r1
            r0 = 1
            byte r1 = r2[r0]
            r4.f61472i = r1
            r1 = 2
            byte r1 = r2[r1]
            r4.f61473j = r1
            goto L_0x0934
        L_0x08bc:
            r0 = 1
            java.lang.String r5 = r4.f126958e
            java.lang.String r6 = nw0.C21716e.f61468u
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x08d6
            int r5 = r2.length
            if (r5 == r0) goto L_0x08d0
            java.lang.String r0 = nw0.C21716e.f61466s
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x090a
        L_0x08d0:
            r0 = 0
            byte r1 = r2[r0]
            r4.f61474n = r1
            goto L_0x0934
        L_0x08d6:
            java.lang.String r0 = r4.f126958e
            java.lang.String r5 = nw0.C21716e.f61469v
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x08f7
            int r0 = r2.length
            r5 = 2
            if (r0 >= r5) goto L_0x08ea
            java.lang.String r0 = nw0.C21716e.f61466s
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x090a
        L_0x08ea:
            byte[] r0 = r4.f61475o
            r1 = 0
            byte r5 = r2[r1]
            r0[r1] = r5
            r1 = 1
            byte r2 = r2[r1]
            r0[r1] = r2
            goto L_0x0934
        L_0x08f7:
            java.lang.String r0 = r4.f126958e
            java.lang.String r5 = nw0.C21716e.f61470w
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x093b
            int r0 = r2.length
            r5 = 4
            if (r0 >= r5) goto L_0x090c
            java.lang.String r0 = nw0.C21716e.f61466s
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x090a:
            r0 = 0
            goto L_0x094a
        L_0x090c:
            r0 = 0
            byte r1 = r2[r0]
            r0 = r1 & 255(0xff, float:3.57E-43)
            r1 = 1
            byte r5 = r2[r1]
            r1 = r5 & 255(0xff, float:3.57E-43)
            r5 = 8
            int r1 = r1 << r5
            int r0 = r0 + r1
            r4.f61476p = r0
            r0 = 2
            byte r0 = r2[r0]
            r0 = 3
            byte r0 = r2[r0]
            r4.f61477q = r0
            int r0 = r2.length
            r1 = 4
            if (r0 <= r1) goto L_0x0936
            int r0 = r2.length
            int r0 = r0 - r1
            byte[] r0 = new byte[r0]
            r4.f61478r = r0
            int r5 = r2.length
            int r5 = r5 - r1
            r6 = 0
            java.lang.System.arraycopy(r2, r1, r0, r6, r5)
        L_0x0934:
            r0 = 0
            goto L_0x0939
        L_0x0936:
            r0 = 0
            r4.f61478r = r0
        L_0x0939:
            r1 = 1
            goto L_0x094b
        L_0x093b:
            r0 = 0
            java.lang.String r1 = nw0.C21716e.f61466s
            java.lang.String r2 = "characteristicUuid is incorrect"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x094a
        L_0x0944:
            r0 = 0
            java.lang.String r2 = nw0.C21716e.f61466s
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x094a:
            r1 = 0
        L_0x094b:
            if (r1 == 0) goto L_0x0952
            byte[] r8 = r4.mo72344c()
            goto L_0x0967
        L_0x0952:
            java.lang.String r1 = "parse light data error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            goto L_0x0966
        L_0x0959:
            r0 = 0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r7
            java.lang.String r1 = "unknown characteristic uuid = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r2)
        L_0x0966:
            r8 = r0
        L_0x0967:
            if (r8 != 0) goto L_0x0972
            java.lang.String r0 = "parse data error"
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x09c5
        L_0x0972:
            r0 = r30
            mw0.h$e r1 = r0.f61092f
            if (r1 == 0) goto L_0x09c5
            long r2 = r0.f61087a
            mw0.f$b r1 = (mw0.C21565f.C21567b) r1
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r0 = d81.C45288e.m50135f(r2)
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "MicroMsg.exdevice.BluetoothLESimpleManager"
            java.lang.String r5 = "onRecv. mac = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r5, r4)
            mw0.f r1 = mw0.C21565f.this
            mw0.f$d r1 = r1.f61067b
            if (r1 == 0) goto L_0x09c0
            com.tencent.mm.plugin.exdevice.service.o$a r1 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18697a) r1
            com.tencent.mm.plugin.exdevice.service.o$i r0 = new com.tencent.mm.plugin.exdevice.service.o$i
            r0.<init>()
            r0.f52335a = r2
            r0.f52336b = r8
            com.tencent.mm.plugin.exdevice.service.o r1 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f52302p
            r2 = 12
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            boolean r0 = r1.sendMessage(r0)
            if (r0 != 0) goto L_0x09c5
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
            java.lang.String r2 = "mHandler.sendMessage failed!!!, message what = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            goto L_0x09c5
        L_0x09c0:
            java.lang.String r1 = "no BLEManagerCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x09c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mw0.C21572h.m24463b(mw0.h, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    /* renamed from: c */
    public boolean mo33803c() {
        Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connect------, mac=%s, name=%s", C45288e.m50135f(this.f61087a), this.f61088b.getName());
        MMHandler mMHandler = this.f61094h;
        return mMHandler.sendMessage(mMHandler.obtainMessage(0));
    }

    /* renamed from: d */
    public void mo33804d() {
        Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "markSessionDisconnected, mac=%s, name=%s", C45288e.m50135f(this.f61087a), this.f61088b.getName());
        this.f61101o = 2;
        this.f61094h.removeCallbacks(this.f61096j);
        this.f61094h.removeCallbacks(this.f61097k);
        mo33805e();
        mo33806f();
    }

    /* renamed from: e */
    public final void mo33805e() {
        if (this.f61092f == null) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------ don't need to notify, mac=%s, name=%s", C45288e.m50135f(this.f61087a), this.f61088b.getName());
            return;
        }
        Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------, mac=%s, name=%s", C45288e.m50135f(this.f61087a), this.f61088b.getName());
        C21577e eVar = this.f61092f;
        if (eVar != null) {
            eVar.mo33798a(this.f61087a, false, this.f61103q);
        }
        this.f61092f = null;
    }

    /* renamed from: f */
    public final void mo33806f() {
        if (this.f61091e == null) {
            Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------ nothing to release, objid=%d, mac=%s, name=%s", Integer.valueOf(hashCode()), C45288e.m50135f(this.f61087a), this.f61088b.getName());
            return;
        }
        f61086u--;
        Log.m105925i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------, objid=%d, resourceCount=%d, mac=%s, name=%s", Integer.valueOf(hashCode()), Integer.valueOf(f61086u), C45288e.m50135f(this.f61087a), this.f61088b.getName());
        this.f61105s = false;
        this.f61091e.close();
        this.f61094h.quitSafely();
        this.f61091e = null;
    }

    /* renamed from: g */
    public final void mo33807g() {
        if (this.f61099m.isEmpty()) {
            this.f61100n = false;
            return;
        }
        C47302a b = C47302a.m52606b(this.f61099m.pop());
        byte[] a = b.mo33979a();
        String str = b.f126958e;
        int i = b.f126959f;
        String b2 = C89094c.m111364b(b.f126957d);
        HashMap hashMap = this.f61102p.get(b2);
        if (hashMap == null) {
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found, mac=%s, name=%s", b2, C45288e.m50135f(this.f61087a), this.f61088b.getName());
            C21577e eVar = this.f61092f;
            if (eVar != null) {
                eVar.mo33799b(this.f61087a, false);
                return;
            }
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) hashMap.get(str);
        if (bluetoothGattCharacteristic == null) {
            Object[] objArr = new Object[3];
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            objArr[1] = C45288e.m50135f(this.f61087a);
            objArr[2] = this.f61088b.getName();
            Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found, mac=%s, name=%s", objArr);
            C21577e eVar2 = this.f61092f;
            if (eVar2 != null) {
                eVar2.mo33799b(this.f61087a, false);
            }
        } else if (i == 8) {
            C21545a aVar = this.f61093g;
            aVar.f61003d = bluetoothGattCharacteristic;
            if (a == null) {
                aVar.f61000a = null;
                aVar.f61002c = 0;
                aVar.f61001b = 0;
            } else {
                byte[] bArr = new byte[a.length];
                aVar.f61000a = bArr;
                System.arraycopy(a, 0, bArr, 0, a.length);
                aVar.f61002c = a.length;
                aVar.f61001b = 0;
            }
            byte[] a2 = this.f61093g.mo33751a();
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleSession", "write data to character, dump = %s, characteristicUuid=%s, mac=%s, name=%s", C45288e.m50130a(a2), str, C45288e.m50135f(this.f61087a), this.f61088b.getName());
            bluetoothGattCharacteristic.setValue(a2);
            this.f61094h.postDelayed(this.f61095i, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            if (!this.f61091e.writeCharacteristic(bluetoothGattCharacteristic)) {
                Log.m105921e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.writeCharacteristic Failed!!!, mac=%s, name=%s", C45288e.m50135f(this.f61087a), this.f61088b.getName());
                C21577e eVar3 = this.f61092f;
                if (eVar3 != null) {
                    eVar3.mo33799b(this.f61087a, false);
                    return;
                }
                return;
            }
            this.f61100n = true;
        } else {
            Log.m105919d("MicroMsg.exdevice.BluetoothLESimpleSession", "write property is needed. but current property is %d, mac=%s, name=%s", Integer.valueOf(i), C45288e.m50135f(this.f61087a), this.f61088b.getName());
            C21577e eVar4 = this.f61092f;
            if (eVar4 != null) {
                eVar4.mo33799b(this.f61087a, false);
            }
        }
    }
}
