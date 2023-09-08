package com.robinhood.ticker;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.ticker.C104497a;
import com.robinhood.ticker.TickerView;

/* renamed from: com.robinhood.ticker.b */
public class C104499b {

    /* renamed from: a */
    public final C104497a[] f309696a;

    /* renamed from: b */
    public final C104500c f309697b;

    /* renamed from: c */
    public char f309698c = 0;

    /* renamed from: d */
    public char f309699d = 0;

    /* renamed from: e */
    public char[] f309700e;

    /* renamed from: f */
    public int f309701f;

    /* renamed from: g */
    public int f309702g;

    /* renamed from: h */
    public int f309703h;

    /* renamed from: i */
    public float f309704i;

    /* renamed from: j */
    public float f309705j;

    /* renamed from: k */
    public float f309706k;

    /* renamed from: l */
    public float f309707l;

    /* renamed from: m */
    public float f309708m;

    /* renamed from: n */
    public float f309709n;

    /* renamed from: o */
    public float f309710o;

    /* renamed from: p */
    public float f309711p;

    /* renamed from: q */
    public int f309712q;

    public C104499b(C104497a[] aVarArr, C104500c cVar) {
        this.f309696a = aVarArr;
        this.f309697b = cVar;
    }

    /* renamed from: a */
    public final void mo147125a() {
        float a = this.f309697b.mo147128a(this.f309699d);
        float f = this.f309707l;
        float f2 = this.f309708m;
        if (f == f2 && f2 != a) {
            this.f309708m = a;
            this.f309707l = a;
            this.f309709n = a;
        }
    }

    /* renamed from: b */
    public final boolean mo147126b(Canvas canvas, Paint paint, char[] cArr, int i, float f) {
        if (i < 0 || i >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i, 1, 0.0f, f, paint);
        return true;
    }

    /* renamed from: c */
    public void mo147127c(char c) {
        int i;
        C104497a.C104498a aVar;
        this.f309699d = c;
        this.f309706k = this.f309707l;
        float a = this.f309697b.mo147128a(c);
        this.f309708m = a;
        this.f309709n = Math.max(this.f309706k, a);
        this.f309700e = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            C104497a[] aVarArr = this.f309696a;
            i = 1;
            if (i2 >= aVarArr.length) {
                break;
            }
            C104497a aVar2 = aVarArr[i2];
            char c2 = this.f309698c;
            char c3 = this.f309699d;
            TickerView.C67446c cVar = this.f309697b.f309717e;
            int a2 = aVar2.mo147124a(c2);
            int a3 = aVar2.mo147124a(c3);
            if (a2 < 0 || a3 < 0) {
                aVar = null;
            } else {
                int ordinal = cVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (c3 == 0) {
                                a3 = aVar2.f309692b.length;
                            } else if (a3 < a2) {
                                a3 += aVar2.f309691a;
                            }
                        }
                    } else if (a2 < a3) {
                        a2 += aVar2.f309691a;
                    }
                } else if (!(c2 == 0 || c3 == 0)) {
                    if (a3 < a2) {
                        int i3 = a2 - a3;
                        int i4 = aVar2.f309691a;
                        if ((i4 - a2) + a3 < i3) {
                            a3 += i4;
                        }
                    } else if (a2 < a3) {
                        int i5 = a3 - a2;
                        int i6 = aVar2.f309691a;
                        if ((i6 - a3) + a2 < i5) {
                            a2 += i6;
                        }
                    }
                }
                aVar = new C104497a.C104498a(aVar2, a2, a3);
            }
            if (aVar != null) {
                this.f309700e = this.f309696a[i2].f309692b;
                this.f309701f = aVar.f309694a;
                this.f309702g = aVar.f309695b;
            }
            i2++;
        }
        if (this.f309700e == null) {
            char c4 = this.f309698c;
            char c5 = this.f309699d;
            if (c4 == c5) {
                this.f309700e = new char[]{c4};
                this.f309702g = 0;
                this.f309701f = 0;
            } else {
                this.f309700e = new char[]{c4, c5};
                this.f309701f = 0;
                this.f309702g = 1;
            }
        }
        if (this.f309702g >= this.f309701f) {
            z = true;
        }
        if (!z) {
            i = -1;
        }
        this.f309712q = i;
        this.f309711p = this.f309710o;
        this.f309710o = 0.0f;
    }
}
