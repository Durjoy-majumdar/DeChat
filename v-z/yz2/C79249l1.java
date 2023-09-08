package yz2;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qz2.C47914d;
import z04.C112550d0;

/* renamed from: yz2.l1 */
public final class C79249l1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232671d;

    /* renamed from: e */
    public final /* synthetic */ String f232672e;

    public C79249l1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, String str) {
        this.f232671d = textStatusDoWhatActivityV2;
        this.f232672e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232671d;
        EditText editText = textStatusDoWhatActivityV2.f206815T0;
        String obj = C112550d0.m153799i0(String.valueOf(editText != null ? editText.getText() : null)).toString();
        C87412m.m108594g(obj, "<set-?>");
        textStatusDoWhatActivityV2.f206829h = obj;
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f232671d;
        C47914d dVar = textStatusDoWhatActivityV22.f206830i;
        if (dVar != null) {
            String str = this.f232672e;
            String str2 = dVar.f128570e;
            if (str2 != null) {
                str = str2;
            }
            TextStatusDoWhatActivityV2.m83898H7(textStatusDoWhatActivityV22, str);
        } else {
            TextStatusDoWhatActivityV2.m83898H7(textStatusDoWhatActivityV22, this.f232672e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
