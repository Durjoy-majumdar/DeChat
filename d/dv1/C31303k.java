package dv1;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import ev1.C31726h;
import f40.C86709a0;
import f62.C75700k0;
import fv1.C32183a;
import gy3.C87412m;
import p687sr.C64156g;
import z04.C112551y;

@C86522b
/* renamed from: dv1.k */
public final class C31303k extends C86301e implements C64156g {

    /* renamed from: d */
    public final String f83815d = "ForceNotifyReport";

    /* renamed from: Hj */
    public void mo58059Hj(String str, int i, long j) {
        C31726h hVar = new C31726h();
        hVar.field_ForcePushId = str;
        if (C32183a.f85554d.get(hVar, new String[0])) {
            mo58061Ke(str, (hVar.field_CreateTime / ((long) 1000)) + hVar.field_UserName, i, j);
        }
    }

    /* renamed from: JU */
    public void mo58060JU(int i, int i2, String str, int i3, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "forcePushId");
        long c = C31543z5.m39453c() / ((long) 1000);
        String str3 = this.f83815d;
        Log.m105924i(str3, "report22430 actionTimeMs=" + c + " actType=" + i + " msgType=" + i2 + " username=" + str + " msgCount=" + i3 + " forcePushId=" + str2);
        C115669n.INSTANCE.mo160131h(22430, Long.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), str2);
    }

    /* renamed from: Ke */
    public void mo58061Ke(String str, String str2, int i, long j) {
        C87412m.m108594g(str2, "sessionId");
        try {
            C87412m.m108591d(str);
            int i2 = 0;
            String n = C112551y.m153814n(str, "@wxcontact", "", false);
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(n);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[6];
            objArr[0] = n;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Long.valueOf(Ex0.getCreateTime() / ((long) 1000));
            if (!Ex0.mo100990c4()) {
                if (!Ex0.mo100985X3()) {
                    i2 = Ex0.mo108769t2() == 1 ? 1 : 2;
                }
            }
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = str2;
            objArr[5] = Long.valueOf(j);
            nVar.mo160131h(16505, objArr);
        } catch (Exception e) {
            String str3 = this.f83815d;
            Log.m105920e(str3, "[_16505] " + e);
        }
    }

    public void ql0(String str, int i, int i2, String str2, boolean z) {
        C87412m.m108594g(str2, "forcePushId");
        int i3 = z ? 1 : !AppForegroundDelegate.INSTANCE.f343454n ? 2 : 3;
        long c = C31543z5.m39453c() / ((long) 1000);
        String str3 = this.f83815d;
        Log.m105924i(str3, "report16507 toUsername=" + str + ", noticeState=" + i + ", receiveTime=" + c + ", msgType=" + i2 + ", forcePushId=" + str2 + ", receiveState=" + i3);
        C115669n.INSTANCE.mo160131h(16507, str, Integer.valueOf(i), Long.valueOf(c), Integer.valueOf(i2), str2, Integer.valueOf(i3));
    }

    /* renamed from: xl */
    public void mo58063xl(String str, int i, long j) {
        C115669n.INSTANCE.mo160131h(16506, str, Integer.valueOf(i), Long.valueOf(j));
    }
}
