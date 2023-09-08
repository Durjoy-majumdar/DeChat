package com.tencent.liteav.videobase.common;

public enum CodecType {
    H264(0),
    H265(1),
    VP8(2);
    

    /* renamed from: d */
    private static final CodecType[] f46521d = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        f46521d = values();
    }

    private CodecType(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static CodecType m17046a(int i) {
        for (CodecType codecType : f46521d) {
            if (i == codecType.mValue) {
                return codecType;
            }
        }
        return H264;
    }
}
