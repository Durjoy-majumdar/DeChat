package mw0;

import android.bluetooth.BluetoothGattCharacteristic;

/* renamed from: mw0.a */
public final class C21545a {

    /* renamed from: a */
    public byte[] f61000a = null;

    /* renamed from: b */
    public int f61001b = 0;

    /* renamed from: c */
    public int f61002c = 0;

    /* renamed from: d */
    public BluetoothGattCharacteristic f61003d = null;

    public C21545a(int i) {
    }

    /* renamed from: a */
    public byte[] mo33751a() {
        int i = this.f61002c;
        int i2 = this.f61001b;
        int i3 = i - i2;
        if (i3 == 0) {
            return null;
        }
        if (i3 >= 20) {
            i3 = 20;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f61000a, i2, bArr, 0, i3);
        this.f61001b += i3;
        return bArr;
    }
}
