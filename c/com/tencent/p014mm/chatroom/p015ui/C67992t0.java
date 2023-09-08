package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.p014mm.chatroom.p015ui.C67986q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import eb0.C45612m0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.chatroom.ui.t0 */
public class C67992t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Toast f195134d;

    /* renamed from: e */
    public final /* synthetic */ int f195135e;

    /* renamed from: f */
    public final /* synthetic */ C67994u0 f195136f;

    public C67992t0(C67994u0 u0Var, Toast toast, int i) {
        this.f195136f = u0Var;
        this.f195134d = toast;
        this.f195135e = i;
    }

    public void run() {
        Toast toast = this.f195134d;
        if (toast != null) {
            toast.cancel();
        }
        ManageChatroomUI$$c manageChatroomUI$$c = this.f195136f.f195139b;
        int i = this.f195135e;
        C67986q0.C67987a aVar = (C67986q0.C67987a) manageChatroomUI$$c;
        aVar.getClass();
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(C67986q0.this.f195124d.f108078o);
        int i2 = (int) (((long) Lo.field_chatroomStatus) | 2);
        Log.m105924i("MicroMsg.ManageChatroomUI", "dealDelChatroomBtn, state = " + i2);
        Lo.field_chatroomStatus = i2;
        C45612m0.m50680G(Lo);
        Intent intent = new Intent();
        intent.putExtra("dismiss_chatroom", true);
        C67986q0.this.f195124d.setResult(-1, intent);
        C67986q0.this.f195124d.mo62741I7(4, (long) i);
        C67986q0.this.f195124d.finish();
    }
}
