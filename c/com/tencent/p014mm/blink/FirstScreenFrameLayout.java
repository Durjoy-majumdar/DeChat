package com.tencent.p014mm.blink;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.blink.FirstScreenFrameLayout */
public class FirstScreenFrameLayout extends FrameLayout {

    /* renamed from: d */
    public C17696b f48701d;

    /* renamed from: com.tencent.mm.blink.FirstScreenFrameLayout$a */
    public class C17695a implements Runnable {
        public C17695a() {
        }

        public void run() {
            C17696b bVar = FirstScreenFrameLayout.this.f48701d;
            if (bVar != null) {
                bVar.mo21200a();
                FirstScreenFrameLayout.this.f48701d = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.blink.FirstScreenFrameLayout$b */
    public interface C17696b {
        /* renamed from: a */
        void mo21200a();
    }

    public FirstScreenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f48701d != null) {
            new MMHandler(Looper.getMainLooper()).postAtFrontOfQueue(new C17695a());
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public FirstScreenFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
