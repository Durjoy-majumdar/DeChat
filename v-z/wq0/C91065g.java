package wq0;

import android.text.TextUtils;
import b34.C79664a;
import b34.C79665b;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82374e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86918c;
import fl0.C86920e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import li0.C88508b;
import org.json.JSONObject;
import p225rc.C48016e;
import p963fc.C86812g;
import sl0.C90220f;
import u24.C90599h;
import ul0.C90695c;
import ul0.C90696d;
import vl0.C90828b;
import vl0.C90829c;
import xq0.C91323a;

/* renamed from: wq0.g */
public class C91065g {

    /* renamed from: m */
    public static final Map<String, Integer> f261238m = new ConcurrentHashMap();

    /* renamed from: n */
    public static final Map<Class<? extends C82374e>, String> f261239n = new ConcurrentHashMap();

    /* renamed from: o */
    public static final String[] f261240o = {C90220f.NAME, "createDownloadTask", C90695c.NAME, C90828b.NAME, C90829c.NAME, C90696d.NAME, C90829c.NAME};

    /* renamed from: a */
    public final AppBrandRuntime f261241a;

    /* renamed from: b */
    public final int f261242b;

    /* renamed from: c */
    public final boolean f261243c;

    /* renamed from: d */
    public final LinkedList<C91067b> f261244d = new LinkedList<>();

    /* renamed from: e */
    public final Object f261245e;

    /* renamed from: f */
    public AppRuntimeApiPermissionBundle f261246f;

    /* renamed from: g */
    public final byte[] f261247g;

    /* renamed from: h */
    public HashMap<String, AppRuntimeApiPermissionBundle> f261248h;

    /* renamed from: i */
    public final Object f261249i;

    /* renamed from: j */
    public HashMap<String, AppRuntimeAppidABTestPermissionBundle> f261250j = new HashMap<>();

    /* renamed from: k */
    public final List<C91068c> f261251k = new ArrayList();

    /* renamed from: l */
    public final boolean f261252l;

    /* renamed from: wq0.g$a */
    public static final class C91066a {

        /* renamed from: d */
        public static final C91066a f261253d = new C91066a(-1, "fail:auth canceled", C86920e.f252320j);

        /* renamed from: e */
        public static final C91066a f261254e = new C91066a(-1, "fail:auth denied", C86920e.f252319i);

        /* renamed from: f */
        public static final C91066a f261255f;

        /* renamed from: g */
        public static final C91066a f261256g = new C91066a(-1, "fail:access denied", C86920e.f252318h);

        /* renamed from: h */
        public static final C91066a f261257h = new C91066a(0, "", C86920e.f252311a);

        /* renamed from: a */
        public final int f261258a;

        /* renamed from: b */
        public final String f261259b;

        /* renamed from: c */
        public final C86918c f261260c;

        static {
            C86918c cVar = new C86918c(-1, "");
            f261255f = new C91066a(-2, "", cVar);
        }

        public C91066a(int i, String str, C86918c cVar) {
            this.f261258a = i;
            this.f261259b = str;
            this.f261260c = cVar;
        }
    }

    /* renamed from: wq0.g$b */
    public interface C91067b {
        /* renamed from: a */
        void mo114223a(C91066a aVar);
    }

    /* renamed from: wq0.g$c */
    public interface C91068c {
        /* renamed from: a */
        void mo121545a(byte[] bArr, byte[] bArr2, byte[] bArr3);

        /* renamed from: b */
        void mo121546b(HashMap<String, AppRuntimeApiPermissionBundle> hashMap);
    }

