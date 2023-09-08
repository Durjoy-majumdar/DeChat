package com.tencent.qqmusic.mediaplayer.codec.mp3;

import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.wcdb.FileUtils;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;

class MP3Header {
    public static final int MPEG1 = 3;
    public static final int MPEG2 = 2;
    public static final int MPEG25 = 0;
    private int[][][] bitrate = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, 288, C0947jz.f2205e, JsApiNFCStartHCE.CTRL_INDEX, 384, v2helper.EMethodEhanceHeadsetEC, FileUtils.S_IRWXU}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};
    private int bitrate_index;
    private int framesize;
    private int layer;
    private int lsf;
    private int mode;
    private int mode_extension;
    private int padding;
    private int protection_bit;
    private int[][] samplingRate = {new int[]{11025, 12000, 8000, 0}, new int[]{0, 0, 0, 0}, new int[]{22050, 24000, 16000, 0}, new int[]{44100, 48000, 32000, 0}};
    private int sampling_frequency;
    private int sideinfosize;
    private int verID;

    public void decode(int i) {
        int i2 = (i >> 19) & 3;
        this.verID = i2;
        int i3 = 4 - ((i >> 17) & 3);
        this.layer = i3;
        this.protection_bit = (i >> 16) & 1;
        int i4 = (i >> 12) & 15;
        this.bitrate_index = i4;
        int i5 = (i >> 10) & 3;
        this.sampling_frequency = i5;
        int i6 = (i >> 9) & 1;
        this.padding = i6;
        int i7 = (i >> 6) & 3;
        this.mode = i7;
        this.mode_extension = (i >> 4) & 3;
        int i8 = i2 == 3 ? 0 : 1;
        this.lsf = i8;
        if (i3 == 1) {
            int i9 = this.bitrate[i8][0][i4] * 12000;
            this.framesize = i9;
            this.framesize = ((i9 / this.samplingRate[i2][i5]) + i6) << 2;
        } else if (i3 == 2) {
            int i15 = this.bitrate[i8][1][i4] * 144000;
            this.framesize = i15;
            this.framesize = (i15 / this.samplingRate[i2][i5]) + i6;
        } else if (i3 == 3) {
            int i16 = this.bitrate[i8][2][i4] * 144000;
            this.framesize = i16;
            this.framesize = (i16 / (this.samplingRate[i2][i5] << i8)) + i6;
            int i17 = 17;
            if (i2 == 3) {
                if (i7 != 3) {
                    i17 = 32;
                }
                this.sideinfosize = i17;
                return;
            }
            if (i7 == 3) {
                i17 = 9;
            }
            this.sideinfosize = i17;
        }
    }

    public int getFrameSize() {
        return this.framesize;
    }

    public void initialize() {
        this.framesize = 0;
        this.sideinfosize = 0;
        this.layer = 0;
        this.verID = 1;
    }

    public boolean isProtected() {
        return this.protection_bit == 0;
    }
}
