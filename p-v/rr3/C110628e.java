package rr3;

import com.tencent.p014mm.xeffect.effect.IStickerDecoder;
import com.tencent.p014mm.xeffect.effect.IStickerDecoderFactory;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;

/* renamed from: rr3.e */
public final class C110628e implements IStickerDecoderFactory {
    public IStickerDecoder getDecoder(String str) {
        C87412m.m108595h(str, "path");
        return new C110649y(str);
    }

    public IStickerDecoder getDecoder(byte[] bArr) {
        C87412m.m108595h(bArr, ByteRange.BYTES_UNIT);
        return new C110649y(bArr);
    }
}
