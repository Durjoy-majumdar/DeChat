package com.tencent.p014mm.xeffect.effect;

import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "", "getDecoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "bytes", "", "path", "", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
/* renamed from: com.tencent.mm.xeffect.effect.IStickerDecoderFactory */
public interface IStickerDecoderFactory {
    IStickerDecoder getDecoder(String str);

    IStickerDecoder getDecoder(byte[] bArr);
}
