package com.tencent.tmassistantsdk.openSDK;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.logreport.DownloadReportManager;
import com.tencent.tmassistantsdk.logreport.GetSettingEngine;
import com.tencent.tmassistantsdk.logreport.LogReportManager;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;

public class TMQQDownloaderOpenSDK extends BaseQQDownloaderOpenSDK implements IDownloadStateChangedListener, ITMQQDownloaderOpenSDK {
    public static final String AUTHORITY = "com.tencent.android.qqdownloader.provider";
    public static final Uri CONTENT_URI = AssistantStore.DownloadInfos.CONTENT_URI;
    public static final String TAG = "QQDownloaderOpenSDK";
    public static TMQQDownloaderOpenSDK mInstance;
    private byte _hellAccFlag_;
    public Map<String, TMQQDownloaderOpenSDKParam> mDownloadParams;
    public int sdkAPILevel;

    private TMQQDownloaderOpenSDK() {
        this.sdkAPILevel = 1;
        this.mDownloadParams = null;
        this.mDownloadParams = new ConcurrentHashMap();
    }

    public static String about() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    public static synchronized TMQQDownloaderOpenSDK getInstance() {
        TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK;
        synchronized (TMQQDownloaderOpenSDK.class) {
            if (mInstance == null) {
                mInstance = new TMQQDownloaderOpenSDK();
            }
            tMQQDownloaderOpenSDK = mInstance;
        }
        return tMQQDownloaderOpenSDK;
    }

