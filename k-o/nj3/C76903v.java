package nj3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;

/* renamed from: nj3.v */
public class C76903v implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f224754d;

    public C76903v(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f224754d = mMFormVerifyCodeInputView;
    }

    public void onFocusChange(View view, boolean z) {
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f224754d;
        if (view == mMFormVerifyCodeInputView.f214800f) {
            mMFormVerifyCodeInputView.f214811t = new int[]{mMFormVerifyCodeInputView.getPaddingLeft(), mMFormVerifyCodeInputView.getPaddingTop(), mMFormVerifyCodeInputView.getPaddingRight(), mMFormVerifyCodeInputView.getPaddingBottom()};
            if (z) {
                this.f224754d.setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                this.f224754d.setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView2 = this.f224754d;
            int[] iArr = mMFormVerifyCodeInputView2.f214811t;
            if (iArr != null) {
                mMFormVerifyCodeInputView2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f224754d.f214812u;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
