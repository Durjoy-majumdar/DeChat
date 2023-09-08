package eh3;

import android.os.Build;
import fh3.C116870a;
import fh3.C116871b;
import fh3.C116874c;
import fh3.C116875d;
import fh3.C116876e;
import fh3.C116877f;
import fh3.C116878g;
import fh3.C116881h;
import fh3.C116882i;
import fh3.C116883j;
import fh3.C116884k;
import fh3.C116885l;
import fh3.C116886m;
import java.util.HashMap;

/* renamed from: eh3.d */
public final class C116772d {

    /* renamed from: a */
    public static final HashMap<String, C116771c> f350090a;

    static {
        C116871b bVar = new C116871b();
        C116874c cVar = new C116874c();
        C116875d dVar = new C116875d();
        C116876e eVar = new C116876e();
        C116877f fVar = new C116877f();
        C116883j jVar = new C116883j();
        C116884k kVar = new C116884k();
        C116882i iVar = new C116882i();
        C116881h hVar = new C116881h();
        C116886m mVar = new C116886m();
        C116870a aVar = new C116870a();
        C116885l lVar = new C116885l();
        C116878g gVar = new C116878g();
        HashMap<String, C116771c> hashMap = new HashMap<>();
        hashMap.put("getConnectionInfo", bVar);
        hashMap.put("getInstalledPackages", fVar);
        hashMap.put("getDeviceId", cVar);
        hashMap.put("getSubscriberId", jVar);
        hashMap.put("getDeviceIdWithFeature", dVar);
        hashMap.put("getImeiForSlot", eVar);
        hashMap.put("getSubscriberIdForSubscriber", kVar);
        hashMap.put("getSerialForPackage", iVar);
        hashMap.put("getSerial", hVar);
        hashMap.put("queryIntentActivities", mVar);
        hashMap.put("addPrimaryClipChangedListener", aVar);
        hashMap.put("listenForSubscriber", lVar);
        if (Build.VERSION.SDK_INT >= 29) {
            hashMap.put("getScanResults", gVar);
        }
        f350090a = hashMap;
    }
}
