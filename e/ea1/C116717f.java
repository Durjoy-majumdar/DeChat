package ea1;

import ba1.C113150a;
import ba1.C113156i;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n91.C117615g;
import org.json.JSONObject;
import te3.C101777fg2;
import te3.C110974w14;
import te3.C118427eg2;
import te3.C118434gg2;
import te3.C118438ja3;
import te3.C118464s14;
import te3.C118472u14;
import te3.C50921q7;
import te3.C51991xl2;
import te3.C64764v14;
import te3.xr4;
import te3.yr4;

/* renamed from: ea1.f */
public final class C116717f {
    /* renamed from: a */
    public static JSONObject m164608a(C118434gg2 gg22) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tbe", gg22.f354026d);
            long j = gg22.f354027e - gg22.f354026d;
            if (j <= 0) {
                j = 0;
            }
            jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, j);
            jSONObject.put("vv", "2.0");
            return jSONObject;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSessionReport", e, "createJSONObjectHead, crash: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m164609b(Map<Long, List<C118472u14>> map) {
        List list;
        C64764v14 a = C113156i.m154833a("mmkv_key_hellSPMatchSuche_");
        if (a != null && !a.f185819d.isEmpty()) {
            Iterator<C118472u14> it = a.f185819d.iterator();
            while (it.hasNext()) {
                C118472u14 next = it.next();
                if (map.containsKey(Long.valueOf(next.f354478g))) {
                    list = map.get(Long.valueOf(next.f354478g));
                    if (list == null) {
                        list = new ArrayList();
                    }
                } else {
                    list = new ArrayList();
                }
                list.add(next);
                map.put(Long.valueOf(next.f354478g), list);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0169  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.Long, java.util.List<te3.C118472u14>> m164610c(java.util.Map<java.lang.String, java.util.List<te3.C118427eg2>> r17, te3.C22505ka3 r18) {
        /*
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r17.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "HABBYGE-MALI.HellSessionReport"
            java.lang.String r5 = "filter, filterBySessionPageCloudConfig: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = r17.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            r8 = 2
            if (r7 == 0) goto L_0x01ea
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r9)
            boolean r11 = e91.C116711b.m164591p(r10)
            if (r11 != 0) goto L_0x0064
            java.lang.String r10 = "_"
            java.lang.String[] r11 = new java.lang.String[]{r10}
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            r10 = r9
            java.util.List r10 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)
            int r11 = r10.size()
            if (r11 >= r8) goto L_0x005d
            r10 = r9
            goto L_0x0064
        L_0x005d:
            java.lang.Object r8 = r10.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r10 = r8
        L_0x0064:
            if (r10 != 0) goto L_0x0067
            goto L_0x0029
        L_0x0067:
            java.util.List r8 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162223f(r10, r1)
            if (r8 == 0) goto L_0x0029
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0074
            goto L_0x0029
        L_0x0074:
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x007e:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0029
            java.lang.Object r10 = r7.next()
            te3.eg2 r10 = (te3.C118427eg2) r10
            java.util.Map r11 = m164611d(r10, r8)
            if (r11 != 0) goto L_0x0091
            goto L_0x007e
        L_0x0091:
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x007e
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            java.lang.Object r12 = r12.getValue()
            te3.u14 r12 = (te3.C118472u14) r12
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            boolean r15 = r5.containsKey(r15)
            if (r15 == 0) goto L_0x0170
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            java.lang.Object r15 = r5.get(r15)
            te3.u14 r15 = (te3.C118472u14) r15
            if (r15 != 0) goto L_0x00e9
            te3.u14 r15 = new te3.u14
            r15.<init>()
            int r4 = r12.f354475d
            r15.f354475d = r4
            java.lang.String r4 = r12.f354479h
            r15.f354479h = r4
            boolean r4 = r12.f354481j
            r15.f354481j = r4
            r15.f354478g = r13
            r15.f354477f = r9
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r5.put(r4, r15)
        L_0x00e9:
            java.util.LinkedList<te3.eg2> r4 = r15.f354480i
            r4.add(r10)
            int r4 = r12.f354475d
            if (r4 >= 0) goto L_0x0129
            boolean r4 = r12.f354476e
            if (r4 == 0) goto L_0x0121
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x0112
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            java.lang.Object r4 = r2.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0117
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x0117
        L_0x0112:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0117:
            r4.add(r15)
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r2.put(r12, r4)
        L_0x0121:
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r5.remove(r4)
            goto L_0x0135
        L_0x0129:
            if (r4 != 0) goto L_0x0139
            java.util.LinkedList<te3.eg2> r4 = r15.f354480i
            r4.clear()
            java.util.LinkedList<te3.eg2> r4 = r15.f354480i
            r4.add(r10)
        L_0x0135:
            r16 = r2
            goto L_0x01e4
        L_0x0139:
            java.util.LinkedList<te3.eg2> r4 = r15.f354480i
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0164
            java.util.LinkedList<te3.eg2> r4 = r15.f354480i
            int r12 = r4.size()
            int r12 = r12 - r1
            java.lang.Object r4 = r4.get(r12)
            te3.eg2 r4 = (te3.C118427eg2) r4
            java.lang.String r12 = r10.f353969d
            java.lang.String r13 = r4.f353969d
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0164
            long r12 = r10.f353970e
            r16 = r2
            long r1 = r4.f353970e
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0166
            r1 = 0
            goto L_0x0167
        L_0x0164:
            r16 = r2
        L_0x0166:
            r1 = 1
        L_0x0167:
            if (r1 == 0) goto L_0x01e4
            java.util.LinkedList<te3.eg2> r1 = r15.f354480i
            r1.add(r10)
            goto L_0x01e4
        L_0x0170:
            r16 = r2
            int r1 = r12.f354475d
            if (r1 < 0) goto L_0x0198
            te3.u14 r1 = new te3.u14
            r1.<init>()
            int r2 = r12.f354475d
            r1.f354475d = r2
            java.lang.String r2 = r12.f354479h
            r1.f354479h = r2
            boolean r2 = r12.f354481j
            r1.f354481j = r2
            r1.f354478g = r13
            r1.f354477f = r9
            java.util.LinkedList<te3.eg2> r2 = r1.f354480i
            r2.add(r10)
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r5.put(r2, r1)
            goto L_0x01e4
        L_0x0198:
            boolean r1 = r12.f354476e
            if (r1 == 0) goto L_0x01e4
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r2 = r16
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x01ba
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x01bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x01bf
        L_0x01ba:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x01bf:
            te3.u14 r4 = new te3.u14
            r4.<init>()
            int r15 = r12.f354475d
            r4.f354475d = r15
            java.lang.String r15 = r12.f354479h
            r4.f354479h = r15
            boolean r12 = r12.f354481j
            r4.f354481j = r12
            r4.f354478g = r13
            r4.f354477f = r9
            java.util.LinkedList<te3.eg2> r12 = r4.f354480i
            r12.add(r10)
            r1.add(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r2.put(r4, r1)
            goto L_0x01e6
        L_0x01e4:
            r2 = r16
        L_0x01e6:
            r1 = 1
            r4 = 0
            goto L_0x009b
        L_0x01ea:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r1[r6] = r4
            int r4 = r2.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r1[r6] = r4
            java.lang.String r4 = "filterBySessionPageCloudConfig, end: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x025d
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = r0.f64087d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x025d
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x021e
            goto L_0x025d
        L_0x021e:
            te3.v14 r1 = new te3.v14
            r1.<init>()
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x022b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x024f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            te3.u14 r4 = (te3.C118472u14) r4
            java.lang.String r5 = r4.f354477f
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x022b
            int r5 = r4.f354475d
            if (r5 <= 0) goto L_0x022b
            java.util.LinkedList<te3.u14> r5 = r1.f185819d
            r5.addLast(r4)
            goto L_0x022b
        L_0x024f:
            java.util.LinkedList<te3.u14> r0 = r1.f185819d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0258
            goto L_0x025d
        L_0x0258:
            java.lang.String r0 = "mmkv_key_hellSPMatchinghe_"
            ba1.C113156i.m154834b(r1, r0)
        L_0x025d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ea1.C116717f.m164610c(java.util.Map, te3.ka3):java.util.Map");
    }

    /* renamed from: d */
    public static Map<Long, C118472u14> m164611d(C118427eg2 eg22, List<C110974w14> list) {
        HashSet hashSet = new HashSet();
        String h = C116711b.m164583h(eg22.f353969d);
        if (h == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C110974w14 next : list) {
            boolean z = true;
            C118464s14 s142 = next.f332316f.get(next.f332320j + 1);
            boolean z2 = false;
            if (h.equals(C116711b.m164583h(s142.f354328d))) {
                int i = next.f332320j + 1;
                next.f332320j = i;
                if (i == next.f332316f.size() - 1) {
                    next.f332320j = -1;
                } else {
                    z = false;
                }
                m164613f(eg22, s142, next.f332315e);
                Iterator<C101777fg2> it = eg22.f353973h.iterator();
                while (it.hasNext()) {
                    C101777fg2 next2 = it.next();
                    if (next2 != null) {
                        hashSet.add(next2.f298259f);
                    }
                }
                z2 = z;
            } else {
                C118464s14 s143 = next.f332316f.get(0);
                if (h.equals(C116711b.m164583h(s143.f354328d))) {
                    next.f332320j = 0;
                    m164613f(eg22, s143, next.f332315e);
                } else {
                    next.f332320j = -1;
                }
            }
            C118472u14 u142 = new C118472u14();
            u142.f354475d = next.f332320j;
            u142.f354476e = z2;
            long j = next.f332315e;
            u142.f354478g = j;
            u142.f354477f = eg22.f353972g;
            u142.f354481j = next.f332318h;
            u142.f354479h = next.f332317g;
            hashMap.put(Long.valueOf(j), u142);
        }
        if (!hashSet.isEmpty()) {
            List<String> d = C113150a.m154817d();
            if (d != null && !d.isEmpty()) {
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    if (str != null && !d.contains(str)) {
                        d.add(str);
                    }
                }
                if (!d.isEmpty()) {
                    C50921q7 q7Var = new C50921q7();
                    q7Var.f140167d.addAll(d);
                    C113150a.m154816c(q7Var);
                }
            } else if (!hashSet.isEmpty()) {
                C50921q7 q7Var2 = new C50921q7();
                q7Var2.f140167d.addAll(hashSet);
                C113150a.m154816c(q7Var2);
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static boolean m164612e(String str, long j) {
        int i;
        if (str == null) {
            return false;
        }
        try {
            i = str.getBytes().length;
        } catch (Exception unused) {
            i = str.length();
        }
        return i >= 20480 || System.currentTimeMillis() - j >= 3600000;
    }

    /* renamed from: f */
    public static void m164613f(C118427eg2 eg22, C118464s14 s142, long j) {
        Iterator<xr4> it = eg22.f353976n.iterator();
        while (it.hasNext()) {
            xr4 next = it.next();
            if (next != null) {
                C51991xl2 xl22 = new C51991xl2();
                xl22.f144737d = j;
                Iterator<yr4> it4 = s142.f354330f.iterator();
                while (it4.hasNext()) {
                    yr4 next2 = it4.next();
                    if (next2 != null && (next2.f354607d.equals(next.f354547d) || next2.f354612i.equals(next.f354548e))) {
                        if (C117615g.f351847a.mo182337d(next.f354551h, next2.f354613j)) {
                            Log.m105925i("HABBYGE-MALI.HellSessionReport", "recordRealDataPath: id=%s, res=%s", next.f354547d, next.f354548e);
                            next.f354560t = false;
                            Iterator<C118438ja3> it5 = next2.f354611h.iterator();
                            while (it5.hasNext()) {
                                C118438ja3 next3 = it5.next();
                                if (next3 != null) {
                                    xl22.f144738e.add(next3.f354060e);
                                }
                            }
                        }
                    }
                }
                if (!xl22.f144738e.isEmpty()) {
                    next.f354559s.add(xl22);
                }
            }
        }
    }
}
