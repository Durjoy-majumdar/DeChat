package w50;

import com.tencent.live2.V2TXLivePremier;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: w50.c */
public final class C38013c extends V2TXLivePremier.V2TXLivePremierObserver {
    public void onLog(int i, String str) {
        switch (i) {
            case 0:
                Log.m105926v("MicroMsg.LiveCoreSdk", "[LiteAV][" + i + ']' + str);
                return;
            case 1:
                Log.m105918d("MicroMsg.LiveCoreSdk", "[LiteAV][" + i + ']' + str);
                return;
            case 2:
                Log.m105924i("MicroMsg.LiveCoreSdk", "[LiteAV][" + i + ']' + str);
                return;
            case 3:
                Log.m105928w("MicroMsg.LiveCoreSdk", "[LiteAV][" + i + ']' + str);
                return;
            case 4:
            case 5:
            case 6:
                Log.m105920e("MicroMsg.LiveCoreSdk", "[LiteAV][" + i + ']' + str);
                return;
            default:
                return;
        }
    }
}
