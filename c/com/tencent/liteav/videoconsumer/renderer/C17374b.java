package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.p899ui.TXCloudVideoView;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.b */
final /* synthetic */ class C17374b implements Runnable {

    /* renamed from: a */
    private final C17370a f47105a;

    /* renamed from: b */
    private final DisplayTarget f47106b;

    private C17374b(C17370a aVar, DisplayTarget displayTarget) {
        this.f47105a = aVar;
        this.f47106b = displayTarget;
    }

    /* renamed from: a */
    public static Runnable m17353a(C17370a aVar, DisplayTarget displayTarget) {
        return new C17374b(aVar, displayTarget);
    }

    public final void run() {
        C17370a aVar = this.f47105a;
        DisplayTarget displayTarget = this.f47106b;
        if (displayTarget == null) {
            if (aVar.mo20452a()) {
                if (aVar.f47096e.getType() == DisplayTarget.C17252a.SURFACE) {
                    aVar.mo20446a((Surface) null);
                } else if (aVar.f47096e.getType() == DisplayTarget.C17252a.SURFACEVIEW) {
                    aVar.mo20448a((SurfaceView) null);
                } else if (aVar.f47096e.getType() == DisplayTarget.C17252a.TEXTUREVIEW) {
                    aVar.mo20454b((TextureView) null);
                } else if (aVar.f47096e.getType() == DisplayTarget.C17252a.TXCLOUDVIEW) {
                    aVar.mo20457e();
                    aVar.mo20453b();
                    aVar.mo20455c();
                }
                aVar.f47096e = null;
            }
        } else if (displayTarget.getType() == DisplayTarget.C17252a.SURFACEVIEW) {
            aVar.mo20448a(displayTarget.getSurfaceView());
            aVar.f47096e = displayTarget;
        } else if (displayTarget.getType() == DisplayTarget.C17252a.TEXTUREVIEW) {
            aVar.mo20454b(displayTarget.getTextureView());
            aVar.f47096e = displayTarget;
        } else if (displayTarget.getType() == DisplayTarget.C17252a.SURFACE) {
            aVar.mo20446a(displayTarget.getSurface());
            aVar.mo20445a(displayTarget.getWidth(), displayTarget.getHeight());
            aVar.f47096e = displayTarget;
        } else if (displayTarget.getType() == DisplayTarget.C17252a.TXCLOUDVIEW) {
            TXCloudVideoView tXCloudVideoView = displayTarget.getTXCloudVideoView();
            if (tXCloudVideoView != null) {
                DisplayTarget displayTarget2 = new DisplayTarget(displayTarget);
                SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
                TextureView videoView = tXCloudVideoView.getVideoView();
                if (surfaceView != null) {
                    displayTarget2.setSurfaceView(surfaceView);
                    aVar.mo20448a(surfaceView);
                } else if (videoView != null) {
                    displayTarget2.setTextureView(videoView);
                    aVar.mo20454b(videoView);
                } else {
                    LiteavLog.m16898e("VideoRenderer.DisplayViewWrapper", "surfaceView and textureView is null.");
                }
                aVar.f47096e = displayTarget2;
                return;
            }
            if (aVar.mo20452a()) {
                aVar.mo20457e();
                aVar.mo20453b();
                aVar.mo20455c();
            }
            aVar.f47096e = displayTarget;
        }
    }
}
