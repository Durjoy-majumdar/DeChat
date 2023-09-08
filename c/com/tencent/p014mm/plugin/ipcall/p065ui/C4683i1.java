package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ipcall.model.C42464d;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import t12.C110899d;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.i1 */
public class C4683i1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19651d;

    public C4683i1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19651d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        String str = this.f19651d.getString(C0966R.string.f360912fv3) + "&usedcc=";
        C42464d a = C42464d.m46136a();
        if (!a.f114953c) {
            a.mo66546b(false);
        }
        ArrayList<Integer> arrayList2 = a.f114951a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            str = str + C13818a.m13112h(C110899d.m151192f());
        } else {
            int size = arrayList2.size();
            if (size > 5) {
                size = 5;
            }
            for (int i = 0; i < size; i++) {
                String h = C13818a.m13112h(arrayList2.get(i).toString());
                if (!Util.isNullOrNil(h)) {
                    str = str + h + "|";
                }
            }
            if (str.endsWith("|")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        C88144b.m109791i(this.f19651d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
