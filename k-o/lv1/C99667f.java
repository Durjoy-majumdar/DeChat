package lv1;

import android.text.TextPaint;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lv1.C99672i;

/* renamed from: lv1.f */
public class C99667f {

    /* renamed from: a */
    public CharSequence f292088a;

    /* renamed from: b */
    public C99672i f292089b;

    /* renamed from: c */
    public boolean f292090c;

    /* renamed from: d */
    public boolean f292091d;

    /* renamed from: e */
    public C99668a f292092e = C99668a.Foreground;

    /* renamed from: f */
    public int f292093f = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2939n);

    /* renamed from: g */
    public float f292094g;

    /* renamed from: h */
    public TextPaint f292095h;

    /* renamed from: i */
    public CharSequence f292096i = "";

    /* renamed from: j */
    public CharSequence f292097j = "";

    /* renamed from: k */
    public String f292098k = "";

    /* renamed from: l */
    public String f292099l = "";

    /* renamed from: lv1.f$a */
    public enum C99668a {
        Foreground,
        Background,
        CustomTag
    }

    /* renamed from: lv1.f$b */
    public static class C99669b implements Comparable<C99669b> {

        /* renamed from: d */
        public C99672i.C99676d f292104d;

        /* renamed from: e */
        public int f292105e = -1;

        /* renamed from: f */
        public int f292106f = -1;

        /* renamed from: a */
        public boolean mo139041a() {
            return (this.f292105e == -1 || this.f292106f == -1) ? false : true;
        }

        public int compareTo(Object obj) {
            return this.f292105e - ((C99669b) obj).f292105e;
        }

        public String toString() {
            Object[] objArr = new Object[3];
            C99672i.C99676d dVar = this.f292104d;
            objArr[0] = dVar == null ? "" : dVar.mo139045a().replaceAll("​", ",");
            objArr[1] = Integer.valueOf(this.f292105e);
            objArr[2] = Integer.valueOf(this.f292106f);
            return String.format("FTSQueryHLRequest.Item %s %d %d", objArr);
        }
    }

    /* renamed from: a */
    public static final C99667f m130088a(CharSequence charSequence, String str, boolean z, boolean z2) {
        C99667f fVar = new C99667f();
        fVar.f292088a = charSequence;
        fVar.f292089b = C99672i.m130094a(str, false);
        fVar.f292090c = z;
        fVar.f292091d = z2;
        return fVar;
    }

    /* renamed from: b */
    public static final C99667f m130089b(CharSequence charSequence, C99672i iVar) {
        C99667f fVar = new C99667f();
        fVar.f292088a = charSequence;
        fVar.f292089b = iVar;
        return fVar;
    }

    /* renamed from: c */
    public static final C99667f m130090c(CharSequence charSequence, C99672i iVar, float f, TextPaint textPaint) {
        return m130092e(charSequence, iVar, false, false, f, textPaint);
    }

    /* renamed from: d */
    public static final C99667f m130091d(CharSequence charSequence, C99672i iVar, boolean z, boolean z2) {
        return m130092e(charSequence, iVar, z, z2, 0.0f, (TextPaint) null);
    }

    /* renamed from: e */
    public static final C99667f m130092e(CharSequence charSequence, C99672i iVar, boolean z, boolean z2, float f, TextPaint textPaint) {
        C99667f fVar = new C99667f();
        fVar.f292088a = charSequence;
        fVar.f292089b = iVar;
        fVar.f292090c = z;
        fVar.f292091d = z2;
        fVar.f292094g = f;
        fVar.f292095h = textPaint;
        return fVar;
    }
}
