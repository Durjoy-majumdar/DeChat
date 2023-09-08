package com.tencent.liteav.videoproducer.producer;

public interface VideoProducerDef {

    public enum GSensorMode {
        DISABLE(0),
        UI_AUTO_LAYOUT(1),
        UI_FIX_LAYOUT(2);
        

        /* renamed from: d */
        private static final GSensorMode[] f47758d = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47758d = values();
        }

        private GSensorMode(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static GSensorMode m17762a(int i) {
            for (GSensorMode gSensorMode : f47758d) {
                if (gSensorMode.mValue == i) {
                    return gSensorMode;
                }
            }
            return UI_FIX_LAYOUT;
        }
    }

    public enum HomeOrientation {
        UNSET(-1),
        UP(0),
        LEFT(1),
        RIGHT(2),
        DOWN(3);
        

        /* renamed from: f */
        private static final HomeOrientation[] f47765f = null;
        public int mValue;

        /* access modifiers changed from: public */
        static {
            f47765f = values();
        }

        private HomeOrientation(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static HomeOrientation m17763a(int i) {
            for (HomeOrientation homeOrientation : f47765f) {
                if (homeOrientation.mValue == i) {
                    return homeOrientation;
                }
            }
            return DOWN;
        }
    }

    public enum ProducerMode {
        AUTO(0),
        PERFORMANCE(1),
        HIGH_QUALITY(2),
        MANUAL(3);
        

        /* renamed from: e */
        private static final ProducerMode[] f47771e = null;
        private int mValue;

        /* access modifiers changed from: public */
        static {
            f47771e = values();
        }

        private ProducerMode(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static ProducerMode m17764a(int i) {
            for (ProducerMode producerMode : f47771e) {
                if (producerMode.mValue == i) {
                    return producerMode;
                }
            }
            return AUTO;
        }
    }

    public enum StreamType {
        STREAM_TYPE_BIG_VIDEO(0),
        STREAM_TYPE_SMALL_VIDEO(1),
        STREAM_TYPE_SUB_VIDEO(2);
        

        /* renamed from: d */
        private static final StreamType[] f47776d = null;
        public final int mValue;

        /* access modifiers changed from: public */
        static {
            f47776d = values();
        }

        private StreamType(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static StreamType m17765a(int i) {
            for (StreamType streamType : f47776d) {
                if (streamType.mValue == i) {
                    return streamType;
                }
            }
            return STREAM_TYPE_BIG_VIDEO;
        }
    }
}
