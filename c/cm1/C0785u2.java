package cm1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import cm1.C0777t2;
import er1.C7832m3;
import gy3.C87412m;
import java.util.List;

/* renamed from: cm1.u2 */
public final class C0785u2 implements C0777t2.C0779b {

    /* renamed from: a */
    public final /* synthetic */ C0777t2 f1836a;

    /* renamed from: b */
    public final /* synthetic */ int f1837b;

    /* renamed from: c */
    public final /* synthetic */ Context f1838c;

    /* renamed from: d */
    public final /* synthetic */ CharSequence f1839d;

    /* renamed from: e */
    public final /* synthetic */ List<C0777t2.C0778a> f1840e;

    /* renamed from: f */
    public final /* synthetic */ C7832m3.C7833a f1841f;

    public C0785u2(C0777t2 t2Var, int i, Context context, CharSequence charSequence, List<C0777t2.C0778a> list, C7832m3.C7833a aVar) {
        this.f1836a = t2Var;
        this.f1837b = i;
        this.f1838c = context;
        this.f1839d = charSequence;
        this.f1840e = list;
        this.f1841f = aVar;
    }

    /* renamed from: a */
    public void mo723a(List<? extends Drawable> list) {
        C87412m.m108594g(list, "drawables");
        this.f1841f.mo724a(true, this.f1836a.mo715d3(this.f1837b, this.f1838c, this.f1839d, this.f1840e, list));
    }
}
