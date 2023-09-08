package lg0;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hg0.C76166a;
import hg0.C76167a1;
import hg0.C76168b;
import hg0.C76169b1;
import mg0.C76754b;

/* renamed from: lg0.q */
public class C10504q extends IStaticListener<SetLocalQQMobileEvent> {
    public boolean callback(IEvent iEvent) {
        SetLocalQQMobileEvent.C1133a aVar = ((SetLocalQQMobileEvent) iEvent).f9501d;
        Intent intent = aVar.f9503a;
        String str = aVar.f9504b;
        Class cls = C76754b.class;
        if (intent == null || str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AccountSyncUtil", "setLocalQQMobile fail, intent = " + intent + ", username = " + str);
            return false;
        }
        C76167a1 b = ((C76169b1) ((C76754b) C86312j.m106911c(cls)).mo105749ob()).mo106405b(str);
        if (b != null) {
            intent.putExtra("Contact_Uin", b.f223139a);
            intent.putExtra("Contact_QQNick", b.mo106399c());
        }
        C76166a a = ((C76168b) ((C76754b) C86312j.m106911c(cls)).R50()).mo106401a(str);
        if (a == null) {
            return false;
        }
        intent.putExtra("Contact_Mobile_MD5", a.mo106385e());
        return false;
    }
}
