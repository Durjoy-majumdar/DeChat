package com.tencent.qqmusic.mediaplayer;

import fy3.C32227p;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "com/tencent/qqmusic/mediaplayer/PlayStuckMonitor$onAudioTrackFlush$1$1", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class PlayStuckMonitor$onAudioTrackFlush$$inlined$apply$lambda$1 implements Runnable {
    public final /* synthetic */ int $bufferSize$inlined;
    public final /* synthetic */ C32227p $this_apply;
    public final /* synthetic */ int $writeCount$inlined;

    public PlayStuckMonitor$onAudioTrackFlush$$inlined$apply$lambda$1(C32227p pVar, int i, int i2) {
        this.$this_apply = pVar;
        this.$writeCount$inlined = i;
        this.$bufferSize$inlined = i2;
    }

    public final void run() {
        this.$this_apply.invoke(Integer.valueOf(this.$writeCount$inlined), Integer.valueOf(this.$bufferSize$inlined));
    }
}
