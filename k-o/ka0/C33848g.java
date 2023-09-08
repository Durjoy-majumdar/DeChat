package ka0;

import android.content.Context;
import android.util.SparseArray;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.maas.MJMaasNativeVersion;
import com.tencent.p014mm.autogen.mmdata.rpt.MaasSdkResStruct;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ja0.C33530g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.locks.ReentrantLock;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p206nj.C88957l;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: ka0.g */
public final class C33848g {

    /* renamed from: a */
    public static final C33848g f91487a = new C33848g();

    /* renamed from: b */
    public static boolean f91488b;

    /* renamed from: c */
    public static final ReentrantLock f91489c = new ReentrantLock();

    /* renamed from: d */
    public static final ReentrantLock f91490d = new ReentrantLock();

    /* renamed from: e */
    public static String f91491e = "#MaasSdkVersion:not_load";

    /* renamed from: ka0.g$a */
    public static final class C33849a implements ICrashReporter.ICrashReportExtraMessageGetter {

        /* renamed from: d */
        public static final C33849a f91492d = new C33849a();

        public final String getCrashReportExtraMessage() {
            return C33848g.f91491e;
        }
    }

    /* renamed from: ka0.g$b */
    public static final class C33850b extends C87413o implements C32226l<C33845d, CharSequence> {

        /* renamed from: d */
        public static final C33850b f91493d = new C33850b();

