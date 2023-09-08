package w23;

import android.graphics.Bitmap;
import android.util.Size;
import com.tencent.p014mm.xeffect.effect.IStickerDecoder;
import gy3.C87412m;

/* renamed from: w23.a */
public final class C102325a implements IStickerDecoder {

    /* renamed from: a */
    public Bitmap f301368a;

    public C102325a() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        C87412m.m108593f(createBitmap, "createBitmap(1, 1, Bitmap.Config.ALPHA_8)");
        this.f301368a = createBitmap;
    }

    public void destroy() {
    }

    public long duration() {
        return 1073741824;
    }

    public Bitmap getFrame() {
        return this.f301368a;
    }

    public void seekTo(long j) {
    }

    public Size size() {
        return new Size(0, 0);
    }
}
