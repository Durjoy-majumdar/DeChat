package com.tencent.p014mm.plugin.findersdk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import mt1.C61580b;
import mt1.C88848a;
import p492dn.C45426j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/findersdk/receiver/HeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "Lmt1/a;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver */
public final class HeadsetReceiver extends BroadcastReceiver implements C88848a {

    /* renamed from: d */
    public C61580b f162683d;

    /* renamed from: e */
    public boolean f162684e;

    /* renamed from: a */
    public boolean mo80132a() {
        Class cls = C45426j.class;
        boolean C = ((C45426j) C86312j.m106911c(cls)).n40().mo157504C();
        boolean Jh0 = ((C45426j) C86312j.m106911c(cls)).Jh0();
        Log.m105924i("HeadsetReceiver", "isHeadsetOn isHeadsetPlugged:" + C + " isBluetoothOn:" + Jh0);
        return C || Jh0;
    }

    /* renamed from: b */
    public void mo80133b(Context context, C61580b bVar) {
        C87412m.m108594g(context, "context");
        Log.m105924i("HeadsetReceiver", "register stateChangeListener：" + bVar);
        this.f162683d = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        context.registerReceiver(this, intentFilter);
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        context.registerReceiver(this, intentFilter);
        this.f162684e = true;
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        context.registerReceiver(this, intentFilter);
        C61580b bVar2 = this.f162683d;
        if (bVar2 != null) {
            bVar2.mo80088g5(mo80132a());
        }
    }

    /* renamed from: c */
    public void mo80134c(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("HeadsetReceiver", "unRegister");
        try {
            if (this.f162684e) {
                context.unregisterReceiver(this);
                this.f162684e = false;
            }
        } catch (Exception e) {
            Log.m105921e("HeadsetReceiver", "unregisterReceiver(HeadsetPlugReceiver.this) error:%s", e.getMessage());
        }
        this.f162683d = null;
    }

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        Log.m105925i("HeadsetReceiver", "headset onReceive %s  %d", intent.getAction(), Integer.valueOf(intent.getIntExtra("state", 0)));
        String action = intent.getAction();
        if (C87412m.m108589b("android.media.AUDIO_BECOMING_NOISY", action)) {
            Log.m105924i("HeadsetReceiver", "headset onReceive 耳机断开");
            C61580b bVar = this.f162683d;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                bVar.mo80088g5(false);
            }
        } else if (intent.getAction() == null || !C87412m.m108589b(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
            if (TextUtils.equals(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2) {
                Log.m105924i("HeadsetReceiver", "headset onReceive 蓝牙耳机连接");
                C61580b bVar2 = this.f162683d;
                if (bVar2 != null) {
                    C87412m.m108591d(bVar2);
                    bVar2.mo80088g5(true);
                }
            }
        } else if (intent.getIntExtra("state", -1) == 1) {
            Log.m105924i("HeadsetReceiver", "headset onReceive 有线耳机连接");
            C61580b bVar3 = this.f162683d;
            if (bVar3 != null) {
                C87412m.m108591d(bVar3);
                bVar3.mo80088g5(true);
            }
        }
    }
}
