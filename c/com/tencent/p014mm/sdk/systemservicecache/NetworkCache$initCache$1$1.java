package com.tencent.p014mm.sdk.systemservicecache;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.systemservicecache.NetworkCache$initCache$1$1 */
public final class NetworkCache$initCache$1$1 implements Runnable {
    public final /* synthetic */ Context $ctx;

    public NetworkCache$initCache$1$1(Context context) {
        this.$ctx = context;
    }

    public final void run() {
        Context context = this.$ctx;
        final Context context2 = this.$ctx;
        context.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                C87412m.m108594g(context, "context");
                C87412m.m108594g(intent, "intent");
                ((C119157j) C119157j.f356862d).mo183876g(new NetworkCache$initCache$1$1$1$onReceive$1(context2), "SystemServiceCallingCache-UpdateNetWorkCache");
            }
        }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
