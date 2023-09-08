package p172io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import java.util.Objects;
import p172io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.view.VsyncWaiter */
public class VsyncWaiter {
    private static VsyncWaiter instance;
    private static DisplayListener listener;
    private final FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = new FlutterJNI.AsyncWaitForVsyncDelegate() {
        public void asyncWaitForVsync(final long j) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
                public void doFrame(long j) {
                    long nanoTime = System.nanoTime() - j;
                    VsyncWaiter.this.flutterJNI.onVsync(nanoTime < 0 ? 0 : nanoTime, VsyncWaiter.this.refreshPeriodNanos, j);
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public FlutterJNI flutterJNI;
    /* access modifiers changed from: private */
    public long refreshPeriodNanos = -1;

    /* renamed from: io.flutter.view.VsyncWaiter$DisplayListener */
    public class DisplayListener implements DisplayManager.DisplayListener {
        private DisplayManager displayManager;

        public DisplayListener(DisplayManager displayManager2) {
            this.displayManager = displayManager2;
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.displayManager.getDisplay(0).getRefreshRate();
                long unused = VsyncWaiter.this.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
                VsyncWaiter.this.flutterJNI.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i) {
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, (Handler) null);
        }
    }

    private VsyncWaiter(FlutterJNI flutterJNI2) {
        this.flutterJNI = flutterJNI2;
    }

    public static VsyncWaiter getInstance(float f, FlutterJNI flutterJNI2) {
        if (instance == null) {
            instance = new VsyncWaiter(flutterJNI2);
        }
        flutterJNI2.setRefreshRateFPS(f);
        VsyncWaiter vsyncWaiter = instance;
        vsyncWaiter.refreshPeriodNanos = (long) (1.0E9d / ((double) f));
        return vsyncWaiter;
    }

    public static void reset() {
        instance = null;
        listener = null;
    }

    public void init() {
        this.flutterJNI.setAsyncWaitForVsyncDelegate(this.asyncWaitForVsyncDelegate);
    }

    public static VsyncWaiter getInstance(DisplayManager displayManager, FlutterJNI flutterJNI2) {
        if (instance == null) {
            instance = new VsyncWaiter(flutterJNI2);
        }
        if (listener == null) {
            VsyncWaiter vsyncWaiter = instance;
            Objects.requireNonNull(vsyncWaiter);
            DisplayListener displayListener = new DisplayListener(displayManager);
            listener = displayListener;
            displayListener.register();
        }
        if (instance.refreshPeriodNanos == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            instance.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI2.setRefreshRateFPS(refreshRate);
        }
        return instance;
    }
}
