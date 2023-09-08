package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class BatchDownloadActionRequest extends JceStruct {
    public static ArrayList<IPCDownloadParam> cache_batchData;
    public ArrayList<IPCDownloadParam> batchData;
    public int batchRequestType;
    public String uin;
    public String uinType;
    public String via;

    public BatchDownloadActionRequest() {
        this.batchRequestType = 0;
        this.batchData = null;
        this.uin = "";
        this.uinType = "";
        this.via = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.batchRequestType = jceInputStream.read(this.batchRequestType, 0, true);
        if (cache_batchData == null) {
            cache_batchData = new ArrayList<>();
            cache_batchData.add(new IPCDownloadParam());
        }
        this.batchData = (ArrayList) jceInputStream.read(cache_batchData, 1, false);
        this.uin = jceInputStream.readString(2, false);
        this.uinType = jceInputStream.readString(3, false);
        this.via = jceInputStream.readString(4, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.batchRequestType, 0);
        ArrayList<IPCDownloadParam> arrayList = this.batchData;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 1);
        }
        String str = this.uin;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        String str2 = this.uinType;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        String str3 = this.via;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
    }

    public BatchDownloadActionRequest(int i, ArrayList<IPCDownloadParam> arrayList, String str, String str2, String str3) {
        this.batchRequestType = i;
        this.batchData = arrayList;
        this.uin = str;
        this.uinType = str2;
        this.via = str3;
    }
}
