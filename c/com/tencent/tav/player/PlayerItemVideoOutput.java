package com.tencent.tav.player;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.VideoTexture;
import java.util.HashMap;

public class PlayerItemVideoOutput extends PlayerItemOutput {
    public PlayerItemVideoOutput(HashMap<String, Object> hashMap) {
    }

    public VideoTexture copyPixelBufferForItemTime(CMTime cMTime, CMTime cMTime2) {
        return null;
    }

    public boolean hasNewPixelBufferForItemTime(CMTime cMTime) {
        return false;
    }
}
