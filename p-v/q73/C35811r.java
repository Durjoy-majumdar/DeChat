package q73;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.LinkedList;
import rx3.C36570n;

/* renamed from: q73.r */
public final class C35811r implements Runnable {

    /* renamed from: d */
    public static final C35811r f95614d = new C35811r();

    public final void run() {
        C35812s sVar = C35812s.f95615a;
        LinkedList<String> linkedList = new LinkedList<>((LinkedList) ((C36570n) C35812s.f95616b).getValue());
        Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "init appId size = " + linkedList.size());
        for (String str : linkedList) {
            C35812s sVar2 = C35812s.f95615a;
            C87412m.m108593f(str, "appId");
            boolean z = false;
            C29315z2 a = sVar2.mo60420a(str, 0);
            if (a != null) {
                sVar2.mo60425f(str, a.field_version);
                int decodeInt = ((MultiProcessMMKV) ((C36570n) C35812s.f95617c).getValue()).decodeInt("LastUseVersion_" + str, a.field_version);
                if (decodeInt == a.field_version) {
                    z = true;
                }
                if (!z) {
                    sVar2.mo60425f(str, decodeInt);
                }
            }
        }
    }
}
