package h23;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p914oj.C110052b;
import z04.C112550d0;

/* renamed from: h23.a */
public final class C108019a {

    /* renamed from: a */
    public static final C108019a f323464a = new C108019a();

    /* renamed from: a */
    public final boolean mo158414a(String str, String str2) {
        C87412m.m108594g(str, "src");
        C87412m.m108594g(str2, "dest");
        try {
            if (!C86013q1.m106450k(str)) {
                Log.m105924i("MicroMsg.SimpleAudioExtractor", "src empty :" + str);
                return false;
            }
            C86013q1.m106447h(str2);
            C86013q1.m106444e(str2);
            long l = C86013q1.m106451l(str);
            C110052b bVar = new C110052b();
            bVar.mo161392k(str);
            int d = bVar.mo161385d();
            int i = 0;
            while (true) {
                if (i >= d) {
                    i = -1;
                    break;
                }
                MediaFormat e = bVar.mo161386e(i);
                C87412m.m108593f(e, "extractor.getTrackFormat(trackIndex)");
                String string = e.getString("mime");
                C87412m.m108591d(string);
                if (C112550d0.m153801u(string, "audio", false)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            MediaFormat e2 = bVar.mo161386e(i);
            C87412m.m108593f(e2, "extractor.getTrackFormat(audioIndex)");
            String i2 = C86013q1.m106448i(str2, true);
            C87412m.m108591d(i2);
            MediaMuxer mediaMuxer = new MediaMuxer(i2, 0);
            mediaMuxer.addTrack(e2);
            mediaMuxer.start();
            Log.m105924i("MicroMsg.SimpleAudioExtractor", "[extract] src = " + str + ",length:" + l);
            ByteBuffer allocate = ByteBuffer.allocate(1048576);
            bVar.mo161390i(i);
            long currentTimeMillis = System.currentTimeMillis();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int f = bVar.mo161387f(allocate, 0);
                if (f < 0) {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                    bVar.mo161388g();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long l2 = C86013q1.m106451l(str2);
                    Log.m105918d("MicroMsg.SimpleAudioExtractor", "extract aac success:" + str2 + ", length:" + l2 + ", cost:" + (currentTimeMillis2 - currentTimeMillis) + LocaleUtil.MALAY);
                    return true;
                }
                bufferInfo.offset = 0;
                bufferInfo.size = f;
                bufferInfo.presentationTimeUs = bVar.mo161383b();
                bufferInfo.flags = bVar.f329324a.getSampleFlags();
                Log.m105918d("MicroMsg.SimpleAudioExtractor", "extract audio pts:" + bufferInfo.presentationTimeUs);
                mediaMuxer.writeSampleData(0, allocate, bufferInfo);
                bVar.mo161382a();
            }
        } catch (Exception e3) {
            Log.m105920e("MicroMsg.SimpleAudioExtractor", "extract aac error:" + e3.getMessage());
            return false;
        }
    }
}
