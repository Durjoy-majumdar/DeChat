package o13;

import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import m13.C88689b;
import org.json.JSONArray;
import qe3.C89625d;
import rx3.C13598b0;
import sx3.C64197v;
import te3.rg4;
import z04.C112550d0;

/* renamed from: o13.g */
public final class C11342g extends IStaticListener<ConfigUpdatedEvent> {

    /* renamed from: d */
    public static final C11342g f33303d = new C11342g();

    /* renamed from: e */
    public static String f33304e = "";

    /* renamed from: f */
    public static String f33305f = "";

    /* renamed from: g */
    public static String f33306g = "";

    /* renamed from: h */
    public static JSONArray f33307h = new JSONArray();

    /* renamed from: i */
    public static JSONArray f33308i = new JSONArray();

    /* renamed from: j */
    public static List<? extends JSONArray> f33309j = C64197v.m75537f(f33307h, f33308i, new JSONArray());

    /* renamed from: n */
    public static rg4 f33310n = new rg4();

    /* renamed from: o */
    public static final List<WeakReference<C32226l<rg4, C13598b0>>> f33311o;

    /* renamed from: p */
    public static final C32226l<rg4, C13598b0> f33312p;

    /* renamed from: o13.g$a */
    public static final class C11343a extends C87413o implements C32226l<rg4, C13598b0> {

        /* renamed from: d */
        public static final C11343a f33313d = new C11343a();

