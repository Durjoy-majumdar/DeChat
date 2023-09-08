package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: yz2.z0 */
public final class C79296z0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232789d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79296z0(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f232789d = textStatusDoWhatActivityV2;
    }

    public Object invoke() {
        WxRecyclerView wxRecyclerView = this.f232789d.f206825d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAlpha(1.0f);
        }
        return C13598b0.f38549a;
    }
}
