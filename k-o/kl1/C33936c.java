package kl1;

import android.animation.IntEvaluator;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: kl1.c */
public final class C33936c extends IntEvaluator {

    /* renamed from: a */
    public C32227p<? super Float, ? super Boolean, C13598b0> f91645a;

    /* renamed from: b */
    public final int f91646b;

    /* renamed from: c */
    public final float f91647c;

    public C33936c(int i, int i2, C32227p<? super Float, ? super Boolean, C13598b0> pVar) {
        this.f91645a = pVar;
        int i3 = (i2 + i) / i;
        this.f91646b = i3;
        this.f91647c = ((float) 1) / ((float) i3);
    }

    /* renamed from: a */
    public Integer mo59373a(float f, int i, int i2) {
        if (f < this.f91647c) {
            C32227p<? super Float, ? super Boolean, C13598b0> pVar = this.f91645a;
            if (pVar != null) {
                pVar.invoke(Float.valueOf(f), Boolean.TRUE);
            }
            i2 = (int) (((float) i) + (((float) (i2 - i)) * f * ((float) this.f91646b)));
        } else {
            C32227p<? super Float, ? super Boolean, C13598b0> pVar2 = this.f91645a;
            if (pVar2 != null) {
                pVar2.invoke(Float.valueOf(f), Boolean.FALSE);
            }
        }
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return mo59373a(f, num.intValue(), num2.intValue());
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return mo59373a(f, ((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
