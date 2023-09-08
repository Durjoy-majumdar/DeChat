package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.FindMoreFriendsUI;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.n0 */
public class C30862n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FindMoreFriendsUI.C196664 f82890d;

    public C30862n0(FindMoreFriendsUI.C196664 r1) {
        this.f82890d = r1;
    }

    public void run() {
        C97625j3.m125812b().mo105906u().mo119676J(68377, "");
        C73244a aVar = FindMoreFriendsUI.this.f55702t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }
}
