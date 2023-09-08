package com.tencent.p014mm.emoji.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/emoji/sync/EmojiSyncManager$ConnectivityReceiver", "Landroid/content/BroadcastReceiver;", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.sync.EmojiSyncManager$ConnectivityReceiver */
public final class EmojiSyncManager$ConnectivityReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (!NetStatusUtil.isConnected(context)) {
            throw null;
        } else if (NetStatusUtil.isWifi(context)) {
            throw null;
        } else {
            throw null;
        }
    }
}
