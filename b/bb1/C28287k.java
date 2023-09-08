package bb1;

import com.tencent.p014mm.autogen.events.SnsBehaviorNotifyFinderEvent;
import di3.C86312j;
import ht1.C60200t1;

/* renamed from: bb1.k */
public class C28287k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsBehaviorNotifyFinderEvent f77872d;

    public C28287k(C28288l lVar, SnsBehaviorNotifyFinderEvent snsBehaviorNotifyFinderEvent) {
        this.f77872d = snsBehaviorNotifyFinderEvent;
    }

    public void run() {
        Class cls = C60200t1.class;
        int i = this.f77872d.f78984d.f78985a;
        if (i == 1) {
            ((C60200t1) C86312j.m106911c(cls)).mo76905z2().mo58458b(506365, 15);
        } else if (i == 2) {
            ((C60200t1) C86312j.m106911c(cls)).mo76905z2().mo58458b(506365, 16);
        } else if (i == 3) {
            ((C60200t1) C86312j.m106911c(cls)).mo76905z2().mo58458b(506365, 17);
        } else if (i == 4) {
            ((C60200t1) C86312j.m106911c(cls)).mo76905z2().mo58458b(506365, 18);
        }
    }
}
