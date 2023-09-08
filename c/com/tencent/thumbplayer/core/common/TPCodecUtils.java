package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.tencent.thumbplayer.core.common.TPCodecCapability;
import com.tencent.thumbplayer.core.common.TPMediaDecoderInfo;
import com.tencent.thumbplayer.core.thirdparties.LocalCache;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TPCodecUtils {
    public static final int CAP_AUDIO_AAC = 8;
    public static final int CAP_AUDIO_DD = 16;
    public static final int CAP_AUDIO_DDP = 32;
    public static final int CAP_AUDIO_DTS = 128;
    public static final int CAP_AUDIO_FLAC = 64;
    public static final int CAP_VIDEO_AVC = 1;
    public static final int CAP_VIDEO_HEVC = 2;
    public static final int CAP_VIDEO_VP8 = 256;
    public static final int CAP_VIDEO_VP9 = 4;
    public static final int PLAYER_LEVEL_0 = 0;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_28 = 28;
    public static final int PLAYER_LEVEL_33 = 33;
    public static final int PLAYER_LEVEL_6 = 6;
    public static final int PLAYER_LEVEL_UNKNOWN = -1;
    private static final String TAG = "TPCodecUtils";
    private static final String VVC_SHD_HISI_CPU_NAME = "Kirin9000E";
    private static final String VVC_SHD_MTK_CPU_NAME = "MT6893";
    private static final String VVC_SHD_QUALCOMMN_CPU_NAME = "SM8250";
    private static final String VVC_SHD_SAMSUNG_CPU_NAME = "Exynos2100";
    private static int mAACMaxSupportedBitrate = 510000;
    private static int mAACMaxSupportedChannels = 8;
    private static int mAACMaxSupportedSamplerate = 96000;
    private static ArrayList<String> mAMediaCodecBlackListInstance = new ArrayList<>();
    private static ArrayList<String> mAMediaCodecBlackListModel = new ArrayList<>();
    public static ArrayList<String> mAMediaCodecCapList = new ArrayList<>();
    private static TPCodecCapability.TPCodecMaxCapability mAV1SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static TPCodecCapability.TPCodecMaxCapability mAVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static TPCodecCapability.TPCodecMaxCapability mAVS3WMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static HashMap<String, String> mAudioMaxCapCodecInstance = new HashMap<>();
    private static int mAvs3DeviceLevel = -1;
    private static ArrayList<String> mBlackListModel = new ArrayList<>();
    private static HashMap<String, Integer> mCodecCapBlackList = null;
    private static HashMap<String, Integer> mCodecCapWhiteList = null;
    private static Context mContext = null;
    private static int mDDPMaxSupportedBitrate = 6144000;
    private static int mDDPMaxSupportedChannels = 8;
    private static int mDDPMaxSupportedSamplerate = 48000;
    private static HashMap<DefinitionName, Integer> mDefinitionNameToDecodeLevelTable = new HashMap<>();
    private static HashMap<Integer, ArrayList<String>> mDrmL1BlackList = new HashMap<>();
    private static int mFLACMaxSupportedBitrate = 21000000;
    private static int mFLACMaxSupportedChannels = 8;
    private static int mFLACMaxSupportedSamplerate = 192000;
    private static int mFhdAvs3HisiIndex = 14;
    private static int mFhdAvs3QualcommIndex = 58;
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRHardwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRSoftwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> mHDRVividSupportVersionMap = new HashMap<>();
    private static TPCodecCapability.TPCodecMaxCapability mHEVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static int mHdHevcHisiIndex = 3;
    private static int mHdHevcMtkIndex = 8;
    private static int mHdHevcQualcommIndex = 20;
    private static int mHdHevcSamsungIndex = 5;
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrBlackMap = new HashMap<>();
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrWhiteMap = new HashMap<>();
    private static int mHevcDeviceLevel = -1;
    private static boolean mIsFFmpegCapGot = false;
    /* access modifiers changed from: private */
    public static boolean mIsInitDone = false;
    private static LocalCache mLocalCache = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecHwCapabilityMap = new HashMap<>();
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecSwCapabilityMap = new HashMap<>();
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecHwCapabilityMap = new HashMap<>();
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecSwCapabilityMap = new HashMap<>();
    private static boolean mPreferredSoftwareComponent = false;
    private static int mShdAvs3QualcommIndex = 55;
    private static int mShdHevcHisiIndex = 8;
    private static int mShdHevcMtkIndex = 12;
    private static int mShdHevcQualcommIndex = 32;
    private static int mShdHevcSamsungIndex = 8;
    private static ArrayList<String> mSupportedHWCodec = new ArrayList<>();
    private static ArrayList<String> mSupportedMediaCodec = new ArrayList<>();
    private static ArrayList<String> mVMediaCodecBlackListModel = new ArrayList<>();
    public static ArrayList<String> mVMediaCodecCapList = new ArrayList<>();
    private static TPCodecCapability.TPCodecMaxCapability mVP8SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static TPCodecCapability.TPCodecMaxCapability mVP9SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static TPCodecCapability.TPCodecMaxCapability mVVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
    private static SparseArray<VideoSwCapabilityModel> mVideoCodecIdToSwCapabilityModel = new SparseArray<>();
    private static int mVvcDeviceLevel = -1;
    private static ArrayList<String> mWideVineBlackListModel = new ArrayList<>();

    public enum DefinitionName {
        DEFINITION_720P
    }

    public static class VideoSwCapabilityModel {
        public SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecTable;

        public static class Builder {
            private SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecCapabilities = new SparseArray<>();

            public Builder addVideoDecCap(int i, DefinitionName definitionName, String str) {
                HashMap hashMap = this.mCpuProducerToAllDefinitionDecCapabilities.get(i);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.mCpuProducerToAllDefinitionDecCapabilities.put(i, hashMap);
                }
                hashMap.put(definitionName, str);
                return this;
            }

            public VideoSwCapabilityModel build() {
                VideoSwCapabilityModel videoSwCapabilityModel = new VideoSwCapabilityModel();
                videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable = this.mCpuProducerToAllDefinitionDecCapabilities;
                return videoSwCapabilityModel;
            }
        }

        private VideoSwCapabilityModel() {
            this.mCpuProducerToAllDefinitionDecTable = new SparseArray<>();
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        mCodecCapWhiteList = hashMap;
        hashMap.put("NX511J", 11);
        mCodecCapWhiteList.put("Hi3798MV100", 11);
        mCodecCapWhiteList.put("长虹智能电视", 11);
        mCodecCapWhiteList.put("Android TV on Tcl 901", 11);
        mCodecCapWhiteList.put("xt880b", 11);
        TPNativeLog.printLog(2, TAG, "white list init");
        mSupportedMediaCodec.add("video/avc");
        mSupportedMediaCodec.add("video/hevc");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp8");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp9");
        mSupportedMediaCodec.add("video/av01");
        mSupportedMediaCodec.add("audio/mp4a-latm");
        mSupportedMediaCodec.add(MimeTypes.AUDIO_AC3);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_E_AC3);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_E_AC3_JOC);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_FLAC);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_DTS);
        mAMediaCodecBlackListInstance.add("OMX.qti.audio.decoder.flac");
        mVMediaCodecBlackListModel.add("SM-J7008");
        mVMediaCodecBlackListModel.add("SM-J5008");
        mVMediaCodecBlackListModel.add("TCL i806");
        mVMediaCodecBlackListModel.add("NX511J");
        mVMediaCodecBlackListModel.add("vivo Y11i T");
        mVMediaCodecBlackListModel.add("长虹智能电视");
        mVMediaCodecBlackListModel.add("MI 1S");
        mVMediaCodecBlackListModel.add("SP9832A");
        mVMediaCodecBlackListModel.add("SP9830A");
        mVMediaCodecBlackListModel.add("VOTO GT17");
        mVMediaCodecBlackListModel.add("EVA-AL10");
        mHDRVividSupportVersionMap.put("TAS-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00P", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00m", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100166, 99, 3));
        mHDRVividSupportVersionMap.put("BAL-AL60", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("CET-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("DCO-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("CET-AL60", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("MRX-AL09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AL19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AN19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W39", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("OCE-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-NX9", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN01", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOP-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL60", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550X", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550AX", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("PLAT-760", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200172, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-359", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-369", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-580", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("FREG-770", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-220", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-270", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200547, 99, 0));
        mHDRVividSupportVersionMap.put("SOKR-790A", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("VOLT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("SDY-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HPB-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mWideVineBlackListModel.add("RVL-AL09");
        mWideVineBlackListModel.add("CLT-L29");
        mWideVineBlackListModel.add("ASUS_Z00AD");
        mWideVineBlackListModel.add(TPSystemInfo.getDeviceName());
        mDrmL1BlackList.put(0, mWideVineBlackListModel);
        SparseArray<VideoSwCapabilityModel> sparseArray = mVideoCodecIdToSwCapabilityModel;
        VideoSwCapabilityModel.Builder builder = new VideoSwCapabilityModel.Builder();
        DefinitionName definitionName = DefinitionName.DEFINITION_720P;
        sparseArray.put(193, builder.addVideoDecCap(0, definitionName, VVC_SHD_QUALCOMMN_CPU_NAME).addVideoDecCap(1, definitionName, VVC_SHD_MTK_CPU_NAME).addVideoDecCap(2, definitionName, VVC_SHD_HISI_CPU_NAME).addVideoDecCap(3, definitionName, VVC_SHD_SAMSUNG_CPU_NAME).build());
        mDefinitionNameToDecodeLevelTable.put(definitionName, 21);
    }

    public static boolean addDRMLevel1Blacklist(int i) {
        if (!mDrmL1BlackList.containsKey(Integer.valueOf(i))) {
            return true;
        }
        ArrayList arrayList = mDrmL1BlackList.get(Integer.valueOf(i));
        if (!arrayList.contains(TPSystemInfo.getDeviceName())) {
            arrayList.add(TPSystemInfo.getDeviceName());
        }
        mDrmL1BlackList.remove(Integer.valueOf(i));
        mDrmL1BlackList.put(Integer.valueOf(i), arrayList);
        return true;
    }

    public static boolean addHDRBlackList(int i, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrBlackMap.containsKey(Integer.valueOf(i))) {
            HashMap hashMap = mHdrBlackMap.get(Integer.valueOf(i));
            mHdrBlackMap.remove(Integer.valueOf(i));
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, tPHdrSupportVersionRange);
            }
            hashMap.remove(str);
            hashMap.put(str, tPHdrSupportVersionRange);
            mHdrBlackMap.put(Integer.valueOf(i), hashMap);
            return true;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str, tPHdrSupportVersionRange);
        mHdrBlackMap.put(Integer.valueOf(i), hashMap2);
        return true;
    }

    private static void addHDRVersionRangeToWhiteList(int i, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> hashMap) {
        ArrayList arrayList = hashMap.containsKey(Integer.valueOf(i)) ? hashMap.get(Integer.valueOf(i)) : new ArrayList();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (!isTheSameVersionRange(tPHdrSupportVersionRange, (TPCodecCapability.TPHdrSupportVersionRange) arrayList.get(i2))) {
                i2++;
            } else {
                return;
            }
        }
        arrayList.add(tPHdrSupportVersionRange);
        hashMap.put(Integer.valueOf(i), arrayList);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i, int i2, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (i2 == 101) {
            addHDRVersionRangeToWhiteList(i, tPHdrSupportVersionRange, mHDRTypeToHDRSoftwareCodecWhiteListMap);
        } else if (i2 != 102) {
            TPNativeLog.printLog(3, TAG, "addHDRVideoDecoderTypeWhiteList, decoder not support.");
            return false;
        } else {
            addHDRVersionRangeToWhiteList(i, tPHdrSupportVersionRange, mHDRTypeToHDRHardwareCodecWhiteListMap);
        }
        return true;
    }

    public static boolean addHDRWhiteList(int i, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrWhiteMap.containsKey(Integer.valueOf(i))) {
            HashMap hashMap = mHdrWhiteMap.get(Integer.valueOf(i));
            mHdrWhiteMap.remove(Integer.valueOf(i));
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, tPHdrSupportVersionRange);
            }
            hashMap.remove(str);
            hashMap.put(str, tPHdrSupportVersionRange);
            mHdrWhiteMap.put(Integer.valueOf(i), hashMap);
            return true;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str, tPHdrSupportVersionRange);
        mHdrWhiteMap.put(Integer.valueOf(i), hashMap2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkHDRVividSupportByVersion(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "."
            r1 = 4
            int[] r2 = new int[r1]
            r2 = {2, 1, 1, 3} // fill-array
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            r4 = 3
            java.lang.String r5 = "TPCodecUtils"
            r6 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = "\\."
            java.lang.String[] r3 = r14.split(r3)
            int r10 = r3.length
            if (r10 != r1) goto L_0x00c1
            r10 = r3[r9]
            java.lang.String r11 = " "
            java.lang.String[] r10 = r10.split(r11)
            int r11 = r10.length
            if (r11 != r7) goto L_0x002f
            r10 = r10[r8]
            if (r10 == 0) goto L_0x002f
            r3[r9] = r10
        L_0x002f:
            r10 = r3[r4]
            java.lang.String r11 = "\\("
            java.lang.String[] r10 = r10.split(r11)
            int r11 = r10.length
            if (r11 != r7) goto L_0x0040
            r10 = r10[r9]
            if (r10 == 0) goto L_0x0040
            r3[r4] = r10
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 >= r1) goto L_0x0055
            r11 = r3[r10]
            if (r11 == 0) goto L_0x0053
            int r11 = r11.length()
            r12 = r2[r10]
            if (r11 == r12) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            int r10 = r10 + 1
            goto L_0x0041
        L_0x0053:
            r2 = 0
            goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            if (r2 == 0) goto L_0x00c1
            int r2 = r14.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0097 }
            if (r2 != r6) goto L_0x0060
            r3 = 0
            goto L_0x0066
        L_0x0060:
            int r3 = r2 + -2
            int r3 = getValueFromSubstring(r14, r3, r2)     // Catch:{ NumberFormatException -> 0x0097 }
        L_0x0066:
            int r2 = r2 + r8
            int r2 = r14.indexOf(r0, r2)     // Catch:{ NumberFormatException -> 0x0094 }
            if (r2 != r6) goto L_0x006f
            r10 = 0
            goto L_0x0075
        L_0x006f:
            int r10 = r2 + -1
            int r10 = getValueFromSubstring(r14, r10, r2)     // Catch:{ NumberFormatException -> 0x0094 }
        L_0x0075:
            int r2 = r2 + r8
            int r0 = r14.indexOf(r0, r2)     // Catch:{ NumberFormatException -> 0x0091 }
            if (r0 != r6) goto L_0x007e
            r2 = 0
            goto L_0x0084
        L_0x007e:
            int r2 = r0 + -1
            int r2 = getValueFromSubstring(r14, r2, r0)     // Catch:{ NumberFormatException -> 0x0091 }
        L_0x0084:
            if (r0 != r6) goto L_0x0087
            goto L_0x00b3
        L_0x0087:
            int r11 = r0 + 1
            int r0 = r0 + r1
            int r14 = getValueFromSubstring(r14, r11, r0)     // Catch:{ NumberFormatException -> 0x008f }
            goto L_0x00b4
        L_0x008f:
            r14 = move-exception
            goto L_0x009b
        L_0x0091:
            r14 = move-exception
            r2 = 0
            goto L_0x009b
        L_0x0094:
            r14 = move-exception
            r2 = 0
            goto L_0x009a
        L_0x0097:
            r14 = move-exception
            r2 = 0
            r3 = 0
        L_0x009a:
            r10 = 0
        L_0x009b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "checkHDRVividSupportByVersion failed(versionValue):"
            r0.append(r11)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r5, r14)
        L_0x00b3:
            r14 = 0
        L_0x00b4:
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 * r0
            int r10 = r10 * 10000
            int r3 = r3 + r10
            int r2 = r2 * 1000
            int r3 = r3 + r2
            int r3 = r3 + r14
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            boolean r14 = android.text.TextUtils.isEmpty(r15)
            if (r14 != 0) goto L_0x0104
            java.lang.String r14 = "patch"
            java.lang.String[] r0 = r15.split(r14)
            int r2 = r0.length
            if (r2 != r7) goto L_0x0104
            r0 = r0[r8]
            if (r0 == 0) goto L_0x0104
            int r0 = r0.length()
            if (r0 != r4) goto L_0x0104
            int r14 = r15.indexOf(r14)     // Catch:{ NumberFormatException -> 0x00eb }
            if (r14 != r6) goto L_0x00e2
            goto L_0x0104
        L_0x00e2:
            int r0 = r14 + 5
            int r14 = r14 + 7
            int r14 = getValueFromSubstring(r15, r0, r14)     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x0105
        L_0x00eb:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkHDRVividSupportByVersion failed(patchValue):"
            r0.append(r2)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r5, r14)
        L_0x0104:
            r14 = 0
        L_0x0105:
            boolean r0 = isInHDRVividWhiteList(r13, r3, r14)
            java.lang.String r1 = " patch:"
            java.lang.String r2 = " version:"
            if (r0 == 0) goto L_0x0130
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "checkHDRVividSupportByVersion in HDRVivid whitelist, model:"
            r14.append(r0)
            r14.append(r13)
            r14.append(r2)
            r14.append(r3)
            r14.append(r1)
            r14.append(r15)
            java.lang.String r13 = r14.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r7, r5, r13)
            return r8
        L_0x0130:
            boolean r0 = isInHDRVividBlackList(r13, r3, r14)
            if (r0 == 0) goto L_0x0157
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "checkHDRVividSupportByVersion in HDRVivid blacklist, model:"
            r14.append(r0)
            r14.append(r13)
            r14.append(r2)
            r14.append(r3)
            r14.append(r1)
            r14.append(r15)
            java.lang.String r13 = r14.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r7, r5, r13)
            return r9
        L_0x0157:
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability$TPHdrSupportVersionRange> r15 = mHDRVividSupportVersionMap
            boolean r15 = r15.containsKey(r13)
            if (r15 == 0) goto L_0x017b
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability$TPHdrSupportVersionRange> r15 = mHDRVividSupportVersionMap
            java.lang.Object r13 = r15.get(r13)
            com.tencent.thumbplayer.core.common.TPCodecCapability$TPHdrSupportVersionRange r13 = (com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange) r13
            int r15 = r13.upperboundSystemVersion
            if (r3 > r15) goto L_0x017b
            int r15 = r13.lowerboundSystemVersion
            if (r3 <= r15) goto L_0x0170
            return r8
        L_0x0170:
            if (r3 != r15) goto L_0x017b
            int r15 = r13.upperboundPatchVersion
            if (r14 > r15) goto L_0x017b
            int r13 = r13.lowerboundPatchVersion
            if (r14 < r13) goto L_0x017b
            return r8
        L_0x017b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.checkHDRVividSupportByVersion(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private static int convertDefinitionNameToDecodeLevel(DefinitionName definitionName) {
        Integer num = mDefinitionNameToDecodeLevelTable.get(definitionName);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static int convertDolbyVisionToOmxLevel(int i) {
        int i2 = 1 << i;
        if (i2 < 1 || i2 > 256) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel Unsupported level" + i);
            return i;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel dolbyVisionLevel:" + i + " omxLevel:" + i2);
        return i2;
    }

    public static int convertDolbyVisionToOmxProfile(int i) {
        int i2 = 1 << i;
        if (i < 1 || i > 512) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile Unsupported profile" + i);
            return i;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile dolbyVisionProfile:" + i + " omxProfile:" + i2);
        return i2;
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getACodecSWMaxCapabilityMap() {
        synchronized (TPCodecUtils.class) {
            TPNativeLog.printLog(2, TAG, "getACodecSWMaxCapabilityMap func in");
            if (!mMaxACodecSwCapabilityMap.isEmpty()) {
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap = mMaxACodecSwCapabilityMap;
                return hashMap;
            }
            try {
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, mAACMaxSupportedSamplerate, mAACMaxSupportedBitrate, mAACMaxSupportedChannels);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mFLACMaxSupportedSamplerate, mFLACMaxSupportedBitrate, mFLACMaxSupportedChannels);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
                mMaxACodecSwCapabilityMap.put(5002, tPCodecMaxCapability);
                mMaxACodecSwCapabilityMap.put(5012, tPCodecMaxCapability2);
                mMaxACodecSwCapabilityMap.put(5003, tPCodecMaxCapability3);
                mMaxACodecSwCapabilityMap.put(5040, tPCodecMaxCapability4);
                TPNativeLog.printLog(2, "getACodecSWMaxCapabilityMap success.");
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap2 = mMaxACodecSwCapabilityMap;
                return hashMap2;
            } catch (Exception unused) {
                TPNativeLog.printLog(4, TAG, "getACodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getAMediaCodecMaxCapabilityMap() {
        synchronized (TPCodecUtils.class) {
            TPNativeLog.printLog(2, TAG, "getAMediaCodecMaxCapabilityMap func in");
            if (!mMaxACodecHwCapabilityMap.isEmpty()) {
                TPNativeLog.printLog(2, TAG, "return memory stored audio max cap map");
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap = mMaxACodecHwCapabilityMap;
                return hashMap;
            }
            try {
                for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                    String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                    if (tPMediaDecoderInfo.isAudio() && isSupportedMediaCodec(decoderMimeType) && !isInMediaCodecBlackList(decoderMimeType) && !isAMediaCodecBlackListInstance(tPMediaDecoderInfo.getDecoderName())) {
                        TPNativeLog.printLog(2, TAG, "Audio MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                        TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getMaxAudioSampleRate(), tPMediaDecoderInfo.getMaxAudioBitRate(), tPMediaDecoderInfo.getMaxAudioChannels());
                        if (!mMaxACodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType)))) {
                            TPNativeLog.printLog(2, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                            mAMediaCodecCapList.add(decoderMimeType);
                        } else if (tPMediaDecoderInfo.getMaxAudioSampleRate() > mMaxACodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxSampleRate || TextUtils.equals(decoderMimeType, MimeTypes.AUDIO_E_AC3_JOC)) {
                            TPNativeLog.printLog(2, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                        }
                    }
                }
            } catch (Exception e) {
                TPNativeLog.printLog(4, TAG, "getAMediaCodecMaxCapabilityMap failed:" + e.getMessage());
            }
            HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap2 = mMaxACodecHwCapabilityMap;
            return hashMap2;
        }
    }

    public static int getAV1SWDecodeLevel() {
        return getDecodeLevelByCoresAndFreq();
    }

    public static boolean getAudioMediaCodecPassThroughCap(int i, int i2, int i3) {
        if (i != 5004) {
            return false;
        }
        int i4 = 1;
        if (i2 == 20) {
            i4 = 7;
        } else if (i2 == 50 || i2 == 60) {
            i4 = 8;
        }
        return TPAudioPassThroughPluginDetector.isAudioPassThroughSupport(i4, i3);
    }

    public static int getAvs3SWDecodeLevel() {
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getAvs3SWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i = mAvs3DeviceLevel;
        if (-1 != i) {
            return i;
        }
        mAvs3DeviceLevel = 0;
        if (-1 == cpuHWProducter) {
            mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
        } else if (cpuHWProducter != 0) {
            if (cpuHWProducter == 1) {
                mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
            } else if (cpuHWProducter != 2) {
                if (cpuHWProducter == 3) {
                    mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
                }
            } else if (cpuHWProductIndex >= mFhdAvs3HisiIndex) {
                mAvs3DeviceLevel = 26;
            } else {
                mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
            }
        } else if (cpuHWProductIndex >= mFhdAvs3QualcommIndex) {
            mAvs3DeviceLevel = 26;
        } else if (cpuHWProductIndex >= mShdAvs3QualcommIndex) {
            mAvs3DeviceLevel = 21;
        } else {
            mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
        }
        return mAvs3DeviceLevel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001d A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getDecodeLevelByCoresAndFreq() {
        /*
            int r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores()
            r1 = 6
            r2 = 21
            r3 = 16
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 8
            if (r0 < r6) goto L_0x0020
            long r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1200(0x4b0, double:5.93E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x001d
        L_0x001a:
            r1 = 21
            goto L_0x0045
        L_0x001d:
            r1 = 16
            goto L_0x0045
        L_0x0020:
            int r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores()
            if (r0 < r1) goto L_0x0032
            long r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1400(0x578, double:6.917E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x001d
            goto L_0x001a
        L_0x0032:
            int r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores()
            r6 = 4
            if (r0 < r6) goto L_0x0045
            long r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1600(0x640, double:7.905E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x001d
            goto L_0x001a
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.getDecodeLevelByCoresAndFreq():int");
    }

    public static synchronized void getDecoderMaxCapabilityMapAsync() {
        synchronized (TPCodecUtils.class) {
            if (mIsInitDone) {
                TPNativeLog.printLog(2, TAG, "decoder capability already init,return directly!");
                return;
            }
            TPNativeLog.printLog(2, TAG, "decoder capability not init,acquire async with create thread!");
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    TPCodecUtils.getVMediaCodecMaxCapabilityMap();
                    TPCodecUtils.getAMediaCodecMaxCapabilityMap();
                    TPCodecUtils.getVCodecSWMaxCapabilityMap();
                    TPCodecUtils.getACodecSWMaxCapabilityMap();
                    boolean unused = TPCodecUtils.mIsInitDone = true;
                    TPNativeLog.printLog(2, TPCodecUtils.TAG, "new thread getDecoderMaxCapabilityMap done");
                }
            });
            thread.setName("TP_codec_init_thread");
            thread.start();
        }
    }

    public static String getDecoderName(String str, boolean z) {
        if (!str.contains("audio")) {
            ArrayList arrayList = new ArrayList();
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z) {
                    TPNativeLog.printLog(2, TAG, "getDecoderName:" + tPMediaDecoderInfo.getDecoderName());
                    arrayList.add(tPMediaDecoderInfo);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TPMediaDecoderInfo tPMediaDecoderInfo2 = (TPMediaDecoderInfo) it.next();
                if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                    return tPMediaDecoderInfo2.getDecoderName();
                }
            }
            if (!arrayList.isEmpty()) {
                return ((TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
            }
            return null;
        } else if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3) && mAudioMaxCapCodecInstance.containsKey(MimeTypes.AUDIO_E_AC3_JOC)) {
            return mAudioMaxCapCodecInstance.get(MimeTypes.AUDIO_E_AC3_JOC);
        } else {
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
            return null;
        }
    }

    public static String getDecoderNameWithoutCache(String str, boolean z) {
        if (!str.contains("audio")) {
            ArrayList arrayList = new ArrayList();
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos((LocalCache) null)) {
                if (TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z) {
                    TPNativeLog.printLog(2, TAG, "getDecoderName:" + tPMediaDecoderInfo.getDecoderName());
                    arrayList.add(tPMediaDecoderInfo);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TPMediaDecoderInfo tPMediaDecoderInfo2 = (TPMediaDecoderInfo) it.next();
                if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                    return tPMediaDecoderInfo2.getDecoderName();
                }
            }
            if (!arrayList.isEmpty()) {
                return ((TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
            }
        } else if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3) && mAudioMaxCapCodecInstance.containsKey(MimeTypes.AUDIO_E_AC3_JOC)) {
            return mAudioMaxCapCodecInstance.get(MimeTypes.AUDIO_E_AC3_JOC);
        } else {
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
        }
        return null;
    }

    public static String getDisplayVersion() {
        if (!TextUtils.equals(Build.BRAND, "HUAWEI") && !TextUtils.equals(Build.MANUFACTURER, "HONOR")) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.build.display.id"});
        } catch (Exception e) {
            TPNativeLog.printLog(4, TAG, "get huawei display version failed:" + e.getMessage());
            return null;
        }
    }

    public static String getDolbyVisionDecoderName(String str, int i, int i2, boolean z) {
        String str2 = str;
        boolean z2 = z;
        if (!TextUtils.equals("video/dolby-vision", str2)) {
            return null;
        }
        int convertDolbyVisionToOmxProfile = convertDolbyVisionToOmxProfile(i);
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
            if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), str2)) {
                for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                    if (decoderProfileLevel.profile != convertDolbyVisionToOmxProfile) {
                        int i3 = i;
                    } else {
                        TPNativeLog.printLog(2, TAG, "getDolbyVisionDecoderName  profile:" + decoderProfileLevel.profile + " dvProfile:" + i + " bSecure:" + z2 + " name:" + tPMediaDecoderInfo.getDecoderName());
                        if (tPMediaDecoderInfo.isSecureDecoder() == z2) {
                            return tPMediaDecoderInfo.getDecoderName();
                        }
                    }
                }
            }
            int i4 = i;
        }
        return null;
    }

    public static int getHevcSWDecodeLevel() {
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getHevcSWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i = mHevcDeviceLevel;
        if (-1 != i) {
            return i;
        }
        mHevcDeviceLevel = 0;
        if (-1 == cpuHWProducter) {
            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
        } else if (cpuHWProducter != 0) {
            if (cpuHWProducter != 1) {
                if (cpuHWProducter != 2) {
                    if (cpuHWProducter == 3) {
                        if (cpuHWProductIndex >= mShdHevcSamsungIndex) {
                            mHevcDeviceLevel = 21;
                        } else if (cpuHWProductIndex >= mHdHevcSamsungIndex) {
                            mHevcDeviceLevel = 16;
                        } else {
                            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
                        }
                    }
                } else if (cpuHWProductIndex >= mShdHevcHisiIndex) {
                    mHevcDeviceLevel = 21;
                } else if (cpuHWProductIndex >= mHdHevcHisiIndex) {
                    mHevcDeviceLevel = 16;
                } else {
                    mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
                }
            } else if (cpuHWProductIndex >= mShdHevcMtkIndex) {
                mHevcDeviceLevel = 21;
            } else if (cpuHWProductIndex >= mHdHevcMtkIndex) {
                mHevcDeviceLevel = 16;
            } else {
                mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
            }
        } else if (cpuHWProductIndex >= mShdHevcQualcommIndex) {
            mHevcDeviceLevel = 21;
        } else if (cpuHWProductIndex >= mHdHevcQualcommIndex) {
            mHevcDeviceLevel = 16;
        } else {
            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
        }
        return mHevcDeviceLevel;
    }

    public static int getMaxLumaSample(String str, int i) {
        if (TextUtils.equals(str, "video/avc")) {
            return TPMediaCodecProfileLevel.getAVCMaxLumaSample(i);
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return TPMediaCodecProfileLevel.getHEVCMaxLumaSample(i);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return TPMediaCodecProfileLevel.getVP8MaxLumaSample(i);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return TPMediaCodecProfileLevel.getVP9MaxLumaSample(i);
        }
        if (TextUtils.equals(str, "video/av01")) {
            return TPMediaCodecProfileLevel.getAV1MaxLumaSample(i);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        return 30;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int getMaxSupportedFrameRatesFor(int r12, int r13, int r14, int r15) {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPCodecUtils> r0 = com.tencent.thumbplayer.core.common.TPCodecUtils.class
            monitor-enter(r0)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 30
            if (r12 == r1) goto L_0x00dd
            r1 = -1
            if (r12 != r1) goto L_0x000e
            goto L_0x00dd
        L_0x000e:
            java.lang.String r12 = getSupportedHWMimeType(r13)     // Catch:{ all -> 0x00da }
            boolean r13 = r12.isEmpty()     // Catch:{ all -> 0x00da }
            if (r13 == 0) goto L_0x001a
            monitor-exit(r0)
            return r2
        L_0x001a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00da }
            com.tencent.thumbplayer.core.thirdparties.LocalCache r1 = mLocalCache     // Catch:{ Exception -> 0x00b8 }
            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] r1 = com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(r1)     // Catch:{ Exception -> 0x00b8 }
            int r2 = r1.length     // Catch:{ Exception -> 0x00b8 }
            r3 = 0
        L_0x0026:
            if (r3 >= r2) goto L_0x00d4
            r4 = r1[r3]     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = r4.getDecoderMimeType()     // Catch:{ Exception -> 0x00b8 }
            boolean r5 = r12.equals(r5)     // Catch:{ Exception -> 0x00b8 }
            if (r5 == 0) goto L_0x00b4
            int r12 = r4.getDecoderMaxWidth()     // Catch:{ Exception -> 0x00b8 }
            int r7 = r4.getDecoderMaxHeight()     // Catch:{ Exception -> 0x00b8 }
            int r8 = r4.getDecoderLumaWidth()     // Catch:{ Exception -> 0x00b8 }
            int r1 = r4.getDecoderLumaHeight()     // Catch:{ Exception -> 0x00b8 }
            int r2 = r4.getDecoderMaxFrameRateForMaxLuma()     // Catch:{ Exception -> 0x00b8 }
            int r3 = r4.getDecoderMaxFrameRate()     // Catch:{ Exception -> 0x00b8 }
            r6 = r12
            r9 = r1
            r10 = r14
            r11 = r15
            isLimitMaxWidthOrMaxHeight(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00b8 }
            int r4 = r12 * r1
            long r4 = (long) r4     // Catch:{ Exception -> 0x00b8 }
            r6 = 1
            long r4 = r4 * r6
            int r8 = r14 * r15
            long r8 = (long) r8     // Catch:{ Exception -> 0x00b8 }
            long r8 = r8 * r6
            long r6 = java.lang.Math.max(r8, r6)     // Catch:{ Exception -> 0x00b8 }
            long r4 = r4 / r6
            int r5 = (int) r4     // Catch:{ Exception -> 0x00b8 }
            int r5 = r5 * r2
            r4 = 1
            int r4 = java.lang.Math.max(r4, r5)     // Catch:{ Exception -> 0x00b8 }
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00b8 }
            r3 = 2
            java.lang.String r4 = "TPCodecUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
            r5.<init>()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = "getSupportedFrameRatesFor max width:"
            r5.append(r6)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = " max height:"
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r1)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = " max framerate for max resolution:"
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r2)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = " current width:"
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r14)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = " height:"
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r15)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = " max support framerate:"
            r5.append(r12)     // Catch:{ Exception -> 0x00b8 }
            r5.append(r13)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r12 = r5.toString()     // Catch:{ Exception -> 0x00b8 }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r3, r4, r12)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00d4
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x00b8:
            r12 = move-exception
            r14 = 4
            java.lang.String r15 = "TPCodecUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r1.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "getMaxSupportedFrameRatesFor failed:"
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x00da }
            r1.append(r12)     // Catch:{ all -> 0x00da }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x00da }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r14, r15, r12)     // Catch:{ all -> 0x00da }
        L_0x00d4:
            int r12 = r13.intValue()     // Catch:{ all -> 0x00da }
            monitor-exit(r0)
            return r12
        L_0x00da:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x00dd:
            monitor-exit(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.getMaxSupportedFrameRatesFor(int, int, int, int):int");
    }

    private static int getSoftMaxSamples(int i) {
        if (i == 1) {
            return 129600;
        }
        if (i == 6) {
            return 307200;
        }
        if (i == 11) {
            return 407040;
        }
        if (i == 16) {
            return 480000;
        }
        if (i == 21) {
            return Downloads.SPLIT_RANGE_SIZE_NET;
        }
        if (i == 26) {
            return 2073600;
        }
        if (i != 28) {
            return i != 33 ? 0 : 8847360;
        }
        return 8294400;
    }

    private static int getSupportedCodecId(String str) {
        if (TextUtils.equals(str, "video/avc")) {
            return 26;
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return 172;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return 138;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return 166;
        }
        if (TextUtils.equals(str, "video/av01")) {
            return 1029;
        }
        if (TextUtils.equals(str, "audio/mp4a-latm")) {
            return 5002;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_AC3)) {
            return 5003;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3) || TextUtils.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            return 5040;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_FLAC)) {
            return 5012;
        }
        return TextUtils.equals(str, MimeTypes.AUDIO_DTS) ? 5004 : -1;
    }

    private static String getSupportedHWMimeType(int i) {
        return i != 26 ? i != 138 ? i != 166 ? i != 172 ? i != 1029 ? "" : "video/av01" : "video/hevc" : "video/x-vnd.on2.vp9" : "video/x-vnd.on2.vp8" : "video/avc";
    }

    public static String getSystemPatchVersion() {
        if (!TextUtils.equals(Build.BRAND, "HUAWEI")) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"hwouc.hwpatch.version"});
        } catch (Exception e) {
            TPNativeLog.printLog(4, TAG, "get huawei system patch version failed:" + e.getMessage());
            return null;
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecSWMaxCapabilityMap() {
        synchronized (TPCodecUtils.class) {
            TPNativeLog.printLog(2, TAG, "getVCodecSWMaxCapabilityMap func in");
            if (mIsFFmpegCapGot) {
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap = mMaxVCodecSwCapabilityMap;
                return hashMap;
            }
            try {
                int hevcSWDecodeLevel = getHevcSWDecodeLevel();
                int softMaxSamples = getSoftMaxSamples(hevcSWDecodeLevel);
                int avs3SWDecodeLevel = getAvs3SWDecodeLevel();
                int aV1SWDecodeLevel = getAV1SWDecodeLevel();
                int vvcSWDecodeLevel = getVvcSWDecodeLevel();
                int softMaxSamples2 = getSoftMaxSamples(avs3SWDecodeLevel);
                int softMaxSamples3 = getSoftMaxSamples(aV1SWDecodeLevel);
                int softMaxSamples4 = getSoftMaxSamples(vvcSWDecodeLevel);
                TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:" + hevcSWDecodeLevel + ", avs3DecodeLevel:" + avs3SWDecodeLevel + ", AV1DecodeLevel:" + aV1SWDecodeLevel + ", vvcDecodeLevel:" + vvcSWDecodeLevel);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = mAVCSWMaxCapability;
                tPCodecMaxCapability.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability.maxProfile = 64;
                tPCodecMaxCapability.maxLevel = 65536;
                mMaxVCodecSwCapabilityMap.put(26, mAVCSWMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = mHEVCSWMaxCapability;
                tPCodecMaxCapability2.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability2.maxProfile = 2;
                tPCodecMaxCapability2.maxLevel = TPMediaCodecProfileLevel.HEVCHighTierLevel62;
                mMaxVCodecSwCapabilityMap.put(172, mHEVCSWMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = mVP9SWMaxCapability;
                tPCodecMaxCapability3.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability3.maxProfile = 8;
                tPCodecMaxCapability3.maxLevel = 8192;
                mMaxVCodecSwCapabilityMap.put(166, mVP9SWMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = mVP8SWMaxCapability;
                tPCodecMaxCapability4.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability4.maxProfile = 1;
                tPCodecMaxCapability4.maxLevel = 8;
                mMaxVCodecSwCapabilityMap.put(138, mVP8SWMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability5 = mAVS3WMaxCapability;
                tPCodecMaxCapability5.maxLumaSamples = softMaxSamples2;
                tPCodecMaxCapability5.maxProfile = 0;
                tPCodecMaxCapability5.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(192, mAVS3WMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability6 = mAV1SWMaxCapability;
                tPCodecMaxCapability6.maxLumaSamples = softMaxSamples3;
                tPCodecMaxCapability6.maxProfile = 0;
                tPCodecMaxCapability6.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(1029, mAV1SWMaxCapability);
                TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability7 = mVVCSWMaxCapability;
                tPCodecMaxCapability7.maxLumaSamples = softMaxSamples4;
                tPCodecMaxCapability7.maxProfile = 0;
                tPCodecMaxCapability7.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(193, mVVCSWMaxCapability);
                TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:" + softMaxSamples + ", maxAvs3LumaSamples:" + softMaxSamples2 + ", maxAV1LumaSamples:" + softMaxSamples3 + ", maxVvcLumaSamples:" + softMaxSamples4);
                mIsFFmpegCapGot = true;
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap2 = mMaxVCodecSwCapabilityMap;
                return hashMap2;
            } catch (Exception unused) {
                TPNativeLog.printLog(4, TAG, "getVCodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVMediaCodecMaxCapabilityMap() {
        synchronized (TPCodecUtils.class) {
            TPNativeLog.printLog(2, TAG, "getVMediaCodecMaxCapabilityMap func in");
            if (!mMaxVCodecHwCapabilityMap.isEmpty()) {
                TPNativeLog.printLog(2, TAG, "return memory stored video max cap map");
                HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap = mMaxVCodecHwCapabilityMap;
                return hashMap;
            }
            try {
                for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                    String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                    if (tPMediaDecoderInfo.isVideo()) {
                        mVMediaCodecCapList.add(decoderMimeType);
                        TPNativeLog.printLog(2, TAG, "Video MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                        if (isSupportedMediaCodec(decoderMimeType) && !tPMediaDecoderInfo.isSecureDecoder()) {
                            TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(getMaxLumaSample(decoderMimeType, maxProfileLevel.level), maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                            TPNativeLog.printLog(2, TAG, "video codecName: " + tPMediaDecoderInfo.getDecoderName() + " lumasample: " + getMaxLumaSample(decoderMimeType, maxProfileLevel.level) + " framerate: " + tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                            if (!mMaxVCodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType))) || maxProfileLevel.level > mMaxVCodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxLevel) {
                                replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxVCodecHwCapabilityMap);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TPNativeLog.printLog(4, TAG, "getVMediaCodecMaxCapabilityMap failed:" + Log.getStackTraceString(e));
            }
            HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> hashMap2 = mMaxVCodecHwCapabilityMap;
            return hashMap2;
        }
    }

    private static int getValueFromSubstring(String str, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 >= str.length()) {
            i2 = str.length() - 1;
        }
        if (i > i2) {
            i = i2;
        }
        return Integer.parseInt(str.substring(i, i2));
    }

    private static int getVvcSWDecodeLevel() {
        int i = mVvcDeviceLevel;
        if (i != -1) {
            return i;
        }
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getVvcSWDecodeLevel], mCpuHWProducer = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx = " + cpuHWProductIndex + ", hardware = " + cpuHarewareName);
        int i2 = 0;
        if (cpuHWProducter == -1) {
            TPNativeLog.printLog(3, TAG, "current cpu manufacturer is not listed in the performance list, cpuHwProducer:" + cpuHWProducter);
            mVvcDeviceLevel = 0;
            return 0;
        } else if (cpuHWProductIndex == -1) {
            TPNativeLog.printLog(3, TAG, "current cpu model is not listed in the performance list, cpuHwProductIdx:" + cpuHWProductIndex);
            mVvcDeviceLevel = 0;
            return 0;
        } else {
            int selectBestDecodeLevelFromCapabilityTable = selectBestDecodeLevelFromCapabilityTable(193, cpuHWProducter, cpuHWProductIndex);
            if (selectBestDecodeLevelFromCapabilityTable != -1) {
                i2 = selectBestDecodeLevelFromCapabilityTable;
            }
            mVvcDeviceLevel = i2;
            return i2;
        }
    }

    public static synchronized void init(Context context, boolean z) {
        synchronized (TPCodecUtils.class) {
            TPNativeLog.printLog(2, TAG, "is local cache enabled:" + z);
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (z) {
                mLocalCache = LocalCache.get(applicationContext);
            }
            getDecoderMaxCapabilityMapAsync();
        }
    }

    public static boolean isAMediaCodecBlackListInstance(String str) {
        return mAMediaCodecBlackListInstance.contains(str);
    }

    public static boolean isAMediaCodecBlackListModel() {
        return mAMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    public static boolean isBlackListType(String str) {
        return Arrays.asList(new String[]{"PRO 7 Plus", "PRO 7-H", "PRO+7+Plus"}).contains(TPSystemInfo.getDeviceName()) && TextUtils.equals(str, "video/hevc");
    }

    private static synchronized boolean isHDR10Support(int i) {
        synchronized (TPCodecUtils.class) {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                    for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i) {
                            TPNativeLog.printLog(2, TAG, "support hdr10 " + i);
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
    }

    private static synchronized boolean isHDRDVSupport(int i, int i2) {
        synchronized (TPCodecUtils.class) {
            if (i == 0 && i2 == 0) {
                boolean contains = mVMediaCodecCapList.contains("video/dolby-vision");
                return contains;
            }
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/dolby-vision")) {
                    for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i && decoderProfileLevel.level == i2) {
                            TPNativeLog.printLog(2, TAG, "support dolbyvision");
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
    }

    public static boolean isHDRDecoderTypeSupport(int i, int i2) {
        if (i2 == 102 || i2 == 101) {
            HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> hashMap = i2 == 102 ? mHDRTypeToHDRHardwareCodecWhiteListMap : mHDRTypeToHDRSoftwareCodecWhiteListMap;
            if (hashMap.containsKey(Integer.valueOf(i))) {
                return isInHDRVersionRangeWhiteList(hashMap.get(Integer.valueOf(i)));
            }
            TPNativeLog.printLog(3, TAG, "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = " + i);
            return false;
        }
        TPNativeLog.printLog(3, TAG, "isHDRDecodeTypeSupport, not support decoderType, decoderType = " + i2);
        return false;
    }

    public static boolean isHDRsupport(int i, int i2, int i3) {
        if (i == 2) {
            return isHDRDVSupport(i2, i3);
        }
        if (i == 0) {
            return isHDR10Support(4096);
        }
        if (i == 1) {
            return isHDR10Support(8192);
        }
        if (i != 4) {
            return false;
        }
        String displayVersion = getDisplayVersion();
        String systemPatchVersion = getSystemPatchVersion();
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):display version:" + displayVersion);
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):patch version:" + systemPatchVersion);
        return checkHDRVividSupportByVersion(TPSystemInfo.getDeviceName(), displayVersion, systemPatchVersion);
    }

    public static boolean isInDRMLevel1Blacklist(int i) {
        if (mDrmL1BlackList.containsKey(Integer.valueOf(i))) {
            return mDrmL1BlackList.get(Integer.valueOf(i)).contains(TPSystemInfo.getDeviceName());
        }
        return false;
    }

    private static boolean isInHDRVersionRangeWhiteList(ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList) {
        if (arrayList == null) {
            return false;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = arrayList.get(i);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > tPHdrSupportVersionRange.upperboundAndroidAPILevel || i2 < tPHdrSupportVersionRange.lowerboundAndroidAPILevel) {
                i++;
            } else {
                TPNativeLog.printLog(2, TAG, "inHDRVersionRangeWhiteList!");
                return true;
            }
        }
        return false;
    }

    public static boolean isInHDRVividBlackList(String str, int i, int i2) {
        if (mHdrBlackMap.containsKey(4)) {
            HashMap hashMap = mHdrBlackMap.get(4);
            if (hashMap.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = (TPCodecCapability.TPHdrSupportVersionRange) hashMap.get(str);
                return i <= tPHdrSupportVersionRange.upperboundSystemVersion && i >= tPHdrSupportVersionRange.lowerboundSystemVersion && i2 <= tPHdrSupportVersionRange.upperboundPatchVersion && i2 >= tPHdrSupportVersionRange.lowerboundPatchVersion;
            }
        }
    }

    public static boolean isInHDRVividWhiteList(String str, int i, int i2) {
        if (mHdrWhiteMap.containsKey(4)) {
            HashMap hashMap = mHdrWhiteMap.get(4);
            if (hashMap.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = (TPCodecCapability.TPHdrSupportVersionRange) hashMap.get(str);
                return i <= tPHdrSupportVersionRange.upperboundSystemVersion && i >= tPHdrSupportVersionRange.lowerboundSystemVersion && i2 <= tPHdrSupportVersionRange.upperboundPatchVersion && i2 >= tPHdrSupportVersionRange.lowerboundPatchVersion;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInMediaCodecBlackList(java.lang.String r4) {
        /*
            java.lang.String r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x00cf
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = mCodecCapBlackList
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x00cf
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = mCodecCapBlackList
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "video/avc"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            r3 = 1
            if (r1 == 0) goto L_0x0031
            int r4 = r0.intValue()
            r4 = r4 & r3
            if (r4 == 0) goto L_0x00cf
        L_0x002e:
            r2 = 1
            goto L_0x00cf
        L_0x0031:
            java.lang.String r1 = "video/hevc"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0043
            int r4 = r0.intValue()
            r4 = r4 & 2
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x0043:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0055
            int r4 = r0.intValue()
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x0055:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0067
            int r4 = r0.intValue()
            r4 = r4 & 4
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x0067:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0078
            int r4 = r0.intValue()
            r4 = r4 & 8
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x0078:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0089
            int r4 = r0.intValue()
            r4 = r4 & 16
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x0089:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x009a
            int r4 = r0.intValue()
            r4 = r4 & 32
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x009a:
            java.lang.String r1 = "audio/flac"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x00ab
            int r4 = r0.intValue()
            r4 = r4 & 64
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x00ab:
            java.lang.String r1 = "audio/vnd.dts"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x00bd
            int r4 = r0.intValue()
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x00bd:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r4 = android.text.TextUtils.equals(r4, r1)
            if (r4 == 0) goto L_0x00cf
            int r4 = r0.intValue()
            r4 = r4 & 32
            if (r4 == 0) goto L_0x00cf
            goto L_0x002e
        L_0x00cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.isInMediaCodecBlackList(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInMediaCodecWhiteList(java.lang.String r4) {
        /*
            java.lang.String r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x00bd
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = mCodecCapWhiteList
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x00bd
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = mCodecCapWhiteList
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "video/avc"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            r3 = 1
            if (r1 == 0) goto L_0x0031
            int r4 = r0.intValue()
            r4 = r4 & r3
            if (r4 == 0) goto L_0x00bd
        L_0x002e:
            r2 = 1
            goto L_0x00bd
        L_0x0031:
            java.lang.String r1 = "video/hevc"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0043
            int r4 = r0.intValue()
            r4 = r4 & 2
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x0043:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0055
            int r4 = r0.intValue()
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x0055:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0067
            int r4 = r0.intValue()
            r4 = r4 & 4
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x0067:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0078
            int r4 = r0.intValue()
            r4 = r4 & 8
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x0078:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x0089
            int r4 = r0.intValue()
            r4 = r4 & 16
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x0089:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x009a
            int r4 = r0.intValue()
            r4 = r4 & 32
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x009a:
            java.lang.String r1 = "audio/flac"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x00ab
            int r4 = r0.intValue()
            r4 = r4 & 64
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x00ab:
            java.lang.String r1 = "audio/vnd.dts"
            boolean r4 = android.text.TextUtils.equals(r4, r1)
            if (r4 == 0) goto L_0x00bd
            int r4 = r0.intValue()
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00bd
            goto L_0x002e
        L_0x00bd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.isInMediaCodecWhiteList(java.lang.String):boolean");
    }

    private static boolean isLimitMaxWidthOrMaxHeight(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i5 <= i6 || (i5 <= i && i6 <= i4)) && (i5 >= i6 || (i5 <= i3 && i6 <= i2))) {
            return false;
        }
        int i7 = i5 > i6 ? i4 * i : i3 * i2;
        if (i < i5 || i2 < i6 || i7 < i5 * i6) {
            TPNativeLog.printLog(4, TAG, "getSupportedFrameRatesFor width:" + i5 + " height:" + i6 + " do not support! maxWidth:" + i + " maxHeight:" + i2);
            return true;
        }
        TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor width:" + i5 + " height:" + i6 + " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:" + i + " maxHeight:" + i2 + " maxLumaSamples:" + i7);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean isMediaCodecDDPlusSupported() {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPCodecUtils> r0 = com.tencent.thumbplayer.core.common.TPCodecUtils.class
            monitor-enter(r0)
            boolean r1 = isAMediaCodecBlackListModel()     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            java.util.ArrayList<java.lang.String> r1 = mAMediaCodecCapList     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "audio/eac3"
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0020
            java.util.ArrayList<java.lang.String> r1 = mAMediaCodecCapList     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "audio/eac3-joc"
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            monitor-exit(r0)
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.isMediaCodecDDPlusSupported():boolean");
    }

    public static synchronized boolean isMediaCodecDolbyDSSupported() {
        synchronized (TPCodecUtils.class) {
            if (isAMediaCodecBlackListModel()) {
                return false;
            }
            boolean contains = mAMediaCodecCapList.contains(MimeTypes.AUDIO_AC3);
            return contains;
        }
    }

    private static boolean isSupportedMediaCodec(String str) {
        return mSupportedMediaCodec.contains(str);
    }

    private static boolean isTheSameVersionRange(TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
        return tPHdrSupportVersionRange.lowerboundPatchVersion == tPHdrSupportVersionRange2.lowerboundPatchVersion && tPHdrSupportVersionRange.lowerboundSystemVersion == tPHdrSupportVersionRange2.lowerboundSystemVersion && tPHdrSupportVersionRange.upperboundPatchVersion == tPHdrSupportVersionRange2.upperboundPatchVersion && tPHdrSupportVersionRange.upperboundSystemVersion == tPHdrSupportVersionRange2.upperboundSystemVersion;
    }

    public static boolean isVMediaCodecBlackListModel() {
        return mVMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    private static <K, T> void replace(K k, T t, HashMap<K, T> hashMap) {
        if (hashMap.containsKey(k)) {
            hashMap.remove(k);
            hashMap.put(k, t);
            return;
        }
        hashMap.put(k, t);
    }

    private static int selectBestDecodeLevelFromCapabilityTable(int i, int i2, int i3) {
        VideoSwCapabilityModel videoSwCapabilityModel = mVideoCodecIdToSwCapabilityModel.get(i);
        if (videoSwCapabilityModel == null) {
            TPNativeLog.printLog(3, TAG, "No corresponding codec id found, codecId:" + i);
            return -1;
        }
        HashMap hashMap = videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable.get(i2);
        if (hashMap == null || hashMap.isEmpty()) {
            TPNativeLog.printLog(3, TAG, "No corresponding cpu producer found, cpuHwProducer:" + i2);
            return -1;
        }
        for (DefinitionName definitionName : DefinitionName.values()) {
            String str = (String) hashMap.get(definitionName);
            if (!TextUtils.isEmpty(str) && i3 >= TPSystemInfo.getCpuHWProductIndex(i2, str)) {
                return convertDefinitionNameToDecodeLevel(definitionName);
            }
        }
        return -1;
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z) {
        mPreferredSoftwareComponent = z;
    }
}
