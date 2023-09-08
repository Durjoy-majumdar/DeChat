package com.tencent.qqmusic.mediaplayer;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 0})
public final class PlayStuckMonitor$onPlayStuck$1 implements Runnable {
    public final /* synthetic */ boolean $continuous;
    public final /* synthetic */ long $decodeTime;
    public final /* synthetic */ long $playTime;
    public final /* synthetic */ int $underrunCount;

    public PlayStuckMonitor$onPlayStuck$1(long j, long j2, boolean z, int i) {
        this.$decodeTime = j;
        this.$playTime = j2;
        this.$continuous = z;
        this.$underrunCount = i;
    }

    public final void run() {
        PlayStuckMonitor.access$getMCallback$p(PlayStuckMonitor.INSTANCE).mo162I(Long.valueOf(this.$decodeTime), Long.valueOf(this.$playTime), Boolean.valueOf(this.$continuous), Integer.valueOf(this.$underrunCount));
    }
}
