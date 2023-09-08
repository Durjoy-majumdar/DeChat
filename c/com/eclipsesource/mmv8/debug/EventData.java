package com.eclipsesource.mmv8.debug;

import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8Object;

public class EventData implements Releasable {
    public V8Object v8Object;

    public EventData(V8Object v8Object2) {
        this.v8Object = v8Object2.twin();
    }

    public void release() {
        if (!this.v8Object.isReleased()) {
            this.v8Object.release();
        }
    }
}
