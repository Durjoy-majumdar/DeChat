package com.tencent.p014mm.danmaku.render;

import android.graphics.Canvas;
import android.view.View;

/* renamed from: com.tencent.mm.danmaku.render.a */
public interface C55190a {

    /* renamed from: com.tencent.mm.danmaku.render.a$a */
    public interface C55191a {
    }

    /* renamed from: com.tencent.mm.danmaku.render.a$b */
    public interface C55192b {
    }

    /* renamed from: a */
    void mo76353a(C55191a aVar);

    /* renamed from: b */
    void mo76354b(C55192b bVar);

    /* renamed from: c */
    float mo76355c();

    Canvas lockCanvas();

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unlock();

    void unlockCanvasAndPost(Canvas canvas);
}
