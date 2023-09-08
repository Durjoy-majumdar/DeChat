package yz2;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.g1 */
public final class C79236g1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232610d;

    public C79236g1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232610d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMEditText mMEditText = this.f232610d.f206794B;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        this.f232610d.mo98428Q7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
