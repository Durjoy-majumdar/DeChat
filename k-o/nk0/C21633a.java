package nk0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: nk0.a */
public class C21633a extends BluetoothGattCallback {

    /* renamed from: a */
    public final C21634h f61241a;

    public C21633a(C21634h hVar) {
        this.f61241a = hVar;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f61241a.mo33878b(bluetoothGatt, bluetoothGattCharacteristic);
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f61241a.mo33884h(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f61241a.mo33880d(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f61241a.mo33885i(bluetoothGatt, i, i2);
    }

    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f61241a.mo33882f(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f61241a.mo33883g(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f61241a.mo33877a(bluetoothGatt, i, i2);
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f61241a.mo33881e(bluetoothGatt, i, i2);
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
        this.f61241a.mo33879c(bluetoothGatt, i);
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        this.f61241a.mo33886j(bluetoothGatt, i);
    }
}
