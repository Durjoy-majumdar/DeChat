package aa2;

import aj3.C103374a;
import android.graphics.Rect;
import e92.C107268a;
import h92.C98325d;

/* renamed from: aa2.o */
public final class C103349o implements C103374a.C67055a {

    /* renamed from: a */
    public final /* synthetic */ int f304754a;

    /* renamed from: b */
    public final /* synthetic */ int f304755b;

    /* renamed from: c */
    public final /* synthetic */ float f304756c;

    /* renamed from: d */
    public final /* synthetic */ Rect f304757d;

    /* renamed from: e */
    public final /* synthetic */ C103343n f304758e;

    public C103349o(int i, int i2, float f, Rect rect, C103343n nVar) {
        this.f304754a = i;
        this.f304755b = i2;
        this.f304756c = f;
        this.f304757d = rect;
        this.f304758e = nVar;
    }

    /* renamed from: a */
    public final void mo91065a(float f) {
        float f2 = (float) this.f304754a;
        float f3 = (float) 1;
        float f4 = f3 - f;
        float height = (((((float) this.f304755b) * this.f304756c) - ((float) this.f304757d.height())) / ((float) 2)) * f4 * (f3 / this.f304756c);
        float f5 = ((float) this.f304755b) - height;
        C107268a aVar = this.f304758e.f304738d;
        if (aVar != null) {
            aVar.setMaskAlpha((int) (((float) 255) * f4));
        }
        C107268a aVar2 = this.f304758e.f304738d;
        if (aVar2 != null) {
            aVar2.mo136869a(0.0f, height, f2, f5);
        }
        C107268a aVar3 = this.f304758e.f304738d;
        if (aVar3 != null) {
            int i = C98325d.f288196u;
            int i2 = C98325d.f288196u;
            float f6 = this.f304756c;
            aVar3.mo136870b(0.0f, 0.0f, 0.0f, 0.0f, (((float) i2) * f4) / f6, (((float) i2) * f4) / f6, (((float) i2) * f4) / f6, (((float) i2) * f4) / f6);
        }
        C107268a aVar4 = this.f304758e.f304738d;
        if (aVar4 != null) {
            aVar4.postInvalidate();
        }
    }
}
