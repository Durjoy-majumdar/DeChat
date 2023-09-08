package uc3;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72957c4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ht1.C60200t1;
import ke3.C88144b;
import lc3.C10485b;
import ns3.C11266d;

/* renamed from: uc3.a */
public final class C78146a {
    /* renamed from: a */
    public static void m94352a(Context context, Intent intent) {
        if (m94353b()) {
            Log.m105924i("NearbyHelper", "gotoNearByUILiveFriends");
            if (intent == null) {
                intent = new Intent();
            }
            ((C11266d) C86312j.m106911c(C11266d.class)).mo9191bV(context, intent);
            return;
        }
        Log.m105924i("NearbyHelper", "gotoNearBy");
        if (m94354c()) {
            C88144b.m109789g(context, "nearby", ".ui.NearbyFriendsUI");
            return;
        }
        C86709a0.m107523b().mo121108c();
        if (((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).mo100937kD() > 0) {
            C88144b.m109789g(context, "nearby", ".ui.NearbyFriendShowSayHiUI");
        } else {
            C88144b.m109789g(context, "nearby", ".ui.NearbyFriendsUI");
        }
    }

    /* renamed from: b */
    public static boolean m94353b() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83760G5();
    }

    /* renamed from: c */
    public static boolean m94354c() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EnableStrangerChat");
        if (Util.isNullOrNil(c)) {
            c = "0";
        }
        return "1".equals(c);
    }
}
