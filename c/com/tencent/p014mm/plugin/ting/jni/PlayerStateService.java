package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/PlayerStateService;", "", "", "getPlayerState", "", "getPlayerPosition", "getPlayerDuration", "getPlayerDownloadPercent", "", "getPlayRate", "Lcom/tencent/mm/plugin/ting/jni/PlayerStateClient;", "listener", "Lrx3/b0;", "addPlayerStateClient", "removePlayerStateClient", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.PlayerStateService */
public interface PlayerStateService {
    void addPlayerStateClient(PlayerStateClient playerStateClient);

    float getPlayRate();

    long getPlayerDownloadPercent();

    long getPlayerDuration();

    long getPlayerPosition();

    int getPlayerState();

    void removePlayerStateClient(PlayerStateClient playerStateClient);
}
