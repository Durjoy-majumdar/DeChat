package be0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import gy3.C87412m;
import jp3.C9486a;
import sd0.C22357b;

/* renamed from: be0.f */
public final class C16788f implements C22357b.C22358b, C9486a {

    /* renamed from: d */
    public C22357b.C22358b f45349d;

    /* renamed from: a */
    public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        try {
            C22357b.C22358b bVar = this.f45349d;
            if (bVar != null) {
                bVar.mo17818a(i, i2, str, subscribeMsgRequestResult);
            }
        } finally {
            this.f45349d = null;
        }
    }

    public void dead() {
        this.f45349d = null;
    }
}
