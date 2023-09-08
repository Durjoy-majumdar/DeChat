package hd2;

import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import id2.C76312r;
import kd2.C76559f;

/* renamed from: hd2.f */
public class C32837f extends IStaticListener<KindaBindCardEvent> {
    public boolean callback(IEvent iEvent) {
        KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
        if (!C76559f.m92115k()) {
            return false;
        }
        C86709a0.m107524d().mo123460f(new C76312r(13, (String) null, 8, 0, ""));
        return false;
    }
}
