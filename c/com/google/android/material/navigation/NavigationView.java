package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.widget.C103533f0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1115h.C107922a;
import p1139o8.C109972f;
import p1139o8.C109973g;
import p1139o8.C109991k;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107207u;
import p990k.C108787f;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: n */
    public static final int[] f309463n = {16842912};

    /* renamed from: o */
    public static final int[] f309464o = {-16842910};

    /* renamed from: g */
    public final C109972f f309465g;

    /* renamed from: h */
    public final C109973g f309466h;

    /* renamed from: i */
    public final int f309467i;

    /* renamed from: j */
    public MenuInflater f309468j;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C104465a implements C103448e.C103449a {
        public C104465a() {
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public interface C104466b {
        /* renamed from: a */
        boolean mo146872a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2898x7);
    }

    private MenuInflater getMenuInflater() {
        if (this.f309468j == null) {
            this.f309468j = new C108787f(getContext());
        }
        return this.f309468j;
    }

    /* renamed from: a */
    public void mo146838a(C107179f0 f0Var) {
        C109973g gVar = this.f309466h;
        gVar.getClass();
        int d = f0Var.mo157632d();
        if (gVar.f329135t != d) {
            gVar.f329135t = d;
            if (gVar.f329123e.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = gVar.f329122d;
                navigationMenuView.setPadding(0, gVar.f329135t, 0, navigationMenuView.getPaddingBottom());
            }
        }
        LinearLayout linearLayout = gVar.f329123e;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        WindowInsets f = f0Var.mo157635f();
        if (f != null) {
            WindowInsets a = C107207u.C107212f.m145213a(linearLayout, f);
            if (!a.equals(f)) {
                C107179f0.m145061g(a, linearLayout);
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList mo146845b(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C107922a.m146227a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0966R.attr.f2735gf, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f309464o;
        return new ColorStateList(new int[][]{iArr, f309463n, FrameLayout.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public MenuItem getCheckedItem() {
        return this.f309466h.f329126h.f329140e;
    }

    public int getHeaderCount() {
        return this.f309466h.f329123e.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f309466h.f329132q;
    }

    public int getItemHorizontalPadding() {
        return this.f309466h.f329133r;
    }

    public int getItemIconPadding() {
        return this.f309466h.f329134s;
    }

    public ColorStateList getItemIconTintList() {
        return this.f309466h.f329131p;
    }

    public ColorStateList getItemTextColor() {
        return this.f309466h.f329130o;
    }

    public Menu getMenu() {
        return this.f309465g;
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f309467i), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f309467i, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        this.f309465g.mo143625t(savedState.f309469f);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f309469f = bundle;
        this.f309465g.mo143627v(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f309465g.findItem(i);
        if (findItem != null) {
            this.f309466h.f329126h.mo161320G4((C103452g) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        C109973g gVar = this.f309466h;
        gVar.f329132q = drawable;
        gVar.mo143539c(false);
    }

    public void setItemBackgroundResource(int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        setItemBackground(C111105a.C111110c.m151511b(context, i));
    }

    public void setItemHorizontalPadding(int i) {
        C109973g gVar = this.f309466h;
        gVar.f329133r = i;
        gVar.mo143539c(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        C109973g gVar = this.f309466h;
        gVar.f329133r = getResources().getDimensionPixelSize(i);
        gVar.mo143539c(false);
    }

    public void setItemIconPadding(int i) {
        C109973g gVar = this.f309466h;
        gVar.f329134s = i;
        gVar.mo143539c(false);
    }

    public void setItemIconPaddingResource(int i) {
        C109973g gVar = this.f309466h;
        gVar.f329134s = getResources().getDimensionPixelSize(i);
        gVar.mo143539c(false);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C109973g gVar = this.f309466h;
        gVar.f329131p = colorStateList;
        gVar.mo143539c(false);
    }

    public void setItemTextAppearance(int i) {
        C109973g gVar = this.f309466h;
        gVar.f329128j = i;
        gVar.f329129n = true;
        gVar.mo143539c(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C109973g gVar = this.f309466h;
        gVar.f329130o = colorStateList;
        gVar.mo143539c(false);
    }

    public void setNavigationItemSelectedListener(C104466b bVar) {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104464a();

        /* renamed from: f */
        public Bundle f309469f;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public static class C104464a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f309469f = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeBundle(this.f309469f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        boolean z;
        int i2;
        C109973g gVar = new C109973g();
        this.f309466h = gVar;
        C109972f fVar = new C109972f(context);
        this.f309465g = fVar;
        int[] iArr = C107764a.f322516p;
        C109991k.m149508a(context, attributeSet, i, C0966R.style.a3l);
        C109991k.m149509b(context, attributeSet, iArr, i, C0966R.style.a3l, new int[0]);
        C103533f0 f0Var = new C103533f0(context, context.obtainStyledAttributes(attributeSet, iArr, i, C0966R.style.a3l));
        Drawable e = f0Var.mo144336e(0);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, e);
        if (f0Var.mo144342k(3)) {
            C107207u.C107213g.m145234s(this, (float) f0Var.mo144335d(3, 0));
        }
        setFitsSystemWindows(f0Var.mo144332a(1, false));
        this.f309467i = f0Var.mo144335d(2, 0);
        if (f0Var.mo144342k(8)) {
            colorStateList = f0Var.mo144333b(8);
        } else {
            colorStateList = mo146845b(16842808);
        }
        if (f0Var.mo144342k(9)) {
            i2 = f0Var.mo144340i(9, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        ColorStateList b = f0Var.mo144342k(10) ? f0Var.mo144333b(10) : null;
        if (!z && b == null) {
            b = mo146845b(16842806);
        }
        Drawable e2 = f0Var.mo144336e(5);
        if (f0Var.mo144342k(6)) {
            gVar.f329133r = f0Var.mo144335d(6, 0);
            gVar.mo143539c(false);
        }
        int d = f0Var.mo144335d(7, 0);
        fVar.f305239h = new C104465a();
        gVar.f329125g = 1;
        gVar.mo143564h(context, fVar);
        gVar.f329131p = colorStateList;
        gVar.mo143539c(false);
        if (z) {
            gVar.f329128j = i2;
            gVar.f329129n = true;
            gVar.mo143539c(false);
        }
        gVar.f329130o = b;
        gVar.mo143539c(false);
        gVar.f329132q = e2;
        gVar.mo143539c(false);
        gVar.f329134s = d;
        gVar.mo143539c(false);
        fVar.mo143590b(gVar, fVar.f305235d);
        if (gVar.f329122d == null) {
            gVar.f329122d = (NavigationMenuView) gVar.f329127i.inflate(C0966R.C0971layout.f7133za, this, false);
            if (gVar.f329126h == null) {
                gVar.f329126h = new C109973g.C109976c();
            }
            gVar.f329123e = (LinearLayout) gVar.f329127i.inflate(C0966R.C0971layout.f7130z8, gVar.f329122d, false);
            gVar.f329122d.setAdapter(gVar.f329126h);
        }
        addView(gVar.f329122d);
        if (f0Var.mo144342k(11)) {
            int i3 = f0Var.mo144340i(11, 0);
            C109973g.C109976c cVar = gVar.f329126h;
            if (cVar != null) {
                cVar.f329141f = true;
            }
            getMenuInflater().inflate(i3, fVar);
            C109973g.C109976c cVar2 = gVar.f329126h;
            if (cVar2 != null) {
                cVar2.f329141f = false;
            }
            gVar.mo143539c(false);
        }
        if (f0Var.mo144342k(4)) {
            gVar.f329123e.addView(gVar.f329127i.inflate(f0Var.mo144340i(4, 0), gVar.f329123e, false));
            NavigationMenuView navigationMenuView = gVar.f329122d;
            navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        }
        f0Var.mo144343m();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f309465g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f309466h.f329126h.mo161320G4((C103452g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
