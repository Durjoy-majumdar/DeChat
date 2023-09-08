package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1057w2.C111711b;
import p1114g8.C107764a;
import p1139o8.C109991k;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: d */
    public Drawable f309458d;

    /* renamed from: e */
    public Rect f309459e;

    /* renamed from: f */
    public Rect f309460f;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C104463a implements C107204q {
        public C104463a() {
        }

        /* renamed from: a */
        public C107179f0 mo12075a(View view, C107179f0 f0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f309459e == null) {
                scrimInsetsFrameLayout.f309459e = new Rect();
            }
            ScrimInsetsFrameLayout.this.f309459e.set(f0Var.mo157630b(), f0Var.mo157632d(), f0Var.mo157631c(), f0Var.mo157629a());
            ScrimInsetsFrameLayout.this.mo146838a(f0Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z = true;
            if ((!f0Var.f320766a.mo157645k().equals(C111711b.f334387e)) && ScrimInsetsFrameLayout.this.f309458d != null) {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(scrimInsetsFrameLayout3);
            return f0Var.f320766a.mo157654c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo146838a(C107179f0 f0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f309459e != null && this.f309458d != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f309460f.set(0, 0, width, this.f309459e.top);
            this.f309458d.setBounds(this.f309460f);
            this.f309458d.draw(canvas);
            this.f309460f.set(0, height - this.f309459e.bottom, width, height);
            this.f309458d.setBounds(this.f309460f);
            this.f309458d.draw(canvas);
            Rect rect = this.f309460f;
            Rect rect2 = this.f309459e;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f309458d.setBounds(this.f309460f);
            this.f309458d.draw(canvas);
            Rect rect3 = this.f309460f;
            Rect rect4 = this.f309459e;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f309458d.setBounds(this.f309460f);
            this.f309458d.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f309458d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f309458d;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309460f = new Rect();
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322517q, i, C0966R.style.a3m, new int[0]);
        this.f309458d = d.getDrawable(0);
        d.recycle();
        setWillNotDraw(true);
        C104463a aVar = new C104463a();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(this, aVar);
    }
}
