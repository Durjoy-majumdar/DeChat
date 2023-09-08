package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114095q;

public final class CmdResult extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static final /* synthetic */ boolean f339568a = true;
    public int iErrCode;
    public int iSubErrCode;
    public String strErrDesc;

    static {
        Class<CmdResult> cls = CmdResult.class;
    }

    public CmdResult() {
        this.iErrCode = 0;
        this.strErrDesc = "";
        this.iSubErrCode = 0;
    }

    public final String className() {
        return "sosomap.CmdResult";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339568a) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172253a(this.iErrCode, "iErrCode");
        kVar.mo172259a(this.strErrDesc, "strErrDesc");
        kVar.mo172253a(this.iSubErrCode, "iSubErrCode");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172254a(this.iErrCode, true);
        kVar.mo172260a(this.strErrDesc, true);
        kVar.mo172254a(this.iSubErrCode, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        CmdResult cmdResult = (CmdResult) obj;
        return C114095q.m158989a(this.iErrCode, cmdResult.iErrCode) && C114095q.m158991a((Object) this.strErrDesc, (Object) cmdResult.strErrDesc) && C114095q.m158989a(this.iSubErrCode, cmdResult.iSubErrCode);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.iErrCode = mVar.mo172379a(this.iErrCode, 0, true);
        this.strErrDesc = mVar.mo172389b(1, true);
        this.iSubErrCode = mVar.mo172379a(this.iSubErrCode, 2, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172513a(this.iErrCode, 0);
        nVar.mo172517a(this.strErrDesc, 1);
        nVar.mo172513a(this.iSubErrCode, 2);
    }

    public CmdResult(int i, String str, int i2) {
        this.iErrCode = i;
        this.strErrDesc = str;
        this.iSubErrCode = i2;
    }
}
