package com.tencent.tav.decoder.decodecache;

import java.util.concurrent.atomic.AtomicBoolean;

class RequestStatus {
    private volatile AtomicBoolean finish = new AtomicBoolean(false);

    public boolean getFinish() {
        return this.finish.get();
    }

    public void setFinish(boolean z) {
        this.finish.set(z);
    }
}
