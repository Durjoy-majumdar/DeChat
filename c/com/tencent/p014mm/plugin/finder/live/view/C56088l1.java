package com.tencent.p014mm.plugin.finder.live.view;

import android.os.Message;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fj1.C45795b;
import gy3.C87412m;
import lu3.C34379c;
import te3.C64766v41;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.live.view.l1 */
public final class C56088l1 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C56072j1 f159948d;

    public C56088l1(C56072j1 j1Var) {
        this.f159948d = j1Var;
    }

    public final boolean handleMessage(Message message) {
        C34379c<?> cVar;
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        if (message.what == 3) {
            C56072j1 j1Var = this.f159948d;
            j1Var.getClass();
            Class cls = C54991o.class;
            Class cls2 = C55001u.class;
            C45795b bVar = C45795b.f123698n;
            if (bVar != null) {
                C54991o oVar = (C54991o) bVar.mo71262a(cls);
                C64766v41 v412 = j1Var.f159903b.get(Long.valueOf(((C55001u) oVar.business(cls2)).f154420q.f182392d));
                if (v412 == null) {
                    v412 = new C64766v41();
                }
                String str = v412.f185828d;
                boolean z = false;
                boolean z2 = !(str == null || str.length() == 0);
                C45795b bVar2 = C45795b.f123698n;
                if (bVar2 != null && ((C54991o) bVar2.mo71262a(cls)).mo75997d4()) {
                    z = true;
                }
                Log.m105924i("FinderLiveMultiTaskManager", "addToHistory: has added = " + z2 + ", is live finished = " + z + ", liveId = " + ((C55001u) oVar.business(cls2)).f154420q.f182392d + ", objectId = " + ((C55001u) oVar.business(cls2)).f154416j);
                if (!z2 && !z) {
                    v412.f185829e = ((C55001u) oVar.business(cls2)).f154420q.f182392d;
                    v412.f185830f = ((C55001u) oVar.business(cls2)).f154423t;
                    v412.f185831g = ((C55001u) oVar.business(cls2)).f154416j;
                    v412.f185832h = oVar.f154345o;
                    v412.f185833i = oVar.f154252S0;
                    v412.f185834j = ((C55001u) oVar.business(cls2)).f154424u;
                    v412.f185835n = oVar.f154341n;
                    j1Var.f159903b.put(Long.valueOf(((C55001u) oVar.business(cls2)).f154420q.f182392d), v412);
                    j1Var.mo78157b();
                    cVar = ((C119157j) C119157j.f356862d).mo183884o(new C56079k1(((C54991o) oVar.business(cls)).mo75969L3(), j1Var));
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                Log.m105920e("FinderLiveMultiTaskManager", "addToHistory: curLiveRoomData is null");
            }
        }
        return true;
    }
}
