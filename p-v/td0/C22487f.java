package td0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import rd0.C22222c;
import rd0.C22226d;
import sx3.C64197v;

/* renamed from: td0.f */
public final class C22487f implements C22226d {

    /* renamed from: a */
    public final /* synthetic */ SubscribeMsgTmpItem f63679a;

    /* renamed from: b */
    public final /* synthetic */ C22222c.C22224b f63680b;

    /* renamed from: c */
    public final /* synthetic */ C22488g f63681c;

    /* renamed from: d */
    public final /* synthetic */ String f63682d;

    public C22487f(SubscribeMsgTmpItem subscribeMsgTmpItem, C22222c.C22224b bVar, C22488g gVar, String str) {
        this.f63679a = subscribeMsgTmpItem;
        this.f63680b = bVar;
        this.f63681c = gVar;
        this.f63682d = str;
    }

    /* renamed from: a */
    public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C22222c.C22225c cVar;
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgRequestResult, "result");
        SubscribeMsgTmpItem subscribeMsgTmpItem = this.f63679a;
        Log.m105927v("MicroMsg.SubscribeStatusUpdateManager", "alvinluo switchSubscribeStatus onSuccess bizUsername: %s, templateId: %s, settingStatus: %d", str, subscribeMsgTmpItem.f49021f, Integer.valueOf(subscribeMsgTmpItem.f49025j));
        ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f49004h;
        SubscribeMsgTmpItem subscribeMsgTmpItem2 = this.f63679a;
        boolean z = false;
        boolean z2 = false;
        for (SubscribeMsgTmpItem subscribeMsgTmpItem3 : arrayList) {
            if (subscribeMsgTmpItem2.f49021f.equals(subscribeMsgTmpItem3.f49021f)) {
                z2 = subscribeMsgTmpItem3.f49026n;
                z = true;
            }
        }
        if (z) {
            cVar = new C22222c.C22225c(this.f63679a.f49025j == 1, z2);
        } else {
            cVar = new C22222c.C22225c(false, this.f63679a.f49026n);
        }
        SubscribeMsgTmpItem subscribeMsgTmpItem4 = this.f63679a;
        cVar.f62965c = subscribeMsgTmpItem4.f49032t;
        cVar.f62966d = subscribeMsgTmpItem4.f49033u;
        Log.m105925i("MicroMsg.SubscribeStatusUpdateManager", "alvinluo switchSubscribeStatus onSuccess hasResult: %b, isSubscribed: %b, switchOpen: %b", Boolean.valueOf(z), Boolean.valueOf(cVar.f62963a), Boolean.valueOf(cVar.f62964b));
        this.f63680b.mo35379b(this.f63679a.f49021f, cVar);
        C22222c cVar2 = this.f63681c.f63684b;
        if (cVar2 != null) {
            C22222c.C22223a.m25749a(cVar2, str, subscribeMsgRequestResult.f49004h, false, false, false, 4, (Object) null);
        }
    }

    /* renamed from: e */
    public void mo26258e(int i, int i2, String str) {
        C87412m.m108594g(str, "errMsg");
        Log.m105920e("MicroMsg.SubscribeStatusUpdateManager", "alvinluo switchSubscribeStatus onError templateId: " + this.f63679a.f49021f + ", errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
        SubscribeMsgTmpItem subscribeMsgTmpItem = this.f63679a;
        if (subscribeMsgTmpItem.f49025j == 1) {
            subscribeMsgTmpItem.f49025j = 0;
        } else {
            subscribeMsgTmpItem.f49025j = 1;
        }
        this.f63680b.mo35378a();
        C22222c cVar = this.f63681c.f63684b;
        if (cVar != null) {
            C22222c.C22223a.m25749a(cVar, this.f63682d, C64197v.m75539h(this.f63679a), false, false, false, 4, (Object) null);
        }
    }
}
