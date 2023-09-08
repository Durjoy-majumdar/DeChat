package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class QueryDownloadTaskResponse extends JceStruct {
    public long allTaskTotalLength;
    public long allTaskTotalProgress;
    public long receivedLen;
    public String savePath;
    public int state;
    public long totalLen;
    public String url;

    public QueryDownloadTaskResponse() {
        this.url = "";
        this.savePath = "";
        this.state = 0;
        this.receivedLen = 0;
        this.totalLen = 0;
        this.allTaskTotalProgress = 0;
        this.allTaskTotalLength = 0;
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.url = jceInputStream.readString(0, true);
        this.savePath = jceInputStream.readString(1, false);
        this.state = jceInputStream.read(this.state, 2, false);
        this.receivedLen = jceInputStream.read(this.receivedLen, 3, false);
        this.totalLen = jceInputStream.read(this.totalLen, 4, false);
        this.allTaskTotalProgress = jceInputStream.read(this.allTaskTotalProgress, 5, false);
        this.allTaskTotalLength = jceInputStream.read(this.allTaskTotalLength, 6, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.url, 0);
        String str = this.savePath;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.state, 2);
        jceOutputStream.write(this.receivedLen, 3);
        jceOutputStream.write(this.totalLen, 4);
        jceOutputStream.write(this.allTaskTotalProgress, 5);
        jceOutputStream.write(this.allTaskTotalLength, 6);
    }

    public QueryDownloadTaskResponse(String str, String str2, int i, long j, long j2, long j3, long j4) {
        this.url = str;
        this.savePath = str2;
        this.state = i;
        this.receivedLen = j;
        this.totalLen = j2;
        this.allTaskTotalProgress = j3;
        this.allTaskTotalLength = j4;
    }
}
