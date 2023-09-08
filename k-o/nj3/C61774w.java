package nj3;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nj3.w */
public class C61774w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f175609d;

    public C61774w(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f175609d = mMFormVerifyCodeInputView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMFormVerifyCodeInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f175609d.f214813v;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
