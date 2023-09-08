package com.tencent.tmassistantsdk.logreport;

import com.p013qq.taf.jce.JceStruct;
import com.tencent.tmassistantsdk.network.PostHttpRequest;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public class LogReportHttpRequest extends PostHttpRequest {
    public ILogReportHttpListener mListener = null;

    public void onFinished(JceStruct jceStruct, JceStruct jceStruct2, int i) {
        if (jceStruct2 != null) {
            ILogReportHttpListener iLogReportHttpListener = this.mListener;
            if (iLogReportHttpListener == null || i != 0) {
                TMLog.m164114i("LogReportHttpRequest", "mListener is null !");
            } else if (!(jceStruct2 instanceof ReportLogResponse)) {
                TMLog.m164114i("LogReportHttpRequest", "response isn't instanceof ReportLogResponse !");
            } else if (((ReportLogResponse) jceStruct2).ret == 0) {
                iLogReportHttpListener.onLogReprotHttpRequestFinish(this, true);
            } else {
                iLogReportHttpListener.onLogReprotHttpRequestFinish(this, false);
            }
        }
    }

    public boolean sendLogDataToServer(byte b, BaseLogTable.DataWrapper dataWrapper) {
        if (dataWrapper == null) {
            return false;
        }
        return super.sendRequest((ReportLogRequest) ProtocolPackage.buildReportRequest(b, dataWrapper.dataList, GlobalUtil.getAppPackageName(GlobalUtil.getInstance().getContext()), GlobalUtil.getAppVersionCode(GlobalUtil.getInstance().getContext()), ""));
    }

    public void setmListener(ILogReportHttpListener iLogReportHttpListener) {
        this.mListener = iLogReportHttpListener;
    }
}
