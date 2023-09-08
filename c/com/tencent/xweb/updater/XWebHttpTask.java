package com.tencent.xweb.updater;

import android.os.AsyncTask;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import java.util.Timer;
import java.util.TimerTask;
import org.xwalk.core.XWalkEnvironment;

public class XWebHttpTask extends AsyncTask<ParaIn, Progress, ResultOut> {
    public static final int ERR_CLOSE_EXCEPTION = -10003;
    public static final int ERR_EXCEPTION = -10002;
    public static final int ERR_INVALID_PARA = -10001;
    public static final int ERR_INVALID_PARA_IN_BG = -10004;
    public static final int ERR_INVALID_RESPONSE = -10005;
    public static final int ERR_PARSE_CONFIG_FAIL = -10006;
    public static final int ERR_TASK_SUCCESS = 0;
    private static final int MAX_RETRY_TIMES = 2;
    private static final long RETRY_INTERVAL = 3000;
    private static final String TAG = "XWebHttpTask";
    /* access modifiers changed from: private */
    public IXWebHttpTaskCallback mCallback = null;
    /* access modifiers changed from: private */
    public ParaIn mPara = null;
    /* access modifiers changed from: private */
    public int mRetrytimes = 0;
    private long mStartTs = 0;
    private Timer mTimer = null;

    public static class ParaIn {
        public String mFilePath;
        public String mUrl;
        public boolean mUseHttps;
    }

    public static class Progress {
        public long mCurSize;
        public long mTotalSize;
        public String mUrl;
    }

    public static class ResultOut {
        public long mCostTime;
        public String mErrMsg;
        public String mFilePath;
        public int mIsResume;
        public int mNetWorkType;
        public int mRetCode;
        public int mRetryTimes;
        public long mTotalSize;
        public String mUrl;
    }

