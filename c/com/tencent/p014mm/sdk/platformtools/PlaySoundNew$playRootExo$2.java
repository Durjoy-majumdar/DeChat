package com.tencent.p014mm.sdk.platformtools;

import kotlin.Metadata;
import p396x6.C23023u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootExo$2 */
public final class PlaySoundNew$playRootExo$2 implements Runnable {
    public final /* synthetic */ C23023u $player;

    public PlaySoundNew$playRootExo$2(C23023u uVar) {
        this.$player = uVar;
    }

    public final void run() {
        this.$player.stop();
        this.$player.release();
    }
}
