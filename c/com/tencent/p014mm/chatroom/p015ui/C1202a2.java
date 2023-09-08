package com.tencent.p014mm.chatroom.p015ui;

import eb0.C75597w2;

/* renamed from: com.tencent.mm.chatroom.ui.a2 */
public class C1202a2 implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ String f10229a;

    /* renamed from: b */
    public final /* synthetic */ RoomUpgradeUI f10230b;

    /* renamed from: com.tencent.mm.chatroom.ui.a2$a */
    public class C1203a implements Runnable {
        public C1203a() {
        }

        public void run() {
            C1202a2 a2Var = C1202a2.this;
            RoomUpgradeUI roomUpgradeUI = a2Var.f10230b;
            String str = a2Var.f10229a;
            int i = RoomUpgradeUI.f10181x;
            roomUpgradeUI.mo1095J7(str);
        }
    }

    public C1202a2(RoomUpgradeUI roomUpgradeUI, String str) {
        this.f10230b = roomUpgradeUI;
        this.f10229a = str;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z) {
            this.f10230b.f10185g.post(new C1203a());
        }
    }
}
