package p738wg;

import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p371ph.C21967a;

/* renamed from: wg.e */
public class C102436e extends IStaticListener<ExtPlayerEvent> {

    /* renamed from: d */
    public C21967a f301682d;

    /* renamed from: e */
    public String f301683e;

    public boolean callback(IEvent iEvent) {
        C21967a aVar;
        ExtPlayerEvent extPlayerEvent = (ExtPlayerEvent) iEvent;
        if (Util.isNullOrNil(extPlayerEvent.f264779d.f264782b)) {
            ExtPlayerEvent.C92500a aVar2 = extPlayerEvent.f264779d;
            if (aVar2.f264781a == 1) {
                Log.m105921e("MicroMsg.ExtPlayerEventListener", "fileName(%s) is null or nil.", aVar2.f264782b);
                return true;
            }
        }
        ExtPlayerEvent.C92500a aVar3 = extPlayerEvent.f264779d;
        int i = aVar3.f264781a;
        if (i == 1) {
            if (this.f301682d == null) {
                this.f301682d = new C21967a(MMApplicationContext.getContext(), 0);
            } else if (!aVar3.f264782b.equals(this.f301683e)) {
                if (this.f301682d.mo35058b()) {
                    this.f301682d.mo35070n(false);
                }
                this.f301683e = extPlayerEvent.f264779d.f264782b;
            } else if (this.f301682d.mo35057a()) {
                extPlayerEvent.f264780e.f264787a = this.f301682d.mo35060d();
            } else if (this.f301682d.mo35058b()) {
                extPlayerEvent.f264780e.f264787a = false;
            }
            C21967a aVar4 = this.f301682d;
            ExtPlayerEvent.C92500a aVar5 = extPlayerEvent.f264779d;
            aVar4.f62212m = aVar5.f264785e;
            aVar4.f62211l = aVar5.f264786f;
            extPlayerEvent.f264780e.f264787a = aVar4.mo35068l(aVar5.f264782b, aVar5.f264784d, aVar5.f264783c, -1);
        } else if (i == 2) {
            C21967a aVar6 = this.f301682d;
            if (aVar6 != null) {
                aVar6.mo35070n(false);
            }
        } else if (i == 4 && (aVar = this.f301682d) != null && aVar.mo35058b()) {
            extPlayerEvent.f264780e.f264787a = this.f301682d.mo35059c(true);
        }
        return true;
    }
}
