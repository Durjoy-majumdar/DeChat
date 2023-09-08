package p172io.clipworks.analytics;

import com.facebook.jni.HybridData;

/* renamed from: io.clipworks.analytics.ALManager */
public class ALManager {
    private static ALManager _sInstance;
    private ALEventBridge _eventBridge = null;
    private final HybridData mHybridData = initHybrid();

    private ALManager() {
    }

    private native HybridData initHybrid();

    private native void nativeInitReporter();

    private native void nativeRegisterDefaultFileSink();

    private native void nativeRegisterEventBridge(ALEventBridge aLEventBridge);

    private native void nativeShutdownReporter();

    private native void nativeUnregisterEventBridge();

    public static ALManager sharedInstance() {
        if (_sInstance == null) {
            _sInstance = new ALManager();
        }
        return _sInstance;
    }

    public void initReporter() {
        nativeInitReporter();
    }

    public void registerDefaultFileSink() {
        nativeRegisterDefaultFileSink();
    }

    public void registerEventSink(ALEventSink aLEventSink) {
        if (aLEventSink != null) {
            if (this._eventBridge == null) {
                ALEventBridge aLEventBridge = new ALEventBridge();
                this._eventBridge = aLEventBridge;
                nativeRegisterEventBridge(aLEventBridge);
            }
            this._eventBridge.addEventSink(aLEventSink);
        }
    }

    public void shutdownReporter() {
        nativeShutdownReporter();
    }

    public void unregisterEventSink(ALEventSink aLEventSink) {
        ALEventBridge aLEventBridge;
        if (aLEventSink != null && (aLEventBridge = this._eventBridge) != null) {
            aLEventBridge.removeEventSink(aLEventSink);
            if (!this._eventBridge.hasAnyEventSink()) {
                nativeUnregisterEventBridge();
                this._eventBridge = null;
            }
        }
    }
}
