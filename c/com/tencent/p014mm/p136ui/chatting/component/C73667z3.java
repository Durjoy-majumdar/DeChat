package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nm2.C76927a;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.z3 */
public class C73667z3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73658y3 f216295d;

    public C73667z3(C73658y3 y3Var) {
        this.f216295d = y3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/RecordSelectComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73658y3 y3Var = this.f216295d;
        if (!y3Var.f216282t && !y3Var.mo102689I2()) {
            C76927a.m92781a().f224800a.f194396h = (long) this.f216295d.mo102688B5();
        }
        C73658y3 y3Var2 = this.f216295d;
        y3Var2.f216280r = false;
        y3Var2.f216282t = true;
        C79368l lVar = (C79368l) y3Var2.f215752d.f193278b.mo102812a(C79368l.class);
        long longValue = ((Long) view.getTag()).longValue();
        if (lVar.mo108206p3().contains(Long.valueOf(longValue))) {
            this.f216295d.f216284v.add(Long.valueOf(longValue));
            C76927a.m92781a().f224807h++;
        } else {
            this.f216295d.f216284v.remove(Long.valueOf(longValue));
            C76927a.m92781a().f224806g++;
        }
        if (!lVar.mo108183N0(longValue)) {
            C76927a.m92781a().f224801b++;
        }
        Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "setOnEditModeItemClickListener msgId:%s", Long.valueOf(longValue));
        C73658y3 y3Var3 = this.f216295d;
        y3Var3.f216270e.mo97683b(y3Var3.mo102694a6(lVar));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/RecordSelectComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
