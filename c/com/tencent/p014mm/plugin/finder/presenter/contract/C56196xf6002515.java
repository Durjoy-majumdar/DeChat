package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import on1.C11548q;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1$callback$1 */
final class C56196xf6002515 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyPresenter f160556d;

    /* renamed from: e */
    public final /* synthetic */ long f160557e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56196xf6002515(FinderNotifyContractNew.NotifyPresenter notifyPresenter, long j) {
        super(0);
        this.f160556d = notifyPresenter;
        this.f160557e = j;
    }

    public Object invoke() {
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f160556d;
        C11548q<C55011a> qVar = notifyPresenter.f160536r;
        if (qVar != null) {
            List<T> list = qVar.f33886d;
            long j = this.f160557e;
            int i = 0;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if (((C55011a) next).f154465d.field_id == j) {
                        String str = FinderNotifyContractNew.NotifyPresenter.f160524w;
                        Log.m105924i(str, "msgUpdateListener event index " + i + " tabIndex" + notifyPresenter.f160529h);
                        C11548q<C55011a> qVar2 = notifyPresenter.f160536r;
                        if (qVar2 != null) {
                            qVar2.mo11511n3(j, null, (Object) null, false);
                        } else {
                            C87412m.m108603p("loader");
                            throw null;
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("loader");
        throw null;
    }
}
