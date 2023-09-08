package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import com.tencent.thumbplayer.api.ITPPlayer;
import fy3.C32224a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootTP$1$playerListener$1$onCompletion$1 */
public final class PlaySoundNew$playRootTP$1$playerListener$1$onCompletion$1 implements Runnable {
    public final /* synthetic */ PlaySoundNew.OnPlayCompletionListener $listener;
    public final /* synthetic */ ITPPlayer $player;

    public PlaySoundNew$playRootTP$1$playerListener$1$onCompletion$1(ITPPlayer iTPPlayer, PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener) {
        this.$player = iTPPlayer;
        this.$listener = onPlayCompletionListener;
    }

    public final void run() {
        C195951 r0;
        try {
            ITPPlayer iTPPlayer = this.$player;
            if (iTPPlayer != null) {
                iTPPlayer.stopAsync();
            }
            ITPPlayer iTPPlayer2 = this.$player;
            if (iTPPlayer2 != null) {
                iTPPlayer2.release();
            }
            final PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = this.$listener;
            r0 = new C32224a<C13598b0>() {
                public final void invoke() {
                    PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = r2;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            };
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PlaySoundNew", e, "onCompletion release player error", new Object[0]);
            final PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener2 = this.$listener;
            r0 = new C32224a<C13598b0>() {
                public final void invoke() {
                    PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = r2;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            };
        } catch (Throwable th) {
            final PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener3 = this.$listener;
            CommonKt.uiThread(new C32224a<C13598b0>() {
                public final void invoke() {
                    PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = onPlayCompletionListener3;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            });
            throw th;
        }
        CommonKt.uiThread(r0);
    }
}
