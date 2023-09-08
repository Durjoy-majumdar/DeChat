package com.tencent.p014mm.danmaku.render;

import android.graphics.Canvas;
import android.view.View;
import com.tencent.p014mm.danmaku.render.C55190a;
import com.tencent.p014mm.danmaku.render.NativeDanmakuView;
import p852fk.C59109a;

/* renamed from: com.tencent.mm.danmaku.render.b */
public class C55193b implements C55190a, NativeDanmakuView.C55189a {

    /* renamed from: d */
    public boolean f157022d;

    /* renamed from: e */
    public boolean f157023e;

    /* renamed from: f */
    public C55190a.C55191a f157024f;

    /* renamed from: g */
    public C55190a.C55192b f157025g;

    /* renamed from: h */
    public NativeDanmakuView f157026h;

    public C55193b(NativeDanmakuView nativeDanmakuView) {
        this.f157026h = nativeDanmakuView;
        nativeDanmakuView.f157021d = this;
    }

    /* renamed from: a */
    public void mo76353a(C55190a.C55191a aVar) {
        this.f157024f = aVar;
    }

    /* renamed from: b */
    public void mo76354b(C55190a.C55192b bVar) {
        this.f157023e = true;
        this.f157025g = bVar;
        int i = C59109a.f169072a;
        this.f157026h.postInvalidateOnAnimation();
    }

    /* renamed from: c */
    public float mo76355c() {
        return this.f157026h.getY();
    }

    public Canvas lockCanvas() {
        return null;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f157026h.setOnTouchListener(onTouchListener);
    }

    public void unlock() {
        this.f157025g = null;
    }

    public void unlockCanvasAndPost(Canvas canvas) {
        this.f157025g = null;
    }
}
