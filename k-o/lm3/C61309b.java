package lm3;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bi3.C0289a;
import bl3.C39818r;
import c14.C54637q;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.util.WXWebReporter;
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
import xm3.C66373k;

/* renamed from: lm3.b */
public final class C61309b extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f174427d;

    /* renamed from: e */
    public ArrayList<String> f174428e = new ArrayList<>();

    /* renamed from: f */
    public final C13601g f174429f = C36568h.m40985a(C61310a.f174431d);

    /* renamed from: g */
    public HashSet<String> f174430g = new HashSet<>();

    /* renamed from: lm3.b$a */
    public static final class C61310a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C61310a f174431d = new C61310a();

        public C61310a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C61309b(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f174427d = appCompatActivity;
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar2, "request");
        C39622i0 a = C39818r.f106831a.mo62444c(this.f174427d).mo75002a(C66373k.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…ntactDataUIC::class.java)");
        C66373k kVar = (C66373k) a;
        C39534d dVar = new C39534d(cVar2);
        C54637q qVar = new C54637q();
        int i = cVar2.f151264a;
        int i2 = cVar2.f151265b;
        if (i < this.f174428e.size()) {
            int i3 = i2 + i;
            if (this.f174428e.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f174428e.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i < i3) {
                arrayList.add(this.f174428e.get(i));
                i++;
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0) {
                    C77374a aVar = new C77374a((C99681n) null, (C99672i) null, 0, 0, 0, 32, (String) null, false, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    dVar.f106151b.add(C77374a.f225586i.mo107495a(this.f174427d, username + '-' + 20 + '-' + 0, z1Var, 20, aVar));
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return 1;
    }

    public void onCreate() {
        this.f174428e.clear();
        boolean booleanExtra = this.f174427d.getIntent().getBooleanExtra("KBlockOpenImFav", true);
        ISqlCondition bitAndEqual = C53339k1.f149476j1.bitAndEqual(64, 64);
        C0289a.C0290a aVar = C0289a.f857a;
        ISqlCondition and = bitAndEqual.and(aVar.mo339d());
        if (booleanExtra) {
            and = and.and(ContactUpgradeHelper.f10280h.mo1134a() ? C53339k1.f149479m1.notEqual((Number) 65536L) : C53339k1.f149475i1.notLike("'%@openim'"));
        }
        for (String str : C53339k1.f149474h1.select((List<? extends ISqlColumn>) C26236u.m33719b(C53339k1.f149475i1)).log("MicroMsg.SelectContactFavorDataSource").where(and).orderBy((List<? extends ISqlOrder>) aVar.mo340e()).build().multiString(((C46166d) ((C36570n) this.f174429f).getValue()).getDB())) {
            if (!this.f174430g.contains(str)) {
                this.f174428e.add(str);
            }
        }
    }
}
