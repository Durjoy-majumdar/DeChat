package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.RelativeLayout;
import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$s */
public final class d1$$s extends RelativeLayout implements C83896q4 {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244615d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1$$s(C83780d1 d1Var, Context context) {
        super(context);
        this.f244615d = d1Var;
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        Bitmap N0 = this.f244615d.mo116159N0();
        if (N0 != null) {
            canvas.drawBitmap(N0, 0.0f, (float) this.f244615d.f244555G.getTop(), (Paint) null);
        }
        C83780d1 d1Var = this.f244615d;
        C79808b bVar = d1Var.f244554F;
        if (bVar == null || bVar.f233903v) {
            return true;
        }
        d1Var.f244553E.draw(canvas);
        return true;
    }

    public boolean post(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (this.f244615d.mo116177f1(this, runnable)) {
            return true;
        }
        return super.post(runnable);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (this.f244615d.mo116179g1(this, runnable, j)) {
            return true;
        }
        return super.postDelayed(runnable, j);
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
    }
}
