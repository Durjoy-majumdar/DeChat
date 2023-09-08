package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.C103542j0;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1162x2.C112019a;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107205s;
import p849e3.C107207u;

public class BottomNavigationItemView extends FrameLayout implements C103458j.C103459a {

    /* renamed from: s */
    public static final int[] f309165s = {16842912};

    /* renamed from: d */
    public final int f309166d;

    /* renamed from: e */
    public float f309167e;

    /* renamed from: f */
    public float f309168f;

    /* renamed from: g */
    public float f309169g;

    /* renamed from: h */
    public int f309170h;

    /* renamed from: i */
    public boolean f309171i;

    /* renamed from: j */
    public ImageView f309172j;

    /* renamed from: n */
    public final TextView f309173n;

    /* renamed from: o */
    public final TextView f309174o;

    /* renamed from: p */
    public int f309175p;

    /* renamed from: q */
    public C103452g f309176q;

    /* renamed from: r */
    public ColorStateList f309177r;

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo146303a(float f, float f2) {
        this.f309167e = f - f2;
        this.f309168f = (f2 * 1.0f) / f;
        this.f309169g = (f * 1.0f) / f2;
    }

    /* renamed from: b */
    public final void mo146304b(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void mo146305c(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/google/android/material/bottomnavigation/BottomNavigationItemView", "setViewValues", "(Landroid/view/View;FFI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo143501d(C103452g gVar, int i) {
        this.f309176q = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.f305271h);
        setId(gVar.f305267d);
        if (!TextUtils.isEmpty(gVar.f305283w)) {
            setContentDescription(gVar.f305283w);
        }
        C103542j0.m137612a(this, gVar.f305284x);
        setVisibility(gVar.isVisible() ? 0 : 8);
    }

    public C103452g getItemData() {
        return this.f309176q;
    }

    public int getItemPosition() {
        return this.f309175p;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C103452g gVar = this.f309176q;
        if (gVar != null && gVar.isCheckable() && this.f309176q.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f309165s);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f309174o;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f309174o;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f309173n;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f309173n;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f309170h;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    mo146304b(this.f309172j, this.f309166d, 49);
                    mo146305c(this.f309174o, 1.0f, 1.0f, 0);
                } else {
                    mo146304b(this.f309172j, this.f309166d, 17);
                    mo146305c(this.f309174o, 0.5f, 0.5f, 4);
                }
                this.f309173n.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    mo146304b(this.f309172j, this.f309166d, 17);
                    this.f309174o.setVisibility(8);
                    this.f309173n.setVisibility(8);
                }
            } else if (z) {
                mo146304b(this.f309172j, (int) (((float) this.f309166d) + this.f309167e), 49);
                mo146305c(this.f309174o, 1.0f, 1.0f, 0);
                TextView textView5 = this.f309173n;
                float f = this.f309168f;
                mo146305c(textView5, f, f, 4);
            } else {
                mo146304b(this.f309172j, this.f309166d, 49);
                TextView textView6 = this.f309174o;
                float f2 = this.f309169g;
                mo146305c(textView6, f2, f2, 4);
                mo146305c(this.f309173n, 1.0f, 1.0f, 0);
            }
        } else if (this.f309171i) {
            if (z) {
                mo146304b(this.f309172j, this.f309166d, 49);
                mo146305c(this.f309174o, 1.0f, 1.0f, 0);
            } else {
                mo146304b(this.f309172j, this.f309166d, 17);
                mo146305c(this.f309174o, 0.5f, 0.5f, 4);
            }
            this.f309173n.setVisibility(4);
        } else if (z) {
            mo146304b(this.f309172j, (int) (((float) this.f309166d) + this.f309167e), 49);
            mo146305c(this.f309174o, 1.0f, 1.0f, 0);
            TextView textView7 = this.f309173n;
            float f3 = this.f309168f;
            mo146305c(textView7, f3, f3, 4);
        } else {
            mo146304b(this.f309172j, this.f309166d, 49);
            TextView textView8 = this.f309174o;
            float f4 = this.f309169g;
            mo146305c(textView8, f4, f4, 4);
            mo146305c(this.f309173n, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f309173n.setEnabled(z);
        this.f309174o.setEnabled(z);
        this.f309172j.setEnabled(z);
        if (z) {
            C107207u.m145170k(this, C107205s.m145159a(getContext(), 1002));
        } else {
            C107207u.m145170k(this, (C107205s) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C112019a.m152749g(drawable).mutate();
            drawable.setTintList(this.f309177r);
        }
        this.f309172j.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f309172j.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f309172j.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f309177r = colorStateList;
        C103452g gVar = this.f309176q;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            Context context = getContext();
            Object obj = C111105a.f332697a;
            drawable = C111105a.C111110c.m151511b(context, i);
        }
        setItemBackground(drawable);
    }

    public void setItemPosition(int i) {
        this.f309175p = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f309170h != i) {
            this.f309170h = i;
            C103452g gVar = this.f309176q;
            if (gVar != null) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f309171i != z) {
            this.f309171i = z;
            C103452g gVar = this.f309176q;
            if (gVar != null) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C103733h.m138110g(this.f309174o, i);
        mo146303a(this.f309173n.getTextSize(), this.f309174o.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C103733h.m138110g(this.f309173n, i);
        mo146303a(this.f309173n.getTextSize(), this.f309174o.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f309173n.setTextColor(colorStateList);
            this.f309174o.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f309173n.setText(charSequence);
        this.f309174o.setText(charSequence);
        C103452g gVar = this.f309176q;
        if (gVar == null || TextUtils.isEmpty(gVar.f305283w)) {
            setContentDescription(charSequence);
        }
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309175p = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f7124z0, this, true);
        setBackgroundResource(C0966R.C0969drawable.f4889qa);
        this.f309166d = resources.getDimensionPixelSize(C0966R.dimen.a0g);
        this.f309172j = (ImageView) findViewById(C0966R.C0970id.f15);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359223jn1);
        this.f309173n = textView;
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.fhl);
        this.f309174o = textView2;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145191s(textView, 2);
        C107207u.C107208b.m145191s(textView2, 2);
        setFocusable(true);
        mo146303a(textView.getTextSize(), textView2.getTextSize());
    }

    public void setItemBackground(Drawable drawable) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, drawable);
    }
}
