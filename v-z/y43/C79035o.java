package y43;

import b63.C67203r0;
import com.tencent.p014mm.autogen.events.GetFTFNecessaryElementsEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p281yz.C79173v;

/* renamed from: y43.o */
public class C79035o extends IStaticListener<GetFTFNecessaryElementsEvent> {
    public boolean callback(IEvent iEvent) {
        GetFTFNecessaryElementsEvent getFTFNecessaryElementsEvent = (GetFTFNecessaryElementsEvent) iEvent;
        Class cls = C79173v.class;
        if (!(getFTFNecessaryElementsEvent instanceof GetFTFNecessaryElementsEvent)) {
            return false;
        }
        GetFTFNecessaryElementsEvent.C67708a aVar = getFTFNecessaryElementsEvent.f193646d;
        C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
        aVar.f193648b = r0Var != null ? r0Var.field_ftf_pay_url : null;
        String q = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91335q();
        String str = "";
        if (!Util.isNullOrNil(q)) {
            for (int i = 0; i < q.length() - 1; i++) {
                str = str + "*";
            }
            getFTFNecessaryElementsEvent.f193646d.f193647a = str + q.substring(q.length() - 1, q.length());
            return true;
        }
        getFTFNecessaryElementsEvent.f193646d.f193647a = str;
        return true;
    }
}
