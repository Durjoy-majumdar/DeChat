package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr3.C76024a;
import hr3.C76241b;
import te3.C77922en3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.o */
public class C72157o implements C0120a0<C77922en3> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209323d;

    public C72157o(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209323d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        C77922en3 en32 = (C77922en3) obj;
        if (en32 != null) {
            C76241b logicDelegate = this.f209323d.f209183f.getLogicDelegate();
            if (logicDelegate instanceof C76024a.C76033i) {
                ((C76024a.C76033i) logicDelegate).mo106242f(en32.f227260d.f184008d);
            }
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209323d;
            wcPayRealnameVerifyIdInputUI.getClass();
            int i = en32.f227260d.f184008d;
            Log.m105925i("MicroMsg.WcPayRealnameVerifyIdInputUI", "change cre type: %s", Integer.valueOf(i));
            wcPayRealnameVerifyIdInputUI.f209183f.setText("");
            C76241b logicDelegate2 = wcPayRealnameVerifyIdInputUI.f209183f.getLogicDelegate();
            if (logicDelegate2 instanceof C76024a.C76033i) {
                ((C76024a.C76033i) logicDelegate2).mo106242f(i);
            }
            WcPayRealnameVerifyIdInputUI.C72131r rVar = wcPayRealnameVerifyIdInputUI.f209159A;
            rVar.f209243s.setValue("");
            rVar.f209244t.setValue("");
            rVar.f209245u.setValue(0);
            rVar.f209246v.setValue("");
            rVar.f209247w.setValue("");
            rVar.f209248x.setValue("");
            wcPayRealnameVerifyIdInputUI.f209182e.setText(en32.f227260d.f184009e);
            if (en32.f227267n) {
                wcPayRealnameVerifyIdInputUI.f209186i.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209186i.setVisibility(8);
            }
            if (en32.f227265i) {
                wcPayRealnameVerifyIdInputUI.f209190p.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209190p.setVisibility(8);
            }
            if (en32.f227264h) {
                wcPayRealnameVerifyIdInputUI.f209188n.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209188n.setVisibility(8);
            }
            if (en32.f227266j) {
                wcPayRealnameVerifyIdInputUI.f209189o.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209189o.setVisibility(8);
            }
            if (en32.f227261e) {
                wcPayRealnameVerifyIdInputUI.f209184g.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209184g.setVisibility(8);
            }
            if (en32.f227263g) {
                wcPayRealnameVerifyIdInputUI.f209187j.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209187j.setVisibility(8);
            }
            if (en32.f227268o) {
                wcPayRealnameVerifyIdInputUI.f209191q.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209191q.setVisibility(8);
            }
            if (en32.f227269p) {
                wcPayRealnameVerifyIdInputUI.f209192r.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209192r.setVisibility(8);
            }
            if (en32.f227262f) {
                wcPayRealnameVerifyIdInputUI.f209200z = true;
                wcPayRealnameVerifyIdInputUI.f209185h.setVisibility(0);
            } else {
                wcPayRealnameVerifyIdInputUI.f209185h.setVisibility(8);
            }
            if (i == 1) {
                wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f209183f, 1, false, false, false);
            } else if (i == 2) {
                wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f209183f, 1, true, false, false);
            } else if (i == 5) {
                wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f209183f, 1, true, false, false);
            } else if (i != 9) {
                wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f209183f, 1, true, false, false);
            } else {
                wcPayRealnameVerifyIdInputUI.setEditFocusListener(wcPayRealnameVerifyIdInputUI.f209183f, 1, true, false, false);
            }
        }
    }
}
