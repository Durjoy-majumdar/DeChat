package iv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.NotifyEnterChattingEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import ev1.C58838a;
import ev1.C58847k;
import ev1.C58848l;
import gy3.C87412m;
import ht1.C60200t1;
import ke3.C88144b;
import ls3.C10649f;
import o40.C61926c;
import org.json.JSONObject;
import p687sr.C64156g;
import te3.C64238ap2;
import te3.C64279c90;

/* renamed from: iv1.c */
public final class C60637c {

    /* renamed from: a */
    public static final C60637c f172746a = new C60637c();

    /* renamed from: a */
    public final void mo85591a(Context context, C58838a aVar, int i) {
        Context context2 = context;
        C58838a aVar2 = aVar;
        Class cls = C64156g.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "item");
        if (aVar2 instanceof C58848l) {
            C58848l lVar = (C58848l) aVar2;
            NotifyEnterChattingEvent notifyEnterChattingEvent = new NotifyEnterChattingEvent();
            notifyEnterChattingEvent.f154847d.f154848a = lVar.f168467h;
            if (!notifyEnterChattingEvent.publish()) {
                Log.m105924i("ForceNotifyUtil", "jumpChattingUI LauncherUI background, jump chatting username:" + lVar.f168467h);
                Intent intent = new Intent();
                intent.putExtra("Chat_Self", C75592q0.m90789s());
                intent.putExtra("Chat_User", lVar.f168467h);
                intent.putExtra("finish_direct", true);
                C88144b.m109801s(context2, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            } else {
                Log.m105924i("ForceNotifyUtil", "jumpChattingUI LauncherUI running, jump chatting username:" + lVar.f168467h);
            }
            ((C64156g) C86312j.m106911c(cls)).mo58060JU(1, 1, lVar.f168467h, i, aVar2.f168434d);
        } else if (aVar2 instanceof C58847k) {
            C58847k kVar = (C58847k) aVar2;
            Class cls2 = C60200t1.class;
            long P = C61926c.m72671P(kVar.f168459i);
            long P2 = C61926c.m72671P(kVar.f168460j);
            long j = P2;
            ((C60200t1) C86312j.m106911c(cls2)).jm0(P, P2, "", -1, -1, 7, "temp_7", -1, -1, "", "", System.currentTimeMillis(), -1);
            ((C60200t1) C86312j.m106911c(cls2)).mo76769JB("temp_7");
            Intent intent2 = new Intent();
            JSONObject jSONObject = new JSONObject();
            try {
                String str = kVar.f168466s;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("notice_id", str);
            } catch (Throwable unused) {
            }
            intent2.putExtra("key_chnl_extra", jSONObject.toString());
            String R1 = ((C60200t1) C86312j.m106911c(cls2)).mo76802R1(25, 14, 65);
            C64238ap2 ap22 = new C64238ap2();
            ap22.f182124d = P;
            ap22.f182125e = j;
            String str2 = kVar.f168461n;
            if (str2 == null) {
                str2 = "";
            }
            ap22.f182126f = str2;
            ap22.f182127g = "";
            ap22.f182128h = "";
            ap22.f182129i = "";
            ap22.f182130j = null;
            C64279c90 c902 = new C64279c90();
            c902.f182444d = R1;
            c902.f182445e = "";
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = -1;
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, intent2, ap22, ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
            ((C64156g) C86312j.m106911c(cls)).mo58060JU(1, 2, kVar.f168459i, i, aVar2.f168434d);
        }
    }
}
