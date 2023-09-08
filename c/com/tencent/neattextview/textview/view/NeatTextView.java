package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import vr3.C111611a;
import xr3.C112172b;
import xr3.C112173c;
import yr3.C112480b;
import yr3.C112481c;
import yr3.C79150a;

public class NeatTextView extends View implements C106877a {

    /* renamed from: K */
    public static final LruCache<String, C106876e> f319993K = new LruCache<>(800);

    /* renamed from: L */
    public static Handler f319994L;

    /* renamed from: A */
    public C106879c f319995A;

    /* renamed from: B */
    public boolean f319996B;

    /* renamed from: C */
    public C75245c f319997C;

    /* renamed from: D */
    public int f319998D;

    /* renamed from: E */
    public TextUtils.TruncateAt f319999E;

    /* renamed from: F */
    public float f320000F;

    /* renamed from: G */
    public boolean f320001G;

    /* renamed from: H */
    public C106875d f320002H;

    /* renamed from: I */
    public float[] f320003I;

    /* renamed from: J */
    public C79150a f320004J;

    /* renamed from: d */
    public C112481c f320005d;

    /* renamed from: e */
    public boolean f320006e;

    /* renamed from: f */
    public TextView f320007f;

    /* renamed from: g */
    public C106874b f320008g = new C106874b((C106878b) null);

    /* renamed from: h */
    public TextPaint f320009h;

    /* renamed from: i */
    public ColorStateList f320010i;

    /* renamed from: j */
    public ColorStateList f320011j;

    /* renamed from: n */
    public ColorStateList f320012n;

    /* renamed from: o */
    public int f320013o;

    /* renamed from: p */
    public int f320014p;

    /* renamed from: q */
    public int f320015q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f320016r = Integer.MAX_VALUE;

    /* renamed from: s */
    public int f320017s = Integer.MAX_VALUE;

    /* renamed from: t */
    public int f320018t = 0;

    /* renamed from: u */
    public int f320019u = 0;

    /* renamed from: v */
    public float f320020v = 0.0f;

    /* renamed from: w */
    public float f320021w = 1.0f;

    /* renamed from: x */
    public CharSequence f320022x = "";

    /* renamed from: y */
    public Spannable.Factory f320023y;

    /* renamed from: z */
    public CharSequence f320024z;

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$c */
    public interface C75245c {
        /* renamed from: b */
        boolean mo103047b(View view, MotionEvent motionEvent);
    }

    public static class AdaptedTextView extends AppCompatTextView {

        /* renamed from: g */
        public C106872a f320025g;

        /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$AdaptedTextView$a */
        public interface C106872a {
        }

        public AdaptedTextView(Context context) {
            super(context, (AttributeSet) null);
        }

        public void invalidate() {
            super.invalidate();
            C106872a aVar = this.f320025g;
            if (aVar != null) {
                ((C106878b) aVar).f320035a.invalidate();
            }
        }

        public void postInvalidate() {
            super.postInvalidate();
            C106872a aVar = this.f320025g;
            if (aVar != null) {
                ((C106878b) aVar).f320035a.postInvalidate();
            }
        }

        public AdaptedTextView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public AdaptedTextView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$a */
    public class C106873a implements C79150a {
        public C106873a() {
        }

        /* renamed from: S */
        public float mo109120S(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1.0f;
                }
                return d.getPrimaryHorizontal(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1.0f;
            }
            return cVar.mo109120S(i);
        }

