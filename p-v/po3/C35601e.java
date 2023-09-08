package po3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cropview.BorderView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: po3.e */
public final class C35601e extends C87413o implements C32224a<Float> {

    /* renamed from: d */
    public final /* synthetic */ BorderView f95176d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35601e(BorderView borderView) {
        super(0);
        this.f95176d = borderView;
    }

    public Object invoke() {
        return Float.valueOf(this.f95176d.getContext().getResources().getDimension(C0966R.dimen.f4170v0));
    }
}
