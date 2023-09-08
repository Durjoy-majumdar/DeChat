package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;

/* renamed from: com.tencent.mm.modelimage.j0 */
public final class C92835j0 {

    /* renamed from: a */
    public final String f267354a;

    /* renamed from: b */
    public final String f267355b;

    /* renamed from: c */
    public final C72963f4 f267356c;

    /* renamed from: d */
    public final String f267357d;

    public C92835j0(String str, String str2, C72963f4 f4Var, String str3) {
        C87412m.m108594g(str, "preBuildFastMd5");
        C87412m.m108594g(str2, "imgPath");
        C87412m.m108594g(f4Var, "msgInfo");
        C87412m.m108594g(str3, "thumbName");
        this.f267354a = str;
        this.f267355b = str2;
        this.f267356c = f4Var;
        this.f267357d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92835j0)) {
            return false;
        }
        C92835j0 j0Var = (C92835j0) obj;
        return C87412m.m108589b(this.f267354a, j0Var.f267354a) && C87412m.m108589b(this.f267355b, j0Var.f267355b) && C87412m.m108589b(this.f267356c, j0Var.f267356c) && C87412m.m108589b(this.f267357d, j0Var.f267357d);
    }

    public int hashCode() {
        return (((((this.f267354a.hashCode() * 31) + this.f267355b.hashCode()) * 31) + this.f267356c.hashCode()) * 31) + this.f267357d.hashCode();
    }

    public String toString() {
        return "SendPreBuildMsgInfo(preBuildFastMd5=" + this.f267354a + ", imgPath=" + this.f267355b + ", msgInfo=" + this.f267356c + ", thumbName=" + this.f267357d + ')';
    }
}
