package org.webrtc;

import android.graphics.ImageFormat;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lm0.C88592k;

public class CameraEnumerationAndroid {
    public static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size[]{new Size(160, 120), new Size(240, 160), new Size(C0947jz.f2205e, 240), new Size(400, 240), new Size(480, C0947jz.f2205e), new Size(640, v2helper.VOIP_ENC_HEIGHT_LV1), new Size(640, 480), new Size(768, 480), new Size(C88592k.CTRL_INDEX, 480), new Size(800, 600), new Size(960, TAVPlayer.VIDEO_PLAYER_WIDTH), new Size(960, 640), new Size(1024, 576), new Size(1024, 600), new Size(1280, TAVExporter.VIDEO_EXPORT_WIDTH), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)}));
    private static final String TAG = "CameraEnumerationAndroid";

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (((float) this.min) / 1000.0f) + XVFSFile.PATH_SEPARATOR + (((float) this.max) / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }
    }

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }

        public abstract int diff(T t);
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() {
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i, int i2, int i3, int i4) {
                if (i < i2) {
                    return i * i3;
                }
                return ((i - i2) * i4) + (i3 * i2);
            }

            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, 8000, 1, 4) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() {
            public int diff(Size size) {
                return Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
