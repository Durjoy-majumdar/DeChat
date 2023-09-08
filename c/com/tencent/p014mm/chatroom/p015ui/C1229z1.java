package com.tencent.p014mm.chatroom.p015ui;

import eb0.C75597w2;

/* renamed from: com.tencent.mm.chatroom.ui.z1 */
public class C1229z1 implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ String f10271a;

    /* renamed from: b */
    public final /* synthetic */ RoomUpgradeResultUI f10272b;

    /* renamed from: com.tencent.mm.chatroom.ui.z1$a */
    public class C1230a implements Runnable {
        public C1230a() {
        }

        public void run() {
            C1229z1 z1Var = C1229z1.this;
            RoomUpgradeResultUI roomUpgradeResultUI = z1Var.f10272b;
            String str = z1Var.f10271a;
            int i = RoomUpgradeResultUI.f10170o;
            roomUpgradeResultUI.mo1089I7(str);
        }
    }

    public C1229z1(RoomUpgradeResultUI roomUpgradeResultUI, String str) {
        this.f10272b = roomUpgradeResultUI;
        this.f10271a = str;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z) {
            this.f10272b.f10173f.post(new C1230a());
        }
    }
}
