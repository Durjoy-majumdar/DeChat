package com.tencent.p014mm.p136ui.contact.address;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C45628s0;
import fl3.C59252d;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;
import ke3.C88144b;
import p773yy.C79168k;

/* renamed from: com.tencent.mm.ui.contact.address.a */
public final class C74463a implements C60897k<C59252d> {

    /* renamed from: a */
    public final /* synthetic */ MvvmAddressUIFragment f218965a;

    public C74463a(MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f218965a = mvvmAddressUIFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        r0 = r10.f218965a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2039a(android.view.View r11, jq3.C9493c r12, int r13) {
        /*
            r10 = this;
            fl3.d r12 = (fl3.C59252d) r12
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r12, r0)
            com.tencent.mm.storage.z1 r0 = r12.f169416d
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85841l5(r1)
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = r0.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85833d5(r1)
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.String r0 = r0.getUsername()
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 != 0) goto L_0x0050
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment r0 = r10.f218965a
            uo3.a r1 = r0.f218931A
            if (r1 == 0) goto L_0x0050
            r4 = 0
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$a r6 = new com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$a
            r6.<init>(r0, r12, r13)
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$b r7 = new com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$b
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment r0 = r10.f218965a
            r7.<init>(r0, r12, r13)
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment r12 = r10.f218965a
            int r8 = r12.f218932B
            int r9 = r12.f218933C
            r2 = r11
            r3 = r13
            r1.mo108272g(r2, r3, r4, r6, r7, r8, r9)
        L_0x0050:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.address.C74463a.mo2039a(android.view.View, jq3.c, int):boolean");
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(motionEvent, "event");
        C87412m.m108594g((C59252d) cVar, "item");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f218965a.f218932B = (int) motionEvent.getRawX();
        this.f218965a.f218933C = (int) motionEvent.getRawY();
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C59252d dVar = (C59252d) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(dVar, "data");
        Log.m105924i("MicroMsg.Mvvm.MvvmAddressUIFragment", "onClick " + dVar.f169416d.getUsername());
        String username = dVar.f169416d.getUsername();
        Intent intent = new Intent();
        intent.putExtra("Contact_User", username);
        if (C45628s0.m50743H(username)) {
            intent.putExtra("Is_group_card", true);
        }
        C74584x.m89302e(intent, username);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        C88144b.m109791i(this.f218965a.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(username, 10);
    }
}
