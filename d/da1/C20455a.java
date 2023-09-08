package da1;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import ba1.C113153e;
import ba1.C16777c;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import ea1.C58534i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import op3.C117877b;
import te3.C101777fg2;
import te3.C110962fr1;
import te3.C110970q14;
import te3.C110971t14;
import te3.C110974w14;
import te3.C118427eg2;
import te3.C118429er1;
import te3.C118438ja3;
import te3.C118464s14;
import te3.C22505ka3;
import te3.C50562nl2;
import x91.C23066b;

/* renamed from: da1.a */
public final class C20455a {

    /* renamed from: a */
    public static final Map<Integer, WeakReference<Activity>> f57485a = new HashMap();

    /* renamed from: b */
    public static WeakReference<Object> f57486b = null;

    /* renamed from: a */
    public static void m22069a(Object obj, C118464s14 s142, String str, C22505ka3 ka32, long j, boolean z) {
        if (z) {
            if (s142.f354328d.equals(str)) {
                m22073e(obj, s142, ka32.f64087d, j, true);
            }
        } else if (s142.f354328d.equals(str)) {
            m22073e(obj, s142, ka32.f64087d, j, false);
        }
    }

    /* renamed from: b */
    public static void m22070b(Object obj, String str, C118464s14 s142, String str2, boolean z) {
        C117877b<C118427eg2, Integer> e = C113264b.m155059e(str2, str);
        if (e != null) {
            C118427eg2 eg22 = (C118427eg2) e.mo182596a(0);
            Iterator<C118438ja3> it = s142.f354329e.iterator();
            while (it.hasNext()) {
                C118438ja3 next = it.next();
                if (next != null) {
                    C116605b.m164445a(obj, next, eg22, false, z);
                }
            }
            C113264b.m155063i(eg22, ((Integer) e.mo182596a(1)).intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22071c(java.lang.Object r8, java.lang.String r9, te3.C118464s14 r10, te3.C118464s14 r11, te3.C22505ka3 r12, boolean r13, te3.C110974w14 r14) {
        /*
            r0 = 106(0x6a, float:1.49E-43)
            op3.c r0 = k91.C117394e.m165537c(r0)
            r1 = 0
            java.lang.String r2 = "HABBYGE-MALI.HellhoundUtil"
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0041
            k91.c r0 = k91.C21316c.m23893a()
            k91.a r0 = r0.f60219a
            k91.d r0 = (k91.C21317d) r0
            te3.q1 r0 = r0.mo33321a()
            if (r0 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.lang.String r5 = r0.f64472p
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0028
        L_0x0026:
            r0 = r1
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = r0.f64472p
        L_0x002a:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            java.lang.String r3 = "FuzzyMatch._getPrePage by activityJumpSrc: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            if (r0 == 0) goto L_0x0036
            goto L_0x008e
        L_0x0036:
            te3.nq1 r0 = l91.C21402d.m24158a()
            if (r0 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            java.lang.String r1 = r0.f184528d
        L_0x003f:
            r0 = r1
            goto L_0x008e
        L_0x0041:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r6 = r0.mo182596a(r3)
            r5[r3] = r6
            java.lang.Object r6 = r0.mo182596a(r4)
            r5[r4] = r6
            r6 = 2
            java.lang.Object r7 = r0.mo182596a(r6)
            r5[r6] = r7
            java.lang.String r7 = "FuzzyMatch._getPrePage by key_pause: %s, %b, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r5)
            java.lang.Object r2 = r0.mo182596a(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r0 = r0.mo182596a(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0071
            goto L_0x008e
        L_0x0071:
            te3.nq1 r0 = l91.C21402d.m24158a()
            if (r0 != 0) goto L_0x0078
            goto L_0x003f
        L_0x0078:
            java.lang.String r1 = r0.f184528d
            goto L_0x003f
        L_0x007b:
            java.lang.Object r0 = r0.mo182596a(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0084
            goto L_0x008e
        L_0x0084:
            te3.nq1 r0 = l91.C21402d.m24158a()
            if (r0 != 0) goto L_0x008b
            goto L_0x003f
        L_0x008b:
            java.lang.String r1 = r0.f184528d
            goto L_0x003f
        L_0x008e:
            java.lang.String r1 = r11.f354328d
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00b4
            java.lang.String r10 = r10.f354328d
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00b4
            int r10 = r14.f332319i
            if (r10 != 0) goto L_0x00a8
            java.lang.String r10 = r12.f64087d
            m22070b(r8, r9, r11, r10, r13)
            goto L_0x00b4
        L_0x00a8:
            if (r10 != r4) goto L_0x00b4
            long r4 = r14.f332315e
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r12
            r6 = r13
            m22069a(r0, r1, r2, r3, r4, r6)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da1.C20455a.m22071c(java.lang.Object, java.lang.String, te3.s14, te3.s14, te3.ka3, boolean, te3.w14):void");
    }

    /* renamed from: d */
    public static void m22072d(Object obj, C22505ka3 ka32, boolean z) {
        int i;
        C22505ka3 ka33 = ka32;
        boolean z2 = z;
        HellSessionPageCloudConfig.m162212a().getClass();
        C110971t14 a = C113153e.m154822a();
        if (a == null) {
            Log.m105920e("HABBYGE-MALI.HellPageParamsCatcher", "HellPageParamsCatcher, _doCatchOnActivity, config is NULL !!");
            return;
        }
        String b = C115411b.m162219b(ka33.f64087d);
        if (C115411b.m162227j(ka33.f64087d)) {
            b = C115411b.m162222e(ka32);
        }
        String str = b;
        Iterator<C110974w14> it = a.f332264d.iterator();
        while (it.hasNext()) {
            C110974w14 next = it.next();
            if (next != null && (next.f332314d.equals(str) || "-1".equals(next.f332314d))) {
                String canonicalName = obj.getClass().getCanonicalName();
                int size = next.f332316f.size();
                if (size != 1) {
                    Object obj2 = obj;
                    int i2 = 1;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C118464s14 s142 = next.f332316f.get(i2 - 1);
                        C118464s14 s143 = next.f332316f.get(i2);
                        if (s142 == null || s143 == null) {
                            i = i2;
                        } else {
                            int i3 = next.f332319i;
                            if (i3 == 0) {
                                i = i2;
                                m22071c(obj, canonicalName, s142, s143, ka32, z, next);
                            } else {
                                i = i2;
                                if (i3 != 1) {
                                    continue;
                                } else if (size == 2) {
                                    long j = next.f332315e;
                                    if (z2) {
                                        if (s143.f354328d.equals(canonicalName)) {
                                            m22073e(obj, s143, ka33.f64087d, j, true);
                                        } else if (s142.f354328d.equals(canonicalName)) {
                                            m22073e(obj, s142, ka33.f64087d, j, true);
                                        }
                                    } else if (s143.f354328d.equals(canonicalName)) {
                                        m22073e(obj, s143, ka33.f64087d, j, false);
                                    } else if (s142.f354328d.equals(canonicalName)) {
                                        m22073e(obj, s142, ka33.f64087d, j, false);
                                    }
                                } else {
                                    m22071c(obj, canonicalName, s142, s143, ka32, z, next);
                                }
                            }
                        }
                        i2 = i + 1;
                        Object obj3 = obj;
                    }
                } else {
                    C118464s14 s144 = next.f332316f.get(0);
                    if (s144 != null) {
                        String canonicalName2 = obj.getClass().getCanonicalName();
                        int i4 = next.f332319i;
                        if (i4 != 0) {
                            Object obj4 = obj;
                            if (i4 == 1) {
                                m22069a(obj, s144, canonicalName2, ka32, next.f332315e, z);
                            }
                        } else if (s144.f354328d.equals(canonicalName2)) {
                            m22070b(obj, canonicalName2, s144, ka33.f64087d, z2);
                        }
                    }
                    Object obj5 = obj;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m22073e(Object obj, C118464s14 s142, String str, long j, boolean z) {
        C110970q14 b;
        C110970q14 b2 = C23066b.f66278a.mo36464b(str);
        Pair pair = null;
        if (b2 != null) {
            int size = b2.f332255e.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C110962fr1 fr12 = b2.f332255e.get(size);
                if (fr12.f331979n == j) {
                    pair = Pair.create(fr12, Integer.valueOf(size));
                    break;
                }
                size--;
            }
        }
        if (pair != null) {
            C110962fr1 fr13 = (C110962fr1) pair.first;
            int intValue = ((Integer) pair.second).intValue();
            Iterator<C118438ja3> it = s142.f354329e.iterator();
            while (it.hasNext()) {
                C118438ja3 next = it.next();
                if (next != null && obj != null && !TextUtils.isEmpty(next.f354059d) && !TextUtils.isEmpty(next.f354060e)) {
                    if ("0".equals(next.f354061f)) {
                        if (!z) {
                        }
                    } else if ("2".equals(next.f354061f) && z) {
                    }
                    String simpleName = obj.getClass().getSimpleName();
                    C50562nl2 nl22 = next.f354063h;
                    C101777fg2 b3 = C116605b.m164446b(obj, next.f354062g, nl22 == null ? next.f354060e : nl22.f138657f, next.f354060e);
                    if (b3 == null) {
                        C50562nl2 nl23 = next.f354063h;
                        if (nl23 != null && !TextUtils.isEmpty(nl23.f138657f)) {
                            C58534i.m67953b(158);
                        }
                        String str2 = next.f354059d;
                        String str3 = next.f354060e;
                        b3 = C116605b.m164446b(obj, str2, str3, str3);
                        if (b3 == null) {
                        }
                    }
                    C58534i.m67953b(135);
                    int size2 = fr13.f331975g.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        C118429er1 er12 = fr13.f331975g.get(size2);
                        String h = C116711b.m164583h(er12.f353985d);
                        if (h == null || !h.equals(simpleName)) {
                            size2--;
                        } else {
                            int size3 = er12.f353988g.size();
                            int i = 0;
                            while (i < size3) {
                                String str4 = er12.f353988g.get(i).f298258e;
                                if (str4 != null && str4.equals(b3.f298258e)) {
                                    break;
                                }
                                i++;
                            }
                            if (i < size3) {
                                er12.f353988g.set(i, b3);
                            } else {
                                er12.f353988g.add(b3);
                            }
                        }
                    }
                }
            }
            C23066b.C23067a aVar = C23066b.f66278a;
            if (str != null && fr13 != null && (b = aVar.mo36464b(str)) != null) {
                b.f332255e.set(intValue, fr13);
                aVar.mo36467e(b);
            }
        }
    }

    /* renamed from: f */
    public static void m22074f(int i) {
        Activity activity;
        C22505ka3 e;
        WeakReference weakReference = (WeakReference) ((HashMap) f57485a).get(Integer.valueOf(i));
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null && !activity.isDestroyed() && (e = C16777c.m16413e()) != null) {
            Log.m105925i("HABBYGE-MALI.HellPageParamsCatcher", "catchOnActivityFinishAsync: %s", e.f64087d);
            m22072d(activity, e, false);
        }
    }

    /* renamed from: g */
    public static void m22075g(int i) {
        Activity activity;
        C22505ka3 e;
        WeakReference weakReference = (WeakReference) ((HashMap) f57485a).get(Integer.valueOf(i));
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null && !activity.isDestroyed() && (e = C16777c.m16413e()) != null) {
            m22072d(activity, e, true);
        }
    }
}
