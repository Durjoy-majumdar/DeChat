package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.p5 */
public class C94189p5 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ String f272105a;

    public C94189p5(String str) {
        this.f272105a = str;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f272105a;
        Log.m105925i("MicroMsg.LuckySoundUtil", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}
