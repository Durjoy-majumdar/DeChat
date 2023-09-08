package vx2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lvx2/b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: vx2.b */
public final class C15018b implements C80883e<Bundle, Bundle> {
    public C15018b() {
        Log.m105924i("MicroMsg.TaskBar.DeleteTaskInfoTask", "create delete task info");
    }

    public void invoke(Object obj, C1256g gVar) {
        String string;
        Bundle bundle = (Bundle) obj;
        if (C86709a0.m107522a() && bundle != null && (string = bundle.getString("id")) != null) {
            ((C65900i) C86312j.m106911c(C65900i.class)).mo61365E1(string, true, bundle.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        }
    }
}
