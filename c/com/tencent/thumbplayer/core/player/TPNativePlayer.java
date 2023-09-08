package com.tencent.thumbplayer.core.player;

import android.content.Context;
import android.view.Surface;
import com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector;
import com.tencent.thumbplayer.core.common.TPMediaTrackDashFormat;
import com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class TPNativePlayer {
    private Context mContext = null;
    private long mNativeContext;
    private int m_playerID = -1;

    public TPNativePlayer(Context context) {
        this.mContext = context.getApplicationContext();
        TPNativeLibraryLoader.loadLibIfNeeded(context);
        try {
            this.m_playerID = _createPlayer();
            TPHeadsetPluginDetector.init(this.mContext);
            TPAudioPassThroughPluginDetector.init(this.mContext);
            TPScreenRefreshRateDetector.init(this.mContext);
            TPSystemInfo.initAudioBestSettings(this.mContext);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, "Failed to create native player:" + th.getMessage());
            throw new UnsupportedOperationException("Failed to create native player");
        }
    }

    private native int _addAudioTrackSource(String str, String str2);

    private native int _addAudioTrackSourceWithHttpHeader(String str, String str2, Object[] objArr);

    private native int _addInitConfigQueueInt(int i, int i2);

    private native int _addInitConfigQueueString(int i, String str);

    private native int _addSubtitleTrackSource(String str, String str2);

    private native int _addSubtitleTrackSourceWithHttpHeader(String str, String str2, Object[] objArr);

    private native int _applyInitConfig();

    private native int _createPlayer();

    private native int _deselectTrackAsync(int i, long j);

    private native long _getBufferedDurationMs();

    private native long _getBufferedSize();

    private native int _getContainerType(int i);

    private native long _getCurrentPositionMs();

    private native long _getDemuxerOffsetInFile();

    private native long _getDurationMs();

    private native TPDynamicStatisticParams _getDynamicStatisticParams(boolean z);

    private native TPGeneralPlayFlowParams _getGeneralPlayFlowParams();

    private static native Object _getPlayerCoreParams(int i);

    private native int _getPlayerID();

    private native int _getProgramCount();

    private native TPNativePlayerProgramInfo _getProgramInfo(int i);

    private native long _getPropertyLong(int i);

    private native String _getPropertyString(int i);

    private native int _getTrackCount();

    private native TPMediaTrackDashFormat _getTrackDashFormat(int i);

    private native TPNativePlayerHlsTag _getTrackHlsTag(int i);

    private native boolean _getTrackIsExclusive(int i);

    private native boolean _getTrackIsInternal(int i);

    private native boolean _getTrackIsSelected(int i);

    private native String _getTrackName(int i);

    private native int _getTrackType(int i);

    private native int _getVideoHeight();

    private native int _getVideoWidth();

    private native int _pause();

    private native int _prepare();

    private native int _prepareAsync();

    private native int _release();

    private native int _reset();

    private native int _resetInitConfig();

    private native int _resume();

    private native int _seekToAsync(int i, int i2, long j);

    private native int _selectProgramAsync(int i, long j);

    private native int _selectTrackAsync(int i, long j);

    private native int _setAudioFrameCallback(Object obj);

    private native int _setAudioMute(boolean z);

    private native int _setAudioNormalizeVolumeParams(String str);

    private native int _setAudioVolume(float f);

    private native int _setDataSource(String str);

    private native int _setDataSourceFd(int i, long j, long j2);

    private native int _setDataSourceWithHttpHeader(String str, Object[] objArr);

    private native int _setDemuxerCallback(Object obj);

    private native int _setEventRecordCallback(Object obj);

    private native int _setInitConfigBool(int i, boolean z);

    private native int _setInitConfigFloat(int i, float f);

    private native int _setInitConfigInt(int i, int i2);

    private native int _setInitConfigLong(int i, long j);

    private native int _setInitConfigObject(int i, Object obj);

    private native int _setInitConfigString(int i, String str);

    private native int _setLoopback(boolean z, long j, long j2);

    private native int _setMessageCallback(Object obj);

    private native int _setOptionLong(int i, long j, long j2);

    private native int _setOptionObject(int i, Object obj);

    private native int _setPlaySharpenSwitch();

    private native int _setPlaybackRate(float f);

    private native int _setPostProcessFrameCallback(Object obj);

    private native int _setSubtitleFrameCallback(Object obj);

    private native int _setVideoFrameCallback(Object obj);

    private native int _setVideoSurface(Surface surface);

    private native int _setVideoSurfaceWithType(Surface surface, int i);

    private native int _start();

    private native int _stop();

    private native int _switchDefinitionAsync(String str, int i, long j);

    private native int _switchDefinitionAsyncWithHttpHeader(String str, Object[] objArr, int i, long j);

    public int addAudioTrackSource(String str, String str2) {
        try {
            return _addAudioTrackSource(str, str2);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(String str, String str2) {
        try {
            return _addSubtitleTrackSource(str, str2);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int deselectTrackAsync(int i, long j) {
        try {
            return _deselectTrackAsync(i, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public long getBufferedDurationMs() {
        try {
            return _getBufferedDurationMs();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public long getBufferedSize() {
        try {
            return _getBufferedSize();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public long getCurrentPositionMs() {
        try {
            return _getCurrentPositionMs();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public long getDemuxerOffsetInFile() {
        try {
            return _getDemuxerOffsetInFile();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return -1;
        }
    }

    public long getDurationMs() {
        try {
            return _getDurationMs();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        try {
            return _getDynamicStatisticParams(z);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return null;
        }
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        try {
            return _getGeneralPlayFlowParams();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return null;
        }
    }

    public Object getPlayerCoreParams(int i) {
        return null;
    }

    public int getPlayerID() {
        try {
            return _getPlayerID();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public int getProgramCount() {
        try {
            return _getProgramCount();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public TPNativePlayerProgramInfo[] getProgramInfo() {
        try {
            int _getProgramCount = _getProgramCount();
            TPNativePlayerProgramInfo[] tPNativePlayerProgramInfoArr = new TPNativePlayerProgramInfo[_getProgramCount];
            for (int i = 0; i < _getProgramCount; i++) {
                tPNativePlayerProgramInfoArr[i] = _getProgramInfo(i);
            }
            return tPNativePlayerProgramInfoArr;
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return null;
        }
    }

    public long getPropertyLong(int i) {
        try {
            return _getPropertyLong(i);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public String getPropertyString(int i) {
        try {
            return _getPropertyString(i);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return "";
        }
    }

    public TPMediaTrackInfo[] getTrackInfo() {
        try {
            int _getTrackCount = _getTrackCount();
            if (_getTrackCount <= 0) {
                return null;
            }
            TPMediaTrackInfo[] tPMediaTrackInfoArr = new TPMediaTrackInfo[_getTrackCount];
            for (int i = 0; i < _getTrackCount; i++) {
                TPMediaTrackInfo tPMediaTrackInfo = new TPMediaTrackInfo();
                tPMediaTrackInfoArr[i] = tPMediaTrackInfo;
                tPMediaTrackInfo.trackType = _getTrackType(i);
                tPMediaTrackInfoArr[i].contianerType = _getContainerType(i);
                tPMediaTrackInfoArr[i].trackName = _getTrackName(i);
                tPMediaTrackInfoArr[i].isSelected = _getTrackIsSelected(i);
                tPMediaTrackInfoArr[i].isExclusive = _getTrackIsExclusive(i);
                tPMediaTrackInfoArr[i].isInternal = _getTrackIsInternal(i);
                TPMediaTrackInfo tPMediaTrackInfo2 = tPMediaTrackInfoArr[i];
                int i2 = tPMediaTrackInfo2.contianerType;
                if (i2 == 1) {
                    TPNativePlayerHlsTag _getTrackHlsTag = _getTrackHlsTag(i);
                    TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfoArr[i].hlsTag;
                    tPMediaTrackHlsTag.name = _getTrackHlsTag.name;
                    tPMediaTrackHlsTag.language = _getTrackHlsTag.language;
                    tPMediaTrackHlsTag.groupId = _getTrackHlsTag.groupId;
                    tPMediaTrackHlsTag.resolution = _getTrackHlsTag.resolution;
                    tPMediaTrackHlsTag.codecs = _getTrackHlsTag.codecs;
                    tPMediaTrackHlsTag.framerate = _getTrackHlsTag.framerate;
                    tPMediaTrackHlsTag.bandwidth = _getTrackHlsTag.bandwidth;
                } else if (i2 == 2) {
                    tPMediaTrackInfo2.dashFormat = _getTrackDashFormat(i);
                }
            }
            return tPMediaTrackInfoArr;
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return null;
        }
    }

    public int getVideoHeight() {
        try {
            return _getVideoHeight();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public int getVideoWidth() {
        try {
            return _getVideoWidth();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return 0;
        }
    }

    public int pause() {
        try {
            return _pause();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int prepare() {
        try {
            return _prepare();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int prepareAsync() {
        try {
            return _prepareAsync();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public void release() {
        try {
            _release();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void reset() {
        try {
            _reset();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public int seekToAsync(int i, int i2, long j) {
        try {
            return _seekToAsync(i, i2, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int selectProgramAsync(int i, long j) {
        try {
            return _selectProgramAsync(i, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int selectTrackAsync(int i, long j) {
        try {
            return _selectTrackAsync(i, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioFrameCallback(ITPNativePlayerAudioFrameCallback iTPNativePlayerAudioFrameCallback) {
        try {
            return _setAudioFrameCallback(iTPNativePlayerAudioFrameCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioMute(boolean z) {
        try {
            return _setAudioMute(z);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioNormalizeVolumeParams(String str) {
        try {
            return _setAudioNormalizeVolumeParams(str);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setAudioVolume(float f) {
        try {
            return _setAudioVolume(f);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(String str) {
        try {
            return _setDataSource(str);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDemuxerCallback(ITPNativeDemuxerCallback iTPNativeDemuxerCallback) {
        try {
            return _setDemuxerCallback(iTPNativeDemuxerCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setEventRecordCallback(ITPNativePlayerEventRecordCallback iTPNativePlayerEventRecordCallback) {
        try {
            return _setEventRecordCallback(iTPNativePlayerEventRecordCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public void setInitConfig(TPNativePlayerInitConfig tPNativePlayerInitConfig) {
        try {
            _resetInitConfig();
            HashMap<Integer, Integer> intMap = tPNativePlayerInitConfig.getIntMap();
            HashMap<Integer, String> stringMap = tPNativePlayerInitConfig.getStringMap();
            HashMap<Integer, Long> longMap = tPNativePlayerInitConfig.getLongMap();
            HashMap<Integer, Float> floatMap = tPNativePlayerInitConfig.getFloatMap();
            HashMap<Integer, Boolean> boolMap = tPNativePlayerInitConfig.getBoolMap();
            HashMap<Integer, Vector<Integer>> queueIntMap = tPNativePlayerInitConfig.getQueueIntMap();
            HashMap<Integer, Object> objectMap = tPNativePlayerInitConfig.getObjectMap();
            for (Map.Entry next : intMap.entrySet()) {
                _setInitConfigInt(((Integer) next.getKey()).intValue(), ((Integer) next.getValue()).intValue());
            }
            for (Map.Entry next2 : stringMap.entrySet()) {
                _setInitConfigString(((Integer) next2.getKey()).intValue(), (String) next2.getValue());
            }
            for (Map.Entry next3 : longMap.entrySet()) {
                _setInitConfigLong(((Integer) next3.getKey()).intValue(), ((Long) next3.getValue()).longValue());
            }
            for (Map.Entry next4 : floatMap.entrySet()) {
                _setInitConfigFloat(((Integer) next4.getKey()).intValue(), ((Float) next4.getValue()).floatValue());
            }
            for (Map.Entry next5 : boolMap.entrySet()) {
                _setInitConfigBool(((Integer) next5.getKey()).intValue(), ((Boolean) next5.getValue()).booleanValue());
            }
            for (Map.Entry next6 : objectMap.entrySet()) {
                _setInitConfigObject(((Integer) next6.getKey()).intValue(), next6.getValue());
            }
            for (Map.Entry next7 : queueIntMap.entrySet()) {
                Vector vector = (Vector) next7.getValue();
                if (vector != null) {
                    Iterator it = vector.iterator();
                    while (it.hasNext()) {
                        _addInitConfigQueueInt(((Integer) next7.getKey()).intValue(), ((Integer) it.next()).intValue());
                    }
                }
            }
            for (Map.Entry next8 : tPNativePlayerInitConfig.getQueueStringMap().entrySet()) {
                Vector vector2 = (Vector) next8.getValue();
                if (vector2 != null) {
                    Iterator it4 = vector2.iterator();
                    while (it4.hasNext()) {
                        _addInitConfigQueueString(((Integer) next8.getKey()).intValue(), (String) it4.next());
                    }
                }
            }
            _applyInitConfig();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public int setLoopback(boolean z, long j, long j2) {
        try {
            return _setLoopback(z, j, j2);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setMessageCallback(ITPNativePlayerMessageCallback iTPNativePlayerMessageCallback) {
        try {
            return _setMessageCallback(iTPNativePlayerMessageCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setOptionLong(int i, long j, long j2) {
        try {
            return _setOptionLong(i, j, j2);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setOptionObject(int i, Object obj) {
        try {
            return _setOptionObject(i, obj);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setPlaySharpenSwitch() {
        try {
            return _setPlaySharpenSwitch();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setPlaybackRate(float f) {
        try {
            return _setPlaybackRate(f);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setPostProcessFrameCallback(ITPNativePlayerPostProcessFrameCallback iTPNativePlayerPostProcessFrameCallback) {
        try {
            return _setPostProcessFrameCallback(iTPNativePlayerPostProcessFrameCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setSubtitleFrameCallback(ITPNativePlayerSubtitleFrameCallback iTPNativePlayerSubtitleFrameCallback) {
        try {
            return _setSubtitleFrameCallback(iTPNativePlayerSubtitleFrameCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoFrameCallback(ITPNativePlayerVideoFrameCallback iTPNativePlayerVideoFrameCallback) {
        try {
            return _setVideoFrameCallback(iTPNativePlayerVideoFrameCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoSurface(Surface surface) {
        try {
            return _setVideoSurface(surface);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setVideoSurfaceWithType(Surface surface, int i) {
        try {
            return _setVideoSurfaceWithType(surface, i);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int start() {
        try {
            return _start();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int stop() {
        try {
            return _stop();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    @Deprecated
    public int switchDefinitionAsync(String str, long j) {
        return switchDefinitionAsync(str, 0, j);
    }

    public int switchDefinitionAsync(String str, int i, long j) {
        try {
            return _switchDefinitionAsync(str, i, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addAudioTrackSource(String str, String str2, Map<String, String> map) {
        try {
            return _addAudioTrackSourceWithHttpHeader(str, str2, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int addSubtitleTrackSource(String str, String str2, Map<String, String> map) {
        try {
            return _addSubtitleTrackSourceWithHttpHeader(str, str2, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(String str, Map<String, String> map) {
        try {
            return _setDataSourceWithHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(map));
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int switchDefinitionAsync(String str, Map<String, String> map, int i, long j) {
        try {
            return _switchDefinitionAsyncWithHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(map), i, j);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }

    public int setDataSource(int i, long j, long j2) {
        try {
            return _setDataSourceFd(i, j, j2);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return TPGeneralError.FAILED;
        }
    }
}
