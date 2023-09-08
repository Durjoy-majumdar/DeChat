package dx2;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kr0.C33983a1;
import kr0.C33987b1;
import um0.C22655d;

/* renamed from: dx2.c */
public final class C31342c implements Runnable {

    /* renamed from: d */
    public static final C31342c f83889d = new C31342c();

    public final void run() {
        C33987b1 b1Var;
        C33983a1 a1Var;
        Class cls = C33987b1.class;
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(C31343d.f83890a.mo58078c());
        Log.m105924i("MicroMsg.SurfaceApp.PackageDownloadManager", "init appId size = " + linkedList.size());
        for (String str : linkedList) {
            ConcurrentHashMap<String, String> concurrentHashMap = C31343d.f83895f;
            if (concurrentHashMap.containsKey(str) && (a1Var = (C33983a1) C86312j.m106911c(C33983a1.class)) != null) {
                a1Var.mo56532sv(concurrentHashMap.get(str), str, C22655d.CTRL_INDEX);
            }
            C31343d dVar = C31343d.f83890a;
            boolean z = false;
            C29315z2 d = dVar.mo58079d(str, 0);
            if (d != null) {
                C33987b1 b1Var2 = (C33987b1) C86312j.m106911c(cls);
                if (b1Var2 != null) {
                    b1Var2.mo59394hF(str, d.field_version);
                }
                MultiProcessMMKV b = dVar.mo58077b();
                int decodeInt = b.decodeInt("surfaceLastUseVersion_" + str, d.field_version);
                if (decodeInt == d.field_version) {
                    z = true;
                }
                if (!z && (b1Var = (C33987b1) C86312j.m106911c(cls)) != null) {
                    b1Var.mo59394hF(str, decodeInt);
                }
            }
        }
    }
}
