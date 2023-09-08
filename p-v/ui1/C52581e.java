package ui1;

import a14.C53872d1;
import a14.C53896h0;
import bi1.C0280a;
import bi1.C0283d;
import bi1.C0287e;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import f14.C58901s;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8802s1;
import je1.C46523h2;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import qj1.C62660c;
import te3.C48775ax0;
import te3.C48920bx0;
import te3.C49765hx0;
import te3.C51153rt0;
import te3.C52013xs0;
import wx3.C15601d;
import zc1.C66785b;

/* renamed from: ui1.e */
public final class C52581e implements C52578a {

    /* renamed from: a */
    public final C62660c f146862a;

    /* renamed from: ui1.e$a */
    public static final class C52582a {

        /* renamed from: a */
        public final int f146863a;

        /* renamed from: b */
        public final String f146864b;

        /* renamed from: c */
        public final String f146865c;

        /* renamed from: d */
        public final String f146866d;

        public C52582a(int i, String str, String str2, String str3) {
            C87412m.m108594g(str, "sdkUserId");
            C87412m.m108594g(str2, "userName");
            C87412m.m108594g(str3, "sessionId");
            this.f146863a = i;
            this.f146864b = str;
            this.f146865c = str2;
            this.f146866d = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C52582a)) {
                return false;
            }
            C52582a aVar = (C52582a) obj;
            return this.f146863a == aVar.f146863a && C87412m.m108589b(this.f146864b, aVar.f146864b) && C87412m.m108589b(this.f146865c, aVar.f146865c) && C87412m.m108589b(this.f146866d, aVar.f146866d);
        }

        public int hashCode() {
            return (((((this.f146863a * 31) + this.f146864b.hashCode()) * 31) + this.f146865c.hashCode()) * 31) + this.f146866d.hashCode();
        }

        public String toString() {
            return "CloseMicIntercomData(scene=" + this.f146863a + ", sdkUserId=" + this.f146864b + ", userName=" + this.f146865c + ", sessionId=" + this.f146866d + ')';
        }
    }

    public C52581e(C62660c cVar) {
        C87412m.m108594g(cVar, "plugin");
        this.f146862a = cVar;
    }

    /* renamed from: a */
    public Object mo73542a(C52582a aVar, C15601d<? super C0287e<? extends C48920bx0, C0280a>> dVar) {
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        Log.m105924i("MicIntercomService", "requestCloseMicIntercom " + aVar);
        C48775ax0 ax02 = new C48775ax0();
        ax02.f130813d = C46523h2.f125330a.mo71859a(8733);
        ax02.f130820n = C66785b.f191882e.mo90662O5();
        ax02.f130817h = ((C55001u) this.f146862a.mo87696x0(cls2)).f154416j;
        C45795b.C32059a aVar2 = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        String str = null;
        ax02.f130814e = C89349b.m111674a(bVar != null ? ((C55001u) bVar.mo71262a(cls2)).f154417n : null);
        ax02.f130816g = ((C55001u) this.f146862a.mo87696x0(cls2)).f154420q.f182392d;
        ax02.f130819j = ((C54991o) this.f146862a.mo87696x0(cls)).f154190D ? 3 : ((C54991o) this.f146862a.mo87696x0(cls)).mo75991Z3() ? 1 : 2;
        C45795b bVar2 = C45795b.f123698n;
        if (bVar2 != null) {
            str = ((C55001u) bVar2.mo71262a(cls2)).f154423t;
        }
        ax02.f130818i = str;
        C52013xs0 xs02 = new C52013xs0();
        C49765hx0 hx02 = new C49765hx0();
        FinderContact finderContact = new FinderContact();
        finderContact.username = aVar.f146865c;
        hx02.f134919d = finderContact;
        xs02.f144902d = hx02;
        xs02.f144909n = aVar.f146866d;
        C51153rt0 rt02 = new C51153rt0();
        rt02.f141124d = aVar.f146864b;
        rt02.f141125e = aVar.f146863a;
        xs02.f144906h = C89349b.m111674a(rt02.toByteArray());
        xs02.f144903e = 20060;
        xs02.f144904f = C58739j4.f168176a.mo83718n();
        ax02.f130815f = xs02;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = 8733;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/finderliveclosemicintercom";
        bVar3.f127066a = ax02;
        bVar3.f127067b = new C48920bx0();
        C47350c a = bVar3.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        C53896h0 h0Var = C53872d1.f151117a;
        return C0283d.m243a(ui, C58901s.f168555a, dVar);
    }
}
