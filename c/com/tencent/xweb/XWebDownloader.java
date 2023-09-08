package com.tencent.xweb;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.xweb.downloader.IWXFileDownloaderBridgeCallback;
import com.tencent.xweb.downloader.WXFileDownloaderBridge;
import com.tencent.xweb.updater.UpdateConfig;
import com.tencent.xweb.util.NetworkUtil;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import org.xwalk.core.XWalkEnvironment;

public class XWebDownloader {
    private static final int DOWNLOAD_FAILED = -1;
    private static final int DOWNLOAD_SUCCESS = 0;
    private static final int DOWNLOAD_TYPE_CDN = 2;
    private static final int DOWNLOAD_TYPE_HTTP = 1;
    private static final int ERROR_CODE_DOWNLOADER_TIMEOUT = -100;
    private static final int ERROR_CODE_EXCEPTION = -101;
    private static final int ERROR_CODE_FAILED = -1;
    private static final int ERROR_CODE_SUCCESS = 0;
    private static final int ERROR_TYPE_DOWNLOADER = 1;
    private static final int ERROR_TYPE_NONE = 0;
    private static final int ERROR_TYPE_USER = 2;
    private static final String TAG = "XWebDownloader";
    private static AsyncTask<Void, Integer, Integer> sDownloadTask;

    public static class DownloadInfo {
        public int mBizType = 0;
        public int mDownloadType = 1;
        public int mErrorCode = 0;
        public int mErrorType = 0;
        public long mFileTotalSize = 0;
        public boolean mIsDownloadResume = false;
        public boolean mIsRuntime = false;
        public int mNetWorkType = 0;
        public int mRetryTimes = 0;
        public String mSavePath = "";
        public long mStartTimestamp = 0;
        public String mUrl = "";
    }

    public static class HttpDownloadTask extends AsyncTask<Void, Integer, Integer> {
        public static final String TAG_TASK = "HttpDownloadTask";
        private static final int UPDATE_INTERVAL_MS = 500;
        private final DownloadInfo mDownloadInfo;
        private final File mDownloadedFile;
        private final XWebDownloadListener mListener;
        private long mProgressUpdateTime;

        public HttpDownloadTask(boolean z, XWebDownloadListener xWebDownloadListener, String str, String str2) {
            this.mListener = xWebDownloadListener;
            DownloadInfo downloadInfo = new DownloadInfo();
            this.mDownloadInfo = downloadInfo;
            downloadInfo.mErrorType = 0;
            downloadInfo.mErrorCode = 0;
            downloadInfo.mDownloadType = 1;
            downloadInfo.mUrl = str;
            downloadInfo.mSavePath = str2;
            downloadInfo.mIsRuntime = z;
            this.mDownloadedFile = new File(downloadInfo.mSavePath);
        }

        public void onPreExecute() {
            XWebDownloader.taskOnPreExecute(TAG_TASK, this.mDownloadInfo, this);
        }

