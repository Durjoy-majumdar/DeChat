package dr1;

import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p256vw.C15015f;
import p256vw.C15016h;
import rx3.C13598b0;

/* renamed from: dr1.g */
public final class C7481g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7483i f25698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7481g(C7483i iVar) {
        super(0);
        this.f25698d = iVar;
    }

    public Object invoke() {
        Button button;
        C7483i iVar = this.f25698d;
        String str = iVar.f25703d;
        if (str == null) {
            str = "";
        }
        C15016h hVar = new C15016h(str, 0, C45078p0.m49926e(str, C45078p0.C45079a.MODE_CHINESE_AS_2) + 1, new C7487j(iVar));
        hVar.f41146h = iVar.f25700a.getResources().getString(C0966R.string.nb7);
        hVar.f41147i = 1;
        hVar.f41144f = iVar.f25705f;
        hVar.f41145g = iVar.f25706g;
        hVar.f41149k = new C7482h(iVar);
        hVar.f41150l = new C7473b(iVar);
        iVar.f25704e = hVar;
        ((C15015f) C86312j.m106911c(C15015f.class)).mo13691lt(iVar.f25700a, iVar.f25704e);
        C15016h hVar2 = iVar.f25704e;
        if (!(hVar2 == null || (button = hVar2.f41148j) == null)) {
            iVar.mo8623f(button, "product_title_finish_button", 8);
        }
        return C13598b0.f38549a;
    }
}
