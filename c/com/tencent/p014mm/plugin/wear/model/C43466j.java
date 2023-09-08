package com.tencent.p014mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.wear.model.j */
public class C43466j {

    /* renamed from: a */
    public BroadcastReceiver f117488a = new C43467a();

    /* renamed from: com.tencent.mm.plugin.wear.model.j$a */
    public class C43467a extends BroadcastReceiver {
        public C43467a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("state") && intent.getIntExtra("state", 2) == 0) {
                C43466j.this.getClass();
            }
        }
    }

    public C43466j() {
        AudioManager audioManager = (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        MMApplicationContext.getContext().registerReceiver(this.f117488a, intentFilter);
    }
}
