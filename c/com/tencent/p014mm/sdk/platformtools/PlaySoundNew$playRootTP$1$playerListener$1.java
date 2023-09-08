package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J4\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J2\u0010\u0018\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¨\u0006\u0019"}, mo182094d2 = {"com/tencent/mm/sdk/platformtools/PlaySoundNew$playRootTP$1$playerListener$1", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnPreparedListener;", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnInfoListener;", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnStateChangeListener;", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnCompletionListener;", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnErrorListener;", "Lcom/tencent/thumbplayer/api/ITPPlayer;", "player", "Lrx3/b0;", "onPrepared", "", "what", "", "arg1", "arg2", "", "extraObject", "onInfo", "preState", "curState", "onStateChange", "onCompletion", "errorType", "errorCode", "onError", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$playRootTP$1$playerListener$1 */
public final class PlaySoundNew$playRootTP$1$playerListener$1 implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener {
    public final /* synthetic */ PlaySoundNew.OnPlayCompletionListener $listener;

    public PlaySoundNew$playRootTP$1$playerListener$1(PlaySoundNew.OnPlayCompletionListener onPlayCompletionListener) {
        this.$listener = onPlayCompletionListener;
    }

    public void onCompletion(ITPPlayer iTPPlayer) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onCompletion");
        ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootTP$1$playerListener$1$onCompletion$1(iTPPlayer, this.$listener));
    }

    public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onError errType:" + i + " errorCode:" + i2 + ", arg:" + j + ' ' + j2);
        ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootTP$1$playerListener$1$onError$1(iTPPlayer));
    }

    public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onInfo, what:" + i + ' ' + j + ' ' + j2 + ' ' + obj);
    }

    public void onPrepared(ITPPlayer iTPPlayer) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onPrepared");
        if (iTPPlayer != null) {
            iTPPlayer.start();
        }
    }

    public void onStateChange(int i, int i2) {
        Log.m105924i("MicroMsg.PlaySoundNew", "onStateChange " + i + ' ' + i2);
    }
}
