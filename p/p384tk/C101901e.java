package p384tk;

import android.graphics.Bitmap;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;

/* renamed from: tk.e */
public final class C101901e implements C101900d {

    /* renamed from: a */
    public Bitmap f300061a;

    public C101901e(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            C87412m.m108593f(bitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        }
        this.f300061a = bitmap;
        bitmap.setDensity(C0947jz.f2205e);
    }

    /* renamed from: a */
    public int mo35630a() {
        return this.f300061a.getHeight();
    }

    /* renamed from: b */
    public void mo35631b() {
    }

    /* renamed from: c */
    public int mo35632c() {
        return this.f300061a.getWidth();
    }

    /* renamed from: d */
    public int mo35633d() {
        return Integer.MAX_VALUE;
    }

    public void destroy() {
    }

    /* renamed from: e */
    public int mo35635e() {
        return 1;
    }

    public Bitmap getFrame() {
        return this.f300061a;
    }

    public void seekTo(long j) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C101901e(byte[] bArr) {
        this(BitmapUtil.decodeByteArray(bArr));
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
    }
}
