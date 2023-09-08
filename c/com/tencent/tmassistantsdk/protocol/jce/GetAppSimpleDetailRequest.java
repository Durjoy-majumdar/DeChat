package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class GetAppSimpleDetailRequest extends JceStruct {
    public static ArrayList<AppDetailParam> cache_appReqList;
    public ArrayList<AppDetailParam> appReqList;

    public GetAppSimpleDetailRequest() {
        this.appReqList = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_appReqList == null) {
            cache_appReqList = new ArrayList<>();
            cache_appReqList.add(new AppDetailParam());
        }
        this.appReqList = (ArrayList) jceInputStream.read(cache_appReqList, 0, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        ArrayList<AppDetailParam> arrayList = this.appReqList;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 0);
        }
    }

    public GetAppSimpleDetailRequest(ArrayList<AppDetailParam> arrayList) {
        this.appReqList = arrayList;
    }
}
