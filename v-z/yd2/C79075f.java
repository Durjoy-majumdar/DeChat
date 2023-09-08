package yd2;

import android.util.Pair;
import android.view.MenuItem;
import bp3.C67301m;
import com.tencent.p014mm.autogen.mmdata.rpt.RevokePatActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SendPatActionReportStruct;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import nj3.C11184p0;
import te3.C64418hb3;
import te3.C77946ib3;
import ud2.C14180f;
import ud2.C78147c;
import vd2.C78384d;

/* renamed from: yd2.f */
public class C79075f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Pair f232206d;

    public C79075f(C79069b bVar, Pair pair) {
        this.f232206d = pair;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C75700k0.class;
        Class cls2 = C78384d.class;
        if (menuItem.getItemId() == 548) {
            C64418hb3 d = C67301m.m79639d(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(((Long) this.f232206d.first).longValue()).getContent());
            C77946ib3 dx02 = ((C78384d) C86312j.m106911c(cls2)).dx0(d, ((Long) this.f232206d.second).longValue());
            if (dx02 == null) {
                return;
            }
            if (dx02.f227612i == 0) {
                SendPatActionReportStruct sendPatActionReportStruct = new SendPatActionReportStruct();
                if (C72996z1.m85807K5(d.f183463d)) {
                    sendPatActionReportStruct.f194365h = sendPatActionReportStruct.mo86045b("ChatroomName", d.f183463d, true);
                }
                sendPatActionReportStruct.f194367j = ((Long) this.f232206d.second).longValue() - ((C78384d) C86312j.m106911c(cls2)).mo108126bL(d.f183463d, this.f232206d);
                sendPatActionReportStruct.f194369l = ((Long) this.f232206d.second).longValue() <= ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yu0(d.f183463d) ? 1 : 0;
                sendPatActionReportStruct.f194370m = ((C78384d) C86312j.m106911c(cls2)).B70(d, ((Long) this.f232206d.second).longValue()) + 1;
                sendPatActionReportStruct.f194363f = sendPatActionReportStruct.mo86045b("Username", C75592q0.m90789s(), true);
                sendPatActionReportStruct.f194364g = sendPatActionReportStruct.mo86045b("PattedUserName", d.f183463d, true);
                sendPatActionReportStruct.f194362e = dx02.f227610g;
                sendPatActionReportStruct.f194371n = sendPatActionReportStruct.mo86045b("PatSuffix", C14180f.m13511a(dx02.f227608e), true);
                sendPatActionReportStruct.f194372o = 2;
                sendPatActionReportStruct.f194373p = 2;
                C78147c.vx0(sendPatActionReportStruct);
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
            }
            revokePatActionReportStruct.f194351k = 2;
            revokePatActionReportStruct.f194353m = 2;
            revokePatActionReportStruct.mo86054n();
            revokePatActionReportStruct.mo86056r();
        }
    }
}
