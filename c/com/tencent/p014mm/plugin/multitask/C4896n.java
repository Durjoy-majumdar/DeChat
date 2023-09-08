package com.tencent.p014mm.plugin.multitask;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/n;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.n */
public final class C4896n implements C80883e<Bundle, Bundle> {
    public C4896n() {
        Log.m105924i("MicroMsg.MultiTask.HideMultiTaskUIC", "create add task info");
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Integer num = null;
        String string = bundle != null ? bundle.getString("id") : null;
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("type")) : null;
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("event_type"));
        }
        if (string != null && valueOf != null && num != null) {
            C61926c.m72668M(new C69865m(valueOf.intValue(), string, num.intValue()));
        }
    }
}
