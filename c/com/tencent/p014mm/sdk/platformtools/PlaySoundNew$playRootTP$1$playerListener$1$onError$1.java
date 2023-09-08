package com.tencent.p014mm.sdk.platformtools;

import com.tencent.thumbplayer.api.ITPPlayer;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootTP$1$playerListener$1$onError$1 */
public final class PlaySoundNew$playRootTP$1$playerListener$1$onError$1 implements Runnable {
    public final /* synthetic */ ITPPlayer $player;

    public PlaySoundNew$playRootTP$1$playerListener$1$onError$1(ITPPlayer iTPPlayer) {
        this.$player = iTPPlayer;
    }

    public final void run() {
        try {
            ITPPlayer iTPPlayer = this.$player;
            if (iTPPlayer != null) {
                iTPPlayer.stopAsync();
            }
            ITPPlayer iTPPlayer2 = this.$player;
            if (iTPPlayer2 != null) {
                iTPPlayer2.release();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PlaySoundNew", e, "onError release player error", new Object[0]);
        }
    }
}
