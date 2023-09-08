package p222qm;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.AccountExpiredEvent;
import com.tencent.p014mm.p136ui.AccountExpiredUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C31543z5;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;

/* renamed from: qm.a */
public class C35920a extends IStaticListener<AccountExpiredEvent> {
    public boolean callback(IEvent iEvent) {
        AccountExpiredEvent accountExpiredEvent = (AccountExpiredEvent) iEvent;
        if (C80610p1.f235830o != 0 || !C86709a0.m107524d().f256815j || !C86709a0.m107523b().mo121115m() || C31543z5.m39453c() - C80610p1.f235831p <= 60000) {
            return true;
        }
        Intent intent = new Intent(MMApplicationContext.getContext(), AccountExpiredUI.class);
        intent.addFlags(268435456).addFlags(67108864).putExtra("key_errType", accountExpiredEvent.f78702d.f78703a).putExtra("key_errCode", accountExpiredEvent.f78702d.f78704b).putExtra("key_errMsg", accountExpiredEvent.f78702d.f78705c);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C80610p1.f235831p = C31543z5.m39453c();
        return true;
    }
}
