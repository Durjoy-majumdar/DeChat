package p352jz;

import com.tencent.p014mm.autogen.events.JSApiOpenSpecificViewEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import ky2.C10432i;
import t03.C22426h;
import te3.jh4;
import u73.C101987v0;

/* renamed from: jz.f */
public class C46592f extends IStaticListener<JSApiOpenSpecificViewEvent> {
    public boolean callback(IEvent iEvent) {
        JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent = (JSApiOpenSpecificViewEvent) iEvent;
        Class cls = C10432i.class;
        if (!"TopStories/userCenter".equalsIgnoreCase(jSApiOpenSpecificViewEvent.f107614d.f107617b)) {
            return false;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(jSApiOpenSpecificViewEvent.f107614d.f107616a);
        } else {
            jh4 jh4 = new jh4();
            String e = C101987v0.m134271e(0);
            jh4.f64030e = e;
            jh4.f64031f = e;
            jh4.f64041s = 10802;
            C22426h.m26110l(jSApiOpenSpecificViewEvent.f107614d.f107616a, jh4);
            jSApiOpenSpecificViewEvent.f107615e.f107620c = true;
        }
        return true;
    }
}
