package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.v1 */
public class C4724v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallUserProfileUI f19730d;

    public C4724v1(IPCallUserProfileUI iPCallUserProfileUI) {
        this.f19730d = iPCallUserProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115669n.INSTANCE.mo160131h(12766, 4);
        ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, this.f19730d.f19631u);
        Toast.makeText(this.f19730d, C0966R.string.fun, 0).show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
