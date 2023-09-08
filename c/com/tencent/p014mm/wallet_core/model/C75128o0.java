package com.tencent.p014mm.wallet_core.model;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.wallet_core.model.o0 */
public class C75128o0<_Resp extends C49335eu3> extends C89132b<_Resp> {

    /* renamed from: i */
    public boolean f221056i = false;

    /* renamed from: j */
    public boolean f221057j = true;

    /* renamed from: n */
    public Context f221058n;

    /* renamed from: o */
    public Dialog f221059o;

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, _Resp _resp, C117747y yVar) {
        Dialog dialog = this.f221059o;
        if (dialog != null && dialog.isShowing()) {
            this.f221059o.dismiss();
            this.f221059o = null;
        }
        C47350c cVar = this.f256789f;
        if (cVar != null) {
            int i3 = cVar.f127058d;
        }
    }

    /* renamed from: i */
    public synchronized C89059e<C89132b.C89134c<_Resp>> mo9225i() {
        C47350c cVar = this.f256789f;
        if (cVar != null) {
            C75226r.m90205e(cVar.f127058d);
        }
        if (this.f221056i && this.f221059o == null) {
            Context context = this.f221058n;
            this.f221059o = C76879j.m92721O(context, (String) null, 3, C0966R.style.f8510l3, context.getString(C0966R.string.gas), true, this.f221057j, new C75126n0(this));
        }
        return super.mo9225i();
    }
}
