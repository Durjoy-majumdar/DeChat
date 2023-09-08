package yz2;

import android.text.Editable;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import j20.C117292a;
import java.util.ArrayList;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: yz2.c1 */
public final class C79226c1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232596d;

    public C79226c1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232596d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        String str;
        Editable text;
        String obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMEditText mMEditText = this.f232596d.f206794B;
        boolean z = false;
        if (mMEditText != null) {
            Editable text2 = mMEditText.getText();
            if (text2 != null && (C112551y.m153811k(text2) ^ true)) {
                z = true;
            }
        }
        if (z) {
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232596d;
            MMEditText mMEditText2 = textStatusDoWhatActivityV2.f206794B;
            if (mMEditText2 == null || (text = mMEditText2.getText()) == null || (obj = text.toString()) == null || (str = C112550d0.m153799i0(obj).toString()) == null) {
                str = "";
            }
            textStatusDoWhatActivityV2.f206829h = str;
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f232596d;
            TextStatusDoWhatActivityV2.m83898H7(textStatusDoWhatActivityV22, textStatusDoWhatActivityV22.f206806N);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