        public C11343a() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x016b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r19
                te3.rg4 r0 = (te3.rg4) r0
                java.lang.String r1 = "it"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.String r1 = "MicroMsg.XUpdate.XUpdateManager"
                java.lang.String r2 = "defaultNotifier"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                int r1 = r0.f259811v
                r2 = 1
                r3 = 0
                r5 = 0
                java.lang.String r6 = "MicroMsg.XUpdate.XUpdateHelper"
                java.lang.String r7 = ""
                if (r1 != r2) goto L_0x00e1
                o13.e r1 = o13.C11329e.f33285a
                r1.getClass()
                o13.g r8 = o13.C11342g.f33303d
                te3.rg4 r9 = r8.mo11368q()
                java.lang.String r10 = r9.f259799g
                if (r10 != 0) goto L_0x002c
                r10 = r7
            L_0x002c:
                boolean r11 = r1.mo11359h()
                java.lang.String r12 = "MMKV_NAME_XUPDATE_LAST_SHOW_RED_DOT_TIME"
                java.lang.String r13 = "MMKV_NAME_XUPDATE_HAS_SHOW_RED_DOT_TIMES"
                if (r11 != 0) goto L_0x003d
                java.lang.String r9 = "canNotifyXUpdateRedDot() !hasUpdateVersion"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                r11 = r6
                goto L_0x00a1
            L_0x003d:
                int r11 = r9.f259813x
                if (r11 <= 0) goto L_0x0083
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
                int r11 = r11.getInt(r10, r5)
                int r14 = r9.f259813x
                if (r11 <= r14) goto L_0x004e
                goto L_0x0083
            L_0x004e:
                long r14 = java.lang.System.currentTimeMillis()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
                long r16 = r11.getLong(r10, r3)
                long r14 = r14 - r16
                int r9 = r9.f259814y
                r11 = r6
                long r5 = (long) r9
                int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r9 >= 0) goto L_0x0081
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "canNotifyXUpdateRedDot() too fast: "
                r5.append(r6)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
                long r9 = r6.getLong(r10, r3)
                r5.append(r9)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r5)
                goto L_0x00a1
            L_0x0081:
                r5 = 1
                goto L_0x00a2
            L_0x0083:
                r11 = r6
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "canNotifyXUpdateRedDot() max time:"
                r5.append(r6)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
                r9 = 0
                int r6 = r6.getInt(r10, r9)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r5)
            L_0x00a1:
                r5 = 0
            L_0x00a2:
                if (r5 == 0) goto L_0x00e2
                java.lang.Class<m13.b> r5 = m13.C88689b.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                m13.b r5 = (m13.C88689b) r5
                java.lang.String r6 = r0.f259799g
                boolean r5 = r5.mo122760nl(r6)
                if (r5 == 0) goto L_0x00e2
                te3.rg4 r5 = r8.mo11368q()
                java.lang.String r5 = r5.f259799g
                if (r5 != 0) goto L_0x00bd
                r5 = r7
            L_0x00bd:
                boolean r1 = r1.mo11359h()
                if (r1 != 0) goto L_0x00c4
                goto L_0x00e2
            L_0x00c4:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
                long r8 = java.lang.System.currentTimeMillis()
                r1.putLong(r5, r8)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
                r6 = 0
                int r1 = r1.getInt(r5, r6)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
                int r1 = r1 + r2
                r6.putInt(r5, r1)
                goto L_0x00e2
            L_0x00e1:
                r11 = r6
            L_0x00e2:
                int r0 = r0.f259812w
                if (r0 != r2) goto L_0x01a4
                o13.e r0 = o13.C11329e.f33285a
                r0.getClass()
                o13.g r1 = o13.C11342g.f33303d
                te3.rg4 r5 = r1.mo11368q()
                java.lang.String r6 = r5.f259799g
                if (r6 != 0) goto L_0x00f6
                r6 = r7
            L_0x00f6:
                boolean r8 = r0.mo11359h()
                java.lang.String r9 = "MMKV_NAME_XUPDATE_LAST_SHOW_DIALOG_TIME"
                java.lang.String r10 = "MMKV_NAME_XUPDATE_HAS_SHOW_DIALOG_TIMES"
                if (r8 != 0) goto L_0x0106
                java.lang.String r3 = "canNotifyXUpdateDialog() !hasUpdateVersion"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
                goto L_0x0168
            L_0x0106:
                int r8 = r5.f259813x
                if (r8 <= 0) goto L_0x014b
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
                r12 = 0
                int r8 = r8.getInt(r6, r12)
                int r12 = r5.f259813x
                if (r8 < r12) goto L_0x0118
                goto L_0x014b
            L_0x0118:
                long r12 = java.lang.System.currentTimeMillis()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
                long r14 = r8.getLong(r6, r3)
                long r12 = r12 - r14
                int r5 = r5.f259814y
                long r14 = (long) r5
                int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r5 >= 0) goto L_0x0149
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "canNotifyXUpdateDialog() too fast: "
                r5.append(r8)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
                long r3 = r8.getLong(r6, r3)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
                goto L_0x0168
            L_0x0149:
                r3 = 1
                goto L_0x0169
            L_0x014b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "canNotifyXUpdateDialog() max time:"
                r3.append(r4)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
                r5 = 0
                int r4 = r4.getInt(r6, r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            L_0x0168:
                r3 = 0
            L_0x0169:
                if (r3 == 0) goto L_0x01a4
                te3.rg4 r1 = r1.mo11368q()
                java.lang.String r1 = r1.f259799g
                if (r1 != 0) goto L_0x0174
                goto L_0x0175
            L_0x0174:
                r7 = r1
            L_0x0175:
                boolean r1 = r0.mo11359h()
                if (r1 != 0) goto L_0x017c
                goto L_0x0198
            L_0x017c:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
                long r3 = java.lang.System.currentTimeMillis()
                r1.putLong(r7, r3)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
                r3 = 0
                int r1 = r1.getInt(r7, r3)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r10)
                int r1 = r1 + r2
                r3.putInt(r7, r1)
            L_0x0198:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r2 = "getContext()"
                gy3.C87412m.m108593f(r1, r2)
                r0.mo11361j(r1)
            L_0x01a4:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o13.C11342g.C11343a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f33311o = arrayList;
        C11343a aVar = C11343a.f33313d;
        f33312p = aVar;
        Log.m105924i("MicroMsg.XUpdate.XUpdateManager", "init!");
        C87412m.m108594g(aVar, "observer");
        arrayList.add(new WeakReference(aVar));
    }

    /* renamed from: B */
    public final void mo11364B(String str) {
        Class cls = C88689b.class;
        C87412m.m108594g(str, "md5");
        Log.m105920e("MicroMsg.XUpdate.XUpdateManager", "ignoreVersion: " + str);
        MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_IGNORE_NEWAPKMD5").putString(str, str);
        ((C88689b) C86312j.m106911c(cls)).Z80();
        ((C88689b) C86312j.m106911c(cls)).ws0();
    }

    /* renamed from: D */
    public final boolean mo11365D(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_IGNORE_NEWAPKMD5").containsKey(str);
    }

    /* renamed from: O */
    public final void mo11366O(boolean z, String str) {
        Log.m105924i("MicroMsg.XUpdate.XUpdateManager", "setNeedNotifyFlag:" + z + " from " + str);
        MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_COMM_KV").putBoolean("MMKV_KEY_NeedNotifyFlag", z);
    }

    public boolean callback(IEvent iEvent) {
        ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
        C87412m.m108594g(configUpdatedEvent, "event");
        ConfigUpdatedEvent.C1000a aVar = configUpdatedEvent.f9044d;
        if (aVar != null && !C89625d.f257843i && !Util.isNullOrNil(aVar.f9045a)) {
            String str = configUpdatedEvent.f9044d.f9045a;
            C87412m.m108593f(str, "event.data.configName");
            if (!C112550d0.m153801u(str, "clicfg_full_pkg_update_url_params", false)) {
                Log.m105924i("MicroMsg.XUpdate.XUpdateManager", "ConfigUpdatedEvent");
                mo11366O(true, "X Config Callback");
                mo11367d();
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if ((r1.length() == 0) == false) goto L_0x0034;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11367d() {
        /*
            r4 = this;
            java.lang.Class<m13.b> r0 = m13.C88689b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            m13.b r0 = (m13.C88689b) r0
            java.lang.String r1 = r0.mo122733EN()
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = ""
        L_0x0010:
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x003c
            o13.g r1 = f33303d
            te3.rg4 r1 = r1.mo11368q()
            java.lang.String r1 = r1.f259799g
            if (r1 == 0) goto L_0x0033
            int r1 = r1.length()
            if (r1 != 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x003c
            r0.Z80()
            r0.ws0()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.C11342g.mo11367d():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c9  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.rg4 mo11368q() {
        /*
            r14 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_full_pkg_update_url_params
            java.lang.String r3 = "[]"
            java.lang.String r1 = r1.Y60(r2, r3)
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_full_pkg_update_url_params_2
            java.lang.String r2 = r2.Y60(r4, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_full_pkg_update_url_params_3
            java.lang.String r0 = r0.Y60(r4, r3)
            java.lang.String r3 = "xupdate_repairer"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r5 = "REPAIRER_KEY_MOCK_DialogEnable"
            r6 = 0
            boolean r4 = r4.getBoolean(r5, r6)
            java.lang.String r7 = "REPAIRER_KEY_MOCK_Json"
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x0046
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r4 = r4.getString(r7, r8)
            if (r4 != 0) goto L_0x0047
        L_0x0046:
            r4 = r8
        L_0x0047:
            int r4 = r4.length()
            r9 = 1
            if (r4 <= 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0068
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            boolean r1 = r1.getBoolean(r5, r6)
            if (r1 == 0) goto L_0x0067
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r1 = r1.getString(r7, r8)
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r1 = r8
        L_0x0068:
            java.lang.String r4 = f33304e
            boolean r4 = gy3.C87412m.m108589b(r1, r4)
            java.lang.String r7 = "MicroMsg.XUpdate.XUpdateManager"
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = f33305f
            boolean r4 = gy3.C87412m.m108589b(r2, r4)
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = f33306g
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 == 0) goto L_0x0083
            goto L_0x00ca
        L_0x0083:
            java.lang.String r0 = "xParamsJson"
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ JSONException -> 0x00c4 }
            f33304e = r1     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r0 = "xParamsJson2"
            gy3.C87412m.m108593f(r2, r0)     // Catch:{ JSONException -> 0x00c4 }
            f33305f = r2     // Catch:{ JSONException -> 0x00c4 }
            f33306g = r2     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = f33304e     // Catch:{ JSONException -> 0x00c4 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00c4 }
            f33307h = r0     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = f33305f     // Catch:{ JSONException -> 0x00c4 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00c4 }
            f33308i = r0     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00c4 }
            java.lang.String r1 = f33306g     // Catch:{ JSONException -> 0x00c4 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00c4 }
            r1 = 3
            org.json.JSONArray[] r1 = new org.json.JSONArray[r1]     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONArray r2 = f33307h     // Catch:{ JSONException -> 0x00c4 }
            r1[r6] = r2     // Catch:{ JSONException -> 0x00c4 }
            org.json.JSONArray r2 = f33308i     // Catch:{ JSONException -> 0x00c4 }
            r1[r9] = r2     // Catch:{ JSONException -> 0x00c4 }
            r2 = 2
            r1[r2] = r0     // Catch:{ JSONException -> 0x00c4 }
            java.util.List r0 = sx3.C64197v.m75537f(r1)     // Catch:{ JSONException -> 0x00c4 }
            f33309j = r0     // Catch:{ JSONException -> 0x00c4 }
            r0 = 1
            goto L_0x00cb
        L_0x00c4:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r1)
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            if (r0 != 0) goto L_0x00d1
            te3.rg4 r0 = f33310n
            goto L_0x01b4
        L_0x00d1:
            java.util.List<? extends org.json.JSONArray> r0 = f33309j
            java.util.Iterator r0 = r0.iterator()
        L_0x00d7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0192
            java.lang.Object r1 = r0.next()
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x014c }
            int r2 = r1.length()     // Catch:{ all -> 0x014c }
            r4 = 0
        L_0x00ea:
            if (r4 >= r2) goto L_0x0145
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            r8.<init>()     // Catch:{ all -> 0x014c }
            java.lang.String r10 = "try parse json: "
            r8.append(r10)     // Catch:{ all -> 0x014c }
            org.json.JSONObject r10 = r1.getJSONObject(r4)     // Catch:{ all -> 0x014c }
            r8.append(r10)     // Catch:{ all -> 0x014c }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x014c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x014c }
            te3.rg4 r8 = new te3.rg4     // Catch:{ all -> 0x014c }
            r8.<init>()     // Catch:{ all -> 0x014c }
            org.json.JSONObject r10 = r1.getJSONObject(r4)     // Catch:{ all -> 0x014c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x014c }
            r8.toPb(r10)     // Catch:{ all -> 0x014c }
            o13.g r10 = f33303d     // Catch:{ all -> 0x014c }
            r10.getClass()     // Catch:{ all -> 0x014c }
            java.lang.String r10 = r8.f259800h     // Catch:{ all -> 0x014c }
            r11 = 5
            if (r10 == 0) goto L_0x0129
            my3.j r12 = new my3.j     // Catch:{ all -> 0x014c }
            r12.<init>(r6, r11)     // Catch:{ all -> 0x014c }
            java.lang.String r10 = z04.C112550d0.m153790Z(r10, r12)     // Catch:{ all -> 0x014c }
            goto L_0x012a
        L_0x0129:
            r10 = 0
        L_0x012a:
            o13.e r12 = o13.C11329e.f33285a     // Catch:{ all -> 0x014c }
            java.lang.String r12 = r12.mo11354c()     // Catch:{ all -> 0x014c }
            my3.j r13 = new my3.j     // Catch:{ all -> 0x014c }
            r13.<init>(r6, r11)     // Catch:{ all -> 0x014c }
            java.lang.String r11 = z04.C112550d0.m153790Z(r12, r13)     // Catch:{ all -> 0x014c }
            boolean r10 = gy3.C87412m.m108589b(r10, r11)     // Catch:{ all -> 0x014c }
            if (r10 == 0) goto L_0x0142
            f33310n = r8     // Catch:{ all -> 0x014c }
            goto L_0x00d7
        L_0x0142:
            int r4 = r4 + 1
            goto L_0x00ea
        L_0x0145:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x014c }
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)     // Catch:{ all -> 0x014c }
            goto L_0x0157
        L_0x014c:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)
        L_0x0157:
            java.lang.Throwable r2 = kotlin.Result.m168117exceptionOrNullimpl(r1)
            if (r2 == 0) goto L_0x0164
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r8 = "parse DialogInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r2, r8, r4)
        L_0x0164:
            boolean r2 = kotlin.Result.m168121isSuccessimpl(r1)
            if (r2 == 0) goto L_0x00d7
            rx3.b0 r1 = (rx3.C13598b0) r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse DialogInfo success: old-"
            r1.append(r2)
            te3.rg4 r2 = f33310n
            java.lang.String r2 = r2.f259800h
            r1.append(r2)
            java.lang.String r2 = " new-"
            r1.append(r2)
            te3.rg4 r2 = f33310n
            java.lang.String r2 = r2.f259799g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x00d7
        L_0x0192:
            te3.rg4 r0 = f33310n
            int r1 = r0.f259813x
            if (r1 > 0) goto L_0x019a
            r0.f259813x = r9
        L_0x019a:
            int r1 = r0.f259814y
            if (r1 > 0) goto L_0x01a3
            r1 = 86400000(0x5265c00, float:7.82218E-36)
            r0.f259813x = r1
        L_0x01a3:
            java.lang.String r0 = r0.f259799g
            boolean r0 = r14.mo11365D(r0)
            if (r0 == 0) goto L_0x01b2
            te3.rg4 r0 = new te3.rg4
            r0.<init>()
            f33310n = r0
        L_0x01b2:
            te3.rg4 r0 = f33310n
        L_0x01b4:
            o13.g r1 = f33303d
            r1.getClass()
            java.lang.String r1 = "dialog"
            gy3.C87412m.m108594g(r0, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            boolean r1 = r1.getBoolean(r5, r6)
            if (r1 != 0) goto L_0x01c9
            goto L_0x01f9
        L_0x01c9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r2 = "REPAIRER_KEY_MOCK_IsShowRedot"
            int r1 = r1.getInt(r2, r6)
            r0.f259811v = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r2 = "REPAIRER_KEY_MOCK_IsShowDialog"
            int r1 = r1.getInt(r2, r6)
            r0.f259812w = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r2 = "REPAIRER_KEY_MOCK_ShowDialogMaxTimes"
            int r1 = r1.getInt(r2, r6)
            r0.f259813x = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r2 = "REPAIRER_KEY_MOCK_ShowDialogIntervalTime"
            int r1 = r1.getInt(r2, r6)
            r0.f259814y = r1
        L_0x01f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.C11342g.mo11368q():te3.rg4");
    }
}
