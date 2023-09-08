package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CView;
import kj2.C117407d;

/* renamed from: com.tencent.mm.ui.base.NoMeasuredTextView */
public class NoMeasuredTextView extends X2CView {

    /* renamed from: Q */
    public static final BoringLayout.Metrics f318765Q = new BoringLayout.Metrics();

    /* renamed from: A */
    public int f318766A;

    /* renamed from: B */
    public Paint.FontMetricsInt f318767B;

    /* renamed from: C */
    public boolean f318768C = false;

    /* renamed from: D */
    public boolean f318769D = false;

    /* renamed from: E */
    public C106657b f318770E;

    /* renamed from: F */
    public boolean f318771F = false;

    /* renamed from: G */
    public boolean f318772G = false;

    /* renamed from: H */
    public boolean f318773H = false;

    /* renamed from: I */
    public boolean f318774I = false;

    /* renamed from: J */
    public int f318775J = -1;

    /* renamed from: K */
    public int f318776K = -1;

    /* renamed from: L */
    public String f318777L;

    /* renamed from: M */
    public int f318778M;

    /* renamed from: N */
    public int f318779N;

    /* renamed from: P */
    public C73213c f318780P;

    /* renamed from: d */
    public ColorStateList f318781d;

    /* renamed from: e */
    public int f318782e;

    /* renamed from: f */
    public Editable.Factory f318783f = Editable.Factory.getInstance();

    /* renamed from: g */
    public Spannable.Factory f318784g = Spannable.Factory.getInstance();

    /* renamed from: h */
    public TextUtils.TruncateAt f318785h = null;

    /* renamed from: i */
    public CharSequence f318786i = "";

    /* renamed from: j */
    public C106656a f318787j = C106656a.NORMAL;
    private CharSequence mText = "";

    /* renamed from: n */
    public TextPaint f318788n;

    /* renamed from: o */
    public Layout f318789o;

    /* renamed from: p */
    public int f318790p = 51;

    /* renamed from: q */
    public float f318791q = 1.0f;

    /* renamed from: r */
    public int f318792r = Integer.MAX_VALUE;

    /* renamed from: s */
    public int f318793s = 1;

    /* renamed from: t */
    public int f318794t = 0;

    /* renamed from: u */
    public int f318795u = 1;

    /* renamed from: v */
    public int f318796v = Integer.MAX_VALUE;

    /* renamed from: w */
    public boolean f318797w = false;

    /* renamed from: x */
    public boolean f318798x = true;

    /* renamed from: y */
    public BoringLayout f318799y;

    /* renamed from: z */
    public boolean f318800z = false;

    /* renamed from: com.tencent.mm.ui.base.NoMeasuredTextView$c */
    public interface C73213c {
        /* renamed from: a */
        CharSequence mo101876a(NoMeasuredTextView noMeasuredTextView, CharSequence charSequence, String str, int i, int i2);
    }

    /* renamed from: com.tencent.mm.ui.base.NoMeasuredTextView$a */
    public enum C106656a {
        NORMAL,
        SPANNABLE,
        EDITABLE
    }

    /* renamed from: com.tencent.mm.ui.base.NoMeasuredTextView$b */
    public class C106657b {

        /* renamed from: a */
        public final Rect f318805a = new Rect();

        /* renamed from: b */
        public Drawable f318806b;

        /* renamed from: c */
        public Drawable f318807c;

        /* renamed from: d */
        public Drawable f318808d;

        /* renamed from: e */
        public Drawable f318809e;

        /* renamed from: f */
        public int f318810f;

        /* renamed from: g */
        public int f318811g;

        /* renamed from: h */
        public int f318812h;

        /* renamed from: i */
        public int f318813i;

        /* renamed from: j */
        public int f318814j;

        /* renamed from: k */
        public int f318815k;

        /* renamed from: l */
        public int f318816l;

        /* renamed from: m */
        public int f318817m;

        /* renamed from: n */
        public int f318818n;

