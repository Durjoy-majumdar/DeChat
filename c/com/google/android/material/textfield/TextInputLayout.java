package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C103527f;
import androidx.appcompat.widget.C103533f0;
import androidx.appcompat.widget.C103556p;
import androidx.core.widget.C103733h;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.tencent.p014mm.C0966R;
import com.tencent.tav.core.ExportErrorStatus;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p1108f3.C107453d;
import p1114g8.C107764a;
import p1115h.C107922a;
import p1139o8.C109969c;
import p1139o8.C109970d;
import p1139o8.C109971e;
import p1139o8.C109991k;
import p1139o8.C109992l;
import p1162x2.C112019a;
import p161h8.C108164a;
import p385u2.C111105a;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    public float f309552A;

    /* renamed from: B */
    public float f309553B;

    /* renamed from: C */
    public int f309554C;

    /* renamed from: D */
    public final int f309555D;

    /* renamed from: E */
    public final int f309556E;

    /* renamed from: F */
    public int f309557F;

    /* renamed from: G */
    public int f309558G;

    /* renamed from: H */
    public Drawable f309559H;

    /* renamed from: I */
    public final Rect f309560I;

    /* renamed from: J */
    public final RectF f309561J;

    /* renamed from: K */
    public Typeface f309562K;

    /* renamed from: L */
    public boolean f309563L;

    /* renamed from: M */
    public Drawable f309564M;

    /* renamed from: N */
    public CharSequence f309565N;

    /* renamed from: P */
    public CheckableImageButton f309566P;

    /* renamed from: Q */
    public boolean f309567Q;

    /* renamed from: Q0 */
    public final int f309568Q0;

    /* renamed from: R */
    public Drawable f309569R;

    /* renamed from: R0 */
    public int f309570R0;

    /* renamed from: S */
    public Drawable f309571S;

    /* renamed from: S0 */
    public final int f309572S0;

    /* renamed from: T */
    public ColorStateList f309573T;

    /* renamed from: T0 */
    public boolean f309574T0;

    /* renamed from: U */
    public boolean f309575U;

    /* renamed from: U0 */
    public final C109969c f309576U0;

    /* renamed from: V */
    public PorterDuff.Mode f309577V;

    /* renamed from: V0 */
    public boolean f309578V0;

    /* renamed from: W */
    public boolean f309579W;

    /* renamed from: W0 */
    public ValueAnimator f309580W0;

    /* renamed from: X0 */
    public boolean f309581X0;

    /* renamed from: Y0 */
    public boolean f309582Y0;

    /* renamed from: Z0 */
    public boolean f309583Z0;

    /* renamed from: d */
    public final FrameLayout f309584d;

    /* renamed from: e */
    public EditText f309585e;

    /* renamed from: f */
    public CharSequence f309586f;

    /* renamed from: g */
    public final C104482b f309587g;

    /* renamed from: h */
    public boolean f309588h;

    /* renamed from: i */
    public int f309589i;

    /* renamed from: j */
    public boolean f309590j;

    /* renamed from: n */
    public TextView f309591n;

    /* renamed from: o */
    public final int f309592o;

    /* renamed from: p */
    public final int f309593p;

    /* renamed from: p0 */
    public ColorStateList f309594p0;

    /* renamed from: q */
    public boolean f309595q;

    /* renamed from: r */
    public CharSequence f309596r;

    /* renamed from: s */
    public boolean f309597s;

    /* renamed from: t */
    public GradientDrawable f309598t;

    /* renamed from: u */
    public final int f309599u;

    /* renamed from: v */
    public final int f309600v;

    /* renamed from: w */
    public int f309601w;

    /* renamed from: x */
    public final int f309602x;

    /* renamed from: x0 */
    public ColorStateList f309603x0;

    /* renamed from: y */
    public float f309604y;

    /* renamed from: y0 */
    public final int f309605y0;

    /* renamed from: z */
    public float f309606z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104476a();

        /* renamed from: f */
        public CharSequence f309607f;

        /* renamed from: g */
        public boolean f309608g;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public static class C104476a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f309607f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            TextUtils.writeToParcel(this.f309607f, parcel, i);
            parcel.writeInt(this.f309608g ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f309607f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f309608g = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C104477a implements TextWatcher {
        public C104477a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo147004n(!textInputLayout.f309583Z0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f309588h) {
                textInputLayout2.mo147001k(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C104478b implements View.OnClickListener {
        public C104478b() {
        }

        public void onClick(View view) {
            TextInputLayout.this.mo146999h(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C104479c implements ValueAnimator.AnimatorUpdateListener {
        public C104479c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f309576U0.mo161315n(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C104480d extends C107166a {

        /* renamed from: e */
        public final TextInputLayout f309612e;

        public C104480d(TextInputLayout textInputLayout) {
            this.f309612e = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            EditText editText = this.f309612e.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f309612e.getHint();
            CharSequence error = this.f309612e.getError();
            CharSequence counterOverflowDescription = this.f309612e.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                dVar.mo157866y(text);
            } else if (z2) {
                dVar.mo157866y(hint);
            }
            if (z2) {
                dVar.mo157858r(hint);
                if (!z && z2) {
                    z4 = true;
                }
                dVar.mo157864w(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                dVar.f321473a.setError(error);
                dVar.f321473a.setContentInvalid(true);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            EditText editText = this.f309612e.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.f309612e.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a4g);
    }

    private Drawable getBoxBackground() {
        int i = this.f309601w;
        if (i == 1 || i == 2) {
            return this.f309598t;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!(C107207u.C107209c.m145195d(this) == 1)) {
            float f = this.f309604y;
            float f2 = this.f309606z;
            float f3 = this.f309552A;
            float f4 = this.f309553B;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        float f5 = this.f309606z;
        float f6 = this.f309604y;
        float f7 = this.f309553B;
        float f8 = this.f309552A;
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    /* renamed from: i */
    public static void m139726i(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m139726i((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f309585e == null) {
            boolean z = editText instanceof TextInputEditText;
            this.f309585e = editText;
            mo146976f();
            setTextInputAccessibilityDelegate(new C104480d(this));
            EditText editText2 = this.f309585e;
            if (!(editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod))) {
                C109969c cVar = this.f309576U0;
                Typeface typeface = this.f309585e.getTypeface();
                cVar.f329111t = typeface;
                cVar.f329110s = typeface;
                cVar.mo161311j();
            }
            C109969c cVar2 = this.f309576U0;
            float textSize = this.f309585e.getTextSize();
            if (cVar2.f329100i != textSize) {
                cVar2.f329100i = textSize;
                cVar2.mo161311j();
            }
            int gravity = this.f309585e.getGravity();
            C109969c cVar3 = this.f309576U0;
            int i = (gravity & ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS) | 48;
            if (cVar3.f329099h != i) {
                cVar3.f329099h = i;
                cVar3.mo161311j();
            }
            C109969c cVar4 = this.f309576U0;
            if (cVar4.f329098g != gravity) {
                cVar4.f329098g = gravity;
                cVar4.mo161311j();
            }
            this.f309585e.addTextChangedListener(new C104477a());
            if (this.f309594p0 == null) {
                this.f309594p0 = this.f309585e.getHintTextColors();
            }
            if (this.f309595q) {
                if (TextUtils.isEmpty(this.f309596r)) {
                    CharSequence hint = this.f309585e.getHint();
                    this.f309586f = hint;
                    setHint(hint);
                    this.f309585e.setHint((CharSequence) null);
                }
                this.f309597s = true;
            }
            if (this.f309591n != null) {
                mo147001k(this.f309585e.getText().length());
            }
            this.f309587g.mo147054b();
            mo147005o();
            mo147004n(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f309596r)) {
            this.f309596r = charSequence;
            C109969c cVar = this.f309576U0;
            if (charSequence == null || !charSequence.equals(cVar.f329113v)) {
                cVar.f329113v = charSequence;
                cVar.f329114w = null;
                Bitmap bitmap = cVar.f329116y;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.f329116y = null;
                }
                cVar.mo161311j();
            }
            if (!this.f309574T0) {
                mo146977g();
            }
        }
    }

    /* renamed from: a */
    public void mo146966a(float f) {
        if (this.f309576U0.f329094c != f) {
            if (this.f309580W0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f309580W0 = valueAnimator;
                valueAnimator.setInterpolator(C108164a.f323891b);
                this.f309580W0.setDuration(167);
                this.f309580W0.addUpdateListener(new C104479c());
            }
            this.f309580W0.setFloatValues(new float[]{this.f309576U0.f329094c, f});
            this.f309580W0.start();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS) | 16;
            this.f309584d.addView(view, layoutParams2);
            this.f309584d.setLayoutParams(layoutParams);
            mo147003m();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo146968b() {
        int i;
        Drawable drawable;
        if (this.f309598t != null) {
            int i2 = this.f309601w;
            if (i2 == 1) {
                this.f309554C = 0;
            } else if (i2 == 2 && this.f309570R0 == 0) {
                this.f309570R0 = this.f309603x0.getColorForState(getDrawableState(), this.f309603x0.getDefaultColor());
            }
            EditText editText = this.f309585e;
            if (editText != null && this.f309601w == 2) {
                if (editText.getBackground() != null) {
                    this.f309559H = this.f309585e.getBackground();
                }
                EditText editText2 = this.f309585e;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145189q(editText2, (Drawable) null);
            }
            EditText editText3 = this.f309585e;
            if (!(editText3 == null || this.f309601w != 1 || (drawable = this.f309559H) == null)) {
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                C107207u.C107208b.m145189q(editText3, drawable);
            }
            int i3 = this.f309554C;
            if (i3 > -1 && (i = this.f309557F) != 0) {
                this.f309598t.setStroke(i3, i);
            }
            this.f309598t.setCornerRadii(getCornerRadiiAsArray());
            this.f309598t.setColor(this.f309558G);
            invalidate();
        }
    }

    /* renamed from: c */
    public final void mo146969c() {
        Drawable drawable;
        Drawable drawable2 = this.f309564M;
        if (drawable2 == null) {
            return;
        }
        if (this.f309575U || this.f309579W) {
            Drawable mutate = C112019a.m152749g(drawable2).mutate();
            this.f309564M = mutate;
            if (this.f309575U) {
                mutate.setTintList(this.f309573T);
            }
            if (this.f309579W) {
                this.f309564M.setTintMode(this.f309577V);
            }
            CheckableImageButton checkableImageButton = this.f309566P;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.f309564M)) {
                this.f309566P.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: d */
    public final int mo146970d() {
        float e;
        if (!this.f309595q) {
            return 0;
        }
        int i = this.f309601w;
        if (i == 0 || i == 1) {
            e = this.f309576U0.mo161307e();
        } else if (i != 2) {
            return 0;
        } else {
            e = this.f309576U0.mo161307e() / 2.0f;
        }
        return (int) e;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f309586f == null || (editText = this.f309585e) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f309597s;
        this.f309597s = false;
        CharSequence hint = editText.getHint();
        this.f309585e.setHint(this.f309586f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f309585e.setHint(hint);
            this.f309597s = z;
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f309583Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f309583Z0 = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f309598t;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f309595q) {
            this.f309576U0.mo161306d(canvas);
        }
    }

    public void drawableStateChanged() {
        if (!this.f309582Y0) {
            boolean z = true;
            this.f309582Y0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107211e.m145208c(this) || !isEnabled()) {
                z = false;
            }
            mo147004n(z, false);
            mo147002l();
            mo147010p();
            mo147011q();
            C109969c cVar = this.f309576U0;
            if (cVar != null ? cVar.mo161317p(drawableState) | false : false) {
                invalidate();
            }
            this.f309582Y0 = false;
        }
    }

    /* renamed from: e */
    public final boolean mo146975e() {
        return this.f309595q && !TextUtils.isEmpty(this.f309596r) && (this.f309598t instanceof C104481a);
    }

    /* renamed from: f */
    public final void mo146976f() {
        int i = this.f309601w;
        if (i == 0) {
            this.f309598t = null;
        } else if (i == 2 && this.f309595q && !(this.f309598t instanceof C104481a)) {
            this.f309598t = new C104481a();
        } else if (!(this.f309598t instanceof GradientDrawable)) {
            this.f309598t = new GradientDrawable();
        }
        if (this.f309601w != 0) {
            mo147003m();
        }
        mo147010p();
    }

    /* renamed from: g */
    public final void mo146977g() {
        float f;
        float f2;
        float f3;
        if (mo146975e()) {
            RectF rectF = this.f309561J;
            C109969c cVar = this.f309576U0;
            boolean b = cVar.mo161304b(cVar.f329113v);
            Rect rect = cVar.f329096e;
            float f4 = 0.0f;
            if (!b) {
                f = (float) rect.left;
            } else {
                float f5 = (float) rect.right;
                if (cVar.f329113v == null) {
                    f3 = 0.0f;
                } else {
                    TextPaint textPaint = cVar.f329081E;
                    textPaint.setTextSize(cVar.f329101j);
                    textPaint.setTypeface(cVar.f329110s);
                    TextPaint textPaint2 = cVar.f329081E;
                    CharSequence charSequence = cVar.f329113v;
                    f3 = textPaint2.measureText(charSequence, 0, charSequence.length());
                }
                f = f5 - f3;
            }
            rectF.left = f;
            Rect rect2 = cVar.f329096e;
            rectF.top = (float) rect2.top;
            if (!b) {
                if (cVar.f329113v != null) {
                    TextPaint textPaint3 = cVar.f329081E;
                    textPaint3.setTextSize(cVar.f329101j);
                    textPaint3.setTypeface(cVar.f329110s);
                    TextPaint textPaint4 = cVar.f329081E;
                    CharSequence charSequence2 = cVar.f329113v;
                    f4 = textPaint4.measureText(charSequence2, 0, charSequence2.length());
                }
                f2 = f + f4;
            } else {
                f2 = (float) rect2.right;
            }
            rectF.right = f2;
            float e = ((float) cVar.f329096e.top) + cVar.mo161307e();
            float f6 = rectF.left;
            float f7 = (float) this.f309600v;
            rectF.left = f6 - f7;
            rectF.top -= f7;
            rectF.right += f7;
            rectF.bottom = e + f7;
            C104481a aVar = (C104481a) this.f309598t;
            aVar.getClass();
            aVar.mo147051a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public int getBoxBackgroundColor() {
        return this.f309558G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f309552A;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f309553B;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f309606z;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f309604y;
    }

    public int getBoxStrokeColor() {
        return this.f309570R0;
    }

    public int getCounterMaxLength() {
        return this.f309589i;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f309588h || !this.f309590j || (textView = this.f309591n) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f309594p0;
    }

    public EditText getEditText() {
        return this.f309585e;
    }

    public CharSequence getError() {
        C104482b bVar = this.f309587g;
        if (bVar.f309627l) {
            return bVar.f309626k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.f309587g.f309628m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.f309587g.f309628m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C104482b bVar = this.f309587g;
        if (bVar.f309631p) {
            return bVar.f309630o;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f309587g.f309632q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f309595q) {
            return this.f309596r;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f309576U0.mo161307e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f309576U0.mo161308f();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f309565N;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f309564M;
    }

    public Typeface getTypeface() {
        return this.f309562K;
    }

    /* renamed from: h */
    public void mo146999h(boolean z) {
        if (this.f309563L) {
            int selectionEnd = this.f309585e.getSelectionEnd();
            EditText editText = this.f309585e;
            if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                this.f309585e.setTransformationMethod((TransformationMethod) null);
                this.f309567Q = true;
            } else {
                this.f309585e.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f309567Q = false;
            }
            this.f309566P.setChecked(this.f309567Q);
            if (z) {
                this.f309566P.jumpDrawablesToCurrentState();
            }
            this.f309585e.setSelection(selectionEnd);
        }
    }

    /* renamed from: j */
    public void mo147000j(TextView textView, int i) {
        boolean z = true;
        try {
            C103733h.m138110g(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C103733h.m138110g(textView, C0966R.style.f8781v3);
            textView.setTextColor(C111105a.m151500b(getContext(), C0966R.color.f3290mf));
        }
    }

    /* renamed from: k */
    public void mo147001k(int i) {
        boolean z = this.f309590j;
        if (this.f309589i == -1) {
            this.f309591n.setText(String.valueOf(i));
            this.f309591n.setContentDescription((CharSequence) null);
            this.f309590j = false;
        } else {
            TextView textView = this.f309591n;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145206a(textView) == 1) {
                C107207u.C107211e.m145211f(this.f309591n, 0);
            }
            boolean z2 = i > this.f309589i;
            this.f309590j = z2;
            if (z != z2) {
                mo147000j(this.f309591n, z2 ? this.f309592o : this.f309593p);
                if (this.f309590j) {
                    C107207u.C107211e.m145211f(this.f309591n, 1);
                }
            }
            this.f309591n.setText(getContext().getString(C0966R.string.b38, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f309589i)}));
            this.f309591n.setContentDescription(getContext().getString(C0966R.string.b37, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f309589i)}));
        }
        if (this.f309585e != null && z != this.f309590j) {
            mo147004n(false, false);
            mo147011q();
            mo147002l();
        }
    }

    /* renamed from: l */
    public void mo147002l() {
        Drawable background;
        TextView textView;
        Drawable background2;
        EditText editText = this.f309585e;
        if (editText != null && (background = editText.getBackground()) != null) {
            int i = Build.VERSION.SDK_INT;
            if ((i == 21 || i == 22) && (background2 = this.f309585e.getBackground()) != null && !this.f309581X0) {
                Drawable newDrawable = background2.getConstantState().newDrawable();
                if (background2 instanceof DrawableContainer) {
                    DrawableContainer drawableContainer = (DrawableContainer) background2;
                    Drawable.ConstantState constantState = newDrawable.getConstantState();
                    boolean z = false;
                    if (!C109971e.f329121b) {
                        try {
                            Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                            C109971e.f329120a = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        C109971e.f329121b = true;
                    }
                    Method method = C109971e.f329120a;
                    if (method != null) {
                        try {
                            method.invoke(drawableContainer, new Object[]{constantState});
                            z = true;
                        } catch (Exception unused2) {
                        }
                    }
                    this.f309581X0 = z;
                }
                if (!this.f309581X0) {
                    EditText editText2 = this.f309585e;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145189q(editText2, newDrawable);
                    this.f309581X0 = true;
                    mo146976f();
                }
            }
            if (C103556p.m137671a(background)) {
                background = background.mutate();
            }
            if (this.f309587g.mo147057e()) {
                TextView textView2 = this.f309587g.f309628m;
                background.setColorFilter(C103527f.m137546j(textView2 != null ? textView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
            } else if (!this.f309590j || (textView = this.f309591n) == null) {
                C112019a.m152743a(background);
                this.f309585e.refreshDrawableState();
            } else {
                background.setColorFilter(C103527f.m137546j(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: m */
    public final void mo147003m() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f309584d.getLayoutParams();
        int d = mo146970d();
        if (d != layoutParams.topMargin) {
            layoutParams.topMargin = d;
            this.f309584d.requestLayout();
        }
    }

    /* renamed from: n */
    public final void mo147004n(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f309585e;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f309585e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e = this.f309587g.mo147057e();
        ColorStateList colorStateList2 = this.f309594p0;
        if (colorStateList2 != null) {
            this.f309576U0.mo161313l(colorStateList2);
            C109969c cVar = this.f309576U0;
            ColorStateList colorStateList3 = this.f309594p0;
            if (cVar.f329102k != colorStateList3) {
                cVar.f329102k = colorStateList3;
                cVar.mo161311j();
            }
        }
        if (!isEnabled) {
            this.f309576U0.mo161313l(ColorStateList.valueOf(this.f309572S0));
            C109969c cVar2 = this.f309576U0;
            ColorStateList valueOf = ColorStateList.valueOf(this.f309572S0);
            if (cVar2.f329102k != valueOf) {
                cVar2.f329102k = valueOf;
                cVar2.mo161311j();
            }
        } else if (e) {
            C109969c cVar3 = this.f309576U0;
            TextView textView2 = this.f309587g.f309628m;
            cVar3.mo161313l(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f309590j && (textView = this.f309591n) != null) {
            this.f309576U0.mo161313l(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f309603x0) != null) {
            this.f309576U0.mo161313l(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || e))) {
            if (z2 || this.f309574T0) {
                ValueAnimator valueAnimator = this.f309580W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f309580W0.cancel();
                }
                if (!z || !this.f309578V0) {
                    this.f309576U0.mo161315n(1.0f);
                } else {
                    mo146966a(1.0f);
                }
                this.f309574T0 = false;
                if (mo146975e()) {
                    mo146977g();
                }
            }
        } else if (z2 || !this.f309574T0) {
            ValueAnimator valueAnimator2 = this.f309580W0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f309580W0.cancel();
            }
            if (!z || !this.f309578V0) {
                this.f309576U0.mo161315n(0.0f);
            } else {
                mo146966a(0.0f);
            }
            if (mo146975e() && (!((C104481a) this.f309598t).f309614b.isEmpty()) && mo146975e()) {
                ((C104481a) this.f309598t).mo147051a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f309574T0 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo147005o() {
        /*
            r7 = this;
            android.widget.EditText r0 = r7.f309585e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r1 = r7.f309563L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0017
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            boolean r0 = r7.f309567Q
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1 = 3
            r4 = 2
            if (r0 == 0) goto L_0x00cb
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            if (r0 != 0) goto L_0x005b
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r5 = 2131494044(0x7f0c049c, float:1.8611585E38)
            android.widget.FrameLayout r6 = r7.f309584d
            android.view.View r0 = r0.inflate(r5, r6, r2)
            com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) r0
            r7.f309566P = r0
            android.graphics.drawable.Drawable r5 = r7.f309564M
            r0.setImageDrawable(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            java.lang.CharSequence r5 = r7.f309565N
            r0.setContentDescription(r5)
            android.widget.FrameLayout r0 = r7.f309584d
            com.google.android.material.internal.CheckableImageButton r5 = r7.f309566P
            r0.addView(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            com.google.android.material.textfield.TextInputLayout$b r5 = new com.google.android.material.textfield.TextInputLayout$b
            r5.<init>()
            r0.setOnClickListener(r5)
        L_0x005b:
            android.widget.EditText r0 = r7.f309585e
            if (r0 == 0) goto L_0x0072
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a
            int r0 = p849e3.C107207u.C107208b.m145176d(r0)
            if (r0 > 0) goto L_0x0072
            android.widget.EditText r0 = r7.f309585e
            com.google.android.material.internal.CheckableImageButton r5 = r7.f309566P
            int r5 = p849e3.C107207u.C107208b.m145176d(r5)
            r0.setMinimumHeight(r5)
        L_0x0072:
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            r0.setVisibility(r2)
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            boolean r5 = r7.f309567Q
            r0.setChecked(r5)
            android.graphics.drawable.Drawable r0 = r7.f309569R
            if (r0 != 0) goto L_0x0089
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r7.f309569R = r0
        L_0x0089:
            android.graphics.drawable.Drawable r0 = r7.f309569R
            com.google.android.material.internal.CheckableImageButton r5 = r7.f309566P
            int r5 = r5.getMeasuredWidth()
            r0.setBounds(r2, r2, r5, r3)
            android.widget.EditText r0 = r7.f309585e
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r4 = r0[r4]
            android.graphics.drawable.Drawable r5 = r7.f309569R
            if (r4 == r5) goto L_0x00a2
            r7.f309571S = r4
        L_0x00a2:
            android.widget.EditText r4 = r7.f309585e
            r2 = r0[r2]
            r3 = r0[r3]
            r0 = r0[r1]
            r4.setCompoundDrawablesRelative(r2, r3, r5, r0)
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            android.widget.EditText r1 = r7.f309585e
            int r1 = r1.getPaddingLeft()
            android.widget.EditText r2 = r7.f309585e
            int r2 = r2.getPaddingTop()
            android.widget.EditText r3 = r7.f309585e
            int r3 = r3.getPaddingRight()
            android.widget.EditText r4 = r7.f309585e
            int r4 = r4.getPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
            goto L_0x00fc
        L_0x00cb:
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            if (r0 == 0) goto L_0x00dc
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00dc
            com.google.android.material.internal.CheckableImageButton r0 = r7.f309566P
            r5 = 8
            r0.setVisibility(r5)
        L_0x00dc:
            android.graphics.drawable.Drawable r0 = r7.f309569R
            if (r0 == 0) goto L_0x00fc
            android.widget.EditText r0 = r7.f309585e
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r4 = r0[r4]
            android.graphics.drawable.Drawable r5 = r7.f309569R
            if (r4 != r5) goto L_0x00fc
            android.widget.EditText r4 = r7.f309585e
            r2 = r0[r2]
            r3 = r0[r3]
            android.graphics.drawable.Drawable r5 = r7.f309571S
            r0 = r0[r1]
            r4.setCompoundDrawablesRelative(r2, r3, r5, r0)
            r0 = 0
            r7.f309569R = r0
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo147005o():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f309598t != null) {
            mo147010p();
        }
        if (this.f309595q && (editText = this.f309585e) != null) {
            Rect rect = this.f309560I;
            C109970d.m149490a(this, editText, rect);
            int compoundPaddingLeft = rect.left + this.f309585e.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f309585e.getCompoundPaddingRight();
            int i5 = this.f309601w;
            int paddingTop = i5 != 1 ? i5 != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - mo146970d() : getBoxBackground().getBounds().top + this.f309602x;
            C109969c cVar = this.f309576U0;
            int compoundPaddingTop = rect.top + this.f309585e.getCompoundPaddingTop();
            int compoundPaddingBottom = rect.bottom - this.f309585e.getCompoundPaddingBottom();
            Rect rect2 = cVar.f329095d;
            boolean z2 = false;
            if (!(rect2.left == compoundPaddingLeft && rect2.top == compoundPaddingTop && rect2.right == compoundPaddingRight && rect2.bottom == compoundPaddingBottom)) {
                rect2.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
                cVar.f329079C = true;
                cVar.mo161309h();
            }
            C109969c cVar2 = this.f309576U0;
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            Rect rect3 = cVar2.f329096e;
            if (rect3.left == compoundPaddingLeft && rect3.top == paddingTop && rect3.right == compoundPaddingRight && rect3.bottom == paddingBottom) {
                z2 = true;
            }
            if (!z2) {
                rect3.set(compoundPaddingLeft, paddingTop, compoundPaddingRight, paddingBottom);
                cVar2.f329079C = true;
                cVar2.mo161309h();
            }
            this.f309576U0.mo161311j();
            if (mo146975e() && !this.f309574T0) {
                mo146977g();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        mo147005o();
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        setError(savedState.f309607f);
        if (savedState.f309608g) {
            mo146999h(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f309587g.mo147057e()) {
            savedState.f309607f = getError();
        }
        savedState.f309608g = this.f309567Q;
        return savedState;
    }

    /* renamed from: p */
    public final void mo147010p() {
        Drawable background;
        if (this.f309601w != 0 && this.f309598t != null && this.f309585e != null && getRight() != 0) {
            int left = this.f309585e.getLeft();
            EditText editText = this.f309585e;
            int i = 0;
            if (editText != null) {
                int i2 = this.f309601w;
                if (i2 == 1) {
                    i = editText.getTop();
                } else if (i2 == 2) {
                    i = mo146970d() + editText.getTop();
                }
            }
            int right = this.f309585e.getRight();
            int bottom = this.f309585e.getBottom() + this.f309599u;
            if (this.f309601w == 2) {
                int i3 = this.f309556E;
                left += i3 / 2;
                i -= i3 / 2;
                right -= i3 / 2;
                bottom += i3 / 2;
            }
            this.f309598t.setBounds(left, i, right, bottom);
            mo146968b();
            EditText editText2 = this.f309585e;
            if (editText2 != null && (background = editText2.getBackground()) != null) {
                if (C103556p.m137671a(background)) {
                    background = background.mutate();
                }
                C109970d.m149490a(this, this.f309585e, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f309585e.getBottom());
                }
            }
        }
    }

    /* renamed from: q */
    public void mo147011q() {
        TextView textView;
        if (this.f309598t != null && this.f309601w != 0) {
            EditText editText = this.f309585e;
            boolean z = false;
            boolean z2 = editText != null && editText.hasFocus();
            EditText editText2 = this.f309585e;
            if (editText2 != null && editText2.isHovered()) {
                z = true;
            }
            if (this.f309601w == 2) {
                if (!isEnabled()) {
                    this.f309557F = this.f309572S0;
                } else if (this.f309587g.mo147057e()) {
                    TextView textView2 = this.f309587g.f309628m;
                    this.f309557F = textView2 != null ? textView2.getCurrentTextColor() : -1;
                } else if (this.f309590j && (textView = this.f309591n) != null) {
                    this.f309557F = textView.getCurrentTextColor();
                } else if (z2) {
                    this.f309557F = this.f309570R0;
                } else if (z) {
                    this.f309557F = this.f309568Q0;
                } else {
                    this.f309557F = this.f309605y0;
                }
                if ((z || z2) && isEnabled()) {
                    this.f309554C = this.f309556E;
                } else {
                    this.f309554C = this.f309555D;
                }
                mo146968b();
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f309558G != i) {
            this.f309558G = i;
            mo146968b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C111105a.m151500b(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f309601w) {
            this.f309601w = i;
            mo146976f();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f309570R0 != i) {
            this.f309570R0 = i;
            mo147011q();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f309588h != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.f309591n = appCompatTextView;
                appCompatTextView.setId(C0966R.C0970id.kix);
                Typeface typeface = this.f309562K;
                if (typeface != null) {
                    this.f309591n.setTypeface(typeface);
                }
                this.f309591n.setMaxLines(1);
                mo147000j(this.f309591n, this.f309593p);
                this.f309587g.mo147053a(this.f309591n, 2);
                EditText editText = this.f309585e;
                if (editText == null) {
                    mo147001k(0);
                } else {
                    mo147001k(editText.getText().length());
                }
            } else {
                this.f309587g.mo147060h(this.f309591n, 2);
                this.f309591n = null;
            }
            this.f309588h = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f309589i != i) {
            if (i > 0) {
                this.f309589i = i;
            } else {
                this.f309589i = -1;
            }
            if (this.f309588h) {
                EditText editText = this.f309585e;
                mo147001k(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f309594p0 = colorStateList;
        this.f309603x0 = colorStateList;
        if (this.f309585e != null) {
            mo147004n(false, false);
        }
    }

    public void setEnabled(boolean z) {
        m139726i(this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f309587g.f309627l) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C104482b bVar = this.f309587g;
            bVar.mo147055c();
            bVar.f309626k = charSequence;
            bVar.f309628m.setText(charSequence);
            int i = bVar.f309624i;
            if (i != 1) {
                bVar.f309625j = 1;
            }
            bVar.mo147062j(i, bVar.f309625j, bVar.mo147061i(bVar.f309628m, charSequence));
            return;
        }
        this.f309587g.mo147059g();
    }

    public void setErrorEnabled(boolean z) {
        C104482b bVar = this.f309587g;
        if (bVar.f309627l != z) {
            bVar.mo147055c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(bVar.f309616a, (AttributeSet) null);
                bVar.f309628m = appCompatTextView;
                appCompatTextView.setId(C0966R.C0970id.kiy);
                Typeface typeface = bVar.f309634s;
                if (typeface != null) {
                    bVar.f309628m.setTypeface(typeface);
                }
                int i = bVar.f309629n;
                bVar.f309629n = i;
                TextView textView = bVar.f309628m;
                if (textView != null) {
                    bVar.f309617b.mo147000j(textView, i);
                }
                bVar.f309628m.setVisibility(4);
                TextView textView2 = bVar.f309628m;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107211e.m145211f(textView2, 1);
                bVar.mo147053a(bVar.f309628m, 0);
            } else {
                bVar.mo147059g();
                bVar.mo147060h(bVar.f309628m, 0);
                bVar.f309628m = null;
                bVar.f309617b.mo147002l();
                bVar.f309617b.mo147011q();
            }
            bVar.f309627l = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        C104482b bVar = this.f309587g;
        bVar.f309629n = i;
        TextView textView = bVar.f309628m;
        if (textView != null) {
            bVar.f309617b.mo147000j(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.f309587g.f309628m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f309587g.f309631p) {
                setHelperTextEnabled(true);
            }
            C104482b bVar = this.f309587g;
            bVar.mo147055c();
            bVar.f309630o = charSequence;
            bVar.f309632q.setText(charSequence);
            int i = bVar.f309624i;
            if (i != 2) {
                bVar.f309625j = 2;
            }
            bVar.mo147062j(i, bVar.f309625j, bVar.mo147061i(bVar.f309632q, charSequence));
        } else if (this.f309587g.f309631p) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.f309587g.f309632q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C104482b bVar = this.f309587g;
        if (bVar.f309631p != z) {
            bVar.mo147055c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(bVar.f309616a, (AttributeSet) null);
                bVar.f309632q = appCompatTextView;
                appCompatTextView.setId(C0966R.C0970id.kiz);
                Typeface typeface = bVar.f309634s;
                if (typeface != null) {
                    bVar.f309632q.setTypeface(typeface);
                }
                bVar.f309632q.setVisibility(4);
                TextView textView = bVar.f309632q;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107211e.m145211f(textView, 1);
                int i = bVar.f309633r;
                bVar.f309633r = i;
                TextView textView2 = bVar.f309632q;
                if (textView2 != null) {
                    C103733h.m138110g(textView2, i);
                }
                bVar.mo147053a(bVar.f309632q, 1);
            } else {
                bVar.mo147055c();
                int i2 = bVar.f309624i;
                if (i2 == 2) {
                    bVar.f309625j = 0;
                }
                bVar.mo147062j(i2, bVar.f309625j, bVar.mo147061i(bVar.f309632q, (CharSequence) null));
                bVar.mo147060h(bVar.f309632q, 1);
                bVar.f309632q = null;
                bVar.f309617b.mo147002l();
                bVar.f309617b.mo147011q();
            }
            bVar.f309631p = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C104482b bVar = this.f309587g;
        bVar.f309633r = i;
        TextView textView = bVar.f309632q;
        if (textView != null) {
            C103733h.m138110g(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f309595q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f309578V0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f309595q) {
            this.f309595q = z;
            if (!z) {
                this.f309597s = false;
                if (!TextUtils.isEmpty(this.f309596r) && TextUtils.isEmpty(this.f309585e.getHint())) {
                    this.f309585e.setHint(this.f309596r);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f309585e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f309596r)) {
                        setHint(hint);
                    }
                    this.f309585e.setHint((CharSequence) null);
                }
                this.f309597s = true;
            }
            if (this.f309585e != null) {
                mo147003m();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f309576U0.mo161312k(i);
        this.f309603x0 = this.f309576U0.f329103l;
        if (this.f309585e != null) {
            mo147004n(false, false);
            mo147003m();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C107922a.m146228b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.f309563L != z) {
            this.f309563L = z;
            if (!z && this.f309567Q && (editText = this.f309585e) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f309567Q = false;
            mo147005o();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f309573T = colorStateList;
        this.f309575U = true;
        mo146969c();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f309577V = mode;
        this.f309579W = true;
        mo146969c();
    }

    public void setTextInputAccessibilityDelegate(C104480d dVar) {
        EditText editText = this.f309585e;
        if (editText != null) {
            C107207u.m145168i(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f309562K) {
            this.f309562K = typeface;
            C109969c cVar = this.f309576U0;
            cVar.f329111t = typeface;
            cVar.f329110s = typeface;
            cVar.mo161311j();
            C104482b bVar = this.f309587g;
            if (typeface != bVar.f309634s) {
                bVar.f309634s = typeface;
                TextView textView = bVar.f309628m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = bVar.f309632q;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f309591n;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309587g = new C104482b(this);
        this.f309560I = new Rect();
        this.f309561J = new RectF();
        C109969c cVar = new C109969c(this);
        this.f309576U0 = cVar;
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f309584d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        TimeInterpolator timeInterpolator = C108164a.f323890a;
        cVar.f329083G = timeInterpolator;
        cVar.mo161311j();
        cVar.f329082F = timeInterpolator;
        cVar.mo161311j();
        if (cVar.f329099h != 8388659) {
            cVar.f329099h = 8388659;
            cVar.mo161311j();
        }
        int[] iArr = C107764a.f322523w;
        C109991k.m149508a(context, attributeSet, i, C0966R.style.a3p);
        C109991k.m149509b(context, attributeSet, iArr, i, C0966R.style.a3p, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, C0966R.style.a3p);
        C103533f0 f0Var = new C103533f0(context, obtainStyledAttributes);
        this.f309595q = f0Var.mo144332a(21, true);
        setHint(f0Var.mo144341j(1));
        this.f309578V0 = f0Var.mo144332a(20, true);
        this.f309599u = context.getResources().getDimensionPixelOffset(C0966R.dimen.ai5);
        this.f309600v = context.getResources().getDimensionPixelOffset(C0966R.dimen.ai8);
        this.f309602x = f0Var.mo144334c(4, 0);
        this.f309604y = obtainStyledAttributes.getDimension(8, 0.0f);
        this.f309606z = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f309552A = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f309553B = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f309558G = obtainStyledAttributes.getColor(2, 0);
        this.f309570R0 = obtainStyledAttributes.getColor(9, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.ai_);
        this.f309555D = dimensionPixelSize;
        this.f309556E = context.getResources().getDimensionPixelSize(C0966R.dimen.aia);
        this.f309554C = dimensionPixelSize;
        setBoxBackgroundMode(f0Var.mo144339h(3, 0));
        if (f0Var.mo144342k(0)) {
            ColorStateList b = f0Var.mo144333b(0);
            this.f309603x0 = b;
            this.f309594p0 = b;
        }
        this.f309605y0 = C111105a.m151500b(context, C0966R.color.a5u);
        this.f309572S0 = C111105a.m151500b(context, C0966R.color.a5v);
        this.f309568Q0 = C111105a.m151500b(context, C0966R.color.a5x);
        if (f0Var.mo144340i(22, -1) != -1) {
            setHintTextAppearance(f0Var.mo144340i(22, 0));
        }
        int i2 = f0Var.mo144340i(16, 0);
        boolean a = f0Var.mo144332a(15, false);
        int i3 = f0Var.mo144340i(19, 0);
        boolean a2 = f0Var.mo144332a(18, false);
        CharSequence j = f0Var.mo144341j(17);
        boolean a3 = f0Var.mo144332a(11, false);
        setCounterMaxLength(f0Var.mo144339h(12, -1));
        this.f309593p = f0Var.mo144340i(14, 0);
        this.f309592o = f0Var.mo144340i(13, 0);
        this.f309563L = f0Var.mo144332a(25, false);
        this.f309564M = f0Var.mo144336e(24);
        this.f309565N = f0Var.mo144341j(23);
        if (f0Var.mo144342k(26)) {
            this.f309575U = true;
            this.f309573T = f0Var.mo144333b(26);
        }
        if (f0Var.mo144342k(27)) {
            this.f309579W = true;
            this.f309577V = C109992l.m149512a(f0Var.mo144339h(27, -1), (PorterDuff.Mode) null);
        }
        f0Var.mo144343m();
        setHelperTextEnabled(a2);
        setHelperText(j);
        setHelperTextTextAppearance(i3);
        setErrorEnabled(a);
        setErrorTextAppearance(i2);
        setCounterEnabled(a3);
        mo146969c();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145191s(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f309565N = charSequence;
        CheckableImageButton checkableImageButton = this.f309566P;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f309564M = drawable;
        CheckableImageButton checkableImageButton = this.f309566P;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }
}
