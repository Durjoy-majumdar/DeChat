package ys1;

import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ys1.b */
public final class C16068b extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16065a f43215d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16068b(C16065a aVar) {
        super(1);
        this.f43215d = aVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f43215d.mo14681c3().setBackground(this.f43215d.getActivity().getResources().getDrawable(C0966R.C0969drawable.b_5));
            this.f43215d.mo14681c3().setTextColor(this.f43215d.getActivity().getResources().getColor(C0966R.color.f2975b6));
            this.f43215d.mo14681c3().setEnabled(true);
        } else {
            this.f43215d.mo14681c3().setBackground(this.f43215d.getActivity().getResources().getDrawable(C0966R.C0969drawable.cju));
            this.f43215d.mo14681c3().setTextColor(this.f43215d.getActivity().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            this.f43215d.mo14681c3().setEnabled(false);
        }
        return C13598b0.f38549a;
    }
}
