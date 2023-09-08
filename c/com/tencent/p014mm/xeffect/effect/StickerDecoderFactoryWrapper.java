package com.tencent.p014mm.xeffect.effect;

import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/StickerDecoderFactoryWrapper;", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "(Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;)V", "getFactory", "()Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "getDecoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "bytes", "", "path", "", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
/* renamed from: com.tencent.mm.xeffect.effect.StickerDecoderFactoryWrapper */
public final class StickerDecoderFactoryWrapper implements IStickerDecoderFactory {
    private final IStickerDecoderFactory factory;

    public StickerDecoderFactoryWrapper(IStickerDecoderFactory iStickerDecoderFactory) {
        C87412m.m108595h(iStickerDecoderFactory, "factory");
        this.factory = iStickerDecoderFactory;
    }

    public IStickerDecoder getDecoder(String str) {
        C87412m.m108595h(str, "path");
        return new StickerDecoderWrapper(this.factory.getDecoder(str));
    }

    public final IStickerDecoderFactory getFactory() {
        return this.factory;
    }

    public IStickerDecoder getDecoder(byte[] bArr) {
        C87412m.m108595h(bArr, ByteRange.BYTES_UNIT);
        return new StickerDecoderWrapper(this.factory.getDecoder(bArr));
    }
}
