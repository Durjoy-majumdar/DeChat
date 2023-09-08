package vy2;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qb0.C77308f;

/* renamed from: vy2.a */
public final class C78495a {
    /* renamed from: a */
    public static final void m94796a(C89137b0 b0Var, C117747y yVar, C0125s sVar, C11385n nVar) {
        C87412m.m108594g(b0Var, "<this>");
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (sVar != null && nVar != null) {
            int type = yVar.getType();
            if (type != -1) {
                b0Var.f256818p.mo123895a(type, sVar, MvvmObserverOwner.MainThread, new C77308f(nVar));
            } else {
                throw new IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
            }
        } else if (nVar != null) {
            b0Var.mo123455a(yVar.getType(), nVar);
        }
        b0Var.mo123460f(yVar);
    }
}
