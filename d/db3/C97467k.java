package db3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.ref.WeakReference;
import p385u2.C111105a;
import xa3.C102587c;
import xa3.C102593i;
import za3.C102990c;

/* renamed from: db3.k */
public class C97467k implements LeadingMarginSpan, C97463g<Boolean>, C97462f<Boolean> {

    /* renamed from: d */
    public boolean f286072d = false;

    /* renamed from: e */
    public boolean f286073e = false;

    /* renamed from: f */
    public boolean f286074f = false;

    /* renamed from: g */
    public int f286075g;

    /* renamed from: h */
    public boolean f286076h;

    /* renamed from: i */
    public boolean f286077i = false;

    /* renamed from: j */
    public WeakReference<Drawable> f286078j;

    public C97467k(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.f286075g = i;
        if (z2 && z4 && !z3) {
            z5 = true;
        }
        this.f286076h = z5;
        this.f286077i = z;
        this.f286072d = z3;
        this.f286073e = z4;
        this.f286074f = z2;
    }

    /* renamed from: a */
    public C97462f mo134917a() {
        return new C97467k(this.f286077i, this.f286075g, this.f286074f, this.f286072d, this.f286073e);
    }

    /* renamed from: b */
    public void mo136730b(TextView textView, Spannable spannable, MotionEvent motionEvent, C97467k kVar) {
        C102587c k;
        if (motionEvent.getX() > ((float) this.f286075g)) {
            Log.m105920e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(kVar);
        int spanEnd = spannable.getSpanEnd(kVar);
        Object[] objArr = new Object[1];
        objArr[0] = this.f286077i ? "true" : "false";
        Log.m105925i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z = !this.f286077i;
        this.f286077i = z;
        spannable.setSpan(new C97467k(z, this.f286075g, this.f286074f, this.f286072d, this.f286073e), spanStart, spanEnd, 33);
        WXRTEditText wXRTEditText = (WXRTEditText) textView;
        if (wXRTEditText.getEditTextType() == 0 && (k = wXRTEditText.getRecyclerHolder().f289191A.mo126201k(wXRTEditText.getRecyclerItemPosition())) != null && k.mo142212c() == 1) {
            ((C102593i) k).f302126s = C102990c.m136185a(spannable);
        }
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Drawable b;
        Spanned spanned = (Spanned) charSequence;
        if (!this.f286076h && spanned.getSpanStart(this) == i6) {
            WeakReference<Drawable> weakReference = this.f286078j;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable == null) {
                if (this.f286077i) {
                    Context context = MMApplicationContext.getContext();
                    Object obj = C111105a.f332697a;
                    b = C111105a.C111110c.m151511b(context, C0966R.C0969drawable.c9h);
                } else {
                    Context context2 = MMApplicationContext.getContext();
                    Object obj2 = C111105a.f332697a;
                    b = C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.c9i);
                }
                this.f286078j = new WeakReference<>(drawable);
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                canvas.save();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                canvas.translate(0.0f, (float) (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    public int getLeadingMargin(boolean z) {
        if (this.f286076h) {
            return 0;
        }
        return this.f286075g;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }
}
