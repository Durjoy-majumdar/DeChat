package b63;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.BankcardScene;
import com.tencent.p014mm.plugin.wallet_core.utils.C72515x;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e63.C75557c;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p281yz.C79173v;
import rx3.C13598b0;
import v53.C78342e0;

/* renamed from: b63.t0 */
public final class C39736t0 implements C11385n {

    /* renamed from: d */
    public static final C39736t0 f106613d = new C39736t0();

    /* renamed from: e */
    public static HashMap<C78342e0, C39737a> f106614e = new HashMap<>();

    /* renamed from: b63.t0$a */
    public static final class C39737a {

        /* renamed from: a */
        public final int f106615a;

        /* renamed from: b */
        public final boolean f106616b;

        /* renamed from: c */
        public final boolean f106617c;

        /* renamed from: d */
        public final C32226l<C39738b, C13598b0> f106618d;

        public C39737a(int i, boolean z, boolean z2, C32226l<? super C39738b, C13598b0> lVar) {
            C87412m.m108594g(lVar, "callback");
            this.f106615a = i;
            this.f106616b = z;
            this.f106617c = z2;
            this.f106618d = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39737a)) {
                return false;
            }
            C39737a aVar = (C39737a) obj;
            return this.f106615a == aVar.f106615a && this.f106616b == aVar.f106616b && this.f106617c == aVar.f106617c && C87412m.m108589b(this.f106618d, aVar.f106618d);
        }

        public int hashCode() {
            int i = this.f106615a * 31;
            boolean z = this.f106616b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            boolean z3 = this.f106617c;
            if (!z3) {
                z2 = z3;
            }
            return ((i2 + (z2 ? 1 : 0)) * 31) + this.f106618d.hashCode();
        }

        public String toString() {
            return "Request(scene=" + this.f106615a + ", useCache=" + this.f106616b + ", alwaysDoScene=" + this.f106617c + ", callback=" + this.f106618d + ')';
        }
    }

    /* renamed from: b63.t0$b */
    public static final class C39738b {

        /* renamed from: a */
        public final ArrayList<Bankcard> f106619a;

        /* renamed from: b */
        public final Bankcard f106620b;

        /* renamed from: c */
        public final Bankcard f106621c;

        /* renamed from: d */
        public final C67203r0 f106622d;

        /* renamed from: e */
        public final C78342e0 f106623e;

        /* renamed from: f */
        public final C39739c f106624f;

        /* renamed from: g */
        public final boolean f106625g;

        public C39738b(ArrayList<Bankcard> arrayList, Bankcard bankcard, Bankcard bankcard2, C67203r0 r0Var, C78342e0 e0Var, C39739c cVar, boolean z) {
            C87412m.m108594g(arrayList, "bankcardList");
            C87412m.m108594g(r0Var, "userInfo");
            C87412m.m108594g(cVar, "resultType");
            this.f106619a = arrayList;
            this.f106620b = bankcard;
            this.f106621c = bankcard2;
            this.f106622d = r0Var;
            this.f106623e = e0Var;
            this.f106624f = cVar;
            this.f106625g = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39738b)) {
                return false;
            }
            C39738b bVar = (C39738b) obj;
            return C87412m.m108589b(this.f106619a, bVar.f106619a) && C87412m.m108589b(this.f106620b, bVar.f106620b) && C87412m.m108589b(this.f106621c, bVar.f106621c) && C87412m.m108589b(this.f106622d, bVar.f106622d) && C87412m.m108589b(this.f106623e, bVar.f106623e) && this.f106624f == bVar.f106624f && this.f106625g == bVar.f106625g;
        }

        public int hashCode() {
            int hashCode = this.f106619a.hashCode() * 31;
            Bankcard bankcard = this.f106620b;
            int i = 0;
            int hashCode2 = (hashCode + (bankcard == null ? 0 : bankcard.hashCode())) * 31;
            Bankcard bankcard2 = this.f106621c;
            int hashCode3 = (((hashCode2 + (bankcard2 == null ? 0 : bankcard2.hashCode())) * 31) + this.f106622d.hashCode()) * 31;
            C78342e0 e0Var = this.f106623e;
            if (e0Var != null) {
                i = e0Var.hashCode();
            }
            int hashCode4 = (((hashCode3 + i) * 31) + this.f106624f.hashCode()) * 31;
            boolean z = this.f106625g;
            if (z) {
                z = true;
            }
            return hashCode4 + (z ? 1 : 0);
        }

        public String toString() {
            return "Result(bankcardList=" + this.f106619a + ", balance=" + this.f106620b + ", lqtInfo=" + this.f106621c + ", userInfo=" + this.f106622d + ", netScene=" + this.f106623e + ", resultType=" + this.f106624f + ", isOk=" + this.f106625g + ')';
        }
    }

    /* renamed from: b63.t0$c */
    public enum C39739c {
        Cache,
        Cgi
    }

    /* renamed from: b63.t0$d */
    public static final class C39740d extends C87413o implements C32226l<Bankcard, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<Bankcard> f106629d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bankcard> f106630e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39740d(C8479f0<Bankcard> f0Var, C8479f0<Bankcard> f0Var2) {
            super(1);
            this.f106629d = f0Var;
            this.f106630e = f0Var2;
        }

        public Object invoke(Object obj) {
            T t = (Bankcard) obj;
            C87412m.m108594g(t, LocaleUtil.ITALIAN);
            if (t.mo99388n2()) {
                this.f106629d.f27484d = t;
                return Boolean.TRUE;
            } else if (!t.mo99393s2()) {
                return Boolean.FALSE;
            } else {
                this.f106630e.f27484d = t;
                return Boolean.TRUE;
            }
        }
    }

    /* renamed from: a */
    public final C39738b mo62364a(int i, C78342e0 e0Var, C39739c cVar, boolean z) {
        ArrayList arrayList;
        ArrayList<Bankcard> arrayList2;
        Class cls = C79173v.class;
        if (i == 8 || i == 12 || i == 26) {
            C75557c wx02 = ((C79173v) C86312j.m106911c(cls)).wx0();
            wx02.getClass();
            Cursor rawQuery = wx02.f221976d.rawQuery("select * from WalletBankcardScene where scene=" + i, (String[]) null, 2);
            if (rawQuery == null) {
                arrayList = null;
            } else {
                if (rawQuery.moveToFirst()) {
                    arrayList = new ArrayList();
                    do {
                        BankcardScene bankcardScene = new BankcardScene();
                        bankcardScene.convertFrom(rawQuery);
                        arrayList.add(bankcardScene);
                    } while (rawQuery.moveToNext());
                } else {
                    arrayList = null;
                }
                rawQuery.close();
            }
            if (arrayList == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C72515x.m84847a((BankcardScene) it.next()));
                }
            }
            C87412m.m108593f(arrayList2, "{\n            WalletBank…orScene2(scene)\n        }");
        } else {
            arrayList2 = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91319a(true);
        }
        ArrayList<Bankcard> arrayList3 = arrayList2;
        C8479f0 f0Var = new C8479f0();
        C8479f0 f0Var2 = new C8479f0();
        C61926c.m72673R(arrayList3, new C39740d(f0Var, f0Var2));
        C67203r0 r = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91336r();
        C87412m.m108593f(r, "userInfo");
        return new C39738b(arrayList3, (Bankcard) f0Var.f27484d, (Bankcard) f0Var2.f27484d, r, e0Var, cVar, z);
    }

    /* renamed from: b */
    public final void mo62365b(C39737a aVar) {
        Log.m105924i("MicroMsg.WcPayBindQueryDataFetcher", "do bind query: " + aVar.f106615a);
        C78342e0 e0Var = new C78342e0((String) null, aVar.f106615a);
        f106614e.put(e0Var, aVar);
        C86709a0.m107524d().mo123455a(385, this);
        C86709a0.m107524d().mo123460f(e0Var);
    }

    /* renamed from: c */
    public final void mo62366c(C78342e0 e0Var, C39738b bVar) {
        C32226l<C39738b, C13598b0> lVar;
        Log.m105918d("MicroMsg.WcPayBindQueryDataFetcher", "invoke callback: " + e0Var.f229572v + ", " + f106614e.get(e0Var));
        C39737a aVar = f106614e.get(e0Var);
        if (!(aVar == null || (lVar = aVar.f106618d) == null)) {
            lVar.invoke(bVar);
        }
        f106614e.remove(e0Var);
    }

    /* renamed from: d */
    public final void mo62367d(C39737a aVar) {
        C87412m.m108594g(aVar, "request");
        Iterator<Map.Entry<C78342e0, C39737a>> it = f106614e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (C87412m.m108589b(next.getValue(), aVar)) {
                f106614e.remove(next.getKey());
                Log.m105924i("MicroMsg.WcPayBindQueryDataFetcher", "remove request " + aVar);
                break;
            }
        }
        if (f106614e.isEmpty()) {
            C86709a0.m107524d().mo123470p(385, this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C39739c cVar = C39739c.Cgi;
        if (yVar instanceof C78342e0) {
            Log.m105924i("MicroMsg.WcPayBindQueryDataFetcher", "on scene end: " + i + ", " + i2);
            if (i == 0 && i2 == 0) {
                C78342e0 e0Var = (C78342e0) yVar;
                mo62366c(e0Var, mo62364a(e0Var.f229572v, e0Var, cVar, true));
                return;
            }
            C78342e0 e0Var2 = (C78342e0) yVar;
            mo62366c(e0Var2, mo62364a(e0Var2.f229572v, e0Var2, cVar, false));
        }
    }
}
