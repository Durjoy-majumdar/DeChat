package p723vf;

import gy3.C87412m;
import java.util.Arrays;
import java.util.List;

/* renamed from: vf.i */
public final class C90785i {

    /* renamed from: b */
    public static final C90786a f260700b = new C90786a();

    /* renamed from: a */
    public final List<C90791n> f260701a;

    /* renamed from: vf.i$a */
    public static final class C90786a {
    }

    public C90785i(List<C90791n> list) {
        this.f260701a = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C90785i) && C87412m.m108589b(this.f260701a, ((C90785i) obj).f260701a);
        }
        return true;
    }

    public int hashCode() {
        List<C90791n> list = this.f260701a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        String format = String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", Arrays.copyOf(new Object[]{"PSS", "RSS", "SIZE", "SWAP_PSS", "SH_C", "SH_D", "PRI_C", "PRI_D", "COUNT", "PERM", "NAME"}, 11));
        C87412m.m108593f(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append("\n");
        String format2 = String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", Arrays.copyOf(new Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        C87412m.m108593f(format2, "java.lang.String.format(format, *args)");
        sb.append(format2);
        sb.append("\n");
        List<C90791n> list = this.f260701a;
        C87412m.m108591d(list);
        for (C90791n next : list) {
            String str = next.f260711a;
            String str2 = next.f260712b;
            long j = next.f260713c;
            long j2 = next.f260714d;
            long j3 = next.f260715e;
            long j4 = next.f260716f;
            long j5 = j3;
            long j6 = next.f260718h;
            long j7 = next.f260720j;
            String format3 = String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j2), Long.valueOf(next.f260721k), Long.valueOf(next.f260717g), Long.valueOf(j6), Long.valueOf(next.f260719i), Long.valueOf(j7), Long.valueOf(j), str2, str}, 11));
            C87412m.m108593f(format3, "java.lang.String.format(format, *args)");
            sb.append(format3);
            sb.append("\n");
        }
        String format4 = String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", Arrays.copyOf(new Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        C87412m.m108593f(format4, "java.lang.String.format(format, *args)");
        sb.append(format4);
        sb.append("\n");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    public C90785i() {
        this((List<C90791n>) null);
    }
}