    public C91065g(C86812g gVar, int i, boolean z) {
        this.f261241a = gVar;
        this.f261245e = new byte[0];
        this.f261247g = new byte[0];
        this.f261249i = new byte[0];
        this.f261242b = i;
        this.f261243c = z;
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = (AppRuntimeApiPermissionBundle) gVar.mo113021O(AppRuntimeApiPermissionBundle.class, false);
        if (appRuntimeApiPermissionBundle == null) {
            Log.m105920e("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> get NULL permission from runtime");
        }
        mo125135j(appRuntimeApiPermissionBundle);
        C91069h hVar = (C91069h) gVar.mo113021O(C91069h.class, false);
        HashMap<String, AppRuntimeApiPermissionBundle> hashMap = hVar == null ? null : hVar.f261261d;
        this.f261248h = hashMap;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
        Log.m105925i("MicroMsg.AppRuntimeApiPermissionController[permission]", "<init> mPluginPermission size:%d", objArr);
        HashMap<String, AppRuntimeApiPermissionBundle> hashMap2 = this.f261248h;
        if (hashMap2 == null || hashMap2.size() <= 0) {
            this.f261252l = false;
        } else {
            ICommLibReader iCommLibReader = (ICommLibReader) gVar.mo113027R0(ICommLibReader.class);
            Objects.requireNonNull(iCommLibReader);
            this.f261252l = Boolean.parseBoolean(iCommLibReader.Yk0("supportInvokeWithAppId"));
        }
        C91323a aVar = (C91323a) gVar.mo113021O(C91323a.class, false);
        if (aVar != null) {
            HashMap<String, AppRuntimeAppidABTestPermissionBundle> hashMap3 = aVar.f261944d;
            this.f261250j = hashMap3;
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            Log.m105925i("MicroMsg.AppRuntimeApiPermissionController[permission]", "mAppidPermission size:%d", objArr2);
        }
    }

    /* renamed from: d */
    public static String m114237d(Object obj) {
        if (obj instanceof C82374e) {
            return ((C82374e) obj).mo114779e();
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (C82374e.class.isAssignableFrom(cls)) {
                Map<Class<? extends C82374e>, String> map = f261239n;
                String str = (String) ((ConcurrentHashMap) map).get(cls);
                if (!Util.isNullOrNil(str)) {
                    return str;
                }
                try {
                    String str2 = (String) C79664a.m96760h(cls).mo109794f("NAME");
                    ((ConcurrentHashMap) map).put(cls, str2);
                    return str2;
                } catch (C79665b e) {
                    if (BuildInfo.DEBUG) {
                        Assert.fail("Must declare NAME in JsApi Class: " + cls.getName());
                    } else {
                        Log.m105921e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getApiNameByClass class:%s, reflect failed %s", cls.getName(), e);
                    }
                    return cls.getSimpleName();
                }
            }
        }
        if (!BuildInfo.DEBUG) {
            Log.m105920e("MicroMsg.AppRuntimeApiPermissionController[permission]", "Unrecognized api type:" + obj.getClass().getName());
            return obj.toString();
        }
        throw new IllegalArgumentException("Unrecognized api type:" + obj.getClass().getName());
    }

    /* renamed from: f */
    public static int m114238f(Object obj) {
        String d = m114237d(obj);
        if (TextUtils.isEmpty(d)) {
            Log.m105921e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex invalid apiNAme, api:%s", obj.toString());
            return 6;
        }
        Map<String, Integer> map = f261238m;
        Integer num = (Integer) ((ConcurrentHashMap) map).get(d);
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        try {
            i = obj instanceof Class ? ((Integer) C79664a.m96760h((Class) obj).mo109794f("CTRL_INDEX")).intValue() : ((Integer) C79664a.m96761i(obj).mo109794f("CTRL_INDEX")).intValue();
            ((ConcurrentHashMap) map).put(d, Integer.valueOf(i));
        } catch (C79665b e) {
            String name = obj instanceof Class ? ((Class) obj).getName() : obj.toString();
            if (BuildInfo.DEBUG) {
                Assert.fail("Must declare CTRL_INDEX in JsApi Class: " + name);
            } else {
                Log.m105921e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlIndex class:%s, reflect failed %s", name, e);
            }
        }
        return i;
    }

    /* renamed from: a */
    public boolean mo125128a(C82381f fVar, Class<? extends C82374e> cls) {
        int c = mo125130c(fVar, cls, (String) null, (String) null, m114238f(cls), false);
        if (c == 1) {
            return true;
        }
        if (c != 6) {
            return c != 7 ? c == 8 : this.f261241a.f238113K.mo122979b();
        }
        String d = m114237d(cls);
        C91077n nVar = (C91077n) fVar.mo109668l(C91077n.class);
        if (nVar != null) {
            nVar.i60(d);
        }
        return false;
    }

