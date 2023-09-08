package com.tencent.p014mm.memory.p1073ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.memory.C92709i;
import com.tencent.p014mm.memory.C92714n;

/* renamed from: com.tencent.mm.memory.ui.PictureView */
public class PictureView extends ImageView {

    /* renamed from: d */
    public C92709i f266831d = null;

    /* renamed from: e */
    public boolean f266832e = false;

    /* renamed from: f */
    public Runnable f266833f = new C92719a();

    /* renamed from: com.tencent.mm.memory.ui.PictureView$a */
    public class C92719a implements Runnable {
        public C92719a() {
        }

        public void run() {
            PictureView.m116867a(PictureView.this);
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m116867a(PictureView pictureView) {
        C92709i iVar = pictureView.f266831d;
        if (iVar != null) {
            iVar.mo126910b();
        }
        pictureView.f266831d = null;
        super.setImageDrawable((Drawable) null);
    }

    /* renamed from: b */
    public final void mo126931b() {
        removeCallbacks(this.f266833f);
        if (!this.f266832e) {
            this.f266832e = true;
        }
    }

    /* renamed from: c */
    public final void mo126932c() {
        if (this.f266832e) {
            this.f266832e = false;
            removeCallbacks(this.f266833f);
            postDelayed(this.f266833f, 500);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo126931b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo126932c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mo126931b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mo126932c();
    }

    public void setImageDrawable(Drawable drawable) {
        removeCallbacks(this.f266833f);
        if (drawable != null && !drawable.equals(this.f266831d)) {
            C92709i iVar = this.f266831d;
            if (iVar != null) {
                iVar.mo126910b();
            }
            boolean z = drawable instanceof C92709i;
            if (z) {
                this.f266831d = (C92709i) drawable;
            } else {
                this.f266831d = null;
            }
            if (z) {
                ((C92709i) drawable).mo126909a();
            }
            super.setImageDrawable(drawable);
        }
    }

    public void setReleasableBitmap(C92714n nVar) {
        if (nVar != null && !nVar.equals(this.f266831d)) {
            setImageBitmap(nVar.f266818d);
            this.f266831d = nVar;
            nVar.mo126909a();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
