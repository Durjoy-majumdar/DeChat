package com.tencent.thumbplayer.adapter.player;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.log.TPLoggerContext;
import java.util.List;
import java.util.Map;

public interface ITPPlayerBase {
    void addAudioTrackSource(String str, String str2, List<TPOptionalParam> list);

    void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list);

    void addSubtitleSource(String str, String str2, String str3);

    void addSubtitleSource(String str, Map<String, String> map, String str2, String str3);

    void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack);

    void deselectTrack(int i, long j);

    long getCurrentPositionMs();

    long getDemuxerOffsetInFile();

    long getDurationMs();

    TPDynamicStatisticParams getDynamicStatisticParams(boolean z);

    TPGeneralPlayFlowParams getGeneralPlayFlowParams();

    long getPlayableDurationMs();

    TPProgramInfo[] getProgramInfo();

    long getPropertyLong(int i);

    String getPropertyString(int i);

    TPTrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoWidth();

    void pause();

    void prepare();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i);

    void seekTo(int i, @TPCommonEnum.TPSeekMode int i2);

    void selectProgram(int i, long j);

    void selectTrack(int i, long j);

    void setAudioGainRatio(float f);

    void setAudioNormalizeVolumeParams(String str);

    void setDataSource(AssetFileDescriptor assetFileDescriptor);

    void setDataSource(ParcelFileDescriptor parcelFileDescriptor);

    void setDataSource(ITPMediaAsset iTPMediaAsset);

    void setDataSource(String str);

    void setDataSource(String str, Map<String, String> map);

    void setLoopback(boolean z);

    void setLoopback(boolean z, long j, long j2);

    void setOnAudioPcmOutputListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener);

    void setOnAudioProcessOutputListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener);

    void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener);

    void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener);

    void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener);

    void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener);

    void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener);

    void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener);

    void setOnPreparedListener(ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener);

    void setOnSeekCompleteListener(ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener);

    void setOnSubtitleDataListener(ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener);

    void setOnSubtitleFrameOutListener(ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener);

    void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener);

    void setOnVideoProcessOutputListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener);

    void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener);

    void setOutputMute(boolean z);

    void setPlaySharpenSwitch();

    void setPlaySpeedRatio(float f);

    void setPlayerOptionalParam(TPOptionalParam tPOptionalParam);

    void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i);

    void setSurfaceHolder(SurfaceHolder surfaceHolder);

    void start();

    void stop();

    void switchDefinition(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i, long j);

    void switchDefinition(String str, @TPCommonEnum.TPSwitchDefMode int i, long j);

    void switchDefinition(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i, long j);

    void updateLoggerContext(TPLoggerContext tPLoggerContext);
}
