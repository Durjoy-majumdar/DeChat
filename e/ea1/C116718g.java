package ea1;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C101777fg2;
import te3.C101862wg;
import te3.C110974w14;
import te3.C118423dg2;
import te3.C118427eg2;
import te3.C118430fa3;
import te3.C118434gg2;
import te3.C118464s14;
import te3.C22505ka3;
import te3.C51991xl2;
import te3.xr4;
import te3.yr4;

/* renamed from: ea1.g */
public final class C116718g {

    /* renamed from: ea1.g$a */
    public class C116719a implements Comparator<C118427eg2> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C118427eg2) obj).f353970e, ((C118427eg2) obj2).f353970e);
        }
    }

    /* renamed from: a */
    public static void m164614a(C118434gg2 gg22, C118427eg2 eg22) {
        C22505ka3 ka32;
        C118430fa3 fa32;
        Log.m105924i("HABBYGE-MALI.HellSessionReportUtil", "adjustSession");
        Iterator<C22505ka3> it = gg22.f354028f.iterator();
        C118430fa3 fa33 = null;
        C22505ka3 ka33 = null;
        loop0:
        while (true) {
            ka32 = ka33;
            while (it.hasNext()) {
                C22505ka3 next = it.next();
                if (next != null) {
                    if (ka33 == null) {
                        ka33 = next;
                    } else {
                        if (next.f64092i < ka33.f64092i) {
                            ka33 = next;
                        }
                        if (next.f64093j > ka32.f64093j) {
                            ka32 = next;
                        }
                    }
                }
            }
            break loop0;
        }
        Iterator<C118430fa3> it4 = gg22.f354030h.iterator();
        loop2:
        while (true) {
            fa32 = fa33;
            while (it4.hasNext()) {
                C118430fa3 next2 = it4.next();
                if (next2 != null) {
                    if (fa33 == null) {
                        fa33 = next2;
                    } else {
                        if (next2.f353993g < fa33.f353993g) {
                            fa33 = next2;
                        }
                        if (next2.f353994h > fa32.f353994h) {
                            fa32 = next2;
                        }
                    }
                }
            }
            break loop2;
        }
        boolean z = true;
        if (ka33 == null) {
            if (fa33 != null) {
                if (!fa33.f353996j.equals(eg22.f353969d) || fa33.f353993g != eg22.f353970e) {
                    z = false;
                }
                fa33.f353993g = gg22.f354026d;
                if (z) {
                    Log.m105924i("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page TRUE !!!");
                    eg22.f353970e = fa33.f353993g;
                } else {
                    Log.m105920e("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page FALSE !!!");
                }
            } else {
                return;
            }
        } else if (fa33 == null) {
            ka33.f64092i = gg22.f354026d;
        } else if (fa33.f353993g < ka33.f64092i) {
            if (!fa33.f353996j.equals(eg22.f353969d) || fa33.f353993g != eg22.f353970e) {
                z = false;
            }
            fa33.f353993g = gg22.f354026d;
            if (z) {
                Log.m105924i("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page TRUE !!!");
                eg22.f353970e = fa33.f353993g;
            } else {
                Log.m105920e("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page FALSE !!!");
            }
        } else {
            ka33.f64092i = gg22.f354026d;
        }
        if (ka32 == null) {
            if (fa32 != null) {
                fa32.f353994h = gg22.f354027e;
            }
        } else if (fa32 == null) {
            ka32.f64093j = gg22.f354027e;
        } else if (fa32.f353994h > ka32.f64093j) {
            fa32.f353994h = gg22.f354027e;
        } else {
            ka32.f64093j = gg22.f354027e;
        }
    }

    /* renamed from: b */
    public static void m164615b(JSONObject jSONObject, C118427eg2 eg22, boolean z, long j) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        C118427eg2 eg23 = eg22;
        boolean z2 = z;
        long j2 = j;
        LinkedList<C101777fg2> linkedList = z2 ? eg23.f353975j : eg23.f353973h;
        JSONArray jSONArray = new JSONArray();
        if (linkedList.isEmpty()) {
            jSONObject2.put("businessParam", jSONArray);
            m164618e(eg23.f353969d, z2, j2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C101777fg2 next : linkedList) {
            if (next != null && !TextUtils.isEmpty(next.f298259f)) {
                arrayList.add(next.f298259f);
            }
        }
        int i = 0;
        for (C101777fg2 next2 : linkedList) {
            if (next2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                String str2 = next2.f298258e;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                jSONObject3.put("dataPath", str2);
                String str4 = next2.f298257d;
                if (str4 != null) {
                    str3 = str4;
                }
                jSONObject3.put("value", str3);
                if (TextUtils.isEmpty(next2.f298259f)) {
                    do {
                        i++;
                        str = C115411b.m162221d(eg23.f353970e, i);
                    } while (arrayList.contains(str));
                    arrayList.add(str);
                } else {
                    str = next2.f298259f;
                }
                jSONObject3.put("businessId", str);
                Log.m105925i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                jSONArray.put(jSONObject3);
            }
        }
        if (!z2) {
            C58534i.m67952a(j2, jSONArray.length() > 0 ? 0 : 1);
        }
        jSONObject2.put("businessParam", jSONArray);
    }

    /* renamed from: c */
    public static void m164616c(JSONObject jSONObject, C118427eg2 eg22, long j) {
        String str;
        C118427eg2 eg23 = eg22;
        long j2 = j;
        if (eg23.f353976n.isEmpty()) {
            m164620g(eg23.f353969d, j2);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<xr4> it = eg23.f353976n.iterator();
        while (it.hasNext()) {
            xr4 next = it.next();
            if (next != null && !next.f354560t) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewId", next.f354548e);
                jSONObject2.put("type", next.f354561u);
                jSONObject2.put("action", next.f354552i);
                jSONObject2.put(AppMeasurement.Param.TIMESTAMP, next.f354555o);
                if (!next.f354558r.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<C101862wg> it4 = next.f354558r.iterator();
                    while (it4.hasNext()) {
                        C101862wg next2 = it4.next();
                        if (next2 != null && next2.f299740d == j2) {
                            Iterator<C101777fg2> it5 = next2.f299741e.iterator();
                            while (it5.hasNext()) {
                                C101777fg2 next3 = it5.next();
                                if (!(next3 == null || (str = next3.f298258e) == null)) {
                                    Iterator<C51991xl2> it6 = next.f354559s.iterator();
                                    boolean z = false;
                                    while (it6.hasNext()) {
                                        C51991xl2 next4 = it6.next();
                                        Iterator<C101862wg> it7 = it4;
                                        Iterator<C101777fg2> it8 = it5;
                                        if (next4 != null && next4.f144737d == j2) {
                                            Iterator<String> it9 = next4.f144738e.iterator();
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    break;
                                                }
                                                String next5 = it9.next();
                                                if (!TextUtils.isEmpty(next5) && next5.equals(str)) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        it4 = it7;
                                        it5 = it8;
                                    }
                                    Iterator<C101862wg> it10 = it4;
                                    Iterator<C101777fg2> it11 = it5;
                                    if (z) {
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("dataPath", next3.f298258e);
                                        jSONObject3.put("value", next3.f298257d);
                                        jSONArray2.put(jSONObject3);
                                    }
                                    it4 = it10;
                                    it5 = it11;
                                }
                            }
                        }
                    }
                    if (jSONArray2.length() > 0) {
                        jSONObject2.put("businessParam", jSONArray2);
                        C58534i.m67952a(j2, 4);
                    } else {
                        C58534i.m67952a(j2, 5);
                    }
                } else {
                    m164619f(next.f354548e, eg23.f353969d, j2);
                }
                jSONArray.put(jSONObject2);
            }
        }
        C58534i.m67952a(j2, jSONArray.length() > 0 ? 2 : 3);
        jSONObject.put("viewOp", jSONArray);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v24, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v25, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v26, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v44, resolved type: te3.ka3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v29, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v38, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v39, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v40, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v41, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v42, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v43, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v44, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v56, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v60, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v61, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v62, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v65, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v67, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v68, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v69, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v70, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v71, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v77, resolved type: java.util.Iterator<te3.ka3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v47, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x056c A[SYNTHETIC, Splitter:B:243:0x056c] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0630 A[Catch:{ Exception -> 0x071f }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x06bc A[Catch:{ Exception -> 0x071c }, LOOP:6: B:324:0x06b6->B:326:0x06bc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x06d0 A[Catch:{ Exception -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x06e1 A[Catch:{ Exception -> 0x071c }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0833 A[SYNTHETIC, Splitter:B:395:0x0833] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x086c  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x097b  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x099f A[Catch:{ JSONException -> 0x09b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x09a1 A[Catch:{ JSONException -> 0x09b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x09dd  */
    /* JADX WARNING: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:518:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0170  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m164617d(te3.C118434gg2 r30, te3.C118423dg2 r31, te3.C22505ka3 r32) {
        /*
            r1 = r30
            java.lang.String r2 = "sessionId"
            java.lang.String r3 = "_"
            java.lang.String r4 = "content"
            java.lang.String r5 = "2.0"
            java.lang.String r6 = "vv"
            java.lang.String r7 = "tbe"
            java.lang.String r8 = "in"
            java.lang.String r9 = "HABBYGE-MALI.HellSessionReportUtil"
            java.lang.String r0 = "HellSessionReportUtil, realReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            java.lang.String r10 = "HABBYGE-MALI.HellSessionUBAReport"
            java.util.Map r0 = m164623j(r31)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0147 }
            r11.<init>()     // Catch:{ JSONException -> 0x0147 }
            long r12 = r1.f354026d     // Catch:{ JSONException -> 0x0147 }
            r11.put(r7, r12)     // Catch:{ JSONException -> 0x0147 }
            long r12 = r1.f354027e     // Catch:{ JSONException -> 0x0147 }
            long r14 = r1.f354026d     // Catch:{ JSONException -> 0x0147 }
            long r12 = r12 - r14
            r14 = 0
            int r19 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r19 <= 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r12 = 0
        L_0x0038:
            r11.put(r8, r12)     // Catch:{ JSONException -> 0x0147 }
            r11.put(r6, r5)     // Catch:{ JSONException -> 0x0147 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0147 }
            r12.<init>()     // Catch:{ JSONException -> 0x0147 }
            java.util.LinkedList<te3.ka3> r13 = r1.f354028f     // Catch:{ JSONException -> 0x0147 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ JSONException -> 0x0147 }
        L_0x0049:
            boolean r14 = r13.hasNext()     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r15 = "pagePath"
            if (r14 == 0) goto L_0x00b2
            java.lang.Object r14 = r13.next()     // Catch:{ JSONException -> 0x00a6 }
            te3.ka3 r14 = (te3.C22505ka3) r14     // Catch:{ JSONException -> 0x00a6 }
            r19 = r13
            java.lang.String r13 = "toJsonOfSessionUBA, session: %s"
            r20 = r5
            r21 = r6
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r5 = r14.f64087d     // Catch:{ JSONException -> 0x00a2 }
            r16 = 0
            r6[r16] = r5     // Catch:{ JSONException -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r6)     // Catch:{ JSONException -> 0x00a2 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a2 }
            r5.<init>()     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r6 = r14.f64087d     // Catch:{ JSONException -> 0x00a2 }
            r5.put(r2, r6)     // Catch:{ JSONException -> 0x00a2 }
            r6 = r9
            r13 = r10
            long r9 = r14.f64092i     // Catch:{ JSONException -> 0x0144 }
            r5.put(r7, r9)     // Catch:{ JSONException -> 0x0144 }
            org.json.JSONArray r9 = ea1.C116720h.m164625a(r0, r14)     // Catch:{ JSONException -> 0x0144 }
            r5.put(r15, r9)     // Catch:{ JSONException -> 0x0144 }
            long r9 = r14.f64093j     // Catch:{ JSONException -> 0x0144 }
            long r14 = r14.f64092i     // Catch:{ JSONException -> 0x0144 }
            long r9 = r9 - r14
            r14 = 0
            int r22 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r22 <= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r9 = 0
        L_0x0093:
            r5.put(r8, r9)     // Catch:{ JSONException -> 0x0144 }
            r12.put(r5)     // Catch:{ JSONException -> 0x0144 }
            r9 = r6
            r10 = r13
            r13 = r19
            r5 = r20
            r6 = r21
            goto L_0x0049
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            r6 = r9
            r13 = r10
            goto L_0x00ac
        L_0x00a6:
            r0 = move-exception
            r20 = r5
            r21 = r6
            goto L_0x00a3
        L_0x00ac:
            r5 = r2
            r23 = r3
            r2 = r13
            goto L_0x0151
        L_0x00b2:
            r20 = r5
            r21 = r6
            r6 = r9
            r13 = r10
            java.util.LinkedList<te3.fa3> r5 = r1.f354030h     // Catch:{ JSONException -> 0x0144 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0144 }
        L_0x00be:
            boolean r9 = r5.hasNext()     // Catch:{ JSONException -> 0x0144 }
            if (r9 == 0) goto L_0x0123
            java.lang.Object r9 = r5.next()     // Catch:{ JSONException -> 0x0144 }
            te3.fa3 r9 = (te3.C118430fa3) r9     // Catch:{ JSONException -> 0x0144 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0144 }
            r10.<init>()     // Catch:{ JSONException -> 0x0144 }
            java.lang.String r14 = r9.f353996j     // Catch:{ JSONException -> 0x0144 }
            java.lang.String r14 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162225h(r14)     // Catch:{ JSONException -> 0x0144 }
            r19 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0144 }
            r5.<init>()     // Catch:{ JSONException -> 0x0144 }
            r5.append(r14)     // Catch:{ JSONException -> 0x0144 }
            r5.append(r3)     // Catch:{ JSONException -> 0x0144 }
            r22 = r13
            long r13 = r9.f353993g     // Catch:{ JSONException -> 0x011c }
            r5.append(r13)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x011c }
            r10.put(r2, r5)     // Catch:{ JSONException -> 0x011c }
            long r13 = r9.f353993g     // Catch:{ JSONException -> 0x011c }
            r10.put(r7, r13)     // Catch:{ JSONException -> 0x011c }
            org.json.JSONArray r5 = ea1.C116720h.m164626b(r0, r9)     // Catch:{ JSONException -> 0x011c }
            r10.put(r15, r5)     // Catch:{ JSONException -> 0x011c }
            long r13 = r9.f353994h     // Catch:{ JSONException -> 0x011c }
            r5 = r2
            r23 = r3
            long r2 = r9.f353993g     // Catch:{ JSONException -> 0x0142 }
            long r2 = r13 - r2
            r13 = 0
            int r9 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r2 = 0
        L_0x010e:
            r10.put(r8, r2)     // Catch:{ JSONException -> 0x0142 }
            r12.put(r10)     // Catch:{ JSONException -> 0x0142 }
            r2 = r5
            r5 = r19
            r13 = r22
            r3 = r23
            goto L_0x00be
        L_0x011c:
            r0 = move-exception
            r5 = r2
            r23 = r3
        L_0x0120:
            r2 = r22
            goto L_0x0151
        L_0x0123:
            r5 = r2
            r23 = r3
            r22 = r13
            int r0 = r12.length()     // Catch:{ JSONException -> 0x0142 }
            if (r0 > 0) goto L_0x0136
            java.lang.String r0 = "HellSessionUBAReport content is NULL"
            r2 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ JSONException -> 0x0140 }
            goto L_0x0160
        L_0x0136:
            r2 = r22
            r11.put(r4, r12)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r0 = r11.toString()     // Catch:{ JSONException -> 0x0140 }
            goto L_0x0161
        L_0x0140:
            r0 = move-exception
            goto L_0x0151
        L_0x0142:
            r0 = move-exception
            goto L_0x0120
        L_0x0144:
            r0 = move-exception
            goto L_0x00ac
        L_0x0147:
            r0 = move-exception
            r23 = r3
            r20 = r5
            r21 = r6
            r6 = r9
            r5 = r2
            r2 = r10
        L_0x0151:
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r3 = r0.getMessage()
            r10 = 0
            r9[r10] = r3
            java.lang.String r3 = "HellSessionUBAReport, crash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r9)
        L_0x0160:
            r0 = 0
        L_0x0161:
            boolean r3 = u24.C90599h.m113511d(r0)
            java.lang.String r9 = "|"
            java.lang.String r10 = "EdgeComputingDataSourceService"
            java.lang.String r11 = "-1"
            if (r3 == 0) goto L_0x0170
            goto L_0x029b
        L_0x0170:
            j81.a r3 = j81.C117302a.xx0()
            t81.l r3 = r3.f351171d
            r3.getClass()
            boolean r14 = j81.C87906e.m109416j()
            if (r14 != 0) goto L_0x0180
            goto L_0x01ae
        L_0x0180:
            boolean r14 = u24.C90599h.m113511d(r0)
            if (r14 == 0) goto L_0x018c
            java.lang.String r3 = "[EdgeComputingDataSourceService] sendSessionUBAAll data isEmpty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            goto L_0x01ae
        L_0x018c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "[EdgeComputingDataSourceService] sendSessionUBAAll data : "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            j81.C87906e.m109407a(r10, r14)
            long r14 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r3.f353895b
            t81.k r13 = new t81.k
            r13.<init>(r3, r14, r0)
            r12.post(r13)
        L_0x01ae:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig r3 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig.m162216a()
            r3.getClass()
            te3.a24 r3 = ba1.C113155g.m154832a()
            if (r3 != 0) goto L_0x01bd
            r3 = 1
            goto L_0x01bf
        L_0x01bd:
            boolean r3 = r3.f182010d
        L_0x01bf:
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r15 = 0
            r13[r15] = r14
            java.lang.String r14 = "HellSessionUBAReport: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r14, r13)
            if (r3 == 0) goto L_0x01d2
            goto L_0x029b
        L_0x01d2:
            java.lang.String r3 = ba1.C113154f.m154825c()
            long r13 = ba1.C113152d.m154821b(r3)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r3[r15] = r12
            java.lang.String r12 = "HellSessionUBAReport, lastReportTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r3)
            r2 = -1
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x01f2
            ba1.C113154f.m154831i(r0)
            goto L_0x025d
        L_0x01f2:
            r2 = 0
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x020a
            boolean r2 = ea1.C116720h.m164627c(r0)
            if (r2 == 0) goto L_0x025d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            ba1.C113154f.m154828f(r2)
            goto L_0x025d
        L_0x020a:
            java.lang.String r2 = ba1.C113154f.m154825c()
            java.lang.String r2 = ba1.C113152d.m154820a(r2)
            boolean r3 = r11.equals(r2)
            if (r3 == 0) goto L_0x021c
            ba1.C113154f.m154831i(r0)
            goto L_0x025d
        L_0x021c:
            if (r2 == 0) goto L_0x0241
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0225
            goto L_0x0241
        L_0x0225:
            if (r0 == 0) goto L_0x0242
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x022e
            goto L_0x0242
        L_0x022e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r9)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            goto L_0x0242
        L_0x0241:
            r2 = r0
        L_0x0242:
            boolean r3 = ea1.C116717f.m164612e(r2, r13)
            if (r3 == 0) goto L_0x025a
            boolean r2 = ea1.C116720h.m164627c(r2)
            if (r2 == 0) goto L_0x025d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            ba1.C113154f.m154828f(r2)
            goto L_0x025d
        L_0x025a:
            ba1.C113154f.m154831i(r0)
        L_0x025d:
            j81.a r2 = j81.C117302a.xx0()
            t81.l r2 = r2.f351171d
            r2.getClass()
            boolean r3 = j81.C87906e.m109416j()
            if (r3 != 0) goto L_0x026d
            goto L_0x029b
        L_0x026d:
            boolean r3 = u24.C90599h.m113511d(r0)
            if (r3 == 0) goto L_0x0279
            java.lang.String r0 = "[EdgeComputingDataSourceService] sendSessionPageMerge data isEmpty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x029b
        L_0x0279:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "[EdgeComputingDataSourceService] sendSessionUBA data : "
            r3.append(r12)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            j81.C87906e.m109407a(r10, r3)
            long r12 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r2.f353895b
            t81.i r14 = new t81.i
            r14.<init>(r2, r12, r0)
            r3.post(r14)
        L_0x029b:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.m162211a()
            r0.getClass()
            te3.l14 r0 = ba1.C113151b.m154818a()
            if (r0 != 0) goto L_0x02aa
            r0 = 0
            goto L_0x02ac
        L_0x02aa:
            boolean r0 = r0.f354093e
        L_0x02ac:
            if (r0 == 0) goto L_0x0551
            java.lang.String r0 = "HellSessionReportUtil, reportSession Detail true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            if (r1 != 0) goto L_0x02b7
            goto L_0x0551
        L_0x02b7:
            long r2 = r1.f354026d
            java.lang.String r6 = "HABBYGE-MALI.HellSessionDetailReport"
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x02c8
            r3 = r9
            r22 = r10
            r13 = r23
            goto L_0x03ff
        L_0x02c8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03f5 }
            r0.<init>()     // Catch:{ JSONException -> 0x03f5 }
            long r2 = r1.f354026d     // Catch:{ JSONException -> 0x03f5 }
            r0.put(r7, r2)     // Catch:{ JSONException -> 0x03f5 }
            long r2 = r1.f354027e     // Catch:{ JSONException -> 0x03f5 }
            long r12 = r1.f354026d     // Catch:{ JSONException -> 0x03f5 }
            long r2 = r2 - r12
            r12 = 0
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02de
            goto L_0x02e0
        L_0x02de:
            r2 = 0
        L_0x02e0:
            r0.put(r8, r2)     // Catch:{ JSONException -> 0x03f5 }
            r2 = r20
            r3 = r21
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x03ec }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03ec }
            r12.<init>()     // Catch:{ JSONException -> 0x03ec }
            java.util.LinkedList<te3.ka3> r13 = r1.f354028f     // Catch:{ JSONException -> 0x03ec }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ JSONException -> 0x03ec }
        L_0x02f5:
            boolean r14 = r13.hasNext()     // Catch:{ JSONException -> 0x03ec }
            java.lang.String r15 = ""
            r19 = r15
            java.lang.String r15 = "lastSessionId"
            if (r14 == 0) goto L_0x035c
            java.lang.Object r14 = r13.next()     // Catch:{ JSONException -> 0x0355 }
            te3.ka3 r14 = (te3.C22505ka3) r14     // Catch:{ JSONException -> 0x0355 }
            r20 = r2
            r21 = r3
            long r2 = r14.f64092i     // Catch:{ JSONException -> 0x0352 }
            r17 = 0
            int r22 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r22 > 0) goto L_0x0317
            r3 = r9
            r22 = r10
            goto L_0x034a
        L_0x0317:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0352 }
            r2.<init>()     // Catch:{ JSONException -> 0x0352 }
            java.lang.String r3 = r14.f64087d     // Catch:{ JSONException -> 0x0352 }
            r2.put(r5, r3)     // Catch:{ JSONException -> 0x0352 }
            java.lang.String r3 = r14.f64102v     // Catch:{ JSONException -> 0x0352 }
            java.lang.String r3 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162226i(r3)     // Catch:{ JSONException -> 0x0352 }
            if (r3 != 0) goto L_0x032b
            r3 = r19
        L_0x032b:
            r2.put(r15, r3)     // Catch:{ JSONException -> 0x0352 }
            r3 = r9
            r22 = r10
            long r9 = r14.f64092i     // Catch:{ JSONException -> 0x03e8 }
            r2.put(r7, r9)     // Catch:{ JSONException -> 0x03e8 }
            long r9 = r14.f64093j     // Catch:{ JSONException -> 0x03e8 }
            long r14 = r14.f64092i     // Catch:{ JSONException -> 0x03e8 }
            long r9 = r9 - r14
            r14 = 0
            int r19 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r19 <= 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r9 = 0
        L_0x0344:
            r2.put(r8, r9)     // Catch:{ JSONException -> 0x03e8 }
            r12.put(r2)     // Catch:{ JSONException -> 0x03e8 }
        L_0x034a:
            r9 = r3
            r2 = r20
            r3 = r21
            r10 = r22
            goto L_0x02f5
        L_0x0352:
            r0 = move-exception
            goto L_0x03f1
        L_0x0355:
            r0 = move-exception
            r20 = r2
            r21 = r3
            goto L_0x03f1
        L_0x035c:
            r20 = r2
            r21 = r3
            r3 = r9
            r22 = r10
            java.util.LinkedList<te3.fa3> r2 = r1.f354030h     // Catch:{ JSONException -> 0x03e8 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x03e8 }
        L_0x0369:
            boolean r9 = r2.hasNext()     // Catch:{ JSONException -> 0x03e8 }
            if (r9 == 0) goto L_0x03d5
            java.lang.Object r9 = r2.next()     // Catch:{ JSONException -> 0x03e8 }
            te3.fa3 r9 = (te3.C118430fa3) r9     // Catch:{ JSONException -> 0x03e8 }
            long r13 = r9.f353993g     // Catch:{ JSONException -> 0x03e8 }
            r17 = 0
            int r10 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r10 > 0) goto L_0x037e
            goto L_0x0369
        L_0x037e:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03e8 }
            r10.<init>()     // Catch:{ JSONException -> 0x03e8 }
            java.lang.String r13 = r9.f353996j     // Catch:{ JSONException -> 0x03e8 }
            java.lang.String r13 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162225h(r13)     // Catch:{ JSONException -> 0x03e8 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03e8 }
            r14.<init>()     // Catch:{ JSONException -> 0x03e8 }
            r14.append(r13)     // Catch:{ JSONException -> 0x03e8 }
            r13 = r23
            r14.append(r13)     // Catch:{ JSONException -> 0x03e6 }
            r23 = r2
            long r1 = r9.f353993g     // Catch:{ JSONException -> 0x03e6 }
            r14.append(r1)     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r1 = r14.toString()     // Catch:{ JSONException -> 0x03e6 }
            r10.put(r5, r1)     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r1 = r9.f354000q     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162226i(r1)     // Catch:{ JSONException -> 0x03e6 }
            if (r1 != 0) goto L_0x03ae
            r1 = r19
        L_0x03ae:
            r10.put(r15, r1)     // Catch:{ JSONException -> 0x03e6 }
            long r1 = r9.f353993g     // Catch:{ JSONException -> 0x03e6 }
            r10.put(r7, r1)     // Catch:{ JSONException -> 0x03e6 }
            long r1 = r9.f353994h     // Catch:{ JSONException -> 0x03e6 }
            r26 = r15
            long r14 = r9.f353993g     // Catch:{ JSONException -> 0x03e6 }
            long r1 = r1 - r14
            r14 = 0
            int r9 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x03c4
            goto L_0x03c6
        L_0x03c4:
            r1 = 0
        L_0x03c6:
            r10.put(r8, r1)     // Catch:{ JSONException -> 0x03e6 }
            r12.put(r10)     // Catch:{ JSONException -> 0x03e6 }
            r1 = r30
            r2 = r23
            r15 = r26
            r23 = r13
            goto L_0x0369
        L_0x03d5:
            r13 = r23
            int r1 = r12.length()     // Catch:{ JSONException -> 0x03e6 }
            if (r1 > 0) goto L_0x03de
            goto L_0x03ff
        L_0x03de:
            r0.put(r4, r12)     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x03e6 }
            goto L_0x0400
        L_0x03e6:
            r0 = move-exception
            goto L_0x03f7
        L_0x03e8:
            r0 = move-exception
        L_0x03e9:
            r13 = r23
            goto L_0x03f7
        L_0x03ec:
            r0 = move-exception
            r20 = r2
            r21 = r3
        L_0x03f1:
            r3 = r9
            r22 = r10
            goto L_0x03e9
        L_0x03f5:
            r0 = move-exception
            goto L_0x03f1
        L_0x03f7:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "HellSessionDetailReport.toJsonOfDetail crash"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r2)
        L_0x03ff:
            r0 = 0
        L_0x0400:
            boolean r1 = u24.C90599h.m113511d(r0)
            if (r1 == 0) goto L_0x040a
            r2 = r22
            goto L_0x0555
        L_0x040a:
            j81.a r1 = j81.C117302a.xx0()
            t81.l r1 = r1.f351171d
            r1.getClass()
            boolean r2 = j81.C87906e.m109416j()
            if (r2 != 0) goto L_0x041c
            r2 = r22
            goto L_0x044e
        L_0x041c:
            boolean r2 = u24.C90599h.m113511d(r0)
            if (r2 == 0) goto L_0x042a
            java.lang.String r1 = "[EdgeComputingDataSourceService] sendSessionSingleAll data isEmpty!"
            r2 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x044e
        L_0x042a:
            r2 = r22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "[EdgeComputingDataSourceService] sendSessionSingleAll data : "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            j81.C87906e.m109407a(r2, r5)
            long r9 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r1.f353895b
            t81.j r12 = new t81.j
            r12.<init>(r1, r9, r0)
            r5.post(r12)
        L_0x044e:
            boolean r1 = d91.C20449a.m22052d()
            if (r1 == 0) goto L_0x0555
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.m162211a()
            r1.getClass()
            te3.l14 r1 = ba1.C113151b.m154818a()
            if (r1 != 0) goto L_0x0463
            r1 = 1
            goto L_0x0465
        L_0x0463:
            boolean r1 = r1.f354092d
        L_0x0465:
            if (r1 != 0) goto L_0x0555
            int r1 = e91.C116711b.m164584i()
            if (r1 == 0) goto L_0x0555
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.m162211a()
            r1.getClass()
            te3.l14 r1 = ba1.C113151b.m154818a()
            if (r1 != 0) goto L_0x047c
            r1 = 0
            goto L_0x047e
        L_0x047c:
            boolean r1 = r1.f354093e
        L_0x047e:
            if (r1 != 0) goto L_0x0482
            goto L_0x0555
        L_0x0482:
            java.lang.String r1 = ba1.C113154f.m154823a()
            long r9 = ba1.C113152d.m154821b(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r12 = 0
            r1[r12] = r5
            r5 = 1
            r1[r5] = r0
            java.lang.String r5 = "doReportDetailWhenEvent8, lastReportTime: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r1)
            r5 = -1
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x04a7
            ba1.C113154f.m154829g(r0)
            goto L_0x0512
        L_0x04a7:
            r5 = 0
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x04bf
            boolean r1 = ea1.C116713b.m164600a(r0)
            if (r1 == 0) goto L_0x0512
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            ba1.C113154f.m154826d(r1)
            goto L_0x0512
        L_0x04bf:
            java.lang.String r1 = ba1.C113154f.m154823a()
            java.lang.String r1 = ba1.C113152d.m154820a(r1)
            boolean r5 = r11.equals(r1)
            if (r5 == 0) goto L_0x04d1
            ba1.C113154f.m154829g(r0)
            goto L_0x0512
        L_0x04d1:
            if (r1 == 0) goto L_0x04f6
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x04da
            goto L_0x04f6
        L_0x04da:
            if (r0 == 0) goto L_0x04f7
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x04e3
            goto L_0x04f7
        L_0x04e3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            goto L_0x04f7
        L_0x04f6:
            r1 = r0
        L_0x04f7:
            boolean r5 = ea1.C116717f.m164612e(r1, r9)
            if (r5 == 0) goto L_0x050f
            boolean r1 = ea1.C116713b.m164600a(r1)
            if (r1 == 0) goto L_0x0512
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            ba1.C113154f.m154826d(r1)
            goto L_0x0512
        L_0x050f:
            ba1.C113154f.m154829g(r0)
        L_0x0512:
            j81.a r1 = j81.C117302a.xx0()
            t81.l r1 = r1.f351171d
            r1.getClass()
            boolean r5 = j81.C87906e.m109416j()
            if (r5 != 0) goto L_0x0522
            goto L_0x0555
        L_0x0522:
            boolean r5 = u24.C90599h.m113511d(r0)
            if (r5 == 0) goto L_0x052e
            java.lang.String r0 = "[EdgeComputingDataSourceService] sendSessionSingle data isEmpty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0555
        L_0x052e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[EdgeComputingDataSourceService] sendSessionSingle data : "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            j81.C87906e.m109407a(r2, r5)
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r1.f353895b
            t81.e r10 = new t81.e
            r10.<init>(r1, r5, r0)
            r9.post(r10)
            goto L_0x0555
        L_0x0551:
            r3 = r9
            r2 = r10
            r13 = r23
        L_0x0555:
            java.lang.String r1 = "HABBYGE-MALI.HellSessionMergeReport"
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0730 }
            r0.<init>()     // Catch:{ Exception -> 0x0730 }
            r5 = r30
            java.util.LinkedList<te3.ka3> r6 = r5.f354028f     // Catch:{ Exception -> 0x0722 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0722 }
        L_0x0564:
            boolean r9 = r6.hasNext()     // Catch:{ Exception -> 0x0722 }
            java.lang.String r10 = "count"
            if (r9 == 0) goto L_0x061b
            java.lang.Object r9 = r6.next()     // Catch:{ Exception -> 0x0612 }
            te3.ka3 r9 = (te3.C22505ka3) r9     // Catch:{ Exception -> 0x0612 }
            java.lang.String r12 = r9.f64087d     // Catch:{ Exception -> 0x0612 }
            java.lang.String r12 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r12)     // Catch:{ Exception -> 0x0612 }
            if (r12 != 0) goto L_0x057b
            goto L_0x0564
        L_0x057b:
            boolean r14 = r0.containsKey(r12)     // Catch:{ Exception -> 0x0612 }
            if (r14 == 0) goto L_0x05f1
            java.lang.Object r14 = r0.get(r12)     // Catch:{ Exception -> 0x0612 }
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch:{ Exception -> 0x0612 }
            if (r14 != 0) goto L_0x0593
            org.json.JSONObject r9 = ea1.C116714c.m164602b(r9)     // Catch:{ Exception -> 0x0722 }
            if (r9 == 0) goto L_0x0564
            r0.put(r12, r9)     // Catch:{ Exception -> 0x0722 }
            goto L_0x0564
        L_0x0593:
            r22 = r2
            r15 = r3
            long r2 = r9.f64092i     // Catch:{ Exception -> 0x05dd }
            r17 = 0
            int r19 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x05d7
            long r2 = r14.optLong(r8)     // Catch:{ Exception -> 0x05dd }
            r23 = r6
            r19 = r7
            long r6 = r9.f64093j     // Catch:{ Exception -> 0x05c8 }
            r26 = r4
            long r4 = r9.f64092i     // Catch:{ Exception -> 0x0610 }
            long r4 = r6 - r4
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x05b5
            goto L_0x05b7
        L_0x05b5:
            r4 = 0
        L_0x05b7:
            long r2 = r2 + r4
            r14.put(r8, r2)     // Catch:{ Exception -> 0x0610 }
            int r2 = r14.optInt(r10)     // Catch:{ Exception -> 0x0610 }
            r3 = 1
            int r2 = r2 + r3
            r14.put(r10, r2)     // Catch:{ Exception -> 0x0610 }
            r0.put(r12, r14)     // Catch:{ Exception -> 0x0610 }
            goto L_0x0603
        L_0x05c8:
            r0 = move-exception
            r26 = r4
        L_0x05cb:
            r2 = r30
        L_0x05cd:
            r23 = r13
            r7 = r15
        L_0x05d0:
            r6 = r19
        L_0x05d2:
            r4 = r20
            r5 = r21
            goto L_0x05ed
        L_0x05d7:
            r5 = r30
            r3 = r15
            r2 = r22
            goto L_0x0564
        L_0x05dd:
            r0 = move-exception
            r26 = r4
            r19 = r7
        L_0x05e2:
            r2 = r30
            r23 = r13
            r7 = r15
            r6 = r19
            r4 = r20
            r5 = r21
        L_0x05ed:
            r9 = r26
            goto L_0x073e
        L_0x05f1:
            r22 = r2
            r15 = r3
            r26 = r4
            r23 = r6
            r19 = r7
            org.json.JSONObject r2 = ea1.C116714c.m164602b(r9)     // Catch:{ Exception -> 0x0610 }
            if (r2 == 0) goto L_0x0603
            r0.put(r12, r2)     // Catch:{ Exception -> 0x0610 }
        L_0x0603:
            r5 = r30
            r3 = r15
            r7 = r19
            r2 = r22
            r6 = r23
            r4 = r26
            goto L_0x0564
        L_0x0610:
            r0 = move-exception
            goto L_0x05cb
        L_0x0612:
            r0 = move-exception
            r22 = r2
            r15 = r3
            r26 = r4
            r19 = r7
            goto L_0x05e2
        L_0x061b:
            r22 = r2
            r15 = r3
            r26 = r4
            r19 = r7
            r2 = r30
            java.util.LinkedList<te3.fa3> r3 = r2.f354030h     // Catch:{ Exception -> 0x071f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x071f }
        L_0x062a:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x071f }
            if (r4 == 0) goto L_0x06a6
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x071f }
            te3.fa3 r4 = (te3.C118430fa3) r4     // Catch:{ Exception -> 0x071f }
            java.lang.String r5 = r4.f353996j     // Catch:{ Exception -> 0x071f }
            java.lang.String r5 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162225h(r5)     // Catch:{ Exception -> 0x071f }
            if (r5 != 0) goto L_0x063f
            goto L_0x0656
        L_0x063f:
            boolean r6 = r0.containsKey(r5)     // Catch:{ Exception -> 0x071f }
            if (r6 == 0) goto L_0x0694
            java.lang.Object r6 = r0.get(r5)     // Catch:{ Exception -> 0x071f }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ Exception -> 0x071f }
            if (r6 != 0) goto L_0x065b
            org.json.JSONObject r4 = ea1.C116714c.m164601a(r4)     // Catch:{ Exception -> 0x071f }
            if (r4 == 0) goto L_0x0656
            r0.put(r5, r4)     // Catch:{ Exception -> 0x071f }
        L_0x0656:
            r9 = r3
            r23 = r13
            r7 = r15
            goto L_0x06a1
        L_0x065b:
            r7 = r15
            long r14 = r4.f353993g     // Catch:{ Exception -> 0x068f }
            r17 = 0
            int r9 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x068b
            long r14 = r6.optLong(r8)     // Catch:{ Exception -> 0x068f }
            r23 = r13
            long r12 = r4.f353994h     // Catch:{ Exception -> 0x071c }
            r9 = r3
            long r3 = r4.f353993g     // Catch:{ Exception -> 0x071c }
            long r3 = r12 - r3
            r12 = 0
            int r27 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r27 <= 0) goto L_0x0678
            goto L_0x067a
        L_0x0678:
            r3 = 0
        L_0x067a:
            long r14 = r14 + r3
            r6.put(r8, r14)     // Catch:{ Exception -> 0x071c }
            int r3 = r6.optInt(r10)     // Catch:{ Exception -> 0x071c }
            r4 = 1
            int r3 = r3 + r4
            r6.put(r10, r3)     // Catch:{ Exception -> 0x071c }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x071c }
            goto L_0x06a1
        L_0x068b:
            r9 = r3
            r23 = r13
            goto L_0x06a1
        L_0x068f:
            r0 = move-exception
            r23 = r13
            goto L_0x05d0
        L_0x0694:
            r9 = r3
            r23 = r13
            r7 = r15
            org.json.JSONObject r3 = ea1.C116714c.m164601a(r4)     // Catch:{ Exception -> 0x071c }
            if (r3 == 0) goto L_0x06a1
            r0.put(r5, r3)     // Catch:{ Exception -> 0x071c }
        L_0x06a1:
            r15 = r7
            r3 = r9
            r13 = r23
            goto L_0x062a
        L_0x06a6:
            r23 = r13
            r7 = r15
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x071c }
            r3.<init>()     // Catch:{ Exception -> 0x071c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x071c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x071c }
        L_0x06b6:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x071c }
            if (r4 == 0) goto L_0x06ca
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x071c }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x071c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x071c }
            r3.put(r4)     // Catch:{ Exception -> 0x071c }
            goto L_0x06b6
        L_0x06ca:
            int r0 = r3.length()     // Catch:{ Exception -> 0x071c }
            if (r0 > 0) goto L_0x06d9
        L_0x06d0:
            r6 = r19
            r4 = r20
            r5 = r21
            r9 = r26
            goto L_0x0719
        L_0x06d9:
            long r4 = r2.f354026d     // Catch:{ Exception -> 0x071c }
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x06d0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x071c }
            r0.<init>()     // Catch:{ Exception -> 0x071c }
            long r4 = r2.f354026d     // Catch:{ Exception -> 0x071c }
            r6 = r19
            r0.put(r6, r4)     // Catch:{ Exception -> 0x0716 }
            long r4 = r2.f354027e     // Catch:{ Exception -> 0x0716 }
            long r9 = r2.f354026d     // Catch:{ Exception -> 0x0716 }
            long r4 = r4 - r9
            r9 = 0
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x06f9
            goto L_0x06fb
        L_0x06f9:
            r4 = 0
        L_0x06fb:
            r0.put(r8, r4)     // Catch:{ Exception -> 0x0716 }
            r4 = r20
            r5 = r21
            r0.put(r5, r4)     // Catch:{ Exception -> 0x0713 }
            r9 = r26
            r0.put(r9, r3)     // Catch:{ Exception -> 0x0711 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0711 }
            r3 = 1
            r13 = 0
            goto L_0x074e
        L_0x0711:
            r0 = move-exception
            goto L_0x073e
        L_0x0713:
            r0 = move-exception
            goto L_0x05ed
        L_0x0716:
            r0 = move-exception
            goto L_0x05d2
        L_0x0719:
            r3 = 1
            r13 = 0
            goto L_0x074d
        L_0x071c:
            r0 = move-exception
            goto L_0x05d0
        L_0x071f:
            r0 = move-exception
            goto L_0x05cd
        L_0x0722:
            r0 = move-exception
            r22 = r2
            r9 = r4
            r2 = r5
            r6 = r7
            r23 = r13
            r4 = r20
            r5 = r21
        L_0x072e:
            r7 = r3
            goto L_0x073e
        L_0x0730:
            r0 = move-exception
            r22 = r2
            r9 = r4
            r6 = r7
            r23 = r13
            r4 = r20
            r5 = r21
            r2 = r30
            goto L_0x072e
        L_0x073e:
            r3 = 1
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r12 = r0.getMessage()
            r13 = 0
            r10[r13] = r12
            java.lang.String r12 = "HellSessionMergereport crash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r12, r10)
        L_0x074d:
            r0 = 0
        L_0x074e:
            java.lang.String r10 = ba1.C113154f.m154824b()
            long r14 = ba1.C113152d.m154821b(r10)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            long r19 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            r10[r13] = r3
            java.lang.String r3 = "doReportSessionMerge, lastReportTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r10)
            r12 = -1
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0772
            ba1.C113154f.m154830h(r0)
            goto L_0x07de
        L_0x0772:
            r12 = 0
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x078a
            boolean r1 = ea1.C116714c.m164603c(r0)
            if (r1 == 0) goto L_0x07de
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r12)
            ba1.C113154f.m154827e(r1)
            goto L_0x07de
        L_0x078a:
            java.lang.String r1 = ba1.C113154f.m154824b()
            java.lang.String r1 = ba1.C113152d.m154820a(r1)
            boolean r3 = r11.equals(r1)
            if (r3 == 0) goto L_0x079c
            ba1.C113154f.m154830h(r0)
            goto L_0x07de
        L_0x079c:
            if (r1 == 0) goto L_0x07c2
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x07a5
            goto L_0x07c2
        L_0x07a5:
            if (r0 == 0) goto L_0x07c3
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x07ae
            goto L_0x07c3
        L_0x07ae:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = r7
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            goto L_0x07c3
        L_0x07c2:
            r1 = r0
        L_0x07c3:
            boolean r3 = ea1.C116717f.m164612e(r1, r14)
            if (r3 == 0) goto L_0x07db
            boolean r1 = ea1.C116714c.m164603c(r1)
            if (r1 == 0) goto L_0x07de
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r12)
            ba1.C113154f.m154827e(r1)
            goto L_0x07de
        L_0x07db:
            ba1.C113154f.m154830h(r0)
        L_0x07de:
            j81.a r1 = j81.C117302a.xx0()
            t81.l r1 = r1.f351171d
            r1.getClass()
            boolean r3 = j81.C87906e.m109416j()
            if (r3 != 0) goto L_0x07ee
            goto L_0x0820
        L_0x07ee:
            boolean r3 = u24.C90599h.m113511d(r0)
            if (r3 == 0) goto L_0x07fc
            java.lang.String r0 = "[EdgeComputingDataSourceService] sendSessionMerge data isEmpty!"
            r3 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x0820
        L_0x07fc:
            r3 = r22
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "[EdgeComputingDataSourceService] sendSessionMerge data : "
            r7.append(r10)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            j81.C87906e.m109407a(r3, r7)
            long r12 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r1.f353895b
            t81.f r7 = new t81.f
            r7.<init>(r1, r12, r0)
            r3.post(r7)
        L_0x0820:
            m164621h(r30, r31, r32)
            java.lang.String r1 = "HABBYGE-MALI.AsyncBizReport"
            boolean r0 = d91.C20449a.m22052d()
            if (r0 == 0) goto L_0x09ed
            int r0 = e91.C116711b.m164584i()
            if (r0 != 0) goto L_0x0833
            goto L_0x09ed
        L_0x0833:
            java.lang.String r0 = ba1.C113150a.m154814a()     // Catch:{ JSONException -> 0x09c5 }
            java.lang.String r0 = ba1.C113152d.m154820a(r0)     // Catch:{ JSONException -> 0x09c5 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x09c5 }
            if (r3 != 0) goto L_0x084e
            boolean r3 = r11.equals(r0)     // Catch:{ JSONException -> 0x09c5 }
            if (r3 == 0) goto L_0x0848
            goto L_0x084e
        L_0x0848:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x09c5 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x09c5 }
            goto L_0x084f
        L_0x084e:
            r3 = 0
        L_0x084f:
            if (r3 == 0) goto L_0x0980
            int r0 = r3.length()
            if (r0 > 0) goto L_0x0859
            goto L_0x0980
        L_0x0859:
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.List r10 = ba1.C113150a.m154817d()
            if (r10 == 0) goto L_0x097b
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x086c
            goto L_0x097b
        L_0x086c:
            r11 = 0
        L_0x086d:
            if (r11 >= r0) goto L_0x08a6
            org.json.JSONObject r12 = r3.optJSONObject(r11)
            if (r12 != 0) goto L_0x0876
            goto L_0x08a3
        L_0x0876:
            java.lang.String r13 = "businessId"
            java.lang.String r13 = r12.optString(r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x0883
            goto L_0x08a3
        L_0x0883:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig r14 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig.m162216a()
            r14.getClass()
            te3.a24 r14 = ba1.C113155g.m154832a()
            if (r14 != 0) goto L_0x0892
            r14 = 1
            goto L_0x0894
        L_0x0892:
            boolean r14 = r14.f182010d
        L_0x0894:
            if (r14 == 0) goto L_0x089d
            boolean r14 = r10.contains(r13)
            if (r14 != 0) goto L_0x089d
            goto L_0x08a3
        L_0x089d:
            r7.put(r12)
            r10.remove(r13)
        L_0x08a3:
            int r11 = r11 + 1
            goto L_0x086d
        L_0x08a6:
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0981
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x08d3
            int r0 = e91.C116711b.m164584i()
            if (r0 != 0) goto L_0x08ba
            goto L_0x0981
        L_0x08ba:
            r3 = 0
            byte[] r10 = new byte[r3]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "mmkv_async_bizid_sid"
            r3.append(r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            f91.C116850b.m164834d(r0, r10)
            goto L_0x0981
        L_0x08d3:
            int r0 = r10.size()
            r3 = 1
            int r0 = r0 - r3
            r3 = r0
        L_0x08da:
            if (r3 < 0) goto L_0x0966
            java.lang.Object r0 = r10.get(r3)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x095f
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x08ed
            goto L_0x095f
        L_0x08ed:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            int r0 = r11.length()
            if (r0 != 0) goto L_0x08f7
            r0 = 1
            goto L_0x08f8
        L_0x08f7:
            r0 = 0
        L_0x08f8:
            if (r0 == 0) goto L_0x08fb
            goto L_0x093b
        L_0x08fb:
            java.lang.String[] r25 = new java.lang.String[]{r23}     // Catch:{ Exception -> 0x091d }
            r26 = 0
            r27 = 0
            r28 = 6
            r29 = 0
            r24 = r11
            java.util.List r0 = z04.C112550d0.m153785U(r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x091d }
            r12 = 0
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x091d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x091d }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x091d }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x091d }
            goto L_0x093c
        L_0x091d:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "getPageStartTimeOfBusinessId, crash: "
            r12.append(r13)
            java.lang.String r13 = r0.getMessage()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.String r13 = "HABBYGE-MALI.HellKSessionConfig"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r12, r14)
        L_0x093b:
            r0 = 0
        L_0x093c:
            if (r0 == 0) goto L_0x0962
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r0.longValue()
            long r12 = r12 - r14
            r14 = 43200000(0x2932e00, double:2.1343636E-316)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0962
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r12 = 0
            r0[r12] = r11
            java.lang.String r11 = "HABBYGE-MALI.AsyncBizDao"
            java.lang.String r12 = "AsyncBizDao, _clearHistory: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r0)
            r10.remove(r3)
            goto L_0x0962
        L_0x095f:
            r10.remove(r3)
        L_0x0962:
            int r3 = r3 + -1
            goto L_0x08da
        L_0x0966:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x096d
            goto L_0x0981
        L_0x096d:
            te3.q7 r0 = new te3.q7
            r0.<init>()
            java.util.LinkedList<java.lang.String> r3 = r0.f140167d
            r3.addAll(r10)
            ba1.C113150a.m154816c(r0)
            goto L_0x0981
        L_0x097b:
            java.lang.String r0 = "AsyncBizReport, filterBySessionPage, bizIdOfCloudConfig is NULL !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0980:
            r7 = 0
        L_0x0981:
            if (r7 == 0) goto L_0x09c2
            int r0 = r7.length()
            if (r0 > 0) goto L_0x098a
            goto L_0x09c2
        L_0x098a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x09b2 }
            r0.<init>()     // Catch:{ JSONException -> 0x09b2 }
            long r10 = r2.f354026d     // Catch:{ JSONException -> 0x09b2 }
            r0.put(r6, r10)     // Catch:{ JSONException -> 0x09b2 }
            long r10 = r2.f354027e     // Catch:{ JSONException -> 0x09b2 }
            long r2 = r2.f354026d     // Catch:{ JSONException -> 0x09b2 }
            long r10 = r10 - r2
            r2 = 0
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x09a1
            r14 = r10
            goto L_0x09a2
        L_0x09a1:
            r14 = r2
        L_0x09a2:
            r0.put(r8, r14)     // Catch:{ JSONException -> 0x09b2 }
            r0.put(r5, r4)     // Catch:{ JSONException -> 0x09b2 }
            r0.put(r9, r7)     // Catch:{ JSONException -> 0x09b2 }
            java.lang.String r11 = r0.toString()     // Catch:{ JSONException -> 0x09b2 }
            r2 = 1
            r5 = 0
            goto L_0x09d6
        L_0x09b2:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r0.getMessage()
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "AsyncBizReport, toJsons: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x09c2:
            r2 = 1
            r5 = 0
            goto L_0x09d5
        L_0x09c5:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r0.getMessage()
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "AsyncBizReport, getParamsJSONArray: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r3)
        L_0x09d5:
            r11 = 0
        L_0x09d6:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x09dd
            goto L_0x09ed
        L_0x09dd:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r5] = r11
            java.lang.String r2 = "doReport: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            r0 = 17648(0x44f0, float:2.473E-41)
            r1 = 5120(0x1400, float:7.175E-42)
            com.tencent.p014mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct.m117909s(r0, r11, r1)
        L_0x09ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea1.C116718g.m164617d(te3.gg2, te3.dg2, te3.ka3):void");
    }

    /* renamed from: e */
    public static void m164618e(String str, boolean z, long j) {
        C110974w14 b;
        if (!z && (b = HellSessionPageCloudConfig.m162212a().mo175241b(j)) != null) {
            boolean z2 = false;
            Iterator<C118464s14> it = b.f332316f.iterator();
            while (it.hasNext() && ((r1 = it.next()) == null || !str.equals(C116711b.m164583h(r1.f354328d)) || (!r1.f354329e.isEmpty()))) {
            }
            if (z2) {
                C58534i.m67952a(j, 1);
            }
        }
    }

    /* renamed from: f */
    public static void m164619f(String str, String str2, long j) {
        boolean z;
        C110974w14 b = HellSessionPageCloudConfig.m162212a().mo175241b(j);
        if (b != null) {
            Iterator<C118464s14> it = b.f332316f.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C118464s14 next = it.next();
                if (next != null && str2.equals(C116711b.m164583h(next.f354328d))) {
                    Iterator<yr4> it4 = next.f354330f.iterator();
                    while (true) {
                        z = true;
                        if (!it4.hasNext()) {
                            z = false;
                            break;
                        }
                        yr4 next2 = it4.next();
                        if (next2 != null && str.equals(next2.f354612i)) {
                            z2 = !next2.f354611h.isEmpty();
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (z2) {
                C58534i.m67952a(j, 5);
            }
        }
    }

    /* renamed from: g */
    public static void m164620g(String str, long j) {
        C110974w14 b = HellSessionPageCloudConfig.m162212a().mo175241b(j);
        if (b != null) {
            boolean z = false;
            Iterator<C118464s14> it = b.f332316f.iterator();
            while (it.hasNext() && ((r2 = it.next()) == null || !str.equals(C116711b.m164583h(r2.f354328d)) || (!r2.f354330f.isEmpty()))) {
            }
            if (z) {
                C58534i.m67952a(j, 3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e7 A[LOOP:5: B:121:0x02e1->B:123:0x02e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m164621h(te3.C118434gg2 r24, te3.C118423dg2 r25, te3.C22505ka3 r26) {
        /*
            r1 = r24
            r2 = r26
            java.lang.String r3 = "mmkv_fuzzy_mc_rpt"
            byte[] r0 = f91.C116850b.m164831a(r3)
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0031
            int r7 = r0.length
            if (r7 != 0) goto L_0x0013
            r7 = 1
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            if (r7 == 0) goto L_0x0017
            goto L_0x0031
        L_0x0017:
            te3.cr1 r7 = new te3.cr1
            r7.<init>()
            r7.parseFrom(r0)     // Catch:{ IOException -> 0x0020 }
            goto L_0x0032
        L_0x0020:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r8 = r7.getMessage()
            r0[r6] = r8
            java.lang.String r8 = "HABBYGE-MALI.FuzzyMatchReport"
            java.lang.String r9 = "FuzzyMatchReport, _read: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r7, r9, r0)
        L_0x0031:
            r7 = 0
        L_0x0032:
            boolean r0 = d91.C20449a.m22052d()
            java.lang.String r8 = "HABBYGE-MALI.HellSessionPageDetailReport"
            java.lang.String r9 = "content"
            java.lang.String r10 = "pagePathId"
            if (r0 == 0) goto L_0x02cc
            int r0 = e91.C116711b.m164584i()
            if (r0 != 0) goto L_0x0047
            goto L_0x02cc
        L_0x0047:
            java.util.Map r0 = m164624k(r25)
            java.util.Map r11 = ea1.C116717f.m164610c(r0, r2)
            ea1.C116717f.m164609b(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            java.lang.String r12 = "pagePath"
            java.lang.String r13 = ""
            java.lang.String r14 = "lastSessionId"
            java.lang.String r15 = "sessionId"
            if (r0 != 0) goto L_0x015c
            r0 = r11
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r16 = r0.isEmpty()
            if (r16 == 0) goto L_0x006f
            goto L_0x015c
        L_0x006f:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x007c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = r16.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r17 = r0.isEmpty()
            if (r17 == 0) goto L_0x0095
            goto L_0x00a8
        L_0x0095:
            java.lang.Object r17 = r0.get(r6)
            r4 = r17
            te3.u14 r4 = (te3.C118472u14) r4
            boolean r6 = r4.f354481j
            if (r6 != 0) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            org.json.JSONObject r6 = ea1.C116717f.m164608a(r24)
            if (r6 != 0) goto L_0x00aa
        L_0x00a8:
            r6 = 0
            goto L_0x007c
        L_0x00aa:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r18 = r0.iterator()
        L_0x00b3:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r18.next()
            te3.u14 r0 = (te3.C118472u14) r0
            r19 = r13
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            r20 = r3
            long r2 = r0.f354478g     // Catch:{ Exception -> 0x00ee }
            r13.put(r10, r2)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r2 = r0.f354477f     // Catch:{ Exception -> 0x00ee }
            r13.put(r15, r2)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r2 = r0.f354477f     // Catch:{ Exception -> 0x00ee }
            java.lang.String r2 = ea1.C116715d.m164605b(r1, r2)     // Catch:{ Exception -> 0x00ee }
            if (r2 != 0) goto L_0x00dc
            r2 = r19
        L_0x00dc:
            r13.put(r14, r2)     // Catch:{ Exception -> 0x00ee }
            java.util.LinkedList<te3.eg2> r2 = r0.f354480i     // Catch:{ Exception -> 0x00ee }
            long r0 = r0.f354478g     // Catch:{ Exception -> 0x00ee }
            org.json.JSONArray r0 = ea1.C116715d.m164604a(r2, r13, r0)     // Catch:{ Exception -> 0x00ee }
            r13.put(r12, r0)     // Catch:{ Exception -> 0x00ee }
            r5.put(r13)
            goto L_0x00ff
        L_0x00ee:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r0.getMessage()
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "toJson, crash-1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r1, r2)
        L_0x00ff:
            r1 = r24
            r2 = r26
            r13 = r19
            r3 = r20
            goto L_0x00b3
        L_0x0108:
            r20 = r3
            r19 = r13
            int r0 = r5.length()
            if (r0 > 0) goto L_0x0113
            goto L_0x013a
        L_0x0113:
            r6.put(r9, r5)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = r4.f354479h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013a
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r6.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "SessionPageDetail, sidJSONObject: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r0)
            java.lang.String r0 = r4.f354479h
            java.lang.String r1 = r6.toString()
            op3.b r0 = op3.C117882j.m166284c(r0, r1)
            r11.add(r0)
        L_0x013a:
            r1 = r24
            r2 = r26
            r13 = r19
            r3 = r20
            r5 = 1
            goto L_0x00a8
        L_0x0145:
            r0 = move-exception
            r1 = r0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r1.getMessage()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "createJSONObjectHead, crash-2: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r1, r3, r0)
            goto L_0x013a
        L_0x0157:
            r20 = r3
            r19 = r13
            goto L_0x0176
        L_0x015c:
            r20 = r3
            r19 = r13
            r2 = 1
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.util.HashMap r11 = (java.util.HashMap) r11
            int r1 = r11.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "SessionPageDetail, toJson, PageFlowMap Empty: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r0)
            r11 = 0
        L_0x0176:
            if (r11 != 0) goto L_0x017e
            java.lang.String r0 = "SessionPageDetail, _reportSessionPage: logIdJsonList == null !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0181
        L_0x017e:
            ea1.C116715d.m164606c(r11)
        L_0x0181:
            java.lang.String r1 = "HABBYGE-MALI.FuzzyDetailReport"
            if (r7 == 0) goto L_0x02bf
            java.util.LinkedList<te3.fr1> r0 = r7.f331912d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018f
            goto L_0x02bf
        L_0x018f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.LinkedList<te3.fr1> r2 = r7.f331912d
            java.util.Iterator r2 = r2.iterator()
        L_0x019a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r2.next()
            te3.fr1 r3 = (te3.C110962fr1) r3
            long r4 = r3.f331979n
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L_0x01c6
            long r4 = r3.f331979n
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x01cb
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x01cb
        L_0x01c6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01cb:
            r4.add(r3)
            long r5 = r3.f331979n
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r3, r4)
            goto L_0x019a
        L_0x01d8:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01e8
            java.lang.String r0 = "reportFuzzyMatch，toJson: ppidPathsMap == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r4 = r24
            goto L_0x02c7
        L_0x01e8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x01f5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x02b8
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0211
            goto L_0x01f5
        L_0x0211:
            r5 = 0
            java.lang.Object r0 = r4.get(r5)
            r5 = r0
            te3.fr1 r5 = (te3.C110962fr1) r5
            boolean r0 = r5.f331977i
            if (r0 != 0) goto L_0x021e
            goto L_0x01f5
        L_0x021e:
            org.json.JSONObject r6 = ea1.C116717f.m164608a(r24)
            if (r6 != 0) goto L_0x0225
            goto L_0x01f5
        L_0x0225:
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            r11 = 0
        L_0x022b:
            int r0 = r4.size()
            if (r11 >= r0) goto L_0x0281
            java.lang.Object r0 = r4.get(r11)
            te3.fr1 r0 = (te3.C110962fr1) r0
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            r16 = r3
            r18 = r4
            long r3 = r0.f331979n     // Catch:{ Exception -> 0x0266 }
            r13.put(r10, r3)     // Catch:{ Exception -> 0x0266 }
            java.lang.String r3 = r0.f331972d     // Catch:{ Exception -> 0x0266 }
            r13.put(r15, r3)     // Catch:{ Exception -> 0x0266 }
            java.lang.String r3 = r0.f331972d     // Catch:{ Exception -> 0x0266 }
            r4 = r24
            java.lang.String r3 = ea1.C116715d.m164605b(r4, r3)     // Catch:{ Exception -> 0x0264 }
            if (r3 != 0) goto L_0x0256
            r3 = r19
        L_0x0256:
            r13.put(r14, r3)     // Catch:{ Exception -> 0x0264 }
            org.json.JSONArray r0 = ea1.C116712a.m164599d(r0, r13)     // Catch:{ Exception -> 0x0264 }
            r13.put(r12, r0)     // Catch:{ Exception -> 0x0264 }
            r8.put(r13)
            goto L_0x027a
        L_0x0264:
            r0 = move-exception
            goto L_0x0269
        L_0x0266:
            r0 = move-exception
            r4 = r24
        L_0x0269:
            r3 = 1
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r3 = r0.getMessage()
            r17 = 0
            r13[r17] = r3
            java.lang.String r3 = "toJson, crash-FuzzyPath-1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r13)
        L_0x027a:
            int r11 = r11 + 1
            r3 = r16
            r4 = r18
            goto L_0x022b
        L_0x0281:
            r4 = r24
            r16 = r3
            int r0 = r8.length()
            if (r0 > 0) goto L_0x0291
            java.lang.String r0 = "content is NULL !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x02b4
        L_0x0291:
            r6.put(r9, r8)     // Catch:{ JSONException -> 0x02a2 }
            java.lang.String r0 = r5.f331978j
            java.lang.String r3 = r6.toString()
            op3.b r0 = op3.C117882j.m166284c(r0, r3)
            r2.add(r0)
            goto L_0x02b4
        L_0x02a2:
            r0 = move-exception
            r3 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r3.getMessage()
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "toJson, crash-FuzzyPath-2: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r0)
        L_0x02b4:
            r3 = r16
            goto L_0x01f5
        L_0x02b8:
            r4 = r24
            goto L_0x01f5
        L_0x02bc:
            r4 = r24
            goto L_0x02c8
        L_0x02bf:
            r4 = r24
            java.lang.String r0 = "reportFuzzyMatch，toJson: cache == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x02c7:
            r2 = 0
        L_0x02c8:
            ea1.C116715d.m164606c(r2)
            goto L_0x02d4
        L_0x02cc:
            r4 = r1
            r20 = r3
            java.lang.String r0 = "SessionPageDetail, report: fetchHellhoundConfig FALSE !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x02d4:
            te3.dg2 r0 = new te3.dg2
            r0.<init>()
            r1 = r25
            java.util.LinkedList<te3.eg2> r1 = r1.f353948d
            java.util.Iterator r1 = r1.iterator()
        L_0x02e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0310
            java.lang.Object r2 = r1.next()
            te3.eg2 r2 = (te3.C118427eg2) r2
            te3.eg2 r3 = new te3.eg2
            r3.<init>()
            java.lang.String r5 = r2.f353972g
            r3.f353972g = r5
            java.lang.String r5 = r2.f353969d
            r3.f353969d = r5
            int r5 = r2.f353977o
            r3.f353977o = r5
            long r5 = r2.f353970e
            r3.f353970e = r5
            long r5 = r2.f353971f
            r3.f353971f = r5
            int r2 = r2.f353974i
            r3.f353974i = r2
            java.util.LinkedList<te3.eg2> r2 = r0.f353948d
            r2.add(r3)
            goto L_0x02e1
        L_0x0310:
            java.util.Map r0 = m164624k(r0)
            r1 = r26
            java.util.Map r1 = ea1.C116717f.m164610c(r0, r1)
            ea1.C116717f.m164609b(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            java.lang.String r2 = "HABBYGE-MALI.HellSessionPageMergeReport"
            java.lang.String r3 = "in"
            java.lang.String r5 = "count"
            java.lang.String r6 = "sid"
            if (r0 != 0) goto L_0x0540
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0338
            goto L_0x0540
        L_0x0338:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0345:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x039c
            java.lang.Object r13 = r1.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x035e
            goto L_0x0345
        L_0x035e:
            java.util.Iterator r13 = r13.iterator()
        L_0x0362:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0345
            java.lang.Object r14 = r13.next()
            te3.u14 r14 = (te3.C118472u14) r14
            if (r14 != 0) goto L_0x0371
            goto L_0x0362
        L_0x0371:
            java.lang.String r15 = r14.f354477f
            java.lang.String r15 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r15)
            if (r15 != 0) goto L_0x037a
            goto L_0x0362
        L_0x037a:
            boolean r16 = r0.containsKey(r15)
            if (r16 == 0) goto L_0x038e
            java.lang.Object r16 = r0.get(r15)
            java.util.List r16 = (java.util.List) r16
            if (r16 != 0) goto L_0x0393
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            goto L_0x0393
        L_0x038e:
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
        L_0x0393:
            r11 = r16
            r11.add(r14)
            r0.put(r15, r11)
            goto L_0x0362
        L_0x039c:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x03a5
        L_0x03a2:
            r8 = r9
            goto L_0x0546
        L_0x03a5:
            org.json.JSONObject r1 = ea1.C116717f.m164608a(r24)
            if (r1 != 0) goto L_0x03ac
            goto L_0x03a2
        L_0x03ac:
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x03b9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0510
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x03da:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x049c
            java.lang.Object r15 = r0.next()
            te3.u14 r15 = (te3.C118472u14) r15
            r16 = r9
            long r8 = r15.f354478g
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r14.containsKey(r8)
            if (r8 == 0) goto L_0x045e
            long r8 = r15.f354478g
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r8 = r14.get(r8)
            op3.b r8 = (op3.C117877b) r8
            if (r8 == 0) goto L_0x0458
            java.util.LinkedList<te3.eg2> r9 = r15.f354480i
            java.util.Iterator r9 = r9.iterator()
            r21 = 0
        L_0x040a:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L_0x0425
            java.lang.Object r19 = r9.next()
            r23 = r0
            r0 = r19
            te3.eg2 r0 = (te3.C118427eg2) r0
            r19 = r1
            long r0 = r0.f353971f
            long r21 = r21 + r0
            r1 = r19
            r0 = r23
            goto L_0x040a
        L_0x0425:
            r23 = r0
            r19 = r1
            long r0 = r15.f354478g
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            java.lang.Object r9 = r8.mo182596a(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r1 = r9.intValue()
            r9 = 1
            int r1 = r1 + r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.mo182596a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            long r8 = r8 + r21
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            op3.b r1 = op3.C117882j.m166284c(r1, r8)
            r14.put(r0, r1)
            goto L_0x045c
        L_0x0458:
            r23 = r0
            r19 = r1
        L_0x045c:
            r1 = 1
            goto L_0x0494
        L_0x045e:
            r23 = r0
            r19 = r1
            java.util.LinkedList<te3.eg2> r0 = r15.f354480i
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L_0x046a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x047e
            java.lang.Object r1 = r0.next()
            te3.eg2 r1 = (te3.C118427eg2) r1
            r21 = r0
            long r0 = r1.f353971f
            long r8 = r8 + r0
            r0 = r21
            goto L_0x046a
        L_0x047e:
            long r0 = r15.f354478g
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            op3.b r8 = op3.C117882j.m166284c(r15, r8)
            r14.put(r0, r8)
        L_0x0494:
            r9 = r16
            r1 = r19
            r0 = r23
            goto L_0x03da
        L_0x049c:
            r19 = r1
            r16 = r9
            r1 = 1
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r8 = 0
            r0[r8] = r13
            int r8 = r14.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r1] = r8
            java.lang.String r1 = "SessionPageMerge, sid: %s, ppidInfoMap: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            java.util.Set r0 = r14.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x04be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x050a
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r8.put(r6, r13)     // Catch:{ JSONException -> 0x04f9 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ JSONException -> 0x04f9 }
            r8.put(r10, r9)     // Catch:{ JSONException -> 0x04f9 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ JSONException -> 0x04f9 }
            op3.b r9 = (op3.C117877b) r9     // Catch:{ JSONException -> 0x04f9 }
            r14 = 0
            java.lang.Object r9 = r9.mo182596a(r14)     // Catch:{ JSONException -> 0x04f9 }
            r8.put(r5, r9)     // Catch:{ JSONException -> 0x04f9 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ JSONException -> 0x04f9 }
            op3.b r0 = (op3.C117877b) r0     // Catch:{ JSONException -> 0x04f9 }
            r9 = 1
            java.lang.Object r0 = r0.mo182596a(r9)     // Catch:{ JSONException -> 0x04f9 }
            r8.put(r3, r0)     // Catch:{ JSONException -> 0x04f9 }
            r11.put(r8)
            goto L_0x04be
        L_0x04f9:
            r0 = move-exception
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r0.getMessage()
            r14 = 0
            r9[r14] = r8
            java.lang.String r8 = "SessionPageMerge, jsonObject: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r8, r9)
            goto L_0x04be
        L_0x050a:
            r9 = r16
            r1 = r19
            goto L_0x03b9
        L_0x0510:
            r19 = r1
            r16 = r9
            int r0 = r11.length()
            if (r0 > 0) goto L_0x0522
            java.lang.String r0 = "HellSessionPageMergeReport, content is NULL !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r8 = r16
            goto L_0x0546
        L_0x0522:
            r8 = r16
            r1 = r19
            r1.put(r8, r11)     // Catch:{ JSONException -> 0x052e }
            java.lang.String r0 = r1.toString()
            goto L_0x0547
        L_0x052e:
            r0 = move-exception
            r1 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r9 = r1.getMessage()
            r11 = 0
            r0[r11] = r9
            java.lang.String r9 = "SessionPageMerge, jsonObject, crash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r9, r0)
            goto L_0x0546
        L_0x0540:
            r8 = r9
            java.lang.String r0 = "SessionPageMerge, toJson, PageFlowMap Empty !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0546:
            r0 = 0
        L_0x0547:
            ea1.C116716e.m164607a(r0)
            if (r7 == 0) goto L_0x0740
            java.util.LinkedList<te3.fr1> r0 = r7.f331912d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0556
            goto L_0x0740
        L_0x0556:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.LinkedList<te3.fr1> r1 = r7.f331912d
            java.util.Iterator r1 = r1.iterator()
        L_0x0561:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0596
            java.lang.Object r2 = r1.next()
            te3.fr1 r2 = (te3.C110962fr1) r2
            java.lang.String r7 = r2.f331972d
            java.lang.String r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r7)
            if (r7 != 0) goto L_0x0576
            goto L_0x0561
        L_0x0576:
            boolean r9 = r0.containsKey(r7)
            if (r9 == 0) goto L_0x058a
            java.lang.Object r9 = r0.get(r7)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x058f
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x058f
        L_0x058a:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x058f:
            r9.add(r2)
            r0.put(r7, r9)
            goto L_0x0561
        L_0x0596:
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 0
            r1[r7] = r2
            java.lang.String r2 = "HABBYGE-MALI.FuzzyMergeReport"
            java.lang.String r7 = "FuzzyPageMerge, sidPathsMap: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x05b3
            goto L_0x073c
        L_0x05b3:
            org.json.JSONObject r1 = ea1.C116717f.m164608a(r24)
            if (r1 != 0) goto L_0x05bb
            goto L_0x073c
        L_0x05bb:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x05c8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0713
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x05e9:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x06a3
            java.lang.Object r12 = r0.next()
            te3.fr1 r12 = (te3.C110962fr1) r12
            long r13 = r12.f331979n
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            boolean r13 = r11.containsKey(r13)
            if (r13 == 0) goto L_0x0669
            long r13 = r12.f331979n
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.Object r13 = r11.get(r13)
            op3.b r13 = (op3.C117877b) r13
            if (r13 == 0) goto L_0x0663
            java.util.LinkedList<te3.er1> r14 = r12.f331975g
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
        L_0x0617:
            boolean r19 = r14.hasNext()
            if (r19 == 0) goto L_0x0631
            java.lang.Object r19 = r14.next()
            r24 = r0
            r0 = r19
            te3.er1 r0 = (te3.C118429er1) r0
            r19 = r1
            long r0 = r0.f353987f
            long r15 = r15 + r0
            r0 = r24
            r1 = r19
            goto L_0x0617
        L_0x0631:
            r24 = r0
            r19 = r1
            long r0 = r12.f331979n
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            java.lang.Object r12 = r13.mo182596a(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r1 = r12.intValue()
            r12 = 1
            int r1 = r1 + r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r13 = r13.mo182596a(r12)
            java.lang.Long r13 = (java.lang.Long) r13
            long r12 = r13.longValue()
            long r12 = r12 + r15
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            op3.b r1 = op3.C117882j.m166284c(r1, r12)
            r11.put(r0, r1)
            goto L_0x0667
        L_0x0663:
            r24 = r0
            r19 = r1
        L_0x0667:
            r1 = 1
            goto L_0x069d
        L_0x0669:
            r24 = r0
            r19 = r1
            java.util.LinkedList<te3.er1> r0 = r12.f331975g
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0675:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0687
            java.lang.Object r1 = r0.next()
            te3.er1 r1 = (te3.C118429er1) r1
            r15 = r0
            long r0 = r1.f353987f
            long r13 = r13 + r0
            r0 = r15
            goto L_0x0675
        L_0x0687:
            long r0 = r12.f331979n
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            op3.b r12 = op3.C117882j.m166284c(r12, r13)
            r11.put(r0, r12)
        L_0x069d:
            r0 = r24
            r1 = r19
            goto L_0x05e9
        L_0x06a3:
            r19 = r1
            r1 = 1
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r9
            int r13 = r11.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r1] = r13
            java.lang.String r1 = "FuzzyPageMerge, sid: %s, ppidInfoMap: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x06c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x070f
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            r11.put(r6, r9)     // Catch:{ JSONException -> 0x06fe }
            java.lang.Object r13 = r0.getKey()     // Catch:{ JSONException -> 0x06fe }
            r11.put(r10, r13)     // Catch:{ JSONException -> 0x06fe }
            java.lang.Object r13 = r0.getValue()     // Catch:{ JSONException -> 0x06fe }
            op3.b r13 = (op3.C117877b) r13     // Catch:{ JSONException -> 0x06fe }
            r14 = 0
            java.lang.Object r13 = r13.mo182596a(r14)     // Catch:{ JSONException -> 0x06fe }
            r11.put(r5, r13)     // Catch:{ JSONException -> 0x06fe }
            java.lang.Object r0 = r0.getValue()     // Catch:{ JSONException -> 0x06fe }
            op3.b r0 = (op3.C117877b) r0     // Catch:{ JSONException -> 0x06fe }
            r13 = 1
            java.lang.Object r0 = r0.mo182596a(r13)     // Catch:{ JSONException -> 0x06fe }
            r11.put(r3, r0)     // Catch:{ JSONException -> 0x06fe }
            r4.put(r11)
            goto L_0x06c3
        L_0x06fe:
            r0 = move-exception
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r11 = r0.getMessage()
            r14 = 0
            r13[r14] = r11
            java.lang.String r11 = "FuzzyPageMerge, jsonObject: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r11, r13)
            goto L_0x06c3
        L_0x070f:
            r1 = r19
            goto L_0x05c8
        L_0x0713:
            r19 = r1
            int r0 = r4.length()
            if (r0 > 0) goto L_0x0721
            java.lang.String r0 = "FuzzyMergeReport, content is NULL !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x073c
        L_0x0721:
            r1 = r19
            r1.put(r8, r4)     // Catch:{ JSONException -> 0x072b }
            java.lang.String r4 = r1.toString()
            goto L_0x073d
        L_0x072b:
            r0 = move-exception
            r1 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r1.getMessage()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "SessionPageMerge, content: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x073c:
            r4 = 0
        L_0x073d:
            ea1.C116716e.m164607a(r4)
        L_0x0740:
            int r0 = e91.C116711b.m164584i()
            if (r0 != 0) goto L_0x0747
            goto L_0x0771
        L_0x0747:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x075f }
            r1.<init>()     // Catch:{ Exception -> 0x075f }
            java.lang.String r2 = "mmkv_key_hellSPMatchSuche_"
            r1.append(r2)     // Catch:{ Exception -> 0x075f }
            r1.append(r0)     // Catch:{ Exception -> 0x075f }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x075f }
            r1 = 0
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x075f }
            f91.C116850b.m164834d(r0, r2)     // Catch:{ Exception -> 0x075f }
            goto L_0x0771
        L_0x075f:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.getMessage()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "HABBYGE-MALI.SessionPageMatchingCache"
            java.lang.String r3 = "SessionPageMatchingCache.reset: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x0771:
            java.lang.String r0 = "HABBYGE-MALI.FuzzyMatch"
            java.lang.String r1 = "resetReportCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = 0
            byte[] r0 = new byte[r1]
            r1 = r20
            f91.C116850b.m164834d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea1.C116718g.m164621h(te3.gg2, te3.dg2, te3.ka3):void");
    }

    /* renamed from: i */
    public static void m164622i(C118423dg2 dg22, C118434gg2 gg22, boolean z) {
        int i;
        long j;
        C118427eg2 last;
        C118427eg2 first;
        Collections.sort(dg22.f353948d, new C116719a());
        Map<String, List<C118427eg2>> j2 = m164623j(dg22);
        Iterator<C22505ka3> it = gg22.f354028f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C22505ka3 next = it.next();
            List list = (List) ((HashMap) j2).get(next.f64087d);
            if (list != null && !list.isEmpty()) {
                ((C118427eg2) list.get(0)).f353970e = next.f64092i;
            }
        }
        Iterator<C118430fa3> it4 = gg22.f354030h.iterator();
        while (it4.hasNext()) {
            C118430fa3 next2 = it4.next();
            List list2 = (List) ((HashMap) j2).get(next2.f353996j + "_" + next2.f353993g);
            if (list2 != null && !list2.isEmpty()) {
                ((C118427eg2) list2.get(0)).f353970e = next2.f353993g;
            }
        }
        int size = dg22.f353948d.size();
        if (size > 0 && (first = dg22.f353948d.getFirst()) != null) {
            first.f353970e = gg22.f354026d;
        }
        int i2 = 0;
        while (true) {
            j = 0;
            if (i2 >= size) {
                break;
            }
            C118427eg2 eg22 = dg22.f353948d.get(i2);
            if (eg22 != null) {
                int i3 = i2 + 1;
                if (i3 >= size) {
                    break;
                }
                C118427eg2 eg23 = dg22.f353948d.get(i3);
                if (eg23 != null && eg22.f353971f == 0) {
                    long j3 = eg23.f353970e - eg22.f353970e;
                    if (j3 > 0) {
                        j = j3;
                    }
                    eg22.f353971f = j;
                }
            }
            i2++;
        }
        if (z) {
            long j4 = 0;
            for (i = 0; i < size; i++) {
                C118427eg2 eg24 = dg22.f353948d.get(i);
                if (eg24 != null) {
                    long j5 = eg24.f353971f;
                    if (j5 > 0) {
                        j4 += j5;
                    }
                }
            }
            gg22.f354027e = gg22.f354026d + j4;
        } else if (size > 0 && (last = dg22.f353948d.getLast()) != null) {
            long j6 = gg22.f354027e - last.f353970e;
            if (j6 > 0) {
                j = j6;
            }
            last.f353971f = j;
        }
    }

    /* renamed from: j */
    public static Map<String, List<C118427eg2>> m164623j(C118423dg2 dg22) {
        List list;
        HashMap hashMap = new HashMap();
        Iterator<C118427eg2> it = dg22.f353948d.iterator();
        while (it.hasNext()) {
            C118427eg2 next = it.next();
            if (next != null) {
                String str = next.f353972g;
                if (str == null || str.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    hashMap.put(next.f353969d + "_" + next.f353970e, arrayList);
                } else {
                    if (hashMap.containsKey(next.f353972g)) {
                        list = (List) hashMap.get(next.f353972g);
                        if (list == null) {
                            list = new ArrayList();
                        }
                    } else {
                        list = new ArrayList();
                    }
                    list.add(next);
                    hashMap.put(next.f353972g, list);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    public static Map<String, List<C118427eg2>> m164624k(C118423dg2 dg22) {
        List list;
        HashMap hashMap = new HashMap();
        Iterator<C118427eg2> it = dg22.f353948d.iterator();
        while (it.hasNext()) {
            C118427eg2 next = it.next();
            if (next != null) {
                String str = next.f353972g;
                if (str != null && !str.isEmpty()) {
                    if (hashMap.containsKey(next.f353972g)) {
                        list = (List) hashMap.get(next.f353972g);
                        if (list == null) {
                            list = new ArrayList();
                        }
                    } else {
                        list = new ArrayList();
                    }
                    list.add(next);
                    hashMap.put(next.f353972g, list);
                } else if (!hashMap.containsKey(next.f353969d)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    hashMap.put(next.f353969d, arrayList);
                }
            }
        }
        return hashMap;
    }
}
