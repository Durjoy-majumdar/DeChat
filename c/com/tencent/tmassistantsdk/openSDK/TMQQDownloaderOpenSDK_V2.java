package com.tencent.tmassistantsdk.openSDK;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.logreport.DownloadReportManager;
import com.tencent.tmassistantsdk.logreport.GetSettingEngine;
import com.tencent.tmassistantsdk.logreport.LogReportManager;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled;
import com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class TMQQDownloaderOpenSDK_V2 extends BaseQQDownloaderOpenSDK implements ITMQQDownloaderOpenSDKListener, QQDownloaderInstalled.IQQDownloaderInstalled {
    public static final String TAG = "QQDownloaderOpenSDK";
    public static TMQQDownloaderOpenSDK_V2 mInstance;
    public CopyOnWriteArrayList<TMQQDownloaderOpenSDKParam> mTaskList;

    public TMQQDownloaderOpenSDK_V2() {
        this.mTaskList = null;
        this.mTaskList = new CopyOnWriteArrayList<>();
    }

    public static String about() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    private synchronized void addToTaskList(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        if (tMQQDownloaderOpenSDKParam != null) {
            CopyOnWriteArrayList<TMQQDownloaderOpenSDKParam> copyOnWriteArrayList = this.mTaskList;
            if (copyOnWriteArrayList != null) {
                boolean z = false;
                Iterator<TMQQDownloaderOpenSDKParam> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TMQQDownloaderOpenSDKParam next = it.next();
                        String str = next.taskAppId;
                        if (str != null) {
                            if (str.equals(tMQQDownloaderOpenSDKParam.taskAppId)) {
                                String str2 = next.taskPackageName;
                                if (str2 == null || str2.equals(tMQQDownloaderOpenSDKParam.taskPackageName)) {
                                    break;
                                }
                            }
                        } else {
                            String str3 = next.taskPackageName;
                            if (str3 != null && str3.equals(tMQQDownloaderOpenSDKParam.taskPackageName)) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (!z) {
                    this.mTaskList.add(tMQQDownloaderOpenSDKParam);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getBatchRequestType(boolean r4, int r5) {
        /*
            r3 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            if (r4 == 0) goto L_0x0012
            if (r5 == 0) goto L_0x001a
            if (r5 == r1) goto L_0x0022
            if (r5 == r2) goto L_0x0010
            if (r5 == r0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r1 = 5
            goto L_0x0022
        L_0x0010:
            r1 = 6
            goto L_0x0022
        L_0x0012:
            if (r5 == 0) goto L_0x0021
            if (r5 == r1) goto L_0x0021
            if (r5 == r2) goto L_0x001e
            if (r5 == r0) goto L_0x001c
        L_0x001a:
            r1 = 2
            goto L_0x0022
        L_0x001c:
            r1 = 7
            goto L_0x0022
        L_0x001e:
            r1 = 8
            goto L_0x0022
        L_0x0021:
            r1 = 4
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2.getBatchRequestType(boolean, int):int");
    }

    public static synchronized TMQQDownloaderOpenSDK_V2 getInstance() {
        TMQQDownloaderOpenSDK_V2 tMQQDownloaderOpenSDK_V2;
        synchronized (TMQQDownloaderOpenSDK_V2.class) {
            if (mInstance == null) {
                mInstance = new TMQQDownloaderOpenSDK_V2();
            }
            tMQQDownloaderOpenSDK_V2 = mInstance;
        }
        return tMQQDownloaderOpenSDK_V2;
    }

    private void onProgressChanged(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, long j, long j2) {
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = (ITMQQDownloaderOpenSDKListener) it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                TMLog.m164114i("QQDownloaderOpenSDK", "onDownloadStateChanged listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnDownloadTaskProgressChanged(tMQQDownloaderOpenSDKParam, j, j2);
            }
        }
    }

    public void OnDownloadTaskProgressChanged(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, long j, long j2) {
        if (tMQQDownloaderOpenSDKParam != null) {
            onProgressChanged(tMQQDownloaderOpenSDKParam, j, j2);
        }
    }

    public void OnDownloadTaskStateChanged(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i, int i2, String str) {
        if (tMQQDownloaderOpenSDKParam != null) {
            onStateChanged(tMQQDownloaderOpenSDKParam, i, i2, str);
        }
    }

    public void OnQQDownloaderInvalid() {
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = (ITMQQDownloaderOpenSDKListener) it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                TMLog.m164114i("QQDownloaderOpenSDK", "OnQQDownloaderInvalid listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnQQDownloaderInvalid();
            }
        }
    }

    public void OnServiceFree() {
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = (ITMQQDownloaderOpenSDKListener) it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                TMLog.m164114i("QQDownloaderOpenSDK", "OnQQDownloaderInvalid listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnServiceFree();
            }
        }
    }

    public long addBatchUpdateOperationToDB(ArrayList<TMQQDownloaderOpenSDKParam> arrayList, boolean z, int i, String str, String str2, String str3) {
        byte[] buildSendData;
        boolean z2 = arrayList == null || arrayList.size() == 0;
        int batchRequestType = getBatchRequestType(z2, i);
        if (batchRequestType != 3 && !z2) {
            Iterator<TMQQDownloaderOpenSDKParam> it = arrayList.iterator();
            while (it.hasNext()) {
                TMQQDownloaderOpenSDKParam next = it.next();
                if (next != null) {
                    addToTaskList(next);
                }
            }
        }
        BatchDownloadActionRequest buildBatchActionRequest = TMQQDownloaderOpenSDKDataProcessor.buildBatchActionRequest(batchRequestType, arrayList, str, str2, str3);
        if (buildBatchActionRequest == null || (buildSendData = TMQQDownloaderOpenSDKDataProcessor.buildSendData(buildBatchActionRequest)) == null) {
            return -1;
        }
        return buildAddDBData(buildSendData);
    }

    public long addDownloadTaskFromAppDetail(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z, z2, tMQQDownloaderOpenSDKParam.actionFlag, (String) null, 2);
    }

    public long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, true, true, tMQQDownloaderOpenSDKParam.actionFlag, str, 3);
    }

    public long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z, z2, tMQQDownloaderOpenSDKParam.actionFlag, (String) null, 1);
    }

    public void destroyQQDownloaderOpenSDK() {
        NetworkMonitorReceiver.getInstance().unregisterReceiver();
        GetSettingEngine.getInstance().cancleRequest();
        LogReportManager.getInstance().cancleReport();
        LogReportManager.getInstance().destory();
        Context context = this.mContext;
        if (context != null) {
            TMQQDownloaderOpenSDKDataProcessor.getInstance(context).unregisterIQQDownloaderOpenSDKListener();
            QQDownloaderInstalled.getInstance().unregisteListener();
            QQDownloaderInstalled.getInstance().unRegisteReceiver(this.mContext);
        }
        GlobalUtil.getInstance().destroy();
        this.mContext = null;
    }

    public ArrayList<TMAssistantDownloadTaskInfo> getBatchTaskState(ArrayList<TMQQDownloaderOpenSDKParam> arrayList, String str, String str2, String str3) {
        if (this.mContext == null) {
            throw new Exception("mContext shouldn't be null !");
        } else if (arrayList == null || arrayList.size() <= 0) {
            throw new Exception("ArrayList<TMQQDownloaderOpenSDKParam> appList cann't be null or empty!");
        } else {
            int qQDownloadApiLevel = BaseQQDownloaderOpenSDK.getQQDownloadApiLevel(this.mContext);
            if (qQDownloadApiLevel <= 1) {
                return null;
            }
            if (qQDownloadApiLevel >= 4) {
                return TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).getBatchTaskInfos(arrayList, str, str2, str3);
            }
            TMAssistantDownloadTaskInfo downloadTask = TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).getDownloadTask(arrayList.get(0));
            if (downloadTask == null) {
                return null;
            }
            ArrayList<TMAssistantDownloadTaskInfo> arrayList2 = new ArrayList<>();
            arrayList2.add(downloadTask);
            return arrayList2;
        }
    }

    public TMAssistantDownloadTaskInfo getDownloadTaskState(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        Context context = this.mContext;
        if (context == null) {
            throw new Exception("Context shouldn't be null !");
        } else if (tMQQDownloaderOpenSDKParam != null) {
            return TMQQDownloaderOpenSDKDataProcessor.getInstance(context).getDownloadTask(tMQQDownloaderOpenSDKParam);
        } else {
            throw new Exception("TMQQDownloaderOpenSDKParam param cann't is null!");
        }
    }

    public void initQQDownloaderOpenSDK(Context context) {
        this.mContext = context;
        this.hostPackageName = context.getPackageName();
        this.hostVersionCode = GlobalUtil.getAppVersionCode(this.mContext);
        GlobalUtil.getInstance().setContext(this.mContext);
        this.sdkAPILevel = 2;
        Context context2 = this.mContext;
        if (context2 != null) {
            TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).registerIQQDownloaderOpenSDKListener(this);
            QQDownloaderInstalled.getInstance().registeReceiver(this.mContext);
            QQDownloaderInstalled.getInstance().registeListener(this);
        }
        NetworkMonitorReceiver.getInstance().registerReceiver();
        GetSettingEngine.getInstance().sendRequest();
        LogReportManager.getInstance().reportLog();
    }

    public synchronized void onQQDownloaderInstalled(Context context) {
        TMLog.m164114i("QQDownloaderOpenSDK", "received qqdownload install broadcase!");
        CopyOnWriteArrayList<TMQQDownloaderOpenSDKParam> copyOnWriteArrayList = this.mTaskList;
        if (copyOnWriteArrayList != null) {
            Iterator<TMQQDownloaderOpenSDKParam> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                TMQQDownloaderOpenSDKParam next = it.next();
                if (next != null) {
                    try {
                        getDownloadTaskState(next);
                    } catch (Exception e) {
                        Log.printErrStackTrace("QQDownloaderOpenSDK", e, "", new Object[0]);
                    }
                    this.mTaskList.remove(next);
                }
            }
        }
    }

    public void releaseIPCConnected() {
        Context context = this.mContext;
        if (context != null) {
            TMQQDownloaderOpenSDKDataProcessor.getInstance(context).releaseIPCClient();
        }
    }

    public void startToAppDetail(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2, int i) {
        if (context != null) {
            String uuid = UUID.randomUUID().toString();
            if (z) {
                DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
                createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
                createNewChunkLogInfo.UUID = uuid;
                createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
                createNewChunkLogInfo.resultState = 1;
                DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            }
            if (tMQQDownloaderOpenSDKParam != null) {
                String formatOplist = super.formatOplist(z, z2);
                int i2 = 1 == i ? 1 : 4;
                addToTaskList(tMQQDownloaderOpenSDKParam);
                TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam, i2, formatOplist, tMQQDownloaderOpenSDKParam.actionFlag, (String) null);
                return;
            }
            return;
        }
        throw new Exception("you must input an application or activity context!");
    }

    public void startToAuthorized(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str) {
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (tMQQDownloaderOpenSDKParam != null) {
            String uuid = UUID.randomUUID().toString();
            DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            addToTaskList(tMQQDownloaderOpenSDKParam);
            TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam2 = tMQQDownloaderOpenSDKParam;
            TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam2, 3, super.formatOplist(true, true), tMQQDownloaderOpenSDKParam.actionFlag, str);
        } else {
            throw new Exception("QQDownloaderParam param cann't be null!");
        }
    }

    public int startToBatchUpdateOperation(Context context, ArrayList<TMQQDownloaderOpenSDKParam> arrayList, boolean z, int i, String str, String str2, String str3) {
        if (context != null) {
            int qQDownloadApiLevel = BaseQQDownloaderOpenSDK.getQQDownloadApiLevel(context);
            boolean z2 = true;
            if (qQDownloadApiLevel <= 0) {
                return 1;
            }
            if (qQDownloadApiLevel < 4) {
                return 2;
            }
            if (!(arrayList == null || arrayList.size() == 0)) {
                z2 = false;
            }
            int batchRequestType = getBatchRequestType(z2, i);
            if (!TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleBatchRequestAction(batchRequestType, arrayList, str, str2, str3)) {
                TMLog.m164116w("QQDownloaderOpenSDK", "handleBatchRequestAction return false with batchRequestType=" + batchRequestType);
            }
            return 0;
        }
        throw new Exception("you must input an application or activity context!");
    }

    public void startToDownloadTaskList(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2, int i) {
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (tMQQDownloaderOpenSDKParam != null) {
            String uuid = UUID.randomUUID().toString();
            if (z) {
                DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
                createNewChunkLogInfo.UUID = uuid;
                createNewChunkLogInfo.requestUrl = "";
                createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
                createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
                DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            }
            if (tMQQDownloaderOpenSDKParam != null) {
                String formatOplist = super.formatOplist(z, z2);
                int i2 = 1 == i ? 2 : 5;
                addToTaskList(tMQQDownloaderOpenSDKParam);
                TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam, i2, formatOplist, tMQQDownloaderOpenSDKParam.actionFlag, (String) null);
            }
        }
    }

    public void startToWebView(Context context, String str) {
        Context context2;
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            String formatIntentUriPath = super.formatIntentUriPath(5, hashMap);
            TMLog.m164114i("QQDownloaderOpenSDK", "startToWebView finalPath:" + formatIntentUriPath);
            if (!TextUtils.isEmpty(str) && (context2 = this.mContext) != null) {
                TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).handleUriAction(formatIntentUriPath);
            }
        } else {
            throw new Exception("param url shouldn't be null!");
        }
    }

    public void startToAuthorized(Context context, String str) {
        Context context2;
        String formatEncryptUrl = super.formatEncryptUrl(str);
        if (!TextUtils.isEmpty(str) && (context2 = this.mContext) != null) {
            TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).handleUriAction(formatEncryptUrl);
        }
    }
}
