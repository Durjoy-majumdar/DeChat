package com.tencent.mars.stn;

import com.tencent.mars.Mars;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StnLogic {
    public static final int CONNECTED = 4;
    public static final int CONNECTTING = 3;
    public static int ECHECK_NEVER = 2;
    public static int ECHECK_NEXT = 1;
    public static int ECHECK_NOW = 0;
    public static final int GATEWAY_FAILED = 1;
    public static final int INVALID_TASK_ID = -1;
    public static final int NETWORK_UNAVAILABLE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static int RESP_FAIL_HANDLE_DEFAULT = -1;
    public static int RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH = -3800;
    public static int RESP_FAIL_HANDLE_NORMAL = 0;
    public static int RESP_FAIL_HANDLE_SESSION_TIMEOUT = -13;
    public static int RESP_FAIL_HANDLE_TASK_END = -14;
    public static final int SERVER_DOWN = 5;
    public static final int SERVER_FAILED = 2;
    private static final String TAG = "mars.StnLogic";
    private static ICallBack callBack = null;
    public static final int ectCancel = 10;
    public static final int ectDial = 2;
    public static final int ectDns = 3;
    public static final int ectEnDecode = 7;
    public static final int ectFalse = 1;
    public static final int ectHttp = 5;
    public static final int ectLocal = 9;
    public static final int ectNetMsgXP = 6;
    public static final int ectOK = 0;
    public static final int ectServer = 8;
    public static final int ectSocket = 4;

    public static class CgiProfile {
        public int channelType = 0;
        public long connectSuccessfulTime = 0;
        public long handshakeSuccessfulTime = 0;
        public int protocolType = 0;
        public long readPacketFinishedTime = 0;
        public long rtt = 0;
        public long startConnectTime = 0;
        public long startHandshakeTime = 0;
        public long startReadPacketTime = 0;
        public long startSendPacketTime = 0;
        public long taskStartTime = 0;
    }

    public interface ICallBack {
        public static final int BaseNetDetectEnd = 2;
        public static final int DetectConnectFail = 1;
        public static final int DetectConnectOK = 0;
        public static final int DetectEnd = 4;
        public static final int DetectLongLinkEnd = 0;
        public static final int DetectNotStart = 3;
        public static final int DetectShortLinkEnd = 1;
        public static final int DetectTimeout = 2;

        int buf2Resp(int i, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i2);

        int getLongLinkIdentifyCheckBuffer(String str, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr);

        boolean isLogoned();

        boolean makesureAuthed(String str);

        void networkAnalysisCallBack(int i, int i2, boolean z, String str);

        boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2);

        String[] onNewDns(String str);

        void onPush(String str, int i, int i2, byte[] bArr);

        int onTaskEnd(int i, Object obj, int i2, int i3, CgiProfile cgiProfile);

        void reportConnectInfo(int i, int i2);

        boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i2, String str);

        void requestDoSync();

        String[] requestNetCheckShortLinkHosts();
    }

    static {
        ArrayList<String> arrayList;
        try {
            arrayList = getLoadLibraries();
        } catch (UnsatisfiedLinkError unused) {
            Mars.loadDefaultMarsLibrary();
            arrayList = null;
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    private static int buf2Resp(int i, Object obj, byte[] bArr, int[] iArr, int i2) {
        return 0;
    }

    private static int buf2Resp(int i, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i2) {
        ICallBack iCallBack = callBack;
        return iCallBack == null ? RESP_FAIL_HANDLE_TASK_END : iCallBack.buf2Resp(i, obj, bArr, iArr, iArr2, i2);
    }

    public static native void clearTask();

    private static String exception2String(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static native int genTaskID();

    private static native ArrayList<String> getLoadLibraries();

    private static int getLongLinkIdentifyCheckBuffer(String str, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        ICallBack iCallBack = callBack;
        return iCallBack == null ? ECHECK_NEVER : iCallBack.getLongLinkIdentifyCheckBuffer(str, byteArrayOutputStream, byteArrayOutputStream2, iArr);
    }

    public static native boolean hasTask(int i);

    public static boolean isLogoned() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.isLogoned();
    }

    public static native void keepSignalling();

    private static boolean makesureAuthed(String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.makesureAuthed(str);
    }

    public static native void makesureLongLinkConnected();

    private static void networkAnalysisCallBack(int i, int i2, boolean z, String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.networkAnalysisCallBack(i, i2, z, str);
        }
    }

    private static boolean onLongLinkIdentifyResp(String str, byte[] bArr, byte[] bArr2) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.onLongLinkIdentifyResp(str, bArr, bArr2);
    }

    private static String[] onNewDns(String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.onNewDns(str);
    }

    private static void onPush(String str, int i, int i2, byte[] bArr) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.onPush(str, i, i2, bArr);
        }
    }

    private static int onTaskEnd(int i, Object obj, int i2, int i3, CgiProfile cgiProfile) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return 0;
        }
        return iCallBack.onTaskEnd(i, obj, i2, i3, cgiProfile);
    }

    public static native void redoTask();

    private static void reportConnectStatus(int i, int i2) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.reportConnectInfo(i, i2);
        }
    }

    private static void reportTaskProfile(String str) {
    }

    private static boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i2, String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.req2Buf(i, obj, byteArrayOutputStream, iArr, i2, str);
    }

    public static void requestDoSync() {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.requestDoSync();
        }
    }

    private static String[] requestNetCheckShortLinkHosts() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.requestNetCheckShortLinkHosts();
    }

    public static native void reset();

    public static native void resetAndInitEncoderVersion(int i);

    public static native void setBackupIPs(String str, String[] strArr);

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setDebugIP(String str, String str2);

    public static void setLonglinkSvrAddr(String str, int[] iArr) {
        setLonglinkSvrAddr(str, iArr, (String) null);
    }

    public static native void setLonglinkSvrAddr(String str, int[] iArr, String str2);

    public static native void setProductID(short s);

    public static void setShortlinkSvrAddr(int i) {
        setShortlinkSvrAddr(i, (String) null);
    }

    public static native void setShortlinkSvrAddr(int i, String str);

    public static native void setSignallingStrategy(long j, long j2);

    public static native boolean startNetworkAnalysis();

    public static native void startTask(Task task);

    public static native void stopSignalling();

    public static native void stopTask(int i);

    public static native void touchTasks();

    private static void trafficData(int i, int i2) {
    }

    public static class Task {
        public static final int EBoth = 3;
        public static final int EFAST = 1;
        public static final int ELong = 2;
        public static final int ENORMAL = 0;
        public static final int EShort = 1;
        public static final int ETASK_PRIORITY_0 = 0;
        public static final int ETASK_PRIORITY_1 = 1;
        public static final int ETASK_PRIORITY_2 = 2;
        public static final int ETASK_PRIORITY_3 = 3;
        public static final int ETASK_PRIORITY_4 = 4;
        public static final int ETASK_PRIORITY_5 = 5;
        public static final int ETASK_PRIORITY_HIGHEST = 0;
        public static final int ETASK_PRIORITY_LOWEST = 5;
        public static final int ETASK_PRIORITY_NORMAL = 3;
        public static final int ETransportProtocolQUIC = 2;
        public static final int ETransportProtocolTCP = 1;
        public String cgi;
        public int channelSelect;
        public int channelStrategy;
        public int cmdID;
        public Map<String, String> headers;
        public boolean limitFlow;
        public boolean limitFrequency;
        public boolean longPolling;
        public int longPollingTimeout;
        public boolean needAuthed;
        public boolean networkStatusSensitive;
        public int priority;
        public String reportArg;
        public int retryCount;
        public boolean sendOnly;
        public int serverProcessCost;
        public ArrayList<String> shortLinkHostList;
        public int taskID;
        public int totalTimeout;
        public Object userContext;

        public Task() {
            this.retryCount = -1;
            this.taskID = StnLogic.genTaskID();
            this.headers = new HashMap();
        }

        public Task(int i, int i2, String str, ArrayList<String> arrayList) {
            this.retryCount = -1;
            this.taskID = StnLogic.genTaskID();
            this.channelSelect = i;
            this.cmdID = i2;
            this.cgi = str;
            this.shortLinkHostList = arrayList;
            this.sendOnly = false;
            this.needAuthed = true;
            this.limitFlow = true;
            this.limitFrequency = true;
            this.channelStrategy = 0;
            this.networkStatusSensitive = false;
            this.priority = 3;
            this.retryCount = -1;
            this.serverProcessCost = 0;
            this.totalTimeout = 0;
            this.userContext = null;
            this.headers = new HashMap();
            this.longPolling = false;
            this.longPollingTimeout = 0;
        }
    }
}
