package com.tencent.mars.p468mm;

import com.tencent.p014mm.network.C40384w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mars.mm.MMLiveSpeedTestInterfaces */
public class MMLiveSpeedTestInterfaces {
    private static final String TAG = "MMLiveSpeedTestInterfaces";
    private static MMLiveSpeedTestInterfaces mInstance;
    private static Map<Integer, C40384w> speedTestCallbackMap = new HashMap();
    private static int speedTestTaskId = 1;

    /* renamed from: com.tencent.mars.mm.MMLiveSpeedTestInterfaces$LiveSpeedTestResult */
    public static class LiveSpeedTestResult {
        public float averagePingRtt = 0.0f;
        public int avgDownloadSpeed = 0;
        public int avgUploadSpeed = 0;
        public boolean downloadSuccessful = false;
        public int maxDownloadSpeed = 0;
        public int maxUploadSpeed = 0;
        public int minDownloadSpeed = 0;
        public int minUploadSpeed = 0;
        public boolean onlyUploadDone = false;
        public float pingJitter = 0.0f;
        public boolean pingRttSuccessful = false;
        public int taskId = 0;
        public boolean uploadSuccessful = false;
    }

    /* renamed from: com.tencent.mars.mm.MMLiveSpeedTestInterfaces$SpeedTestCtx */
    public static class SpeedTestCtx {
        public byte[] downloadCtx = null;
        public byte[] uploadCtx = null;
    }

    private MMLiveSpeedTestInterfaces() {
    }

    public static synchronized MMLiveSpeedTestInterfaces getInstance() {
        MMLiveSpeedTestInterfaces mMLiveSpeedTestInterfaces;
        synchronized (MMLiveSpeedTestInterfaces.class) {
            if (mInstance == null) {
                mInstance = new MMLiveSpeedTestInterfaces();
            }
            mMLiveSpeedTestInterfaces = mInstance;
        }
        return mMLiveSpeedTestInterfaces;
    }

    public int doLiveSpeedTest(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar) {
        int i5;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C40384w wVar2 = wVar;
        boolean z = false;
        if (wVar2 == null || bArr3 == null || bArr4 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("speed test callback is null ");
            sb.append(wVar2 == null);
            sb.append(" ");
            sb.append(bArr3 == null);
            sb.append(" ");
            if (bArr4 == null) {
                z = true;
            }
            sb.append(z);
            Log.m105920e(TAG, sb.toString());
            return -1;
        }
        synchronized (MMLiveSpeedTestInterfaces.class) {
            i5 = speedTestTaskId;
            speedTestTaskId = i5 + 1;
            speedTestCallbackMap.put(Integer.valueOf(i5), wVar2);
        }
        Log.m105924i(TAG, "start speed test " + str + " " + bArr3.length + " " + bArr4.length + " id is " + i5);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("ctx is ");
        sb4.append(new String(bArr3));
        sb4.append(" download ");
        sb4.append(new String(bArr4));
        Log.m105918d(TAG, sb4.toString());
        SpeedTestCtx speedTestCtx = new SpeedTestCtx();
        speedTestCtx.uploadCtx = bArr3;
        speedTestCtx.downloadCtx = bArr4;
        MMLogic.doLiveSpeedTest(str, i, i2, i3, i4, speedTestCtx, i5);
        return 0;
    }

    public void onLiveSpeedTestCallback(LiveSpeedTestResult liveSpeedTestResult, boolean z) {
        C40384w wVar;
        LiveSpeedTestResult liveSpeedTestResult2 = liveSpeedTestResult;
        boolean z2 = z;
        Class<MMLiveSpeedTestInterfaces> cls = MMLiveSpeedTestInterfaces.class;
        Log.m105924i(TAG, "receive onSpeedTestUploadDone " + z2 + " id " + liveSpeedTestResult2.taskId);
        synchronized (cls) {
            wVar = speedTestCallbackMap.get(Integer.valueOf(liveSpeedTestResult2.taskId));
        }
        if (wVar == null) {
            Log.m105920e(TAG, "speed test callback is null");
            return;
        }
        if (!z2) {
            try {
                wVar.mo62839pB(liveSpeedTestResult2.pingRttSuccessful, liveSpeedTestResult2.averagePingRtt, liveSpeedTestResult2.pingJitter, liveSpeedTestResult2.uploadSuccessful, liveSpeedTestResult2.avgUploadSpeed, liveSpeedTestResult2.minUploadSpeed, liveSpeedTestResult2.maxUploadSpeed);
            } catch (Exception e) {
                try {
                    Log.m105920e(TAG, "error " + e.toString());
                    if (z2) {
                        synchronized (cls) {
                            speedTestCallbackMap.remove(Integer.valueOf(liveSpeedTestResult2.taskId));
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (z2) {
                        synchronized (cls) {
                            speedTestCallbackMap.remove(Integer.valueOf(liveSpeedTestResult2.taskId));
                        }
                    }
                    throw th;
                }
            }
        } else {
            wVar.mo62838Yt(liveSpeedTestResult2.pingRttSuccessful, liveSpeedTestResult2.averagePingRtt, liveSpeedTestResult2.pingJitter, liveSpeedTestResult2.uploadSuccessful, liveSpeedTestResult2.avgUploadSpeed, liveSpeedTestResult2.minUploadSpeed, liveSpeedTestResult2.maxUploadSpeed, liveSpeedTestResult2.downloadSuccessful, liveSpeedTestResult2.avgDownloadSpeed, liveSpeedTestResult2.minDownloadSpeed, liveSpeedTestResult2.maxDownloadSpeed);
        }
        if (z2) {
            synchronized (cls) {
                speedTestCallbackMap.remove(Integer.valueOf(liveSpeedTestResult2.taskId));
            }
        }
    }
}
