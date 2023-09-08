package p384tk;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: tk.b */
public final class C101898b implements C101900d {

    /* renamed from: a */
    public Bitmap f300056a;

    public C101898b() {
        Log.m105928w("MicroMsg.EmptyDecoder", "init: should not call this, something error");
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.f300056a = createBitmap;
    }

    /* renamed from: a */
    public int mo35630a() {
        return this.f300056a.getHeight();
    }

    /* renamed from: b */
    public void mo35631b() {
    }

    /* renamed from: c */
    public int mo35632c() {
        return this.f300056a.getWidth();
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
        return this.f300056a;
    }

    public void seekTo(long j) {
    }
}
