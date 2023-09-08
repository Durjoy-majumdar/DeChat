package wq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashSet;
import xb3.C15635h;
import xb3.C91163e;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91057a f261226d;

    /* renamed from: e */
    public final /* synthetic */ int f261227e;

    /* renamed from: f */
    public final /* synthetic */ String f261228f;

    public /* synthetic */ a$$a(C91057a aVar, int i, String str) {
        this.f261226d = aVar;
        this.f261227e = i;
        this.f261228f = str;
    }

    public final void run() {
        boolean z;
        C91057a aVar = this.f261226d;
        int i = this.f261227e;
        String str = this.f261228f;
        synchronized (aVar.f261225g) {
            z = false;
            if (aVar.f261225g.get(i, 0) == 1) {
                z = true;
            }
        }
        HashSet<String> hashSet = C91163e.f261395a;
        boolean z2 = !z;
        C87412m.m108594g(str, "apiName");
        Log.m105918d("WcPayReport", "afterInvoke: " + str);
        if (!z2 && C91163e.f261395a.contains(str)) {
            Log.m105918d("WcPayReport", "jsapi maybe not invoked: " + str);
            C15635h.f42265a.mo14381b("AppBrand-" + str, "2", "maybe not invoked");
        }
    }
}
