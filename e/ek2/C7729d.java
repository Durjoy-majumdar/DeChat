package ek2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: ek2.d */
public final class C7729d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f26170d;

    public C7729d(C101218e0 e0Var) {
        this.f26170d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUIWithoutPlayer$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26170d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUIWithoutPlayer$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
