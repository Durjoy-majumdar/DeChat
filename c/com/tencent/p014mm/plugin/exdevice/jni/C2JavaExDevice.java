package com.tencent.p014mm.plugin.exdevice.jni;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import y71.C23260a;
import y71.C23271d;
import y71.C23272e;
import y71.C23274f;
import y71.C23275g;

/* renamed from: com.tencent.mm.plugin.exdevice.jni.C2JavaExDevice */
public final class C2JavaExDevice {
    private static final String TAG = "MicroMsg.exdevice.C2JavaExDevice";

    public static void C2Java_onStateChange(long j, int i, int i2, int i3) {
        C23260a.m27727h(j, i, i2, i3);
    }

    public static void C2Java_onTaskEnd(long j, int i, int i2, String str, byte[] bArr) {
        C23260a.m27728i(j, i, i2, str);
    }

    public static boolean connect(long j) {
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", Long.valueOf(j));
        C23272e e = C23272e.m27752e();
        boolean post = e.f66901e.post(new C23274f(e, j));
        if (!post) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
        }
        return post;
    }

    public static void createSession(long j, long j2) {
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", Long.valueOf(j), Long.valueOf(j2));
        C23272e e = C23272e.m27752e();
        if (!e.f66901e.post(new C23271d(e, j, j2))) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
        }
    }

    public static void destroySession(long j) {
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", Long.valueOf(j));
        C23272e e = C23272e.m27752e();
        if (!e.f66901e.post(new C23275g(e, j))) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
        }
    }

    public static void onAirKissCallback(int i, int i2) {
        Log.m105927v(TAG, "onAirKissCallback(errType : %d, errCode : %d)", Integer.valueOf(i), Integer.valueOf(i2));
        C2242s0.m2051a().mo2131b(0, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void onDeviceRequest(long j, short s, short s2, byte[] bArr, int i) {
        C23260a.m27726g(j, s, s2, bArr, i);
    }

    public static void onReceiveWCLanDeviceDiscPackage(byte[] bArr) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i(TAG, "onReceiveWCLanDeviceDiscPackage, dataLen(%d).", objArr);
        C2242s0.m2051a().mo2131b(10, bArr);
    }

    public static void onReceiveWCLanDeviceProfile(byte[] bArr) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i(TAG, "onReceiveWCLanDeviceProfile, data(%d).", objArr);
        C2242s0.m2051a().mo2131b(14, bArr);
    }

    public static void onWCLanDeviceConnectStateNotify(String str, int i) {
        Log.m105925i(TAG, "onWCLanDeviceConnectStateNotify, devclassinfo(%s), stateCode(%d).", str, Integer.valueOf(i));
        C2242s0.m2051a().mo2131b(13, str, Integer.valueOf(i));
    }

    public static void onWCLanDeviceUdpError(int i) {
        Log.m105925i(TAG, "onWCLanDeviceUdpError, errCode(%d).", Integer.valueOf(i));
        C2242s0.m2051a().mo2131b(11, Integer.valueOf(i));
    }

    public static void onWCLanFileTransferUpdate(int i, byte[] bArr) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i(TAG, "onWCLanFileTransferUpdate, cmdId(%d), data(%d).", objArr);
        C2242s0.m2051a().mo2131b(15, Integer.valueOf(i), bArr);
    }

    public static void onWCLanReceiveNotify(String str, byte[] bArr) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i(TAG, "onWCLanReceiveNotify, devclassinfo(%s), data(%d).", objArr);
        C2242s0.m2051a().mo2131b(16, str, bArr);
    }

    public static void onWCLanReceiveResponse(int i, byte[] bArr) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        Log.m105925i(TAG, "onWCLanReceiveResponse, cmdId(%d), data(%d).", objArr);
        C2242s0.m2051a().mo2131b(12, Integer.valueOf(i), bArr);
    }

    public static boolean sendData(long j, byte[] bArr) {
        return C23272e.m27753i(j, bArr);
    }
}
