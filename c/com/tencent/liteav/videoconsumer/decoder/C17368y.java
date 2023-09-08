package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.decoder.C17340d;
import com.tencent.tavkit.component.TAVExporter;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.y */
final /* synthetic */ class C17368y implements C17340d.C17345d {

    /* renamed from: a */
    private static final C17368y f47090a = new C17368y();

    private C17368y() {
    }

    /* renamed from: a */
    public static C17340d.C17345d m17334a() {
        return f47090a;
    }

    /* renamed from: a */
    public final SpsInfo mo20421a(boolean z, ByteBuffer byteBuffer) {
        SpsInfo nativeDecodeSps = SpsInfo.nativeDecodeSps(z, byteBuffer);
        if (nativeDecodeSps == null) {
            nativeDecodeSps = new SpsInfo();
        }
        if (nativeDecodeSps.width <= 0 || nativeDecodeSps.height <= 0) {
            nativeDecodeSps.width = TAVExporter.VIDEO_EXPORT_WIDTH;
            nativeDecodeSps.height = 1280;
        }
        return nativeDecodeSps;
    }
}
