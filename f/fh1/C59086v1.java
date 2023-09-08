package fh1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: fh1.v1 */
public final class C59086v1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ HashMap<C117747y, C11385n> f169045d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f169046e;

    public C59086v1(HashMap<C117747y, C11385n> hashMap, CountDownLatch countDownLatch) {
        this.f169045d = hashMap;
        this.f169046e = countDownLatch;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C11385n nVar = this.f169045d.get(yVar);
        if (nVar != null) {
            CountDownLatch countDownLatch = this.f169046e;
            nVar.onSceneEnd(i, i2, str, yVar);
            countDownLatch.countDown();
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "countdown " + yVar.hashCode() + ", remain" + countDownLatch.getCount());
        }
    }
}
