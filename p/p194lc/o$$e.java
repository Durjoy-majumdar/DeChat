package p194lc;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.d1$$r;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.skyline.IRouteBackCallback;
import java.util.Objects;
import p1044ub.C90630c;

/* renamed from: lc.o$$e */
public class o$$e implements IRouteBackCallback {

    /* renamed from: a */
    public final SparseArray<d1$$r> f255507a = new SparseArray<>();

    /* renamed from: b */
    public final /* synthetic */ C88453o f255508b;

    public o$$e(C88453o oVar) {
        this.f255508b = oVar;
    }

    public void onBack(int i, int i2) {
        if (i == this.f255508b.mo116060g0()) {
            if (!C2039g2.m1987a()) {
                C83780d1 d1Var = (C83780d1) this.f255508b.mo124764Z();
                if (d1Var == null) {
                    Log.m105921e("Luggage.MPPageRendererSkylineImpl", "mSkylineNotifyRouteBackCallback.onBack, windowId:%d, pageId:%d, null == component", Integer.valueOf(i), Integer.valueOf(i2));
                    return;
                }
                d1Var.mo109673t(new o$$e$$b(this, i, i2));
                return;
            }
            int hash = Objects.hash(new Object[]{2, Long.valueOf(Util.currentTicks())});
            if (((C90630c) this.f255508b.mo124764Z()).mo116202w0((long) hash, i2) > 0) {
                o$$e$$c o__e__c = new o$$e$$c(this, ((C90630c) this.f255508b.mo124764Z()).f244572U, hash);
                this.f255507a.put(i2, o__e__c);
                this.f255508b.mo116074u0(o__e__c);
            }
        }
    }

    public void onBackDone(int i, int i2) {
        if (i == this.f255508b.mo116060g0()) {
            if (!C2039g2.m1987a()) {
                C83780d1 d1Var = (C83780d1) this.f255508b.mo124764Z();
                if (d1Var == null) {
                    Log.m105921e("Luggage.MPPageRendererSkylineImpl", "mSkylineNotifyRouteBackCallback.onBackDone, windowId:%d, pageId:%d, null == component", Integer.valueOf(i), Integer.valueOf(i2));
                    return;
                }
                d1Var.mo109673t(new o$$e$$a(this, i, i2));
                return;
            }
            int indexOfKey = this.f255507a.indexOfKey(i2);
            if (indexOfKey >= 0) {
                this.f255507a.removeAt(indexOfKey);
                this.f255507a.valueAt(indexOfKey).run();
            }
        }
    }
}
