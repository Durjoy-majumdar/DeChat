package com.tencent.p014mm.vfs;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.a1 */
public final class C75055a1 {

    /* renamed from: a */
    public final String f220814a;

    /* renamed from: b */
    public final String f220815b;

    /* renamed from: c */
    public final int f220816c;

    /* renamed from: d */
    public final int f220817d;

    /* renamed from: e */
    public final C75059d f220818e;

    /* renamed from: f */
    public final Map<String, Object> f220819f;

    /* renamed from: g */
    public final List<String> f220820g;

    /* renamed from: h */
    public final C32226l<FileSystem, FileSystem> f220821h;

    public C75055a1(String str, String str2, int i, int i2, C75059d dVar, Map<String, ? extends Object> map, List<String> list, C32226l<? super FileSystem, ? extends FileSystem> lVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "dirName");
        C87412m.m108594g(dVar, "cleanPolicy");
        this.f220814a = str;
        this.f220815b = str2;
        this.f220816c = i;
        this.f220817d = i2;
        this.f220818e = dVar;
        this.f220819f = map;
        this.f220820g = list;
        this.f220821h = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75055a1)) {
            return false;
        }
        C75055a1 a1Var = (C75055a1) obj;
        return C87412m.m108589b(this.f220814a, a1Var.f220814a) && C87412m.m108589b(this.f220815b, a1Var.f220815b) && this.f220816c == a1Var.f220816c && this.f220817d == a1Var.f220817d && C87412m.m108589b(this.f220818e, a1Var.f220818e) && C87412m.m108589b(this.f220819f, a1Var.f220819f) && C87412m.m108589b(this.f220820g, a1Var.f220820g) && C87412m.m108589b(this.f220821h, a1Var.f220821h);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f220814a.hashCode() * 31) + this.f220815b.hashCode()) * 31) + this.f220816c) * 31) + this.f220817d) * 31) + this.f220818e.hashCode()) * 31;
        Map<String, Object> map = this.f220819f;
        int i = 0;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.f220820g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C32226l<FileSystem, FileSystem> lVar = this.f220821h;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "StorageConfig(name=" + this.f220814a + ", dirName=" + this.f220815b + ", flags=" + this.f220816c + ", tag=" + this.f220817d + ", cleanPolicy=" + this.f220818e + ", env=" + this.f220819f + ", paths=" + this.f220820g + ", wrapper=" + this.f220821h + ')';
    }
}
