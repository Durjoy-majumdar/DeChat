package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.widget.C103732g;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.WeakHashMap;
import p1159va.C111493a;
import p849e3.C107168a0;
import p849e3.C107207u;
import vt0.C111615o;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker */
public class YANumberPicker extends View {

    /* renamed from: A */
    public int f311599A = 0;

    /* renamed from: B */
    public int f311600B = 0;

    /* renamed from: C */
    public int f311601C = 0;

    /* renamed from: D */
    public int f311602D = 0;

    /* renamed from: E */
    public int f311603E = 0;

    /* renamed from: F */
    public int f311604F = 0;

    /* renamed from: G */
    public int f311605G = 150;

    /* renamed from: H */
    public int f311606H = 8;

    /* renamed from: I */
    public String f311607I;

    /* renamed from: J */
    public String f311608J;

    /* renamed from: K */
    public String f311609K;

    /* renamed from: L */
    public String f311610L;

    /* renamed from: M */
    public float f311611M = 1.0f;

    /* renamed from: N */
    public float f311612N = 0.0f;

    /* renamed from: P */
    public float f311613P = 0.0f;

    /* renamed from: Q */
    public float f311614Q = 0.0f;

    /* renamed from: Q0 */
    public VelocityTracker f311615Q0;

    /* renamed from: R */
    public boolean f311616R = true;

    /* renamed from: R0 */
    public Paint f311617R0 = new Paint();

    /* renamed from: S */
    public boolean f311618S = true;

    /* renamed from: S0 */
    public TextPaint f311619S0 = new TextPaint();

    /* renamed from: T */
    public boolean f311620T = false;

    /* renamed from: T0 */
    public Paint f311621T0 = new Paint();

    /* renamed from: U */
    public boolean f311622U = false;

    /* renamed from: U0 */
    public String[] f311623U0;

    /* renamed from: V */
    public boolean f311624V = true;

    /* renamed from: V0 */
    public CharSequence[] f311625V0;

    /* renamed from: W */
    public boolean f311626W = false;

    /* renamed from: W0 */
    public CharSequence[] f311627W0;

    /* renamed from: X0 */
    public MMHandler f311628X0;

    /* renamed from: Y0 */
    public Handler f311629Y0;

    /* renamed from: Z0 */
    public C104943b f311630Z0;

    /* renamed from: a1 */
    public int f311631a1 = 0;

    /* renamed from: b1 */
    public int f311632b1;

    /* renamed from: c1 */
    public int f311633c1;

    /* renamed from: d */
    public int f311634d = -13421773;

    /* renamed from: d1 */
    public int f311635d1;

    /* renamed from: e */
    public int f311636e = -695533;

    /* renamed from: e1 */
    public int f311637e1;

    /* renamed from: f */
    public int f311638f = -695533;

    /* renamed from: f1 */
    public float f311639f1 = 0.0f;

    /* renamed from: g */
    public int f311640g = 0;

    /* renamed from: g1 */
    public float f311641g1 = 0.0f;

    /* renamed from: h */
    public int f311642h = 0;

    /* renamed from: h1 */
    public float f311643h1 = 0.0f;

    /* renamed from: i */
    public int f311644i = 0;

    /* renamed from: i1 */
    public boolean f311645i1 = false;

    /* renamed from: j */
    public int f311646j = 0;

    /* renamed from: j1 */
    public int f311647j1;

    /* renamed from: k1 */
    public int f311648k1;

    /* renamed from: l1 */
    public int f311649l1;

    /* renamed from: m1 */
    public float f311650m1;

    /* renamed from: n */
    public int f311651n = 0;

    /* renamed from: n1 */
    public float f311652n1;

    /* renamed from: o */
    public int f311653o = 0;

    /* renamed from: o1 */
    public float f311654o1;

    /* renamed from: p */
    public int f311655p = 0;

    /* renamed from: p0 */
    public boolean f311656p0 = false;

    /* renamed from: p1 */
    public int f311657p1 = 0;

    /* renamed from: q */
    public int f311658q = 0;

    /* renamed from: q1 */
    public int f311659q1 = 0;

    /* renamed from: r */
    public int f311660r = 0;

    /* renamed from: r1 */
    public int f311661r1 = 0;

    /* renamed from: s */
    public int f311662s = -695533;

    /* renamed from: s1 */
    public int f311663s1 = 0;

    /* renamed from: t */
    public int f311664t = 2;

    /* renamed from: t1 */
    public int f311665t1 = 0;

    /* renamed from: u */
    public int f311666u = 0;

    /* renamed from: v */
    public int f311667v = 0;

    /* renamed from: w */
    public int f311668w = 3;

    /* renamed from: x */
    public int f311669x = -1;

    /* renamed from: x0 */
    public boolean f311670x0 = true;

    /* renamed from: y */
    public int f311671y = -1;

    /* renamed from: y0 */
    public C103732g f311672y0;

