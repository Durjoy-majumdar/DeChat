package p346hh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteOrder;
import p213oh.C11412b;
import p213oh.C89209a;

/* renamed from: hh.h */
public class C117086h extends C117084e {
    public C117086h(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        int i7 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioVariableConvertProcess", "AudioVariableConvertProcess src:%s, srcSampleRate:%d, srcChannels:%d, srcBitDepth:%d, desSampleRate:%d, desChannels:%d, desBitDepth:%d", objArr);
        this.f350843k = C89209a.m111499a(str);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            C117083d.f350831a = true;
        } else {
            C117083d.f350831a = false;
        }
        if (i4 > 0) {
            this.f350837e = i4;
        }
        if (i5 > 0) {
            this.f350838f = i5;
        }
        if (i4 > 0 ? true : z) {
            this.f350839g = i6;
        }
        mo181038f(i, i2, i3);
    }
}
