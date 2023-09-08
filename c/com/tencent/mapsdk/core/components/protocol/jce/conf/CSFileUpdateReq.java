package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import java.util.ArrayList;

public final class CSFileUpdateReq extends MapJceStruct {

    /* renamed from: a */
    public static ArrayList<FileUpdateReq> f339560a = new ArrayList<>();
    public String sAppId;
    public String sCity;
    public String sEngineVersion;
    public String sId;
    public String sSDKVersion;
    public ArrayList<FileUpdateReq> vItems;

    static {
        f339560a.add(new FileUpdateReq());
    }

    public CSFileUpdateReq() {
        this.vItems = null;
        this.sAppId = "";
        this.sSDKVersion = "";
        this.sCity = "";
        this.sEngineVersion = "";
        this.sId = "";
    }

    public final String className() {
        return "MapConfProtocol.CSFileUpdateReq";
    }

    public final void readFrom(C113953m mVar) {
        this.vItems = (ArrayList) mVar.mo172384a(f339560a, 0, true);
        this.sAppId = mVar.mo172389b(1, false);
        this.sSDKVersion = mVar.mo172389b(2, false);
        this.sCity = mVar.mo172389b(3, false);
        this.sEngineVersion = mVar.mo172389b(4, false);
        this.sId = mVar.mo172389b(5, false);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CSFileUpdateReq{");
        stringBuffer.append("vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append(", sAppId='");
        stringBuffer.append(this.sAppId);
        stringBuffer.append('\'');
        stringBuffer.append(", sSDKVersion='");
        stringBuffer.append(this.sSDKVersion);
        stringBuffer.append('\'');
        stringBuffer.append(", sCity='");
        stringBuffer.append(this.sCity);
        stringBuffer.append('\'');
        stringBuffer.append(", sEngineVersion='");
        stringBuffer.append(this.sEngineVersion);
        stringBuffer.append('\'');
        stringBuffer.append(", sId='");
        stringBuffer.append(this.sId);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172518a(this.vItems, 0);
        String str = this.sAppId;
        if (str != null) {
            nVar.mo172517a(str, 1);
        }
        String str2 = this.sSDKVersion;
        if (str2 != null) {
            nVar.mo172517a(str2, 2);
        }
        String str3 = this.sCity;
        if (str3 != null) {
            nVar.mo172517a(str3, 3);
        }
        String str4 = this.sEngineVersion;
        if (str4 != null) {
            nVar.mo172517a(str4, 4);
        }
        String str5 = this.sId;
        if (str5 != null) {
            nVar.mo172517a(str5, 5);
        }
    }

    public CSFileUpdateReq(ArrayList<FileUpdateReq> arrayList, String str, String str2, String str3, String str4, String str5) {
        this.vItems = arrayList;
        this.sAppId = str;
        this.sSDKVersion = str2;
        this.sCity = str3;
        this.sEngineVersion = str4;
        this.sId = str5;
    }
}
