package com.tencent.p014mm.xwebutil;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;

/* renamed from: com.tencent.mm.xwebutil.i */
public class C19904i extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ String f56733a;

    public C19904i(String str) {
        this.f56733a = str;
    }

    public void onReceive(Context context, Intent intent) {
        String action;
        boolean z = false;
        if (!(intent == null || (action = intent.getAction()) == null || action.isEmpty())) {
            if ("android.intent.action.HEADSET_PLUG".equals(action) && intent.hasExtra("state") && intent.getIntExtra("state", 2) == 0) {
                Log.m105924i("XFilesAudioPlayerLogic", "isEarPhoneDisconnect ACTION_HEADSET_PLUG");
            } else if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                Log.m105924i("XFilesAudioPlayerLogic", "isEarPhoneDisconnect ACTION_AUDIO_BECOMING_NOISY");
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) && intent.hasExtra("android.bluetooth.profile.extra.STATE") && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 0) {
                Log.m105924i("XFilesAudioPlayerLogic", "isEarPhoneDisconnect ACTION_CONNECTION_STATE_CHANGED");
            }
            z = true;
        }
        if (z) {
            if (!C19905j.m21650b(this.f56733a)) {
                Log.m105920e("XFilesAudioPlayerLogic", "broadcastReceiver onReceive, sCurrentParams invalid");
                return;
            }
            ITPPlayer iTPPlayer = C19905j.f56734a.f56748h;
            if (iTPPlayer == null) {
                Log.m105920e("XFilesAudioPlayerLogic", "broadcastReceiver onReceive, tpPlayer invalid");
                return;
            }
            try {
                Log.m105924i("XFilesAudioPlayerLogic", "broadcastReceiver earphone disconnect, try pause");
                if (iTPPlayer.getCurrentState() == 5) {
                    iTPPlayer.pause();
                }
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "broadcastReceiver pause error: " + th.getMessage());
                C19905j.m21652d("broadcastReceiver pause error ", th);
            }
        }
    }
}
