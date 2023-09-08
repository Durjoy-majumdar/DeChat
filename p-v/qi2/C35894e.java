package qi2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import ke3.C88144b;
import oi2.C77010f;

/* renamed from: qi2.e */
public class C35894e extends IStaticListener<JsApiOpenC2CTransferMsgViewEvent> {
    public boolean callback(IEvent iEvent) {
        C72963f4 f4Var;
        C68070l.C68072b u;
        JsApiOpenC2CTransferMsgViewEvent jsApiOpenC2CTransferMsgViewEvent = (JsApiOpenC2CTransferMsgViewEvent) iEvent;
        C77010f.vx0().getClass();
        if (!Util.isNullOrNil(jsApiOpenC2CTransferMsgViewEvent.f78843d.f78845b) && !Util.isNullOrNil(jsApiOpenC2CTransferMsgViewEvent.f78843d.f78844a)) {
            boolean z = C45628s0.m50740E(jsApiOpenC2CTransferMsgViewEvent.f78843d.f78845b) || C72996z1.m85807K5(jsApiOpenC2CTransferMsgViewEvent.f78843d.f78845b);
            Log.m105925i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, isContact: %s, createTime: %s", Boolean.valueOf(z), jsApiOpenC2CTransferMsgViewEvent.f78843d.f78846c);
            jsApiOpenC2CTransferMsgViewEvent.f78843d.getClass();
            Context context = MMApplicationContext.getContext();
            if (!z) {
                C77010f.Ax0(context, true);
            } else {
                Long l = jsApiOpenC2CTransferMsgViewEvent.f78843d.f78846c;
                if (l.longValue() < 10000000000L) {
                    l = Long.valueOf((jsApiOpenC2CTransferMsgViewEvent.f78843d.f78846c.longValue() * 1000) - 1000);
                }
                C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
                String str = jsApiOpenC2CTransferMsgViewEvent.f78843d.f78845b;
                long longValue = l.longValue();
                C72972g4 g4Var = (C72972g4) LE;
                g4Var.getClass();
                String str2 = "SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " > " + longValue + " ORDER BY " + "createTime" + " ASC ";
                Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
                Cursor rawQuery = g4Var.f212775p.rawQuery(str2, (String[]) null);
                int i = 0;
                while (true) {
                    if (!rawQuery.moveToNext() || i >= 50) {
                        f4Var = null;
                    } else {
                        i++;
                        f4Var = new C72963f4();
                        f4Var.convertFrom(rawQuery);
                        String processXml = Util.processXml(f4Var.getContent());
                        if (processXml != null && (u = C68070l.C68072b.m80422u(processXml, f4Var.mo108775z2())) != null && jsApiOpenC2CTransferMsgViewEvent.f78843d.f78844a.equals(u.f195501J0)) {
                            Log.m105925i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, found local msg, createTime: %s", jsApiOpenC2CTransferMsgViewEvent.f78843d.f78846c);
                            break;
                        }
                    }
                }
                f4Var = null;
                rawQuery.close();
                if (f4Var == null || f4Var.getMsgId() <= 0) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, cannot find local msg");
                    C77010f.Ax0(context, false);
                } else {
                    Log.m105925i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, localMsgId: %s, createTime: %s", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.getCreateTime()));
                    C88144b.m109801s(context, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", jsApiOpenC2CTransferMsgViewEvent.f78843d.f78845b).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", f4Var.getMsgId()).putExtra("need_hight_item", true), (Bundle) null);
                }
            }
        }
        return false;
    }
}
