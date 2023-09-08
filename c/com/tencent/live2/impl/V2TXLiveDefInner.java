package com.tencent.live2.impl;

public class V2TXLiveDefInner {

    public static class SurfaceSize {
        public int height;
        public int width;

        public SurfaceSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            return "[width:" + this.width + "][height:" + this.height + "]";
        }
    }

    public static class TXLivePropertyKey {
        public static final String kV2EnableAGC = "enableAGC";
        public static final String kV2EnableANS = "enableANS";
        public static final String kV2EnableCameraZoom = "enableCameraZoom";
        public static final String kV2EnableRTMPAcc = "enableRTMPAcc";
        public static final String kV2EnableRealtimeMode = "enableRealtimeMode";
        public static final String kV2SetAudioCodecType = "setAudioCodecType";
        public static final String kV2SetAudioRoute = "setAudioRoute";
        public static final String kV2SetFramework = "setFramework";
        public static final String kV2SetLEBEnvironment = "setLEBEnvironment";
        public static final String kV2SetMetaData = "setMetaData";
        public static final String kV2SetSurface = "setSurface";
        public static final String kV2SetSurfaceSize = "setSurfaceSize";
    }
}
