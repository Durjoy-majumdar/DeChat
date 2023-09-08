package p172io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import android.os.Looper;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.List;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.SharedBinaryMessenger;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.C117252a;
import p172io.flutter.plugin.common.StringCodec;
import p172io.flutter.view.FlutterCallbackInformation;

/* renamed from: io.flutter.embedding.engine.dart.DartExecutor */
public class DartExecutor implements BinaryMessenger {
    private static final String TAG = "DartExecutor";
    private final AssetManager assetManager;
    private final BinaryMessenger binaryMessenger;
    private final DartMessenger dartMessenger;
    private final FlutterJNI flutterJNI;
    private boolean isApplicationRunning = false;
    private final BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
    /* access modifiers changed from: private */
    public String isolateServiceId;
    /* access modifiers changed from: private */
    public IsolateServiceIdListener isolateServiceIdListener;

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DartCallback */
    public static class DartCallback {
        public final AssetManager androidAssetManager;
        public final FlutterCallbackInformation callbackHandle;
        public final String pathToBundle;

        public DartCallback(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.androidAssetManager = assetManager;
            this.pathToBundle = str;
            this.callbackHandle = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.pathToBundle + ", library path: " + this.callbackHandle.callbackLibraryPath + ", function: " + this.callbackHandle.callbackName + " )";
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DefaultBinaryMessenger */
    public static class DefaultBinaryMessenger implements BinaryMessenger {
        private final DartMessenger messenger;

        public void disableBufferingIncomingMessages() {
            this.messenger.disableBufferingIncomingMessages();
        }

        public void enableBufferingIncomingMessages() {
            this.messenger.enableBufferingIncomingMessages();
        }

        public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
            return C117252a.m165325c(this);
        }

        public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return this.messenger.makeBackgroundTaskQueue(taskQueueOptions);
        }

        public void send(String str, ByteBuffer byteBuffer) {
            this.messenger.send(str, byteBuffer, (BinaryMessenger.BinaryReply) null);
        }

        public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
            this.messenger.setMessageHandler(str, binaryMessageHandler);
        }

        private DefaultBinaryMessenger(DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            this.messenger.send(str, byteBuffer, binaryReply);
        }

        public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
            this.messenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$IsolateServiceIdListener */
    public interface IsolateServiceIdListener {
        void onIsolateServiceIdAvailable(String str);
    }

    public DartExecutor(FlutterJNI flutterJNI2, AssetManager assetManager2) {
        C1172311 r0 = new BinaryMessenger.BinaryMessageHandler() {
            public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
                String unused = DartExecutor.this.isolateServiceId = StringCodec.INSTANCE.decodeMessage(byteBuffer);
                if (DartExecutor.this.isolateServiceIdListener != null) {
                    DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.isolateChannelMessageHandler = r0;
        this.flutterJNI = flutterJNI2;
        this.assetManager = assetManager2;
        DartMessenger dartMessenger2 = new DartMessenger(flutterJNI2);
        this.dartMessenger = dartMessenger2;
        dartMessenger2.setMessageHandler("flutter/isolate", r0);
        this.binaryMessenger = new DefaultBinaryMessenger(dartMessenger2);
        if (flutterJNI2.isAttached()) {
            this.isApplicationRunning = true;
        }
    }

    @Deprecated
    public void disableBufferingIncomingMessages() {
        this.dartMessenger.disableBufferingIncomingMessages();
    }

    @Deprecated
    public void enableBufferingIncomingMessages() {
        this.dartMessenger.enableBufferingIncomingMessages();
    }

    public void executeDartCallback(DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            Log.m165292w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Trace.beginSection("DartExecutor#executeDartCallback");
        Log.m165290v(TAG, "Executing Dart callback: " + dartCallback);
        try {
            FlutterJNI flutterJNI2 = this.flutterJNI;
            String str = dartCallback.pathToBundle;
            FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
            flutterJNI2.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, (List<String>) null);
            this.isApplicationRunning = true;
        } finally {
            Trace.endSection();
        }
    }

    public void executeDartEntrypoint(DartEntrypoint dartEntrypoint) {
        executeDartEntrypoint(dartEntrypoint, (List<String>) null);
    }

    public BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public SharedBinaryMessenger getSharedBinaryMessenger() {
        return this.dartMessenger;
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return C117252a.m165325c(this);
    }

    @Deprecated
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.binaryMessenger.makeBackgroundTaskQueue(taskQueueOptions);
    }

    public void notifyLowMemoryWarning() {
        if (this.flutterJNI.isAttached()) {
            this.flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void onAttachedToJNI() {
        Log.m165290v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
        } else {
            this.flutterJNI.setPlatformMessageHandlerNotInMainThread(this.dartMessenger);
        }
    }

    public void onDetachedFromJNI() {
        Log.m165290v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler((PlatformMessageHandler) null);
    }

    @Deprecated
    public void send(String str, ByteBuffer byteBuffer) {
        this.binaryMessenger.send(str, byteBuffer);
    }

    public void setIsolateServiceIdListener(IsolateServiceIdListener isolateServiceIdListener2) {
        String str;
        this.isolateServiceIdListener = isolateServiceIdListener2;
        if (isolateServiceIdListener2 != null && (str = this.isolateServiceId) != null) {
            isolateServiceIdListener2.onIsolateServiceIdAvailable(str);
        }
    }

    @Deprecated
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler);
    }

    public void setSharedBinaryMessenger(SharedBinaryMessenger sharedBinaryMessenger) {
        this.dartMessenger.setSharedBinaryMessenger(sharedBinaryMessenger);
    }

    public void executeDartEntrypoint(DartEntrypoint dartEntrypoint, List<String> list) {
        if (this.isApplicationRunning) {
            Log.m165292w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Trace.beginSection("DartExecutor#executeDartEntrypoint");
        Log.m165290v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
        try {
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list);
            this.isApplicationRunning = true;
        } finally {
            Trace.endSection();
        }
    }

    @Deprecated
    public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        this.binaryMessenger.send(str, byteBuffer, binaryReply);
    }

    @Deprecated
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint */
    public static class DartEntrypoint {
        public final String dartEntrypointFunctionName;
        public final String dartEntrypointLibrary;
        public final String pathToBundle;

        public DartEntrypoint(String str, String str2) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = null;
            this.dartEntrypointFunctionName = str2;
        }

        public static DartEntrypoint createDefault() {
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            if (flutterLoader.initialized()) {
                return new DartEntrypoint(flutterLoader.findAppBundlePath(), FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DartEntrypoint dartEntrypoint = (DartEntrypoint) obj;
            if (!this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
                return false;
            }
            return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
        }

        public int hashCode() {
            return (this.pathToBundle.hashCode() * 31) + this.dartEntrypointFunctionName.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.pathToBundle + ", function: " + this.dartEntrypointFunctionName + " )";
        }

        public DartEntrypoint(String str, String str2, String str3) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = str2;
            this.dartEntrypointFunctionName = str3;
        }
    }
}
