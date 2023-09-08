package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114029p;
import com.tencent.mapsdk.internal.C114095q;

public final class Header extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static CmdResult f339569a;

    /* renamed from: b */
    public static final /* synthetic */ boolean f339570b = true;
    public long lCurrTime;
    public CmdResult stResult;
    public String strChannel;
    public String strFr;
    public String strImei;
    public String strImsi;
    public String strLC;
    public String strMachineModel;
    public String strMobver;
    public String strNettp;
    public String strOfflineVersion;
    public String strOsVersion;
    public String strPf;
    public String strSessionId;
    public String strSoftVersion;
    public String strToken;
    public String strUserNetType;
    public long uAccIp;

    static {
        Class<Header> cls = Header.class;
    }

    public Header() {
        this.lCurrTime = 0;
        this.stResult = null;
        this.uAccIp = 0;
        this.strSessionId = "";
        this.strLC = "";
        this.strToken = "";
        this.strFr = "";
        this.strPf = "";
        this.strImei = "";
        this.strMobver = "";
        this.strNettp = "";
        this.strImsi = "";
        this.strOsVersion = "";
        this.strSoftVersion = "";
        this.strOfflineVersion = "";
        this.strChannel = "";
        this.strMachineModel = "";
        this.strUserNetType = "";
    }

    public final String className() {
        return "sosomap.Header";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339570b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172255a(this.lCurrTime, "lCurrTime");
        kVar.mo172257a((C114029p) this.stResult, "stResult");
        kVar.mo172255a(this.uAccIp, "uAccIp");
        kVar.mo172259a(this.strSessionId, "strSessionId");
        kVar.mo172259a(this.strLC, "strLC");
        kVar.mo172259a(this.strToken, "strToken");
        kVar.mo172259a(this.strFr, "strFr");
        kVar.mo172259a(this.strPf, "strPf");
        kVar.mo172259a(this.strImei, "strImei");
        kVar.mo172259a(this.strMobver, "strMobver");
        kVar.mo172259a(this.strNettp, "strNettp");
        kVar.mo172259a(this.strImsi, "strImsi");
        kVar.mo172259a(this.strOsVersion, "strOsVersion");
        kVar.mo172259a(this.strSoftVersion, "strSoftVersion");
        kVar.mo172259a(this.strOfflineVersion, "strOfflineVersion");
        kVar.mo172259a(this.strChannel, "strChannel");
        kVar.mo172259a(this.strMachineModel, "strMachineModel");
        kVar.mo172259a(this.strUserNetType, "strUserNetType");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172256a(this.lCurrTime, true);
        kVar.mo172258a((C114029p) this.stResult, true);
        kVar.mo172256a(this.uAccIp, true);
        kVar.mo172260a(this.strSessionId, true);
        kVar.mo172260a(this.strLC, true);
        kVar.mo172260a(this.strToken, true);
        kVar.mo172260a(this.strFr, true);
        kVar.mo172260a(this.strPf, true);
        kVar.mo172260a(this.strImei, true);
        kVar.mo172260a(this.strMobver, true);
        kVar.mo172260a(this.strNettp, true);
        kVar.mo172260a(this.strImsi, true);
        kVar.mo172260a(this.strOsVersion, true);
        kVar.mo172260a(this.strSoftVersion, true);
        kVar.mo172260a(this.strOfflineVersion, true);
        kVar.mo172260a(this.strChannel, true);
        kVar.mo172260a(this.strMachineModel, true);
        kVar.mo172260a(this.strUserNetType, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Header header = (Header) obj;
        return C114095q.m158990a(this.lCurrTime, header.lCurrTime) && C114095q.m158991a((Object) this.stResult, (Object) header.stResult) && C114095q.m158990a(this.uAccIp, header.uAccIp) && C114095q.m158991a((Object) this.strSessionId, (Object) header.strSessionId) && C114095q.m158991a((Object) this.strLC, (Object) header.strLC) && C114095q.m158991a((Object) this.strToken, (Object) header.strToken) && C114095q.m158991a((Object) this.strFr, (Object) header.strFr) && C114095q.m158991a((Object) this.strPf, (Object) header.strPf) && C114095q.m158991a((Object) this.strImei, (Object) header.strImei) && C114095q.m158991a((Object) this.strMobver, (Object) header.strMobver) && C114095q.m158991a((Object) this.strNettp, (Object) header.strNettp) && C114095q.m158991a((Object) this.strImsi, (Object) header.strImsi) && C114095q.m158991a((Object) this.strOsVersion, (Object) header.strOsVersion) && C114095q.m158991a((Object) this.strSoftVersion, (Object) header.strSoftVersion) && C114095q.m158991a((Object) this.strOfflineVersion, (Object) header.strOfflineVersion) && C114095q.m158991a((Object) this.strChannel, (Object) header.strChannel) && C114095q.m158991a((Object) this.strMachineModel, (Object) header.strMachineModel) && C114095q.m158991a((Object) this.strUserNetType, (Object) header.strUserNetType);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.lCurrTime = mVar.mo172381a(this.lCurrTime, 0, true);
        if (f339569a == null) {
            f339569a = new CmdResult();
        }
        this.stResult = (CmdResult) mVar.mo172383a((C114029p) f339569a, 1, false);
        this.uAccIp = mVar.mo172381a(this.uAccIp, 2, false);
        this.strSessionId = mVar.mo172389b(3, false);
        this.strLC = mVar.mo172389b(4, false);
        this.strToken = mVar.mo172389b(5, false);
        this.strFr = mVar.mo172389b(6, false);
        this.strPf = mVar.mo172389b(7, false);
        this.strImei = mVar.mo172389b(8, false);
        this.strMobver = mVar.mo172389b(9, false);
        this.strNettp = mVar.mo172389b(10, false);
        this.strImsi = mVar.mo172389b(11, false);
        this.strOsVersion = mVar.mo172389b(12, false);
        this.strSoftVersion = mVar.mo172389b(13, false);
        this.strOfflineVersion = mVar.mo172389b(14, false);
        this.strChannel = mVar.mo172389b(15, false);
        this.strMachineModel = mVar.mo172389b(16, false);
        this.strUserNetType = mVar.mo172389b(17, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172514a(this.lCurrTime, 0);
        CmdResult cmdResult = this.stResult;
        if (cmdResult != null) {
            nVar.mo172515a((C114029p) cmdResult, 1);
        }
        nVar.mo172514a(this.uAccIp, 2);
        String str = this.strSessionId;
        if (str != null) {
            nVar.mo172517a(str, 3);
        }
        String str2 = this.strLC;
        if (str2 != null) {
            nVar.mo172517a(str2, 4);
        }
        String str3 = this.strToken;
        if (str3 != null) {
            nVar.mo172517a(str3, 5);
        }
        String str4 = this.strFr;
        if (str4 != null) {
            nVar.mo172517a(str4, 6);
        }
        String str5 = this.strPf;
        if (str5 != null) {
            nVar.mo172517a(str5, 7);
        }
        String str6 = this.strImei;
        if (str6 != null) {
            nVar.mo172517a(str6, 8);
        }
        String str7 = this.strMobver;
        if (str7 != null) {
            nVar.mo172517a(str7, 9);
        }
        String str8 = this.strNettp;
        if (str8 != null) {
            nVar.mo172517a(str8, 10);
        }
        String str9 = this.strImsi;
        if (str9 != null) {
            nVar.mo172517a(str9, 11);
        }
        String str10 = this.strOsVersion;
        if (str10 != null) {
            nVar.mo172517a(str10, 12);
        }
        String str11 = this.strSoftVersion;
        if (str11 != null) {
            nVar.mo172517a(str11, 13);
        }
        String str12 = this.strOfflineVersion;
        if (str12 != null) {
            nVar.mo172517a(str12, 14);
        }
        String str13 = this.strChannel;
        if (str13 != null) {
            nVar.mo172517a(str13, 15);
        }
        String str14 = this.strMachineModel;
        if (str14 != null) {
            nVar.mo172517a(str14, 16);
        }
        String str15 = this.strUserNetType;
        if (str15 != null) {
            nVar.mo172517a(str15, 17);
        }
    }

    public Header(long j, CmdResult cmdResult, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.lCurrTime = j;
        this.stResult = cmdResult;
        this.uAccIp = j2;
        this.strSessionId = str;
        this.strLC = str2;
        this.strToken = str3;
        this.strFr = str4;
        this.strPf = str5;
        this.strImei = str6;
        this.strMobver = str7;
        this.strNettp = str8;
        this.strImsi = str9;
        this.strOsVersion = str10;
        this.strSoftVersion = str11;
        this.strOfflineVersion = str12;
        this.strChannel = str13;
        this.strMachineModel = str14;
        this.strUserNetType = str15;
    }
}
