package p172io.flutter.embedding.engine.plugins.broadcastreceiver;

/* renamed from: io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware */
public interface BroadcastReceiverAware {
    void onAttachedToBroadcastReceiver(BroadcastReceiverPluginBinding broadcastReceiverPluginBinding);

    void onDetachedFromBroadcastReceiver();
}
