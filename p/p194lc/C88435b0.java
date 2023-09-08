package p194lc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import my3.C61591g;
import p176jc.C87919d;
import rx3.C13604l;
import sx3.C64186f0;
import sx3.C64197v;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, mo182094d2 = {"Llc/b0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/m;", "a", "b", "c", "d", "e", "f", "luggage-skyline-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: lc.b0 */
public final class C88435b0 implements C1727m {

    /* renamed from: j */
    public static final C88436a f255441j = new C88436a();

    /* renamed from: d */
    public final boolean f255442d;

    /* renamed from: e */
    public final boolean f255443e;

    /* renamed from: f */
    public final C34216b f255444f;

    /* renamed from: g */
    public final boolean f255445g = C87919d.f254457a.mo122386a();

    /* renamed from: h */
    public final boolean f255446h;

    /* renamed from: i */
    public final int f255447i;

    /* renamed from: lc.b0$b */
    public static final class C34216b {

        /* renamed from: a */
        public final boolean f92264a;

        /* renamed from: b */
        public final List<String> f92265b;

        /* renamed from: c */
        public final List<C34217c> f92266c;

        public C34216b(boolean z, List<String> list, List<C34217c> list2) {
            C87412m.m108594g(list, "pathWhiteList");
            C87412m.m108594g(list2, "exptList");
            this.f92264a = z;
            this.f92265b = list;
            this.f92266c = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34216b)) {
                return false;
            }
            C34216b bVar = (C34216b) obj;
            return this.f92264a == bVar.f92264a && C87412m.m108589b(this.f92265b, bVar.f92265b) && C87412m.m108589b(this.f92266c, bVar.f92266c);
        }

        public int hashCode() {
            boolean z = this.f92264a;
            if (z) {
                z = true;
            }
            return ((((z ? 1 : 0) * true) + this.f92265b.hashCode()) * 31) + this.f92266c.hashCode();
        }

        public String toString() {
            return "SkylineExptGroup(isEnabled=" + this.f92264a + ", pathWhiteList=" + this.f92265b + ", exptList=" + this.f92266c + ')';
        }
    }

    /* renamed from: lc.b0$d */
    public static final class C34218d implements Comparable<C34218d> {

        /* renamed from: e */
        public static final C34219a f92271e = new C34219a((C8480h) null);

        /* renamed from: f */
        public static final C34218d f92272f = new C34218d(0);

        /* renamed from: g */
        public static final C34218d f92273g = new C34218d(Integer.MAX_VALUE);

        /* renamed from: h */
        public static final C34218d f92274h = new C34218d(BuildInfo.CLIENT_VERSION_INT >> 8);

        /* renamed from: d */
        public final int f92275d;

        /* renamed from: lc.b0$d$a */
        public static final class C34219a {
            public C34219a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C34218d mo59498a(String str) {
                C87412m.m108594g(str, "<this>");
                List T = C112550d0.m153784T(str, new char[]{'.'}, false, 0, 6, (Object) null);
                try {
                    if (T.size() != 2 && T.size() != 3) {
                        return null;
                    }
                    return new C34218d(((Integer.parseInt(C112550d0.m153799i0((String) T.get(1)).toString()) << 8) + (Integer.parseInt(C112550d0.m153799i0((String) T.get(0)).toString()) << 16) + Integer.parseInt(C112550d0.m153799i0((String) (2 <= C64197v.m75536e(T) ? T.get(2) : "0")).toString())) | 2097152);
                } catch (NumberFormatException e) {
                    Log.m105920e("Luggage.WxaRuntimeSkylineConfig", "toWxClientVersion(), parse " + str + " get exception:" + e);
                    return null;
                }
            }
        }

        public C34218d(int i) {
            this.f92275d = i;
        }

        public int compareTo(Object obj) {
            C34218d dVar = (C34218d) obj;
            C87412m.m108594g(dVar, "other");
            return this.f92275d - dVar.f92275d;
        }

        public String toString() {
            return "WxClientVersion(" + Integer.toHexString(this.f92275d) + ')';
        }
    }

    /* renamed from: lc.b0$a */
    public static final class C88436a {
    }

    /* renamed from: lc.b0$e */
    public static final class C88437e implements C61591g<C34218d> {

        /* renamed from: d */
        public final C34218d f255448d;

        /* renamed from: e */
        public final C34218d f255449e;

        public C88437e(C34218d dVar, C34218d dVar2, C8480h hVar) {
            this.f255448d = dVar;
            this.f255449e = dVar2;
        }

        /* renamed from: f0 */
        public Comparable mo59687f0() {
            return this.f255449e;
        }

        /* renamed from: g0 */
        public Comparable mo59688g0() {
            return this.f255448d;
        }
    }

    /* renamed from: lc.b0$f */
    public static final class C88438f implements Comparable<C88438f> {

        /* renamed from: e */
        public static final C88439a f255450e = new C88439a((C8480h) null);

        /* renamed from: d */
        public final int[] f255451d;

        /* renamed from: lc.b0$f$a */
        public static final class C88439a {
            public C88439a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C88438f mo122838a(String str) {
                C87412m.m108594g(str, "value");
                int length = str.length();
                int length2 = str.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i = length2 - 1;
                        if (Character.isDigit(str.charAt(length2))) {
                            length = Math.min(length2 + 1, str.length());
                            break;
                        } else if (i < 0) {
                            break;
                        } else {
                            length2 = i;
                        }
                    }
                }
                String substring = str.substring(0, length);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int[] iArr = {0, 0, 0};
                List T = C112550d0.m153784T(substring, new char[]{'.'}, false, 0, 6, (Object) null);
                for (int i2 = 0; i2 < 3; i2++) {
                    iArr[i2] = Integer.parseInt((String) T.get(i2));
                }
                return new C88438f(iArr, (C8480h) null);
            }
        }

        public C88438f(int[] iArr, C8480h hVar) {
            this.f255451d = iArr;
        }

        public int compareTo(Object obj) {
            C88438f fVar = (C88438f) obj;
            C87412m.m108594g(fVar, "other");
            for (int i = 0; i < 3; i++) {
                int i2 = this.f255451d[i];
                int i3 = fVar.f255451d[i];
                if (i2 != i3) {
                    return i2 - i3;
                }
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0352 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0212 A[Catch:{ JSONException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x024b A[SYNTHETIC, Splitter:B:78:0x024b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88435b0(p963fc.C86812g r28, com.tencent.p014mm.plugin.appbrand.config.C81634a r29, boolean r30) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            java.lang.String r3 = "runtime"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "appConfig"
            gy3.C87412m.m108594g(r2, r3)
            r27.<init>()
            r3 = r30
            r1.f255442d = r3
            com.tencent.mm.plugin.appbrand.config.a$g r2 = r2.f239619y
            java.lang.String[] r2 = r2.f239631b
            java.lang.String r3 = "skyline"
            boolean r2 = u24.C90595a.m113498b(r2, r3)
            r1.f255443e = r2
            jc.d r4 = p176jc.C87919d.f254457a
            boolean r4 = r4.mo122386a()
            r1.f255445g = r4
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader> r4 = com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader.class
            k40.a r4 = r0.mo113027R0(r4)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = (com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader) r4
            gy3.C87412m.m108591d(r4)
            java.lang.String r3 = r4.Yk0(r3)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            r1.f255446h = r3
            pc.d r3 = p819pc.C47454d.f127280a
            java.lang.String r4 = r0.f238147j
            java.lang.String r5 = "runtime.appId"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r3.mo72474a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SwitchRenderLogic#"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r3.mo72474a()
            java.lang.String r7 = "SwitchRenderLogic#Default"
            r8 = 0
            int r3 = r3.getInt(r7, r8)
            int r3 = r6.getInt(r4, r3)
            r1.f255447i = r3
            java.lang.String r3 = "Luggage.WxaRuntimeSkylineConfig"
            if (r2 == 0) goto L_0x03ee
            lc.b0$a r2 = f255441j
            java.lang.String r6 = r0.f238147j
            gy3.C87412m.m108593f(r6, r5)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader> r5 = com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader.class
            k40.a r5 = r0.mo113027R0(r5)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5 = (com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader) r5
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r0 = r28.mo113051d0()
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r0 = r0.f234856A
            java.lang.String r0 = r0.f234897f
            r2.getClass()
            if (r5 != 0) goto L_0x0094
            goto L_0x0100
        L_0x0094:
            r2 = 1
            if (r0 == 0) goto L_0x00a0
            int r6 = r0.length()
            if (r6 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            goto L_0x00a1
        L_0x00a0:
            r6 = 1
        L_0x00a1:
            if (r6 == 0) goto L_0x00a4
            goto L_0x0100
        L_0x00a4:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03d7 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x03d7 }
            java.lang.String r0 = "expt_info"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x03d7 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r6 = "expt_param_list"
            org.json.JSONArray r0 = r0.optJSONArray(r6)     // Catch:{ JSONException -> 0x03d7 }
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            if (r0 != 0) goto L_0x00bc
            goto L_0x0100
        L_0x00bc:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            lc.z r7 = new lc.z
            r7.<init>(r6)
            com.tencent.p014mm.sdk.json.JSONUtils.forEach(r0, r7)
            org.json.JSONObject[] r0 = new org.json.JSONObject[r8]
            java.lang.Object[] r0 = r6.toArray(r0)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r0, r6)
            r6 = r0
            org.json.JSONObject[] r6 = (org.json.JSONObject[]) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "checkExptGroupForOpConfig wx_wxapp_expt_skyline(size:"
            r0.append(r7)
            int r7 = r6.length
            r0.append(r7)
            java.lang.String r7 = "):"
            r0.append(r7)
            java.lang.String r7 = java.util.Arrays.toString(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            int r0 = r6.length
            if (r0 != 0) goto L_0x00fd
            r0 = 1
            goto L_0x00fe
        L_0x00fd:
            r0 = 0
        L_0x00fe:
            if (r0 == 0) goto L_0x0102
        L_0x0100:
            goto L_0x03ee
        L_0x0102:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            int r10 = r6.length
            r11 = 0
            r12 = 0
        L_0x010f:
            if (r11 >= r10) goto L_0x03d0
            r13 = r6[r11]
            lc.b0$a r0 = f255441j
            r0.getClass()
            r14 = 0
            java.lang.String r0 = "expt_group_id"
            long r14 = r13.optLong(r0, r14)
            java.lang.String r0 = "param_value"
            int r0 = r13.optInt(r0)
            if (r0 == r2) goto L_0x0144
            lc.b0$c r0 = new lc.b0$c
            r17 = 0
            java.lang.String r20 = r13.toString()
            r21 = 0
            r22 = 8
            r23 = 0
            r16 = r0
            r18 = r14
            r16.<init>(r17, r18, r20, r21, r22, r23)
            r24 = r6
            r25 = r10
            goto L_0x03b7
        L_0x0144:
            java.lang.String r2 = "begin_public_version"
            java.lang.String r8 = r13.optString(r2)
            java.lang.String r4 = "end_public_version"
            r24 = r6
            java.lang.String r6 = r13.optString(r4)
            r25 = r10
            java.lang.String r10 = ""
            java.lang.String r0 = "ext_info_json"
            java.lang.String r0 = r13.optString(r0, r10)
            if (r0 == 0) goto L_0x0168
            int r16 = r0.length()
            if (r16 != 0) goto L_0x0165
            goto L_0x0168
        L_0x0165:
            r16 = 0
            goto L_0x016a
        L_0x0168:
            r16 = 1
        L_0x016a:
            if (r16 == 0) goto L_0x016f
            r26 = r10
            goto L_0x018c
        L_0x016f:
            r26 = r10
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0177 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x0177 }
            goto L_0x018d
        L_0x0177:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "checkExptValueForOpConfig, parse wx_wxapp_expt_skyline failed:"
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x018c:
            r10 = 0
        L_0x018d:
            if (r8 == 0) goto L_0x0198
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r0 = 0
            goto L_0x0199
        L_0x0198:
            r0 = 1
        L_0x0199:
            if (r0 != 0) goto L_0x0204
            if (r6 == 0) goto L_0x01a6
            int r0 = r6.length()
            if (r0 != 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r0 = 0
            goto L_0x01a7
        L_0x01a6:
            r0 = 1
        L_0x01a7:
            if (r0 != 0) goto L_0x0204
            gy3.C87412m.m108593f(r8, r2)     // Catch:{ Exception -> 0x01ef }
            gy3.C87412m.m108593f(r6, r4)     // Catch:{ Exception -> 0x01ef }
            lc.b0$f$a r0 = p194lc.C88435b0.C88438f.f255450e     // Catch:{ Exception -> 0x01ef }
            lc.b0$f r1 = r0.mo122838a(r8)     // Catch:{ Exception -> 0x01ef }
            lc.b0$f r2 = r0.mo122838a(r6)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r4 = r5.mo113377i()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r6 = "wxCommLib.versionName()"
            gy3.C87412m.m108593f(r4, r6)     // Catch:{ Exception -> 0x01ef }
            lc.b0$f r0 = r0.mo122838a(r4)     // Catch:{ Exception -> 0x01ef }
            int r1 = r0.compareTo(r1)     // Catch:{ Exception -> 0x01ef }
            if (r1 < 0) goto L_0x01d5
            int r0 = r0.compareTo(r2)     // Catch:{ Exception -> 0x01ef }
            if (r0 > 0) goto L_0x01d5
            r0 = 1
            goto L_0x01d6
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            if (r0 != 0) goto L_0x0204
            lc.b0$c r0 = new lc.b0$c     // Catch:{ Exception -> 0x01ef }
            r17 = 0
            java.lang.String r20 = r13.toString()     // Catch:{ Exception -> 0x01ef }
            r21 = 0
            r22 = 8
            r23 = 0
            r16 = r0
            r18 = r14
            r16.<init>(r17, r18, r20, r21, r22, r23)     // Catch:{ Exception -> 0x01ef }
            goto L_0x03b7
        L_0x01ef:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkExptValueForOpConfig compare lib version get exception:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0204:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x021b }
            java.lang.String r1 = "[]"
            if (r10 == 0) goto L_0x0212
            java.lang.String r2 = "wx_client_expt_param"
            java.lang.String r2 = r10.optString(r2, r1)     // Catch:{ JSONException -> 0x021b }
            goto L_0x0213
        L_0x0212:
            r2 = 0
        L_0x0213:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ JSONException -> 0x021b }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x021b }
            goto L_0x0235
        L_0x021b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkExptValueForOpConfig invalid wx_client_expt_param, "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L_0x0235:
            r1 = r0
            int r0 = r1.length()
            r2 = 2
            java.lang.String r4 = "client_type"
            if (r0 > 0) goto L_0x024b
            lc.b0$d r0 = p194lc.C88435b0.C34218d.f92272f
            lc.b0$d r6 = p194lc.C88435b0.C34218d.f92273g
            lc.b0$e r8 = new lc.b0$e
            r10 = 0
            r8.<init>(r6, r0, r10)
            goto L_0x02dc
        L_0x024b:
            com.tencent.mm.sdk.json.JSONUtils r0 = com.tencent.p014mm.sdk.json.JSONUtils.INSTANCE     // Catch:{ JSONException -> 0x02b5 }
            java.util.Iterator r0 = r0.iterator(r1)     // Catch:{ JSONException -> 0x02b5 }
        L_0x0251:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x02b5 }
            if (r6 == 0) goto L_0x026e
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x02b5 }
            boolean r8 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x02b5 }
            if (r8 == 0) goto L_0x026a
            r8 = r6
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ JSONException -> 0x02b5 }
            int r8 = r8.optInt(r4)     // Catch:{ JSONException -> 0x02b5 }
            if (r8 != r2) goto L_0x026a
            r8 = 1
            goto L_0x026b
        L_0x026a:
            r8 = 0
        L_0x026b:
            if (r8 == 0) goto L_0x0251
            goto L_0x026f
        L_0x026e:
            r6 = 0
        L_0x026f:
            if (r6 == 0) goto L_0x02aa
            r0 = r6
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x02b5 }
            lc.b0$d$a r0 = p194lc.C88435b0.C34218d.f92271e     // Catch:{ JSONException -> 0x02b5 }
            r8 = r6
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ JSONException -> 0x02b5 }
            java.lang.String r10 = "client_begin_version"
            java.lang.String r8 = r8.optString(r10)     // Catch:{ JSONException -> 0x02b5 }
            if (r8 != 0) goto L_0x0283
            r8 = r26
        L_0x0283:
            lc.b0$d r8 = r0.mo59498a(r8)     // Catch:{ JSONException -> 0x02b5 }
            if (r8 != 0) goto L_0x028b
            lc.b0$d r8 = p194lc.C88435b0.C34218d.f92272f     // Catch:{ JSONException -> 0x02b5 }
        L_0x028b:
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x02b5 }
            java.lang.String r10 = "client_end_version"
            java.lang.String r6 = r6.optString(r10)     // Catch:{ JSONException -> 0x02b5 }
            if (r6 != 0) goto L_0x0298
            r10 = r26
            goto L_0x0299
        L_0x0298:
            r10 = r6
        L_0x0299:
            lc.b0$d r0 = r0.mo59498a(r10)     // Catch:{ JSONException -> 0x02b5 }
            if (r0 != 0) goto L_0x02a1
            lc.b0$d r0 = p194lc.C88435b0.C34218d.f92273g     // Catch:{ JSONException -> 0x02b5 }
        L_0x02a1:
            lc.b0$e r6 = new lc.b0$e     // Catch:{ JSONException -> 0x02b5 }
            r10 = 0
            r6.<init>(r0, r8, r10)     // Catch:{ JSONException -> 0x02b5 }
            r8 = r6
            r10 = 0
            goto L_0x02dc
        L_0x02aa:
            lc.b0$d r0 = p194lc.C88435b0.C34218d.f92272f
            lc.b0$d r6 = p194lc.C88435b0.C34218d.f92273g
            lc.b0$e r8 = new lc.b0$e
            r10 = 0
            r8.<init>(r6, r0, r10)
            goto L_0x02dc
        L_0x02b5:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "WxClientVersionRange.parse "
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = " failed with:"
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            lc.b0$d r0 = p194lc.C88435b0.C34218d.f92272f
            lc.b0$d r6 = p194lc.C88435b0.C34218d.f92273g
            lc.b0$e r8 = new lc.b0$e
            r10 = 0
            r8.<init>(r6, r0, r10)
        L_0x02dc:
            lc.b0$d r0 = r8.f255449e
            lc.b0$d r6 = r8.f255448d
            r0.getClass()
            java.lang.String r10 = "other"
            gy3.C87412m.m108594g(r6, r10)
            int r0 = r0.f92275d
            int r6 = r6.f92275d
            int r0 = r0 - r6
            if (r0 > 0) goto L_0x030f
            lc.b0$d r0 = p194lc.C88435b0.C34218d.f92274h
            boolean r0 = my3.C61591g.C61592a.m72288a(r8, r0)
            if (r0 != 0) goto L_0x032f
            lc.b0$c r0 = new lc.b0$c
            r17 = 0
            java.lang.String r20 = r13.toString()
            r21 = 0
            r22 = 8
            r23 = 0
            r16 = r0
            r18 = r14
            r16.<init>(r17, r18, r20, r21, r22, r23)
            goto L_0x03b7
        L_0x030f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "checkExptValueForOpConfig invalid client version scope, begin:"
            r0.append(r6)
            lc.b0$d r6 = r8.f255449e
            r0.append(r6)
            java.lang.String r6 = ", end:"
            r0.append(r6)
            lc.b0$d r6 = r8.f255448d
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x032f:
            com.tencent.mm.sdk.json.JSONUtils r0 = com.tencent.p014mm.sdk.json.JSONUtils.INSTANCE
            java.util.Iterator r0 = r0.iterator(r1)
        L_0x0335:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0352
            java.lang.Object r10 = r0.next()
            boolean r6 = r10 instanceof org.json.JSONObject
            if (r6 == 0) goto L_0x034e
            r6 = r10
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            int r6 = r6.optInt(r4)
            if (r6 != r2) goto L_0x034e
            r6 = 1
            goto L_0x034f
        L_0x034e:
            r6 = 0
        L_0x034f:
            if (r6 == 0) goto L_0x0335
            goto L_0x0353
        L_0x0352:
            r10 = 0
        L_0x0353:
            java.lang.String r0 = "path_list"
            if (r10 == 0) goto L_0x035b
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            goto L_0x0385
        L_0x035b:
            com.tencent.mm.sdk.json.JSONUtils r2 = com.tencent.p014mm.sdk.json.JSONUtils.INSTANCE
            java.util.Iterator r1 = r2.iterator(r1)
        L_0x0361:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r10 = r1.next()
            boolean r2 = r10 instanceof org.json.JSONObject
            if (r2 == 0) goto L_0x037a
            r2 = r10
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            boolean r2 = r2.has(r0)
            if (r2 == 0) goto L_0x037a
            r2 = 1
            goto L_0x037b
        L_0x037a:
            r2 = 0
        L_0x037b:
            if (r2 == 0) goto L_0x0361
            goto L_0x037f
        L_0x037e:
            r10 = 0
        L_0x037f:
            if (r10 == 0) goto L_0x0384
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            goto L_0x0385
        L_0x0384:
            r10 = 0
        L_0x0385:
            if (r10 == 0) goto L_0x038c
            org.json.JSONArray r10 = r10.optJSONArray(r0)
            goto L_0x038d
        L_0x038c:
            r10 = 0
        L_0x038d:
            if (r10 == 0) goto L_0x03a4
            int r0 = r10.length()
            if (r0 > 0) goto L_0x0396
            goto L_0x03a4
        L_0x0396:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            lc.a0 r1 = new lc.a0
            r1.<init>(r0)
            com.tencent.p014mm.sdk.json.JSONUtils.forEach(r10, r1)
            goto L_0x03a6
        L_0x03a4:
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x03a6:
            r21 = r0
            lc.b0$c r0 = new lc.b0$c
            r17 = 1
            java.lang.String r20 = r13.toString()
            r16 = r0
            r18 = r14
            r16.<init>(r17, r18, r20, r21)
        L_0x03b7:
            boolean r1 = r0.f92267a
            if (r1 == 0) goto L_0x03c1
            java.util.List<java.lang.String> r1 = r0.f92270d
            r7.addAll(r1)
            r12 = 1
        L_0x03c1:
            r9.add(r0)
            int r11 = r11 + 1
            r6 = r24
            r10 = r25
            r2 = 1
            r8 = 0
            r1 = r27
            goto L_0x010f
        L_0x03d0:
            lc.b0$b r0 = new lc.b0$b
            r0.<init>(r12, r7, r9)
            r4 = r0
            goto L_0x03ef
        L_0x03d7:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkExptGroupForOpConfig get exception:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x0100
        L_0x03ee:
            r4 = 0
        L_0x03ef:
            r1 = r27
            r1.f255444f = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "enabledByAppCode:"
            r0.append(r2)
            boolean r2 = r1.f255443e
            r0.append(r2)
            java.lang.String r2 = " enabledByClientCapability:"
            r0.append(r2)
            boolean r2 = r1.f255445g
            r0.append(r2)
            java.lang.String r2 = " enabledByWxCommLib:"
            r0.append(r2)
            boolean r2 = r1.f255446h
            r0.append(r2)
            java.lang.String r2 = " switchRenderMode:"
            r0.append(r2)
            int r2 = r1.f255447i
            r0.append(r2)
            java.lang.String r2 = " isExptEnabled:"
            r0.append(r2)
            if (r4 == 0) goto L_0x042a
            boolean r2 = r4.f92264a
            goto L_0x042c
        L_0x042a:
            boolean r2 = r1.f255442d
        L_0x042c:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p194lc.C88435b0.<init>(fc.g, com.tencent.mm.plugin.appbrand.config.a, boolean):void");
    }

    /* renamed from: b */
    public static final void m110289b() {
        f255441j.getClass();
        String[] strArr = {"2.24.7-skyline", "2.24.7", "2.23.7"};
        C13604l[] lVarArr = {new C13604l("2.24.7", "999.999.999"), new C13604l("2.23.7", "2.24.6"), new C13604l("2.23.7", "999.999.999")};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            for (int i2 = 0; i2 < 3; i2++) {
                C13604l lVar = lVarArr[i2];
                String str2 = (String) lVar.f38555d;
                String str3 = (String) lVar.f38556e;
                C87412m.m108594g(str2, IXWebBroadcastListener.STAGE_START);
                C87412m.m108594g(str3, "end");
                C88438f.C88439a aVar = C88438f.f255450e;
                C88438f a = aVar.mo122838a(str2);
                C88438f a2 = aVar.mo122838a(str3);
                C88438f a3 = aVar.mo122838a(str);
                boolean z = a3.compareTo(a) >= 0 && a3.compareTo(a2) <= 0;
                Log.m105924i("Luggage.WxaRuntimeSkylineConfig", "testCompareAlgo version(" + str + ") in range[" + ((String) lVar.f38555d) + ", " + ((String) lVar.f38556e) + "] == " + z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if ((r0 != null ? r0.f92264a : r3.f255442d) != false) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo122836a() {
        /*
            r3 = this;
            boolean r0 = r3.f255443e
            r1 = 1
            if (r0 == 0) goto L_0x0020
            int r0 = r3.f255447i
            r2 = 2
            if (r0 == r2) goto L_0x0017
            if (r0 == r1) goto L_0x0020
            lc.b0$b r0 = r3.f255444f
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.f92264a
            goto L_0x0015
        L_0x0013:
            boolean r0 = r3.f255442d
        L_0x0015:
            if (r0 == 0) goto L_0x0020
        L_0x0017:
            boolean r0 = r3.f255445g
            if (r0 == 0) goto L_0x0020
            boolean r0 = r3.f255446h
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p194lc.C88435b0.mo122836a():boolean");
    }

    /* renamed from: lc.b0$c */
    public static final class C34217c {

        /* renamed from: a */
        public final boolean f92267a;

        /* renamed from: b */
        public final long f92268b;

        /* renamed from: c */
        public final String f92269c;

        /* renamed from: d */
        public final List<String> f92270d;

        public C34217c(boolean z, long j, String str, List<String> list) {
            C87412m.m108594g(list, "pathWhiteList");
            this.f92267a = z;
            this.f92268b = j;
            this.f92269c = str;
            this.f92270d = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34217c)) {
                return false;
            }
            C34217c cVar = (C34217c) obj;
            return this.f92267a == cVar.f92267a && this.f92268b == cVar.f92268b && C87412m.m108589b(this.f92269c, cVar.f92269c) && C87412m.m108589b(this.f92270d, cVar.f92270d);
        }

        public int hashCode() {
            boolean z = this.f92267a;
            if (z) {
                z = true;
            }
            long j = this.f92268b;
            int i = (((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31;
            String str = this.f92269c;
            return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f92270d.hashCode();
        }

        public String toString() {
            return "SkylineExptParam(isEnabled=" + this.f92267a + ", exptGroupId=" + this.f92268b + ", exptParam=" + this.f92269c + ", pathWhiteList=" + this.f92270d + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C34217c(boolean z, long j, String str, List list, int i, C8480h hVar) {
            this(z, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? null : str, (i & 8) != 0 ? C64186f0.f181907d : list);
        }
    }
}
