package p541gv;

import ca2.C92388b;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import la2.C99358f;
import p529fv.C75798k;
import ua2.C101991b;

/* renamed from: gv.l */
public class C98229l extends IStaticListener<MusicActionEvent> {
    public boolean callback(IEvent iEvent) {
        MusicActionEvent musicActionEvent = (MusicActionEvent) iEvent;
        ((C92388b) C86312j.m106911c(C92388b.class)).getClass();
        Class cls = C99358f.class;
        int i = musicActionEvent.f264920d.f264922a;
        if (i == 0) {
            ((C75798k) C86312j.m106911c(C75798k.class)).mo106098vE(musicActionEvent.f264920d.f264923b);
            return false;
        } else if (i != 14) {
            if (i != 15 || ((C99358f) C101991b.m134284b(cls)).getMode() != 2) {
                return false;
            }
            ((C99358f) C101991b.m134284b(cls)).mo138821y0();
            return false;
        } else if (((C99358f) C101991b.m134284b(cls)).getMode() != 2) {
            return false;
        } else {
            ((C99358f) C101991b.m134284b(cls)).mo138808R();
            return false;
        }
    }
}
