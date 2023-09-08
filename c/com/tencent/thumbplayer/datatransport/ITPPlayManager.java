package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import java.util.Map;

public interface ITPPlayManager extends ITPPlayerProxy {
    String getPlayErrorCodeStr();

    ITPPlayerProxyListener getTPPlayerProxyListener();

    boolean hasWaitDefTask();

    boolean isEnable();

    boolean isUseResourceLoader();

    void pauseDownload();

    void playerSwitchDefComplete(long j);

    void release();

    void resumeDownload();

    void setIsUseResourceLoader(boolean z);

    void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener);

    void setPlayListener(ITPPlayListener iTPPlayListener);

    void setPlaySpeedRatio(float f);

    void setPlayerOptionalParam(TPOptionalParam tPOptionalParam);

    void setProxyPlayState(int i);

    void setVideoInfo(TPVideoInfo tPVideoInfo);

    String startDownLoadTrackUrl(int i, String str, TPDownloadParamData tPDownloadParamData);

    TPUrlDataSource startDownloadPlay(String str, Map<String, String> map);

    ITPMediaAsset startDownloadPlayByAsset(ITPMediaAsset iTPMediaAsset);

    void startRemuxer(String str, String str2);

    TPUrlDataSource startSwitchDefTask(long j, String str, TPVideoInfo tPVideoInfo, Map<String, String> map);

    ITPMediaAsset startSwitchDefTaskByAsset(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo);

    void stopDownLoadTrackUrl(String str);

    void stopDownload();

    void stopRemuxer();
}
