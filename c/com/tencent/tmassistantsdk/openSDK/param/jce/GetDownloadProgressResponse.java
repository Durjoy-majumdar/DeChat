package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class GetDownloadProgressResponse extends JceStruct {
    public static IPCBaseParam cache_requestParam;
    public long allTaskTotalLength;
    public long allTaskTotalProgress;
    public long receivedLen;
    public IPCBaseParam requestParam;
    public long totalLen;

    public GetDownloadProgressResponse() {
        this.requestParam = null;
        this.receivedLen = 0;
        this.totalLen = 0;
        this.allTaskTotalProgress = 0;
        this.allTaskTotalLength = 0;
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_requestParam == null) {
            cache_requestParam = new IPCBaseParam();
        }
        this.requestParam = (IPCBaseParam) jceInputStream.read((JceStruct) cache_requestParam, 0, true);
        this.receivedLen = jceInputStream.read(this.receivedLen, 1, false);
        this.totalLen = jceInputStream.read(this.totalLen, 2, false);
        this.allTaskTotalProgress = jceInputStream.read(this.allTaskTotalProgress, 3, false);
        this.allTaskTotalLength = jceInputStream.read(this.allTaskTotalLength, 4, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((JceStruct) this.requestParam, 0);
        jceOutputStream.write(this.receivedLen, 1);
        jceOutputStream.write(this.totalLen, 2);
        jceOutputStream.write(this.allTaskTotalProgress, 3);
        jceOutputStream.write(this.allTaskTotalLength, 4);
    }

    public GetDownloadProgressResponse(IPCBaseParam iPCBaseParam, long j, long j2, long j3, long j4) {
        this.requestParam = iPCBaseParam;
        this.receivedLen = j;
        this.totalLen = j2;
        this.allTaskTotalProgress = j3;
        this.allTaskTotalLength = j4;
    }
}