        public C106657b(NoMeasuredTextView noMeasuredTextView) {
        }
    }

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.measureText("H");
    }

    public NoMeasuredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.f318788n = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        setDrawingCacheEnabled(false);
        this.f318767B = this.f318788n.getFontMetricsInt();
        mo153513e();
        setSingleLine(true);
        setEllipsize((TextUtils.TruncateAt) null);
    }

    private int getDesiredHeight() {
        Layout layout = this.f318789o;
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom();
        int lineTop = layout.getLineTop(lineCount) + compoundPaddingTop;
        if (this.f318793s == 1) {
            int i = this.f318792r;
            if (lineCount > i) {
                lineTop = layout.getLineTop(i) + layout.getBottomPadding() + compoundPaddingTop;
                lineCount = this.f318792r;
            }
        } else {
            lineTop = Math.min(lineTop, this.f318792r);
        }
        if (this.f318795u != 1) {
            lineTop = Math.max(lineTop, this.f318794t);
        } else if (lineCount < this.f318794t) {
            lineTop += getLineHeight() * (this.f318794t - lineCount);
        }
        return Math.max(lineTop, getSuggestedMinimumHeight());
    }

    private void setRawTextSize(float f) {
        if (f != this.f318788n.getTextSize()) {
            this.f318788n.setTextSize(f);
            Paint.FontMetricsInt fontMetricsInt = this.f318788n.getFontMetricsInt();
            this.f318767B = fontMetricsInt;
            this.f318766A = (int) (Math.ceil((double) (fontMetricsInt.descent - fontMetricsInt.ascent)) + 2.0d);
            if (this.f318789o != null) {
                mo153511d();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo153505a() {
        int i;
        int i2;
        if (this.f318797w) {
            i2 = this.f318796v - getCompoundPaddingLeft();
            i = getCompoundPaddingRight();
        } else {
            i2 = (getRight() - getLeft()) - getCompoundPaddingLeft();
            i = getCompoundPaddingRight();
        }
        int i3 = i2 - i;
        int i4 = i3 < 1 ? 0 : i3;
        BoringLayout.Metrics metrics = f318765Q;
        mo153507c(i4, metrics, metrics, i4, false);
    }

    /* renamed from: b */
    public final int mo153506b(boolean z) {
        int measuredHeight;
        int height;
        int i = this.f318790p & 112;
        Layout layout = this.f318789o;
        if (i == 48 || (height = layout.getHeight()) >= (measuredHeight = (getMeasuredHeight() - getExtendedPaddingTop()) - getExtendedPaddingBottom())) {
            return 0;
        }
        return i == 80 ? measuredHeight - height : (measuredHeight - height) >> 1;
    }

    /* renamed from: c */
    public void mo153507c(int i, BoringLayout.Metrics metrics, BoringLayout.Metrics metrics2, int i2, boolean z) {
        boolean z2 = false;
        int i3 = i < 0 ? 0 : i;
        int i4 = this.f318790p & 7;
        Layout.Alignment alignment = i4 != 1 ? i4 != 5 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        if (this.f318785h != null) {
            z2 = true;
        }
        if (z2) {
            CharSequence charSequence = this.f318786i;
            this.f318789o = new StaticLayout(charSequence, 0, charSequence.length(), this.f318788n, i3, alignment, this.f318791q, 0.0f, this.f318798x, this.f318785h, i2);
            return;
        }
        this.f318789o = new StaticLayout(this.f318786i, this.f318788n, i3, alignment, this.f318791q, 0.0f, this.f318798x);
    }

    public int computeHorizontalScrollRange() {
        Layout layout = this.f318789o;
        return layout != null ? layout.getWidth() : super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
    }

    public int computeVerticalScrollRange() {
        Layout layout = this.f318789o;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    /* renamed from: d */
    public final void mo153511d() {
        Layout layout = this.f318789o;
        if ((layout instanceof BoringLayout) && this.f318799y == null) {
            this.f318799y = (BoringLayout) layout;
        }
        this.f318789o = null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f318781d;
        if (colorStateList != null && colorStateList.isStateful()) {
            mo153551j();
        }
        C106657b bVar = this.f318770E;
        if (bVar != null) {
            int[] drawableState = getDrawableState();
            Drawable drawable = bVar.f318806b;
            if (drawable != null && drawable.isStateful()) {
                bVar.f318806b.setState(drawableState);
            }
            Drawable drawable2 = bVar.f318807c;
            if (drawable2 != null && drawable2.isStateful()) {
                bVar.f318807c.setState(drawableState);
            }
            Drawable drawable3 = bVar.f318808d;
            if (drawable3 != null && drawable3.isStateful()) {
                bVar.f318808d.setState(drawableState);
            }
            Drawable drawable4 = bVar.f318809e;
            if (drawable4 != null && drawable4.isStateful()) {
                bVar.f318809e.setState(drawableState);
            }
        }
    }

    /* renamed from: e */
    public void mo153513e() {
        if (this.f318766A == 0) {
            Paint.FontMetricsInt fontMetricsInt = this.f318767B;
            this.f318766A = (int) (Math.ceil((double) (fontMetricsInt.descent - fontMetricsInt.ascent)) + 2.0d);
        }
    }

    /* renamed from: f */
    public void mo153514f(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C106657b bVar = this.f318770E;
        if ((drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) ? false : true) {
            if (bVar == null) {
                bVar = new C106657b(this);
                this.f318770E = bVar;
            }
            Drawable drawable5 = bVar.f318808d;
            if (!(drawable5 == drawable || drawable5 == null)) {
                drawable5.setCallback((Drawable.Callback) null);
            }
            bVar.f318808d = drawable;
            Drawable drawable6 = bVar.f318806b;
            if (!(drawable6 == drawable2 || drawable6 == null)) {
                drawable6.setCallback((Drawable.Callback) null);
            }
            bVar.f318806b = drawable2;
            Drawable drawable7 = bVar.f318809e;
            if (!(drawable7 == drawable3 || drawable7 == null)) {
                drawable7.setCallback((Drawable.Callback) null);
            }
            bVar.f318809e = drawable3;
            Drawable drawable8 = bVar.f318807c;
            if (!(drawable8 == drawable4 || drawable8 == null)) {
                drawable8.setCallback((Drawable.Callback) null);
            }
            bVar.f318807c = drawable4;
            Rect rect = bVar.f318805a;
            int[] drawableState = getDrawableState();
            if (drawable != null) {
                drawable.setState(drawableState);
                drawable.copyBounds(rect);
                drawable.setCallback(this);
                bVar.f318812h = rect.width();
                bVar.f318816l = rect.height();
            } else {
                bVar.f318816l = 0;
                bVar.f318812h = 0;
            }
            if (drawable3 != null) {
                drawable3.setState(drawableState);
                drawable3.copyBounds(rect);
                drawable3.setCallback(this);
                bVar.f318813i = rect.width();
                bVar.f318817m = rect.height();
            } else {
                bVar.f318817m = 0;
                bVar.f318813i = 0;
            }
            if (drawable2 != null) {
                drawable2.setState(drawableState);
                drawable2.copyBounds(rect);
                drawable2.setCallback(this);
                bVar.f318810f = rect.height();
                bVar.f318814j = rect.width();
            } else {
                bVar.f318814j = 0;
                bVar.f318810f = 0;
            }
            if (drawable4 != null) {
                drawable4.setState(drawableState);
                drawable4.copyBounds(rect);
                drawable4.setCallback(this);
                bVar.f318811g = rect.height();
                bVar.f318815k = rect.width();
            } else {
                bVar.f318815k = 0;
                bVar.f318811g = 0;
            }
        } else if (bVar != null) {
            if (bVar.f318818n == 0) {
                this.f318770E = null;
            } else {
                Drawable drawable9 = bVar.f318808d;
                if (drawable9 != null) {
                    drawable9.setCallback((Drawable.Callback) null);
                }
                bVar.f318808d = null;
                Drawable drawable10 = bVar.f318806b;
                if (drawable10 != null) {
                    drawable10.setCallback((Drawable.Callback) null);
                }
                bVar.f318806b = null;
                Drawable drawable11 = bVar.f318809e;
                if (drawable11 != null) {
                    drawable11.setCallback((Drawable.Callback) null);
                }
                bVar.f318809e = null;
                Drawable drawable12 = bVar.f318807c;
                if (drawable12 != null) {
                    drawable12.setCallback((Drawable.Callback) null);
                }
                bVar.f318807c = null;
                bVar.f318816l = 0;
                bVar.f318812h = 0;
                bVar.f318817m = 0;
                bVar.f318813i = 0;
                bVar.f318814j = 0;
                bVar.f318810f = 0;
                bVar.f318815k = 0;
                bVar.f318811g = 0;
            }
        }
        invalidate();
    }

    /* renamed from: g */
    public void mo153515g(String str, int i, int i2) {
        this.f318777L = str;
        this.f318778M = i;
        this.f318779N = i2;
    }

    public int getBaseline() {
        if (this.f318789o == null) {
            return super.getBaseline();
        }
        return getExtendedPaddingTop() + ((this.f318790p & 112) != 48 ? mo153506b(true) : 0) + this.f318789o.getLineBaseline(0);
    }

    public int getCompoundDrawablePadding() {
        C106657b bVar = this.f318770E;
        if (bVar != null) {
            return bVar.f318818n;
        }
        return 0;
    }

    public Drawable[] getCompoundDrawables() {
        C106657b bVar = this.f318770E;
        if (bVar != null) {
            return new Drawable[]{bVar.f318808d, bVar.f318806b, bVar.f318809e, bVar.f318807c};
        }
        return new Drawable[]{null, null, null, null};
    }

    public int getCompoundPaddingBottom() {
        C106657b bVar = this.f318770E;
        return (bVar == null || bVar.f318807c == null || !this.f318774I) ? getPaddingBottom() : getPaddingBottom() + bVar.f318818n + bVar.f318811g;
    }

    public int getCompoundPaddingLeft() {
        C106657b bVar = this.f318770E;
        return (bVar == null || bVar.f318808d == null || !this.f318771F) ? getPaddingLeft() : getPaddingLeft() + bVar.f318818n + bVar.f318812h;
    }

    public int getCompoundPaddingRight() {
        C106657b bVar = this.f318770E;
        return (bVar == null || bVar.f318809e == null || !this.f318772G) ? getPaddingRight() : getPaddingRight() + bVar.f318818n + bVar.f318813i;
    }

    public int getCompoundPaddingTop() {
        C106657b bVar = this.f318770E;
        return (bVar == null || bVar.f318806b == null || !this.f318773H) ? getPaddingTop() : getPaddingTop() + bVar.f318818n + bVar.f318810f;
    }

    public final int getCurrentTextColor() {
        return this.f318782e;
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public MovementMethod getDefaultMovementMethod() {
        return null;
    }

    public Editable getEditableText() {
        CharSequence charSequence = this.mText;
        if (charSequence instanceof Editable) {
            return (Editable) charSequence;
        }
        return null;
    }

    @ViewDebug.ExportedProperty
    public TextUtils.TruncateAt getEllipsize() {
        return this.f318785h;
    }

    public int getExtendedPaddingBottom() {
        Layout layout = this.f318789o;
        if (layout == null || this.f318793s != 1) {
            return getCompoundPaddingBottom();
        }
        if (layout.getLineCount() <= this.f318792r) {
            return getCompoundPaddingBottom();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int height = (getHeight() - compoundPaddingTop) - compoundPaddingBottom;
        int lineTop = this.f318789o.getLineTop(this.f318792r);
        if (lineTop >= height) {
            return compoundPaddingBottom;
        }
        int i = this.f318790p & 112;
        return i == 48 ? (compoundPaddingBottom + height) - lineTop : i == 80 ? compoundPaddingBottom : compoundPaddingBottom + ((height - lineTop) / 2);
    }

    public int getExtendedPaddingTop() {
        int i;
        Layout layout = this.f318789o;
        if (layout == null || this.f318793s != 1) {
            return getCompoundPaddingTop();
        }
        if (layout.getLineCount() <= this.f318792r) {
            return getCompoundPaddingTop();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int height = (getHeight() - compoundPaddingTop) - getCompoundPaddingBottom();
        int lineTop = this.f318789o.getLineTop(this.f318792r);
        return (lineTop < height && (i = this.f318790p & 112) != 48) ? i == 80 ? (compoundPaddingTop + height) - lineTop : compoundPaddingTop + ((height - lineTop) / 2) : compoundPaddingTop;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f318789o == null) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int lineForOffset = this.f318789o.getLineForOffset(selectionEnd);
        rect.top = this.f318789o.getLineTop(lineForOffset);
        rect.bottom = this.f318789o.getLineBottom(lineForOffset);
        int primaryHorizontal = (int) this.f318789o.getPrimaryHorizontal(selectionEnd);
        rect.left = primaryHorizontal;
        rect.right = primaryHorizontal + 1;
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop();
        if ((this.f318790p & 112) != 48) {
            extendedPaddingTop += mo153506b(false);
        }
        rect.offset(compoundPaddingLeft, extendedPaddingTop);
    }

    public int getGravity() {
        return this.f318790p;
    }

    public final Layout getLayout() {
        return this.f318789o;
    }

    public int getLineCount() {
        Layout layout = this.f318789o;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    public int getLineHeight() {
        return Math.round((((float) this.f318788n.getFontMetricsInt((Paint.FontMetricsInt) null)) * this.f318791q) + 0.0f);
    }

    public TextPaint getPaint() {
        return this.f318788n;
    }

    public int getPaintFlags() {
        return this.f318788n.getFlags();
    }

    @ViewDebug.ExportedProperty
    public int getSelectionEnd() {
        return Selection.getSelectionEnd(getText());
    }

    @ViewDebug.ExportedProperty
    public int getSelectionStart() {
        return Selection.getSelectionStart(getText());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getText() {
        return this.mText;
    }

    public final ColorStateList getTextColors() {
        return this.f318781d;
    }

    public float getTextScaleX() {
        return this.f318788n.getTextScaleX();
    }

    public float getTextSize() {
        return this.f318788n.getTextSize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = (getMeasuredHeight() - getExtendedPaddingTop()) - getExtendedPaddingBottom();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTotalPaddingBottom() {
        /*
            r5 = this;
            int r0 = r5.getExtendedPaddingBottom()
            int r1 = r5.f318790p
            r1 = r1 & 112(0x70, float:1.57E-43)
            android.text.Layout r2 = r5.f318789o
            r3 = 80
            if (r1 == r3) goto L_0x002b
            int r3 = r5.getMeasuredHeight()
            int r4 = r5.getExtendedPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getExtendedPaddingBottom()
            int r3 = r3 - r4
            int r2 = r2.getHeight()
            if (r2 >= r3) goto L_0x002b
            r4 = 48
            int r3 = r3 - r2
            if (r1 != r4) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            int r3 = r3 >> 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.NoMeasuredTextView.getTotalPaddingBottom():int");
    }

    public int getTotalPaddingLeft() {
        return getCompoundPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return getCompoundPaddingRight();
    }

    public int getTotalPaddingTop() {
        return getExtendedPaddingTop() + mo153506b(true);
    }

    public Typeface getTypeface() {
        return this.f318788n.getTypeface();
    }

    /* renamed from: h */
    public void mo153548h(CharSequence charSequence, C106656a aVar) {
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        String str = null;
        try {
            if (!charSequence2.equals(this.mText)) {
                if (getMeasuredWidth() > 0 && this.f318780P != null && !Util.isNullOrNil(this.f318777L)) {
                    charSequence2 = this.f318780P.mo101876a(this, charSequence2, this.f318777L, this.f318778M, this.f318779N);
                    this.f318777L = null;
                }
                if (charSequence2 instanceof Spanned) {
                    this.f318800z = false;
                } else {
                    this.f318800z = true;
                }
                if (aVar == C106656a.EDITABLE) {
                    charSequence2 = this.f318783f.newEditable(charSequence2);
                } else if (aVar == C106656a.SPANNABLE) {
                    charSequence2 = this.f318784g.newSpannable(charSequence2);
                }
                int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft();
                if (this.f318769D) {
                    if (this.f318797w) {
                        int i = this.f318796v;
                        if (getMeasuredWidth() > 0) {
                            i = Math.min(this.f318796v, getMeasuredWidth());
                        }
                        charSequence2 = TextUtils.ellipsize(charSequence2, this.f318788n, (float) (i - compoundPaddingRight), TextUtils.TruncateAt.END);
                    } else if (getMeasuredWidth() > 0) {
                        charSequence2 = TextUtils.ellipsize(charSequence2, this.f318788n, (float) (getMeasuredWidth() - compoundPaddingRight), TextUtils.TruncateAt.END);
                    } else {
                        this.f318768C = true;
                    }
                }
                this.f318787j = aVar;
                this.mText = charSequence2;
                this.f318786i = charSequence2;
                if (this.f318800z) {
                    mo153513e();
                    invalidate();
                } else if (getWidth() == 0) {
                    requestLayout();
                    invalidate();
                } else {
                    Layout layout = this.f318789o;
                    if (layout == null) {
                        mo153505a();
                        if (this.f318789o.getHeight() != getHeight()) {
                            requestLayout();
                        }
                        invalidate();
                        return;
                    }
                    int height = layout.getHeight();
                    int width = this.f318789o.getWidth();
                    BoringLayout.Metrics metrics = f318765Q;
                    mo153507c(width, metrics, metrics, width - compoundPaddingRight, false);
                    if (this.f318785h != TextUtils.TruncateAt.MARQUEE) {
                        if (getLayoutParams().height == -2 || getLayoutParams().height == -1) {
                            int height2 = this.f318789o.getHeight();
                            if (height2 == height && height2 == getHeight()) {
                                invalidate();
                                return;
                            }
                        } else {
                            invalidate();
                            return;
                        }
                    }
                    requestLayout();
                    invalidate();
                }
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[3];
            objArr[0] = Util.secPrint(charSequence2.toString());
            CharSequence charSequence3 = this.mText;
            if (charSequence3 != null) {
                str = Util.secPrint(charSequence3.toString());
            }
            objArr[1] = str;
            objArr[2] = getContext().getClass().getSimpleName();
            Log.printErrStackTrace("TextView", th, "equal err text:%s mText:%s context:%s", objArr);
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160131h(25996, 0, 33, charSequence2 + "_" + getContext().getClass().getSimpleName(), 0, this.mText);
        }
    }

    /* renamed from: i */
    public void mo153549i(int i, float f) {
        Context context = getContext();
        setRawTextSize(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void invalidateDrawable(Drawable drawable) {
        int bottom;
        int compoundPaddingTop;
        int bottom2;
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            C106657b bVar = this.f318770E;
            if (bVar != null) {
                if (drawable == bVar.f318808d) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int compoundPaddingBottom = getCompoundPaddingBottom();
                    scrollX += getPaddingLeft();
                    bottom2 = ((((getBottom() - getTop()) - compoundPaddingBottom) - compoundPaddingTop) - bVar.f318816l) / 2;
                } else if (drawable == bVar.f318809e) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int compoundPaddingBottom2 = getCompoundPaddingBottom();
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - bVar.f318813i;
                    bottom2 = ((((getBottom() - getTop()) - compoundPaddingBottom2) - compoundPaddingTop) - bVar.f318817m) / 2;
                } else {
                    if (drawable == bVar.f318806b) {
                        int compoundPaddingLeft = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft) - bVar.f318814j) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == bVar.f318807c) {
                        int compoundPaddingLeft2 = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft2 + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft2) - bVar.f318815k) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - bVar.f318811g;
                    }
                    scrollY += bottom;
                }
                bottom = compoundPaddingTop + bottom2;
                scrollY += bottom;
            }
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
        }
    }

    /* renamed from: j */
    public final void mo153551j() {
        boolean z = false;
        int colorForState = this.f318781d.getColorForState(getDrawableState(), 0);
        if (colorForState != this.f318782e) {
            this.f318782e = colorForState;
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        float f2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingRight = getCompoundPaddingRight();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int right = getRight();
        int left = getLeft();
        int bottom = getBottom();
        int top = getTop();
        int width = getWidth();
        int height = getHeight();
        C106657b bVar = this.f318770E;
        if (bVar != null) {
            int i7 = ((bottom - top) - compoundPaddingBottom) - compoundPaddingTop;
            int i8 = ((right - left) - compoundPaddingRight) - compoundPaddingLeft;
            if (!this.f318771F || bVar.f318808d == null) {
                i2 = width;
            } else {
                canvas.save();
                i2 = width;
                canvas2.translate((float) (getPaddingLeft() + scrollX), (float) (scrollY + compoundPaddingTop + ((i7 - bVar.f318816l) / 2)));
                bVar.f318808d.draw(canvas2);
                canvas.restore();
            }
            if (!this.f318772G || bVar.f318809e == null) {
                i = compoundPaddingRight;
                i3 = height;
                f = -1.0f;
            } else {
                canvas.save();
                if (this.f318800z) {
                    TextPaint textPaint = this.f318788n;
                    CharSequence charSequence = this.mText;
                    i3 = height;
                    i = compoundPaddingRight;
                    f2 = textPaint.measureText(charSequence, 0, charSequence.length());
                    f = f2;
                } else {
                    i = compoundPaddingRight;
                    i3 = height;
                    f2 = (float) Math.ceil((double) Layout.getDesiredWidth(this.f318786i, this.f318788n));
                    f = -1.0f;
                }
                canvas2.translate((((float) scrollX) + f2) - ((float) getPaddingRight()), (float) (compoundPaddingTop + scrollY + ((i7 - bVar.f318817m) / 2)));
                bVar.f318809e.draw(canvas2);
                canvas.restore();
            }
            if (this.f318773H && bVar.f318806b != null) {
                canvas.save();
                canvas2.translate((float) (scrollX + compoundPaddingLeft + ((i8 - bVar.f318814j) / 2)), (float) (getPaddingTop() + scrollY));
                bVar.f318806b.draw(canvas2);
                canvas.restore();
            }
            if (this.f318774I && bVar.f318807c != null) {
                canvas.save();
                canvas2.translate((float) (scrollX + compoundPaddingLeft + ((i8 - bVar.f318815k) / 2)), (float) ((((scrollY + bottom) - top) - getPaddingBottom()) - bVar.f318811g));
                bVar.f318807c.draw(canvas2);
                canvas.restore();
            }
        } else {
            i = compoundPaddingRight;
            i2 = width;
            i3 = height;
            f = -1.0f;
        }
        this.f318788n.setColor(this.f318782e);
        this.f318788n.drawableState = getDrawableState();
        canvas.save();
        int extendedPaddingTop = getExtendedPaddingTop();
        canvas2.clipRect((float) (compoundPaddingLeft + scrollX), (float) (extendedPaddingTop + scrollY), (float) (((right - left) - i) + scrollX), (float) (((bottom - top) - getExtendedPaddingBottom()) + scrollY));
        if ((this.f318790p & 112) != 48) {
            i4 = mo153506b(false);
            i5 = mo153506b(true);
        } else {
            i5 = 0;
            i4 = 0;
        }
        canvas2.translate((float) compoundPaddingLeft, (float) (extendedPaddingTop + i4));
        if (this.f318800z) {
            Paint.FontMetricsInt fontMetricsInt = this.f318767B;
            int i9 = fontMetricsInt.bottom;
            int i15 = fontMetricsInt.top;
            float f3 = (float) (((i3 - (i9 - i15)) / 2) - i15);
            int i16 = this.f318790p;
            if ((i16 & 7) != 3) {
                int i17 = i16 & 7;
                if (i17 == 1) {
                    if (f == -1.0f) {
                        TextPaint textPaint2 = this.f318788n;
                        CharSequence charSequence2 = this.mText;
                        f = textPaint2.measureText(charSequence2, 0, charSequence2.length());
                    }
                    i6 = ((int) (((float) (i2 - getPaddingRight())) - f)) / 2;
                } else if (i17 == 5) {
                    if (f == -1.0f) {
                        TextPaint textPaint3 = this.f318788n;
                        CharSequence charSequence3 = this.mText;
                        f = textPaint3.measureText(charSequence3, 0, charSequence3.length());
                    }
                    i6 = (int) (((float) (i2 - getPaddingRight())) - f);
                }
                CharSequence charSequence4 = this.mText;
                canvas.drawText(charSequence4, 0, charSequence4.length(), (float) i6, f3, this.f318788n);
            }
            i6 = 0;
            CharSequence charSequence42 = this.mText;
            canvas.drawText(charSequence42, 0, charSequence42.length(), (float) i6, f3, this.f318788n);
        } else {
            if (this.f318789o == null) {
                mo153505a();
            }
            try {
                this.f318789o.draw(canvas2, (Path) null, (Paint) null, i5 - i4);
            } catch (IndexOutOfBoundsException e) {
                Log.printErrStackTrace("TextView", e, "", new Object[0]);
            }
        }
        canvas.restore();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = getContentDescription();
        if (Util.isNullOrNil((String) contentDescription)) {
            contentDescription = getText();
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C73213c cVar;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f318768C && getMeasuredWidth() > 0) {
            if (Util.isNullOrNil(this.f318777L) || (cVar = this.f318780P) == null) {
                setText(TextUtils.ellipsize(this.mText, getPaint(), (float) ((getMeasuredWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft()), TextUtils.TruncateAt.END));
            } else {
                CharSequence a = cVar.mo101876a(this, this.mText, this.f318777L, this.f318778M, this.f318779N);
                this.f318777L = null;
                setText(a);
            }
            this.f318768C = false;
        }
    }

    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0) {
            setMeasuredDimension(size, this.f318766A);
        } else if (this.f318800z) {
            if (this.f318766A == 0) {
                mo153513e();
            }
            setMeasuredDimension(size, this.f318766A);
        } else {
            BoringLayout.Metrics metrics = f318765Q;
            int compoundPaddingLeft = getCompoundPaddingLeft() + getCompoundPaddingRight();
            int i3 = this.f318797w ? this.f318796v - compoundPaddingLeft : size - compoundPaddingLeft;
            Layout layout = this.f318789o;
            if (layout == null) {
                mo153507c(i3, metrics, metrics, i3, false);
            } else {
                if (layout.getWidth() != i3) {
                    mo153507c(i3, metrics, metrics, i3, false);
                }
            }
            if (mode != 1073741824) {
                int desiredHeight = getDesiredHeight();
                size2 = mode == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
            }
            scrollTo(0, 0);
            setMeasuredDimension(size, size2);
        }
    }

    public void setCompoundDrawablePadding(int i) {
        C106657b bVar = this.f318770E;
        if (i != 0) {
            if (bVar == null) {
                bVar = new C106657b(this);
                this.f318770E = bVar;
            }
            bVar.f318818n = i;
        } else if (bVar != null) {
            bVar.f318818n = i;
        }
        invalidate();
        requestLayout();
    }

    public void setCompoundLeftDrawablesWithIntrinsicBounds(Drawable drawable) {
        if (drawable != null) {
            C106657b bVar = this.f318770E;
            if (bVar == null || bVar.f318808d != drawable) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                mo153514f(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    public void setCompoundRightDrawablesWithIntrinsicBounds(Drawable drawable) {
        if (drawable != null) {
            C106657b bVar = this.f318770E;
            if (bVar == null || bVar.f318809e != drawable) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                mo153514f((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        }
    }

    public void setDrawDownDrawable(boolean z) {
        if (this.f318774I != z) {
            invalidate();
        }
        this.f318774I = z;
    }

    public void setDrawLeftDrawable(boolean z) {
        if (this.f318771F != z) {
            invalidate();
        }
        this.f318771F = z;
    }

    public void setDrawRightDrawable(boolean z) {
        if (this.f318772G != z) {
            invalidate();
        }
        this.f318772G = z;
    }

    public void setDrawTopDrawable(boolean z) {
        if (this.f318773H != z) {
            invalidate();
        }
        this.f318773H = z;
    }

    public final void setEditableFactory(Editable.Factory factory) {
        this.f318783f = factory;
        setText(this.mText);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f318785h = truncateAt;
        if (this.f318789o != null) {
            mo153511d();
            requestLayout();
            invalidate();
        }
    }

    public void setGravity(int i) {
        if ((i & 7) == 0) {
            i |= 3;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        boolean z = false;
        int i2 = i & 7;
        int i3 = this.f318790p;
        if (i2 != (i3 & 7)) {
            z = true;
        }
        if (i != i3) {
            invalidate();
        }
        this.f318790p = i;
        Layout layout = this.f318789o;
        if (layout != null && z) {
            int width = layout.getWidth();
            BoringLayout.Metrics metrics = f318765Q;
            mo153507c(width, metrics, metrics, (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), true);
        }
    }

    public void setHeight(int i) {
        this.f318794t = i;
        this.f318792r = i;
        this.f318795u = 2;
        this.f318793s = 2;
        requestLayout();
        invalidate();
    }

    public void setIncludeFontPadding(boolean z) {
        this.f318798x = z;
        if (this.f318789o != null) {
            mo153511d();
            requestLayout();
            invalidate();
        }
    }

    public void setLayoutCallback(C73213c cVar) {
        this.f318780P = cVar;
    }

    public void setLines(int i) {
        this.f318794t = i;
        this.f318792r = i;
        this.f318795u = 1;
        this.f318793s = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f318792r = i;
        this.f318793s = 2;
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i) {
        this.f318792r = i;
        this.f318793s = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.f318796v = i;
        this.f318797w = true;
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i) {
        this.f318794t = i;
        this.f318795u = 2;
        requestLayout();
        invalidate();
    }

    public void setMinLines(int i) {
        this.f318794t = i;
        this.f318795u = 1;
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i) {
        requestLayout();
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i3 == getPaddingRight() && i2 == getPaddingTop() && i4 == getPaddingBottom())) {
            mo153511d();
        }
        super.setPadding(i, i2, i3, i4);
        invalidate();
    }

    public void setPaintFlags(int i) {
        if (this.f318788n.getFlags() != i) {
            this.f318788n.setFlags(i);
            if (this.f318789o != null) {
                mo153511d();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setShouldEllipsize(boolean z) {
        this.f318769D = z;
    }

    public void setSingleLine(boolean z) {
        if (z) {
            setLines(1);
        } else {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final void setSpannableFactory(Spannable.Factory factory) {
        this.f318784g = factory;
        setText(this.mText);
    }

    public final void setText(CharSequence charSequence) {
        mo153548h(charSequence, this.f318787j);
    }

    public void setTextColor(int i) {
        this.f318781d = ColorStateList.valueOf(i);
        mo153551j();
    }

    public final void setTextKeepState(CharSequence charSequence) {
        C106656a aVar = this.f318787j;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = charSequence.length();
        mo153548h(charSequence, aVar);
        if (selectionStart >= 0 || selectionEnd >= 0) {
            CharSequence charSequence2 = this.mText;
            if (charSequence2 instanceof Spannable) {
                Selection.setSelection((Spannable) charSequence2, Math.max(0, Math.min(selectionStart, length)), Math.max(0, Math.min(selectionEnd, length)));
            }
        }
    }

    public void setTextSize(float f) {
        mo153549i(2, f);
    }

    public void setTypeface(Typeface typeface) {
        if (this.f318788n.getTypeface() != typeface) {
            this.f318788n.setTypeface(typeface);
            if (this.f318789o != null) {
                mo153511d();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setWidth(int i) {
        this.f318796v = i;
        this.f318797w = true;
        requestLayout();
        invalidate();
    }

    public boolean verifyDrawable(Drawable drawable) {
        C106657b bVar;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        return (verifyDrawable || (bVar = this.f318770E) == null) ? verifyDrawable : drawable == bVar.f318808d || drawable == bVar.f318806b || drawable == bVar.f318809e || drawable == bVar.f318807c;
    }

    public final void setText(int i) {
        setText(getContext().getResources().getText(i));
    }

    public void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        if (this.f318781d != colorStateList) {
            this.f318781d = colorStateList;
            mo153551j();
        }
    }

    public void setCompoundLeftDrawablesWithIntrinsicBounds(int i) {
        if (i != this.f318775J) {
            this.f318775J = i;
            setCompoundLeftDrawablesWithIntrinsicBounds(getResources().getDrawable(i));
        }
    }

    public void setCompoundRightDrawablesWithIntrinsicBounds(int i) {
        if (i != this.f318776K) {
            this.f318776K = i;
            setCompoundRightDrawablesWithIntrinsicBounds(getResources().getDrawable(i));
        }
    }
}
