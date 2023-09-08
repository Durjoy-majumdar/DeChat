package p1032sc;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C13801s0;
import sx3.C90363p0;
import ux3.C65486b;
import z04.C66723k;

/* renamed from: sc.c */
public final class C90165c {

    /* renamed from: c */
    public static final C90166a f258873c = new C90166a((C8480h) null);

    /* renamed from: d */
    public static final C66723k f258874d = new C66723k("^[\\da-fA-F]+-[\\da-fA-F]+.*");

    /* renamed from: e */
    public static final C66723k f258875e = new C66723k("^\\d+.*");

    /* renamed from: f */
    public static final C66723k f258876f = new C66723k("^Name.*");

    /* renamed from: g */
    public static final C66723k f258877g = new C66723k("^Size.*");

    /* renamed from: h */
    public static final C66723k f258878h = new C66723k("^Pss.*");

    /* renamed from: i */
    public static final C66723k f258879i = new C66723k("^Rss.*");

    /* renamed from: j */
    public static final C66723k f258880j = new C66723k("^VmFlags.*");

    /* renamed from: k */
    public static final Pattern f258881k = Pattern.compile("\\[.*]");

    /* renamed from: l */
    public static final Pattern f258882l = Pattern.compile("\\d+");

    /* renamed from: a */
    public final InputStream f258883a;

    /* renamed from: b */
    public final ArrayList<C90160a> f258884b = new ArrayList<>();

    /* renamed from: sc.c$a */
    public static final class C90166a {
        public C90166a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo124419a(long j) {
            long abs = j == Long.MIN_VALUE ? MAlarmHandler.NEXT_FIRE_INTERVAL : Math.abs(j);
            if (abs < 1024) {
                return j + " B";
            }
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
            int i = 40;
            long j2 = abs;
            while (i >= 0 && abs > (1152865209611504844 >> i)) {
                j2 >>= 10;
                stringCharacterIterator.next();
                i -= 10;
            }
            String format = String.format("%.1f %ciB", Arrays.copyOf(new Object[]{Double.valueOf(((double) (j2 * ((long) Long.signum(j)))) / 1024.0d), Character.valueOf(stringCharacterIterator.current())}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: sc.c$b */
    public static final class C90167b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((Number) ((C36570n) ((C90161b) ((C13604l) t2).f38556e).f258869d).getValue()).intValue()), Integer.valueOf(((Number) ((C36570n) ((C90161b) ((C13604l) t).f38556e).f258869d).getValue()).intValue()));
        }
    }

