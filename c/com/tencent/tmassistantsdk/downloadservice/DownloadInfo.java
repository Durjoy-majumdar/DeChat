package com.tencent.tmassistantsdk.downloadservice;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class DownloadInfo {
    public static final String CONTENTTYPE = "contentType";
    public static final String DOWNLOADFAILEDERRCODE = "downloadFailedErrCode";
    public static final String DOWNLOADFAILEDTIME = "downloadFailedTime";
    public static final String FILENAME = "fileName";
    public static final String FINALURL = "finalUrl";
    public static final String HEADERPARAMS = "headerParams";
    public static final String NETTYPE = "netType";
    public static final String PRIORITY = "priority";
    public static final String RECEIVEDBYTES = "receivedBytes";
    public static final String REDIRECTCNT = "redirectCnt";
    public static final String REQUESTFILESIZE = "requestFileSize";
    public static final String RETRYCNT = "retryCnt";
    public static final String SECONDARYURL = "secondaryUrl";
    public static final String STATUS = "status";
    public static final String TAG = "_DownloadInfo";
    public static final String TASKID = "taskId";
    public static final String TASKURL = "taskUrl";
    public static final String TOTALBYTES = "totalBytes";
    public static final String UID = "uId";
    private boolean mAutoRetry;
    public String mContentType;
    public int mDownloadFailedErrCode;
    public long mDownloadFailedTime;
    public int mDownloadTaskId;
    public String mFileName;
    private String mHeaderParamString;
    private HashMap<String, String> mHeaderParams;
    public String mNetType;
    public int mPriority;
    public long mReceivedBytes;
    public int mRedirectCnt;
    public Long mRequestFileSize;
    public String mRequestURL;
    public int mRetryCnt;
    public String mSecondaryUrl;
    public int mStatus;
    public boolean mTaskIsRunning;
    public String mTempFileName;
    public long mTotalBytes;
    public String mURL;
    public String mUUID;

    public DownloadInfo() {
        this.mAutoRetry = false;
        this.mTaskIsRunning = false;
    }

    public static DownloadInfo readFromCursor(Cursor cursor) {
        DownloadInfo downloadInfo = new DownloadInfo();
        downloadInfo.mDownloadTaskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        downloadInfo.mUUID = cursor.getString(cursor.getColumnIndex(UID));
        downloadInfo.mRequestURL = cursor.getString(cursor.getColumnIndex(FINALURL));
        downloadInfo.mURL = cursor.getString(cursor.getColumnIndex("taskUrl"));
        downloadInfo.mSecondaryUrl = cursor.getString(cursor.getColumnIndex(SECONDARYURL));
        downloadInfo.mRequestFileSize = Long.valueOf(cursor.getLong(cursor.getColumnIndex(REQUESTFILESIZE)));
        downloadInfo.mFileName = cursor.getString(cursor.getColumnIndex(FILENAME));
        downloadInfo.mContentType = cursor.getString(cursor.getColumnIndex(CONTENTTYPE));
        downloadInfo.mRedirectCnt = cursor.getInt(cursor.getColumnIndex(REDIRECTCNT));
        downloadInfo.mRetryCnt = cursor.getInt(cursor.getColumnIndex(RETRYCNT));
        downloadInfo.mTotalBytes = cursor.getLong(cursor.getColumnIndex(TOTALBYTES));
        downloadInfo.mStatus = cursor.getInt(cursor.getColumnIndex("status"));
        downloadInfo.mReceivedBytes = cursor.getLong(cursor.getColumnIndex(RECEIVEDBYTES));
        downloadInfo.mPriority = cursor.getInt(cursor.getColumnIndex(PRIORITY));
        downloadInfo.mNetType = cursor.getString(cursor.getColumnIndex(NETTYPE));
        downloadInfo.mDownloadFailedErrCode = cursor.getInt(cursor.getColumnIndex(DOWNLOADFAILEDERRCODE));
        downloadInfo.mDownloadFailedTime = cursor.getLong(cursor.getColumnIndex(DOWNLOADFAILEDTIME));
        downloadInfo.mHeaderParamString = cursor.getString(cursor.getColumnIndex(HEADERPARAMS));
        return downloadInfo;
    }

    public static DownloadInfo readFromSimpleCursor(Cursor cursor) {
        DownloadInfo downloadInfo = new DownloadInfo();
        downloadInfo.mDownloadTaskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        downloadInfo.mUUID = cursor.getString(cursor.getColumnIndex(UID));
        downloadInfo.mRequestURL = cursor.getString(cursor.getColumnIndex(FINALURL));
        downloadInfo.mURL = cursor.getString(cursor.getColumnIndex("taskUrl"));
        downloadInfo.mSecondaryUrl = cursor.getString(cursor.getColumnIndex(SECONDARYURL));
        downloadInfo.mRequestFileSize = Long.valueOf(cursor.getLong(cursor.getColumnIndex(REQUESTFILESIZE)));
        downloadInfo.mFileName = cursor.getString(cursor.getColumnIndex(FILENAME));
        downloadInfo.mContentType = cursor.getString(cursor.getColumnIndex(CONTENTTYPE));
        downloadInfo.mRedirectCnt = cursor.getInt(cursor.getColumnIndex(REDIRECTCNT));
        downloadInfo.mRetryCnt = cursor.getInt(cursor.getColumnIndex(RETRYCNT));
        downloadInfo.mTotalBytes = cursor.getLong(cursor.getColumnIndex(TOTALBYTES));
        downloadInfo.mStatus = cursor.getInt(cursor.getColumnIndex("status"));
        downloadInfo.mReceivedBytes = cursor.getLong(cursor.getColumnIndex(RECEIVEDBYTES));
        downloadInfo.mPriority = cursor.getInt(cursor.getColumnIndex(PRIORITY));
        downloadInfo.mNetType = null;
        downloadInfo.mDownloadFailedErrCode = 0;
        downloadInfo.mDownloadFailedTime = 0;
        downloadInfo.mHeaderParamString = null;
        return downloadInfo;
    }

    public static void writeToContentValues(ContentValues contentValues, DownloadInfo downloadInfo) {
        if (downloadInfo != null && contentValues != null) {
            contentValues.put("taskId", Integer.valueOf(downloadInfo.mDownloadTaskId));
            contentValues.put(UID, downloadInfo.mUUID);
            contentValues.put(FINALURL, downloadInfo.mRequestURL);
            contentValues.put("taskUrl", downloadInfo.mURL);
            contentValues.put(SECONDARYURL, downloadInfo.mSecondaryUrl);
            contentValues.put(REQUESTFILESIZE, downloadInfo.mRequestFileSize);
            contentValues.put(FILENAME, downloadInfo.mFileName);
            contentValues.put(CONTENTTYPE, downloadInfo.mContentType);
            contentValues.put(REDIRECTCNT, Integer.valueOf(downloadInfo.mRedirectCnt));
            contentValues.put(RETRYCNT, Integer.valueOf(downloadInfo.mRetryCnt));
            contentValues.put(TOTALBYTES, Long.valueOf(downloadInfo.mTotalBytes));
            contentValues.put("status", Integer.valueOf(downloadInfo.mStatus));
            contentValues.put(RECEIVEDBYTES, Long.valueOf(downloadInfo.mReceivedBytes));
            contentValues.put(PRIORITY, Integer.valueOf(downloadInfo.mPriority));
            contentValues.put(NETTYPE, downloadInfo.mNetType);
            contentValues.put(DOWNLOADFAILEDERRCODE, Integer.valueOf(downloadInfo.mDownloadFailedErrCode));
            contentValues.put(DOWNLOADFAILEDTIME, Long.valueOf(downloadInfo.mDownloadFailedTime));
            contentValues.put(HEADERPARAMS, downloadInfo.mHeaderParamString);
        }
    }

    public void dump(String str) {
        TMLog.m164114i(str, "--------dump DownloadInfo-----------");
        TMLog.m164114i(str, "mContentType: " + this.mContentType);
        TMLog.m164114i(str, "mURL: " + this.mURL);
        TMLog.m164114i(str, "mRequestURL: " + this.mRequestURL);
        TMLog.m164114i(str, "mSecondaryUrl: " + this.mSecondaryUrl);
        TMLog.m164114i(str, "mRequestFileSize: " + this.mRequestFileSize);
        TMLog.m164114i(str, "mRetryCnt: " + this.mRetryCnt);
        TMLog.m164114i(str, "mRedirectCnt: " + this.mRedirectCnt);
        TMLog.m164114i(str, "mTotalBytes: " + this.mTotalBytes);
        TMLog.m164114i(str, "mUUID: " + this.mUUID);
        TMLog.m164114i(str, "mStatus: " + this.mStatus);
        TMLog.m164114i(str, "mReceivedBytes: " + this.mReceivedBytes);
        TMLog.m164114i(str, "mFileName: " + this.mFileName);
        TMLog.m164114i(str, "mDownloadFailedErrCode: " + this.mDownloadFailedErrCode);
        TMLog.m164114i(str, "mNetType:" + this.mNetType);
        TMLog.m164114i(str, "mDownloadFailedTime:" + this.mDownloadFailedTime);
        TMLog.m164114i(str, "mHeaderParamString:" + this.mHeaderParamString);
    }

    public HashMap<String, String> getHeaderParams() {
        return this.mHeaderParams;
    }

    public long getTotalSize() {
        return this.mTotalBytes;
    }

    public boolean hasFinished() {
        return this.mStatus > 3;
    }

    public boolean hasReceivedAllDataBytes() {
        TMLog.m164114i(TAG, "mTotalBytes = " + this.mTotalBytes + ", mReceivedBytes = " + this.mReceivedBytes);
        long j = this.mTotalBytes;
        return j != 0 && this.mReceivedBytes == j;
    }

    public boolean hasRetryChance() {
        return this.mRetryCnt <= 5;
    }

    public void pauseDownload() {
        TMLog.m164114i(TAG, "DownloadInfo::pauseDownload url: " + this.mURL);
        DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
        updateStatus(3, false);
    }

    public void setHeaderParams(HashMap<String, String> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mHeaderParams = hashMap;
            this.mHeaderParamString = new JSONObject(hashMap).toString();
        }
    }

    public void setTotalSize(long j) {
        if (0 == j) {
            this.mReceivedBytes = 0;
        }
        this.mTotalBytes = j;
        DBManager.getInstance().addDownloadInfo(this);
    }

    public int startDownloadIfReady() {
        return startDownloadIfReady(false);
    }

    public void stopDownload() {
        TMLog.m164114i(TAG, "DownloadInfo::stopDownload url: " + this.mURL);
        DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
        updateStatus(6, false);
    }

    public void updateReceivedSize(long j) {
        this.mReceivedBytes += j;
        DownloadListenerManager.getInstance().OnDownloadProgressChanged(this.mURL, this.mReceivedBytes, this.mTotalBytes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateStatus(int r8, boolean r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.hasFinished()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            r7.mStatus = r8     // Catch:{ all -> 0x003c }
            r0 = 6
            if (r8 == r0) goto L_0x0031
            r0 = 5
            if (r8 != r0) goto L_0x0017
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003c }
            r7.mDownloadFailedTime = r0     // Catch:{ all -> 0x003c }
        L_0x0017:
            com.tencent.tmassistantsdk.storage.DBManager r8 = com.tencent.tmassistantsdk.storage.DBManager.getInstance()     // Catch:{ all -> 0x003c }
            r8.addDownloadInfo(r7)     // Catch:{ all -> 0x003c }
            com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager r0 = com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager.getInstance()     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r7.mURL     // Catch:{ all -> 0x003c }
            int r2 = r7.mStatus     // Catch:{ all -> 0x003c }
            int r3 = r7.mDownloadFailedErrCode     // Catch:{ all -> 0x003c }
            java.lang.String r4 = ""
            boolean r6 = r7.mAutoRetry     // Catch:{ all -> 0x003c }
            r5 = r9
            r0.OnDownloadStateChanged(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003c }
            goto L_0x003a
        L_0x0031:
            com.tencent.tmassistantsdk.storage.DBManager r8 = com.tencent.tmassistantsdk.storage.DBManager.getInstance()     // Catch:{ all -> 0x003c }
            java.lang.String r9 = r7.mURL     // Catch:{ all -> 0x003c }
            r8.deleteDownloadInfo(r9)     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r7)
            return
        L_0x003c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.DownloadInfo.updateStatus(int, boolean):void");
    }

    public int startDownloadIfReady(boolean z) {
        HashMap<String, String> hashMap;
        TMLog.m164114i(TAG, "DownloadInfo::startDownloadIfReady url: " + this.mURL);
        if (!TextUtils.isEmpty(this.mHeaderParamString) && ((hashMap = this.mHeaderParams) == null || hashMap.size() <= 0)) {
            HashMap<String, String> hashMap2 = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(this.mHeaderParamString);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject.getString(next));
                }
                if (hashMap2.size() > 0) {
                    this.mHeaderParams = hashMap2;
                }
            } catch (JSONException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        if (this.mTaskIsRunning) {
            return 5;
        }
        this.mAutoRetry = z;
        TMLog.m164114i(TAG, "autoRetry = " + this.mAutoRetry);
        if (this.mFileName == null) {
            this.mFileName = DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
        }
        if (this.mTempFileName == null) {
            this.mTempFileName = DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
        }
        if (this.mTotalBytes == 0) {
            new TMAssistantFile(this.mTempFileName, this.mFileName).deleteTempFile();
        }
        TMLog.m164114i(TAG, "mFileName = " + this.mFileName);
        TMLog.m164114i(TAG, "mTempFileName = " + this.mTempFileName);
        TMLog.m164114i(TAG, "mTotalBytes = " + this.mTotalBytes + ", mStatus = " + this.mStatus);
        if (this.mStatus == 5) {
            this.mRequestURL = this.mURL;
        }
        if (!TextUtils.isEmpty(this.mFileName)) {
            TMAssistantFile tMAssistantFile = new TMAssistantFile(this.mTempFileName, this.mFileName);
            long length = tMAssistantFile.length();
            TMLog.m164114i(TAG, "FileLen: " + length + " filename: " + this.mFileName);
            if (length > this.mTotalBytes) {
                tMAssistantFile.deleteTempFile();
                this.mReceivedBytes = 0;
            } else {
                this.mReceivedBytes = length;
            }
            if (hasReceivedAllDataBytes()) {
                tMAssistantFile.moveFileToSavaPath();
                updateStatus(4, false);
                return 4;
            }
        }
        if (this.mStatus == 5) {
            this.mRedirectCnt = 0;
            this.mRetryCnt = 0;
            this.mStatus = 0;
            this.mDownloadFailedErrCode = 0;
        }
        TMLog.m164114i(TAG, "startDownloadIfReady...");
        dump(TAG);
        if (DownloadThreadPool.getInstance().getDownloadTask(this.mURL) == null) {
            TMLog.m164114i(TAG, "dt is null");
            DownloadTask downloadTask = new DownloadTask(this);
            updateStatus(1, false);
            this.mDownloadTaskId = DownloadThreadPool.getInstance().addDownloadTask(downloadTask);
        }
        return 0;
    }

    public DownloadInfo(String str, String str2, long j, int i, String str3) {
        this.mAutoRetry = false;
        this.mURL = str;
        this.mSecondaryUrl = str2;
        this.mRequestURL = DownloadHelper.correctURL(str);
        this.mRequestFileSize = Long.valueOf(j);
        this.mUUID = UUID.randomUUID().toString();
        this.mPriority = i;
        this.mStatus = 0;
        this.mDownloadFailedErrCode = 0;
        this.mTaskIsRunning = false;
        this.mContentType = str3;
        this.mNetType = DownloadHelper.getNetStatus();
        this.mDownloadFailedTime = 0;
    }
}
