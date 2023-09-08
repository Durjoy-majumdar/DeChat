package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C77813z;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.w1 */
public final class C68581w1 {

    /* renamed from: a */
    public static final C68581w1 f197012a = new C68581w1();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w1$a */
    public static final class C68582a implements Comparator<C68583b> {
        public int compare(Object obj, Object obj2) {
            C68583b bVar = (C68583b) obj;
            C68583b bVar2 = (C68583b) obj2;
            C87412m.m108594g(bVar, "o1");
            C87412m.m108594g(bVar2, "o2");
            for (int i = 0; i < 3; i++) {
                int i2 = bVar.f197014b[i];
                int i3 = bVar2.f197014b[i];
                if (i2 != i3) {
                    return i2 - i3;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w1$b */
    public static final class C68583b {

        /* renamed from: a */
        public final T f197013a;

        /* renamed from: b */
        public final int[] f197014b;

        public C68583b(T t, int[] iArr) {
            C87412m.m108594g(iArr, "versionArray");
            this.f197013a = t;
            this.f197014b = iArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C87412m.m108589b(C68583b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion.SortUnit<T of com.tencent.mm.plugin.appbrand.appcache.SEMVER.matchHighestVersion>");
            return C87412m.m108589b(this.f197013a, ((C68583b) obj).f197013a);
        }

        public int hashCode() {
            T t = this.f197013a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "SortUnit(item=" + this.f197013a + ", versionArray=" + Arrays.toString(this.f197014b) + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w1$c */
    public static final class C68584c extends C87413o implements C32226l<String, String> {

        /* renamed from: d */
        public static final C68584c f197015d = new C68584c();

        public C68584c() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return str;
        }
    }

    /* renamed from: c */
    public static final void m80844c() {
        String str;
        String str2;
        String[] strArr = {"1.1.1", "1.1.2", "1.1.3", "1.2.1", "1.2.2", "1.2.3", "1.3.1", "1.3.2", "1.3.3", "2.1.1", "2.1.2", "2.1.3", "2.2.1", "2.2.2", "2.2.3", "2.3.3"};
        C13604l[] lVarArr = {new C13604l("~1.2.1", "1.2.3"), new C13604l("~1.3.1", "1.3.3"), new C13604l("^1.2.1", "1.3.3"), new C13604l("^1.3.1", "1.3.3"), new C13604l("~2.2.1", "2.2.3"), new C13604l("~2.3.1", "2.3.3"), new C13604l("^2.1.1", "2.3.3"), new C13604l("^2.3.1", "2.3.3"), new C13604l("2.3.3", "2.3.3")};
        for (int i = 0; i < 9; i++) {
            C13604l lVar = lVarArr[i];
            String str3 = (String) lVar.f38555d;
            int length = str3.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = "";
                    str2 = str;
                    break;
                } else if (Character.isDigit(str3.charAt(i2))) {
                    str = str3.substring(0, i2);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    str2 = str3.substring(i2, str3.length());
                    C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                } else {
                    i2++;
                }
            }
            int[] b = f197012a.mo94234b(str2);
            int hashCode = str.hashCode();
            if (hashCode != 0) {
                if (hashCode != 94) {
                    if (hashCode == 126 && str.equals("~")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b[0]);
                        sb.append('.');
                        sb.append(b[1]);
                        sb.append('.');
                        str3 = sb.toString();
                    }
                    throw new IllegalStateException(("invalid input " + ((String) lVar.f38555d)).toString());
                } else if (str.equals("^")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(b[0]);
                    sb4.append('.');
                    str3 = sb4.toString();
                } else {
                    throw new IllegalStateException(("invalid input " + ((String) lVar.f38555d)).toString());
                }
            } else if (!str.equals("")) {
                throw new IllegalStateException(("invalid input " + ((String) lVar.f38555d)).toString());
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 16; i3++) {
                String str4 = strArr[i3];
                if (C112551y.m153820t(str4, str3, false, 2, (Object) null)) {
                    arrayList.add(str4);
                }
            }
            String str5 = (String) f197012a.mo94233a(arrayList, C68584c.f197015d);
            Log.m105924i("Luggage.SEMVER", "testMatchAlgo, " + lVar + " -> " + str5);
            C87412m.m108589b(str5, lVar.f38556e);
        }
    }

    /* renamed from: a */
    public final <T> T mo94233a(List<? extends T> list, C32226l<? super T, String> lVar) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(lVar, "selector");
        ArrayList arrayList = new ArrayList(list.size());
        for (T next : list) {
            arrayList.add(new C68583b(next, f197012a.mo94234b(lVar.invoke(next))));
        }
        C77813z.m93909o(arrayList, new C68582a());
        return ((C68583b) C110818d0.m150923U(arrayList)).f197013a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo94234b(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {0, 0, 0} // fill-array
            r2 = 0
            java.lang.String r3 = " -> "
            java.lang.String r4 = "splitVersionArray, "
            java.lang.String r5 = "Luggage.SEMVER"
            if (r11 == 0) goto L_0x001b
            int r6 = r11.length()     // Catch:{ all -> 0x0019 }
            if (r6 != 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r6 = 0
            goto L_0x001c
        L_0x0019:
            r0 = move-exception
            goto L_0x0059
        L_0x001b:
            r6 = 1
        L_0x001c:
            if (r6 == 0) goto L_0x003b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0023:
            r0.append(r4)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = java.util.Arrays.toString(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            return r1
        L_0x003b:
            java.lang.String r6 = "."
            java.lang.String[] r6 = u24.C90599h.m113520m(r11, r6)     // Catch:{ all -> 0x0019 }
            r7 = 0
        L_0x0042:
            if (r7 >= r0) goto L_0x0053
            int r8 = r6.length     // Catch:{ all -> 0x0019 }
            int r9 = r7 + 1
            if (r8 < r9) goto L_0x0051
            r8 = r6[r7]     // Catch:{ all -> 0x0019 }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x0019 }
            r1[r7] = r8     // Catch:{ all -> 0x0019 }
        L_0x0051:
            r7 = r9
            goto L_0x0042
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0023
        L_0x0059:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r11)
            r2.append(r3)
            java.lang.String r11 = java.util.Arrays.toString(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C68581w1.mo94234b(java.lang.String):int[]");
    }
}
