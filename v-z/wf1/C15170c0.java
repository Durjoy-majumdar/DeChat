package wf1;

import a14.C53973z1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import gy3.C8479f0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.concurrent.CancellationException;
import nj3.C76912y0;
import ob0.C89132b;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C49919iz0;

/* renamed from: wf1.c0 */
public final class C15170c0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C89779i0> f41313a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<C53973z1> f41314b;

    /* renamed from: c */
    public final /* synthetic */ C15193l f41315c;

    public C15170c0(C8479f0<C89779i0> f0Var, C8479f0<C53973z1> f0Var2, C15193l lVar) {
        this.f41313a = f0Var;
        this.f41314b = f0Var2;
        this.f41315c = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C89779i0 i0Var = (C89779i0) this.f41313a.f27484d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C53973z1.C53974a.m60623a((C53973z1) this.f41314b.f27484d, (CancellationException) null, 1, (Object) null);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C15193l lVar = this.f41315c;
            long j = lVar.f41375H;
            long j2 = ((C49919iz0) cVar.f256796d).f135766d;
            int i = 0;
            boolean z = j2 > j;
            C77407n nVar = new C77407n((Context) lVar.getContext(), 1, false);
            View inflate = View.inflate(lVar.getContext(), C0966R.C0971layout.bzt, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundCornerConstraintLayout");
            RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
            roundCornerConstraintLayout.mo82313s((float) C74942w4.m89784a(lVar.getContext(), 12), (float) C74942w4.m89784a(lVar.getContext(), 12), 0.0f, 0.0f);
            roundCornerConstraintLayout.findViewById(C0966R.C0970id.j5c).setOnClickListener(new C15180g0(nVar));
            ((TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.dmx)).setText(String.valueOf(j2));
            TextView textView = (TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.h4z);
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
            ((TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.h4z)).setOnClickListener(new C15182h0(lVar));
            ((TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.j_g)).setText(z ? lVar.getActivity().getString(C0966R.string.n8a) : lVar.getActivity().getString(C0966R.string.n8_));
            ((TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.f358153dn3)).setText(z ? String.valueOf(j) : String.valueOf(j - j2));
            TextView textView2 = (TextView) roundCornerConstraintLayout.findViewById(C0966R.C0970id.grc);
            textView2.setText(z ? lVar.getActivity().getString(C0966R.string.n8p) : lVar.getActivity().getString(C0966R.string.n8q));
            textView2.setOnClickListener(new C15184i0(nVar, z, lVar, textView2));
            nVar.f225771i = new C15190j0(nVar, roundCornerConstraintLayout);
            nVar.mo107559d(true);
            nVar.mo107573q();
        } else {
            C76912y0.m92773l(this.f41315c.getActivity(), this.f41315c.getActivity().getString(C0966R.string.n89));
        }
        return C13598b0.f38549a;
    }
}
