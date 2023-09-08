package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;

public final class FileUpdateReq extends MapJceStruct {
    public int iVersion;
    public String sMd5;
    public String sName;

    public FileUpdateReq() {
        this.sName = "";
        this.iVersion = 0;
        this.sMd5 = "";
    }

    public final String className() {
        return "MapConfProtocol.FileUpdateReq";
    }

    public final void readFrom(C113953m mVar) {
        this.sName = mVar.mo172389b(0, true);
        this.iVersion = mVar.mo172379a(this.iVersion, 1, true);
        this.sMd5 = mVar.mo172389b(2, false);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("FileUpdateReq{");
        stringBuffer.append("sName='");
        stringBuffer.append(this.sName);
        stringBuffer.append('\'');
        stringBuffer.append(", iVersion=");
        stringBuffer.append(this.iVersion);
        stringBuffer.append(", sMd5='");
        stringBuffer.append(this.sMd5);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172517a(this.sName, 0);
        nVar.mo172513a(this.iVersion, 1);
        String str = this.sMd5;
        if (str != null) {
            nVar.mo172517a(str, 2);
        }
    }

    public FileUpdateReq(String str, int i, String str2) {
        this.sName = str;
        this.iVersion = i;
        this.sMd5 = str2;
    }
}
