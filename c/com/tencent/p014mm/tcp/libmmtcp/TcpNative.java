package com.tencent.p014mm.tcp.libmmtcp;

/* renamed from: com.tencent.mm.tcp.libmmtcp.TcpNative */
public class TcpNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_TCP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static int SEND_BUFFER_ERROR = -1003;
    public static String TAG = "TcpNative";
    private boolean initCallBackFlag = false;
    public volatile long mNativeInst = 0;

    /* renamed from: com.tencent.mm.tcp.libmmtcp.TcpNative$NativeCallBackInterface */
    public interface NativeCallBackInterface {
        void onCallBack(long j, String str);
    }

    public TcpNative(long j, long j2, long j3) {
        this.mNativeInst = initBindingTcp(j, j2, j3);
    }

    private native void destoryBindingTcp(long j);

    private native long initBindingTcp(long j, long j2, long j3);

    private native int initCallBack(long j, NativeCallBackInterface nativeCallBackInterface);

    private native void serviceReceive(String str, int i, String str2);

    private native void testBindingTcp(long j);

    private native void testBindingTcp2(long j);

    private native void testBindingTcpServer(long j);

    private native void updateNativeInterface(long j, long j2);

    public void destoryTcp() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingTcp(this.mNativeInst);
            this.mNativeInst = -1;
        }
    }

    public int setCallBack(final NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_TCP_ERROR;
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
            testBindingTcp(this.mNativeInst);
        }
    }

    public void testBind2() {
        if (this.mNativeInst != -1) {
            testBindingTcp(this.mNativeInst);
        }
    }

    public void testBindServer() {
        if (this.mNativeInst != -1) {
            testBindingTcpServer(this.mNativeInst);
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
