package nj3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMFormInputView;

/* renamed from: nj3.r */
public class C76899r implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormInputView f224750d;

    public C76899r(MMFormInputView mMFormInputView) {
        this.f224750d = mMFormInputView;
    }

    public void onFocusChange(View view, boolean z) {
        MMFormInputView mMFormInputView = this.f224750d;
        if (view == mMFormInputView.f214792f) {
            mMFormInputView.f214796j = new int[]{mMFormInputView.getPaddingLeft(), mMFormInputView.getPaddingTop(), mMFormInputView.getPaddingRight(), mMFormInputView.getPaddingBottom()};
            if (z) {
                this.f224750d.setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                this.f224750d.setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            MMFormInputView mMFormInputView2 = this.f224750d;
            int[] iArr = mMFormInputView2.f214796j;
            if (iArr != null) {
                mMFormInputView2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f224750d.f214797n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
