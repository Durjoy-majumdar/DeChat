package np0;

import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel.C1752a;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31922b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: np0.m */
public enum C89048m implements C31922b1 {
    INSTANCE;
    

    /* renamed from: d */
    public HashMap<String, ArrayList<WxaAppMsgChannel>> f256698d;

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2 = str;
        Map<String, String> map2 = map;
        C35136m.C35137a aVar2 = aVar;
        if (str2 == null || !str2.equals("wxaapp_msgchannel")) {
            Log.m105920e("MicroMsg.WxaAppMsgChannelHandler", "subType is err, return");
            return null;
        }
        Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "consumeNewXml subType:%s", str2);
        String g = C48374j0.m53718g(aVar2.f94242a.f227631h);
        if (Util.isNullOrNil(g)) {
            Log.m105928w("MicroMsg.WxaAppMsgChannelHandler", "msg content is null");
            return null;
        } else if (map2.get(".sysmsg.wxaapp_msgchannel") == null) {
            return null;
        } else {
            String str3 = map2.get(".sysmsg.wxaapp_msgchannel.msg_id");
            String str4 = map2.get(".sysmsg.wxaapp_msgchannel.sender_openid");
            String str5 = map2.get(".sysmsg.wxaapp_msgchannel.receiver_openid");
            String str6 = map2.get(".sysmsg.wxaapp_msgchannel.appid");
            int i = Util.getInt(map2.get(".sysmsg.wxaapp_msgchannel.msg_type"), 0);
            String str7 = map2.get(".sysmsg.wxaapp_msgchannel.msg_content");
            long j = Util.getLong(map2.get(".sysmsg.wxaapp_msgchannel.send_time"), 0);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            long j2 = j;
            sb.append(aVar2.f94242a.f227638r);
            Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "handle addMsg.MsgId:%s", sb.toString());
            Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "handle wxaapp_msgchannel xml:%s", g);
            Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "msgId:%s, senderOpenId:%s, receiverOpenId:%s, appId:%s, msgType:%d, msgContent:%s, sendTime:%d", str3, str4, str5, str6, Integer.valueOf(i), str7, Long.valueOf(j2));
            WxaAppMsgChannel wxaAppMsgChannel = new WxaAppMsgChannel();
            wxaAppMsgChannel.f108799d = str3;
            wxaAppMsgChannel.f108800e = str4;
            wxaAppMsgChannel.f108801f = str5;
            wxaAppMsgChannel.f108802g = str6;
            wxaAppMsgChannel.f108803h = i;
            wxaAppMsgChannel.f108804i = str7;
            wxaAppMsgChannel.f108805j = j2;
            if (AppBrandProcessesManager.m103869I().mo111384F(str6)) {
                Log.m105924i("MicroMsg.WxaAppMsgChannelHandler", "send msg to runtime client");
                synchronized (this) {
                    if (this.f256698d.containsKey(str6)) {
                        ArrayList remove = this.f256698d.remove(str6);
                        if (remove == null || remove.size() <= 0) {
                            C81964j.m100679b(str6, wxaAppMsgChannel);
                        } else {
                            remove.add(wxaAppMsgChannel);
                            Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "send list size:%d", Integer.valueOf(remove.size()));
                            AppBrandProcessesManager.f246131g.mo116962a().mo116953R(new C1752a(str6, remove));
                        }
                    } else {
                        C81964j.m100679b(str6, wxaAppMsgChannel);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.WxaAppMsgChannelHandler", "add to cache");
                synchronized (this) {
                    if (this.f256698d.containsKey(str6)) {
                        ArrayList arrayList = this.f256698d.get(str6);
                        arrayList.add(wxaAppMsgChannel);
                        if (arrayList.size() > 500) {
                            arrayList.remove(0);
                        }
                        Log.m105925i("MicroMsg.WxaAppMsgChannelHandler", "cache size :%d", Integer.valueOf(arrayList.size()));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(wxaAppMsgChannel);
                        this.f256698d.put(str6, arrayList2);
                    }
                }
            }
            return null;
        }
    }
}
