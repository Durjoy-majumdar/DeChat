package com.tencent.p014mm.xeffect.effect;

import android.graphics.Bitmap;
import android.util.Size;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/StickerDecoderWrapper;", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "Landroid/util/Size;", "size", "", "sizeInArray", "", "duration", "time", "Lrx3/b0;", "seekTo", "Landroid/graphics/Bitmap;", "getFrame", "destroy", "decoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "getDecoder", "()Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "<init>", "(Lcom/tencent/mm/xeffect/effect/IStickerDecoder;)V", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.StickerDecoderWrapper */
public final class StickerDecoderWrapper implements IStickerDecoder {
    private final IStickerDecoder decoder;

    public StickerDecoderWrapper(IStickerDecoder iStickerDecoder) {
        C87412m.m108595h(iStickerDecoder, "decoder");
        this.decoder = iStickerDecoder;
    }

    public void destroy() {
        this.decoder.destroy();
    }

    public long duration() {
        return this.decoder.duration();
    }

    public final IStickerDecoder getDecoder() {
        return this.decoder;
    }

    public Bitmap getFrame() {
        return this.decoder.getFrame();
    }

    public void seekTo(long j) {
        this.decoder.seekTo(j);
    }

    public Size size() {
        return this.decoder.size();
    }

    public final int[] sizeInArray() {
        Size size = this.decoder.size();
        return new int[]{size.getWidth(), size.getHeight()};
    }
}
