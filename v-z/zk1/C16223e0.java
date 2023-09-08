package zk1;

import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: zk1.e0 */
public final class C16223e0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16223e0(C16229h hVar) {
        super(1);
        this.f43448d = hVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        String str = this.f43448d.f43483d;
        Log.m105924i(str, "#showChargeSheet choose wecoin:" + intValue);
        C16229h hVar = this.f43448d;
        RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) hVar.f43460B).getValue();
        C87412m.m108593f(relativeLayout, "preSaleValueLayout");
        relativeLayout.postDelayed(new C16271n(hVar, relativeLayout), 50);
        C16229h hVar2 = this.f43448d;
        hVar2.f43464F = intValue;
        ((WeImageView) ((C36570n) hVar2.f43459A).getValue()).setVisibility(hVar2.f43464F > 0 ? 0 : 8);
        ((TextView) ((C36570n) this.f43448d.f43461C).getValue()).setText(String.valueOf(this.f43448d.f43464F));
        return C13598b0.f38549a;
    }
}
