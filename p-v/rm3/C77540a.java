package rm3;

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
import lv1.C99671h;
import lv1.C99672i;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77113a;
import pm3.C77115b;
import pm3.C77117c;
import pm3.C77118d;
import tm3.C78069w;

/* renamed from: rm3.a */
public final class C77540a implements C77115b {

    /* renamed from: g */
    public static final C77541a f226063g = new C77541a((C8480h) null);

    /* renamed from: a */
    public C44661m1 f226064a;

    /* renamed from: b */
    public C99671h f226065b;

    /* renamed from: c */
    public C99672i f226066c;

    /* renamed from: d */
    public int f226067d;

    /* renamed from: e */
    public int f226068e;

    /* renamed from: f */
    public String f226069f;

    /* renamed from: rm3.a$a */
    public static final class C77541a {
        public C77541a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C77020b mo107705a(AppCompatActivity appCompatActivity, String str, C72996z1 z1Var, int i, C77540a aVar) {
            UIStateCenter stateCenter;
            C78069w wVar;
            String wo;
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str, "id");
            C87412m.m108594g(z1Var, "contact");
            C87412m.m108594g(aVar, "extension");
            C77113a.C77114a aVar2 = C77113a.f225222a;
            C77118d a = aVar2.mo107428a(appCompatActivity, z1Var, aVar.f226065b, aVar.f226066c, aVar.f226064a);
            String username = z1Var.getUsername();
            C87412m.m108593f(username, "contact.username");
            CharSequence charSequence = a.f225226a;
            String str2 = "";
            C77020b bVar = new C77020b(str, i, username, charSequence == null ? str2 : charSequence, aVar);
            bVar.mo107341b(a.f225227b);
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
            C77117c c = aVar2.mo107430c(aVar.f226068e, z1Var, aVar.f226064a);
            aVar.f226068e = c.f225223a;
            String str3 = c.f225224b;
            C87412m.m108594g(str3, "<set-?>");
            aVar.f226069f = str3;
            String str4 = c.f225225c;
            C87412m.m108594g(str4, "<set-?>");
            bVar.f225013o = str4;
            return bVar;
        }
    }

    public C77540a(C44661m1 m1Var, C99671h hVar, C99672i iVar, int i, int i2, String str, int i3, C8480h hVar2) {
        hVar = (i3 & 2) != 0 ? null : hVar;
        iVar = (i3 & 4) != 0 ? null : iVar;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        str = (i3 & 32) != 0 ? "" : str;
        C87412m.m108594g(m1Var, "chatroomMember");
        C87412m.m108594g(str, "compareContent");
        this.f226064a = m1Var;
        this.f226065b = hVar;
        this.f226066c = iVar;
        this.f226067d = i;
        this.f226068e = i2;
        this.f226069f = str;
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77540a)) {
            return false;
        }
        C77540a aVar = (C77540a) bVar;
        return C87412m.m108589b(this.f226064a, aVar.f226064a) && C87412m.m108589b(this.f226065b, aVar.f226065b) && C87412m.m108589b(this.f226066c, aVar.f226066c) && this.f226067d == aVar.f226067d && this.f226068e == aVar.f226068e && C87412m.m108589b(this.f226069f, aVar.f226069f);
    }

    /* renamed from: b */
    public int mo105660b() {
        return this.f226068e;
    }

    /* renamed from: c */
    public int mo105661c(C77020b bVar, C77020b bVar2, C77115b bVar3) {
        C87412m.m108594g(bVar, "thisItem");
        C87412m.m108594g(bVar2, "otherItem");
        C87412m.m108594g(bVar3, "other");
        if (!(bVar3 instanceof C77540a)) {
            return 0;
        }
        int i = C87412m.m108596i(bVar.f225006e, bVar2.f225006e);
        if (i != 0) {
            return i;
        }
        if (bVar.f225006e == 10) {
            return C87412m.m108596i(this.f226067d, ((C77540a) bVar3).f226067d);
        }
        C77540a aVar = (C77540a) bVar3;
        int i2 = C87412m.m108596i(this.f226068e, aVar.f226068e);
        return i2 != 0 ? i2 : this.f226069f.compareTo(aVar.f226069f);
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C77115b.C77116a.m93095a(this, mVar, oVar, bVar, i, i2, z, list);
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        return bVar.f225006e == 10;
    }
}
