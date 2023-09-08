package zd0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: zd0.u */
public final class C66786u extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ C23466p f191884d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66786u(C23466p pVar) {
        super(0);
        this.f191884d = pVar;
    }

    public Object invoke() {
        View view = new View(this.f191884d.f67324d);
        view.setBackgroundColor(this.f191884d.f67324d.getResources().getColor(C0966R.color.f3305n4));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        return view;
    }
}
