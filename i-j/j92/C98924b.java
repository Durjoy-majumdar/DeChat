package j92;

import aj3.C103374a;
import android.graphics.Rect;
import h92.C98325d;

/* renamed from: j92.b */
public final class C98924b implements C103374a.C67055a {

    /* renamed from: a */
    public final /* synthetic */ int f289975a;

    /* renamed from: b */
    public final /* synthetic */ int f289976b;

    /* renamed from: c */
    public final /* synthetic */ float f289977c;

    /* renamed from: d */
    public final /* synthetic */ Rect f289978d;

    /* renamed from: e */
    public final /* synthetic */ C108669a f289979e;

    /* renamed from: f */
    public final /* synthetic */ int f289980f;

    /* renamed from: g */
    public final /* synthetic */ int f289981g;

    public C98924b(int i, int i2, float f, Rect rect, C108669a aVar, int i3, int i4) {
        this.f289975a = i;
        this.f289976b = i2;
        this.f289977c = f;
        this.f289978d = rect;
        this.f289979e = aVar;
        this.f289980f = i3;
        this.f289981g = i4;
    }

    /* renamed from: a */
    public final void mo91065a(float f) {
        float f2 = (float) this.f289975a;
        float height = (((((float) this.f289976b) * this.f289977c) - ((float) this.f289978d.height())) / ((float) 2)) * f * (((float) 1) / this.f289977c);
        float f3 = ((float) this.f289976b) - height;
        C98325d dVar = this.f289979e.f325431d;
        if (dVar != null) {
            dVar.setMaskAlpha((int) (((float) 255) * f));
        }
        C98325d dVar2 = this.f289979e.f325431d;
        if (dVar2 != null) {
            dVar2.mo137622a(0.0f, height, f2, f3);
        }
        int i = C98325d.f288196u;
        float f4 = (((float) C98325d.f288196u) * f) / this.f289977c;
        C98325d dVar3 = this.f289979e.f325431d;
        if (dVar3 != null) {
            dVar3.mo137623b(f4, f4, f4, f4, f4, f4, f4, f4);
        }
        C98325d dVar4 = this.f289979e.f325431d;
        if (dVar4 != null) {
            dVar4.setPivotX((float) this.f289980f);
        }
        C98325d dVar5 = this.f289979e.f325431d;
        if (dVar5 != null) {
            dVar5.setPivotY((float) this.f289981g);
        }
        C98325d dVar6 = this.f289979e.f325431d;
        if (dVar6 != null) {
            dVar6.postInvalidate();
        }
    }
}
