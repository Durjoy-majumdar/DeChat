package ag2;

import bg2.C28313b;
import com.tencent.p014mm.autogen.events.BindQQEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import tc0.C77884m;
import tc0.C77885p;

/* renamed from: ag2.a */
public class C27892a extends IStaticListener<BindQQEvent> {
    public boolean callback(IEvent iEvent) {
        BindQQEvent bindQQEvent = (BindQQEvent) iEvent;
        if (!(bindQQEvent instanceof BindQQEvent)) {
            Log.m105922f("MicroMsg.QQMail.EventListener", "not bind qq event");
        } else {
            bindQQEvent.f78728d.getClass();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, (Object) null);
            Log.m105925i("MicroMsg.QQMail.EventListener", "unbind qq, bindXMail is [%s]", str);
            if (Util.isNullOrNil(str)) {
                try {
                    C86709a0.m107535s().mo121142i().mo119676J(17, 2);
                    int o = C75592q0.m90785o() | 1;
                    C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(o));
                    ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", o, "", 0, "", 0));
                    C28313b.m38164d();
                    Log.m105918d("MicroMsg.QQMail.EventListener", "doClearQQMailHelper succ ");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.QQMail.EventListener", e, "", new Object[0]);
                }
            }
        }
        return false;
    }
}
