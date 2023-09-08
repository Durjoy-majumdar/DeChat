package s02;

import com.tencent.p014mm.autogen.events.ReceiveHoneyPayAppMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p02.C35356b;
import t02.C36922a;
import t02.C48527c;

/* renamed from: s02.b */
public class C36611b extends IStaticListener<ReceiveHoneyPayAppMsgEvent> {
    public boolean callback(IEvent iEvent) {
        ReceiveHoneyPayAppMsgEvent receiveHoneyPayAppMsgEvent = (ReceiveHoneyPayAppMsgEvent) iEvent;
        ReceiveHoneyPayAppMsgEvent.C28795a aVar = receiveHoneyPayAppMsgEvent.f78908d;
        Log.m105925i("ReceiveHoneyPayAppMsgEventIListener", "receive honey pay msg: %s, %s", aVar.f78910b, Long.valueOf(aVar.f78909a));
        if (!Util.isNullOrNil(receiveHoneyPayAppMsgEvent.f78908d.f78910b)) {
            ReceiveHoneyPayAppMsgEvent.C28795a aVar2 = receiveHoneyPayAppMsgEvent.f78908d;
            if (aVar2.f78909a > -1) {
                if (!Util.isNullOrNil(aVar2.f78912d)) {
                    Log.m105919d("ReceiveHoneyPayAppMsgEventIListener", "need replace username: %s", receiveHoneyPayAppMsgEvent.f78908d.f78912d);
                    ReceiveHoneyPayAppMsgEvent.C28795a aVar3 = receiveHoneyPayAppMsgEvent.f78908d;
                    String j = C48527c.m53914j(aVar3.f78911c, aVar3.f78912d, 6);
                    if (!j.equals(receiveHoneyPayAppMsgEvent.f78908d.f78911c)) {
                        receiveHoneyPayAppMsgEvent.f78908d.f78911c = j;
                    } else {
                        receiveHoneyPayAppMsgEvent.f78908d.f78911c = null;
                    }
                }
                C36922a aVar4 = new C36922a();
                ReceiveHoneyPayAppMsgEvent.C28795a aVar5 = receiveHoneyPayAppMsgEvent.f78908d;
                aVar4.field_msgId = aVar5.f78909a;
                aVar4.field_payMsgId = aVar5.f78910b;
                ((C35356b) C86312j.m106911c(C35356b.class)).f94683d.mo59825a().insert(aVar4);
            }
        }
        return false;
    }
}
