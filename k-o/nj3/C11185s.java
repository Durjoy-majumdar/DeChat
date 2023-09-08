package nj3;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMFormMobileInputView;

/* renamed from: nj3.s */
public class C11185s implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormMobileInputView f32988d;

    public C11185s(MMFormMobileInputView mMFormMobileInputView) {
        this.f32988d = mMFormMobileInputView;
    }

    public void onFocusChange(View view, boolean z) {
        MMFormMobileInputView mMFormMobileInputView = this.f32988d;
        if (view == mMFormMobileInputView.f24184e || view == mMFormMobileInputView.f24185f) {
            mMFormMobileInputView.mo7705a(z);
        }
    }
}
