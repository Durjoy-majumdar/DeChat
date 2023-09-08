package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;

/* renamed from: com.tencent.mm.plugin.sns.ui.b5 */
public class C95741b5 {

    /* renamed from: a */
    public C95743b f279253a;

    /* renamed from: b */
    public int f279254b = mo133184b();

    /* renamed from: c */
    public BroadcastReceiver f279255c = new C95742a();

    /* renamed from: com.tencent.mm.plugin.sns.ui.b5$a */
    public class C95742a extends BroadcastReceiver {
        public C95742a() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Log.m105924i("MicroMsg.Sns.SnsNetworkMgr", "connChangedBroadcastReceiver");
                int a = C95741b5.m122554a(C95741b5.this);
                C95741b5 b5Var = C95741b5.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                int b = b5Var.mo133184b();
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                b5Var.f279254b = b;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                Log.m105925i("MicroMsg.Sns.SnsNetworkMgr", "network change current:%s change:%s", Integer.valueOf(a), Integer.valueOf(C95741b5.m122554a(C95741b5.this)));
                if (C95741b5.m122554a(C95741b5.this) != a) {
                    C95741b5 b5Var2 = C95741b5.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    C95743b bVar = b5Var2.f279253a;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    if (bVar != null) {
                        C95741b5 b5Var3 = C95741b5.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                        C95743b bVar2 = b5Var3.f279253a;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                        bVar2.mo133000M(a, C95741b5.m122554a(C95741b5.this));
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.b5$b */
    public interface C95743b {
        /* renamed from: M */
        void mo133000M(int i, int i2);
    }

    public C95741b5() {
        SnsMethodCalculate.markStartTimeMs("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            MMApplicationContext.getContext().unregisterReceiver(this.f279255c);
        } catch (IllegalArgumentException unused) {
        }
        SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        MMApplicationContext.getContext().registerReceiver(this.f279255c, intentFilter);
        SnsMethodCalculate.markEndTimeMs("registerBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
    }

    /* renamed from: a */
    public static /* synthetic */ int m122554a(C95741b5 b5Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        int i = b5Var.f279254b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i;
    }

    /* renamed from: b */
    public final int mo133184b() {
        SnsMethodCalculate.markStartTimeMs("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        int i = 4;
        if (!NetStatusUtil.isConnected(NetworkCache.INSTANCE.getActiveNetworkInfoFromCache(MMApplicationContext.getContext()))) {
            i = 1;
        } else if (NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
            i = 5;
        } else if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            i = 2;
        } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
            i = 3;
        } else if (!NetStatusUtil.is4G(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.Sns.SnsNetworkMgr", "failed and return 4g");
        }
        Log.m105925i("MicroMsg.Sns.SnsNetworkMgr", "currentNetworkStatus:%s", Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("currentNetworkStatus", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        return i;
    }
}
