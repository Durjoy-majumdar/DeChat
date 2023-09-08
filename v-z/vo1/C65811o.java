package vo1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62660c;
import zo1.C16344b0;

/* renamed from: vo1.o */
public final class C65811o extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f189266d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f189267e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65811o(C65820t tVar, C56032b bVar) {
        super(0);
        this.f189266d = tVar;
        this.f189267e = bVar;
    }

    public Object invoke() {
        View inflate = LayoutInflater.from(this.f189266d.f189237e).inflate(C0966R.C0971layout.d4g, this.f189267e, false);
        this.f189267e.addView(inflate);
        C65820t tVar = this.f189266d;
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        tVar.f189289v = new C16344b0((ViewGroup) inflate, this.f189267e);
        C16344b0 b0Var = this.f189266d.f189289v;
        C87412m.m108591d(b0Var);
        return b0Var;
    }
}
