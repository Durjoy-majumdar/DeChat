package xa1;

import cd3.C39944a;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import te3.C51807wa2;
import te3.lo4;
import wa1.C53141a;

/* renamed from: xa1.a */
public class C53316a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ String f148914d;

    /* renamed from: e */
    public final /* synthetic */ C53317b f148915e;

    public C53316a(C53317b bVar, String str) {
        this.f148915e = bVar;
        this.f148914d = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        Log.m105925i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] errType:%d  errCode:%d  errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C51807wa2 wa22 = ((C53141a) yVar).f148270i;
        if (wa22 != null) {
            Iterator<lo4> it = wa22.f143950e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                lo4 next = it.next();
                if ("snsapi_wxaapp_info".equals(next.f137553d) && next.f137554e == 1) {
                    z = true;
                    break;
                }
            }
            ExtControlProviderOpenApi extControlProviderOpenApi = this.f148915e.f148917b;
            String[] strArr = ExtControlProviderOpenApi.f269478t;
            Log.m105925i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] appid:%s  pkgName:%s  signatureMd5:%s hasPermission:%b", extControlProviderOpenApi.f269494g, extControlProviderOpenApi.mo128169b(), this.f148914d, Boolean.valueOf(z));
            if (z) {
                try {
                    int parseInt = Integer.parseInt(this.f148915e.f148916a[1]);
                    String[] strArr2 = this.f148915e.f148916a;
                    strArr2[1] = Math.min(parseInt, wa22.f143951f) + "";
                } catch (NumberFormatException unused) {
                }
                C53317b bVar = this.f148915e;
                bVar.setResultFinish(bVar.f148917b.mo128162l(bVar.f148916a, true));
                return;
            }
            this.f148915e.setResultFinish(C39944a.m42754a(4301));
            return;
        }
        this.f148915e.setResultFinish(C39944a.m42754a(4301));
    }
}
