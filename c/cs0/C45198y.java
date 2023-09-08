package cs0;

import android.widget.TextView;
import as0.C39635c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import cs0.C45174j;
import fy3.C32224a;
import gy3.C87413o;
import kg3.C76577a;
import p385u2.C111105a;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: cs0.y */
public final class C45198y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122517d;

    /* renamed from: e */
    public final /* synthetic */ C45174j f122518e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45198y(C45181m mVar, C45174j jVar) {
        super(0);
        this.f122517d = mVar;
        this.f122518e = jVar;
    }

    public Object invoke() {
        C45181m mVar = this.f122517d;
        C45166g0 g0Var = ((C45174j.C45178d) this.f122518e).f122484a;
        C77407n nVar = new C77407n(C39635c.m42240d(mVar.f122487d), 1, false);
        TextView textView = new TextView(C39635c.m42240d(mVar.f122487d));
        textView.setMinHeight(C76577a.m92155f(C39635c.m42240d(mVar.f122487d), C0966R.dimen.f3758d_));
        int f = C76577a.m92155f(C39635c.m42240d(mVar.f122487d), C0966R.dimen.f4180va);
        textView.setPadding(f, 0, f, 0);
        textView.setGravity(17);
        textView.setTextColor(C111105a.m151500b(C39635c.m42240d(mVar.f122487d), C0966R.color.f3150gz));
        textView.setTextSize(0, (float) C76577a.m92157h(C39635c.m42240d(mVar.f122487d), C0966R.dimen.f3964lm));
        AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = mVar.f122487d;
        Object[] objArr = new Object[1];
        String str = g0Var.f122469c.f141805e;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(appBrandUserInfoRevokePage.getString(C0966R.string.a9c, objArr));
        nVar.mo107569n(textView, false);
        nVar.f225771i = new C45189q(mVar);
        nVar.f225782p = new C45190r(mVar, g0Var);
        nVar.mo107573q();
        return C13598b0.f38549a;
    }
}
