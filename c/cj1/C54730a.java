package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import ks3.C61158a;
import ks3.C61159e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: cj1.a */
public final class C54730a {

    /* renamed from: a */
    public static final C54730a f153378a = new C54730a();

    /* renamed from: b */
    public static final boolean f153379b;

    /* renamed from: c */
    public static final C13601g f153380c = C36568h.m40985a(C28566b.f78430d);

    /* renamed from: cj1.a$b */
    public static final class C28566b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C28566b f78430d = new C28566b();

        public C28566b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("BeautySuitDataManager");
        }
    }

    /* renamed from: cj1.a$a */
    public static final class C54731a {

        /* renamed from: a */
        public static final C54731a f153381a = new C54731a();

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r1 = r1.f154259T2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo75621a() {
            /*
                r10 = this;
                java.lang.String r0 = ";"
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ Exception -> 0x0135 }
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.mo77630e(r2)     // Catch:{ Exception -> 0x0135 }
                cl1.o r1 = (cl1.C54991o) r1     // Catch:{ Exception -> 0x0135 }
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                fe1.q r1 = r1.f154259T2     // Catch:{ Exception -> 0x0135 }
                if (r1 == 0) goto L_0x001c
                int r1 = r1.getSex()     // Catch:{ Exception -> 0x0135 }
                if (r1 != r2) goto L_0x001c
                r1 = 1
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0135 }
                r4.<init>()     // Catch:{ Exception -> 0x0135 }
                cj1.a r5 = cj1.C54730a.f153378a     // Catch:{ Exception -> 0x0135 }
                int r6 = r5.mo75616c()     // Catch:{ Exception -> 0x0135 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135 }
                r7.<init>()     // Catch:{ Exception -> 0x0135 }
                r8 = -1000(0xfffffffffffffc18, float:NaN)
                int r9 = r5.mo75615b(r6, r3, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 2
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 8
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 14
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 5
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 19
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 18
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 15
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 11
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 12
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 13
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 16
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 17
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 10
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 6
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 7
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 9
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 3
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 21
                int r9 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r9)     // Catch:{ Exception -> 0x0135 }
                r7.append(r0)     // Catch:{ Exception -> 0x0135 }
                r9 = 20
                int r1 = r5.mo75615b(r6, r9, r1, r8)     // Catch:{ Exception -> 0x0135 }
                r7.append(r1)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = "type"
                int r6 = r6 + r2
                r4.put(r1, r6)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = "result"
                java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x0135 }
                r4.put(r1, r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "beautyJson.toString()"
                gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = ","
                java.lang.String r0 = z04.C112551y.m153814n(r1, r2, r0, r3)     // Catch:{ Exception -> 0x0135 }
                return r0
            L_0x0135:
                r0 = move-exception
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.BeautySuitDataManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54730a.C54731a.mo75621a():java.lang.String");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if ((com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r0) == 1.0f) == false) goto L_0x0036;
     */
    static {
        /*
            cj1.a r0 = new cj1.a
            r0.<init>()
            f153378a = r0
            java.lang.Class<q00.e> r0 = q00.C12024e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            q00.e r0 = (q00.C12024e) r0
            q00.g$a r1 = q00.C110264g.C47730a.APP_LIVEVLOG
            java.lang.String r2 = "FaceBeautyLevel"
            java.lang.String r0 = r0.yl0(r1, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = 1
        L_0x0025:
            if (r3 != 0) goto L_0x0036
            float r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 != 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            f153379b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#init cfgValue="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.BeautySuitDataManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.a$b r0 = cj1.C54730a.C28566b.f78430d
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            f153380c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54730a.<clinit>():void");
    }

    /* renamed from: a */
    public final String mo75614a(int i, int i2) {
        return "MMKV_BEAUTY_VALUE_" + C86709a0.m107523b().mo121110g() + '_' + i + '_' + i2;
    }

    /* renamed from: b */
    public final int mo75615b(int i, int i2, boolean z, int i3) {
        if (f153379b) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                case 20:
                case 21:
                    return i3;
            }
        }
        return mo75618e().getInt(mo75614a(i, i2), mo75617d(i, i2, z, false));
    }

    /* renamed from: c */
    public final int mo75616c() {
        MultiProcessMMKV e = mo75618e();
        String str = "MMKV_KEY_SUIT_ID_" + C86709a0.m107523b().mo121110g();
        int i = C61158a.f174107a;
        return e.getInt(str, -1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        return 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        return 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        return 40;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo75617d(int r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            int r0 = ks3.C61159e.f174108a
            r0 = 35
            r1 = 20
            r2 = 30
            r3 = 40
            r4 = 0
            if (r10 != 0) goto L_0x0032
            r10 = 80
            r5 = 10
            switch(r11) {
                case 0: goto L_0x0031;
                case 1: goto L_0x002f;
                case 2: goto L_0x002f;
                case 3: goto L_0x002d;
                case 4: goto L_0x002a;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                case 7: goto L_0x0024;
                case 8: goto L_0x0027;
                case 9: goto L_0x0021;
                case 10: goto L_0x002d;
                case 11: goto L_0x002a;
                case 12: goto L_0x002a;
                case 13: goto L_0x002f;
                case 14: goto L_0x002a;
                case 15: goto L_0x002d;
                case 16: goto L_0x002d;
                case 17: goto L_0x002d;
                case 18: goto L_0x001b;
                case 19: goto L_0x0015;
                case 20: goto L_0x002a;
                case 21: goto L_0x0021;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x002d
        L_0x0015:
            if (r13 == 0) goto L_0x0018
            goto L_0x002f
        L_0x0018:
            if (r12 == 0) goto L_0x002f
            goto L_0x002d
        L_0x001b:
            if (r13 == 0) goto L_0x001e
            goto L_0x002f
        L_0x001e:
            if (r12 == 0) goto L_0x002d
            goto L_0x002f
        L_0x0021:
            r0 = 30
            goto L_0x0031
        L_0x0024:
            r0 = 80
            goto L_0x0031
        L_0x0027:
            r0 = 40
            goto L_0x0031
        L_0x002a:
            r0 = 10
            goto L_0x0031
        L_0x002d:
            r0 = 0
            goto L_0x0031
        L_0x002f:
            r0 = 20
        L_0x0031:
            return r0
        L_0x0032:
            r5 = 1
            r6 = 60
            r7 = 50
            r8 = 90
            if (r10 != r5) goto L_0x005c
            switch(r11) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0056;
                case 2: goto L_0x0053;
                case 3: goto L_0x0051;
                case 4: goto L_0x0056;
                case 5: goto L_0x0053;
                case 6: goto L_0x004e;
                case 7: goto L_0x004e;
                case 8: goto L_0x004b;
                case 9: goto L_0x0056;
                case 10: goto L_0x0051;
                case 11: goto L_0x005b;
                case 12: goto L_0x0056;
                case 13: goto L_0x0056;
                case 14: goto L_0x0056;
                case 15: goto L_0x0051;
                case 16: goto L_0x0051;
                case 17: goto L_0x0051;
                case 18: goto L_0x0045;
                case 19: goto L_0x003f;
                case 20: goto L_0x005b;
                case 21: goto L_0x0053;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0051
        L_0x003f:
            if (r13 == 0) goto L_0x0042
            goto L_0x0056
        L_0x0042:
            if (r12 == 0) goto L_0x0056
            goto L_0x0051
        L_0x0045:
            if (r13 == 0) goto L_0x0048
            goto L_0x0056
        L_0x0048:
            if (r12 == 0) goto L_0x0051
            goto L_0x0056
        L_0x004b:
            r1 = 50
            goto L_0x005b
        L_0x004e:
            r1 = 90
            goto L_0x005b
        L_0x0051:
            r1 = 0
            goto L_0x005b
        L_0x0053:
            r1 = 40
            goto L_0x005b
        L_0x0056:
            r1 = 30
            goto L_0x005b
        L_0x0059:
            r1 = 60
        L_0x005b:
            return r1
        L_0x005c:
            r1 = 2
            if (r10 != r1) goto L_0x0088
            r10 = 100
            switch(r11) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0082;
                case 2: goto L_0x007f;
                case 3: goto L_0x007d;
                case 4: goto L_0x0087;
                case 5: goto L_0x0082;
                case 6: goto L_0x007a;
                case 7: goto L_0x007a;
                case 8: goto L_0x0077;
                case 9: goto L_0x0074;
                case 10: goto L_0x007d;
                case 11: goto L_0x0082;
                case 12: goto L_0x0071;
                case 13: goto L_0x0082;
                case 14: goto L_0x0087;
                case 15: goto L_0x007d;
                case 16: goto L_0x007d;
                case 17: goto L_0x007d;
                case 18: goto L_0x006b;
                case 19: goto L_0x0065;
                case 20: goto L_0x0082;
                case 21: goto L_0x0071;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x007d
        L_0x0065:
            if (r13 == 0) goto L_0x0068
            goto L_0x0082
        L_0x0068:
            if (r12 == 0) goto L_0x0082
            goto L_0x007d
        L_0x006b:
            if (r13 == 0) goto L_0x006e
            goto L_0x0082
        L_0x006e:
            if (r12 == 0) goto L_0x007d
            goto L_0x0082
        L_0x0071:
            r0 = 50
            goto L_0x0087
        L_0x0074:
            r0 = 30
            goto L_0x0087
        L_0x0077:
            r0 = 60
            goto L_0x0087
        L_0x007a:
            r0 = 100
            goto L_0x0087
        L_0x007d:
            r0 = 0
            goto L_0x0087
        L_0x007f:
            r0 = 70
            goto L_0x0087
        L_0x0082:
            r0 = 40
            goto L_0x0087
        L_0x0085:
            r0 = 90
        L_0x0087:
            return r0
        L_0x0088:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54730a.mo75617d(int, int, boolean, boolean):int");
    }

    /* renamed from: e */
    public final MultiProcessMMKV mo75618e() {
        return (MultiProcessMMKV) ((C36570n) f153380c).getValue();
    }

    /* renamed from: f */
    public final void mo75619f(int i, int i2, int i3) {
        Log.m105924i("Finder.BeautySuitDataManager", "#setBeauty suitId=" + i + " beautyId=" + i2 + " beautyValue" + i3);
        int i4 = C61159e.f174108a;
        if (i != -1) {
            int i5 = C61158a.f174107a;
            if (i != -1000) {
                mo75618e().putInt(mo75614a(i, i2), i3);
            }
        }
    }

    /* renamed from: g */
    public final void mo75620g(int i) {
        MultiProcessMMKV e = mo75618e();
        e.putInt("MMKV_KEY_SUIT_ID_" + C86709a0.m107523b().mo121110g(), i);
    }
}
