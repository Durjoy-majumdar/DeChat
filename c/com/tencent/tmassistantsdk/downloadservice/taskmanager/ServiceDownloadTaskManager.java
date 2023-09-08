package com.tencent.tmassistantsdk.downloadservice.taskmanager;

import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ServiceDownloadTaskManager implements IDownloadManagerListener {
    public static final String TAG = "ServiceDownloadTaskManager";
    public IServiceDownloadTaskManagerListener mListener = null;
    public ArrayList<ServiceDownloadTask> mServiceTaskList = new ArrayList<>();

    public ServiceDownloadTaskManager(ArrayList<ServiceDownloadTask> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.mServiceTaskList.addAll(arrayList);
        }
    }

    public void OnDownloadProgressChanged(String str, long j, long j2) {
        ArrayList<ServiceDownloadTask> findDownloadTask;
        if (this.mListener != null && (findDownloadTask = findDownloadTask(str)) != null && findDownloadTask.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<ServiceDownloadTask> it = findDownloadTask.iterator();
            while (it.hasNext()) {
                ServiceDownloadTask next = it.next();
                if (next.checkIsNeedUpdateProgress(j, j2, currentTimeMillis)) {
                    TMLog.m164114i(TAG, "OnDownloadProgressChanged,clientKey:" + next.mClientKey + ",receivedLen:" + j + ",url:" + str.hashCode());
                    this.mListener.OnDownloadProgressChanged(next.mClientKey, str, j, j2);
                } else {
                    long j3 = j;
                }
            }
        }
    }

    public void OnDownloadStateChanged(String str, int i, int i2, String str2, boolean z, boolean z2) {
        ArrayList<ServiceDownloadTask> findDownloadTask;
        int i3 = i;
        if (this.mListener != null && (findDownloadTask = findDownloadTask(str)) != null && findDownloadTask.size() > 0) {
            Iterator<ServiceDownloadTask> it = findDownloadTask.iterator();
            while (it.hasNext()) {
                ServiceDownloadTask next = it.next();
                StringBuilder sb = new StringBuilder();
                sb.append("OnDownloadStateChanged,clientKey:");
                sb.append(next.mClientKey);
                sb.append(",state:");
                sb.append(i);
                sb.append(",errorcode:");
                int i4 = i2;
                sb.append(i2);
                sb.append(",url:");
                sb.append(str.hashCode());
                TMLog.m164114i(TAG, sb.toString());
                next.mState = i3;
                this.mListener.OnDownloadStateChanged(next.mClientKey, str, i, i2, str2, z, z2);
            }
        }
    }

    public void cancelDownload(String str, String str2) {
        if (str != null && str2 != null) {
            TMLog.m164114i(TAG, "cancelDownload,clientKey:" + str);
            ServiceDownloadTask findDownloadTask = findDownloadTask(str, str2);
            if (findDownloadTask != null) {
                this.mServiceTaskList.remove(findDownloadTask);
                TMLog.m164114i(TAG, "cancelDownload,clientKey:" + str + ",remove taskItem");
            } else {
                TMLog.m164116w(TAG, "cancelDownload,clientKey:" + str + ",taskItem is null");
            }
            ArrayList<ServiceDownloadTask> findDownloadTask2 = findDownloadTask(str2);
            if (findDownloadTask2 == null || findDownloadTask2.size() == 0) {
                TMLog.m164114i(TAG, "cancelDownload,clientKey:" + str + ",taskItem is the only on cancelAll");
                ApkDownloadManager.getInstance().cancelDownload(str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask findDownloadTask(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0032
            if (r6 != 0) goto L_0x0007
            goto L_0x0032
        L_0x0007:
            java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> r1 = r4.mServiceTaskList     // Catch:{ all -> 0x002f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002f }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002f }
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask r2 = (com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask) r2     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r2.mClientKey     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x000d
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x000d
            java.lang.String r3 = r2.mUrl     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x000d
            monitor-exit(r4)
            return r2
        L_0x002d:
            monitor-exit(r4)
            return r0
        L_0x002f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0032:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager.findDownloadTask(java.lang.String, java.lang.String):com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask");
    }

    public TMAssistantDownloadTaskInfo getDownloadTaskInfo(String str, String str2) {
        DownloadInfo queryDownloadInfo = ApkDownloadManager.getInstance().queryDownloadInfo(str2);
        if (queryDownloadInfo != null) {
            return new TMAssistantDownloadTaskInfo(queryDownloadInfo.mURL, TMAssistantFile.getSaveFilePath(queryDownloadInfo.mFileName), queryDownloadInfo.mStatus, queryDownloadInfo.mReceivedBytes, queryDownloadInfo.getTotalSize(), queryDownloadInfo.mContentType);
        }
        if (DownloadHelper.isDownloadFileExisted(str2, "application/vnd.android.package-archive")) {
            String generateFileNameFromURL = DownloadHelper.generateFileNameFromURL(str2, "application/vnd.android.package-archive");
            String saveFilePath = TMAssistantFile.getSaveFilePath(generateFileNameFromURL);
            TMAssistantFile tMAssistantFile = new TMAssistantFile(generateFileNameFromURL, generateFileNameFromURL);
            return new TMAssistantDownloadTaskInfo(str2, saveFilePath, 4, tMAssistantFile.length(), tMAssistantFile.length(), "application/vnd.android.package-archive");
        } else if (DownloadHelper.isDownloadFileExisted(str2, "application/tm.android.apkdiff")) {
            String generateFileNameFromURL2 = DownloadHelper.generateFileNameFromURL(str2, "application/tm.android.apkdiff");
            String saveFilePath2 = TMAssistantFile.getSaveFilePath(generateFileNameFromURL2);
            TMAssistantFile tMAssistantFile2 = new TMAssistantFile(generateFileNameFromURL2, generateFileNameFromURL2);
            return new TMAssistantDownloadTaskInfo(str2, saveFilePath2, 4, tMAssistantFile2.length(), tMAssistantFile2.length(), "application/tm.android.apkdiff");
        } else {
            removeDownloadTask(str2);
            return null;
        }
    }

    public void pauseDownload(String str, String str2) {
        if (str != null && str2 != null) {
            TMLog.m164114i(TAG, "pauseDownload,clientKey:" + str);
            ServiceDownloadTask findDownloadTask = findDownloadTask(str, str2);
            if (findDownloadTask != null) {
                findDownloadTask.mState = 3;
                this.mServiceTaskList.remove(findDownloadTask);
                TMLog.m164114i(TAG, "pauseDownload,clientKey:" + str + ",remove taskItem");
                ArrayList<ServiceDownloadTask> findDownloadTask2 = findDownloadTask(str2);
                if (findDownloadTask2 == null || findDownloadTask2.size() == 0) {
                    TMLog.m164114i(TAG, "pauseDownload,clientKey:" + str + ",taskItem is the only on pauseAll");
                    ApkDownloadManager.getInstance().pauseDownload(str2);
                    TMLog.m164114i(TAG, "pauseDownload end,clientKey:" + str + ",taskItem is the only on pauseAll");
                }
                IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener = this.mListener;
                if (iServiceDownloadTaskManagerListener != null) {
                    iServiceDownloadTaskManagerListener.OnDownloadStateChanged(str, str2, findDownloadTask.mState, 0, (String) null, false, false);
                }
            } else {
                TMLog.m164116w(TAG, "pauseDownload,clientKey:" + str + ",taskItem is null");
            }
            TMLog.m164114i(TAG, "pauseDownload end,clientKey:" + str);
        }
    }

    public void registerApkDownloadManagerListener() {
        ApkDownloadManager.getInstance().AddDownloadListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void removeDownloadTask(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
            java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> r1 = r4.mServiceTaskList     // Catch:{ all -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0010:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask r2 = (com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask) r2     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = r2.mUrl     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0010
            r0.add(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0010
        L_0x0028:
            int r5 = r0.size()     // Catch:{ all -> 0x0035 }
            if (r5 <= 0) goto L_0x0033
            java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> r5 = r4.mServiceTaskList     // Catch:{ all -> 0x0035 }
            r5.removeAll(r0)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r4)
            return
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager.removeDownloadTask(java.lang.String):void");
    }

    public void setListener(IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener) {
        this.mListener = iServiceDownloadTaskManagerListener;
    }

    public int startDownload(String str, String str2, String str3, long j, int i, String str4, String str5, Map<String, String> map) {
        String str6 = str2;
        if (str == null || str6 == null) {
            return 3;
        }
        TMLog.m164114i(TAG, "startDownload,clientKey:" + str);
        if (findDownloadTask(str, str2) != null) {
            TMLog.m164114i(TAG, "startDownload,clientKey:" + str + ",taskItem isn't null");
            return ApkDownloadManager.getInstance().startDownload(str2, str3, j, i, str4, str5, map);
        }
        ArrayList<ServiceDownloadTask> findDownloadTask = findDownloadTask(str6);
        ServiceDownloadTask serviceDownloadTask = new ServiceDownloadTask(str, str6);
        serviceDownloadTask.mState = 1;
        this.mServiceTaskList.add(serviceDownloadTask);
        TMLog.m164114i(TAG, "startDownload,clientKey:" + str + ",add newTask");
        Iterator<ServiceDownloadTask> it = findDownloadTask.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            int i2 = it.next().mState;
            if (i2 == 2) {
                z = true;
            } else if (i2 == 1) {
                z2 = true;
            }
        }
        if (z || z2) {
            if (z) {
                serviceDownloadTask.mState = 2;
            } else if (z2) {
                serviceDownloadTask.mState = 1;
            }
            IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener = this.mListener;
            if (iServiceDownloadTaskManagerListener != null) {
                iServiceDownloadTaskManagerListener.OnDownloadStateChanged(str, str2, serviceDownloadTask.mState, 0, (String) null, false, false);
            }
            TMLog.m164114i(TAG, "startDownload,clientKey:" + str + ",newTask is downloading, state = " + serviceDownloadTask.mState);
            return 0;
        }
        TMLog.m164114i(TAG, "startDownload,clientKey:" + str + ",start newTask download");
        return ApkDownloadManager.getInstance().startDownload(str2, str3, j, i, str4, str5, map);
    }

    public void unRegisterApkDownloadManagerListener() {
        ApkDownloadManager.getInstance().RemoveDownloadListener(this);
    }

    public synchronized ArrayList<ServiceDownloadTask> findDownloadTask(String str) {
        if (str == null) {
            return null;
        }
        ArrayList<ServiceDownloadTask> arrayList = new ArrayList<>();
        Iterator<ServiceDownloadTask> it = this.mServiceTaskList.iterator();
        while (it.hasNext()) {
            ServiceDownloadTask next = it.next();
            if (next.mUrl.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
