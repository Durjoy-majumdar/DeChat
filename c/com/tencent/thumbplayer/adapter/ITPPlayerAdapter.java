package com.tencent.thumbplayer.adapter;

import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import java.util.Map;

public interface ITPPlayerAdapter extends ITPPlayerBase {
    int getCurrentPlayClipNo();

    int getCurrentState();

    TPPlaybackInfo getPlaybackInfo();

    int getPlayerType();

    boolean isPlaying();

    void reopenPlayer();

    void setDataSource(TPUrlDataSource tPUrlDataSource);

    void setDataSource(TPUrlDataSource tPUrlDataSource, Map<String, String> map);

    void setOnPlayerStateChangeListener(ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener);

    void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    void setVideoInfo(TPVideoInfo tPVideoInfo);

    void switchDefinition(TPUrlDataSource tPUrlDataSource, int i, long j);

    void switchDefinition(TPUrlDataSource tPUrlDataSource, Map<String, String> map, int i, long j);

    void updateVideoInfo(TPVideoInfo tPVideoInfo);
}