        public C33850b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C33845d dVar = (C33845d) obj;
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            return String.valueOf(dVar.f91476a);
        }
    }

    /* renamed from: ka0.g$c */
    public static final class C33851c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C33845d) t2).f91476a), Integer.valueOf(((C33845d) t).f91476a));
        }
    }

    /* renamed from: ka0.g$d */
    public static final class C33852d extends C87413o implements C32226l<C33845d, CharSequence> {

        /* renamed from: d */
        public static final C33852d f91494d = new C33852d();

        public C33852d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C33845d dVar = (C33845d) obj;
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            return String.valueOf(dVar.f91476a);
        }
    }

    /* renamed from: ka0.g$e */
    public static final class C33853e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C33853e f91495d = new C33853e();

        public C33853e() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) "load maassdk from " + C33847f.f91483a, 4000);
            return C13598b0.f38549a;
        }
    }

    static {
        CrashReportFactory.addCrashReportExtraMessageGetter(C33849a.f91492d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0239 A[EDGE_INSN: B:61:0x0239->B:54:0x0239 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59321a() {
        /*
            r16 = this;
            ka0.j r0 = ka0.C33855j.f91497a
            boolean r1 = r0.mo59331c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r0.mo59329a()
            java.lang.String r3 = "KEY_SDK_COMPAT_VERSION"
            r4 = 0
            int r2 = r2.getInt(r3, r4)
            java.lang.String r5 = r16.mo59325e()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "mergeBin: need update "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ", target version 11100015, currentSha1:"
            r6.append(r7)
            java.lang.String r0 = r0.mo59330b()
            r6.append(r0)
            java.lang.String r0 = ", file:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "MicroMsg.MaasSdkResMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 11100015(0xa95f6f, float:1.5554434E-38)
            if (r1 != 0) goto L_0x0055
            if (r2 != r0) goto L_0x0055
            if (r5 == 0) goto L_0x0055
            return
        L_0x0055:
            ka0.e r1 = r16.mo59323c()
            if (r1 == 0) goto L_0x0070
            int r5 = r1.mo59320a()
            if (r5 != r0) goto L_0x0063
            r5 = 1
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            if (r5 == 0) goto L_0x0070
            java.util.LinkedList<ka0.d> r5 = r1.f91482a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0070
            r5 = 1
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            if (r5 == 0) goto L_0x024a
            if (r1 == 0) goto L_0x024a
            com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct
            r5.<init>()
            r5.f79121d = r0
            r0 = 3
            r5.f79124g = r0
            java.lang.String r7 = "maas_sdk"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            java.lang.String r8 = "getMMKV(kvName)"
            gy3.C87412m.m108593f(r0, r8)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "KEY_SDK_UPDATE_TIME"
            r0.putLong(r11, r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r9 = "KEY_SDK_LOAD_START"
            r0.putInt(r9, r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r9 = "KEY_SDK_LOAD_END"
            r0.putInt(r9, r4)
            java.lang.String r0 = ka0.C33847f.f91486d
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)
            java.lang.String r0 = ka0.C33847f.f91486d
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = ka0.C33847f.f91486d
            r0.append(r9)
            java.lang.String r9 = "/libMaasSDK.so"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r10 = "_temp"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.util.LinkedList<ka0.d> r0 = r1.f91482a
            java.util.Iterator r11 = r0.iterator()
            r0 = 0
        L_0x00e0:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x01dc
            java.lang.Object r0 = r11.next()
            r13 = r0
            ka0.d r13 = (ka0.C33845d) r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = ka0.C33847f.f91484b
            r0.append(r14)
            r15 = 47
            r0.append(r15)
            int r12 = r13.f91476a
            r0.append(r12)
            java.lang.String r12 = "/bin"
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            int r12 = r13.f91478c
            int r2 = r13.f91479d
            if (r12 == r2) goto L_0x0112
            r2 = 1
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            if (r2 != 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "mergeBin: base "
            r2.append(r12)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r9)
            ka0.g r0 = f91487a
            java.lang.String r0 = r0.mo59324d(r9)
            java.lang.String r2 = r13.f91481f
            boolean r2 = gy3.C87412m.m108589b(r0, r2)
            if (r2 != 0) goto L_0x00e0
            com.tencent.p014mm.vfs.C86013q1.m106447h(r9)
            goto L_0x0239
        L_0x013f:
            ka0.g r2 = f91487a     // Catch:{ Exception -> 0x018d }
            java.lang.String r2 = r2.mo59324d(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r12 = r13.f91480e     // Catch:{ Exception -> 0x018d }
            boolean r12 = gy3.C87412m.m108589b(r2, r12)     // Catch:{ Exception -> 0x018d }
            if (r12 == 0) goto L_0x0161
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x018d }
            r2.<init>(r9)     // Catch:{ Exception -> 0x018d }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x018d }
            r12.<init>(r10)     // Catch:{ Exception -> 0x018d }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x018d }
            r14.<init>(r0)     // Catch:{ Exception -> 0x018d }
            int r0 = ka0.C88124b.m109722a(r2, r12, r14, r4)     // Catch:{ Exception -> 0x018d }
            goto L_0x0196
        L_0x0161:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r0.<init>()     // Catch:{ Exception -> 0x018d }
            r0.append(r14)     // Catch:{ Exception -> 0x018d }
            r0.append(r15)     // Catch:{ Exception -> 0x018d }
            int r12 = r13.f91476a     // Catch:{ Exception -> 0x018d }
            r0.append(r12)     // Catch:{ Exception -> 0x018d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018d }
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r0.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r12 = "patch file sha1 error "
            r0.append(r12)     // Catch:{ Exception -> 0x018d }
            r0.append(r2)     // Catch:{ Exception -> 0x018d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018d }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)     // Catch:{ Exception -> 0x018d }
            goto L_0x0195
        L_0x018d:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r12 = "patch fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r12, r2)
        L_0x0195:
            r0 = 2
        L_0x0196:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "mergeBin: patch ret="
            r2.append(r12)
            r2.append(r0)
            r12 = 32
            r2.append(r12)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 1
            if (r0 != r2) goto L_0x0239
            ka0.g r0 = f91487a
            java.lang.String r0 = r0.mo59324d(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "mergeBin: patch sha1="
            r2.append(r12)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            java.lang.String r2 = r13.f91481f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0239
            com.tencent.p014mm.vfs.C86013q1.m106463x(r10, r9)
            goto L_0x00e0
        L_0x01dc:
            int r2 = r1.mo59320a()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            gy3.C87412m.m108593f(r4, r8)
            r4.putInt(r3, r2)
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = ""
        L_0x01ee:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            gy3.C87412m.m108593f(r2, r8)
            java.lang.String r3 = "KEY_SDK_SHA1"
            r2.putString(r3, r0)
            java.util.LinkedList<ka0.d> r0 = r1.f91482a
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0244
            java.lang.Object r1 = r0.next()
            ka0.d r1 = (ka0.C33845d) r1
            int r1 = r1.f91478c
        L_0x020e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0220
            java.lang.Object r2 = r0.next()
            ka0.d r2 = (ka0.C33845d) r2
            int r2 = r2.f91478c
            if (r1 >= r2) goto L_0x020e
            r1 = r2
            goto L_0x020e
        L_0x0220:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r2 = "KEY_SDK_RES_VERSION"
            r0.putInt(r2, r1)
            java.lang.String r0 = "mergeBin: merge end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            ka0.h r0 = ka0.C33854h.f91496d
            r1 = 0
            r2 = 1
            o40.C61926c.m72658C(r1, r0, r2, r1)
            r4 = 1
        L_0x0239:
            ja0.C33530g.m40106a(r5, r4)
            if (r4 != 0) goto L_0x024a
            java.lang.String r0 = ka0.C33847f.f91486d
            com.tencent.p014mm.vfs.C86013q1.m106445f(r0)
            goto L_0x024a
        L_0x0244:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka0.C33848g.mo59321a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ka0.C33846e mo59322b(java.util.List<ka0.C33845d> r12, int r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "findCompatibleChain: from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MaasSdkResMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            ka0.e r0 = new ka0.e
            r0.<init>()
            int r2 = r12.size()
            r3 = 0
            r4 = -1
            r5 = r3
        L_0x0022:
            if (r13 >= r2) goto L_0x00b9
            java.lang.Object r6 = r12.get(r13)
            ka0.d r6 = (ka0.C33845d) r6
            java.lang.String r7 = ", "
            r8 = 1
            if (r5 != 0) goto L_0x003c
            int r9 = r6.f91477b
            r10 = 11100015(0xa95f6f, float:1.5554434E-38)
            if (r9 != r10) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            if (r8 == 0) goto L_0x0043
            r4 = r13
            goto L_0x0042
        L_0x003c:
            int r9 = r6.f91478c
            int r10 = r5.f91479d
            if (r9 != r10) goto L_0x0095
        L_0x0042:
            r5 = r6
        L_0x0043:
            if (r5 == 0) goto L_0x0092
            java.util.LinkedList<ka0.d> r6 = r0.f91482a
            r6.add(r5)
            int r6 = r5.f91479d
            int r8 = r5.f91478c
            if (r6 != r8) goto L_0x0092
            java.util.LinkedList<ka0.d> r12 = r0.f91482a
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r12, r2)
            java.util.Collections.reverse(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "findCompatibleChain: find index:["
            r12.append(r2)
            r12.append(r4)
            r12.append(r7)
            r12.append(r13)
            java.lang.String r13 = "], subtype:["
            r12.append(r13)
            java.util.LinkedList<ka0.d> r2 = r0.f91482a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            ka0.g$b r8 = ka0.C33848g.C33850b.f91493d
            r9 = 31
            r10 = 0
            java.lang.String r13 = sx3.C110818d0.m150921S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.append(r13)
            r13 = 93
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return r0
        L_0x0092:
            int r13 = r13 + 1
            goto L_0x0022
        L_0x0095:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "findCompatibleChain: version error "
            r13.append(r0)
            int r0 = r6.f91478c
            r13.append(r0)
            r13.append(r7)
            int r0 = r5.f91479d
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r13)
            int r4 = r4 + r8
            ka0.e r12 = r11.mo59322b(r12, r4)
            return r12
        L_0x00b9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ka0.C33848g.mo59322b(java.util.List, int):ka0.e");
    }

    /* renamed from: c */
    public final C33846e mo59323c() {
        MaasSdkResStruct maasSdkResStruct = new MaasSdkResStruct();
        maasSdkResStruct.f79121d = 11100015;
        maasSdkResStruct.f79124g = 2;
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        Iterable<C86001b0> t = C86013q1.m106459t(C33847f.f91484b, false);
        if (t != null) {
            for (C86001b0 next : t) {
                int i = Util.getInt(next.f250472b, -1);
                if (i >= 0) {
                    String str = C33847f.f91484b + XVFSFile.SEPARATOR_CHAR + next.f250472b + "/config.json";
                    C33845d dVar = new C33845d();
                    C87412m.m108594g(str, "jsonFile");
                    try {
                        dVar.mo59317b(new JSONObject(C86013q1.m106432N(str)));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BaseJsonObject", e, "", new Object[0]);
                    }
                    if (dVar.mo59318c()) {
                        dVar.f91476a = i;
                        arrayList.add(dVar);
                        sparseArray.put(i, dVar);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C77813z.m93909o(arrayList, new C33851c());
        }
        Log.m105924i("MicroMsg.MaasSdkResMgr", "mergeBin: list " + C110818d0.m150921S(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33852d.f91494d, 31, (Object) null));
        C33846e b = mo59322b(arrayList, 0);
        if (b != null) {
            if ((b.mo59320a() == 11100015) && b.f91482a.size() > 0) {
                z = true;
            }
        }
        C33530g.m40106a(maasSdkResStruct, z);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        cy3.C58003b.m67160a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        throw r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo59324d(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.MaasSdkResMgr"
            r1 = 0
            r2 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = "SHA1"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ all -> 0x0057 }
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ all -> 0x0057 }
            if (r6 == 0) goto L_0x005f
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0057 }
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r9)     // Catch:{ all -> 0x0057 }
            int r7 = r9.read(r6)     // Catch:{ all -> 0x0050 }
        L_0x0020:
            if (r7 <= 0) goto L_0x002a
            r5.update(r6, r2, r7)     // Catch:{ all -> 0x0050 }
            int r7 = r9.read(r6)     // Catch:{ all -> 0x0050 }
            goto L_0x0020
        L_0x002a:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0050 }
            cy3.C58003b.m67160a(r9, r1)     // Catch:{ all -> 0x0057 }
            byte[] r9 = r5.digest()     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r5.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = "getSha1: cost "
            r5.append(r6)     // Catch:{ all -> 0x0057 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)     // Catch:{ all -> 0x0057 }
            r5.append(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0057 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r9)     // Catch:{ all -> 0x0057 }
            return r9
        L_0x0050:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r4 = move-exception
            cy3.C58003b.m67160a(r9, r3)     // Catch:{ all -> 0x0057 }
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getSha1 error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r3, r2)
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ka0.C33848g.mo59324d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public final String mo59325e() {
        StringBuilder sb = new StringBuilder();
        String str = C33847f.f91483a;
        sb.append(C33847f.f91486d);
        sb.append("/libMaasSDK.so");
        return sb.toString();
    }

    /* renamed from: f */
    public final boolean mo59326f() {
        if (!BuildInfo.IS_ARM64) {
            Log.m105928w("MicroMsg.MaasSdkResMgr", "load sdk only arm64");
            return false;
        } else if (BuildInfo.MAAS_IN_PKG) {
            Log.m105924i("MicroMsg.MaasSdkResMgr", "maas in pkg");
            f91488b = true;
            C88957l.m111078n("MaasSDK");
            f91491e = "#MaasSdkVersion(InPackage):" + MJMaasNativeVersion.getFullVersion();
            return true;
        } else {
            Log.m105924i("MicroMsg.MaasSdkResMgr", "loadSdk: isLoaded:" + f91488b);
            if (f91488b) {
                return true;
            }
            ReentrantLock reentrantLock = f91489c;
            reentrantLock.lock();
            ReentrantLock reentrantLock2 = f91490d;
            reentrantLock2.lock();
            try {
                if (!f91488b) {
                    mo59321a();
                }
                reentrantLock.unlock();
                reentrantLock2.unlock();
                MaasSdkResStruct maasSdkResStruct = new MaasSdkResStruct();
                maasSdkResStruct.f79121d = 11100015;
                maasSdkResStruct.f79124g = 1;
                C33855j jVar = C33855j.f91497a;
                int i = jVar.mo59329a().getInt("KEY_SDK_LOAD_START", 0) - jVar.mo59329a().getInt("KEY_SDK_LOAD_END", 0);
                maasSdkResStruct.f79122e = jVar.mo59329a().getInt("KEY_SDK_COMPAT_VERSION", 0);
                maasSdkResStruct.f79126i = i;
                maasSdkResStruct.f79127j = jVar.mo59329a().getInt("KEY_SDK_RES_VERSION", 0);
                maasSdkResStruct.f79128k = maasSdkResStruct.mo86045b("Sha1", jVar.mo59330b(), true);
                int i2 = jVar.mo59329a().getInt("KEY_SDK_COMPAT_VERSION", 0);
                Log.m105924i("MicroMsg.MaasSdkResMgr", "loadSdk: load fail count:" + i + "; compat version " + i2);
                if (i > 1) {
                    C33530g.m40106a(maasSdkResStruct, false);
                    return false;
                } else if (i2 != 11100015) {
                    C33530g.m40106a(maasSdkResStruct, false);
                    return false;
                } else if (!C86013q1.m106450k(mo59325e())) {
                    return false;
                } else {
                    Log.m105924i("MicroMsg.MaasSdkResMgr", "loadSdk: start");
                    f91488b = true;
                    jVar.mo59329a().putInt("KEY_SDK_LOAD_START", jVar.mo59329a().getInt("KEY_SDK_LOAD_START", 0) + 1);
                    if (C87412m.m108589b(C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Maas_LoadSoFromSdCard_Int, 0), 1)) {
                        Log.m105928w("MicroMsg.MaasSdkResMgr", "loadSdkNoLock: load from sd card");
                        C61926c.m72668M(C33853e.f91495d);
                        C88957l.m111067c(C33847f.f91483a);
                    } else {
                        C88957l.m111067c(C33847f.f91486d);
                    }
                    C88957l.m111078n("MaasSDK");
                    jVar.mo59329a().putInt("KEY_SDK_LOAD_END", jVar.mo59329a().getInt("KEY_SDK_LOAD_END", 0) + 1);
                    Log.m105924i("MicroMsg.MaasSdkResMgr", "loadSdk: end");
                    C33530g.m40106a(maasSdkResStruct, true);
                    f91491e = "#MaasSdkVersion:" + MJMaasNativeVersion.getFullVersion();
                    return true;
                }
            } catch (Throwable th) {
                f91489c.unlock();
                f91490d.unlock();
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo59327g(int i, String str) {
        MaasSdkResStruct maasSdkResStruct = new MaasSdkResStruct();
        maasSdkResStruct.f79121d = 11100015;
        maasSdkResStruct.f79124g = 4;
        maasSdkResStruct.f79125h = i;
        boolean z = false;
        if (str == null) {
            Log.m105928w("MicroMsg.MaasSdkResMgr", "unzipRes: path is null");
            C33530g.m40106a(maasSdkResStruct, false);
            return false;
        }
        String str2 = C33847f.f91485c;
        C86013q1.m106445f(str2);
        C86013q1.m106461v(str2);
        int R = C86013q1.m106436R(str, str2);
        if (R != 0) {
            Log.m105928w("MicroMsg.MaasSdkResMgr", "unzipRes: unzip failed " + R);
            C33530g.m40106a(maasSdkResStruct, false);
            return false;
        }
        String str3 = str2 + "/config.json";
        C33845d dVar = new C33845d();
        C87412m.m108594g(str3, "jsonFile");
        try {
            dVar.mo59317b(new JSONObject(C86013q1.m106432N(str3)));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BaseJsonObject", e, "", new Object[0]);
        }
        if (!dVar.mo59318c()) {
            Log.m105928w("MicroMsg.MaasSdkResMgr", "unzipRes: config is invalid " + dVar);
            C33530g.m40106a(maasSdkResStruct, false);
            return false;
        }
        maasSdkResStruct.f79122e = dVar.f91477b;
        maasSdkResStruct.f79127j = dVar.f91478c;
        maasSdkResStruct.f79128k = maasSdkResStruct.mo86045b("Sha1", dVar.f91480e, true);
        if (Util.isEqual(mo59324d(str2 + "/bin"), dVar.f91480e)) {
            StringBuilder sb = new StringBuilder();
            String str4 = C33847f.f91484b;
            sb.append(str4);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(i);
            String sb4 = sb.toString();
            C86013q1.m106445f(sb4);
            C86013q1.m106461v(str4);
            C86013q1.m106441b(str2, sb4);
            if (dVar.f91477b == 11100015) {
                z = true;
            }
            if (z) {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_sdk");
                C87412m.m108593f(mmkv, "getMMKV(kvName)");
                mmkv.putLong("KEY_RES_UPDATE_TIME", System.currentTimeMillis());
            }
            C33530g.m40106a(maasSdkResStruct, true);
            return true;
        }
        C33530g.m40106a(maasSdkResStruct, false);
        return false;
    }
}
