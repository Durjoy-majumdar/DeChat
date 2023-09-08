package p1032sc;

import gy3.C87412m;
import p1032sc.C90165c;

/* renamed from: sc.a */
public final class C90160a {

    /* renamed from: a */
    public String f258860a;

    /* renamed from: b */
    public String f258861b;

    /* renamed from: c */
    public String f258862c;

    /* renamed from: d */
    public Integer f258863d;

    /* renamed from: e */
    public Integer f258864e;

    /* renamed from: f */
    public Integer f258865f;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmapsEntity(name=");
        sb.append(this.f258860a);
        sb.append(", virtual memory size=");
        C90165c.C90166a aVar = C90165c.f258873c;
        Integer num = this.f258863d;
        C87412m.m108591d(num);
        sb.append(aVar.mo124419a(((long) num.intValue()) * 1024));
        sb.append(",pss=");
        Integer num2 = this.f258864e;
        C87412m.m108591d(num2);
        sb.append(aVar.mo124419a(((long) num2.intValue()) * 1024));
        sb.append(", rss=");
        Integer num3 = this.f258865f;
        C87412m.m108591d(num3);
        sb.append(aVar.mo124419a(((long) num3.intValue()) * 1024));
        sb.append(",startAddress=");
        sb.append(this.f258861b);
        sb.append(", endAddress=");
        sb.append(this.f258862c);
        sb.append(')');
        return sb.toString();
    }
}
