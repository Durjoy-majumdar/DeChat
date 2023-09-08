package ul1;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;
import ul1.C14205c;

/* renamed from: ul1.p */
public final class C14243p extends C87413o implements C32227p<C14205c.C14206a, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14221k f39768d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14243p(C14221k kVar) {
        super(2);
        this.f39768d = kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C14205c.C14206a aVar = (C14205c.C14206a) obj;
        int intValue = ((Number) obj2).intValue();
        C14221k kVar = this.f39768d;
        if (aVar != null) {
            C14209e eVar = kVar.f39728f;
            if (eVar != null) {
                eVar.mo13591W(aVar);
            }
            TextView textView = kVar.f39737r;
            if (textView != null) {
                textView.setText(aVar.f39672a);
            }
            kVar.mo13611v(aVar.f39672a);
        }
        C101218e0 e0Var = kVar.f39722G;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        Log.m105924i("FinderLiveLotteryCreateViewCallback", "chooserPrizeType " + aVar + ", pos:" + intValue);
        return C13598b0.f38549a;
    }
}
