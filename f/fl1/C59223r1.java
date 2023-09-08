package fl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ug1.C65348b;
import vk1.C65760a;

/* renamed from: fl1.r1 */
public final class C59223r1 extends C87413o implements C32224a<C65348b> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169369d;

    /* renamed from: e */
    public final /* synthetic */ C65760a f169370e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59223r1(C59161f fVar, C65760a aVar) {
        super(0);
        this.f169369d = fVar;
        this.f169370e = aVar;
    }

    public Object invoke() {
        C59161f fVar = this.f169369d;
        C65760a aVar = this.f169370e;
        fVar.getClass();
        View inflate = ((ViewStub) aVar.findViewById(C0966R.C0970id.neh)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return new C65348b((ViewGroup) inflate, this.f169370e);
    }
}
