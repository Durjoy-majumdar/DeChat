package wy2;

import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import qy2.C77448f0;
import ry0.C36584h;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C51771w2;
import te3.C77949j3;
import ty0.C37302c;
import uy2.C37612h;
import yy2.C39246d;

/* renamed from: wy2.p */
public final class C38408p extends C37302c<C37612h> implements C36584h {

    /* renamed from: h */
    public final String f101316h = "MicroMsg.TextStatus.TextStatusMsgSyncHandler";

    public C38408p() {
        new ConcurrentHashMap();
    }

    /* renamed from: D */
    public int mo55695D() {
        return 9;
    }

    /* renamed from: E0 */
    public boolean mo61031E0(C51771w2 w2Var) {
        String str;
        C87412m.m108594g(w2Var, "rawBypMsg");
        String str2 = this.f101316h;
        StringBuilder sb = new StringBuilder();
        sb.append("processMsg() called with msgType: ");
        sb.append(w2Var.f143818d.f227630g);
        sb.append(" addBypMsg");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("isSender=");
        sb4.append(w2Var.f143822h);
        sb4.append(", seq=");
        sb4.append(w2Var.f143820f);
        sb4.append(", sessionId=");
        sb4.append(w2Var.f143819e);
        sb4.append(", addMsg=");
        C77949j3 j3Var = w2Var.f143818d;
        if (j3Var != null) {
            str = "FromUserName=" + j3Var.f227628e + " ToUserName=" + j3Var.f227629f + " MsgType=" + j3Var.f227630g + " NewMsgId=" + j3Var.f227638r + " content=" + C48374j0.m53718g(j3Var.f227631h);
        } else {
            str = null;
        }
        sb4.append(str);
        sb.append(sb4.toString());
        Log.m105918d(str2, sb.toString());
        C77949j3 j3Var2 = w2Var.f143818d;
        if (j3Var2.f227630g != 10002) {
            return false;
        }
        C51163rv3 rv32 = j3Var2.f227631h;
        Map<String, String> parseXml = XmlParser.parseXml(rv32 != null ? rv32.f141175d : null, "sysmsg", (String) null);
        String str3 = parseXml.get(".sysmsg.$type");
        Log.m105925i(this.f101316h, "processMsg: type：%s", str3);
        if (C77448f0.m93392d(str3, true) == 0) {
            return true;
        }
        if (C87412m.m108589b(str3, "textstatuslike")) {
            C39674e.f106452d.mo62254q(parseXml);
            return false;
        } else if (!C87412m.m108589b(str3, "modtextstatus")) {
            return false;
        } else {
            C39674e.f106452d.mo62247d(parseXml);
            return false;
        }
    }

    /* renamed from: H0 */
    public void mo55696H0(Object obj, String str) {
        C37612h hVar = (C37612h) obj;
        C87412m.m108594g(hVar, "session");
        C87412m.m108594g(str, "sessionId");
        C39246d j0 = C39674e.f106452d.mo62251j0();
        String str2 = hVar.field_talker;
        C87412m.m108593f(str2, "session.field_talker");
        int i = hVar.field_type;
        int i2 = hVar.field_actionPermission;
        int i3 = hVar.field_rejectMsg;
        int i4 = hVar.field_disableSendMsg;
        String str3 = hVar.field_senderUserName;
        C87412m.m108593f(str3, "session.field_senderUserName");
        j0.mo61998Lo(str, str2, i, i2, i3, i4, str3);
    }

    /* renamed from: N0 */
    public boolean mo55697N0(Object obj, C51771w2 w2Var) {
        C37612h hVar = (C37612h) obj;
        C87412m.m108594g(hVar, "localSessionInfo");
        C87412m.m108594g(w2Var, "rawBypMsg");
        String str = hVar.field_senderUserName;
        boolean z = true;
        boolean z2 = str == null || str.length() == 0;
        boolean z3 = hVar.systemRowid > 0;
        int i = hVar.field_rejectMsg;
        String j0 = mo55701j0(w2Var);
        String n0 = mo61033n0(w2Var);
        if (C87412m.m108589b(n0, hVar.field_talker) && !z2) {
            z = false;
        }
        hVar.field_talker = n0;
        hVar.field_rejectMsg = i;
        hVar.field_senderUserName = j0;
        String str2 = this.f101316h;
        Log.m105924i(str2, "[beforeProcessAddMsg] isNeedReplaceSession=" + z + " svrMsgId=" + w2Var.f143818d.f227638r + " isSender=" + w2Var + ".isSender msgType=" + w2Var.f143818d.f227630g + " createTime=" + w2Var.f143818d.f227635o + " isExitSessionInfo=" + z3 + " fromUser=" + w2Var.f143818d.f227628e + " toUser=" + w2Var.f143818d.f227629f + " sessionId=" + w2Var.f143819e + " myUserName:" + j0 + " isSenderUserNameEmpty:" + z2);
        return z;
    }

    /* renamed from: O */
    public int mo55698O() {
        return 9;
    }

    /* renamed from: g0 */
    public Object mo55700g0(String str) {
        C87412m.m108594g(str, "sessionId");
        return C39674e.f106452d.mo62251j0().mo61999jo(str);
    }

    /* renamed from: t0 */
    public String mo61034t0() {
        return this.f101316h;
    }
}
