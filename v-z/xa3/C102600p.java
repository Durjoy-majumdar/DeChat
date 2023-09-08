package xa3;

import gy3.C87412m;
import ib3.C98640j;
import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: xa3.p */
public final class C102600p extends C102599o {

    /* renamed from: s */
    public LinkedList<C102587c> f302102s = new LinkedList<>();

    /* renamed from: t */
    public C98640j f302103t;

    /* renamed from: c */
    public int mo142212c() {
        return 7;
    }

    /* renamed from: d */
    public void mo142214d() {
        super.mo142214d();
        this.f302103t = null;
    }

    /* renamed from: e */
    public String mo142215e() {
        if (this.f302102s.size() > 0) {
            C102587c last = this.f302102s.getLast();
            String str = null;
            C102599o oVar = last instanceof C102599o ? (C102599o) last : null;
            if (oVar != null) {
                str = oVar.f302098o;
            }
            if (str != null) {
                return str;
            }
            String str2 = this.f302098o;
            C87412m.m108593f(str2, "super.getMaxLocalEditorId()");
            return str2;
        }
        String str3 = this.f302098o;
        C87412m.m108593f(str3, "super.getMaxLocalEditorId()");
        return str3;
    }

    /* renamed from: f */
    public final void mo142216f(C102587c cVar) {
        C87412m.m108594g(cVar, "item");
        this.f302102s.add(cVar);
    }

    /* renamed from: g */
    public final String mo142217g() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        for (C102587c cVar : this.f302102s) {
            if (cVar instanceof C102599o) {
                C102599o oVar = (C102599o) cVar;
                C87412m.m108594g(oVar, "item");
                String str = oVar.f302098o;
                String format = String.format("<object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object>", Arrays.copyOf(new Object[]{Integer.valueOf(oVar.f302099p), str, str}, 3));
                C87412m.m108593f(format, "format(format, *args)");
                sb.append(format);
            }
        }
        sb.append("</div>");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply{\n …v>\")\n        }.toString()");
        return sb4;
    }

    /* renamed from: h */
    public final int mo142218h() {
        return this.f302102s.size();
    }
}
