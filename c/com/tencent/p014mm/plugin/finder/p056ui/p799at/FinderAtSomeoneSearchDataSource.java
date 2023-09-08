package com.tencent.p014mm.plugin.finder.p056ui.p799at;

import ac2.C39534d;
import ac2.C53997b;
import ac2.C53998c;
import android.os.Looper;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import c14.C54622f;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C57974g;
import d14.C45252f;
import d14.C58057l;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import zb2.C66781o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/at/FinderAtSomeoneSearchDataSource;", "Lac2/b;", "Lcq1/g;", "", "Landroidx/lifecycle/r;", "Lrx3/b0;", "destroy", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource */
public final class FinderAtSomeoneSearchDataSource extends C53997b<C57974g, String> implements C0124r {

    /* renamed from: d */
    public final C13601g f161184d = C36568h.m40985a(C56382b.f161189d);

    /* renamed from: e */
    public C99664b f161185e;

    /* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource$a */
    public final class C56381a implements C61173o {

        /* renamed from: d */
        public final C53998c<C57974g> f161186d;

        /* renamed from: e */
        public final C54637q<C39534d<C57974g>> f161187e;

        /* renamed from: f */
        public final /* synthetic */ FinderAtSomeoneSearchDataSource f161188f;

        public C56381a(FinderAtSomeoneSearchDataSource finderAtSomeoneSearchDataSource, C53998c<C57974g> cVar, C54637q<C39534d<C57974g>> qVar) {
            C87412m.m108594g(cVar, "request");
            C87412m.m108594g(qVar, "channel");
            this.f161188f = finderAtSomeoneSearchDataSource;
            this.f161186d = cVar;
            this.f161187e = qVar;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            int i;
            if (lVar != null) {
                if ((C87412m.m108589b(lVar.f32073b, this.f161188f.f161185e) ? lVar : null) == null) {
                    return;
                }
                if (lVar.f32074c == 0) {
                    C39534d dVar = new C39534d(this.f161186d);
                    ArrayList arrayList = new ArrayList();
                    List<C99681n> list = lVar.f32076e;
                    C87412m.m108593f(list, "result.resultList");
                    Iterator<T> it = list.iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        C99681n nVar = (C99681n) it.next();
                        if (C64197v.m75537f(1, 15).contains(Integer.valueOf(nVar.f292149c))) {
                            arrayList.add(nVar);
                        }
                    }
                    if (!(true ^ arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (Object next : arrayList) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                C99681n nVar2 = (C99681n) next;
                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar2.f292151e);
                                ArrayList<T> arrayList2 = dVar.f106151b;
                                C87412m.m108593f(z1Var, "contact");
                                C57974g gVar = new C57974g(i, z1Var, 2);
                                gVar.f165887g = nVar2;
                                gVar.f165888h = lVar.f32075d;
                                arrayList2.add(gVar);
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    } else {
                        ArrayList<T> arrayList3 = dVar.f106151b;
                        C57974g gVar2 = new C57974g(0, new C72996z1(), 4);
                        gVar2.f165887g = null;
                        gVar2.f165888h = lVar.f32075d;
                        arrayList3.add(gVar2);
                    }
                    this.f161187e.mo75539t(dVar);
                    return;
                }
                C54622f.C54623a.m61466a(this.f161187e, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource$b */
    public static final class C56382b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C56382b f161189d = new C56382b();

        public C56382b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: c */
    public C45252f<C39534d<C57974g>> mo74667c(LifecycleScope lifecycleScope, C66781o<C57974g, String> oVar) {
        Class cls = C99260q.class;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(oVar, "dataRequest");
        C54637q qVar = new C54637q();
        C76728k kVar = new C76728k();
        kVar.f224468c = (String) oVar.f191881d;
        kVar.f224467b = 64;
        kVar.f224472g = new int[]{131072, 131081};
        kVar.f224479n = (MMHandler) ((C36570n) this.f161184d).getValue();
        kVar.f224478m = new C56381a(this, oVar, qVar);
        kVar.f224475j.add(C75592q0.m90789s());
        if (this.f161185e != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(this.f161185e);
        }
        this.f161185e = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar);
        return new C58057l(qVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void destroy() {
        if (this.f161185e != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f161185e);
        }
        this.f161185e = null;
    }

    /* renamed from: f */
    public void mo74668f() {
        if (this.f161185e != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f161185e);
        }
    }
}
