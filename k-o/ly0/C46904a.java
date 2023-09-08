package ly0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import my0.C47138a;
import my0.C47139b;
import my0.C47141d;
import my0.C47142e;
import zt3.C119157j;

/* renamed from: ly0.a */
public final class C46904a {

    /* renamed from: a */
    public static final HashMap<String, ArrayList<C47139b<?>>> f126110a = new HashMap<>();

    /* renamed from: b */
    public static final C47138a<?> f126111b = C46908b.f126125a;

    /* renamed from: ly0.a$a */
    public static final class C46905a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47141d f126112d;

        /* renamed from: e */
        public final /* synthetic */ C47139b<T> f126113e;

        /* renamed from: f */
        public final /* synthetic */ long f126114f;

        public C46905a(C47141d dVar, C47139b<T> bVar, long j) {
            this.f126112d = dVar;
            this.f126113e = bVar;
            this.f126114f = j;
        }

        public final void run() {
            HashMap<String, ArrayList<C47139b<?>>> hashMap = C46904a.f126110a;
            ArrayList arrayList = hashMap.get(this.f126112d.f126656a);
            if (arrayList == null || arrayList.isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f126113e);
                hashMap.put(this.f126112d.f126656a, arrayList);
                C46904a.m52238b(this.f126114f, this.f126112d, this.f126113e, false);
                return;
            }
            Log.m105927v("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl url: %s is downloading and wait for result, session: %s", this.f126112d.f126656a, Long.valueOf(this.f126114f));
            arrayList.add(this.f126113e);
        }
    }

    /* renamed from: ly0.a$b */
    public static final class C46906b implements C47139b<T> {

        /* renamed from: a */
        public final /* synthetic */ C47139b<T> f126115a;

        /* renamed from: b */
        public final /* synthetic */ C47141d f126116b;

        /* renamed from: c */
        public final /* synthetic */ boolean f126117c;

        /* renamed from: d */
        public final /* synthetic */ long f126118d;

        /* renamed from: ly0.a$b$a */
        public static final class C46907a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C47141d f126119d;

            /* renamed from: e */
            public final /* synthetic */ boolean f126120e;

            /* renamed from: f */
            public final /* synthetic */ C47142e f126121f;

            /* renamed from: g */
            public final /* synthetic */ long f126122g;

            /* renamed from: h */
            public final /* synthetic */ C47139b<T> f126123h;

            /* renamed from: i */
            public final /* synthetic */ T f126124i;

            public C46907a(C47141d dVar, boolean z, C47142e eVar, long j, C47139b<T> bVar, T t) {
                this.f126119d = dVar;
                this.f126120e = z;
                this.f126121f = eVar;
                this.f126122g = j;
                this.f126123h = bVar;
                this.f126124i = t;
            }

            public final void run() {
                C47141d dVar = this.f126119d;
                if (!dVar.f126658c || this.f126120e || this.f126121f.f126661a) {
                    ArrayList<C47139b> remove = C46904a.f126110a.remove(dVar.f126656a);
                    if (remove != null) {
                        Log.m105925i("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl onCompleted session: %s, url: %s, callbackList size: %s", Long.valueOf(this.f126122g), this.f126119d.f126656a, Integer.valueOf(remove.size()));
                        T t = this.f126124i;
                        C47142e eVar = this.f126121f;
                        for (C47139b bVar : remove) {
                            C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.WebPrefetcherHttpDownloadListener<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner.<no name provided>.onCompleted.<no name provided>.run$lambda-1>");
                            bVar.mo63627b(t, eVar);
                        }
                        return;
                    }
                    return;
                }
                Log.m105929w("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrlInner failed and retry, session: %d, url: %s", Long.valueOf(this.f126122g), this.f126119d.f126656a);
                C46904a.m52238b(this.f126122g, this.f126119d, this.f126123h, true);
            }
        }

        public C46906b(C47139b<T> bVar, C47141d dVar, boolean z, long j) {
            this.f126115a = bVar;
            this.f126116b = dVar;
            this.f126117c = z;
            this.f126118d = j;
        }

        /* renamed from: a */
        public boolean mo63626a(T t, int i, HashMap<String, List<String>> hashMap) {
            C87412m.m108594g(hashMap, "headers");
            return this.f126115a.mo63626a(t, i, hashMap);
        }

        /* renamed from: b */
        public void mo63627b(T t, C47142e eVar) {
            C87412m.m108594g(eVar, "downloadResult");
            ((C119157j) C119157j.f356862d).mo183876g(new C46907a(this.f126116b, this.f126117c, eVar, this.f126118d, this.f126115a, t), "MicroMsg.WebPrefetcherHttpDownloadManager");
        }

        /* renamed from: c */
        public void mo63628c(T t) {
            this.f126115a.mo63628c(t);
        }
    }

    /* renamed from: a */
    public static final <T> void m52237a(C47141d dVar, C47139b<T> bVar) {
        C87412m.m108594g(dVar, "downloadRequest");
        C87412m.m108594g(bVar, "downloadListener");
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105927v("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl request session: %s, url: %s", Long.valueOf(currentTimeMillis), dVar.f126656a);
        ((C119157j) C119157j.f356862d).mo183876g(new C46905a(dVar, bVar, currentTimeMillis), "MicroMsg.WebPrefetcherHttpDownloadManager");
    }

    /* renamed from: b */
    public static final <T> void m52238b(long j, C47141d dVar, C47139b<T> bVar, boolean z) {
        C46906b bVar2 = new C46906b(bVar, dVar, z, j);
        Log.m105927v("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl start session: %s, url: %s", Long.valueOf(j), dVar.f126656a);
        C47138a<?> aVar = f126111b;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.IWebPrefetcherHttpDownloader<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner>");
        ((C46908b) aVar).mo72113a(dVar, bVar2);
    }
}
