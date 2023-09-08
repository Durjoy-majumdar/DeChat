package il1;

import androidx.recyclerview.widget.RecyclerView;
import b50.C54421g;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58113g;
import d50.C7170j;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hg1.C32895i;
import ik1.C33354n;
import java.util.Collection;
import java.util.Iterator;
import nj3.C76912y0;
import ok1.C62042e;
import p165hr.C60106t;
import p50.C62197e;
import qo3.C12925w;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C64273c21;

/* renamed from: il1.q6 */
public final class C9098q6 extends C87413o implements C32226l<C7170j, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9065m6 f28678d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f28679e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f28680f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9098q6(C9065m6 m6Var, C12925w wVar, RecyclerView recyclerView) {
        super(1);
        this.f28678d = m6Var;
        this.f28679e = wVar;
        this.f28680f = recyclerView;
    }

    public Object invoke(Object obj) {
        C64273c21 c212;
        C54421g gVar;
        String str;
        int i;
        boolean z;
        C7170j jVar = (C7170j) obj;
        C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
        C9065m6 m6Var = this.f28678d;
        C62197e e0 = FinderLiveService.f159376d.mo77631e0();
        boolean z2 = false;
        if (!(e0 == null || (gVar = e0.f176822Y0) == null)) {
            C58113g gVar2 = gVar.f152628b;
            T t = null;
            if (gVar2 != null) {
                Collection<C7170j> values = gVar2.f166241k.values();
                C87412m.m108593f(values, "cdnUrlMap.values");
                Iterator<T> it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C7170j) next).f25143b == jVar.f25143b) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t = next;
                        break;
                    }
                }
                t = (C7170j) t;
            }
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "customerSwitchCdnStream liveUrlInfo:" + jVar + ",customerLiveInfo:" + t);
            if (t == null || (str = t.f25142a) == null) {
                str = "";
            }
            gVar.mo75231e(str);
            if ((str.length() > 0) && (i = jVar.f25143b) > 0) {
                C58113g gVar3 = gVar.f152628b;
                if (gVar3 != null) {
                    gVar3.f166240j = i;
                }
                z2 = true;
            }
        }
        m6Var.f28610e = z2;
        if (this.f28678d.f28610e) {
            this.f28679e.mo5085n();
            C32895i Cx0 = ((C60106t) C86312j.m106911c(C60106t.class)).Cx0();
            C45795b bVar = this.f28678d.f28608c;
            long j = (bVar == null || (c212 = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q) == null) ? 0 : c212.f182392d;
            int i2 = jVar.f25143b;
            C33354n nVar = (C33354n) Cx0;
            nVar.f90402f.put(Long.valueOf(j), Integer.valueOf(i2));
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveVideoDefinitionStorage", "updateDefinition liveId:" + j + ",level:" + i2 + ",cache size:" + nVar.f90402f.size());
            if (((Boolean) ((C36570n) this.f28678d.f28607b).getValue()).booleanValue()) {
                Log.m105924i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition uiStyleNew!");
            } else {
                C76912y0.m92766e(this.f28680f.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.e9q), C9091p6.f28666a);
            }
        } else {
            Log.m105924i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition failed!");
        }
        return C13598b0.f38549a;
    }
}
