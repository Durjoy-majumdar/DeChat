package com.tencent.liteav.videoconsumer.consumer;

import android.view.Surface;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17253a;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.h */
final /* synthetic */ class C17284h implements Runnable {

    /* renamed from: a */
    private final C17272a f46821a;

    /* renamed from: b */
    private final PixelFrame f46822b;

    private C17284h(C17272a aVar, PixelFrame pixelFrame) {
        this.f46821a = aVar;
        this.f46822b = pixelFrame;
    }

    /* renamed from: a */
    public static Runnable m17189a(C17272a aVar, PixelFrame pixelFrame) {
        return new C17284h(aVar, pixelFrame);
    }

    public final void run() {
        Rotation rotation;
        C17272a aVar = this.f46821a;
        PixelFrame pixelFrame = this.f46822b;
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        pixelFrame2.setRotation(Rotation.m139836a((pixelFrame2.getRotation().mValue + aVar.f46797m.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1));
        if (aVar.f46798n) {
            pixelFrame2.setMirrorHorizontal(!pixelFrame2.isMirrorHorizontal());
        }
        if (aVar.f46799o) {
            pixelFrame2.setMirrorVertical(!pixelFrame2.isMirrorVertical());
        }
        Rotation rotation2 = aVar.f46797m;
        if (rotation2 == Rotation.ROTATION_90 || rotation2 == Rotation.ROTATION_270) {
            int width = pixelFrame2.getWidth();
            pixelFrame2.setWidth(pixelFrame2.getHeight());
            pixelFrame2.setHeight(width);
        }
        Object gLContext = pixelFrame2.getGLContext();
        if (((gLContext == null || gLContext == aVar.f46796l) && aVar.f46785a != null && aVar.f46795k == pixelFrame2.getHeight() && aVar.f46794j == pixelFrame2.getWidth()) ? false : true) {
            if (!(aVar.f46794j == pixelFrame2.getWidth() && aVar.f46795k == pixelFrame2.getHeight())) {
                aVar.f46794j = pixelFrame2.getWidth();
                aVar.f46795k = pixelFrame2.getHeight();
            }
            aVar.mo20302a();
            int i = aVar.f46794j;
            int i2 = aVar.f46795k;
            Object gLContext2 = pixelFrame2.getGLContext();
            if (aVar.f46785a != null) {
                LiteavLog.m16905w("CustomRenderProcess", "egl is initialized!");
            } else {
                try {
                    LiteavLog.m16902i("CustomRenderProcess", "egl init %d*%d", Integer.valueOf(i), Integer.valueOf(i2));
                    C104516e eVar = new C104516e();
                    aVar.f46785a = eVar;
                    eVar.mo147196a(gLContext2, (Surface) null, i, i2);
                    aVar.f46785a.mo147195a();
                } catch (C104518g e) {
                    LiteavLog.m16899e("CustomRenderProcess", "egl initialize failed.", (Throwable) e);
                    aVar.f46785a = null;
                }
                if (aVar.f46785a != null) {
                    aVar.f46796l = gLContext2;
                    if (aVar.f46792h == null) {
                        aVar.f46792h = new C17234j(i, i2);
                    }
                    aVar.f46793i = new C17223e();
                    if (aVar.f46790f == null) {
                        C17257e eVar2 = new C17257e();
                        aVar.f46790f = eVar2;
                        eVar2.mo20260a(new C17253a(aVar.f46794j, aVar.f46795k), aVar.f46789e, aVar.f46788d, 0, aVar);
                        aVar.f46790f.mo20259a(aVar.f46793i);
                    }
                }
            }
        }
        C104516e eVar3 = aVar.f46785a;
        if (eVar3 != null) {
            try {
                eVar3.mo147195a();
            } catch (C104518g e2) {
                LiteavLog.m16898e("CustomRenderProcess", "customRenderFrame makeCurrent error " + e2.toString());
            }
            if (aVar.f46787c) {
                aVar.f46787c = false;
                aVar.f46790f.mo20257a(0, (C17257e.C17258a) aVar);
                aVar.f46790f.mo20260a(new C17253a(aVar.f46794j, aVar.f46795k), aVar.f46789e, aVar.f46788d, 0, aVar);
            }
            C17222d a = aVar.f46793i.mo20199a(aVar.f46794j, aVar.f46795k);
            GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
            PixelFrame pixelFrame3 = new PixelFrame(pixelFrame2);
            if (a == null) {
                pixelFrame3.setMirrorVertical(!pixelFrame3.isMirrorVertical());
                if (!(pixelFrame3.getRotation() == Rotation.NORMAL || pixelFrame3.getRotation() == (rotation = Rotation.ROTATION_180))) {
                    pixelFrame3.setRotation(Rotation.m139836a((pixelFrame3.getRotation().mValue + rotation.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1));
                }
            }
            C17234j jVar = aVar.f46792h;
            if (jVar != null) {
                jVar.mo20210a(pixelFrame3, gLScaleType, a);
            }
            C17257e eVar4 = aVar.f46790f;
            if (eVar4 != null) {
                eVar4.mo20258a(pixelFrame2.getTimestamp(), a);
            }
            a.release();
        }
        pixelFrame.release();
    }
}
