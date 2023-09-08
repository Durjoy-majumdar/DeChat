package ar0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ar0.b */
public class C67102b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f192690d;

    public C67102b(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f192690d = mMFormVerifyCodeInputView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/widget/MMFormVerifyCodeInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f192690d.f197167u;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/widget/MMFormVerifyCodeInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
