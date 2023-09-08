package p172io.flutter.embedding.engine.dart;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.SharedBinaryMessenger;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.C117252a;

/* renamed from: io.flutter.embedding.engine.dart.DartMessenger */
class DartMessenger implements BinaryMessenger, PlatformMessageHandler, SharedBinaryMessenger {
    private static final String TAG = "DartMessenger";
    private Map<String, List<BufferedMessageInfo>> bufferedMessages;
    private WeakHashMap<BinaryMessenger.TaskQueue, DartMessengerTaskQueue> createdTaskQueues;
    private final AtomicBoolean enableBufferingIncomingMessages;
    private final FlutterJNI flutterJNI;
    private final Object handlersLock;
    private final Map<String, HandlerInfo> messageHandlers;
    private int nextReplyId;
    private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies;
    private final DartMessengerTaskQueue platformTaskQueue;
    private SharedBinaryMessenger sharedBinaryMessenger;
    private TaskQueueFactory taskQueueFactory;

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$BufferedMessageInfo */
    public static class BufferedMessageInfo {
        public final ByteBuffer message;
        public long messageData;
        public int replyId;

        public BufferedMessageInfo(ByteBuffer byteBuffer, int i, long j) {
            this.message = byteBuffer;
            this.replyId = i;
            this.messageData = j;
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$ConcurrentTaskQueue */
    public static class ConcurrentTaskQueue implements DartMessengerTaskQueue {
        private final ExecutorService executor;

        public ConcurrentTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        public void dispatch(Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$DartMessengerTaskQueue */
    public interface DartMessengerTaskQueue {
        void dispatch(Runnable runnable);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$DefaultTaskQueueFactory */
    public static class DefaultTaskQueueFactory implements TaskQueueFactory {
        public ExecutorService executorService = FlutterInjector.instance().executorService();

        public DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return taskQueueOptions.getIsSerial() ? new SerialTaskQueue(this.executorService) : new ConcurrentTaskQueue(this.executorService);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo */
    public static class HandlerInfo {
        public final BinaryMessenger.BinaryMessageHandler handler;
        public final DartMessengerTaskQueue taskQueue;

        public HandlerInfo(BinaryMessenger.BinaryMessageHandler binaryMessageHandler, DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.handler = binaryMessageHandler;
            this.taskQueue = dartMessengerTaskQueue;
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$Reply */
    public static class Reply implements BinaryMessenger.BinaryReply {
        private final AtomicBoolean done = new AtomicBoolean(false);
        private final FlutterJNI flutterJNI;
        private final int replyId;

        public Reply(FlutterJNI flutterJNI2, int i) {
            this.flutterJNI = flutterJNI2;
            this.replyId = i;
        }

        public void reply(ByteBuffer byteBuffer) {
            if (this.done.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
            } else {
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue */
    public static class SerialTaskQueue implements DartMessengerTaskQueue {
        private final ExecutorService executor;
        private final AtomicBoolean isRunning = new AtomicBoolean(false);
        private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

        public SerialTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: flush */
        public void lambda$flush$1() {
            if (this.isRunning.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.queue.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.isRunning.set(false);
                    if (!this.queue.isEmpty()) {
                        this.executor.execute(new DartMessenger$SerialTaskQueue$$a(this));
                    }
                }
            }
        }

        public void dispatch(Runnable runnable) {
            this.queue.add(runnable);
            this.executor.execute(new DartMessenger$SerialTaskQueue$$b(this));
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$TaskQueueFactory */
    public interface TaskQueueFactory {
        DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$TaskQueueToken */
    public static class TaskQueueToken implements BinaryMessenger.TaskQueue {
        private TaskQueueToken() {
        }
    }

    public DartMessenger(FlutterJNI flutterJNI2, TaskQueueFactory taskQueueFactory2) {
        this.messageHandlers = new HashMap();
        this.bufferedMessages = new HashMap();
        this.handlersLock = new Object();
        this.enableBufferingIncomingMessages = new AtomicBoolean(false);
        this.pendingReplies = new HashMap();
        this.nextReplyId = 1;
        this.platformTaskQueue = new PlatformTaskQueue();
        this.createdTaskQueues = new WeakHashMap<>();
        this.flutterJNI = flutterJNI2;
        this.taskQueueFactory = taskQueueFactory2;
    }

    private void dispatchMessageToQueue(String str, HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i, long j) {
        HandlerInfo handlerInfo2 = handlerInfo;
        DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo2 != null ? handlerInfo2.taskQueue : null;
        DartMessenger$$a dartMessenger$$a = new DartMessenger$$a(this, str, handlerInfo, byteBuffer, i, j);
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.platformTaskQueue;
        }
        dartMessengerTaskQueue.dispatch(dartMessenger$$a);
    }

    private static void handleError(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    private void invokeHandler(String str, HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i) {
        SharedBinaryMessenger sharedBinaryMessenger2;
        BinaryMessenger.BinaryMessageHandler messageHandler;
        if (handlerInfo == null && (sharedBinaryMessenger2 = this.sharedBinaryMessenger) != null && (messageHandler = sharedBinaryMessenger2.getMessageHandler(str)) != null) {
            messageHandler.onMessage(byteBuffer, new Reply(this.flutterJNI, i));
        } else if (handlerInfo != null) {
            try {
                Log.m165290v(TAG, "Deferring to registered handler to process message.");
                handlerInfo.handler.onMessage(byteBuffer, new Reply(this.flutterJNI, i));
            } catch (Exception e) {
                Log.m165287e(TAG, "Uncaught exception in binary message listener", e);
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
            } catch (Error e2) {
                handleError(e2);
            }
        } else {
            Log.m165290v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$dispatchMessageToQueue$0(String str, HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i, long j) {
        Trace.beginSection("DartMessenger#handleMessageFromDart on " + str);
        try {
            invokeHandler(str, handlerInfo, byteBuffer, i);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.flutterJNI.cleanupMessageData(j);
            Trace.endSection();
        }
    }

    public void disableBufferingIncomingMessages() {
        Map<String, List<BufferedMessageInfo>> map;
        synchronized (this.handlersLock) {
            this.enableBufferingIncomingMessages.set(false);
            map = this.bufferedMessages;
            this.bufferedMessages = new HashMap();
        }
        for (Map.Entry next : map.entrySet()) {
            for (BufferedMessageInfo bufferedMessageInfo : (List) next.getValue()) {
                dispatchMessageToQueue((String) next.getKey(), (HandlerInfo) null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    public void enableBufferingIncomingMessages() {
        this.enableBufferingIncomingMessages.set(true);
    }

    public BinaryMessenger.BinaryMessageHandler getMessageHandler(String str) {
        HandlerInfo handlerInfo = this.messageHandlers.get(str);
        if (handlerInfo != null) {
            return handlerInfo.handler;
        }
        return null;
    }

    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    public void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i, long j) {
        HandlerInfo handlerInfo;
        boolean z;
        Log.m165290v(TAG, "Received message from Dart over channel '" + str + "'");
        synchronized (this.handlersLock) {
            handlerInfo = this.messageHandlers.get(str);
            z = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
            if (z) {
                if (!this.bufferedMessages.containsKey(str)) {
                    this.bufferedMessages.put(str, new LinkedList());
                }
                this.bufferedMessages.get(str).add(new BufferedMessageInfo(byteBuffer, i, j));
            }
        }
        if (!z) {
            dispatchMessageToQueue(str, handlerInfo, byteBuffer, i, j);
        }
    }

    public void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        Log.m165290v(TAG, "Received message reply from Dart.");
        BinaryMessenger.BinaryReply remove = this.pendingReplies.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                Log.m165290v(TAG, "Invoking registered callback for reply from Dart.");
                remove.reply(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e) {
                Log.m165287e(TAG, "Uncaught exception in binary message reply handler", e);
            } catch (Error e2) {
                handleError(e2);
            }
        }
    }

    public /* synthetic */ BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return C117252a.m165325c(this);
    }

    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        DartMessengerTaskQueue makeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(taskQueueOptions);
        TaskQueueToken taskQueueToken = new TaskQueueToken();
        this.createdTaskQueues.put(taskQueueToken, makeBackgroundTaskQueue);
        return taskQueueToken;
    }

    public void send(String str, ByteBuffer byteBuffer) {
        Log.m165290v(TAG, "Sending message over channel '" + str + "'");
        send(str, byteBuffer, (BinaryMessenger.BinaryReply) null);
    }

    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        setMessageHandler(str, binaryMessageHandler, (BinaryMessenger.TaskQueue) null);
    }

    public void setSharedBinaryMessenger(SharedBinaryMessenger sharedBinaryMessenger2) {
        if (sharedBinaryMessenger2 != this) {
            this.sharedBinaryMessenger = sharedBinaryMessenger2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (p172io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo) r10.next();
        dispatchMessageToQueue(r9, r8.messageHandlers.get(r9), r11.message, r11.replyId, r11.messageData);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMessageHandler(java.lang.String r9, p172io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler r10, p172io.flutter.plugin.common.BinaryMessenger.TaskQueue r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p172io.flutter.Log.m165290v(r10, r11)
            java.lang.Object r0 = r8.handlersLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo> r10 = r8.messageHandlers     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<io.flutter.plugin.common.BinaryMessenger$TaskQueue, io.flutter.embedding.engine.dart.DartMessenger$DartMessengerTaskQueue> r0 = r8.createdTaskQueues
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            io.flutter.embedding.engine.dart.DartMessenger$DartMessengerTaskQueue r0 = (p172io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p172io.flutter.Log.m165290v(r11, r1)
            java.lang.Object r11 = r8.handlersLock
            monitor-enter(r11)
            java.util.Map<java.lang.String, io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo> r1 = r8.messageHandlers     // Catch:{ all -> 0x009c }
            io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo r2 = new io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<io.flutter.embedding.engine.dart.DartMessenger$BufferedMessageInfo>> r10 = r8.bufferedMessages     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            io.flutter.embedding.engine.dart.DartMessenger$BufferedMessageInfo r11 = (p172io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo) r11
            java.util.Map<java.lang.String, io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo> r0 = r8.messageHandlers
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo r3 = (p172io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo) r3
            java.nio.ByteBuffer r4 = r11.message
            int r5 = r11.replyId
            long r6 = r11.messageData
            r1 = r8
            r2 = r9
            r1.dispatchMessageToQueue(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.embedding.engine.dart.DartMessenger.setMessageHandler(java.lang.String, io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler, io.flutter.plugin.common.BinaryMessenger$TaskQueue):void");
    }

    public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        Trace.beginSection("DartMessenger#send on " + str);
        Log.m165290v(TAG, "Sending message with callback over channel '" + str + "'");
        try {
            int i = this.nextReplyId;
            this.nextReplyId = i + 1;
            if (binaryReply != null) {
                this.pendingReplies.put(Integer.valueOf(i), binaryReply);
            }
            if (byteBuffer == null) {
                this.flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                this.flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
        } finally {
            Trace.endSection();
        }
    }

    public DartMessenger(FlutterJNI flutterJNI2) {
        this(flutterJNI2, new DefaultTaskQueueFactory());
    }
}
