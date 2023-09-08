package p419td;

import android.graphics.Typeface;
import android.os.Build;
import java.util.HashMap;
import p419td.C26308j;
import p748xd.C91176h;

/* renamed from: td.f */
public class C26302f {

    /* renamed from: a */
    public HashMap<String, Typeface> f73264a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Integer> f73265b = new C26303a(this);

    /* renamed from: c */
    public C26296b f73266c;

    /* renamed from: td.f$a */
    public class C26303a extends HashMap<String, Integer> {
        public C26303a(C26302f fVar) {
            put("lighter", 100);
            put("normal", 400);
            put("bold", 700);
            put("bolder", 700);
            put("100", 100);
            put("200", 200);
            put("300", 300);
            put("400", 400);
            put("500", 500);
            put("600", 600);
            put("700", 700);
            put("800", 800);
            put("900", 900);
        }
    }

    public C26302f(C26296b bVar) {
        this.f73266c = bVar;
    }

    /* renamed from: a */
    public Typeface mo53176a(String str, C26308j.C26309a aVar, String str2) {
        if (aVar == null) {
            aVar = C26308j.C26309a.NORMAL;
        }
        if (C91176h.m114416a(str2) && Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.create(str, aVar.f73302d), (!C91176h.m114416a(str2) && this.f73265b.containsKey(str2)) ? this.f73265b.get(str2).intValue() : 400, aVar == C26308j.C26309a.ITALIC || aVar == C26308j.C26309a.BOLD_ITALIC);
        } else if (str == null || str.length() == 0) {
            return Typeface.create((String) null, aVar.f73302d);
        } else {
            Typeface typeface = this.f73264a.get(str);
            if (typeface == null) {
                return Typeface.create(str, aVar.f73302d);
            }
            int style = typeface.getStyle();
            int i = aVar.f73302d;
            return style != i ? Typeface.create(typeface, i) : typeface;
        }
    }
}
