package com.tencent.tmassistantsdk.downloadservice;

import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApkDownloadManager implements NetworkMonitorReceiver.INetworkChangedObserver {
    public static final long INTERVAL = 180000;
    public static final String TAG = "ApkDownloadManager";
    public static ApkDownloadManager mApkDownloadManager;
    public final Map<String, DownloadInfo> mDownloads = new ConcurrentHashMap();

    private ApkDownloadManager() {
    }

    public static ApkDownloadManager getInstance() {
        if (mApkDownloadManager == null) {
            mApkDownloadManager = new ApkDownloadManager();
        }
        return mApkDownloadManager;
    }

    public void AddDownloadListener(IDownloadManagerListener iDownloadManagerListener) {
        TMLog.m164114i(TAG, "call AddDownloadListener, dl: " + iDownloadManagerListener);
        DownloadListenerManager.getInstance().Add(iDownloadManagerListener);
    }

    public void RemoveDownloadListener(IDownloadManagerListener iDownloadManagerListener) {
        TMLog.m164114i(TAG, "call RemoveDownloadListener, dl: " + iDownloadManagerListener);
        DownloadListenerManager.getInstance().Remove(iDownloadManagerListener);
    }

    public void cancelDownload(String str) {
        TMLog.m164114i(TAG, "call cancelDownload, url: " + str);
        DownloadInfo remove = this.mDownloads.remove(str);
        if (remove != null) {
            remove.stopDownload();
        }
    }

    public void init() {
        TMLog.m164114i(TAG, "Start to load DownloadInfo list.");
        this.mDownloads.clear();
        ArrayList<DownloadInfo> queryDownloadInfoList = DBManager.getInstance().queryDownloadInfoList();
        if (queryDownloadInfoList != null) {
            TMLog.m164114i(TAG, "The size of downloadinfo_list: " + queryDownloadInfoList.size());
            Iterator<DownloadInfo> it = queryDownloadInfoList.iterator();
            while (it.hasNext()) {
                DownloadInfo next = it.next();
                TMLog.m164114i(TAG, "---------------load download info---------------");
                next.dump(TAG);
                this.mDownloads.put(next.mURL, next);
                if (!next.hasFinished()) {
                    next.updateStatus(3, false);
                }
            }
        }
        TMLog.m164114i(TAG, "Add NetworkChangedObserver to NetworkMonitorReceiver");
        NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(this);
    }

    public Boolean isAllDownloadFinished() {
        for (String str : this.mDownloads.keySet()) {
            if (!this.mDownloads.get(str).hasFinished()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public void onNetworkChanged() {
        TMLog.m164114i(TAG, "onNetworkChanged");
        if (DownloadHelper.isNetworkConncted() && DownloadSetting.getInstance().isAutoDownload()) {
            String netStatus = DownloadHelper.getNetStatus();
            TMLog.m164114i(TAG, "currentNetType = " + netStatus);
            for (String str : this.mDownloads.keySet()) {
                DownloadInfo downloadInfo = this.mDownloads.get(str);
                if (DownloadSetting.getInstance().isAutoDownload(downloadInfo.mNetType, netStatus)) {
                    TMLog.m164114i(TAG, "onNetworkChanged, errCode = " + downloadInfo.mDownloadFailedErrCode);
                    int i = downloadInfo.mDownloadFailedErrCode;
                    if (i == 601 || i == 602 || i == 605 || i == 603 || i == 606) {
                        long currentTimeMillis = System.currentTimeMillis();
                        TMLog.m164114i(TAG, "onNetworkChanged, currentTime = " + currentTimeMillis + ", DownloadFailedTime = " + downloadInfo.mDownloadFailedTime);
                        if (currentTimeMillis - downloadInfo.mDownloadFailedTime < INTERVAL) {
                            downloadInfo.startDownloadIfReady(true);
                        }
                    }
                }
            }
        }
    }

    public void pauseDownload(String str) {
        TMLog.m164114i(TAG, "call pauseDownload, url: " + str);
        DownloadInfo downloadInfo = this.mDownloads.get(str);
        if (downloadInfo != null) {
            downloadInfo.pauseDownload();
        }
    }

    public DownloadInfo queryDownloadInfo(String str) {
        TMLog.m164114i(TAG, "call queryDownloadInfo, url: " + str);
        DownloadInfo downloadInfo = this.mDownloads.get(str);
        if (downloadInfo == null) {
            downloadInfo = DBManager.getInstance().queryDownloadInfoByUrl(str);
        }
        boolean z = false;
        if (downloadInfo != null) {
            z = downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? DownloadHelper.isDownloadFileExisted(str, downloadInfo.mContentType) : DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName);
        }
        if (downloadInfo == null || !downloadInfo.hasReceivedAllDataBytes() || z) {
            return downloadInfo;
        }
        this.mDownloads.remove(str);
        DBManager.getInstance().deleteDownloadInfo(str);
        return null;
    }

    public int startDownload(String str, String str2, long j, int i, String str3, String str4, Map<String, String> map) {
        String str5 = str;
        String str6 = str4;
        TMLog.m164114i(TAG, "call startDownload, url: " + str5 + "priority: " + i);
        if (!DownloadHelper.isNetworkConncted()) {
            TMLog.m164114i(TAG, "call startDownload, return errCode: 1");
            return 1;
        } else if (!DownloadHelper.getNetStatus().equalsIgnoreCase("wifi") && DownloadSetting.getInstance().getIsDownloadWifiOnly()) {
            TMLog.m164114i(TAG, "call startDownload, return errCode: 2");
            return 2;
        } else if (!DownloadHelper.isValidURL(str)) {
            TMLog.m164114i(TAG, "call startDownload, return errCode: 3");
            return 3;
        } else if (DownloadHelper.isDownloadFileExisted(str5, str3)) {
            TMLog.m164114i(TAG, "call startDownload, return errCode: 4");
            return 4;
        } else {
            DownloadInfo downloadInfo = this.mDownloads.get(str5);
            if (downloadInfo == null) {
                downloadInfo = DBManager.getInstance().queryDownloadInfoByUrl(str5);
                if (downloadInfo == null) {
                    DownloadInfo downloadInfo2 = r1;
                    DownloadInfo downloadInfo3 = new DownloadInfo(str, str2, j, i, str3);
                    if (downloadInfo2.mContentType.equals("resource/tm.android.unknown")) {
                        downloadInfo2.mFileName = str6;
                    }
                    downloadInfo = downloadInfo2;
                } else {
                    if (downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? DownloadHelper.isDownloadFileExisted(str5, downloadInfo.mContentType) : DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName)) {
                        TMLog.m164114i(TAG, "call startDownload, return errCode: 4");
                        return 4;
                    }
                }
                this.mDownloads.put(str5, downloadInfo);
            }
            HashMap hashMap = (HashMap) map;
            downloadInfo.setHeaderParams(hashMap);
            boolean isDownloadFileExisted = downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? DownloadHelper.isDownloadFileExisted(str5, downloadInfo.mContentType) : DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName);
            TMLog.m164114i(TAG, "fileExited = " + isDownloadFileExisted);
            if (isDownloadFileExisted) {
                return 4;
            }
            if (downloadInfo.hasReceivedAllDataBytes() && !isDownloadFileExisted) {
                this.mDownloads.remove(str5);
                DBManager.getInstance().deleteDownloadInfo(str5);
                DownloadInfo downloadInfo4 = new DownloadInfo(str, str2, j, i, str3);
                if (downloadInfo4.mContentType.equals("resource/tm.android.unknown")) {
                    downloadInfo4.mFileName = str6;
                }
                downloadInfo4.setHeaderParams(hashMap);
                this.mDownloads.put(str5, downloadInfo4);
                downloadInfo = downloadInfo4;
            }
            int startDownloadIfReady = downloadInfo.startDownloadIfReady();
            TMLog.m164114i(TAG, "call startDownload, return errCode: " + startDownloadIfReady);
            return startDownloadIfReady;
        }
    }

    public void uninit() {
        NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this);
        ArrayList arrayList = new ArrayList();
        if (!this.mDownloads.isEmpty()) {
            for (String str : this.mDownloads.keySet()) {
                DownloadInfo downloadInfo = this.mDownloads.get(str);
                if (downloadInfo.mStatus == 2) {
                    pauseDownload(downloadInfo.mURL);
                }
                arrayList.add(downloadInfo);
            }
        }
        TMLog.m164114i(TAG, "Start to save DownloadInfo list.");
        DBManager.getInstance().saveDownloadInfoList(arrayList);
    }
}
