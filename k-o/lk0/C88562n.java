package lk0;

import android.bluetooth.BluetoothDevice;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: lk0.n */
public final class C88562n {

    /* renamed from: a */
    public final BluetoothDevice f255781a;

    /* renamed from: b */
    public final int f255782b;

    /* renamed from: c */
    public final int f255783c;

    public C88562n(BluetoothDevice bluetoothDevice, int i, int i2) {
        C87412m.m108594g(bluetoothDevice, TPReportKeys.Common.COMMON_DEVICE_NAME);
        this.f255781a = bluetoothDevice;
        this.f255782b = i;
        this.f255783c = i2;
    }
}
