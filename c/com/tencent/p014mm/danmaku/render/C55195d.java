package com.tencent.p014mm.danmaku.render;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.tencent.p014mm.danmaku.render.C55190a;
import p850ek.C58614e;
import p871zj.C66837d;
import p871zj.C66838e;

/* renamed from: com.tencent.mm.danmaku.render.d */
public class C55195d implements C55190a, TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public TextureView f157030d;

    /* renamed from: e */
    public C55190a.C55191a f157031e;

    public C55195d(TextureView textureView) {
        this.f157030d = textureView;
        textureView.setOpaque(false);
        this.f157030d.setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public void mo76353a(C55190a.C55191a aVar) {
        this.f157031e = aVar;
    }

    /* renamed from: b */
    public void mo76354b(C55190a.C55192b bVar) {
        if (bVar != null) {
            ((C66837d) bVar).mo90813a((Canvas) null);
        }
    }

    /* renamed from: c */
    public float mo76355c() {
        return this.f157030d.getY();
    }

    public Canvas lockCanvas() {
        return this.f157030d.lockCanvas();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f157030d.setOpaque(false);
        if (this.f157031e != null) {
            C58614e.m68067d("surface_lock", "surfaceCreated");
            ((C66838e) this.f157031e).mo90825l();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C55190a.C55191a aVar = this.f157031e;
        if (aVar == null) {
            return false;
        }
        ((C66838e) aVar).mo90826m();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C55190a.C55191a aVar = this.f157031e;
        if (aVar != null) {
            ((C66838e) aVar).mo90825l();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f157030d.setOnTouchListener(onTouchListener);
    }

    public void unlock() {
    }

    public void unlockCanvasAndPost(Canvas canvas) {
        this.f157030d.unlockCanvasAndPost(canvas);
    }
}
