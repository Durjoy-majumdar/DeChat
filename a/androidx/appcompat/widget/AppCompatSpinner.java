package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class AppCompatSpinner extends Spinner {

    /* renamed from: o */
    public static final int[] f305460o = {16843505};

    /* renamed from: d */
    public final C103523d f305461d;

    /* renamed from: e */
    public final Context f305462e;

    /* renamed from: f */
    public C103560s f305463f;

    /* renamed from: g */
    public SpinnerAdapter f305464g;

    /* renamed from: h */
    public final boolean f305465h;

    /* renamed from: i */
    public C103489b f305466i;

    /* renamed from: j */
    public int f305467j;

    /* renamed from: n */
    public final Rect f305468n;

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public static class C103488a implements ListAdapter, SpinnerAdapter {

        /* renamed from: d */
        public SpinnerAdapter f305469d;

        /* renamed from: e */
        public ListAdapter f305470e;

        public C103488a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f305469d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f305470e = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C103520b0) {
                C103520b0 b0Var = (C103520b0) spinnerAdapter;
                if (b0Var.getDropDownViewTheme() == null) {
                    b0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f305470e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f305470e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f305469d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C103489b extends ListPopupWindow {

        /* renamed from: I */
        public CharSequence f305471I;

        /* renamed from: J */
        public ListAdapter f305472J;

        /* renamed from: K */
        public final Rect f305473K = new Rect();

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b$a */
        public class C103490a implements AdapterView.OnItemClickListener {
            public C103490a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C103489b bVar = C103489b.this;
                    AppCompatSpinner.this.performItemClick(view, i, bVar.f305472J.getItemId(i));
                }
                C103489b.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b$b */
        public class C103491b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C103491b() {
            }

            public void onGlobalLayout() {
                C103489b bVar = C103489b.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                bVar.getClass();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (!(C107207u.C107211e.m145207b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(bVar.f305473K))) {
                    C103489b.this.dismiss();
                    return;
                }
                C103489b.this.mo144019g();
                C103489b.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b$c */
        public class C103492c implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f305477d;

            public C103492c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f305477d = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f305477d);
                }
            }
        }

        public C103489b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f305529u = AppCompatSpinner.this;
            this.f305513D = true;
            this.f305514E.setFocusable(true);
            this.f305530v = new C103490a(AppCompatSpinner.this);
        }

        /* renamed from: d */
        public void mo144018d(ListAdapter listAdapter) {
            super.mo144018d(listAdapter);
            this.f305472J = listAdapter;
        }

        /* renamed from: g */
        public void mo144019g() {
            Drawable background = this.f305514E.getBackground();
            int i = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f305468n);
                i = C103553n0.m137647a(AppCompatSpinner.this) ? AppCompatSpinner.this.f305468n.right : -AppCompatSpinner.this.f305468n.left;
            } else {
                Rect rect = AppCompatSpinner.this.f305468n;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f305467j;
            if (i2 == -2) {
                int a = appCompatSpinner.mo143979a((SpinnerAdapter) this.f305472J, this.f305514E.getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f305468n;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (a > i4) {
                    a = i4;
                }
                mo144091e(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                mo144091e((width - paddingLeft) - paddingRight);
            } else {
                mo144091e(i2);
            }
            this.f305520i = C103553n0.m137647a(AppCompatSpinner.this) ? i + ((width - paddingRight) - this.f305519h) : i + paddingLeft;
        }

        public void show() {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            mo144019g();
            this.f305514E.setInputMethodMode(2);
            super.show();
            this.f305517f.setChoiceMode(1);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            C103557q qVar = this.f305517f;
            if (isShowing() && qVar != null) {
                qVar.setListSelectionHidden(false);
                qVar.setSelection(selectedItemPosition);
                if (qVar.getChoiceMode() != 0) {
                    qVar.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!isShowing && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C103491b bVar = new C103491b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f305514E.setOnDismissListener(new C103492c(bVar));
            }
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a1t);
    }

    /* renamed from: a */
    public int mo143979a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f305468n);
        Rect rect = this.f305468n;
        return i2 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            dVar.mo144312a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C103489b bVar = this.f305466i;
        return bVar != null ? bVar.f305520i : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C103489b bVar = this.f305466i;
        if (bVar == null) {
            return super.getDropDownVerticalOffset();
        }
        if (!bVar.f305523o) {
            return 0;
        }
        return bVar.f305521j;
    }

    public int getDropDownWidth() {
        return this.f305466i != null ? this.f305467j : super.getDropDownWidth();
    }

    public Drawable getPopupBackground() {
        C103489b bVar = this.f305466i;
        return bVar != null ? bVar.f305514E.getBackground() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        if (this.f305466i != null) {
            return this.f305462e;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        C103489b bVar = this.f305466i;
        return bVar != null ? bVar.f305471I : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            return dVar.mo144313b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            return dVar.mo144314c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C103489b bVar = this.f305466i;
        if (bVar != null && bVar.isShowing()) {
            this.f305466i.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f305466i != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo143979a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C103560s sVar = this.f305463f;
        if (sVar == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C103489b bVar = this.f305466i;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.isShowing()) {
            return true;
        }
        this.f305466i.show();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            dVar.mo144316e(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            dVar.mo144317f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C103489b bVar = this.f305466i;
        if (bVar != null) {
            bVar.f305520i = i;
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C103489b bVar = this.f305466i;
        if (bVar != null) {
            bVar.f305521j = i;
            bVar.f305523o = true;
            return;
        }
        super.setDropDownVerticalOffset(i);
    }

    public void setDropDownWidth(int i) {
        if (this.f305466i != null) {
            this.f305467j = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C103489b bVar = this.f305466i;
        if (bVar != null) {
            bVar.f305514E.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C107922a.m146228b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C103489b bVar = this.f305466i;
        if (bVar != null) {
            bVar.f305471I = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            dVar.mo144319h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C103523d dVar = this.f305461d;
        if (dVar != null) {
            dVar.mo144320i(mode);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r5 != null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f305468n = r0
            int[] r0 = p433g.C107593a.f321926z
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r9)
            r9.f305461d = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            r3 = 0
            if (r2 == 0) goto L_0x0028
            k.c r4 = new k.c
            r4.<init>(r10, r2)
            r9.f305462e = r4
            goto L_0x0033
        L_0x0028:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 >= r4) goto L_0x0030
            r2 = r10
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            r9.f305462e = r2
        L_0x0033:
            android.content.Context r2 = r9.f305462e
            r4 = 1
            if (r2 == 0) goto L_0x0094
            r2 = -1
            int[] r5 = f305460o     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r12, r1)     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            boolean r6 = r5.hasValue(r1)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            if (r6 == 0) goto L_0x005a
            int r2 = r5.getInt(r1, r1)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            goto L_0x005a
        L_0x004a:
            r10 = move-exception
            r3 = r5
            goto L_0x0050
        L_0x004d:
            goto L_0x0058
        L_0x004f:
            r10 = move-exception
        L_0x0050:
            if (r3 == 0) goto L_0x0055
            r3.recycle()
        L_0x0055:
            throw r10
        L_0x0056:
            r5 = r3
        L_0x0058:
            if (r5 == 0) goto L_0x005d
        L_0x005a:
            r5.recycle()
        L_0x005d:
            if (r2 != r4) goto L_0x0094
            androidx.appcompat.widget.AppCompatSpinner$b r2 = new androidx.appcompat.widget.AppCompatSpinner$b
            android.content.Context r5 = r9.f305462e
            r2.<init>(r5, r11, r12)
            android.content.Context r5 = r9.f305462e
            int[] r6 = p433g.C107593a.f321926z
            androidx.appcompat.widget.f0 r5 = androidx.appcompat.widget.C103533f0.m137562l(r5, r11, r6, r12, r1)
            r6 = 3
            r7 = -2
            android.content.res.TypedArray r8 = r5.f305736b
            int r6 = r8.getLayoutDimension(r6, r7)
            r9.f305467j = r6
            android.graphics.drawable.Drawable r6 = r5.mo144336e(r4)
            android.widget.PopupWindow r7 = r2.f305514E
            r7.setBackgroundDrawable(r6)
            r6 = 2
            java.lang.String r6 = r0.getString(r6)
            r2.f305471I = r6
            r5.mo144343m()
            r9.f305466i = r2
            androidx.appcompat.widget.k r5 = new androidx.appcompat.widget.k
            r5.<init>(r9, r9, r2)
            r9.f305463f = r5
        L_0x0094:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00ab
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r10, r5, r1)
            r10 = 2131497890(0x7f0c13a2, float:1.8619386E38)
            r2.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r2)
        L_0x00ab:
            r0.recycle()
            r9.f305465h = r4
            android.widget.SpinnerAdapter r10 = r9.f305464g
            if (r10 == 0) goto L_0x00b9
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f305464g = r3
        L_0x00b9:
            androidx.appcompat.widget.d r10 = r9.f305461d
            r10.mo144315d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f305465h) {
            this.f305464g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f305466i != null) {
            Context context = this.f305462e;
            if (context == null) {
                context = getContext();
            }
            this.f305466i.mo144018d(new C103488a(spinnerAdapter, context.getTheme()));
        }
    }
}
