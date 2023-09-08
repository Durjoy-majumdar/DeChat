package com.tencent.p014mm.plugin.audio.broadcast.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import kotlin.Metadata;
import p492dn.C107054l;
import pu0.C110248b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/audio/broadcast/base/BaseAudioReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-audio_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver */
public final class BaseAudioReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.BaseAudioReceiver", "onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
            if (intent != null) {
                ((C107054l) C86312j.m106911c(C107054l.class)).mo157466Yj(intent);
            }
            C110248b.f329777h.mo161668m(10);
        }
    }
}
