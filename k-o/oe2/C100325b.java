package oe2;

import com.tencent.p014mm.autogen.events.OnChattingUIActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke2.C99129c;
import re2.C101371a;

/* renamed from: oe2.b */
public class C100325b extends IStaticListener<OnChattingUIActionEvent> {
    public boolean callback(IEvent iEvent) {
        OnChattingUIActionEvent onChattingUIActionEvent = (OnChattingUIActionEvent) iEvent;
        Class cls = C99129c.class;
        OnChattingUIActionEvent.C67746a aVar = onChattingUIActionEvent.f193777d;
        if (aVar.f193778a != 1 || Util.isNullOrNil(aVar.f193779b)) {
            return false;
        }
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        if (cVar.f290670w == null) {
            return false;
        }
        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
        cVar2.requireAccountInitialized();
        C101371a aVar2 = cVar2.f290670w;
        OnChattingUIActionEvent.C67746a aVar3 = onChattingUIActionEvent.f193777d;
        String str = aVar3.f193779b;
        long j = aVar3.f193780c;
        aVar2.getClass();
        C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
        cVar3.requireAccountInitialized();
        cVar3.f290667t.mo140229a(new C101371a.C101372a(aVar2, str, 0, j));
        return false;
    }
}
