package fq0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86093e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p963fc.C86812g;
import wq0.C91065g;

/* renamed from: fq0.b */
public final class C87074b extends C86093e {

    /* renamed from: d */
    public C91065g.C91068c f252664d;

    /* renamed from: fq0.b$a */
    public class C87075a implements C91065g.C91068c {

        /* renamed from: fq0.b$a$a */
        public class C87076a extends HashMap<String, Object> {
            public C87076a(C87075a aVar, byte[] bArr, byte[] bArr2) {
                put("fg", bArr);
                put("bg", bArr2);
            }
        }

        /* renamed from: fq0.b$a$b */
        public class C87077b extends HashMap<String, Object> {
            public C87077b(C87075a aVar, HashMap hashMap) {
                C87074b.m108094d(this, hashMap);
            }
        }

        public C87075a() {
        }

        /* renamed from: a */
        public void mo121545a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            Log.m105924i("MicroMsg.ProxyOnPermissionUpdateListener", "onUpdate");
            C87074b.this.mo120520c(new C87076a(this, bArr, bArr2));
        }

        /* renamed from: b */
        public void mo121546b(HashMap<String, AppRuntimeApiPermissionBundle> hashMap) {
            Log.m105924i("MicroMsg.ProxyOnPermissionUpdateListener", "onPluginUpdate");
            if (hashMap != null) {
                C87074b.this.mo120520c(new C87077b(this, hashMap));
            }
        }
    }

    public C87074b(C86093e.C86094a aVar, C81925i2 i2Var) {
        super(aVar, i2Var);
    }

    /* renamed from: d */
    public static void m108094d(Map<String, Object> map, Map<String, AppRuntimeApiPermissionBundle> map2) {
        HashMap hashMap = new HashMap();
        map.put("plugins", hashMap);
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry next : map2.entrySet()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("fg", ((AppRuntimeApiPermissionBundle) next.getValue()).f245266d);
                hashMap2.put("bg", ((AppRuntimeApiPermissionBundle) next.getValue()).f245267e);
                hashMap.put((String) next.getKey(), hashMap2);
            }
        }
    }

    /* renamed from: a */
    public void mo120518a() {
        C91065g gVar;
        if (this.f252664d != null && this.f250577a.getRuntime() != null && (gVar = ((C86812g) this.f250577a.getRuntime()).f251968f1) != null) {
            C91065g.C91068c cVar = this.f252664d;
            synchronized (gVar.f261245e) {
                ((ArrayList) gVar.f261251k).remove(cVar);
            }
        }
    }

    /* renamed from: b */
    public void mo120519b() {
        C91065g gVar = ((C86812g) this.f250577a.getRuntime()).f251968f1;
        if (gVar == null) {
            Log.m105920e("MicroMsg.ProxyOnPermissionUpdateListener", "AppRuntimeApiPermissionController null");
            return;
        }
        C87075a aVar = new C87075a();
        this.f252664d = aVar;
        synchronized (gVar.f261245e) {
            ((ArrayList) gVar.f261251k).add(aVar);
        }
    }
}
