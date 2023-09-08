package pa0;

import com.tencent.p014mm.C0966R;
import d14.C45253g;
import gy3.C87412m;
import iy3.C60641c;
import rx3.C13598b0;
import wx3.C15601d;
import y90.C66581h;

/* renamed from: pa0.p */
public final class C62239p implements C45253g<Float> {

    /* renamed from: d */
    public final /* synthetic */ C62211a f176933d;

    public C62239p(C62211a aVar) {
        this.f176933d = aVar;
    }

    public Object emit(Object obj, C15601d dVar) {
        float floatValue = ((Number) obj).floatValue();
        C66581h f3 = this.f176933d.mo87296f3();
        String string = this.f176933d.getResources().getString(C0966R.string.gsy, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
        C87412m.m108593f(string, "resources.getString(\n   …t()\n                    )");
        f3.mo90633a(string);
        return C13598b0.f38549a;
    }
}
