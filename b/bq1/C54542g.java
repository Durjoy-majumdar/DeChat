package bq1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.Future;
import up1.C37521f;

/* renamed from: bq1.g */
public final class C54542g implements C54533a {
    /* renamed from: a */
    public void mo75396a(String str) {
        C87412m.m108594g(str, "name");
        Log.m105924i("MicroMsg.FinderLifecycleCallback", "onFinderForeground: " + str);
        if (C54534b.f152892f != null) {
            C115669n.INSTANCE.mo175911u(1808, 1);
        }
        Future<?> future = C54534b.f152893g;
        if (future != null) {
            future.cancel(false);
        }
        Future<?> future2 = C54534b.f152894h;
        if (future2 != null) {
            future2.cancel(false);
        }
    }

    /* renamed from: b */
    public void mo75397b(String str) {
        C87412m.m108594g(str, "name");
        Log.m105924i("MicroMsg.FinderLifecycleCallback", "onFinderBackground: " + str);
        C54534b bVar = C54534b.f152890d;
        Future<?> future = C54534b.f152893g;
        if (future != null) {
            future.cancel(false);
        }
        C54541f fVar = C54541f.f152905d;
        C37521f fVar2 = C37521f.f99374d;
        fVar2.getClass();
        C54534b.f152893g = bVar.mo75398a(fVar, (long) C37521f.f99234M6.mo60266n().intValue(), "releaseUnFocusView");
        Future<?> future2 = C54534b.f152894h;
        if (future2 != null) {
            future2.cancel(false);
        }
        C54539d dVar = C54539d.f152903d;
        fVar2.getClass();
        C54534b.f152894h = bVar.mo75398a(dVar, (long) C37521f.f99243N6.mo60266n().intValue(), "releaseAllView");
    }
}