        /* renamed from: a */
        public int mo109121a(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineTop(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109121a(i);
        }

        /* renamed from: b */
        public int mo109122b(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineStart(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109122b(i);
        }

        /* renamed from: c */
        public int mo109123c(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineForOffset(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109123c(i);
        }

        /* renamed from: d */
        public int mo109124d(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineBottom(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109124d(i);
        }

        /* renamed from: e */
        public float mo109125e(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1.0f;
                }
                return d.getLineRight(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1.0f;
            }
            return cVar.mo109125e(i);
        }

        /* renamed from: j0 */
        public int mo109126j0(int i, int i2) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                int paddingLeft = i - neatTextView.getPaddingLeft();
                int paddingTop = i2 - NeatTextView.this.getPaddingTop();
                Layout layout = NeatTextView.this.getWrappedTextView().getLayout();
                if (layout == null) {
                    return -1;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(paddingTop), (float) paddingLeft);
                return ((int) layout.getPrimaryHorizontal(offsetForHorizontal)) > paddingLeft ? layout.getOffsetToLeftOf(offsetForHorizontal) : offsetForHorizontal;
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109126j0(i, i2);
        }

        /* renamed from: k0 */
        public int mo109127k0(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineBaseline(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109127k0(i);
        }

        /* renamed from: l0 */
        public int mo109128l0() {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineCount();
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.f336808j.size();
        }

        /* renamed from: m0 */
        public int mo109129m0(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getEllipsisCount(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109129m0(i);
        }

        /* renamed from: n0 */
        public List<C112173c> mo109130n0() {
            C112481c cVar;
            NeatTextView neatTextView = NeatTextView.this;
            if (!neatTextView.f320006e && (cVar = neatTextView.f320005d) != null) {
                return cVar.mo109130n0();
            }
            return null;
        }

        /* renamed from: o0 */
        public int mo109131o0(int i, float f) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getOffsetForHorizontal(i, f);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109131o0(i, f);
        }

        /* renamed from: p0 */
        public int mo109132p0(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getLineForVertical(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109132p0(i);
        }

        /* renamed from: q0 */
        public int mo109133q0(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1;
                }
                return d.getEllipsisStart(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1;
            }
            return cVar.mo109133q0(i);
        }

        /* renamed from: r0 */
        public float mo109134r0(int i) {
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                Layout d = neatTextView.getWrappedTxtLayout();
                if (d == null) {
                    return -1.0f;
                }
                return d.getLineWidth(i);
            }
            C112481c cVar = neatTextView.f320005d;
            if (cVar == null) {
                return -1.0f;
            }
            return cVar.mo109134r0(i);
        }
    }

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$b */
    public class C106874b implements SpanWatcher {

        /* renamed from: d */
        public WeakReference<C112481c> f320027d;

        public C106874b(C106878b bVar) {
        }

        /* renamed from: a */
        public final void mo155021a(Spannable spannable) {
            C112481c cVar;
            NeatTextView neatTextView = NeatTextView.this;
            if (neatTextView.f320006e) {
                neatTextView.postInvalidate();
                return;
            }
            WeakReference<C112481c> weakReference = this.f320027d;
            if (weakReference != null && (cVar = weakReference.get()) != null && cVar.f336799a == spannable) {
                cVar.mo164223j(spannable, cVar.f336802d, cVar.f336795F);
                NeatTextView.this.postInvalidate();
            }
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            mo155021a(spannable);
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            mo155021a(spannable);
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            mo155021a(spannable);
        }
    }

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$d */
    public static final class C106875d implements Runnable {

        /* renamed from: d */
        public TextPaint f320029d = new TextPaint();

        /* renamed from: e */
        public String f320030e;

        /* renamed from: f */
        public float[] f320031f;

        /* renamed from: g */
        public volatile boolean f320032g = false;

        public C106875d(String str, TextPaint textPaint) {
            this.f320029d.set(textPaint);
            this.f320030e = str;
        }

        public void run() {
            float[] fArr = new float[this.f320030e.length()];
            this.f320031f = fArr;
            this.f320029d.getTextWidths(this.f320030e, fArr);
            this.f320032g = true;
        }
    }

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$e */
    public static class C106876e {

        /* renamed from: a */
        public boolean f320033a;

        /* renamed from: b */
        public float[] f320034b;

        public C106876e(boolean z, float[] fArr) {
            this.f320033a = z;
            this.f320034b = fArr;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("PreMeasuredThread", -8);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            f319994L = new Handler(looper);
        }
    }

    public NeatTextView(Context context) {
        super(context);
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        this.f320023y = Spannable.Factory.getInstance();
        this.f319996B = true;
        this.f319998D = 8388659;
        this.f320001G = true;
        mo154971g(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: private */
    public Layout getWrappedTxtLayout() {
        TextView wrappedTextView = getWrappedTextView();
        if (wrappedTextView != null) {
            return wrappedTextView.getLayout();
        }
        return null;
    }

    private void setRawTextSize(float f) {
        if (f != this.f320009h.getTextSize()) {
            this.f320009h.setTextSize(f);
            if (this.f320005d != null) {
                mo154969e();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public CharSequence mo154968a() {
        CharSequence charSequence = this.f320022x;
        return charSequence == null ? "" : charSequence;
    }

    /* renamed from: b */
    public void mo104279b(CharSequence charSequence) {
        mo104280c(charSequence, TextView.BufferType.NORMAL, (Boolean) null);
    }

    /* renamed from: c */
    public void mo104280c(CharSequence charSequence, TextView.BufferType bufferType, Boolean bool) {
        boolean z;
        if (charSequence == null) {
            charSequence = "";
        }
        if (bufferType == TextView.BufferType.NORMAL) {
            charSequence = TextUtils.stringOrSpannedString(charSequence);
        } else if (bufferType == TextView.BufferType.SPANNABLE) {
            charSequence = this.f320023y.newSpannable(charSequence);
        }
        this.f320022x = charSequence;
        boolean z2 = true;
        if (mo104286h()) {
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                String charSequence2 = charSequence.toString();
                LruCache<String, C106876e> lruCache = f319993K;
                C106876e eVar = lruCache.get(mo154970f(charSequence2));
                if (eVar == null) {
                    boolean z3 = !charSequence2.matches("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$");
                    lruCache.put(mo154970f(charSequence2), new C106876e(z3, (float[]) null));
                    z = z3;
                } else {
                    z = eVar.f320033a;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        this.f320006e = z2;
        if (z2) {
            if (getLayoutParams() != null) {
                getWrappedTextView().setLayoutParams(getLayoutParams());
            }
            getWrappedTextView().setText(charSequence, bufferType);
            this.f320022x = getWrappedTextView().getText();
            requestLayout();
            invalidate();
        } else {
            mo154969e();
        }
        CharSequence charSequence3 = this.f320022x;
        if (charSequence3 instanceof Spannable) {
            ((Spannable) charSequence3).setSpan(this.f320008g, 0, charSequence.length(), 18);
        }
    }

    /* renamed from: e */
    public final void mo154969e() {
        CharSequence charSequence;
        this.f320005d = null;
        Handler handler = f319994L;
        if (handler != null) {
            CharSequence charSequence2 = this.f320022x;
            if (charSequence2 == null && (charSequence = this.f320024z) != null) {
                C106875d dVar = new C106875d(charSequence.toString(), this.f320009h);
                this.f320002H = dVar;
                handler.post(dVar);
            } else if (charSequence2 != null) {
                C106875d dVar2 = new C106875d(charSequence2.toString(), this.f320009h);
                this.f320002H = dVar2;
                handler.post(dVar2);
            } else {
                return;
            }
        }
        requestLayout();
        invalidate();
    }

    /* renamed from: f */
    public final String mo154970f(String str) {
        return str + "#" + this.f320009h.getTextSize();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final void mo154971g(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Context context2 = context;
        this.f319995A = new C106879c(getContext(), this, new Handler(Looper.getMainLooper()));
        AdaptedTextView adaptedTextView = new AdaptedTextView(context2);
        adaptedTextView.setClickable(true);
        adaptedTextView.setFocusable(true);
        adaptedTextView.f320025g = new C106878b(this);
        this.f320007f = adaptedTextView;
        this.f320009h = getWrappedTextView().getPaint();
        boolean z = false;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C111611a.f334107a, i, 0);
        String str = null;
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i3 = -16777216;
            int i4 = 0;
            int i5 = -16777216;
            int i6 = 15;
            int i7 = -16776961;
            int i8 = -7829368;
            int i9 = -1;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    i6 = obtainStyledAttributes.getDimensionPixelSize(index, 15);
                } else if (index == 3) {
                    i5 = obtainStyledAttributes.getColor(index, i3);
                } else {
                    if (index == 23) {
                        setMaxLines(obtainStyledAttributes.getBoolean(index, z) ? 1 : this.f320015q);
                    } else if (index == 20) {
                        setLines(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 7) {
                        setTextGravity(obtainStyledAttributes.getInt(index, 16));
                    } else if (index == 13) {
                        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(index, this.f320016r));
                    } else if (index == 24) {
                        setSpacingAdd(obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f320020v));
                    } else if (index == 25) {
                        mo154993k((float) obtainStyledAttributes.getDimensionPixelSize(index, 1), this.f320020v);
                    } else if (index == 15) {
                        setMinWidth(obtainStyledAttributes.getDimensionPixelSize(index, this.f320018t));
                    } else if (index == 16) {
                        setMinHeight(obtainStyledAttributes.getDimensionPixelSize(index, this.f320019u));
                    } else if (index == 14) {
                        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(index, this.f320017s));
                    } else if (index == 19) {
                        setMaxLines(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 17) {
                        str = obtainStyledAttributes.getString(index);
                    } else if (index == 22) {
                        setWidth(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 21) {
                        setHeight(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 18) {
                        setHint(obtainStyledAttributes.getText(index));
                    } else if (index == 4) {
                        i8 = obtainStyledAttributes.getColor(index, -7829368);
                    } else {
                        if (index == 5) {
                            i7 = obtainStyledAttributes.getColor(index, -16776961);
                        } else if (index == 6) {
                            i9 = obtainStyledAttributes.getInt(index, i9);
                        } else {
                            i2 = i9;
                            if (index == 27) {
                                this.f320001G = obtainStyledAttributes.getBoolean(index, true);
                            }
                            i9 = i2;
                        }
                        i4++;
                        z = false;
                        i3 = -16777216;
                    }
                    i2 = i9;
                    i9 = i2;
                    i4++;
                    z = false;
                    i3 = -16777216;
                }
                i4++;
                z = false;
                i3 = -16777216;
            }
            int i15 = i9;
            obtainStyledAttributes.recycle();
            setTextColor(i5);
            setRawTextSize((float) i6);
            setLinkTextColor(i7);
            setHintTextColor(i8);
            if (i15 == 1) {
                setEllipsize(TextUtils.TruncateAt.START);
            } else if (i15 == 2) {
                setEllipsize(TextUtils.TruncateAt.MIDDLE);
            } else if (i15 == 3) {
                setEllipsize(TextUtils.TruncateAt.END);
            }
            if (!TextUtils.isEmpty(str)) {
                mo104279b(str);
            }
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int getCurrentHintTextColor() {
        return this.f320011j != null ? this.f320014p : this.f320013o;
    }

    public final int getCurrentTextColor() {
        return this.f320013o;
    }

    public float getExtraEllipsizeWidth() {
        return this.f320000F;
    }

    public CharSequence getHint() {
        return this.f320024z;
    }

    public float getHorizontalOffset() {
        return ((this.f319998D & 7) == 3 || this.f320005d == null) ? (float) getPaddingLeft() : (((float) getMeasuredWidth()) - this.f320005d.mo164222i()[0]) / 2.0f;
    }

    public C79150a getLayout() {
        C79150a aVar = this.f320004J;
        if (aVar != null) {
            return aVar;
        }
        C106873a aVar2 = new C106873a();
        this.f320004J = aVar2;
        return aVar2;
    }

    public int getLineCount() {
        C112481c cVar = this.f320005d;
        if (cVar != null) {
            return cVar.f336808j.size();
        }
        return 0;
    }

    public int getLineHeight() {
        return Math.round((((float) this.f320009h.getFontMetricsInt((Paint.FontMetricsInt) null)) * this.f320021w) + this.f320020v);
    }

    public float getLineSpacingExtra() {
        return this.f320020v;
    }

    public float getLineSpacingMultiplier() {
        return this.f320021w;
    }

    public int getMaxHeight() {
        return this.f320017s;
    }

    public int getMaxLines() {
        return this.f320015q;
    }

    public int getMaxWidth() {
        return this.f320016r;
    }

    public C75245c getOnDoubleClickListener() {
        return this.f319997C;
    }

    public TextPaint getPaint() {
        return this.f320009h;
    }

    public int getTextGravity() {
        return this.f319998D;
    }

    public float getTextSize() {
        return getPaint().getTextSize();
    }

    public float getVerticalOffset() {
        return ((this.f319998D & 112) == 48 || this.f320005d == null) ? (float) getPaddingTop() : (((float) getMeasuredHeight()) - this.f320005d.mo164222i()[1]) / 2.0f;
    }

    public TextView getWrappedTextView() {
        return this.f320007f;
    }

    /* renamed from: h */
    public boolean mo104286h() {
        return this.f319996B;
    }

    /* renamed from: i */
    public C79150a mo154990i(int i, int i2) {
        if (TextUtils.isEmpty(this.f320022x)) {
            return null;
        }
        NeatLayout neatLayout = new NeatLayout(this.f320022x, (float[]) null);
        neatLayout.mo164221h(getPaint(), (float) i, (float) i2, (float) getPaddingLeft(), (float) getPaddingTop(), (float) getLineHeight(), this.f320015q, this.f319999E, this.f320000F, this.f320001G, this.f319998D);
        return neatLayout;
    }

    public void invalidate() {
        super.invalidate();
    }

    /* renamed from: j */
    public void mo154992j(TextUtils.TruncateAt truncateAt, float f) {
        this.f320000F = f;
        this.f319999E = truncateAt;
        getWrappedTextView().setEllipsize(this.f319999E);
        if (this.f320005d != null) {
            this.f320005d = null;
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: k */
    public void mo154993k(float f, float f2) {
        this.f320020v = f;
        this.f320021w = f2;
        getWrappedTextView().setLineSpacing(f, f2);
        requestLayout();
        invalidate();
    }

    /* renamed from: l */
    public void mo154994l(int i, float f) {
        Context context = getContext();
        setRawTextSize(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154995m() {
        /*
            r6 = this;
            android.content.res.ColorStateList r0 = r6.f320010i
            int[] r1 = r6.getDrawableState()
            r2 = 0
            int r0 = r0.getColorForState(r1, r2)
            int r1 = r6.f320013o
            r3 = 1
            if (r0 == r1) goto L_0x0014
            r6.f320013o = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            android.content.res.ColorStateList r1 = r6.f320012n
            if (r1 == 0) goto L_0x002a
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            android.text.TextPaint r4 = r6.f320009h
            int r5 = r4.linkColor
            if (r1 == r5) goto L_0x002a
            r4.linkColor = r1
            r0 = 1
        L_0x002a:
            android.content.res.ColorStateList r1 = r6.f320011j
            if (r1 == 0) goto L_0x0047
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            int r2 = r6.f320014p
            if (r1 == r2) goto L_0x0047
            r6.f320014p = r1
            java.lang.CharSequence r1 = r6.f320022x
            if (r1 == 0) goto L_0x0048
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r0
        L_0x0048:
            if (r3 == 0) goto L_0x004d
            r6.invalidate()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.neattextview.textview.view.NeatTextView.mo154995m():void");
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f320013o;
        if (!TextUtils.isEmpty(this.f320024z) && TextUtils.isEmpty(this.f320022x) && this.f320011j != null) {
            i = this.f320014p;
        }
        this.f320009h.setColor(i);
        this.f320009h.drawableState = getDrawableState();
        if (this.f320006e) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            Layout layout = getWrappedTextView().getLayout();
            if (layout != null) {
                layout.draw(canvas);
            }
            canvas.restore();
            return;
        }
        C112481c cVar = this.f320005d;
        if (cVar != null) {
            TextPaint textPaint = cVar.f336802d;
            if (textPaint != null) {
                textPaint.set(this.f320009h);
            }
            C112481c cVar2 = this.f320005d;
            float verticalOffset = getVerticalOffset();
            cVar2.getClass();
            canvas.save();
            canvas.translate((float) getPaddingLeft(), verticalOffset);
            Iterator<C112172b> it = cVar2.f336809k.iterator();
            while (it.hasNext()) {
                it.next().mo163971b(canvas, cVar2.f336802d, cVar2.f336808j);
            }
            Iterator<C112480b> it4 = cVar2.f336808j.iterator();
            float f = 0.0f;
            while (it4.hasNext()) {
                C112480b next = it4.next();
                next.mo164218qq(canvas, cVar2.f336802d, 0.0f, f);
                f += next.getHeight();
            }
            canvas.restore();
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        float[] fArr;
        int i3;
        int i4;
        int i5;
        boolean z2;
        if (this.f320006e) {
            getWrappedTextView().measure(i, i2);
            setMeasuredDimension(getWrappedTextView().getMeasuredWidth(), getWrappedTextView().getMeasuredHeight());
            return;
        }
        int i6 = i;
        int i7 = i2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 && mode2 == 0) {
            size = getResources().getDisplayMetrics().widthPixels;
        }
        if (size2 <= 0 && mode2 == 0) {
            size2 = Integer.MAX_VALUE;
        }
        int i8 = this.f320016r;
        if (i8 > 0 && i8 < size) {
            size = i8;
        }
        int i9 = this.f320017s;
        if (i9 > 0 && i9 < size2) {
            size2 = i9;
        }
        float paddingLeft = (float) ((size - getPaddingLeft()) - getPaddingRight());
        float paddingTop = (float) ((size2 - getPaddingTop()) - getPaddingBottom());
        CharSequence charSequence = TextUtils.isEmpty(this.f320022x) ? this.f320024z : this.f320022x;
        if (!TextUtils.isEmpty(charSequence)) {
            C106876e eVar = f319993K.get(mo154970f(charSequence.toString()));
            if (eVar != null) {
                fArr = eVar.f320034b;
                z2 = false;
            } else {
                C106875d dVar = this.f320002H;
                fArr = (dVar == null || this.f320009h.getTextSize() != dVar.f320029d.getTextSize() || !dVar.f320032g) ? null : dVar.f320031f;
                z2 = true;
            }
            z = z2;
        } else {
            charSequence = "";
            fArr = null;
            z = false;
        }
        NeatLayout neatLayout = new NeatLayout(charSequence, fArr);
        this.f320005d = neatLayout;
        if (this.f320003I == null) {
            i3 = size;
            neatLayout.mo164221h(getPaint(), paddingLeft, paddingTop, (float) getPaddingLeft(), (float) getPaddingTop(), (float) getLineHeight(), this.f320015q, this.f319999E, this.f320000F, this.f320001G, this.f319998D);
            i5 = size2;
            i4 = mode2;
        } else {
            i3 = size;
            TextPaint paint = getPaint();
            float[] fArr2 = this.f320003I;
            float lineHeight = (float) getLineHeight();
            int i15 = this.f320015q;
            TextUtils.TruncateAt truncateAt = this.f319999E;
            float f = this.f320000F;
            boolean z3 = this.f320001G;
            i5 = size2;
            int i16 = this.f319998D;
            boolean z4 = z3;
            neatLayout.f336802d = new TextPaint(paint);
            neatLayout.f336814p = f;
            neatLayout.f336810l = paddingLeft;
            neatLayout.f336811m = (float) getPaddingLeft();
            neatLayout.f336812n = (float) getPaddingTop();
            neatLayout.f336816r = i15;
            neatLayout.f336815q = truncateAt;
            neatLayout.f336813o = lineHeight;
            neatLayout.f336819u = null;
            neatLayout.f336817s = i16;
            int length = neatLayout.f336799a.length();
            if (neatLayout.f336803e == null) {
                float[] fArr3 = new float[length];
                neatLayout.f336803e = fArr3;
                paint.getTextWidths(neatLayout.f336800b, fArr3);
            }
            boolean[] zArr = new boolean[length];
            neatLayout.f336795F = zArr;
            neatLayout.mo164223j(neatLayout.f336799a, paint, zArr);
            neatLayout.mo164224k(paint);
            float[] fArr4 = new float[fArr2.length];
            for (int i17 = 0; i17 < fArr2.length; i17++) {
                fArr4[i17] = paddingLeft - fArr2[i17];
            }
            boolean z5 = z4;
            i4 = mode2;
            neatLayout.mo154967f(paint, fArr4, paddingLeft, paddingTop, lineHeight, i15, truncateAt, z5);
            neatLayout.mo164220g(truncateAt, f, paint);
        }
        if (z) {
            f319993K.put(mo154970f(this.f320005d.f336800b), new C106876e(this.f320006e, this.f320005d.f336803e));
        }
        C106874b bVar = this.f320008g;
        C112481c cVar = this.f320005d;
        bVar.getClass();
        bVar.f320027d = new WeakReference<>(cVar);
        float[] i18 = this.f320005d.mo164222i();
        setMeasuredDimension(Math.max(mode == 1073741824 ? i3 : (int) Math.min(i18[0] + ((float) getPaddingLeft()) + ((float) getPaddingRight()), (float) this.f320016r), this.f320018t), Math.max(i4 == 1073741824 ? i5 : (int) Math.min(i18[1] + ((float) getPaddingTop()) + ((float) getPaddingBottom()), (float) this.f320017s), this.f320019u));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C106879c cVar = this.f319995A;
        if (cVar == null || !cVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void postInvalidate() {
        super.postInvalidate();
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f319999E != truncateAt) {
            this.f319999E = truncateAt;
            getWrappedTextView().setEllipsize(this.f319999E);
            if (this.f320005d != null) {
                this.f320005d = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public void setHeight(int i) {
        this.f320017s = i;
        getWrappedTextView().setMaxHeight(i);
        requestLayout();
        invalidate();
    }

    public final void setHint(int i) {
        setHint(getContext().getResources().getText(i));
    }

    public final void setHintTextColor(int i) {
        this.f320011j = ColorStateList.valueOf(i);
        getWrappedTextView().setHintTextColor(i);
        mo154995m();
    }

    public void setLineEndExtraWidths(float[] fArr) {
        this.f320003I = fArr;
    }

    public void setLines(int i) {
        this.f320015q = i;
        getWrappedTextView().setLines(i);
        requestLayout();
        invalidate();
    }

    public final void setLinkTextColor(int i) {
        this.f320012n = ColorStateList.valueOf(i);
        mo154995m();
    }

    public void setMaxHeight(int i) {
        this.f320017s = i;
        getWrappedTextView().setMaxHeight(i);
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i) {
        this.f320015q = i;
        getWrappedTextView().setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.f320016r = i;
        getWrappedTextView().setMaxWidth(i);
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i) {
        this.f320019u = i;
        getWrappedTextView().setMinHeight(i);
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i) {
        this.f320018t = i;
        getWrappedTextView().setMinWidth(i);
        requestLayout();
        invalidate();
    }

    public void setNeatEnable(boolean z) {
        this.f319996B = z;
    }

    public void setOnDoubleClickListener(C75245c cVar) {
        this.f319997C = cVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i3 == getPaddingRight() && i2 == getPaddingTop() && i4 == getPaddingBottom())) {
            this.f320005d = null;
        }
        super.setPadding(i, i2, i3, i4);
        getWrappedTextView().setPadding(i, i2, i3, i4);
        invalidate();
    }

    public void setSmartLetterEnable(boolean z) {
        this.f320001G = z;
    }

    public void setSpacingAdd(int i) {
        float f = (float) i;
        this.f320020v = f;
        getWrappedTextView().setLineSpacing(f, this.f320021w);
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        this.f320010i = ColorStateList.valueOf(i);
        getWrappedTextView().setTextColor(i);
        mo154995m();
    }

    public void setTextGravity(int i) {
        getWrappedTextView().setGravity(i);
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        this.f319998D = i;
    }

    public void setTextSize(float f) {
        mo154994l(2, f);
    }

    public void setWidth(int i) {
        this.f320016r = i;
        getWrappedTextView().setMaxWidth(i);
        requestLayout();
        invalidate();
    }

    public final void setHint(CharSequence charSequence) {
        this.f320024z = TextUtils.stringOrSpannedString(charSequence);
        getWrappedTextView().setHint(this.f320024z);
        if (TextUtils.isEmpty(this.f320022x)) {
            mo154969e();
        }
    }

    public NeatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        this.f320023y = Spannable.Factory.getInstance();
        this.f319996B = true;
        this.f319998D = 8388659;
        this.f320001G = true;
        mo154971g(context, attributeSet, 0);
    }

    public NeatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        this.f320023y = Spannable.Factory.getInstance();
        this.f319996B = true;
        this.f319998D = 8388659;
        this.f320001G = true;
        mo154971g(context, attributeSet, i);
    }
}
