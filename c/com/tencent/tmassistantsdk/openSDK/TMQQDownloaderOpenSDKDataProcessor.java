package com.tencent.tmassistantsdk.openSDK;

import android.content.Context;
import android.text.TextUtils;
import com.p013qq.taf.jce.JceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools;
import com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest;
import com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse;
import com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadStateResponse;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse;
import com.tencent.tmassistantsdk.openSDK.param.jce.OperateDownloadTaskRequest;
import com.tencent.tmassistantsdk.openSDK.param.jce.URIActionRequest;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.UUID;

public class TMQQDownloaderOpenSDKDataProcessor implements IAssistantOnActionListener {
    public static final String TAG = "QQDownloaderOpenSDKDataProcessor";
    public static TMQQDownloaderOpenSDKDataProcessor mOpenSDKDataProcessor;
    public ITMQQDownloaderOpenSDKListener callback = null;
    public String clientKey = UUID.randomUUID().toString();
    public TMAssistantDownloadOpenSDKClient openSDKClient = null;

    public TMQQDownloaderOpenSDKDataProcessor() {
    }

    private static IPCBaseParam QQParam2BasePram(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        if (tMQQDownloaderOpenSDKParam == null) {
            return null;
        }
        IPCBaseParam iPCBaseParam = new IPCBaseParam();
        iPCBaseParam.hostAppId = tMQQDownloaderOpenSDKParam.SNGAppId;
        iPCBaseParam.taskAppId = tMQQDownloaderOpenSDKParam.taskAppId;
        iPCBaseParam.taskPackageName = tMQQDownloaderOpenSDKParam.taskPackageName;
        iPCBaseParam.taskVersion = String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion);
        iPCBaseParam.uin = tMQQDownloaderOpenSDKParam.uin;
        iPCBaseParam.uinType = tMQQDownloaderOpenSDKParam.uinType;
        iPCBaseParam.via = tMQQDownloaderOpenSDKParam.via;
        iPCBaseParam.channelId = tMQQDownloaderOpenSDKParam.channelId;
        return iPCBaseParam;
    }

    private TMQQDownloaderOpenSDKParam baseParam2QQParam(IPCBaseParam iPCBaseParam) {
        if (iPCBaseParam == null) {
            return null;
        }
        TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = new TMQQDownloaderOpenSDKParam();
        tMQQDownloaderOpenSDKParam.SNGAppId = iPCBaseParam.hostAppId;
        tMQQDownloaderOpenSDKParam.taskAppId = iPCBaseParam.taskAppId;
        tMQQDownloaderOpenSDKParam.taskPackageName = iPCBaseParam.taskPackageName;
        try {
            tMQQDownloaderOpenSDKParam.taskVersion = Integer.valueOf(iPCBaseParam.taskVersion).intValue();
        } catch (Exception unused) {
            TMLog.m164114i(TAG, "baseParam2QQParam Integer.valueOf(baseParam.taskVersion) NumberFormatException occur");
        }
        tMQQDownloaderOpenSDKParam.uin = iPCBaseParam.uin;
        tMQQDownloaderOpenSDKParam.uinType = iPCBaseParam.uinType;
        tMQQDownloaderOpenSDKParam.via = iPCBaseParam.via;
        tMQQDownloaderOpenSDKParam.channelId = iPCBaseParam.channelId;
        return tMQQDownloaderOpenSDKParam;
    }

    public static BatchDownloadActionRequest buildBatchActionRequest(int i, ArrayList<TMQQDownloaderOpenSDKParam> arrayList, String str, String str2, String str3) {
        BatchDownloadActionRequest batchDownloadActionRequest = new BatchDownloadActionRequest();
        batchDownloadActionRequest.batchRequestType = i;
        if (str != null) {
            batchDownloadActionRequest.via = str;
        }
        if (str2 != null) {
            batchDownloadActionRequest.uin = str2;
        }
        if (str3 != null) {
            batchDownloadActionRequest.uinType = str3;
        }
        batchDownloadActionRequest.batchData = new ArrayList<>();
        String str4 = "appList {";
        if (arrayList != null) {
            str4 = str4 + "appList.size=" + arrayList.size() + "\n";
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                IPCBaseParam QQParam2BasePram = QQParam2BasePram(arrayList.get(i2));
                IPCDownloadParam iPCDownloadParam = new IPCDownloadParam();
                iPCDownloadParam.baseParam = QQParam2BasePram;
                batchDownloadActionRequest.batchData.add(iPCDownloadParam);
                str4 = str4 + "element:" + i2 + "IPCDownloadParam {IPCBaseParam {hostAppId:" + iPCDownloadParam.baseParam.hostAppId + "|taskAppId:" + iPCDownloadParam.baseParam.taskAppId + "|taskPackageName:" + iPCDownloadParam.baseParam.taskPackageName + "|taskVersion:" + iPCDownloadParam.baseParam.taskVersion + "}|actionFlag:" + iPCDownloadParam.actionFlag + "|verifyType:" + iPCDownloadParam.verifyType + "}\n";
            }
        }
        TMLog.m164114i(TAG, str4 + "}");
        return batchDownloadActionRequest;
    }

    public static byte[] buildSendData(JceStruct jceStruct) {
        IPCRequest buildIpcRequest = IPCPackageTools.buildIpcRequest(jceStruct);
        if (buildIpcRequest != null) {
            byte[] buildPostData = IPCPackageTools.buildPostData(buildIpcRequest);
            if (buildPostData != null && buildPostData.length > 0) {
                return buildPostData;
            }
            TMLog.m164114i(TAG, "handleUriAction sendData = null");
            return null;
        }
        TMLog.m164114i(TAG, "handleUriAction IPCRequest = null");
        return null;
    }

    public static synchronized TMQQDownloaderOpenSDKDataProcessor getInstance(Context context) {
        TMQQDownloaderOpenSDKDataProcessor tMQQDownloaderOpenSDKDataProcessor;
        synchronized (TMQQDownloaderOpenSDKDataProcessor.class) {
            if (mOpenSDKDataProcessor == null) {
                mOpenSDKDataProcessor = new TMQQDownloaderOpenSDKDataProcessor(context);
            }
            tMQQDownloaderOpenSDKDataProcessor = mOpenSDKDataProcessor;
        }
        return tMQQDownloaderOpenSDKDataProcessor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo> getBatchTaskInfos(java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getBatchTaskInfos appList.size:"
            r3.append(r4)
            int r4 = r18.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "QQDownloaderOpenSDKDataProcessor"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r4, r3)
            r3 = 3
            r5 = r19
            r6 = r20
            r7 = r21
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest r0 = buildBatchActionRequest(r3, r0, r5, r6, r7)
            byte[] r0 = buildSendData(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0054
            int r5 = r0.length
            if (r5 <= 0) goto L_0x0054
            com.tencent.tmassistantsdk.util.GlobalUtil r5 = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance()     // Catch:{ all -> 0x004b }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x004b }
            r1.getOpenSDKClient(r5)     // Catch:{ all -> 0x004b }
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r5 = r1.openSDKClient     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0059
            byte[] r0 = r5.sendSyncData(r0)     // Catch:{ all -> 0x004b }
            goto L_0x005a
        L_0x004b:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r3)
            return r2
        L_0x0054:
            java.lang.String r0 = "getBatchTaskInfos sendData = null or length = 0"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r4, r0)
        L_0x0059:
            r0 = r2
        L_0x005a:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r0 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackPackage(r0)
            if (r0 == 0) goto L_0x00e8
            com.qq.taf.jce.JceStruct r0 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackBodyStruct(r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse r0 = (com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse) r0
            if (r0 == 0) goto L_0x00e2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getBatchTaskInfos BatchDownloadActionResponse batchRequestType:"
            r5.append(r6)
            int r6 = r0.batchRequestType
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            if (r6 == 0) goto L_0x00ca
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "response.batchData.size:"
            r2.append(r5)
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r5 = r0.batchData
            int r5 = r5.size()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x009e:
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x00dd
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            java.lang.Object r6 = r6.get(r3)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo r6 = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo) r6
            int r7 = r6.state
            int r11 = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(r7)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r7 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r9 = r6.url
            java.lang.String r10 = r6.savePath
            long r12 = r6.receivedLen
            long r14 = r6.totalLen
            java.lang.String r16 = "application/vnd.android.package-archive"
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r14, r16)
            r5.add(r7)
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00ca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r3 = "response.batchData = null"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5 = r2
            r2 = r0
        L_0x00dd:
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r4, r2)
            r2 = r5
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r0 = "getBatchTaskInfos BatchDownloadActionResponse response = null"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r4, r0)
            goto L_0x00ed
        L_0x00e8:
            java.lang.String r0 = "getBatchTaskInfos IPCResponse resp = null"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r4, r0)
        L_0x00ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getBatchTaskInfos(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTask(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getDownloadTask param.sngAppid:"
            r0.append(r1)
            java.lang.String r1 = r11.SNGAppId
            r0.append(r1)
            java.lang.String r1 = "|param.appid:"
            r0.append(r1)
            java.lang.String r1 = r11.taskAppId
            r0.append(r1)
            java.lang.String r1 = "| param.taskPackageName:"
            r0.append(r1)
            java.lang.String r1 = r11.taskPackageName
            r0.append(r1)
            java.lang.String r1 = "|param.taskVersion:"
            r0.append(r1)
            int r1 = r11.taskVersion
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QQDownloaderOpenSDKDataProcessor"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam r11 = QQParam2BasePram(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest r0 = new com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest
            r0.<init>()
            r0.baseParam = r11
            byte[] r11 = buildSendData(r0)
            r0 = 0
            if (r11 == 0) goto L_0x006c
            int r2 = r11.length
            if (r2 <= 0) goto L_0x006c
            com.tencent.tmassistantsdk.util.GlobalUtil r2 = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0062 }
            r10.getOpenSDKClient(r2)     // Catch:{ all -> 0x0062 }
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r2 = r10.openSDKClient     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0071
            byte[] r11 = r2.sendSyncData(r11)     // Catch:{ all -> 0x0062 }
            goto L_0x0072
        L_0x0062:
            r11 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r3, r2)
            return r0
        L_0x006c:
            java.lang.String r11 = "getDownloadTask sendData = null"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r11)
        L_0x0071:
            r11 = r0
        L_0x0072:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r11 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackPackage(r11)
            if (r11 == 0) goto L_0x00a9
            com.qq.taf.jce.JceStruct r11 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackBodyStruct(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse r11 = (com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "QueryDownloadTaskResponse downloadTask:"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r0)
            int r0 = r11.state
            int r4 = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(r0)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r0 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r2 = r11.url
            java.lang.String r3 = r11.savePath
            long r5 = r11.receivedLen
            long r7 = r11.totalLen
            java.lang.String r9 = "application/vnd.android.package-archive"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r7, r9)
            return r0
        L_0x00a9:
            java.lang.String r11 = "getDownloadTask IPCResponse = null"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getDownloadTask(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam):com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo");
    }

    public synchronized void getOpenSDKClient(Context context) {
        if (this.openSDKClient == null && context != null) {
            TMAssistantDownloadOpenSDKClient downloadOpenSDKClient = TMAssistantDownloadSDKManager.getInstance(context).getDownloadOpenSDKClient(this.clientKey);
            this.openSDKClient = downloadOpenSDKClient;
            if (downloadOpenSDKClient != null) {
                downloadOpenSDKClient.addAssistantOnActionListener(this);
            }
        }
    }

    public boolean handleBatchRequestAction(int i, ArrayList<TMQQDownloaderOpenSDKParam> arrayList, String str, String str2, String str3) {
        TMLog.m164114i(TAG, "handleBatchUpdateAction batchRequestType:" + i + "|appList:" + arrayList);
        byte[] buildSendData = buildSendData(buildBatchActionRequest(i, arrayList, str, str2, str3));
        if (buildSendData == null || buildSendData.length <= 0) {
            TMLog.m164114i(TAG, "handleBatchUpdateAction sendData = null or length = 0");
            return false;
        }
        try {
            getOpenSDKClient(GlobalUtil.getInstance().getContext());
            TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient == null) {
                return false;
            }
            tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public boolean handleDownloadTask(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i, String str, String str2, String str3) {
        TMLog.m164114i(TAG, "handleDownloadTask requestType:" + i + "  param.sngAppid:" + tMQQDownloaderOpenSDKParam.SNGAppId + "|param.appid:" + tMQQDownloaderOpenSDKParam.taskAppId + "| param.taskPackageName:" + tMQQDownloaderOpenSDKParam.taskPackageName + "|param.taskVersion:" + tMQQDownloaderOpenSDKParam.taskVersion + "| param.actionFlag:" + str2 + " | verifyType:" + str3);
        OperateDownloadTaskRequest operateDownloadTaskRequest = new OperateDownloadTaskRequest();
        IPCBaseParam QQParam2BasePram = QQParam2BasePram(tMQQDownloaderOpenSDKParam);
        operateDownloadTaskRequest.requestType = i;
        operateDownloadTaskRequest.baseParam = QQParam2BasePram;
        operateDownloadTaskRequest.actionFlag = str2;
        operateDownloadTaskRequest.verifyType = str3;
        operateDownloadTaskRequest.opList = str;
        byte[] buildSendData = buildSendData(operateDownloadTaskRequest);
        if (buildSendData == null || buildSendData.length <= 0) {
            TMLog.m164114i(TAG, "handleDownloadTask sendData = null");
            return false;
        }
        try {
            getOpenSDKClient(GlobalUtil.getInstance().getContext());
            TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient == null) {
                return false;
            }
            tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public boolean handleUriAction(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] buildSendData = buildSendData(new URIActionRequest(str));
        if (buildSendData == null || buildSendData.length <= 0) {
            TMLog.m164114i(TAG, "handleUriAction sendData = null");
            return false;
        }
        try {
            getOpenSDKClient(GlobalUtil.getInstance().getContext());
            TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient != null) {
                tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            }
            return false;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public void onActionResult(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            TMLog.m164114i(TAG, "onActionResult reponseData = null");
            return;
        }
        IPCResponse unpackPackage = IPCPackageTools.unpackPackage(bArr);
        JceStruct unpackBodyStruct = IPCPackageTools.unpackBodyStruct(unpackPackage);
        int i = unpackPackage.head.cmdId;
        if (i != 2) {
            if (i != 3) {
                if (i == 8) {
                    onServiceFreed();
                }
            } else if (unpackBodyStruct != null) {
                onProgressChanged((GetDownloadProgressResponse) unpackBodyStruct);
            }
        } else if (unpackBodyStruct != null) {
            onStateChanged((GetDownloadStateResponse) unpackBodyStruct);
        }
    }

    public void onDownloadSDKServiceInvalid() {
        ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = this.callback;
        if (iTMQQDownloaderOpenSDKListener != null) {
            iTMQQDownloaderOpenSDKListener.OnQQDownloaderInvalid();
        }
        Context context = GlobalUtil.getInstance().getContext();
        if (context != null) {
            TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
        }
        this.openSDKClient = null;
    }

    public void onProgressChanged(GetDownloadProgressResponse getDownloadProgressResponse) {
        TMQQDownloaderOpenSDKParam baseParam2QQParam = baseParam2QQParam(getDownloadProgressResponse.requestParam);
        if (baseParam2QQParam != null && this.callback != null) {
            TMLog.m164114i(TAG, "进度回调：GetDownloadProgressResponse response.receivedLen:" + getDownloadProgressResponse.receivedLen + ",response.totalLen" + getDownloadProgressResponse.totalLen);
            this.callback.OnDownloadTaskProgressChanged(baseParam2QQParam, getDownloadProgressResponse.receivedLen, getDownloadProgressResponse.totalLen);
        }
    }

    public void onServiceFreed() {
        ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = this.callback;
        if (iTMQQDownloaderOpenSDKListener != null) {
            iTMQQDownloaderOpenSDKListener.OnServiceFree();
        }
    }

    public void onStateChanged(GetDownloadStateResponse getDownloadStateResponse) {
        TMQQDownloaderOpenSDKParam baseParam2QQParam = baseParam2QQParam(getDownloadStateResponse.requestParam);
        if (baseParam2QQParam != null && this.callback != null) {
            TMLog.m164114i(TAG, "状态回调：GetDownloadStateResponse param.taskAppId:" + baseParam2QQParam.taskAppId + ",param.taskPackageName:" + baseParam2QQParam.taskPackageName + ",state:" + getDownloadStateResponse.state + ",response.errorCode" + getDownloadStateResponse.errorCode);
            this.callback.OnDownloadTaskStateChanged(baseParam2QQParam, GlobalUtil.assistantState2SDKState(getDownloadStateResponse.state), GlobalUtil.assistantErrorCode2SDKErrorCode(getDownloadStateResponse.errorCode), getDownloadStateResponse.errorMsg);
        }
    }

    public void registerIQQDownloaderOpenSDKListener(ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        this.callback = iTMQQDownloaderOpenSDKListener;
    }

    public void releaseIPCClient() {
        if (this.openSDKClient != null) {
            Context context = GlobalUtil.getInstance().getContext();
            if (context != null) {
                TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
            }
            this.openSDKClient = null;
        }
    }

    public void unregisterIQQDownloaderOpenSDKListener() {
        this.callback = null;
        Context context = GlobalUtil.getInstance().getContext();
        if (context != null) {
            TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
        }
        this.openSDKClient = null;
    }

    private TMQQDownloaderOpenSDKDataProcessor(Context context) {
        if (context != null) {
            getOpenSDKClient(context);
        }
    }
}
