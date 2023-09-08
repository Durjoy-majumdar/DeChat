package com.tencent.p014mm.vfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.v */
public final class C116330v {

    /* renamed from: c */
    public static final Pattern f349097c = Pattern.compile("\\$\\{([A-Za-z0-9_]+)\\}");

    /* renamed from: d */
    public static final Comparator<C116332b> f349098d = new C116331a();

    /* renamed from: a */
    public final String f349099a;

    /* renamed from: b */
    public final C116332b[] f349100b;

    /* renamed from: com.tencent.mm.vfs.v$a */
    public class C116331a implements Comparator<C116332b> {
        public int compare(Object obj, Object obj2) {
            return ((C116332b) obj).f349102b - ((C116332b) obj2).f349102b;
        }
    }

    /* renamed from: com.tencent.mm.vfs.v$b */
    public static final class C116332b {

        /* renamed from: a */
        public final String f349101a;

        /* renamed from: b */
        public final int f349102b;

        /* renamed from: c */
        public final int f349103c;

        public C116332b(String str, int i, int i2) {
            this.f349101a = str;
            this.f349102b = i;
            this.f349103c = i2;
        }
    }

    public C116330v(String str) {
        this.f349099a = str;
        if (str == null) {
            this.f349100b = null;
            return;
        }
        Matcher matcher = f349097c.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(new C116332b(matcher.group(1), matcher.start(), matcher.end()));
            } while (matcher.find());
            C116332b[] bVarArr = (C116332b[]) arrayList.toArray(new C116332b[0]);
            this.f349100b = bVarArr;
            Arrays.sort(bVarArr, f349098d);
            return;
        }
        this.f349100b = null;
    }

    /* renamed from: a */
    public String mo177821a(Map<String, Object> map) {
        if (this.f349100b == null || this.f349099a == null) {
            return this.f349099a;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (C116332b bVar : this.f349100b) {
            String d = C116299g2.m163848d(map, bVar.f349101a);
            if (d == null) {
                return null;
            }
            sb.append(this.f349099a, i, bVar.f349102b);
            sb.append(d);
            i = bVar.f349103c;
        }
        String str = this.f349099a;
        sb.append(str, i, str.length());
        return sb.toString();
    }

    /* renamed from: b */
    public String[] mo177822b(Map<String, Object> map) {
        String str = this.f349099a;
        if (str == null) {
            return null;
        }
        C116332b[] bVarArr = this.f349100b;
        if (bVarArr == null) {
            return new String[]{str};
        }
        int length = bVarArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = map.get(this.f349100b[i].f349101a);
            if (obj == null) {
                return null;
            }
            objArr[i] = obj;
        }
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            Object obj2 = objArr[i3];
            if (obj2 instanceof String[]) {
                i2 *= ((String[]) obj2).length;
            }
        }
        if (i2 == 0) {
            return null;
        }
        int length2 = this.f349100b.length;
        int[] iArr = new int[length2];
        String[] strArr = new String[i2];
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < length2; i6++) {
                C116332b bVar = this.f349100b[i6];
                Object obj3 = objArr[i6];
                sb.append(this.f349099a, i5, bVar.f349102b);
                if (obj3 instanceof String) {
                    sb.append((String) obj3);
                } else if (!(obj3 instanceof String[])) {
                    return null;
                } else {
                    sb.append(((String[]) obj3)[iArr[i6]]);
                }
                i5 = bVar.f349103c;
            }
            String str2 = this.f349099a;
            sb.append(str2, i5, str2.length());
            strArr[i4] = sb.toString();
            sb.setLength(0);
            int i7 = length2 - 1;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                Object obj4 = objArr[i7];
                if (obj4 instanceof String[]) {
                    int length3 = ((String[]) obj4).length;
                    int i8 = iArr[i7] + 1;
                    iArr[i7] = i8;
                    if (i8 < length3) {
                        break;
                    }
                    iArr[i7] = 0;
                }
                i7--;
            }
        }
        return strArr;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C116330v) && C116299g2.m163849e(this.f349099a, ((C116330v) obj).f349099a);
    }

    public int hashCode() {
        String str = this.f349099a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f349099a;
        return str == null ? "(null)" : str;
    }
}
