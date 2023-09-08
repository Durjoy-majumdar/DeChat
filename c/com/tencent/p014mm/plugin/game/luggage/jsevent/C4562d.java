package com.tencent.p014mm.plugin.game.luggage.jsevent;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;
import p244tt.C14088e;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/jsevent/d;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: com.tencent.mm.plugin.game.luggage.jsevent.d */
final class C4562d implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        String str = null;
        String string = bundle != null ? bundle.getString("name") : null;
        if (bundle != null) {
            str = bundle.getString("data");
        }
        Log.m105924i("MicroMsg.LiteAppIpcEventDispatch", "invoke, " + string);
        if (string != null && ((C14088e) C86312j.m106911c(C14088e.class)).isInitialized()) {
            LiteAppCenter.onEventTriggered(string, str);
        }
    }
}
