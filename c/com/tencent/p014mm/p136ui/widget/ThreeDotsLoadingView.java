package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.C85011n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.ui.widget.ThreeDotsLoadingView */
public class ThreeDotsLoadingView extends FrameLayout {

    /* renamed from: o */
    public static int f250422o = -16777216;

    /* renamed from: d */
    public int f250423d = f250422o;

    /* renamed from: e */
    public boolean f250424e = false;

    /* renamed from: f */
    public boolean f250425f = false;

    /* renamed from: g */
    public ViewGroup f250426g;

    /* renamed from: h */
    public ImageView f250427h;

    /* renamed from: i */
    public ImageView f250428i;

    /* renamed from: j */
    public ImageView f250429j;

    /* renamed from: n */
    public final Runnable f250430n = new C85979a();

    /* renamed from: com.tencent.mm.ui.widget.ThreeDotsLoadingView$a */
    public class C85979a implements Runnable {
        public C85979a() {
        }

        public void run() {
            ThreeDotsLoadingView threeDotsLoadingView = ThreeDotsLoadingView.this;
            int i = ThreeDotsLoadingView.f250422o;
            threeDotsLoadingView.getClass();
            threeDotsLoadingView.f250427h.setImageDrawable(threeDotsLoadingView.mo119900b(threeDotsLoadingView.f250423d, new float[]{0.4f, 0.3f, 0.5f}));
            threeDotsLoadingView.f250428i.setImageDrawable(threeDotsLoadingView.mo119900b(threeDotsLoadingView.f250423d, new float[]{0.5f, 0.4f, 0.3f}));
            threeDotsLoadingView.f250429j.setImageDrawable(threeDotsLoadingView.mo119900b(threeDotsLoadingView.f250423d, new float[]{0.3f, 0.5f, 0.4f}));
            ((AnimationDrawable) ThreeDotsLoadingView.this.f250427h.getDrawable()).start();
            ((AnimationDrawable) ThreeDotsLoadingView.this.f250428i.getDrawable()).start();
            ((AnimationDrawable) ThreeDotsLoadingView.this.f250429j.getDrawable()).start();
        }
    }

    public ThreeDotsLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo119899a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo119899a(Context context, AttributeSet attributeSet) {
        this.f250426g = (ViewGroup) LayoutInflater.from(context).inflate(C0966R.C0971layout.b5a, this, true);
        int color = context.getResources().getColor(C0966R.color.f3133gi);
        f250422o = color;
        this.f250423d = color;
        this.f250427h = (ImageView) this.f250426g.findViewById(C0966R.C0970id.g36);
        this.f250428i = (ImageView) this.f250426g.findViewById(C0966R.C0970id.g37);
        this.f250429j = (ImageView) this.f250426g.findViewById(C0966R.C0970id.g38);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C85011n.f247737b);
            this.f250423d = obtainStyledAttributes.getColor(0, f250422o);
            obtainStyledAttributes.recycle();
        }
        mo119902d();
    }

    /* renamed from: b */
    public final AnimationDrawable mo119900b(int i, float[] fArr) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Log.m105924i("ThreeDotsLoadingView", "AnimationDrawable hash:" + animationDrawable.hashCode());
        animationDrawable.setOneShot(false);
        for (float c : fArr) {
            animationDrawable.addFrame(mo119901c(i, c), 300);
        }
        return animationDrawable;
    }

    /* renamed from: c */
    public final Drawable mo119901c(int i, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicHeight(32);
        shapeDrawable.setIntrinsicWidth(32);
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAlpha((int) (f * 255.0f));
        return shapeDrawable;
    }

    /* renamed from: d */
    public final void mo119902d() {
        this.f250427h.setImageDrawable(mo119901c(this.f250423d, 0.5f));
        this.f250428i.setImageDrawable(mo119901c(this.f250423d, 0.4f));
        this.f250429j.setImageDrawable(mo119901c(this.f250423d, 0.3f));
    }

    /* renamed from: e */
    public void mo119903e() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(this)) {
            this.f250425f = true;
        } else if (!this.f250424e) {
            this.f250424e = true;
            mo119902d();
            postDelayed(this.f250430n, 300);
        }
    }

    /* renamed from: f */
    public void mo119904f() {
        this.f250425f = false;
        if (this.f250424e) {
            this.f250424e = false;
            removeCallbacks(this.f250430n);
            if (this.f250427h.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) this.f250427h.getDrawable()).stop();
                ((AnimationDrawable) this.f250428i.getDrawable()).stop();
                ((AnimationDrawable) this.f250429j.getDrawable()).stop();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f250425f) {
            this.f250425f = false;
            mo119903e();
        }
    }

    public void setAlpha(float f) {
        this.f250427h.setAlpha(f);
        this.f250428i.setAlpha(f);
        this.f250429j.setAlpha(f);
        if (getBackground() != null) {
            getBackground().setAlpha(Math.round(f * 255.0f));
        }
    }

    public void setVisibility(int i) {
        if (8 == i || 4 == i) {
            mo119904f();
        }
        super.setVisibility(i);
    }

    public ThreeDotsLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo119899a(context, attributeSet);
    }
}
