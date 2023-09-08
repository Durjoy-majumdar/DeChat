package yd0;

import com.tencent.p014mm.msgsubscription.ShowInfo;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.WordingInfo;
import com.tencent.p014mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rd0.C22226d;
import xd0.C23073a;
import xd0.C23084k;

/* renamed from: yd0.c */
public final class C23288c extends C23283a {

    /* renamed from: e */
    public C22226d f66935e;

    /* renamed from: f */
    public C23073a f66936f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23288c(String str, C23073a aVar, C22226d dVar) {
        super(str);
        C87412m.m108594g(str, "username");
        this.f66936f = aVar;
        this.f66935e = dVar;
    }

    public void run() {
        SubscribeMsgRequestResult subscribeMsgRequestResult;
        List<SubscribeMsgTmpItem> list;
        C23073a aVar = this.f66936f;
        ISubscribeMsgService$Companion$SubscribeMsgListWrapper p2 = aVar != null ? aVar.mo36474p2(this.f66921a) : null;
        ArrayList arrayList = new ArrayList();
        if (!(p2 == null || (list = p2.f49048d) == null)) {
            for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                if (subscribeMsgTmpItem.f49022g == 3) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        C22226d dVar = this.f66935e;
        if (dVar != null) {
            String str = this.f66921a;
            new SubscribeMsgRequestResult(false, "", "", 0, arrayList, false, false, (WordingInfo) null, p2 != null ? p2.f49049e : false, true, new byte[0], -1, (ShowInfo) null, "", "", 0, "", false, "");
            dVar.mo26257a(str, subscribeMsgRequestResult);
        }
        C23084k.f66311a.mo36491a(this);
    }
}
