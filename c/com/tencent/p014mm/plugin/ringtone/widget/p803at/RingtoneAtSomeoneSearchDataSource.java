package com.tencent.p014mm.plugin.ringtone.widget.p803at;

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
import fk2.C59134f;
import fy3.C32224a;
import gy3.C8480h;
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
import lv1.C99681n;
import p255vr.C14972g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import zb2.C66781o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneSearchDataSource;", "Lac2/b;", "Lfk2/f;", "", "Landroidx/lifecycle/r;", "Lrx3/b0;", "destroy", "<init>", "()V", "a", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource */
public final class RingtoneAtSomeoneSearchDataSource extends C53997b<C59134f, String> implements C0124r {

    /* renamed from: d */
    public final C13601g f164182d = C36568h.m40985a(C57314b.f164187d);

    /* renamed from: e */
    public C99664b f164183e;

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource$a */
    public final class C57313a implements C61173o {

        /* renamed from: d */
        public final C53998c<C59134f> f164184d;

        /* renamed from: e */
        public final C54637q<C39534d<C59134f>> f164185e;

        /* renamed from: f */
        public final /* synthetic */ RingtoneAtSomeoneSearchDataSource f164186f;

        public C57313a(RingtoneAtSomeoneSearchDataSource ringtoneAtSomeoneSearchDataSource, C53998c<C59134f> cVar, C54637q<C39534d<C59134f>> qVar) {
            C87412m.m108594g(cVar, "request");
            C87412m.m108594g(qVar, "channel");
            this.f164186f = ringtoneAtSomeoneSearchDataSource;
            this.f164184d = cVar;
            this.f164185e = qVar;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            if (lVar != null) {
                if ((C87412m.m108589b(lVar.f32073b, this.f164186f.f164183e) ? lVar : null) == null) {
                    return;
                }
                if (lVar.f32074c == 0) {
                    C39534d dVar = new C39534d(this.f164184d);
                    List<C99681n> list = lVar.f32076e;
                    if (list != null) {
                        int i = 0;
                        for (T next : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(((C99681n) next).f292151e);
                                ArrayList<T> arrayList = dVar.f106151b;
                                C87412m.m108593f(z1Var, "contact");
                                C59134f fVar = new C59134f(i, z1Var, 1, (C44661m1) null, 8, (C8480h) null);
                                fVar.f169134g = lVar.f32075d;
                                arrayList.add(fVar);
                                i = i2;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    this.f164185e.mo75539t(dVar);
                    return;
                }
                C54622f.C54623a.m61466a(this.f164185e, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource$b */
    public static final class C57314b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C57314b f164187d = new C57314b();

        public C57314b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: c */
    public C45252f<C39534d<C59134f>> mo74667c(LifecycleScope lifecycleScope, C66781o<C59134f, String> oVar) {
        Class cls = C99260q.class;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(oVar, "dataRequest");
        C54637q qVar = new C54637q();
        C76728k kVar = new C76728k();
        kVar.f224468c = (String) oVar.f191881d;
        kVar.f224467b = 16;
        kVar.f224477l = ((C14972g) C86312j.m106911c(C14972g.class)).mo14022MG();
        kVar.f224472g = new int[]{131072};
        kVar.f224479n = (MMHandler) ((C36570n) this.f164182d).getValue();
        kVar.f224478m = new C57313a(this, oVar, qVar);
        kVar.f224475j.add(C75592q0.m90789s());
        kVar.f224475j.add("blogapp");
        kVar.f224475j.add("tmessage");
        kVar.f224475j.add("officialaccounts");
        kVar.f224475j.add("helper_entry");
        kVar.f224475j.add("filehelper");
        kVar.f224475j.add("weixin");
        if (this.f164183e != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(this.f164183e);
        }
        this.f164183e = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar);
        return new C58057l(qVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void destroy() {
        if (this.f164183e != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f164183e);
        }
        this.f164183e = null;
    }

    /* renamed from: f */
    public void mo74668f() {
        if (this.f164183e != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f164183e);
        }
    }
}
