package coil.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"coil/network/NetworkObserverApi14$connectionReceiver$1", "Landroid/content/BroadcastReceiver;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class NetworkObserverApi14$connectionReceiver$1 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (C87412m.m108589b(intent == null ? null : intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            throw null;
        }
    }
}
