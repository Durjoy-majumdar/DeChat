package k11;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j11.C98896e;
import java.util.ArrayList;
import java.util.List;
import kr0.C88274h0;
import zt3.C119157j;

/* renamed from: k11.l */
public final class C108819l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f325854d;

    /* renamed from: e */
    public final /* synthetic */ CleanCacheUI f325855e;

    /* renamed from: f */
    public final /* synthetic */ long f325856f;

    /* renamed from: k11.l$a */
    public static final class C108820a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CleanCacheUI f325857d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f325858e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C108808a<C81427p>> f325859f;

        public C108820a(CleanCacheUI cleanCacheUI, List<String> list, ArrayList<C108808a<C81427p>> arrayList) {
            this.f325857d = cleanCacheUI;
            this.f325858e = list;
            this.f325859f = arrayList;
        }

        public final void run() {
            CleanCacheUI cleanCacheUI = this.f325857d;
            cleanCacheUI.f312127i = this.f325858e;
            C108809b bVar = cleanCacheUI.f312123e;
            if (bVar != null) {
                bVar.mo159909g(3, this.f325859f);
            }
        }
    }

    public C108819l(CancellationSignal cancellationSignal, CleanCacheUI cleanCacheUI, long j) {
        this.f325854d = cancellationSignal;
        this.f325855e = cleanCacheUI;
        this.f325856f = j;
    }

    public final void run() {
        long j;
        long j2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            CancellationSignal cancellationSignal = this.f325854d;
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            List<C81427p> Gt = ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113301Gt();
            C87412m.m108593f(Gt, "getService(IAppBrandMixE…ppBrandFileStorageLogic()");
            CancellationSignal cancellationSignal2 = this.f325854d;
            if (cancellationSignal2 != null) {
                cancellationSignal2.throwIfCanceled();
            }
            ArrayList arrayList = new ArrayList(16);
            ArrayList arrayList2 = new ArrayList();
            if (Gt.size() <= 15) {
                long j3 = 0;
                for (C81427p next : Gt) {
                    C108808a aVar = r13;
                    C108808a aVar2 = new C108808a(C88070q.m109643a(next), next.f238967c, next.f238968d, next);
                    arrayList.add(aVar);
                    j3 += next.f238968d;
                }
                j2 = j3;
                j = 0;
            } else {
                int i = 0;
                long j4 = 0;
                long j5 = 0;
                for (C81427p next2 : Gt) {
                    int i2 = i + 1;
                    if (i >= 8) {
                        arrayList2.add(next2.f238965a);
                        j4 += next2.f238968d;
                        i = i2;
                    } else {
                        arrayList.add(new C108808a(C88070q.m109643a(next2), next2.f238967c, next2.f238968d, next2));
                        j5 += next2.f238968d;
                        i = i2;
                        j4 = j4;
                    }
                }
                j2 = j5;
                j = j4;
            }
            if (!arrayList2.isEmpty()) {
                String string = this.f325855e.getString(C0966R.string.f8047au, new Object[]{Integer.valueOf(arrayList2.size())});
                C87412m.m108593f(string, "getString(R.string.clean…nd_etc, otherAppIds.size)");
                arrayList.add(new C108808a(-1, string, j, null));
            }
            long j6 = j2 + j;
            if (this.f325856f > j6) {
                String string2 = this.f325855e.getString(C0966R.string.f8048av);
                C87412m.m108593f(string2, "getString(R.string.clean_cache_appbrand_public)");
                arrayList.add(new C108808a(-2, string2, (this.f325856f - j2) - j, null));
            }
            CancellationSignal cancellationSignal3 = this.f325854d;
            if (cancellationSignal3 != null) {
                cancellationSignal3.throwIfCanceled();
            }
            C98896e.wx0().xx0(2, (com.tencent.wcdb.support.CancellationSignal) null);
            this.f325855e.f312130o = System.currentTimeMillis() - currentTimeMillis;
            this.f325855e.f312131p = Gt.size();
            CleanCacheUI cleanCacheUI = this.f325855e;
            cleanCacheUI.f312132q = j6;
            ((C119157j) C119157j.f356862d).mo183895z(new C108820a(cleanCacheUI, arrayList2, arrayList));
        } catch (OperationCanceledException unused) {
            Log.m105924i("MicroMsg.CleanCacheUI", "Loading appbrand list cancelled.");
        }
    }
}