    /* renamed from: b */
    public int mo125129b(byte[] bArr, int i) {
        int i2 = this.f261242b;
        if (i2 == -1) {
            return 1;
        }
        if (i2 == -2) {
            return 0;
        }
        if (i == -2) {
            return 1;
        }
        if (i == -1) {
            return this.f261243c ? 1 : 0;
        }
        if (i >= bArr.length || i < 0) {
            return 0;
        }
        return bArr[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011c, code lost:
        r11 = r18.getAppId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo125130c(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r18, java.lang.Object r19, java.lang.String r20, java.lang.String r21, int r22, boolean r23) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            int r0 = r1.f261242b
            java.lang.String r5 = r18.getAppId()
            java.lang.String r6 = "MicroMsg.AppRuntimeApiPermissionController[permission]"
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = -1
            if (r0 != r10) goto L_0x0026
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r0[r8] = r2
            java.lang.String r2 = "getCtrlByte, appId = %s, ctrlIndex = %d, hard code perm on"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r0)
            return r8
        L_0x0026:
            r10 = -2
            if (r0 != r10) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r0[r8] = r2
            java.lang.String r2 = "getCtrlByte, appId = %s, ctrlIndex = %d, hard code perm off"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r0)
            return r9
        L_0x0039:
            boolean r0 = r3 instanceof fm0.C86973q0
            if (r0 != 0) goto L_0x004f
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x004d
            r0 = r3
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<fm0.q0> r10 = fm0.C86973q0.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r0 = 0
            goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            boolean r0 = r2 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r0 == 0) goto L_0x0057
            return r8
        L_0x0057:
            java.lang.String r10 = m114237d(r19)
            java.util.Set<java.lang.String> r0 = wq0.C91062d.f261236a
            java.lang.String r0 = "permissionBytes"
            java.lang.String r11 = "MicroMsg.AppRuntimeApiPermissionController"
            boolean r12 = r2 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r12 == 0) goto L_0x0068
            r12 = 1
            goto L_0x0070
        L_0x0068:
            java.util.Set<java.lang.String> r12 = wq0.C91062d.f261236a
            java.util.HashSet r12 = (java.util.HashSet) r12
            boolean r12 = r12.contains(r10)
        L_0x0070:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 3
            if (r12 != 0) goto L_0x0079
        L_0x0075:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00f9
        L_0x0079:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r12 == 0) goto L_0x0080
            goto L_0x0075
        L_0x0080:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e9 }
            r15 = r20
            r12.<init>(r15)     // Catch:{ Exception -> 0x00e9 }
            boolean r15 = r12.has(r0)     // Catch:{ Exception -> 0x00e9 }
            if (r15 != 0) goto L_0x008e
            goto L_0x0075
        L_0x008e:
            org.json.JSONArray r0 = r12.getJSONArray(r0)     // Catch:{ Exception -> 0x00e9 }
            int r12 = r0.length()
            if (r12 >= r14) goto L_0x00ab
            java.lang.Object[] r12 = new java.lang.Object[r8]
            int r0 = r0.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r9] = r0
            java.lang.String r0 = "permissionBytes length:%d invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r0, r12)
            goto L_0x0075
        L_0x00ab:
            boolean r12 = r2 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r12 == 0) goto L_0x00d5
            r12 = r2
            com.tencent.mm.plugin.appbrand.i2 r12 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r12
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r12 = r12.getRuntime()
            li0.c r12 = r12.f238113K
            li0.b r12 = r12.mo122980c()
            int r12 = r12.ordinal()
            if (r12 == r8) goto L_0x00d0
            if (r12 == r7) goto L_0x00cb
            if (r12 == r14) goto L_0x00d0
            int r0 = r0.optInt(r9, r13)
            goto L_0x00d9
        L_0x00cb:
            int r0 = r0.optInt(r7, r13)
            goto L_0x00d9
        L_0x00d0:
            int r0 = r0.optInt(r8, r13)
            goto L_0x00d9
        L_0x00d5:
            int r0 = r0.optInt(r9, r13)
        L_0x00d9:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r9] = r10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r12[r8] = r15
            java.lang.String r15 = "checkWithSkipStrategy api:%s checkRet:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r15, r12)
            goto L_0x00f9
        L_0x00e9:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getMessage()
            r12[r9] = r0
            java.lang.String r0 = "checkWithSkipStrategy exp:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r12)
            goto L_0x0075
        L_0x00f9:
            if (r0 == r13) goto L_0x00fc
            return r0
        L_0x00fc:
            java.lang.String r11 = r18.getAppId()
            boolean r0 = r1.f261252l
            r12 = 4
            if (r0 == 0) goto L_0x0148
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0148
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0123 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0123 }
            java.lang.String r13 = "appId"
            java.lang.String r11 = r0.optString(r13)     // Catch:{ Exception -> 0x0123 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0148
        L_0x011c:
            java.lang.String r11 = r18.getAppId()
            goto L_0x0148
        L_0x0121:
            r0 = move-exception
            goto L_0x013e
        L_0x0123:
            r0 = move-exception
            java.lang.String r13 = "getApiCtrlByte(appId:%s, api:%s, privateData:%s), parse invokeAppId failed %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0121 }
            java.lang.String r16 = r18.getAppId()     // Catch:{ all -> 0x0121 }
            r15[r9] = r16     // Catch:{ all -> 0x0121 }
            r15[r8] = r10     // Catch:{ all -> 0x0121 }
            r15[r7] = r4     // Catch:{ all -> 0x0121 }
            r15[r14] = r0     // Catch:{ all -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r13, r15)     // Catch:{ all -> 0x0121 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0148
            goto L_0x011c
        L_0x013e:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 == 0) goto L_0x0147
            r18.getAppId()
        L_0x0147:
            throw r0
        L_0x0148:
            li0.b[] r0 = new li0.C88508b[r8]
            byte[] r4 = r1.mo125131e(r2, r11, r0)
            li0.b r13 = li0.C88508b.DESTROYED
            r15 = r0[r9]
            if (r13 != r15) goto L_0x0158
            r13 = r22
            r15 = 0
            goto L_0x015e
        L_0x0158:
            r13 = r22
            int r15 = r1.mo125129b(r4, r13)
        L_0x015e:
            if (r23 == 0) goto L_0x01b1
            java.lang.Class<wq0.o> r12 = wq0.C91078o.class
            ra.b r2 = r2.mo109668l(r12)
            wq0.o r2 = (wq0.C91078o) r2
            if (r2 == 0) goto L_0x0186
            boolean r12 = r3 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.C82374e
            if (r12 == 0) goto L_0x0177
            r12 = r3
            com.tencent.mm.plugin.appbrand.jsapi.e r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82374e) r12
            boolean r12 = r2.mo125139aS(r12)
            if (r12 == 0) goto L_0x0186
        L_0x0177:
            boolean r12 = r3 instanceof java.lang.Class
            if (r12 == 0) goto L_0x0184
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r2 = r2.mo125138aM(r3)
            if (r2 != 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r2 = 0
            goto L_0x0187
        L_0x0186:
            r2 = 1
        L_0x0187:
            if (r2 == 0) goto L_0x01b1
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r9] = r5
            r2[r8] = r11
            r2[r7] = r10
            r0 = r0[r9]
            r2[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r3 = 4
            r2[r3] = r0
            r0 = 5
            int r3 = r4.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            r0 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2[r0] = r3
            java.lang.String r0 = "getCtrlByte, appId = %s, invokeAppId = %s, apiName = %s, state = %s, ctrlIndex = %d, ctrlIndexLength %d, checkRet %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)
        L_0x01b1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: wq0.C91065g.mo125130c(com.tencent.mm.plugin.appbrand.jsapi.f, java.lang.Object, java.lang.String, java.lang.String, int, boolean):int");
    }

    /* renamed from: e */
    public final byte[] mo125131e(C82381f fVar, String str, C88508b[] bVarArr) {
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        int i = this.f261242b;
        if (i == -1) {
            return new byte[]{1};
        } else if (i == -2) {
            return new byte[]{0};
        } else {
            if (TextUtils.isEmpty(str) || C90599h.m113509b(fVar.getAppId(), str)) {
                synchronized (this.f261245e) {
                    appRuntimeApiPermissionBundle = this.f261246f;
                }
            } else {
                synchronized (this.f261247g) {
                    appRuntimeApiPermissionBundle = this.f261248h.get(str);
                }
            }
            if (appRuntimeApiPermissionBundle == null) {
                Log.m105921e("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlBytes(appId:%s, invokeAppId:%s) get NULL bundle", fVar.getAppId(), str);
                return new byte[]{0};
            } else if (!(fVar instanceof C81925i2)) {
                return appRuntimeApiPermissionBundle.f245266d;
            } else {
                C88508b c = this.f261241a.f238113K.mo122980c();
                int ordinal = c.ordinal();
                byte[] bArr = (ordinal == 1 || ordinal == 2 || ordinal == 3) ? appRuntimeApiPermissionBundle.f245267e : appRuntimeApiPermissionBundle.f245266d;
                if (bVarArr == null || bVarArr.length < 1) {
                    return bArr;
                }
                bVarArr[0] = c;
                return bArr;
            }
        }
    }

    /* renamed from: g */
    public byte[] mo125132g(C82381f fVar, String str) {
        AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        int i = this.f261242b;
        if (i == -1) {
            return new byte[]{1};
        } else if (i == -2) {
            return new byte[]{0};
        } else if (Util.isNullOrNil(str)) {
            return null;
        } else {
            synchronized (this.f261247g) {
                appRuntimeApiPermissionBundle = this.f261248h.get(str);
            }
            if (appRuntimeApiPermissionBundle == null) {
                return null;
            }
            if (!(fVar instanceof C81925i2)) {
                return appRuntimeApiPermissionBundle.f245266d;
            }
            int ordinal = this.f261241a.f238113K.mo122980c().ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? appRuntimeApiPermissionBundle.f245267e : appRuntimeApiPermissionBundle.f245266d;
        }
    }

    /* renamed from: h */
    public final void mo125133h() {
        if (this.f261248h == null) {
            Log.m105920e("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib mPluginPermission null");
            return;
        }
        Log.m105924i("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib");
        if (this.f261241a.mo113047b0() == null) {
            Log.m105920e("MicroMsg.AppRuntimeApiPermissionController[permission]", "pluginUpdateNotifyWxCommLib mRuntime.getService() null");
            return;
        }
        HashMap hashMap = new HashMap();
        for (String next : this.f261248h.keySet()) {
            HashMap hashMap2 = new HashMap();
            AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = this.f261248h.get(next);
            if (appRuntimeApiPermissionBundle != null) {
                hashMap2.put("fg", appRuntimeApiPermissionBundle.f245266d);
                hashMap2.put("bg", appRuntimeApiPermissionBundle.f245267e);
                hashMap2.put("sp", appRuntimeApiPermissionBundle.f245268f);
                hashMap.put(next, hashMap2);
            }
        }
        C48016e.m53378d(hashMap);
        this.f261241a.mo113047b0().mo109652f("onPluginPermissionUpdate", new JSONObject(hashMap).toString(), 0);
    }

    /* renamed from: i */
    public void mo125134i(HashMap<String, AppRuntimeAppidABTestPermissionBundle> hashMap) {
        synchronized (this.f261249i) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            Log.m105925i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updateAppidABTestPermission size:%d", objArr);
            this.f261250j = hashMap;
        }
    }

    /* renamed from: j */
    public void mo125135j(AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle) {
        if (appRuntimeApiPermissionBundle != null) {
            synchronized (this.f261245e) {
                AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle2 = this.f261246f;
                if (appRuntimeApiPermissionBundle2 == null || appRuntimeApiPermissionBundle2.f245266d.length <= appRuntimeApiPermissionBundle.f245266d.length) {
                    this.f261246f = appRuntimeApiPermissionBundle;
                    byte[] bArr = appRuntimeApiPermissionBundle.f245266d;
                    byte[] bArr2 = appRuntimeApiPermissionBundle.f245267e;
                    byte[] bArr3 = appRuntimeApiPermissionBundle.f245268f;
                    for (int i = 0; i < this.f261251k.size(); i++) {
                        this.f261251k.get(i).mo121545a(bArr, bArr2, bArr3);
                    }
                    Log.m105925i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission old %s, updated %s", appRuntimeApiPermissionBundle2, appRuntimeApiPermissionBundle);
                    return;
                }
                Log.m105921e("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission, old %s, new %s, ignore", appRuntimeApiPermissionBundle2, appRuntimeApiPermissionBundle);
            }
        }
    }

    /* renamed from: k */
    public void mo125136k(HashMap<String, AppRuntimeApiPermissionBundle> hashMap) {
        synchronized (this.f261247g) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            Log.m105925i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePluginPermission size:%d", objArr);
            this.f261248h = hashMap;
            mo125133h();
            if (this.f261248h != null) {
                Log.m105924i("MicroMsg.AppRuntimeApiPermissionController[permission]", "notifyNodeOnPluginUpdate");
                for (int i = 0; i < ((ArrayList) this.f261251k).size(); i++) {
                    ((C91068c) ((ArrayList) this.f261251k).get(i)).mo121546b(this.f261248h);
                }
            }
        }
    }
}
