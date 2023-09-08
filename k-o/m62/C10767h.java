package m62;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ob0.C35136m;
import rx3.C13598b0;

/* renamed from: m62.h */
public final class C10767h implements C31924c1 {

    /* renamed from: d */
    public final String f32241d = "MicroMsg.SecurityMsgNewXmlReceived";

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C10767h hVar;
        Map<String, String> map2 = map;
        if (!C87412m.m108589b("secmsg", str) || map2 == null) {
            return;
        }
        String nullAsNil = Util.nullAsNil(map2.get(".sysmsg.secmsg.session"));
        String nullAsNil2 = Util.nullAsNil(map2.get(".sysmsg.secmsg.newmsgid"));
        int safeParseInt = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.sfn"));
        String nullAsNil3 = Util.nullAsNil(map2.get(".sysmsg.secmsg.sec_msg_node.show-h5"));
        int safeParseInt2 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.clip-len"));
        String nullAsNil4 = Util.nullAsNil(map2.get(".sysmsg.secmsg.sec_msg_node.share-tip-url"));
        String nullAsNil5 = Util.nullAsNil(map2.get(".sysmsg.secmsg.sec_msg_node.sec-ctrl-flag"));
        int safeParseInt3 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.fold-reduce"));
        int safeParseInt4 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.media-to-emoji"));
        int safeParseInt5 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.block-range"));
        int safeParseInt6 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.bubble-type"));
        int safeParseInt7 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.preview-type"));
        int safeParseInt8 = Util.safeParseInt(map2.get(".sysmsg.secmsg.sec_msg_node.url-click-type"));
        String str2 = this.f32241d;
        Log.m105924i(str2, "msgId:" + Util.safeParseLong(nullAsNil2) + " [" + safeParseInt + "],[" + nullAsNil3 + "],[" + safeParseInt2 + "],[" + nullAsNil4 + "],[" + safeParseInt3 + "],[" + safeParseInt5 + "],[" + safeParseInt4 + ']');
        HashMap hashMap = new HashMap();
        hashMap.put(".msgsource.sec_msg_node.sfn", String.valueOf(safeParseInt));
        C87412m.m108593f(nullAsNil3, "showH5");
        hashMap.put(".msgsource.sec_msg_node.show-h5", nullAsNil3);
        hashMap.put(".msgsource.sec_msg_node.clip-len", String.valueOf(safeParseInt2));
        C87412m.m108593f(nullAsNil4, "shareTipUrl");
        hashMap.put(".msgsource.sec_msg_node.share-tip-url", nullAsNil4);
        C87412m.m108593f(nullAsNil5, "secCtrlFlag");
        hashMap.put(".msgsource.sec_msg_node.sec-ctrl-flag", nullAsNil5);
        hashMap.put(".msgsource.sec_msg_node.fold-reduce", String.valueOf(safeParseInt3));
        hashMap.put(".msgsource.sec_msg_node.media-to-emoji", String.valueOf(safeParseInt4));
        hashMap.put(".msgsource.sec_msg_node.block-range", String.valueOf(safeParseInt5));
        hashMap.put(".msgsource.sec_msg_node.bubble-type", String.valueOf(safeParseInt6));
        hashMap.put(".msgsource.sec_msg_node.preview-type", String.valueOf(safeParseInt7));
        hashMap.put(".msgsource.sec_msg_node.url-click-type", String.valueOf(safeParseInt8));
        if (!Util.isNullOrNil(nullAsNil, nullAsNil2)) {
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(nullAsNil, Util.safeParseLong(nullAsNil2));
            if (Util.isNullOrNil(h302.mo108768t()) || h302.mo108774y2() <= 0) {
                hVar = this;
                String str3 = hVar.f32241d;
                Log.m105924i(str3, "msg " + nullAsNil2 + " not found!");
                long safeParseLong = Util.safeParseLong(nullAsNil2);
                String E = C75569c4.m90659E(hashMap);
                if (safeParseLong > 0 && !Util.isNullOrNil(E)) {
                    C75569c4.f221999b.put(Long.valueOf(safeParseLong), E);
                }
            } else {
                C75569c4.m90665K(h302, C75569c4.m90659E(hashMap), true);
                hVar = this;
            }
            if (C13598b0.f38549a == null) {
                String str4 = hVar.f32241d;
                Log.m105920e(str4, "msg is null, talker:" + nullAsNil + ", msgId:" + nullAsNil2);
                return;
            }
            return;
        }
    }
}
