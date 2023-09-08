package ly2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49975jd;
import te3.C50113kd;

/* renamed from: ly2.l */
public final class C10677l extends C89132b<C50113kd> {

    /* renamed from: ly2.l$a */
    public static final class C10678a extends C87413o implements C32224a<C49975jd> {

        /* renamed from: d */
        public final /* synthetic */ String f32099d;

        /* renamed from: e */
        public final /* synthetic */ String f32100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10678a(String str, String str2) {
            super(0);
            this.f32099d = str;
            this.f32100e = str2;
        }

        public Object invoke() {
            C49975jd jdVar = new C49975jd();
            jdVar.f136017d = this.f32099d;
            jdVar.f136018e = this.f32100e;
            return jdVar;
        }
    }

    public C10677l(String str, String str2) {
        C87412m.m108594g(str, "wardUserName");
        C87412m.m108594g(str2, "ticket");
        C13601g a = C36568h.m40985a(new C10678a(str, str2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = (C49975jd) a.getValue();
        bVar.f127067b = new C50113kd();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindteenagermodeguardian";
        bVar.f127069d = 4225;
        mo123453j(bVar.mo72403a());
    }
}
