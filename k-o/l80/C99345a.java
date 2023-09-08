package l80;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.Arrays;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: l80.a */
public class C99345a {

    /* renamed from: a */
    public String[] f291327a = {"OMX.oppo.h264.encoder"};

    public C99345a() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_supported_hardcode_encoder, "");
        C87412m.m108593f(Y60, "supportedHardcodeEncoderList");
        Object[] array = C112550d0.m153785U(Y60, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f291327a = (String[]) array;
        Log.m105924i("MicroMsg.VideoCodecConfig", "supportedHardcodeEncoderList : " + Y60 + "  supportedHardcodeEncoder size:" + this.f291327a.length);
        if (this.f291327a.length == 0) {
            C99346b.f291328a = false;
        }
    }

    /* renamed from: a */
    public final MediaCodecInfo mo138760a(String str) {
        C87412m.m108594g(str, "mimeType");
        int codecCount = MediaCodecList.getCodecCount();
        Log.m105924i("MicroMsg.VideoCodecConfig", "numCodec:" + codecCount);
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                Log.m105924i("MicroMsg.VideoCodecConfig", "config to use supportedHardcodeEncoder:" + Arrays.toString(this.f291327a));
                for (String i2 : this.f291327a) {
                    if (C112551y.m153809i(codecInfoAt.getName(), i2, true)) {
                        String[] supportedTypes = codecInfoAt.getSupportedTypes();
                        int length = supportedTypes.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            Log.m105924i("MicroMsg.VideoCodecConfig", "hardcodeEncoder: " + codecInfoAt.getName() + "  type:" + supportedTypes[i3]);
                            if (C112551y.m153809i(supportedTypes[i3], str, true)) {
                                C99346b.f291328a = true;
                                return codecInfoAt;
                            }
                        }
                        Log.m105924i("MicroMsg.VideoCodecConfig", "selectCodec from hardcodeEncoder " + this.f291327a + ": " + codecInfoAt.getName());
                    }
                }
                continue;
            }
        }
        for (int i4 = 0; i4 < codecCount; i4++) {
            MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(i4);
            if (codecInfoAt2.isEncoder()) {
                String[] supportedTypes2 = codecInfoAt2.getSupportedTypes();
                int length2 = supportedTypes2.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    Log.m105924i("MicroMsg.VideoCodecConfig", "selectCodec:  " + codecCount + "  type: " + supportedTypes2[i5]);
                    if (C112551y.m153809i(supportedTypes2[i5], str, true)) {
                        return codecInfoAt2;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
