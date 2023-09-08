package cw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xv2.C79003c;

/* renamed from: cw2.e */
public final class C75306e implements Runnable {

    /* renamed from: d */
    public static final C75306e f221458d = new C75306e();

    public final void run() {
        if (!C75307f.f221462d) {
            C75307f.f221462d = true;
            if (C75307f.f221461c != 0) {
                C75307f.f221461c = 0;
            }
            ArrayList arrayList = new ArrayList();
            List<WeakReference<C79003c>> list = C75307f.f221460b;
            C87412m.m108593f(list, "mListeners");
            synchronized (list) {
                for (WeakReference weakReference : list) {
                    if (((C79003c) weakReference.get()) == null) {
                        arrayList.add(weakReference);
                    } else {
                        C79003c cVar = (C79003c) weakReference.get();
                        if (cVar != null) {
                            cVar.mo103327a(C75307f.f221461c);
                        }
                    }
                }
            }
            C75307f.f221460b.removeAll(arrayList);
            C75307f.f221462d = false;
            Log.m105925i("MicroMsg.FavourUserChecker", "checkStoryStatus:%s nowState:%s", Integer.valueOf(C75307f.f221461c), 0);
        }
    }
}
