package com.tencent.p014mm.memory.p1073ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.memory.C92709i;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.p136ui.widget.QImageView;

/* renamed from: com.tencent.mm.memory.ui.QPictureView */
public class QPictureView extends QImageView {

    /* renamed from: G */
    public static boolean f266835G = true;

    /* renamed from: D */
    public C92709i f266836D = null;

    /* renamed from: E */
    public boolean f266837E = false;

    /* renamed from: F */
    public Runnable f266838F = new C92720a();

    /* renamed from: com.tencent.mm.memory.ui.QPictureView$a */
    public class C92720a implements Runnable {
        public C92720a() {
        }

        public void run() {
            QPictureView.this.mo126941o();
        }
    }

    public QPictureView(Context context) {
        super(context);
    }

    /* renamed from: n */
    private void m116870n() {
        removeCallbacks(this.f266838F);
        if (!this.f266837E) {
            this.f266837E = true;
        }
    }

    private void onDetach() {
        if (this.f266837E) {
            this.f266837E = false;
            removeCallbacks(this.f266838F);
            postDelayed(this.f266838F, 500);
        }
    }

    /* renamed from: m */
    public boolean mo126940m() {
        return this.f266836D != null;
    }

    /* renamed from: o */
    public void mo126941o() {
        C92709i iVar = this.f266836D;
        if (iVar != null) {
            iVar.mo126910b();
        }
        this.f266836D = null;
        super.setImageDrawable((Drawable) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f266835G) {
            m116870n();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (f266835G) {
            onDetach();
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (f266835G) {
            m116870n();
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (f266835G) {
            onDetach();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        removeCallbacks(this.f266838F);
        if (drawable != null && !drawable.equals(this.f266836D)) {
            C92709i iVar = this.f266836D;
            if (iVar != null) {
                iVar.mo126910b();
            }
            boolean z = drawable instanceof C92709i;
            if (z) {
                this.f266836D = (C92709i) drawable;
            } else {
                this.f266836D = null;
            }
            if (z) {
                ((C92709i) drawable).mo126909a();
            }
            super.setImageDrawable(drawable);
        }
    }

    public void setReleasableBitmap(C92714n nVar) {
        if (nVar != null && !nVar.equals(this.f266836D)) {
            setImageBitmap(nVar.f266818d);
            this.f266836D = nVar;
            nVar.mo126909a();
        }
    }

    public QPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
