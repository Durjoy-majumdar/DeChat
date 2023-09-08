package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.voip.ui.i0 */
public class C106451i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipBaseFragment f317985d;

    public C106451i0(VoipBaseFragment voipBaseFragment) {
        this.f317985d = voipBaseFragment;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoipBaseFragment$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f317985d.f317919g.findViewById(C0966R.C0970id.has) != null) {
            this.f317985d.f317931v.get().mo152451V(2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoipBaseFragment$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
