package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.SingleChatInfoUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import nj3.C76879j;
import p154fy.C87121j;
import p275xz.C79012e;
import qo3.C89779i0;
import qy2.C47902u;

/* renamed from: com.tencent.mm.ui.s3 */
public class C45039s3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SingleChatInfoUI f122146d;

    public C45039s3(SingleChatInfoUI singleChatInfoUI) {
        this.f122146d = singleChatInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C72996z1.m85799F5(this.f122146d.f121200n)) {
            ((C47902u) C86312j.m106911c(C47902u.class)).mo72655dS(this.f122146d.f121200n, 158);
        }
        SingleChatInfoUI singleChatInfoUI = this.f122146d;
        singleChatInfoUI.getClass();
        C115669n.INSTANCE.mo160131h(14553, 6, 2, singleChatInfoUI.f121200n);
        SingleChatInfoUI.f121192y = false;
        String str = null;
        C89779i0 Q = C76879j.m92723Q(singleChatInfoUI, singleChatInfoUI.getString(C0966R.string.a3h), singleChatInfoUI.getString(C0966R.string.a4d), true, true, new SingleChatInfoUI.C44695g((SingleChatInfoUI.C6751a) null));
        if (!SingleChatInfoUI.f121192y) {
            str = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(singleChatInfoUI.f121194e.getUsername());
        }
        if (!Util.isNullOrNil(str)) {
            Q.dismiss();
            SingleChatInfoUI singleChatInfoUI2 = singleChatInfoUI;
            C76879j.m92718L(singleChatInfoUI2, false, singleChatInfoUI.getString(C0966R.string.krb, new Object[]{str}), (String) null, singleChatInfoUI.getString(C0966R.string.fey), singleChatInfoUI.getString(C0966R.string.bfd), new C45024d4(singleChatInfoUI), new C45036q3(singleChatInfoUI, Q), -1, C0966R.color.f3041d1);
        } else {
            C75604z3.m90836h(singleChatInfoUI.f121194e.getUsername(), new C45038r3(singleChatInfoUI, Q));
            singleChatInfoUI.f121195f.post(new C74820t3(singleChatInfoUI));
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(this.f122146d.f121200n, 16);
    }
}
