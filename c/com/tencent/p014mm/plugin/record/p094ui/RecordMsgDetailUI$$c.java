package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75604z3;
import eb0.C97625j3;
import ob0.C117747y;
import ob0.C47355o;
import qg2.C101147j0;
import qo3.C89779i0;
import te3.C77915dp3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$c */
public class RecordMsgDetailUI$$c implements C47355o {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgDetailUI f272565d;

    public RecordMsgDetailUI$$c(RecordMsgDetailUI recordMsgDetailUI) {
        this.f272565d = recordMsgDetailUI;
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        if (i == i2) {
            C89779i0 i0Var = this.f272565d.f272548B;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f272565d.f272548B = null;
            }
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f272565d.f272555u);
            String content = b002.getContent();
            if (C72996z1.m85820U5(b002.mo108768t())) {
                content = C75604z3.m90849u(b002.getContent());
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
            if (u != null) {
                RecordMsgDetailUI recordMsgDetailUI = this.f272565d;
                String str = u.f195571f0;
                recordMsgDetailUI.f272556v = str;
                recordMsgDetailUI.f272553s = C101147j0.m132643x(str);
                C77915dp3 dp32 = this.f272565d.f272553s;
                if (dp32 != null && !dp32.f227155f.isEmpty()) {
                    RecordMsgDetailUI recordMsgDetailUI2 = this.f272565d;
                    if (recordMsgDetailUI2.mo129675T7(recordMsgDetailUI2.f272553s) != null) {
                        RecordMsgDetailUI recordMsgDetailUI3 = this.f272565d;
                        recordMsgDetailUI3.f272559y = recordMsgDetailUI3.mo129675T7(recordMsgDetailUI3.f272553s);
                    } else {
                        RecordMsgDetailUI recordMsgDetailUI4 = this.f272565d;
                        recordMsgDetailUI4.f272559y = recordMsgDetailUI4.f272553s.f227153d;
                    }
                    RecordMsgDetailUI recordMsgDetailUI5 = this.f272565d;
                    recordMsgDetailUI5.f272560z = recordMsgDetailUI5.f272553s.f227155f.getFirst().f299302f1;
                    RecordMsgDetailUI recordMsgDetailUI6 = this.f272565d;
                    recordMsgDetailUI6.f272547A = recordMsgDetailUI6.f272553s.f227155f.getLast().f299302f1;
                }
                if (!this.f272565d.isFinishing() && !this.f272565d.isDestroyed()) {
                    ((C119157j) C119157j.f356862d).mo183895z(new RecordMsgDetailUI$$c$$a(this));
                }
            }
        }
    }
}
