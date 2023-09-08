package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C87413o;
import java.util.regex.Pattern;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$dismissRefreshViewOnError$1 */
final class C56197x3ce15cd4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160559d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56197x3ce15cd4(FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f160559d = notifyViewCallback;
    }

    public Object invoke() {
        Runnable runnable = this.f160559d.f160546h;
        if (runnable != null) {
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.removeRunnable(runnable);
        }
        TextView textView = this.f160559d.f160550o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
