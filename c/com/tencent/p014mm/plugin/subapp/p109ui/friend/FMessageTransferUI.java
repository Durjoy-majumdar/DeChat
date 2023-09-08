package com.tencent.p014mm.plugin.subapp.p109ui.friend;

import android.os.Bundle;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72982l3;
import eb0.C97625j3;
import f40.C86737h0;
import fd0.C75743h;
import yw2.C79153a;

@C86737h0
/* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI */
public class FMessageTransferUI extends MMActivity {

    /* renamed from: d */
    public int f206345d;

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("friend_message_transfer_username");
        if (Util.isNullOrNil(stringExtra)) {
            finish();
        }
        C75743h.vx0().mo101168TE(stringExtra);
        C72982l3 vx02 = C75743h.vx0();
        MMHandlerThread.removeRunnable(vx02.f212807f);
        MMHandlerThread.postToMainThreadDelayed(vx02.f212807f, 500);
        String action = getIntent().getAction();
        String str = "friend_message_accept_" + stringExtra;
        this.f206345d = 2130706432 | (Integer.MAX_VALUE & stringExtra.hashCode());
        ((MMNotification) C97625j3.m125816f()).mo93207e(this.f206345d);
        if (str.equals(action)) {
            C79153a.m95830a(getContext(), (C72979k3) null, stringExtra, true);
        }
        finish();
    }
}
