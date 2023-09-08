package vz3;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: vz3.a */
public final class C22825a {

    /* renamed from: a */
    public final C22826c f65623a;

    /* renamed from: b */
    public final C22826c f65624b = null;

    /* renamed from: c */
    public final C22830f f65625c;

    /* renamed from: d */
    public final C22826c f65626d;

    static {
        C22826c.m26773j(C26409h.f73652f);
    }

    public C22825a(C22826c cVar, C22830f fVar) {
        C87412m.m108594g(cVar, "packageName");
        C87412m.m108594g(fVar, "callableName");
        this.f65623a = cVar;
        this.f65625c = fVar;
        this.f65626d = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22825a)) {
            return false;
        }
        C22825a aVar = (C22825a) obj;
        return C87412m.m108589b(this.f65623a, aVar.f65623a) && C87412m.m108589b(this.f65624b, aVar.f65624b) && C87412m.m108589b(this.f65625c, aVar.f65625c) && C87412m.m108589b(this.f65626d, aVar.f65626d);
    }

    public int hashCode() {
        int hashCode = this.f65623a.hashCode() * 31;
        C22826c cVar = this.f65624b;
        int i = 0;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f65625c.hashCode()) * 31;
        C22826c cVar2 = this.f65626d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String b = this.f65623a.mo35973b();
        C87412m.m108593f(b, "packageName.asString()");
        sb.append(C112551y.m153815o(b, '.', XVFSFile.SEPARATOR_CHAR, false, 4, (Object) null));
        sb.append("/");
        C22826c cVar = this.f65624b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f65625c);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
