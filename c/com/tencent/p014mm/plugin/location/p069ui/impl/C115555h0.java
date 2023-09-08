package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.h0 */
public class C115555h0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346577d;

    public C115555h0(C115538c0 c0Var) {
        this.f346577d = c0Var;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Log.m105919d("MicroMsg.MMPoiMapUI", "searchText: %s.", charSequence);
        this.f346577d.f346505K = charSequence.toString();
        this.f346577d.f346546p.mo101727b();
        this.f346577d.f346496B.setVisibility(8);
        if (Util.isNullOrNil(this.f346577d.f346505K)) {
            this.f346577d.f346525X0.setVisibility(8);
            this.f346577d.f346551t.mo175610b();
            this.f346577d.f346551t.notifyDataSetChanged();
            C115538c0 c0Var = this.f346577d;
            c0Var.f346546p.removeFooterView(c0Var.f346548q);
            this.f346577d.mo175575q();
            this.f346577d.mo175577s(false);
            View view = this.f346577d.f346552u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f346577d.f346525X0.setVisibility(0);
        this.f346577d.mo175581w(true);
    }
}
