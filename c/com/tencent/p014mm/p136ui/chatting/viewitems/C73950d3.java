package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.util.Pair;
import bp3.C67301m;
import com.tencent.p014mm.autogen.mmdata.rpt.RevokePatActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SendPatActionReportStruct;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import qo3.C77407n;
import te3.C64418hb3;
import te3.C77946ib3;
import ud2.C14180f;
import vd2.C78384d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d3 */
public class C73950d3 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ Pair f217049a;

    public C73950d3(C73921a3 a3Var, Pair pair) {
        this.f217049a = pair;
    }

    public void onDismiss() {
        Class cls = C75700k0.class;
        Class cls2 = C78384d.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(((Long) this.f217049a.first).longValue());
        C64418hb3 d = C67301m.m79639d(b002.getContent());
        C77946ib3 dx02 = ((C78384d) C86312j.m106911c(cls2)).dx0(d, ((Long) this.f217049a.second).longValue());
        if (dx02 == null) {
            return;
        }
        if (dx02.f227612i == 0) {
            SendPatActionReportStruct sendPatActionReportStruct = new SendPatActionReportStruct();
            if (C72996z1.m85820U5(b002.mo108768t())) {
                sendPatActionReportStruct.f194365h = sendPatActionReportStruct.mo86045b("ChatroomName", b002.mo108768t(), true);
                sendPatActionReportStruct.f194361d = 2;
            } else {
                sendPatActionReportStruct.f194361d = 1;
            }
            sendPatActionReportStruct.f194367j = ((Long) this.f217049a.second).longValue() - ((C78384d) C86312j.m106911c(cls2)).mo108126bL(d.f183463d, this.f217049a);
            sendPatActionReportStruct.f194369l = ((Long) this.f217049a.second).longValue() <= ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yu0(d.f183463d) ? 1 : 0;
            sendPatActionReportStruct.f194363f = sendPatActionReportStruct.mo86045b("Username", C75592q0.m90789s(), true);
            sendPatActionReportStruct.f194364g = sendPatActionReportStruct.mo86045b("PattedUserName", d.f183463d, true);
            sendPatActionReportStruct.f194362e = dx02.f227610g;
            sendPatActionReportStruct.f194371n = sendPatActionReportStruct.mo86045b("PatSuffix", C14180f.m13511a(dx02.f227608e), true);
            sendPatActionReportStruct.f194373p = 1;
            sendPatActionReportStruct.f194372o = 2;
            C78384d.C78385a p9 = ((C78384d) C86312j.m106911c(cls2)).mo108129p9(sendPatActionReportStruct.f194363f, sendPatActionReportStruct.f194364g);
            sendPatActionReportStruct.f194375r = sendPatActionReportStruct.mo86045b("FromStatusID", p9.f229699a, true);
            sendPatActionReportStruct.f194377t = sendPatActionReportStruct.mo86045b("FromStatusIcon", p9.f229700b, true);
            sendPatActionReportStruct.f194376s = sendPatActionReportStruct.mo86045b("ToStatusID", p9.f229701c, true);
            sendPatActionReportStruct.f194378u = sendPatActionReportStruct.mo86045b("ToStatusIcon", p9.f229702d, true);
            sendPatActionReportStruct.mo86054n();
            sendPatActionReportStruct.mo86056r();
            return;
        }
        RevokePatActionReportStruct revokePatActionReportStruct = new RevokePatActionReportStruct();
        revokePatActionReportStruct.f194345e = dx02.f227610g;
        revokePatActionReportStruct.f194346f = System.currentTimeMillis();
        revokePatActionReportStruct.f194347g = revokePatActionReportStruct.mo86045b("UserName", dx02.f227607d, true);
        revokePatActionReportStruct.f194348h = revokePatActionReportStruct.mo86045b("PattedUserName", dx02.f227608e, true);
        revokePatActionReportStruct.f194349i = revokePatActionReportStruct.mo86045b("PatSuffix", C14180f.m13511a(dx02.f227608e), true);
        if (C72996z1.m85807K5(d.f183463d)) {
            revokePatActionReportStruct.f194350j = revokePatActionReportStruct.mo86045b("ChatRoomName", d.f183463d, true);
            revokePatActionReportStruct.f194344d = 2;
        } else {
            revokePatActionReportStruct.f194344d = 1;
        }
        revokePatActionReportStruct.f194351k = 1;
        revokePatActionReportStruct.f194353m = 2;
        revokePatActionReportStruct.f194352l = 1;
        revokePatActionReportStruct.mo86054n();
        revokePatActionReportStruct.mo86056r();
    }
}
