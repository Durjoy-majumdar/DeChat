package w21;

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
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.ref.WeakReference;
import p21.C100616a;
import p21.C100628m;
import p385u2.C111105a;
import s21.C101498c;
import u21.C101941c;

/* renamed from: w21.s */
public class C102322s implements LeadingMarginSpan, C102310h<Boolean>, C102309g<Boolean> {

    /* renamed from: d */
    public boolean f301355d = false;

    /* renamed from: e */
    public boolean f301356e = false;

    /* renamed from: f */
    public boolean f301357f = false;

    /* renamed from: g */
    public int f301358g;

    /* renamed from: h */
    public boolean f301359h;

    /* renamed from: i */
    public boolean f301360i = false;

    /* renamed from: j */
    public WeakReference<Drawable> f301361j;

    public C102322s(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.f301358g = i;
        if (z2 && z4 && !z3) {
            z5 = true;
        }
        this.f301359h = z5;
        this.f301360i = z;
        this.f301355d = z3;
        this.f301356e = z4;
        this.f301357f = z2;
    }

    /* renamed from: a */
    public C102309g mo127577a() {
        return new C102322s(this.f301360i, this.f301358g, this.f301357f, this.f301355d, this.f301356e);
    }

    /* renamed from: b */
    public void mo141870b(TextView textView, Spannable spannable, MotionEvent motionEvent, C102322s sVar) {
        C100616a l;
        if (motionEvent.getX() > ((float) this.f301358g)) {
            Log.m105920e("MicroMsg.TodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(sVar);
        int spanEnd = spannable.getSpanEnd(sVar);
        Object[] objArr = new Object[1];
        objArr[0] = this.f301360i ? "true" : "false";
        Log.m105925i("MicroMsg.TodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z = !this.f301360i;
        this.f301360i = z;
        spannable.setSpan(new C102322s(z, this.f301358g, this.f301357f, this.f301355d, this.f301356e), spanStart, spanEnd, 33);
        WXRTEditText wXRTEditText = (WXRTEditText) textView;
        if (wXRTEditText.getEditTextType() == 0 && (l = C101941c.m134173q().mo141456l(wXRTEditText.getRecyclerItemPosition())) != null && l.mo140076b() == 1) {
            ((C100628m) l).f294819s = C101498c.m133261a(spannable);
        }
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Drawable b;
        Spanned spanned = (Spanned) charSequence;
        if (!this.f301359h && spanned.getSpanStart(this) == i6) {
            WeakReference<Drawable> weakReference = this.f301361j;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable == null) {
                if (this.f301360i) {
                    Context context = MMApplicationContext.getContext();
                    Object obj = C111105a.f332697a;
                    b = C111105a.C111110c.m151511b(context, C0966R.C0969drawable.bzw);
                } else {
                    Context context2 = MMApplicationContext.getContext();
                    Object obj2 = C111105a.f332697a;
                    b = C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.bzx);
                }
                this.f301361j = new WeakReference<>(drawable);
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
        if (this.f301359h) {
            return 0;
        }
        return this.f301358g;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }
}
