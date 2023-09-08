package i63;

import android.content.Context;
import com.tencent.p014mm.autogen.events.OpenECardEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import h63.C8492c;
import j63.C76397d;
import yq3.C79148e;

/* renamed from: i63.e */
public class C8863e extends IStaticListener<OpenECardEvent> {
    public boolean callback(IEvent iEvent) {
        OpenECardEvent openECardEvent = (OpenECardEvent) iEvent;
        ((C8492c) C86312j.m106911c(C8492c.class)).getClass();
        openECardEvent.f9381d.getClass();
        Context context = (Context) openECardEvent.f9381d.f9382a.get();
        if (context == null) {
            return false;
        }
        C76397d.m91818d(1, (String) null, "WEB_DEBIT", (String) null, context, (C79148e.C79149a) null);
        return false;
    }
}
