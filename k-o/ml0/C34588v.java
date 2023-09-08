package ml0;

import com.tencent.live2.V2TXLivePremier;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ml0.v */
public class C34588v extends V2TXLivePremier.V2TXLivePremierObserver {
    public void onLog(int i, String str) {
        if (i == 0) {
            Log.m105926v("MicroMsg.AppBrand.Live", str);
        } else if (i == 1) {
            Log.m105918d("MicroMsg.AppBrand.Live", str);
        } else if (i == 2) {
            Log.m105924i("MicroMsg.AppBrand.Live", str);
        } else if (i == 3) {
            Log.m105928w("MicroMsg.AppBrand.Live", str);
        } else if (i == 4) {
            Log.m105920e("MicroMsg.AppBrand.Live", str);
        } else if (i != 5) {
            Log.m105918d("MicroMsg.AppBrand.Live", str);
        } else {
            Log.m105922f("MicroMsg.AppBrand.Live", str);
        }
    }
}
