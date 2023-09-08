package com.tencent.p014mm.udp.libmmudp;

/* renamed from: com.tencent.mm.udp.libmmudp.UdpNative */
public class UdpNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_UDP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static int SEND_BUFFER_ERROR = -1003;
    public static String TAG = "UdpNative";
    private boolean initCallBackFlag = false;
    public volatile long mNativeInst = 0;

    /* renamed from: com.tencent.mm.udp.libmmudp.UdpNative$NativeCallBackInterface */
    public interface NativeCallBackInterface {
        void onCallBack(long j, String str);
    }

    public UdpNative(long j, long j2, long j3) {
        this.mNativeInst = initBindingUdp(j, j2, j3);
    }

    private native void destoryBindingUdp(long j);

    private native long initBindingUdp(long j, long j2, long j3);

    private native int initCallBack(long j, NativeCallBackInterface nativeCallBackInterface);

    private native void serviceReceive(String str, int i, String str2);

    private native void testBindingUdp(long j);

    private native void testBindingUdp2(long j);

    private native void testBindingUdp3(long j);

    private native void updateNativeInterface(long j, long j2);

    public void destoryUdp() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingUdp(this.mNativeInst);
            this.mNativeInst = -1;
        }
    }

    public int setCallBack(final NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_UDP_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new NativeCallBackInterface(this) {
            public void onCallBack(long j, String str) {
                nativeCallBackInterface.onCallBack(j, str);
            }
        });
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testBind() {
        if (this.mNativeInst != -1) {
            testBindingUdp(this.mNativeInst);
        }
    }

    public void testBind2() {
        if (this.mNativeInst != -1) {
            testBindingUdp2(this.mNativeInst);
        }
    }

    public void testBind3() {
        if (this.mNativeInst != -1) {
            testBindingUdp3(this.mNativeInst);
        }
    }

    public void testServiceReceive(String str, int i, String str2) {
        if (this.mNativeInst != -1) {
            serviceReceive(str, i, str2);
        }
    }

    public void update(long j) {
        if (this.mNativeInst != -1) {
            updateNativeInterface(this.mNativeInst, j);
        }
    }
}
