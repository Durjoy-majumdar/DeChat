package fb2;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.p081mv.jump.MusicPullDownView;
import com.tencent.p014mm.plugin.p081mv.p082ui.open.text_status.MusicMvView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import la2.C99364n;
import qc0.C101093a;
import qc0.C101106m;
import rc0.C63389c;
import te3.C64488kb1;
import te3.C64719t23;
import up1.C65415e0;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: fb2.b */
public final class C58935b extends MusicPullDownView {

    /* renamed from: w */
    public String f168638w = "MusicCardFeedView";

    /* renamed from: x */
    public boolean f168639x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58935b(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar, int i) {
        super(str, frameLayout, a0Var, mVar, i);
        C87412m.m108594g(frameLayout, "container");
    }

    /* renamed from: a */
    public void mo84135a() {
        mo79963g();
        mo79961e();
    }

    /* renamed from: b */
    public void mo84136b() {
        mo84135a();
    }

    /* renamed from: k */
    public String mo80346k() {
        return this.f168638w;
    }

    /* renamed from: l */
    public void mo80347l() {
        if (this.f163001u) {
            boolean z = false;
            this.f163001u = false;
            boolean j = mo80345j();
            if (Util.secondsToNow(this.f162992i) >= 5) {
                z = true;
            }
            if (mo80345j()) {
                C99364n.m129616h().mo138835p();
            } else if (!this.f168639x || !z) {
                this.f162998r = C99364n.m129616h().mo138822a().getPlayPosition();
                C101093a.m132490l();
            } else {
                ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
            }
            MusicMvView musicMvView = this.f162989f;
            if (musicMvView != null) {
                musicMvView.mo80405d();
            }
            String str = this.f168638w;
            Log.m105924i(str, "onPostClose@" + hashCode() + ' ' + j + ' ' + this.f163000t + ' ' + z + ' ' + this.f162999s + ' ' + this.f162998r + ' ' + this.f162997q);
        }
    }

    /* renamed from: m */
    public void mo80348m() {
        boolean z;
        boolean c = C101093a.m132481c();
        this.f162999s = c;
        this.f163001u = true;
        this.f163000t = false;
        if (!c) {
            C64488kb1 kb12 = this.f162991h;
            if (kb12 != null) {
                C65415e0 e0Var = C65415e0.f188260a;
                C64719t23 t232 = this.f162990g;
                String str = kb12.f183909i;
                if (str == null) {
                    str = String.valueOf(System.currentTimeMillis());
                }
                String str2 = str;
                C87412m.m108593f(str2, "it.songId\n              …ntTimeMillis().toString()");
                e0Var.mo89508f(kb12, t232, str2, 14, this.f162995o);
            }
        } else {
            C101106m b = C101093a.m132480b();
            if (b != null) {
                String str3 = b.f295966n;
                C64488kb1 kb13 = this.f162991h;
                z = C87412m.m108589b(str3, kb13 != null ? kb13.f183906f : null);
            } else {
                z = false;
            }
            this.f163000t = z;
            if (z) {
                C101106m b2 = C101093a.m132480b();
                if (b2 != null) {
                    b2.f295953N = false;
                    C101093a.m132491m(b2);
                }
                ((C63389c) C86312j.m106911c(C63389c.class)).mo88293H4(false);
            } else {
                C101093a.m132490l();
                C64488kb1 kb14 = this.f162991h;
                if (kb14 != null) {
                    C65415e0 e0Var2 = C65415e0.f188260a;
                    C64719t23 t233 = this.f162990g;
                    String str4 = kb14.f183909i;
                    if (str4 == null) {
                        str4 = String.valueOf(System.currentTimeMillis());
                    }
                    String str5 = str4;
                    C87412m.m108593f(str5, "it.songId\n              …ntTimeMillis().toString()");
                    e0Var2.mo89508f(kb14, t233, str5, 14, this.f162995o);
                }
            }
        }
        String str6 = this.f168638w;
        Log.m105924i(str6, "onPostOpen@" + hashCode() + ' ' + this.f163000t + "  " + this.f162999s);
        MusicMvView musicMvView = this.f162989f;
        if (musicMvView != null) {
            musicMvView.mo80406e();
        }
        this.f162992i = Util.nowSecond();
    }

    public boolean onBackPressed() {
        Log.m105918d(this.f168638w, "onBackPressed");
        this.f168639x = true;
        return false;
    }
}
