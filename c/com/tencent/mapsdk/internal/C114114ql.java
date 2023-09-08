package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.mapsdk.internal.C113905ky;

/* renamed from: com.tencent.mapsdk.internal.ql */
public class C114114ql extends C113863ju {

    /* renamed from: g */
    private static C113905ky.C113910a f341576g = new C113905ky.C113910a(Bitmap.Config.ARGB_8888);

    public C114114ql() {
        C113863ju.m157340a(f341576g);
    }

    /* renamed from: f */
    public final boolean mo172248f() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled() && this.f340644b.get() <= 0) {
            this.f340645c.recycle();
            C113896kq.m157677f(C0949kl.f2248r).mo172332a("tileBitmap recycle out");
        }
        this.f340646d = null;
        Bitmap bitmap2 = this.f340645c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    public C114114ql(byte[] bArr) {
        super(bArr);
        C113863ju.m157340a(f341576g);
    }
}
