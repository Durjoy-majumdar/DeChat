package e42;

import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86177e;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: e42.f */
public abstract class C86428f<ViewType> extends C7594e {

    /* renamed from: b */
    public static int f251223b;

    /* renamed from: a */
    public final C86429a f251224a = new C86429a();

    /* renamed from: e42.f$a */
    public static final class C86429a {

        /* renamed from: a */
        public final ConcurrentHashMap<Integer, Object> f251225a = new ConcurrentHashMap<>();

        /* renamed from: a */
        public final <ViewType> void mo120837a(int i, ViewType viewtype) {
            C87412m.m108594g(viewtype, "view");
            Log.m105924i("MBDynamicBizContext", "addView viewId:" + i + ", view:" + viewtype + ",size:" + this.f251225a.size());
            this.f251225a.put(Integer.valueOf(i), viewtype);
        }

        /* renamed from: b */
        public final void mo120838b(int i) {
            Log.m105924i("MBDynamicBizContext", "removeView," + i);
            this.f251225a.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: f0 */
    public final int mo120836f0(ViewType viewtype) {
        int i;
        C87412m.m108594g(viewtype, "view");
        synchronized (this) {
            i = f251223b - 1;
            f251223b = i;
        }
        Log.m105924i("MBDynamicBizContext", "addCustomView,viewId:" + i);
        this.f251224a.mo120837a(i, viewtype);
        return i;
    }

    /* renamed from: g0 */
    public abstract C86177e<ViewType, ? extends Object> mo118860g0(String str);
}
