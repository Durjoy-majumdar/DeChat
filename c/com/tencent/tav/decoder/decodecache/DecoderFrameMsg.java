package com.tencent.tav.decoder.decodecache;

import com.tencent.tav.coremedia.CMTime;
import java.util.concurrent.CountDownLatch;

class DecoderFrameMsg {
    public final CountDownLatch finishWait;
    public final CMTime time;

    public DecoderFrameMsg(CMTime cMTime, CountDownLatch countDownLatch) {
        this.time = cMTime;
        this.finishWait = countDownLatch;
    }
}
