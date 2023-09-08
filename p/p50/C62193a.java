package p50;

import ak1.C54101n0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import d50.C58113g;
import d50.C58114h;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import qt1.C63329b;
import rx3.C13598b0;
import w50.C65928b;

/* renamed from: p50.a */
public final class C62193a extends C62197e {

    /* renamed from: k1 */
    public static final C62194a f176816k1 = new C62194a((C8480h) null);

    /* renamed from: l1 */
    public static ConcurrentHashMap<Long, C62193a> f176817l1 = new ConcurrentHashMap<>(2);

    /* renamed from: j1 */
    public long f176818j1;

    /* renamed from: p50.a$a */
    public static final class C62194a {
        public C62194a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo87260a() {
            Log.m105924i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore clear, core size:" + C62193a.f176817l1.size());
            C63329b bVar = C63329b.f179694a;
            bVar.mo88233d("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore clear, core size:" + C62193a.f176817l1.size());
            for (Map.Entry next : C62193a.f176817l1.entrySet()) {
                ((C62193a) next.getValue()).mo87256C0(false);
                ((C62193a) next.getValue()).mo75581i0();
            }
            C62193a.f176817l1.clear();
        }

        /* renamed from: b */
        public final C62193a mo87261b(long j) {
            C63329b bVar = C63329b.f179694a;
            StringBuilder sb = new StringBuilder();
            sb.append(" create ");
            sb.append(j);
            sb.append(' ');
            C62193a aVar = C62193a.f176817l1.get(Long.valueOf(j));
            sb.append(aVar != null ? Integer.valueOf(aVar.hashCode()) : null);
            bVar.mo88233d("FinderLiveVisitorPlayCore", sb.toString());
            ConcurrentHashMap<Long, C62193a> concurrentHashMap = C62193a.f176817l1;
            Long valueOf = Long.valueOf(j);
            C62193a aVar2 = concurrentHashMap.get(valueOf);
            if (aVar2 == null) {
                aVar2 = new C62193a();
                synchronized (C62193a.f176817l1) {
                    C62193a aVar3 = C62193a.f176817l1.get(Long.valueOf(j));
                    if (aVar3 != null) {
                        aVar3.mo87256C0(false);
                        aVar3.mo75581i0();
                    }
                    C62193a.f176817l1.put(Long.valueOf(j), aVar2);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                aVar2.f176818j1 = j;
                Log.m105924i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore create instance:" + Integer.valueOf(aVar2.hashCode()) + ", liveId:" + j + ", core size:" + C62193a.f176817l1.size());
                C62193a putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, aVar2);
                if (putIfAbsent != null) {
                    aVar2 = putIfAbsent;
                }
            }
            return aVar2;
        }

        /* renamed from: c */
        public final C62193a mo87262c(long j) {
            C62193a aVar = C62193a.f176817l1.get(Long.valueOf(j));
            if (aVar == null) {
                Log.m105924i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore get liveId:" + j + " instance is empty, core size:" + C62193a.f176817l1.size());
            }
            return aVar;
        }

        /* renamed from: d */
        public final void mo87263d(long j) {
            C62193a remove = C62193a.f176817l1.remove(Long.valueOf(j));
            Log.m105924i("FinderLiveVisitorPlayCore", "releaseWithoutLiveId " + j + " core: " + remove);
            mo87260a();
            if (remove != null) {
                C62193a.f176817l1.put(Long.valueOf(j), remove);
            }
        }
    }

    /* renamed from: B0 */
    public void mo87255B0(int i, TXCloudVideoView tXCloudVideoView, C32226l<? super Boolean, C13598b0> lVar) {
        Log.m105924i("FinderLiveVisitorPlayCore", "cdnStartPlay liveId:" + this.f176818j1 + '(' + this + ")!");
        super.mo87255B0(i, tXCloudVideoView, lVar);
    }

    /* renamed from: C0 */
    public void mo87256C0(boolean z) {
        Log.m105924i("FinderLiveVisitorPlayCore", "cdnStopPlay liveId:" + this.f176818j1 + '(' + this + ")!");
        super.mo87256C0(z);
    }

    /* renamed from: H0 */
    public boolean mo87257H0() {
        return !mo87267F0();
    }

    /* renamed from: M0 */
    public void mo85235M0(boolean z) {
        super.mo85235M0(z);
    }

    /* renamed from: P */
    public Point mo85236P(Context context) {
        C87412m.m108594g(context, "context");
        boolean Z = mo85682Z();
        Log.m105924i("FinderLiveVisitorPlayCore", "calcMiniWindowSize isInLinkMic:" + Z + ", videoWidth:" + this.f176825b1 + ", videoHeight:" + this.f176826c1);
        return Z ? super.mo85236P(context) : C65928b.f189533a.mo89963a(this.f176825b1, this.f176826c1);
    }

    /* renamed from: P0 */
    public boolean mo87258P0() {
        return !mo87267F0();
    }

    /* renamed from: i0 */
    public void mo75581i0() {
        super.mo75581i0();
    }

    public void onPlayEvent(int i, Bundle bundle) {
        String str;
        C58113g gVar;
        if ((i == -2304 && this.f176822Y0.f152638l > 0) || i != -2304) {
            C54101n0 n0Var = C54101n0.f151856a;
            long j = this.f176818j1;
            C58114h hVar = this.f173042z;
            if (hVar == null || (gVar = hVar.f166251b) == null || (str = gVar.f166245o) == null) {
                str = "";
            }
            n0Var.mo74800g(i, bundle, j, str, 1);
        }
        super.onPlayEvent(i, bundle);
    }

    public String toString() {
        return super.toString() + ",Core liveId:" + this.f176818j1;
    }
}
