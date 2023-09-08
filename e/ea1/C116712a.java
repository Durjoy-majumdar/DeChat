package ea1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C101777fg2;
import te3.C110962fr1;
import te3.C118429er1;
import te3.C118464s14;

/* renamed from: ea1.a */
public final class C116712a {
    /* renamed from: a */
    public static void m164596a(JSONObject jSONObject, C110962fr1 fr12, C118429er1 er12) {
        JSONArray jSONArray = new JSONArray();
        if (er12 == null) {
            jSONObject.put("businessParam", jSONArray);
            return;
        }
        C118464s14 s142 = fr12.f331974f;
        String str = null;
        if (!fr12.f331973e.isEmpty() && fr12.f331973e.size() == 1) {
            str = C116711b.m164583h(fr12.f331973e.get(0).f354328d);
        }
        String h = C116711b.m164583h(s142.f354328d);
        String h2 = C116711b.m164583h(er12.f353985d);
        if (str != null && str.equals(h2)) {
            Log.m105925i("HABBYGE-MALI.FuzzyDetailReport", "sPrePageName: %s, %s", str, h2);
            m164597b(er12, jSONArray, fr12.f331979n);
        } else if (h == null || !h.equals(h2)) {
            Log.m105920e("HABBYGE-MALI.FuzzyDetailReport", "Neither prePage nor curPage !!");
            jSONObject.put("businessParam", jSONArray);
            return;
        } else {
            Log.m105925i("HABBYGE-MALI.FuzzyDetailReport", "sCurPageName: %s, %s", h, h2);
            m164597b(er12, jSONArray, fr12.f331979n);
        }
        jSONObject.put("businessParam", jSONArray);
    }

