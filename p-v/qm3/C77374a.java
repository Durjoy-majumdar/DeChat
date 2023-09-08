package qm3;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import he0.C76158j;
import java.util.List;
import jq3.C60905o;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77113a;
import pm3.C77115b;
import pm3.C77117c;
import pm3.C77118d;
import tm3.C78069w;

/* renamed from: qm3.a */
public final class C77374a implements C77115b {

    /* renamed from: i */
    public static final C77375a f225586i = new C77375a((C8480h) null);

    /* renamed from: a */
    public C99681n f225587a;

    /* renamed from: b */
    public C99672i f225588b;

    /* renamed from: c */
    public int f225589c;

    /* renamed from: d */
    public int f225590d;

    /* renamed from: e */
    public int f225591e;

    /* renamed from: f */
    public int f225592f;

    /* renamed from: g */
    public String f225593g;

    /* renamed from: h */
    public boolean f225594h;

    /* renamed from: qm3.a$a */
    public static final class C77375a {
        public C77375a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C77020b mo107495a(AppCompatActivity appCompatActivity, String str, C72996z1 z1Var, int i, C77374a aVar) {
            UIStateCenter stateCenter;
            C78069w wVar;
            String wo;
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str, "id");
            C87412m.m108594g(z1Var, "contact");
            C87412m.m108594g(aVar, "extension");
            C77113a.C77114a aVar2 = C77113a.f225222a;
            C77118d b = aVar2.mo107429b(appCompatActivity, aVar.f225588b, z1Var, aVar.f225587a, (C44661m1) null);
            String username = z1Var.getUsername();
            C87412m.m108593f(username, "contact.username");
            CharSequence charSequence = b.f225226a;
            String str2 = "";
            C77020b bVar = new C77020b(str, i, username, charSequence == null ? str2 : charSequence, aVar);
            bVar.mo107341b(b.f225227b);
            C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
            if (!(jVar == null || (wo = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null)) {
                str2 = wo;
            }
            bVar.f225010i = str2;
            if (!Util.isNullOrNil((CharSequence) str2) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(bVar.f225010i);
                bVar.f225010i = sb.toString();
            }
            if (!(!(appCompatActivity instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                bVar.f225018t = wVar.mo108033b();
                bVar.f225017s = wVar.mo108034c(bVar.f225007f);
                bVar.f225016r = wVar.mo108032a(bVar.f225007f);
            }
            C77117c c = aVar2.mo107430c(aVar.f225592f, z1Var, (C44661m1) null);
            aVar.f225592f = c.f225223a;
            String str3 = c.f225224b;
            C87412m.m108594g(str3, "<set-?>");
            aVar.f225593g = str3;
            String str4 = c.f225225c;
            C87412m.m108594g(str4, "<set-?>");
            bVar.f225013o = str4;
            return bVar;
        }
    }

    public C77374a() {
        this((C99681n) null, (C99672i) null, 0, 0, 0, 0, (String) null, false, 255, (C8480h) null);
    }

    public C77374a(C99681n nVar, C99672i iVar, int i, int i2, int i3, int i4, String str, boolean z, int i5, C8480h hVar) {
        nVar = (i5 & 1) != 0 ? null : nVar;
        iVar = (i5 & 2) != 0 ? null : iVar;
        i = (i5 & 4) != 0 ? 0 : i;
        i2 = (i5 & 8) != 0 ? 0 : i2;
        i3 = (i5 & 16) != 0 ? 0 : i3;
        i4 = (i5 & 32) != 0 ? 0 : i4;
        str = (i5 & 64) != 0 ? "" : str;
        z = (i5 & 128) != 0 ? false : z;
        C87412m.m108594g(str, "compareContent");
        this.f225587a = nVar;
        this.f225588b = iVar;
        this.f225589c = i;
        this.f225590d = i2;
        this.f225591e = i3;
        this.f225592f = i4;
        this.f225593g = str;
        this.f225594h = z;
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77374a)) {
            return false;
        }
        C77374a aVar = (C77374a) bVar;
        return C87412m.m108589b(this.f225587a, aVar.f225587a) && C87412m.m108589b(this.f225588b, aVar.f225588b) && this.f225589c == aVar.f225589c && this.f225590d == aVar.f225590d && this.f225591e == aVar.f225591e && this.f225592f == aVar.f225592f && C87412m.m108589b(this.f225593g, aVar.f225593g) && this.f225594h == aVar.f225594h;
    }

    /* renamed from: b */
    public int mo105660b() {
        return this.f225592f;
    }

    /* renamed from: c */
    public int mo105661c(C77020b bVar, C77020b bVar2, C77115b bVar3) {
        C87412m.m108594g(bVar, "thisItem");
        C87412m.m108594g(bVar2, "otherItem");
        C87412m.m108594g(bVar3, "other");
        int i = 0;
        if (!(bVar3 instanceof C77374a)) {
            return 0;
        }
        int i2 = bVar.f225006e;
        int i3 = bVar2.f225006e;
        if (!((i2 == 10 || i2 == 11) && (i3 == 10 || i3 == 11))) {
            i = C87412m.m108596i(i2, i3);
        }
        if (i != 0) {
            return i;
        }
        int i4 = bVar.f225006e;
        if (i4 == 11 || i4 == 10) {
            C77374a aVar = (C77374a) bVar3;
            int i5 = C87412m.m108596i(this.f225589c, aVar.f225589c);
            return i5 != 0 ? i5 : C87412m.m108596i(this.f225590d, aVar.f225590d);
        } else if (i4 == 1 || i4 == 2) {
            return C87412m.m108596i(this.f225591e, ((C77374a) bVar3).f225591e);
        } else {
            C77374a aVar2 = (C77374a) bVar3;
            int i6 = C87412m.m108596i(this.f225592f, aVar2.f225592f);
            return i6 != 0 ? i6 : this.f225593g.compareTo(aVar2.f225593g);
        }
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C77115b.C77116a.m93095a(this, mVar, oVar, bVar, i, i2, z, list);
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        if (bVar.f225006e == 10) {
            C77115b bVar2 = bVar.f225009h;
            C87412m.m108592e(bVar2, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            if (!((C77374a) bVar2).f225594h) {
                return true;
            }
        }
        return false;
    }
}
