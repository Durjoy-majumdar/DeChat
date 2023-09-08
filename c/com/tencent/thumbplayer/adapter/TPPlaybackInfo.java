package com.tencent.thumbplayer.adapter;

import android.text.TextUtils;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.HashMap;

public class TPPlaybackInfo {
    private static String TAG = "TPPlaybackInfo";
    private long audioBitRate;
    private String audioCodec;
    private int audioProfile;
    private int channels;
    private String containerFormat;
    private int currentPlayClipNo;
    private long currentPositionMs;
    private String definition;
    private long demuxerOffset = -1;
    private long durationMs;
    private long height;
    private long playableDurationMs;
    private long sampleRate;
    private long videoBitRate;
    private String videoCodec;
    private int videoCodedId;
    private int videoColorSpace;
    private int videoLevel;
    private int videoProfile;
    private long width;

    public static TPPlaybackInfo parseInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return new TPPlaybackInfo();
        }
        String[] split = str.split("\n");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].startsWith("#") && split[i].contains("=")) {
                String[] split2 = split[i].split("=");
                if (split2 == null || split2.length < 2) {
                    String str2 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("parseInfo, ");
                    sb.append((split2 == null || split2.length < 1) ? "param null, " : split2[0]);
                    sb.append("is empty");
                    TPLogUtil.m21897i(str2, sb.toString());
                } else {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        TPPlaybackInfo tPPlaybackInfo = new TPPlaybackInfo();
        if (hashMap.containsKey("ContainerFormat")) {
            tPPlaybackInfo.setContainerFormat((String) hashMap.get("ContainerFormat"));
        }
        if (hashMap.containsKey("VideoCodec")) {
            tPPlaybackInfo.setVideoCodec((String) hashMap.get("VideoCodec"));
        }
        if (hashMap.containsKey("AudioCodec")) {
            tPPlaybackInfo.setAudioCodec((String) hashMap.get("AudioCodec"));
        }
        if (hashMap.containsKey("Width")) {
            tPPlaybackInfo.setWidth(Long.valueOf((String) hashMap.get("Width")).longValue());
        }
        if (hashMap.containsKey("Height")) {
            tPPlaybackInfo.setHeight(Long.valueOf((String) hashMap.get("Height")).longValue());
        }
        if (hashMap.containsKey("VideoBitRate")) {
            tPPlaybackInfo.setVideoBitRate(Long.valueOf((String) hashMap.get("VideoBitRate")).longValue());
        }
        if (hashMap.containsKey("AudioBitRate")) {
            tPPlaybackInfo.setAudioBitRate(Long.valueOf((String) hashMap.get("AudioBitRate")).longValue());
        }
        if (hashMap.containsKey("SampleRate")) {
            tPPlaybackInfo.setSampleRate(Long.valueOf((String) hashMap.get("SampleRate")).longValue());
        }
        if (hashMap.containsKey("Channels")) {
            tPPlaybackInfo.setChannels(Integer.valueOf((String) hashMap.get("Channels")).intValue());
        }
        if (hashMap.containsKey("Definition")) {
            tPPlaybackInfo.setDefinition((String) hashMap.get("Definition"));
        }
        return tPPlaybackInfo;
    }

    public void clear() {
        this.containerFormat = null;
        this.videoCodec = null;
        this.videoProfile = 0;
        this.videoCodedId = 0;
        this.width = 0;
        this.height = 0;
        this.videoBitRate = 0;
        this.audioCodec = null;
        this.audioProfile = 0;
        this.audioBitRate = 0;
        this.channels = 0;
        this.sampleRate = 0;
        this.videoColorSpace = 2;
        this.videoLevel = 0;
        this.currentPositionMs = 0;
        this.durationMs = 0;
        this.playableDurationMs = 0;
        this.currentPlayClipNo = 0;
        this.demuxerOffset = -1;
    }

    public long getAudioBitRate() {
        return this.audioBitRate;
    }

    public String getAudioCodec() {
        return this.audioCodec;
    }

    public int getAudioProfile() {
        return this.audioProfile;
    }

    public int getChannels() {
        return this.channels;
    }

    public String getContainerFormat() {
        return this.containerFormat;
    }

    public int getCurrentPlayClipNo() {
        return this.currentPlayClipNo;
    }

    public long getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    public String getDefinition() {
        return this.definition;
    }

    public long getDemuxerOffset() {
        return this.demuxerOffset;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public long getHeight() {
        return this.height;
    }

    public long getPlayableDurationMs() {
        return this.playableDurationMs;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public long getVideoBitRate() {
        return this.videoBitRate;
    }

    public String getVideoCodec() {
        return this.videoCodec;
    }

    public int getVideoCodedId() {
        return this.videoCodedId;
    }

    public int getVideoColorSpace() {
        return this.videoColorSpace;
    }

    public int getVideoLevel() {
        return this.videoLevel;
    }

    public int getVideoProfile() {
        return this.videoProfile;
    }

    public long getWidth() {
        return this.width;
    }

    public void setAudioBitRate(long j) {
        this.audioBitRate = j;
    }

    public void setAudioCodec(String str) {
        this.audioCodec = str;
    }

    public void setAudioProfile(int i) {
        this.audioProfile = i;
    }

    public void setChannels(int i) {
        this.channels = i;
    }

    public void setContainerFormat(String str) {
        this.containerFormat = str;
    }

    public void setCurrentPlayClipNo(int i) {
        this.currentPlayClipNo = i;
    }

    public void setCurrentPositionMs(long j) {
        this.currentPositionMs = j;
    }

    public void setDefinition(String str) {
        this.definition = str;
    }

    public void setDemuxerOffset(long j) {
        this.demuxerOffset = j;
    }

    public void setDurationMs(long j) {
        this.durationMs = j;
    }

    public void setHeight(long j) {
        this.height = j;
    }

    public void setPlayableDurationMs(long j) {
        this.playableDurationMs = j;
    }

    public void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public void setVideoBitRate(long j) {
        this.videoBitRate = j;
    }

    public void setVideoCodec(String str) {
        this.videoCodec = str;
    }

    public void setVideoCodedId(int i) {
        this.videoCodedId = i;
    }

    public void setVideoColorSpace(int i) {
        this.videoColorSpace = i;
    }

    public void setVideoLevel(int i) {
        this.videoLevel = i;
    }

    public void setVideoProfile(int i) {
        this.videoProfile = i;
    }

    public void setWidth(long j) {
        this.width = j;
    }
}
