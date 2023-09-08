package eb0;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import f40.C86718e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p210o.C11323a;
import p329d3.C58104c;
import p823sg.C77710q;
import te3.C49945j50;
import te3.C50981qm2;
import te3.c45;
import te3.g85;
import te3.i85;
import te3.j85;

/* renamed from: eb0.h6 */
public class C116734h6 {

    /* renamed from: a */
    public static Set<Runnable> f350034a = Collections.emptySet();

    /* renamed from: b */
    public static volatile boolean f350035b = false;

    /* renamed from: eb0.h6$g */
    public static final class C31472g {

        /* renamed from: a */
        public static int f84195a = -1;

        /* renamed from: eb0.h6$g$a */
        public class C31473a implements Runnable {
            public void run() {
                C116736d.C86490b.f251314a.clear();
                MultiProcessMMKV s = C116734h6.m164663s("xagreement_test_configs");
                boolean z = false;
                if (!(s == null || s.allKeys() == null || s.allKeys().length <= 0)) {
                    for (String str : s.allKeys()) {
                        int i = s.getInt(str, -1);
                        if ("test_xagreement_id".equals(str)) {
                            C31472g.f84195a = i;
                        } else {
                            if (C116736d.C86490b.f251314a == Collections.EMPTY_MAP) {
                                C116736d.C86490b.f251314a = new ConcurrentHashMap();
                            }
                            C116736d.C86490b.f251314a.put(str, Integer.valueOf(i));
                        }
                    }
                }
                int i2 = C31472g.f84195a;
                if (i2 != -1) {
                    z = true;
                }
                if (z) {
                    C116734h6.m164664t(i2);
                    ((ConcurrentHashMap) C116736d.f350037b.f350038a).clear();
                }
            }
        }

        /* renamed from: a */
        public static void m39419a() {
            Executors.newSingleThreadExecutor().execute(new C31473a());
        }
    }

    /* renamed from: eb0.h6$f */
    public static class C45610f {
        /* renamed from: a */
        public static String m50672a() {
            return C116734h6.m164662r("BRAND_Team");
        }
    }

    /* renamed from: eb0.h6$e */
    public static class C75585e {

        /* renamed from: a */
        public static HashMap<String, String> f222060a;
    }

    /* renamed from: eb0.h6$a */
    public class C86488a implements C11323a<WeChatBrands.Business.Entries, Boolean> {
        public Object apply(Object obj) {
            return Boolean.valueOf(WeChatBrands.Business.Entries.restricted(C116736d.C86490b.m107219a((WeChatBrands.Business.Entries) obj)));
        }
    }

    /* renamed from: eb0.h6$b */
    public class C86489b implements C11323a<WeChatBrands.Business.Entries, Boolean> {
        public Object apply(Object obj) {
            int a = C116736d.C86490b.m107219a((WeChatBrands.Business.Entries) obj);
            return Boolean.valueOf(WeChatBrands.Business.Entries.signRequsted(a) || WeChatBrands.Business.Entries.banned(a));
        }
    }

    /* renamed from: eb0.h6$c */
    public class C116735c implements WeChatBrands.IReplaceApply<String, String> {

        /* renamed from: a */
        public WeChatBrands.IReplaceApply<String, String> f350036a;

        public C116735c() {
            C116736d dVar = C116736d.f350037b;
            ((C116736d.C116737a) dVar).reload();
            this.f350036a = dVar;
        }

