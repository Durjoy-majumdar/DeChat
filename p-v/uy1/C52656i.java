package uy1;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Luy1/i;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: uy1.i */
public final class C52656i implements C80916r<Bundle, Bundle> {
    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = new Bundle();
        MMHandler mMHandler = C52642c.f146980a;
        Long valueOf = Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L)));
        boolean z = true;
        boolean z2 = valueOf.longValue() != 0 && Math.abs(Util.secondsToNow(valueOf.longValue())) < 172800;
        if ((C41853c.m45368b() == null || !C41853c.m45368b().f128043d) && !z2) {
            z = false;
        }
        bundle2.putBoolean("navigationToChatroom", z);
        return bundle2;
    }
}
