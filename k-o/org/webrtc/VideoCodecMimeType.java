package org.webrtc;

enum VideoCodecMimeType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    AV1("video/av01");
    
    private final String mimeType;

    private VideoCodecMimeType(String str) {
        this.mimeType = str;
    }

    public static VideoCodecMimeType fromSdpCodecName(String str) {
        return str.equals("AV1X") ? AV1 : valueOf(str);
    }

    public String mimeType() {
        return this.mimeType;
    }

    public String toSdpCodecName() {
        return this == AV1 ? "AV1X" : name();
    }
}
