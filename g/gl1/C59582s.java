package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62976sd;
import vk1.C65761b;

/* renamed from: gl1.s */
public final class C59582s extends C87413o implements C32224a<C62976sd> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170288d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59582s(C65761b bVar) {
        super(0);
        this.f170288d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170288d.findViewById(C0966R.C0970id.dy5);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_ready_ui_root)");
        return new C62976sd((ViewGroup) findViewById, this.f170288d);
    }
}
