package yz2;

import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: yz2.y0 */
public final class C79293y0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232786d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79293y0(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f232786d = textStatusDoWhatActivityV2;
    }

    public Object invoke() {
        WxRecyclerView wxRecyclerView = this.f232786d.f206825d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAlpha(0.1f);
        }
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232786d;
        MMEditText mMEditText = textStatusDoWhatActivityV2.f206794B;
        if (mMEditText != null) {
            mMEditText.removeTextChangedListener(textStatusDoWhatActivityV2.f206819V0);
        }
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f232786d;
        MMEditText mMEditText2 = textStatusDoWhatActivityV22.f206794B;
        if (mMEditText2 != null) {
            mMEditText2.addTextChangedListener(textStatusDoWhatActivityV22.f206819V0);
        }
        return C13598b0.f38549a;
    }
}
