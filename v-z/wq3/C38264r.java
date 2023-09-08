package wq3;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lu3.C34379c;
import te3.e85;
import xq3.C38806a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: wq3.r */
public final class C38264r extends C86301e {

    /* renamed from: d */
    public C34379c<?> f101034d;

    /* renamed from: e */
    public final C114668z.C104589a f101035e = new C38265a(this);

    /* renamed from: wq3.r$a */
    public static final class C38265a extends C114668z.C104589a {

        /* renamed from: d */
        public final /* synthetic */ C38264r f101036d;

        public C38265a(C38264r rVar) {
            this.f101036d = rVar;
        }

        public void onAppBackground(String str) {
            C38806a aVar;
            Log.m105918d("MicroMsg.X2C.X2CFeatureService", "onAppBackground isMain:" + MMApplicationContext.isMainProcess() + " activity = " + str);
            if (Log.isDebug()) {
                WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
                MMFragmentActivity mMFragmentActivity = null;
                Context context = f != null ? (Activity) f.get() : null;
                if (context instanceof MMFragmentActivity) {
                    mMFragmentActivity = (MMFragmentActivity) context;
                }
                if (!(mMFragmentActivity == null || (aVar = mMFragmentActivity.inflateXMLInfo) == null)) {
                    Log.m105918d("MicroMsg.X2C.X2CFeatureService", "onAppBackground " + aVar.mo61776b());
                }
            }
            C38264r.vx0(this.f101036d);
        }

        public void onAppForeground(String str) {
            Log.m105918d("MicroMsg.X2C.X2CFeatureService", "onAppForeground() called with: activity = " + str);
        }
    }

    /* renamed from: wq3.r$b */
    public static final class C38266b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C38264r f101037d;

        public C38266b(C38264r rVar) {
            this.f101037d = rVar;
        }

        public final void run() {
            C38264r.vx0(this.f101037d);
        }
    }

    public static final void vx0(C38264r rVar) {
        rVar.getClass();
        Log.m105924i("MicroMsg.X2C.X2CFeatureService", "submitPreloadData");
        C111855q.f334885a.getClass();
        HashMap<String, C38263m> hashMap = C111855q.f334892h;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry next : hashMap.entrySet()) {
            e85 e85 = new e85();
            e85.f182940d = ((C38263m) next.getValue()).f101032a.f182940d;
            e85.f182941e.addAll(((C38263m) next.getValue()).f101032a.f182941e);
            arrayList.add(e85);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e85 e852 = (e85) it.next();
            C91095g e = C111855q.f334885a.mo163608b().mo163577e();
            if (e != null) {
                e.mo125151c(e852);
            }
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        this.f101034d = ((C119157j) C119157j.f356862d).mo183872c(new C38266b(this), 300000, 600000);
        this.f101035e.alive();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        C34379c<?> cVar = this.f101034d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f101035e.dead();
    }
}
