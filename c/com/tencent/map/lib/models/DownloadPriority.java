package com.tencent.map.lib.models;

public enum DownloadPriority {
    NONE(-1),
    HIGH(0),
    MIDDLE(1),
    LOW(2);
    
    private final int mValue;

    /* renamed from: com.tencent.map.lib.models.DownloadPriority$1 */
    public static /* synthetic */ class C1134761 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f339546a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.map.lib.models.DownloadPriority[] r0 = com.tencent.map.lib.models.DownloadPriority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f339546a = r0
                com.tencent.map.lib.models.DownloadPriority r1 = com.tencent.map.lib.models.DownloadPriority.HIGH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f339546a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.map.lib.models.DownloadPriority r1 = com.tencent.map.lib.models.DownloadPriority.LOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f339546a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.map.lib.models.DownloadPriority r1 = com.tencent.map.lib.models.DownloadPriority.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.lib.models.DownloadPriority.C1134761.<clinit>():void");
        }
    }

    private DownloadPriority(int i) {
        this.mValue = i;
    }

    public static DownloadPriority get(int i) {
        for (DownloadPriority downloadPriority : values()) {
            if (downloadPriority.mValue == i) {
                return downloadPriority;
            }
        }
        return NONE;
    }

    public static int getThreadPriority(int i) {
        int i2 = C1134761.f339546a[get(i).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? 5 : 1;
        }
        return 10;
    }

    public final int getValue() {
        return this.mValue;
    }
}
