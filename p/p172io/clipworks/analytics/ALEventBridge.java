package p172io.clipworks.analytics;

import android.util.ArraySet;
import java.nio.ByteBuffer;
import java.util.Set;
import p172io.clipworks.analytics.ALS12;

/* renamed from: io.clipworks.analytics.ALEventBridge */
public class ALEventBridge {
    private final Set<ALEventSink> _eventSinks = new ArraySet();

    public void addEventSink(ALEventSink aLEventSink) {
        this._eventSinks.add(aLEventSink);
    }

    public boolean hasAnyEventSink() {
        return !this._eventSinks.isEmpty();
    }

    public void removeEventSink(ALEventSink aLEventSink) {
        this._eventSinks.remove(aLEventSink);
    }

    public void sinkEventS12(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                ALEvent S12LoadFrom = ALEvent.S12LoadFrom(ALS12.AnalyticsEvent.parseFrom(byteBuffer));
                if (S12LoadFrom != null) {
                    S12LoadFrom.embedParams();
                    for (ALEventSink sinkEvent : this._eventSinks) {
                        sinkEvent.sinkEvent(S12LoadFrom);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
