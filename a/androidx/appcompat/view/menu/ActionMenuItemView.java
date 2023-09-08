package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C103542j0;
import androidx.appcompat.widget.C103560s;
import p1130l.C109068h;
import p433g.C107593a;

public class ActionMenuItemView extends AppCompatTextView implements C103458j.C103459a, View.OnClickListener, ActionMenuView.C103477a {

    /* renamed from: g */
    public C103452g f305140g;

    /* renamed from: h */
    public CharSequence f305141h;

    /* renamed from: i */
    public Drawable f305142i;

    /* renamed from: j */
    public C103448e.C103450b f305143j;

    /* renamed from: n */
    public C103560s f305144n;

    /* renamed from: o */
    public C103437b f305145o;

    /* renamed from: p */
    public boolean f305146p;

    /* renamed from: q */
    public boolean f305147q;

    /* renamed from: r */
    public int f305148r;

    /* renamed from: s */
    public int f305149s;

    /* renamed from: t */
    public int f305150t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C103436a extends C103560s {
        public C103436a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C109068h mo143517b() {
            ActionMenuPresenter.C103470a aVar;
            C103437b bVar = ActionMenuItemView.this.f305145o;
            if (bVar == null || (aVar = ActionMenuPresenter.this.f305379B) == null) {
                return null;
            }
            return aVar.mo143696a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo143517b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo143518c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f305143j
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.g r0 = r0.f305140g
                boolean r0 = r1.mo143519c(r0)
                if (r0 == 0) goto L_0x001c
                l.h r0 = r3.mo143517b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C103436a.mo143518c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C103437b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo143498a() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: b */
    public final boolean mo143499b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: c */
    public boolean mo143500c() {
        return mo143498a() && this.f305140g.getIcon() == null;
    }

    /* renamed from: d */
    public void mo143501d(C103452g gVar, int i) {
        this.f305140g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f305267d);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f305144n == null) {
            this.f305144n = new C103436a();
        }
    }

    /* renamed from: e */
    public final void mo143502e() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f305141h);
        if (this.f305142i != null) {
            if (!((this.f305140g.f305262E & 4) == 4) || (!this.f305146p && !this.f305147q)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f305141h : null);
        CharSequence charSequence2 = this.f305140g.f305283w;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.f305140g.f305271h);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.f305140g.f305284x;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f305140g.f305271h;
            }
            C103542j0.m137612a(this, charSequence);
            return;
        }
        C103542j0.m137612a(this, charSequence3);
    }

    public C103452g getItemData() {
        return this.f305140g;
    }

    /* renamed from: k */
    public boolean mo143504k() {
        return mo143498a();
    }

    public void onClick(View view) {
        C103448e.C103450b bVar = this.f305143j;
        if (bVar != null) {
            bVar.mo143519c(this.f305140g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f305146p = mo143499b();
        mo143502e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean a = mo143498a();
        if (a && (i3 = this.f305149s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f305148r) : this.f305148r;
        if (mode != 1073741824 && this.f305148r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!a && this.f305142i != null) {
            super.setPadding((getMeasuredWidth() - this.f305142i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C103560s sVar;
        if (!this.f305140g.hasSubMenu() || (sVar = this.f305144n) == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f305147q != z) {
            this.f305147q = z;
            C103452g gVar = this.f305140g;
            if (gVar != null) {
                C103448e eVar = gVar.f305280t;
                eVar.f305245q = true;
                eVar.mo143611p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f305142i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f305150t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo143502e();
    }

    public void setItemInvoker(C103448e.C103450b bVar) {
        this.f305143j = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f305149s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C103437b bVar) {
        this.f305145o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f305141h = charSequence;
        mo143502e();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f305146p = mo143499b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321903c, i, 0);
        this.f305148r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f305150t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f305149s = -1;
        setSaveEnabled(false);
    }
}
