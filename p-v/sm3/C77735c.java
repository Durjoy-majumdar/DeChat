package sm3;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import g62.C45881a;
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
import pm3.C77118d;

/* renamed from: sm3.c */
public class C77735c implements C77115b {

    /* renamed from: g */
    public static final C77736a f226536g = new C77736a((C8480h) null);

    /* renamed from: a */
    public long f226537a;

    /* renamed from: b */
    public long f226538b;

    /* renamed from: c */
    public C99681n f226539c;

    /* renamed from: d */
    public C99672i f226540d;

    /* renamed from: e */
    public int f226541e;

    /* renamed from: f */
    public int f226542f;

    /* renamed from: sm3.c$a */
    public static final class C77736a {
        public C77736a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C77020b mo107872a(AppCompatActivity appCompatActivity, String str, C72996z1 z1Var, int i, C77735c cVar) {
            String str2;
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str, "id");
            C87412m.m108594g(z1Var, "contact");
            C87412m.m108594g(cVar, "extension");
            C77118d b = C77113a.f225222a.mo107429b(appCompatActivity, cVar.f226540d, z1Var, cVar.f226539c, (C44661m1) null);
            String username = z1Var.getUsername();
            C87412m.m108593f(username, "contact.username");
            CharSequence charSequence = b.f225226a;
            C77020b bVar = new C77020b(str, i, username, charSequence == null ? "" : charSequence, cVar);
            bVar.mo107341b(b.f225227b);
            if (C72996z1.m85843n5(z1Var.getUsername()) || C72996z1.m85844o5(z1Var.getUsername())) {
                C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                if (jVar == null || (str2 = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null) {
                    str2 = "";
                }
                bVar.f225010i = str2;
                if (!Util.isNullOrNil((CharSequence) str2) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('@');
                    sb.append(bVar.f225010i);
                    bVar.f225010i = sb.toString();
                }
            }
            bVar.f225012n = false;
            bVar.f225013o = "";
            bVar.f225014p = 0;
            return bVar;
        }
    }

    public C77735c() {
        this(0, 0, (C99681n) null, (C99672i) null, 0, 0, 63, (C8480h) null);
    }

    public C77735c(long j, long j2, C99681n nVar, C99672i iVar, int i, int i2, int i3, C8480h hVar) {
        j = (i3 & 1) != 0 ? 0 : j;
        j2 = (i3 & 2) != 0 ? 0 : j2;
        nVar = (i3 & 4) != 0 ? null : nVar;
        iVar = (i3 & 8) != 0 ? null : iVar;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.f226537a = j;
        this.f226538b = j2;
        this.f226539c = nVar;
        this.f226540d = iVar;
        this.f226541e = i;
        this.f226542f = i2;
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77735c)) {
            return false;
        }
        C77735c cVar = (C77735c) bVar;
        return this.f226537a == cVar.f226537a && this.f226538b == cVar.f226538b && C87412m.m108589b(this.f226539c, cVar.f226539c) && C87412m.m108589b(this.f226540d, cVar.f226540d) && this.f226541e == cVar.f226541e && this.f226542f == cVar.f226542f;
    }

    /* renamed from: b */
    public int mo105660b() {
        return 0;
    }

    /* renamed from: c */
    public int mo105661c(C77020b bVar, C77020b bVar2, C77115b bVar3) {
        C87412m.m108594g(bVar, "thisItem");
        C87412m.m108594g(bVar2, "otherItem");
        C87412m.m108594g(bVar3, "other");
        if (!(bVar3 instanceof C77735c)) {
            return 0;
        }
        int i = bVar.f225006e;
        if (i == 11 || i == 10) {
            C77735c cVar = (C77735c) bVar3;
            int i2 = C87412m.m108596i(this.f226541e, cVar.f226541e);
            if (i2 != 0) {
                return i2;
            }
            int i3 = C87412m.m108596i(bVar.f225006e, bVar2.f225006e);
            return i3 != 0 ? i3 : C87412m.m108596i(this.f226542f, cVar.f226542f);
        }
        int i4 = C87412m.m108596i(i, bVar2.f225006e);
        if (i4 != 0) {
            return i4;
        }
        C77735c cVar2 = (C77735c) bVar3;
        int j = C87412m.m108597j(cVar2.f226538b, this.f226538b);
        return j == 0 ? C87412m.m108597j(cVar2.f226537a, this.f226537a) : j;
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(mVar, "uiBinding");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        if (C45881a.m51164a(this.f226538b, 4, 0) != 0) {
            mVar.mo109062d().setBackgroundResource(C0966R.C0969drawable.b54);
        } else {
            mVar.mo109062d().setBackgroundResource(C0966R.C0969drawable.f4860p8);
        }
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        return bVar.f225006e == 10;
    }
}
