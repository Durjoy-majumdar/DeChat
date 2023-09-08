package td0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import rd0.C22222c;
import rd0.C22226d;
import td0.C22478a;

/* renamed from: td0.d */
public final class C22485d implements C22226d {

    /* renamed from: a */
    public final /* synthetic */ C22488g f63673a;

    /* renamed from: b */
    public final /* synthetic */ C22478a.C22479b f63674b;

    public C22485d(C22488g gVar, C22478a.C22479b bVar) {
        this.f63673a = gVar;
        this.f63674b = bVar;
    }

    /* renamed from: a */
    public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        SubscribeMsgRequestResult subscribeMsgRequestResult2 = subscribeMsgRequestResult;
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgRequestResult2, "result");
        this.f63673a.f63683a.remove(this.f63674b.f63662b);
        C22488g gVar = this.f63673a;
        C22478a.C22479b bVar = this.f63674b;
        gVar.getClass();
        char c = 0;
        char c2 = 1;
        Log.m105925i("MicroMsg.SubscribeStatusUpdateManager", "alvinluo onUpdateSubscribeUIStatusSuccess onSuccess %d, templateId: %s", Integer.valueOf(subscribeMsgRequestResult2.f49004h.size()), bVar.f63662b);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (SubscribeMsgTmpItem subscribeMsgTmpItem : subscribeMsgRequestResult2.f49004h) {
            if (subscribeMsgTmpItem.f49021f.equals(bVar.f63662b)) {
                Object[] objArr = new Object[4];
                objArr[c] = subscribeMsgTmpItem.f49021f;
                objArr[c2] = Integer.valueOf(subscribeMsgTmpItem.f49025j);
                objArr[2] = Integer.valueOf(subscribeMsgRequestResult2.f49003g);
                objArr[3] = Boolean.valueOf(subscribeMsgTmpItem.f49026n);
                Log.m105925i("MicroMsg.SubscribeStatusUpdateManager", "alvinluo onUpdateSubscribeUIStatusSuccess templateId: %s, %d, cacheMax: %d, switchOpen: %b", objArr);
                i = subscribeMsgTmpItem.f49025j;
                z3 = subscribeMsgTmpItem.f49026n;
                z = subscribeMsgTmpItem.f49032t;
                z2 = subscribeMsgTmpItem.f49033u;
                subscribeMsgTmpItem.f49026n = subscribeMsgRequestResult2.f49008o;
                if (subscribeMsgRequestResult2.f49003g <= 0) {
                    subscribeMsgTmpItem.f49027o = System.currentTimeMillis() + 30000;
                } else {
                    subscribeMsgTmpItem.f49027o = System.currentTimeMillis() + (((long) subscribeMsgRequestResult2.f49003g) * 1000);
                }
                arrayList.add(subscribeMsgTmpItem);
                subscribeMsgRequestResult2 = subscribeMsgRequestResult;
                c = 0;
                c2 = 1;
            } else {
                subscribeMsgRequestResult2 = subscribeMsgRequestResult;
            }
        }
        C22222c.C22225c cVar = new C22222c.C22225c(i == 1, z3);
        cVar.f62965c = z;
        cVar.f62966d = z2;
        C22222c.C22224b bVar2 = bVar.f63664d;
        if (bVar2 != null) {
            bVar2.mo35379b(bVar.f63662b, cVar);
        }
        C22222c cVar2 = gVar.f63684b;
        if (cVar2 != null) {
            cVar2.mo35361b(bVar.f63661a, arrayList, z3, true, true);
        }
    }

    /* renamed from: e */
    public void mo26258e(int i, int i2, String str) {
        C87412m.m108594g(str, "errMsg");
        Log.m105920e("MicroMsg.SubscribeStatusUpdateManager", "alvinluo getSubscribeStatus onError templateId: " + this.f63674b.f63662b + ", errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
        this.f63673a.f63683a.remove(this.f63674b.f63662b);
        C22222c.C22224b bVar = this.f63674b.f63664d;
        if (bVar != null) {
            bVar.mo35378a();
        }
    }
}
