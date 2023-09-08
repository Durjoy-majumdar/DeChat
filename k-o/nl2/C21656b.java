package nl2;

import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C57320m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import ql2.C22095a;
import ql2.C22105d;
import ql2.C22107e;
import rx3.C13598b0;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C51957xd;
import te3.C64799wd;
import te3.C64852yd;
import zt3.C119157j;

/* renamed from: nl2.b */
public final class C21656b implements C22095a.C22096a {

    /* renamed from: a */
    public final C22095a.C22096a f61287a;

    /* renamed from: b */
    public int f61288b = 2;

    /* renamed from: c */
    public int f61289c;

    /* renamed from: d */
    public ArrayList<C22095a> f61290d;

    /* renamed from: e */
    public ArrayList<C22095a> f61291e;

    /* renamed from: f */
    public long f61292f;

    /* renamed from: g */
    public boolean f61293g;

    /* renamed from: nl2.b$a */
    public static final class C21657a {
        public C21657a(C8480h hVar) {
        }
    }

    /* renamed from: nl2.b$b */
    public static final class C21658b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61294d;

        /* renamed from: e */
        public final /* synthetic */ C21683r f61295e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f61296f;

        public C21658b(C21656b bVar, C21683r rVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f61294d = bVar;
            this.f61295e = rVar;
            this.f61296f = lVar;
        }

