package np0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.Map;
import kb0.C33865k;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;
import v90.C37702d;

/* renamed from: np0.q */
public enum C34980q implements C31922b1 {
    INSTANCE;

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C77949j3 j3Var;
        String str2 = str;
        C35136m.C35137a aVar2 = aVar;
        Class cls = C75700k0.class;
        if (str2 == null || !str2.equals("subscribesysmsg")) {
            Log.m105920e("MicroMsg.WxaSubscribeSysmsgHandler", "subType is err, return");
            return null;
        }
        String str3 = map.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
        if (Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey is null, return");
            return null;
        }
        Log.m105925i("MicroMsg.WxaSubscribeSysmsgHandler", "consumeNewXml subType:%s", str2);
        C37702d Ag = ((C33865k) C86312j.m106911c(C33865k.class)).mo59335Ag(str3);
        if (Ag == null) {
            Log.m105921e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s wxaUpdateableMsg is null, ingore", str3);
            return null;
        }
        int i = Ag.field_btnState;
        if (i != 2) {
            Log.m105921e("MicroMsg.WxaSubscribeSysmsgHandler", "shareKey:%s btnState:%d msgState:%d ingore", str3, Integer.valueOf(i), Integer.valueOf(Ag.field_msgState));
            return null;
        } else if (aVar2 == null || (j3Var = aVar2.f94242a) == null) {
            Log.m105920e("MicroMsg.WxaSubscribeSysmsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return null;
        } else {
            String g = C48374j0.m53718g(j3Var.f227631h);
            String g2 = C48374j0.m53718g(j3Var.f227628e);
            String g3 = C48374j0.m53718g(j3Var.f227629f);
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(g2, j3Var.f227638r);
            boolean z = h302.getMsgId() > 0;
            h302.mo108745Y2(j3Var.f227638r);
            if (!aVar2.f94243b || !aVar2.f94245d) {
                h302.mo108733M2(C75604z3.m90841m(g2, (long) j3Var.f227635o));
            }
            h302.setType(603979825);
            h302.mo108732L2(g);
            h302.mo108740T2(0);
            h302.mo100991d(3);
            if (g2.equals(C75592q0.m90789s())) {
                h302.mo108749c3(g3);
            } else {
                h302.mo108749c3(g2);
            }
            h302.mo101012p4(j3Var.f227636p);
            C75604z3.m90842n(h302, aVar2);
            if (!z) {
                C75604z3.m90852x(h302);
            } else {
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(j3Var.f227638r, h302);
            }
            String t = h302.mo108768t();
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(t);
            if (j != null) {
                j.mo108371j3(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                Log.m105925i("MicroMsg.WxaSubscribeSysmsgHandler", "username:%s ok:%b", t, Integer.valueOf(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69775m0(j, t, true, true)));
            } else {
                Log.m105918d("MicroMsg.WxaSubscribeSysmsgHandler", "conv is null");
            }
            return null;
        }
    }
}
