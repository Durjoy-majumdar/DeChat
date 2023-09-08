package com.tencent.p014mm.mediaplus;

import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/mediaplus/VideoSoftDecoderJni;", "", "mediaplus_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.mediaplus.VideoSoftDecoderJni */
public final class VideoSoftDecoderJni {
    public static final native int nDecodeSample(long j, ByteBuffer byteBuffer, int i);

    public static final native void nDestroy(long j);

    public static final native int nGetErrCode(long j);

    public static final native int nGetLineSize(long j);

    public static final native int nGetOutputBuffer(long j, ByteBuffer byteBuffer);

    public static final native int nGetOutputBufferSize(long j);

    public static final native long nInit(String str);
}
