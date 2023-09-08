package ao1;

import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rd3.C48020a;
import rx3.C13598b0;

/* renamed from: ao1.a */
public final class C0136a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0141c f562d;

    /* renamed from: e */
    public final /* synthetic */ String f563e;

    /* renamed from: f */
    public final /* synthetic */ boolean f564f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0136a(C0141c cVar, String str, boolean z) {
        super(0);
        this.f562d = cVar;
        this.f563e = str;
        this.f564f = z;
    }

    public Object invoke() {
        C0141c cVar = this.f562d;
        String str = this.f563e;
        if (str == null) {
            str = "";
        }
        cVar.getClass();
        cVar.f569d = str;
        boolean z = false;
        if (this.f564f) {
            C0141c cVar2 = this.f562d;
            String str2 = cVar2.f569d;
            cVar2.f570e = C48020a.m53385b(str2) && C48020a.m53386c(str2) > 0;
        }
        C89779i0 i0Var = this.f562d.f571f;
        if (i0Var != null && i0Var.isShowing()) {
            z = true;
        }
        if (z) {
            C89779i0 i0Var2 = this.f562d.f571f;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            C32224a<C13598b0> aVar = this.f562d.f572g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return C13598b0.f38549a;
    }
}
