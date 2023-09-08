package ua3;

import com.tencent.p014mm.autogen.events.DeleteFavItemEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import p646pn.C110234e;

/* renamed from: ua3.d */
public class C37367d extends IStaticListener<DeleteFavItemEvent> {
    public boolean callback(IEvent iEvent) {
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149114c0(new C37366c(this, ((DeleteFavItemEvent) iEvent).f78763d.f78764a));
        return true;
    }
}
