package com.tencent.p014mm.plugin.ting.jni;

import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\bD\u0010EJ\t\u0010\u0005\u001a\u00020\u0004H J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H J\u0019\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H J\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH J\t\u0010\u0010\u001a\u00020\u000fH J\t\u0010\u0012\u001a\u00020\u0011H J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH J\u0011\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH J\t\u0010\u0016\u001a\u00020\tH J\t\u0010\u0017\u001a\u00020\tH J\t\u0010\u0018\u001a\u00020\tH J\u0011\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H J\u0011\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH J\t\u0010\u001f\u001a\u00020\tH J\t\u0010 \u001a\u00020\tH J\u0011\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000fH J\t\u0010#\u001a\u00020\u000fH J\u0011\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0007H J\t\u0010&\u001a\u00020\u0007H J\t\u0010(\u001a\u00020'H J\t\u0010)\u001a\u00020\u0011H J\t\u0010*\u001a\u00020\tH J\t\u0010+\u001a\u00020\u000fH J\t\u0010,\u001a\u00020\u0019H J\t\u0010-\u001a\u00020\u0019H J\t\u0010.\u001a\u00020\u0019H J\t\u0010/\u001a\u00020\u001cH J\u0011\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0003H J\u0011\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0003H J\u0011\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H J\u0011\u00105\u001a\u00020\t2\u0006\u00100\u001a\u000203H J\t\u00106\u001a\u00020\tH J\u0011\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207H J#\u0010=\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0011H J#\u0010>\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0011H J\u0019\u0010@\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H J \u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010C\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006G"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskCpp;", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "Lcom/tencent/mm/plugin/ting/jni/PlayTask;", "Lcom/tencent/mm/plugin/ting/jni/PlayerStateClient;", "", "id", "token", "", "update", "Lrx3/b0;", "activate", "inactivate", "Lcom/tencent/mm/plugin/ting/jni/Player;", "player", "setPlayer", "", "playingIndex", "", "playingItem", "index", "loadItem", "play", "stop", "resume", "pause", "", "position", "seek", "", "rate", "setPlayRate", "prev", "next", "mode", "setPlayMode", "getPlayMode", "random", "setRandomPlaylist", "getRandomPlaylist", "Lcom/tencent/mm/plugin/ting/jni/PlayList;", "getPlayList", "getTapeInfo", "restorePlayListInfo", "getPlayerState", "getPlayerDuration", "getPlayerPosition", "getPlayerDownloadPercent", "getPlayRate", "listener", "addPlayerStateClient", "removePlayerStateClient", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskStateListener;", "addPlayTaskStateListener", "removePlayTaskStateListener", "clearPlayTaskStateListener", "Lcom/tencent/mm/plugin/ting/jni/AudioFocus;", "audioFocus", "setAudioFocus", "item", "event", "msg", "onPlayEvent", "onPlayInfoEvent", "duration", "onProgressChanged", "taskId", "onActivated", "onInactivated", "<init>", "()V", "Companion", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskCpp */
public final class PlayTaskCpp extends BaseObject implements PlayTask, PlayerStateClient {
    public static final Companion Companion = new Companion((C8480h) null);
    private byte _hellAccFlag_;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTaskCpp$Companion;", "", "()V", "create", "Lcom/tencent/mm/plugin/ting/jni/PlayTask;", "taskId", "", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayTaskCpp$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final native PlayTask create(String str);
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("aff_biz");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/ting/jni/PlayTaskCpp", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/ting/jni/PlayTaskCpp", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public native void activate(String str, boolean z);

    public native void addPlayTaskStateListener(PlayTaskStateListener playTaskStateListener);

    public native void addPlayerStateClient(PlayerStateClient playerStateClient);

    public native void clearPlayTaskStateListener();

    public native PlayList getPlayList();

    public native int getPlayMode();

    public native float getPlayRate();

    public native long getPlayerDownloadPercent();

    public native long getPlayerDuration();

    public native long getPlayerPosition();

    public native int getPlayerState();

    public native boolean getRandomPlaylist();

    public native byte[] getTapeInfo();

    /* renamed from: id */
    public native String mo176232id();

    public native void inactivate(String str, boolean z);

    public native void loadItem(int i);

    public native void next();

    public void onActivated(String str, String str2, boolean z) {
        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(str2, "taskId");
    }

    public void onInactivated(String str, boolean z) {
        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
    }

    public native void onPlayEvent(byte[] bArr, int i, byte[] bArr2);

    public native void onPlayInfoEvent(byte[] bArr, int i, byte[] bArr2);

    public native void onProgressChanged(long j, long j2);

    public native void pause();

    public native void play(int i);

    public native int playingIndex();

    public native byte[] playingItem();

    public native void prev();

    public native void removePlayTaskStateListener(PlayTaskStateListener playTaskStateListener);

    public native void removePlayerStateClient(PlayerStateClient playerStateClient);

    public native void restorePlayListInfo();

    public native void resume();

    public native void seek(long j);

    public native void setAudioFocus(AudioFocus audioFocus);

    public native void setPlayMode(int i);

    public native void setPlayRate(float f);

    public native void setPlayer(Player player);

    public native void setRandomPlaylist(boolean z);

    public native void stop();
}
