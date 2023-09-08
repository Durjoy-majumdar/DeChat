package com.tencent.p014mm.p136ui;

import android.view.View;
import com.tencent.p014mm.p136ui.C74793m3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.j3 */
public class C74786j3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74793m3 f219908d;

    public C74786j3(C74793m3 m3Var) {
        this.f219908d = m3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/SearchBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74793m3.C74794a aVar = this.f219908d.f219921h;
        if (aVar != null) {
            aVar.onClickBackBtn(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/SearchBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
