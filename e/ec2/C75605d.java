package ec2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72963f4;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: ec2.d */
public class C75605d extends IStaticListener<LbsVerifyMessageCreateFromVoiceEvent> {
    public boolean callback(IEvent iEvent) {
        LbsVerifyMessageCreateFromVoiceEvent.C67726a aVar = ((LbsVerifyMessageCreateFromVoiceEvent) iEvent).f193721d;
        z3$$h z3__h = aVar.f193723b;
        C72963f4 f4Var = aVar.f193722a;
        if (z3__h.f222103j != null && z3__h.f222104k == 1) {
            C86709a0.m107535s().mo121142i().mo119676J(73729, 1);
            C72956b4 b4Var = new C72956b4();
            b4Var.field_content = f4Var.getContent();
            b4Var.field_createtime = Util.nowSecond();
            b4Var.field_imgpath = "";
            b4Var.field_sayhicontent = MMApplicationContext.getContext().getString(C0966R.string.h6z);
            b4Var.field_sayhiuser = f4Var.mo108768t();
            b4Var.field_scene = 18;
            int i = 3;
            if (f4Var.getStatus() > 3) {
                i = f4Var.getStatus();
            }
            b4Var.field_status = i;
            b4Var.field_svrid = f4Var.mo108774y2();
            b4Var.field_talker = f4Var.mo108768t();
            b4Var.field_type = 34;
            b4Var.field_isSend = 0;
            b4Var.field_sayhiencryptuser = f4Var.mo108768t();
            b4Var.field_ticket = z3__h.f222103j;
            C86709a0.m107523b().mo121108c();
            ((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).insert(b4Var);
            LbsSayHiEvent lbsSayHiEvent = new LbsSayHiEvent();
            lbsSayHiEvent.f193718d.f193719a = f4Var.mo108768t();
            lbsSayHiEvent.publish();
        }
        return false;
    }
}
