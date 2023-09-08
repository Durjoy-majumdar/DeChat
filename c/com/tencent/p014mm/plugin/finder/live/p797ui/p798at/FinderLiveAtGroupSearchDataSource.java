package com.tencent.p014mm.plugin.finder.live.p797ui.p798at;

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
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99671h;
import lv1.C99681n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import zb2.C66781o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/ui/at/FinderLiveAtGroupSearchDataSource;", "Lac2/b;", "Lcq1/g;", "", "Landroidx/lifecycle/r;", "Lrx3/b0;", "destroy", "chatroom", "<init>", "(Ljava/lang/String;)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource */
public final class FinderLiveAtGroupSearchDataSource extends C53997b<C57974g, String> implements C0124r {

    /* renamed from: d */
    public final String f159556d;

    /* renamed from: e */
    public final C13601g f159557e = C36568h.m40985a(C55969b.f159562d);

    /* renamed from: f */
    public C99664b f159558f;

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource$a */
    public final class C55968a implements C61173o {

        /* renamed from: d */
        public final C53998c<C57974g> f159559d;

        /* renamed from: e */
        public final C54637q<C39534d<C57974g>> f159560e;

        /* renamed from: f */
        public final /* synthetic */ FinderLiveAtGroupSearchDataSource f159561f;

        public C55968a(FinderLiveAtGroupSearchDataSource finderLiveAtGroupSearchDataSource, C53998c<C57974g> cVar, C54637q<C39534d<C57974g>> qVar) {
            C87412m.m108594g(cVar, "request");
            C87412m.m108594g(qVar, "channel");
            this.f159561f = finderLiveAtGroupSearchDataSource;
            this.f159559d = cVar;
            this.f159560e = qVar;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            List<C99671h> list;
            if (lVar != null) {
                if ((C87412m.m108589b(lVar.f32073b, this.f159561f.f159558f) ? lVar : null) == null) {
                    return;
                }
                if (lVar.f32074c == 0) {
                    C39534d dVar = new C39534d(this.f159559d);
                    List<C99681n> list2 = lVar.f32076e;
                    C87412m.m108593f(list2, "result.resultList");
                    int i = 0;
                    C99681n nVar = (C99681n) C110818d0.m150917O(list2, 0);
                    if (nVar != null) {
                        nVar.f292168v = lVar.f32075d;
                    } else {
                        nVar = null;
                    }
                    if (!(nVar == null || (list = nVar.f292160n) == null)) {
                        for (T next : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(((C99671h) next).f292113e);
                                ArrayList<T> arrayList = dVar.f106151b;
                                C87412m.m108593f(z1Var, "contact");
                                C57974g gVar = new C57974g(i, z1Var, 2);
                                gVar.f165888h = lVar.f32075d;
                                arrayList.add(gVar);
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    this.f159560e.mo75539t(dVar);
                    return;
                }
                C54622f.C54623a.m61466a(this.f159560e, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource$b */
    public static final class C55969b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C55969b f159562d = new C55969b();

        public C55969b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    public FinderLiveAtGroupSearchDataSource(String str) {
        C87412m.m108594g(str, "chatroom");
        this.f159556d = str;
    }

    /* renamed from: c */
    public C45252f<C39534d<C57974g>> mo74667c(LifecycleScope lifecycleScope, C66781o<C57974g, String> oVar) {
        Class cls = C99260q.class;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(oVar, "dataRequest");
        C54637q qVar = new C54637q();
        C76728k kVar = new C76728k();
        kVar.f224469d = this.f159556d;
        kVar.f224468c = (String) oVar.f191881d;
        kVar.f224467b = 12;
        kVar.f224479n = (MMHandler) ((C36570n) this.f159557e).getValue();
        kVar.f224478m = new C55968a(this, oVar, qVar);
        kVar.f224475j.add(C75592q0.m90789s());
        if (this.f159558f != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(this.f159558f);
        }
        this.f159558f = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar);
        return new C58057l(qVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void destroy() {
        if (this.f159558f != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f159558f);
        }
        this.f159558f = null;
    }

    /* renamed from: f */
    public void mo74668f() {
        if (this.f159558f != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f159558f);
        }
    }
}
