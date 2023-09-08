package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class ApkDownUrl extends JceStruct {
    public static ArrayList<String> cache_urlList;
    public byte type;
    public ArrayList<String> urlList;

    public ApkDownUrl() {
        this.type = 0;
        this.urlList = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.type = jceInputStream.read(this.type, 0, true);
        if (cache_urlList == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            cache_urlList = arrayList;
            arrayList.add("");
        }
        this.urlList = (ArrayList) jceInputStream.read(cache_urlList, 1, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write(this.urlList, 1);
    }

    public ApkDownUrl(byte b, ArrayList<String> arrayList) {
        this.type = b;
        this.urlList = arrayList;
    }
}
