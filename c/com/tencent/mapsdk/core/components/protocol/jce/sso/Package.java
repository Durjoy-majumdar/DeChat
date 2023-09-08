package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114095q;
import java.util.ArrayList;

public final class Package extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static int f339571a;

    /* renamed from: b */
    public static byte[] f339572b;

    /* renamed from: c */
    public static byte[] f339573c;

    /* renamed from: d */
    public static ArrayList<Tag> f339574d;

    /* renamed from: e */
    public static final /* synthetic */ boolean f339575e = true;
    public byte[] busiBuff;
    public byte cEncodeType;
    public int eCmd;
    public byte[] head;
    public int iSeqNo;
    public String sAppId;
    public short shVer;
    public String strSubCmd;
    public String uin;
    public ArrayList<Tag> vTag;

    static {
        Class<Package> cls = Package.class;
    }

    public Package() {
        this.shVer = 0;
        this.eCmd = 0;
        this.strSubCmd = "";
        this.iSeqNo = 0;
        this.cEncodeType = 0;
        this.sAppId = "";
        this.uin = "";
        this.head = null;
        this.busiBuff = null;
        this.vTag = null;
    }

    public final String className() {
        return "sosomap.Package";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339575e) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172264a(this.shVer, "shVer");
        kVar.mo172253a(this.eCmd, "eCmd");
        kVar.mo172259a(this.strSubCmd, "strSubCmd");
        kVar.mo172253a(this.iSeqNo, "iSeqNo");
        kVar.mo172251a(this.cEncodeType, "cEncodeType");
        kVar.mo172259a(this.sAppId, "sAppId");
        kVar.mo172259a(this.uin, "uin");
        kVar.mo172266a(this.head, "head");
        kVar.mo172266a(this.busiBuff, "busiBuff");
        kVar.mo172261a(this.vTag, "vTag");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172265a(this.shVer, true);
        kVar.mo172254a(this.eCmd, true);
        kVar.mo172260a(this.strSubCmd, true);
        kVar.mo172254a(this.iSeqNo, true);
        kVar.mo172252a(this.cEncodeType, true);
        kVar.mo172260a(this.sAppId, true);
        kVar.mo172260a(this.uin, true);
        kVar.mo172267a(this.head, true);
        kVar.mo172267a(this.busiBuff, true);
        kVar.mo172262a(this.vTag, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Package packageR = (Package) obj;
        return C114095q.m158992a(this.shVer, packageR.shVer) && C114095q.m158989a(this.eCmd, packageR.eCmd) && C114095q.m158991a((Object) this.strSubCmd, (Object) packageR.strSubCmd) && C114095q.m158989a(this.iSeqNo, packageR.iSeqNo) && C114095q.m158985a(this.cEncodeType, packageR.cEncodeType) && C114095q.m158991a((Object) this.sAppId, (Object) packageR.sAppId) && C114095q.m158991a((Object) this.uin, (Object) packageR.uin) && C114095q.m158991a((Object) this.head, (Object) packageR.head) && C114095q.m158991a((Object) this.busiBuff, (Object) packageR.busiBuff) && C114095q.m158991a((Object) this.vTag, (Object) packageR.vTag);
    }

    public final byte[] getBusiBuff() {
        return this.busiBuff;
    }

    public final byte[] getHead() {
        return this.head;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.shVer = mVar.mo172386a(this.shVer, 0, true);
        this.eCmd = mVar.mo172379a(this.eCmd, 1, true);
        this.strSubCmd = mVar.mo172389b(2, true);
        this.iSeqNo = mVar.mo172379a(this.iSeqNo, 3, false);
        this.cEncodeType = mVar.mo172376a(this.cEncodeType, 4, false);
        this.sAppId = mVar.mo172389b(5, false);
        this.uin = mVar.mo172389b(6, false);
        if (f339572b == null) {
            byte[] bArr = new byte[1];
            f339572b = bArr;
            bArr[0] = 0;
        }
        this.head = mVar.mo172390c(7, false);
        if (f339573c == null) {
            byte[] bArr2 = new byte[1];
            f339573c = bArr2;
            bArr2[0] = 0;
        }
        this.busiBuff = mVar.mo172390c(8, false);
        if (f339574d == null) {
            f339574d = new ArrayList<>();
            f339574d.add(new Tag());
        }
        this.vTag = (ArrayList) mVar.mo172384a(f339574d, 9, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172520a(this.shVer, 0);
        nVar.mo172513a(this.eCmd, 1);
        nVar.mo172517a(this.strSubCmd, 2);
        nVar.mo172513a(this.iSeqNo, 3);
        nVar.mo172510a(this.cEncodeType, 4);
        String str = this.sAppId;
        if (str != null) {
            nVar.mo172517a(str, 5);
        }
        String str2 = this.uin;
        if (str2 != null) {
            nVar.mo172517a(str2, 6);
        }
        byte[] bArr = this.head;
        if (bArr != null) {
            nVar.mo172522a(bArr, 7);
        }
        byte[] bArr2 = this.busiBuff;
        if (bArr2 != null) {
            nVar.mo172522a(bArr2, 8);
        }
        ArrayList<Tag> arrayList = this.vTag;
        if (arrayList != null) {
            nVar.mo172518a(arrayList, 9);
        }
    }

    public Package(short s, int i, String str, int i2, byte b, String str2, String str3, byte[] bArr, byte[] bArr2, ArrayList<Tag> arrayList) {
        this.shVer = s;
        this.eCmd = i;
        this.strSubCmd = str;
        this.iSeqNo = i2;
        this.cEncodeType = b;
        this.sAppId = str2;
        this.uin = str3;
        this.head = bArr;
        this.busiBuff = bArr2;
        this.vTag = arrayList;
    }
}
