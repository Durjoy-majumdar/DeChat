package nm0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hr0.C87583a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import li0.C88508b;
import li0.C88509c;
import nm0.C89025e;
import org.json.JSONArray;
import p224ra.C89909e;
import p963fc.C86812g;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.x65;
import zp0.C91829i;

/* renamed from: nm0.k */
public final class C89033k {

    /* renamed from: a */
    public static final C89033k f256655a = new C89033k();

    /* renamed from: b */
    public static final C13601g f256656b = C36568h.m40985a(C89038e.f256679d);

    /* renamed from: c */
    public static final long f256657c = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: d */
    public static final MTimerHandler f256658d = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) C89043i.f256684d, true);

    /* renamed from: e */
    public static final HashSet<C86812g> f256659e = new HashSet<>();

    /* renamed from: f */
    public static final C89035b f256660f = new C89035b();

    /* renamed from: g */
    public static long f256661g;

    /* renamed from: nm0.k$a */
    public static final class C89034a {

        /* renamed from: a */
        public final C89025e.C89027b f256662a;

        /* renamed from: b */
        public final int f256663b;

        /* renamed from: c */
        public final LinkedList<C89037d> f256664c = new LinkedList<>();

        /* renamed from: d */
        public long f256665d;

        public C89034a(C89025e.C89027b bVar, int i) {
            C87412m.m108594g(bVar, DownloadInfo.PRIORITY);
            this.f256662a = bVar;
            this.f256663b = i;
        }
    }

    /* renamed from: nm0.k$b */
    public static final class C89035b {

        /* renamed from: a */
        public final C89034a[] f256666a = {new C89034a(C89025e.C89027b.IMMEDIATE, 3), new C89034a(C89025e.C89027b.HIGH, 3), new C89034a(C89025e.C89027b.LOW, 1)};

        /* renamed from: a */
        public List<C89037d> mo123398a(long j) {
            long j2;
            Collection collection;
            C89034a[] aVarArr;
            long j3;
            long j4;
            LinkedList linkedList = new LinkedList();
            C89034a[] aVarArr2 = this.f256666a;
            int length = aVarArr2.length;
            long j5 = 0;
            int i = 0;
            long j6 = 0;
            while (i < length) {
                C89034a aVar = aVarArr2[i];
                synchronized (aVar.f256664c) {
                    try {
                        j2 = aVar.f256665d;
                    } finally {
                        Throwable th = th;
                    }
                }
                long j7 = j - j6;
                synchronized (aVar.f256664c) {
                    if (aVar.f256664c.isEmpty()) {
                        collection = C64186f0.f181907d;
                        aVarArr = aVarArr2;
                        j3 = j5;
                    } else {
                        if (j7 < j5) {
                            j7 = (long) aVar.f256664c.peekFirst().f256674c.length();
                        }
                        LinkedList linkedList2 = new LinkedList();
                        long j8 = j7;
                        while (!aVar.f256664c.isEmpty() && j8 > 0) {
                            C89037d pollFirst = aVar.f256664c.pollFirst();
                            C89037d dVar = pollFirst;
                            dVar.f256678g++;
                            j8 -= (long) dVar.f256674c.length();
                            linkedList2.addLast(pollFirst);
                            aVarArr2 = aVarArr2;
                        }
                        aVarArr = aVarArr2;
                        long j9 = aVar.f256665d - (j7 - j8);
                        aVar.f256665d = j9;
                        if (j9 < 0) {
                            Log.m105920e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", '[' + aVar.f256662a.name() + "] poll(" + j7 + ") final bytesCount becomes minus");
                            j3 = 0;
                            aVar.f256665d = 0;
                        } else {
                            j3 = 0;
                        }
                        collection = linkedList2;
                    }
                }
                linkedList.addAll(collection);
                synchronized (aVar.f256664c) {
                    try {
                        j4 = aVar.f256665d;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                j6 += j2 - j4;
                i++;
                long j15 = j3;
                aVarArr2 = aVarArr;
                j5 = j15;
            }
            return linkedList;
        }

        /* renamed from: b */
        public boolean mo123399b(C89037d dVar) {
            C87412m.m108594g(dVar, "entry");
            C89034a[] aVarArr = this.f256666a;
            int length = aVarArr.length;
            int i = 0;
            while (i < length) {
                C89034a aVar = aVarArr[i];
                if (aVar.f256662a != dVar.f256675d) {
                    i++;
                } else if (dVar.f256678g > aVar.f256663b) {
                    Log.m105920e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", "push reach TryCountLimit priority[" + aVar.f256662a.name() + "], entry[" + dVar.f256677f + ", " + dVar.f256672a + ", " + dVar.f256673b + ']');
                    return false;
                } else {
                    synchronized (aVar.f256664c) {
                        aVar.f256664c.addLast(dVar);
                        aVar.f256665d += (long) dVar.f256674c.length();
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: nm0.k$c */
    public enum C89036c {
        TIMER_PERIOD,
        REACH_SLICE_LIMIT,
        RUNTIME_KILLED,
        IMMEDIATE
    }

    /* renamed from: nm0.k$d */
    public static final class C89037d {

        /* renamed from: a */
        public final int f256672a;

        /* renamed from: b */
        public final int f256673b;

        /* renamed from: c */
        public final String f256674c;

        /* renamed from: d */
        public final C89025e.C89027b f256675d;

        /* renamed from: e */
        public final WeakReference<C81879g> f256676e;

        /* renamed from: f */
        public final String f256677f;

        /* renamed from: g */
        public int f256678g;

        public C89037d(int i, int i2, String str, C89025e.C89027b bVar, C81879g gVar) {
            C87412m.m108594g(str, "content");
            C87412m.m108594g(bVar, DownloadInfo.PRIORITY);
            C87412m.m108594g(gVar, "component");
            this.f256672a = i;
            this.f256673b = i2;
            this.f256674c = str;
            this.f256675d = bVar;
            this.f256676e = new WeakReference<>(gVar);
            String appId = gVar.getAppId();
            C87412m.m108593f(appId, "component.appId");
            this.f256677f = appId;
        }
    }

    /* renamed from: nm0.k$e */
    public static final class C89038e extends C87413o implements C32224a<C87583a> {

        /* renamed from: d */
        public static final C89038e f256679d = new C89038e();

        public C89038e() {
            super(0);
        }

        public Object invoke() {
            return (C87583a) C89909e.m112439d(C87583a.class, true);
        }
    }

    /* renamed from: nm0.k$f */
    public /* synthetic */ class C89039f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f256680a;

        static {
            int[] iArr = new int[C89025e.C89027b.values().length];
            iArr[2] = 1;
            f256680a = iArr;
        }
    }

    /* renamed from: nm0.k$g */
    public static final class C89040g extends C87413o implements C32227p<Boolean, C91829i, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C89037d> f256681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89040g(List<C89037d> list) {
            super(2);
            this.f256681d = list;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C91829i iVar = (C91829i) obj2;
            Log.m105924i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "onCgiBack, isSucceed:" + booleanValue + ", exception:" + iVar);
            WeakHashMap weakHashMap = new WeakHashMap();
            if (booleanValue) {
                for (C89037d dVar : this.f256681d) {
                    C81879g gVar = dVar.f256676e.get();
                    if (gVar != null) {
                        LinkedList linkedList = (LinkedList) weakHashMap.get(gVar);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            weakHashMap.put(gVar, linkedList);
                        }
                        linkedList.addLast(dVar);
                    }
                    C89025e.C89028c cVar = new C89025e.C89028c();
                    cVar.mo123392b(dVar.f256676e.get());
                    cVar.f256643f = dVar.f256672a;
                    cVar.f256644g = dVar.f256673b;
                    C89025e.C89027b bVar = dVar.f256675d;
                    C87412m.m108594g(bVar, "<set-?>");
                    cVar.f256645h = bVar;
                    cVar.f256646i = TimeUnit.MILLISECONDS.toSeconds(C89033k.f256657c);
                    cVar.f256647j = dVar.f256678g - 1;
                    cVar.f256648k = C89025e.C89028c.C89029a.Succeed;
                    cVar.mo123391a();
                }
                C89033k kVar = C89033k.f256655a;
                kVar.mo123396c().mo121689f(1074, 2, (long) this.f256681d.size());
                kVar.mo123396c().mo121688e(1074, 5);
            } else {
                int i = 0;
                for (C89037d dVar2 : this.f256681d) {
                    if (!C89033k.f256660f.mo123399b(dVar2)) {
                        C81879g gVar2 = dVar2.f256676e.get();
                        if (gVar2 != null) {
                            LinkedList linkedList2 = (LinkedList) weakHashMap.get(gVar2);
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList();
                                weakHashMap.put(gVar2, linkedList2);
                            }
                            linkedList2.addLast(dVar2);
                        }
                        C89025e.C89028c cVar2 = new C89025e.C89028c();
                        cVar2.mo123392b(dVar2.f256676e.get());
                        cVar2.f256643f = dVar2.f256672a;
                        cVar2.f256644g = dVar2.f256673b;
                        C89025e.C89027b bVar2 = dVar2.f256675d;
                        C87412m.m108594g(bVar2, "<set-?>");
                        cVar2.f256645h = bVar2;
                        cVar2.f256646i = TimeUnit.MILLISECONDS.toSeconds(C89033k.f256657c);
                        cVar2.f256647j = dVar2.f256678g - 1;
                        cVar2.f256648k = C89025e.C89028c.C89029a.Failed;
                        cVar2.mo123391a();
                    } else {
                        i++;
                    }
                }
                if (i > 0) {
                    C89033k.f256655a.mo123396c().mo121689f(1074, 0, (long) i);
                }
            }
            Set<Map.Entry> entrySet = weakHashMap.entrySet();
            C87412m.m108593f(entrySet, "component2EntryMap.entries");
            for (Map.Entry entry : entrySet) {
                C82381f fVar = (C82381f) entry.getKey();
                if (fVar != null && fVar.isRunning()) {
                    C89025e.C89026a aVar = new C89025e.C89026a();
                    aVar.mo115194p(fVar);
                    HashMap hashMap = new HashMap();
                    String str = null;
                    hashMap.put("errcode", Integer.valueOf(C91829i.C91830a.SERVER == (iVar != null ? iVar.f262937d : null) ? iVar.f262938e : -9999));
                    if (iVar != null) {
                        str = iVar.f262939f;
                    }
                    hashMap.put("errmsg", str);
                    Object value = entry.getValue();
                    C87412m.m108593f(value, "entry.value");
                    Iterable<C89037d> iterable = (Iterable) value;
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
                    for (C89037d dVar3 : iterable) {
                        arrayList.add(Long.valueOf((long) dVar3.f256674c.length()));
                    }
                    hashMap.put("dataSize", Long.valueOf(C110818d0.m150946r0(arrayList)));
                    Object value2 = entry.getValue();
                    C87412m.m108593f(value2, "entry.value");
                    Iterable<C89037d> iterable2 = (Iterable) value2;
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(iterable2, 10));
                    for (C89037d dVar4 : iterable2) {
                        arrayList2.add(Integer.valueOf(dVar4.f256672a));
                    }
                    hashMap.put("idList", new JSONArray(C110818d0.m150953y0(arrayList2)));
                    aVar.mo115165o(hashMap);
                    aVar.mo115158h();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: nm0.k$h */
    public static final class C89041h implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C81879g f256682d;

        /* renamed from: nm0.k$h$a */
        public /* synthetic */ class C89042a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f256683a;

            static {
                int[] iArr = new int[C88508b.values().length];
                iArr[3] = 1;
                iArr[0] = 2;
                f256683a = iArr;
            }
        }

        public C89041h(C81879g gVar) {
            this.f256682d = gVar;
        }

        /* renamed from: b */
        public final void mo113102b(String str, C88508b bVar) {
            int i = bVar == null ? -1 : C89042a.f256683a[bVar.ordinal()];
            if (i == 1) {
                C89033k.f256655a.mo123397d(C89036c.RUNTIME_KILLED);
                C81879g gVar = this.f256682d;
                HashSet<C86812g> hashSet = C89033k.f256659e;
                synchronized (hashSet) {
                    AppBrandRuntime runtime = gVar.getRuntime();
                    C87412m.m108592e(runtime, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
                    hashSet.remove((C86812g) runtime);
                    if (hashSet.size() == 0) {
                        C89033k.f256658d.stopTimer();
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else if (i == 2) {
                C89033k kVar = C89033k.f256655a;
                synchronized (kVar) {
                    long j = C89033k.f256661g;
                    if (j > 0 && Util.ticksToNow(j) >= C89033k.f256657c) {
                        kVar.mo123397d(C89036c.TIMER_PERIOD);
                    }
                }
            }
        }
    }

    /* renamed from: nm0.k$i */
    public static final class C89043i implements MTimerHandler.CallBack {

        /* renamed from: d */
        public static final C89043i f256684d = new C89043i();

        public final boolean onTimerExpired() {
            C89033k.f256655a.mo123397d(C89036c.TIMER_PERIOD);
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo123394a(List<C89037d> list, C89036c cVar) {
        f256658d.startTimer(f256657c);
        f256661g = Util.currentTicks();
        Log.m105924i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "doCgi queue.size=" + list.size() + ", reason=" + cVar.name());
        if (!(list.isEmpty())) {
            mo123396c().mo121689f(1074, 1, (long) list.size());
            mo123396c().mo121688e(1074, 4);
            C89020b bVar = new C89020b();
            for (C89037d dVar : list) {
                LinkedList<x65> linkedList = bVar.f256624b.f138801d;
                x65 x65 = new x65();
                x65.f144495d = dVar.f256673b;
                x65.f144496e = C89349b.m111675b(dVar.f256674c);
                x65.f144497f = dVar.f256677f;
                linkedList.add(x65);
            }
            bVar.mo123390a((C86812g) null, new C89040g(list));
        }
    }

    /* renamed from: b */
    public final void mo123395b(C81879g gVar, int i, int i2, String str, C89025e.C89027b bVar) {
        long j;
        C81879g gVar2 = gVar;
        C89025e.C89027b bVar2 = bVar;
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(str, "content");
        C87412m.m108594g(bVar2, DownloadInfo.PRIORITY);
        HashSet<C86812g> hashSet = f256659e;
        synchronized (hashSet) {
            AppBrandRuntime runtime = gVar.getRuntime();
            C87412m.m108592e(runtime, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
            boolean add = hashSet.add((C86812g) runtime);
            if (add && hashSet.size() == 1) {
                f256658d.startTimer(f256657c);
            }
            if (add) {
                gVar.getRuntime().f238113K.mo122978a(new C89041h(gVar));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        mo123396c().mo121688e(1074, 0);
        synchronized (this) {
            C89035b bVar3 = f256660f;
            bVar3.mo123399b(new C89037d(i, i2, str, bVar, gVar));
            C89025e.C89028c cVar = new C89025e.C89028c();
            cVar.mo123392b(gVar);
            cVar.f256643f = i;
            cVar.f256644g = i2;
            cVar.f256645h = bVar2;
            cVar.f256646i = TimeUnit.MILLISECONDS.toSeconds(f256657c);
            cVar.f256647j = 0;
            cVar.f256648k = C89025e.C89028c.C89029a.Enqueued;
            cVar.mo123391a();
            if (C89039f.f256680a[bVar.ordinal()] == 1) {
                f256655a.mo123394a(bVar3.mo123398a(65536), C89036c.IMMEDIATE);
            } else {
                C89034a[] aVarArr = bVar3.f256666a;
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (C89034a aVar : aVarArr) {
                    synchronized (aVar.f256664c) {
                        try {
                            j = aVar.f256665d;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    arrayList.add(Long.valueOf(j));
                }
                if (C110818d0.m150946r0(arrayList) >= 65536) {
                    f256655a.mo123394a(f256660f.mo123398a(65536), C89036c.REACH_SLICE_LIMIT);
                } else {
                    long j2 = f256661g;
                    if (j2 > 0 && Util.ticksToNow(j2) >= f256657c) {
                        Log.m105924i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "enqueue, Util.ticksToNow(lastDoCgiTick) >= REPORT_PERIOD_INTERVAL");
                        f256655a.mo123397d(C89036c.TIMER_PERIOD);
                    }
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public final C87583a mo123396c() {
        return (C87583a) ((C36570n) f256656b).getValue();
    }

    /* renamed from: d */
    public final void mo123397d(C89036c cVar) {
        mo123394a(f256660f.mo123398a(65536), cVar);
    }
}
