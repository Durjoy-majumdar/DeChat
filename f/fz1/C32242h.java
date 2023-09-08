package fz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import iz1.C33478b;
import iz1.C33484f;
import pe3.C47465a;
import ry0.C36584h;
import sf0.C48374j0;
import te3.C51771w2;
import te3.C77949j3;
import ty0.C37302c;
import wy1.C53224d;
import yy1.C53641c;
import yy1.C53651m;
import z04.C112550d0;

/* renamed from: fz1.h */
public final class C32242h extends C37302c<C33478b> implements C36584h {
    /* renamed from: D */
    public int mo55695D() {
        return 3;
    }

    /* renamed from: H0 */
    public void mo55696H0(Object obj, String str) {
        C33478b bVar = (C33478b) obj;
        C87412m.m108594g(bVar, "session");
        C87412m.m108594g(str, "sessionId");
        C33484f Bx0 = ((C53224d) C86312j.m106911c(C53224d.class)).Bx0();
        String str2 = bVar.field_selfUserName;
        C87412m.m108593f(str2, "session.field_selfUserName");
        String str3 = bVar.field_talker;
        C87412m.m108593f(str3, "session.field_talker");
        Bx0.mo59164Lo(str, str2, str3, bVar.field_extInfo);
    }

    /* renamed from: N0 */
    public boolean mo55697N0(Object obj, C51771w2 w2Var) {
        String str;
        C33478b bVar = (C33478b) obj;
        C87412m.m108594g(bVar, "localSessionInfo");
        C87412m.m108594g(w2Var, "rawBypMsg");
        C77949j3 j3Var = w2Var.f143818d;
        boolean z = w2Var.f143822h;
        String str2 = w2Var.f143819e;
        String g = C48374j0.m53718g(j3Var.f227629f);
        String g2 = C48374j0.m53718g(j3Var.f227628e);
        String n0 = mo61033n0(w2Var);
        String j0 = mo55701j0(w2Var);
        C47465a parseFrom = new C53641c().parseFrom(w2Var.f143821g.f257327a);
        C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.autogen.GameLifeMsgExtInfo");
        C53641c cVar = (C53641c) parseFrom;
        C53651m mVar = cVar.f150690f;
        if (!(mVar == null || (str = mVar.f150707e) == null || C112550d0.m153801u(str, "20008", false))) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_LAST_SAVED_MSG_TYPE_INT, Integer.valueOf(cVar.f150690f.f150706d));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_LAST_SAVED_EXTERN_INFO_STRING, cVar.f150690f.f150707e);
        }
        bVar.field_sessionId = str2;
        bVar.field_selfUserName = j0;
        bVar.field_talker = n0;
        bVar.field_extInfo = cVar;
        String str3 = this.f98672f;
        Log.m105924i(str3, "[beforeProcessAddMsg] svrMsgId=" + w2Var.f143818d.f227638r + " isSender=" + z + " msgType=" + w2Var.f143818d.f227630g + " createTime=" + w2Var.f143818d.f227635o + " fromUser=" + g2 + " toUser=" + g + " sessionId=" + w2Var.f143819e + ' ');
        return true;
    }

    /* renamed from: O */
    public int mo55698O() {
        return 5;
    }

    /* renamed from: g0 */
    public Object mo55700g0(String str) {
        C87412m.m108594g(str, "sessionId");
        return ((C53224d) C86312j.m106911c(C53224d.class)).Bx0().mo59165jo(str);
    }
}
