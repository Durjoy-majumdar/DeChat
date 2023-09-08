package com.tencent.mapsdk.core.components.protocol.jce.rtt;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114095q;

public final class RttResponse extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static byte[] f339566a;

    /* renamed from: b */
    public static final /* synthetic */ boolean f339567b = true;
    public byte[] result;

    static {
        Class<RttResponse> cls = RttResponse.class;
        byte[] bArr = new byte[1];
        f339566a = bArr;
        bArr[0] = 0;
    }

    public RttResponse() {
        this.result = null;
    }

    public final String className() {
        return "navsns.RttResponse";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339567b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        new C113864k(sb, i).mo172266a(this.result, "result");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        new C113864k(sb, i).mo172267a(this.result, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return C114095q.m158991a((Object) this.result, (Object) ((RttResponse) obj).result);
    }

    public final byte[] getResult() {
        return this.result;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.result = mVar.mo172390c(0, true);
    }

    public final void setResult(byte[] bArr) {
        this.result = bArr;
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172522a(this.result, 0);
    }

    public RttResponse(byte[] bArr) {
        this.result = bArr;
    }
}
