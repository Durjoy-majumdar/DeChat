package fw0;

import com.tencent.p014mm.autogen.events.GetCardCountEvent;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44667s4;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import eb0.C97625j3;
import f40.C86709a0;
import g62.C8235p;
import p196ln.C76708i;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118308d;
import te3.C118422c1;
import te3.xk4;

/* renamed from: fw0.b */
public class C75801b implements C118308d {
    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
        Class cls = C76708i.class;
        xk4 xk4 = tVar.f353315a;
        if ((xk4.f354537d & 2) != 0) {
            C118422c1 c1Var = xk4.f354539f;
            if (!z) {
                C97625j3.m125812b().mo105887b(c1Var.f353936n);
            }
            C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(cls)).eg0(C75592q0.m90789s(), false, true));
            if (c1Var.f353931f != 0) {
                C8235p C = C97625j3.m125812b().mo105877C();
                ((C44667s4) C).mo69817Ow(c1Var.f353931f + "@qqim", 3);
            }
            ((C76708i) C86312j.m106911c(cls)).mo106828Ux((long) c1Var.f353931f, 3);
        } else {
            Log.m105928w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
        }
        if (z) {
            GetCardCountEvent getCardCountEvent = new GetCardCountEvent();
            getCardCountEvent.f78812d.f78813a = false;
            getCardCountEvent.publish();
        } else {
            C86709a0.m107525e().postToWorker(new C75799a(this));
        }
        C5139t.m5183e(2, 8);
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        Class cls = C76708i.class;
        C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(cls)).eg0(C75592q0.m90789s(), false, true));
        ((C76708i) C86312j.m106911c(cls)).mo106828Ux((long) i, 3);
        ((C44667s4) C97625j3.m125812b().mo105877C()).mo69817Ow(u0Var.f353324a.f354419h, 2);
        if (i != 0) {
            C8235p C = C97625j3.m125812b().mo105877C();
            ((C44667s4) C).mo69817Ow(i + "@qqim", 3);
        }
    }
}