        public Object apply(Object obj, PInt pInt) {
            String str = (String) obj;
            return (!str.equals("BRAND_Pay") || C116734h6.m164645a()) ? (!str.equals("BRAND_Credit_Card") || C116734h6.m164645a()) ? (!str.equals("BRAND_Transfer") || C116734h6.m164645a()) ? (!str.equals("BRAND_Scan_Payment") || C116734h6.m164645a()) ? (!str.equals("BRAND_Balance") || C116734h6.m164645a()) ? (!str.equals("Cards_and_Offers") || C116734h6.m164645a()) ? (!str.equals("BRAND_Wallet") || C116734h6.m164645a()) ? (!str.equals("BRAND_Split_Bill") || C116734h6.m164645a()) ? (!str.equals("BRAND_Movie_Tickets") || C116734h6.m164645a()) ? (!str.equals("BRAND_hongbao") || C116734h6.m164645a()) ? (!str.equals("Webeans_domestic") || C116734h6.m164645a()) ? (!str.equals("Webeans_oversesa") || !C116734h6.m164645a()) ? (String) ((C116736d.C116737a) this.f350036a).apply(str, pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("Webeans_domestic", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("Webeans_oversesa", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_hongbao_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Movie_Tickets_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Split_Bill_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Wallet_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("Cards_and_Offers_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Balance_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Scan_Payment_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Transfer_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Credit_Card_Oversea", pInt) : (String) ((C116736d.C116737a) this.f350036a).apply("BRAND_Pay_Oversea", pInt);
        }

        public void reload() {
            this.f350036a.reload();
        }
    }

    /* renamed from: eb0.h6$d */
    public static abstract class C116736d implements WeChatBrands.IReplaceApply<String, String> {

        /* renamed from: b */
        public static final C116736d f350037b = new C116737a();

        /* renamed from: a */
        public Map<String, C58104c<String, Integer>> f350038a = new ConcurrentHashMap();

        /* renamed from: eb0.h6$d$b */
        public static class C86490b {

            /* renamed from: a */
            public static Map<String, Integer> f251314a = Collections.emptyMap();

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
                r0 = eb0.C116734h6.m164649e(com.tencent.p014mm.sdk.platformtools.WeChatBrands.UserInfo.xagreementId);
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static int m107219a(com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries r2) {
                /*
                    java.util.Map<java.lang.String, java.lang.Integer> r0 = f251314a
                    java.lang.String r1 = r2.group
                    boolean r0 = r0.containsKey(r1)
                    if (r0 == 0) goto L_0x0019
                    java.util.Map<java.lang.String, java.lang.Integer> r0 = f251314a
                    java.lang.String r2 = r2.group
                    java.lang.Object r2 = r0.get(r2)
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    return r2
                L_0x0019:
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.blockBizEetnryRemoteConfigs()
                    if (r0 != 0) goto L_0x0030
                    int r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.UserInfo.xagreementId
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = eb0.C116734h6.m164649e(r0)
                    if (r0 == 0) goto L_0x0030
                    java.lang.String r1 = r2.group
                    int r2 = r2.status
                    int r2 = r0.getInt(r1, r2)
                    return r2
                L_0x0030:
                    int r2 = r2.status
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: eb0.C116734h6.C116736d.C86490b.m107219a(com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries):int");
            }
        }

        /* renamed from: eb0.h6$d$a */
        public class C116737a extends C116736d {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
                if (r0 != null) goto L_0x0059;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
                if (r0 != null) goto L_0x0085;
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.String mo180721c(java.lang.String r5, com.tencent.p014mm.pointers.PInt r6) {
                /*
                    r4 = this;
                    boolean r0 = android.text.TextUtils.isEmpty(r5)
                    if (r0 == 0) goto L_0x0009
                    java.lang.String r5 = ""
                    return r5
                L_0x0009:
                    java.util.Map<java.lang.String, d3.c<java.lang.String, java.lang.Integer>> r0 = r4.f350038a
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r0 = r0.get(r5)
                    d3.c r0 = (p329d3.C58104c) r0
                    r1 = 0
                    if (r0 != 0) goto L_0x0018
                    r0 = r1
                    goto L_0x0026
                L_0x0018:
                    S r2 = r0.f166180b
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    r6.value = r2
                    F r0 = r0.f166179a
                    java.lang.String r0 = (java.lang.String) r0
                L_0x0026:
                    if (r0 == 0) goto L_0x0029
                    return r0
                L_0x0029:
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.AppInfo.lang
                    java.util.Set<java.lang.Runnable> r2 = eb0.C116734h6.f350034a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r5)
                    java.lang.String r3 = "@"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    int r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.UserInfo.xagreementId
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = eb0.C116734h6.m164651g(r2)
                    if (r2 == 0) goto L_0x0050
                    java.lang.String r0 = r2.getString(r0, r1)
                    if (r0 == 0) goto L_0x0051
                    goto L_0x0059
                L_0x0050:
                    r0 = r1
                L_0x0051:
                    org.json.JSONObject r2 = eb0.C116734h6.C116736d.C116738c.f350039a
                    if (r2 == 0) goto L_0x0059
                    java.lang.String r0 = r2.optString(r5, r1)
                L_0x0059:
                    if (r0 == 0) goto L_0x006d
                    r6 = 0
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.util.Map<java.lang.String, d3.c<java.lang.String, java.lang.Integer>> r1 = r4.f350038a
                    d3.c r2 = new d3.c
                    r2.<init>(r0, r6)
                    java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                    r1.put(r5, r2)
                    return r0
                L_0x006d:
                    int r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.UserInfo.xagreementId
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = eb0.C116734h6.m164650f(r0)
                    if (r0 == 0) goto L_0x007c
                    java.lang.String r0 = r0.getString(r5, r1)
                    if (r0 == 0) goto L_0x007d
                    goto L_0x0085
                L_0x007c:
                    r0 = r1
                L_0x007d:
                    org.json.JSONObject r2 = eb0.C116734h6.C116736d.C116739d.f350042a
                    if (r2 == 0) goto L_0x0085
                    java.lang.String r0 = r2.optString(r5, r1)
                L_0x0085:
                    if (r0 == 0) goto L_0x009b
                    r1 = 1
                    r6.value = r1
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                    java.util.Map<java.lang.String, d3.c<java.lang.String, java.lang.Integer>> r1 = r4.f350038a
                    d3.c r2 = new d3.c
                    r2.<init>(r0, r6)
                    java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                    r1.put(r5, r2)
                    return r0
                L_0x009b:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eb0.C116734h6.C116736d.C116737a.mo180721c(java.lang.String, com.tencent.mm.pointers.PInt):java.lang.String");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                r1 = p956di.C86291a.m106894b();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x0058, code lost:
                if (eb0.C116734h6.C116736d.C116738c.f350039a == null) goto L_0x006a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0060, code lost:
                if (eb0.C116734h6.C116736d.C116738c.f350040b.equals(r1) == false) goto L_0x006a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x0062, code lost:
                monitor-enter(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
                eb0.C116734h6.C116736d.C116738c.f350041c = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x0065, code lost:
                monitor-exit(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
                eb0.C116734h6.C116736d.m164665a(r0, r1, new eb0.C116742i6(r1));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x0072, code lost:
                monitor-enter(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
                eb0.C116734h6.C116736d.C116738c.f350041c = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x0075, code lost:
                monitor-exit(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x007a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x007b, code lost:
                monitor-enter(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
                eb0.C116734h6.C116736d.C116738c.f350041c = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x007f, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void reload() {
                /*
                    r6 = this;
                    java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                    r0.<init>()
                    r6.f350038a = r0
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.Class<eb0.h6$d$d> r1 = eb0.C116734h6.C116736d.C116739d.class
                    monitor-enter(r1)
                    boolean r2 = eb0.C116734h6.C116736d.C116739d.f350044c     // Catch:{ all -> 0x0092 }
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0016
                    monitor-exit(r1)     // Catch:{ all -> 0x0092 }
                    goto L_0x0042
                L_0x0016:
                    eb0.C116734h6.C116736d.C116739d.f350044c = r4     // Catch:{ all -> 0x0092 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0092 }
                    boolean r2 = p956di.C86291a.m106895c()     // Catch:{ all -> 0x0089 }
                    if (r2 != 0) goto L_0x0023
                    r2 = 2131755509(0x7f1001f5, float:1.91419E38)
                    goto L_0x0026
                L_0x0023:
                    r2 = 2131755510(0x7f1001f6, float:1.9141901E38)
                L_0x0026:
                    org.json.JSONObject r5 = eb0.C116734h6.C116736d.C116739d.f350042a     // Catch:{ all -> 0x0089 }
                    if (r5 == 0) goto L_0x0036
                    int r5 = eb0.C116734h6.C116736d.C116739d.f350043b     // Catch:{ all -> 0x0089 }
                    if (r5 != r2) goto L_0x0036
                    monitor-enter(r1)
                    eb0.C116734h6.C116736d.C116739d.f350044c = r3     // Catch:{ all -> 0x0033 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0033 }
                    goto L_0x0042
                L_0x0033:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0033 }
                    throw r0
                L_0x0036:
                    eb0.j6 r5 = new eb0.j6     // Catch:{ all -> 0x0089 }
                    r5.<init>(r2)     // Catch:{ all -> 0x0089 }
                    eb0.C116734h6.C116736d.m164666b(r0, r2, r5)     // Catch:{ all -> 0x0089 }
                    monitor-enter(r1)
                    eb0.C116734h6.C116736d.C116739d.f350044c = r3     // Catch:{ all -> 0x0086 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0086 }
                L_0x0042:
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.Class<eb0.h6$d$c> r2 = eb0.C116734h6.C116736d.C116738c.class
                    monitor-enter(r2)
                    boolean r1 = eb0.C116734h6.C116736d.C116738c.f350041c     // Catch:{ all -> 0x0083 }
                    if (r1 == 0) goto L_0x004f
                    monitor-exit(r2)     // Catch:{ all -> 0x0083 }
                    goto L_0x0076
                L_0x004f:
                    eb0.C116734h6.C116736d.C116738c.f350041c = r4     // Catch:{ all -> 0x0083 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0083 }
                    java.lang.String r1 = p956di.C86291a.m106894b()     // Catch:{ all -> 0x007a }
                    org.json.JSONObject r4 = eb0.C116734h6.C116736d.C116738c.f350039a     // Catch:{ all -> 0x007a }
                    if (r4 == 0) goto L_0x006a
                    java.lang.String r4 = eb0.C116734h6.C116736d.C116738c.f350040b     // Catch:{ all -> 0x007a }
                    boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x007a }
                    if (r4 == 0) goto L_0x006a
                    monitor-enter(r2)
                    eb0.C116734h6.C116736d.C116738c.f350041c = r3     // Catch:{ all -> 0x0067 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                    goto L_0x0076
                L_0x0067:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0067 }
                    throw r0
                L_0x006a:
                    eb0.i6 r4 = new eb0.i6     // Catch:{ all -> 0x007a }
                    r4.<init>(r1)     // Catch:{ all -> 0x007a }
                    eb0.C116734h6.C116736d.m164665a(r0, r1, r4)     // Catch:{ all -> 0x007a }
                    monitor-enter(r2)
                    eb0.C116734h6.C116736d.C116738c.f350041c = r3     // Catch:{ all -> 0x0077 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0077 }
                L_0x0076:
                    return
                L_0x0077:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0077 }
                    throw r0
                L_0x007a:
                    r0 = move-exception
                    monitor-enter(r2)
                    eb0.C116734h6.C116736d.C116738c.f350041c = r3     // Catch:{ all -> 0x0080 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0080 }
                    throw r0
                L_0x0080:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0080 }
                    throw r0
                L_0x0083:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0083 }
                    throw r0
                L_0x0086:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0086 }
                    throw r0
                L_0x0089:
                    r0 = move-exception
                    monitor-enter(r1)
                    eb0.C116734h6.C116736d.C116739d.f350044c = r3     // Catch:{ all -> 0x008f }
                    monitor-exit(r1)     // Catch:{ all -> 0x008f }
                    throw r0
                L_0x008f:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x008f }
                    throw r0
                L_0x0092:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0092 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: eb0.C116734h6.C116736d.C116737a.reload():void");
            }
        }

        /* renamed from: eb0.h6$d$c */
        public static class C116738c {

            /* renamed from: a */
            public static JSONObject f350039a = null;

            /* renamed from: b */
            public static String f350040b = "";

            /* renamed from: c */
            public static boolean f350041c;
        }

        /* renamed from: eb0.h6$d$d */
        public static class C116739d {

            /* renamed from: a */
            public static JSONObject f350042a = null;

            /* renamed from: b */
            public static int f350043b = -1;

            /* renamed from: c */
            public static boolean f350044c;
        }

        /* renamed from: eb0.h6$d$e */
        public interface C116740e {
            /* renamed from: a */
            void mo105935a(JSONObject jSONObject);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.StringWriter} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m164665a(android.content.Context r11, java.lang.String r12, eb0.C116734h6.C116736d.C116740e r13) {
            /*
                java.lang.String r0 = "MicroMsg.XAgreementSettings"
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 1
                r4 = 0
                r5 = 0
                android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ IOException -> 0x0063, JSONException -> 0x0061, all -> 0x005d }
                java.io.InputStream r11 = r11.open(r12)     // Catch:{ IOException -> 0x0063, JSONException -> 0x0061, all -> 0x005d }
                java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ IOException -> 0x0058, JSONException -> 0x0056, all -> 0x0051 }
                r6.<init>()     // Catch:{ IOException -> 0x0058, JSONException -> 0x0056, all -> 0x0051 }
                r4 = 1024(0x400, float:1.435E-42)
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
                java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x0044 }
                java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0044 }
                r8.<init>(r11, r9)     // Catch:{ all -> 0x0044 }
                r7.<init>(r8)     // Catch:{ all -> 0x0044 }
            L_0x0026:
                int r8 = r7.read(r4)     // Catch:{ all -> 0x0044 }
                r9 = -1
                if (r8 == r9) goto L_0x0031
                r6.write(r4, r5, r8)     // Catch:{ all -> 0x0044 }
                goto L_0x0026
            L_0x0031:
                r11.close()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                r7.<init>(r4)     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                r13.mo105935a(r7)     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r11)
                goto L_0x0073
            L_0x0044:
                r13 = move-exception
                r11.close()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                throw r13     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
            L_0x0049:
                r12 = move-exception
                r4 = r6
                goto L_0x0052
            L_0x004c:
                r13 = move-exception
                goto L_0x004f
            L_0x004e:
                r13 = move-exception
            L_0x004f:
                r4 = r6
                goto L_0x0059
            L_0x0051:
                r12 = move-exception
            L_0x0052:
                r10 = r4
                r4 = r11
                r11 = r10
                goto L_0x008d
            L_0x0056:
                r13 = move-exception
                goto L_0x0059
            L_0x0058:
                r13 = move-exception
            L_0x0059:
                r10 = r4
                r4 = r11
                r11 = r10
                goto L_0x0066
            L_0x005d:
                r11 = move-exception
                r12 = r11
                r11 = r4
                goto L_0x008d
            L_0x0061:
                r11 = move-exception
                goto L_0x0064
            L_0x0063:
                r11 = move-exception
            L_0x0064:
                r13 = r11
                r11 = r4
            L_0x0066:
                java.lang.String r6 = "#loadDefTable fail, %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
                r7[r5] = r12     // Catch:{ all -> 0x008c }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r13, r6, r7)     // Catch:{ all -> 0x008c }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
                r6 = r11
            L_0x0073:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r6)
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r1
                r11 = 2
                java.lang.Object[] r11 = new java.lang.Object[r11]
                r11[r5] = r12
                java.lang.Long r12 = java.lang.Long.valueOf(r6)
                r11[r3] = r12
                java.lang.String r12 = "Load default res table path:%s spent %s(ms)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r11)
                return
            L_0x008c:
                r12 = move-exception
            L_0x008d:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: eb0.C116734h6.C116736d.m164665a(android.content.Context, java.lang.String, eb0.h6$d$e):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.StringWriter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.StringWriter} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m164666b(android.content.Context r11, int r12, eb0.C116734h6.C116736d.C116740e r13) {
            /*
                java.lang.String r0 = "MicroMsg.XAgreementSettings"
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 1
                r4 = 0
                r5 = 0
                android.content.res.Resources r11 = r11.getResources()     // Catch:{ IOException -> 0x0063, JSONException -> 0x0061, all -> 0x005d }
                java.io.InputStream r11 = r11.openRawResource(r12)     // Catch:{ IOException -> 0x0063, JSONException -> 0x0061, all -> 0x005d }
                java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ IOException -> 0x0058, JSONException -> 0x0056, all -> 0x0051 }
                r6.<init>()     // Catch:{ IOException -> 0x0058, JSONException -> 0x0056, all -> 0x0051 }
                r4 = 1024(0x400, float:1.435E-42)
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
                java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x0044 }
                java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0044 }
                r8.<init>(r11, r9)     // Catch:{ all -> 0x0044 }
                r7.<init>(r8)     // Catch:{ all -> 0x0044 }
            L_0x0026:
                int r8 = r7.read(r4)     // Catch:{ all -> 0x0044 }
                r9 = -1
                if (r8 == r9) goto L_0x0031
                r6.write(r4, r5, r8)     // Catch:{ all -> 0x0044 }
                goto L_0x0026
            L_0x0031:
                r11.close()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                r7.<init>(r4)     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                r13.mo105935a(r7)     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r11)
                goto L_0x0077
            L_0x0044:
                r13 = move-exception
                r11.close()     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
                throw r13     // Catch:{ IOException -> 0x004e, JSONException -> 0x004c, all -> 0x0049 }
            L_0x0049:
                r12 = move-exception
                r4 = r6
                goto L_0x0052
            L_0x004c:
                r13 = move-exception
                goto L_0x004f
            L_0x004e:
                r13 = move-exception
            L_0x004f:
                r4 = r6
                goto L_0x0059
            L_0x0051:
                r12 = move-exception
            L_0x0052:
                r10 = r4
                r4 = r11
                r11 = r10
                goto L_0x0095
            L_0x0056:
                r13 = move-exception
                goto L_0x0059
            L_0x0058:
                r13 = move-exception
            L_0x0059:
                r10 = r4
                r4 = r11
                r11 = r10
                goto L_0x0066
            L_0x005d:
                r11 = move-exception
                r12 = r11
                r11 = r4
                goto L_0x0095
            L_0x0061:
                r11 = move-exception
                goto L_0x0064
            L_0x0063:
                r11 = move-exception
            L_0x0064:
                r13 = r11
                r11 = r4
            L_0x0066:
                java.lang.String r6 = "#loadDefTable fail, %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0094 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0094 }
                r7[r5] = r8     // Catch:{ all -> 0x0094 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r13, r6, r7)     // Catch:{ all -> 0x0094 }
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
                r6 = r11
            L_0x0077:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r6)
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r1
                r11 = 2
                java.lang.Object[] r11 = new java.lang.Object[r11]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r5] = r12
                java.lang.Long r12 = java.lang.Long.valueOf(r6)
                r11[r3] = r12
                java.lang.String r12 = "Load default res table %s spent %s(ms)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r11)
                return
            L_0x0094:
                r12 = move-exception
            L_0x0095:
                com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
                com.tencent.p014mm.vfs.C116299g2.m163847c(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: eb0.C116734h6.C116736d.m164666b(android.content.Context, int, eb0.h6$d$e):void");
        }

        /* renamed from: c */
        public abstract String apply(String str, PInt pInt);
    }

    /* renamed from: a */
    public static boolean m164645a() {
        String d = m164648d();
        if (TextUtils.isEmpty(d)) {
            return WeChatBrands.AppInfo.current().isMainland();
        }
        MultiProcessMMKV s = m164663s("xagreement_wallet_region");
        int i = -1;
        if (s != null) {
            i = s.getInt(d, -1);
        }
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    public static int m164646b(long j, long j2, long j3) {
        return (j2 & j) == j ? 0 : 1;
    }

    /* renamed from: c */
    public static int m164647c() {
        MultiProcessMMKV s;
        String d = m164648d();
        if (d == null || (s = m164663s("xagreement_id_store")) == null) {
            int defaultXAgreementId = WeChatBrands.AppInfo.current().getDefaultXAgreementId();
            Log.m105925i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s by default", Integer.valueOf(defaultXAgreementId));
            return defaultXAgreementId;
        }
        int decodeInt = s.decodeInt(d);
        Log.m105925i("MicroMsg.XAgreementSettings", "Decode xagreementId return %s for %s", Integer.valueOf(decodeInt), d);
        return decodeInt;
    }

    /* renamed from: d */
    public static String m164648d() {
        int h = C86718e.m107549h();
        if (h == 0) {
            return null;
        }
        return new C77710q(h).toString();
    }

    /* renamed from: e */
    public static MultiProcessMMKV m164649e(int i) {
        return m164663s("xagreement_biz_entry_by_id_" + i);
    }

    /* renamed from: f */
    public static MultiProcessMMKV m164650f(int i) {
        return m164663s("xagreement_domains_by_id_" + i);
    }

    /* renamed from: g */
    public static MultiProcessMMKV m164651g(int i) {
        return m164663s("xagreement_wordings_by_id_" + i);
    }

    /* renamed from: h */
    public static void m164652h() {
        if (f350035b) {
            Log.m105928w("MicroMsg.XAgreementSettings", "[!] Already initialized.");
            return;
        }
        f350034a = new HashSet();
        m164664t(m164647c());
        WeChatBrands.updateBizRestrictHandler(new C86488a());
        WeChatBrands.updateBizRestrictAlertHandler(new C86489b());
        C31472g.m39419a();
        f350035b = true;
    }

    /* renamed from: i */
    public static void m164653i() {
        for (Runnable run : f350034a) {
            run.run();
        }
    }

    /* renamed from: j */
    public static void m164654j(g85 g85) {
        try {
            m164655k(g85);
            ((ConcurrentHashMap) C116736d.f350037b.f350038a).clear();
            m164653i();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.XAgreementSettings", th, "", new Object[0]);
        }
    }

    /* renamed from: k */
    public static void m164655k(g85 g85) {
        MultiProcessMMKV f;
        Log.m105924i("MicroMsg.XAgreementSettings", "Save saveDomainSettingsImpl");
        if (g85 == null) {
            Log.m105928w("MicroMsg.XAgreementSettings", "xAgreementDmSetting is null.");
        } else if (g85.f133933e == null) {
            Log.m105928w("MicroMsg.XAgreementSettings", "xAgreementDmSetting.Items is null.");
        } else {
            SparseArray sparseArray = new SparseArray();
            Iterator<C49945j50> it = g85.f133933e.iterator();
            while (it.hasNext()) {
                C49945j50 next = it.next();
                if (next == null) {
                    Log.m105928w("MicroMsg.XAgreementSettings", "dmItem is null..");
                } else if (next.f135870f < 0) {
                    Log.m105928w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + next.f135870f);
                } else if (TextUtils.isEmpty(next.f135868d)) {
                    Log.m105928w("MicroMsg.XAgreementSettings", "[!] key is empty, XAgreementId = " + next.f135870f);
                } else {
                    List list = (List) sparseArray.get(next.f135870f);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(next.f135870f, list);
                    }
                    list.add(new C58104c(next.f135868d, next.f135869e));
                }
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                List<C58104c> list2 = (List) sparseArray.get(keyAt);
                if (!(list2 == null || (f = m164650f(keyAt)) == null)) {
                    for (C58104c cVar : list2) {
                        Log.m105919d("MicroMsg.XAgreementSettings", "xAgreementDmSetting: %s, %s, %s", Integer.valueOf(keyAt), cVar.f166179a, cVar.f166180b);
                        f.putString((String) cVar.f166179a, (String) cVar.f166180b);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public static void m164656l(long j, long j2) {
        Log.m105924i("MicroMsg.XAgreementSettings", "#saveFuncsSwith, FuncsSwitch = " + Long.toBinaryString(j) + ", FuncsUserChoiceSwitch = " + Long.toBinaryString(j2));
        try {
            MultiProcessMMKV e = m164649e(WeChatBrands.UserInfo.xagreementId);
            if (e != null) {
                e.putInt(WeChatBrands.Business.GROUP_PAY, m164646b(1, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_MP, m164646b(2, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_OA, m164646b(4, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_THIRD_PARTY, m164646b(8, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_CROSS_DATA, m164646b(16, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_WECOM, m164646b(32, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_CHANNELS, m164646b(64, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_SECONDARY, m164646b(128, j, j2));
                e.putInt("search", m164646b(256, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_WECHAT_OUT, m164646b(512, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_OPEN, m164646b(1024, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_LIVE, m164646b(2048, j, j2));
                e.putInt(WeChatBrands.Business.GROUP_ADS, m164646b(4096, j, j2));
                m164653i();
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.XAgreementSettings", th, "saveFuncsSwith fail", new Object[0]);
        }
    }

    /* renamed from: m */
    public static void m164657m(int i) {
        MultiProcessMMKV s;
        String d = m164648d();
        Log.m105924i("MicroMsg.XAgreementSettings", "#saveWalletRegion, walletRegion = " + i + ", uin = " + d);
        if (i != -1 && !TextUtils.isEmpty(d) && (s = m164663s("xagreement_wallet_region")) != null) {
            s.encode(d, i);
        }
    }

    /* renamed from: n */
    public static void m164658n(j85 j85) {
        try {
            m164659o(j85);
            ((ConcurrentHashMap) C116736d.f350037b.f350038a).clear();
            m164653i();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.XAgreementSettings", th, "", new Object[0]);
        }
    }

    /* renamed from: o */
    public static void m164659o(j85 j85) {
        Log.m105924i("MicroMsg.XAgreementSettings", "Save XAgreementWordSettings");
        if (j85 == null) {
            Log.m105928w("MicroMsg.XAgreementSettings", "xAgreementWordingSetting is null.");
            return;
        }
        LinkedList<i85> linkedList = j85.f135930e;
        if (linkedList == null) {
            Log.m105928w("MicroMsg.XAgreementSettings", "XAgreementWording is null.");
            return;
        }
        Iterator<i85> it = linkedList.iterator();
        while (it.hasNext()) {
            i85 next = it.next();
            if (next == null) {
                Log.m105928w("MicroMsg.XAgreementSettings", "xAgreementWording is null..");
            } else {
                int i = next.f135172d;
                if (i < 0) {
                    Log.m105928w("MicroMsg.XAgreementSettings", "[!] illegal id, XAgreementId = " + next.f135172d);
                } else {
                    Log.m105925i("MicroMsg.XAgreementSettings", "XAgreementId = %s", Integer.valueOf(i));
                    if (next.f135174f == null) {
                        Log.m105929w("MicroMsg.XAgreementSettings", "[!] LangWordings is null.", Integer.valueOf(next.f135172d));
                    } else {
                        MultiProcessMMKV g = m164651g(next.f135172d);
                        if (g != null) {
                            Iterator<C50981qm2> it4 = next.f135174f.iterator();
                            while (it4.hasNext()) {
                                C50981qm2 next2 = it4.next();
                                if (next2 == null) {
                                    Log.m105929w("MicroMsg.XAgreementSettings", "[!] LangWordings is null..", Integer.valueOf(next.f135172d));
                                } else if (TextUtils.isEmpty(next2.f140392d)) {
                                    Log.m105928w("MicroMsg.XAgreementSettings", "[!] lang is empty, XAgreementId = " + next.f135172d);
                                } else {
                                    LinkedList<c45> linkedList2 = next2.f140394f;
                                    if (linkedList2 == null) {
                                        Log.m105929w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null.", Integer.valueOf(next.f135172d), next2.f140392d);
                                    } else {
                                        Iterator<c45> it5 = linkedList2.iterator();
                                        while (it5.hasNext()) {
                                            c45 next3 = it5.next();
                                            if (next3 == null) {
                                                Log.m105929w("MicroMsg.XAgreementSettings", "[!] LangWordings(lang = %s).Items is null..", Integer.valueOf(next.f135172d), next2.f140392d);
                                            } else if (TextUtils.isEmpty(next3.f131510d)) {
                                                Log.m105928w("MicroMsg.XAgreementSettings", "[!] wodring key is empty, XAgreementId = " + next.f135172d + ", lang = " + next2.f140392d);
                                            } else {
                                                Log.m105919d("MicroMsg.XAgreementSettings", "XAgreementWordings: %s, %s, %s", next2.f140392d, next3.f131510d, next3.f131511e);
                                                String str = next3.f131510d;
                                                String str2 = next2.f140392d;
                                                g.putString(str + "@" + str2, next3.f131511e);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public static void m164660p(int i) {
        try {
            m164661q(i);
            ((ConcurrentHashMap) C116736d.f350037b.f350038a).clear();
            m164653i();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.XAgreementSettings", th, "", new Object[0]);
        }
    }

    /* renamed from: q */
    public static void m164661q(int i) {
        boolean z = true;
        Log.m105925i("MicroMsg.XAgreementSettings", "Save XAgreementId %s", Integer.valueOf(i));
        if (WeChatBrands.UserInfo.xagreementId == i) {
            Log.m105924i("MicroMsg.XAgreementSettings", "no need to update current XAgreementId");
            return;
        }
        String d = m164648d();
        if (d != null) {
            MultiProcessMMKV s = m164663s("xagreement_id_store");
            if (s != null) {
                s.encode(d, i);
            }
        } else {
            Log.m105920e("MicroMsg.XAgreementSettings", "[!] saving xagreementId, but uin is invalid");
        }
        if (C31472g.f84195a == -1) {
            z = false;
        }
        if (z) {
            Log.m105928w("MicroMsg.XAgreementSettings", "skip and ust test XAgreementId, update = " + i + ", test = " + C31472g.f84195a);
            return;
        }
        m164664t(i);
    }

    /* renamed from: r */
    public static String m164662r(String str) {
        return C116736d.f350037b.apply(str, new PInt());
    }

    /* renamed from: s */
    public static MultiProcessMMKV m164663s(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return MultiProcessMMKV.getMMKV(str);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.XAgreementSettings", th, "try get mmkv fail!", new Object[0]);
            return null;
        }
    }

    /* renamed from: t */
    public static void m164664t(int i) {
        WeChatBrands.update(i);
        C116736d dVar = C116736d.f350037b;
        ((C116736d.C116737a) dVar).reload();
        WeChatBrands.updateReplacer(dVar);
        WeChatBrands.updateReplacer(new C116735c());
    }
}
