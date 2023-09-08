package com.tencent.thumbplayer.core.common;

import java.io.Serializable;

public interface TPCodecCapability {
    public static final int DEFAULT_FRAMERATE = 30;
    public static final int DEFAULT_INVALID_PARAMETER = -1;

    public static class TPACodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundBitRate;
        public int lowerboundChannels;
        public int lowerboundSampleRate;
        public int profile;
        public int upperboundBitRate;
        public int upperboundChannels;
        public int upperboundSampleRate;

        public void set(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.upperboundSampleRate = i;
            this.upperboundChannels = i2;
            this.upperboundBitRate = i3;
            this.lowerboundSampleRate = i4;
            this.lowerboundChannels = i5;
            this.lowerboundBitRate = i6;
            this.profile = i7;
            this.level = i8;
        }
    }

    public static class TPVCodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundHeight;
        public int lowerboundWidth;
        public int profile;
        public int upperboundHeight;
        public int upperboundWidth;

        public void set(int i, int i2, int i3, int i4, int i5, int i6) {
            this.upperboundWidth = i;
            this.upperboundHeight = i2;
            this.lowerboundWidth = i3;
            this.lowerboundHeight = i4;
            this.profile = i5;
            this.level = i6;
        }
    }

    public static class TPHdrSupportVersionRange implements Serializable {
        public int lowerboundAndroidAPILevel;
        public int lowerboundPatchVersion;
        public int lowerboundSystemVersion;
        public int upperboundAndroidAPILevel;
        public int upperboundPatchVersion;
        public int upperboundSystemVersion;

        public TPHdrSupportVersionRange(int i, int i2, int i3, int i4) {
            this.upperboundSystemVersion = i;
            this.lowerboundSystemVersion = i2;
            this.upperboundPatchVersion = i3;
            this.lowerboundPatchVersion = i4;
        }

        public TPHdrSupportVersionRange(int i, int i2) {
            this.upperboundAndroidAPILevel = i;
            this.lowerboundAndroidAPILevel = i2;
        }
    }

    public static class TPCodecMaxCapability implements Serializable {
        public int maxBitRate;
        public int maxChannels;
        public int maxFramerateFormaxLumaSamples;
        public int maxLevel;
        public int maxLumaSamples;
        public int maxProfile;
        public int maxSampleRate;

        @Deprecated
        public TPCodecMaxCapability(int i, int i2, int i3) {
            this.maxLumaSamples = i;
            this.maxProfile = i2;
            this.maxLevel = i3;
            this.maxFramerateFormaxLumaSamples = 30;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        public TPCodecMaxCapability(int i, int i2, int i3, int i4) {
            this.maxLumaSamples = i;
            this.maxProfile = i2;
            this.maxLevel = i3;
            this.maxFramerateFormaxLumaSamples = i4;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        public TPCodecMaxCapability(int i, int i2, int i3, int i4, int i5) {
            this.maxProfile = i;
            this.maxLevel = i2;
            this.maxBitRate = i4;
            this.maxSampleRate = i3;
            this.maxChannels = i5;
            this.maxLumaSamples = -1;
            this.maxFramerateFormaxLumaSamples = -1;
        }
    }
}
