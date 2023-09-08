package p464ck;

import android.graphics.Canvas;
import android.text.TextPaint;
import p001ak.C54053a;
import p006bk.C54479b;
import p006bk.C54486i;
import p850ek.C58610a;
import p850ek.C58613d;

/* renamed from: ck.e */
public class C54868e extends C54866a {

    /* renamed from: a */
    public TextPaint f153798a = new TextPaint();

    /* renamed from: a */
    public boolean mo75810a(C54053a aVar) {
        return true;
    }

    /* renamed from: b */
    public C58610a mo75811b(C54053a aVar) {
        C54486i c = C54479b.m61196c();
        float f = c.f152765l;
        String valueOf = String.valueOf(aVar.f151367x);
        TextPaint textPaint = C58613d.f167816a;
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(valueOf);
        float f2 = c.f152768o;
        float f3 = measureText + f2 + f2;
        float a = C58613d.m68063a(c.f152765l) + (c.f152767n * 2.0f);
        aVar.f151364u = a;
        aVar.f151363t = f3;
        return new C58610a(f3, a);
    }

    /* renamed from: c */
    public void mo75812c(Canvas canvas, C54053a aVar, C54479b bVar, float f, float f2) {
        C54486i c = C54479b.m61196c();
        this.f153798a.setTextSize(c.f152765l);
        this.f153798a.setColor(-1);
        canvas.drawText(String.valueOf(aVar.f151367x), f + c.f152768o, (f2 + c.f152767n) - this.f153798a.ascent(), this.f153798a);
    }
}
