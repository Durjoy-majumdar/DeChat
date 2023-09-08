package jz0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.GotoCardHomePageEvent;
import com.tencent.p014mm.plugin.card.p031ui.CardHomePageUI;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.CardHomePageV3UI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gz0.C45995o;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import kz0.C46820l;
import te3.C51997xn;
import wz0.C53246b;
import z04.C119027c;

/* renamed from: jz0.g */
public class C46593g extends IStaticListener<GotoCardHomePageEvent> {
    public boolean callback(IEvent iEvent) {
        GotoCardHomePageEvent gotoCardHomePageEvent = (GotoCardHomePageEvent) iEvent;
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, 1)).intValue();
        int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, 1)).intValue();
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, Boolean.TRUE)).booleanValue();
        Log.m105925i("GotoCardHomePageEventIListener", "goto card version: %s, trade area: %s, newVersion2: %s", Integer.valueOf(intValue), Integer.valueOf(intValue2), Boolean.valueOf(booleanValue));
        if (booleanValue) {
            if (gotoCardHomePageEvent.f107606d.f107608a != null) {
                Intent intent = new Intent(gotoCardHomePageEvent.f107606d.f107608a, CardHomePageV3UI.class);
                Context context = gotoCardHomePageEvent.f107606d.f107608a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C45995o.m51273a();
                if (gotoCardHomePageEvent.f107606d.f107610c == 1) {
                    C115669n.INSTANCE.mo160131h(16322, 3);
                }
            }
        } else if (intValue2 == 2) {
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, "");
            if (!Util.isNullOrNil(str)) {
                try {
                    C51997xn xnVar = (C51997xn) new C51997xn().parseFrom(str.getBytes(C119027c.f356489b));
                    C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                } catch (IOException e) {
                    Log.printErrStackTrace("GotoCardHomePageEventIListener", e, "", new Object[0]);
                }
            }
        } else if (intValue != 1) {
            if (gotoCardHomePageEvent.f107606d.f107608a != null) {
                Intent intent2 = new Intent(gotoCardHomePageEvent.f107606d.f107608a, CardHomePageUI.class);
                intent2.putExtra("key_from_scene", 22);
                intent2.putExtra("key_home_page_from_scene", gotoCardHomePageEvent.f107606d.f107609b);
                Context context3 = gotoCardHomePageEvent.f107606d.f107608a;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context4 = context3;
                C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context4, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C45995o.m51273a();
                if (gotoCardHomePageEvent.f107606d.f107610c == 1) {
                    C115669n.INSTANCE.mo160131h(16322, 2);
                }
            }
            gotoCardHomePageEvent.f107607e.f107611a = "com.tencent.mm.plugin.card.ui.CardHomePageUI";
        } else if (gotoCardHomePageEvent.f107606d.f107608a != null) {
            Intent intent3 = new Intent(gotoCardHomePageEvent.f107606d.f107608a, CardHomePageNewUI.class);
            Context context5 = gotoCardHomePageEvent.f107606d.f107608a;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            Context context6 = context5;
            C117292a.m165358d(context6, aVar3.mo10232b(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context5.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context6, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C45995o.m51273a();
            if (gotoCardHomePageEvent.f107606d.f107610c == 1) {
                C115669n.INSTANCE.mo160131h(16322, 3);
            }
        }
        C46820l.f125957i.mo72032a(true);
        return true;
    }
}
