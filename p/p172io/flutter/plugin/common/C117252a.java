package p172io.flutter.plugin.common;

import p172io.flutter.plugin.common.BinaryMessenger;

/* renamed from: io.flutter.plugin.common.a */
public final /* synthetic */ class C117252a {
    /* renamed from: a */
    public static void m165323a(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    /* renamed from: b */
    public static void m165324b(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    /* renamed from: c */
    public static BinaryMessenger.TaskQueue m165325c(BinaryMessenger binaryMessenger) {
        return binaryMessenger.makeBackgroundTaskQueue(new BinaryMessenger.TaskQueueOptions());
    }

    /* renamed from: d */
    public static BinaryMessenger.TaskQueue m165326d(BinaryMessenger binaryMessenger, BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }

    /* renamed from: e */
    public static void m165327e(BinaryMessenger binaryMessenger, String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        if (taskQueue == null) {
            binaryMessenger.setMessageHandler(str, binaryMessageHandler);
            return;
        }
        throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
    }
}
