package com.tencent.tmassistantsdk.logreport;

import com.p013qq.taf.jce.JceStruct;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseReportManager implements ILogReportHttpListener {
    public static final int MAX_READ_COUNT = 1000;
    public static final String TAG = "BaseReportManager";
    public final List<Long> idLists = new ArrayList();
    public int maxReportCount = 0;
    public LogReportHttpRequest reportRequest = null;

    public synchronized void addLogData(JceStruct jceStruct) {
        TMLog.m164114i(TAG, "addLogData,loginfo");
        if (jceStruct != null) {
            getLogTable().save(ProtocolPackage.jceStructToUTF8Byte(jceStruct));
        }
    }

    public void cancleRequest() {
        LogReportHttpRequest logReportHttpRequest = this.reportRequest;
        if (logReportHttpRequest != null) {
            logReportHttpRequest.cancleRequest();
            this.reportRequest = null;
        }
    }

    public void destroy() {
        this.reportRequest = null;
        this.idLists.clear();
    }

    public abstract BaseLogTable getLogTable();

    public abstract byte getReportType();

    public void onLogReprotHttpRequestFinish(LogReportHttpRequest logReportHttpRequest, boolean z) {
        List<Long> list;
        TMLog.m164114i(TAG, "onLogReprotHttpRequestFinish,result:" + z);
        if (z && (list = this.idLists) != null && list.size() > 0) {
            getLogTable().delete(this.idLists);
        }
        this.reportRequest = null;
        this.idLists.clear();
        if (z && this.maxReportCount < 5) {
            TMLog.m164114i(TAG, "onLogReprotHttpRequestFinish wifi is true reportlog go on,result:" + z + " count:" + this.maxReportCount);
            reportLogData();
            this.maxReportCount = this.maxReportCount + 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void reportLogData() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.tencent.tmassistantsdk.util.GlobalUtil r0 = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance()     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.canReportValue()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r4)
            return
        L_0x000d:
            java.lang.String r0 = "BaseReportManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = "reportLogData,request:"
            r1.append(r2)     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.logreport.LogReportHttpRequest r2 = r4.reportRequest     // Catch:{ all -> 0x0080 }
            r1.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r1)     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.logreport.LogReportHttpRequest r0 = r4.reportRequest     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x002b
            monitor-exit(r4)
            return
        L_0x002b:
            com.tencent.tmassistantsdk.logreport.LogReportHttpRequest r0 = new com.tencent.tmassistantsdk.logreport.LogReportHttpRequest     // Catch:{ all -> 0x0080 }
            r0.<init>()     // Catch:{ all -> 0x0080 }
            r4.reportRequest = r0     // Catch:{ all -> 0x0080 }
            r0.setmListener(r4)     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.storage.table.BaseLogTable r0 = r4.getLogTable()     // Catch:{ all -> 0x0080 }
            r1 = 1000(0x3e8, float:1.401E-42)
            com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper r0 = r0.getDatas(r1)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "BaseReportManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "readLogDataAndSendToServer,wrappterCount:"
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            java.util.List<byte[]> r3 = r0.dataList     // Catch:{ all -> 0x0080 }
            int r3 = r3.size()     // Catch:{ all -> 0x0080 }
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r2)     // Catch:{ all -> 0x0080 }
            java.util.List<byte[]> r1 = r0.dataList     // Catch:{ all -> 0x0080 }
            int r1 = r1.size()     // Catch:{ all -> 0x0080 }
            r2 = 0
            if (r1 > 0) goto L_0x0066
            r0 = 0
            goto L_0x0077
        L_0x0066:
            java.util.List<java.lang.Long> r1 = r4.idLists     // Catch:{ all -> 0x0080 }
            java.util.List<java.lang.Long> r3 = r0.idList     // Catch:{ all -> 0x0080 }
            r1.addAll(r3)     // Catch:{ all -> 0x0080 }
            com.tencent.tmassistantsdk.logreport.LogReportHttpRequest r1 = r4.reportRequest     // Catch:{ all -> 0x0080 }
            byte r3 = r4.getReportType()     // Catch:{ all -> 0x0080 }
            boolean r0 = r1.sendLogDataToServer(r3, r0)     // Catch:{ all -> 0x0080 }
        L_0x0077:
            if (r0 != 0) goto L_0x007e
            r4.maxReportCount = r2     // Catch:{ all -> 0x0080 }
            r0 = 0
            r4.reportRequest = r0     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r4)
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.logreport.BaseReportManager.reportLogData():void");
    }

    public void resetMaxReportCount() {
        this.maxReportCount = 0;
    }
}
