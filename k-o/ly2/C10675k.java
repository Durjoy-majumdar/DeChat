package ly2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49796i4;
import te3.C49940j4;

/* renamed from: ly2.k */
public final class C10675k extends C89132b<C49940j4> {

    /* renamed from: ly2.k$a */
    public static final class C10676a extends C87413o implements C32224a<C49796i4> {

        /* renamed from: d */
        public final /* synthetic */ String f32095d;

        /* renamed from: e */
        public final /* synthetic */ int f32096e;

        /* renamed from: f */
        public final /* synthetic */ String f32097f;

        /* renamed from: g */
        public final /* synthetic */ long f32098g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10676a(String str, int i, String str2, long j) {
            super(0);
            this.f32095d = str;
            this.f32096e = i;
            this.f32097f = str2;
            this.f32098g = j;
        }

        public Object invoke() {
            C49796i4 i4Var = new C49796i4();
            i4Var.f135097d = this.f32095d;
            i4Var.f135099f = this.f32096e;
            i4Var.f135098e = this.f32097f;
            i4Var.f135100g = this.f32098g;
            return i4Var;
        }
    }

    public C10675k(String str, int i, String str2, long j) {
        C87412m.m108594g(str, "wardUserName");
        C87412m.m108594g(str2, "businessKey");
        C13601g a = C36568h.m40985a(new C10676a(str, i, str2, j));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = (C49796i4) a.getValue();
        bVar.f127067b = new C49940j4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/agreeteenagermodeauthorization";
        bVar.f127069d = 6216;
        mo123453j(bVar.mo72403a());
    }
}
