package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.SystemClock;
import android.util.SparseLongArray;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotParams;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import p206nj.C117627q;
import p284zb.C91635f;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110820m;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.u0 */
public final class C84868u0 {

    /* renamed from: a */
    public static final C84868u0 f247366a = new C84868u0();

    /* renamed from: b */
    public static final C84870b f247367b = new C84870b();

    /* renamed from: c */
    public static final C13601g f247368c = C36568h.m40985a(C29703c.f80681d);

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.u0$c */
    public static final class C29703c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29703c f80681d = new C29703c();

        public C29703c() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) || 1 == new Random().nextInt(100)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "shouldReportNormalAction: " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.u0$a */
    public enum C84869a {
        CreateIsolate(1),
        AllocEmptySubContext(2),
        BootstrapSubContext(3),
        AllocSnapshotSubContext(4),
        BootstrapSnapshotSubContext(5);
        

        /* renamed from: d */
        public final int f247375d;

        /* access modifiers changed from: public */
        C84869a(int i) {
            this.f247375d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.u0$b */
    public static final class C84870b extends ThreadLocal<SparseLongArray> {
        /* renamed from: a */
        public SparseLongArray get() {
            SparseLongArray sparseLongArray = (SparseLongArray) super.get();
            if (sparseLongArray != null) {
                return sparseLongArray;
            }
            SparseLongArray sparseLongArray2 = new SparseLongArray();
            set(sparseLongArray2);
            return sparseLongArray2;
        }
    }

    /* renamed from: a */
    public final int mo117604a(C84217q qVar) {
        return (qVar != null ? qVar.ordinal() : -1) + 1;
    }

    /* renamed from: b */
    public final boolean mo117605b() {
        return ((Boolean) ((C36570n) f247368c).getValue()).booleanValue();
    }

    /* renamed from: c */
    public final long mo117606c(C84869a aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        return uptimeMillis - f247367b.get().get(aVar.f247375d, 1 + uptimeMillis);
    }

    /* renamed from: d */
    public final void mo117607d(C84869a aVar) {
        f247367b.get().put(aVar.f247375d, SystemClock.uptimeMillis());
    }

    /* renamed from: e */
    public final void mo117608e(boolean z, C91635f fVar) {
        long c = mo117606c(C84869a.AllocEmptySubContext);
        C84217q qVar = fVar != null ? fVar.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextEnd, costTimeMs: " + c + ", allocSuccess: " + z + ", componentInitType: " + qVar);
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 8;
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(c);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(z ? "1" : "0");
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: f */
    public final void mo117609f(ICommLibReader iCommLibReader, String str, boolean z, C91635f fVar) {
        String str2;
        long c = mo117606c(C84869a.AllocSnapshotSubContext);
        String str3 = null;
        C84217q qVar = fVar != null ? fVar.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onAllocSnapshotSubContextEnd, costTimeMs: ");
            sb.append(c);
            sb.append(", commLibReader: ");
            if (iCommLibReader != null) {
                str3 = mo117623t(iCommLibReader);
            }
            sb.append(str3);
            sb.append(", contextName: ");
            sb.append(str);
            sb.append(", allocSuccess: ");
            sb.append(z);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 11;
            if (iCommLibReader == null || (str2 = mo117623t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str2);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(c);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo112528u(z ? "1" : "0");
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: g */
    public final void mo117610g(ICommLibReader iCommLibReader, String str) {
        String str2;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onAllocSnapshotSubContextStart, commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", contextName: ");
            sb.append(str);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        mo117607d(C84869a.AllocSnapshotSubContext);
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 10;
            if (iCommLibReader == null || (str2 = mo117623t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str2);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: h */
    public final void mo117611h(ICommLibReader iCommLibReader, String str, boolean z, C80669j.C80676g gVar, C91635f fVar) {
        long j = gVar == null ? 0 : gVar.f236059b - gVar.f236058a;
        String str2 = null;
        C84217q qVar = fVar != null ? fVar.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapMainContext, costTimeMs: ");
            sb.append(j);
            sb.append(", commLibReader: ");
            if (iCommLibReader != null) {
                str2 = mo117623t(iCommLibReader);
            }
            sb.append(str2);
            sb.append(", scriptName: ");
            sb.append(str);
            sb.append(", bootstrapSuccess: ");
            sb.append(z);
            sb.append(", executeDetails: ");
            sb.append(gVar);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 15;
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(j);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo112528u(String.valueOf((z ? 1 : -1) * (gVar != null ? gVar.codeCacheStatus : 0)));
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: i */
    public final void mo117612i(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, boolean z, C80669j.C80676g gVar, C91635f fVar) {
        String str;
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        long j = gVar == null ? 0 : gVar.f236059b - gVar.f236058a;
        String str2 = null;
        C84217q qVar = fVar != null ? fVar.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSnapshotMainContextEnd, costTimeMs: ");
            sb.append(j);
            sb.append(", commLibReader: ");
            if (iCommLibReader != null) {
                str2 = mo117623t(iCommLibReader);
            }
            sb.append(str2);
            sb.append(", category: ");
            sb.append(wxaPkgV8SnapshotInfo.f247272h);
            sb.append(", bootstrapSuccess: ");
            sb.append(z);
            sb.append(", executeDetails: ");
            sb.append(gVar);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 17;
            if (iCommLibReader == null || (str = mo117623t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(j);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(String.valueOf(z));
            androidWAServiceLibSnapshotQualityStruct.mo112528u(wxaPkgV8SnapshotInfo.f247272h.f247381d);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: j */
    public final void mo117613j(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        String str;
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSnapshotMainContextStart, commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", category: ");
            sb.append(wxaPkgV8SnapshotInfo.f247272h);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 16;
            if (iCommLibReader == null || (str = mo117623t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(wxaPkgV8SnapshotInfo.f247272h.f247381d);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: k */
    public final void mo117614k(ICommLibReader iCommLibReader, String str, C91635f fVar) {
        String str2;
        long c = mo117606c(C84869a.BootstrapSnapshotSubContext);
        String str3 = null;
        C84217q qVar = fVar != null ? fVar.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSnapshotSubContextEnd, costTimeMs: ");
            sb.append(c);
            sb.append(", commLibReader: ");
            if (iCommLibReader != null) {
                str3 = mo117623t(iCommLibReader);
            }
            sb.append(str3);
            sb.append(", contextName: ");
            sb.append(str);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 13;
            if (iCommLibReader == null || (str2 = mo117623t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str2);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(c);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: l */
    public final void mo117615l(ICommLibReader iCommLibReader, String str) {
        String str2;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSnapshotSubContextStart, commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", contextName: ");
            sb.append(str);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        mo117607d(C84869a.BootstrapSnapshotSubContext);
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 12;
            if (iCommLibReader == null || (str2 = mo117623t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str2);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: m */
    public final void mo117616m(ICommLibReader iCommLibReader, String str, List<Boolean> list, List<? extends C80669j.C80676g> list2, C91635f fVar) {
        String str2;
        String str3 = str;
        List<Boolean> list3 = list;
        List<? extends C80669j.C80676g> list4 = list2;
        C91635f fVar2 = fVar;
        long c = mo117606c(C84869a.BootstrapSubContext);
        String str4 = null;
        C84217q qVar = fVar2 != null ? fVar2.f262594I : null;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSubContextEnd, costTimeMs: ");
            sb.append(c);
            sb.append(", commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", scriptName: ");
            sb.append(str3);
            sb.append(", bootstrapSuccess: ");
            if (list3 != null) {
                Object[] array = list3.toArray(new Boolean[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                str2 = C110820m.m150955b((Boolean[]) array);
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append(", executeDetails: ");
            if (list4 != null) {
                Object[] array2 = list4.toArray(new C80669j.C80676g[0]);
                C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                str4 = Arrays.toString((C80669j.C80676g[]) array2);
                C87412m.m108593f(str4, "toString(this)");
            }
            sb.append(str4);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            String str5 = "";
            if (!(list3 == null || list4 == null || list.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < size) {
                        Boolean bool = list3.get(i);
                        if (bool == null) {
                            i2 = 0;
                        } else if (!C87412m.m108589b(bool, Boolean.TRUE)) {
                            if (C87412m.m108589b(bool, Boolean.FALSE)) {
                                i2 = -1;
                            } else {
                                throw new C13603j();
                            }
                        }
                        C80669j.C80676g gVar = (C80669j.C80676g) list4.get(i);
                        arrayList.add(Integer.valueOf(i2 * (gVar != null ? gVar.codeCacheStatus : 0)));
                        i++;
                    } else {
                        str5 = 1 == arrayList.size() ? String.valueOf(((Number) arrayList.get(0)).intValue()) : C110818d0.m150921S(arrayList, "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                    }
                }
            }
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onBootstrapSubContextEnd, actionParams2: " + str5);
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 9;
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            androidWAServiceLibSnapshotQualityStruct.mo112526s(c);
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str3);
            androidWAServiceLibSnapshotQualityStruct.mo112528u(str5);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: n */
    public final void mo117617n(ICommLibReader iCommLibReader, String str) {
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBootstrapSubContextStart, commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", scriptName: ");
            sb.append(str);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        mo117607d(C84869a.BootstrapSubContext);
    }

    /* renamed from: o */
    public final void mo117618o(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, long j, long j2, boolean z, C91635f fVar) {
        String str;
        C84872v0 v0Var;
        String str2;
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = wxaPkgV8SnapshotInfo;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        C91635f fVar2 = fVar;
        long c = mo117606c(C84869a.CreateIsolate);
        String str3 = null;
        C84217q qVar = fVar2 != null ? fVar2.f262594I : null;
        boolean z3 = false;
        boolean z4 = wxaPkgV8SnapshotInfo2 != null ? wxaPkgV8SnapshotInfo2.f247278q : false;
        C84840f0.f247297a.getClass();
        String str4 = "";
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateIsolateEnd, ");
            sb.append(wxaPkgV8SnapshotInfo2 != null ? str4 : "not ");
            sb.append("use snapshot, costTimeMs: ");
            sb.append(c);
            sb.append(", isolateCreateCostMs: ");
            sb.append(j3);
            sb.append(", contextCreateCostMs: ");
            sb.append(j4);
            sb.append(", didRecover: ");
            sb.append(z2);
            sb.append(", isNodeSnapshot: ");
            sb.append(z4);
            sb.append(", commLibReader: ");
            if (iCommLibReader != null) {
                str3 = mo117623t(iCommLibReader);
            }
            sb.append(str3);
            sb.append(", componentInitType: ");
            sb.append(qVar);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (wxaPkgV8SnapshotInfo2 != null) {
            z3 = true;
        }
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 7;
            if (iCommLibReader == null || (str = mo117623t(iCommLibReader)) == null) {
                str = str4;
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.f236330l = mo117604a(qVar);
            int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            boolean z5 = z3;
            androidWAServiceLibSnapshotQualityStruct.mo112526s(i >= 0 ? j3 : c);
            String str5 = "1";
            androidWAServiceLibSnapshotQualityStruct.mo112527t(z5 ? str5 : "0");
            int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
            androidWAServiceLibSnapshotQualityStruct.mo112528u(i2 >= 0 ? String.valueOf(j2) : str4);
            if (!(wxaPkgV8SnapshotInfo2 == null || (v0Var = wxaPkgV8SnapshotInfo2.f247272h) == null || (str2 = v0Var.f247381d) == null)) {
                str4 = str2;
            }
            androidWAServiceLibSnapshotQualityStruct.f236328j = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams3", str4, true);
            if (i < 0) {
                j3 = 0;
            }
            androidWAServiceLibSnapshotQualityStruct.f236329k = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams4", String.valueOf((c - j3) - (i2 >= 0 ? j4 : 0)), true);
            androidWAServiceLibSnapshotQualityStruct.f236331m = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams5", z2 ? str5 : "0", true);
            if (!z4) {
                str5 = "0";
            }
            androidWAServiceLibSnapshotQualityStruct.f236332n = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams6", str5, true);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: p */
    public final void mo117619p(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        String str;
        C84872v0 v0Var;
        String str2;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            String str3 = null;
            if (wxaPkgV8SnapshotInfo != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onCreateIsolateStart, use snapshot, commLibReader: ");
                if (iCommLibReader != null) {
                    str3 = mo117623t(iCommLibReader);
                }
                sb.append(str3);
                sb.append(", metaInfo: ");
                sb.append(wxaPkgV8SnapshotInfo.f247277p);
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onCreateIsolateStart, not use snapshot, commLibReader: ");
                if (iCommLibReader != null) {
                    str3 = mo117623t(iCommLibReader);
                }
                sb4.append(str3);
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb4.toString());
            }
        }
        mo117607d(C84869a.CreateIsolate);
        boolean z = wxaPkgV8SnapshotInfo != null;
        if (mo117605b()) {
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 6;
            String str4 = "";
            if (iCommLibReader == null || (str = mo117623t(iCommLibReader)) == null) {
                str = str4;
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(z ? "1" : "0");
            if (!(wxaPkgV8SnapshotInfo == null || (v0Var = wxaPkgV8SnapshotInfo.f247272h) == null || (str2 = v0Var.f247381d) == null)) {
                str4 = str2;
            }
            androidWAServiceLibSnapshotQualityStruct.mo112528u(str4);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: q */
    public final void mo117620q(ICommLibReader iCommLibReader, CreateSnapshotParams createSnapshotParams) {
        C87412m.m108594g(iCommLibReader, "commLibReader");
        C87412m.m108594g(createSnapshotParams, "params");
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onCreateSnapshotStart, commLibReader: " + mo117623t(iCommLibReader) + ", params: " + createSnapshotParams);
        }
    }

    /* renamed from: r */
    public final void mo117621r(ICommLibReader iCommLibReader, String str, String str2, String str3) {
        String str4;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            StringBuilder sb = new StringBuilder();
            sb.append("onJsErrorInSnapshotContext, commLibReader: ");
            sb.append(iCommLibReader != null ? mo117623t(iCommLibReader) : null);
            sb.append(", contextName: ");
            sb.append(str);
            sb.append(", message: ");
            sb.append(str2);
            sb.append(", stackTrace: ");
            sb.append(str3);
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", sb.toString());
        }
        if (mo117605b()) {
            String str5 = "{message: '" + str2 + "', stack: '" + str3 + "'}";
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 14;
            if (iCommLibReader == null || (str4 = mo117623t(iCommLibReader)) == null) {
                str4 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.mo112529v(str4);
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(str);
            androidWAServiceLibSnapshotQualityStruct.mo112528u(C117627q.m165909b(str5, "UTF-8"));
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: s */
    public final void mo117622s(ICommLibReader iCommLibReader, C84872v0 v0Var, int i, int i2, boolean z, boolean z2) {
        C87412m.m108594g(iCommLibReader, "commLibReader");
        C87412m.m108594g(v0Var, "category");
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotUseBlock, commLibReader: " + mo117623t(iCommLibReader) + ", category: " + v0Var + ", useExceptionCount: " + i + ", recoverCount: " + i2 + ", isV8VersionMisMatched: " + z + ", isSnapshotBad: " + z2);
        }
        C115669n.INSTANCE.mo175911u(1923, 2);
        if (mo117605b()) {
            if (z2) {
                z |= true;
            }
            AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f236322d = 3;
            androidWAServiceLibSnapshotQualityStruct.mo112529v(mo117623t(iCommLibReader));
            androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
            androidWAServiceLibSnapshotQualityStruct.mo112527t(String.valueOf(i));
            androidWAServiceLibSnapshotQualityStruct.mo112528u(String.valueOf(z ? 1 : 0));
            androidWAServiceLibSnapshotQualityStruct.f236328j = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams3", v0Var.f247381d, true);
            androidWAServiceLibSnapshotQualityStruct.f236329k = androidWAServiceLibSnapshotQualityStruct.mo86045b("ActionParams4", String.valueOf(i2), true);
            androidWAServiceLibSnapshotQualityStruct.mo86054n();
        }
    }

    /* renamed from: t */
    public final String mo117623t(ICommLibReader iCommLibReader) {
        return '[' + iCommLibReader.mo113371a() + "][" + iCommLibReader.mo113367M() + ']';
    }
}