        public final void run() {
            C21656b bVar = this.f61294d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onAddScanProductResultForFullImage isCancelled and ignore");
            } else {
                bVar.f61287a.mo33920b(this.f61295e, this.f61296f);
            }
        }
    }

    /* renamed from: nl2.b$c */
    public static final class C21659c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61297d;

        /* renamed from: e */
        public final /* synthetic */ C21680p f61298e;

        /* renamed from: f */
        public final /* synthetic */ int f61299f;

        /* renamed from: g */
        public final /* synthetic */ long f61300g;

        /* renamed from: h */
        public final /* synthetic */ int f61301h;

        /* renamed from: i */
        public final /* synthetic */ String f61302i;

        public C21659c(C21656b bVar, C21680p pVar, int i, long j, int i2, String str) {
            this.f61297d = bVar;
            this.f61298e = pVar;
            this.f61299f = i;
            this.f61300g = j;
            this.f61301h = i2;
            this.f61302i = str;
        }

        public final void run() {
            C21656b bVar = this.f61297d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onRetrievalFailed isCancelled and ignore");
            } else {
                bVar.f61287a.mo33922d(this.f61298e, this.f61299f, this.f61300g, this.f61301h, this.f61302i);
            }
        }
    }

    /* renamed from: nl2.b$d */
    public static final class C21660d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61303d;

        /* renamed from: e */
        public final /* synthetic */ C21680p f61304e;

        public C21660d(C21656b bVar, C21680p pVar) {
            this.f61303d = bVar;
            this.f61304e = pVar;
        }

        public final void run() {
            C21656b bVar = this.f61303d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onRetrievalSuccess isCancelled and ignore");
            } else {
                bVar.f61287a.mo33929k(this.f61304e);
            }
        }
    }

    /* renamed from: nl2.b$e */
    public static final class C21661e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61305d;

        /* renamed from: e */
        public final /* synthetic */ C22105d f61306e;

        public C21661e(C21656b bVar, C22105d dVar) {
            this.f61305d = bVar;
            this.f61306e = dVar;
        }

        public final void run() {
            C21656b bVar = this.f61305d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onTaskFinish isCancelled and ignore");
            } else {
                bVar.f61287a.mo33921c(this.f61306e);
            }
        }
    }

    /* renamed from: nl2.b$f */
    public static final class C21662f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61307d;

        /* renamed from: e */
        public final /* synthetic */ C22105d f61308e;

        public C21662f(C21656b bVar, C22105d dVar) {
            this.f61307d = bVar;
            this.f61308e = dVar;
        }

        public final void run() {
            ArrayList<C22095a> arrayList = this.f61307d.f61291e;
            C24564k0.m30737a(arrayList).remove(this.f61308e);
            C21656b.m24604l(this.f61307d);
        }
    }

    /* renamed from: nl2.b$g */
    public static final class C21663g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61309d;

        /* renamed from: e */
        public final /* synthetic */ C21680p f61310e;

        /* renamed from: f */
        public final /* synthetic */ int f61311f;

        /* renamed from: g */
        public final /* synthetic */ long f61312g;

        /* renamed from: h */
        public final /* synthetic */ int f61313h;

        /* renamed from: i */
        public final /* synthetic */ int f61314i;

        /* renamed from: j */
        public final /* synthetic */ String f61315j;

        public C21663g(C21656b bVar, C21680p pVar, int i, long j, int i2, int i3, String str) {
            this.f61309d = bVar;
            this.f61310e = pVar;
            this.f61311f = i;
            this.f61312g = j;
            this.f61313h = i2;
            this.f61314i = i3;
            this.f61315j = str;
        }

        public final void run() {
            C21656b bVar = this.f61309d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onUploadFailed isCancelled and ignore");
            } else {
                bVar.f61287a.mo33927i(this.f61310e, this.f61311f, this.f61312g, this.f61313h, this.f61314i, this.f61315j);
            }
        }
    }

    /* renamed from: nl2.b$h */
    public static final class C21664h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21656b f61316d;

        /* renamed from: e */
        public final /* synthetic */ C21680p f61317e;

        public C21664h(C21656b bVar, C21680p pVar) {
            this.f61316d = bVar;
            this.f61317e = pVar;
        }

        public final void run() {
            C21656b bVar = this.f61316d;
            if (bVar.f61293g) {
                Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onUploadSuccess isCancelled and ignore");
            } else {
                bVar.f61287a.mo33925g(this.f61317e);
            }
        }
    }

    static {
        new C21657a((C8480h) null);
    }

    public C21656b(C22095a.C22096a aVar) {
        C87412m.m108594g(aVar, "getProductCallback");
        this.f61287a = aVar;
        int i = 1000;
        this.f61289c = 1000;
        this.f61290d = new ArrayList<>();
        this.f61291e = new ArrayList<>();
        this.f61292f = -1;
        MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
        this.f61289c = multiProcessMMKV != null ? multiProcessMMKV.getInt("scan_config_request_time_interval", 1000) : i;
        Log.m105924i("MicroMsg.AiScanImageGetProductManager", "runTaskMinDurationInMs " + this.f61289c);
    }

    /* renamed from: l */
    public static final void m24604l(C21656b bVar) {
        if (!(bVar.f61291e.size() >= bVar.f61288b)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = bVar.f61292f;
            if (j < 0 || currentTimeMillis - j >= ((long) bVar.f61289c)) {
                Log.m105926v("MicroMsg.AiScanImageGetProductManager", "doNextTask direct run");
                m24605m(bVar);
            } else if (!bVar.f61290d.isEmpty()) {
                long j2 = (bVar.f61292f + ((long) bVar.f61289c)) - currentTimeMillis;
                Log.m105927v("MicroMsg.AiScanImageGetProductManager", "doNextTask run delay: " + j2 + ", waiting size: %s", Integer.valueOf(bVar.f61290d.size()));
                C21666d dVar = new C21666d(bVar);
                if (j2 > 0) {
                    ((C119157j) C119157j.f356862d).mo183879j(dVar, j2, "AiScanImageGetProductManager");
                } else {
                    ((C119157j) C119157j.f356862d).mo183876g(dVar, "AiScanImageGetProductManager");
                }
            } else {
                Log.m105926v("MicroMsg.AiScanImageGetProductManager", "doNextTask no waiting task");
            }
        } else {
            Log.m105928w("MicroMsg.AiScanImageGetProductManager", "doNextTask running queue full and skip");
        }
    }

    /* renamed from: m */
    public static final void m24605m(C21656b bVar) {
        C21656b bVar2 = bVar;
        C22095a aVar = (C22095a) C64175a0.m75516x(bVar2.f61290d);
        if (aVar != null) {
            Log.m105925i("MicroMsg.AiScanImageGetProductManager", "doRunNextTask task: %s, trackId: %s, session: %s", Integer.valueOf(aVar.hashCode()), Integer.valueOf(aVar.f62490d.f61326f.f61358a.getId()), Long.valueOf(aVar.f62490d.f61283b));
            bVar2.f61291e.add(aVar);
            bVar2.f61292f = System.currentTimeMillis();
            Log.m105924i("MicroMsg.AiScanImageGetProductTask", "run getProductTask");
            C21670h hVar = aVar.f62490d;
            C22107e eVar = new C22107e(hVar.f61283b, hVar, aVar.f62494h);
            Log.m105918d("MicroMsg.AiScanImageUploadTask", "runImageUploadTask");
            eVar.f62517g.mo33919a(eVar);
            eVar.f62530d = false;
            C86709a0.m107524d().mo123455a(5105, eVar);
            long j = eVar.f62515e;
            C21670h hVar2 = eVar.f62516f;
            int i = hVar2.f61284c;
            Log.m105925i("MicroMsg.AiScanImageUploadTask", "doUploadImage session: %d, source: %d, scanImageType: %s, imageData: %s, %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(hVar2.f61327g), Integer.valueOf(hVar2.f61328h.length), hVar2.f61328h);
            if (i == 3 || i == 4) {
                int i2 = hVar2.f61285d;
                C21681q qVar = hVar2.f61326f;
                byte[] bArr = hVar2.f61328h;
                int i3 = hVar2.f61330j;
                int i4 = hVar2.f61331k;
                Log.m105925i("MicroMsg.AiScanImageUploadTask", "alvinluo uploadImage imageData: %d, imageEncodeType: %s", Integer.valueOf(bArr.length), Integer.valueOf(eVar.f62516f.f61329i));
                C57320m mVar = new C57320m(bArr, i3, i4, i2, eVar.f62516f.f61327g, j, qVar.f61358a, (C64799wd) null, (C51957xd) null, (C64852yd) null);
                eVar.f62516f.f61286e = mVar;
                C86709a0.m107524d().mo123460f(mVar);
                eVar.f62517g.mo33924f(eVar.f62516f);
            } else {
                C22107e eVar2 = eVar;
                eVar2.mo35191b(i, 3, -1, "source invalid: " + i, C64197v.m75534c(Integer.valueOf(hVar2.f61326f.f61358a.getId())));
            }
            aVar.f62493g = eVar;
        }
    }

    /* renamed from: a */
    public void mo33919a(C22105d dVar) {
        C87412m.m108594g(dVar, "task");
        if (this.f61293g) {
            Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onTaskStart isCancelled and ignore");
        } else {
            this.f61287a.mo33919a(dVar);
        }
    }

    /* renamed from: b */
    public void mo33920b(C21683r rVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "addResultCallback");
        ((C119157j) C119157j.f356862d).mo183895z(new C21658b(this, rVar, lVar));
    }

    /* renamed from: c */
    public void mo33921c(C22105d dVar) {
        C87412m.m108594g(dVar, "task");
        ((C119157j) C119157j.f356862d).mo183895z(new C21661e(this, dVar));
        ((C119157j) C119157j.f356862d).mo183876g(new C21662f(this, dVar), "AiScanImageGetProductManager");
    }

    /* renamed from: d */
    public void mo33922d(C21680p pVar, int i, long j, int i2, String str) {
        C87412m.m108594g(pVar, "result");
        C119157j jVar = (C119157j) C119157j.f356862d;
        jVar.mo183895z(new C21659c(this, pVar, i, j, i2, str));
    }

    /* renamed from: e */
    public void mo33923e(C22105d dVar) {
        C87412m.m108594g(dVar, "task");
        if (this.f61293g) {
            Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onTaskAdd isCancelled and ignore");
        } else {
            this.f61287a.mo33923e(dVar);
        }
    }

    /* renamed from: f */
    public void mo33924f(C21670h hVar) {
        C87412m.m108594g(hVar, "request");
        if (this.f61293g) {
            Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onUploadStart isCancelled and ignore");
        } else {
            this.f61287a.mo33924f(hVar);
        }
    }

    /* renamed from: g */
    public void mo33925g(C21680p pVar) {
        C87412m.m108594g(pVar, "result");
        ((C119157j) C119157j.f356862d).mo183895z(new C21664h(this, pVar));
    }

    /* renamed from: h */
    public void mo33926h(C22105d dVar) {
        C87412m.m108594g(dVar, "task");
        this.f61287a.mo33926h(dVar);
    }

    /* renamed from: i */
    public void mo33927i(C21680p pVar, int i, long j, int i2, int i3, String str) {
        C87412m.m108594g(pVar, "result");
        C119157j jVar = (C119157j) C119157j.f356862d;
        jVar.mo183895z(new C21663g(this, pVar, i, j, i2, i3, str));
    }

    /* renamed from: j */
    public void mo33928j(C21668f fVar) {
        C87412m.m108594g(fVar, "request");
        if (this.f61293g) {
            Log.m105924i("MicroMsg.AiScanImageGetProductManager", "onRetrievalStart isCancelled and ignore");
        } else {
            this.f61287a.mo33928j(fVar);
        }
    }

    /* renamed from: k */
    public void mo33929k(C21680p pVar) {
        C87412m.m108594g(pVar, "result");
        ((C119157j) C119157j.f356862d).mo183895z(new C21660d(this, pVar));
    }
}
