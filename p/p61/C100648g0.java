package p61;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: p61.g0 */
public final class C100648g0 extends C100668o {

    /* renamed from: g */
    public final float f294853g;

    /* renamed from: h */
    public final float f294854h;

    /* renamed from: i */
    public final float f294855i;

    /* renamed from: j */
    public final int f294856j = 4;

    public C100648g0() {
        Resources resources = MMApplicationContext.getContext().getResources();
        this.f294853g = resources.getDimension(C0966R.dimen.av6);
        this.f294854h = resources.getDimension(C0966R.dimen.f3743cv);
        this.f294855i = resources.getDimension(C0966R.dimen.f3766df);
        this.f294934c = 4;
        mo140084e();
    }

    /* renamed from: a */
    public float mo140081a() {
        return this.f294854h;
    }

    /* renamed from: b */
    public float mo140082b() {
        return this.f294853g;
    }

    /* renamed from: c */
    public float mo140083c() {
        return this.f294855i;
    }

    /* renamed from: e */
    public void mo140084e() {
        int i = this.f294933b;
        float f = (float) 2;
        float f2 = ((float) i) - (this.f294854h * f);
        float f3 = this.f294853g;
        if (f2 < f3 * f) {
            this.f294934c = 1;
            return;
        }
        float f4 = this.f294855i;
        int i2 = (int) ((f2 + f4) / (f4 + f3));
        int i3 = this.f294856j;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f294934c = i2;
        int i4 = (int) ((f2 - (((float) i2) * f3)) / ((float) (i2 - 1)));
        this.f294935d = i4;
        this.f294936e = (int) (((((float) i) - (f3 * ((float) i2))) - ((float) (i4 * i2))) / f);
    }
}
