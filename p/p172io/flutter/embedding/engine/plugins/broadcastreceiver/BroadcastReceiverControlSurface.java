package p172io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.lifecycle.C39623j;

/* renamed from: io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, C39623j jVar);

    void detachFromBroadcastReceiver();
}
