package com.tencent.p014mm.xeffect.effect;

import android.graphics.Bitmap;
import android.util.Size;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "", "Landroid/util/Size;", "size", "", "duration", "time", "Lrx3/b0;", "seekTo", "Landroid/graphics/Bitmap;", "getFrame", "destroy", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.IStickerDecoder */
public interface IStickerDecoder {
    void destroy();

    long duration();

    Bitmap getFrame();

    void seekTo(long j);

    Size size();
}
