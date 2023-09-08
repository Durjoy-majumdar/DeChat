package com.tencent.p014mm.danmaku.render;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.danmaku.render.C55190a;
import p850ek.C58614e;
import p871zj.C66837d;
import p871zj.C66838e;

/* renamed from: com.tencent.mm.danmaku.render.NativeDanmakuView */
public class NativeDanmakuView extends View {

    /* renamed from: d */
    public C55189a f157021d;

    /* renamed from: com.tencent.mm.danmaku.render.NativeDanmakuView$a */
    public interface C55189a {
    }

    public NativeDanmakuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C55189a aVar = this.f157021d;
        if (aVar != null) {
            C55193b bVar = (C55193b) aVar;
            C55190a.C55191a aVar2 = bVar.f157024f;
            if (aVar2 != null) {
                ((C66838e) aVar2).mo90826m();
            }
            bVar.f157022d = false;
        }
    }

    public void onDraw(Canvas canvas) {
        C58614e.m68064a("NativeDanmakuView", "onDraw");
        C55189a aVar = this.f157021d;
        if (aVar != null) {
            C55193b bVar = (C55193b) aVar;
            if (bVar.f157023e) {
                bVar.f157023e = false;
                C55190a.C55192b bVar2 = bVar.f157025g;
                if (bVar2 != null) {
                    ((C66837d) bVar2).mo90813a(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C58614e.m68064a("NativeDanmakuView", "onLayout");
        C55189a aVar = this.f157021d;
        if (aVar != null) {
            C55193b bVar = (C55193b) aVar;
            if (!bVar.f157022d) {
                if (bVar.f157024f != null) {
                    C58614e.m68067d("surface_lock", "surfaceCreated");
                    ((C66838e) bVar.f157024f).mo90825l();
                }
                bVar.f157022d = true;
                return;
            }
            C55190a.C55191a aVar2 = bVar.f157024f;
            if (aVar2 != null) {
                ((C66838e) aVar2).mo90825l();
            }
        }
    }

    public NativeDanmakuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
