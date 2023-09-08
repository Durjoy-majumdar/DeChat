package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class BatchDownloadActionResponse extends JceStruct {
    public static ArrayList<IPCQueryDownloadInfo> cache_batchData;
    public ArrayList<IPCQueryDownloadInfo> batchData;
    public int batchRequestType;

    public BatchDownloadActionResponse() {
        this.batchRequestType = 0;
        this.batchData = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.batchRequestType = jceInputStream.read(this.batchRequestType, 0, true);
        if (cache_batchData == null) {
            cache_batchData = new ArrayList<>();
            cache_batchData.add(new IPCQueryDownloadInfo());
        }
        this.batchData = (ArrayList) jceInputStream.read(cache_batchData, 1, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.batchRequestType, 0);
        ArrayList<IPCQueryDownloadInfo> arrayList = this.batchData;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 1);
        }
    }

    public BatchDownloadActionResponse(int i, ArrayList<IPCQueryDownloadInfo> arrayList) {
        this.batchRequestType = i;
        this.batchData = arrayList;
    }
}
