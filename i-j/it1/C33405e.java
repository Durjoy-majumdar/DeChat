package it1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import jp3.C9487b;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C52180yx0;
import te3.C52320zx0;

/* renamed from: it1.e */
public final class C33405e extends C60625c<C52320zx0> {

    /* renamed from: s */
    public final int f90512s;

    /* renamed from: t */
    public final C32226l<Boolean, C13598b0> f90513t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33405e(int i, C32226l<? super Boolean, C13598b0> lVar) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(lVar, "callback");
        this.f90512s = i;
        this.f90513t = lVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveentranceverify";
        bVar.f127069d = 6826;
        C52180yx0 yx02 = new C52180yx0();
        yx02.f145558e = i;
        bVar.f127066a = yx02;
        bVar.f127067b = new C52320zx0();
        mo123453j(bVar.mo72403a());
        this.f172733o = false;
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C52320zx0>> mo9225i() {
        Log.m105924i("FinderLiveEntranceVerif", "FinderLiveEntranceVerify run dynamicStatus: " + this.f90512s);
        return super.mo9225i();
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52320zx0 zx02 = (C52320zx0) eu32;
        C87412m.m108594g(zx02, "resp");
        this.f90513t.invoke(Boolean.valueOf(zx02.f146265d));
        Log.m105924i("FinderLiveEntranceVerif", "onCgiEnd errType: " + i + " errCode: " + i2 + " errMsg: " + str + " isValid: " + zx02.f146265d);
    }
}
