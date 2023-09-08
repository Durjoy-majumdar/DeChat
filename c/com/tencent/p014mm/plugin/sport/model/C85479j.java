package com.tencent.p014mm.plugin.sport.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import sv2.C118311f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sport/model/j;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sport_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sport.model.j */
public final class C85479j implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Class cls = C118311f.class;
        C87412m.m108594g(bundle, "data");
        C87412m.m108594g(gVar, "callback");
        Log.m105924i("MicroMsg.Sport.PushSportTask", "PushUpdateConfigTask execute");
        String string = bundle.getString("config");
        if (!Util.isNullOrNil(string)) {
            try {
                C115769k.f347338c = new JSONObject(string);
            } catch (Exception unused) {
                C115769k.f347338c = null;
            }
        }
        if (C86312j.m106911c(cls) != null) {
            ((C118311f) C86312j.m106911c(cls)).xx0().mo176108a();
        }
        gVar.mo894a(new Bundle());
    }
}
