package hn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import jn1.C9479b;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: hn1.a */
public final class C8613a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49712hj1 f27715d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51942x91> f27716e;

    public C8613a(C49712hj1 hj12, LinkedList<C51942x91> linkedList) {
        this.f27715d = hj12;
        this.f27716e = linkedList;
    }

    public final void run() {
        C8614b bVar = C8614b.f27717a;
        C49712hj1 hj12 = this.f27715d;
        LinkedList<C51942x91> linkedList = this.f27716e;
        if (!bVar.mo9477b()) {
            Log.m105928w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for enableNearbyLivePagesPreload:" + bVar.mo9477b());
            return;
        }
        Log.m105924i("NearbyPreloadManager", "startPreloadNearbyLiveTabPages tabList:" + linkedList.size());
        for (C51942x91 x912 : linkedList) {
            if (C8614b.f27719c.containsKey(Integer.valueOf(x912.f144531d))) {
                Log.m105928w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for map contains tab:[" + x912.f144531d + ", " + x912.f144532e + ']');
            } else {
                Iterator<C51942x91> it = C8614b.f27721e.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().f144531d == x912.f144531d) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    Log.m105928w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab page rendered tab:[" + x912.f144531d + ", " + x912.f144532e + ']');
                } else if (!x912.f144533f) {
                    Log.m105928w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab disable preload:[" + x912.f144531d + ", " + x912.f144532e + ']');
                } else {
                    C8614b bVar2 = C8614b.f27717a;
                    int i2 = x912.f144531d;
                    int a = bVar2.mo9476a(i2);
                    C9479b d = bVar2.mo9479d(a, i2, 12);
                    C87412m.m108594g(hj12, "contextObj");
                    d.mo10170k();
                    d.f29575r = hj12;
                    d.mo10167h();
                    C8614b.f27719c.put(Integer.valueOf(i2), d);
                    Log.m105924i("NearbyPreloadManager", "startAndPutTargetNearbyLiveSquareTabPagePreload PagePreloadMap commentScene " + a + " TabId: " + i2 + " memoryType: " + (i2 + 1005000 + bVar2.mo9476a(i2)));
                }
            }
        }
    }
}
