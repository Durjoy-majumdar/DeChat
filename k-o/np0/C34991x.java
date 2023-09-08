package np0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kb0.C33865k;
import np0.C34987w;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50376ma2;
import te3.el4;

/* renamed from: np0.x */
public class C34991x implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C34987w.C34989b f93922d;

    public C34991x(C34987w.C34989b bVar) {
        this.f93922d = bVar;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        LinkedList<el4> linkedList;
        C50376ma2 ma22 = (C50376ma2) cVar.f127056b.f127083a;
        Log.m105925i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0 && (linkedList = ma22.f137926d) != null && linkedList.size() > 0) {
            Log.m105925i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg response.updatable_msg_list.size:%d", Integer.valueOf(ma22.f137926d.size()));
            C34987w.C34989b bVar = this.f93922d;
            bVar.getClass();
            Iterator<el4> it = ma22.f137926d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                el4 next = it.next();
                if (next.f133002h != 0) {
                    C34987w.C34988a aVar = (C34987w.C34988a) ((ConcurrentHashMap) bVar.f93918d).get(Integer.valueOf(next.f132998d.hashCode()));
                    if (aVar == null) {
                        Log.m105919d("MicroMsg.WxaUpdateableMsgService", "share_key:%s getUpdatableMsgWorkers is null", next.f132998d);
                        break;
                    }
                    aVar.f93913c = next.f133002h;
                    aVar.f93914d = System.currentTimeMillis();
                }
            }
            this.f93922d.getClass();
            Iterator<el4> it4 = ma22.f137926d.iterator();
            while (it4.hasNext()) {
                el4 next2 = it4.next();
                ((C33865k) C86312j.m106911c(C33865k.class)).mo59342x7(next2.f132998d, next2.f133000f, next2.f133001g, next2.f133002h, next2.f133003i);
            }
            C34987w.C34989b bVar2 = this.f93922d;
            bVar2.getClass();
            Iterator<el4> it5 = ma22.f137926d.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                el4 next3 = it5.next();
                C34987w.C34988a aVar2 = (C34987w.C34988a) ((ConcurrentHashMap) bVar2.f93918d).get(Integer.valueOf(next3.f132998d.hashCode()));
                if (aVar2 == null) {
                    Log.m105919d("MicroMsg.WxaUpdateableMsgService", "share_key:%s getUpdatableMsgWorkers is null", next3.f132998d);
                    break;
                }
                Log.m105919d("MicroMsg.WxaUpdateableMsgService", "updatableMsgInfo.share_key:%s update %s updatePeriod:%d state:%d", next3.f132998d, next3.f133000f, Integer.valueOf(next3.f133002h), Integer.valueOf(next3.f133003i));
                C33865k.C33866a aVar3 = aVar2.f93915e;
                if (aVar3 != null) {
                    aVar3.mo59343a(next3.f132998d, next3);
                }
            }
            this.f93922d.mo59816a();
        }
        return 0;
    }
}
