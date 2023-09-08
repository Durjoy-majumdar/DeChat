package gz0;

import com.tencent.p014mm.autogen.events.GiftCardEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import hz0.C21035d;
import hz0.C46145e0;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98121d;
import wz0.C22944i;

/* renamed from: gz0.v */
public class C87414v extends IStaticListener<GiftCardEvent> implements C11385n {

    /* renamed from: d */
    public long f253302d = 0;

    public boolean callback(IEvent iEvent) {
        GiftCardEvent giftCardEvent = (GiftCardEvent) iEvent;
        Class cls = C75700k0.class;
        if (!(giftCardEvent instanceof GiftCardEvent)) {
            return false;
        }
        GiftCardEvent.C67716a aVar = giftCardEvent.f193670d;
        String str = aVar.f193671a;
        this.f253302d = aVar.f193672b;
        String str2 = aVar.f193673c;
        C21035d d = C22944i.m26987d(str);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f253302d);
        b002.mo100991d(1);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f253302d, b002);
        if (d == null) {
            d = C22944i.m26987d(b002.getContent());
        }
        if (d == null) {
            return true;
        }
        C86709a0.m107529k().f251779b.mo123455a(1045, this);
        C86709a0.m107529k().f251779b.mo123460f(new C46145e0(d.f59509b, str2, 17));
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        if (yVar instanceof C46145e0) {
            String str2 = ((C46145e0) yVar).f124357f;
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f253302d);
            if (i == 0 && i2 == 0) {
                b002.mo100991d(2);
            } else {
                b002.mo100991d(5);
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
            C21035d d = C22944i.m26987d(b002.getContent());
            d.f59515h = str2;
            u.f195525R0 = C22944i.m26986c(d);
            u.f195522Q0 = C68070l.C68072b.m80420s(u, (String) null, (C98121d) null);
            b002.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f253302d, b002);
            C86709a0.m107529k().f251779b.mo123470p(1045, this);
        }
    }
}
