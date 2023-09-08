package com.tencent.p014mm.plugin.vlog.model;

import ai2.C92007a;
import bi2.C92262a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import te3.cs4;

/* renamed from: com.tencent.mm.plugin.vlog.model.v0 */
public final class C96557v0 {

    /* renamed from: a */
    public long f282611a;

    /* renamed from: b */
    public List<? extends C96533c0> f282612b;

    /* renamed from: c */
    public String f282613c;

    /* renamed from: d */
    public cs4 f282614d;

    /* renamed from: e */
    public ArrayList<C92262a> f282615e;

    /* renamed from: f */
    public ArrayList<C92007a> f282616f;

    /* renamed from: g */
    public float[] f282617g;

    /* renamed from: h */
    public float[] f282618h;

    public C96557v0(long j, List list, String str, cs4 cs4, ArrayList<C92262a> arrayList, ArrayList<C92007a> arrayList2, float[] fArr, float[] fArr2, int i, C8480h hVar) {
        arrayList = (i & 16) != 0 ? new ArrayList<>() : arrayList;
        arrayList2 = (i & 32) != 0 ? new ArrayList<>() : arrayList2;
        fArr = (i & 64) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : fArr;
        fArr2 = (i & 128) != 0 ? null : fArr2;
        C87412m.m108594g(list, "materials");
        C87412m.m108594g(str, "netMusicPath");
        C87412m.m108594g(cs4, "xEffectConfig");
        C87412m.m108594g(arrayList, "editItems");
        C87412m.m108594g(arrayList2, "editData");
        C87412m.m108594g(fArr, "drawingRect");
        this.f282611a = j;
        this.f282612b = list;
        this.f282613c = str;
        this.f282614d = cs4;
        this.f282615e = arrayList;
        this.f282616f = arrayList2;
        this.f282617g = fArr;
        this.f282618h = fArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96557v0)) {
            return false;
        }
        C96557v0 v0Var = (C96557v0) obj;
        return this.f282611a == v0Var.f282611a && C87412m.m108589b(this.f282612b, v0Var.f282612b) && C87412m.m108589b(this.f282613c, v0Var.f282613c) && C87412m.m108589b(this.f282614d, v0Var.f282614d) && C87412m.m108589b(this.f282615e, v0Var.f282615e) && C87412m.m108589b(this.f282616f, v0Var.f282616f) && C87412m.m108589b(this.f282617g, v0Var.f282617g) && C87412m.m108589b(this.f282618h, v0Var.f282618h);
    }

    public int hashCode() {
        long j = this.f282611a;
        int hashCode = ((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f282612b.hashCode()) * 31) + this.f282613c.hashCode()) * 31) + this.f282614d.hashCode()) * 31) + this.f282615e.hashCode()) * 31) + this.f282616f.hashCode()) * 31) + Arrays.hashCode(this.f282617g)) * 31;
        float[] fArr = this.f282618h;
        return hashCode + (fArr == null ? 0 : Arrays.hashCode(fArr));
    }

    public String toString() {
        return "VLogScriptModel(respId=" + this.f282611a + ", materials=" + this.f282612b + ", netMusicPath='" + this.f282613c + "', xEffectConfig=" + this.f282614d + ", editItems=" + this.f282615e + ", editData=" + this.f282616f + ", drawingRect=" + Arrays.toString(this.f282617g) + ')';
    }
}