    /* renamed from: z */
    public int f311673z = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker$a */
    public interface C104942a {
        /* renamed from: a */
        void mo149033a(YANumberPicker yANumberPicker, int i);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker$b */
    public interface C104943b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker$c */
    public interface C104944c {
        /* renamed from: a */
        void mo149034a(YANumberPicker yANumberPicker, int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker$d */
    public interface C104945d {
        /* renamed from: a */
        void mo149035a(YANumberPicker yANumberPicker, int i, int i2, String[] strArr);
    }

    public YANumberPicker(Context context) {
        super(context);
        mo148996k(context);
    }

    /* renamed from: a */
    public static void m140698a(YANumberPicker yANumberPicker, int i, int i2, Object obj) {
        yANumberPicker.mo148999n(0);
        if (i != i2 && (obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue())) {
            C104943b bVar = yANumberPicker.f311630Z0;
            if (bVar != null) {
                int i3 = yANumberPicker.f311673z;
                ((AppBrandMultiOptionsPicker.C104940a) bVar).mo148972a(yANumberPicker, i + i3, i3 + i2);
            }
            yANumberPicker.getClass();
        }
        yANumberPicker.f311604F = i2;
        if (yANumberPicker.f311626W) {
            yANumberPicker.f311626W = false;
            yANumberPicker.mo148977c(yANumberPicker.getPickedIndexRelativeToRaw() - yANumberPicker.f311669x, false);
            yANumberPicker.f311618S = false;
            yANumberPicker.postInvalidate();
        }
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.f311608J;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(IXWebBroadcastListener.STAGE_START)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TextUtils.TruncateAt.MIDDLE;
            case 1:
                return TextUtils.TruncateAt.END;
            case 2:
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    /* renamed from: b */
    public final void mo148976b() {
        int floor = (int) Math.floor((double) (((float) this.f311661r1) / ((float) this.f311649l1)));
        this.f311657p1 = floor;
        this.f311659q1 = -(this.f311661r1 - (floor * this.f311649l1));
    }

    /* renamed from: c */
    public final void mo148977c(int i, boolean z) {
        int i2 = i - ((this.f311668w - 1) / 2);
        this.f311657p1 = i2;
        int oneRecycleSize = getOneRecycleSize();
        if (oneRecycleSize <= 0) {
            i2 = 0;
        } else if (z && (i2 = i2 % oneRecycleSize) < 0) {
            i2 += oneRecycleSize;
        }
        this.f311657p1 = i2;
        int i3 = this.f311649l1;
        if (i3 == 0) {
            this.f311620T = true;
            return;
        }
        this.f311661r1 = i3 * i2;
        int i4 = i2 + (this.f311668w / 2);
        this.f311632b1 = i4;
        int oneRecycleSize2 = i4 % getOneRecycleSize();
        this.f311632b1 = oneRecycleSize2;
        if (oneRecycleSize2 < 0) {
            this.f311632b1 = oneRecycleSize2 + getOneRecycleSize();
        }
        this.f311633c1 = this.f311632b1;
        mo148976b();
    }

    public void computeScroll() {
        if (this.f311649l1 != 0 && this.f311672y0.f306426a.computeScrollOffset()) {
            this.f311661r1 = this.f311672y0.mo145036b();
            mo148976b();
            postInvalidate();
        }
    }

    /* renamed from: d */
    public final int mo148979d(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e */
    public final int mo148980e(float f, int i, int i2) {
        int i3 = (i & -16777216) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & 65280) >>> 8;
        int i6 = (i & 255) >>> 0;
        return ((int) (((float) i6) + (((float) (((i2 & 255) >>> 0) - i6)) * f))) | (((int) (((float) i3) + (((float) (((-16777216 & i2) >>> 24) - i3)) * f))) << 24) | (((int) (((float) i4) + (((float) (((16711680 & i2) >>> 16) - i4)) * f))) << 16) | (((int) (((float) i5) + (((float) (((65280 & i2) >>> 8) - i5)) * f))) << 8);
    }

    /* renamed from: f */
    public final int mo148981f(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i = Math.max(mo148994i(charSequence, paint), i);
            }
        }
        return i;
    }

    /* renamed from: g */
    public final Message mo148982g(int i, int i2, int i3, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        return obtain;
    }

    public String getContentByCurrValue() {
        return this.f311623U0[getValue() - this.f311673z];
    }

    public String[] getDisplayedValues() {
        return this.f311623U0;
    }

    public int getMaxValue() {
        return this.f311599A;
    }

    public int getMinValue() {
        return this.f311673z;
    }

