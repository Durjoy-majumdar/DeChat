package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import kotlin.Metadata;
import p396x6.C23023u;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootExo$1$onPlayerError$1 */
public final class PlaySoundNew$playRootExo$1$onPlayerError$1 implements Runnable {
    public final /* synthetic */ PlaySoundNew.OnPlayCompletionListener $listener;
    public final /* synthetic */ C23023u $player;

    public PlaySoundNew$playRootExo$1$onPlayerError$1(C23023u uVar, PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener) {
        this.$player = uVar;
        this.$listener = onPlayCompletionListener;
    }

    public final void run() {
        this.$player.stop();
        this.$player.release();
        C119179t tVar = C119157j.f356862d;
        final PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = this.$listener;
        ((C119157j) tVar).mo183895z(new Runnable() {
            public final void run() {
                PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener = onPlayCompletionListener;
                if (onPlayCompletionListener != null) {
                    onPlayCompletionListener.onCompletion();
                }
            }
        });
    }
}
