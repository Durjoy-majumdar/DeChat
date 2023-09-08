package ok1;

import af0.C16458b;
import af0.C16459c;
import af0.C16463e;
import android.content.Context;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.particles.ConfettiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: ok1.a */
public final class C62041a implements C16459c.C16461b {

    /* renamed from: a */
    public final String f176367a = "FinderLiveConfettiMangerFactory";

    /* renamed from: b */
    public final int f176368b = 50;

    /* renamed from: c */
    public ConcurrentLinkedQueue<C16459c> f176369c;

    /* renamed from: a */
    public void mo14945a(C16459c cVar) {
        C87412m.m108594g(cVar, "manager");
        if (this.f176369c == null) {
            this.f176369c = new ConcurrentLinkedQueue<>();
        }
        ConcurrentLinkedQueue<C16459c> concurrentLinkedQueue = this.f176369c;
        if (concurrentLinkedQueue != null) {
            boolean z = concurrentLinkedQueue.size() <= this.f176368b && !concurrentLinkedQueue.contains(cVar);
            String str = this.f176367a;
            Log.m105918d(str, "[onTerminated] cacheSize = " + concurrentLinkedQueue.size() + ", manager = " + cVar + " , isAddInCache = " + z);
            if (z) {
                concurrentLinkedQueue.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final C16459c mo86987b(Context context, C16458b bVar, C16463e eVar, ViewGroup viewGroup) {
        Context context2 = context;
        C16458b bVar2 = bVar;
        C16463e eVar2 = eVar;
        ViewGroup viewGroup2 = viewGroup;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bVar2, "generator");
        C87412m.m108594g(eVar2, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(viewGroup2, "root");
        if (this.f176369c == null) {
            this.f176369c = new ConcurrentLinkedQueue<>();
        }
        ConcurrentLinkedQueue<C16459c> concurrentLinkedQueue = this.f176369c;
        C16459c poll = concurrentLinkedQueue != null ? concurrentLinkedQueue.poll() : null;
        if (poll != null) {
            String str = this.f176367a;
            Log.m105918d(str, "getManager from cache, manager = " + poll);
            poll.mo14938d(bVar2, eVar2, viewGroup2, ConfettiView.m18216a(context));
            poll.f43940l = 0.001f;
            poll.f43941m = 999.99994f;
            poll.mo14940f(0.0f, 0.0f);
            poll.mo14941g(-360.0f, 50.0f);
            poll.f43925D = 1000;
            poll.f43938j = 1;
            poll.f43928G = this;
            return poll;
        }
        C16459c cVar = new C16459c(context2, bVar2, eVar2, viewGroup2);
        cVar.f43940l = 0.001f;
        cVar.f43941m = 999.99994f;
        cVar.mo14940f(0.0f, 0.0f);
        cVar.mo14941g(-360.0f, 50.0f);
        cVar.f43925D = 1000;
        cVar.f43938j = 1;
        cVar.f43928G = this;
        String str2 = this.f176367a;
        Log.m105918d(str2, "getManager from new instance, manager = " + cVar);
        return cVar;
    }
}
