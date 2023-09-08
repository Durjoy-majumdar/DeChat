package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class URIActionRequest extends JceStruct {
    public String uri;

    public URIActionRequest() {
        this.uri = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.uri = jceInputStream.readString(0, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.uri, 0);
    }

    public URIActionRequest(String str) {
        this.uri = str;
    }
}
