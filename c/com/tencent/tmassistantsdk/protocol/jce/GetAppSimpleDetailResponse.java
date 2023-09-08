package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class GetAppSimpleDetailResponse extends JceStruct {
    public static ArrayList<AppSimpleDetail> cache_appSimpleDetailList;
    public ArrayList<AppSimpleDetail> appSimpleDetailList;
    public int ret;

    public GetAppSimpleDetailResponse() {
        this.ret = 0;
        this.appSimpleDetailList = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.ret = jceInputStream.read(this.ret, 0, true);
        if (cache_appSimpleDetailList == null) {
            cache_appSimpleDetailList = new ArrayList<>();
            cache_appSimpleDetailList.add(new AppSimpleDetail());
        }
        this.appSimpleDetailList = (ArrayList) jceInputStream.read(cache_appSimpleDetailList, 1, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
        jceOutputStream.write(this.appSimpleDetailList, 1);
    }

    public GetAppSimpleDetailResponse(int i, ArrayList<AppSimpleDetail> arrayList) {
        this.ret = i;
        this.appSimpleDetailList = arrayList;
    }
}
