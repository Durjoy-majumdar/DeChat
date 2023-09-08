package com.tencent.p014mm.p136ui.transmit;

import android.view.View;
import com.tencent.p014mm.p136ui.transmit.C74917p;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.transmit.o */
public class C74916o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74917p f220283d;

    public C74916o(C74917p pVar) {
        this.f220283d = pVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/transmit/TodoIntroduceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.grouptodo.TodoIntroduceView", "click i know");
        this.f220283d.dismiss();
        C74917p.C74919b bVar = this.f220283d.f220284d;
        if (bVar != null) {
            bVar.mo103253a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/transmit/TodoIntroduceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
