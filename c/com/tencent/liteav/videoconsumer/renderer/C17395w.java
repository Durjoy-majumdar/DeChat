package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104519h;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C17263h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.w */
final /* synthetic */ class C17395w implements Runnable {

    /* renamed from: a */
    private final C17383i f47178a;

    private C17395w(C17383i iVar) {
        this.f47178a = iVar;
    }

    /* renamed from: a */
    public static Runnable m17402a(C17383i iVar) {
        return new C17395w(iVar);
    }

    public final void run() {
        C17383i iVar = this.f47178a;
        PixelFrame a = iVar.f47138l.mo20217a();
        if (a == null) {
            LiteavLog.m16896d("VideoRenderer", "renderFrameInternal pixelFrame is null!");
            return;
        }
        if (iVar.f47136j != null && iVar.mo20479b(a)) {
            C104519h<?> hVar = iVar.f47136j.f309784a;
            C104507p pVar = hVar == null ? new C104507p(0, 0) : hVar.mo147192e();
            int i = pVar.f309736a;
            C104507p pVar2 = iVar.f47133g;
            if (!(i == pVar2.f309736a && pVar.f309737b == pVar2.f309737b)) {
                LiteavLog.m16902i("VideoRenderer", "surface size changed %dx%d", Integer.valueOf(i), Integer.valueOf(pVar.f309737b));
                C104507p pVar3 = iVar.f47133g;
                pVar3.f309736a = pVar.f309736a;
                pVar3.f309737b = pVar.f309737b;
                iVar.mo20481d();
                C104507p pVar4 = iVar.f47133g;
                iVar.f47137k = new C17234j(pVar4.f309736a, pVar4.f309737b);
            }
        }
        if (!iVar.mo20479b(a)) {
            a.release();
            return;
        }
        C104507p pVar5 = iVar.f47133g;
        OpenGlUtils.glViewport(0, 0, pVar5.f309736a, pVar5.f309737b);
        iVar.mo20476a(a, iVar.f47141o, iVar.f47142p, iVar.f47140n, iVar.f47139m, true);
        if (iVar.f47145s != null) {
            OpenGlUtils.bindFramebuffer(36160, 0);
            C104507p pVar6 = iVar.f47133g;
            int i2 = pVar6.f309736a;
            int i3 = pVar6.f309737b;
            TakeSnapshotListener takeSnapshotListener = iVar.f47145s;
            if (takeSnapshotListener != null) {
                iVar.f47145s = null;
                int i4 = i2 * i3 * 4;
                try {
                    ByteBuffer order = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    order.position(0);
                    GLES20.glReadPixels(0, 0, i2, i3, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, order);
                    iVar.f47127a.post(new C104523k(iVar, iVar.f47129c, order, i2, i3, takeSnapshotListener));
                } catch (Throwable unused) {
                    LiteavLog.m16898e("VideoRenderer", "can't alloc buffer, size: " + i4);
                    takeSnapshotListener.onComplete((Bitmap) null);
                }
            }
        }
        iVar.mo20480c();
        VideoRenderListener videoRenderListener = iVar.f47146t;
        if (videoRenderListener != null) {
            videoRenderListener.onRenderFrame(a);
        }
        if (iVar.f47147u) {
            iVar.f47128b.notifyEvent(C17263h.C17269b.EVT_VIDEO_RENDER_FIRST_FRAME_ON_VIEW, (String) null, new Object[0]);
            iVar.f47147u = false;
        }
        a.release();
    }
}
