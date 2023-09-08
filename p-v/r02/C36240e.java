package r02;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import java.net.URLDecoder;
import java.util.Map;
import ob0.C35136m;
import p02.C35356b;
import t02.C36922a;
import t02.C48527c;

/* renamed from: r02.e */
public class C36240e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), 0) == 35) {
            Log.m105924i("HoneyPayNewXmlListener", "receive honey pay newxml");
            String str2 = map.get(".sysmsg.paymsg.appmsgcontent");
            String str3 = map.get(".sysmsg.paymsg.fromusername");
            String str4 = map.get(".sysmsg.paymsg.tousername");
            String str5 = map.get(".sysmsg.paymsg.paymsgid");
            String str6 = map.get(".sysmsg.paymsg.systip");
            if (!Util.isNullOrNil(str2)) {
                String decode = URLDecoder.decode(str2);
                Log.m105919d("HoneyPayNewXmlListener", "appmsg: %s", decode);
                C48527c.m53915k(str5, decode, str4, str3);
            }
            if (!Util.isNullOrNil(str6)) {
                String decode2 = URLDecoder.decode(str6);
                Log.m105919d("HoneyPayNewXmlListener", "systip: %s", decode2);
                C36922a aVar2 = new C36922a();
                aVar2.field_payMsgId = str5;
                ((C35356b) C86312j.m106911c(C35356b.class)).f94683d.mo59825a().get(aVar2, new String[0]);
                if (aVar2.field_msgId > 0) {
                    if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(aVar2.field_msgId).getMsgId() <= 0) {
                        Log.m105924i("HoneyPayNewXmlListener", "can not found honey bubble, will not insert sysmsg");
                    } else if (C75592q0.m90764L(str3)) {
                        C48527c.m53910f(str4, decode2, str3);
                    } else {
                        C48527c.m53910f(str3, decode2, str4);
                    }
                } else {
                    Log.m105924i("HoneyPayNewXmlListener", "can not found honey pay record, will not insert sysmsg");
                }
            }
        }
    }
}
