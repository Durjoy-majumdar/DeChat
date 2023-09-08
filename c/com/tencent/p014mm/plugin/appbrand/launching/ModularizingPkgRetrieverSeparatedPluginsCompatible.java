package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.launching.C80241b;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.luggage.sdk.launching.C80243d;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor;
import com.tencent.p014mm.plugin.appbrand.launching.C83344j1;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.utils.C84774n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jp3.C9486a;
import kotlin.Metadata;
import lu3.C34379c;
import op0.C11703d;
import op0.C89259e;
import op0.C89260f;
import op0.C89261g;
import op0.C89269l;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C90422jy;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible */
public final class ModularizingPkgRetrieverSeparatedPluginsCompatible implements C9486a {

    /* renamed from: h */
    public static final /* synthetic */ int f243356h = 0;

    /* renamed from: d */
    public final String f243357d;

    /* renamed from: e */
    public AppBrandRuntime f243358e;

    /* renamed from: f */
    public C89260f f243359f;

    /* renamed from: g */
    public final IPCCallArgs f243360g;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs */
    public static final class IPCCallArgs implements Parcelable {
        public static final Parcelable.Creator<IPCCallArgs> CREATOR = new C83276a();

        /* renamed from: d */
        public String f243361d;

        /* renamed from: e */
        public String f243362e;

        /* renamed from: f */
        public int f243363f;

        /* renamed from: g */
        public int f243364g;

        /* renamed from: h */
        public WxaAttributes.WxaVersionInfo f243365h;

        /* renamed from: i */
        public boolean f243366i;

        /* renamed from: j */
        public boolean f243367j;

        /* renamed from: n */
        public boolean f243368n;

        /* renamed from: o */
        public ICommLibReader f243369o;

        /* renamed from: p */
        public Map<String, Integer> f243370p;

        /* renamed from: q */
        public QualitySession f243371q;

        /* renamed from: r */
        public boolean f243372r;

        /* renamed from: s */
        public C80242c<IPCCallResult> f243373s;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs$a */
        public static final class C83276a implements Parcelable.Creator<IPCCallArgs> {
            public Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                C87412m.m108594g(parcel2, FirebaseAnalytics.C113379b.SOURCE);
                String readString = parcel.readString();
                C87412m.m108591d(readString);
                String readString2 = parcel.readString();
                C87412m.m108591d(readString2);
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Parcelable readParcelable = parcel2.readParcelable(WxaAttributes.WxaVersionInfo.class.getClassLoader());
                C87412m.m108591d(readParcelable);
                WxaAttributes.WxaVersionInfo wxaVersionInfo = (WxaAttributes.WxaVersionInfo) readParcelable;
                boolean z = parcel.readByte() > 0;
                boolean z2 = parcel.readByte() > 0;
                boolean z3 = parcel.readByte() > 0;
                ICommLibReader a = ICommLibReader.C29316b.m38623a(parcel);
                C87412m.m108593f(a, "readFromParcel(source)");
                HashMap hashMap = new HashMap();
                parcel2.readMap(hashMap, (ClassLoader) null);
                C13598b0 b0Var = C13598b0.f38549a;
                Parcelable readParcelable2 = parcel2.readParcelable(QualitySession.class.getClassLoader());
                C87412m.m108591d(readParcelable2);
                return new IPCCallArgs(readString, readString2, readInt, readInt2, wxaVersionInfo, z, z2, z3, a, hashMap, (QualitySession) readParcelable2, parcel.readByte() > 0, C80245f.m97631a(parcel));
            }

            public Object[] newArray(int i) {
                return new IPCCallArgs[i];
            }
        }

