package com.tencent.tav.decoder.decodecache;

class DecoderSegmentMsg {
    public final RequestStatus callbackObject;
    public final CacheSegment segment;

    public DecoderSegmentMsg(CacheSegment cacheSegment, RequestStatus requestStatus) {
        this.segment = cacheSegment;
        this.callbackObject = requestStatus;
    }
}
