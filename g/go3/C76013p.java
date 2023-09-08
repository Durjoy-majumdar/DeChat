package go3;

import android.content.res.Resources;
import com.tencent.p014mm.p136ui.widget.MMCollapsibleTextView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: go3.p */
public final class C76013p extends C87413o implements C32224a<Resources> {

    /* renamed from: d */
    public final /* synthetic */ MMCollapsibleTextView f222871d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76013p(MMCollapsibleTextView mMCollapsibleTextView) {
        super(0);
        this.f222871d = mMCollapsibleTextView;
    }

    public Object invoke() {
        return this.f222871d.getContext().getResources();
    }
}
