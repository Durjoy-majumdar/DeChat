package p1145q8;

import android.graphics.Typeface;
import android.text.TextPaint;
import p1050v2.C111325g;

/* renamed from: q8.b */
public class C110369b extends C111325g.C111328d {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f330124a;

    /* renamed from: b */
    public final /* synthetic */ C111325g.C111328d f330125b;

    /* renamed from: c */
    public final /* synthetic */ C110370c f330126c;

    public C110369b(C110370c cVar, TextPaint textPaint, C111325g.C111328d dVar) {
        this.f330126c = cVar;
        this.f330124a = textPaint;
        this.f330125b = dVar;
    }

    /* renamed from: c */
    public void mo144403c(int i) {
        this.f330126c.mo161877a();
        this.f330126c.f330137k = true;
        this.f330125b.mo144403c(i);
    }

    /* renamed from: d */
    public void mo144404d(Typeface typeface) {
        C110370c cVar = this.f330126c;
        cVar.f330138l = Typeface.create(typeface, cVar.f330129c);
        this.f330126c.mo161880d(this.f330124a, typeface);
        this.f330126c.f330137k = true;
        this.f330125b.mo144404d(typeface);
    }
}
