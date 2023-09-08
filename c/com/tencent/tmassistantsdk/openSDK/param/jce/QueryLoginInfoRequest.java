package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class QueryLoginInfoRequest extends JceStruct {
    public String addtion;

    public QueryLoginInfoRequest() {
        this.addtion = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.addtion = jceInputStream.readString(0, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.addtion;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
    }

    public QueryLoginInfoRequest(String str) {
        this.addtion = str;
    }
}
