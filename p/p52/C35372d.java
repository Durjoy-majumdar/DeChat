package p52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import d42.C31068j;
import e42.C31415g;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import z04.C66723k;

/* renamed from: p52.d */
public final class C35372d implements C31068j {

    /* renamed from: c */
    public static final Map<String, C35372d> f94707c = new LinkedHashMap();

    /* renamed from: a */
    public MultiProcessMMKV f94708a;

    /* renamed from: b */
    public String f94709b;

    /* renamed from: p52.d$a */
    public static final class C35373a {

        /* renamed from: a */
        public final String f94710a;

        /* renamed from: b */
        public final String f94711b;

        /* renamed from: c */
        public final String f94712c;

        public C35373a(String str, String str2, String str3) {
            C87412m.m108594g(str, "data");
            C87412m.m108594g(str2, "type");
            C87412m.m108594g(str3, "size");
            this.f94710a = str;
            this.f94711b = str2;
            this.f94712c = str3;
        }
    }

    public C35372d(int i, String str, String str2) {
        MultiProcessMMKV multiProcessMMKV;
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "storageFileNamePrefix");
        Log.m105924i("MagicBrushMMKVStorage", "getMMKV uin:" + i + " bizName:" + str);
        this.f94709b = str;
        if (str2.length() > 0) {
            multiProcessMMKV = MultiProcessMMKV.getMMKV(str2 + i);
            C87412m.m108593f(multiProcessMMKV, "{\n            MultiProce…mePrefix + uin)\n        }");
        } else {
            multiProcessMMKV = MultiProcessMMKV.getMMKV("MagicBrushMMKVStorage" + i);
            C87412m.m108593f(multiProcessMMKV, "{\n            MultiProce…MKV(NAME + uin)\n        }");
        }
        this.f94708a = multiProcessMMKV;
    }

    /* renamed from: a */
    public C31415g mo57963a(String str, String str2) {
        if (Util.isNullOrNil(this.f94709b) || Util.isNullOrNil(str2)) {
            return C31415g.C31417c.f84095b;
        }
        String str3 = this.f94709b;
        C87412m.m108591d(str3);
        C87412m.m108591d(str2);
        String a = C35371c.m40661a(str3, str2, "__");
        String str4 = "";
        String string = this.f94708a.getString(a, str4);
        if (string != null) {
            str4 = string;
        }
        try {
            Integer.parseInt(mo60235e(str4).f94712c);
        } catch (NumberFormatException unused) {
        }
        this.f94708a.remove(a);
        return C31415g.C7595b.f25862a;
    }

    /* renamed from: b */
    public C31415g mo57964b(String str, String str2, String str3, String str4) {
        int i;
        C87412m.m108594g(str4, "dataType");
        Object[] objArr = C35371c.f94706a;
        int length = (str2 == null ? "" : str2).length() + (str3 == null ? "" : str3).length();
        if (Util.isNullOrNil(this.f94709b) || Util.isNullOrNil(str2)) {
            return C31415g.C31417c.f84095b;
        }
        C87412m.m108591d(this.f94709b);
        String str5 = this.f94709b;
        C87412m.m108591d(str5);
        C87412m.m108591d(str2);
        String a = C35371c.m40661a(str5, str2, "__");
        String string = this.f94708a.getString(a, "");
        if (string == null) {
            string = "";
        }
        try {
            i = Integer.parseInt(mo60235e(string).f94712c);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        int i2 = length - i;
        int d = mo60234d(this.f94709b) + i2;
        C87412m.m108594g(this.f94709b, "bizName");
        if (d >= 209715200) {
            return C31415g.C31417c.f84096c;
        }
        MultiProcessMMKV multiProcessMMKV = this.f94708a;
        multiProcessMMKV.putString(a, "" + str4 + '#' + length + '#' + str3);
        this.f94708a.putString(C35371c.m40661a(this.f94709b, "@@@TOTAL@DATA@SIZE@@@", "++"), String.valueOf(Math.max(0, mo60234d(this.f94709b) + i2)));
        return C31415g.C7595b.f25862a;
    }

    /* renamed from: c */
    public boolean mo57965c(String str, String str2) {
        if (!Util.isNullOrNil(this.f94709b) && !Util.isNullOrNil(str2)) {
            String str3 = this.f94709b;
            C87412m.m108591d(str3);
            C87412m.m108591d(str2);
            if (this.f94708a.containsKey(C35371c.m40661a(str3, str2, "__"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo60234d(String str) {
        C87412m.m108594g(str, "bizName");
        return Util.getInt(this.f94708a.getString(C35371c.m40661a(this.f94709b, "@@@TOTAL@DATA@SIZE@@@", "++"), ""), 0);
    }

    /* renamed from: e */
    public final C35373a mo60235e(String str) {
        Object[] array = new C66723k("#").mo90760e(str, 3).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return strArr.length == 3 ? new C35373a(strArr[2], strArr[0], strArr[1]) : new C35373a("", "", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] mo57966w(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r4 = r3.f94709b
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L_0x006f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r4 == 0) goto L_0x0011
            goto L_0x006f
        L_0x0011:
            java.lang.String r4 = r3.f94709b
            gy3.C87412m.m108591d(r4)
            gy3.C87412m.m108591d(r5)
            java.lang.String r2 = "__"
            java.lang.String r4 = p52.C35371c.m40661a(r4, r5, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r3.f94708a
            java.lang.String r2 = ""
            java.lang.String r4 = r5.getString(r4, r2)
            if (r4 != 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r4
        L_0x002b:
            p52.d$a r4 = r3.mo60235e(r2)
            java.lang.String r5 = r4.f94710a
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r4.f94711b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0046
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r4.f94712c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 == 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 != 0) goto L_0x006c
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            e42.g r2 = e42.C31415g.C7595b.f25862a
            r5[r0] = r2
            java.lang.String r0 = r4.f94710a
            r5[r1] = r0
            r0 = 2
            java.lang.String r4 = r4.f94711b
            r5[r0] = r4
            return r5
        L_0x006c:
            java.lang.Object[] r4 = p52.C35371c.f94706a
            return r4
        L_0x006f:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            e42.g r5 = e42.C31415g.C31417c.f84095b
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.C35372d.mo57966w(java.lang.String, java.lang.String):java.lang.Object[]");
    }
}
