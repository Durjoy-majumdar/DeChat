package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;

public final class FileUpdateRsp extends MapJceStruct {
    public int iFileSize;
    public int iFileUpdated;
    public int iRet;
    public int iVersion;
    public String sMd5;
    public String sName;
    public String sUpdateUrl;

    public FileUpdateRsp() {
        this.sName = "";
        this.iRet = 0;
        this.iVersion = 0;
        this.iFileUpdated = 0;
        this.sUpdateUrl = "";
        this.sMd5 = "";
        this.iFileSize = 0;
    }

    public final String className() {
        return "MapConfProtocol.FileUpdateRsp";
    }

    public final void readFrom(C113953m mVar) {
        this.sName = mVar.mo172389b(0, true);
        this.iRet = mVar.mo172379a(this.iRet, 1, true);
        this.iVersion = mVar.mo172379a(this.iVersion, 2, true);
        this.iFileUpdated = mVar.mo172379a(this.iFileUpdated, 3, false);
        this.sUpdateUrl = mVar.mo172389b(4, false);
        this.sMd5 = mVar.mo172389b(5, false);
        this.iFileSize = mVar.mo172379a(this.iFileSize, 6, false);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("FileUpdateRsp{");
        stringBuffer.append("sName='");
        stringBuffer.append(this.sName);
        stringBuffer.append('\'');
        stringBuffer.append(", iRet=");
        stringBuffer.append(this.iRet);
        stringBuffer.append(", iVersion=");
        stringBuffer.append(this.iVersion);
        stringBuffer.append(", iFileUpdated=");
        stringBuffer.append(this.iFileUpdated);
        stringBuffer.append(", sUpdateUrl='");
        stringBuffer.append(this.sUpdateUrl);
        stringBuffer.append('\'');
        stringBuffer.append(", sMd5='");
        stringBuffer.append(this.sMd5);
        stringBuffer.append('\'');
        stringBuffer.append(", iFileSize=");
        stringBuffer.append(this.iFileSize);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172517a(this.sName, 0);
        nVar.mo172513a(this.iRet, 1);
        nVar.mo172513a(this.iVersion, 2);
        nVar.mo172513a(this.iFileUpdated, 3);
        String str = this.sUpdateUrl;
        if (str != null) {
            nVar.mo172517a(str, 4);
        }
        String str2 = this.sMd5;
        if (str2 != null) {
            nVar.mo172517a(str2, 5);
        }
        nVar.mo172513a(this.iFileSize, 6);
    }

    public FileUpdateRsp(String str, int i, int i2, int i3, String str2, String str3, int i4) {
        this.sName = str;
        this.iRet = i;
        this.iVersion = i2;
        this.iFileUpdated = i3;
        this.sUpdateUrl = str2;
        this.sMd5 = str3;
        this.iFileSize = i4;
    }
}
