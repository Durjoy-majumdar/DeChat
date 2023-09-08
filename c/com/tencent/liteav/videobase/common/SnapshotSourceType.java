package com.tencent.liteav.videobase.common;

public enum SnapshotSourceType {
    STREAM(0),
    VIEW(1);
    

    /* renamed from: c */
    private static final SnapshotSourceType[] f46525c = null;
    private final int mValue;

    /* access modifiers changed from: public */
    static {
        f46525c = values();
    }

    private SnapshotSourceType(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static SnapshotSourceType m17047a(int i) {
        for (SnapshotSourceType snapshotSourceType : f46525c) {
            if (i == snapshotSourceType.mValue) {
                return snapshotSourceType;
            }
        }
        return VIEW;
    }
}
