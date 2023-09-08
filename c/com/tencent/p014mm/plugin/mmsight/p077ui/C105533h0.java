package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView;
import com.tencent.p014mm.plugin.mmsight.p077ui.cameraglview.MMSightCameraGLSurfaceView;
import i72.C108377g;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.h0 */
public class C105533h0 implements MMSightCaptureTouchView.C105491a {

    /* renamed from: a */
    public final /* synthetic */ SightCaptureUI f313931a;

    public C105533h0(SightCaptureUI sightCaptureUI) {
        this.f313931a = sightCaptureUI;
    }

    /* renamed from: a */
    public void mo128048a() {
        C108377g gVar;
        SightCaptureUI sightCaptureUI = this.f313931a;
        if (sightCaptureUI.f313866g != 0 && (gVar = sightCaptureUI.f313870i) != null) {
            gVar.mo158914q(true, false, 1);
        }
    }

    /* renamed from: b */
    public void mo128049b() {
        C108377g gVar;
        SightCaptureUI sightCaptureUI = this.f313931a;
        if (sightCaptureUI.f313866g != 0 && (gVar = sightCaptureUI.f313870i) != null) {
            gVar.mo158914q(false, false, 1);
        }
    }

    /* renamed from: c */
    public void mo128050c() {
        SightCaptureUI sightCaptureUI = this.f313931a;
        if (sightCaptureUI.f313866g != 0 && sightCaptureUI.f313886y0 > 1) {
            sightCaptureUI.f313870i.f324497P.removeMessages(4354);
            this.f313931a.mo150352U7();
        }
    }

    /* renamed from: e */
    public void mo128051e(float f, float f2) {
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        SightCaptureUI sightCaptureUI = this.f313931a;
        int i = sightCaptureUI.f313866g;
        if (i != 0 && i != 3 && i != 4 && (mMSightCameraGLSurfaceView = sightCaptureUI.f313824C) != null) {
            C108377g gVar = sightCaptureUI.f313870i;
            int width = mMSightCameraGLSurfaceView.getWidth();
            int height = this.f313931a.f313824C.getHeight();
            if (C11171e.m11044a(14)) {
                gVar.getClass();
            } else {
                gVar.f324497P.removeMessages(4354);
                C108377g.C108381d dVar = gVar.f324497P;
                dVar.f324526b = f;
                dVar.f324527c = f2;
                dVar.f324528d = width;
                dVar.f324529e = height;
                dVar.sendMessageDelayed(dVar.obtainMessage(4354, gVar.f324503h), 400);
            }
            SightCaptureUI sightCaptureUI2 = this.f313931a;
            CameraFrontSightView cameraFrontSightView = sightCaptureUI2.f313887z;
            if (cameraFrontSightView != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cameraFrontSightView.getLayoutParams();
                CameraFrontSightView cameraFrontSightView2 = sightCaptureUI2.f313887z;
                layoutParams.leftMargin = ((int) f) - (cameraFrontSightView2.f272136i / 2);
                layoutParams.topMargin = ((int) f2) - (cameraFrontSightView2.f272137j / 2);
                cameraFrontSightView2.setLayoutParams(layoutParams);
                CameraFrontSightView cameraFrontSightView3 = sightCaptureUI2.f313887z;
                cameraFrontSightView3.setVisibility(0);
                cameraFrontSightView3.f272132e = true;
                cameraFrontSightView3.f272133f = false;
                cameraFrontSightView3.f272134g = false;
                cameraFrontSightView3.f272135h = System.currentTimeMillis();
                cameraFrontSightView3.invalidate();
            }
        }
    }
}
