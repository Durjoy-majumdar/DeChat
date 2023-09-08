package com.tencent.p014mm.plugin.sport.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sport/model/h;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sport_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sport.model.h */
public final class C115767h implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, "data");
        C87412m.m108594g(gVar, "callback");
        long j = bundle.getLong("lastTickTime");
        long j2 = bundle.getLong("lastStep");
        long j3 = bundle.getLong("lastTime");
        ((C119157j) C119157j.f356862d).mo183876g(new C115768i(j, j2, j3, "MM"), "PushUpdateStepTag");
        gVar.mo894a(new Bundle());
    }
}
