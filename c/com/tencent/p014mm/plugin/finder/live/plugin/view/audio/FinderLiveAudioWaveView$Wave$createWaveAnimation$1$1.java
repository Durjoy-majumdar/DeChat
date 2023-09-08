package com.tencent.p014mm.plugin.finder.live.plugin.view.audio;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView$Wave$createWaveAnimation$1$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lrx3/b0;", "onAnimationEnd", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView$Wave$createWaveAnimation$1$1 */
public final class FinderLiveAudioWaveView$Wave$createWaveAnimation$1$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ FinderLiveAudioWaveView this$0;
    public final /* synthetic */ FinderLiveAudioWaveView.Wave this$1;

    public FinderLiveAudioWaveView$Wave$createWaveAnimation$1$1(FinderLiveAudioWaveView finderLiveAudioWaveView, FinderLiveAudioWaveView.Wave wave) {
        this.this$0 = finderLiveAudioWaveView;
        this.this$1 = wave;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.this$0.running) {
            this.this$0.waveList.remove(this.this$1);
        }
    }
}
