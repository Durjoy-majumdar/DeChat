package ne1;

import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import je1.C46531q4;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import os1.C62153d;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49849ii0;
import te3.C50542nh0;
import te3.C64553md1;
import te3.C64742ty1;
import zc1.C66783a;
import zc1.C66785b;

@C86522b
/* renamed from: ne1.u0 */
public final class C61681u0 extends C61685z0<C64553md1> implements C3605p1 {

    /* renamed from: e */
    public final String f175375e = "Finder.FinderModifyUserService";

    /* renamed from: ne1.u0$a */
    public static final class C61682a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C61681u0 f175376d;

        /* renamed from: e */
        public final /* synthetic */ C8794p5<C64553md1> f175377e;

        /* renamed from: ne1.u0$a$a */
        public static final class C61683a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C61683a f175378d = new C61683a();

            public C61683a() {
                super(0);
            }

            public Object invoke() {
                C5139t.m5183e(5, 14);
                return C13598b0.f38549a;
            }
        }

        public C61682a(C61681u0 u0Var, C8794p5<C64553md1> p5Var) {
            this.f175376d = u0Var;
            this.f175377e = p5Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2 = this.f175376d.f175375e;
            Log.m105924i(str2, "upload head img errType " + i + " errCode " + i2 + " errMsg " + str);
            C86709a0.m107524d().mo123470p(3759, this);
            C64553md1 md12 = new C64553md1();
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderUploadHeadImg");
            md12.f184298g = ((C46531q4) yVar).f125365q;
            if (i == 0 && i2 == 0) {
                C61926c.m72668M(C61683a.f175378d);
                C61685z0.Ax0(this.f175376d, md12, this.f175377e, false, false, 12, (Object) null);
                return;
            }
            C8794p5<C64553md1> p5Var = this.f175377e;
            if (p5Var != null) {
                C50542nh0 nh02 = new C50542nh0();
                nh02.f138602d = 1;
                nh02.f138603e = -1;
                C13598b0 b0Var = C13598b0.f38549a;
                p5Var.mo705c5(md12, nh02);
            }
        }
    }

    /* renamed from: MC */
    public void mo3977MC(String str, C8794p5<C64553md1> p5Var) {
        C87412m.m108594g(str, "nickname");
        C64553md1 md12 = new C64553md1();
        md12.f184295d = str;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public void Mu0(boolean z, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184314z = z ? 2 : 1;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public void N90(boolean z, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184293D = z ? 2 : 1;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    /* renamed from: OR */
    public void mo3980OR(String str, String str2, String str3, int i, C8794p5<C64553md1> p5Var) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "country");
        C87412m.m108594g(str2, "province");
        C87412m.m108594g(str3, "city");
        C64553md1 md12 = new C64553md1();
        md12.f184299h = str;
        md12.f184300i = str2;
        md12.f184301j = str3;
        md12.f184306r = i;
        C64742ty1 ty12 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).f176721e;
        if (ty12 != null) {
            C49849ii0 ii02 = new C49849ii0();
            md12.f184312x = ii02;
            ii02.f135353d = ty12.f185694d;
            ii02.f135354e = ty12.f185695e;
            ii02.f135355f = ty12.f185696f;
            C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
        }
    }

    /* renamed from: QJ */
    public void mo3981QJ(int i, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184310v = i;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public void Ra0(String str, C8794p5<C64553md1> p5Var) {
        C87412m.m108594g(str, "avatarPath");
        C46531q4 q4Var = new C46531q4(str, 2, (String) null, 0);
        C86709a0.m107524d().mo123455a(3759, new C61682a(this, p5Var));
        C86709a0.m107524d().mo123460f(q4Var);
    }

    public void Y20(boolean z, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184291B = z ? 1 : 2;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public void dp0(int i, int i2, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184302n = i;
        md12.f184307s = i2;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    /* renamed from: kH */
    public void mo3985kH(boolean z, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184313y = z ? 1 : 2;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    /* renamed from: l9 */
    public void mo3986l9(String str, C8794p5<C64553md1> p5Var) {
        C87412m.m108594g(str, "coverUrl");
        C64553md1 md12 = new C64553md1();
        md12.f184290A = str;
        C61685z0.Ax0(this, md12, p5Var, false, true, 4, (Object) null);
    }

    public void no0(boolean z, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184294E = z ? 1 : 2;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public void of0(int i, C8794p5<C64553md1> p5Var) {
        C64553md1 md12 = new C64553md1();
        md12.f184311w = i;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C64553md1 md12 = (C64553md1) obj;
        C87412m.m108594g(md12, "cmdBufItem");
        return C89349b.m111674a(md12.toByteArray());
    }

    public void w80(String str, C8794p5<C64553md1> p5Var) {
        C87412m.m108594g(str, "signature");
        C64553md1 md12 = new C64553md1();
        md12.f184296e = str;
        C61685z0.Ax0(this, md12, p5Var, false, false, 12, (Object) null);
    }

    public int xx0() {
        return 1;
    }

    public String yx0() {
        return this.f175375e;
    }

    public void zx0(Object obj, int i) {
        C64553md1 md12 = (C64553md1) obj;
        C87412m.m108594g(md12, "cmdBufItem");
        if (i == 0) {
            C58961d.C58963b bVar = C58961d.f168673a;
            C66785b bVar2 = C66785b.f191882e;
            C58969q b = bVar.mo84155b(bVar2.mo90662O5());
            C87412m.m108591d(b);
            C54447c cVar = new C54447c(bVar2.mo90662O5());
            String str = md12.f184295d;
            if (str != null) {
                b.field_nickname = str;
                cVar.field_nickname = str;
            }
            String str2 = md12.f184296e;
            if (str2 != null) {
                b.field_signature = str2;
                cVar.field_signature = str2;
            }
            String str3 = md12.f184298g;
            if (str3 != null) {
                b.field_avatarUrl = str3;
                cVar.field_avatarUrl = str3;
            }
            bVar2.mo90672m1(cVar, C39759i.ACCOUNT_MODIFY);
            bVar.mo84166o(b);
            String str4 = b.field_username;
            C87412m.m108593f(str4, "self.field_username");
            int i2 = 0;
            C54446b a = C66783a.C66784a.m78798a(bVar2, str4, false, 2, (Object) null);
            if (a != null) {
                i2 = a.field_extFlag;
            }
            int i3 = md12.f184313y;
            if (i3 == 1) {
                i2 |= 262144;
                Log.m105924i(this.f175375e, "showFinderInWxSwitch turn on");
            } else if (i3 == 2) {
                i2 &= -262145;
                Log.m105924i(this.f175375e, "showFinderInWxSwitch turn off");
            }
            C54447c cVar2 = new C54447c(b.getUsername());
            cVar2.field_extFlag = i2;
            bVar2.mo90672m1(cVar2, C39759i.MODIFY_USER);
        }
    }
}
