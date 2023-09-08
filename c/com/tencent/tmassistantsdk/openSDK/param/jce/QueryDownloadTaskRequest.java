package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class QueryDownloadTaskRequest extends JceStruct {
    public static IPCBaseParam cache_baseParam;
    public IPCBaseParam baseParam;

    public QueryDownloadTaskRequest() {
        this.baseParam = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_baseParam == null) {
            cache_baseParam = new IPCBaseParam();
        }
        this.baseParam = (IPCBaseParam) jceInputStream.read((JceStruct) cache_baseParam, 0, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((JceStruct) this.baseParam, 0);
    }

    public QueryDownloadTaskRequest(IPCBaseParam iPCBaseParam) {
        this.baseParam = iPCBaseParam;
    }
}