        public IPCCallArgs(String str, String str2, int i, int i2, WxaAttributes.WxaVersionInfo wxaVersionInfo, boolean z, boolean z2, boolean z3, ICommLibReader iCommLibReader, Map<String, Integer> map, QualitySession qualitySession, boolean z4, C80242c<IPCCallResult> cVar) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "moduleName");
            C87412m.m108594g(wxaVersionInfo, "wxaVersionInfo");
            C87412m.m108594g(iCommLibReader, "acceptedLibReader");
            C87412m.m108594g(qualitySession, "reportQualitySession");
            this.f243361d = str;
            this.f243362e = str2;
            this.f243363f = i;
            this.f243364g = i2;
            this.f243365h = wxaVersionInfo;
            this.f243366i = z;
            this.f243367j = z2;
            this.f243368n = z3;
            this.f243369o = iCommLibReader;
            this.f243370p = map;
            this.f243371q = qualitySession;
            this.f243372r = z4;
            this.f243373s = cVar;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f243361d);
            parcel.writeString(this.f243362e);
            parcel.writeInt(this.f243363f);
            parcel.writeInt(this.f243364g);
            parcel.writeParcelable(this.f243365h, 0);
            parcel.writeByte(this.f243366i ? (byte) 1 : 0);
            parcel.writeByte(this.f243367j ? (byte) 1 : 0);
            parcel.writeByte(this.f243368n ? (byte) 1 : 0);
            ICommLibReader.C29316b.m38624b(this.f243369o, parcel, i);
            parcel.writeMap(this.f243370p);
            parcel.writeParcelable(this.f243371q, 0);
            parcel.writeByte(this.f243372r ? (byte) 1 : 0);
            C80245f.m97634d(this.f243373s, parcel, 0, 4, (Object) null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallResult */
    public static final class IPCCallResult implements Parcelable {
        public static final Parcelable.Creator<IPCCallResult> CREATOR = new C83277a();

        /* renamed from: d */
        public int f243374d;

        /* renamed from: e */
        public WxaPkgLoadProgress f243375e;

        /* renamed from: f */
        public List<? extends IPkgInfo> f243376f;

        /* renamed from: g */
        public boolean f243377g;

        /* renamed from: h */
        public int f243378h;

        /* renamed from: i */
        public String f243379i;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallResult$a */
        public static final class C83277a implements Parcelable.Creator<IPCCallResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                IPCCallResult iPCCallResult = new IPCCallResult(0, (WxaPkgLoadProgress) null, (List) null, false, 0, (String) null, 62, (C8480h) null);
                int readInt = parcel.readInt();
                iPCCallResult.f243374d = readInt;
                boolean z = true;
                if (readInt == 1) {
                    iPCCallResult.f243375e = (WxaPkgLoadProgress) parcel.readParcelable(WxaPkgLoadProgress.class.getClassLoader());
                } else if (readInt == 2) {
                    int i = ModularizingPkgRetrieverSeparatedPluginsCompatible.f243356h;
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        String readString = parcel.readString();
                        ClassLoader classLoader = C87412m.m108589b(readString, ModulePkgInfo.class.getName()) ? ModulePkgInfo.class.getClassLoader() : C87412m.m108589b(readString, WxaPluginPkgInfo.class.getName()) ? WxaPluginPkgInfo.class.getClassLoader() : null;
                        C87412m.m108591d(classLoader);
                        Parcelable readParcelable = parcel.readParcelable(classLoader);
                        C87412m.m108592e(readParcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.IPkgInfo");
                        arrayList.add((IPkgInfo) readParcelable);
                    }
                    iPCCallResult.f243376f = arrayList;
                    if (parcel.readByte() <= 0) {
                        z = false;
                    }
                    iPCCallResult.f243377g = z;
                    iPCCallResult.f243378h = parcel.readInt();
                    iPCCallResult.f243379i = parcel.readString();
                }
                return iPCCallResult;
            }

            public Object[] newArray(int i) {
                return new IPCCallResult[i];
            }
        }

        public IPCCallResult(int i, WxaPkgLoadProgress wxaPkgLoadProgress, List<? extends IPkgInfo> list, boolean z, int i2, String str, int i3, C8480h hVar) {
            wxaPkgLoadProgress = (i3 & 2) != 0 ? null : wxaPkgLoadProgress;
            list = (i3 & 4) != 0 ? null : list;
            z = (i3 & 8) != 0 ? false : z;
            i2 = (i3 & 16) != 0 ? 0 : i2;
            str = (i3 & 32) != 0 ? null : str;
            this.f243374d = i;
            this.f243375e = wxaPkgLoadProgress;
            this.f243376f = list;
            this.f243377g = z;
            this.f243378h = i2;
            this.f243379i = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeInt(this.f243374d);
            int i2 = this.f243374d;
            if (i2 == 1) {
                parcel.writeParcelable(this.f243375e, 0);
            } else if (i2 == 2) {
                int i3 = ModularizingPkgRetrieverSeparatedPluginsCompatible.f243356h;
                Iterable iterable = this.f243376f;
                if (iterable == null) {
                    iterable = C64186f0.f181907d;
                }
                ArrayList arrayList = new ArrayList();
                for (Object next : iterable) {
                    Parcelable parcelable = (Parcelable) next;
                    if ((parcelable instanceof ModulePkgInfo) || (parcelable instanceof WxaPluginPkgInfo)) {
                        arrayList.add(next);
                    }
                }
                parcel.writeInt(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Parcelable parcelable2 = (Parcelable) it.next();
                    parcel.writeString(parcelable2.getClass().getName());
                    parcel.writeParcelable(parcelable2, 0);
                }
                parcel.writeByte(this.f243377g ? (byte) 1 : 0);
                parcel.writeInt(this.f243378h);
                parcel.writeString(this.f243379i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$a */
    public static final class C83278a extends C89261g {
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs;", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$b */
    public static final class C83279b implements C80916r<IPCCallArgs, IPCCallResult> {
        /* JADX INFO: finally extract failed */
        public Object invoke(Object obj) {
            IPCCallArgs iPCCallArgs = (IPCCallArgs) obj;
            if (iPCCallArgs == null) {
                return null;
            }
            C83280c cVar = new C83280c();
            AtomicReference atomicReference = new AtomicReference((Object) null);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C83327g3 g3Var = new C83327g3(atomicBoolean, iPCCallArgs, atomicReference);
            BatchGetCodePkgExecutor batchGetCodePkgExecutor = BatchGetCodePkgExecutor.f243304a;
            String str = iPCCallArgs.f243361d;
            WxaAttributes.WxaVersionInfo wxaVersionInfo = iPCCallArgs.f243365h;
            int i = iPCCallArgs.f243364g;
            List b = C26236u.m33719b(iPCCallArgs.f243362e);
            Map b2 = C83511w1.f243992a.mo115802b(iPCCallArgs.f243365h, iPCCallArgs.f243361d, iPCCallArgs.f243367j);
            QualitySession qualitySession = iPCCallArgs.f243371q;
            boolean z = iPCCallArgs.f243368n || !C83344j1.C29580a.C29581a.f80508b.mo56822a(iPCCallArgs.f243366i, iPCCallArgs.f243369o);
            QualitySession qualitySession2 = iPCCallArgs.f243371q;
            boolean z2 = iPCCallArgs.f243372r;
            C29591y1 y1Var = C29591y1.f80518d;
            AtomicReference atomicReference2 = atomicReference;
            C87412m.m108594g(qualitySession2, "reportQualitySession");
            C87412m.m108594g(y1Var, "onPkgMissed");
            C90422jy jyVar = new C90422jy();
            C83280c cVar2 = cVar;
            jyVar.f259639d = qualitySession2.f245836h;
            jyVar.f259640e = z2;
            jyVar.f259641f = 1;
            BatchGetCodePkgExecutor.C83262a z1Var = qualitySession2.f245835g == 1004 ? new C83527z1(false, qualitySession2, jyVar, y1Var) : new C83319f2(qualitySession2, jyVar, y1Var);
            Map<String, Integer> map = iPCCallArgs.f243370p;
            C90422jy jyVar2 = new C90422jy();
            jyVar2.f259639d = iPCCallArgs.f243371q.f245836h;
            jyVar2.f259640e = iPCCallArgs.f243372r;
            jyVar2.f259641f = 101;
            C83309d3 d3Var = new C83309d3(g3Var);
            C83313e3 e3Var = new C83313e3(g3Var);
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            C83321f3 f3Var = new C83321f3(g3Var, iPCCallArgs);
            AtomicReference atomicReference3 = atomicReference2;
            C83280c cVar3 = cVar2;
            batchGetCodePkgExecutor.mo115535a(str, wxaVersionInfo, i, b, b2, qualitySession, d3Var, e3Var, f3Var, z, jyVar2, z1Var, map, cVar3);
            for (C34379c cVar4 : cVar3.f243380d) {
                cVar4.get();
            }
            try {
                IPCCallResult iPCCallResult = (IPCCallResult) atomicReference3.get();
                atomicBoolean2.set(true);
                return iPCCallResult;
            } catch (Throwable th) {
                atomicBoolean2.set(true);
                throw th;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$c */
    public static final class C83280c implements Executor {

        /* renamed from: d */
        public final LinkedList<C34379c<?>> f243380d = new LinkedList<>();

        public void execute(Runnable runnable) {
            C34379c<?> cVar;
            C87412m.m108591d(runnable);
            String str = null;
            C84774n2 n2Var = runnable instanceof C84774n2 ? (C84774n2) runnable : null;
            if (n2Var != null) {
                str = n2Var.mo117460a();
            }
            if (!(str == null || str.length() == 0)) {
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                cVar = jVar.mo183879j(runnable, 0, str);
            } else {
                C119157j jVar2 = (C119157j) C119157j.f356862d;
                jVar2.getClass();
                cVar = jVar2.mo183878i(runnable, 0);
            }
            this.f243380d.add(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$d */
    public static final class C83281d<R extends Parcelable> implements C80243d {

        /* renamed from: a */
        public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible f243381a;

        public C83281d(ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible) {
            this.f243381a = modularizingPkgRetrieverSeparatedPluginsCompatible;
        }

        /* renamed from: a */
        public void mo111348a(Parcelable parcelable) {
            IPCCallResult iPCCallResult = (IPCCallResult) parcelable;
            if (iPCCallResult != null) {
                try {
                    int i = iPCCallResult.f243374d;
                    if (i == 1) {
                        C89260f fVar = this.f243381a.f243359f;
                        if (fVar != null) {
                            WxaPkgLoadProgress wxaPkgLoadProgress = iPCCallResult.f243375e;
                            C87412m.m108591d(wxaPkgLoadProgress);
                            fVar.mo114283b(wxaPkgLoadProgress);
                        }
                    } else if (i == 2) {
                        ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible = this.f243381a;
                        C89260f fVar2 = modularizingPkgRetrieverSeparatedPluginsCompatible.f243359f;
                        if (fVar2 != null) {
                            fVar2.mo114282a(new C83330h3(modularizingPkgRetrieverSeparatedPluginsCompatible, iPCCallResult));
                        }
                        this.f243381a.dead();
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible", "IPCCallTask.onCallback t=" + th);
                    ((C119157j) C119157j.f356862d).mo183895z(new C83340i3(th));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$e */
    public static final class C83282e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible f243382d;

        public C83282e(ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible) {
            this.f243382d = modularizingPkgRetrieverSeparatedPluginsCompatible;
        }

        public final void run() {
            C80242c<IPCCallResult> cVar;
            IPCCallResult iPCCallResult = (IPCCallResult) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, this.f243382d.f243360g, C83279b.class);
            if (iPCCallResult != null && (cVar = this.f243382d.f243360g.f243373s) != null) {
                cVar.mo111345a(iPCCallResult);
            }
        }
    }

    static {
        C89261g.f257161a = new C83278a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModularizingPkgRetrieverSeparatedPluginsCompatible(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r4 = r21
            java.lang.String r2 = "rt"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "requestedModuleName"
            gy3.C87412m.m108594g(r4, r2)
            r19.<init>()
            r0.f243357d = r4
            r0.f243358e = r1
            com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs r15 = new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs
            java.lang.String r3 = r1.f238147j
            java.lang.String r2 = "rt.appId"
            gy3.C87412m.m108593f(r3, r2)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r20.mo113036W()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU"
            gy3.C87412m.m108592e(r2, r5)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r2 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r2
            int r6 = r2.f234802F
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r1.f238149o
            int r7 = r2.f239365g
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r20.mo113036W()
            gy3.C87412m.m108592e(r2, r5)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r2 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r2
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r2.f234804H
            java.lang.String r2 = "rt.initConfig as AppBran…tConfigLU).wxaVersionInfo"
            gy3.C87412m.m108593f(r8, r2)
            boolean r9 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(r20)
            wi0.l r2 = r20.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r2 = r2.f238590i
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0065
            android.util.ArrayMap<com.tencent.mm.plugin.appbrand.appcache.r3, java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo>> r2 = r2.f238594d
            int r2 = r2.size()
            if (r2 > 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r2 = r2 ^ r5
            if (r2 != r5) goto L_0x0065
            r11 = 1
            goto L_0x0066
        L_0x0065:
            r11 = 0
        L_0x0066:
            r2 = r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r2
            boolean r12 = r2.mo113215r1()
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r13 = r2.mo113184O1(r10)
            gy3.C87412m.m108591d(r13)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            com.tencent.mm.plugin.appbrand.appcache.p0 r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99555k(r1, r10)
            boolean r10 = r5 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81247g3
            r16 = 0
            if (r10 == 0) goto L_0x0086
            com.tencent.mm.plugin.appbrand.appcache.g3 r5 = (com.tencent.p014mm.plugin.appbrand.appcache.C81247g3) r5
            goto L_0x0088
        L_0x0086:
            r5 = r16
        L_0x0088:
            if (r5 == 0) goto L_0x008d
            com.tencent.mm.plugin.appbrand.appcache.o0 r5 = r5.f238649a
            goto L_0x008f
        L_0x008d:
            r5 = r16
        L_0x008f:
            boolean r10 = r5 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81364t3
            if (r10 == 0) goto L_0x0096
            com.tencent.mm.plugin.appbrand.appcache.t3 r5 = (com.tencent.p014mm.plugin.appbrand.appcache.C81364t3) r5
            goto L_0x0098
        L_0x0096:
            r5 = r16
        L_0x0098:
            if (r5 == 0) goto L_0x00c4
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r5 = r5.f238858c
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r5 = r5.f238590i
            if (r5 == 0) goto L_0x00a4
            java.util.List r16 = r5.mo113465c()
        L_0x00a4:
            if (r16 == 0) goto L_0x00c4
            java.util.Iterator r5 = r16.iterator()
        L_0x00aa:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00c4
            java.lang.Object r10 = r5.next()
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r10 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo) r10
            java.lang.String r4 = r10.provider
            int r10 = r10.version
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.put(r4, r10)
            r4 = r21
            goto L_0x00aa
        L_0x00c4:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r2.mo113210l1()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r10 = r4.f239379j1
            gy3.C87412m.m108591d(r10)
            boolean r16 = r2.mo121251g1()
            r17 = 0
            r2 = r15
            r4 = r21
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r18 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r18
            r14 = r16
            r1 = r15
            r15 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f243360g = r1
            r1 = r20
            r1.keep(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible.<init>(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo115564a(C89259e eVar) {
        if (eVar != null) {
            this.f243359f = (C89260f) eVar;
        }
    }

    /* renamed from: b */
    public void mo115565b() {
        mo115566c(C11703d.f34268b);
    }

    /* renamed from: c */
    public void mo115566c(Executor executor) {
        this.f243360g.f243373s = new C80241b(new C83281d(this));
        if (executor == null) {
            Executor executor2 = C89269l.f257179d;
            executor = C11703d.f34268b;
        }
        executor.execute(new C83282e(this));
    }

    public void dead() {
        AppBrandRuntime appBrandRuntime = this.f243358e;
        if (appBrandRuntime != null) {
            appBrandRuntime.mo1963B7(this);
        }
        this.f243358e = null;
        this.f243359f = null;
        this.f243360g.f243373s = null;
    }
}