        /* JADX WARNING: type inference failed for: r0v24, types: [java.net.URLConnection] */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r0 = java.lang.Integer.valueOf(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r7.close();
            r5.close();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01db A[Catch:{ IOException -> 0x01d7 }, DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01e0 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01f4 A[FINALLY_INSNS] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01d3 A[SYNTHETIC, Splitter:B:97:0x01d3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Void... r20) {
            /*
                r19 = this;
                r1 = r19
                com.tencent.xweb.XWebDownloadListener r0 = r1.mListener
                if (r0 == 0) goto L_0x000d
                com.tencent.xweb.XWebDownloader$DownloadInfo r2 = r1.mDownloadInfo
                int r2 = r2.mDownloadType
                r0.onDownloadStarted(r2)
            L_0x000d:
                com.tencent.xweb.XWebDownloader$DownloadInfo r0 = r1.mDownloadInfo
                long r2 = java.lang.System.currentTimeMillis()
                r0.mStartTimestamp = r2
                android.content.Context r0 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
                com.tencent.xweb.XWebDownloader$DownloadInfo r2 = r1.mDownloadInfo
                int r0 = com.tencent.xweb.util.NetworkUtil.getCurrentNetWorkStatus(r0)
                r2.mNetWorkType = r0
                r3 = -1
                java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x01c1 }
                com.tencent.xweb.XWebDownloader$DownloadInfo r4 = r1.mDownloadInfo     // Catch:{ all -> 0x01c1 }
                java.lang.String r4 = r4.mUrl     // Catch:{ all -> 0x01c1 }
                r0.<init>(r4)     // Catch:{ all -> 0x01c1 }
                java.net.URLConnection r4 = r0.openConnection()     // Catch:{ all -> 0x01c1 }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ all -> 0x01c1 }
                r5 = 30000(0x7530, float:4.2039E-41)
                r4.setConnectTimeout(r5)     // Catch:{ all -> 0x01be }
                r4.setReadTimeout(r5)     // Catch:{ all -> 0x01be }
                r4.connect()     // Catch:{ all -> 0x01be }
                int r6 = r4.getResponseCode()     // Catch:{ all -> 0x01be }
                java.lang.String r7 = " "
                java.lang.String r8 = "Server returned HTTP "
                r9 = 206(0xce, float:2.89E-43)
                r10 = 200(0xc8, float:2.8E-43)
                java.lang.String r11 = "HttpDownloadTask"
                if (r6 == r10) goto L_0x007a
                int r6 = r4.getResponseCode()     // Catch:{ all -> 0x01be }
                if (r6 == r9) goto L_0x007a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
                r0.<init>()     // Catch:{ all -> 0x01be }
                r0.append(r8)     // Catch:{ all -> 0x01be }
                int r5 = r4.getResponseCode()     // Catch:{ all -> 0x01be }
                r0.append(r5)     // Catch:{ all -> 0x01be }
                r0.append(r7)     // Catch:{ all -> 0x01be }
                java.lang.String r5 = r4.getResponseMessage()     // Catch:{ all -> 0x01be }
                r0.append(r5)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01be }
                com.tencent.xweb.util.XWebLog.m21909e(r11, r0)     // Catch:{ all -> 0x01be }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01be }
                r4.disconnect()
                return r0
            L_0x007a:
                int r6 = r4.getContentLength()     // Catch:{ all -> 0x01be }
                java.io.File r12 = r1.mDownloadedFile     // Catch:{ all -> 0x01be }
                boolean r12 = r12.exists()     // Catch:{ all -> 0x01be }
                r13 = 1
                r14 = 0
                r2 = 0
                if (r12 == 0) goto L_0x0136
                java.io.File r12 = r1.mDownloadedFile     // Catch:{ all -> 0x01be }
                long r9 = r12.length()     // Catch:{ all -> 0x01be }
                long r5 = (long) r6     // Catch:{ all -> 0x01be }
                int r17 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r17 != 0) goto L_0x00a3
                java.lang.String r0 = "same size in server, return success"
                com.tencent.xweb.util.XWebLog.m21911i(r11, r0)     // Catch:{ all -> 0x01be }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01be }
                r4.disconnect()
                return r0
            L_0x00a3:
                int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r5 <= 0) goto L_0x00b0
                com.tencent.xweb.XWebDownloader$DownloadInfo r5 = r1.mDownloadInfo     // Catch:{ all -> 0x01be }
                r5.mIsDownloadResume = r13     // Catch:{ all -> 0x01be }
                java.lang.String r5 = "http download resume"
                com.tencent.xweb.util.XWebLog.m21911i(r11, r5)     // Catch:{ all -> 0x01be }
            L_0x00b0:
                r4.disconnect()     // Catch:{ all -> 0x01be }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x01be }
                r5 = r0
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x01be }
                r0 = 30000(0x7530, float:4.2039E-41)
                r5.setConnectTimeout(r0)     // Catch:{ all -> 0x0132 }
                r5.setReadTimeout(r0)     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = "Range"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
                r4.<init>()     // Catch:{ all -> 0x0132 }
                java.lang.String r6 = "bytes="
                r4.append(r6)     // Catch:{ all -> 0x0132 }
                r4.append(r9)     // Catch:{ all -> 0x0132 }
                java.lang.String r6 = "-"
                r4.append(r6)     // Catch:{ all -> 0x0132 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0132 }
                r5.setRequestProperty(r0, r4)     // Catch:{ all -> 0x0132 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
                r0.<init>()     // Catch:{ all -> 0x0132 }
                java.lang.String r4 = "download range begin:"
                r0.append(r4)     // Catch:{ all -> 0x0132 }
                r0.append(r9)     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0132 }
                com.tencent.xweb.util.XWebLog.m21911i(r11, r0)     // Catch:{ all -> 0x0132 }
                r5.connect()     // Catch:{ all -> 0x0132 }
                int r0 = r5.getResponseCode()     // Catch:{ all -> 0x0132 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r0 == r4) goto L_0x012c
                int r0 = r5.getResponseCode()     // Catch:{ all -> 0x0132 }
                r4 = 206(0xce, float:2.89E-43)
                if (r0 == r4) goto L_0x012c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
                r0.<init>()     // Catch:{ all -> 0x0132 }
                r0.append(r8)     // Catch:{ all -> 0x0132 }
                int r2 = r5.getResponseCode()     // Catch:{ all -> 0x0132 }
                r0.append(r2)     // Catch:{ all -> 0x0132 }
                r0.append(r7)     // Catch:{ all -> 0x0132 }
                java.lang.String r2 = r5.getResponseMessage()     // Catch:{ all -> 0x0132 }
                r0.append(r2)     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0132 }
                com.tencent.xweb.util.XWebLog.m21909e(r11, r0)     // Catch:{ all -> 0x0132 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0132 }
                r5.disconnect()
                return r0
            L_0x012c:
                int r6 = r5.getContentLength()     // Catch:{ all -> 0x0132 }
                r4 = r5
                goto L_0x0137
            L_0x0132:
                r0 = move-exception
                r4 = r5
                goto L_0x01bf
            L_0x0136:
                r9 = r14
            L_0x0137:
                java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x01bb }
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b7 }
                java.io.File r0 = r1.mDownloadedFile     // Catch:{ all -> 0x01b7 }
                r7.<init>(r0, r13)     // Catch:{ all -> 0x01b7 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01b3 }
            L_0x0146:
                int r8 = r5.read(r0)     // Catch:{ all -> 0x01b3 }
                if (r8 == r3) goto L_0x0193
                boolean r11 = r19.isCancelled()     // Catch:{ all -> 0x01b3 }
                if (r11 == 0) goto L_0x0162
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0160 }
                r7.close()     // Catch:{ IOException -> 0x015c }
                r5.close()     // Catch:{ IOException -> 0x015c }
            L_0x015c:
                r4.disconnect()
                return r0
            L_0x0160:
                r0 = move-exception
                goto L_0x01b5
            L_0x0162:
                long r11 = (long) r8
                long r14 = r14 + r11
                r7.write(r0, r2, r8)     // Catch:{ all -> 0x01b3 }
                long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01b3 }
                r8 = r4
                long r3 = r1.mProgressUpdateTime     // Catch:{ all -> 0x01af }
                long r3 = r11 - r3
                r16 = 500(0x1f4, double:2.47E-321)
                int r18 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r18 <= 0) goto L_0x0190
                r1.mProgressUpdateTime = r11     // Catch:{ all -> 0x01af }
                r3 = 2
                java.lang.Integer[] r3 = new java.lang.Integer[r3]     // Catch:{ all -> 0x01af }
                long r11 = r14 + r9
                int r4 = (int) r11     // Catch:{ all -> 0x01af }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01af }
                r3[r2] = r4     // Catch:{ all -> 0x01af }
                long r11 = (long) r6     // Catch:{ all -> 0x01af }
                long r11 = r11 + r9
                int r4 = (int) r11     // Catch:{ all -> 0x01af }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01af }
                r3[r13] = r4     // Catch:{ all -> 0x01af }
                r1.publishProgress(r3)     // Catch:{ all -> 0x01af }
            L_0x0190:
                r4 = r8
                r3 = -1
                goto L_0x0146
            L_0x0193:
                r8 = r4
                r7.flush()     // Catch:{ all -> 0x01af }
                r7.close()     // Catch:{ IOException -> 0x019d }
                r5.close()     // Catch:{ IOException -> 0x019d }
            L_0x019d:
                r8.disconnect()
                com.tencent.xweb.XWebDownloader$DownloadInfo r0 = r1.mDownloadInfo
                java.io.File r3 = r1.mDownloadedFile
                long r3 = r3.length()
                r0.mFileTotalSize = r3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                return r0
            L_0x01af:
                r0 = move-exception
                r2 = r7
                r4 = r8
                goto L_0x01c5
            L_0x01b3:
                r0 = move-exception
                r8 = r4
            L_0x01b5:
                r2 = r7
                goto L_0x01c5
            L_0x01b7:
                r0 = move-exception
                r8 = r4
                r2 = 0
                goto L_0x01c5
            L_0x01bb:
                r0 = move-exception
                r8 = r4
                goto L_0x01bf
            L_0x01be:
                r0 = move-exception
            L_0x01bf:
                r2 = 0
                goto L_0x01c4
            L_0x01c1:
                r0 = move-exception
                r2 = 0
                r4 = 0
            L_0x01c4:
                r5 = 0
            L_0x01c5:
                java.lang.String r3 = "XWebDownloader"
                java.lang.String r6 = "download error"
                com.tencent.xweb.util.XWebLog.m21910e(r3, r6, r0)     // Catch:{ all -> 0x01e4 }
                r3 = -1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e4 }
                if (r2 == 0) goto L_0x01d9
                r2.close()     // Catch:{ IOException -> 0x01d7 }
                goto L_0x01d9
            L_0x01d7:
                goto L_0x01de
            L_0x01d9:
                if (r5 == 0) goto L_0x01de
                r5.close()     // Catch:{ IOException -> 0x01d7 }
            L_0x01de:
                if (r4 == 0) goto L_0x01e3
                r4.disconnect()
            L_0x01e3:
                return r0
            L_0x01e4:
                r0 = move-exception
                if (r2 == 0) goto L_0x01ed
                r2.close()     // Catch:{ IOException -> 0x01eb }
                goto L_0x01ed
            L_0x01eb:
                goto L_0x01f2
            L_0x01ed:
                if (r5 == 0) goto L_0x01f2
                r5.close()     // Catch:{ IOException -> 0x01eb }
            L_0x01f2:
                if (r4 == 0) goto L_0x01f7
                r4.disconnect()
            L_0x01f7:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.XWebDownloader.HttpDownloadTask.doInBackground(java.lang.Void[]):java.lang.Integer");
        }

        public void onCancelled(Integer num) {
            XWebDownloader.taskOnCancelled(this.mDownloadInfo, this.mListener, TAG_TASK);
        }

        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                this.mDownloadInfo.mErrorCode = 0;
            } else {
                this.mDownloadInfo.mErrorCode = -1;
            }
            XWebDownloader.taskOnPostExecute(this.mDownloadInfo, this.mListener, TAG_TASK, num);
        }

        public void onProgressUpdate(Integer... numArr) {
            XWebDownloader.taskOnProgressUpdate(this.mListener, numArr);
        }
    }

    public static class WXFileDownloaderTask extends AsyncTask<Void, Integer, Integer> implements IWXFileDownloaderBridgeCallback {
        public static final String TAG_TASK = "WXFileDownloaderTask";
        private final Object lockObj = new Object();
        private final DownloadInfo mDownloadInfo;
        private final XWebDownloadListener mListener;
        private final WXFileDownloaderBridge mWXFileDownloaderBridge;
        private boolean mWaitTimeout = false;

        public WXFileDownloaderTask(boolean z, XWebDownloadListener xWebDownloadListener, String str, String str2, int i) {
            this.mListener = xWebDownloadListener;
            DownloadInfo downloadInfo = new DownloadInfo();
            this.mDownloadInfo = downloadInfo;
            downloadInfo.mErrorType = 0;
            downloadInfo.mErrorCode = 0;
            downloadInfo.mDownloadType = 2;
            downloadInfo.mUrl = str;
            downloadInfo.mSavePath = str2;
            downloadInfo.mIsRuntime = z;
            downloadInfo.mBizType = i;
            WXFileDownloaderBridge wXFileDownloaderBridge = new WXFileDownloaderBridge();
            this.mWXFileDownloaderBridge = wXFileDownloaderBridge;
            wXFileDownloaderBridge.setCallback(this);
        }

        public boolean isValid() {
            WXFileDownloaderBridge wXFileDownloaderBridge = this.mWXFileDownloaderBridge;
            if (wXFileDownloaderBridge == null) {
                return false;
            }
            return wXFileDownloaderBridge.isValid();
        }

        public void onPreExecute() {
            XWebDownloader.taskOnPreExecute(TAG_TASK, this.mDownloadInfo, this);
        }

        public void onProgressChange(String str, long j, long j2) {
            DownloadInfo downloadInfo = this.mDownloadInfo;
            if (downloadInfo.mFileTotalSize != j2) {
                downloadInfo.mFileTotalSize = j2;
            }
            publishProgress(new Integer[]{Integer.valueOf((int) j), Integer.valueOf((int) j2)});
        }

        public void onTaskFail(String str, int i, boolean z) {
            synchronized (this.lockObj) {
                DownloadInfo downloadInfo = this.mDownloadInfo;
                downloadInfo.mErrorType = 1;
                downloadInfo.mErrorCode = i;
                downloadInfo.mIsDownloadResume = z;
                this.mWaitTimeout = false;
                this.lockObj.notify();
            }
        }

        public void onTaskFinish(String str, String str2, boolean z) {
            synchronized (this.lockObj) {
                this.mDownloadInfo.mIsDownloadResume = z;
                this.mWaitTimeout = false;
                this.lockObj.notify();
            }
        }

        public Integer doInBackground(Void... voidArr) {
            XWebDownloadListener xWebDownloadListener = this.mListener;
            if (xWebDownloadListener != null) {
                xWebDownloadListener.onDownloadStarted(this.mDownloadInfo.mDownloadType);
            }
            this.mDownloadInfo.mStartTimestamp = System.currentTimeMillis();
            Context applicationContext = XWalkEnvironment.getApplicationContext();
            this.mDownloadInfo.mNetWorkType = NetworkUtil.getCurrentNetWorkStatus(applicationContext);
            WXFileDownloaderBridge wXFileDownloaderBridge = this.mWXFileDownloaderBridge;
            if (wXFileDownloaderBridge == null || !wXFileDownloaderBridge.isValid()) {
                DownloadInfo downloadInfo = this.mDownloadInfo;
                downloadInfo.mErrorType = 2;
                downloadInfo.mErrorCode = -1;
                return -1;
            }
            WXFileDownloaderBridge wXFileDownloaderBridge2 = this.mWXFileDownloaderBridge;
            DownloadInfo downloadInfo2 = this.mDownloadInfo;
            if (wXFileDownloaderBridge2.startDownload(downloadInfo2.mUrl, downloadInfo2.mSavePath, downloadInfo2.mBizType) != 0) {
                DownloadInfo downloadInfo3 = this.mDownloadInfo;
                downloadInfo3.mErrorType = 1;
                downloadInfo3.mErrorCode = -1;
                return -1;
            }
            synchronized (this.lockObj) {
                try {
                    this.mWaitTimeout = true;
                    this.lockObj.wait(600000);
                } catch (InterruptedException e) {
                    XWebLog.m21910e(TAG_TASK, "download error", e);
                    this.mWaitTimeout = false;
                    DownloadInfo downloadInfo4 = this.mDownloadInfo;
                    downloadInfo4.mErrorType = 2;
                    downloadInfo4.mErrorCode = -101;
                }
                if (this.mWaitTimeout) {
                    DownloadInfo downloadInfo5 = this.mDownloadInfo;
                    downloadInfo5.mErrorType = 1;
                    downloadInfo5.mErrorCode = -100;
                }
                DownloadInfo downloadInfo6 = this.mDownloadInfo;
                if (downloadInfo6.mErrorType == 0 && downloadInfo6.mErrorCode == 0) {
                    return 0;
                }
                XWebLog.m21909e(TAG_TASK, "download errorType:" + this.mDownloadInfo.mErrorType + ", errorcode:" + this.mDownloadInfo.mErrorCode + ", waitTimeout:" + this.mWaitTimeout);
                return -1;
            }
        }

        public void onCancelled(Integer num) {
            XWebDownloader.taskOnCancelled(this.mDownloadInfo, this.mListener, TAG_TASK);
        }

        public void onPostExecute(Integer num) {
            XWebDownloader.taskOnPostExecute(this.mDownloadInfo, this.mListener, TAG_TASK, num);
        }

        public void onProgressUpdate(Integer... numArr) {
            XWebDownloader.taskOnProgressUpdate(this.mListener, numArr);
        }
    }

    public static boolean isDownloading() {
        return sDownloadTask instanceof HttpDownloadTask;
    }

    public static void startDownload(XWebDownloadListener xWebDownloadListener, UpdateConfig updateConfig) {
        if (XWebEmbedSetting.getForbidDownloadCode()) {
            XWebLog.m21913w(TAG, "startDownload, turn off dynamic code");
            return;
        }
        WXFileDownloaderTask wXFileDownloaderTask = new WXFileDownloaderTask(true, xWebDownloadListener, updateConfig.downUrl, updateConfig.getDownloadPath(), updateConfig.getUpdateBizType());
        if (!updateConfig.bUseCdn || !wXFileDownloaderTask.isValid()) {
            XWebLog.m21911i(TAG, "startDownload, use default file downloader");
            new HttpDownloadTask(true, xWebDownloadListener, updateConfig.downUrl, updateConfig.getDownloadPath()).execute(new Void[0]);
            return;
        }
        XWebLog.m21911i(TAG, "startDownload, use wx file downloader");
        wXFileDownloaderTask.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public static void taskOnCancelled(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str) {
        if (downloadInfo.mIsRuntime) {
            sDownloadTask = null;
            XWebLog.m21911i(str, "runtime onCancelled");
        } else {
            XWebLog.m21911i(str, "plugin onCancelled");
        }
        if (xWebDownloadListener != null) {
            xWebDownloadListener.onDownloadCancelled();
        }
    }

    /* access modifiers changed from: private */
    public static void taskOnPostExecute(DownloadInfo downloadInfo, XWebDownloadListener xWebDownloadListener, String str, Integer num) {
        if (downloadInfo.mIsRuntime) {
            sDownloadTask = null;
            XWebLog.m21911i(str, "runtime onPostExecute result:" + num);
        } else {
            XWebLog.m21911i(str, "plugin onPostExecute result:" + num);
        }
        if (num.intValue() == 0) {
            if (xWebDownloadListener != null) {
                xWebDownloadListener.onDownloadCompleted(downloadInfo);
            }
        } else if (xWebDownloadListener != null) {
            xWebDownloadListener.onDownloadFailed(downloadInfo);
        }
    }

    /* access modifiers changed from: private */
    public static void taskOnPreExecute(String str, DownloadInfo downloadInfo, AsyncTask<Void, Integer, Integer> asyncTask) {
        if (downloadInfo.mIsRuntime) {
            sDownloadTask = asyncTask;
            XWebLog.m21911i(str, "runtime onPreExecute, savePath:" + downloadInfo.mSavePath);
            return;
        }
        XWebLog.m21911i(str, "plugin onPreExecute, savePath:" + downloadInfo.mSavePath);
    }

    /* access modifiers changed from: private */
    public static void taskOnProgressUpdate(XWebDownloadListener xWebDownloadListener, Integer... numArr) {
        int i = 0;
        if (numArr[1].intValue() > 0) {
            i = (int) ((((double) numArr[0].intValue()) * 100.0d) / ((double) numArr[1].intValue()));
        }
        if (xWebDownloadListener != null) {
            xWebDownloadListener.onDownloadUpdated(i);
        }
    }
}