    public static void addNewTask(ParaIn paraIn, IXWebHttpTaskCallback iXWebHttpTaskCallback) {
        XWebHttpTask xWebHttpTask = new XWebHttpTask();
        xWebHttpTask.mCallback = iXWebHttpTaskCallback;
        xWebHttpTask.mPara = paraIn;
        xWebHttpTask.mRetrytimes = 0;
        xWebHttpTask.mStartTs = System.currentTimeMillis();
        xWebHttpTask.execute(new ParaIn[]{xWebHttpTask.mPara});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r4 = r4.mRetCode;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean canRetry(com.tencent.xweb.updater.XWebHttpTask.ResultOut r4) {
        /*
            r3 = this;
            int r0 = r3.mRetrytimes
            r1 = 0
            r2 = 2
            if (r0 < r2) goto L_0x0007
            return r1
        L_0x0007:
            int r4 = r4.mRetCode
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            if (r4 == r0) goto L_0x0012
            r0 = -10004(0xffffffffffffd8ec, float:NaN)
            if (r4 == r0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.XWebHttpTask.canRetry(com.tencent.xweb.updater.XWebHttpTask$ResultOut):boolean");
    }

    private String getHttpUserAgent() {
        StringBuilder sb = new StringBuilder();
        sb.append("XWebSdk/" + XWebSdk.getXWebSdkVersion() + " ");
        sb.append("XWebApk/" + XWalkEnvironment.getInstalledNewstVersionForCurAbi() + " ");
        sb.append("XWebGrayValue/" + XWebGrayValueUtil.getGrayValue() + " ");
        sb.append("XWebTodayGrayValue/" + XWebGrayValueUtil.getTodayGrayValue() + " ");
        sb.append("XWebGrayValue2/" + XWebGrayValueUtil.getUserId() + " ");
        sb.append("ABI/" + AbiUtil.getRuntimeAbi() + " ");
        sb.append("APPINFO/dump (" + XWalkEnvironment.dumpAppInfo() + ") ");
        sb.append("ProcessName/" + XWalkEnvironment.getProcessName() + " ");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static void redoTask(ParaIn paraIn, IXWebHttpTaskCallback iXWebHttpTaskCallback, int i) {
        XWebHttpTask xWebHttpTask = new XWebHttpTask();
        xWebHttpTask.mCallback = iXWebHttpTaskCallback;
        xWebHttpTask.mPara = paraIn;
        xWebHttpTask.mRetrytimes = i;
        xWebHttpTask.mStartTs = System.currentTimeMillis();
        xWebHttpTask.execute(new ParaIn[]{xWebHttpTask.mPara});
    }

    private void retryTask() {
        this.mRetrytimes++;
        XWebLog.addInitializeLog(TAG, "task retry! mRetrytimes = " + this.mRetrytimes);
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.schedule(new TimerTask() {
            public void run() {
                XWebLog.addInitializeLog(XWebHttpTask.TAG, "task retry execute! mRetrytimes = " + XWebHttpTask.this.mRetrytimes);
                XWebHttpTask.redoTask(XWebHttpTask.this.mPara, XWebHttpTask.this.mCallback, XWebHttpTask.this.mRetrytimes);
                XWebHttpTask.this.stopTimer();
            }
        }, ((long) this.mRetrytimes) * RETRY_INTERVAL);
    }

    /* access modifiers changed from: private */
    public void stopTimer() {
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer = null;
        }
    }

    public void onPreExecute() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.tencent.xweb.updater.XWebHttpTask$ResultOut] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a2 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017d A[SYNTHETIC, Splitter:B:93:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0185 A[Catch:{ IOException -> 0x0181 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.updater.XWebHttpTask.ResultOut doInBackground(com.tencent.xweb.updater.XWebHttpTask.ParaIn... r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "task close failed, error:"
            r3 = 0
            if (r0 != 0) goto L_0x000b
            return r3
        L_0x000b:
            int r4 = r0.length
            r5 = 1
            if (r4 == r5) goto L_0x0010
            return r3
        L_0x0010:
            r4 = 0
            r0 = r0[r4]
            if (r0 != 0) goto L_0x0016
            return r3
        L_0x0016:
            com.tencent.xweb.updater.IXWebHttpTaskCallback r6 = r1.mCallback
            if (r6 == 0) goto L_0x001d
            r6.onTaskStarted()
        L_0x001d:
            com.tencent.xweb.updater.XWebHttpTask$ResultOut r6 = new com.tencent.xweb.updater.XWebHttpTask$ResultOut
            r6.<init>()
            java.lang.String r7 = r0.mUrl
            r6.mUrl = r7
            java.lang.String r7 = r0.mFilePath
            r6.mFilePath = r7
            r6.mRetCode = r4
            java.lang.String r7 = ""
            r6.mErrMsg = r7
            int r7 = r1.mRetrytimes
            r6.mRetryTimes = r7
            r7 = 0
            r6.mCostTime = r7
            r6.mTotalSize = r7
            r6.mIsResume = r4
            android.content.Context r9 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            int r9 = com.tencent.xweb.util.NetworkUtil.getCurrentNetWorkStatus(r9)
            r6.mNetWorkType = r9
            java.lang.String r9 = r0.mUrl
            java.lang.String r10 = "XWebHttpTask"
            if (r9 == 0) goto L_0x01d2
            java.lang.String r11 = r0.mFilePath
            if (r11 == 0) goto L_0x01d2
            int r9 = r9.length()
            if (r9 == 0) goto L_0x01d2
            java.lang.String r9 = r0.mFilePath
            int r9 = r9.length()
            if (r9 == 0) goto L_0x01d2
            com.tencent.xweb.updater.IXWebHttpTaskCallback r9 = r1.mCallback
            if (r9 != 0) goto L_0x0064
            goto L_0x01d2
        L_0x0064:
            r9 = -10003(0xffffffffffffd8ed, float:NaN)
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x016d }
            java.lang.String r12 = r0.mUrl     // Catch:{ all -> 0x016d }
            r11.<init>(r12)     // Catch:{ all -> 0x016d }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ all -> 0x016d }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x016d }
            java.lang.String r12 = "GET"
            r11.setRequestMethod(r12)     // Catch:{ all -> 0x0169 }
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = r17.getHttpUserAgent()     // Catch:{ all -> 0x0169 }
            r11.setRequestProperty(r12, r13)     // Catch:{ all -> 0x0169 }
            r12 = 8000(0x1f40, float:1.121E-41)
            r11.setConnectTimeout(r12)     // Catch:{ all -> 0x0169 }
            r11.setReadTimeout(r12)     // Catch:{ all -> 0x0169 }
            int r12 = r11.getResponseCode()     // Catch:{ all -> 0x0169 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 != r13) goto L_0x0120
            java.io.InputStream r12 = r11.getInputStream()     // Catch:{ all -> 0x0169 }
            int r13 = r11.getContentLength()     // Catch:{ all -> 0x011d }
            java.lang.String r14 = r0.mFilePath     // Catch:{ all -> 0x011d }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x011d }
            r15.<init>(r14)     // Catch:{ all -> 0x011d }
            boolean r16 = r15.exists()     // Catch:{ all -> 0x011d }
            if (r16 == 0) goto L_0x00a9
            r15.delete()     // Catch:{ all -> 0x011d }
        L_0x00a9:
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ all -> 0x011d }
            r15.<init>(r14)     // Catch:{ all -> 0x011d }
            r14 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0119 }
            com.tencent.xweb.updater.XWebHttpTask$Progress r7 = new com.tencent.xweb.updater.XWebHttpTask$Progress     // Catch:{ all -> 0x0119 }
            r7.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.mUrl     // Catch:{ all -> 0x0119 }
            r7.mUrl = r0     // Catch:{ all -> 0x0119 }
            long r4 = (long) r13     // Catch:{ all -> 0x0119 }
            r7.mTotalSize = r4     // Catch:{ all -> 0x0119 }
            r4 = 0
        L_0x00c0:
            int r0 = r12.read(r14)     // Catch:{ all -> 0x0119 }
            r8 = -1
            if (r0 == r8) goto L_0x0109
            boolean r8 = r17.isCancelled()     // Catch:{ all -> 0x0119 }
            if (r8 == 0) goto L_0x00f0
            r12.close()     // Catch:{ all -> 0x0119 }
            r15.close()     // Catch:{ IOException -> 0x00da }
            r12.close()     // Catch:{ IOException -> 0x00da }
            r11.disconnect()
            return r3
        L_0x00da:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r10, r0)
            r6.mRetCode = r9
            return r6
        L_0x00f0:
            r8 = r10
            long r9 = (long) r0
            long r4 = r4 + r9
            r9 = 0
            r15.write(r14, r9, r0)     // Catch:{ all -> 0x0117 }
            r7.mCurSize = r4     // Catch:{ all -> 0x0117 }
            if (r13 <= 0) goto L_0x0104
            r0 = 1
            com.tencent.xweb.updater.XWebHttpTask$Progress[] r10 = new com.tencent.xweb.updater.XWebHttpTask.Progress[r0]     // Catch:{ all -> 0x0117 }
            r10[r9] = r7     // Catch:{ all -> 0x0117 }
            r1.publishProgress(r10)     // Catch:{ all -> 0x0117 }
            goto L_0x0105
        L_0x0104:
            r0 = 1
        L_0x0105:
            r10 = r8
            r9 = -10003(0xffffffffffffd8ed, float:NaN)
            goto L_0x00c0
        L_0x0109:
            r8 = r10
            r6.mTotalSize = r4     // Catch:{ all -> 0x0117 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0117 }
            long r9 = r1.mStartTs     // Catch:{ all -> 0x0117 }
            long r3 = r3 - r9
            r6.mCostTime = r3     // Catch:{ all -> 0x0117 }
            r3 = r15
            goto L_0x0139
        L_0x0117:
            r0 = move-exception
            goto L_0x011b
        L_0x0119:
            r0 = move-exception
            r8 = r10
        L_0x011b:
            r3 = r15
            goto L_0x0171
        L_0x011d:
            r0 = move-exception
            r8 = r10
            goto L_0x0171
        L_0x0120:
            r8 = r10
            r0 = -10005(0xffffffffffffd8eb, float:NaN)
            r6.mRetCode = r0     // Catch:{ all -> 0x0167 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0167 }
            r0.<init>()     // Catch:{ all -> 0x0167 }
            java.lang.String r4 = "responseCode "
            r0.append(r4)     // Catch:{ all -> 0x0167 }
            r0.append(r12)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0167 }
            r6.mErrMsg = r0     // Catch:{ all -> 0x0167 }
            r12 = r3
        L_0x0139:
            r11.disconnect()     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0144
            r3.close()     // Catch:{ IOException -> 0x0142 }
            goto L_0x0144
        L_0x0142:
            r0 = move-exception
            goto L_0x014a
        L_0x0144:
            if (r12 == 0) goto L_0x0161
            r12.close()     // Catch:{ IOException -> 0x0142 }
            goto L_0x0161
        L_0x014a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r8, r0)
            r2 = -10003(0xffffffffffffd8ed, float:NaN)
            r6.mRetCode = r2
            return r6
        L_0x0161:
            r11.disconnect()
            return r6
        L_0x0165:
            r0 = move-exception
            goto L_0x0171
        L_0x0167:
            r0 = move-exception
            goto L_0x016b
        L_0x0169:
            r0 = move-exception
            r8 = r10
        L_0x016b:
            r12 = r3
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            r8 = r10
            r11 = r3
            r12 = r11
        L_0x0171:
            java.lang.String r4 = "task failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r8, r4, r0)     // Catch:{ all -> 0x01a6 }
            r0 = -10002(0xffffffffffffd8ee, float:NaN)
            r6.mRetCode = r0     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x0183
            r3.close()     // Catch:{ IOException -> 0x0181 }
            goto L_0x0183
        L_0x0181:
            r0 = move-exception
            goto L_0x0189
        L_0x0183:
            if (r12 == 0) goto L_0x01a0
            r12.close()     // Catch:{ IOException -> 0x0181 }
            goto L_0x01a0
        L_0x0189:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r8, r0)
            r2 = -10003(0xffffffffffffd8ed, float:NaN)
            r6.mRetCode = r2
            return r6
        L_0x01a0:
            if (r11 == 0) goto L_0x01a5
            r11.disconnect()
        L_0x01a5:
            return r6
        L_0x01a6:
            r0 = move-exception
            if (r3 == 0) goto L_0x01af
            r3.close()     // Catch:{ IOException -> 0x01ad }
            goto L_0x01af
        L_0x01ad:
            r0 = move-exception
            goto L_0x01b5
        L_0x01af:
            if (r12 == 0) goto L_0x01cc
            r12.close()     // Catch:{ IOException -> 0x01ad }
            goto L_0x01cc
        L_0x01b5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r8, r0)
            r2 = -10003(0xffffffffffffd8ed, float:NaN)
            r6.mRetCode = r2
            return r6
        L_0x01cc:
            if (r11 == 0) goto L_0x01d1
            r11.disconnect()
        L_0x01d1:
            throw r0
        L_0x01d2:
            r8 = r10
            java.lang.String r0 = "invalid params"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r8, r0)
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            r6.mRetCode = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.XWebHttpTask.doInBackground(com.tencent.xweb.updater.XWebHttpTask$ParaIn[]):com.tencent.xweb.updater.XWebHttpTask$ResultOut");
    }

    public void onPostExecute(ResultOut resultOut) {
        if (resultOut == null) {
            resultOut = new ResultOut();
            resultOut.mRetCode = -10004;
            XWebLog.addInitializeLog(TAG, "invalid params para onPostExecute");
        }
        if (resultOut.mRetCode == 0) {
            XWebLog.addInitializeLog(TAG, "task succeed!");
            this.mCallback.onTaskSucceed(resultOut);
            return;
        }
        XWebLog.addInitializeLog(TAG, "task failed! mRetCode = " + resultOut.mRetCode + " mRetrytimes = " + this.mRetrytimes);
        if (canRetry(resultOut)) {
            retryTask();
        } else {
            this.mCallback.onTaskFailed(resultOut);
        }
    }

    public void onProgressUpdate(Progress... progressArr) {
        if (progressArr.length == 1) {
            this.mCallback.onTaskProgressChanged(progressArr[0]);
        }
    }
}