    /* renamed from: sc.c$c */
    public static final class C90168c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(((C90160a) t2).f258864e, ((C90160a) t).f258864e);
        }
    }

    public C90165c(InputStream inputStream) {
        C87412m.m108594g(inputStream, "inputStream");
        this.f258883a = inputStream;
    }

    /* renamed from: a */
    public final List<C13604l<String, C90161b>> mo124416a() {
        ArrayList<C90160a> arrayList = this.f258884b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : arrayList) {
            String str = ((C90160a) next).f258860a;
            C87412m.m108591d(str);
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C90363p0.m113142a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C90161b bVar = new C90161b();
            bVar.f258866a = C110818d0.m150943o0((Iterable) entry.getValue(), new C90168c());
            linkedHashMap2.put(key, bVar);
        }
        return C110818d0.m150943o0(C13801s0.m13103o(linkedHashMap2), new C90167b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031e, code lost:
        if (r4 == null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0322, code lost:
        if (r4.f258863d == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0326, code lost:
        if (r4.f258861b == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032a, code lost:
        if (r4.f258862c == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032e, code lost:
        if (r4.f258865f == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0332, code lost:
        if (r4.f258864e == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0336, code lost:
        if (r4.f258860a != null) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0338, code lost:
        r4.f258860a = "[Anonymous memory]";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0360, code lost:
        throw new java.lang.IllegalStateException("parser entity failed: at " + r1 + ' ' + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x037b, code lost:
        throw new java.lang.IllegalStateException("expected not null entity: at " + r1 + ' ' + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010c, code lost:
        throw new java.lang.IllegalStateException("invalid syntax: at " + r1 + ' ' + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d7, code lost:
        throw new java.lang.IllegalStateException("invalid syntax: at " + r1 + ' ' + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x025b, code lost:
        throw new java.lang.IllegalStateException("invalid syntax: at " + r1 + ' ' + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02df, code lost:
        throw new java.lang.IllegalStateException("invalid syntax: at " + r1 + ' ' + r11);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<p1032sc.C90160a> mo124417b() {
        /*
            r20 = this;
            r0 = r20
            java.io.InputStream r1 = r0.f258883a
            java.nio.charset.Charset r2 = z04.C119027c.f356488a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r1, r2)
            boolean r1 = r3 instanceof java.io.BufferedReader
            if (r1 == 0) goto L_0x0012
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x001a
        L_0x0012:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r3, r2)
            r3 = r1
        L_0x001a:
            r1 = -1
            r2 = 0
        L_0x001c:
            r4 = r2
        L_0x001d:
            int r1 = r1 + 1
            java.lang.String r11 = r3.readLine()
            r12 = 32
            if (r11 != 0) goto L_0x0049
            if (r4 != 0) goto L_0x002c
            java.util.ArrayList<sc.a> r1 = r0.f258884b
            return r1
        L_0x002c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "need to close entity before end of file: at "
            r3.append(r4)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            z04.k r5 = f258874d
            boolean r5 = r5.mo90759d(r11)
            java.lang.String r13 = "invalid syntax: at "
            if (r5 == 0) goto L_0x012a
            if (r4 != 0) goto L_0x010d
            sc.a r4 = new sc.a
            r4.<init>()
            java.lang.String r5 = " "
            java.lang.String[] r6 = new java.lang.String[]{r5}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            java.util.List r5 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0072:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = z04.C112551y.m153811k(r8)
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0072
            r6.add(r7)
            goto L_0x0072
        L_0x008b:
            java.lang.Object r5 = sx3.C110818d0.m150923U(r6)
            java.lang.String r5 = (java.lang.String) r5
            z04.k r7 = f258875e
            boolean r7 = r7.mo90759d(r5)
            if (r7 != 0) goto L_0x009b
            r4.f258860a = r5
        L_0x009b:
            java.lang.Object r5 = sx3.C110818d0.m150914L(r6)
            r14 = r5
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String r5 = "-"
            java.lang.String[] r15 = new java.lang.String[]{r5}
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r5 = z04.C112550d0.m153785U(r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = r4.f258861b
            if (r6 != 0) goto L_0x00f2
            java.lang.String r6 = r4.f258862c
            if (r6 != 0) goto L_0x00f2
            int r6 = r5.size()
            r7 = 2
            if (r6 != r7) goto L_0x00d5
            java.lang.Object r6 = sx3.C110818d0.m150914L(r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.f258861b = r6
            java.lang.Object r5 = sx3.C110818d0.m150923U(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4.f258862c = r5
            goto L_0x001d
        L_0x00d5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid line: at "
            r3.append(r4)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00f2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x010d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expected null entity here: at "
            r3.append(r4)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x012a:
            z04.k r5 = f258876f
            boolean r5 = r5.mo90759d(r11)
            r6 = 0
            java.lang.String r7 = "expected not null entity: at "
            if (r5 == 0) goto L_0x018a
            if (r4 == 0) goto L_0x016f
            java.util.regex.Pattern r5 = f258881k
            java.util.regex.Matcher r5 = r5.matcher(r11)
            boolean r7 = r5.find()
            if (r7 == 0) goto L_0x0154
            int r7 = r5.groupCount()
            if (r7 != 0) goto L_0x0154
            java.lang.String r5 = r5.group(r6)
            gy3.C87412m.m108591d(r5)
            r4.f258860a = r5
            goto L_0x001d
        L_0x0154:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x016f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x018a:
            z04.k r5 = f258877g
            boolean r5 = r5.mo90759d(r11)
            if (r5 == 0) goto L_0x020e
            if (r4 == 0) goto L_0x01f3
            java.lang.Integer r5 = r4.f258863d
            if (r5 != 0) goto L_0x01d8
            java.util.regex.Pattern r5 = f258882l
            java.util.regex.Matcher r5 = r5.matcher(r11)
            boolean r7 = r5.find()
            if (r7 == 0) goto L_0x01bd
            int r7 = r5.groupCount()
            if (r7 != 0) goto L_0x01bd
            java.lang.String r5 = r5.group(r6)
            gy3.C87412m.m108591d(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f258863d = r5
            goto L_0x001d
        L_0x01bd:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x01d8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x01f3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x020e:
            z04.k r5 = f258878h
            boolean r5 = r5.mo90759d(r11)
            if (r5 == 0) goto L_0x0292
            if (r4 == 0) goto L_0x0277
            java.lang.Integer r5 = r4.f258864e
            if (r5 != 0) goto L_0x025c
            java.util.regex.Pattern r5 = f258882l
            java.util.regex.Matcher r5 = r5.matcher(r11)
            boolean r7 = r5.find()
            if (r7 == 0) goto L_0x0241
            int r7 = r5.groupCount()
            if (r7 != 0) goto L_0x0241
            java.lang.String r5 = r5.group(r6)
            gy3.C87412m.m108591d(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f258864e = r5
            goto L_0x001d
        L_0x0241:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x025c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0277:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0292:
            z04.k r5 = f258879i
            boolean r5 = r5.mo90759d(r11)
            if (r5 == 0) goto L_0x0316
            if (r4 == 0) goto L_0x02fb
            java.lang.Integer r5 = r4.f258865f
            if (r5 != 0) goto L_0x02e0
            java.util.regex.Pattern r5 = f258882l
            java.util.regex.Matcher r5 = r5.matcher(r11)
            boolean r7 = r5.find()
            if (r7 == 0) goto L_0x02c5
            int r7 = r5.groupCount()
            if (r7 != 0) goto L_0x02c5
            java.lang.String r5 = r5.group(r6)
            gy3.C87412m.m108591d(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f258865f = r5
            goto L_0x001d
        L_0x02c5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x02e0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x02fb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0316:
            z04.k r5 = f258880j
            boolean r5 = r5.mo90759d(r11)
            if (r5 == 0) goto L_0x001d
            if (r4 == 0) goto L_0x0361
            java.lang.Integer r5 = r4.f258863d
            if (r5 == 0) goto L_0x0343
            java.lang.String r5 = r4.f258861b
            if (r5 == 0) goto L_0x0343
            java.lang.String r5 = r4.f258862c
            if (r5 == 0) goto L_0x0343
            java.lang.Integer r5 = r4.f258865f
            if (r5 == 0) goto L_0x0343
            java.lang.Integer r5 = r4.f258864e
            if (r5 == 0) goto L_0x0343
            java.lang.String r5 = r4.f258860a
            if (r5 != 0) goto L_0x033c
            java.lang.String r5 = "[Anonymous memory]"
            r4.f258860a = r5
        L_0x033c:
            java.util.ArrayList<sc.a> r5 = r0.f258884b
            r5.add(r4)
            goto L_0x001c
        L_0x0343:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parser entity failed: at "
            r3.append(r4)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0361:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r12)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1032sc.C90165c.mo124417b():java.util.ArrayList");
    }

    /* renamed from: c */
    public final String mo124418c() {
        StringBuilder sb = new StringBuilder();
        sb.append("entities count=[");
        sb.append(this.f258884b.size());
        sb.append("]\ntotal virtual memory size=[");
        C90166a aVar = f258873c;
        int i = 0;
        int i2 = 0;
        for (C90160a aVar2 : this.f258884b) {
            Integer num = aVar2.f258863d;
            C87412m.m108591d(num);
            i2 += num.intValue();
        }
        sb.append(aVar.mo124419a(((long) i2) * 1024));
        sb.append("]\ntotal pss=[");
        C90166a aVar3 = f258873c;
        int i3 = 0;
        for (C90160a aVar4 : this.f258884b) {
            Integer num2 = aVar4.f258864e;
            C87412m.m108591d(num2);
            i3 += num2.intValue();
        }
        sb.append(aVar3.mo124419a(((long) i3) * 1024));
        sb.append("]\ntotal rss=[");
        C90166a aVar5 = f258873c;
        for (C90160a aVar6 : this.f258884b) {
            Integer num3 = aVar6.f258865f;
            C87412m.m108591d(num3);
            i += num3.intValue();
        }
        sb.append(aVar5.mo124419a(((long) i) * 1024));
        sb.append("]\n");
        return sb.toString();
    }
}
