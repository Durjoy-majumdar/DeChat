package d83;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.xe4;

/* renamed from: d83.i */
public final class C97452i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97448g f286045d;

    /* renamed from: e */
    public final /* synthetic */ xe4 f286046e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97452i(C97448g gVar, xe4 xe4) {
        super(0);
        this.f286045d = gVar;
        this.f286046e = xe4;
    }

    public Object invoke() {
        C97448g gVar = this.f286045d;
        View view = gVar.f286030i;
        if (view != null) {
            xe4 xe4 = this.f286046e;
            ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(xe4.f228421i);
            view.findViewById(C0966R.C0970id.bec).animate().rotation(90.0f).setDuration(200).start();
            C97454k kVar = gVar.f286033o;
            if (kVar == null) {
                gVar.f286033o = new C97454k(gVar, xe4, gVar.f286028g, view);
            } else {
                kVar.f286057e = xe4;
            }
            gVar.f286031j = true;
            C97454k kVar2 = gVar.f286033o;
            if (kVar2 != null) {
                kVar2.mo136711X5(xe4);
            }
        }
        return C13598b0.f38549a;
    }
}
