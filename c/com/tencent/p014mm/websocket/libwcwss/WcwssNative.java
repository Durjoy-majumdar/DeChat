package com.tencent.p014mm.websocket.libwcwss;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative */
public class WcwssNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_WCWSS_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static String TAG = "WcwssNative";
    private volatile boolean initCallBackFlag = false;
    private volatile long mNativeInst = 0;
    private volatile String mStrNativeInst = "0";

    /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssReportListener */
    public interface IWcWssReportListener {
        int getNetworkType();

        void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3);

        void onKvStat(int i, String str);
    }

    /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssWebSocketListener */
    public interface IWcWssWebSocketListener {

        /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssWebSocketListener$BindAndDnsReturn */
        public static class BindAndDnsReturn {
            public String hostIpStr;
            public int resultCode;
        }

        BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i, String str);

        int doCertificateVerify(String str, long j, String str2, byte[][] bArr);

        void onStateChange(String str, long j, int i);
    }

    private native void destoryBindingWcwss(long j);

    private native void doOnRunningStateWcwss(String str, long j);

    private native long initBindingWcwss(long j, long j2, long j3);

    private native int initCallBack(long j, IWcWssWebSocketListener iWcWssWebSocketListener, IWcWssReportListener iWcWssReportListener);

    private native void initConfigWcwss(String str, long j, HashMap<String, String> hashMap);

    private native void initConfigWhiteBlackList(String str, long j, ArrayList<String> arrayList, ArrayList<String> arrayList2);

    private native void testBindingWcwss(long j);

    private native void updateNativeInterface(String str, long j, long j2, int i);

    public void destoryWcwss() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingWcwss(this.mNativeInst);
            this.mNativeInst = -1;
        }
    }

    public void doOnRunningState() {
        doOnRunningStateWcwss(this.mStrNativeInst, this.mNativeInst);
    }

    public void initConfig(HashMap<String, String> hashMap) {
        initConfigWcwss(this.mStrNativeInst, this.mNativeInst, hashMap);
    }

    public void initConfigWhiteBlack(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        initConfigWhiteBlackList(this.mStrNativeInst, this.mNativeInst, arrayList, arrayList2);
    }

    public String initWcwss(long j, long j2, long j3) {
        this.mNativeInst = initBindingWcwss(j, j2, j3);
        this.mStrNativeInst = String.valueOf(this.mNativeInst);
        return this.mStrNativeInst;
    }

    public int setCallback(IWcWssWebSocketListener iWcWssWebSocketListener, IWcWssReportListener iWcWssReportListener) {
        if (this.mNativeInst == -1) {
            return NEW_WCWSS_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, iWcWssWebSocketListener, iWcWssReportListener);
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testBindWcwss(String str) {
        testBindingWcwss(Long.parseLong(str));
    }

    public void updateInterface(long j, int i) {
        updateNativeInterface(this.mStrNativeInst, this.mNativeInst, j, i);
    }
}
