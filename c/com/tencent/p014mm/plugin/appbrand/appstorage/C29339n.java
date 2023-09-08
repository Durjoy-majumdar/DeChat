package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64186f0;
import z04.C112551y;
import z04.C66723k;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n */
public final class C29339n implements C81414g0 {

    /* renamed from: h */
    public static final C29340a f80095h = new C29340a((C8480h) null);

    /* renamed from: i */
    public static final Map<Long, C29339n> f80096i = new LinkedHashMap();

    /* renamed from: d */
    public C29335j0 f80097d;

    /* renamed from: e */
    public MultiProcessMMKV f80098e;

    /* renamed from: f */
    public final C32226l<String, String> f80099f;

    /* renamed from: g */
    public final C32227p<String, String, C13598b0> f80100g;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$a */
    public static final class C29340a {
        public C29340a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C29339n mo56626a(long j) {
            Map<Long, C29339n> map = C29339n.f80096i;
            synchronized (map) {
                if (!((LinkedHashMap) map).keySet().contains(Long.valueOf(j))) {
                    map.put(Long.valueOf(j), new C29339n(j, ""));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Object obj = ((LinkedHashMap) map).get(Long.valueOf(j));
            C87412m.m108591d(obj);
            return (C29339n) obj;
        }

        /* renamed from: b */
        public final void mo56627b(long j) {
            Map<Long, C29339n> map = C29339n.f80096i;
            synchronized (map) {
                map.remove(Long.valueOf(j));
                Log.m105924i("AppBrandMMKVStorage", "onAccountRelease remove cache uin:" + j);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$b */
    public static final class C29341b {

        /* renamed from: a */
        public final String f80101a;

        /* renamed from: b */
        public final String f80102b;

        /* renamed from: c */
        public final String f80103c;

        public C29341b(String str, String str2, String str3) {
            C87412m.m108594g(str, "data");
            C87412m.m108594g(str2, "type");
            C87412m.m108594g(str3, "size");
            this.f80101a = str;
            this.f80102b = str2;
            this.f80103c = str3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$c */
    public static final class C29342c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C29339n f80104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29342c(C29339n nVar) {
            super(1);
            this.f80104d = nVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "key");
            this.f80104d.f80098e.remove(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$d */
    public static final class C29343d extends C87413o implements C32226l<String, String> {

        /* renamed from: d */
        public final /* synthetic */ C29339n f80105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29343d(C29339n nVar) {
            super(1);
            this.f80105d = nVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "key");
            String string = this.f80105d.f80098e.getString(str, "");
            return string == null ? "" : string;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$e */
    public static final class C29344e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f80106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29344e(C8478d0 d0Var) {
            super(1);
            this.f80106d = d0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            this.f80106d.f27483d++;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.n$f */
    public static final class C29345f extends C87413o implements C32227p<String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C29339n f80107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29345f(C29339n nVar) {
            super(2);
            this.f80107d = nVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "value");
            this.f80107d.f80098e.putString(str, str2);
            return C13598b0.f38549a;
        }
    }

    public C29339n(long j, String str) {
        MultiProcessMMKV multiProcessMMKV;
        C87412m.m108594g(str, "storageFileNamePrefix");
        Log.m105924i("AppBrandMMKVStorage", "getMMKV uin:" + j);
        if (str.length() > 0) {
            multiProcessMMKV = MultiProcessMMKV.getMMKV(str + j);
            C87412m.m108593f(multiProcessMMKV, "{\n            MultiProce…mePrefix + uin)\n        }");
        } else {
            multiProcessMMKV = MultiProcessMMKV.getMMKV("AppBrandMMKVStorage" + j);
            C87412m.m108593f(multiProcessMMKV, "{\n            MultiProce…MKV(NAME + uin)\n        }");
        }
        this.f80098e = multiProcessMMKV;
        this.f80099f = new C29343d(this);
        this.f80100g = new C29345f(this);
    }

    /* renamed from: Bh */
    public Object[] mo56588Bh(int i, String str) {
        String str2;
        if (str == null) {
            return new Object[]{C64186f0.f181907d, 0, 0};
        }
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            str2 = str + "__";
        } else {
            str2 = i + "__" + str + "__";
        }
        String[] allKeys = this.f80098e.allKeys();
        if (allKeys == null) {
            allKeys = new String[0];
        }
        for (String str3 : allKeys) {
            C87412m.m108593f(str3, "key");
            if (C112551y.m153819s(str3, str2, false)) {
                arrayList.add(C112551y.m153814n(str3, str2, "", false));
            }
        }
        return new Object[]{arrayList, Integer.valueOf(mo56619c(i, str)), Integer.valueOf(C81420m0.m99901g(i, str))};
    }

    /* renamed from: Bk */
    public int mo56589Bk(String str) {
        C87412m.m108594g(str, "appId");
        int i = 0;
        for (int c : C81420m0.m99900f(str, this.f80099f, this.f80100g)) {
            i += mo56619c(c, str);
        }
        return i;
    }

    /* renamed from: S */
    public void mo56590S(int i, String str) {
        String str2;
        if (!Util.isNullOrNil(str)) {
            if (i == 0) {
                str2 = str + "__";
            } else {
                str2 = i + "__" + str + "__";
            }
            String[] allKeys = this.f80098e.allKeys();
            if (allKeys == null) {
                allKeys = new String[0];
            }
            for (String str3 : allKeys) {
                C87412m.m108593f(str3, "key");
                if (C112551y.m153819s(str3, str2, false)) {
                    this.f80098e.remove(str3);
                }
            }
            C87412m.m108591d(str);
            mo56624h(i, str, 0);
            C81420m0.m99902h(str, i, this.f80099f, this.f80100g);
        }
    }

    /* renamed from: T0 */
    public C81414g0.C29326a mo56591T0(int i, String str, List<C81414g0.C29327b> list) {
        boolean z;
        C87412m.m108594g(list, "kvInfo");
        if (!Util.isNullOrNil(str)) {
            boolean z2 = true;
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Util.isNullOrNil(((C81414g0.C29327b) it.next()).f80075a)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                C87412m.m108591d(str);
                int i2 = 0;
                int i3 = 0;
                for (C81414g0.C29327b next : list) {
                    i2 += C81420m0.m99896b(next.f80075a, next.f80076b);
                    String str2 = next.f80075a;
                    C87412m.m108591d(str2);
                    i3 += mo56618b(C81420m0.m99899e(i, str, str2, "__"));
                }
                if (mo56619c(i, str) + (i2 - i3) < C81420m0.m99901g(i, str)) {
                    z2 = false;
                }
                if (z2) {
                    return C81414g0.C29326a.QUOTA_REACHED;
                }
                for (C81414g0.C29327b next2 : list) {
                    String str3 = next2.f80075a;
                    String str4 = next2.f80076b;
                    int b = C81420m0.m99896b(str3, str4);
                    String str5 = next2.f80077c;
                    C87412m.m108593f(str5, "info.dataType");
                    mo56623g(i, str, str3, str4, b, str5, false);
                }
                return C81414g0.C29326a.NONE;
            }
        }
        return C81414g0.C29326a.MISSING_PARAMS;
    }

    /* renamed from: a */
    public void mo56617a(String str) {
        if (!Util.isNullOrNil(str)) {
            C87412m.m108591d(str);
            for (int h : C81420m0.m99900f(str, this.f80099f, this.f80100g)) {
                mo56624h(h, str, 0);
            }
            mo56620d(str, new C29342c(this));
            C32226l<String, String> lVar = this.f80099f;
            C32227p<String, String, C13598b0> pVar = this.f80100g;
            C87412m.m108594g(lVar, "getter");
            C87412m.m108594g(pVar, "setter");
            ((C29345f) pVar).invoke(C81420m0.m99898d(str, "@@@TOTAL@STORAGE@ID@@@"), "");
        }
    }

    /* renamed from: b */
    public final int mo56618b(String str) {
        String str2 = "";
        String string = this.f80098e.getString(str, str2);
        if (string != null) {
            str2 = string;
        }
        try {
            return Integer.parseInt(mo56625i(str2).f80103c);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo56619c(int i, String str) {
        return Util.getInt(this.f80098e.getString(C81420m0.m99899e(i, str, "@@@TOTAL@DATA@SIZE@@@", "++"), ""), 0);
    }

    /* renamed from: cg */
    public C81414g0.C29326a mo56593cg(int i, String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return C81414g0.C29326a.MISSING_PARAMS;
        }
        C87412m.m108591d(str);
        C87412m.m108591d(str2);
        String e = C81420m0.m99899e(i, str, str2, "__");
        int max = Math.max(0, mo56619c(i, str) + (-mo56618b(e)));
        mo56624h(i, str, max);
        this.f80098e.remove(e);
        if (max <= 0) {
            C81420m0.m99902h(str, i, this.f80099f, this.f80100g);
        }
        return C81414g0.C29326a.NONE;
    }

    /* renamed from: d */
    public final void mo56620d(String str, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(lVar, "block");
        String str2 = "^([1-9]\\d*__)?" + str + "__.+$";
        C87412m.m108594g(str2, "pattern");
        Pattern compile = Pattern.compile(str2);
        C87412m.m108593f(compile, "compile(pattern)");
        String[] allKeys = this.f80098e.allKeys();
        if (allKeys == null) {
            allKeys = new String[0];
        }
        for (String str3 : allKeys) {
            C87412m.m108593f(str3, "key");
            if (compile.matcher(str3).matches()) {
                lVar.invoke(str3);
            }
        }
    }

    /* renamed from: e */
    public int mo56621e(String str) {
        C87412m.m108594g(str, "appId");
        C8478d0 d0Var = new C8478d0();
        mo56620d(str, new C29344e(d0Var));
        return d0Var.f27483d;
    }

    /* renamed from: f */
    public C81414g0.C29326a mo56622f(int i, String str, String str2, String str3, String str4, int i2) {
        C87412m.m108594g(str4, "dataType");
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return C81414g0.C29326a.MISSING_PARAMS;
        }
        C87412m.m108591d(str);
        return mo56623g(i, str, str2, str3, i2, str4, true);
    }

    /* renamed from: g */
    public final C81414g0.C29326a mo56623g(int i, String str, String str2, String str3, int i2, String str4, boolean z) {
        C87412m.m108591d(str);
        C87412m.m108591d(str2);
        String e = C81420m0.m99899e(i, str, str2, "__");
        int b = i2 - mo56618b(e);
        if (z) {
            if (mo56619c(i, str) + b >= C81420m0.m99901g(i, str)) {
                return C81414g0.C29326a.QUOTA_REACHED;
            }
        }
        C29335j0 j0Var = this.f80097d;
        if (j0Var != null) {
            C13604l<Boolean, String> b2 = j0Var.mo56598b(str2, str3 == null ? "" : str3, str4);
            if (!((Boolean) b2.f38555d).booleanValue()) {
                return C81414g0.C29326a.VALUE_PROCESS_FAIL;
            }
            String str5 = (String) b2.f38556e;
            if (str5 != null) {
                str3 = str5;
            }
        }
        MultiProcessMMKV multiProcessMMKV = this.f80098e;
        multiProcessMMKV.putString(e, "" + str4 + '#' + i2 + '#' + str3);
        mo56624h(i, str, Math.max(0, mo56619c(i, str) + b));
        C81420m0.m99895a(str, i, this.f80099f, this.f80100g);
        return C81414g0.C29326a.NONE;
    }

    /* renamed from: g5 */
    public List<Object[]> mo56594g5(int i, String str, List<String> list) {
        C87412m.m108594g(list, "keys");
        ArrayList arrayList = new ArrayList();
        for (String xf : list) {
            arrayList.add(mo56596xf(i, str, xf));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo56624h(int i, String str, int i2) {
        this.f80098e.putString(C81420m0.m99899e(i, str, "@@@TOTAL@DATA@SIZE@@@", "++"), String.valueOf(i2));
    }

    /* renamed from: i */
    public final C29341b mo56625i(String str) {
        Object[] array = new C66723k("#").mo90760e(str, 3).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return strArr.length == 3 ? new C29341b(strArr[2], strArr[0], strArr[1]) : new C29341b("", "", "");
    }

    /* renamed from: j0 */
    public C81414g0.C29326a mo56595j0(int i, String str, String str2, String str3, String str4) {
        C87412m.m108594g(str4, "dataType");
        return mo56622f(i, str, str2, str3, str4, C81420m0.m99896b(str2, str3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* renamed from: xf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] mo56596xf(int r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.appstorage.g0$a r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0.C29326a.NONE
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0095
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 == 0) goto L_0x0012
            goto L_0x0095
        L_0x0012:
            gy3.C87412m.m108591d(r9)
            gy3.C87412m.m108591d(r10)
            java.lang.String r1 = "__"
            java.lang.String r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0.m99899e(r8, r9, r10, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = r7.f80098e
            java.lang.String r1 = ""
            java.lang.String r8 = r9.getString(r8, r1)
            if (r8 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r8
        L_0x002a:
            com.tencent.mm.plugin.appbrand.appstorage.n$b r8 = r7.mo56625i(r1)
            java.lang.String r9 = r8.f80101a
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0038
            r9 = 1
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = r8.f80102b
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0045
            r9 = 1
            goto L_0x0046
        L_0x0045:
            r9 = 0
        L_0x0046:
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = r8.f80103c
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0057
            r9 = 1
            goto L_0x0058
        L_0x0057:
            r9 = 0
        L_0x0058:
            if (r9 != 0) goto L_0x0092
            com.tencent.mm.plugin.appbrand.appstorage.j0 r9 = r7.f80097d
            r1 = 2
            r4 = 3
            if (r9 == 0) goto L_0x0085
            gy3.C87412m.m108591d(r9)
            java.lang.String r5 = r8.f80101a
            java.lang.String r6 = r8.f80102b
            rx3.l r9 = r9.mo56597a(r10, r5, r6)
            A r10 = r9.f38555d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0078
            java.lang.Object[] r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0.f238952a
            return r8
        L_0x0078:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r2] = r0
            B r9 = r9.f38556e
            r10[r3] = r9
            java.lang.String r8 = r8.f80102b
            r10[r1] = r8
            return r10
        L_0x0085:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r2] = r0
            java.lang.String r10 = r8.f80101a
            r9[r3] = r10
            java.lang.String r8 = r8.f80102b
            r9[r1] = r8
            return r9
        L_0x0092:
            java.lang.Object[] r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0.f238952a
            return r8
        L_0x0095:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.mm.plugin.appbrand.appstorage.g0$a r9 = com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0.C29326a.MISSING_PARAMS
            r8[r2] = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C29339n.mo56596xf(int, java.lang.String, java.lang.String):java.lang.Object[]");
    }
}
