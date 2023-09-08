package p419td;

import android.graphics.Typeface;

/* renamed from: td.j */
public class C26308j {

    /* renamed from: a */
    public Typeface f73291a;

    /* renamed from: b */
    public String f73292b;

    /* renamed from: c */
    public float f73293c;

    /* renamed from: d */
    public boolean f73294d;

    /* renamed from: e */
    public float f73295e;

    /* renamed from: f */
    public C26309a f73296f;

    /* renamed from: td.j$a */
    public enum C26309a {
        NORMAL(0),
        BOLD(1),
        ITALIC(2),
        BOLD_ITALIC(3);
        

        /* renamed from: d */
        public int f73302d;

        /* access modifiers changed from: public */
        C26309a(int i) {
            this.f73302d = i;
        }
    }

    public C26308j(Typeface typeface, String str, float f, boolean z, float f2, C26309a aVar) {
        this.f73291a = typeface;
        this.f73292b = str;
        this.f73293c = f;
        this.f73294d = z;
        this.f73295e = f2;
        this.f73296f = aVar;
    }

    public String toString() {
        return "MBFontStyle[" + this.f73292b + "][" + this.f73293c + "][" + this.f73295e + "]";
    }
}
