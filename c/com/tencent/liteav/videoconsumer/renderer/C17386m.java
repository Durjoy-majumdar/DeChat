package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.m */
final /* synthetic */ class C17386m implements Runnable {

    /* renamed from: a */
    private final C17383i f47161a;

    private C17386m(C17383i iVar) {
        this.f47161a = iVar;
    }

    /* renamed from: a */
    public static Runnable m17393a(C17383i iVar) {
        return new C17386m(iVar);
    }

    public final void run() {
        C17383i iVar = this.f47161a;
        Bitmap b = iVar.mo20477b((Bitmap) null);
        if (b != null) {
            PixelFrame createFromBitmap = PixelFrame.createFromBitmap(b);
            if (!iVar.mo20479b(createFromBitmap)) {
                createFromBitmap.release();
                return;
            }
            C104507p pVar = iVar.f47133g;
            OpenGlUtils.glViewport(0, 0, pVar.f309736a, pVar.f309737b);
            iVar.mo20476a(createFromBitmap, false, false, Rotation.NORMAL, iVar.f47139m, false);
            iVar.mo20480c();
        }
    }
}
