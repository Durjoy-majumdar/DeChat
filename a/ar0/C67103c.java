package ar0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: ar0.c */
public class C67103c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f192691d;

    public C67103c(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f192691d = mMFormVerifyCodeInputView;
    }

    public boolean onTimerExpired() {
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f192691d;
        mMFormVerifyCodeInputView.f197163q--;
        mMFormVerifyCodeInputView.f197156g.setText(mMFormVerifyCodeInputView.getContext().getString(C0966R.string.a7d, new Object[]{Integer.valueOf(this.f192691d.f197163q)}));
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView2 = this.f192691d;
        if (mMFormVerifyCodeInputView2.f197163q == 0) {
            mMFormVerifyCodeInputView2.f197164r.stopTimer();
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView3 = this.f192691d;
            mMFormVerifyCodeInputView3.f197163q = mMFormVerifyCodeInputView3.f197162p;
            mMFormVerifyCodeInputView3.f197157h.setVisibility(0);
            this.f192691d.f197156g.setVisibility(8);
        }
        return true;
    }
}
