package p172io.flutter.plugin.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import p172io.flutter.Log;
import p172io.flutter.plugin.common.BinaryMessenger;

/* renamed from: io.flutter.plugin.common.BasicMessageChannel */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";
    /* access modifiers changed from: private */
    public final MessageCodec<T> codec;
    private final BinaryMessenger messenger;
    /* access modifiers changed from: private */
    public final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$MessageHandler */
    public interface MessageHandler<T> {
        void onMessage(T t, Reply<T> reply);
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$Reply */
    public interface Reply<T> {
        void reply(T t);
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$IncomingMessageHandler */
    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage(BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() {
                    public void reply(T t) {
                        binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t));
                    }
                });
            } catch (RuntimeException e) {
                Log.m165287e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e);
                binaryReply.reply((ByteBuffer) null);
            }
        }

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$IncomingReplyHandler */
    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        public void reply(ByteBuffer byteBuffer) {
            try {
                this.callback.reply(BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e) {
                Log.m165287e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e);
            }
        }

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, (BinaryMessenger.TaskQueue) null);
    }

    public void resizeChannelBuffer(int i) {
        resizeChannelBuffer(this.messenger, this.name, i);
    }

    public void send(T t) {
        send(t, (Reply) null);
    }

    public void setMessageHandler(MessageHandler<T> messageHandler) {
        IncomingMessageHandler incomingMessageHandler = null;
        if (this.taskQueue != null) {
            BinaryMessenger binaryMessenger = this.messenger;
            String str = this.name;
            if (messageHandler != null) {
                incomingMessageHandler = new IncomingMessageHandler(messageHandler);
            }
            binaryMessenger.setMessageHandler(str, incomingMessageHandler, this.taskQueue);
            return;
        }
        BinaryMessenger binaryMessenger2 = this.messenger;
        String str2 = this.name;
        if (messageHandler != null) {
            incomingMessageHandler = new IncomingMessageHandler(messageHandler);
        }
        binaryMessenger2.setMessageHandler(str2, incomingMessageHandler);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue2) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue2;
    }

    public static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String str, int i) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, ByteBuffer.wrap(String.format(Locale.US, "resize\r%s\r%d", new Object[]{str, Integer.valueOf(i)}).getBytes(Charset.forName("UTF-8"))));
    }

    public void send(T t, Reply<T> reply) {
        BinaryMessenger binaryMessenger = this.messenger;
        String str = this.name;
        ByteBuffer encodeMessage = this.codec.encodeMessage(t);
        IncomingReplyHandler incomingReplyHandler = null;
        if (reply != null) {
            incomingReplyHandler = new IncomingReplyHandler(reply);
        }
        binaryMessenger.send(str, encodeMessage, incomingReplyHandler);
    }
}
