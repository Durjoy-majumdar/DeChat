package android.p293os;

/* renamed from: android.os.HapticPlayer */
public class HapticPlayer {
    private static final String TAG = "HapticPlayer";
    public DynamicEffect mEffect;

    private HapticPlayer() {
    }

    public static boolean isAvailable() {
        return false;
    }

    public void start(int i) {
    }

    public void start(int i, int i2, int i3) {
    }

    public void start(int i, int i2, int i3, int i4) {
    }

    public void stop() {
    }

    public void updateAmplitude(int i) {
    }

    public void updateFrequency(int i) {
    }

    public void updateInterval(int i) {
    }

    public void updateParameter(int i, int i2, int i3) {
    }

    public HapticPlayer(DynamicEffect dynamicEffect) {
        this();
        this.mEffect = dynamicEffect;
    }
}
