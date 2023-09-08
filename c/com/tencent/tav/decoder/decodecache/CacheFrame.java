package com.tencent.tav.decoder.decodecache;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.decoder.ITexturePool;

class CacheFrame {
    public CMTime frameTime;
    public CMTime realFrameTime;
    public CMSampleBuffer sampleBuffer = null;
    public ITexturePool texturePool;

    public CacheFrame() {
        CMTime cMTime = CMTime.CMTimeInvalid;
        this.realFrameTime = cMTime;
        this.frameTime = cMTime;
    }
}
