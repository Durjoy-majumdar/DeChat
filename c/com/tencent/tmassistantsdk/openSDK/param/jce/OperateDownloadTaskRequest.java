package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class OperateDownloadTaskRequest extends JceStruct {
    public static IPCBaseParam cache_baseParam;
    public String actionFlag;
    public IPCBaseParam baseParam;
    public String opList;
    public int requestType;
    public String verifyType;

    public OperateDownloadTaskRequest() {
        this.requestType = 0;
        this.baseParam = null;
        this.opList = "";
        this.actionFlag = "";
        this.verifyType = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.requestType = jceInputStream.read(this.requestType, 0, true);
        if (cache_baseParam == null) {
            cache_baseParam = new IPCBaseParam();
        }
        this.baseParam = (IPCBaseParam) jceInputStream.read((JceStruct) cache_baseParam, 1, true);
        this.opList = jceInputStream.readString(2, false);
        this.actionFlag = jceInputStream.readString(3, false);
        this.verifyType = jceInputStream.readString(4, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestType, 0);
        jceOutputStream.write((JceStruct) this.baseParam, 1);
        String str = this.opList;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        String str2 = this.actionFlag;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        String str3 = this.verifyType;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
    }

    public OperateDownloadTaskRequest(int i, IPCBaseParam iPCBaseParam, String str, String str2, String str3) {
        this.requestType = i;
        this.baseParam = iPCBaseParam;
        this.opList = str;
        this.actionFlag = str2;
        this.verifyType = str3;
    }
}
