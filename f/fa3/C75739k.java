package fa3;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.booter.notification.MMNotification;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import hd0.C98410o0;
import p682rz.C101488s;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: fa3.k */
public class C75739k extends C86301e {

    /* renamed from: d */
    public C75733c f222340d;

    public void onAccountReleased(Context context) {
        ((MMNotification) C97625j3.m125816f()).mo93207e(38);
        C75733c cVar = this.f222340d;
        if (cVar != null) {
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(cVar);
            C86709a0.m107524d().mo123470p(221, cVar);
        }
    }

    public C75733c vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f222340d == null) {
            this.f222340d = new C75733c();
        }
        return this.f222340d;
    }
}
