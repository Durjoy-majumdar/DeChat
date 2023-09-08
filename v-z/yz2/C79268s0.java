package yz2;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qz2.C47914d;
import z04.C112550d0;

/* renamed from: yz2.s0 */
public final class C79268s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f232713d;

    /* renamed from: e */
    public final /* synthetic */ String f232714e;

    public C79268s0(TextStatusDoWhatActivity textStatusDoWhatActivity, String str) {
        this.f232713d = textStatusDoWhatActivity;
        this.f232714e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusDoWhatActivity textStatusDoWhatActivity = this.f232713d;
        EditText editText = textStatusDoWhatActivity.f206783x;
        String obj = C112550d0.m153799i0(String.valueOf(editText != null ? editText.getText() : null)).toString();
        textStatusDoWhatActivity.getClass();
        C87412m.m108594g(obj, "<set-?>");
        textStatusDoWhatActivity.f206769g = obj;
        TextStatusDoWhatActivity textStatusDoWhatActivity2 = this.f232713d;
        C47914d dVar = textStatusDoWhatActivity2.f206770h;
        if (dVar != null) {
            String str = this.f232714e;
            String str2 = dVar.f128570e;
            if (str2 != null) {
                str = str2;
            }
            TextStatusDoWhatActivity.m83891H7(textStatusDoWhatActivity2, str);
        } else {
            TextStatusDoWhatActivity.m83891H7(textStatusDoWhatActivity2, this.f232714e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
