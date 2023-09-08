package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.plugin.account.ui.b3 */
public class C115089b3 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ String[] f345082d;

    /* renamed from: e */
    public final /* synthetic */ RegSetInfoUI f345083e;

    /* renamed from: com.tencent.mm.plugin.account.ui.b3$a */
    public class C115090a implements Runnable {
        public C115090a() {
        }

        public void run() {
            C115089b3.this.f345083e.f344991e.clearFocus();
            C115089b3.this.f345083e.f344991e.requestFocus();
        }
    }

    public C115089b3(RegSetInfoUI regSetInfoUI, String[] strArr) {
        this.f345083e = regSetInfoUI;
        this.f345082d = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C76901s0 s0Var = this.f345083e.f344978I;
        if (s0Var != null) {
            s0Var.dismiss();
            this.f345083e.f344978I = null;
        }
        this.f345083e.f344991e.setText(this.f345082d[i]);
        this.f345083e.f344991e.postDelayed(new C115090a(), 50);
        RegSetInfoUI regSetInfoUI = this.f345083e;
        regSetInfoUI.f345001r.setText(regSetInfoUI.getString(C0966R.string.hz6));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$25", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
