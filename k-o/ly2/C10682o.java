package ly2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13601g;
import rx3.C36568h;
import te3.qk4;
import te3.rk4;

/* renamed from: ly2.o */
public final class C10682o extends C89132b<rk4> {

    /* renamed from: ly2.o$a */
    public static final class C10683a extends C87413o implements C32224a<qk4> {

        /* renamed from: d */
        public final /* synthetic */ String f32102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10683a(String str) {
            super(0);
            this.f32102d = str;
        }

        public Object invoke() {
            qk4 qk4 = new qk4();
            qk4.f140369d = this.f32102d;
            return qk4;
        }
    }

    public C10682o(String str) {
        C87412m.m108594g(str, "guardianUserName");
        C13601g a = C36568h.m40985a(new C10683a(str));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = (qk4) a.getValue();
        bVar.f127067b = new rk4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/unbindteenagermodeguardian";
        bVar.f127069d = 5848;
        mo123453j(bVar.mo72403a());
    }
}
