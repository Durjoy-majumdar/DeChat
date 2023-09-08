package x73;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C101823o70;

/* renamed from: x73.g */
public final class C102574g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C102570e f302031d;

    /* renamed from: e */
    public final /* synthetic */ C101823o70 f302032e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102574g(C102570e eVar, C101823o70 o702) {
        super(0);
        this.f302031d = eVar;
        this.f302032e = o702;
    }

    public Object invoke() {
        C102570e eVar = this.f302031d;
        View view = eVar.f302017i;
        if (view != null) {
            C101823o70 o702 = this.f302032e;
            ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(eVar.getContext().getString(C0966R.string.lqq));
            view.findViewById(C0966R.C0970id.bec).animate().rotation(90.0f).setDuration(200).start();
            C102576i iVar = eVar.f302020o;
            if (iVar == null) {
                eVar.f302020o = new C102576i(eVar, o702, eVar.f302015g, view);
            } else {
                C87412m.m108594g(o702, "<set-?>");
                iVar.f302044e = o702;
            }
            eVar.f302018j = true;
            C102576i iVar2 = eVar.f302020o;
            if (iVar2 != null) {
                iVar2.mo142202G1(o702);
            }
        }
        return C13598b0.f38549a;
    }
}
