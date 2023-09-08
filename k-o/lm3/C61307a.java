package lm3;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import c14.C54637q;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58057l;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p749xh.C53339k1;
import qm3.C77374a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;

/* renamed from: lm3.a */
public final class C61307a extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f174422d;

    /* renamed from: e */
    public final C13601g f174423e = C36568h.m40985a(C61308a.f174426d);

    /* renamed from: f */
    public final ArrayList<String> f174424f = new ArrayList<>();

    /* renamed from: g */
    public HashSet<String> f174425g = new HashSet<>();

    /* renamed from: lm3.a$a */
    public static final class C61308a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C61308a f174426d = new C61308a();

        public C61308a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C61307a(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f174422d = appCompatActivity;
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        C54637q qVar = new C54637q();
        int i = cVar2.f151264a;
        int i2 = cVar2.f151265b;
        if (i < this.f174424f.size()) {
            int i3 = i2 + i;
            if (this.f174424f.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f174424f.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i < i3) {
                arrayList.add(this.f174424f.get(i));
                i++;
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0 && !z1Var.mo62932t3()) {
                    C77374a aVar = new C77374a((C99681n) null, (C99672i) null, 0, 0, 0, 0, (String) null, false, 255, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    dVar.f106151b.add(C77374a.f225586i.mo107495a(this.f174422d, username + '-' + 30 + '-' + 0, z1Var, 30, aVar));
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    public void onCreate() {
        this.f174424f.clear();
        boolean a = ContactUpgradeHelper.f10280h.mo1134a();
        C0289a.C0290a aVar = C0289a.f857a;
        ISqlCondition and = aVar.mo339d().and(a ? C53339k1.f149479m1.inString(C26236u.m33719b("0")) : C53339k1.f149475i1.notLike("'%@%'"));
        Column column = C53339k1.f149475i1;
        for (String str : C53339k1.f149474h1.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).log("MicroMsg.SelectContactDataSource").where(and.mo81855or(column.equal("weixin"))).orderBy((List<? extends ISqlOrder>) aVar.mo340e()).build().multiString(((C46166d) ((C36570n) this.f174423e).getValue()).getDB())) {
            if (!this.f174425g.contains(str)) {
                this.f174424f.add(str);
            }
        }
        Log.m105924i("MicroMsg.SelectContactDataSource", "onCreate blockList=" + this.f174425g + " contactListSize=" + this.f174424f.size());
    }
}
