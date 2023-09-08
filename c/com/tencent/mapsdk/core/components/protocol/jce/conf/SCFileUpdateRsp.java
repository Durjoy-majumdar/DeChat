package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import java.util.ArrayList;

public final class SCFileUpdateRsp extends MapJceStruct {

    /* renamed from: a */
    public static ArrayList<FileUpdateRsp> f339561a = new ArrayList<>();
    public int iRet;
    public ArrayList<FileUpdateRsp> vItems;

    static {
        f339561a.add(new FileUpdateRsp());
    }

    public SCFileUpdateRsp() {
        this.iRet = 0;
        this.vItems = null;
    }

    public final String className() {
        return "MapConfProtocol.SCFileUpdateRsp";
    }

    public final void readFrom(C113953m mVar) {
        this.iRet = mVar.mo172379a(this.iRet, 0, true);
        this.vItems = (ArrayList) mVar.mo172384a(f339561a, 1, false);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("SCFileUpdateRsp{");
        stringBuffer.append("iRet=");
        stringBuffer.append(this.iRet);
        stringBuffer.append(", vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172513a(this.iRet, 0);
        ArrayList<FileUpdateRsp> arrayList = this.vItems;
        if (arrayList != null) {
            nVar.mo172518a(arrayList, 1);
        }
    }

    public SCFileUpdateRsp(int i, ArrayList<FileUpdateRsp> arrayList) {
        this.iRet = i;
        this.vItems = arrayList;
    }
}
