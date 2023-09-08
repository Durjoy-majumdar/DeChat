package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114095q;

public final class Tag extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static byte[] f339576a;

    /* renamed from: b */
    public static final /* synthetic */ boolean f339577b = true;
    public String strId;
    public byte[] value;

    static {
        Class<Tag> cls = Tag.class;
    }

    public Tag() {
        this.strId = "";
        this.value = null;
    }

    public final String className() {
        return "sosomap.Tag";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339577b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172259a(this.strId, "strId");
        kVar.mo172266a(this.value, "value");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172260a(this.strId, true);
        kVar.mo172267a(this.value, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Tag tag = (Tag) obj;
        return C114095q.m158991a((Object) this.strId, (Object) tag.strId) && C114095q.m158991a((Object) this.value, (Object) tag.value);
    }

    public final byte[] getValue() {
        return this.value;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.strId = mVar.mo172389b(0, true);
        if (f339576a == null) {
            byte[] bArr = new byte[1];
            f339576a = bArr;
            bArr[0] = 0;
        }
        this.value = mVar.mo172390c(1, true);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172517a(this.strId, 0);
        nVar.mo172522a(this.value, 1);
    }

    public Tag(String str, byte[] bArr) {
        this.strId = str;
        this.value = bArr;
    }
}
