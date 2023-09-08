package cl0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import au0.C67107a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Objects;
import l40.C99337d;
import sn0.C90251c;

/* renamed from: cl0.a */
public class C80045a implements C90251c.C90255b {

    /* renamed from: i */
    public static final ThreadLocal<TextPaint> f234483i = new C80046a();

    /* renamed from: d */
    public final TextPaint f234484d;

    /* renamed from: e */
    public final Resources f234485e;

    /* renamed from: f */
    public final C99337d f234486f;

    /* renamed from: g */
    public CharSequence f234487g = "";

    /* renamed from: h */
    public C67107a f234488h;

    /* renamed from: cl0.a$a */
    public class C80046a extends ThreadLocal<TextPaint> {
        public Object get() {
            return new TextPaint(1);
        }
    }

    public C80045a(Resources resources, int i) {
        this.f234485e = resources;
        TextPaint textPaint = f234483i.get();
        Objects.requireNonNull(textPaint);
        TextPaint textPaint2 = textPaint;
        this.f234484d = textPaint;
        this.f234487g = "";
        C99337d c = C99337d.m129494c();
        c.f291271b = "";
        c.f291272c = 0;
        c.f291273d = "".length();
        c.f291274e = textPaint;
        c.f291275f = i;
        this.f234486f = c;
    }

    /* renamed from: a */
    public final void mo110302a() {
        if (this.f234488h == null) {
            C99337d dVar = this.f234486f;
            CharSequence charSequence = this.f234487g;
            if (charSequence == null) {
                dVar.getClass();
                return;
            }
            dVar.f291271b = charSequence;
            dVar.f291272c = 0;
            dVar.f291273d = charSequence.length();
            return;
        }
        SpannableString spannableString = new SpannableString(this.f234487g);
        spannableString.setSpan(this.f234488h, 0, spannableString.length(), 18);
        C99337d dVar2 = this.f234486f;
        dVar2.f291271b = spannableString;
        dVar2.f291272c = 0;
        dVar2.f291273d = spannableString.length();
    }

    public float getTextSize() {
        return this.f234484d.getTextSize();
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        C99337d dVar = this.f234486f;
        if (truncateAt != null) {
            dVar.f291278i = truncateAt;
        } else {
            dVar.getClass();
        }
    }

    public void setFakeBoldText(boolean z) {
        this.f234484d.setFakeBoldText(z);
    }

    public void setFontWeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f234484d.setTypeface(Typeface.create(Typeface.DEFAULT, i, false));
            return;
        }
        Log.m105920e("luggage.JsApiMeasureTextString", "not support setFontWeight");
    }

    public void setGravity(int i) {
        this.f234486f.f291277h = i;
    }

    public void setLineHeight(int i) {
        C67107a aVar = this.f234488h;
        if (aVar != null) {
            if (!(aVar.f192699d != Math.round((float) i))) {
                return;
            }
        }
        this.f234488h = new C67107a((float) i, 16);
        mo110302a();
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f234486f.f291280k = 1;
        } else {
            this.f234486f.f291280k = Integer.MAX_VALUE;
        }
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!charSequence.equals(this.f234487g)) {
            this.f234487g = charSequence;
            mo110302a();
        }
    }

    public void setTextColor(int i) {
        this.f234484d.setColor(i);
    }

    public void setTextSize(int i, float f) {
        this.f234484d.setTextSize(TypedValue.applyDimension(i, f, this.f234485e.getDisplayMetrics()));
    }
}
