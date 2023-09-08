package com.tencent.tav.decoder.decodecache;

import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.ITexturePool;
import java.util.ArrayList;
import java.util.List;

class CacheSegment {
    public volatile List<CacheFrame> cacheFrameList = new ArrayList();
    public volatile CMTimeRange segmentTimeRange = null;

    public CacheSegment(CMTimeRange cMTimeRange) {
        this.segmentTimeRange = cMTimeRange;
    }

    private boolean isCacheFrameUsable(CacheFrame cacheFrame) {
        CMSampleBuffer cMSampleBuffer = cacheFrame.sampleBuffer;
        return (cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null) ? false : true;
    }

    public void clear() {
        for (CacheFrame next : this.cacheFrameList) {
            if (isCacheFrameUsable(next)) {
                next.texturePool.pushTexture(next.sampleBuffer.getTextureInfo());
                next.sampleBuffer = null;
            }
        }
        this.cacheFrameList.clear();
    }

    public CMTime getLastFrameTime() {
        return this.cacheFrameList.size() > 0 ? this.cacheFrameList.get(this.cacheFrameList.size() - 1).frameTime : this.segmentTimeRange.getEnd();
    }

    public CacheFrame popFrame(CMTime cMTime) {
        while (this.cacheFrameList.size() > 0) {
            CacheFrame cacheFrame = this.cacheFrameList.get(0);
            if (!cacheFrame.frameTime.smallThan(cMTime)) {
                return this.cacheFrameList.get(0);
            }
            if (isCacheFrameUsable(cacheFrame)) {
                ITexturePool iTexturePool = cacheFrame.texturePool;
                if (iTexturePool == null) {
                    cacheFrame.sampleBuffer.getTextureInfo().release();
                } else {
                    iTexturePool.pushTexture(cacheFrame.sampleBuffer.getTextureInfo());
                }
                cacheFrame.sampleBuffer = null;
            }
            this.cacheFrameList.remove(0);
        }
        return null;
    }

    public void pushFrame(CacheFrame cacheFrame) {
        for (int i = 0; i < this.cacheFrameList.size(); i++) {
            if (this.cacheFrameList.get(i).frameTime.bigThan(cacheFrame.frameTime)) {
                this.cacheFrameList.add(i, cacheFrame);
                return;
            }
        }
        this.cacheFrameList.add(cacheFrame);
    }
}
