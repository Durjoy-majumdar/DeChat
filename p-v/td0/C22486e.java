package td0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import rd0.C22222c;
import rd0.C22226d;
import rx3.C13598b0;
import td0.C22478a;

/* renamed from: td0.e */
public final class C22486e implements C22226d {

    /* renamed from: a */
    public final /* synthetic */ C22488g f63675a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<SubscribeMsgTmpItem> f63676b;

    /* renamed from: c */
    public final /* synthetic */ String f63677c;

    /* renamed from: d */
    public final /* synthetic */ C22222c.C22224b f63678d;

    public C22486e(C22488g gVar, C8479f0<SubscribeMsgTmpItem> f0Var, String str, C22222c.C22224b bVar) {
        this.f63675a = gVar;
        this.f63676b = f0Var;
        this.f63677c = str;
        this.f63678d = bVar;
    }

    /* renamed from: a */
    public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgRequestResult, "result");
        ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f49004h;
        if (!arrayList.isEmpty()) {
            String str2 = this.f63677c;
            C22222c.C22224b bVar = this.f63678d;
            C8479f0<SubscribeMsgTmpItem> f0Var = this.f63676b;
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                T t = (SubscribeMsgTmpItem) it.next();
                if (str2.equals(t.f49021f)) {
                    C22222c.C22225c cVar = new C22222c.C22225c(t.f49025j == 1, t.f49026n);
                    cVar.f62965c = t.f49032t;
                    cVar.f62966d = t.f49033u;
                    if (bVar != null) {
                        bVar.mo35379b(str2, cVar);
                    }
                    f0Var.f27484d = t;
                }
            }
        }
        C22488g gVar = this.f63675a;
        T t2 = this.f63676b.f27484d;
        SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) t2;
        SubscribeMsgTmpItem subscribeMsgTmpItem2 = (SubscribeMsgTmpItem) t2;
        C22478a.C22479b bVar2 = new C22478a.C22479b(str, this.f63677c, subscribeMsgTmpItem2 != null ? subscribeMsgTmpItem2.f49025j : -1);
        bVar2.f63664d = this.f63678d;
        C13598b0 b0Var = C13598b0.f38549a;
        gVar.mo35628a(subscribeMsgTmpItem, bVar2);
    }

    /* renamed from: e */
    public void mo26258e(int i, int i2, String str) {
        C87412m.m108594g(str, "errMsg");
        Log.m105920e("MicroMsg.SubscribeStatusUpdateManager", "alvinluo loadSubscribeMsgList onError templateId: " + this.f63677c + ", errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
        C22222c.C22224b bVar = this.f63678d;
        if (bVar != null) {
            bVar.mo35378a();
        }
    }
}
