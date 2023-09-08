package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1 */
final class FinderMsgContract$MsgViewCallback$showRefreshTip$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f160434d;

    /* renamed from: e */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160435e;

    /* renamed from: f */
    public final /* synthetic */ boolean f160436f;

    /* renamed from: g */
    public final /* synthetic */ int f160437g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$showRefreshTip$1(String str, FinderMsgContract.MsgViewCallback msgViewCallback, boolean z, int i) {
        super(0);
        this.f160434d = str;
        this.f160435e = msgViewCallback;
        this.f160436f = z;
        this.f160437g = i;
    }

    public Object invoke() {
        if (!Util.isNullOrNil(this.f160434d)) {
            TextView textView = this.f160435e.f160396p;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f160435e.f160396p;
                if (textView2 != null) {
                    textView2.setText(this.f160434d);
                    TextView textView3 = this.f160435e.f160396p;
                    if (textView3 != null) {
                        textView3.setClickable(this.f160436f);
                        TextView textView4 = this.f160435e.f160396p;
                        if (textView4 != null) {
                            textView4.setTextColor(this.f160437g);
                        } else {
                            C87412m.m108603p("refreshTip");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("refreshTip");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("refreshTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("refreshTip");
                throw null;
            }
        } else {
            TextView textView5 = this.f160435e.f160396p;
            if (textView5 != null) {
                textView5.setVisibility(8);
            } else {
                C87412m.m108603p("refreshTip");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
