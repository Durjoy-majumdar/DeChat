package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.widget.C103533f0;
import androidx.customview.view.AbsSavedState;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1139o8.C109991k;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C108787f;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: d */
    public final C103448e f309209d;

    /* renamed from: e */
    public final BottomNavigationMenuView f309210e;

    /* renamed from: f */
    public final BottomNavigationPresenter f309211f;

    /* renamed from: g */
    public MenuInflater f309212g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104419a();

        /* renamed from: f */
        public Bundle f309213f;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
        public static class C104419a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeBundle(this.f309213f);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f309213f = parcel.readBundle(classLoader);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C104420a implements C103448e.C103449a {
        public C104420a() {
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            BottomNavigationView.this.getClass();
            BottomNavigationView.this.getClass();
            return false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C104421b {
        /* renamed from: a */
        void mo146381a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C104422c {
        /* renamed from: a */
        boolean mo146382a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2676cl);
    }

    private MenuInflater getMenuInflater() {
        if (this.f309212g == null) {
            this.f309212g = new C108787f(getContext());
        }
        return this.f309212g;
    }

    public Drawable getItemBackground() {
        return this.f309210e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f309210e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f309210e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f309210e.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f309210e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f309210e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f309210e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f309210e.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f309209d;
    }

    public int getSelectedItemId() {
        return this.f309210e.getSelectedItemId();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        this.f309209d.mo143625t(savedState.f309213f);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f309213f = bundle;
        this.f309209d.mo143627v(bundle);
        return savedState;
    }

    public void setItemBackground(Drawable drawable) {
        this.f309210e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f309210e.setItemBackgroundRes(i);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = this.f309210e;
        if (bottomNavigationMenuView.f309192o != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            this.f309211f.mo143539c(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f309210e.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f309210e.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f309210e.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f309210e.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f309210e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f309210e.getLabelVisibilityMode() != i) {
            this.f309210e.setLabelVisibilityMode(i);
            this.f309211f.mo143539c(false);
        }
    }

    public void setOnNavigationItemReselectedListener(C104421b bVar) {
    }

    public void setOnNavigationItemSelectedListener(C104422c cVar) {
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f309209d.findItem(i);
        if (findItem != null && !this.f309209d.mo143614q(findItem, this.f309211f, 0)) {
            findItem.setChecked(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f309211f = bottomNavigationPresenter;
        C104423a aVar = new C104423a(context2);
        this.f309209d = aVar;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2, (AttributeSet) null);
        this.f309210e = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.f309205d = bottomNavigationMenuView;
        bottomNavigationPresenter.f309207f = 1;
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        aVar.mo143590b(bottomNavigationPresenter, aVar.f305235d);
        getContext();
        bottomNavigationPresenter.f309205d.f309183D = aVar;
        int[] iArr = C107764a.f322504d;
        C109991k.m149508a(context2, attributeSet2, i2, C0966R.style.a3h);
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        C109991k.m149509b(context, attributeSet, iArr, i, C0966R.style.a3h, 6, 5);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, C0966R.style.a3h);
        C103533f0 f0Var = new C103533f0(context2, obtainStyledAttributes);
        if (f0Var.mo144342k(4)) {
            bottomNavigationMenuView.setIconTintList(f0Var.mo144333b(4));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.mo146324b(16842808));
        }
        setItemIconSize(f0Var.mo144335d(3, getResources().getDimensionPixelSize(C0966R.dimen.a0d)));
        if (f0Var.mo144342k(6)) {
            setItemTextAppearanceInactive(f0Var.mo144340i(6, 0));
        }
        if (f0Var.mo144342k(5)) {
            setItemTextAppearanceActive(f0Var.mo144340i(5, 0));
        }
        if (f0Var.mo144342k(7)) {
            setItemTextColor(f0Var.mo144333b(7));
        }
        if (f0Var.mo144342k(0)) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145234s(this, (float) f0Var.mo144335d(0, 0));
        }
        setLabelVisibilityMode(obtainStyledAttributes.getInteger(8, -1));
        setItemHorizontalTranslationEnabled(f0Var.mo144332a(2, true));
        bottomNavigationMenuView.setItemBackgroundRes(f0Var.mo144340i(1, 0));
        if (f0Var.mo144342k(9)) {
            int i3 = f0Var.mo144340i(9, 0);
            bottomNavigationPresenter.f309206e = true;
            getMenuInflater().inflate(i3, aVar);
            bottomNavigationPresenter.f309206e = false;
            bottomNavigationPresenter.mo143539c(true);
        }
        f0Var.mo144343m();
        addView(bottomNavigationMenuView, layoutParams2);
        aVar.f305239h = new C104420a();
    }
}
