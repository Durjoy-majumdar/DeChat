package com.tencent.p014mm.p136ui.chatting.atsomeone;

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
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C58057l;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
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
import lv1.C99671h;
import lv1.C99681n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import wj3.C66137b;
import zb2.C66781o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/atsomeone/AtSomeoneSearchDataSource;", "Lac2/b;", "Lwj3/b;", "", "Landroidx/lifecycle/r;", "Lrx3/b0;", "destroy", "chatroom", "<init>", "(Ljava/lang/String;)V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource */
public final class AtSomeoneSearchDataSource extends C53997b<C66137b, String> implements C0124r {

    /* renamed from: d */
    public final String f165072d;

    /* renamed from: e */
    public final C13601g f165073e = C36568h.m40985a(C57671b.f165078d);

    /* renamed from: f */
    public C99664b f165074f;

    /* renamed from: com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource$a */
    public final class C57670a implements C61173o {

        /* renamed from: d */
        public final C53998c<C66137b> f165075d;

        /* renamed from: e */
        public final C54637q<C39534d<C66137b>> f165076e;

        /* renamed from: f */
        public final /* synthetic */ AtSomeoneSearchDataSource f165077f;

        public C57670a(AtSomeoneSearchDataSource atSomeoneSearchDataSource, C53998c<C66137b> cVar, C54637q<C39534d<C66137b>> qVar) {
            C87412m.m108594g(cVar, "request");
            C87412m.m108594g(qVar, "channel");
            this.f165077f = atSomeoneSearchDataSource;
            this.f165075d = cVar;
            this.f165076e = qVar;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            List<C99671h> list;
            if (lVar != null) {
                if ((C87412m.m108589b(lVar.f32073b, this.f165077f.f165074f) ? lVar : null) == null) {
                    return;
                }
                if (lVar.f32074c == 0) {
                    C39534d dVar = new C39534d(this.f165075d);
                    List<C99681n> list2 = lVar.f32076e;
                    C87412m.m108593f(list2, "result.resultList");
                    C99681n nVar = (C99681n) C110818d0.m150917O(list2, 0);
                    if (nVar != null) {
                        nVar.f292168v = lVar.f32075d;
                    } else {
                        nVar = null;
                    }
                    if (!(nVar == null || (list = nVar.f292160n) == null)) {
                        Iterator it = ((ArrayList) list).iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(((C99671h) next).f292113e);
                                ArrayList<T> arrayList = dVar.f106151b;
                                C87412m.m108593f(z1Var, "contact");
                                C66137b bVar = new C66137b(i, z1Var, 1, (C44661m1) null, 8, (C8480h) null);
                                bVar.f190111g = lVar.f32075d;
                                arrayList.add(bVar);
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    this.f165076e.mo75539t(dVar);
                    return;
                }
                C54622f.C54623a.m61466a(this.f165076e, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource$b */
    public static final class C57671b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C57671b f165078d = new C57671b();

        public C57671b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    public AtSomeoneSearchDataSource(String str) {
        C87412m.m108594g(str, "chatroom");
        this.f165072d = str;
    }

    /* renamed from: c */
    public C45252f<C39534d<C66137b>> mo74667c(LifecycleScope lifecycleScope, C66781o<C66137b, String> oVar) {
        Class cls = C99260q.class;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(oVar, "dataRequest");
        C54637q qVar = new C54637q();
        C76728k kVar = new C76728k();
        kVar.f224469d = this.f165072d;
        kVar.f224468c = (String) oVar.f191881d;
        kVar.f224467b = 12;
        kVar.f224479n = (MMHandler) ((C36570n) this.f165073e).getValue();
        kVar.f224478m = new C57670a(this, oVar, qVar);
        kVar.f224475j.add(C75592q0.m90789s());
        if (this.f165074f != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(this.f165074f);
        }
        this.f165074f = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar);
        return new C58057l(qVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void destroy() {
        if (this.f165074f != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f165074f);
        }
        this.f165074f = null;
    }

    /* renamed from: f */
    public void mo74668f() {
        if (this.f165074f != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f165074f);
        }
    }
}
