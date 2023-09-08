package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u0007H&J\b\u0010\u001e\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\rH&J\b\u0010!\u001a\u00020\rH&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005H&J\b\u0010$\u001a\u00020\u0005H&J\b\u0010&\u001a\u00020%H&J\b\u0010'\u001a\u00020\u000fH&J\b\u0010(\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H&J\b\u0010-\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H&¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayTask;", "Lcom/tencent/mm/plugin/ting/jni/PlayerStateService;", "", "id", "token", "", "update", "Lrx3/b0;", "activate", "inactivate", "Lcom/tencent/mm/plugin/ting/jni/Player;", "player", "setPlayer", "", "playingIndex", "", "playingItem", "index", "loadItem", "play", "stop", "resume", "pause", "", "position", "seek", "", "rate", "setPlayRate", "prev", "next", "mode", "setPlayMode", "getPlayMode", "random", "setRandomPlaylist", "getRandomPlaylist", "Lcom/tencent/mm/plugin/ting/jni/PlayList;", "getPlayList", "getTapeInfo", "restorePlayListInfo", "Lcom/tencent/mm/plugin/ting/jni/PlayTaskStateListener;", "listener", "addPlayTaskStateListener", "removePlayTaskStateListener", "clearPlayTaskStateListener", "Lcom/tencent/mm/plugin/ting/jni/AudioFocus;", "audioFocus", "setAudioFocus", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayTask */
public interface PlayTask extends PlayerStateService {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.ting.jni.PlayTask$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void activate$default(PlayTask playTask, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                playTask.activate(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activate");
        }

        public static /* synthetic */ void inactivate$default(PlayTask playTask, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                playTask.inactivate(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inactivate");
        }
    }

    void activate(String str, boolean z);

    void addPlayTaskStateListener(PlayTaskStateListener playTaskStateListener);

    void clearPlayTaskStateListener();

    PlayList getPlayList();

    int getPlayMode();

    boolean getRandomPlaylist();

    byte[] getTapeInfo();

    /* renamed from: id */
    String mo176232id();

    void inactivate(String str, boolean z);

    void loadItem(int i);

    void next();

    void pause();

    void play(int i);

    int playingIndex();

    byte[] playingItem();

    void prev();

    void removePlayTaskStateListener(PlayTaskStateListener playTaskStateListener);

    void restorePlayListInfo();

    void resume();

    void seek(long j);

    void setAudioFocus(AudioFocus audioFocus);

    void setPlayMode(int i);

    void setPlayRate(float f);

    void setPlayer(Player player);

    void setRandomPlaylist(boolean z);

    void stop();
}
