package o12;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.StartIPCallEvent;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallDialUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;

/* renamed from: o12.f */
public class C35087f extends IStaticListener<StartIPCallEvent> {
    public boolean callback(IEvent iEvent) {
        StartIPCallEvent startIPCallEvent = (StartIPCallEvent) iEvent;
        if (startIPCallEvent instanceof StartIPCallEvent) {
            Intent intent = new Intent(MMApplicationContext.getContext(), IPCallDialUI.class);
            intent.setFlags(268435456);
            intent.putExtra("IPCallTalkUI_contactId", startIPCallEvent.f79006d.f79007a);
            intent.putExtra("IPCallTalkUI_countryCode", startIPCallEvent.f79006d.f79008b);
            intent.putExtra("IPCallTalkUI_nickname", startIPCallEvent.f79006d.f79010d);
            intent.putExtra("IPCallTalkUI_phoneNumber", startIPCallEvent.f79006d.f79009c);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
