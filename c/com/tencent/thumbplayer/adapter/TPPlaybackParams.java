package com.tencent.thumbplayer.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TPPlaybackParams {
    private static final String TAG = "TPPlaybackParams";
    private float mAudioGainRatio;
    private String mAudioNormalizeVolumeParams;
    private Map<String, AudioTrackAttribute> mAudioTrackSources = new HashMap(0);
    private TPPlayerDataSource mDataSource = new TPPlayerDataSource();
    private LoopbackAttribute mLoopback;
    private Map<Integer, TPOptionalParam> mOptionalParams = new HashMap(0);
    private boolean mOutputMute;
    private ArrayList<SelectTrackAttribute> mSelectTrackAttributes = new ArrayList<>();
    private float mSpeedRatio;
    private Map<String, SubtitleAttribute> mSubtitleSources = new HashMap(0);
    private Object mSurfaceObj;
    private int mSurfaceType = 0;
    private TPProgramInfo mTpProgramInfo;
    private Map<Integer, TPTrackInfo> mTpSelectedTypeTrackInfoMap = new HashMap(0);
    private ArrayList<TPTrackInfo> mTpTrackInfoList = new ArrayList<>();
    private int trackId = -1;

    public static class AudioTrackAttribute {
        public List<TPOptionalParam> audioTrackParams;
        public Map<String, String> httpHeader;
        public String name;
        public String url;
    }

    public static class LoopbackAttribute {
        public long endPositionMs;
        public boolean isLoopback;
        public long startPositionMs;
    }

    public static class SelectTrackAttribute {
        public long opaque;
        public int trackIndex;
        public TPTrackInfo trackInfo;
    }

    public static class SubtitleAttribute {
        public Map<String, String> httpHeader;
        public String mimeType;
        public String name;
        public String url;
    }

    private void generateTrackInfoBySubtitleSource(String str, String str2, String str3) {
        this.trackId++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 3;
        tPTrackInfo.name = str3;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.mTpTrackInfoList.add(tPTrackInfo);
    }

    private void generateTrackInfoByTrackSource(String str, String str2) {
        this.trackId++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 2;
        tPTrackInfo.name = str2;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.mTpTrackInfoList.add(tPTrackInfo);
    }

    public void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            AudioTrackAttribute audioTrackAttribute = new AudioTrackAttribute();
            audioTrackAttribute.url = str;
            audioTrackAttribute.httpHeader = map;
            audioTrackAttribute.name = str2;
            audioTrackAttribute.audioTrackParams = list;
            this.mAudioTrackSources.put(str, audioTrackAttribute);
            generateTrackInfoByTrackSource(str, str2);
        }
    }

    public void addOptionalParams(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam != null) {
            this.mOptionalParams.put(Integer.valueOf(tPOptionalParam.getKey()), tPOptionalParam);
        }
    }

    public void addSelectedTrackInfo(int i, long j, TPTrackInfo tPTrackInfo) {
        this.mTpSelectedTypeTrackInfoMap.put(Integer.valueOf(tPTrackInfo.getTrackType()), tPTrackInfo);
        if (i < 0 || i >= this.mTpTrackInfoList.size()) {
            TPLogUtil.m21899w(TAG, "track Index:" + i + " is invalid, trackInfoList size:" + this.mTpTrackInfoList.size());
            return;
        }
        SelectTrackAttribute selectTrackAttribute = new SelectTrackAttribute();
        selectTrackAttribute.trackIndex = i;
        selectTrackAttribute.opaque = j;
        Iterator<TPTrackInfo> it = this.mTpTrackInfoList.iterator();
        while (it.hasNext()) {
            TPTrackInfo next = it.next();
            if (next.trackType == tPTrackInfo.trackType) {
                if ((!TextUtils.isEmpty(next.name) || !TextUtils.isEmpty(tPTrackInfo.name)) && !next.name.equals(tPTrackInfo.name)) {
                    next.isSelected = false;
                } else {
                    next.isSelected = true;
                    selectTrackAttribute.trackInfo = next;
                }
            }
        }
        this.mSelectTrackAttributes.add(selectTrackAttribute);
    }

    public void addSubtitleSource(String str, Map<String, String> map, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            SubtitleAttribute subtitleAttribute = new SubtitleAttribute();
            subtitleAttribute.url = str;
            subtitleAttribute.httpHeader = map;
            subtitleAttribute.mimeType = str2;
            subtitleAttribute.name = str3;
            this.mSubtitleSources.put(str, subtitleAttribute);
            generateTrackInfoBySubtitleSource(str, str2, str3);
        }
    }

    public float audioGainRatio() {
        return this.mAudioGainRatio;
    }

    public String audioNormalizeVolumeParams() {
        return this.mAudioNormalizeVolumeParams;
    }

    public List<AudioTrackAttribute> audioTrackSources() {
        ArrayList arrayList = new ArrayList(this.mAudioTrackSources.size());
        for (Map.Entry<String, AudioTrackAttribute> value : this.mAudioTrackSources.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    public TPPlayerDataSource dataSource() {
        return this.mDataSource;
    }

    public TPOptionalParam getOptionalParam(int i) {
        return this.mOptionalParams.get(Integer.valueOf(i));
    }

    public TPProgramInfo getSelectProgramInfo() {
        return this.mTpProgramInfo;
    }

    public ArrayList<SelectTrackAttribute> getSelectTrackAttributes() {
        return this.mSelectTrackAttributes;
    }

    public TPTrackInfo getTrackInfoByType(int i) {
        return this.mTpSelectedTypeTrackInfoMap.get(Integer.valueOf(i));
    }

    public ArrayList<TPTrackInfo> getTrackInfos() {
        return this.mTpTrackInfoList;
    }

    public LoopbackAttribute loopback() {
        return this.mLoopback;
    }

    public List<TPOptionalParam> optionalParams() {
        ArrayList arrayList = new ArrayList(this.mOptionalParams.size());
        for (Map.Entry<Integer, TPOptionalParam> value : this.mOptionalParams.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    public boolean outputMute() {
        return this.mOutputMute;
    }

    public void reset() {
        this.mSubtitleSources.clear();
        this.mAudioTrackSources.clear();
        this.mOutputMute = false;
        this.mAudioGainRatio = 1.0f;
        this.mAudioNormalizeVolumeParams = "";
        this.mSpeedRatio = 1.0f;
        this.mTpSelectedTypeTrackInfoMap.clear();
        this.mSurfaceObj = null;
        this.mSurfaceType = 0;
        this.mOptionalParams.clear();
        this.mDataSource = new TPPlayerDataSource();
        this.mLoopback = null;
        this.mTpProgramInfo = null;
        this.trackId = -1;
        this.mTpTrackInfoList.clear();
        this.mSelectTrackAttributes.clear();
    }

    public void setAudioGainRatio(float f) {
        this.mAudioGainRatio = f;
    }

    public void setAudioNormalizeVolumeParams(String str) {
        this.mAudioNormalizeVolumeParams = str;
    }

    public void setDataSource(String str) {
        this.mDataSource.setUrl(str);
    }

    public void setDeselectTrackInfo(int i, long j, TPTrackInfo tPTrackInfo) {
        TPTrackInfo next;
        this.mTpSelectedTypeTrackInfoMap.remove(Integer.valueOf(tPTrackInfo.getTrackType()));
        if (i < 0 || i >= this.mTpTrackInfoList.size()) {
            TPLogUtil.m21899w(TAG, "track Index:" + i + " is invalid, trackInfoList size:" + this.mTpTrackInfoList.size());
            return;
        }
        Iterator<TPTrackInfo> it = this.mTpTrackInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (next.trackType != tPTrackInfo.trackType || ((!TextUtils.isEmpty(next.name) || !TextUtils.isEmpty(tPTrackInfo.name)) && !next.name.equals(tPTrackInfo.name))) {
            }
        }
        next.isSelected = false;
        Iterator<SelectTrackAttribute> it4 = this.mSelectTrackAttributes.iterator();
        while (it4.hasNext()) {
            SelectTrackAttribute next2 = it4.next();
            TPTrackInfo tPTrackInfo2 = next2.trackInfo;
            if (tPTrackInfo2 != null && tPTrackInfo2.equals(tPTrackInfo)) {
                this.mSelectTrackAttributes.remove(next2);
                return;
            }
        }
    }

    public void setLoopback(boolean z) {
        if (this.mLoopback == null) {
            this.mLoopback = new LoopbackAttribute();
        }
        LoopbackAttribute loopbackAttribute = this.mLoopback;
        loopbackAttribute.isLoopback = z;
        loopbackAttribute.startPositionMs = 0;
        loopbackAttribute.endPositionMs = -1;
    }

    public void setOutputMute(boolean z) {
        this.mOutputMute = z;
    }

    public void setSelectProgramInfo(TPProgramInfo tPProgramInfo) {
        this.mTpProgramInfo = tPProgramInfo;
    }

    public void setSpeedRatio(float f) {
        this.mSpeedRatio = f;
    }

    public void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i) {
        this.mSurfaceObj = surface;
        this.mSurfaceType = this.mSurfaceType;
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.mSurfaceObj = surfaceHolder;
    }

    public float speedRatio() {
        return this.mSpeedRatio;
    }

    public List<SubtitleAttribute> subtitleSources() {
        ArrayList arrayList = new ArrayList(this.mSubtitleSources.size());
        for (Map.Entry<String, SubtitleAttribute> value : this.mSubtitleSources.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    public boolean supportClip() {
        return dataSource() != null && dataSource().getType() == 2;
    }

    public Object surface() {
        return this.mSurfaceObj;
    }

    public int surfaceType() {
        return this.mSurfaceType;
    }

    public boolean validDataSource() {
        TPPlayerDataSource tPPlayerDataSource = this.mDataSource;
        return tPPlayerDataSource != null && tPPlayerDataSource.isValid();
    }

    public void setDataSource(String str, Map<String, String> map) {
        this.mDataSource.setUrl(str);
        this.mDataSource.setHttpHeaders(map);
    }

    public void setDataSource(TPUrlDataSource tPUrlDataSource, Map<String, String> map) {
        this.mDataSource.setTpUrlDataSource(tPUrlDataSource);
        this.mDataSource.setHttpHeaders(map);
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        this.mDataSource.setAssetFileDescriptor(assetFileDescriptor);
    }

    public void setLoopback(boolean z, long j, long j2) {
        if (this.mLoopback == null) {
            this.mLoopback = new LoopbackAttribute();
        }
        LoopbackAttribute loopbackAttribute = this.mLoopback;
        loopbackAttribute.isLoopback = z;
        loopbackAttribute.startPositionMs = j;
        loopbackAttribute.endPositionMs = j2;
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        this.mDataSource.setParcelFileDescriptor(parcelFileDescriptor);
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        this.mDataSource.setMediaClipInfo(iTPMediaAsset);
    }
}
