package com.tencent.p014mm.sns_compose.page;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import m03.C99783d;
import oh3.C100356d;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sns_compose.page.ListItemsKt$VideoContent$1$observer$1 */
final class ListItemsKt$VideoContent$1$observer$1 implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C100356d f284097d;

    public ListItemsKt$VideoContent$1$observer$1(C100356d dVar) {
        this.f284097d = dVar;
    }

    /* renamed from: k4 */
    public final void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C99783d dVar;
        C87412m.m108594g(sVar, "<anonymous parameter 0>");
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_START) {
            return;
        }
        if (bVar == C39623j.C39625b.ON_PAUSE) {
            C99783d dVar2 = this.f284097d.f293949j;
            if (dVar2 != null) {
                dVar2.pause();
            }
        } else if (bVar == C39623j.C39625b.ON_DESTROY) {
            C100356d dVar3 = this.f284097d;
            C99783d dVar4 = dVar3.f293949j;
            if (dVar4 != null) {
                dVar4.stop();
            }
            dVar3.f293949j = null;
            List<C99783d> list = C100356d.f293942p;
            Log.m105926v("MiscroMsg.PlayerState", "playerRecycler clear");
            List<C99783d> list2 = C100356d.f293942p;
            C87412m.m108593f(list2, "playerRecycler");
            for (C99783d stop : list2) {
                stop.stop();
            }
            C100356d.f293942p.clear();
        } else if (bVar == C39623j.C39625b.ON_RESUME) {
            C100356d dVar5 = this.f284097d;
            if (dVar5.f293950n && (dVar = dVar5.f293949j) != null) {
                dVar.start();
            }
        }
    }
}
