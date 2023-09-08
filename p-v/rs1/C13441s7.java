package rs1;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.lifecycle.C39622i0;
import as1.C0201a;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import xd1.C15644c;
import xd1.C15671r;

/* renamed from: rs1.s7 */
public final class C13441s7 extends C87413o implements C32226l<VASActivity, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13329m7 f38058d;

    /* renamed from: e */
    public final /* synthetic */ boolean f38059e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13441s7(C13329m7 m7Var, boolean z) {
        super(1);
        this.f38058d = m7Var;
        this.f38059e = z;
    }

    public Object invoke(Object obj) {
        VASActivity vASActivity;
        VASActivity vASActivity2 = (VASActivity) obj;
        this.f38058d.mo12770h();
        C13329m7 m7Var = this.f38058d;
        VASCommonFragment vASCommonFragment = m7Var.f37805c;
        if (!(vASCommonFragment == null || (vASActivity = vASCommonFragment.f348642o) == null)) {
            boolean z = this.f38059e;
            C39818r rVar = C39818r.f106831a;
            C15671r rVar2 = (C15671r) rVar.mo62444c(vASActivity).mo75002a(C15671r.class);
            ColorDrawable colorDrawable = new ColorDrawable(MMApplicationContext.getColor(C0966R.color.al6));
            rVar2.getClass();
            rVar2.f33563j = colorDrawable;
            View findViewById = rVar2.getActivity().findViewById(C0966R.C0970id.cjg);
            if (findViewById != null) {
                findViewById.setBackground(colorDrawable);
            }
            C39622i0 a = rVar.mo62444c(vASActivity).mo75002a(C15644c.class);
            C87412m.m108593f(a, "UICProvider.of(vasActivi…PoiHeaderUIC::class.java)");
            C15644c cVar = (C15644c) a;
            cVar.f42304w = new C13341n7(m7Var);
            cVar.f42303v = new C13358o7(m7Var);
            cVar.f42307z = new C13365p7(m7Var);
            cVar.f42305x = Boolean.valueOf(z);
            cVar.f42306y = new C13380q7(m7Var);
            cVar.f42280A = new C13420r7(m7Var);
            C0201a aVar = m7Var.f37806d;
            if (aVar != null) {
                aVar.mo214p(true);
            }
            vASActivity.setBounceEnabled(false);
        }
        return C13598b0.f38549a;
    }
}
