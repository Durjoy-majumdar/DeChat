package com.tencent.tmassistantsdk.downloadservice;

import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class DownloadTask {
    public static final String TAG = "_DownloadTask";
    public DownloadInfo mDownloadInfo = null;
    public HttpClient mHttpClient = null;
    public HttpGet mHttpGet = null;
    private boolean mIsRedirect = false;
    public final byte[] mRecvBuf = new byte[4096];
    private String mRequestUrl;
    public TMAssistantFile mSaveFile;
    public boolean mStopTask = false;
    public final int mTaskId = GlobalUtil.getMemUUID();
    private String startDownloadNetType = "wifi";

    public DownloadTask(DownloadInfo downloadInfo) {
        this.mDownloadInfo = downloadInfo;
    }

    /* access modifiers changed from: private */
    public void cancelInWorkThread() {
        this.mStopTask = true;
        HttpGet httpGet = this.mHttpGet;
        if (httpGet != null && !httpGet.isAborted()) {
            this.mHttpGet.abort();
        }
    }

    private void handleResponseCode(HttpResponse httpResponse, DownloadChunkLogInfo downloadChunkLogInfo) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        TMLog.m164114i(TAG, "httpResponseCode = " + statusCode + " " + Thread.currentThread().getName());
        downloadChunkLogInfo.readHeaderTime = System.currentTimeMillis();
        downloadChunkLogInfo.responseHttpCode = statusCode;
        if (statusCode == 200 || statusCode == 206) {
            this.mDownloadInfo.mRetryCnt = 0;
        }
        if (statusCode == 200) {
            Header[] headers = httpResponse.getHeaders("Content-Type");
            if (headers != null && headers.length > 0) {
                if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
                    this.mDownloadInfo.mFileName = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
                } else {
                    String value = headers[0].getValue();
                    if (TextUtils.isEmpty(value) || !value.startsWith(MimeTypes.BASE_TYPE_TEXT)) {
                        renameApkFileName(httpResponse);
                    } else {
                        throw new StopRequestException(708, "Return contenttype = text " + Thread.currentThread().getName());
                    }
                }
            }
            onReceivedResponseData(httpResponse, downloadChunkLogInfo);
        } else if (statusCode != 206) {
            if (statusCode != 307) {
                if (statusCode == 416) {
                    throw new StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
                } else if (statusCode == 500) {
                    throw new StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
                } else if (statusCode != 503) {
                    switch (statusCode) {
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            throw new StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
                    }
                } else {
                    throw new StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
                }
            }
            if (this.mDownloadInfo.mRedirectCnt <= 5) {
                Header firstHeader = httpResponse.getFirstHeader(FirebaseAnalytics.C113379b.LOCATION);
                if (firstHeader != null) {
                    String value2 = firstHeader.getValue();
                    TMLog.m164114i(TAG, "jumpURL = " + value2);
                    if (DownloadHelper.isValidURL(value2)) {
                        this.mRequestUrl = DownloadHelper.correctURL(value2);
                        this.mIsRedirect = true;
                        this.mDownloadInfo.mRedirectCnt++;
                        return;
                    }
                    throw new StopRequestException(700, "Jump url is not valid. httpResponseCode = " + statusCode + " url: " + value2);
                }
                TMLog.m164113e(TAG, "location header is null. httpResponseCode = " + statusCode);
                throw new StopRequestException(702, "location header is null. httpResponseCode = " + statusCode);
            }
            TMLog.m164114i(TAG, "mRedirectCnt = " + this.mDownloadInfo.mRedirectCnt + ",MAX_REDIRESTS = " + 5);
            throw new StopRequestException(709, "Redirect cnt many times.");
        } else {
            if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
                this.mDownloadInfo.mFileName = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
            } else {
                renameApkFileName(httpResponse);
            }
            onReceivedResponseData(httpResponse, downloadChunkLogInfo);
        }
    }

    private void onDownloadError(Throwable th) {
        if (th != null) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0263, code lost:
        if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isSpaceEnough(com.tencent.tmassistantsdk.storage.TMAssistantFile.getSavePathRootDir(), r1.mDownloadInfo.getTotalSize()) == false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0269, code lost:
        if (com.tencent.tmassistantsdk.storage.TMAssistantFile.isSDCardExistAndCanWrite() == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x026b, code lost:
        r0 = "write file failed, fileName: " + r1.mDownloadInfo.mFileName + " receivedSize: " + r1.mDownloadInfo.mReceivedBytes + " readedSize: " + r3 + " totalSize: " + r1.mDownloadInfo.getTotalSize();
        com.tencent.tmassistantsdk.util.TMLog.m164116w(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02a6, code lost:
        throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(703, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02a7, code lost:
        r0 = "write file failed, no sdCard! fileName: " + r1.mDownloadInfo.mFileName + " receivedSize: " + r1.mDownloadInfo.mReceivedBytes + " readedSize: " + r3 + " totalSize: " + r1.mDownloadInfo.getTotalSize();
        com.tencent.tmassistantsdk.util.TMLog.m164116w(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02e2, code lost:
        throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(711, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02e3, code lost:
        r0 = "write file failed, no enough space! fileName: " + r1.mDownloadInfo.mFileName + " receivedSize: " + r1.mDownloadInfo.mReceivedBytes + " readedSize: " + r3 + " totalSize: " + r1.mDownloadInfo.getTotalSize();
        com.tencent.tmassistantsdk.util.TMLog.m164116w(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x031e, code lost:
        throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(710, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onReceivedResponseData(org.apache.http.HttpResponse r23, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            org.apache.http.HttpEntity r3 = r23.getEntity()
            boolean r4 = r1.verifyTotalLen(r0, r3)
            r5 = 705(0x2c1, float:9.88E-43)
            java.lang.String r6 = "_DownloadTask"
            if (r4 == 0) goto L_0x039a
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r4 = r1.mDownloadInfo
            long r7 = r4.getTotalSize()
            r9 = 1
            r4 = 206(0xce, float:2.89E-43)
            r11 = 0
            java.lang.String r13 = "content-range"
            r14 = 0
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x00f2
            org.apache.http.StatusLine r5 = r23.getStatusLine()
            int r5 = r5.getStatusCode()
            r7 = 200(0xc8, float:2.8E-43)
            if (r5 != r7) goto L_0x0057
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r4 = r1.mDownloadInfo
            long r7 = r3.getContentLength()
            r4.setTotalSize(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "HTTPCode 200, totalBytes:"
            r4.append(r5)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo
            long r7 = r5.getTotalSize()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r4)
            goto L_0x00ae
        L_0x0057:
            org.apache.http.StatusLine r5 = r23.getStatusLine()
            int r5 = r5.getStatusCode()
            if (r5 != r4) goto L_0x008d
            org.apache.http.Header r4 = r0.getFirstHeader(r13)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo
            java.lang.String r4 = r4.getValue()
            long r7 = com.tencent.tmassistantsdk.downloadservice.ByteRange.getTotalSize(r4)
            r5.setTotalSize(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "HTTPCode 206, totalBytes:"
            r4.append(r5)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo
            long r7 = r5.getTotalSize()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r4)
            goto L_0x00ae
        L_0x008d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "statusCode="
            r4.append(r5)
            org.apache.http.StatusLine r5 = r23.getStatusLine()
            int r5 = r5.getStatusCode()
            r4.append(r5)
            java.lang.String r5 = " onReceivedResponseData error."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r4)
        L_0x00ae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "first start downloadinfoTotalSize = "
            r4.append(r5)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo
            long r7 = r5.getTotalSize()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r4)
            org.apache.http.Header r0 = r0.getFirstHeader(r13)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r0.getValue()
            com.tencent.tmassistantsdk.downloadservice.ByteRange r0 = com.tencent.tmassistantsdk.downloadservice.ByteRange.parseContentRange(r0)
            long r4 = r0.getStart()
            r2.responseRangePosition = r4
            long r4 = r0.getEnd()
            long r7 = r0.getStart()
            long r4 = r4 - r7
            long r4 = r4 + r9
            r2.responseRangeLength = r4
        L_0x00e8:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = r1.mDownloadInfo
            long r4 = r0.getTotalSize()
            r2.responseContentLength = r4
            goto L_0x01db
        L_0x00f2:
            org.apache.http.StatusLine r7 = r23.getStatusLine()
            int r7 = r7.getStatusCode()
            if (r7 != r4) goto L_0x01db
            org.apache.http.Header r0 = r0.getFirstHeader(r13)     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r0.getValue()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.downloadservice.ByteRange r4 = com.tencent.tmassistantsdk.downloadservice.ByteRange.parseContentRange(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r7 = r0.getValue()     // Catch:{ all -> 0x01c7 }
            long r7 = com.tencent.tmassistantsdk.downloadservice.ByteRange.getTotalSize(r7)     // Catch:{ all -> 0x01c7 }
            long r11 = r4.getStart()     // Catch:{ all -> 0x01c7 }
            r2.responseRangePosition = r11     // Catch:{ all -> 0x01c7 }
            long r11 = r4.getEnd()     // Catch:{ all -> 0x01c7 }
            long r17 = r4.getStart()     // Catch:{ all -> 0x01c7 }
            long r11 = r11 - r17
            long r11 = r11 + r9
            r2.responseRangeLength = r11     // Catch:{ all -> 0x01c7 }
            r2.responseContentLength = r7     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r9.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = "totalSize = "
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            r9.append(r7)     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = "  downloadinfoTotalSize = "
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r10 = r1.mDownloadInfo     // Catch:{ all -> 0x01c7 }
            long r10 = r10.getTotalSize()     // Catch:{ all -> 0x01c7 }
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r9)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r9.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = "mReceivedBytes = "
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r10 = r1.mDownloadInfo     // Catch:{ all -> 0x01c7 }
            long r10 = r10.mReceivedBytes     // Catch:{ all -> 0x01c7 }
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r9)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r9.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = "start = "
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            long r10 = r4.getStart()     // Catch:{ all -> 0x01c7 }
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = ", end = "
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            long r10 = r4.getEnd()     // Catch:{ all -> 0x01c7 }
            r9.append(r10)     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r9)     // Catch:{ all -> 0x01c7 }
            long r9 = r4.getStart()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r4 = r1.mDownloadInfo     // Catch:{ all -> 0x01c7 }
            long r11 = r4.mReceivedBytes     // Catch:{ all -> 0x01c7 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x01bd
            long r9 = r4.getTotalSize()     // Catch:{ all -> 0x01c7 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r4.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r5 = "response ByteRange: "
            r4.append(r5)     // Catch:{ all -> 0x01c7 }
            r4.append(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.util.TMLog.m164112d(r6, r0)     // Catch:{ all -> 0x01c7 }
            com.tencent.tmassistantsdk.storage.TMAssistantFile r0 = r1.mSaveFile
            if (r0 == 0) goto L_0x01db
            r0.close()
            r1.mSaveFile = r14
            goto L_0x01db
        L_0x01b5:
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r0 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "The total size is not equal with ByteRange."
            r0.<init>((int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01bd:
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r0 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ all -> 0x01c7 }
            r2 = 706(0x2c2, float:9.9E-43)
            java.lang.String r3 = "The received size is not equal with ByteRange."
            r0.<init>((int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r2 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ all -> 0x01d0 }
            r3 = 704(0x2c0, float:9.87E-43)
            r2.<init>((int) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x01d0 }
            throw r2     // Catch:{ all -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            com.tencent.tmassistantsdk.storage.TMAssistantFile r2 = r1.mSaveFile
            if (r2 == 0) goto L_0x01da
            r2.close()
            r1.mSaveFile = r14
        L_0x01da:
            throw r0
        L_0x01db:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r0 = r1.mSaveFile
            if (r0 != 0) goto L_0x01ec
            com.tencent.tmassistantsdk.storage.TMAssistantFile r0 = new com.tencent.tmassistantsdk.storage.TMAssistantFile
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r4 = r1.mDownloadInfo
            java.lang.String r5 = r4.mTempFileName
            java.lang.String r4 = r4.mFileName
            r0.<init>(r5, r4)
            r1.mSaveFile = r0
        L_0x01ec:
            java.io.InputStream r0 = r3.getContent()     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            r3.<init>()     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            java.lang.String r5 = "start write file, fileName: "
            r3.append(r5)     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            java.lang.String r5 = r5.mFileName     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            r3.append(r5)     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r3)     // Catch:{ SocketException -> 0x037a, all -> 0x0376 }
            r11 = 0
        L_0x020a:
            byte[] r3 = r1.mRecvBuf     // Catch:{ SocketException -> 0x0374 }
            int r3 = r0.read(r3)     // Catch:{ SocketException -> 0x0374 }
            if (r3 <= 0) goto L_0x0368
            boolean r5 = r1.mStopTask     // Catch:{ SocketException -> 0x0374 }
            if (r5 == 0) goto L_0x021b
            r0.close()     // Catch:{ SocketException -> 0x0374 }
            goto L_0x0368
        L_0x021b:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r5 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r5.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            long r9 = (long) r3     // Catch:{ SocketException -> 0x0374 }
            long r7 = r7 + r9
            long r15 = r5.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            int r13 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r13 > 0) goto L_0x0327
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r15 = r13.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            int r13 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x0237
            r7 = 1
            r21 = 1
            goto L_0x0239
        L_0x0237:
            r21 = 0
        L_0x0239:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r15 = r1.mSaveFile     // Catch:{ SocketException -> 0x0374 }
            byte[] r7 = r1.mRecvBuf     // Catch:{ SocketException -> 0x0374 }
            r17 = 0
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r8 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r4 = r8.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            r16 = r7
            r18 = r3
            r19 = r4
            boolean r4 = r15.write(r16, r17, r18, r19, r21)     // Catch:{ SocketException -> 0x0374 }
            if (r4 != 0) goto L_0x031f
            java.lang.String r0 = com.tencent.tmassistantsdk.storage.TMAssistantFile.getSavePathRootDir()     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r4 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r4 = r4.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            boolean r0 = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isSpaceEnough(r0, r4)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r4 = " totalSize: "
            java.lang.String r5 = " readedSize: "
            java.lang.String r7 = " receivedSize: "
            if (r0 == 0) goto L_0x02e3
            boolean r0 = com.tencent.tmassistantsdk.storage.TMAssistantFile.isSDCardExistAndCanWrite()     // Catch:{ SocketException -> 0x0374 }
            if (r0 == 0) goto L_0x02a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0374 }
            r0.<init>()     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = "write file failed, fileName: "
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r8 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = r8.mFileName     // Catch:{ SocketException -> 0x0374 }
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r7 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r7.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r5)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r4)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r3 = r3.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r0)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r3 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ SocketException -> 0x0374 }
            r4 = 703(0x2bf, float:9.85E-43)
            r3.<init>((int) r4, (java.lang.String) r0)     // Catch:{ SocketException -> 0x0374 }
            throw r3     // Catch:{ SocketException -> 0x0374 }
        L_0x02a7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0374 }
            r0.<init>()     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = "write file failed, no sdCard! fileName: "
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r8 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = r8.mFileName     // Catch:{ SocketException -> 0x0374 }
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r7 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r7.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r5)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r4)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r3 = r3.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r0)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r3 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ SocketException -> 0x0374 }
            r4 = 711(0x2c7, float:9.96E-43)
            r3.<init>((int) r4, (java.lang.String) r0)     // Catch:{ SocketException -> 0x0374 }
            throw r3     // Catch:{ SocketException -> 0x0374 }
        L_0x02e3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0374 }
            r0.<init>()     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = "write file failed, no enough space! fileName: "
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r8 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r8 = r8.mFileName     // Catch:{ SocketException -> 0x0374 }
            r0.append(r8)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r7 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r7.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            r0.append(r7)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r5)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            r0.append(r4)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r3 = r3.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            r0.append(r3)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r0)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r3 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ SocketException -> 0x0374 }
            r4 = 710(0x2c6, float:9.95E-43)
            r3.<init>((int) r4, (java.lang.String) r0)     // Catch:{ SocketException -> 0x0374 }
            throw r3     // Catch:{ SocketException -> 0x0374 }
        L_0x031f:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            r3.updateReceivedSize(r9)     // Catch:{ SocketException -> 0x0374 }
            long r11 = r11 + r9
            goto L_0x020a
        L_0x0327:
            java.lang.String r0 = "write file size too long."
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0374 }
            r4.<init>()     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r5 = "write file size too long.\r\nreadedLen: "
            r4.append(r5)     // Catch:{ SocketException -> 0x0374 }
            r4.append(r3)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r3 = "\r\nreceivedSize: "
            r4.append(r3)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r3.mReceivedBytes     // Catch:{ SocketException -> 0x0374 }
            r4.append(r7)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r3 = "\r\ntotalSize: "
            r4.append(r3)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = r1.mDownloadInfo     // Catch:{ SocketException -> 0x0374 }
            long r7 = r3.getTotalSize()     // Catch:{ SocketException -> 0x0374 }
            r4.append(r7)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r3 = "\r\nisTheEndData: "
            r4.append(r3)     // Catch:{ SocketException -> 0x0374 }
            r3 = 0
            r4.append(r3)     // Catch:{ SocketException -> 0x0374 }
            java.lang.String r3 = r4.toString()     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r6, r3)     // Catch:{ SocketException -> 0x0374 }
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r3 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ SocketException -> 0x0374 }
            r4 = 703(0x2bf, float:9.85E-43)
            r3.<init>((int) r4, (java.lang.String) r0)     // Catch:{ SocketException -> 0x0374 }
            throw r3     // Catch:{ SocketException -> 0x0374 }
        L_0x0368:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r0 = r1.mSaveFile
            if (r0 == 0) goto L_0x0371
            r0.close()
            r1.mSaveFile = r14
        L_0x0371:
            r2.receiveDataSize = r11
            return
        L_0x0374:
            r0 = move-exception
            goto L_0x037d
        L_0x0376:
            r0 = move-exception
            r11 = 0
            goto L_0x038e
        L_0x037a:
            r0 = move-exception
            r11 = 0
        L_0x037d:
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x038d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r4)     // Catch:{ all -> 0x038d }
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r3 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ all -> 0x038d }
            r4 = 605(0x25d, float:8.48E-43)
            r3.<init>((int) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x038d }
            throw r3     // Catch:{ all -> 0x038d }
        L_0x038d:
            r0 = move-exception
        L_0x038e:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r3 = r1.mSaveFile
            if (r3 == 0) goto L_0x0397
            r3.close()
            r1.mSaveFile = r14
        L_0x0397:
            r2.receiveDataSize = r11
            throw r0
        L_0x039a:
            java.lang.String r0 = "verifyTotalLen false"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r6, r0)
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r0 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException
            java.lang.String r2 = "totalLen is not match the requestSize"
            r0.<init>((int) r5, (java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.DownloadTask.onReceivedResponseData(org.apache.http.HttpResponse, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo):void");
    }

    private void renameApkFileName(HttpResponse httpResponse) {
        if (httpResponse != null && this.mDownloadInfo.mContentType.equals("application/vnd.android.package-archive")) {
            String str = null;
            Header[] headers = httpResponse.getHeaders("Content-Disposition");
            if (headers == null || headers.length <= 0) {
                str = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
            } else {
                String value = headers[0].getValue();
                TMLog.m164114i(TAG, "headerFileName = " + value);
                if (TextUtils.isEmpty(value) || !value.contains("filename=\"")) {
                    str = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
                } else {
                    String substring = value.substring(value.indexOf("filename=\"") + 10);
                    if (!TextUtils.isEmpty(substring)) {
                        str = substring.substring(0, substring.indexOf(FastJsonResponse.QUOTE));
                        TMLog.m164114i(TAG, "header file Name =" + str);
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.mDownloadInfo.mFileName = DownloadHelper.correctFileName(DownloadHelper.decodeFileName(str));
            }
        }
    }

    private void setExtraHeaderParam(HttpGet httpGet, Map<String, String> map) {
        if (httpGet != null && map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                httpGet.addHeader((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    private void setRangeHeader(HttpGet httpGet, DownloadChunkLogInfo downloadChunkLogInfo) {
        long j;
        HttpGet httpGet2 = httpGet;
        DownloadChunkLogInfo downloadChunkLogInfo2 = downloadChunkLogInfo;
        String netStatus = DownloadHelper.getNetStatus();
        this.mDownloadInfo.mNetType = netStatus;
        if (TextUtils.isEmpty(netStatus) || (!netStatus.contains("wap") && (!netStatus.contains("net") || this.mDownloadInfo.mRetryCnt <= 0))) {
            String str = "bytes=" + this.mDownloadInfo.mReceivedBytes + "-";
            httpGet2.addHeader("range", str);
            TMLog.m164112d(TAG, "set range header: " + str);
            downloadChunkLogInfo2.responseContentLength = this.mDownloadInfo.getTotalSize();
            downloadChunkLogInfo2.requestRanagePosition = this.mDownloadInfo.mReceivedBytes;
            downloadChunkLogInfo2.requestRanageSize = 0;
            return;
        }
        try {
            int splitSizeInBytes = DownloadSetting.getSplitSizeInBytes(netStatus);
            DownloadInfo downloadInfo = this.mDownloadInfo;
            long j2 = downloadInfo.mReceivedBytes;
            if (downloadInfo.getTotalSize() > 0) {
                DownloadInfo downloadInfo2 = this.mDownloadInfo;
                j = (downloadInfo2.mReceivedBytes + ((long) splitSizeInBytes)) - 1;
                if (j >= downloadInfo2.getTotalSize()) {
                    j = this.mDownloadInfo.getTotalSize() - 1;
                }
            } else {
                j = (long) (splitSizeInBytes - 1);
            }
            String str2 = "bytes=" + j2 + "-" + j;
            httpGet2.addHeader("range", str2);
            TMLog.m164112d(TAG, "set range header: " + str2);
            downloadChunkLogInfo2.responseContentLength = this.mDownloadInfo.getTotalSize();
            downloadChunkLogInfo2.requestRanagePosition = j2;
            downloadChunkLogInfo2.requestRanageSize = (long) splitSizeInBytes;
        } catch (UnsupportedOperationException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    private boolean shouldRetryConnect() {
        boolean z = false;
        if (this.mStopTask) {
            TMLog.m164114i(TAG, "mStopTask = " + this.mStopTask);
            return false;
        }
        try {
            Thread.sleep(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        } catch (InterruptedException unused) {
        }
        if (!DownloadHelper.isNetworkConncted()) {
            int i = 0;
            while (!DownloadHelper.isNetworkConncted() && i < 5) {
                i++;
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException unused2) {
                    this.mDownloadInfo.mDownloadFailedErrCode = 600;
                }
            }
        }
        if (!DownloadHelper.isNetworkConncted()) {
            TMLog.m164114i(TAG, "network unconnected");
            return false;
        } else if (DownloadHelper.getNetStatus().equalsIgnoreCase("wifi") || DownloadHelper.getNetStatus().equalsIgnoreCase(this.startDownloadNetType)) {
            if (this.mDownloadInfo.hasRetryChance()) {
                DownloadInfo downloadInfo = this.mDownloadInfo;
                downloadInfo.mRetryCnt++;
                downloadInfo.mRedirectCnt = 0;
                try {
                    Thread.sleep(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    z = true;
                } catch (InterruptedException unused3) {
                    this.mDownloadInfo.mDownloadFailedErrCode = 600;
                }
            }
            TMLog.m164114i(TAG, "shouldRetryConnect(" + z + "), retryCnt = " + this.mDownloadInfo.mRetryCnt);
            return z;
        } else {
            TMLog.m164114i(TAG, "not equal netType, current: " + DownloadHelper.getNetStatus() + ", startNetType: " + this.startDownloadNetType);
            return false;
        }
    }

    private boolean verifyTotalLen(HttpResponse httpResponse, HttpEntity httpEntity) {
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            long contentLength = httpEntity.getContentLength();
            TMLog.m164114i(TAG, "verifyTotalLen,totalLen = " + contentLength + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
            return contentLength != -1 && (this.mDownloadInfo.mRequestFileSize.longValue() <= 0 || contentLength == this.mDownloadInfo.mRequestFileSize.longValue());
        } else if (httpResponse.getStatusLine().getStatusCode() != 206) {
            return true;
        } else {
            long totalSize = ByteRange.getTotalSize(httpResponse.getFirstHeader("content-range").getValue());
            TMLog.m164114i(TAG, "verifyTotalLen,totalLen = " + totalSize + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
            return totalSize != -1 && (this.mDownloadInfo.mRequestFileSize.longValue() <= 0 || totalSize == this.mDownloadInfo.mRequestFileSize.longValue());
        }
    }

    public void cancel() {
        TMLog.m164114i(TAG, "DownloadTask::cancel url: " + this.mDownloadInfo.mURL);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            C40319a0.m43494b(new Runnable() {
                public void run() {
                    DownloadTask.this.cancelInWorkThread();
                }
            });
        } else {
            cancelInWorkThread();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0315, code lost:
        if (r2 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0365, code lost:
        if (r2 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0367, code lost:
        r2.close();
        r12.mSaveFile = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e5 A[Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0018 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0128 A[Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015b A[SYNTHETIC, Splitter:B:37:0x015b] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void exec(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r13 = "https"
            java.lang.Class<sp.b0> r0 = p237sp.C48454b0.class
            java.lang.String r1 = ""
            java.lang.String r2 = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus()
            r12.startDownloadNetType = r2
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r2 = r12.mDownloadInfo
            r3 = 1
            r2.mTaskIsRunning = r3
            r4 = 2
            r5 = 0
            r2.updateStatus(r4, r5)
            r2 = 1
            r4 = 0
        L_0x0018:
            java.lang.String r6 = " "
            java.lang.String r7 = "_DownloadTask"
            if (r2 == 0) goto L_0x04a0
            com.tencent.tmassistantsdk.logreport.DownloadReportManager r2 = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance()
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo r2 = r2.createNewChunkLogInfo(r5)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r8 = r12.mDownloadInfo
            java.lang.String r9 = r8.mUUID
            r2.UUID = r9
            int r8 = r8.mRetryCnt
            byte r8 = (byte) r8
            r2.currentRetryCnt = r8
            java.lang.String r8 = r12.getDownloadURI()
            r2.requestUrl = r8
            boolean r8 = r12.mStopTask
            if (r8 == 0) goto L_0x003d
            goto L_0x04a0
        L_0x003d:
            r8 = 0
            boolean r9 = r12.mIsRedirect     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            if (r9 == 0) goto L_0x0050
            java.lang.String r9 = r12.mRequestUrl     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            if (r9 == 0) goto L_0x0050
            int r9 = r9.length()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            if (r9 != 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            java.lang.String r9 = r12.mRequestUrl     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            goto L_0x0071
        L_0x0050:
            if (r4 == 0) goto L_0x0061
            di3.d r9 = di3.C86312j.m106911c(r0)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            sp.b0 r9 = (p237sp.C48454b0) r9     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r10 = r12.mDownloadInfo     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.mSecondaryUrl     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r9 = r9.mo60678Er(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            goto L_0x006f
        L_0x0061:
            di3.d r9 = di3.C86312j.m106911c(r0)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            sp.b0 r9 = (p237sp.C48454b0) r9     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r10 = r12.mDownloadInfo     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.mRequestURL     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r9 = r9.mo60678Er(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
        L_0x006f:
            r12.mRequestUrl = r9     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
        L_0x0071:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r11 = "is redirect request: "
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            boolean r11 = r12.mIsRedirect     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.toString()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r11 = "changeUrl = "
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.append(r4)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.toString()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r11 = "url = "
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.append(r9)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.toString()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r12.mIsRedirect = r5     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.HttpClient r10 = com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.createHttpClient()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r12.mHttpClient = r10     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.downloadservice.HttpClientUtil.setProxy(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.methods.HttpGet r10 = new org.apache.http.client.methods.HttpGet     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r12.mHttpGet = r10     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.net.URI r10 = new java.net.URI     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>(r9)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.methods.HttpGet r9 = r12.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9.setURI(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.methods.HttpGet r9 = r12.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r11 = r12.mDownloadInfo     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.util.HashMap r11 = r11.getHeaderParams()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r12.setExtraHeaderParam(r9, r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.methods.HttpGet r9 = r12.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r12.setRangeHeader(r9, r2)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r9 = r10.getScheme()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            boolean r9 = r9.equals(r13)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            if (r9 == 0) goto L_0x0102
            org.apache.http.conn.ssl.SSLSocketFactory r9 = org.apache.http.conn.ssl.SSLSocketFactory.getSocketFactory()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.conn.ssl.X509HostnameVerifier r10 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9.setHostnameVerifier(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.conn.scheme.Scheme r10 = new org.apache.http.conn.scheme.Scheme     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r11 = 443(0x1bb, float:6.21E-43)
            r10.<init>(r13, r9, r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.HttpClient r9 = r12.mHttpClient     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.conn.ClientConnectionManager r9 = r9.getConnectionManager()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.conn.scheme.SchemeRegistry r9 = r9.getSchemeRegistry()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9.register(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
        L_0x0102:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = "start httpGet "
            r9.append(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.getName()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9.append(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r9 = r9.toString()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r9)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.HttpClient r9 = r12.mHttpClient     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.client.methods.HttpGet r10 = r12.mHttpGet     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            org.apache.http.HttpResponse r9 = r9.execute(r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            if (r9 == 0) goto L_0x015b
            r12.handleResponseCode(r9, r2)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r2 = r12.mDownloadInfo     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            boolean r2 = r2.hasReceivedAllDataBytes()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r2 = r2 ^ r3
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x0143
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x0141
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x0141:
            r12.mHttpGet = r8
        L_0x0143:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x0150
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x0150:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
        L_0x0154:
            r6.close()
            r12.mSaveFile = r8
            goto L_0x0018
        L_0x015b:
            com.tencent.tmassistantsdk.downloadservice.StopRequestException r2 = new com.tencent.tmassistantsdk.downloadservice.StopRequestException     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r9 = 701(0x2bd, float:9.82E-43)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.<init>()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r11 = "response is null! "
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r11 = r11.getName()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r10.append(r11)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            java.lang.String r10 = r10.toString()     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            r2.<init>((int) r9, (java.lang.String) r10)     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
            throw r2     // Catch:{ ConnectTimeoutException -> 0x041f, SocketTimeoutException -> 0x03c7, UnknownHostException -> 0x036f, InterruptedException -> 0x0318, SSLHandshakeException -> 0x02c8, IOException -> 0x0270, StopRequestException -> 0x01d3, all -> 0x017c }
        L_0x017c:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x0183
            r2 = 0
            goto L_0x01b0
        L_0x0183:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "Throwable "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x01b0
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r7 = 604(0x25c, float:8.46E-43)
            r6.mDownloadFailedErrCode = r7     // Catch:{ all -> 0x0477 }
        L_0x01b0:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x01c1
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x01bf
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x01bf:
            r12.mHttpGet = r8
        L_0x01c1:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x01ce
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x01ce:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x01d3:
            r2 = move-exception
            boolean r9 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r9 == 0) goto L_0x01db
        L_0x01d8:
            r2 = 0
            goto L_0x024c
        L_0x01db:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r9.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r10 = "StopRequestException, errCode = "
            r9.append(r10)     // Catch:{ all -> 0x0477 }
            int r10 = r2.mFinalErrCode     // Catch:{ all -> 0x0477 }
            r9.append(r10)     // Catch:{ all -> 0x0477 }
            r9.append(r6)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0477 }
            r9.append(r6)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            int r2 = r2.mFinalErrCode     // Catch:{ all -> 0x0477 }
            r6.mDownloadFailedErrCode = r2     // Catch:{ all -> 0x0477 }
            r7 = 703(0x2bf, float:9.85E-43)
            if (r2 == r7) goto L_0x01d8
            r7 = 710(0x2c6, float:9.95E-43)
            if (r2 == r7) goto L_0x01d8
            r7 = 711(0x2c7, float:9.96E-43)
            if (r2 != r7) goto L_0x0217
            goto L_0x01d8
        L_0x0217:
            r7 = 704(0x2c0, float:9.87E-43)
            if (r7 != r2) goto L_0x022f
            r9 = 0
            r6.setTotalSize(r9)     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.storage.TMAssistantFile r2 = new com.tencent.tmassistantsdk.storage.TMAssistantFile     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            java.lang.String r7 = r6.mTempFileName     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.mFileName     // Catch:{ all -> 0x0477 }
            r2.<init>(r7, r6)     // Catch:{ all -> 0x0477 }
            r2.deleteTempFile()     // Catch:{ all -> 0x0477 }
            goto L_0x01d8
        L_0x022f:
            r7 = 705(0x2c1, float:9.88E-43)
            if (r7 != r2) goto L_0x0248
            if (r4 != 0) goto L_0x01d8
            boolean r2 = r6.hasRetryChance()     // Catch:{ all -> 0x0477 }
            if (r2 == 0) goto L_0x01d8
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r2 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = r2.mSecondaryUrl     // Catch:{ all -> 0x0477 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x01d8
            r2 = 1
            r4 = 1
            goto L_0x024c
        L_0x0248:
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
        L_0x024c:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x025d
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x025b
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x025b:
            r12.mHttpGet = r8
        L_0x025d:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x026a
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x026a:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x0270:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x0277
            r2 = 0
            goto L_0x02a4
        L_0x0277:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "IOException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x02a4
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r7 = 606(0x25e, float:8.49E-43)
            r6.mDownloadFailedErrCode = r7     // Catch:{ all -> 0x0477 }
        L_0x02a4:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x02b5
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x02b3
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x02b3:
            r12.mHttpGet = r8
        L_0x02b5:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x02c2
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x02c2:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x02c8:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x02ce
            goto L_0x02f5
        L_0x02ce:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "SSLHandshakeException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r2 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r6 = 607(0x25f, float:8.5E-43)
            r2.mDownloadFailedErrCode = r6     // Catch:{ all -> 0x0477 }
        L_0x02f5:
            org.apache.http.client.methods.HttpGet r2 = r12.mHttpGet
            if (r2 == 0) goto L_0x0306
            boolean r2 = r2.isAborted()
            if (r2 != 0) goto L_0x0304
            org.apache.http.client.methods.HttpGet r2 = r12.mHttpGet
            r2.abort()
        L_0x0304:
            r12.mHttpGet = r8
        L_0x0306:
            org.apache.http.client.HttpClient r2 = r12.mHttpClient
            if (r2 == 0) goto L_0x0313
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
            r12.mHttpClient = r8
        L_0x0313:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r2 = r12.mSaveFile
            if (r2 == 0) goto L_0x036c
            goto L_0x0367
        L_0x0318:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x031e
            goto L_0x0345
        L_0x031e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "InterruptedException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r2 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r6 = 600(0x258, float:8.41E-43)
            r2.mDownloadFailedErrCode = r6     // Catch:{ all -> 0x0477 }
        L_0x0345:
            org.apache.http.client.methods.HttpGet r2 = r12.mHttpGet
            if (r2 == 0) goto L_0x0356
            boolean r2 = r2.isAborted()
            if (r2 != 0) goto L_0x0354
            org.apache.http.client.methods.HttpGet r2 = r12.mHttpGet
            r2.abort()
        L_0x0354:
            r12.mHttpGet = r8
        L_0x0356:
            org.apache.http.client.HttpClient r2 = r12.mHttpClient
            if (r2 == 0) goto L_0x0363
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
            r12.mHttpClient = r8
        L_0x0363:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r2 = r12.mSaveFile
            if (r2 == 0) goto L_0x036c
        L_0x0367:
            r2.close()
            r12.mSaveFile = r8
        L_0x036c:
            r2 = 0
            goto L_0x0018
        L_0x036f:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x0376
            r2 = 0
            goto L_0x03a3
        L_0x0376:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "UnknownHostException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x03a3
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r7 = 603(0x25b, float:8.45E-43)
            r6.mDownloadFailedErrCode = r7     // Catch:{ all -> 0x0477 }
        L_0x03a3:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x03b4
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x03b2
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x03b2:
            r12.mHttpGet = r8
        L_0x03b4:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x03c1
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x03c1:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x03c7:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x03ce
            r2 = 0
            goto L_0x03fb
        L_0x03ce:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "SocketTimeoutException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x03fb
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r7 = 602(0x25a, float:8.44E-43)
            r6.mDownloadFailedErrCode = r7     // Catch:{ all -> 0x0477 }
        L_0x03fb:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x040c
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x040a
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x040a:
            r12.mHttpGet = r8
        L_0x040c:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x0419
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x0419:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x041f:
            r2 = move-exception
            boolean r6 = r12.mStopTask     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x0426
            r2 = 0
            goto L_0x0453
        L_0x0426:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "ConnectTimeoutException "
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0477 }
            r6.append(r9)     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0477 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r6)     // Catch:{ all -> 0x0477 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r1, r6)     // Catch:{ all -> 0x0477 }
            boolean r2 = r12.shouldRetryConnect()     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x0453
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r6 = r12.mDownloadInfo     // Catch:{ all -> 0x0477 }
            r7 = 601(0x259, float:8.42E-43)
            r6.mDownloadFailedErrCode = r7     // Catch:{ all -> 0x0477 }
        L_0x0453:
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            if (r6 == 0) goto L_0x0464
            boolean r6 = r6.isAborted()
            if (r6 != 0) goto L_0x0462
            org.apache.http.client.methods.HttpGet r6 = r12.mHttpGet
            r6.abort()
        L_0x0462:
            r12.mHttpGet = r8
        L_0x0464:
            org.apache.http.client.HttpClient r6 = r12.mHttpClient
            if (r6 == 0) goto L_0x0471
            org.apache.http.conn.ClientConnectionManager r6 = r6.getConnectionManager()
            r6.shutdown()
            r12.mHttpClient = r8
        L_0x0471:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r6 = r12.mSaveFile
            if (r6 == 0) goto L_0x0018
            goto L_0x0154
        L_0x0477:
            r13 = move-exception
            org.apache.http.client.methods.HttpGet r0 = r12.mHttpGet
            if (r0 == 0) goto L_0x0489
            boolean r0 = r0.isAborted()
            if (r0 != 0) goto L_0x0487
            org.apache.http.client.methods.HttpGet r0 = r12.mHttpGet
            r0.abort()
        L_0x0487:
            r12.mHttpGet = r8
        L_0x0489:
            org.apache.http.client.HttpClient r0 = r12.mHttpClient
            if (r0 == 0) goto L_0x0496
            org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()
            r0.shutdown()
            r12.mHttpClient = r8
        L_0x0496:
            com.tencent.tmassistantsdk.storage.TMAssistantFile r0 = r12.mSaveFile
            if (r0 == 0) goto L_0x049f
            r0.close()
            r12.mSaveFile = r8
        L_0x049f:
            throw r13
        L_0x04a0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "mStopTask = "
            r13.append(r0)
            boolean r0 = r12.mStopTask
            r13.append(r0)
            r13.append(r6)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r13)
            boolean r13 = r12.mStopTask
            if (r13 != 0) goto L_0x0512
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "download finished, "
            r13.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r13.append(r0)
            java.lang.String r0 = ",finalstatus: "
            r13.append(r0)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = r12.mDownloadInfo
            int r0 = r0.mStatus
            r13.append(r0)
            java.lang.String r0 = " errCode: "
            r13.append(r0)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = r12.mDownloadInfo
            int r0 = r0.mDownloadFailedErrCode
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r7, r13)
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r12.mDownloadInfo
            boolean r13 = r13.hasReceivedAllDataBytes()
            if (r13 == 0) goto L_0x050b
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r12.mDownloadInfo
            r0 = 4
            r13.updateStatus(r0, r4)
            goto L_0x0516
        L_0x050b:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r12.mDownloadInfo
            r0 = 5
            r13.updateStatus(r0, r4)
            goto L_0x0516
        L_0x0512:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r12.mDownloadInfo
            r13.mDownloadFailedErrCode = r5
        L_0x0516:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r13 = r12.mDownloadInfo
            r13.mTaskIsRunning = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.DownloadTask.exec(java.lang.String):void");
    }

    public String getDownloadURI() {
        return this.mDownloadInfo.mURL;
    }

    public int getPriority() {
        return this.mDownloadInfo.mPriority;
    }

    public int getTaskId() {
        return this.mTaskId;
    }
}