    /* renamed from: b */
    public static void m164597b(C118429er1 er12, JSONArray jSONArray, long j) {
        String str;
        int i = 0;
        if (!er12.f353988g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C101777fg2> it = er12.f353988g.iterator();
            while (it.hasNext()) {
                C101777fg2 next = it.next();
                if (next != null && !TextUtils.isEmpty(next.f298259f)) {
                    arrayList.add(next.f298259f);
                }
            }
            try {
                Iterator<C101777fg2> it4 = er12.f353988g.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    C101777fg2 next2 = it4.next();
                    if (next2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = next2.f298258e;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = str3;
                        }
                        jSONObject.put("dataPath", str2);
                        String str4 = next2.f298257d;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        jSONObject.put("value", str3);
                        if (TextUtils.isEmpty(next2.f298259f)) {
                            do {
                                i2++;
                                str = C115411b.m162221d(er12.f353986e, i2);
                            } while (arrayList.contains(str));
                            arrayList.add(str);
                        } else {
                            str = next2.f298259f;
                        }
                        jSONObject.put("businessId", str);
                        Log.m105925i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportUtil", e, "handleFuzzyPathDetailParams: %s", e.getMessage());
            }
            if (jSONArray.length() <= 0) {
                i = 1;
            }
            C58534i.m67952a(j, i);
            return;
        }
        String h = C116711b.m164583h(er12.f353985d);
        if (h != null) {
            C116718g.m164618e(h, false, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x000e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m164598c(org.json.JSONObject r13, te3.C110962fr1 r14, te3.C118429er1 r15) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.LinkedList<te3.xr4> r1 = r15.f353989h
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 0
            r4 = 0
        L_0x000e:
            boolean r5 = r1.hasNext()
            r6 = 2
            if (r5 == 0) goto L_0x016d
            java.lang.Object r5 = r1.next()
            te3.xr4 r5 = (te3.xr4) r5
            if (r5 == 0) goto L_0x000e
            java.lang.String r7 = r15.f353985d
            java.lang.String r7 = e91.C116711b.m164583h(r7)
            te3.s14 r8 = r14.f331974f
            java.lang.String r8 = r8.f354328d
            java.lang.String r8 = e91.C116711b.m164583h(r8)
            java.lang.String r9 = "HABBYGE-MALI.FuzzyDetailReport"
            if (r8 == 0) goto L_0x0062
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x0062
            te3.s14 r8 = r14.f331974f
            java.util.LinkedList<te3.yr4> r8 = r8.f354330f
            java.util.Iterator r8 = r8.iterator()
        L_0x003d:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r8.next()
            te3.yr4 r10 = (te3.yr4) r10
            n91.g$a r11 = n91.C117615g.f351847a
            boolean r11 = r11.mo182338e(r5, r10)
            if (r11 == 0) goto L_0x003d
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r10.f354607d
            r6[r3] = r7
            java.lang.String r7 = r10.f354612i
            r6[r2] = r7
            java.lang.String r7 = "inConfig: entry: viewNode=%s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r6)
        L_0x0060:
            r6 = 1
            goto L_0x00bc
        L_0x0062:
            java.util.LinkedList<te3.s14> r8 = r14.f331973e
            java.util.Iterator r8 = r8.iterator()
        L_0x0068:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00ac
            java.lang.Object r10 = r8.next()
            te3.s14 r10 = (te3.C118464s14) r10
            java.lang.String r11 = r10.f354328d
            java.lang.String r11 = e91.C116711b.m164583h(r11)
            if (r11 == 0) goto L_0x0068
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L_0x0068
            java.util.LinkedList<te3.yr4> r10 = r10.f354330f
            java.util.Iterator r10 = r10.iterator()
        L_0x0088:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0068
            java.lang.Object r11 = r10.next()
            te3.yr4 r11 = (te3.yr4) r11
            n91.g$a r12 = n91.C117615g.f351847a
            boolean r12 = r12.mo182338e(r5, r11)
            if (r12 == 0) goto L_0x0088
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r11.f354607d
            r6[r3] = r7
            java.lang.String r7 = r11.f354612i
            r6[r2] = r7
            java.lang.String r7 = "inConfig: prePage=%s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r6)
            goto L_0x0060
        L_0x00ac:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r5.f354547d
            r6[r3] = r7
            java.lang.String r7 = r5.f354548e
            r6[r2] = r7
            java.lang.String r7 = "inConfig: false: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r6)
            r6 = 0
        L_0x00bc:
            if (r6 != 0) goto L_0x00c0
            goto L_0x000e
        L_0x00c0:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r6 = r5.f354548e
            java.lang.String r7 = "viewId"
            r4.put(r7, r6)
            int r6 = r5.f354561u
            java.lang.String r7 = "type"
            r4.put(r7, r6)
            int r6 = r5.f354552i
            java.lang.String r7 = "action"
            r4.put(r7, r6)
            long r6 = r5.f354555o
            java.lang.String r8 = "timestamp"
            r4.put(r8, r6)
            java.util.LinkedList<te3.wg> r6 = r5.f354558r
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0158
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.LinkedList<te3.wg> r5 = r5.f354558r
            java.util.Iterator r5 = r5.iterator()
        L_0x00f7:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x013f
            java.lang.Object r7 = r5.next()
            te3.wg r7 = (te3.C101862wg) r7
            if (r7 == 0) goto L_0x00f7
            long r8 = r7.f299740d
            long r10 = r14.f331979n
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x010e
            goto L_0x00f7
        L_0x010e:
            java.util.LinkedList<te3.fg2> r7 = r7.f299741e
            java.util.Iterator r7 = r7.iterator()
        L_0x0114:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00f7
            java.lang.Object r8 = r7.next()
            te3.fg2 r8 = (te3.C101777fg2) r8
            if (r8 == 0) goto L_0x0114
            java.lang.String r9 = r8.f298258e
            if (r9 != 0) goto L_0x0127
            goto L_0x0114
        L_0x0127:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = r8.f298258e
            java.lang.String r11 = "dataPath"
            r9.put(r11, r10)
            java.lang.String r8 = r8.f298257d
            java.lang.String r10 = "value"
            r9.put(r10, r8)
            r6.put(r9)
            goto L_0x0114
        L_0x013f:
            int r5 = r6.length()
            if (r5 <= 0) goto L_0x0151
            java.lang.String r5 = "businessParam"
            r4.put(r5, r6)
            long r5 = r14.f331979n
            r7 = 4
            ea1.C58534i.m67952a(r5, r7)
            goto L_0x0167
        L_0x0151:
            long r5 = r14.f331979n
            r7 = 5
            ea1.C58534i.m67952a(r5, r7)
            goto L_0x0167
        L_0x0158:
            java.lang.String r6 = r15.f353985d
            java.lang.String r6 = e91.C116711b.m164583h(r6)
            if (r6 == 0) goto L_0x0167
            java.lang.String r5 = r5.f354548e
            long r7 = r14.f331979n
            ea1.C116718g.m164619f(r5, r6, r7)
        L_0x0167:
            r0.put(r4)
            r4 = 1
            goto L_0x000e
        L_0x016d:
            java.lang.String r1 = "viewOp"
            r13.put(r1, r0)
            if (r4 != 0) goto L_0x0176
            return
        L_0x0176:
            java.util.LinkedList<te3.xr4> r13 = r15.f353989h
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x018c
            java.lang.String r13 = r15.f353985d
            java.lang.String r13 = e91.C116711b.m164583h(r13)
            if (r13 == 0) goto L_0x0199
            long r14 = r14.f331979n
            ea1.C116718g.m164620g(r13, r14)
            goto L_0x0199
        L_0x018c:
            int r13 = r0.length()
            if (r13 <= 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r6 = 3
        L_0x0194:
            long r13 = r14.f331979n
            ea1.C58534i.m67952a(r13, r6)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea1.C116712a.m164598c(org.json.JSONObject, te3.fr1, te3.er1):void");
    }

    /* renamed from: d */
    public static JSONArray m164599d(C110962fr1 fr12, JSONObject jSONObject) {
        C110962fr1 fr13 = fr12;
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (fr13 != null && !fr13.f331975g.isEmpty()) {
            int size = fr13.f331975g.size();
            int i = 0;
            long j = 0;
            while (i < size) {
                try {
                    C118429er1 er12 = fr13.f331975g.get(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("pageName", er12.f353985d);
                    jSONObject3.put("tbe", er12.f353986e);
                    jSONObject3.put(LocaleUtil.INDONESIAN_NEWNAME, er12.f353987f);
                    j += er12.f353987f;
                    if (i == 0) {
                        try {
                            jSONObject2.put("tbe", er12.f353986e);
                        } catch (Exception e) {
                            Log.printInfoStack("HABBYGE-MALI.FuzzyDetailReport", "createFuzzyPathJsonArray, exception: %s", e.getMessage());
                        }
                    }
                    try {
                        m164596a(jSONObject3, fr13, er12);
                    } catch (JSONException e2) {
                        JSONException jSONException = e2;
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyDetailReport", jSONException, "_getBizParams crash: %s", jSONException.getMessage());
                    }
                    m164598c(jSONObject3, fr13, er12);
                    jSONArray.put(jSONObject3);
                    i++;
                } catch (JSONException e3) {
                    Log.printErrStackTrace("HABBYGE-MALI.FuzzyDetailReport", e3, "createFuzzyPathJsonArray crash: %s", e3.getMessage());
                }
            }
            jSONObject2.put(LocaleUtil.INDONESIAN_NEWNAME, j > 0 ? j : 0);
        }
        return jSONArray;
    }
}
