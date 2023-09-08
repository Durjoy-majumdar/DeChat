package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.a */
public enum C17067a {
    STOPPED(1),
    VOICE_PLAY_AND_RECORD(2),
    MEDIA_PLAY_AND_RECORD(3),
    MEDIA_PLAYBACK(4),
    VOICE_PLAYBACK(5);
    
    public int mValue;

    /* renamed from: com.tencent.liteav.audio.route.a$1 */
    public static /* synthetic */ class C170681 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46034a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.audio.route.a[] r0 = com.tencent.liteav.audio.route.C17067a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46034a = r0
                com.tencent.liteav.audio.route.a r1 = com.tencent.liteav.audio.route.C17067a.VOICE_PLAY_AND_RECORD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46034a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.audio.route.a r1 = com.tencent.liteav.audio.route.C17067a.VOICE_PLAYBACK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.audio.route.a r1 = com.tencent.liteav.audio.route.C17067a.MEDIA_PLAY_AND_RECORD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46034a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.audio.route.a r1 = com.tencent.liteav.audio.route.C17067a.MEDIA_PLAYBACK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.C17067a.C170681.<clinit>():void");
        }
    }

    private C17067a(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static C17067a m16846a(int i) {
        for (C17067a aVar : values()) {
            if (aVar.mValue == i) {
                return aVar;
            }
        }
        return STOPPED;
    }

    /* renamed from: a */
    public static int m16845a(C17067a aVar) {
        int i = C170681.f46034a[aVar.ordinal()];
        return (i == 1 || i == 2) ? 3 : 0;
    }

    /* renamed from: a */
    public final boolean mo19319a() {
        return this == VOICE_PLAY_AND_RECORD || this == VOICE_PLAYBACK;
    }
}
