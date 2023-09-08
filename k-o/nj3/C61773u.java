package nj3;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nj3.u */
public class C61773u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFormVerifyCodeInputView f175608d;

    public C61773u(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f175608d = mMFormVerifyCodeInputView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f175608d.f214800f.mo101647a();
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
