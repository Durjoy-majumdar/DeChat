package vf1;

import android.text.Editable;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vf1.b2 */
public final class C14727b2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCreateVisitorModeUI f40693d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14727b2(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        super(0);
        this.f40693d = finderLiveCreateVisitorModeUI;
    }

    public Object invoke() {
        String str;
        Editable text;
        FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40693d;
        C58739j4 j4Var = C58739j4.f168176a;
        MMEditText mMEditText = finderLiveCreateVisitorModeUI.f14501t;
        if (mMEditText == null || (text = mMEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        finderLiveCreateVisitorModeUI.f14492E = j4Var.mo83716k(str);
        String str2 = this.f40693d.f14492E;
        boolean z = !(str2 == null || str2.length() == 0);
        this.f40693d.mo3015O7(z);
        if (z) {
            ImageView imageView = this.f40693d.f14502u;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.f40693d.f14502u;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        return C13598b0.f38549a;
    }
}
