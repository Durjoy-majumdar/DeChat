package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.o5 */
public class C94188o5 implements MediaPlayer.OnErrorListener {
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.LuckySoundUtil", "onError, what: %d, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
        return false;
    }
}
