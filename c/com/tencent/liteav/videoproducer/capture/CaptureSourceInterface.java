package com.tencent.liteav.videoproducer.capture;

import android.graphics.Rect;
import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.Locale;

public interface CaptureSourceInterface {

    public static class CaptureParams {

        /* renamed from: b */
        public int f47183b;

        /* renamed from: c */
        public int f47184c;

        /* renamed from: d */
        public int f47185d;

        /* renamed from: e */
        public Rect f47186e;

        public CaptureParams() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureParams)) {
                return false;
            }
            CaptureParams captureParams = (CaptureParams) obj;
            return this.f47183b == captureParams.f47183b && this.f47184c == captureParams.f47184c && this.f47185d == captureParams.f47185d;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "size: %dx%d, fps: %d", new Object[]{Integer.valueOf(this.f47184c), Integer.valueOf(this.f47185d), Integer.valueOf(this.f47183b)});
        }

        public CaptureParams(CaptureParams captureParams) {
            this.f47183b = captureParams.f47183b;
            this.f47184c = captureParams.f47184c;
            this.f47185d = captureParams.f47185d;
            this.f47186e = captureParams.f47186e;
        }
    }

    public enum SourceType {
        NONE(0),
        CAMERA(1),
        SCREEN(2),
        VIRTUAL_CAMERA(3),
        CUSTOM(4);
        

        /* renamed from: f */
        private static final SourceType[] f47192f = null;
        private final int mValue;

        /* access modifiers changed from: public */
        static {
            f47192f = values();
        }

        private SourceType(int i) {
            this.mValue = i;
        }

        /* renamed from: a */
        public static SourceType m17403a(int i) {
            for (SourceType sourceType : f47192f) {
                if (sourceType.mValue == i) {
                    return sourceType;
                }
            }
            return NONE;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.CaptureSourceInterface$a */
    public interface C17399a {
        /* renamed from: a */
        void mo20531a();

        /* renamed from: a */
        void mo20532a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame);

        /* renamed from: a */
        void mo20533a(boolean z);

        /* renamed from: b */
        void mo20534b(boolean z);

        /* renamed from: c */
        void mo20535c(boolean z);

        /* renamed from: d */
        void mo20536d(boolean z);
    }

    void pause();

    void resume();

    void start(Object obj, CaptureParams captureParams, C17399a aVar);

    void stop();

    void updateParams(CaptureParams captureParams);
}