    public int getOneRecycleSize() {
        return (this.f311671y - this.f311669x) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f311659q1;
        if (i == 0) {
            return mo148995j(this.f311661r1);
        }
        int i2 = this.f311649l1;
        return i < (-i2) / 2 ? mo148995j(this.f311661r1 + i2 + i) : mo148995j(this.f311661r1 + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.f311623U0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f311673z;
    }

    public boolean getWrapSelectorWheel() {
        return this.f311618S;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f311618S && this.f311624V;
    }

    /* renamed from: h */
    public final float mo148993h(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: i */
    public final int mo148994i(CharSequence charSequence, Paint paint) {
        if (!TextUtils.isEmpty(charSequence)) {
            return (int) (paint.measureText(charSequence.toString()) + 0.5f);
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo148995j(int i) {
        int i2 = this.f311649l1;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i4 = (i / i2) + (this.f311668w / 2);
        int oneRecycleSize = getOneRecycleSize();
        boolean z = this.f311618S && this.f311624V;
        if (oneRecycleSize > 0) {
            if (z && (i4 = i4 % oneRecycleSize) < 0) {
                i4 += oneRecycleSize;
            }
            i3 = i4;
        }
        if (i3 >= 0 && i3 < getOneRecycleSize()) {
            return i3 + this.f311669x;
        }
        throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + i3 + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.f311618S);
    }

    /* renamed from: k */
    public final void mo148996k(Context context) {
        this.f311672y0 = new C103732g(context, (Interpolator) null);
        this.f311605G = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f311606H = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f311640g == 0) {
            this.f311640g = mo149006p(context, 13.0f);
        }
        if (this.f311642h == 0) {
            this.f311642h = mo149006p(context, 15.0f);
        }
        if (this.f311644i == 0) {
            this.f311644i = mo149006p(context, 14.0f);
        }
        if (this.f311653o == 0) {
            this.f311653o = mo148979d(context, 8.0f);
        }
        if (this.f311655p == 0) {
            this.f311655p = mo148979d(context, 8.0f);
        }
        this.f311617R0.setColor(this.f311662s);
        this.f311617R0.setAntiAlias(true);
        this.f311617R0.setStyle(Paint.Style.STROKE);
        this.f311617R0.setStrokeWidth((float) this.f311664t);
        this.f311619S0.setColor(this.f311634d);
        this.f311619S0.setAntiAlias(true);
        this.f311619S0.setTextAlign(Paint.Align.CENTER);
        this.f311621T0.setColor(this.f311638f);
        this.f311621T0.setAntiAlias(true);
        this.f311621T0.setTextAlign(Paint.Align.CENTER);
        this.f311621T0.setTextSize((float) this.f311644i);
        int i = this.f311668w;
        if (i % 2 == 0) {
            this.f311668w = i + 1;
        }
        int i2 = this.f311669x;
        if (i2 == -1 || this.f311671y == -1) {
            if (this.f311623U0 == null) {
                String[] strArr = new String[1];
                this.f311623U0 = strArr;
                strArr[0] = "0";
            }
            String[] strArr2 = this.f311623U0;
            this.f311624V = strArr2.length > this.f311668w;
            if (i2 == -1) {
                this.f311669x = 0;
            }
            if (this.f311671y == -1) {
                this.f311671y = strArr2.length - 1;
            }
            mo149000o(this.f311669x, this.f311671y, false);
        }
        this.f311628X0 = new C104946a(this, "HandlerThread-For-Refreshing");
        this.f311629Y0 = new C111615o(this);
    }

    /* renamed from: l */
    public final void mo148997l(Context context, AttributeSet attributeSet) {
        String[] strArr;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C111493a.f333789a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 17) {
                    this.f311668w = obtainStyledAttributes.getInt(index, 3);
                } else if (index == 3) {
                    this.f311662s = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == 4) {
                    this.f311664t = obtainStyledAttributes.getDimensionPixelSize(index, 2);
                } else if (index == 5) {
                    this.f311666u = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 6) {
                    this.f311667v = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 19) {
                    CharSequence[] textArray = obtainStyledAttributes.getTextArray(index);
                    if (textArray == null) {
                        strArr = null;
                    } else {
                        String[] strArr2 = new String[textArray.length];
                        for (int i2 = 0; i2 < textArray.length; i2++) {
                            strArr2[i2] = textArray[i2].toString();
                        }
                        strArr = strArr2;
                    }
                    this.f311623U0 = strArr;
                } else if (index == 21) {
                    this.f311634d = obtainStyledAttributes.getColor(index, -13421773);
                } else if (index == 22) {
                    this.f311636e = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == 20) {
                    this.f311638f = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == 25) {
                    this.f311640g = obtainStyledAttributes.getDimensionPixelSize(index, mo149006p(context, 13.0f));
                } else if (index == 26) {
                    this.f311642h = obtainStyledAttributes.getDimensionPixelSize(index, mo149006p(context, 15.0f));
                } else if (index == 24) {
                    this.f311644i = obtainStyledAttributes.getDimensionPixelSize(index, mo149006p(context, 14.0f));
                } else if (index == 14) {
                    this.f311669x = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 13) {
                    this.f311671y = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 27) {
                    this.f311618S = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 18) {
                    this.f311616R = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 8) {
                    this.f311607I = obtainStyledAttributes.getString(index);
                } else if (index == 0) {
                    this.f311610L = obtainStyledAttributes.getString(index);
                } else if (index == 7) {
                    this.f311609K = obtainStyledAttributes.getString(index);
                } else if (index == 12) {
                    this.f311653o = obtainStyledAttributes.getDimensionPixelSize(index, mo148979d(context, 8.0f));
                } else if (index == 11) {
                    this.f311655p = obtainStyledAttributes.getDimensionPixelSize(index, mo148979d(context, 8.0f));
                } else if (index == 10) {
                    this.f311658q = obtainStyledAttributes.getDimensionPixelSize(index, mo148979d(context, 2.0f));
                } else if (index == 9) {
                    this.f311660r = obtainStyledAttributes.getDimensionPixelSize(index, mo148979d(context, 5.0f));
                } else if (index == 1) {
                    this.f311625V0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == 2) {
                    this.f311627W0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == 16) {
                    this.f311656p0 = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 15) {
                    this.f311670x0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 23) {
                    this.f311608J = obtainStyledAttributes.getString(index);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r1.f311635d1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo148998m(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.f311618S
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.f311624V
            if (r0 == 0) goto L_0x0009
            return r2
        L_0x0009:
            int r0 = r1.f311637e1
            if (r2 >= r0) goto L_0x000f
        L_0x000d:
            r2 = r0
            goto L_0x0014
        L_0x000f:
            int r0 = r1.f311635d1
            if (r2 <= r0) goto L_0x0014
            goto L_0x000d
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.picker.YANumberPicker.mo148998m(int):int");
    }

    /* renamed from: n */
    public final void mo148999n(int i) {
        if (this.f311631a1 != i) {
            this.f311631a1 = i;
        }
    }

    /* renamed from: o */
    public void mo149000o(int i, int i2, boolean z) {
        if (i <= i2) {
            String[] strArr = this.f311623U0;
            if (strArr == null) {
                throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
            } else if (i >= 0) {
                boolean z2 = true;
                if (i > strArr.length - 1) {
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f311623U0.length - 1) + " minShowIndex is " + i);
                } else if (i2 < 0) {
                    throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
                } else if (i2 <= strArr.length - 1) {
                    this.f311669x = i;
                    this.f311671y = i2;
                    if (z) {
                        this.f311604F = i + 0;
                        if (!this.f311618S || !this.f311624V) {
                            z2 = false;
                        }
                        mo148977c(0, z2);
                        postInvalidate();
                    }
                } else {
                    throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f311623U0.length - 1) + " maxShowIndex is " + i2);
                }
            } else {
                throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
            }
        } else {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f311628X0 == null) {
            this.f311628X0 = new C104946a(this, "HandlerThread-For-Refreshing");
            this.f311629Y0 = new C111615o(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f311628X0.quit();
        this.f311629Y0 = null;
        if (this.f311649l1 != 0) {
            if (!this.f311672y0.mo145037c()) {
                this.f311672y0.mo145035a();
                this.f311661r1 = this.f311672y0.mo145036b();
                mo148976b();
                int i = this.f311659q1;
                if (i != 0) {
                    int i2 = this.f311649l1;
                    if (i < (-i2) / 2) {
                        this.f311661r1 = this.f311661r1 + i2 + i;
                    } else {
                        this.f311661r1 += i;
                    }
                    mo148976b();
                }
                mo148999n(0);
            }
            int j = mo148995j(this.f311661r1);
            int i3 = this.f311604F;
            if (j != i3 && this.f311656p0) {
                try {
                    C104943b bVar = this.f311630Z0;
                    if (bVar != null) {
                        int i4 = this.f311673z;
                        ((AppBrandMultiOptionsPicker.C104940a) bVar).mo148972a(this, i3 + i4, i4 + j);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.YANumberPicker", e, "", new Object[0]);
                }
            }
            this.f311604F = j;
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        super.onDraw(canvas);
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f311668w + 1) {
                break;
            }
            float f5 = (float) (this.f311659q1 + (this.f311649l1 * i2));
            int i3 = this.f311657p1 + i2;
            int oneRecycleSize = getOneRecycleSize();
            if (!this.f311618S || !this.f311624V) {
                z = false;
            }
            if (oneRecycleSize <= 0) {
                i3 = 0;
            } else if (z && (i3 = i3 % oneRecycleSize) < 0) {
                i3 += oneRecycleSize;
            }
            int i4 = this.f311668w / 2;
            if (i2 == i4) {
                int i5 = this.f311649l1;
                f3 = ((float) (this.f311659q1 + i5)) / ((float) i5);
                i = mo148980e(f3, this.f311634d, this.f311636e);
                float f6 = (float) this.f311640g;
                f2 = f6 + ((((float) this.f311642h) - f6) * f3);
                float f7 = this.f311612N;
                f = f7 + ((this.f311613P - f7) * f3);
            } else if (i2 == i4 + 1) {
                float f8 = 1.0f - f4;
                int e = mo148980e(f8, this.f311634d, this.f311636e);
                float f9 = (float) this.f311640g;
                float f15 = f9 + ((((float) this.f311642h) - f9) * f8);
                float f16 = this.f311612N;
                float f17 = f16 + ((this.f311613P - f16) * f8);
                f3 = f4;
                i = e;
                f2 = f15;
                f = f17;
            } else {
                int i6 = this.f311634d;
                f2 = (float) this.f311640g;
                f = this.f311612N;
                int i7 = i6;
                f3 = f4;
                i = i7;
            }
            this.f311619S0.setColor(i);
            this.f311619S0.setTextSize(f2);
            if (i3 >= 0 && i3 < getOneRecycleSize()) {
                CharSequence charSequence = this.f311623U0[i3 + this.f311669x];
                if (this.f311608J != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f311619S0, (float) (getWidth() - (this.f311660r * 2)), getEllipsizeType());
                }
                canvas.drawText(charSequence.toString(), this.f311654o1, f5 + ((float) (this.f311649l1 / 2)) + f, this.f311619S0);
            } else if (!TextUtils.isEmpty(this.f311609K)) {
                canvas.drawText(this.f311609K, this.f311654o1, f5 + ((float) (this.f311649l1 / 2)) + f, this.f311619S0);
            }
            i2++;
            f4 = f3;
        }
        if (this.f311616R) {
            canvas.drawLine((float) (getPaddingLeft() + this.f311666u), this.f311650m1, (float) ((this.f311647j1 - getPaddingRight()) - this.f311667v), this.f311650m1, this.f311617R0);
            canvas.drawLine((float) (getPaddingLeft() + this.f311666u), this.f311652n1, (float) ((this.f311647j1 - getPaddingRight()) - this.f311667v), this.f311652n1, this.f311617R0);
        }
        if (!TextUtils.isEmpty(this.f311607I)) {
            canvas.drawText(this.f311607I, this.f311654o1 + ((float) ((this.f311600B + this.f311646j) / 2)) + ((float) this.f311653o), ((this.f311650m1 + this.f311652n1) / 2.0f) + this.f311614Q, this.f311621T0);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = 0;
        mo149009r(false);
        int mode = View.MeasureSpec.getMode(i);
        this.f311663s1 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i4 = Math.max(this.f311646j, this.f311651n) == 0 ? 0 : this.f311655p;
            if (Math.max(this.f311646j, this.f311651n) != 0) {
                i3 = this.f311653o;
            }
            int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f311602D, Math.max(this.f311600B, this.f311603E) + ((i3 + Math.max(this.f311646j, this.f311651n) + i4 + (this.f311660r * 2)) * 2));
            size = mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f311665t1 = mode2;
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f311668w * (this.f311601C + (this.f311658q * 2)));
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            r2.f311647j1 = r3
            r2.f311648k1 = r4
            int r5 = r2.f311668w
            int r4 = r4 / r5
            r2.f311649l1 = r4
            int r4 = r2.getPaddingLeft()
            int r3 = r3 + r4
            int r4 = r2.getPaddingRight()
            int r3 = r3 - r4
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            r2.f311654o1 = r3
            int r3 = r2.getOneRecycleSize()
            r4 = 1
            r5 = 0
            if (r3 <= r4) goto L_0x003d
            boolean r3 = r2.f311622U
            if (r3 == 0) goto L_0x0030
            int r3 = r2.getValue()
            int r6 = r2.f311673z
            int r3 = r3 - r6
            goto L_0x003e
        L_0x0030:
            boolean r3 = r2.f311620T
            if (r3 == 0) goto L_0x003d
            int r3 = r2.f311657p1
            int r6 = r2.f311668w
            int r6 = r6 - r4
            int r6 = r6 / 2
            int r3 = r3 + r6
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            boolean r6 = r2.f311618S
            if (r6 == 0) goto L_0x0048
            boolean r6 = r2.f311624V
            if (r6 == 0) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r2.mo148977c(r3, r6)
            int r3 = r2.f311640g
            int r6 = r2.f311649l1
            if (r3 <= r6) goto L_0x0054
            r2.f311640g = r6
        L_0x0054:
            int r3 = r2.f311642h
            if (r3 <= r6) goto L_0x005a
            r2.f311642h = r6
        L_0x005a:
            android.graphics.Paint r3 = r2.f311621T0
            if (r3 == 0) goto L_0x0116
            int r6 = r2.f311644i
            float r6 = (float) r6
            r3.setTextSize(r6)
            android.graphics.Paint r3 = r2.f311621T0
            android.graphics.Paint$FontMetrics r3 = r3.getFontMetrics()
            float r3 = r2.mo148993h(r3)
            r2.f311614Q = r3
            java.lang.String r3 = r2.f311607I
            android.graphics.Paint r6 = r2.f311621T0
            int r3 = r2.mo148994i(r3, r6)
            r2.f311646j = r3
            android.text.TextPaint r3 = r2.f311619S0
            if (r3 == 0) goto L_0x010e
            int r6 = r2.f311642h
            float r6 = (float) r6
            r3.setTextSize(r6)
            android.text.TextPaint r3 = r2.f311619S0
            android.graphics.Paint$FontMetrics r3 = r3.getFontMetrics()
            float r3 = r2.mo148993h(r3)
            r2.f311613P = r3
            android.text.TextPaint r3 = r2.f311619S0
            int r6 = r2.f311640g
            float r6 = (float) r6
            r3.setTextSize(r6)
            android.text.TextPaint r3 = r2.f311619S0
            android.graphics.Paint$FontMetrics r3 = r3.getFontMetrics()
            float r3 = r2.mo148993h(r3)
            r2.f311612N = r3
            r2.mo149010s()
            int r3 = r2.f311668w
            int r6 = r3 / 2
            int r0 = r6 + 1
            int r1 = r2.f311648k1
            int r6 = r6 * r1
            int r6 = r6 / r3
            float r6 = (float) r6
            r2.f311650m1 = r6
            int r0 = r0 * r1
            int r0 = r0 / r3
            float r3 = (float) r0
            r2.f311652n1 = r3
            int r3 = r2.f311666u
            if (r3 >= 0) goto L_0x00c1
            r2.f311666u = r5
        L_0x00c1:
            int r3 = r2.f311667v
            if (r3 >= 0) goto L_0x00c7
            r2.f311667v = r5
        L_0x00c7:
            int r3 = r2.f311666u
            int r5 = r2.f311667v
            int r3 = r3 + r5
            if (r3 != 0) goto L_0x00cf
            goto L_0x010b
        L_0x00cf:
            int r3 = r2.getPaddingLeft()
            int r5 = r2.f311666u
            int r3 = r3 + r5
            int r5 = r2.f311647j1
            int r6 = r2.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r2.f311667v
            int r5 = r5 - r6
            if (r3 < r5) goto L_0x010b
            int r3 = r2.getPaddingLeft()
            int r5 = r2.f311666u
            int r3 = r3 + r5
            int r5 = r2.getPaddingRight()
            int r3 = r3 + r5
            int r5 = r2.f311667v
            int r3 = r3 + r5
            int r6 = r2.f311647j1
            int r3 = r3 - r6
            int r6 = r2.f311666u
            float r0 = (float) r6
            float r3 = (float) r3
            float r1 = r0 * r3
            int r6 = r6 + r5
            float r6 = (float) r6
            float r1 = r1 / r6
            float r0 = r0 - r1
            int r6 = (int) r0
            r2.f311666u = r6
            float r0 = (float) r5
            float r3 = r3 * r0
            int r6 = r6 + r5
            float r5 = (float) r6
            float r3 = r3 / r5
            float r0 = r0 - r3
            int r3 = (int) r0
            r2.f311667v = r3
        L_0x010b:
            r2.f311622U = r4
            return
        L_0x010e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "mPaintText should not be null."
            r3.<init>(r4)
            throw r3
        L_0x0116:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "mPaintHint should not be null."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.picker.YANumberPicker.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r1 < ((float) r3)) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r1 = getPickedIndexRelativeToRaw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r3 < 0) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f311649l1
            r2 = 1
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.view.VelocityTracker r1 = r0.f311615Q0
            if (r1 != 0) goto L_0x0012
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f311615Q0 = r1
        L_0x0012:
            android.view.VelocityTracker r1 = r0.f311615Q0
            r3 = r19
            r1.addMovement(r3)
            float r1 = r19.getY()
            r0.f311643h1 = r1
            int r1 = r19.getAction()
            r4 = 0
            if (r1 == 0) goto L_0x0159
            r5 = 0
            r7 = 2
            r8 = 0
            if (r1 == r2) goto L_0x0074
            if (r1 == r7) goto L_0x0046
            r3 = 3
            if (r1 == r3) goto L_0x0033
            goto L_0x0176
        L_0x0033:
            int r1 = r0.f311661r1
            float r1 = (float) r1
            r0.f311639f1 = r1
            r18.mo149008q()
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f311628X0
            android.os.Message r3 = r0.mo148982g(r2, r4, r4, r8)
            r1.sendMessageDelayed(r3, r5)
            goto L_0x0176
        L_0x0046:
            float r1 = r0.f311641g1
            float r3 = r0.f311643h1
            float r1 = r1 - r3
            boolean r3 = r0.f311645i1
            if (r3 == 0) goto L_0x005d
            int r3 = r0.f311606H
            int r5 = -r3
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x005d
            float r3 = (float) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x005d
            goto L_0x006f
        L_0x005d:
            r0.f311645i1 = r4
            float r3 = r0.f311639f1
            float r3 = r3 + r1
            int r1 = (int) r3
            int r1 = r0.mo148998m(r1)
            r0.f311661r1 = r1
            r18.mo148976b()
            r18.invalidate()
        L_0x006f:
            r0.mo148999n(r2)
            goto L_0x0176
        L_0x0074:
            boolean r1 = r0.f311645i1
            if (r1 == 0) goto L_0x0105
            float r1 = r19.getY()
            r3 = 0
        L_0x007d:
            int r5 = r0.f311668w
            if (r3 >= r5) goto L_0x0176
            int r6 = r0.f311649l1
            int r9 = r6 * r3
            float r9 = (float) r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L_0x0101
            int r9 = r3 + 1
            int r6 = r6 * r9
            float r6 = (float) r6
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0101
            if (r3 < 0) goto L_0x0176
            if (r3 >= r5) goto L_0x0176
            int r5 = r5 / r7
            int r3 = r3 - r5
            boolean r1 = r0.f311618S
            if (r1 == 0) goto L_0x00a1
            boolean r1 = r0.f311624V
            if (r1 != 0) goto L_0x00b2
        L_0x00a1:
            int r1 = r18.getPickedIndexRelativeToRaw()
            int r5 = r1 + r3
            int r6 = r0.f311671y
            if (r5 <= r6) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            int r6 = r0.f311669x
            if (r5 >= r6) goto L_0x00b2
        L_0x00b0:
            int r3 = r6 - r1
        L_0x00b2:
            int r1 = r0.f311659q1
            int r5 = r0.f311649l1
            int r6 = -r5
            int r6 = r6 / r7
            r7 = 1133903872(0x43960000, float:300.0)
            if (r1 >= r6) goto L_0x00c7
            int r1 = r1 + r5
            float r6 = (float) r1
            float r6 = r6 * r7
            float r7 = (float) r5
            float r6 = r6 / r7
            int r6 = (int) r6
            if (r3 >= 0) goto L_0x00d4
            int r6 = -r6
            goto L_0x00d0
        L_0x00c7:
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r7 = (float) r5
            float r6 = r6 / r7
            int r6 = (int) r6
            if (r3 >= 0) goto L_0x00d4
        L_0x00d0:
            int r7 = r3 * 300
            int r6 = r6 - r7
            goto L_0x00d7
        L_0x00d4:
            int r7 = r3 * 300
            int r6 = r6 + r7
        L_0x00d7:
            int r3 = r3 * r5
            int r13 = r1 + r3
            r1 = 300(0x12c, float:4.2E-43)
            if (r6 >= r1) goto L_0x00e1
            r6 = 300(0x12c, float:4.2E-43)
        L_0x00e1:
            r1 = 600(0x258, float:8.41E-43)
            if (r6 <= r1) goto L_0x00e7
            r6 = 600(0x258, float:8.41E-43)
        L_0x00e7:
            androidx.core.widget.g r9 = r0.f311672y0
            r10 = 0
            int r11 = r0.f311661r1
            r12 = 0
            r14 = r6
            r9.mo145038d(r10, r11, r12, r13, r14)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f311628X0
            android.os.Message r3 = r0.mo148982g(r2, r4, r4, r8)
            int r6 = r6 / 4
            long r4 = (long) r6
            r1.sendMessageDelayed(r3, r4)
            r18.postInvalidate()
            goto L_0x0176
        L_0x0101:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x0105:
            android.view.VelocityTracker r1 = r0.f311615Q0
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r1 = r1.getYVelocity()
            float r3 = r0.f311611M
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r9 = r0.f311605G
            if (r3 <= r9) goto L_0x0141
            androidx.core.widget.g r3 = r0.f311672y0
            r10 = 0
            int r11 = r0.f311661r1
            r12 = 0
            int r13 = -r1
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r16 = r0.mo148998m(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r17 = r0.mo148998m(r1)
            android.widget.OverScroller r9 = r3.f306426a
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r18.invalidate()
            r0.mo148999n(r7)
        L_0x0141:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f311628X0
            android.os.Message r3 = r0.mo148982g(r2, r4, r4, r8)
            r1.sendMessageDelayed(r3, r5)
            android.view.VelocityTracker r1 = r0.f311615Q0
            if (r1 == 0) goto L_0x0176
            r1.clear()
            android.view.VelocityTracker r1 = r0.f311615Q0
            r1.recycle()
            r0.f311615Q0 = r8
            goto L_0x0176
        L_0x0159:
            r0.f311645i1 = r2
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f311628X0
            r1.removeMessages(r2)
            r18.mo149008q()
            float r1 = r0.f311643h1
            r0.f311641g1 = r1
            int r1 = r0.f311661r1
            float r1 = (float) r1
            r0.f311639f1 = r1
            r0.mo148999n(r4)
            android.view.ViewParent r1 = r18.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x0176:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.picker.YANumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final int mo149006p(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void postInvalidate() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this)) {
            super.postInvalidate();
        }
    }

    /* renamed from: q */
    public void mo149008q() {
        C103732g gVar = this.f311672y0;
        if (gVar != null && !gVar.mo145037c()) {
            C103732g gVar2 = this.f311672y0;
            gVar2.mo145038d(0, gVar2.mo145036b(), 0, 0, 1);
            this.f311672y0.mo145035a();
            postInvalidate();
        }
    }

    /* renamed from: r */
    public final void mo149009r(boolean z) {
        float textSize = this.f311619S0.getTextSize();
        this.f311619S0.setTextSize((float) this.f311642h);
        this.f311600B = mo148981f(this.f311623U0, this.f311619S0);
        this.f311602D = mo148981f(this.f311625V0, this.f311619S0);
        this.f311603E = mo148981f(this.f311627W0, this.f311619S0);
        this.f311619S0.setTextSize((float) this.f311644i);
        this.f311651n = mo148994i(this.f311610L, this.f311619S0);
        this.f311619S0.setTextSize(textSize);
        float textSize2 = this.f311619S0.getTextSize();
        this.f311619S0.setTextSize((float) this.f311642h);
        this.f311601C = (int) (((double) (this.f311619S0.getFontMetrics().bottom - this.f311619S0.getFontMetrics().top)) + 0.5d);
        this.f311619S0.setTextSize(textSize2);
        if (!z) {
            return;
        }
        if (this.f311663s1 == Integer.MIN_VALUE || this.f311665t1 == Integer.MIN_VALUE) {
            this.f311629Y0.sendEmptyMessage(3);
        }
    }

    /* renamed from: s */
    public final void mo149010s() {
        this.f311635d1 = 0;
        this.f311637e1 = (-this.f311668w) * this.f311649l1;
        if (this.f311623U0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f311668w;
            int i2 = this.f311649l1;
            this.f311635d1 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f311637e1 = (-(i / 2)) * i2;
        }
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f311619S0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        MMHandler mMHandler = this.f311628X0;
        boolean z = true;
        if (mMHandler != null) {
            mMHandler.removeMessages(1);
        }
        mo149008q();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        } else if ((this.f311599A - this.f311673z) + 1 <= strArr.length) {
            this.f311623U0 = strArr;
            this.f311624V = strArr.length > this.f311668w;
            mo149009r(true);
            this.f311604F = this.f311669x + 0;
            if (!this.f311618S || !this.f311624V) {
                z = false;
            }
            mo148977c(0, z);
            postInvalidate();
            this.f311629Y0.sendEmptyMessage(3);
        } else {
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f311599A - this.f311673z) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
    }

    public void setDividerColor(int i) {
        if (this.f311662s != i) {
            this.f311662s = i;
            this.f311617R0.setColor(i);
            postInvalidate();
        }
    }

    public void setDividerHeight(int i) {
        if (i != this.f311664t) {
            this.f311664t = i;
            this.f311617R0.setStrokeWidth((float) i);
            postInvalidate();
        }
    }

    public void setEllipsizeType(String str) {
        String[] strArr = {"end", "middle", IXWebBroadcastListener.STAGE_START};
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(str)) {
                this.f311608J = str;
                return;
            }
        }
        this.f311608J = "end";
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            ViewConfiguration.get(getContext());
            this.f311611M = ViewConfiguration.getScrollFriction() / f;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
    }

    public void setHintText(String str) {
        String str2 = this.f311607I;
        if (!(str2 == null ? str == null : str2.equals(str))) {
            this.f311607I = str;
            this.f311614Q = mo148993h(this.f311621T0.getFontMetrics());
            this.f311646j = mo148994i(this.f311607I, this.f311621T0);
            this.f311629Y0.sendEmptyMessage(3);
        }
    }

    public void setHintTextColor(int i) {
        if (this.f311638f != i) {
            this.f311638f = i;
            this.f311621T0.setColor(i);
            postInvalidate();
        }
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f311621T0.setTypeface(typeface);
    }

    public void setItemPaddingVertical(int i) {
        if (this.f311658q != i) {
            this.f311658q = i;
            postInvalidate();
        }
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f311623U0;
        if (strArr != null) {
            int i2 = this.f311673z;
            if ((i - i2) + 1 <= strArr.length) {
                this.f311599A = i;
                int i3 = this.f311669x;
                int i4 = (i - i2) + i3;
                this.f311671y = i4;
                mo149000o(i3, i4, true);
                mo149010s();
                return;
            }
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f311673z) + 1) + " and mDisplayedValues.length is " + this.f311623U0.length);
        }
        throw new NullPointerException("mDisplayedValues should not be null");
    }

    public void setMinValue(int i) {
        this.f311673z = i;
        this.f311669x = 0;
        mo149010s();
    }

    public void setNormalTextColor(int i) {
        if (this.f311634d != i) {
            this.f311634d = i;
            postInvalidate();
        }
    }

    public void setOnScrollListener(C104942a aVar) {
    }

    public void setOnValueChangeListenerInScrolling(C104944c cVar) {
    }

    public void setOnValueChangedListener(C104943b bVar) {
        this.f311630Z0 = bVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(C104945d dVar) {
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i >= 0 && i < getOneRecycleSize()) {
            this.f311604F = this.f311669x + i;
            mo148977c(i, this.f311618S && this.f311624V);
            postInvalidate();
        }
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.f311669x;
        if (i2 > -1 && i2 <= i && i <= this.f311671y) {
            this.f311604F = i;
            mo148977c(i - i2, this.f311618S && this.f311624V);
            postInvalidate();
        }
    }

    public void setSelectedTextColor(int i) {
        if (this.f311636e != i) {
            this.f311636e = i;
            postInvalidate();
        }
    }

    public void setValue(int i) {
        int i2 = this.f311673z;
        if (i < i2) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
        } else if (i <= this.f311599A) {
            setPickedIndexRelativeToRaw(i - i2);
        } else {
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
        }
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f311618S != z) {
            boolean z2 = false;
            if (z) {
                this.f311618S = z;
                if (this.f311623U0.length > this.f311668w) {
                    z2 = true;
                }
                this.f311624V = z2;
                postInvalidate();
            } else if (this.f311631a1 == 0) {
                mo148977c(getPickedIndexRelativeToRaw() - this.f311669x, false);
                this.f311618S = false;
                postInvalidate();
            } else {
                this.f311626W = true;
            }
        }
    }

    public YANumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148997l(context, attributeSet);
        mo148996k(context);
    }

    public YANumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo148997l(context, attributeSet);
        mo148996k(context);
    }
}
