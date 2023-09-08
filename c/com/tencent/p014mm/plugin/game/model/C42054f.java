package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C52105ye2;

/* renamed from: com.tencent.mm.plugin.game.model.f */
public class C42054f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ String f113310d;

    /* renamed from: com.tencent.mm.plugin.game.model.f$a */
    public class C42055a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52105ye2 f113311d;

        public C42055a(C52105ye2 ye22) {
            this.f113311d = ye22;
        }

        public void run() {
            C52105ye2 ye22 = this.f113311d;
            String str = C42054f.this.f113310d;
            String str2 = C42059h.f113319a;
            if (ye22 != null) {
                if (Util.isNullOrNil((List) ye22.f145248d)) {
                    Log.m105925i("MicroMsg.GameCommOpertionProcessor", "menu list is null. appid:%s", str);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ye22.f145248d);
                C42059h.m45763a(arrayList, new C42057g(str, ye22));
            }
        }
    }

    public C42054f(String str) {
        this.f113310d = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            Log.m105925i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", this.f113310d);
            C86709a0.m107524d().mo123470p(1369, this);
            MMHandlerThread.postToMainThread(new C42055a((C52105ye2) ((C42145x0) yVar).f113596e.f127056b.f127083a));
            return;
        }
        Log.m105925i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", this.f113310d);
    }
}
