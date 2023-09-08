package i32;

import c42.C28496a;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import h81.C32735h;

/* renamed from: i32.f */
public class C33198f extends IStaticListener<ExptChangeEvent> {
    public boolean callback(IEvent iEvent) {
        ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
        Class cls = C32735h.class;
        C28496a.m38227a(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_android_time_limit_promo_percentage, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_android_time_limit_promo_unix_timestamp, 0));
        return false;
    }
}
