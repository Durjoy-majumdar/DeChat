package el2;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import g40.C32315i;
import vl2.C37754h;

/* renamed from: el2.d */
public class C31616d implements C32315i {
    public void onNetworkChange(int i) {
        new MMHandler(Looper.getMainLooper()).post(C37754h.f100001d);
    }
}
