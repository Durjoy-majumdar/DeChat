package ar0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView;

/* renamed from: ar0.a */
public class C67101a implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f192689d;

    public C67101a(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f192689d = mMFormVerifyCodeInputView;
    }

    public void onFocusChange(View view, boolean z) {
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f192689d;
        if (view == mMFormVerifyCodeInputView.f197155f) {
            mMFormVerifyCodeInputView.f197165s = new int[]{mMFormVerifyCodeInputView.getPaddingLeft(), mMFormVerifyCodeInputView.getPaddingTop(), mMFormVerifyCodeInputView.getPaddingRight(), mMFormVerifyCodeInputView.getPaddingBottom()};
            if (z) {
                this.f192689d.setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                this.f192689d.setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView2 = this.f192689d;
            int[] iArr = mMFormVerifyCodeInputView2.f197165s;
            if (iArr != null) {
                mMFormVerifyCodeInputView2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f192689d.f197166t;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
