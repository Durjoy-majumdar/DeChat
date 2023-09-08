package org.webrtc.audio;

import android.media.AudioRecord;
import java.util.concurrent.Callable;

public final /* synthetic */ class WebRtcAudioRecord$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ WebRtcAudioRecord f61880d;

    /* renamed from: e */
    public final /* synthetic */ AudioRecord f61881e;

    public /* synthetic */ WebRtcAudioRecord$$a(WebRtcAudioRecord webRtcAudioRecord, AudioRecord audioRecord) {
        this.f61880d = webRtcAudioRecord;
        this.f61881e = audioRecord;
    }

    public final Object call() {
        return this.f61880d.lambda$scheduleLogRecordingConfigurationsTask$0(this.f61881e);
    }
}
