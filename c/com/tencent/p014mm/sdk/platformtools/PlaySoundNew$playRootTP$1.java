package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootTP$1 */
public final class PlaySoundNew$playRootTP$1 implements Runnable {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PlaySoundNew.OnPlayCompletionListener $listener;
    public final /* synthetic */ boolean $looping;
    public final /* synthetic */ int $pathId;
    public final /* synthetic */ PlaySoundNew.SPEAKERON $speakeron;
    public final /* synthetic */ int $stream;

    public PlaySoundNew$playRootTP$1(Context context, int i, PlaySoundNew.SPEAKERON speakeron, int i2, boolean z, PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener) {
        this.$context = context;
        this.$pathId = i;
        this.$speakeron = speakeron;
        this.$stream = i2;
        this.$looping = z;
        this.$listener = onPlayCompletionListener;
    }

    public final void run() {
        try {
            String string = this.$context.getString(this.$pathId);
            C87412m.m108593f(string, "context.getString(pathId)");
            PlaySoundNew playSoundNew = PlaySoundNew.INSTANCE;
            if (playSoundNew.assetHitRateControl(this.$pathId)) {
                Log.m105920e("MicroMsg.PlaySoundNew", "play asset path:" + string + " hit rateControl, ignore this play request");
            } else {
                Log.m105924i("MicroMsg.PlaySoundNew", "play asset path:" + string + ", pathId:" + this.$pathId + ", speakeron:" + this.$speakeron + ", stream:" + this.$stream + ", looping:" + this.$looping);
                ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(this.$context);
                if (createTPPlayer != null) {
                    createTPPlayer.setDataSource(this.$context.getAssets().openFd(string));
                    if (this.$speakeron != PlaySoundNew.SPEAKERON.NOTSET && -1 == this.$stream) {
                        createTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, (long) (this.$speakeron == PlaySoundNew.SPEAKERON.ON ? 3 : 8)));
                    } else if (this.$stream != -1) {
                        createTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, (long) this.$stream));
                    }
                    createTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildInt(419, 1));
                    createTPPlayer.setLoopback(this.$looping);
                    PlaySoundNew$playRootTP$1$playerListener$1 playSoundNew$playRootTP$1$playerListener$1 = new PlaySoundNew$playRootTP$1$playerListener$1(this.$listener);
                    createTPPlayer.setOnPreparedListener(playSoundNew$playRootTP$1$playerListener$1);
                    createTPPlayer.setOnInfoListener(playSoundNew$playRootTP$1$playerListener$1);
                    createTPPlayer.setOnPlayerStateChangeListener(playSoundNew$playRootTP$1$playerListener$1);
                    createTPPlayer.setOnCompletionListener(playSoundNew$playRootTP$1$playerListener$1);
                    createTPPlayer.setOnErrorListener(playSoundNew$playRootTP$1$playerListener$1);
                    createTPPlayer.prepareAsync();
                    playSoundNew.updateAssetPlayTime(this.$pathId);
                    return;
                }
            }
            playSoundNew.updateAssetPlayTime(this.$pathId);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PlaySoundNew", e, "", new Object[0]);
            PlaySoundNew.INSTANCE.updateAssetPlayTime(this.$pathId);
        } catch (Throwable th) {
            PlaySoundNew.INSTANCE.updateAssetPlayTime(this.$pathId);
            throw th;
        }
    }
}
