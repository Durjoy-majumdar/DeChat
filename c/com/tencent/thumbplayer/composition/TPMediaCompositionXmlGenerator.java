package com.tencent.thumbplayer.composition;

import android.util.Xml;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

public class TPMediaCompositionXmlGenerator {
    private static final String TAG = "TPMediaCompositionXmlGenerator";

    private static void appendWithPreferredProperty(XmlSerializer xmlSerializer, ITPMediaAsset iTPMediaAsset) {
        ITPMediaAssetExtraParam extraParam = iTPMediaAsset.getExtraParam();
        if (extraParam != null) {
            appendWithPreferredType(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO);
            appendWithPreferredType(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_SUBTITLE);
            appendWithPreferredType(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO);
        }
    }

    private static void appendWithPreferredType(XmlSerializer xmlSerializer, ITPMediaAssetExtraParam iTPMediaAssetExtraParam, String str) {
        TPMediaAssetOrderedMap tPMediaAssetOrderedMap = (TPMediaAssetOrderedMap) iTPMediaAssetExtraParam.getExtraObject(str);
        if (tPMediaAssetOrderedMap != null) {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(filterXmlIllegalString(tPMediaAssetOrderedMap.getKeyValueStr()));
            xmlSerializer.endTag("", str);
        }
    }