    public static boolean isExistActoin(long j) {
        ArrayList<TMAssistantSDKChannelDataItem> channelDataItemList;
        if (j >= 0 && (channelDataItemList = new TMAssistantSDKChannel().getChannelDataItemList()) != null && channelDataItemList.size() > 0) {
            Iterator<TMAssistantSDKChannelDataItem> it = channelDataItemList.iterator();
            while (it.hasNext()) {
                TMAssistantSDKChannelDataItem next = it.next();
                if (((long) next.mDBIdentity) == j && next.mDataItemEndTime - next.mDataItemStartTime <= 300000) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFileExist(String str) {
        return new C86009m1(str).mo119967g();
    }

    private void relateToQQDownloader(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str) {
        Map<String, String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, false, false);
        formatMapParams.put("taskid", str);
        String formatIntentUriPath = super.formatIntentUriPath(4, formatMapParams);
        Intent intent = new Intent("com.tencent.android.qqdownloader.action.RELATED");
        intent.setPackage("com.tencent.android.qqdownloader");
        intent.putExtra("command", "cmd_updatedownload");
        intent.putExtra("relatedurl", formatIntentUriPath);
        context.sendBroadcast(intent);
    }

    public long addDownloadTaskFromAppDetail(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        if (!(this.mDownloadParams == null || tMQQDownloaderOpenSDKParam == null)) {
            this.mDownloadParams.put(UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z, z2, tMQQDownloaderOpenSDKParam.actionFlag, (String) null, 2);
    }

    public long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str) {
        if (!(this.mDownloadParams == null || tMQQDownloaderOpenSDKParam == null)) {
            this.mDownloadParams.put(UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, true, true, tMQQDownloaderOpenSDKParam.actionFlag, str, 3);
    }

    public long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        if (!(this.mDownloadParams == null || tMQQDownloaderOpenSDKParam == null)) {
            this.mDownloadParams.put(UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z, z2, tMQQDownloaderOpenSDKParam.actionFlag, (String) null, 1);
    }

    public int checkQQDownloaderInstalled(int i) {
        Context context = this.mContext;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
                        return 1;
                    }
                    return (this.sdkAPILevel <= GlobalUtil.getInstance().getQQDownloaderAPILevel() && i <= GlobalUtil.getInstance().getQQDownloaderVersionCode()) ? 0 : 2;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.printErrStackTrace("QQDownloaderOpenSDK", e, "", new Object[0]);
                }
            }
            return 1;
        }
        throw new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
    }

    public void destroyQQDownloaderOpenSDK() {
        NetworkMonitorReceiver.getInstance().unregisterReceiver();
        GetSettingEngine.getInstance().cancleRequest();
        LogReportManager.getInstance().cancleReport();
        LogReportManager.getInstance().destory();
        if (this.mContext != null) {
            DownloadStateChangedReceiver.getInstance().unRegisteReceiver(this.mContext);
            DownloadStateChangedReceiver.getInstance().removeDownloadStateChangedListener(this);
        }
        GlobalUtil.getInstance().destroy();
        this.mContext = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0190, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0191, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r4.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0190 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam r26) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            java.lang.String r2 = "relate to qqdownloader , packageName = "
            java.lang.String r3 = "QQDownloaderOpenSDK"
            android.content.Context r4 = r1.mContext
            if (r4 == 0) goto L_0x01bb
            if (r0 == 0) goto L_0x01b3
            android.content.ContentResolver r5 = r4.getContentResolver()
            r4 = 0
            r11 = 0
            android.net.Uri r6 = CONTENT_URI     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r7 = 0
            java.lang.String r8 = "packageName=? and versionCode=? and channelId=?"
            r12 = 3
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            java.lang.String r10 = r0.taskPackageName     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r9[r11] = r10     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            int r10 = r0.taskVersion     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r13 = 1
            r9[r13] = r10     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r10 = 2
            java.lang.String r14 = r0.channelId     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r9[r10] = r14     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            r10 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0199, all -> 0x0196 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.<init>()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = "getDownloadTaskState from qqdownloader , taskPackageName = "
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = r0.taskPackageName     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = ", taskVersion="
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            int r7 = r0.taskVersion     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = ", channelId="
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = r0.channelId     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            com.tencent.tmassistantsdk.util.TMLog.m164112d(r3, r6)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            if (r5 == 0) goto L_0x0189
            boolean r6 = r5.moveToFirst()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            if (r6 == 0) goto L_0x0189
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.<init>()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.append(r2)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r7 = r0.taskPackageName     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r6.append(r7)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r3, r6)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r6 = "apkId"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            long r6 = r5.getLong(r6)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r8 = "apkUrl"
            int r8 = r5.getColumnIndex(r8)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r8 = r5.getString(r8)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.util.ArrayList r8 = com.tencent.tmassistantsdk.util.GlobalUtil.String2List(r8)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.Object r8 = r8.get(r11)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r9 = "filePath"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r9 = r5.getString(r9)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r10 = "received_length"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            long r18 = r5.getLong(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r10 = "total_length"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            long r20 = r5.getLong(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r22 = "application/vnd.android.package-archive"
            java.lang.String r10 = "state"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            int r10 = r5.getInt(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            int r10 = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r14.<init>()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r15 = "getDownloadTaskState state = "
            r14.append(r15)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r14.append(r10)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r3, r14)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r15 = 4
            if (r15 != r10) goto L_0x00f0
            boolean r14 = r1.isFileExist(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x0190 }
            if (r14 != 0) goto L_0x00f0
            r5.close()
            return r4
        L_0x00ea:
            r0 = move-exception
            r24 = r4
            r4 = r5
            goto L_0x019d
        L_0x00f0:
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r23 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r14 = r23
            r4 = 4
            r15 = r8
            r16 = r9
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r20, r22)     // Catch:{ Exception -> 0x0193, all -> 0x0190 }
            r9 = 5
            if (r10 == r9) goto L_0x0104
            if (r10 == r4) goto L_0x0104
            if (r10 != r12) goto L_0x0121
        L_0x0104:
            com.tencent.tmassistantsdk.logreport.DownloadReportManager r4 = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo r4 = r4.createNewChunkLogInfo(r13)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r9 = r0.via     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.via = r9     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.appId = r9     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.resultState = r10     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.requestUrl = r8     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            com.tencent.tmassistantsdk.logreport.DownloadReportManager r8 = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r8.addLogData(r4)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
        L_0x0121:
            java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> r4 = r1.mDownloadParams     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            if (r4 == 0) goto L_0x0181
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
        L_0x012d:
            boolean r8 = r4.hasNext()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            if (r8 == 0) goto L_0x0152
            java.lang.Object r8 = r4.next()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam r8 = (com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam) r8     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            if (r8 == 0) goto L_0x012d
            java.lang.String r9 = r8.taskPackageName     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r10 = r0.taskPackageName     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            if (r9 == 0) goto L_0x012d
            int r8 = r8.taskVersion     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            int r9 = r0.taskVersion     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            if (r8 != r9) goto L_0x012d
            goto L_0x0153
        L_0x0152:
            r13 = 0
        L_0x0153:
            if (r13 != 0) goto L_0x0181
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.<init>()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.append(r2)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r2 = r0.taskPackageName     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.append(r2)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r3, r2)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r0.taskApkId = r4     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> r4 = r1.mDownloadParams     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r4.put(r2, r0)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            android.content.Context r4 = r1.mContext     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
            r1.relateToQQDownloader(r4, r0, r2)     // Catch:{ Exception -> 0x0184, all -> 0x0190 }
        L_0x0181:
            r4 = r23
            goto L_0x018a
        L_0x0184:
            r0 = move-exception
            r4 = r5
            r24 = r23
            goto L_0x019d
        L_0x0189:
            r4 = 0
        L_0x018a:
            if (r5 == 0) goto L_0x01ab
            r5.close()
            goto L_0x01ab
        L_0x0190:
            r0 = move-exception
            r4 = r5
            goto L_0x01ad
        L_0x0193:
            r0 = move-exception
            r4 = r5
            goto L_0x019b
        L_0x0196:
            r0 = move-exception
            r4 = 0
            goto L_0x01ad
        L_0x0199:
            r0 = move-exception
            r4 = 0
        L_0x019b:
            r24 = 0
        L_0x019d:
            java.lang.String r2 = ""
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r5)     // Catch:{ all -> 0x01ac }
            if (r4 == 0) goto L_0x01a9
            r4.close()
        L_0x01a9:
            r4 = r24
        L_0x01ab:
            return r4
        L_0x01ac:
            r0 = move-exception
        L_0x01ad:
            if (r4 == 0) goto L_0x01b2
            r4.close()
        L_0x01b2:
            throw r0
        L_0x01b3:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = "QQDownloaderParam param cann't is null!"
            r0.<init>(r2)
            throw r0
        L_0x01bb:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = "Context shouldn't be null !"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK.getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam):com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo");
    }

    public void initQQDownloaderOpenSDK(Context context) {
        this.mContext = context;
        this.hostPackageName = context.getPackageName();
        this.hostVersionCode = GlobalUtil.getAppVersionCode(this.mContext);
        GlobalUtil.getInstance().setContext(this.mContext);
        this.sdkAPILevel = 1;
        DownloadStateChangedReceiver.getInstance().registeReceiver(this.mContext);
        DownloadStateChangedReceiver.getInstance().addDownloadStateChangedListener(this);
        NetworkMonitorReceiver.getInstance().registerReceiver();
        GetSettingEngine.getInstance().sendRequest();
        LogReportManager.getInstance().reportLog();
    }

    public void onDownloadStateChanged(TMQQDownloaderStateChangeParam tMQQDownloaderStateChangeParam) {
        TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = tMQQDownloaderStateChangeParam.param;
        int assistantState2SDKState = GlobalUtil.assistantState2SDKState(tMQQDownloaderStateChangeParam.state);
        int assistantErrorCode2SDKErrorCode = GlobalUtil.assistantErrorCode2SDKErrorCode(tMQQDownloaderStateChangeParam.errorCode);
        String str = tMQQDownloaderStateChangeParam.errorMsg;
        String str2 = tMQQDownloaderStateChangeParam.taskId;
        TMLog.m164114i("QQDownloaderOpenSDK", "onDownloadStateChanged state = " + assistantState2SDKState);
        TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam2 = (str2 == null || str2.trim().length() <= 0) ? null : this.mDownloadParams.get(str2);
        if (tMQQDownloaderOpenSDKParam2 != null) {
            onStateChanged(tMQQDownloaderOpenSDKParam2, assistantState2SDKState, assistantErrorCode2SDKErrorCode, str);
        } else {
            TMLog.m164114i("QQDownloaderOpenSDK", "onDownloadStateChanged storeParam = null");
        }
        if (6 == assistantState2SDKState) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : this.mDownloadParams.entrySet()) {
                TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam3 = (TMQQDownloaderOpenSDKParam) next.getValue();
                String str3 = (String) next.getKey();
                if (tMQQDownloaderOpenSDKParam3 != null && !TextUtils.isEmpty(tMQQDownloaderOpenSDKParam.taskPackageName) && tMQQDownloaderOpenSDKParam3.taskPackageName.equals(tMQQDownloaderOpenSDKParam.taskPackageName) && tMQQDownloaderOpenSDKParam3.taskVersion == tMQQDownloaderOpenSDKParam.taskVersion) {
                    arrayList.add(str3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.mDownloadParams.remove((String) it.next());
            }
        }
    }

    public void startQQDownloader(Context context) {
        if (context != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.android.qqdownloader");
            if (context instanceof Application) {
                launchIntentForPackage.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(launchIntentForPackage);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void startToAppDetail(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        if (context != null) {
            String uuid = UUID.randomUUID().toString();
            Map<String, TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
            if (map != null) {
                map.put(uuid, tMQQDownloaderOpenSDKParam);
            }
            if (z) {
                DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
                createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
                createNewChunkLogInfo.UUID = uuid;
                createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
                createNewChunkLogInfo.resultState = 1;
                DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            }
            Map<String, String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, z, z2);
            formatMapParams.put("taskid", uuid);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(2, formatMapParams)));
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        throw new Exception("you must input an application or activity context!");
    }

    public void startToAuthorized(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str) {
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (tMQQDownloaderOpenSDKParam != null) {
            String uuid = UUID.randomUUID().toString();
            Map<String, TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
            if (map != null) {
                map.put(uuid, tMQQDownloaderOpenSDKParam);
            }
            DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            Map<String, String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, true, true);
            formatMapParams.put("verifytype", str);
            formatMapParams.put("taskid", uuid);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(3, formatMapParams)));
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            throw new Exception("QQDownloaderParam param cann't be null!");
        }
    }

    public void startToDownloadTaskList(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (tMQQDownloaderOpenSDKParam != null) {
            String uuid = UUID.randomUUID().toString();
            Map<String, TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
            if (map != null) {
                map.put(uuid, tMQQDownloaderOpenSDKParam);
            }
            if (z) {
                DownloadChunkLogInfo createNewChunkLogInfo = DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
                createNewChunkLogInfo.UUID = uuid;
                createNewChunkLogInfo.requestUrl = "";
                createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
                createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
                DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            }
            Map<String, String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, z, z2);
            formatMapParams.put("taskid", uuid);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(super.formatIntentUriPath(1, formatMapParams)));
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void startToWebView(Context context, String str) {
        if (context == null) {
            throw new Exception("you must input an application or activity context!");
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            String formatIntentUriPath = super.formatIntentUriPath(5, hashMap);
            TMLog.m164114i("QQDownloaderOpenSDK", "startToWebView finalPath:" + formatIntentUriPath);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(formatIntentUriPath));
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            throw new Exception("param url shouldn't be null!");
        }
    }

    public long addDownloadTaskFromAuthorize(String str) {
        String formatEncryptUrl = super.formatEncryptUrl(str);
        long currentTimeMillis = System.currentTimeMillis();
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatEncryptUrl, currentTimeMillis, currentTimeMillis + 300000, 0, (byte[]) null);
    }

    public void startToAuthorized(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(formatEncryptUrl(str)));
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
