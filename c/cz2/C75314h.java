package cz2;

import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C12937a;

/* renamed from: cz2.h */
public final class C75314h extends C60896i<C12937a> {

    /* renamed from: e */
    public final C75315q f221467e;

    /* renamed from: f */
    public final C75316r f221468f;

    /* renamed from: g */
    public final long f221469g = 300;

    /* renamed from: h */
    public final AccelerateInterpolator f221470h = new AccelerateInterpolator();

    /* renamed from: i */
    public MMEditText f221471i;

    /* renamed from: j */
    public String f221472j = "userdefine";

    public C75314h(C75315q qVar, C75316r rVar) {
        C87412m.m108594g(qVar, "onCustomStatusConfirm");
        C87412m.m108594g(rVar, "onCustomStatusItemClickListener");
        this.f221467e = qVar;
        this.f221468f = rVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d38;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C12937a) cVar, "item");
        this.f221471i = (MMEditText) oVar.mo85812D(C0966R.C0970id.nks);
        ((ViewGroup) oVar.mo85812D(C0966R.C0970id.nkg)).setOnClickListener(new C75310d(this, oVar));
        oVar.mo85812D(C0966R.C0970id.nqp).setOnClickListener(new C75311e(this));
        oVar.mo85812D(C0966R.C0970id.n4l).setOnClickListener(new C75312f(this));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        this.f221468f.mo98436a("ACTION_ENTER");
    }
}
