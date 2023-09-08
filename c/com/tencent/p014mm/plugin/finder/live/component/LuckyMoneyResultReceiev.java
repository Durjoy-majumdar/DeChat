package com.tencent.p014mm.plugin.finder.live.component;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import wg1.C66093v1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/component/LuckyMoneyResultReceiev;", "Landroid/os/ResultReceiver;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.component.LuckyMoneyResultReceiev */
public final class LuckyMoneyResultReceiev extends ResultReceiver {

    /* renamed from: d */
    public WeakReference<C66093v1> f159297d;

    /* renamed from: e */
    public WeakReference<C66093v1.C66094b> f159298e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyMoneyResultReceiev(C66093v1 v1Var, Handler handler) {
        super(handler);
        C87412m.m108594g(v1Var, "presenter");
        C87412m.m108594g(handler, "handler");
        this.f159297d = new WeakReference<>(v1Var);
    }

    public void onReceiveResult(int i, Bundle bundle) {
        Class cls = C55001u.class;
        super.onReceiveResult(i, bundle);
        C66093v1 v1Var = this.f159297d.get();
        WeakReference<C66093v1.C66094b> weakReference = this.f159298e;
        C66093v1.C66094b bVar = weakReference != null ? weakReference.get() : null;
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubblePresenter", "openLuckyMoney presenter:" + v1Var + ",LuckyMoneyShowInfo:" + bVar + ", result:" + i);
        if (v1Var != null && bVar != null) {
            C54795n5 n5Var = v1Var.f189995f;
            C45795b bVar2 = v1Var.f189993d;
            if (i == -1) {
                if (n5Var != null) {
                    n5Var.mo75758z(((C55001u) bVar2.mo71262a(cls)).f154420q.f182392d, ((C55001u) bVar2.mo71262a(cls)).f154416j, ((C55001u) bVar2.mo71262a(cls)).f154423t, ((C55001u) bVar2.mo71262a(cls)).f154417n, bVar.f190000a.f143878d);
                }
                v1Var.mo90139n(bVar);
            } else if (i == 1) {
                v1Var.mo90139n(bVar);
            }
        }
    }
}
