package gg0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileVerifyUI;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: gg0.p */
public class C75917p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BindMobileVerifyUI f222592d;

    public C75917p(BindMobileVerifyUI bindMobileVerifyUI) {
        this.f222592d = bindMobileVerifyUI;
    }

    public void run() {
        BindMobileVerifyUI bindMobileVerifyUI = this.f222592d;
        bindMobileVerifyUI.f196491n = Integer.valueOf(bindMobileVerifyUI.f196491n.intValue() - 1);
        if (this.f222592d.f196491n.intValue() > 0) {
            BindMobileVerifyUI bindMobileVerifyUI2 = this.f222592d;
            bindMobileVerifyUI2.f196489i.setText(bindMobileVerifyUI2.getResources().getQuantityString(C0966R.plurals.f7240v, this.f222592d.f196491n.intValue(), new Object[]{this.f222592d.f196491n}));
            return;
        }
        BindMobileVerifyUI bindMobileVerifyUI3 = this.f222592d;
        bindMobileVerifyUI3.f196489i.setText(bindMobileVerifyUI3.getResources().getQuantityString(C0966R.plurals.f7240v, 0, new Object[]{0}));
        BindMobileVerifyUI bindMobileVerifyUI4 = this.f222592d;
        MTimerHandler mTimerHandler = bindMobileVerifyUI4.f196493p;
        if (mTimerHandler != null && !mTimerHandler.stopped()) {
            bindMobileVerifyUI4.f196493p.stopTimer();
        }
        bindMobileVerifyUI4.f196493p = null;
    }
}
