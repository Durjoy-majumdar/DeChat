package i32;

import android.net.Uri;
import b42.C28255e;
import b63.C67186g0;
import com.tencent.p014mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import g32.C32307c;
import g32.C75846b;
import p281yz.C79173v;
import zt3.C119157j;

/* renamed from: i32.h */
public class C76283h extends IStaticListener<WalletReceiveLuckyMoneyAppMsgEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        WalletReceiveLuckyMoneyAppMsgEvent walletReceiveLuckyMoneyAppMsgEvent = (WalletReceiveLuckyMoneyAppMsgEvent) iEvent;
        C75846b zx02 = C75846b.zx0();
        zx02.getClass();
        Class cls = C79173v.class;
        if (!Util.isNullOrNil(walletReceiveLuckyMoneyAppMsgEvent.f194099d.f194100a)) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(walletReceiveLuckyMoneyAppMsgEvent.f194099d.f194100a, (String) null);
            if (!Util.isNullOrNil(u.f195608o1)) {
                Log.m105925i("MicroMsg.SubCoreLuckyMoney", "receive lucky money: %s", u.f195608o1);
                try {
                    str = Uri.parse(Util.nullAsNil(u.f195608o1)).getQueryParameter("sendid");
                } catch (Exception unused) {
                    str = "";
                }
                C68062c cVar = (C68062c) u.mo93555w(C68062c.class);
                C67186g0 jo = ((C79173v) C86312j.m106911c(cls)).mo109172tc().mo105871jo(u.f195608o1);
                if (jo == null) {
                    jo = new C67186g0();
                }
                if (Util.isNullOrNil(jo.field_mNativeUrl)) {
                    jo.field_mNativeUrl = u.f195608o1;
                    jo.field_receiveStatus = 0;
                    if (!Util.isNullOrNil(cVar.f195397n)) {
                        jo.field_hbType = 3;
                        jo.field_exclusiveUsername = cVar.f195397n;
                    }
                    jo.field_invalidtime = u.f195504K0;
                    WalletReceiveLuckyMoneyAppMsgEvent.C67830a aVar = walletReceiveLuckyMoneyAppMsgEvent.f194099d;
                    jo.field_sender = aVar.f194101b;
                    jo.field_sendId = str;
                    jo.field_msgSvrId = aVar.f194102c;
                }
                ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(jo);
                if (jo.field_hbType == 3 && C75592q0.m90789s().equals(jo.field_exclusiveUsername)) {
                    String str2 = walletReceiveLuckyMoneyAppMsgEvent.f194099d.f194101b;
                    ((C119157j) C119157j.f356862d).mo183876g(new C32307c(zx02, str2, true), "update_hb_red_flag_2");
                }
                C28255e eVar = new C28255e();
                eVar.field_send_id = str;
                if (!zx02.Ax0().get(eVar, new String[0])) {
                    eVar.field_open_count = 0;
                    Log.m105919d("MicroMsg.SubCoreLuckyMoney", "insert record: %s, %s", str, Boolean.valueOf(zx02.Ax0().insert(eVar)));
                }
            }
        }
        return false;
    }
}
