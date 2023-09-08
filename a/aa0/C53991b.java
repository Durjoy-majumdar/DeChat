package aa0;

import a14.C0000n0;
import aa0.C53988a;
import fy3.C32228q;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import rx3.C13598b0;
import sx3.C64197v;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: aa0.b */
public final class C53991b {

    /* renamed from: a */
    public final C0000n0 f151253a;

    /* renamed from: b */
    public final C60690y0<List<C53988a>> f151254b;

    /* renamed from: c */
    public final C60690y0 f151255c;

    /* renamed from: d */
    public final C60690y0<Boolean> f151256d;

    /* renamed from: e */
    public final C60690y0 f151257e;

    /* renamed from: f */
    public final C60690y0<Boolean> f151258f;

    /* renamed from: g */
    public final C60690y0 f151259g;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.widget.TemplateListState$onSelectedTemplateChanged$1", mo125469f = "TemplateList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: aa0.b$a */
    public static final class C53992a extends C91594j implements C32228q<String, Boolean, C15601d<? super Boolean>, Object> {
        public C53992a(C15601d<? super C53992a> dVar) {
            super(3, dVar);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            ((Boolean) obj2).booleanValue();
            new C53992a((C15601d) obj3);
            ResultKt.throwOnFailure(C13598b0.f38549a);
            return Boolean.FALSE;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.FALSE;
        }
    }

    public C53991b(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "asyncJobScope");
        this.f151253a = n0Var;
        C53988a.C53989a aVar = C53988a.C53989a.f151252c;
        aVar.f151251a.setValue(Boolean.TRUE);
        C13598b0 b0Var = C13598b0.f38549a;
        C60690y0<List<C53988a>> c = C108500f2.m146996c(C64197v.m75537f(aVar, new C53988a.C53990b(), new C53988a.C53990b(), new C53988a.C53990b(), new C53988a.C53990b()), (C108497e2) null, 2, (Object) null);
        this.f151254b = c;
        this.f151255c = c;
        aVar.getClass();
        new C53992a((C15601d<? super C53992a>) null);
        Boolean bool = Boolean.FALSE;
        C60690y0<Boolean> c2 = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f151256d = c2;
        this.f151257e = c2;
        C60690y0<Boolean> c3 = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f151258f = c3;
        this.f151259g = c3;
    }
}