    public static String buildAssetXmlFromComposition(ITPMediaComposition iTPMediaComposition) {
        if (iTPMediaComposition == null) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        List<ITPMediaTrack> allAVTracks = iTPMediaComposition.getAllAVTracks();
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) allAVTracks)) {
            dealWithTrackInfo(newSerializer, allAVTracks, 1, 0);
        } else {
            List<ITPMediaTrack> allVideoTracks = iTPMediaComposition.getAllVideoTracks();
            List<ITPMediaTrack> allAudioTracks = iTPMediaComposition.getAllAudioTracks();
            if (TPCommonUtils.isEmpty((Collection<? extends Object>) allVideoTracks) && TPCommonUtils.isEmpty((Collection<? extends Object>) allAudioTracks)) {
                return "";
            }
            TPMediaComposition tPMediaComposition = (TPMediaComposition) iTPMediaComposition;
            long videoDuration = tPMediaComposition.getVideoDuration();
            dealWithTrackInfo(newSerializer, allVideoTracks, 2, tPMediaComposition.getAudioDuration());
            dealWithTrackInfo(newSerializer, allAudioTracks, 3, videoDuration);
        }
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    private static void buildWithTrackClipWithTags(XmlSerializer xmlSerializer, List<ITPMediaTrackClip> list, String str, String str2) {
        xmlSerializer.startTag("", str);
        xmlSerializer.startTag("", str2);
        for (ITPMediaTrackClip dealWithClipInfo : list) {
            dealWithClipInfo(xmlSerializer, dealWithClipInfo);
        }
        xmlSerializer.endTag("", str2);
        xmlSerializer.endTag("", str);
    }

    public static String buildXmlPathFromAudioClip(ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip == null || iTPMediaTrackClip.getMediaType() != 3) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK);
        dealWithClipInfo(newSerializer, iTPMediaTrackClip);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromDrmAsset(ITPMediaDRMAsset iTPMediaDRMAsset) {
        if (iTPMediaDRMAsset == null) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.text(Integer.toString(0));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.text("0");
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.text(filterXmlIllegalString(iTPMediaDRMAsset.getDrmPlayUrl()));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_TYPE);
        newSerializer.text(String.valueOf(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapDrmType.class, iTPMediaDRMAsset.getDrmType())));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_TYPE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_PROVISION);
        newSerializer.text(filterXmlIllegalString(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PROVISION_URL, "")));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_PROVISION);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_LICENSE);
        newSerializer.text(filterXmlIllegalString(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, "")));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_LICENSE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_USEL1);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_DRM_USEL1, "1"));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_USEL1);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_SAVE_PATH);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_SAVE_PATH, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_SAVE_PATH);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_GUID);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_GUID, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_GUID);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_PLATFORM);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PLATFORM, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_PLATFORM);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_APPVER);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_APPVER, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_APPVER);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_COOKIE);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_COOKIE, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_COOKIE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_LICENSE_STANDARDIZATION);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION, "0"));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_LICENSE_STANDARDIZATION);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_DRM_COMMON_KEY);
        newSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_EXT_X_KEY, ""));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_DRM_COMMON_KEY);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        appendWithPreferredProperty(newSerializer, iTPMediaDRMAsset);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromMediaTrackClip(ITPMediaTrackClip iTPMediaTrackClip, ITPMediaTrackClip iTPMediaTrackClip2) {
        if (iTPMediaTrackClip == null && iTPMediaTrackClip2 == null) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        if (iTPMediaTrackClip != null && iTPMediaTrackClip.getMediaType() == 2) {
            newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS);
            newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK);
            dealWithClipInfo(newSerializer, iTPMediaTrackClip);
            newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK);
            newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS);
        }
        if (iTPMediaTrackClip2 != null && iTPMediaTrackClip2.getMediaType() == 3) {
            newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS);
            newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK);
            dealWithClipInfo(newSerializer, iTPMediaTrackClip2);
            newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK);
            newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS);
        }
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromRtcAsset(ITPMediaRTCAsset iTPMediaRTCAsset) {
        if (iTPMediaRTCAsset == null) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.text(Integer.toString(0));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.text("0");
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.text(filterXmlIllegalString(iTPMediaRTCAsset.getRtcStreamUrl()));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_RTC_SERVER_URL);
        newSerializer.text(filterXmlIllegalString(iTPMediaRTCAsset.getRtcServerUrl()));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_RTC_SERVER_URL);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_RTC_SDP_EXCHANGE_TYPE);
        newSerializer.text(Integer.toString(iTPMediaRTCAsset.getRtcSdpExchangeType()));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_RTC_SDP_EXCHANGE_TYPE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        appendWithPreferredProperty(newSerializer, iTPMediaRTCAsset);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromTrackInfo(List<ITPMediaTrackClip> list, int i) {
        String str;
        String str2;
        if (TPCommonUtils.isEmpty((Collection<? extends Object>) list)) {
            return "";
        }
        if (i == 1) {
            str = TPMediaCompositionHelper.XML_TAG_AV_TRACKS;
            str2 = TPMediaCompositionHelper.XML_TAG_AV_TRACK;
        } else if (i == 2) {
            str = TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS;
            str2 = TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK;
        } else if (i != 3) {
            return "";
        } else {
            str = TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS;
            str2 = TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK;
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        buildWithTrackClipWithTags(newSerializer, list, str, str2);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromUrlAsset(ITPMediaUrlAsset iTPMediaUrlAsset) {
        if (iTPMediaUrlAsset == null) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.text(Integer.toString(0));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.text("0");
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.text(filterXmlIllegalString(iTPMediaUrlAsset.getStreamUrl()));
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        appendWithPreferredProperty(newSerializer, iTPMediaUrlAsset);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_PREFERRED_PROPERTY);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACK);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_AV_TRACKS);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String buildXmlPathFromVideoClip(ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip == null || iTPMediaTrackClip.getMediaType() != 2) {
            return "";
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", Boolean.TRUE);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS);
        newSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK);
        dealWithClipInfo(newSerializer, iTPMediaTrackClip);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS);
        newSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_ASSERT);
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    private static void dealClipWithInterval(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j) {
        if (iTPMediaTrackClip instanceof TPEmptyTrackClip) {
            dealEmptyTrackClip(xmlSerializer, iTPMediaTrackClip, j);
        } else if (iTPMediaTrackClip instanceof TPMediaCompositionTrackClip) {
            dealNormalTrackClip(xmlSerializer, iTPMediaTrackClip, j);
        }
    }

    private static void dealEmptyTrackClip(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j) {
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        xmlSerializer.text("1");
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
        if (j > 0) {
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs() - j));
        } else {
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        }
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
    }

    private static void dealNormalTrackClip(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j) {
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_ID);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        xmlSerializer.text("0");
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLACE_HOLDER);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        xmlSerializer.text(filterXmlIllegalString(iTPMediaTrackClip.getFilePath()));
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PATH);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_START_TIME);
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getStartTimeMs()));
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_START_TIME);
        xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_DURATION);
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_DURATION);
        if (j > 0) {
            xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_END_TIME);
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getEndTimeMs() - j));
            xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_END_TIME);
            xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs() - j));
            xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
        } else {
            xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_END_TIME);
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getEndTimeMs()));
            xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_END_TIME);
            xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
            xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_CLIP_PLAY_TIME);
        }
        xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_CLIP);
    }

    private static void dealWithClipInfo(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip) {
        dealClipWithInterval(xmlSerializer, iTPMediaTrackClip, 0);
    }

    private static void dealWithTrackInfo(XmlSerializer xmlSerializer, List<ITPMediaTrack> list, int i, long j) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    String trackTagWithMediaType = getTrackTagWithMediaType(i, true);
                    String trackTagWithMediaType2 = getTrackTagWithMediaType(i, false);
                    xmlSerializer.startTag("", trackTagWithMediaType);
                    for (ITPMediaTrack next : list) {
                        if (next.getMediaType() == i) {
                            xmlSerializer.startTag("", trackTagWithMediaType2);
                            xmlSerializer.startTag("", TPMediaCompositionHelper.XML_TAG_TRACK_ID);
                            xmlSerializer.text(Integer.toString(next.getTrackId()));
                            xmlSerializer.endTag("", TPMediaCompositionHelper.XML_TAG_TRACK_ID);
                            if (i != 1 && TPMediaCompositionHelper.composition_duration_strategy.equals("base_audio") && next.getTimelineDurationMs() > j) {
                                long j2 = 0;
                                Iterator<ITPMediaTrackClip> it = next.getAllTrackClips().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    ITPMediaTrackClip next2 = it.next();
                                    j2 += next2.getOriginalDurationMs();
                                    if (j2 > j) {
                                        dealClipWithInterval(xmlSerializer, next2, j2 - j);
                                        break;
                                    }
                                    dealWithClipInfo(xmlSerializer, next2);
                                }
                            } else {
                                for (ITPMediaTrackClip dealWithClipInfo : next.getAllTrackClips()) {
                                    dealWithClipInfo(xmlSerializer, dealWithClipInfo);
                                }
                            }
                            xmlSerializer.endTag("", trackTagWithMediaType2);
                        }
                    }
                    xmlSerializer.endTag("", trackTagWithMediaType);
                }
            } catch (IOException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    private static String filterXmlIllegalString(String str) {
        return str.replaceAll("[^\t\r\n -퟿-�𐀀-􏿿]+", "");
    }

    private static String getTrackTagWithMediaType(int i, boolean z) {
        return i == 1 ? z ? TPMediaCompositionHelper.XML_TAG_AV_TRACKS : TPMediaCompositionHelper.XML_TAG_AV_TRACK : i == 2 ? z ? TPMediaCompositionHelper.XML_TAG_VIDEO_TRACKS : TPMediaCompositionHelper.XML_TAG_VIDEO_TRACK : i == 3 ? z ? TPMediaCompositionHelper.XML_TAG_AUDIO_TRACKS : TPMediaCompositionHelper.XML_TAG_AUDIO_TRACK : "";
    }
}
