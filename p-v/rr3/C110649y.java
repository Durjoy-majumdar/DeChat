package rr3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.tencent.p014mm.xeffect.effect.IStickerDecoder;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;

/* renamed from: rr3.y */
public final class C110649y implements IStickerDecoder {

    /* renamed from: a */
    public final Bitmap f331007a;

    /* renamed from: b */
    public final int f331008b;

    /* renamed from: c */
    public final int f331009c;

    public C110649y(String str) {
        C87412m.m108595h(str, "path");
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        C87412m.m108590c(decodeFile, "BitmapFactory.decodeFile(path)");
        this.f331007a = decodeFile;
        this.f331008b = decodeFile.getWidth();
        this.f331009c = decodeFile.getHeight();
    }

    public void destroy() {
    }

    public long duration() {
        return 1073741824;
    }

    public Bitmap getFrame() {
        return this.f331007a;
    }

    public void seekTo(long j) {
    }

    public Size size() {
        return new Size(this.f331008b, this.f331009c);
    }

    public C110649y(byte[] bArr) {
        C87412m.m108595h(bArr, ByteRange.BYTES_UNIT);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        C87412m.m108590c(decodeByteArray, "BitmapFactory.decodeByte…ray(bytes, 0, bytes.size)");
        this.f331007a = decodeByteArray;
        this.f331008b = decodeByteArray.getWidth();
        this.f331009c = decodeByteArray.getHeight();
    }
}
