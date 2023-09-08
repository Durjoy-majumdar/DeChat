package af0;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: af0.a */
public class C16457a {

    /* renamed from: b */
    public static int f43920b;

    /* renamed from: a */
    public C16459c f43921a;

    public C16457a(ViewGroup viewGroup) {
        if (f43920b == 0) {
            Resources resources = viewGroup.getResources();
            f43920b = resources.getDimensionPixelSize(C0966R.dimen.f357011a00);
            resources.getDimensionPixelOffset(C0966R.dimen.a05);
            resources.getDimensionPixelOffset(C0966R.dimen.f357015a04);
            resources.getDimensionPixelOffset(C0966R.dimen.f357014a03);
            resources.getDimensionPixelOffset(C0966R.dimen.a06);
            resources.getDimensionPixelOffset(C0966R.dimen.f357012a01);
        }
    }

    /* renamed from: a */
    public static C16457a m15296a(ViewGroup viewGroup, C16458b bVar) {
        C16457a aVar = new C16457a(viewGroup);
        C16459c cVar = new C16459c(viewGroup.getContext(), bVar, new C16463e(viewGroup.getWidth() / 2, viewGroup.getHeight() + 400), viewGroup);
        cVar.mo14940f(0.0f, 800.0f);
        cVar.mo14941g(-2000.0f, 1250.0f);
        cVar.f43950v = 0.002f;
        cVar.f43951w = 0.0f;
        cVar.f43926E = 3000.0f;
        cVar.f43927F = 500.0f;
        cVar.f43952x = 180;
        cVar.f43953y = 180;
        if (C67031g.f192531a == null) {
            C67031g.f192531a = new C16464f();
        }
        cVar.f43942n = C67031g.f192531a;
        cVar.f43954z = 3.6E-4f;
        cVar.f43922A = 1.8E-4f;
        cVar.mo14939e(360.0f);
        aVar.f43921a = cVar;
        return aVar;
    }

    /* renamed from: b */
    public C16459c mo14933b(int i, long j) {
        C16459c cVar = this.f43921a;
        cVar.f43938j = 0;
        cVar.f43939k = j;
        float f = ((float) i) / 1000.0f;
        cVar.f43940l = f;
        cVar.f43941m = 1.0f / f;
        cVar.mo14936b();
        return cVar;
    }
}
