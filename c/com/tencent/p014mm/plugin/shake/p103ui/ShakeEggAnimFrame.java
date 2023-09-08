package com.tencent.p014mm.plugin.shake.p103ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.smiley.C96925b;
import com.tencent.p014mm.smiley.C96927c;
import com.tencent.p014mm.smiley.C96928c0;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96940i;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.smiley.C96973t0;
import com.tencent.p014mm.smiley.C96974x;
import com.tencent.p014mm.smiley.C96976z;
import com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame */
public class ShakeEggAnimFrame extends FrameLayout {

    /* renamed from: e */
    public static final /* synthetic */ int f273371e = 0;

    /* renamed from: d */
    public List<View> f273372d = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame$a */
    public abstract class C94539a extends Animation {

        /* renamed from: d */
        public View f273373d;

        /* renamed from: e */
        public int f273374e = 100;

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame$a$a */
        public class C94540a implements Runnable {
            public C94540a() {
            }

            public void run() {
                View view = C94539a.this.f273373d;
                if (view != null) {
                    view.clearAnimation();
                    C94539a aVar = C94539a.this;
                    ShakeEggAnimFrame shakeEggAnimFrame = ShakeEggAnimFrame.this;
                    View view2 = aVar.f273373d;
                    ((ArrayList) shakeEggAnimFrame.f273372d).remove(view2);
                    shakeEggAnimFrame.removeView(view2);
                }
            }
        }

        public C94539a() {
        }

        /* renamed from: a */
        public void mo130021a() {
            Assert.assertTrue(this.f273373d != null);
            this.f273373d.post(new C94540a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame$b */
    public class C94541b extends C94539a {

        /* renamed from: g */
        public int f273377g;

        /* renamed from: h */
        public int f273378h;

        /* renamed from: i */
        public float f273379i;

        /* renamed from: j */
        public float f273380j;

        /* renamed from: n */
        public float f273381n;

        /* renamed from: o */
        public float f273382o;

        /* renamed from: p */
        public float f273383p = 0.01f;

        /* renamed from: q */
        public float f273384q = 0.02f;

        /* renamed from: r */
        public float f273385r;

        /* renamed from: s */
        public float f273386s;

        /* renamed from: t */
        public float f273387t;

        /* renamed from: u */
        public float f273388u;

        public C94541b(ShakeEggAnimFrame shakeEggAnimFrame, int i, int i2) {
            super();
            this.f273377g = i;
            this.f273378h = i2;
            int i3 = ShakeEggAnimFrame.f273371e;
            float random = 0.1f + (((float) Math.random()) * 0.79999995f);
            this.f273379i = random;
            this.f273380j = random;
            this.f273382o = -0.3f + (((float) Math.random()) * 0.20000002f);
            mo130024b();
        }

        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f273385r;
            float f3 = this.f273387t;
            float f4 = this.f273386s;
            if (f2 != f4) {
                f2 += (f4 - f2) * f;
            }
            float f5 = this.f273388u;
            if (f3 != f5) {
                f3 += (f5 - f3) * f;
            }
            transformation.getMatrix().setTranslate(f2, f3);
            if (f == 1.0f) {
                mo130024b();
            }
        }

        /* renamed from: b */
        public final void mo130024b() {
            float f = this.f273382o;
            if (f > 0.0f) {
                this.f273384q += this.f273383p;
            }
            this.f273381n = f;
            this.f273382o = this.f273384q + f;
            if (f > 1.1f) {
                mo130021a();
            }
            float f2 = this.f273379i;
            float f3 = (float) this.f273377g;
            this.f273385r = f2 * f3;
            this.f273386s = this.f273380j * f3;
            float f4 = this.f273381n;
            float f5 = (float) this.f273378h;
            this.f273387t = f4 * f5;
            this.f273388u = this.f273382o * f5;
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            setRepeatCount(-1);
            setDuration((long) this.f273374e);
        }
    }

    public ShakeEggAnimFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getSize() {
        return (int) (((double) new TextView(getContext()).getTextSize()) * 1.2d);
    }

    /* renamed from: a */
    public void mo130020a(Activity activity, int i) {
        int i2;
        C96927c cVar;
        C96973t0 t0Var;
        C96976z zVar;
        SparseArray<C96976z> sparseArray;
        Iterator it = ((ArrayList) this.f273372d).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.clearAnimation();
            removeView(view);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        setVisibility(0);
        for (int i3 = 0; i3 < i; i3++) {
            C94541b bVar = new C94541b(this, displayMetrics.widthPixels, displayMetrics.heightPixels);
            C96963p0.wx0().getClass();
            C96931e.m124499a().getClass();
            boolean z = C96965r.f284067d;
            C96965r rVar = C96965r.C44649c.f121057a;
            rVar.getClass();
            Drawable drawable = null;
            C96928c0 c0Var = C96940i.C96942b.f283995a.f283992c.get(107, (Object) null);
            if (c0Var != null && (i2 = c0Var.f283947f) < rVar.f284071a.f284064d.size() && i2 >= 0 && (cVar = rVar.f284071a.f284064d.get(i2)) != null) {
                C96940i iVar = C96940i.C96942b.f283995a;
                iVar.getClass();
                C96925b bVar2 = iVar.f283994e;
                LinkedList<Integer> linkedList = cVar.f283943d;
                C87412m.m108593f(linkedList, "dataItem.codePoints");
                Iterator<T> it4 = linkedList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Integer num = (Integer) next;
                        if (bVar2 == null || (sparseArray = bVar2.f283932b) == null) {
                            zVar = null;
                        } else {
                            C87412m.m108593f(num, "codePoint");
                            zVar = sparseArray.get(num.intValue(), (Object) null);
                        }
                        bVar2 = (C96940i.C96941a) zVar;
                        if (bVar2 == null) {
                            break;
                        } else if (i4 == cVar.f283943d.size() - 1) {
                            C96974x xVar = bVar2.f283931a;
                            if (xVar instanceof C96973t0) {
                                t0Var = (C96973t0) xVar;
                            }
                        } else {
                            i4 = i5;
                        }
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                t0Var = null;
                if (t0Var != null) {
                    int i6 = EmojiDrawableBitmapRepo.f283926b;
                    drawable = EmojiDrawableBitmapRepo.C96922a.f283929a.mo135511a(t0Var, true);
                }
            }
            drawable.setBounds(0, 0, getSize(), getSize());
            ImageSpan imageSpan = new ImageSpan(drawable, 1);
            SpannableString spannableString = new SpannableString("  ");
            spannableString.setSpan(imageSpan, 0, 1, 33);
            TextView textView = new TextView(getContext());
            textView.setSingleLine();
            textView.setText(spannableString);
            textView.setAnimation(bVar);
            textView.setTag(bVar);
            addView(textView);
            bVar.f273373d = textView;
            ((ArrayList) this.f273372d).add(textView);
        }
    }
}
