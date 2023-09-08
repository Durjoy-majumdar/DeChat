package p172io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* renamed from: io.flutter.plugin.common.BinaryMessenger */
public interface BinaryMessenger {

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler */
    public interface BinaryMessageHandler {
        void onMessage(ByteBuffer byteBuffer, BinaryReply binaryReply);
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$BinaryReply */
    public interface BinaryReply {
        void reply(ByteBuffer byteBuffer);
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$TaskQueue */
    public interface TaskQueue {
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$TaskQueueOptions */
    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public TaskQueueOptions setIsSerial(boolean z) {
            this.isSerial = z;
            return this;
        }
    }

    void disableBufferingIncomingMessages();

    void enableBufferingIncomingMessages();

    TaskQueue makeBackgroundTaskQueue();

    TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions);

    void send(String str, ByteBuffer byteBuffer);

    void send(String str, ByteBuffer byteBuffer, BinaryReply binaryReply);

    void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler);

    void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler, TaskQueue taskQueue);
}
