package p172io.flutter.embedding.engine;

import p172io.flutter.plugin.common.BinaryMessenger;

/* renamed from: io.flutter.embedding.engine.SharedBinaryMessenger */
public interface SharedBinaryMessenger {
    BinaryMessenger.BinaryMessageHandler getMessageHandler(String str);
}
