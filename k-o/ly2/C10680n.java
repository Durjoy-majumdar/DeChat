package ly2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13601g;
import rx3.C36568h;
import te3.C51363t92;
import te3.C51513u92;

/* renamed from: ly2.n */
public final class C10680n extends C89132b<C51513u92> {

    /* renamed from: ly2.n$a */
    public static final class C10681a extends C87413o implements C32224a<C51363t92> {

        /* renamed from: d */
        public final /* synthetic */ String f32101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10681a(String str) {
            super(0);
            this.f32101d = str;
        }

        public Object invoke() {
            C51363t92 t922 = new C51363t92();
            t922.f142054d = this.f32101d;
            return t922;
        }
    }

    public C10680n(String str) {
        C87412m.m108594g(str, "guardianUserName");
        C13601g a = C36568h.m40985a(new C10681a(str));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = (C51363t92) a.getValue();
        bVar.f127067b = new C51513u92();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getteenagermodeprebindguardianinfo";
        bVar.f127069d = 6232;
        mo123453j(bVar.mo72403a());
    }
}
