package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.modelsimple.C68139d0;
import com.tencent.p014mm.p136ui.chatting.component.C73515k4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: com.tencent.mm.ui.chatting.component.j4 */
public class C30822j4 implements Runnable {

    /* renamed from: d */
    public long f82829d;

    /* renamed from: e */
    public String f82830e;

    /* renamed from: f */
    public final /* synthetic */ C73515k4.C30823a f82831f;

    public C30822j4(C73515k4.C30823a aVar) {
        this.f82831f = aVar;
        this.f82829d = aVar.f82832a.getMsgId();
        this.f82830e = aVar.f82833b;
    }

    public void run() {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f82829d);
        C68139d0.m80543k1(C73515k4.this.f215752d.mo91572m().getString(C0966R.string.bb8), "", b002, "");
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
        RevokeNativeMsgEvent revokeNativeMsgEvent = new RevokeNativeMsgEvent();
        RevokeNativeMsgEvent.C28811a aVar = revokeNativeMsgEvent.f78950d;
        aVar.f78951a = this.f82829d;
        aVar.f78952b = this.f82830e;
        revokeNativeMsgEvent.publish();
    }
}
