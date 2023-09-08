package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.LinkedList;
import nx1.C47305b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import u41.C52421a;
import u41.C52422b;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.d0 */
public class C40986d0 {

    /* renamed from: a */
    public static C40988b f110326a;

    /* renamed from: b */
    public static C40984c0 f110327b;

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.d0$a */
    public class C40987a implements l0$$e {
        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105925i("MicroMsg.PbAppInfoManager", "errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                C40986d0.f110327b = new C40984c0((C52422b) cVar.f127056b.f127083a);
                C40988b bVar = C40986d0.f110326a;
                if (bVar != null) {
                    bVar.mo64008a(true);
                }
            } else {
                C40988b bVar2 = C40986d0.f110326a;
                if (bVar2 != null) {
                    bVar2.mo64008a(false);
                }
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.d0$b */
    public interface C40988b {
        /* renamed from: a */
        void mo64008a(boolean z);
    }

    /* renamed from: a */
    public static C40984c0 m44429a() {
        if (f110327b == null) {
            byte[] Rz = ((C47305b) C86312j.m106911c(C47305b.class)).mo57103Rz("pb_appinfo");
            if (Rz != null) {
                f110327b = new C40984c0(Rz);
            }
            f110327b = f110327b;
        }
        return f110327b;
    }

    /* renamed from: b */
    public static void m44430b(LinkedList<String> linkedList, C40988b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C52421a aVar = new C52421a();
        aVar.f146502d = linkedList;
        aVar.f146504f = true;
        bVar2.f127066a = aVar;
        bVar2.f127067b = new C52422b();
        bVar2.f127068c = "/cgi-bin/mmgame-bin/batchgetappdownloadinfo";
        bVar2.f127069d = 2560;
        f110326a = bVar;
        C89144l0.m111429e(bVar2.mo72403a(), new C40987a(), false);
    }
}
