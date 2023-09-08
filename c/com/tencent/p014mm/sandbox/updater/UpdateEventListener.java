package com.tencent.p014mm.sandbox.updater;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UpdateWeChatEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import m13.C88689b;

/* renamed from: com.tencent.mm.sandbox.updater.UpdateEventListener */
public class UpdateEventListener extends IListener<UpdateWeChatEvent> {
    public UpdateEventListener() {
        super(C40008f.f107254d);
        this.__eventId = 1095409211;
    }

    public boolean callback(IEvent iEvent) {
        Updater k;
        UpdateWeChatEvent updateWeChatEvent = (UpdateWeChatEvent) iEvent;
        Class cls = C88689b.class;
        if (!(updateWeChatEvent instanceof UpdateWeChatEvent) || (k = Updater.m105888k(updateWeChatEvent.f9572d.f9574a, C0966R.string.f0j, (DialogInterface.OnCancelListener) null)) == null) {
            return false;
        }
        if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
            ((C88689b) C86312j.m106911c(cls)).mo122753gD(2, MMApplicationContext.getContext());
            return false;
        }
        k.mo119327l(updateWeChatEvent.f9572d.f9575b, true);
        return false;
    }
}
