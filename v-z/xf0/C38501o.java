package xf0;

import ag0.C27888a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.autogen.events.ReceiveAANewXmlEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import vf0.C37726b;
import yf0.C79104i;

/* renamed from: xf0.o */
public class C38501o extends IStaticListener<ReceiveAANewXmlEvent> {
    public boolean callback(IEvent iEvent) {
        ReceiveAANewXmlEvent receiveAANewXmlEvent = (ReceiveAANewXmlEvent) iEvent;
        Class cls = C75700k0.class;
        Object[] objArr = new Object[5];
        objArr[0] = Boolean.valueOf(receiveAANewXmlEvent.f78902d.f78904b == null);
        objArr[1] = Integer.valueOf(receiveAANewXmlEvent.f78902d.f78903a);
        ReceiveAANewXmlEvent.C28794a aVar = receiveAANewXmlEvent.f78902d;
        objArr[2] = aVar.f78905c;
        objArr[3] = aVar.f78906d;
        objArr[4] = aVar.f78907e;
        Log.m105925i("ReceiveAANewXmlEventListener", "receiveAANewXmlEventListener, content==null: %s, type: %s, fromUser: %s, toUser: %s, paymsgid: %s", objArr);
        ReceiveAANewXmlEvent.C28794a aVar2 = receiveAANewXmlEvent.f78902d;
        int i = aVar2.f78903a;
        if (i == 18) {
            C79104i.m95658c(aVar2.f78904b, aVar2.f78906d);
        } else if (i == 19) {
            String str = aVar2.f78904b;
            String str2 = aVar2.f78906d;
            String str3 = aVar2.f78907e;
            synchronized (C79104i.class) {
                try {
                    if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
                        Log.m105925i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, chatroom: %s, payMsgId: %s", str2, str3);
                        String str4 = C85875k4.m106211z() ? "#7D90A9" : "#576B95";
                        String replace = str.replace("\"#037AFF\"", FastJsonResponse.QUOTE + str4 + FastJsonResponse.QUOTE);
                        C27888a jo = C37726b.xx0().mo55665jo(str3);
                        if (jo != null) {
                            if (jo.field_insertmsg) {
                                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(jo.field_msgId);
                                Log.m105925i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, update old one, msgId: %s, dbMsginfo.id: %s", Long.valueOf(jo.field_msgId), Long.valueOf(b002.getMsgId()));
                                b002.mo108732L2(replace);
                                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(jo.field_msgId, b002);
                            }
                        }
                        Log.m105924i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, insert new msg");
                        C79104i.m95669n(replace, str2, jo, str3, false);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AAUtil", "checkIfInsertPaySysMsg error: %s", e.getMessage());
                }
            }
        } else if (i == 21) {
            String str5 = aVar2.f78904b;
            String str6 = aVar2.f78906d;
            String str7 = aVar2.f78907e;
            Log.m105925i("MicroMsg.AAUtil", "insertUrgePaySysMsg, toUser: %s, paymsgid: %s", str6, str7);
            if (!Util.isNullOrNil(str5)) {
                C27888a jo4 = C37726b.xx0().mo55665jo(str7);
                if (jo4 == null || !jo4.field_insertmsg) {
                    Log.m105924i("MicroMsg.AAUtil", "insert new urge msg");
                    C79104i.m95669n(str5, str6, jo4, str7, true);
                } else {
                    C72963f4 b003 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(jo4.field_msgId);
                    Log.m105925i("MicroMsg.AAUtil", "update old one, msgId: %s, dbMsginfo.id: %s", Long.valueOf(jo4.field_msgId), Long.valueOf(b003.getMsgId()));
                    b003.mo108732L2(str5);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(jo4.field_msgId, b003);
                }
            }
        }
        return false;
    }
}
