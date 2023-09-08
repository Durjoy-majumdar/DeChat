package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.C1379f;
import hg0.C76166a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.e */
public class C1378e implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C76166a f10569d;

    /* renamed from: e */
    public final /* synthetic */ C1379f.C1380a f10570e;

    public C1378e(C1379f.C1380a aVar, C76166a aVar2) {
        this.f10570e = aVar;
        this.f10569d = aVar2;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            C1379f fVar = C1379f.this;
            int i3 = C1379f.f10571r;
            ((MobileFriendUI) fVar.f24696e).mo1309I7(this.f10569d);
        }
    }
}
