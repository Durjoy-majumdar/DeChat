package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$showRefreshTip$1 */
final class FinderNotifyContract$NotifyViewCallback$showRefreshTip$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f160518d;

    /* renamed from: e */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160519e;

    /* renamed from: f */
    public final /* synthetic */ boolean f160520f;

    /* renamed from: g */
    public final /* synthetic */ int f160521g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(String str, FinderNotifyContract.NotifyViewCallback notifyViewCallback, boolean z, int i) {
        super(0);
        this.f160518d = str;
        this.f160519e = notifyViewCallback;
        this.f160520f = z;
        this.f160521g = i;
    }

    public Object invoke() {
        if (!Util.isNullOrNil(this.f160518d)) {
            TextView textView = this.f160519e.f160462q;
            if (textView != null) {
                String str = this.f160518d;
                boolean z = this.f160520f;
                int i = this.f160521g;
                textView.setVisibility(0);
                textView.setText(str);
                textView.setClickable(z);
                textView.setTextColor(i);
            }
        } else {
            TextView textView2 = this.f160519e.f160462q;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return C13598b0.f38549a;
    }
}
