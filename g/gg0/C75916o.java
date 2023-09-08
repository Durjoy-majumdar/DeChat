package gg0;

import android.widget.TextView;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileVerifyUI;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: gg0.o */
public class C75916o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ BindMobileVerifyUI f222591d;

    public C75916o(BindMobileVerifyUI bindMobileVerifyUI) {
        this.f222591d = bindMobileVerifyUI;
    }

    public boolean onTimerExpired() {
        BindMobileVerifyUI bindMobileVerifyUI = this.f222591d;
        TextView textView = bindMobileVerifyUI.f196489i;
        if (textView == null) {
            return true;
        }
        textView.post(new C75917p(bindMobileVerifyUI));
        return true;
    }
}
