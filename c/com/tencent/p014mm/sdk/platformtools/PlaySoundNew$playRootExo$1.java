package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import kotlin.Metadata;
import p295b8.C16774g;
import p370p7.C21962v;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0012\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0016H\u0016¨\u0006\u0018"}, mo182094d2 = {"com/tencent/mm/sdk/platformtools/PlaySoundNew$playRootExo$1", "Lx6/p$a;", "Lx6/e;", "error", "Lrx3/b0;", "onPlayerError", "", "playWhenReady", "", "playbackState", "onPlayerStateChanged", "Lx6/v;", "p0", "", "p1", "onTimelineChanged", "Lp7/v;", "Lb8/g;", "onTracksChanged", "onLoadingChanged", "onRepeatModeChanged", "onPositionDiscontinuity", "Lx6/o;", "onPlaybackParametersChanged", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootExo$1 */
public final class PlaySoundNew$playRootExo$1 implements C23017p.C23018a {
    public final /* synthetic */ PlaySoundNew.OnPlayCompletionListener $listener;
    public final /* synthetic */ C23023u $player;

    public PlaySoundNew$playRootExo$1(C23023u uVar, PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener) {
        this.$player = uVar;
        this.$listener = onPlayCompletionListener;
    }

    public void onLoadingChanged(boolean z) {
    }

    public void onPlaybackParametersChanged(C23016o oVar) {
    }

    public void onPlayerError(C22997e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onPlayerError error:");
        sb.append(eVar != null ? eVar.getLocalizedMessage() : null);
        Log.m105924i("MicroMsg.PlaySoundNew", sb.toString());
        ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootExo$1$onPlayerError$1(this.$player, this.$listener));
    }

    public void onPlayerStateChanged(boolean z, int i) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onPlayerStateChanged playWhenReady:" + z + ", playbackState:" + i);
        if (i == 4) {
            Log.m105924i("MicroMsg.PlaySoundNew", "play end");
            ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootExo$1$onPlayerStateChanged$1(this.$player, this.$listener));
        }
    }

    public void onPositionDiscontinuity() {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onTimelineChanged(C23027v vVar, Object obj) {
    }

    public void onTracksChanged(C21962v vVar, C16774g gVar) {
    }
}
