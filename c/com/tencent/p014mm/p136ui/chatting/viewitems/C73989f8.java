package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import i21.C98591h;
import nj3.C76879j;
import p182kk.C61104a;
import p910lj.C76701a;
import sf0.C77702q0;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f8 */
public class C73989f8 extends C73684f2 {
    public C73989f8(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        String content = f4Var.getContent();
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        int i = 1;
        aVar.f194022b = 1;
        aVar.f194021a = content;
        voipEvent.publish();
        boolean z = voipEvent.f194020e.f194027a == 2;
        int i2 = C0966R.string.auy;
        if (!z) {
            String content2 = f4Var.getContent();
            int i3 = C72963f4.f212661I1;
            if (!content2.equals("voip_content_video")) {
                String content3 = f4Var.getContent();
                VoipEvent voipEvent2 = new VoipEvent();
                VoipEvent.C67818a aVar2 = voipEvent2.f194019d;
                aVar2.f194022b = 1;
                aVar2.f194021a = content3;
                voipEvent2.publish();
                if (((voipEvent2.f194020e.f194027a == 3) || f4Var.getContent().equals("voip_content_voice")) && !C61104a.m71665u(this.f216339d.mo91565f()) && !C61104a.m71663s(this.f216339d.mo91565f(), (DialogInterface.OnClickListener) null) && !C61104a.m71649e(this.f216339d.mo91565f()) && !C61104a.m71656l(this.f216339d.mo91565f(), true) && !C61104a.m71661q(this.f216339d.mo91565f(), true)) {
                    VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
                    voipCheckIsDeviceUsingEvent.publish();
                    if (!t8Var.f212238a.mo108768t().equals(voipCheckIsDeviceUsingEvent.f194014d.f194018d)) {
                        VoipCheckIsDeviceUsingEvent.C67817a aVar3 = voipCheckIsDeviceUsingEvent.f194014d;
                        if (aVar3.f194016b || aVar3.f194017c) {
                            if (!aVar3.f194015a) {
                                i2 = C0966R.string.auz;
                            }
                            C76701a.makeText((Context) this.f216339d.mo91565f(), i2, 0).show();
                            Log.m105924i("MicroMsg.VoipClickListener", "voip is running, can't do this");
                        }
                    }
                    t8Var.f212238a.mo100991d(6);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(t8Var.f212238a.getMsgId(), t8Var.f212238a);
                    ((C79387w) this.f216339d.f193278b.mo102812a(C79387w.class)).mo102195q4();
                    VoipEvent voipEvent3 = new VoipEvent();
                    VoipEvent.C67818a aVar4 = voipEvent3.f194019d;
                    aVar4.f194022b = 5;
                    aVar4.f194025e = t8Var.f212238a.mo108768t();
                    voipEvent3.f194019d.f194024d = this.f216339d.mo91565f();
                    voipEvent3.f194019d.f194026f = 4;
                    voipEvent3.publish();
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[3];
                    objArr[0] = 3;
                    objArr[1] = 2;
                    String str = t8Var.f212238a.f230724G;
                    if (str != null && str.length() > 0) {
                        i = 3;
                    }
                    objArr[2] = Integer.valueOf(i);
                    nVar.mo160131h(11033, objArr);
                }
                ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            }
        }
        if (!C61104a.m71665u(this.f216339d.mo91565f()) && !C61104a.m71663s(this.f216339d.mo91565f(), (DialogInterface.OnClickListener) null) && !C61104a.m71649e(this.f216339d.mo91565f()) && !C61104a.m71656l(this.f216339d.mo91565f(), true) && !C61104a.m71661q(this.f216339d.mo91565f(), true)) {
            VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent2 = new VoipCheckIsDeviceUsingEvent();
            voipCheckIsDeviceUsingEvent2.publish();
            if (!t8Var.f212238a.mo108768t().equals(voipCheckIsDeviceUsingEvent2.f194014d.f194018d)) {
                VoipCheckIsDeviceUsingEvent.C67817a aVar5 = voipCheckIsDeviceUsingEvent2.f194014d;
                if (aVar5.f194016b || aVar5.f194017c) {
                    if (!aVar5.f194015a) {
                        i2 = C0966R.string.auz;
                    }
                    C76701a.makeText((Context) this.f216339d.mo91565f(), i2, 0).show();
                    Log.m105924i("MicroMsg.VoipClickListener", "voip is running, can't do this");
                }
            }
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154885a = true;
            talkRoomServerEvent.publish();
            String str2 = talkRoomServerEvent.f154884e.f154887a;
            if (!C77702q0.m93719b(str2)) {
                Log.m105926v("MicroMsg.VoipClickListener", "Talkroom is on: " + str2);
                C76879j.m92707A(this.f216339d.mo91565f(), this.f216339d.mo91565f().getString(C0966R.string.jt9), "", this.f216339d.mo91565f().getString(C0966R.string.a18), this.f216339d.mo91565f().getString(C0966R.string.f7926wf), new C73956d8(this, t8Var), new C73981e8(this));
            } else {
                mo103049b(t8Var);
            }
        }
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
    }

    /* renamed from: b */
    public final void mo103049b(C74243t8 t8Var) {
        t8Var.f212238a.mo100991d(6);
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(t8Var.f212238a.getMsgId(), t8Var.f212238a);
        ((C79387w) this.f216339d.f193278b.mo102812a(C79387w.class)).mo102195q4();
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = t8Var.f212238a.mo108768t();
        voipEvent.f194019d.f194024d = this.f216339d.mo91565f();
        voipEvent.f194019d.f194026f = 2;
        voipEvent.publish();
        C115669n nVar = C115669n.INSTANCE;
        int i = 3;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        objArr[1] = 1;
        String str = t8Var.f212238a.f230724G;
        if (str == null || str.length() <= 0) {
            i = 1;
        }
        objArr[2] = Integer.valueOf(i);
        nVar.mo160131h(11033, objArr);
    }
}
